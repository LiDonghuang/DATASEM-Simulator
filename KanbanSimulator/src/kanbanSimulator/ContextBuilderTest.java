//package kanbanSimulator;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.LinkedList;
//
//import repast.simphony.context.Context;
//import repast.simphony.random.RandomHelper;
//import repast.simphony.space.graph.Network;
//import repast.simphony.space.grid.Grid;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;
//
//import ausim.xtext.kanban.domainmodel.kanbanmodel.Capability;
//import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel;
//import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelFactory;
//import ausim.xtext.kanban.domainmodel.kanbanmodel.Dependency;
//import ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement;
//import ausim.xtext.kanban.domainmodel.kanbanmodel.Service;
//import ausim.xtext.kanban.domainmodel.kanbanmodel.Task;
//import ausim.xtext.kanban.domainmodel.kanbanmodel.TaskPattern;
//
//
//public class ContextBuilderTest {
//	
//	private String Id;
//	
//	public ContextBuilderTest(String id) {
//		this.Id=new String(id);
//	}
//	
//	public void XMLParseTest() {
//		try
//		{
//			File fXmlFile = new File("/Users/Donbghuang Li/desktop/KSS-Scenario.xml");
//			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//			Document doc = dBuilder.parse(fXmlFile);
//			
//			doc.getDocumentElement().normalize();
//			 
//			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
//			System.out.println("----------------------------");
//			
//			
//			NodeList TaskPatterns = doc.getElementsByTagName("TaskPatterns");
//			System.out.println("\nSystem Task Patterns :");
//		    for (int temp = 0; temp < TaskPatterns.getLength(); temp++) {
//		    	Node nNode = TaskPatterns.item(temp);
//		    	Element eElement = (Element) nNode;
//		    	System.out.println(" TaskPattern: " + eElement.getElementsByTagName("name").item(0).getTextContent());
//		    	System.out.println("  description: " + eElement.getElementsByTagName("Description").item(0).getTextContent());
//		    }			
//			System.out.println("----------------------------");
//			
//			NodeList sysServiceList = doc.getElementsByTagName("Service");
//			System.out.println("\nSystem Service Types :");
//		    for (int temp = 0; temp < sysServiceList.getLength(); temp++) {
//		    	Node nNode = sysServiceList.item(temp);
//		    	Element eElement = (Element) nNode;
//		    	System.out.println(" Service: " + eElement.getElementsByTagName("name").item(0).getTextContent());
//		    	System.out.println(" description: " + eElement.getElementsByTagName("Description").item(0).getTextContent());
//		    }
//			
//			NodeList teamList = doc.getElementsByTagName("Team");
//			System.out.println("\nSystem Team Agents :");
//			for (int temp = 0; temp < teamList.getLength(); temp++) {				 
//				Node nNode = teamList.item(temp);		 						 
//				if (nNode.getNodeType() == Node.ELEMENT_NODE) {		
//					Element eElement = (Element) nNode;
//					System.out.println("\nTeam Agent : " + eElement.getElementsByTagName("name").item(0).getTextContent());
//					System.out.println(" description : " + eElement.getElementsByTagName("Description").item(0).getTextContent());
//					NodeList serviceList = eElement.getElementsByTagName("service");
//					for (int temp1 = 0; temp1 < serviceList.getLength(); temp1++) {
//						System.out.println(" service : " + eElement.getElementsByTagName("service").item(temp1).getTextContent());
//					}
//				}
//			}
//			
//			
//			NodeList WFlowDataModel = doc.getElementsByTagName("WorkflowDataModel");
//			 
//			System.out.println("----------------------------");
//			
//			for (int temp = 0; temp < WFlowDataModel.getLength(); temp++) {
//				 
//				Node nNode = WFlowDataModel.item(temp);
//				System.out.println("\nCurrent Element : " + nNode.getNodeName());
//				
//				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//					
//					Element eElement = (Element) nNode;
//					NodeList wItemList = eElement.getElementsByTagName("workItem");
//					for (int temp1 = 0; temp1 < wItemList.getLength(); temp1++) {
//						Node n1Node = wItemList.item(temp1);					
//						Element e1Element = (Element) n1Node;
//						System.out.println("\nWork Item : " + e1Element.getElementsByTagName("name").item(0).getTextContent());
//						System.out.println(" description : " + e1Element.getElementsByTagName("Description").item(0).getTextContent());
//						System.out.println(" pattern : " + e1Element.getElementsByTagName("Pattern").item(0).getTextContent());
//						System.out.println(" type : " + e1Element.getElementsByTagName("Type").item(0).getTextContent());
//						System.out.println(" Subtasks : ");
//						NodeList subTaskList=e1Element.getElementsByTagName("subtask");
//						for (int temp2 = 0; temp2 < subTaskList.getLength(); temp2++) {
//								System.out.println(" " + e1Element.getElementsByTagName("subtask").item(temp2).getTextContent());						
//						}
//						System.out.println(" services required : " + e1Element.getElementsByTagName("servicesRequired").item(0).getTextContent());
//						System.out.println(" base efforts : " + e1Element.getElementsByTagName("baseEfforts").item(0).getTextContent());
//						System.out.println(" base value : " + e1Element.getElementsByTagName("baseValue").item(0).getTextContent());
//						System.out.println(" class of service : " + e1Element.getElementsByTagName("classOfService").item(0).getTextContent());
//					}
//				}
//			}
//			
//			System.out.println("----------------------------");
//			
//			
//			NodeList KanbanWFlow = doc.getElementsByTagName("KanbanWorkFlow");
//			 
//			System.out.println("----------------------------");
//			
//			for (int temp = 0; temp < KanbanWFlow.getLength(); temp++) {
//				 
//				Node nNode = KanbanWFlow.item(temp);
//				System.out.println("\nCurrent Element : " + nNode.getNodeName());
//				
//				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//					Element eElement = (Element) nNode;
//					NodeList capList = eElement.getElementsByTagName("capabilities");
//					Node n1Node = capList.item(0);					
//					Element e1Element = (Element) n1Node;
//					NodeList capabilityList=e1Element.getElementsByTagName("capability");
//					for (int temp1 = 0; temp1 < capabilityList.getLength(); temp1++) {
//						System.out.println(" Capability  : ");	
//						Node n2Node = capabilityList.item(temp1);					
//						Element e2Element = (Element) n2Node;
//						System.out.println(" Name : " + e2Element.getElementsByTagName("name").item(0).getTextContent());
//						System.out.println(" Requirements  : ");
//						NodeList requirementList=e2Element.getElementsByTagName("requirement");
//						for (int temp2 = 0; temp2 < requirementList.getLength(); temp2++) {
//								System.out.println(" Requirement  : " );	
//								Node n3Node = requirementList.item(temp2);					
//								Element e3Element = (Element) n3Node;
//								System.out.println(" Name : " + e3Element.getElementsByTagName("name").item(0).getTextContent());
//								System.out.println(" Tasks  : ");
//								Node n4Node=e3Element.getElementsByTagName("tasks").item(0);
//								Element e4Element = (Element) n4Node;
//								NodeList taskList=e4Element.getElementsByTagName("task");
//								for (int temp3 = 0; temp3 < taskList.getLength(); temp3++) {
//									System.out.println(" Task  : ");	
//									Node n5Node = taskList.item(temp3);					
//									Element e5Element = (Element) n5Node;
//									System.out.println(" Name : " + e5Element.getElementsByTagName("name").item(0).getTextContent());								
//								}
//								Node n6Node=e3Element.getElementsByTagName("process").item(0);
//								Element e6Element = (Element) n6Node;
//								System.out.println(" Process  : " );
//								NodeList mechanismList=e6Element.getElementsByTagName("mechanism");
//								for (int temp4 = 0; temp4 < mechanismList.getLength(); temp4++) {
//									System.out.println(" Mechanism  : ");
//									Node n7Node = mechanismList.item(temp4);
//									Element e7Element = (Element) n7Node;
//									System.out.println(" Source Task : " + e7Element.getElementsByTagName("sourceTask").item(0).getTextContent());	
//									System.out.println(" Target Task : " + e7Element.getElementsByTagName("targetTask").item(0).getTextContent());							
//								}	
//						}
//					}
//				}
//			}
//					
//	 	} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public void DirectoryRegistrationTest(Context<Object> context) {
//		DirectoryFacilitatorAgent dfa=new DirectoryFacilitatorAgent();
//		
//		for(int i=0;i<3;i++) {
//			Service myService = KanbanmodelFactory.eINSTANCE.createService();
//			myService.setName("Engineering");		
//			TeamAgent newTeam = new TeamAgent("AUSIM-"+i, dfa);
//			newTeam.addService(myService);
//			ServiceDescription sdescription=new ServiceDescription(myService.getName(), "Software Engineering");
//			DFAgentDescription adescription=new DFAgentDescription(newTeam);
//			adescription.addServiceDescription(sdescription);	
//			dfa.register(adescription);
//		}
//		
//		for(int i=0;i<3;i++) {
//			Service myService = KanbanmodelFactory.eINSTANCE.createService();
//			myService.setName("Requirements Engineering");		
//			TeamAgent newTeam = new TeamAgent("AUSIM-"+i,dfa);
//			newTeam.addService(myService);
//			ServiceDescription sdescription=new ServiceDescription(myService.getName(), "Software Engineering");
//			DFAgentDescription adescription=new DFAgentDescription(newTeam);
//			adescription.addServiceDescription(sdescription);	
//			dfa.register(adescription);
//		}
//		
//		LinkedList<ServiceProvision> spList=dfa.getServiceProvisions();
//		Iterator<ServiceProvision> spI = spList.iterator();
//		while (spI.hasNext()) {
//			ServiceProvision tempSP=(ServiceProvision) spI.next();
//			System.out.print("Service name: "); System.out.println(tempSP.getServiceName());
//			System.out.print("Service type: "); System.out.println(tempSP.getServiceType());
//			System.out.print("Service provided by: ");
//			LinkedList<TeamAgent> sProviders=tempSP.getServiceProviders();
//			Iterator<TeamAgent> teamIterator=sProviders.iterator();
//			while (teamIterator.hasNext()) {
//				System.out.println(teamIterator.next().getId());
//			}
//		}
//	}	
//		
//	public void WorkFlowGenerationTest(Context<Object> context) {
//		Grid<Object> grid = (Grid)context.getProjection("Grid");
//		KanbanTaskModel kwf = KanbanmodelFactory.eINSTANCE.createKanbanTaskModel();
//		Capability myCapability = KanbanmodelFactory.eINSTANCE.createCapability();
//		Requirement myRequirement=KanbanmodelFactory.eINSTANCE.createRequirement();
//		TaskFlow myTaskFlow=new TaskFlow();
//		int taskIdentifier=0;
//		int taskCount=0;
//		for (int i=0; i<10; i++) {
//			Task sTask = KanbanmodelFactory.eINSTANCE.createTask(); 
//			sTask.setName("Task");
//			KSSTask mySourceTask=new KSSTask(taskIdentifier,sTask);
//			context.add(mySourceTask);
//			grid.moveTo(mySourceTask,25-taskCount,40); 
//			taskCount++;
//			myTaskFlow.getSubtasks().add(mySourceTask);
//			myTaskFlow.initAdjacencyList(mySourceTask);
//			myRequirement.getRTasks().add(mySourceTask);
//			taskIdentifier++;
//			Task tTask = KanbanmodelFactory.eINSTANCE.createTask();
//			tTask.setName("Task");
//			KSSTask myTargetTask=new KSSTask(taskIdentifier, tTask);
//			context.add(myTargetTask);
//			grid.moveTo(myTargetTask, 25-taskCount,40);
//			taskCount++;
//			myRequirement.getRTasks().add(myTargetTask);
//			myTaskFlow.getSubtasks().add(myTargetTask);
//			myTaskFlow.initAdjacencyList(myTargetTask);
//			taskIdentifier++;
//			Dependency myMechanism = KanbanmodelFactory.eINSTANCE.createDependency(); 
//			myMechanism.setSourceTask(mySourceTask);
//			myMechanism.setTargetTask(myTargetTask);
//			myTaskFlow.setAdjacencyList(mySourceTask, myTargetTask);
//			myRequirement.getDependencies().add(myMechanism);		
//		}
//		myCapability.getReqs().add(myRequirement);
//		kwf.getCaps().add(myCapability);
//		
//		
////		WorkFLowCoordination(myTaskFlow, context);
//	
//	}
//	
//	
//	public void RandomContextGeneration(Context<Object> context) {
//		Grid<Object> grid = (Grid)context.getProjection("Grid");
//		Network<Object> net = (Network<Object>)context.getProjection("organization network");
//		
//		ArrayList<KSSTask> myCapabilities=new ArrayList<KSSTask>(5);
//		int capabilityIdentifier=0;
//		for(int k=0;k<5;k++) {
//			Task capTask = KanbanmodelFactory.eINSTANCE.createTask(); 
//			capTask.setName("Capability");
//			KSSTask myCap=new KSSTask(capabilityIdentifier,capTask);
//			context.add(myCap);
//			grid.moveTo(myCap,1,40-(4*k)); 
//			myCapabilities.add(myCap);
//			capabilityIdentifier++;	
//		}
//		
//		
//		ArrayList<TaskFlow> taskFlowSet = new ArrayList<TaskFlow>(20);
//		int taskIdentifier=0;
//		int numOfReqs=0;
//		for(int i=0;i<20;i++) {
//			TaskFlow myTaskFlow=new TaskFlow();
//			KSSTask myTask=null;
//			numOfReqs=RandomHelper.nextIntFromTo(5, 20);
//			for(int j=0;j<numOfReqs;j++) {
//				Task sTask = KanbanmodelFactory.eINSTANCE.createTask(); 
//				sTask.setName("Requirements Task");
//				myTask=new KSSTask(taskIdentifier,sTask);
//				taskIdentifier++;
//				context.add(myTask);
//				grid.moveTo(myTask,25-j,40-i); 
//				myTaskFlow.getSubtasks().add(myTask);
//				myTaskFlow.initAdjacencyList(myTask);
//			}
//			taskFlowSet.add(myTaskFlow);
//			net.addEdge(myCapabilities.get(RandomHelper.nextIntFromTo(0, 4)),myTask);
//		}
//		
//		DirectoryFacilitatorAgent dfa=new DirectoryFacilitatorAgent();
//		ArrayList<TeamAgent> SEGroups = new ArrayList<TeamAgent>(3);
//		for(int j=0;j<3;j++) {
//			TeamAgent sysEng = new TeamAgent("AUSIM-coordinator",dfa);
//			sysEng.setCoordinator(true);
//			/*Task myTask = KanbanmodelFactory.eINSTANCE.createTask();
//			myTask.setName("RequirementTask");
//			KSSTask newTask=new KSSTask(99,myTask,taskFlowSet.get(0));
//			newTask.TaskTraversal();
//			sysEng.requestService(newTask);*/
//			SEGroups.add(sysEng);
//			context.add(sysEng);
//			grid.moveTo(sysEng,40,40-(5*(j+1)));
//		}
//		
//		
//		
//		int teamCount=0;
//		int myGroup=0;
//		for(int i=0;i<20;i++) {
//			Service myService = KanbanmodelFactory.eINSTANCE.createService();
//			myService.setName("Engineering");		
//			TeamAgent newTeam = new TeamAgent("AUSIM-"+i,dfa);
//			newTeam.addService(myService);
//			ServiceDescription sdescription=new ServiceDescription(myService.getName(), "Software Engineering");
//			DFAgentDescription adescription=new DFAgentDescription(newTeam);
//			adescription.addServiceDescription(sdescription);	
//			dfa.register(adescription);
//			newTeam.setDirectoryFacilitator(dfa);
//			context.add(newTeam);
//			myGroup=RandomHelper.nextIntFromTo(0, 2);
//			grid.moveTo(newTeam,50, 40-teamCount);
//			net.addEdge(SEGroups.get(myGroup),newTeam);
//			teamCount++;
//		}
//		
//		/*Task myTask = KanbanmodelFactory.eINSTANCE.createTask();
//		myTask.setName("RequirementTask");
//		KSSTask newTask=new KSSTask(99,myTask,taskFlowSet.get(0));
//		newTask.TaskTraversal();
//		SEGroups.get(0).requestService(newTask);*/
//		
//		int mySEGroup=0;
//		for(int i=0; i<20; i++) {
//			Task myTask = KanbanmodelFactory.eINSTANCE.createTask();
//			myTask.setName("RequirementTask");
//			KSSTask newTask=new KSSTask(99,myTask,taskFlowSet.get(i));
//			mySEGroup=RandomHelper.nextIntFromTo(0, 2);
//			SEGroups.get(mySEGroup).requestService(newTask);
//			net.addEdge(taskFlowSet.get(i).getSubtasks().get(0),SEGroups.get(mySEGroup));
//		}
//		
//
//	}
//		
//
//
//}
