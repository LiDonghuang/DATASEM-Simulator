package governanceModels;

import kanbanSimulator.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import repast.simphony.random.RandomHelper;
import repast.simphony.util.SimUtilities;

public class WISelectionRule {
	
	private String name;	
	public KSSTask selectedWI;
	
	public WISelectionRule(String ruleName) {
		this.name = ruleName;
	}
	
	public KSSTask applyRule(ServiceProviderAgent SP, LinkedList<KSSTask> queue, double timeNow) {
		// First-In-First-Out
		if (this.name.matches("FIFO")){
			this.selectedWI = queue.getFirst();
			System.out.println(SP.getName()+" Applied FIFO");
			}
		// Last-In-First-Out
		else if (this.name.matches("LIFO")){
			this.selectedWI = queue.getLast();
			System.out.println(SP.getName()+" Applied LIFO");
			}
		// Neutral Random Selection
		else if (this.name.matches("Neutral")){
			this.selectedWI = queue.get(RandomHelper.nextIntFromTo(0, queue.size()-1));
			System.out.println(SP.getName()+" Applied Neutral");
			}
		// Largest "Base Value" First
		else if (this.name.matches("ValueBased")){
			ArrayList<KSSTask> candidates= new ArrayList<KSSTask>(queue);
			SimUtilities.shuffle(candidates, RandomHelper.getUniform()); 
			//Shuffle Candidates Sequence
			KSSTask selected = candidates.remove(0);
			while (candidates.size()>0) {
				if (candidates.get(0).getBvalue() > selected.getBvalue()){
					selected = candidates.get(0);
				}
				candidates.remove(0);
			}
			this.selectedWI = selected;
			System.out.println(SP.getName()+" Applied ValueBased");
			System.out.println("Base Value:" + selected.getBvalue());
		}
		// Earliest Due Date First
		else if (this.name.matches("EDD")){
			ArrayList<KSSTask> candidates= new ArrayList<KSSTask>(queue);
			SimUtilities.shuffle(candidates, RandomHelper.getUniform()); 
			//Shuffle Candidates Sequence
			KSSTask selected = candidates.remove(0);
			while (candidates.size()>0) {
				if (candidates.get(0).getDueDate() < selected.getDueDate()){
					selected = candidates.get(0);
				}
				candidates.remove(0);
			}
			this.selectedWI = selected;
			System.out.println(SP.getName()+" Applied EDD");
			System.out.println("Duedate:" + selected.getDueDate());
			}
		// 	Smallest Processing Time First
		else if (this.name.matches("SPT")){
			ArrayList<KSSTask> candidates= new ArrayList<KSSTask>(queue);
			SimUtilities.shuffle(candidates, RandomHelper.getUniform()); 
			//Shuffle Candidates Sequence
			KSSTask selected = candidates.remove(0);
			while (candidates.size()>0) {
				if (candidates.get(0).getEstimatedEfforts() 
						< selected.getEstimatedEfforts()){
					selected = candidates.get(0);
				}
				candidates.remove(0);
			}
			this.selectedWI = selected;
			System.out.println(SP.getName()+" Applied SPT");
			System.out.println("Estimated Efforts:" + selected.getEstimatedEfforts());
			}
		return this.selectedWI;			
	}	

	
}

