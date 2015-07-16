package governanceModels;

import java.util.LinkedList;
import kanbanSimulator.*;

public class Contract {
	private LinkedList<KSSTask> contractedWIs;
	private ServiceProviderAgent contractor;
	private ServiceProviderAgent manager;
	
	public Contract() {
		this.contractedWIs = new LinkedList<KSSTask>();
	}
	public void setContractor(ServiceProviderAgent s) {
		this.contractor = s;
	}
	public ServiceProviderAgent getContractor() {
		return this.contractor;
	}
	public void setManager(ServiceProviderAgent s) {
		this.manager = s;
	}
	public ServiceProviderAgent getManager() {
		return this.manager;
	}
	public LinkedList<KSSTask> getContractedWIs() {
		return this.contractedWIs;
	}
}
