package kanbanSimulator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class TaskFlow {
	private LinkedList<KSSTask> subTasks;
	private Map<KSSTask,LinkedList<KSSTask>> AdjList;
	private static final int DEFAULT_INITIAL_CAPACITY = 100;
	
	public TaskFlow() {
		this.subTasks=new LinkedList<KSSTask>();
		this.AdjList=new HashMap(DEFAULT_INITIAL_CAPACITY);
	}
	
	public LinkedList<KSSTask> getSubtasks() {
		return this.subTasks;
	}
	
	public Map<KSSTask,LinkedList<KSSTask>> getAdjList() {
		return this.AdjList;
	}
	
	public void initAdjacencyList(KSSTask sTask) {
		if (this.AdjList.containsKey(sTask)==false) {
			LinkedList tList=new LinkedList<KSSTask>();
			this.AdjList.put(sTask,tList); 
		}
	}
	
	public void setAdjacencyList(KSSTask sTask,KSSTask tTask) {
		if (this.AdjList.containsKey(sTask)==false) {
			LinkedList tList=new LinkedList<KSSTask>();
			tList.add(tTask);
			this.AdjList.put(sTask,tList); 
		}
		else
		{
			LinkedList<KSSTask> tList=this.AdjList.get(sTask);
			tList.add(tTask);
		}
	}
	
	
}
