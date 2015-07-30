package kanbanSimulator;
import java.util.LinkedList;

import datasem.xtext.kanban.domainmodel.kanbanmodel.*;
import datasem.xtext.kanban.domainmodel.kanbanmodel.impl.*;
import governanceModels.GovernanceSearchStrategy;

public class ServiceResource extends ResourceImpl{
	
	private Resource resource;
	private boolean busy;
	private LinkedList<KSSTask> activeQ;
	private int WIPLimit;

	public ServiceResource (Resource r){	
		this.resource = r;
		this.name = r.getName();
		this.description = r.getDescription();		
		this.services = r.getServices();
		
		this.busy = false;
		this.activeQ = new LinkedList<KSSTask>();
		this.WIPLimit = 1;
	}
	
	public void allocateTo(KSSTask t) {
	    t.allocateResource(this);
		this.activeQ.add(t);
		this.setBusy();
	}
	public void withdrawFrom(KSSTask t) {
		t.withdrawResource(this);
		this.activeQ.remove(t);
		if (this.activeQ.size()==0) {
			this.setIdle();
		}
	}
	public void setBusy () {
		this.busy = true;
	}
	public void setIdle () {
		this.busy = false;
	}
	public Boolean isBusy () {
		return this.busy;
	}
}
