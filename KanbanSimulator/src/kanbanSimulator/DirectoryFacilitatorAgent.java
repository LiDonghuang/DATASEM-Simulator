package kanbanSimulator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class DirectoryFacilitatorAgent {

	private LinkedList<DFAgentDescription> DFSubscribers;
	private LinkedList<ServiceProvision> DFServiceProvisions;
	
	
	public DirectoryFacilitatorAgent() {

		DFSubscribers = new  LinkedList<DFAgentDescription>();
		DFServiceProvisions = new LinkedList<ServiceProvision>();
		
	}
	
	public void register(DFAgentDescription adescription) {
		DFSubscribers.add(adescription);
		Iterator<ServiceDescription> sIterator = adescription.getServiceDescriptions().iterator();
		while (sIterator.hasNext()) {
			ServiceDescription sd= (ServiceDescription) sIterator.next();
			Iterator<ServiceProvision> spIterator=DFServiceProvisions.iterator();
			boolean serviceFound=false;
			while ((spIterator.hasNext()) && (serviceFound==false)) {
				ServiceProvision sp=(ServiceProvision) spIterator.next();
				if (sp.getServiceName().compareTo(sd.getServiceName())==0) {
					serviceFound=true;
					sp.addServiceProvider(adescription.getServiceProvider());
				}
			}
			if (serviceFound==false) {
				ServiceProvision newSP=new ServiceProvision(sd.getServiceName(),sd.getServiceType());
				newSP.addServiceProvider(adescription.getServiceProvider());
				DFServiceProvisions.add(newSP);
			}
			
		}
		
	}
	
	public LinkedList<DFAgentDescription> getSubscribers() {
		return this.DFSubscribers;
	}
	
	public LinkedList<ServiceProvision> getServiceProvisions() {
		return this.DFServiceProvisions;
	}
	
	
}
