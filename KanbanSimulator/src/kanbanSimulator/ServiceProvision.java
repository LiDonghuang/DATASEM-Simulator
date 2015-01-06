package kanbanSimulator;

import java.util.ArrayList;
import java.util.LinkedList;

public class ServiceProvision {
	
	private LinkedList<TeamAgent> serviceProviders;
	private String serviceName;
	private String serviceType;
	
	public ServiceProvision(String sName, String sType) {
		this.serviceProviders=new LinkedList<TeamAgent>();
		this.serviceName=new String(sName);
		this.serviceType=new String(sType);
	}
	
	public void addServiceProvider(TeamAgent t) {
		this.serviceProviders.add(t);
	}
	
	public String getServiceType() {
		return this.serviceType;
	}
	
	public String getServiceName() {
		return this.serviceName;
	}
	
	public LinkedList<TeamAgent> getServiceProviders() {
		return this.serviceProviders;
	}
	

}
