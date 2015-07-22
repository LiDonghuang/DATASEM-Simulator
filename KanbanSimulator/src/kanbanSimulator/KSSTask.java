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
	public SystemOfSystems SoS;
	
	private int id;
	private String profileName;
	private DemandSource demandSource;
	private double perceivedValue;
	
	private boolean demanded;
	private boolean requested;
	private boolean aggregationNode;
	private LinkedList<KSSTask> upperTasks;
	private LinkedList<KSSTask> subTasks;
	private boolean predecessor;
	private boolean successor;
	private LinkedList<KSSTask> predecessors;
	private LinkedList<KSSTask> successors;
	private boolean causer;
	private LinkedList<KSSTrigger> causalTriggers;
	
	private int status; // 0: Not Created; 1: Not Started; 2: In Progress; 3: Suspended; 4: Completed
	
	private ServiceProviderAgent requestedBy;
	private ServiceProviderAgent assignedTo;
	private LinkedList<ServiceResource> allocatedResources;
	private double serviceEfficiency;
	private double progress;	
	private double progressRate;
	
	private double arrivalTime; // Infinite if not triggered
	private double dueDate; // Infinite if not defined
		
	private double createdTime; // True Creation Time
	private double assignedTime; // Time Assigned to a SP
	private double startTime; // Time Started Processing
	private double estimatedEfforts;
	private double estimatedCompletionTime; 
	private double estimatedRemainingTime; 
	private double endTime; // Time Actually End Processing, either Completed or Abandoned
	private double cycleTime;
	
	private boolean created;
	private boolean assigned;		
	private boolean started;
	private boolean suspended;
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
		this.id=id;	
		this.name = wi.getName();
		this.description = wi.getDescription();		
		this.pattern = wi.getPattern();
		this.patternType = wi.getPatternType();
		this.reqSpecialties = wi.getReqSpecialties();
		this.befforts = wi.getBefforts();
		this.bvalue = wi.getBvalue();
		this.perceivedValue = this.bvalue;
		this.cos = wi.getCOS();
		this.setArrivalTime(wi.getArrtime());
		// Due Date = 0 = Infinity
		if (!(wi.getDuedate()>0)) {this.setDueDate(Float.POSITIVE_INFINITY);}
		else {this.setDueDate(wi.getDuedate());}
		this.progress = 0;
		this.progressRate = 0;
		this.serviceEfficiency = 0;
		this.demanded = false;
		this.aggregationNode = false;
		this.upperTasks = new LinkedList<KSSTask>();
		this.subTasks = new LinkedList<KSSTask>();
		this.successor = false;
		this.predecessors = new LinkedList<KSSTask>();
		this.successors = new LinkedList<KSSTask>();
		this.causer = false;
		this.causalTriggers = new LinkedList<KSSTrigger>();
		this.allocatedResources = new LinkedList<ServiceResource>();		
		this.created=false;
		this.assigned=false;
		this.completed=false;	
	}
	
	@ScheduledMethod(start=1,interval=1,priority=10)
	public void step() {	
		// ********************* STEP *******************************
		System.out.println(this.getPatternType().getName()+"(id:"+this.getID()+")"+this.getName()+" updates --");	
//		System.out.println("Requested By: "+this.getRequester().getName());
//		System.out.println("Currently Assigned to: "+this.getAssignedTo().getName());
		// ******************* Value Function: Update WI Value ***********************
//		double oldValue = this.value;
//		double newValue = oldValue;
//		if (this.cos.matches("Standard")) {
//			newValue = this.value*0.995;}
//		else if (this.cos.matches("Important")) {
//			newValue = this.value*0.975;}
//		else if (this.cos.matches("Expedite")) {
//			newValue = this.value*0.9;}
//		else if (this.cos.matches("DateCertain")) {
//			if (timeNow>this.getDueDate()){
//			newValue = 0;}}
//		this.value = newValue;
//		System.out.println(this.cos+": Value of "+this.getName()+" Diminished From "+oldValue+" to "+ newValue);
		
	
		// ------------ Non-Aggregation WI Progress Check -------------								
		if (!this.isAggregationNode()) {
			// ------------ Compute WI Progress (percentage) -----------	
			if (this.isStarted() && !this.isCompleted()) {
				progressRate = this.getServiceEfficiency()/this.getBefforts();
				double currentProgress = this.getProgress() + progressRate;
				this.setProgress(currentProgress);
				// ------ Progress Completion Check
				if (this.getProgress() >= 0.999999) {			
					this.setProgress(1.00);
					this.setCompleted();
					LinkedList<ServiceResource> allocatedResources 
						= this.getAllocatedResources();
					for (int r=0;r<allocatedResources.size();r++) {
						allocatedResources.get(r).withdrawFrom(this);
						}
				}
				System.out.println("Progress: "+this.progress);
			}
		}
//		else if (this.isAggregationNode()) {
//			double currentProgress = 0;
//			double totalEfforts = 0;
//			for (int s=0;s<this.getSubTasks().size();s++) {
//				KSSTask subTask = this.getSubTasks().get(s);
//				totalEfforts += subTask.getBefforts();
//			}
//		}
		// ------------ Aggregation WI Progress Check -------------	
		if (this.isCompleted()) {
			for (int u=0;u<this.getUpperTasks().size();u++) {
				KSSTask upperTask = this.getUpperTasks().get(u);
				if (upperTask.isCreated() && !upperTask.isCompleted()) {
					upperTask.checkSubTasksCompletion();
				}
			}
		}			
		// ---------------------------------------------------------
	    this.updateUpperTasksCompletion();
		// ------------ Trigger Casuality --------------------------
		this.checkCausalities();		
	// ************************* END STEP ********************************
	}
	
	
	
	public int getID() {
		return this.id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public String getProfileName() {
		return this.profileName;
	}
	public void setProfileName(String s) {
		this.profileName = s;
	}
	public boolean isDemanded () {
		return this.demanded;
	}
	public void setDemanded (boolean a) {
		this.demanded = a;
	}
	public DemandSource getDemandSource () {
		return this.demandSource;
	}
	public void setDemandSource (DemandSource ds) {
		this.demandSource = ds;
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
	///////////////////// Work Item Dependency ////////////////////////////
	// Hierarchy
    public LinkedList<KSSTask> getUpperTasks() {
    	return this.upperTasks;
    }
	public void addUpperTask(KSSTask upperTask) {	
		if (!this.getUpperTasks().contains(upperTask)){
			this.getUpperTasks().add(upperTask);
			upperTask.addSubTask(this);
		}
	}	
	public LinkedList<KSSTask> getSubTasks() {
    	return this.subTasks;
    }
	public void addSubTask(KSSTask subTask) {	
		if (!this.getSubTasks().contains(subTask)) {
			this.getSubTasks().add(subTask);
			subTask.addUpperTask(this);
		}
	}
	public void removeUpperTask(KSSTask upperTask) {
		if (this.getUpperTasks().contains(upperTask)) {
			this.getUpperTasks().remove(upperTask);
			upperTask.removeSubTask(this);
		}
	}
	public void removeSubTask(KSSTask subTask) {
		if (this.getSubTasks().contains(subTask)) {
			this.getSubTasks().remove(subTask);
			subTask.removeUpperTask(this);
		}
	}
	public void checkSubTasksCompletion() {
		if (this.isAggregationNode()) {
			boolean cpl = true;
			for (int st = 0; st < this.getSubTasks().size(); st++) {	
				KSSTask subTask = this.getSubTasks().get(st);
				// If any subTask not completed, the mainTask is not completed
				if (!subTask.isCompleted()) {
					cpl = false;
				}
			}
			if (cpl == true) {
				this.setCompleted();
				this.updateUpperTasksCompletion();
			}
		}
	}
	public void updateUpperTasksCompletion() {
		if (this.isCompleted()) {
			for (int u=0;u<this.getUpperTasks().size();u++) {
				KSSTask upperTask = this.getUpperTasks().get(u);
				if (upperTask.isCreated() && !upperTask.isCompleted()) {
					upperTask.checkSubTasksCompletion();
				}
			}
		}	
	}
	// Precedency
    public LinkedList<KSSTask> getPredecessorTasks() {
    	return this.predecessors;
    }
	public void addPredecessorTask(KSSTask predecessor) {	
		this.getPredecessorTasks().add(predecessor);
		predecessor.addSuccessorTask(this);
	}
    public LinkedList<KSSTask> getSuccessorTasks() {
    	return this.successors;
    }
	public void addSuccessorTask(KSSTask successor) {	
		this.getSuccessorTasks().add(successor);
		successor.addPredecessorTask(this);
	}
	public boolean precedencyCleared() {
		if (this.isSuccessor()) {
			boolean cleared = true;
			for (int p=0;p<this.getPredecessorTasks().size();p++) {
				KSSTask pTask = this.getPredecessorTasks().get(p);
				if (pTask.isCompleted()) {
					this.getPredecessorTasks().remove(p);
				}
				else if (!pTask.isCompleted()){
					cleared = false;
					break;
				}
			}
			return cleared;			
		}
		else {			
			return true;}
	}
	public void updateSuccessorTasks() {
		if (this.getSuccessorTasks().size()>0) {
			for (int s=0;s<this.getSuccessorTasks().size();s++) {
				KSSTask sTask = this.getSuccessorTasks().get(s);
				sTask.getPredecessorTasks().remove(this);
				sTask.checkCausalities();
			}
		}
	}
	// Causality
    public LinkedList<KSSTrigger> getKSSTriggers() {
    	return this.causalTriggers;
    }
	public void addKSSTriggers(KSSTrigger e) {	
		this.getKSSTriggers().add(e);
	}
	public void checkCausalities() {
		if (this.isAssigned()&&this.precedencyCleared()){
			//-
			Context<Object> context = ContextUtils.getContext(this);	
			//-
			for (int c=0;c<this.getKSSTriggers().size();c++) {
				KSSTrigger trigger = this.getKSSTriggers().get(c);
				if ((this.isCompleted())||(this.progress >= trigger.getAtProgress())) {
					double rand = Math.random();
					if (trigger.getOnProbability() >= rand) {
						for (int t=0;t<trigger.getTriggered().size();t++) {
							KSSTask triggeredWI = trigger.getTriggered().get(t);
							if (!trigger.isRepetitive() && !triggeredWI.isCreated()){
								System.out.println(this.getName()+
										" triggered "+triggeredWI.getName());
								//
								context.add(triggeredWI);
								//
								this.SoS.getArrivedList().add(triggeredWI);
								triggeredWI.setCreated();
								triggeredWI.setArrivalTime(this.SoS.timeNow);
								// Put triggered WI to requestedQ of main WI's SP								
								this.getAssignedTo().assignWI(triggeredWI);										
							}
						}
					}
					if (!trigger.isRepetitive()) {
						this.getKSSTriggers().remove(trigger);
					}
				}
			}
		}
	}
	//////////////////// Work Item Status ////////////////////////////	
	public boolean isComplex() {
		return this.complexTask;
	}
	public boolean isRequested() {
		return this.requested;
	}	
	public double getArrivalTime() {
		return this.arrivalTime;
	}
	public void setArrivalTime(double aTime) {
		this.arrivalTime = aTime;
	}
	public double getDueDate() {
		return this.dueDate;
	}	
	public void setDueDate(double dDate) {
		this.dueDate = dDate;
	}
	public void setStarted() {
		this.started = true;
		 this.startTime = this.SoS.timeNow;;	
		 System.out.println("WorkItem "+this.getName()+"(id:"+this.getID()+")"+" is started");
	}
	public boolean isStarted() {
		return this.started;
	}
	public double getStartTime() {
		return this.startTime;
	}
	public boolean isCompleted()  {
		return this.completed;
	}
	public void setCompleted() {
		this.completed=true;
		System.out.print("*** WorkItem "+this.getName()
				+"(id:"+this.getID()+")"+" is Completed ***\n");
		this.updateUpperTasksCompletion();
		this.updateSuccessorTasks();
	}
	public boolean isEnded()  {
		return this.ended;		
	}
	public void setEnded() {
		this.ended=true;
		this.endTime = this.SoS.timeNow;
		this.cycleTime = this.endTime - this.createdTime;
		System.out.println(this.getName()+" (id:"+this.getID()+") is Ended");
		System.out.println("CycleTime: "+this.getCycleTime());
	}
	public double getEndTime() {
		return this.endTime;
	}
	public double getCycleTime() {
		return this.cycleTime;
	}
	public boolean isSuspended() {
		return this.suspended;
	}
	public void setSuspended() {
		this.suspended=true;
	}
	public boolean isAssigned() {
		return this.assigned;
	}
	public void setAssigned() {
		this.assigned=true;
		this.assignedTime = this.SoS.timeNow;
	}
	public double getAssignedTime() {
		return this.assignedTime;
	}
	public boolean isCreated() {
		return this.created;
	}	
	public void setCreated() {
		this.created=true;
		this.createdTime=this.SoS.timeNow;
		System.out.println(this.getName()+"(id:"+this.getID()+") is Created");
//		this.arrTime = this.createdTime;
	}
	public double getProgress() {
		return this.progress;
	}
	public void setProgress(double p) {
		this.progress = p;
	}
	public double getProgressRate() {
		return this.progressRate;
	}
	//////////////////// Work Item Management ////////////////////////////
	public void setEstimatedEfforts(double eEfforts) {
		this.estimatedEfforts= eEfforts;
	}
	public double getEstimatedEfforts() {
		return this.estimatedEfforts;
	}
	public void setEstimatedCompletionTime(double eCompletion) {
		this.estimatedCompletionTime= eCompletion;
	}
	public double getEstimatedCompletionTime() {
		return this.estimatedCompletionTime;
	}
	public void setEstimatedRemainingTime(double eRemaining) {
		this.estimatedRemainingTime= eRemaining;
	}
	public double getEstimatedRemainingTime() {
		return this.estimatedRemainingTime;
	}
	public void setRequester(ServiceProviderAgent sp) {
		this.requestedBy = sp;
		this.requested = true;
	}
	public ServiceProviderAgent getRequester() {
		return this.requestedBy;
	}	
	public void assignTo(ServiceProviderAgent sp) {
		this.assignedTo = sp;
	}
	public ServiceProviderAgent getAssignedTo() {
		return this.assignedTo;
	}
	public void allocateResource(ServiceResource sR) {
		this.getAllocatedResources().add(sR);
		System.out.println("Resource "+sR.getName()+
				" is Allocated to "+this.getName());
	}
	public void withdrawResource(ServiceResource sR) {
		this.getAllocatedResources().remove(sR);
		System.out.println("Resource "+sR.getName()+
				" is Withdrawed from "+this.getName());
	}
	public LinkedList<ServiceResource> getAllocatedResources() {
		return this.allocatedResources;
	}
	
	public double getServiceEfficiency() {		
		return this.serviceEfficiency;		
	}
	public void setServiceEfficiency(double e) {
		this.serviceEfficiency = e;
		System.out.println(this.getAssignedTo().getName()+" is Serving "+
				this.getName() + " at Efficiency: "+e);
	}
	public double calculateServiceEfficiency() {
		double sEfficiency = 0;
		for (int s=0;s<this.getAssignedTo().getServices().size();s++){
			Service service = this.getAssignedTo().getServices().get(s);
			if (service.getServiceType().getName().
					matches(this.getReqSpecialties().get(0).getName())){
				Service currentService = service;
				sEfficiency = (double)currentService.getEfficiency()/100;				
				break;
			}		
		}		
		return sEfficiency;
	}
	public double calculateResourceEfficiency() {
		double rEfficiency = 0;
		for (int s=0;s<this.getAllocatedResources().get(0).getServices().size();s++){
			Service service = this.getAllocatedResources().get(0).getServices().get(s);
			if (service.getServiceType().getName().
					matches(this.getReqSpecialties().get(0).getName())){
				Service currentService = service;
				rEfficiency = (double)currentService.getEfficiency()/100;				
				break;
			}		
		}		
		return rEfficiency;
	}
	//////////////////////////////////////////////////////////////////////////
	
	public double getCurrentValue() {
		return this.perceivedValue;
	}
	public void setCurrentValue(double v) {
		this.perceivedValue = v;
	}
	/////////////////////////////////////////////////////////////////////////
	
	public void TaskTraversal() {
		for(int i=0;i<this.requirement.getSubtasks().size();i++) {
			KSSTask nextTask= (KSSTask) this.requirement.getSubtasks().get(i);
			System.out.println("Task name: "+ nextTask.getName());
			System.out.println("Task ID: "+ nextTask.getID());
			System.out.print("Successor tasks: ");
			Iterator<KSSTask> taskIterator=this.requirement.getAdjList().get(nextTask).iterator();
			if (taskIterator.hasNext()==false) System.out.println("no successors");
			while (taskIterator.hasNext()) {
				System.out.print("Task ID: "+taskIterator.next().getID()+"  ");
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
				System.out.println("Inserted Task "+tempTask.getID()+" into readyList");
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
		System.out.println("Removed Task "+completedTask.getID()+" from readylist");
		LinkedList<KSSTask> tList=this.requirement.getAdjList().get(completedTask);
		for(int j=0;j<tList.size(); j++) {
			KSSTask tempTask=tList.get(j);
			int currentInDegree=this.inDegree.get(tempTask);
			if (currentInDegree>0) {
				currentInDegree=currentInDegree-1;	
				this.inDegree.put(tempTask, currentInDegree);
				if ((currentInDegree==0) && (tempTask.isCompleted()==false)) {
					this.readyList.add(tempTask);
					System.out.println("Task "+tempTask.getID()+" is now in the ready list");
				}
			}
		}
	}
	public LinkedList<KSSTask> getTopologicalTasks() {
		return this.topologicalList;
	}
	
	public LinkedList<KSSTask> getReadyTasks() {
		return this.readyList;
	}

}
