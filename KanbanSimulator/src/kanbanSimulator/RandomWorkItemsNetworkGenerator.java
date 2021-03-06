package kanbanSimulator;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import org.antlr.runtime.misc.Stats;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.util.FastMath;

import datasem.xtext.kanban.domainmodel.kanbanmodel.*;
import datasem.xtext.kanban.domainmodel.kanbanmodel.impl.*;
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
		System.out.println("Profiles: ");
		
		int lenWIN = oldWIN.size();
		int lenProfile = profileList.size();
		
		int [] profileCount = new int[lenProfile];
		for (int w=0;w<oldWIN.size();w++) {
			KSSTask myWorkItem = oldWIN.get(w);
			String myProfile = myWorkItem.getProfileName();
			if (profileList.contains(myProfile)) {
				int i = profileList.indexOf(myProfile);
				profileCount[i] += 1;
			}			
		}
		for (int i=0;i<profileCount.length;i++) {
			System.out.println(profileList.get(i)+" x "+profileCount[i]);
		}
		
		
		
		double [][] profileDecMatrix = new double[lenWIN][lenProfile];	
		double [][] profileDecMatrixMean = new double[lenProfile][lenProfile];
		double [][] profileDecMatrixStd = new double[lenProfile][lenProfile];
		
		double [][] profileRefMatrix = new double[lenWIN][lenProfile];		
		double [][] profileRefMatrixMean = new double[lenProfile][lenProfile];
		double [][] profileRefMatrixStd = new double[lenProfile][lenProfile];
		
		for (int w=0;w<oldWIN.size();w++) {
			KSSTask myWorkItem = oldWIN.get(w);
			String profileName1 = myWorkItem.getProfileName();
			System.out.println("\nName: "+myWorkItem.getName());
			System.out.println("Profile: "+profileName1);
			System.out.println("Decompositions:");
			for (int d=0;d<myWorkItem.getSubTasks().size();d++) {
				KSSTask subTask = myWorkItem.getSubTasks().get(d);
				String profileName = subTask.getProfileName();
				System.out.println(subTask.getName()+":"+profileName);
				int p = profileList.indexOf(profileName);
				profileDecMatrix[w][p] += 1;
			}
			System.out.println("References:");
			for (int r=0;r<myWorkItem.getUpperTasks().size();r++) {
				KSSTask upperTask = myWorkItem.getUpperTasks().get(r);
				String profileName = upperTask.getProfileName();
				System.out.println(upperTask.getName()+":"+profileName);
				int p = profileList.indexOf(profileName);
				if (myWorkItem.getUpperTasks().size()>1) {
					profileRefMatrix[w][p] += 1;
				}
			}
		}	
		
		System.out.println("\nProfile Decomposition Matrix:");
		for (int w=0;w<lenWIN;w++) {
			System.out.println("-From "+oldWIN.get(w).getName());
			for (int p=0;p<lenProfile;p++) {
				System.out.println("to "+profileList.get(p)+": "+profileDecMatrix[w][p]);
			}
		}
		System.out.println("\nProfile Reference Matrix:");
		for (int w=0;w<lenWIN;w++) {
			System.out.println("-From "+oldWIN.get(w).getName());
			for (int p=0;p<lenProfile;p++) {
				System.out.println("to "+profileList.get(p)+": "+profileRefMatrix[w][p]);
			}
		}
		
		System.out.println("\nCalculating Distribution Parameters...\n");		
		System.out.println("\nDecomposition Parameters:");	
		for (int p1=0;p1<lenProfile;p1++) {		
			for (int p2=0;p2<lenProfile;p2++) {					
				ArrayList<Double> numList = new ArrayList<Double>(0);
				for (int w=0;w<lenWIN;w++) {
					String profileName = oldWIN.get(w).getProfileName();
					if (profileList.get(p1).matches(profileName)) {
						numList.add(profileDecMatrix[w][p2]);
					}
				}
				double[] numValues = new double[numList.size()];
				for (int i=0;i<numList.size();i++){
					numValues[i] = numList.get(i);
				}
				double mean = StatUtils.mean(numValues);
				double std = FastMath.sqrt(StatUtils.variance(numValues));
				profileDecMatrixMean[p1][p2] = mean;
				profileDecMatrixStd[p1][p2] = std;
				if ((mean!=0)|(std!=0)) {
					System.out.println("-From "+profileList.get(p1)+" to "+profileList.get(p2));
					System.out.println("Mean:"+profileDecMatrixMean[p1][p2]+" | Stdev:"+profileDecMatrixStd[p1][p2]);
				}
			}
		}
		System.out.println("\nReference Parameters:");
		for (int p1=0;p1<lenProfile;p1++) {
			for (int p2=0;p2<lenProfile;p2++) {	
				ArrayList<Double> numList = new ArrayList<Double>(0);
				for (int w=0;w<lenWIN;w++) {
					String profileName = oldWIN.get(w).getProfileName();
					if (profileList.get(p1).matches(profileName)) {
						numList.add(profileRefMatrix[w][p2]);
					}
				}
//				System.out.println(numList);
				double[] numValues = new double[numList.size()];
				for (int i=0;i<numList.size();i++){
					numValues[i] = numList.get(i);
				}
				double mean = StatUtils.mean(numValues);
				double std = FastMath.sqrt(StatUtils.variance(numValues));
				profileRefMatrixMean[p1][p2] = mean;
				profileRefMatrixStd[p1][p2] = std;
				if (numList.size()>0 && ((mean!=0)|(std!=0))) {
					System.out.println("-From "+profileList.get(p1)+" to "+profileList.get(p2));
					System.out.println("Mean:"+profileRefMatrixMean[p1][p2]+" | Stdev:"+profileRefMatrixStd[p1][p2]);
				}
			}
		}
		

		// ----------------------- Generate New WIN ---------------------------------
		ArrayList<KSSTask> newWIN = new ArrayList<KSSTask>(0);
		int [] numProfileToCreate = {2,1};
		int [] numProfileCreated = new int[lenProfile];
		int [][] numDecCreated = new int[lenProfile][lenProfile];
		int [][] numRefCreated = new int[lenProfile][lenProfile];
		KSSTask cp1 = oldWIN.get(0);
		KSSTask cp2 = oldWIN.get(2);
		KSSTask rp1 = oldWIN.get(3);
		KSSTask rp2 = oldWIN.get(9);
		KSSTask tp1 = oldWIN.get(12);
		KSSTask tp2 = oldWIN.get(13);
		KSSTask tp3 = oldWIN.get(14);
		KSSTask a1 = oldWIN.get(39);
		KSSTask [] profiles = {cp1,cp2,rp1,rp2,tp1,tp2,tp3,a1};
		
		
		int totalWICount = 0;
		int totalWICount_0 = 0;
		int taskID = 0;	
		
//		boolean [] haveReferenced = new boolean [totalWICount_0]; 
		
		System.out.println("\nCreating Initial WorkItems...");
		for (int p1=0;p1<numProfileToCreate.length;p1++) {
			String profileName = profileList.get(p1);
			KSSTask profileWI = profiles[p1];
			System.out.println("\nCreate "+numProfileToCreate[p1]+" ProfileType: "+profileName);
			for (int c=0;c<numProfileToCreate[p1];c++) {		
				String newName = profileName+"."+ (numProfileCreated[p1]+1)%100;
				KSSTask newKSSTask = this.createKSSTask(profileWI, newName, taskID);	
				newWIN.add(newKSSTask);
				numProfileCreated[p1] ++;
				taskID++;
			}
		}
			
		boolean loopCondition = true;
		int loopCount = 0;
		while (loopCondition) {	
			totalWICount_0 = newWIN.size();	
			System.out.println("WIN Size (old): "+totalWICount_0);
			// Create Decompositions
			System.out.println("\nCreating Decompositions...");
			for (int w=0;w<newWIN.size();w++) {
				KSSTask mainTask = newWIN.get(w);
				String mainTaskProfileName = mainTask.getProfileName();
				System.out.println("\n"+mainTask.getName()+"/"+mainTaskProfileName);			
				int p1 = profileList.indexOf(mainTaskProfileName);
				// Create Subtasks
				for (int p2=0;p2<profileList.size();p2++) {
					double decMean = profileDecMatrixMean[p1][p2];
					double decStd = profileDecMatrixStd[p1][p2];	
					String decProfileName = profileList.get(p2);	
					int currentDecNum = countDecompositionsOfProfileName(mainTask, decProfileName);
					int numToCreate = Math.max(0,RandomHelper.createNormal((decMean-currentDecNum), decStd).nextInt());
					KSSTask profileSubTask = profiles[p2];					
					if (numToCreate>0) {
						System.out.println("Create "+numToCreate+" SubTasks of ProfileType: "+decProfileName);
					}
					for (int n=0;n<numToCreate;n++) {
						String newName = decProfileName+"."+ (numProfileCreated[p2]+1)%100;
						KSSTask newSubTask = createKSSTask(profileSubTask,newName,taskID);
						mainTask.addSubTask(newSubTask);
						numDecCreated[p1][p2]+=1;
						numRefCreated[p2][p1]+=1;
						newWIN.add(newSubTask);
						numProfileCreated[p2] ++;
						taskID++;
						// Create References
						for (int p3=0;p3<lenProfile;p3++) {
							String refProfileName = profileList.get(p3);
							double refMean = profileRefMatrixMean[p2][p3];
							double refStd = profileRefMatrixStd[p2][p3];
							int numToReference = Math.max(0,RandomHelper.createNormal(refMean, refStd).nextInt());
							if (p1==p3) {
								numToReference -= 1;
							}
							if (numToReference>0) {
								System.out.println(" Create References...");
								System.out.println(newSubTask.getName()+ " is referencing to "+numToReference
										+" other WIs of ProfileType: "+refProfileName+"...");
							}
							double decMean2 = profileDecMatrixMean[p3][p2];
							double decStd2 = profileDecMatrixStd[p3][p2];
							for (int ref=0;ref<numToReference;ref++) {
								LinkedList<KSSTask> candidates = new LinkedList<KSSTask>();
								for (int w1=0;w1<newWIN.size();w1++) {
									KSSTask createdWI = newWIN.get(w1);
//									double dec_judge = RandomHelper.createNormal(decMean2, decStd2).nextDouble();
									double dec_judge = decMean2+2*decStd2;
									if ((createdWI.getProfileName().matches(refProfileName))
										&&(createdWI!=mainTask)
										&&(countDecompositionsOfProfileName(createdWI, decProfileName)<dec_judge)
										)
									{
										candidates.add(createdWI);
									}
								}
								if (candidates.size()>0) {
									KSSTask upperTask = candidates.get(RandomHelper.nextIntFromTo(0, candidates.size()-1));
									upperTask.addSubTask(newSubTask);					
									System.out.println(newSubTask.getName()+" referenced to "+upperTask.getName());
									numRefCreated[p2][p3]+=1;
								}
							}							
						}
					}
				}
			}
			for (int w=0;w<newWIN.size();w++) {
				KSSTask myKSSTask = newWIN.get(w);
				// Causality (test purpose)
				if (myKSSTask.isAggregationNode()) {
					KSSTask activity1 = createKSSTask(a1,"A."+myKSSTask.getName(),taskID);
					newWIN.add(activity1);
					LinkedList<KSSTask> activities = new LinkedList<KSSTask>();
					activities.add(activity1);
					myKSSTask.addKSSTriggers(new KSSTrigger(activities,0.00,1.00));	
					activity1.addKSSTriggers(new KSSTrigger(myKSSTask.getSubTasks(),1.00,1.00));	
					taskID++;
				}
//				myKSSTask.addKSSTriggers(new KSSTrigger(myKSSTask.getSubTasks(),0.0,1.0));	
			}
			totalWICount = newWIN.size();
			int numNewAdded = totalWICount - totalWICount_0;
			loopCount++;
			System.out.println("WIN Size (new): "+totalWICount);
			System.out.println("Added "+numNewAdded+" WIs");
			System.out.println("--------------- Looped "+loopCount+" times -----------------");
//			if ((numNewAdded==0)|(loopCount>9)) {
				loopCondition = false;
//			}
		}
		
		System.out.println("\nnumDecCreated:");
		for (int p1=0;p1<lenProfile;p1++) {
			for (int p2=0;p2<lenProfile;p2++) {
				if (numDecCreated[p1][p2]>0) {
					System.out.println(profileList.get(p1)+" to "+profileList.get(p2)+": "+numDecCreated[p1][p2]);
				}
			}			
		}
		System.out.println("\nnumRefCreated:");
		for (int p1=0;p1<lenProfile;p1++) {
			for (int p2=0;p2<lenProfile;p2++) {
				if (numRefCreated[p1][p2]>0) {
					System.out.println(profileList.get(p1)+" to "+profileList.get(p2)+": "+numRefCreated[p1][p2]);
				}
			}			
		}
		
//		newWIN = oldWIN;
		return newWIN;
	}
	
	
	
	public KSSTask createKSSTask(KSSTask profileWI, String name, int id) {
		WorkItem newWI = KanbanmodelFactory.eINSTANCE.createWorkItem();
		KSSTask newKSSTask = new KSSTask(id, newWI);				
		newKSSTask.setID(id);
		newKSSTask.setName(name);
		newKSSTask.setProfileName(profileWI.getProfileName());
		newKSSTask.setPattern(profileWI.getPattern());
		newKSSTask.setPatternType(profileWI.getPatternType());
		newKSSTask.getReqSpecialties().addAll(profileWI.getReqSpecialties());
		newKSSTask.setBefforts(profileWI.getBefforts());
		newKSSTask.setBvalue(profileWI.getBvalue());
		newKSSTask.setDemanded(profileWI.isDemanded());
		newKSSTask.setDemandSource(profileWI.getDemandSource());
		newKSSTask.setAggregationNode(profileWI.isAggregationNode());		
		newKSSTask.setCauser(profileWI.isCauser());
		newKSSTask.setSuccessor(profileWI.isSuccessor());
		newKSSTask.setArrivalTime(profileWI.getArrivalTime());			
		newKSSTask.setDueDate(profileWI.getDueDate());
		newKSSTask.SoS = profileWI.SoS;
		System.out.println("created "+newKSSTask.getName());
		return newKSSTask;
	}
//	public void createSubTasks (KSSTask mainTask, KSSTask profileSubTask, int numToCreate, int startID) {		
//		for (int n=0;n<numToCreate;n++) {
//			startID++;
//			KSSTask newSubTask = createKSSTask(profileSubTask,(profileSubTask.getProfileName()+"_"+startID),startID);
//			mainTask.addSubTask(newSubTask);
//		}
//		mainTask.addKSSTriggers(new KSSTrigger(mainTask.getSubTasks(),0.0,1.0));
//	}
	public int countDecompositionsOfProfileName(KSSTask mainTask, String decProfileName) {
		int currentDecNum = 0;
		for (int st=0;st<mainTask.getSubTasks().size();st++) {
			KSSTask mySubTask = mainTask.getSubTasks().get(st);
			if (mySubTask.getProfileName().matches(decProfileName)) {
				currentDecNum += 1;
			}
		}
		System.out.println(mainTask.getName()+" has "+currentDecNum+" of "+decProfileName);
		return currentDecNum;
	}
	public int countReferencesOfProfileName(KSSTask mainTask, String refProfileName) {
		int currentRefNum = 0;
		for (int ut=0;ut<mainTask.getUpperTasks().size();ut++) {
			KSSTask myUpperTask = mainTask.getUpperTasks().get(ut);
			if (myUpperTask.getProfileName().matches(refProfileName)) {
				currentRefNum += 1;
			}
		}
		return currentRefNum;
	}
}
