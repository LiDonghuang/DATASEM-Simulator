package kanbanSimulator;

import java.util.ArrayList;
import java.util.LinkedList;

import repast.simphony.context.Context;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.parameter.Parameters;
import repast.simphony.random.RandomHelper;
import repast.simphony.space.graph.Network;
import repast.simphony.space.grid.Grid;


public class RandomWorkItemsNetworkGenerator {
	
	public ArrayList<KSSTask> generateWIN(ArrayList<KSSTask> oldWIN) {
		
		ArrayList<String> profileList = new ArrayList<String>(0);		
		for (int w=0;w<oldWIN.size();w++) {
			KSSTask myWorkItem = oldWIN.get(w);
			String myProfile = myWorkItem.getProfileName();
			if (!profileList.contains(myProfile)) {
				profileList.add(myProfile);
			}			
		}	
		System.out.println("Profiles: "+profileList);
		
		int l = profileList.size();
		int [] profileCount = new int[l];
		for (int w=0;w<oldWIN.size();w++) {
			KSSTask myWorkItem = oldWIN.get(w);
			String myProfile = myWorkItem.getProfileName();
			if (profileList.contains(myProfile)) {
				int i = profileList.indexOf(myProfile);
				profileCount[i] += 1;
			}			
		}
		for (int i=0;i<profileCount.length;i++) {
			System.out.println(profileCount[i]);
		}
		
		double [][] profileMatrix = new double[l][l];
		
		for (int w=0;w<oldWIN.size();w++) {
			KSSTask myWorkItem = oldWIN.get(w);
			String profileName1 = myWorkItem.getProfileName();
			System.out.println("\nName: "+myWorkItem.getName());
			System.out.println("Profile: "+profileName1);
			int i1 = profileList.indexOf(profileName1);
			System.out.println("Decompositions:");
			for (int d=0;d<myWorkItem.getSubTasks().size();d++) {
				KSSTask subTask = myWorkItem.getSubTasks().get(d);
				String profileName2 = subTask.getProfileName();
				System.out.println(subTask.getName()+":"+profileName2);
				int i2 = profileList.indexOf(profileName2);
				profileMatrix [i1][i2] += 1;
			}
			System.out.println("References:");
			for (int d=0;d<myWorkItem.getUpperTasks().size();d++) {
				KSSTask upperTask = myWorkItem.getUpperTasks().get(d);
				String profileName3 = upperTask.getProfileName();
				System.out.println(upperTask.getName()+":"+profileName3);
				int i3 = profileList.indexOf(profileName3);
			}
		}		
		
		for (int k1=0;k1<l;k1++) {
			for (int k2=0;k2<l;k2++) {
				System.out.println(profileMatrix[k1][k2]);
			}
		}
		
		ArrayList<KSSTask> newWIN = new ArrayList<KSSTask>(0);
		newWIN = oldWIN;
		return newWIN;
	}

}
