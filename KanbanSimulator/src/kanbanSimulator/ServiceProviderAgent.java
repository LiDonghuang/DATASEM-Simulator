package kanbanSimulator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.awt.Color;

import org.eclipse.emf.common.util.EList;
import org.geotools.filter.expression.ThisPropertyAccessorFactory;

import datasem.xtext.kanban.domainmodel.kanbanmodel.*;
import datasem.xtext.kanban.domainmodel.kanbanmodel.impl.*;
import repast.simphony.context.Context;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.engine.schedule.ISchedule;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.random.RandomHelper;
import repast.simphony.util.ContextUtils;
import governanceModels.GovernanceSearchStrategy;
import governanceModels.Contract;
import governanceModels.ValueManagement;

public class ServiceProviderAgent extends ServiceProviderImpl {
	public SystemOfSystems SoS;
	
	private int id;
	private int type;	
	private LinkedList<Contract> myContracts;
	
	private boolean group;
	private boolean coordinator;
	private LinkedList<ServiceProviderAgent> subordinates;
	private LinkedList<ServiceProviderAgent> sourceFrom;
	private LinkedList<ServiceProviderAgent> targetTo;
	
	private EList<Service> services;
	private int numResources;
	private int numActiveResources;
	private double resourceUtilization;
	private int totalWorkLoad;
	private int activeWorkLoad;
	private KanbanBoard myKanbanBoard;
	private LinkedList<ServiceProviderAgent> myServiceProviders;
	private LinkedList<ServiceResource> myServiceResources;
	private DirectoryFacilitatorAgent dfa=null;
	
	private GovernanceSearchStrategy mySearchStrategy;
	private ValueManagement myValueManagement;
	private String WI_Acceptance_RuleName;
	private String WI_Selection_RuleName;
	private String WI_Assignment_RuleName;
	private String Resource_Allocation_RuleName;
	private String Resource_Outsourcing_RuleName;
	private LinkedList<KSSTask> requestedQ;
	private LinkedList<KSSTask> assignmentQ;	
	private LinkedList<KSSTask> backlogQ;
	private LinkedList<KSSTask> readyQ;	
	private LinkedList<KSSTask> activeQ;
	private LinkedList<KSSTask> complexQ;
	private LinkedList<KSSTask> completeQ;
	private LinkedList<KSSTask> coordinateQ;
	private int readyQLimit;
	private int activeQLimit;
	private static final int DEFAULT_INITIAL_CAPACITY = 100;
	private int state;
	
	
	
	public ServiceProviderAgent(int id, ServiceProvider sp, DirectoryFacilitatorAgent inDfa) {	
		this.id = id;
		this.state=0;
		this.dfa=inDfa;
		this.coordinator=true;
		this.name = sp.getName();
		this.description = sp.getDescription();
		this.targetTo = new LinkedList<ServiceProviderAgent>();
		this.services = sp.getServices();
		this.myServiceResources = new LinkedList<ServiceResource>();
		this.myContracts = new LinkedList<Contract>();
		for (int r=0;r<sp.getResources().size();r++){
			Resource myResource = sp.getResources().get(r);
			ServiceResource myServiceResource = new ServiceResource(myResource);
			this.getServiceResources().add(myServiceResource);
		}
		this.numResources = this.getServiceResources().size();	
		this.numActiveResources = 0;
		this.resourceUtilization = 0.00;
		this.mySearchStrategy=strategyImplementation(sp);
		this.myValueManagement = new ValueManagement();
		this.totalWorkLoad = 0;
		this.activeWorkLoad = 0;
		this.readyQLimit=999999999;
		this.activeQLimit=99999999;
		this.requestedQ=new LinkedList<KSSTask>();
		this.assignmentQ=new LinkedList<KSSTask>();
		this.backlogQ=new LinkedList<KSSTask>();
		this.readyQ=new LinkedList<KSSTask>();
		this.activeQ=new LinkedList<KSSTask>();
		this.complexQ=new LinkedList<KSSTask>();
		this.coordinateQ=new LinkedList<KSSTask>();		
		this.completeQ=new LinkedList<KSSTask>();	
	}
	
    
	@ScheduledMethod(start=1,interval=1,priority=20,shuffle=false)
	public void stepAcceptance() {		
		System.out.println("\n------------ Agent "+this.name+" is now active ---------------");
		System.out.println("Active WorkLoad: "+this.getActiveWorkLoad());
		System.out.println("Total WorkLoad: "+this.getTotalWorkLoad());
	
		this.requestedQ = this.mySearchStrategy.workPrioritization(this, this.requestedQ);	
		for (int i=0;i<this.requestedQ.size();i++) {
			KSSTask requestedWI = this.requestedQ.get(i);
			myValueManagement.manageValue(this, requestedWI);
		}
		// ------------ 1. Select WIs to Accept
		while (!this.requestedQ.isEmpty()) {
			// =========== Apply WI Acceptance Rule ====================
			KSSTask requestedWI = this.requestedQ.getFirst();			
			// =========== Service Efficiency Algorithm ==============
			double eEfficiency = requestedWI.calculateServiceEfficiency();	
			if (eEfficiency==0) {
				System.out.println("...not able to solve "+ requestedWI.getName());
				// Find those SPs who can serve this WI
				ArrayList<ServiceProviderAgent>serviceProviderCandidates = 
						this.findServiceProviders(requestedWI);
				if	(serviceProviderCandidates.size()!=0) {
					// ============== Apply WI Assignment Rule =========================
					ServiceProviderAgent selectedSP = serviceProviderCandidates
							.get(RandomHelper.nextIntFromTo(0, serviceProviderCandidates.size()-1));
					// ================================================================
					// Assign WI to other SP
					requestedWI.setRequester(this);		
					selectedSP.assignWI(requestedWI);
					this.requestedQ.remove(requestedWI);
					// !
					System.out.println(this.getName()+" invoked "+selectedSP.getName());
					selectedSP.stepAcceptance();
					System.out.println("\n-------- back to "+this.getName()+"'s turn... --------");
				}
				else {
					System.out.println("Failed to Assign "+requestedWI.getPatternType().getName()
							+": "+requestedWI.getName()+" (id:"+requestedWI.getID()+")"); 
					System.out.println("ERROR!");
					RunEnvironment.getInstance().endRun();
				}
			}
			else {	
				if (!requestedWI.isAggregationNode()) {
					// =========== Estimate Efforts ====================
					double eEfforts = requestedWI.getBefforts()
							/eEfficiency;
	//				double estimationError = RandomHelper.nextIntFromTo(-1, 1);
	//				estimatedEfforts += estimationError;
					requestedWI.setEstimatedEfforts(eEfforts);
					// ========================================================
					this.backlogQ.add(requestedWI);								
					//(perform negotiation and decline if necessary)
					this.requestedQ.remove(requestedWI);
				}
				else {
					this.complexQ.add(requestedWI);								
					//(perform negotiation and decline if necessary)
					this.requestedQ.remove(requestedWI);
				}
			}
		}
		// -----------------------------------
	}
	
	@ScheduledMethod(start=1,interval=1,priority=19,shuffle=false)
	public void stepSelection() {
		// ------------ 2. Select WIs Ready to Go		
		// -------------- WI Precedency Check ----------------------
		for (int w=0;w<this.backlogQ.size();w++) {
			if (this.backlogQ.get(w).precedencyCleared()) {
				KSSTask readyWI=this.backlogQ.get(w);					
				this.readyQ.add(readyWI);					
				this.backlogQ.remove(readyWI);
				w--;
			}
		}
		// ---------------------------------------------------------
		
		// ------------ 3. Select WIs to Start		
		for (int i=0;i<this.readyQ.size();i++) {
			KSSTask readyWI = this.readyQ.get(i);
			myValueManagement.manageValue(this, readyWI);
		}
		this.readyQ = this.mySearchStrategy.workPrioritization(this, readyQ);
		
		for (int w=0;w<this.readyQ.size();w++) {			
			// =========== Apply WI Selection Rule ====================
			KSSTask startedWI = this.readyQ.get(w);				
			// ========================================================
			ArrayList<ServiceResource> serviceResourceCandidates = 
					this.findServiceResources(startedWI);
			// =========== Apply Resource Allocation Rule =============
			ArrayList<ServiceResource> idleResources = new ArrayList<ServiceResource>();
			for (int r=0;r<serviceResourceCandidates.size();r++) {
				ServiceResource candidateSR = serviceResourceCandidates.get(r);
				// only look at Idle Candidate Resources;
				if (!candidateSR.isBusy()) {
					idleResources.add(candidateSR);
				}
			}
			if (!idleResources.isEmpty()) {
				ServiceResource selectedSR = idleResources
						.get(RandomHelper.nextIntFromTo(0, idleResources.size()-1));
				selectedSR.allocateTo(startedWI);				
			// ========================================================
				startedWI.setStarted();					
				double rEfficiency = startedWI.calculateResourceEfficiency();	
				startedWI.setServiceEfficiency(rEfficiency);
			// =========== Estimate Completion ====================				
				double eEfforts = startedWI.getBefforts()
						/rEfficiency;
//				double estimationError = RandomHelper.nextIntFromTo(-1, 1);
//				estimatedEfforts += estimationError;
				startedWI.setEstimatedEfforts(eEfforts);
				double eCompletion= startedWI.getEstimatedEfforts() + this.SoS.timeNow;
				System.out.println(startedWI.getPatternType().getName()
						+": "+startedWI.getName()+
						"(id:"+startedWI.getID()+")"+
						" is expected to finish at "+eCompletion);
				startedWI.setEstimatedCompletionTime(eCompletion);
				// ====================================================
				this.activeQ.add(startedWI);
				this.readyQ.remove(startedWI);				
				w--;
			}
			else {System.out.println("No Resources available for "+
			startedWI.getPatternType().getName()+": "+
			startedWI.getName()+" now!");}
		}		
		// -----------------------------------		
		
		
		// ------------ 4. Select Completed WIs
		for(int i=0;i<activeQ.size();i++) {
			if (activeQ.get(i).isCompleted()) {
				KSSTask completedWI=this.activeQ.get(i); 
				this.activeQ.remove(completedWI);
				this.completeQ.add(completedWI);
				i--;
			}
		}
		for(int i=0;i<complexQ.size();i++) {
			if (complexQ.get(i).isCompleted()) {
				KSSTask completedWI=this.complexQ.get(i); 
				this.complexQ.remove(completedWI);
				this.completeQ.add(completedWI);
				i--;
			}
		}
		// ----------------------------------
		
		
//			// ------------ 5. Disburse Completed WIs
		Iterator<KSSTask> completeIterator=this.completeQ.iterator();
		while (completeIterator.hasNext()) {
			KSSTask completedWI=completeIterator.next();
			completedWI.setEnded();				
		}		
		this.completeQ.clear();
//			for(int i=0;i<completeQ.size();i++) {
//				KSSTask completedWI=completeQ.get(i);	
//				completedWI.setEnded();	
//				this.completeQ.remove(completedWI);
//				i--;
//			}
//			// -----------------------------------
		
		
		// -------------- 6. Coordinate WIs
//			if (this.coordinator==true) {
//				KSSTask complexTask=this.coordinateQ.peek();  
//				if (complexTask!=null) {
//					KSSTask cTask=complexTask.pollCompletedTask();
//					if (cTask!=null) {complexTask.updateReadyTasks(cTask);}
//					if ((complexTask.getReadyTasks().size()==0) && (complexTask.isCompleted()!=true))
//						{complexTask.setCompleted(true);this.coordinateQ.remove(complexTask);}
//					else makeAssignment(complexTask);
//				}
//			}
		}	
		
		@ScheduledMethod(start=1,interval=1,priority=11,shuffle=false)
		public void stepFinalize() {
        // ----------------- End of SP Activities -------------------------
		
		// ------------------------- SP State Summary
		this.calculateWorkLoad();
		this.calculateResourceUtilization();
		if (this.activeQ.size()>0) {
			this.state=1;
			System.out.println("Agent "+this.name+" is Fully Utilized");	
			if (this.resourceUtilization==1.00) {
				System.out.println("Agent "+this.name+" is at Full Capacity");} 
			}
		else {
			this.state=0;
			System.out.println("Agent "+this.name+" is Under Utilized");}		
		// --------------------------------------
		System.out.println("-- Agent "+this.name+" has finished its activities --");
	}
	// ----------------------- END Step() -----------------------------	
		
		
	public LinkedList<KSSTask> getRequestedQ() {
		return this.requestedQ;
	}
	public LinkedList<KSSTask> getAssignmentQ() {
		return this.assignmentQ;
	}
	public LinkedList<KSSTask> getBacklogQ() {
		return this.backlogQ;
	}	
	public LinkedList<KSSTask> getReadyQ() {
		return this.readyQ;
	}	
	public LinkedList<KSSTask> getActiveQ() {
		return this.activeQ;
	}	
	public LinkedList<KSSTask> getComplexQ() {
		return this.complexQ;
	}
	public LinkedList<KSSTask> getCoordinateQ() {
		return this.coordinateQ;
	}
	public LinkedList<ServiceProviderAgent> getTargetTo(){
		return this.targetTo;
	}
	
	public void makeAssignment(KSSTask cTask) {
		LinkedList<DFAgentDescription> availableTeams=this.dfa.getSubscribers();
		LinkedList<KSSTask> readyTasks=cTask.getReadyTasks();
		for(int i=0;i<readyTasks.size();i++) {
			KSSTask nextTask=readyTasks.get(i);
			if (nextTask.isAssigned()==false) {
				DFAgentDescription aDescription=availableTeams.get(RandomHelper.nextIntFromTo(0, availableTeams.size()-1));
				ServiceProviderAgent SProvider=aDescription.getServiceProvider();
				SProvider.requestService(nextTask);
				nextTask.setAssigned();
				break;
			}
		}
	}
	
	public void assignWI(KSSTask newWI) {
//		LinkedList<DFAgentDescription> availableTeams=this.dfa.getSubscribers();
//		DFAgentDescription aDescription=availableTeams.get(RandomHelper.nextIntFromTo(0, availableTeams.size()-1));
//		TeamAgent SProvider=aDescription.getServiceProvider();
		this.requestService(newWI);		
		newWI.setAssigned();
		newWI.assignTo(this);
		newWI.checkCausalities();
		myValueManagement.manageValue(this, newWI);
		System.out.println(newWI.getPatternType().getName()+": "
				+newWI.getName()+"(id:"+newWI.getID()+")"+" is assigned to Agent "+this.name);
	}
	
	public void requestService(KSSTask newWI) {
		this.requestedQ.add(newWI);
	}
	public ArrayList<ServiceProviderAgent> findServiceProviders(KSSTask wItem) {
		// 1. What Service does this WI request?				
		String wItem_reqService = wItem.getReqSpecialties().get(0).getName();
		// 2. What ServiceProviders can provide this Service for this WI?
		ArrayList<ServiceProviderAgent> serviceProviderCandidates = new ArrayList<ServiceProviderAgent>(0);
		// Only Search From "Target Units"
		for (int c = 0; c < this.getTargetTo().size(); c++) {
			ServiceProviderAgent tAgent = this.getTargetTo().get(c);	
			// 2.1 List All Services of that ServiceProvider
			for (int ts = 0; ts < tAgent.getServices().size(); ts++) {
				String tAgent_Service = tAgent.getServices().get(ts).getServiceType().getName();	
				// 2.2 Find if any matches the Service requested
				if (wItem_reqService.matches(tAgent_Service)) {
					// 2.3 If any, add the ServiceProvider to Candidates list
					serviceProviderCandidates.add(tAgent);
				}
			}
		}	
		System.out.println("# of candidate SPs: "+serviceProviderCandidates.size());
		return serviceProviderCandidates;
	}
	
	public void setDirectoryFacilitator(DirectoryFacilitatorAgent inDfa) {
		this.dfa=inDfa;
	}
	
	public void setCoordinator(boolean coordinationStatus) {
		this.coordinator=true;
		this.myServiceProviders=new LinkedList<ServiceProviderAgent>();
	}
	
	public void calculateWorkLoad() {
		this.totalWorkLoad = 0;
		this.activeWorkLoad = 0;
		for (int i=0;i<this.backlogQ.size();i++) {
			KSSTask workItem = this.backlogQ.get(i);
			this.totalWorkLoad += workItem.getBefforts()*(1-workItem.getProgress());
		}
		for (int i=0;i<this.readyQ.size();i++) {
			KSSTask workItem = this.readyQ.get(i);
			this.totalWorkLoad += workItem.getBefforts()*(1-workItem.getProgress());
		}
		for (int i=0;i<this.activeQ.size();i++) {
			KSSTask workItem = this.activeQ.get(i);
			this.totalWorkLoad += workItem.getBefforts()*(1-workItem.getProgress());
			this.activeWorkLoad += workItem.getBefforts()*(1-workItem.getProgress());
		}
	}
	public int getTotalWorkLoad() {
		return this.totalWorkLoad;
	}
	public int getActiveWorkLoad() {
		return this.activeWorkLoad;
	}
	
//	public EList<Resource> getResources() {
//		return this.serviceProvider.getResources();
//	}
	public LinkedList<ServiceResource> getServiceResources() {
		return this.myServiceResources;
	}
	public int getNumResources() {
		return this.numResources;
	}
	public int getNumActiveResources() {
		return this.numActiveResources;
	}
	public double getResourceUtilization() {
		return this.resourceUtilization;
	}
	public void calculateResourceUtilization() {
		this.numResources = this.getServiceResources().size();
		this.numActiveResources = 0;
		for (int r=0;r<this.getServiceResources().size();r++) {
			ServiceResource serviceResource = this.getServiceResources().get(r);
			if (serviceResource.isBusy()) {
				this.numActiveResources += 1;
			}
		}
		this.resourceUtilization = (double)this.numActiveResources/(double)this.numResources;	
	}
	public ArrayList<ServiceResource> findServiceResources(KSSTask wItem) {
		// 1. What Service does this WI request?				
		String wItem_reqService = wItem.getReqSpecialties().get(0).getName();
		// 2. What ServiceResources can provide this Service for this WI?
		ArrayList<ServiceResource> serviceResourceCandidates = new ArrayList<ServiceResource>(0);
		// Only Search From "Target Units"
		for (int c = 0; c < this.getServiceResources().size(); c++) {
			ServiceResource sResource = this.getServiceResources().get(c);	
			// 2.1 List All Services of that ServiceResource
			for (int sr = 0; sr < sResource.getServices().size(); sr++) {
				String sResource_Service = sResource.getServices().get(sr).getServiceType().getName();	
				// 2.2 Find if any matches the Service requested
				if (wItem_reqService.matches(sResource_Service)) {
					// 2.3 If any, add the ServiceResource to Candidates list
					serviceResourceCandidates.add(sResource);
				}
			}
		}	
		System.out.println("# of candidate Resources: "+serviceResourceCandidates.size());
		return serviceResourceCandidates;
	}
	public boolean hasIdleResources() {
		boolean hasIdleResources = false;
		for (int r=0;r<this.getServiceResources().size();r++) {
			ServiceResource serviceResource = this.getServiceResources().get(r);
			if (!serviceResource.isBusy()) {
				hasIdleResources = true;
				System.out.println("Idle Resources");
				break;
			}
		}
		return hasIdleResources;
	}
    public EList<Service> getServices() {
    	return this.services;
    }
	public void addService(Service e) {		
		this.getServices().add(e);
	}	
	public int getType() {
		return this.type;
	}
	public int getId() {
		return this.id;
	}

	
	public GovernanceSearchStrategy strategyImplementation(ServiceProvider sp) {
		this.mySearchStrategy = new GovernanceSearchStrategy(this.id,(this.getName()+"SearchStrategy"));
		
		String acceptanceRule=sp.getDefaultStrategy().getWIAcceptanceRule().getName();			
		mySearchStrategy.setWItemAcceptanceRule(acceptanceRule);
		this.WI_Acceptance_RuleName = acceptanceRule;
		
		String selectionRule=sp.getDefaultStrategy().getWISelectionRule().getName();			
		mySearchStrategy.setWItemSelectionRule(selectionRule);
		this.WI_Selection_RuleName = selectionRule;
		
		String assignmentRule=sp.getDefaultStrategy().getWIAssignmentRule().getName();			
		mySearchStrategy.setWItemAssignmentRule(assignmentRule);
		this.WI_Assignment_RuleName = assignmentRule;
		
		String allocationRule=sp.getDefaultStrategy().getResourceAllocationRule().getName();			
		mySearchStrategy.setResourceAllocationRule(allocationRule);
		this.Resource_Allocation_RuleName = allocationRule;
		
		String outsourcingRule=sp.getDefaultStrategy().getResourceOutsourcingRule().getName();			
		mySearchStrategy.setResourceOutsourcingRule(outsourcingRule);
		this.Resource_Outsourcing_RuleName = outsourcingRule;
		
		return this.mySearchStrategy;
	}
	public String getAcceptanceRuleName() {
		return this.WI_Acceptance_RuleName;
	}
	public String getSelectionRuleName() {
		return this.WI_Selection_RuleName;
	}
	public String getAssignmentRuleName() {
		return this.WI_Assignment_RuleName;
	}
	public String getAllocationRuleName() {
		return this.Resource_Allocation_RuleName;
	}
	public String getOutsourcingRuleName() {
		return this.Resource_Outsourcing_RuleName;
	}	
	
	
}
