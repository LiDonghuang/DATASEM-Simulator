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
import repast.simphony.space.grid.Grid;
import repast.simphony.util.ContextUtils;
import repast.simphony.visualization.visualization3D.ShapeFactory;
import repast.simphony.visualizationOGL2D.DefaultStyleOGL2D;
import saf.v3d.ShapeFactory2D;

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
	public int state;

	
	
	public ServiceProviderAgent(int id, ServiceProvider sp, DirectoryFacilitatorAgent inDfa) {	
		this.name = sp.getName();
		this.description = sp.getDescription();
		this.services = sp.getServices();
		
		this.id = id;
		this.serviceProvider = sp;
		this.state=0;
		this.dfa=inDfa;
		this.coordinator=true;		
				
		this.mySearchStrategy=strategyImplementation(sp);
		
		this.readyQLimit=5;
		this.activeQLimit=1;
		this.backlogQ=new LinkedList<KSSTask>();
		this.readyQ=new LinkedList<KSSTask>();
		this.activeQ=new LinkedList<KSSTask>();
		this.coordinateQ=new LinkedList<KSSTask>();
		this.requestedQ=new LinkedList<KSSTask>();
		this.completeQ=new LinkedList<KSSTask>();	
		
	}
	
    
  //Schedule the step method for agents.  The method is scheduled starting at 
	// tick one with an interval of 1 tick.  Specifically, the step starts at 0, and
	// and recurs at 1,2,3,...etc
	@ScheduledMethod(start=1,interval=1)
	public void step() {		
		Context context = ContextUtils.getContext(this);
		Grid grid = (Grid)context.getProjection("Grid");		
		ISchedule schedule = RunEnvironment.getInstance().getCurrentSchedule();
		double timeNow = schedule.getTickCount();
		
//		System.out.println("Time Now: "+timeNow());
		System.out.println("-- Agent "+this.name+" is now active --");
		
		boolean end_loop = false;
		while (end_loop == false) {
			// ------------ 1. Select WIs to Accept
			while (this.requestedQ.size()!=0) {
				// =========== Apply WI Acceptance Rule ====================
				KSSTask acceptedWI = this.requestedQ.remove();
				// ========================================================
				this.backlogQ.add(acceptedWI);								
				//(perform negotiation and decline if necessary)
			}
			// -----------------------------------
						
			// ------------ 2. Select WIs Ready to Go
			while ((this.backlogQ.size()!=0) && (this.readyQ.size()<this.readyQLimit)) {
				KSSTask readyWI=this.backlogQ.remove();
				if (readyWI.isComplex()) {
					readyWI.InitializeReadyTaskList();
					this.coordinateQ.add(readyWI);
					}
				else {
					this.readyQ.add(readyWI);			
				}			
			}
			// ---------------------------------
			
			
			// ------------ 3. Select WIs to Start
			while ((this.readyQ.size()!=0) && (this.activeQ.size()<this.activeQLimit)) {			
				// =========== Apply WI Selection Rule ====================
//				KSSTask startedWI = this.readyQ.getFirst();
				KSSTask startedWI = this.mySearchStrategy.selectWI(readyQ);				
				// ========================================================
				startedWI.setStarted(timeNow);		
				// =========== Estimate Efforts ====================
				double estimatedEfforts = startedWI.getBefforts();
//				double estimationError = RandomHelper.nextIntFromTo(-1, 1);
				// ========================================================					
				double eCompletion= estimatedEfforts + timeNow;
				System.out.println("WorkItem "+startedWI.getName()+"(id:"+startedWI.getTaskId()+")"+
						" is expected to finish at "+eCompletion);
				startedWI.setEstimatedCompletion(eCompletion);
				
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
			// ----------------------------------
			
			
			// ------------ 5. Disburse Completed WIs
			Iterator<KSSTask> completeIterator=this.completeQ.iterator();
			while (completeIterator.hasNext()) {
				KSSTask completedWI=completeIterator.next();	
				completedWI.setEnded(timeNow);
			}		
			this.completeQ.clear();
			// -----------------------------------
			
			
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
				|| (readyQ.size()<readyQLimit && backlogQ.size()>0)	
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

		System.out.println("-- Agent "+this.name+" has completed its activity --");	

	

	
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
	
	public void assignTask(KSSTask newWI) {
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
	
	
	public void setDirectoryFacilitator(DirectoryFacilitatorAgent inDfa) {
		this.dfa=inDfa;
	}
	
	public void setCoordinator(boolean coordinationStatus) {
		this.coordinator=true;
		this.myServiceProviders=new LinkedList<ServiceProviderAgent>();
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
