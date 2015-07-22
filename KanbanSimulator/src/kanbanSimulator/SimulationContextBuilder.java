package kanbanSimulator;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import repast.simphony.context.Context;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.parameter.Parameters;
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
	private SystemOfSystems mySoS;
	private Visualization myVisualization;
	// ?? --------------------------------------------
	
	// ------------- Experiment Settings -------------
	public int replications;
	public int interArrivalTime;
	
	
	// --------------------------- SIMULATION CONTEXT BUILDER -----------------------------------
	public SimulationContextBuilder(String id) {
		this.Id = new String(id);
		this.mySoS = new SystemOfSystems();
		this.myVisualization = new Visualization();
	}

	public void XMLtoEObjects() {

		try {File fXmlFile = new File("SimulationScenario/KSS-Scenario.xml");
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
				System.out.println("\n---ServiceProvider: "+myServiceProvider.getName());
				// ------------------------------------------------
				// Set ServiceProvider Service
				Node ServicesNode = tM.getElementsByTagName("services").item(0);
				Element Services = (Element)ServicesNode;
				NodeList tM_ServiceList = Services.getElementsByTagName("service");
				System.out.println("SP Services:");
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
					System.out.println("Service: "+myService.getServiceType().getName());
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
//				// Set Resources
				Node ResourcesNode = tM.getElementsByTagName("resources").item(0);
				Element Resources = (Element)ResourcesNode;
				NodeList ResourceList = Resources.getElementsByTagName("resource");				
				for (int r = 0; r < ResourceList.getLength(); r++) {
					// Create Resource
					Resource myResource = KanbanmodelFactory.eINSTANCE.createResource();
					// Read XML
					Node ResourceNode = ResourceList.item(r);
					Element Resource = (Element) ResourceNode;				
					String Resource_name = Resource.getElementsByTagName("name").item(0).getTextContent();
					String Resource_description = Resource.getElementsByTagName("Description").item(0).getTextContent();
					myResource.setName(Resource_name);
					myResource.setDescription(Resource_description);
					System.out.println("-Resource: "+myResource.getName());
					// Resource Skills
					NodeList r_ServiceList = Resource.getElementsByTagName("service");
					for (int r_sv = 0; r_sv < r_ServiceList.getLength(); r_sv++) {
						// Create Service
						Service myService = KanbanmodelFactory.eINSTANCE.createService();	
						// Read XML
						Node r_ServiceNode = r_ServiceList.item(r_sv);
						Element r_sV = (Element) r_ServiceNode;
						String r_sV_name = r_sV.getElementsByTagName("name").item(0).getTextContent();
						String r_sV_Description = r_sV.getElementsByTagName("Description").item(0).getTextContent();
						String r_sV_Type = r_sV.getElementsByTagName("Type").item(0).getTextContent();
						int r_sV_efficiency = Integer.parseInt(r_sV.getElementsByTagName("Efficiency").item(0).getTextContent());				
						// Specify Service
						myService.setName(r_sV_name);
						myService.setDescription(r_sV_Description);
						for (int st = 0; st < serviceTypeList.getLength(); st++) {
							String stname = this.myServiceTypes.get(st).getName();
							if (r_sV_Type.matches(stname)) {
								myService.setServiceType(this.myServiceTypes.get(st));
								break;
							}
						}
						myService.setEfficiency(r_sV_efficiency);
						// Add Service to Resource
						myResource.getServices().add(myService);
						System.out.println("Service: "+myService.getServiceType().getName());
					}
					myServiceProvider.getResources().add(myResource);
				}
				// ---------------------------------------------------
				// Create ServiceProviderAgent Package for this ServiceProvider
				ServiceProviderAgent mySPAgent = new ServiceProviderAgent(sProviderID, myServiceProvider, dfa);	
				mySPAgent.SoS = mySoS;
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
			
			// ---------------------- Organizational Structure --------------------------------
			for (int sp=0;sp<serviceProviderList.getLength();sp++) {
				Node serviceProviderNode = serviceProviderList.item(sp);
				Element sP = (Element) serviceProviderNode;
				ServiceProviderAgent mainSP = this.mySPAgents.get(sp);
				// target Units
				NodeList tUnitList = sP.getElementsByTagName("targetUnit");
				for (int tu = 0; tu < tUnitList.getLength(); tu++) {
					Node sP_targetUnitNode = tUnitList.item(tu);
					Element sP_tU = (Element) sP_targetUnitNode;
					String sP_tU_name = sP_tU.getTextContent();
					for (int sp1=0;sp1<this.mySPAgents.size();sp1++) {
						String spname = this.mySPAgents.get(sp1).getName();
						if (sP_tU_name.matches(spname)) {
							mainSP.getTargetTo().add(this.mySPAgents.get(sp1));
						}
					}
				}
			}
			
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
				NodeList ws_targetUnits = wSource.getElementsByTagName("targetUnit");
				// Specify
				myWorkSource.setName(ws_name);
				myWorkSource.setDescription(ws_description);
				// Package
				DemandSource myDemandSource = new DemandSource(dSourceID ++, myWorkSource);
				
			    // Target Units
				for (int ws_tu = 0; ws_tu < ws_targetUnits.getLength(); ws_tu++) {
					Node wS_targetUnitNode = ws_targetUnits.item(ws_tu);
					Element wS_tU = (Element) wS_targetUnitNode;
					String wS_tU_name = wS_tU.getTextContent();
					for (int sp=0;sp<this.mySPAgents.size();sp++) {
						String spname = this.mySPAgents.get(sp).getName();
						if (wS_tU_name.matches(spname)) {
							myDemandSource.getTargetTo().add(this.mySPAgents.get(sp));
						}
					}
				}
				myDemandSource.SoS = mySoS;
				this.myDemandSources.add(myDemandSource);
				dSourceID ++;
			}
			System.out.println("\nSoS Demand Sources :");
			System.out.println(this.myDemandSources);
				
			
			// ------------------------- WORK FLOW DATA MODELS -------------------------------------
			Parameters p = RunEnvironment.getInstance().getParameters();
			int interArrivalTime = (Integer)p.getValue("WI_interArrivalTime");
			int replications = (Integer)p.getValue("WI_replications");	
			double effortsVolatility = (Double)p.getValue("WI_effortsVolatility");
			double valueVolatility = (Double)p.getValue("WI_valueVolatility");
			
			this.myWINetworks = new ArrayList<ArrayList<KSSTask>>(0);
			int wItemID = 0;
//			for (int wfd = 0; wfd < workItemNetworkList.getLength(); wfd++) {

			for (int rep = 0; rep < replications; rep++) {
				System.out.println("\nGenerating WIN Replication: No."+(rep+1));
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
						String wi_profile = wItem.getElementsByTagName("Profile").item(0).getTextContent();
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
						// Efforts Volatility...
						if (wi_befforts!=0){
						    wi_befforts =
								RandomHelper.createNormal
								(wi_befforts, effortsVolatility*wi_befforts).nextInt();			
							wi_befforts = Math.max(1, wi_befforts);
						}	
						//
						WI.setBefforts(wi_befforts);										
						// Value Volatility...
						if (wi_bvalue!=0){
							wi_bvalue=
								RandomHelper.createNormal
								(wi_bvalue, valueVolatility*wi_bvalue).nextInt();
							wi_bvalue = Math.max(1, wi_bvalue);
						}
						//
						WI.setBvalue(wi_bvalue);
						
						WI.setCOS(wi_cos);			
						// Timing Volatility ...
						if ( (rep>0) && (wi_arrTime>0) ) {			
							int time_shift = rep*interArrivalTime + RandomHelper.nextIntFromTo(-interArrivalTime, 0);
							wi_arrTime += time_shift;					
							if (wi_dueDate>0) {							
								wi_dueDate += time_shift;			
								}
						}
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
						//-------------------------------------------------------------------------------------------
						// Create KSSTask Package for this WI
						KSSTask myWItem=new KSSTask(wItemID, WI);
						myWItem.setProfileName(wi_profile);
												
						// Set DemandSource
						for (int wiws = 0; wiws < this.myDemandSources.size(); wiws++) {
							String wiws_name = this.myDemandSources.get(wiws).getName();							
							if (wi_wSource.matches(wiws_name)) {
								DemandSource WI_wSource = this.myDemandSources.get(wiws);
								myWItem.setDemandSource(WI_wSource);	
								myWItem.setDemanded(true);
								break;}
						}						
						// -------------------------------------------------------------------------------------------
						myWItem.SoS = mySoS;
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
									mainTask.addSubTask(subTask);	
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
									mainTask.addPredecessorTask(predecessor);
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
		Grid<Object> grid3D = (Grid<Object>) context.getProjection("3DGrid");
		Grid<Object> grid2D = (Grid<Object>) context.getProjection("2DGrid");		
		
		Network<Object> net = (Network<Object>) context.getProjection("WI_Hierarchy");
		
		// ?? ---------------------- Create Controller ----------------------------		
		context.add(this.mySoS);
		this.myVisualization.SoS = mySoS;
		context.add(this.myVisualization);
		this.mySoS.getOrganizationMembers().addAll(mySPAgents);
		this.mySoS.getDemandSources().addAll(myDemandSources);
		
		// ------------------------ Randomize WI -----------------------------
		for (int wn=0;wn<this.myWINetworks.size();wn++) {
			ArrayList<KSSTask> myWINetwork = this.myWINetworks.get(wn);
			myWINetwork = new RandomWorkItemsNetworkGenerator().generateWIN(myWINetwork);
			this.myWINetworks.set(wn, myWINetwork);
		}
		// ------------------------------------------------------------------
		
		
		for (int wn=0;wn<this.myWINetworks.size();wn++) {
			ArrayList<KSSTask> myWINetwork = this.myWINetworks.get(wn);
			for (int w=0;w<myWINetwork.size();w++) {
				KSSTask myWI = myWINetwork.get(w);
				if (myWI.getArrivalTime()>0) {
					this.mySoS.getWaitingList().add(myWI);
				}
			}		
		}
		// ?? ---------------------------------------------------------------------			
		context.addAll(this.myDemandSources);	
		grid3D.moveTo(myDemandSources.get(0), 10,99,4);
		grid2D.moveTo(myDemandSources.get(0), 10,99);
		// ------------------------ Context Grid  ------------------------------
		// ServiceProvider Agents to Context
		for (int a = 0; a < this.mySPAgents.size(); a++) {
			ServiceProviderAgent tAgent = this.mySPAgents.get(a);											
			context.add(tAgent);
			// Graphical Control
			grid3D.moveTo(tAgent, 10, 90-tAgent.getId()*4, 15);
			grid2D.moveTo(tAgent, 10, 90-tAgent.getId()*4);
			// ------------------------------------
		}		
		// ---------------------- End Context Grid ----------------------------
	}
	// ------------------------- END CONTEXT IMPLEMENTATION -------------------------------
	
}
