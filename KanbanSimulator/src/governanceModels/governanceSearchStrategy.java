package governanceModels;

import java.util.LinkedList;

import kanbanSimulator.*;

public class governanceSearchStrategy {
	
	private int id;
	private String name;
	private wItemAcceptanceRule wItemAcceptance;
	private wItemSelectionRule wItemSelection;
	private wItemAssignmentRule wItemAssignment;
	
//	private resourceAssignmentRule resourceAssignment;
//	private resourceOutsourcingRule resourceOutsourcing;
		
	public governanceSearchStrategy(int sStID, String sStName) {
		this.id = sStID;
		this.name = sStName;
//		this.wItemAcceptance = new wItemAcceptanceRule();
//		this.wItemSelection = new wItemSelectionRule();
//		this.wItemAssignment = new wItemAssignmentRule();
	}
	
	public void setWItemAcceptanceRule(String ruleName){
		this.wItemAcceptance = new wItemAcceptanceRule(ruleName);
	}
	public wItemAcceptanceRule getWItemAcceptanceRule(){
		return this.wItemAcceptance;
	}
	
	
	public void setWItemSelectionRule(String ruleName){
		this.wItemSelection = new wItemSelectionRule(ruleName);
	}
	public wItemSelectionRule getWItemSelectionRule(){
		return this.wItemSelection;
	}
	public KSSTask selectWI (LinkedList<KSSTask> queue, double timeNow) {
		return this.wItemSelection.applyRule(queue, timeNow);
	}
	
	
	public void setWItemAssignmentRule(String ruleName){
		this.wItemAssignment = new wItemAssignmentRule(ruleName);
	}
	public wItemAssignmentRule getWItemAssignment(){
		return this.wItemAssignment;
	}
	
}
