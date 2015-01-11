package kanbanSimulator;

import ausim.xtext.kanban.domainmodel.kanbanmodel.Task;

public class SchedulingStrategy {

	private int scheduleType;
	public SchedulingStrategy(int strategyType) {
		this.scheduleType=strategyType;
	}
	
	public void asssignResource(KSSTask newTask) {
		
	}
}
