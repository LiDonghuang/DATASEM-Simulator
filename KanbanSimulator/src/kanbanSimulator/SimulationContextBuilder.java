package kanbanSimulator;

import governanceModels.valueFunction;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import repast.simphony.context.Context;
import repast.simphony.random.RandomHelper;
import repast.simphony.space.graph.Network;
import repast.simphony.space.grid.Grid;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ausim.xtext.kanban.domainmodel.kanbanmodel.*;
import ausim.xtext.kanban.domainmodel.kanbanmodel.impl.*;




public class SimulationContextBuilder {

	private String Id;
	//--------- Governance Specifications ----------
	private ArrayList<Strategy> myStrategies;
	private ArrayList<ValueFunction> myValueFunctions;
	private ArrayList<TaskPattern> myTaskPatterns;
	//--------- Organizational Specifications ----------
	private ArrayList<ServiceType> myServiceTypes;
	//--------- WorkItemNetwork Specifications -----------
	private ArrayList<DemandSource> myDemandSources;
	//--------- SP Agents -----------
	private ArrayList<ServiceProviderAgent> mySPAgents;
	//--------- WI Agents -----------
	private ArrayList<ArrayList<KSSTask>> myWINetworks;
	
	// ?? ----------- Full Controller ----------------
	private God myGod;
	// ?? --------------------------------------------
	
	// ------------- Experiment Settings -------------
	public int replications;
	public int interArrivalTime;
	
	
	// --------------------------- SIMULATION CONTEXT BUILDER -----------------------------------
	public SimulationContextBuilder(String id) {
		this.Id = new String(id);
		this.myGod = new God();
	}

	public void XMLtoEObjects() {

		try {File fXmlFile = new File("/Users/Donbghuang Li/desktop/KSS-Scenario.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			dbFactory.setIgnoringElementContentWhitespace(true);

			Document doc = dBuilder.parse(fXmlFile);

			doc.getDocumentElement().normalize();
			
			replications = Integer.parseInt(doc.getElementsByTagName("Replications").item(0).getTextContent());
			interArrivalTime = Integer.parseInt(doc.getElementsByTagName("InterArrivalTime").item(0).getTextContent());
			
			NodeList strategyList = doc.getElementsByTagName("Strategy");	
			NodeList valueFunctionList = doc.getElementsByTagName("ValueFunction");	
			NodeList taskPatternList = doc.getElementsByTagName("TaskPattern");			
			NodeList serviceTypeList = doc.getElementsByTagName("ServiceType");
			NodeList serviceProviderList = doc.getElementsByTagName("ServiceProvider");
			NodeList workSourceList = doc.getElementsByTagName("workSource");
//			NodeList workItemNetworkList = doc.getElementsByTagName("WorkItemNetworkModel");
			NodeList wItemList = doc.getElementsByTagName("workItem");
			
			// ----------------------- Strategy Profiles ------------------------------
			this.myStrategies = new ArrayList<Strategy>(0);
			for (int stg = 0; stg < strategyList.getLength(); stg++) {
				Node strategyNode = strategyList.item(stg);
				Element sTg = (Element) strategyNode;
				// ------------------------- Task Pattern ----------------------------------
				// Read XML
				String sTg_name = sTg.getElementsByTagName("name").item(0).getTextContent();
				String sTg_description = sTg.getElementsByTagName("Description").item(0).getTextContent();
				// Create Strategy
				Strategy myStrategy = KanbanmodelFactory.eINSTANCE.createStrategy();
				myStrategy.setName(sTg_name);
				myStrategy.setDescription(sTg_description);
				// Add Rules
				WIAcceptance strategyAcceptanceRule = KanbanmodelFactory.eINSTANCE.createWIAcceptance();
				String sTg_acceptance = sTg.getElementsByTagName("acceptanceRule").item(0).getTextContent();
				strategyAcceptanceRule.setName(sTg_acceptance);
				myStrategy.setWIAcceptanceRule(strategyAcceptanceRule);
//				System.out.println(strategyAcceptanceRule);
				WISelection strategySelectionRule = KanbanmodelFactory.eINSTANCE.createWISelection();
				String sTg_selection = sTg.getElementsByTagName("selectionRule").item(0).getTextContent();
				strategySelectionRule.setName(sTg_selection);
				myStrategy.setWISelectionRule(strategySelectionRule);
//				System.out.println(strategySelectionRule);
				WIAssignment strategyAssignmentRule = KanbanmodelFactory.eINSTANCE.createWIAssignment();
				String sTg_assignment = sTg.getElementsByTagName("assignmentRule").item(0).getTextContent();
				strategyAssignmentRule.setName(sTg_assignment);
				myStrategy.setWIAssignmentRule(strategyAssignmentRule);
//				System.out.println(strategyAssignmentRule);
				ResourceAllocation strategyAllocationRule = KanbanmodelFactory.eINSTANCE.createResourceAllocation();
				String sTg_allocation = sTg.getElementsByTagName("allocationRule").item(0).getTextContent();
				strategyAllocationRule.setName(sTg_allocation);
				myStrategy.setResourceAllocationRule(strategyAllocationRule);
//				System.out.println(strategyAllocationRule);
				ResourceOutsourcing strategyOutsourcingRule = KanbanmodelFactory.eINSTANCE.createResourceOutsourcing();
				String sTg_outsourcing = sTg.getElementsByTagName("outsourcingRule").item(0).getTextContent();
				strategyOutsourcingRule.setName(sTg_outsourcing);
				myStrategy.setResourceOutsourcingRule(strategyOutsourcingRule);
//				System.out.println(strategyOutsourcingRule);
				//
				this.myStrategies.add(myStrategy);
			}
			System.out.println("\nSoS Strategies :");
			System.out.println(this.myStrategies);
			
			
			// ----------------------- Value Function Profiles ------------------------------
			
			
			
			// ----------------------- Task Pattern Profiles ------------------------------
			this.myTaskPatterns = new ArrayList<TaskPattern>(0);
			for (int tp = 0; tp < taskPatternList.getLength(); tp++) {
				Node taskpatternNode = taskPatternList.item(tp);
				Element tP = (Element) taskpatternNode;
				// ------------------------- Task Pattern ----------------------------------
				// Read XML
				String tP_name = tP.getElementsByTagName("name").item(0).getTextContent();
				String tP_description = tP.getElementsByTagName("Description").item(0).getTextContent();
				// Create TP
				TaskPattern myTaskPattern = KanbanmodelFactory.eINSTANCE.createTaskPattern();
				myTaskPattern.setName(tP_name);
				myTaskPattern.setDescription(tP_description);
				// Task Types
				NodeList tasktypeList = tP.getElementsByTagName("Type");				
				for (int tt = 0; tt < tasktypeList.getLength(); tt++) {
					Node tasktypeNode = tasktypeList.item(tt);
					Element tT = (Element) tasktypeNode;
					// Read XML
					String tT_name = tT.getElementsByTagName("name").item(0).getTextContent();
					String tT_description = tT.getElementsByTagName("Description").item(0).getTextContent();
					// Create TT
					TaskType myTaskType = KanbanmodelFactory.eINSTANCE.createTaskType();
					myTaskType.setName(tT_name);
					myTaskType.setDescription(tT_description);
					myTaskPattern.getTaskpatternTypes().add(myTaskType);
				}
				this.myTaskPatterns.add(myTaskPattern);
			}
			System.out.println("\nSoS Task Patterns :");
			System.out.println(this.myTaskPatterns);
			

			
			// --------------------------- ServiceType List --------------------------------
			this.myServiceTypes = new ArrayList<ServiceType>(0);
			for (int sv = 0; sv < serviceTypeList.getLength(); sv++) {
				Node serviceNode = serviceTypeList.item(sv);
				Element sV = (Element) serviceNode;
				// Read XML
				String sV_name = sV.getElementsByTagName("name").item(0).getTextContent();
				String sV_description = sV.getElementsByTagName("Description").item(0).getTextContent();
				//-------------------------------------------------------------------------------------------
				// Create TT
				ServiceType myService = KanbanmodelFactory.eINSTANCE.createServiceType();
				myService.setName(sV_name);
				myService.setDescription(sV_description);
				this.myServiceTypes.add(myService);
			}
			System.out.println("\nSoS Services :");
			System.out.println(this.myServiceTypes);
			
//			 --------------------------- ServiceProvider Agents --------------------------------
			DirectoryFacilitatorAgent dfa=new DirectoryFacilitatorAgent();			
			this.mySPAgents = new ArrayList<ServiceProviderAgent>(0);
			int sProviderID = 0;
			for (int tm = 0; tm < serviceProviderList.getLength(); tm++) {
				// Create Service Provider
				ServiceProvider myServiceProvider = KanbanmodelFactory.eINSTANCE.createServiceProvider();
				// Read XML
				Node serviceProviderNode = serviceProviderList.item(tm);
				Element tM = (Element) serviceProviderNode;				
				String tM_name = tM.getElementsByTagName("name").item(0).getTextContent();
				String tM_description = tM.getElementsByTagName("Description").item(0).getTextContent();
				// Specify Service Provider
				myServiceProvider.setName(tM_name);
				myServiceProvider.setDescription(tM_description);
				// Set ServiceProvider Service
				NodeList tM_ServiceList = tM.getElementsByTagName("service");
				for (int tm_sv = 0; tm_sv < tM_ServiceList.getLength(); tm_sv++) {
					// Create Service
					Service myService = KanbanmodelFactory.eINSTANCE.createService();	
					// Read XML
					Node tM_ServiceNode = tM_ServiceList.item(tm_sv);
					Element tM_sV = (Element) tM_ServiceNode;
					String tM_sV_name = tM_sV.getElementsByTagName("name").item(0).getTextContent();
					String tM_sV_Description = tM_sV.getElementsByTagName("Description").item(0).getTextContent();
					String tM_sV_Type = tM_sV.getElementsByTagName("Type").item(0).getTextContent();
					int tM_sV_efficiency = Integer.parseInt(tM_sV.getElementsByTagName("Efficiency").item(0).getTextContent());				
					// Specify Service
					myService.setName(tM_sV_name);
					myService.setDescription(tM_sV_Description);
					for (int st = 0; st < serviceTypeList.getLength(); st++) {
						String stname = this.myServiceTypes.get(st).getName();
						if (tM_sV_Type.matches(stname)) {
							myService.setServiceType(this.myServiceTypes.get(st));
							break;
						}
					}
					myService.setEfficiency(tM_sV_efficiency);
					// Add Service to ServiceProvider
					myServiceProvider.getServices().add(myService);
				}
				// Set ServiceProvider Governance Strategies
				Node tM_govStrategyNode = tM.getElementsByTagName("governanceSearchStrategy").item(0);
				Element tM_govS = (Element) tM_govStrategyNode;							
				// 1. Default (Global) Strategy
				String tM_dsTg = tM_govS.getElementsByTagName("default").item(0).getTextContent();	
				for (int dstg=0; dstg<myStrategies.size(); dstg++) {
					if (tM_dsTg.matches(myStrategies.get(dstg).getName())) {
						Strategy dStrategy = myStrategies.get(dstg);						
						myServiceProvider.setDefaultStrategy(dStrategy);
						break;
					}					
				}				
				// 2. Specified (Local) Strategy
				// Acceptance Rule
				String tM_acceptance_name = tM.getElementsByTagName("acceptanceRule").item(0).getTextContent();
				if (!tM_acceptance_name.matches("null")){
					WIAcceptance tM_acceptance = KanbanmodelFactory.eINSTANCE.createWIAcceptance();				
					tM_acceptance.setName(tM_acceptance_name);
					myServiceProvider.setAcceptanceRule(tM_acceptance);}
//				else {myServiceProvider.setAcceptanceRule(myServiceProvider.getDefaultStrategy().getWIAcceptanceRule());}
				// Selection Rule
				String tM_selection_name= tM.getElementsByTagName("selectionRule").item(0).getTextContent();
				if (!tM_selection_name.matches("null")){
					WISelection tM_selection = KanbanmodelFactory.eINSTANCE.createWISelection();				
					tM_selection.setName(tM_selection_name);
					myServiceProvider.setSelectionRule(tM_selection);}
//				else {myServiceProvider.setSelectionRule(myServiceProvider.getDefaultStrategy().getWISelectionRule());}
				// Assignment Rule
				String tM_assignment_name = tM.getElementsByTagName("assignmentRule").item(0).getTextContent();
				if (!tM_assignment_name.matches("null")){	
					WIAssignment tM_assignment = KanbanmodelFactory.eINSTANCE.createWIAssignment();				
					tM_assignment.setName(tM_assignment_name);
					myServiceProvider.setAssignmentRule(tM_assignment);}	
//				else {myServiceProvider.setAssignmentRule(myServiceProvider.getDefaultStrategy().getWIAssignmentRule());}
				//-------------------------------------------------------------------------------------------
				// Create ServiceProviderAgent Package for this ServiceProvider
				ServiceProviderAgent mySPAgent = new ServiceProviderAgent(sProviderID, myServiceProvider, dfa);				
				this.mySPAgents.add(mySPAgent);			
				sProviderID ++;
//				System.out.println(myServiceProvider.getName());
//				System.out.println(myServiceProvider.getDefaultStrategy().getWIAcceptanceRule());
//				System.out.println(myServiceProvider.getDefaultStrategy().getWISelectionRule());
//				System.out.println(myServiceProvider.getDefaultStrategy().getWIAssignmentRule());
//				System.out.println(myServiceProvider.getAcceptanceRule());
//				System.out.println(myServiceProvider.getSelectionRule());
//				System.out.println(myServiceProvider.getAssignmentRule());
			}
			System.out.println("\nSoS ServiceProvider Agents :");
			System.out.println(this.mySPAgents);
			
//			 --------------------------- Demand Sources --------------------------------			
			myDemandSources = new ArrayList<DemandSource>(0);
			int dSourceID = 0;
			for (int ws = 0; ws < workSourceList.getLength(); ws++) {
				// Create Work Source
				WorkSource myWorkSource = KanbanmodelFactory.eINSTANCE.createWorkSource();
				// Read XML
				Node wSourceNode = workSourceList.item(ws);
				Element wSource = (Element) wSourceNode;	
				String ws_name = wSource.getElementsByTagName("name").item(0).getTextContent();
				String ws_description = wSource.getElementsByTagName("Description").item(0).getTextContent();
				// Specify
				myWorkSource.setName(ws_name);
				myWorkSource.setDescription(ws_description);
				// Package
				DemandSource myDemandSource = new DemandSource(dSourceID ++, myWorkSource);
				
				myDemandSource.getTargetUnits().addAll(this.mySPAgents);							
				this.myDemandSources.add(myDemandSource);
				dSourceID ++;
			}
			System.out.println("\nSoS Demand Sources :");
			System.out.println(this.myDemandSources);
					
			
			// ------------------------- WORK FLOW DATA MODELS -------------------------------------
			this.myWINetworks = new ArrayList<ArrayList<KSSTask>>(0);
			int wItemID = 0;
//			for (int wfd = 0; wfd < workItemNetworkList.getLength(); wfd++) {
//			int interArrivalTime = 60;
//			int replications = 10;
			for (int rep = 0; rep < replications; rep++) {
				System.out.println("\nGenerating WIN Replication: No."+rep+1);
//				Node WFlownode = workItemNetworkList.item(wfd);		
				// ------------------------- WORK ITEMS FLOW -----------------------------------
//				if (WFlownode.getNodeType() == Node.ELEMENT_NODE) {													
//					Element WFlow = (Element) WFlownode;	
//					NodeList wItemList = WFlow.getElementsByTagName("workItem");			
					ArrayList<KSSTask> myWINetwork = new ArrayList<KSSTask>(0);																		
					// --------------------------  WORK ITEM ----------------------------------
					for (int wi = 0; wi < wItemList.getLength(); wi++) {
						// Create Work Item	
						WorkItem WI = KanbanmodelFactory.eINSTANCE.createWorkItem();
						// Read XML
						Node wItemNode = wItemList.item(wi);
						Element wItem = (Element) wItemNode;					    
						String wi_name = wItem.getElementsByTagName("name").item(0).getTextContent();
						String wi_description = wItem.getElementsByTagName("Description").item(0).getTextContent();
						String wi_pattern = wItem.getElementsByTagName("Pattern").item(0).getTextContent();
						String wi_type = wItem.getElementsByTagName("Type").item(0).getTextContent();
						String wi_servicesReq = wItem.getElementsByTagName("servicesRequired").item(0).getTextContent();
						int wi_befforts = Integer.parseInt(wItem.getElementsByTagName("baseEfforts").item(0).getTextContent());
						int wi_bvalue = Integer.parseInt(wItem.getElementsByTagName("baseValue").item(0).getTextContent());
						String wi_cos = wItem.getElementsByTagName("classOfService").item(0).getTextContent();
						String wi_wSource = wItem.getElementsByTagName("WorkSource").item(0).getTextContent();
						int wi_arrTime = Integer.parseInt(wItem.getElementsByTagName("arrivalTime").item(0).getTextContent());
						int wi_dueDate = Integer.parseInt(wItem.getElementsByTagName("dueDate").item(0).getTextContent());
                        // Specify Work Item						
						WI.setName(wi_name);
						WI.setDescription(wi_description);
						WI.setBefforts(wi_befforts);
						WI.setBvalue(wi_bvalue);
						WI.setCOS(wi_cos);			
						// ********* Experiment Parameter ***********
						if ( (rep>0) && (wi_arrTime>0) ) {			
							int time_shift = rep*interArrivalTime + RandomHelper.nextIntFromTo(-interArrivalTime, 0);
							wi_arrTime += time_shift;					
							if (wi_dueDate>0) {							
								wi_dueDate += time_shift;			
								}
						}
						// ******************************************
						WI.setArrtime(wi_arrTime);
						WI.setDuedate(wi_dueDate);
						// Set WI Pattern and Type
						for (int tp = 0; tp < this.myTaskPatterns.size(); tp++) {
							String tpname = this.myTaskPatterns.get(tp).getName();
							if (wi_pattern.matches(tpname)) {
								TaskPattern WI_Pattern = this.myTaskPatterns.get(tp);
								WI.setPattern(WI_Pattern);								
								for (int tt = 0; tt < WI_Pattern.getTaskpatternTypes().size(); tt++) {
									String ttname = WI_Pattern.getTaskpatternTypes().get(tt).getName();
									if (wi_type.matches(ttname)) {
										TaskType WI_type = WI_Pattern.getTaskpatternTypes().get(tt);
										WI.setPatternType(WI_type);
										break;}
								}	
								break;}
						}	
						// Set WI Required Service
						for (int reqsv = 0; reqsv < this.myServiceTypes.size(); reqsv++) {
							String reqsv_name = this.myServiceTypes.get(reqsv).getName();							
							if (wi_servicesReq.matches(reqsv_name)) {
								ServiceType WI_reqsv = this.myServiceTypes.get(reqsv);
								WI.getReqSpecialties().add(WI_reqsv);
								break;}
						}												
						// Set WorkSource
						for (int wiws = 0; wiws < this.myDemandSources.size(); wiws++) {
							String wiws_name = this.myDemandSources.get(wiws).getName();							
							if (wi_wSource.matches(wiws_name)) {
								WorkSource WI_wSource = this.myDemandSources.get(wiws);
								WI.setWItemSource(WI_wSource);
								break;}
						}
						//-------------------------------------------------------------------------------------------
						// Create KSSTask Package for this WI
						KSSTask myWItem=new KSSTask(wItemID, WI);
						
						myWINetwork.add(myWItem);								
						wItemID++;	
						

					// ------------------------ END WORK ITEM --------------------------------
					} 									
					// -------------------- WORK ITEM DEPENDENCIES ---------------------------
					for (int wi = 0; wi < wItemList.getLength(); wi++) {
						Node wItemNode = wItemList.item(wi);
						Element wItem = (Element) wItemNode;
						KSSTask mainTask = myWINetwork.get(wi);
						// WI SubTasks
						NodeList subTaskList = wItem.getElementsByTagName("subtask");
						if (subTaskList.getLength() > 0) {
							mainTask.setAggregationNode(true);	//Set AggregationNode attribute	
						}
						for (int st = 0; st < subTaskList.getLength(); st++) {
							Node subTaskNode = subTaskList.item(st);
							Element sT = (Element) subTaskNode;														
							String wItem_subTask = sT.getTextContent();					
							for (int t1 = 0; t1 < myWINetwork.size(); t1++) {
								KSSTask subTask = myWINetwork.get(t1);
								if ( wItem_subTask.matches(subTask.getName()) ) {
									mainTask.addKSSsTasks(subTask);
								}
							}
						}
						// WI Predecessors
						NodeList predecessorList = wItem.getElementsByTagName("predecessor");
						if (predecessorList.getLength() > 0) {
							mainTask.setSuccessor(true);	//Set Successor attribute	
						}
						for (int pd = 0; pd < predecessorList.getLength(); pd++) {
							Node predecessorNode = predecessorList.item(pd);
							Element pD = (Element) predecessorNode;														
							String wItem_predecessor = pD.getTextContent();					
							for (int t2 = 0; t2 < myWINetwork.size(); t2++) {
								KSSTask predecessor = myWINetwork.get(t2);
								if ( wItem_predecessor.matches(predecessor.getName()) ) {
									mainTask.addKSSpredecessors(predecessor);
								}
							}
						}
						// WI Causalities
						NodeList causalityList = wItem.getElementsByTagName("causality");
						if (causalityList.getLength() > 0) {
							mainTask.setCauser(true);	//Set Causer attribute	
						}
						for (int cs = 0; cs < causalityList.getLength(); cs++) {
							Node causalityNode = causalityList.item(cs);
							Element cS = (Element) causalityNode;																
							Causality wIcausality = KanbanmodelFactory.eINSTANCE.createCausality();
							NodeList triggeredList = cS.getElementsByTagName("triggered");
							// At Progress
							int wIcausality_progress = Integer.parseInt(cS.getElementsByTagName("atProgress").item(0).getTextContent());
							wIcausality.setTProgress(wIcausality_progress);
							// With Probability
							int wIcausality_probability = Integer.parseInt(cS.getElementsByTagName("onProbability").item(0).getTextContent());
							wIcausality.setTProbability(wIcausality_probability);
							
							// KSSTrigger Package
							KSSTrigger myTrigger= new KSSTrigger(wIcausality);
							
							// Triggered Tasks
							for (int tt = 0; tt < triggeredList.getLength(); tt++) {
								Node triggeredNode = triggeredList.item(tt);
								Element tT = (Element) triggeredNode;														
								String wItem_triggered = tT.getTextContent();	
								for (int t3 = 0; t3 < myWINetwork.size(); t3++) {
									KSSTask triggeredTask = myWINetwork.get(t3);
									if ( wItem_triggered.matches(triggeredTask.getName()) ) {
										myTrigger.addTriggered(triggeredTask);
									}
								}
							}				
							mainTask.addKSSTriggers(myTrigger);
						}
					}
					// ------------------ END WORK ITEM DEPENDENCIES -------------------------					
					this.myWINetworks.add(myWINetwork);					
				}
				System.out.println("\nSoS Work Item Networks: ");
				System.out.println(this.myWINetworks.get(0));
				System.out.println(this.myWINetworks.get(0).size()+" WIs");
				System.out.println("Replicated: "+this.myWINetworks.size());
				// ------------------------ END WORK ITEMS FLOW ----------------------------------
//			}
				
			// ---------------------- END WORK FLOW DATA MODELS ----------------------------------						

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n------------------------------------------------------------: ");
		
//		god.getDemandSources().addAll(myDemandSources);
//		god.getOrganizationMembers().addAll(mySPAgents);	
//		for (int wf = 0; wf < myWINetworks.size(); wf++) {
//			ArrayList<KSSTask> wItemFlow = myWINetworks.get(wf);
//			int c = 0;int r = 0;int t = 0;	
//			for (int w = 0; w < wItemFlow.size(); w++) {
//				KSSTask wItem = wItemFlow.get(w);			
//				god.getWaitingList().add(wItem);
//			}
//		}
	}
	
	// -------------------------- END XML INSTANTIATION --------------------------------------
	
	
	// -------------------------- CONTEXT IMPLEMENTATION -------------------------------------
	public void ContextImplementation(Context<Object> context) {
		Grid<Object> grid = (Grid) context.getProjection("Grid");
		Network<Object> net = (Network<Object>) context.getProjection("organization network");
		
		// ?? ---------------------- Create Controller ----------------------------		
		context.add(this.myGod);
		this.myGod.getOrganizationMembers().addAll(mySPAgents);
		this.myGod.getDemandSources().addAll(myDemandSources);
		
		for (int wn=0;wn<this.myWINetworks.size();wn++) {
			this.myGod.getWaitingList().addAll(this.myWINetworks.get(wn));
		}
		// ?? ---------------------------------------------------------------------			
		context.addAll(this.myDemandSources);	
		grid.moveTo(myDemandSources.get(0), 10,29,4);
		// ------------------------ Context Grid  ------------------------------
		// ServiceProvider Agents to Context
		for (int a = 0; a < this.mySPAgents.size(); a++) {
			ServiceProviderAgent tAgent = this.mySPAgents.get(a);											
			context.add(tAgent);
			// Graphical Control
			grid.moveTo(tAgent, 10, 20-tAgent.getId()*4, 15);
			// ------------------------------------
		}		
//		// KSS Tasks to Context
//		for (int wf = 0; wf < myWINetworks.size(); wf++) {
//			ArrayList<KSSTask> wItemFlow = myWINetworks.get(wf);
//			int c = 0;int r = 0;int t = 0;	
//			for (int w = 0; w < wItemFlow.size(); w++) {
//				KSSTask wItem = wItemFlow.get(w);			
//				god.getWaitingList().add(wItem);
//				context.add(wItem);		
//				// Graphical Control
//				if (wItem.getPatternType().getName().matches("Capability")) {																															
//					grid.moveTo(wItem,1+1*(c+wf),35,15); c++;}
//				if (wItem.getPatternType().getName().matches("Requirement")) {
//					grid.moveTo(wItem,1+1*(r+wf),30,10); r++;}
//				if (wItem.getPatternType().getName().matches("Task")) {
//					grid.moveTo(wItem,1+1*(t+wf),25,5); t++;}
//			}
			// Add KSSTask Dependency Edges
//			for (int w = 0; w < wItemFlow.size(); w++) {
//				KSSTask wItem = wItemFlow.get(w);
//				for (int wst = 0; wst < wItem.getKSSsTasks().size(); wst++) {
//					KSSTask wItemsTask = wItem.getKSSsTasks().get(wst);
//					net.addEdge(wItem,wItemsTask);
//				}
//			}
//			// Add KSSTask Assignment-to Edges
//			for (int w = 0; w < wItemFlow.size(); w++) {
//				// 1. What Service does this WI request?
//				KSSTask wItem = wItemFlow.get(w);	
//				String wItem_reqService = wItem.getReqSpecialties().get(0).getName();
//                // 2. What ServiceProviders can provide this Service for this WI?
//				ArrayList<ServiceProviderAgent> tAgent_candidates = new ArrayList<ServiceProviderAgent>(0);
//				for (int a1 = 0; a1 < mySPAgents.size(); a1++) {
//					ServiceProviderAgent tAgent = mySPAgents.get(a1);	
//					// 2.1 List All Services of that ServiceProvider
//					for (int ts = 0; ts < tAgent.getServices().size(); ts++) {
//						String tAgent_Service = tAgent.getServices().get(ts).getServiceType().getName();	
//						// 2.2 Find if any matches the Service requested
//						if (wItem_reqService.matches(tAgent_Service)) {
//							// 2.3 If any, add the ServiceProvider to Candidates list
//							tAgent_candidates.add(tAgent);
//							break;
//						}
//					}
//				}
                // 3. Pick one ServiceProvider RANDOMLY and assign the WI...
//				if ( (tAgent_candidates.size() != 0) && (!wItem.isAggregationNode()) ) {
//					ServiceProviderAgent sProvider1=tAgent_candidates.get(RandomHelper.nextIntFromTo(0, tAgent_candidates.size()-1));
//					sProvider1.assignTask(wItem);
////					net.addEdge(wItem,sProvider1);
//				}				
//			}
//		}
		// ---------------------- End Context Grid ----------------------------
	}
	// ------------------------- END CONTEXT IMPLEMENTATION -------------------------------
	
}
