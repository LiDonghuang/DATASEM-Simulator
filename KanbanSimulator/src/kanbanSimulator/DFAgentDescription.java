package kanbanSimulator;

import java.util.ArrayList;
import java.util.LinkedList;

public class DFAgentDescription {
	private LinkedList<ServiceDescription> serviceDescriptions;
	private TeamAgent serviceProvider;
	
	public DFAgentDescription(TeamAgent sProvider) {
		serviceDescriptions = new  LinkedList<ServiceDescription>();
		serviceProvider=sProvider;
	}
	
	public void addServiceDescription(ServiceDescription sd) {
		serviceDescriptions.add(sd);
	}
	
	public void setServiceProvider(TeamAgent sProvider) {
		this.serviceProvider=sProvider;
	}
	
	public TeamAgent getServiceProvider() {
		return this.serviceProvider;
	}
	
	public LinkedList<ServiceDescription> getServiceDescriptions() {
		return this.serviceDescriptions;
	}
}
