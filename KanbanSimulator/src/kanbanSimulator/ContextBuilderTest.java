package kanbanSimulator;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import repast.simphony.context.Context;
import repast.simphony.random.RandomHelper;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ausim.xtext.kanban.domainmodel.kanbanmodel.Capability;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanWorkFlow;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelFactory;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Service;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Task;

public class ContextBuilderTest {
	
	private String Id;
	
	public ContextBuilderTest(String id) {
		this.Id=new String(id);
	}
	
	public void XMLParseTest() {
		try
		{
			File fXmlFile = new File("/Users/yilmaz/Desktop/AUSIM/runtime-EclipseXtext/KanbanDSL/src-gen/KSS-Scenario.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			
			doc.getDocumentElement().normalize();
			 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		 
			NodeList teamList = doc.getElementsByTagName("Team");
		 
			System.out.println("----------------------------");
			
			for (int temp = 0; temp < teamList.getLength(); temp++) {
				 
				Node nNode = teamList.item(temp);
		 
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
		 
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		 
					Element eElement = (Element) nNode;
					System.out.println("Team Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
					NodeList serviceList = eElement.getElementsByTagName("service");
					for (int temp1 = 0; temp1 < serviceList.getLength(); temp1++) {
						System.out.println(" Service : " + eElement.getElementsByTagName("service").item(temp1).getTextContent());
					}
				}
			}
			
			
			NodeList WFlowDataModel = doc.getElementsByTagName("WorkflowDataModel");
			 
			System.out.println("----------------------------");
			
			for (int temp = 0; temp < WFlowDataModel.getLength(); temp++) {
				 
				Node nNode = WFlowDataModel.item(temp);
				System.out.println("\nCurrent Element : " + nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					
					Element eElement = (Element) nNode;
					NodeList wItemList = eElement.getElementsByTagName("workItem");
					for (int temp1 = 0; temp1 < wItemList.getLength(); temp1++) {
						System.out.println(" Work Item  : ");	
						Node n1Node = wItemList.item(temp1);					
						Element e1Element = (Element) n1Node;
						System.out.println(" Name : " + e1Element.getElementsByTagName("name").item(0).getTextContent());
						System.out.println(" Subtasks  : ");
						NodeList subTaskList=e1Element.getElementsByTagName("subtask");
						for (int temp2 = 0; temp2 < subTaskList.getLength(); temp2++) {
								System.out.println(" Subtask  : " + e1Element.getElementsByTagName("subtask").item(temp2).getTextContent());						
						}
					}
				}
			}
			
			
			NodeList KanbanWFlow = doc.getElementsByTagName("KanbanWorkFlow");
			 
			System.out.println("----------------------------");
			
			for (int temp = 0; temp < KanbanWFlow.getLength(); temp++) {
				 
				Node nNode = KanbanWFlow.item(temp);
				System.out.println("\nCurrent Element : " + nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					NodeList capList = eElement.getElementsByTagName("capabilities");
					Node n1Node = capList.item(0);					
					Element e1Element = (Element) n1Node;
					NodeList capabilityList=e1Element.getElementsByTagName("capability");
					for (int temp1 = 0; temp1 < capabilityList.getLength(); temp1++) {
						System.out.println(" Capability  : ");	
						Node n2Node = capabilityList.item(temp1);					
						Element e2Element = (Element) n2Node;
						System.out.println(" Name : " + e2Element.getElementsByTagName("name").item(0).getTextContent());
						System.out.println(" Requirements  : ");
						NodeList requirementList=e2Element.getElementsByTagName("requirement");
						for (int temp2 = 0; temp2 < requirementList.getLength(); temp2++) {
								System.out.println(" Requirement  : " );	
								Node n3Node = requirementList.item(temp2);					
								Element e3Element = (Element) n3Node;
								System.out.println(" Name : " + e3Element.getElementsByTagName("name").item(0).getTextContent());
								System.out.println(" Tasks  : ");
								Node n4Node=e3Element.getElementsByTagName("tasks").item(0);
								Element e4Element = (Element) n4Node;
								NodeList taskList=e4Element.getElementsByTagName("task");
								for (int temp3 = 0; temp3 < taskList.getLength(); temp3++) {
									System.out.println(" Task  : ");	
									Node n5Node = taskList.item(temp3);					
									Element e5Element = (Element) n5Node;
									System.out.println(" Name : " + e5Element.getElementsByTagName("name").item(0).getTextContent());								
								}
								Node n6Node=e3Element.getElementsByTagName("process").item(0);
								Element e6Element = (Element) n6Node;
								System.out.println(" Process  : " );
								NodeList mechanismList=e6Element.getElementsByTagName("mechanism");
								for (int temp4 = 0; temp4 < mechanismList.getLength(); temp4++) {
									System.out.println(" Mechanism  : ");
									Node n7Node = mechanismList.item(temp4);
									Element e7Element = (Element) n7Node;
									System.out.println(" Source Task : " + e7Element.getElementsByTagName("sourceTask").item(0).getTextContent());	
									System.out.println(" Target Task : " + e7Element.getElementsByTagName("targetTask").item(0).getTextContent());							
								}	
						}
					}
				}
			}
					
	 	} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void DirectoryRegistrationTest(Context<Object> context) {
		DirectoryFacilitatorAgent dfa=new DirectoryFacilitatorAgent();
		
		for(int i=0;i<3;i++) {
			Service myService = KanbanmodelFactory.eINSTANCE.createService();
			myService.setName("Engineering");		
			TeamAgent newTeam = new TeamAgent("AUSIM-"+i, dfa);
			newTeam.addService(myService);
			ServiceDescription sdescription=new ServiceDescription(myService.getName(), "Software Engineering");
			DFAgentDescription adescription=new DFAgentDescription(newTeam);
			adescription.addServiceDescription(sdescription);	
			dfa.register(adescription);
		}
		
		for(int i=0;i<3;i++) {
			Service myService = KanbanmodelFactory.eINSTANCE.createService();
			myService.setName("Requirements Engineering");		
			TeamAgent newTeam = new TeamAgent("AUSIM-"+i,dfa);
			newTeam.addService(myService);
			ServiceDescription sdescription=new ServiceDescription(myService.getName(), "Software Engineering");
			DFAgentDescription adescription=new DFAgentDescription(newTeam);
			adescription.addServiceDescription(sdescription);	
			dfa.register(adescription);
		}
		
		LinkedList<ServiceProvision> spList=dfa.getServiceProvisions();
		Iterator<ServiceProvision> spI = spList.iterator();
		while (spI.hasNext()) {
			ServiceProvision tempSP=(ServiceProvision) spI.next();
			System.out.print("Service name: "); System.out.println(tempSP.getServiceName());
			System.out.print("Service type: "); System.out.println(tempSP.getServiceType());
			System.out.print("Service provided by: ");
			LinkedList<TeamAgent> sProviders=tempSP.getServiceProviders();
			Iterator<TeamAgent> teamIterator=sProviders.iterator();
			while (teamIterator.hasNext()) {
				System.out.println(teamIterator.next().getId());
			}
		}
	}	
		
	public void WorkFlowGenerationTest(Context<Object> context) {
		
		KanbanWorkFlow kwf = KanbanmodelFactory.eINSTANCE.createKanbanWorkFlow();
		Capability myCapability = KanbanmodelFactory.eINSTANCE.createCapability();
		Requirement myRequirement=KanbanmodelFactory.eINSTANCE.createRequirement();
		TaskFlow myTaskFlow=new TaskFlow();
		int taskIdentifier=0;
		for (int i=0; i<15; i++) {
			Task sTask = KanbanmodelFactory.eINSTANCE.createTask(); 
			sTask.setName("Task");
			KSSTask mySourceTask=new KSSTask(taskIdentifier,sTask);
			context.add(mySourceTask);
			myTaskFlow.getSubtasks().add(mySourceTask);
			myTaskFlow.initAdjacencyList(mySourceTask);
			myRequirement.getRTasks().add(mySourceTask);
			taskIdentifier++;
			Task tTask = KanbanmodelFactory.eINSTANCE.createTask();
			tTask.setName("Task");
			KSSTask myTargetTask=new KSSTask(taskIdentifier, tTask);
			context.add(myTargetTask);
			myRequirement.getRTasks().add(myTargetTask);
			myTaskFlow.getSubtasks().add(myTargetTask);
			myTaskFlow.initAdjacencyList(myTargetTask);
			taskIdentifier++;
			Mechanism myMechanism = KanbanmodelFactory.eINSTANCE.createMechanism(); 
			myMechanism.setSourceTask(mySourceTask);
			myMechanism.setTargetTask(myTargetTask);
			myTaskFlow.setAdjacencyList(mySourceTask, myTargetTask);
			myRequirement.getMechanisms().add(myMechanism);		
		}
		myCapability.getReqs().add(myRequirement);
		kwf.getCaps().add(myCapability);
		
		
		WorkFLowCoordination(myTaskFlow, context);
	
	}
	
	public void WorkFLowCoordination(TaskFlow req, Context<Object> context) {
		DirectoryFacilitatorAgent dfa=new DirectoryFacilitatorAgent();
		for(int i=0;i<10;i++) {
			Service myService = KanbanmodelFactory.eINSTANCE.createService();
			myService.setName("Engineering");		
			TeamAgent newTeam = new TeamAgent("AUSIM-"+i,dfa);
			newTeam.addService(myService);
			ServiceDescription sdescription=new ServiceDescription(myService.getName(), "Software Engineering");
			DFAgentDescription adescription=new DFAgentDescription(newTeam);
			adescription.addServiceDescription(sdescription);	
			dfa.register(adescription);
			newTeam.setDirectoryFacilitator(dfa);
			context.add(newTeam);
		}
		
		
		TeamAgent sysEng = new TeamAgent("AUSIM-coordinator",dfa);
		sysEng.setCoordinator(true);
		Task myTask = KanbanmodelFactory.eINSTANCE.createTask();
		myTask.setName("RequirementTask");
		KSSTask newTask=new KSSTask(99,myTask,req);
		newTask.TaskTraversal();
		sysEng.requestService(newTask);
		context.add(sysEng);

	}
	


}
