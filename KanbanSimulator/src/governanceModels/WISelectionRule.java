package governanceModels;

import kanbanSimulator.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;
import java.util.LinkedList;
import repast.simphony.random.RandomHelper;
import repast.simphony.util.SimUtilities;

public class WISelectionRule {
	
	private String name;	
	public KSSTask selectedWI;
	
	public WISelectionRule(String ruleName) {
		this.name = ruleName;
	}
	
	public LinkedList<KSSTask> applyRule(ServiceProviderAgent SP, LinkedList<KSSTask> queue) {
		//
		if (!queue.isEmpty()) {
			//
			System.out.println(SP.getName()+" Applied "+this.name+" Prioritization Rule");
			if (this.name.matches("Neutral")) {
				SimUtilities.shuffle(queue, RandomHelper.getUniform()); 
			}
			else if (this.name.matches("PerceivedValue")){			
				Collections.sort(queue, new LargerPerceivedValue());	
				for (int i=0;i<queue.size();i++) {
					KSSTask wItem = queue.get(i);
					System.out.println("No."+i+": "+wItem.getName()
							+"(PerceivedValue:"+wItem.getPerceivedValue()+")");
				}
			}		
			else if (this.name.matches("FIFO")) {
				Collections.sort(queue, new SmallerAssignedTime());
				for (int i=0;i<queue.size();i++) {
					KSSTask wItem = queue.get(i);
					System.out.println("No."+i+": "+wItem.getName()
							+"(AssignedTime:"+wItem.getAssignedTime()+")");
				}
			}
			else if (this.name.matches("LIFO")) {
				Collections.sort(queue, new LargerAssignedTime());
				for (int i=0;i<queue.size();i++) {
					KSSTask wItem = queue.get(i);
					System.out.println("No."+i+": "+wItem.getName()
							+"(AssignedTime:"+wItem.getAssignedTime()+")");
				}
			}
			else if (this.name.matches("BaseValue")){			
				Collections.sort(queue, new LargerBaseValue());	
				for (int i=0;i<queue.size();i++) {
					KSSTask wItem = queue.get(i);
					System.out.println("No."+i+": "+wItem.getName()
							+"(BaseValue:"+wItem.getBvalue()+")");
				}
			}
			else if (this.name.matches("EDD")) {
				Collections.sort(queue, new SmallerDueDate());
				for (int i=0;i<queue.size();i++) {
					KSSTask wItem = queue.get(i);
					System.out.println("No."+i+": "+wItem.getName()
							+"(DueDate:"+wItem.getDueDate()+")");
				}
			}
			else if (this.name.matches("SPT")) {
				Collections.sort(queue, new SmallerEstimatedEfforts());
				for (int i=0;i<queue.size();i++) {
					KSSTask wItem = queue.get(i);
					System.out.println("No."+i+": "+wItem.getName()
							+"(EstimatedEfforts:"+wItem.getEstimatedEfforts()+")");
				}
			}
			else {
				System.out.println("Invalid WI_Prioritization RuleName!") ;
			}
			//
			return queue;}
		//
		else {return queue;}
	}
	
//	public KSSTask applyRule2(ServiceProviderAgent SP, LinkedList<KSSTask> queue) {
//		// First-In-First-Out
//		if (this.name.matches("FIFO")){
//			this.selectedWI = queue.getFirst();
//			System.out.println(SP.getName()+" Applied FIFO");
//			}
//		// Last-In-First-Out
//		else if (this.name.matches("LIFO")){
//			this.selectedWI = queue.getLast();
//			System.out.println(SP.getName()+" Applied LIFO");
//			}
//		// Neutral Random Selection
//		else if (this.name.matches("Neutral")){
//			this.selectedWI = queue.get(RandomHelper.nextIntFromTo(0, queue.size()-1));
//			System.out.println(SP.getName()+" Applied Neutral");
//			}
//		// Largest "Base Value" First
//		else if (this.name.matches("ValueBased")){
//			ArrayList<KSSTask> candidates= new ArrayList<KSSTask>(queue);
//			SimUtilities.shuffle(candidates, RandomHelper.getUniform()); 
//			//Shuffle Candidates Sequence
//			KSSTask selected = candidates.remove(0);
//			while (candidates.size()>0) {
//				if (candidates.get(0).getBvalue() > selected.getBvalue()){
//					selected = candidates.get(0);
//				}
//				candidates.remove(0);
//			}
//			this.selectedWI = selected;
//			System.out.println(SP.getName()+" Applied ValueBased");
//			System.out.println("Base Value:" + selected.getBvalue());
//		}
//		// Earliest Due Date First
//		else if (this.name.matches("EDD")){
//			ArrayList<KSSTask> candidates= new ArrayList<KSSTask>(queue);
//			SimUtilities.shuffle(candidates, RandomHelper.getUniform()); 
//			//Shuffle Candidates Sequence
//			KSSTask selected = candidates.remove(0);
//			while (candidates.size()>0) {
//				if (candidates.get(0).getDueDate() < selected.getDueDate()){
//					selected = candidates.get(0);
//				}
//				candidates.remove(0);
//			}
//			this.selectedWI = selected;
//			System.out.println(SP.getName()+" Applied EDD");
//			System.out.println("Duedate:" + selected.getDueDate());
//			}
//		// 	Smallest Processing Time First
//		else if (this.name.matches("SPT")){
//			ArrayList<KSSTask> candidates= new ArrayList<KSSTask>(queue);
//			SimUtilities.shuffle(candidates, RandomHelper.getUniform()); 
//			//Shuffle Candidates Sequence
//			KSSTask selected = candidates.remove(0);
//			while (candidates.size()>0) {
//				if (candidates.get(0).getEstimatedEfforts() 
//						< selected.getEstimatedEfforts()){
//					selected = candidates.get(0);
//				}
//				candidates.remove(0);
//			}
//			this.selectedWI = selected;
//			System.out.println(SP.getName()+" Applied SPT");
//			System.out.println("Estimated Efforts:" + selected.getEstimatedEfforts());
//			}
//		return this.selectedWI;			
//	}	
	
	
	class LargerPerceivedValue implements Comparator<KSSTask> {
		@Override
		public int compare(KSSTask w1, KSSTask w2) {
			if (w1.getPerceivedValue()<w2.getPerceivedValue()) {
				return 1;
			}
			else if (w1.getPerceivedValue()==w2.getPerceivedValue()) {
				return 0;
			}
			else {
				return -1;
			}
		}
	}
	class LargerAssignedTime implements Comparator<KSSTask> {
		@Override
		public int compare(KSSTask w1, KSSTask w2) {
			if (w1.getAssignedTime()<w2.getAssignedTime()) {
				return 1;
			}
			else if (w1.getAssignedTime()==w2.getAssignedTime()) {
				return 0;
			}
			else {
				return -1;
			}
		}
	}
	class SmallerAssignedTime implements Comparator<KSSTask> {
		@Override
		public int compare(KSSTask w1, KSSTask w2) {
			if (w1.getAssignedTime()<w2.getAssignedTime()) {
				return -1;
			}
			else if (w1.getAssignedTime()==w2.getAssignedTime()) {
				return 0;
			}
			else {
				return 1;
			}
		}
	}
	class LargerBaseValue implements Comparator<KSSTask> {
		@Override
		public int compare(KSSTask w1, KSSTask w2) {
			if (w1.getBvalue()<w2.getBvalue()) {
				return 1;
			}
			else if (w1.getBvalue()==w2.getBvalue()) {
				return 0;
			}
			else {
				return -1;
			}
		}
	}
	class SmallerDueDate implements Comparator<KSSTask> {
		@Override
		public int compare(KSSTask w1, KSSTask w2) {
			if (w1.getDueDate()<w2.getDueDate()) {
				return -1;
			}
			else if (w1.getDueDate()==w2.getDueDate()) {
				return 0;
			}
			else {
				return 1;
			}
		}
	}
	class SmallerEstimatedEfforts implements Comparator<KSSTask> {
		@Override
		public int compare(KSSTask w1, KSSTask w2) {
			if (w1.getEstimatedEfforts()<w2.getEstimatedEfforts()) {
				return -1;
			}
			else if (w1.getEstimatedEfforts()==w2.getEstimatedEfforts()) {
				return 0;
			}
			else {
				return 1;
			}
		}
	}
	
}

