package kanbanSimulator;

import java.util.ArrayList;
import java.util.LinkedList;

public class DFAgentDescription {
	private LinkedList<ServiceDescription> serviceDescriptions;
	private ServiceProviderAgent serviceProvider;
	
	public DFAgentDescription(ServiceProviderAgent sProvider) {
		serviceDescriptions = new  LinkedList<ServiceDescription>();
		serviceProvider=sProvider;
	}
	
	public void addServiceDescription(ServiceDescription sd) {
		serviceDescriptions.add(sd);
	}
	
	public void setServiceProvider(ServiceProviderAgent sProvider) {
		this.serviceProvider=sProvider;
	}
	
	public ServiceProviderAgent getServiceProvider() {
		return this.serviceProvider;
	}
	
	public LinkedList<ServiceDescription> getServiceDescriptions() {
		return this.serviceDescriptions;
	}
}
