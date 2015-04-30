package kanbanSimulator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.lang.Math;

import org.eclipse.emf.common.util.EList;

import bsh.This;
import ausim.xtext.kanban.domainmodel.kanbanmodel.*;
import ausim.xtext.kanban.domainmodel.kanbanmodel.impl.*;
import repast.simphony.context.Context;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.engine.schedule.ISchedule;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.space.grid.Grid;
import repast.simphony.util.ContextUtils;


public class KSSTask extends WorkItemImpl {	
	
	private int id;
	private WorkItem workItem;	
	private double value;
	
	private boolean aggregationNode;
	private LinkedList<KSSTask> subTasks;
	private boolean successor;
	private LinkedList<KSSTask> predecessors;
	private boolean causer;
	private LinkedList<KSSTrigger> causalTriggers;
	
	private int status; // 0: Not Created; 1: Not Started; 2: In Progress; 3: Suspended; 4: Completed
	
	public ServiceProviderAgent assignedTo;	
	public double progress;	
	public double arrTime; // Infinite if not triggered
	public double dueDate; // Infinite if not defined
	
	public double requiredEfforts;
	public double createdTime; // True Creation Time
	public double startTime; // Time Started Processing
	public double estimatedCompletion; 
	public double endTime; // Time Actually End Processing, either Completed or Abandoned
	public double cycleTime;
	
	private boolean created;
	private boolean assigned;		
	private boolean started;
	private boolean completed;
	private boolean ended;
	
	private boolean complexTask;	
	private TaskFlow requirement;
	private Map<KSSTask,Integer> inDegree;
	private LinkedList<KSSTask> readyList;
	private LinkedList<KSSTask> completedList;
	private LinkedList<KSSTask> topologicalList;

	private static final int DEFAULT_INITIAL_CAPACITY = 100;
	

	
//	public KSSTask(int id, Task wi, TaskFlow rq){
//		this.id=id;		
//		this.workItem=wi;
//		this.completed=false;
//		this.complexTask=true;
//		this.assigned=false;		
//		this.requirement=rq;
//		this.inDegree=new HashMap(DEFAULT_INITIAL_CAPACITY);
//		this.readyList=new LinkedList<KSSTask>();
//		this.completedList=new LinkedList<KSSTask>();
//		this.topologicalList=new LinkedList<KSSTask>();
//		int size=this.requirement.getSubtasks().size();
//				
//
//	}
	
	
	public KSSTask(int id, WorkItem wi) {
		this.name = wi.getName();
		this.description = wi.getDescription();
		this.pattern = wi.getPattern();
		this.patternType = wi.getPatternType();
		this.reqSpecialties = wi.getReqSpecialties();
		this.befforts = wi.getBefforts();
		this.bvalue = wi.getBvalue();
		this.value = this.bvalue;
		this.cos = wi.getCOS();
		
		if (!(wi.getArrtime()>0)) {this.arrTime = Float.POSITIVE_INFINITY;}
		else {this.arrTime = wi.getArrtime();}
		
		if (!(wi.getDuedate()>0)) {this.dueDate = Float.POSITIVE_INFINITY;}
		else {this.dueDate = wi.getDuedate();}
		
		this.progress = 0;
		
		this.aggregationNode = false;
		this.subTasks = new LinkedList<KSSTask>();
		this.successor = false;
		this.predecessors = new LinkedList<KSSTask>();
		this.causer = false;
		this.causalTriggers = new LinkedList<KSSTrigger>();
		this.id=id;		
		this.workItem=wi;
		this.created=false;
		this.assigned=false;
		this.completed=false;
		
	}
	
	@ScheduledMethod(start=1,interval=1)
	public void step() {
		Context context = ContextUtils.getContext(this);
		Grid grid = (Grid)context.getProjection("Grid");
		ISchedule schedule = RunEnvironment.getInstance().getCurrentSchedule();
		double timeNow = schedule.getTickCount();
		
		// ******************* Value Function: Update WI Value ***********************
		double oldValue = this.value;
		double newValue = oldValue;
		if (this.cos.matches("Standard")) {
			newValue = this.value*0.995;}
		else if (this.cos.matches("Important")) {
			newValue = this.value*0.975;}
		else if (this.cos.matches("Expedite")) {
			newValue = this.value*0.9;}
		else if (this.cos.matches("DateCertain")) {
			if (timeNow>this.dueDate){
			newValue = 0;}}
		this.value = newValue;
//		System.out.println(this.cos+": Value of "+this.getName()+" Diminished From "+oldValue+" to "+ newValue);
		

		// ********************* STEP *******************************
		
		
		
		// ------------ Compute WI Progress (percentage) -----------						
		if (this.isStarted() && !this.isCompleted()) {
			if (!this.isAggregationNode()) {
				this.setProgress( (timeNow - this.startTime)/(this.getBefforts()) );
			}
			if (this.getProgress() >= 1) {
				this.setCompleted(timeNow);
				this.setProgress(1.00);
			}
		}
		// ------------ Aggregation WI Progress Check -------------
		for (int i=0; i<3; i++) {			
			if (this.isAggregationNode()) {
				boolean cpl = true;
				for (int st = 0; st < this.subTasks.size(); st++) {				
					if (this.subTasks.get(st).isCompleted() == false) {
						cpl = false;
						}
				}
				if (cpl == true) {
					this.setCompleted(timeNow);
					this.setEnded(timeNow);
				}
			}			
		}
		
		// ------------ Trigger Casuality --------------------------
		if (this.isCauser()){
			for (int c=0;c<this.getKSSTriggers().size();c++) {
				KSSTrigger trigger = this.getKSSTriggers().get(c);
				if (this.progress >= trigger.getAtProgress()) {
					double rand = Math.random();
					if (trigger.getOnProbability() >= rand) {
						for (int t=0;t<trigger.getTriggered().size();t++) {
							KSSTask triggeredWI = trigger.getTriggered().get(t);
							if (!trigger.isRepetitive() && !triggeredWI.isCreated()){
								triggeredWI.setCreated(timeNow);
								System.out.println("triggered: "+triggeredWI.getName());
							}
						}
					}
					if (!trigger.isRepetitive()) {
						this.getKSSTriggers().remove(trigger);
					}
				}
			}
		}
		

	// ************************* END STEP ********************************
	}
	
	
	
	public int getTaskId() {
		return this.id;
	}
	public boolean isAggregationNode () {
		return this.aggregationNode;
	}
	public void setAggregationNode (boolean a) {
		this.aggregationNode = a;
	}
	public boolean isSuccessor () {
		return this.successor;
	}
	public void setSuccessor (boolean a) {
		this.successor = a;
	}
	public boolean isCauser () {
		return this.causer;
	}
	public void setCauser (boolean a) {
		this.causer = a;
	}
	///////////////////////////////////////////////////
	
    public LinkedList<KSSTask> getKSSsTasks() {
    	return this.subTasks;
    }
	public void addKSSsTasks(KSSTask e) {	
		this.getKSSsTasks().add(e);
	}
    public LinkedList<KSSTask> getKSSpredecessors() {
    	return this.predecessors;
    }
	public void addKSSpredecessors(KSSTask e) {	
		this.getKSSpredecessors().add(e);
	}
    public LinkedList<KSSTrigger> getKSSTriggers() {
    	return this.causalTriggers;
    }
	public void addKSSTriggers(KSSTrigger e) {	
		this.getKSSTriggers().add(e);
	}
	/////////////////////////////////////////////////
	public void setCompleted(boolean isCompleted) {
		this.completed=true;
		System.out.print("*** WorkItem "+this.getName()+"(id:"+this.getTaskId()+")"+" is Completed ***\n");
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
	

	public void setStarted(double sTime) {
		this.started = true;
		 this.startTime = sTime;	
		 System.out.println("WorkItem "+this.getName()+"(id:"+this.getTaskId()+")"+" is started");
	}
	public boolean isStarted() {
		return this.started;
	}
	public double getStartTime() {
		return this.startTime;
	}
	
	public void setEstimatedCompletion(double eCompletion) {
		this.estimatedCompletion= eCompletion;
	}
	public double getEstimatedCompletion() {
		return this.estimatedCompletion;
	}
	
	public boolean isCompleted()  {
		return this.completed;
	}
	public void setCompleted(double tNow) {
		this.completed=true;
	}
	
	public boolean isEnded()  {
		return this.completed;
	}
	public void setEnded(double tNow) {
		this.ended=true;
		this.endTime = tNow;
		this.cycleTime = this.endTime - this.createdTime;
	}
	public double getEndTime() {
		return this.endTime;
	}
	public double getCycleTime() {
		return this.cycleTime;
	}
	public boolean isAssigned() {
		return this.assigned;
	}
	public void setAssigned() {
		this.assigned=true;
	}
	public boolean isCreated() {
		return this.created;
	}	
	public void setCreated(double tNow) {
		this.created=true;
		this.createdTime=tNow;
//		this.arrTime = this.createdTime;
	}
	public double getProgress() {
		return this.progress;
	}
	public void setProgress(double p) {
		this.progress = p;
	}
	//////////////////////////////////////////////////////////////////////////
//	public void setProgress(double tNow) {
//		this.progress = 
//	}
	
	public double getCurrentValue() {
		return this.value;
	}
	public void setCurrentValue(double v) {
		this.value = v;
	}
	/////////////////////////////////////////////////////////////////////////
	
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
			if (rTask.isCompleted()==true) {cTask=rTask; break;}
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
				if ((currentInDegree==0) && (tempTask.isCompleted()==false)) {
					this.readyList.add(tempTask);
					System.out.println("Task "+tempTask.getTaskId()+" is now in the ready list");
				}
			}
		}
	}
	
	
	public void assignTo(ServiceProviderAgent sp){
		this.assignedTo = sp;
	}
	
	
	public LinkedList<KSSTask> getTopologicalTasks() {
		return this.topologicalList;
	}
	
	public LinkedList<KSSTask> getReadyTasks() {
		return this.readyList;
	}
}
