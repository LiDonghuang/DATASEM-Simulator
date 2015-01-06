/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelFactory
 * @model kind="package"
 * @generated
 */
public interface KanbanmodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kanbanmodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.ausim/kanban/domainmodel/Kanbanmodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kanbanmodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KanbanmodelPackage eINSTANCE = ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl <em>Kanban Scheduling System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanSchedulingSystem()
   * @generated
   */
  int KANBAN_SCHEDULING_SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Org Units</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__ORG_UNITS = 1;

  /**
   * The feature id for the '<em><b>Kss Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__KSS_TASKS = 2;

  /**
   * The feature id for the '<em><b>Kss Work Flow</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__KSS_WORK_FLOW = 3;

  /**
   * The number of structural features of the '<em>Kanban Scheduling System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TeamImpl <em>Team</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TeamImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTeam()
   * @generated
   */
  int TEAM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Groupmembers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__GROUPMEMBERS = 1;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__RESOURCES = 2;

  /**
   * The feature id for the '<em><b>Team Profile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__TEAM_PROFILE = 3;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__SERVICES = 4;

  /**
   * The feature id for the '<em><b>Kss Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__KSS_BLOCK = 5;

  /**
   * The number of structural features of the '<em>Team</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getService()
   * @generated
   */
  int SERVICE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 0;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl <em>Asset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAsset()
   * @generated
   */
  int ASSET = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__NAME = 0;

  /**
   * The feature id for the '<em><b>Employed At</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__EMPLOYED_AT = 1;

  /**
   * The number of structural features of the '<em>Asset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KSSBlockImpl <em>KSS Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KSSBlockImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKSSBlock()
   * @generated
   */
  int KSS_BLOCK = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KSS_BLOCK__NAME = 0;

  /**
   * The feature id for the '<em><b>Assigned Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KSS_BLOCK__ASSIGNED_UNIT = 1;

  /**
   * The feature id for the '<em><b>Demand Units</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KSS_BLOCK__DEMAND_UNITS = 2;

  /**
   * The feature id for the '<em><b>Sourced Units</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KSS_BLOCK__SOURCED_UNITS = 3;

  /**
   * The feature id for the '<em><b>RQueue Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KSS_BLOCK__RQUEUE_LIMIT = 4;

  /**
   * The feature id for the '<em><b>Wip Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KSS_BLOCK__WIP_LIMIT = 5;

  /**
   * The number of structural features of the '<em>KSS Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KSS_BLOCK_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl <em>Mechanism</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getMechanism()
   * @generated
   */
  int MECHANISM = 5;

  /**
   * The feature id for the '<em><b>Source Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__SOURCE_TASK = 0;

  /**
   * The feature id for the '<em><b>Target Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__TARGET_TASK = 1;

  /**
   * The number of structural features of the '<em>Mechanism</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.RequirementImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>RTasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__RTASKS = 1;

  /**
   * The feature id for the '<em><b>Mechanisms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__MECHANISMS = 2;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTask()
   * @generated
   */
  int TASK = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = 0;

  /**
   * The feature id for the '<em><b>STasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__STASKS = 1;

  /**
   * The feature id for the '<em><b>Task Mechanims</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__TASK_MECHANIMS = 2;

  /**
   * The feature id for the '<em><b>Req Specialties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__REQ_SPECIALTIES = 3;

  /**
   * The feature id for the '<em><b>Bvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__BVALUE = 4;

  /**
   * The feature id for the '<em><b>COS</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__COS = 5;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanWorkFlowImpl <em>Kanban Work Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanWorkFlowImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanWorkFlow()
   * @generated
   */
  int KANBAN_WORK_FLOW = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_WORK_FLOW__NAME = 0;

  /**
   * The feature id for the '<em><b>Caps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_WORK_FLOW__CAPS = 1;

  /**
   * The number of structural features of the '<em>Kanban Work Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_WORK_FLOW_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.CapabilityImpl <em>Capability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.CapabilityImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCapability()
   * @generated
   */
  int CAPABILITY = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Reqs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__REQS = 1;

  /**
   * The number of structural features of the '<em>Capability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.ProfileType <em>Profile Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.ProfileType
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getProfileType()
   * @generated
   */
  int PROFILE_TYPE = 10;


  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem <em>Kanban Scheduling System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kanban Scheduling System</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem
   * @generated
   */
  EClass getKanbanSchedulingSystem();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getName()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EAttribute getKanbanSchedulingSystem_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getOrgUnits <em>Org Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Org Units</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getOrgUnits()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_OrgUnits();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKssTasks <em>Kss Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Kss Tasks</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKssTasks()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_KssTasks();

  /**
   * Returns the meta object for the containment reference '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKssWorkFlow <em>Kss Work Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kss Work Flow</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKssWorkFlow()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_KssWorkFlow();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team <em>Team</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Team</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Team
   * @generated
   */
  EClass getTeam();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getName()
   * @see #getTeam()
   * @generated
   */
  EAttribute getTeam_Name();

  /**
   * Returns the meta object for the reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getGroupmembers <em>Groupmembers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Groupmembers</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getGroupmembers()
   * @see #getTeam()
   * @generated
   */
  EReference getTeam_Groupmembers();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getResources()
   * @see #getTeam()
   * @generated
   */
  EReference getTeam_Resources();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getTeamProfile <em>Team Profile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Team Profile</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getTeamProfile()
   * @see #getTeam()
   * @generated
   */
  EAttribute getTeam_TeamProfile();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Services</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getServices()
   * @see #getTeam()
   * @generated
   */
  EReference getTeam_Services();

  /**
   * Returns the meta object for the containment reference '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getKssBlock <em>Kss Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kss Block</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getKssBlock()
   * @see #getTeam()
   * @generated
   */
  EReference getTeam_KssBlock();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Asset <em>Asset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asset</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Asset
   * @generated
   */
  EClass getAsset();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Asset#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Asset#getName()
   * @see #getAsset()
   * @generated
   */
  EAttribute getAsset_Name();

  /**
   * Returns the meta object for the reference '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Asset#getEmployedAt <em>Employed At</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Employed At</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Asset#getEmployedAt()
   * @see #getAsset()
   * @generated
   */
  EReference getAsset_EmployedAt();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock <em>KSS Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>KSS Block</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock
   * @generated
   */
  EClass getKSSBlock();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getName()
   * @see #getKSSBlock()
   * @generated
   */
  EAttribute getKSSBlock_Name();

  /**
   * Returns the meta object for the reference '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getAssignedUnit <em>Assigned Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Assigned Unit</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getAssignedUnit()
   * @see #getKSSBlock()
   * @generated
   */
  EReference getKSSBlock_AssignedUnit();

  /**
   * Returns the meta object for the reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getDemandUnits <em>Demand Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Demand Units</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getDemandUnits()
   * @see #getKSSBlock()
   * @generated
   */
  EReference getKSSBlock_DemandUnits();

  /**
   * Returns the meta object for the reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getSourcedUnits <em>Sourced Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sourced Units</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getSourcedUnits()
   * @see #getKSSBlock()
   * @generated
   */
  EReference getKSSBlock_SourcedUnits();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getRQueueLimit <em>RQueue Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>RQueue Limit</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getRQueueLimit()
   * @see #getKSSBlock()
   * @generated
   */
  EAttribute getKSSBlock_RQueueLimit();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getWipLimit <em>Wip Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wip Limit</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getWipLimit()
   * @see #getKSSBlock()
   * @generated
   */
  EAttribute getKSSBlock_WipLimit();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism <em>Mechanism</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mechanism</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism
   * @generated
   */
  EClass getMechanism();

  /**
   * Returns the meta object for the reference '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getSourceTask <em>Source Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Task</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getSourceTask()
   * @see #getMechanism()
   * @generated
   */
  EReference getMechanism_SourceTask();

  /**
   * Returns the meta object for the reference '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getTargetTask <em>Target Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Task</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getTargetTask()
   * @see #getMechanism()
   * @generated
   */
  EReference getMechanism_TargetTask();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement
   * @generated
   */
  EClass getRequirement();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement#getName()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Name();

  /**
   * Returns the meta object for the reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement#getRTasks <em>RTasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>RTasks</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement#getRTasks()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_RTasks();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement#getMechanisms <em>Mechanisms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mechanisms</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement#getMechanisms()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Mechanisms();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getName()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Name();

  /**
   * Returns the meta object for the reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getSTasks <em>STasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>STasks</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getSTasks()
   * @see #getTask()
   * @generated
   */
  EReference getTask_STasks();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getTaskMechanims <em>Task Mechanims</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Task Mechanims</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getTaskMechanims()
   * @see #getTask()
   * @generated
   */
  EReference getTask_TaskMechanims();

  /**
   * Returns the meta object for the reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getReqSpecialties <em>Req Specialties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Req Specialties</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getReqSpecialties()
   * @see #getTask()
   * @generated
   */
  EReference getTask_ReqSpecialties();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getBvalue <em>Bvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bvalue</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getBvalue()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Bvalue();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getCOS <em>COS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>COS</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getCOS()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_COS();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanWorkFlow <em>Kanban Work Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kanban Work Flow</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanWorkFlow
   * @generated
   */
  EClass getKanbanWorkFlow();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanWorkFlow#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanWorkFlow#getName()
   * @see #getKanbanWorkFlow()
   * @generated
   */
  EAttribute getKanbanWorkFlow_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanWorkFlow#getCaps <em>Caps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Caps</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanWorkFlow#getCaps()
   * @see #getKanbanWorkFlow()
   * @generated
   */
  EReference getKanbanWorkFlow_Caps();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Capability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capability</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Capability
   * @generated
   */
  EClass getCapability();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Capability#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Capability#getName()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Capability#getReqs <em>Reqs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reqs</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Capability#getReqs()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_Reqs();

  /**
   * Returns the meta object for enum '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.ProfileType <em>Profile Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Profile Type</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.ProfileType
   * @generated
   */
  EEnum getProfileType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KanbanmodelFactory getKanbanmodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl <em>Kanban Scheduling System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanSchedulingSystem()
     * @generated
     */
    EClass KANBAN_SCHEDULING_SYSTEM = eINSTANCE.getKanbanSchedulingSystem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KANBAN_SCHEDULING_SYSTEM__NAME = eINSTANCE.getKanbanSchedulingSystem_Name();

    /**
     * The meta object literal for the '<em><b>Org Units</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__ORG_UNITS = eINSTANCE.getKanbanSchedulingSystem_OrgUnits();

    /**
     * The meta object literal for the '<em><b>Kss Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__KSS_TASKS = eINSTANCE.getKanbanSchedulingSystem_KssTasks();

    /**
     * The meta object literal for the '<em><b>Kss Work Flow</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__KSS_WORK_FLOW = eINSTANCE.getKanbanSchedulingSystem_KssWorkFlow();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TeamImpl <em>Team</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TeamImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTeam()
     * @generated
     */
    EClass TEAM = eINSTANCE.getTeam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEAM__NAME = eINSTANCE.getTeam_Name();

    /**
     * The meta object literal for the '<em><b>Groupmembers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEAM__GROUPMEMBERS = eINSTANCE.getTeam_Groupmembers();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEAM__RESOURCES = eINSTANCE.getTeam_Resources();

    /**
     * The meta object literal for the '<em><b>Team Profile</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEAM__TEAM_PROFILE = eINSTANCE.getTeam_TeamProfile();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEAM__SERVICES = eINSTANCE.getTeam_Services();

    /**
     * The meta object literal for the '<em><b>Kss Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEAM__KSS_BLOCK = eINSTANCE.getTeam_KssBlock();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl <em>Asset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAsset()
     * @generated
     */
    EClass ASSET = eINSTANCE.getAsset();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSET__NAME = eINSTANCE.getAsset_Name();

    /**
     * The meta object literal for the '<em><b>Employed At</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSET__EMPLOYED_AT = eINSTANCE.getAsset_EmployedAt();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KSSBlockImpl <em>KSS Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KSSBlockImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKSSBlock()
     * @generated
     */
    EClass KSS_BLOCK = eINSTANCE.getKSSBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KSS_BLOCK__NAME = eINSTANCE.getKSSBlock_Name();

    /**
     * The meta object literal for the '<em><b>Assigned Unit</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KSS_BLOCK__ASSIGNED_UNIT = eINSTANCE.getKSSBlock_AssignedUnit();

    /**
     * The meta object literal for the '<em><b>Demand Units</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KSS_BLOCK__DEMAND_UNITS = eINSTANCE.getKSSBlock_DemandUnits();

    /**
     * The meta object literal for the '<em><b>Sourced Units</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KSS_BLOCK__SOURCED_UNITS = eINSTANCE.getKSSBlock_SourcedUnits();

    /**
     * The meta object literal for the '<em><b>RQueue Limit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KSS_BLOCK__RQUEUE_LIMIT = eINSTANCE.getKSSBlock_RQueueLimit();

    /**
     * The meta object literal for the '<em><b>Wip Limit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KSS_BLOCK__WIP_LIMIT = eINSTANCE.getKSSBlock_WipLimit();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl <em>Mechanism</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getMechanism()
     * @generated
     */
    EClass MECHANISM = eINSTANCE.getMechanism();

    /**
     * The meta object literal for the '<em><b>Source Task</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MECHANISM__SOURCE_TASK = eINSTANCE.getMechanism_SourceTask();

    /**
     * The meta object literal for the '<em><b>Target Task</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MECHANISM__TARGET_TASK = eINSTANCE.getMechanism_TargetTask();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.RequirementImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getRequirement()
     * @generated
     */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__NAME = eINSTANCE.getRequirement_Name();

    /**
     * The meta object literal for the '<em><b>RTasks</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__RTASKS = eINSTANCE.getRequirement_RTasks();

    /**
     * The meta object literal for the '<em><b>Mechanisms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__MECHANISMS = eINSTANCE.getRequirement_Mechanisms();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__NAME = eINSTANCE.getTask_Name();

    /**
     * The meta object literal for the '<em><b>STasks</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__STASKS = eINSTANCE.getTask_STasks();

    /**
     * The meta object literal for the '<em><b>Task Mechanims</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__TASK_MECHANIMS = eINSTANCE.getTask_TaskMechanims();

    /**
     * The meta object literal for the '<em><b>Req Specialties</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__REQ_SPECIALTIES = eINSTANCE.getTask_ReqSpecialties();

    /**
     * The meta object literal for the '<em><b>Bvalue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__BVALUE = eINSTANCE.getTask_Bvalue();

    /**
     * The meta object literal for the '<em><b>COS</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__COS = eINSTANCE.getTask_COS();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanWorkFlowImpl <em>Kanban Work Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanWorkFlowImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanWorkFlow()
     * @generated
     */
    EClass KANBAN_WORK_FLOW = eINSTANCE.getKanbanWorkFlow();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KANBAN_WORK_FLOW__NAME = eINSTANCE.getKanbanWorkFlow_Name();

    /**
     * The meta object literal for the '<em><b>Caps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_WORK_FLOW__CAPS = eINSTANCE.getKanbanWorkFlow_Caps();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.CapabilityImpl <em>Capability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.CapabilityImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCapability()
     * @generated
     */
    EClass CAPABILITY = eINSTANCE.getCapability();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__NAME = eINSTANCE.getCapability_Name();

    /**
     * The meta object literal for the '<em><b>Reqs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY__REQS = eINSTANCE.getCapability_Reqs();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.ProfileType <em>Profile Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.ProfileType
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getProfileType()
     * @generated
     */
    EEnum PROFILE_TYPE = eINSTANCE.getProfileType();

  }

} //KanbanmodelPackage
