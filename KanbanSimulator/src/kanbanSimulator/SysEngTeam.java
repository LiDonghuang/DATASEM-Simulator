package kanbanSimulator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.engine.schedule.ISchedule;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.random.RandomHelper;
import repast.simphony.space.graph.Network;
import repast.simphony.space.grid.Grid;
import ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl;

public class SysEngTeam extends ServiceProviderImpl {

	private String id;
	private SchedulingStrategy strategy;
	private Network<Object> net;
	private boolean coordinator;
	private KanbanBoard myKanbanBoard;
	private LinkedList<ServiceProviderAgent> myServiceProviders;
	private DirectoryFacilitatorAgent dfa=null;
	private Queue<KSSTask> incomingQ;
	private Queue<KSSTask> demandBackLogQ;
	private Queue<KSSTask> readyQ;
	private Queue<KSSTask> coordinateQ;
	private LinkedList<KSSTask> activeQ;
	private Queue<KSSTask> completeQ;
	private int RQueueLimit;
	private int workInprogressLimit;
	public int state;
	
	
	public SysEngTeam(String id, SchedulingStrategy str, Network<Object> myNet) {
		this.id = id;
		this.strategy=str;
		this.net=myNet;
		this.state=0;
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
			newTask.setStarted(schedule.getTickCount());
			schedule = RunEnvironment.getInstance().getCurrentSchedule();
			double cTime=RandomHelper.nextDoubleFromTo(10, 20)+schedule.getTickCount();
			System.out.println("Task "+newTask.getTaskId()+" is sceduled to finish at"+cTime);
			newTask.setEstimatedCompletionTime(cTime);
			this.activeQ.add(newTask);
		}
		
		int activeQSize=this.activeQ.size();
		if (activeQSize>0) {this.state=1;} else {this.state=0;}
		
		for(int i=0;i<activeQSize;i++) {
			KSSTask nextTask=this.activeQ.get(i); 
			if (schedule.getTickCount()>=nextTask.getEndTime()) {
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
			KSSTask complexTask=this.coordinateQ.peek();  
			if (complexTask!=null) {
				KSSTask cTask=complexTask.pollCompletedTask();
				if (cTask!=null) {complexTask.updateReadyTasks(cTask);}
				if ((complexTask.getReadyTasks().size()==0) && (complexTask.isCompleted()!=true))
					{complexTask.setCompleted(true);this.coordinateQ.remove(complexTask);}
				else this.strategy.assignResource(complexTask);
			}
		}
		
		System.out.println("Agent "+this.id+" has completed its activity");	
	}
	
	
	
}
