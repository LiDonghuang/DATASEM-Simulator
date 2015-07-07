package governanceModels;

import java.util.LinkedList;

import kanbanSimulator.*;

public class GovernanceSearchStrategy {
	
	private int id;
	private String name;
	private WIAcceptanceRule wItemAcceptance;
	private WISelectionRule wItemSelection;
	private WIAssignmentRule wItemAssignment;
	private ResourceAllocationRule resourceAllocation;
	private ResourceOutsourcingRule resourceOutsourcing;
		
	public GovernanceSearchStrategy(int sStID, String sStName) {
		this.id = sStID;
		this.name = sStName;
//		this.wItemAcceptance = new WIAcceptanceRule();
//		this.wItemSelection = new WISelectionRule();
//		this.wItemAssignment = new WIAssignmentRule();
	}
	
	public void setWItemAcceptanceRule(String ruleName){
		this.wItemAcceptance = new WIAcceptanceRule(ruleName);
		System.out.println("Set WItemAcceptanceRule: "+ruleName);
	}
	public WIAcceptanceRule getWItemAcceptanceRule(){
		return this.wItemAcceptance;
	}
	
	
	public void setWItemSelectionRule(String ruleName){
		this.wItemSelection = new WISelectionRule(ruleName);
		System.out.println("Set WItemSelectionRule: "+ruleName);
	}
	public WISelectionRule getWItemSelectionRule(){
		return this.wItemSelection;
	}
	public KSSTask selectWI (ServiceProviderAgent SP, LinkedList<KSSTask> queue) {
		return this.wItemSelection.applyRule2(SP, queue);
	}
	public LinkedList<KSSTask> workPrioritization(ServiceProviderAgent SP, LinkedList<KSSTask> queue) {
		return this.wItemSelection.applyRule(SP, queue);
	}
	
	
	public void setWItemAssignmentRule(String ruleName){
		this.wItemAssignment = new WIAssignmentRule(ruleName);
		System.out.println("Set WItemAssignmentRule: "+ruleName);
	}
	public WIAssignmentRule getWItemAssignment(){
		return this.wItemAssignment;
	}
	
	public void setResourceAllocationRule(String ruleName){
		this.resourceAllocation = new ResourceAllocationRule(ruleName);
		System.out.println("Set ResourceAllocationRule: "+ruleName);
	}
	public ResourceAllocationRule getResourceAllocation(){
		return this.resourceAllocation;
	}
	
	public void setResourceOutsourcingRule(String ruleName){
		this.resourceOutsourcing = new ResourceOutsourcingRule(ruleName);
		System.out.println("Set ResourceOutsourcingRule: "+ruleName);
	}
	public ResourceOutsourcingRule getResourceOutsourcing(){
		return this.resourceOutsourcing;
	}
}
