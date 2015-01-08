package kanbanSimulator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.engine.schedule.ISchedule;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.random.RandomHelper;
import ausim.xtext.kanban.domainmodel.kanbanmodel.*;
import ausim.xtext.kanban.domainmodel.kanbanmodel.impl.*;

public class TeamAgent extends TeamImpl {
	private int type;
	private String id;
	private boolean coordinator;
	private KanbanBoard myKanbanBoard;
	private LinkedList<TeamAgent> myServiceProviders;
	private DirectoryFacilitatorAgent dfa=null;
	private Queue<KSSTask> incomingQ;
	private Queue<KSSTask> demandBackLogQ;
	private Queue<KSSTask> readyQ;
	private Queue<KSSTask> coordinateQ;
	private LinkedList<KSSTask> activeQ;
	private Queue<KSSTask> completeQ;
	private int RQueueLimit;
	private int workInprogressLimit;
	private static final int DEFAULT_INITIAL_CAPACITY = 100;
	public int state;

	
	public TeamAgent(String id,DirectoryFacilitatorAgent inDfa) {

		this.id = id;
		this.state=0;
		this.dfa=inDfa;
		this.coordinator=false;
		this.RQueueLimit=6;
		this.workInprogressLimit=8;
		this.demandBackLogQ=new LinkedList<KSSTask>();
		this.readyQ=new LinkedList<KSSTask>();
		this.activeQ=new LinkedList<KSSTask>();
		this.coordinateQ=new LinkedList<KSSTask>();
		this.incomingQ=new LinkedList<KSSTask>();
		this.completeQ=new LinkedList<KSSTask>();	
	}

  //Schedule the step method for agents.  The method is scheduled starting at 
	// tick one with an interval of 1 tick.  Specifically, the step starts at 0, and
	// and recurs at 1,2,3,...etc
	@ScheduledMethod(start=0,interval=1)
	public void step() {
		System.out.println("Agent "+this.id+" is now active");
		ISchedule schedule = RunEnvironment.getInstance().getCurrentSchedule();
		if (this.incomingQ.size()!=0) {
			this.demandBackLogQ.add(this.incomingQ.remove());  //perform negotiation and decline if necessary
		}
		
		if ((this.demandBackLogQ.size()!=0) && (this.readyQ.size()<this.RQueueLimit)) {
			KSSTask demand=this.demandBackLogQ.remove();
			if (demand.isComplex()) {demand.InitializeReadyTaskList();this.coordinateQ.add(demand);}
			else this.readyQ.add(demand);
		}
		
		if ((this.readyQ.size()!=0) && (this.activeQ.size()<this.workInprogressLimit)) {
			KSSTask newTask=this.readyQ.remove();
			newTask.setStartTime();
			schedule = RunEnvironment.getInstance().getCurrentSchedule();
			double cTime=RandomHelper.nextDoubleFromTo(10, 20)+schedule.getTickCount();
			System.out.println("Task "+newTask.getTaskId()+" is sceduled to finish at"+cTime);
			newTask.setCompletionTime(cTime);
			this.activeQ.add(newTask);
		}
		
		int activeQSize=this.activeQ.size();
		if (activeQSize>0) {this.state=1;} else {this.state=0;}
		
		for(int i=0;i<activeQSize;i++) {
			KSSTask nextTask=this.activeQ.get(i); 
			if (schedule.getTickCount()>=nextTask.getCompletionTime()) {
				nextTask.setCompleted(true);
				this.completeQ.add(nextTask);
			}
		}
		
		Iterator<KSSTask> completeIterator=this.completeQ.iterator();
		while (completeIterator.hasNext()) {
			KSSTask cTask=completeIterator.next();
			this.activeQ.remove(cTask);
		}
		
		this.completeQ.clear();
		
		
		
		if (this.coordinator==true) {
			System.out.println("System Engineering Group is active");
			
			/*KSSTask complexTask=this.coordinateQ.peek();
			if (complexTask!=null) {
				int size=complexTask.getTopologicalTasks().size();
				if (size>0) {
					KSSTask newTask=complexTask.getTopologicalTasks().get(0);
					assignTask(newTask);
					complexTask.getTopologicalTasks().remove(newTask);
				}			
			}*/
			
			KSSTask complexTask=this.coordinateQ.peek();  
			if (complexTask!=null) {
				KSSTask cTask=complexTask.pollCompletedTask();
				if (cTask!=null) {complexTask.updateReadyTasks(cTask);}
				if ((complexTask.getReadyTasks().size()==0) && (complexTask.isComplete()!=true))
					{complexTask.setCompleted(true);this.coordinateQ.remove(complexTask);}
				else makeAssignment(complexTask);
			}
		}
		
		System.out.println("Agent "+this.id+" has completed its activity");	
	}
		
	
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
				System.out.println("Task "+nextTask.getTaskId()+" is assigned");
				break;
			}
		}
	}
	
	public void assignTask(KSSTask nTask) {
		LinkedList<DFAgentDescription> availableTeams=this.dfa.getSubscribers();
		DFAgentDescription aDescription=availableTeams.get(RandomHelper.nextIntFromTo(0, availableTeams.size()-1));
		TeamAgent SProvider=aDescription.getServiceProvider();
		SProvider.requestService(nTask);
		nTask.setAssigned();
		System.out.println("Task "+nTask.getTaskId()+" is assigned");
	}
	
	public void requestService(KSSTask nTask) {
		this.incomingQ.add(nTask);
	}
	

	public void setDirectoryFacilitator(DirectoryFacilitatorAgent inDfa) {
		this.dfa=inDfa;
	}
	
	public void setCoordinator(boolean coordinationStatus) {
		this.coordinator=true;
		this.myServiceProviders=new LinkedList<TeamAgent>();
	}
	
	public void addService(Service e) {
		
		this.getServices().add(e);
	}
	
	public int getType() {
		return type;
	}
	public String getId() {
		return id;
	}
	public String toString(){
		return this.id;
	}
}
