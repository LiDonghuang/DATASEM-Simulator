package kanbanSimulator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import bsh.This;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Service;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Task;
import ausim.xtext.kanban.domainmodel.kanbanmodel.TaskPattern;
import ausim.xtext.kanban.domainmodel.kanbanmodel.TaskType;
import ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl;
import repast.simphony.context.Context;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.engine.schedule.ISchedule;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.space.grid.Grid;
import repast.simphony.util.ContextUtils;


public class KSSTask extends TaskImpl {	
	
	private int id;
	private Task workItem;	
	
	private boolean completed;
	private boolean complexTask;
	private boolean assigned;
	private double requiredEfforts;
	private double startTime;
	private double endTime;
	
	private LinkedList<KSSTask> subTasks;
	private LinkedList<KSSTask> predececcorTasks;
	private LinkedList<KSSTask> triggerTasks;
	
	private static final int DEFAULT_INITIAL_CAPACITY = 100;
	
	private TaskFlow requirement;
	private Map<KSSTask,Integer> inDegree;
	private LinkedList<KSSTask> readyList;
	private LinkedList<KSSTask> completedList;
	private LinkedList<KSSTask> topologicalList;
	private TeamAgent assignedTo;
	
	public KSSTask(int id, Task wi, TaskFlow rq){
		this.id=id;		
		this.workItem=wi;
		this.completed=false;
		this.complexTask=true;
		this.assigned=false;		
		this.requirement=rq;
		this.inDegree=new HashMap(DEFAULT_INITIAL_CAPACITY);
		this.readyList=new LinkedList<KSSTask>();
		this.completedList=new LinkedList<KSSTask>();
		this.topologicalList=new LinkedList<KSSTask>();
		int size=this.requirement.getSubtasks().size();
				

	}
	
	
	public KSSTask(int id, Task wi) {
		this.name = wi.getName();
		this.description = wi.getDescription();
		this.befforts = wi.getBefforts();
		this.bvalue = wi.getBvalue();
		this.cos = wi.getCOS();
		this.subTasks = new LinkedList<KSSTask>();
		this.id=id;		
		this.workItem=wi;
		this.completed=false;
		this.complexTask=false;
		this.assigned=false;
	}
	
	@ScheduledMethod(start=0,interval=1)
	public void step() {
		Context context = ContextUtils.getContext(this);
		Grid grid = (Grid)context.getProjection("Grid");
		ISchedule schedule = RunEnvironment.getInstance().getCurrentSchedule();
		
		String wItype = this.getPatternType().get(0).getName();
		if (wItype.matches("Capability")||wItype.matches("Requirement")) {
			boolean cpl = true;
			for (int st = 0; st < this.subTasks.size(); st++) {				
				if (this.subTasks.get(st).isComplete() == false) {
					cpl = false;
					}
			}
			if (cpl == true) {
				this.setCompleted(true);
			}
		}
		
		// ------ Remove Completed WI from context
		if (this.isComplete() == true) {
			context.remove(this);
		}
	}
	
	
	
	public int getTaskId() {
		return this.id;
	}
	
	public void setStartTime() {
		 ISchedule schedule = RunEnvironment.getInstance().getCurrentSchedule();
		 this.startTime=schedule.getTickCount();	
		 System.out.println("WorkItem "+this.workItem.getName()+" is started");
	}
	
	public void setCompletionTime(double endTime) {
		this.endTime=endTime;
	}
	
	public double getCompletionTime() {
		return this.endTime;
	}
	
	///////////////////////////////////////////////////
	public String getName() {
		return this.workItem.getName();
	}
	public String getDescription() {
		return this.workItem.getDescription();
	}	
	public int getBvalue() {
		return this.workItem.getBvalue();
	}
	public int getBefforts() {
		return this.workItem.getBefforts();
	}
	public String getCOS() {
		return this.workItem.getCOS();
	}
    public EList<TaskPattern> getPattern() {
    	return this.workItem.getPattern();
    }
    public EList<TaskType> getPatternType() {
    	return this.workItem.getPatternType();
    }
    public EList<Service> getReqSpecialties() {
    	return this.workItem.getReqSpecialties();
    }
	public void addPattern(TaskPattern e) {	
		this.getPattern().add(e);
	}
	public void addPatternType(TaskType e) {	
		this.getPatternType().add(e);
	}
	
    public LinkedList<KSSTask> getKSSsTasks() {
    	return this.subTasks;
    }
	public void addKSSsTasks(KSSTask e) {	
		this.getKSSsTasks().add(e);
	}
	public void addReqSpecialties(Service e) {	
		this.getReqSpecialties().add(e);
	}
	/////////////////////////////////////////////////
	public void setCompleted(boolean isCompleted) {
		this.completed=true;
		System.out.print("*** WorkItem "+this.workItem.getName()+" is Completed ***\n");
		/*if (this.complexTask==true) {
			Iterator<KSSTask> completedTasks=this.completedList.iterator();
			while (completedTasks.hasNext()) {
				KSSTask nextCTask=completedTasks.next();
				//nextCTask=null;
			}
		}*/
	}
	
	public boolean isComplex() {
		return this.complexTask;
	}
	
	public boolean isComplete()  {
		return this.completed;
	}
	
	public boolean isAssigned() {
		return this.assigned;
	}
	
	public void setAssigned() {
		this.assigned=true;
	}
	
	public void TaskTraversal() {
		for(int i=0;i<this.requirement.getSubtasks().size();i++) {
			KSSTask nextTask= (KSSTask) this.requirement.getSubtasks().get(i);
			System.out.println("Task name: "+ nextTask.getName());
			System.out.println("Task ID: "+ nextTask.getTaskId());
			System.out.print("Successor tasks: ");
			Iterator<KSSTask> taskIterator=this.requirement.getAdjList().get(nextTask).iterator();
			if (taskIterator.hasNext()==false) System.out.println("no successors");
			while (taskIterator.hasNext()) {
				System.out.print("Task ID: "+taskIterator.next().getTaskId()+"  ");
			}
			System.out.println("  ");
		}
	}
	
	public void InitializeReadyTaskList() {

		int numberofTasks=this.requirement.getSubtasks().size();
		for(int i=0;i<numberofTasks;i++) {
			KSSTask tempTask=(KSSTask) this.requirement.getSubtasks().get(i);
			this.inDegree.put(tempTask, 0);
		}
		
		for(int i=0;i<numberofTasks;i++) {
			KSSTask nextTask= (KSSTask) this.requirement.getSubtasks().get(i);
			Iterator<KSSTask> taskIterator=this.requirement.getAdjList().get(nextTask).iterator();
			while (taskIterator.hasNext()) {
				KSSTask tempTask=(KSSTask) taskIterator.next();
				int nodeInDegree=this.inDegree.get(tempTask);
				nodeInDegree++;
				this.inDegree.put(tempTask, nodeInDegree);
			}
		}
	
		for (int i=0;i<numberofTasks; i++) {
			KSSTask tempTask=(KSSTask)this.requirement.getSubtasks().get(i);
			if ( (this.inDegree.get(tempTask) == 0)) {
				this.readyList.add(tempTask);
				System.out.println("Inserted Task "+tempTask.getTaskId()+" into readyList");
			}
			
			
		}
	}
	
	public LinkedList<KSSTask> getCompleteList() {
		return this.completedList;
	}
	
	public KSSTask pollCompletedTask() {
		KSSTask cTask=null;
		KSSTask rTask=null;
		for(int i=0;i<this.readyList.size();i++) {
			rTask=this.readyList.get(i);
			if (rTask.isComplete()==true) {cTask=rTask; break;}
		}	
		return cTask;
		
	}
	
	
	public void updateReadyTasks(KSSTask completedTask) {
		this.readyList.remove(completedTask);
		System.out.println("Removed Task "+completedTask.getTaskId()+" from readylist");
		LinkedList<KSSTask> tList=this.requirement.getAdjList().get(completedTask);
		for(int j=0;j<tList.size(); j++) {
			KSSTask tempTask=tList.get(j);
			int currentInDegree=this.inDegree.get(tempTask);
			if (currentInDegree>0) {
				currentInDegree=currentInDegree-1;	
				this.inDegree.put(tempTask, currentInDegree);
				if ((currentInDegree==0) && (tempTask.isComplete()==false)) {
					this.readyList.add(tempTask);
					System.out.println("Task "+tempTask.getTaskId()+" is now in the ready list");
				}
			}
		}
	}
	
	
	public void assignTo(TeamAgent sp){
		this.assignedTo = sp;
	}
	
	
	public LinkedList<KSSTask> getTopologicalTasks() {
		return this.topologicalList;
	}
	
	public LinkedList<KSSTask> getReadyTasks() {
		return this.readyList;
	}
}
