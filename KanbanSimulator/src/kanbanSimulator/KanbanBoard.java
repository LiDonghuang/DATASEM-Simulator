package kanbanSimulator;

import java.util.LinkedList;
import java.util.Queue;

import datasem.xtext.kanban.domainmodel.kanbanmodel.*;
import datasem.xtext.kanban.domainmodel.kanbanmodel.impl.*;

public class KanbanBoard  {
	private Queue<KSSTask> incomingQ;
	private Queue<KSSTask> demandBackLogQ;
	private Queue<KSSTask> readyQ;
	private Queue<KSSTask> coordinateQ;
	private LinkedList<KSSTask> activeQ;
	private Queue<KSSTask> completeQ;
	private int RQueueLimit;
	private int workInprogressLimit;
	
	
	public KanbanBoard(int readyQLimit, int wipLimit) {
		this.RQueueLimit=readyQLimit;
		this.workInprogressLimit=wipLimit;
		this.demandBackLogQ=new LinkedList<KSSTask>();
		this.readyQ=new LinkedList<KSSTask>();
		this.activeQ=new LinkedList<KSSTask>();
		this.coordinateQ=new LinkedList<KSSTask>();
		this.incomingQ=new LinkedList<KSSTask>();
		this.completeQ=new LinkedList<KSSTask>();
	}
	
}
