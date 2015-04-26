package kanbanSimulator;

import java.util.ArrayList;
import java.util.LinkedList;

public class ServiceProvision {
	
	private LinkedList<ServiceProviderAgent> serviceProviders;
	private String serviceName;
	private String serviceType;
	
	public ServiceProvision(String sName, String sType) {
		this.serviceProviders=new LinkedList<ServiceProviderAgent>();
		this.serviceName=new String(sName);
		this.serviceType=new String(sType);
	}
	
	public void addServiceProvider(ServiceProviderAgent t) {
		this.serviceProviders.add(t);
	}
	
	public String getServiceType() {
		return this.serviceType;
	}
	
	public String getServiceName() {
		return this.serviceName;
	}
	
	public LinkedList<ServiceProviderAgent> getServiceProviders() {
		return this.serviceProviders;
	}
	

}
