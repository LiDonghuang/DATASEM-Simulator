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

import repast.simphony.context.Context;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.engine.schedule.ISchedule;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.random.RandomHelper;
import ausim.xtext.kanban.domainmodel.kanbanmodel.*;
import ausim.xtext.kanban.domainmodel.kanbanmodel.impl.*;

import governanceModels.governanceSearchStrategy;

public class ServiceProviderAgent extends ServiceProviderImpl {
	
	private int id;
	private int type;	
	private ServiceProvider serviceProvider;
	
	private boolean group;
	private boolean coordinator;
	private LinkedList<ServiceProviderAgent> subordinates;
	private LinkedList<ServiceProviderAgent> sourceFrom;
	private LinkedList<ServiceProviderAgent> targetTo;
	
	private KanbanBoard myKanbanBoard;
	private LinkedList<ServiceProviderAgent> myServiceProviders;
	private LinkedList<ServiceResource> myServiceResources;
	private DirectoryFacilitatorAgent dfa=null;
	
	private governanceSearchStrategy mySearchStrategy;
	private LinkedList<KSSTask> requestedQ;
	private LinkedList<KSSTask> backlogQ;
	private LinkedList<KSSTask> readyQ;
	private LinkedList<KSSTask> coordinateQ;
	private LinkedList<KSSTask> activeQ;
	private LinkedList<KSSTask> completeQ;
	private int readyQLimit;
	private int activeQLimit;
	private static final int DEFAULT_INITIAL_CAPACITY = 100;
	private int state;

	
	
	public ServiceProviderAgent(int id, ServiceProvider sp, DirectoryFacilitatorAgent inDfa) {	
		this.name = sp.getName();
		this.description = sp.getDescription();
		this.targetTo = new LinkedList<ServiceProviderAgent>();
		
		this.services = sp.getServices();
		
		this.id = id;
		this.serviceProvider = sp;
		
		this.myServiceResources = new LinkedList<ServiceResource>();
		for (int r=0;r<this.getResources().size();r++){
			Resource myResource = this.getResources().get(r);
			ServiceResource myServiceResource = new ServiceResource(myResource);
			this.getServiceResources().add(myServiceResource);
		}
		
		this.state=0;
		this.dfa=inDfa;
		this.coordinator=true;		
				
		this.mySearchStrategy=strategyImplementation(sp);
		
		this.readyQLimit=999999999;
		this.activeQLimit=1;
		this.backlogQ=new LinkedList<KSSTask>();
		this.readyQ=new LinkedList<KSSTask>();
		this.activeQ=new LinkedList<KSSTask>();
		this.coordinateQ=new LinkedList<KSSTask>();
		this.requestedQ=new LinkedList<KSSTask>();
		this.completeQ=new LinkedList<KSSTask>();	
		
	}
	
    
	@ScheduledMethod(start=1,interval=1,priority=20)
	public void step() {		
		ISchedule schedule = RunEnvironment.getInstance().getCurrentSchedule();
		double timeNow = schedule.getTickCount();
		System.out.println("-- Agent "+this.name+" is now active --");
		
		boolean end_loop = false;
		while (end_loop == false) {
			// ------------ 1. Select WIs to Accept
			while (this.requestedQ.size()>0) {
				// =========== Apply WI Acceptance Rule ====================
				KSSTask requestedWI = 
				this.requestedQ.get(RandomHelper.nextIntFromTo(0, requestedQ.size()-1));
				// =========================================================
				if (!requestedWI.isAggregationNode()){
					// =========== Service Efficiency Algorithm ==============
					double sEfficiency = requestedWI.calculateServiceEfficiency();	
					//--
					if (sEfficiency==0) {
						ArrayList<ServiceProviderAgent>serviceProviderCandidates = 
								this.findServiceProviders(requestedWI);
						if	(serviceProviderCandidates.size()!=0) {
							// ============== Apply WI Assignment Rule =========================
							ServiceProviderAgent selectedSP = serviceProviderCandidates.get(RandomHelper.nextIntFromTo(0, serviceProviderCandidates.size()-1));
							// ================================================================
							// Assign WI to SP
							requestedWI.setRequester(this);
							selectedSP.assignWI(requestedWI);		
							// Remove WI from AssignmentQ
							this.requestedQ.remove(requestedWI);
						}
						else {
							System.out.println("Failed to Assign WI:"
									+requestedWI.getName()+" (id:"+requestedWI.getTaskId()+")"); 
						}
					}
					//--
					else {
					requestedWI.setServiceEfficiency(sEfficiency);	
					// =========== Estimate Efforts ====================
					double eEfforts = requestedWI.getBefforts()
							/requestedWI.getServiceEfficiency();
	//				double estimationError = RandomHelper.nextIntFromTo(-1, 1);
	//				estimatedEfforts += estimationError;
					requestedWI.setEstimatedEfforts(eEfforts);
					// ========================================================
					this.backlogQ.add(requestedWI);								
					//(perform negotiation and decline if necessary)
					this.requestedQ.remove(requestedWI);
					}
				}
				else {
					this.coordinateQ.add(requestedWI);								
					//(perform negotiation and decline if necessary)
					this.requestedQ.remove(requestedWI);
				}
			}
			// -----------------------------------
						
			
			// ------------ 2. Select WIs Ready to Go
//			while ((this.backlogQ.size()!=0) && (this.readyQ.size()<this.readyQLimit)) {
//				KSSTask readyWI=this.backlogQ.remove();
////				if (readyWI.isComplex()) {
////					readyWI.InitializeReadyTaskList();
////					this.coordinateQ.add(readyWI);
////					}
//				if (readyWI.isSuccessor()) {					
//					}
//				else {
//					this.readyQ.add(readyWI);			
//					}			
//			}			
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
			while ((this.readyQ.size()!=0) && (this.activeQ.size()<this.activeQLimit)) {			
				// =========== Apply WI Selection Rule ====================
				KSSTask startedWI = this.mySearchStrategy.selectWI(readyQ, timeNow);				
				// ========================================================
				startedWI.setStarted(timeNow);							
				// =========== Estimate Completion ====================				
				double eCompletion= startedWI.getEstimatedEfforts() + timeNow;
				System.out.println("WorkItem "+startedWI.getName()+
						"(id:"+startedWI.getTaskId()+")"+
						" is expected to finish at "+eCompletion);
				startedWI.setEstimatedCompletionTime(eCompletion);
				// ====================================================
				this.readyQ.remove(startedWI);
				this.activeQ.add(startedWI);						
			}		
			// -----------------------------------		
			
			
			// ------------ 4. Select Completed WIs
			for(int i=0;i<activeQ.size();i++) {
				if (activeQ.get(i).isCompleted()) {
					KSSTask completedWI=this.activeQ.get(i); 
					this.activeQ.remove(completedWI);
					this.completeQ.add(completedWI);
				}
			}
			for(int i=0;i<coordinateQ.size();i++) {
				if (coordinateQ.get(i).isCompleted()) {
					KSSTask completedWI=this.coordinateQ.get(i); 
					this.coordinateQ.remove(completedWI);
					this.completeQ.add(completedWI);
				}
			}
			// ----------------------------------
			
			
//			// ------------ 5. Disburse Completed WIs
			Iterator<KSSTask> completeIterator=this.completeQ.iterator();
			while (completeIterator.hasNext()) {
				KSSTask completedWI=completeIterator.next();	
				completedWI.setEnded(timeNow);
			}		
			this.completeQ.clear();
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
			// ---------------------------------
			if (!  (requestedQ.size()!=0 
//				|| (readyQ.size()<readyQLimit && backlogQ.size()>0)	
				|| (activeQ.size()<activeQLimit && readyQ.size()>0)		
				||  completeQ.size()!=0 
				)) {
				end_loop = true; }
		}					
        // ----------------- End of SP Activities -------------------------
		
		// ------------------------- SP State Summary
		if (this.activeQ.size()>0) {
			this.state=1;
			System.out.println("Agent "+this.name+" is Busy");	
			if (this.activeQ.size()==this.activeQLimit) {
				System.out.println("Agent "+this.name+" is at Full Capacity");} 
			}
		else {
			this.state=0;
			System.out.println("Agent "+this.name+" is Idle");}		
		// --------------------------------------

	

	
	}
// ----------------------- END Step() -----------------------------	
	public LinkedList<KSSTask> getRequestedQ() {
		return this.requestedQ;
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
		System.out.println("WorkItem "+newWI.getName()+"(id:"+newWI.getTaskId()+")"+" is assigned to Agent "+this.name);
	}
	
	public void requestService(KSSTask newWI) {
		this.requestedQ.add(newWI);
	}
	
	public LinkedList<ServiceResource> getServiceResources() {
		return this.myServiceResources;
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
	
	public EList<Resource> getResources() {
		return this.serviceProvider.getResources();
	}
    public EList<Service> getServices() {
    	return this.serviceProvider.getServices();
    }
	public void addService(Service e) {		
		this.getServices().add(e);
	}	
	public int getType() {
		return type;
	}
	public int getId() {
		return id;
	}

	
	public governanceSearchStrategy strategyImplementation(ServiceProvider sp) {
		this.mySearchStrategy = new governanceSearchStrategy(this.id,(this.getName()+"SearchStrategy"));
		
		String acceptanceRule=sp.getDefaultStrategy().getWIAcceptanceRule().getName();			
		mySearchStrategy.setWItemAcceptanceRule(acceptanceRule);
		
		String selectionRule=sp.getDefaultStrategy().getWISelectionRule().getName();			
		mySearchStrategy.setWItemSelectionRule(selectionRule);
		
		String assignmentRule=sp.getDefaultStrategy().getWIAssignmentRule().getName();			
		mySearchStrategy.setWItemAssignmentRule(assignmentRule);
		
		return this.mySearchStrategy;
	}
	
	
}
