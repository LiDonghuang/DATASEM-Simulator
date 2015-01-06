package kanbanSimulator;

public class ServiceDescription {
	private String serviceName;
	private String serviceType;
	
	
	public ServiceDescription (String sName, String SType) {
		this.serviceName=new String(sName);
		this.serviceType=new String(SType);		
	}
	
	public String getServiceName() {
		return this.serviceName;
	}
	

	public void setServiceName(String sName) {
		this.serviceName=sName;
	}
	
	public String getServiceType() {
		return this.serviceType;
	}
	

	public void setServiceTYpe(String sType) {
		this.serviceType=sType;
	}
	
}
