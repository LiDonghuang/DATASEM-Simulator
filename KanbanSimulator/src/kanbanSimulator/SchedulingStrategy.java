package kanbanSimulator;

import ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem;;

public class SchedulingStrategy {

	private int scheduleType;
	public SchedulingStrategy(int strategyType) {
		this.scheduleType=strategyType;
	}
	
	public void assignResource(KSSTask newTask) {
		
	}
}
