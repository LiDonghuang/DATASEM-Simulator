package kanbanSimulator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import org.eclipse.emf.common.util.EList;
import org.geotools.filter.expression.ThisPropertyAccessorFactory;

import repast.simphony.context.Context;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.engine.schedule.ISchedule;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.random.RandomHelper;
import repast.simphony.space.grid.Grid;
import ausim.xtext.kanban.domainmodel.kanbanmodel.*;
import ausim.xtext.kanban.domainmodel.kanbanmodel.impl.*;

import java.awt.Color;

import repast.simphony.util.ContextUtils;
import repast.simphony.visualization.visualization3D.ShapeFactory;
import repast.simphony.visualizationOGL2D.DefaultStyleOGL2D;
import saf.v3d.ShapeFactory2D;

public class TeamAgent extends TeamImpl {
	
	private int id;
	private int type;	
	private Team serviceProvider;
	private boolean coordinator;
	private KanbanBoard myKanbanBoard;
	private LinkedList<TeamAgent> myServiceProviders;
	private DirectoryFacilitatorAgent dfa=null;
	
	private LinkedList<KSSTask> incomingQ;
	private LinkedList<KSSTask> demandBackLogQ;
	private LinkedList<KSSTask> readyQ;
	private LinkedList<KSSTask> coordinateQ;
	private LinkedList<KSSTask> activeQ;
	private LinkedList<KSSTask> completeQ;
	private int readyQLimit;
	private int activeQLimit;
	private static final int DEFAULT_INITIAL_CAPACITY = 100;
	public int state;

	
	public TeamAgent(int id, DirectoryFacilitatorAgent inDfa) {
		this.id = id;
		this.state=0;
		this.dfa=inDfa;
		this.coordinator=false;
		this.readyQLimit=2;
		this.activeQLimit=2;
		this.demandBackLogQ=new LinkedList<KSSTask>();
		this.readyQ=new LinkedList<KSSTask>();
		this.activeQ=new LinkedList<KSSTask>();
		this.coordinateQ=new LinkedList<KSSTask>();
		this.incomingQ=new LinkedList<KSSTask>();
		this.completeQ=new LinkedList<KSSTask>();	
	}
	
	public TeamAgent(int id, Team sp, DirectoryFacilitatorAgent inDfa) {	
		this.name = sp.getName();
		this.description = sp.getDescription();
		this.services = sp.getServices();
		
		this.id = id;
		this.serviceProvider = sp;
		this.state=0;
		this.dfa=inDfa;
		this.coordinator=true;
		this.readyQLimit=2;
		this.activeQLimit=2;
		this.demandBackLogQ=new LinkedList<KSSTask>();
		this.readyQ=new LinkedList<KSSTask>();
		this.activeQ=new LinkedList<KSSTask>();
		this.coordinateQ=new LinkedList<KSSTask>();
		this.incomingQ=new LinkedList<KSSTask>();
		this.completeQ=new LinkedList<KSSTask>();	
	}
	
	// *** Visualization Parameters ***
    int demandBackLogQ_shift = 0;
    int readyQ_shift = 0;
    int activeQ_shift = 0;
    // ********************************
    
  //Schedule the step method for agents.  The method is scheduled starting at 
	// tick one with an interval of 1 tick.  Specifically, the step starts at 0, and
	// and recurs at 1,2,3,...etc
	@ScheduledMethod(start=0,interval=1)
	public void step() {		
		Context context = ContextUtils.getContext(this);
		Grid grid = (Grid)context.getProjection("Grid");		
		ISchedule schedule = RunEnvironment.getInstance().getCurrentSchedule();
		
		System.out.println("Time Now: "+schedule.getTickCount());
		System.out.println("Agent "+this.name+" is now active");
		
		boolean end_loop = false;
		while (end_loop == false) {
			// ------------ 1. Select WIs to Accept
			while (this.incomingQ.size()!=0) {
				KSSTask acceptedWI = this.incomingQ.remove();
				this.demandBackLogQ.add(acceptedWI);								
				//(perform negotiation and decline if necessary)
			}
			// -----------------------------------
						
			// ------------ 2. Select WIs Ready to Go
			while ((this.demandBackLogQ.size()!=0) && (this.readyQ.size()<this.readyQLimit)) {
				KSSTask readyWI=this.demandBackLogQ.remove();
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
				KSSTask startedWI=this.readyQ.remove();
				startedWI.setStartTime();		
	//			double estimationError = RandomHelper.nextIntFromTo(-1, 1);
				double cTime= startedWI.getBefforts()+schedule.getTickCount();
	//			double e_cTime = cTime+estimationError;
				System.out.println("WorkItem "+startedWI.getName()+
						" is expected to finish at "+cTime);
	//			System.out.println("WorkItem "+newTask.getName()+" is expected to finish at "+e_cTime+"\n(Estimation Error: "+estimationError+")");
				startedWI.setCompletionTime(cTime);
				this.activeQ.add(startedWI);			
			}		
			// -----------------------------------		
			
			
			// ------------ 4. Select Completed WIs
			for(int i=0;i<activeQ.size();i++) {
				KSSTask completedWI=this.activeQ.get(i); 
				if (schedule.getTickCount()>=completedWI.getCompletionTime()) {
					completedWI.setCompleted(true);
					this.completeQ.add(completedWI);
				}
			}
			// ----------------------------------
			
			
			// ------------ 5. Disburse Completed WIs
			Iterator<KSSTask> completeIterator=this.completeQ.iterator();
			while (completeIterator.hasNext()) {
				KSSTask completedWI=completeIterator.next();
				this.activeQ.remove(completedWI);					
			}		
			this.completeQ.clear();
			// -----------------------------------
			
			
			// -------------- 6. Coordinate WIs
			if (this.coordinator==true) {
				KSSTask complexTask=this.coordinateQ.peek();  
				if (complexTask!=null) {
					KSSTask cTask=complexTask.pollCompletedTask();
					if (cTask!=null) {complexTask.updateReadyTasks(cTask);}
					if ((complexTask.getReadyTasks().size()==0) && (complexTask.isComplete()!=true))
						{complexTask.setCompleted(true);this.coordinateQ.remove(complexTask);}
					else makeAssignment(complexTask);
				}
			}
			// ---------------------------------
			if (!  (incomingQ.size()!=0 
				|| (readyQ.size()<readyQLimit && demandBackLogQ.size()>0)	
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
//		System.out.println("demandBackLogQ: "+this.demandBackLogQ);
//		System.out.println("readyQ: "+this.readyQ);			
//		System.out.println("activeQ: "+this.activeQ);
		System.out.println("Agent "+this.name+" has completed its activity");	

	
	// *** Visualization ***
	for (int i=0;i<demandBackLogQ.size();i++){
		grid.moveTo(this.demandBackLogQ.get(i), 11+i, 48-this.id*5);
	}
	for (int i=0;i<readyQ.size();i++){
		grid.moveTo(this.readyQ.get(i), 11+i, 49-this.id*5);
	}
	for (int i=0;i<activeQ.size();i++){
		grid.moveTo(this.activeQ.get(i), 11+i, 50-this.id*5);
	}

//	grid.moveTo(this.demandBackLogQ.element(), 10+this.demandBackLogQ.size(), 48-this.id*5);	
//	grid.moveTo(this.readyQ.element(), 10+this.readyQ.size(), 49-this.id*5);
//	grid.moveTo(this.activeQ.element(), this.activeQ.size(), 50-this.id*5);
	// *********************
	
	}
// ----------------------- END Step() -----------------------------	

	
	
	public void makeAssignment(KSSTask cTask) {
		LinkedList<DFAgentDescription> availableTeams=this.dfa.getSubscribers();
		LinkedList<KSSTask> readyTasks=cTask.getReadyTasks();
		for(int i=0;i<readyTasks.size();i++) {
			KSSTask nextTask=readyTasks.get(i);
			if (nextTask.isAssigned()==false) {
				DFAgentDescription aDescription=availableTeams.get(RandomHelper.nextIntFromTo(0, availableTeams.size()-1));
				TeamAgent SProvider=aDescription.getServiceProvider();
				SProvider.requestService(nextTask);
				nextTask.setAssigned();
				System.out.println("WorkItem "+nextTask.getName()+" is assigned");
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
		System.out.println("WorkItem "+newWI.getName()+" is assigned to Agent "+this.name);
	}
	
	public void requestService(KSSTask newWI) {
		this.incomingQ.add(newWI);
	}
	
	
	public void setDirectoryFacilitator(DirectoryFacilitatorAgent inDfa) {
		this.dfa=inDfa;
	}
	
	public void setCoordinator(boolean coordinationStatus) {
		this.coordinator=true;
		this.myServiceProviders=new LinkedList<TeamAgent>();
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

	
	
}
