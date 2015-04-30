package governanceModels;

import kanbanSimulator.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import repast.simphony.random.RandomHelper;

public class wItemSelectionRule {
	
	private String name;	
	public KSSTask selectedWI;
	
	public wItemSelectionRule(String ruleName) {
		this.name = ruleName;
	}
	
	public KSSTask applyRule(LinkedList<KSSTask> queue) {
		if (this.name.matches("FIFO")){
			this.selectedWI = queue.getFirst();
			}
		else if (this.name.matches("LIFO")){
			this.selectedWI = queue.getLast();
			}
		else if (this.name.matches("Neutral")){
			this.selectedWI = queue.get(RandomHelper.nextIntFromTo(0, queue.size()-1));
			}
		else if (this.name.matches("ValueBased")){
			ArrayList<KSSTask> candidates= new ArrayList<KSSTask>(queue);
			KSSTask selected = candidates.remove(0);
			while (candidates.size()>0) {
				if (candidates.get(0).getBvalue() > selected.getBvalue()){
					selected = candidates.get(0);
				}
				candidates.remove(0);
			}
			this.selectedWI = selected;
		}
		return this.selectedWI;			
	}	
	
}

