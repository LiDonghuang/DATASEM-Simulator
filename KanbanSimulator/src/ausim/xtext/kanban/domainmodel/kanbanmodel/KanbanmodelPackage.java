/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
   * The feature id for the '<em><b>Demand Units</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__DEMAND_UNITS = 1;

  /**
   * The feature id for the '<em><b>Sourced Units</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__SOURCED_UNITS = 2;

  /**
   * The feature id for the '<em><b>Groupmembers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__GROUPMEMBERS = 3;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__RESOURCES = 4;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__SERVICES = 5;

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
   * The feature id for the '<em><b>Has Skills</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__HAS_SKILLS = 1;

  /**
   * The number of structural features of the '<em>Asset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.SkillImpl <em>Skill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.SkillImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getSkill()
   * @generated
   */
  int SKILL = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKILL__NAME = 0;

  /**
   * The number of structural features of the '<em>Skill</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKILL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.DependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.DependencyImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getDependency()
   * @generated
   */
  int DEPENDENCY = 5;

  /**
   * The feature id for the '<em><b>Source Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__SOURCE_TASK = 0;

  /**
   * The feature id for the '<em><b>Target Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__TARGET_TASK = 1;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DEPENDENCIES = 2;

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
   * The feature id for the '<em><b>Task Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__TASK_DEPENDENCIES = 2;

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
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanTaskModelImpl <em>Kanban Task Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanTaskModelImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanTaskModel()
   * @generated
   */
  int KANBAN_TASK_MODEL = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_TASK_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Caps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_TASK_MODEL__CAPS = 1;

  /**
   * The number of structural features of the '<em>Kanban Task Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_TASK_MODEL_FEATURE_COUNT = 2;

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
   * Returns the meta object for the reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getDemandUnits <em>Demand Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Demand Units</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getDemandUnits()
   * @see #getTeam()
   * @generated
   */
  EReference getTeam_DemandUnits();

  /**
   * Returns the meta object for the reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getSourcedUnits <em>Sourced Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sourced Units</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getSourcedUnits()
   * @see #getTeam()
   * @generated
   */
  EReference getTeam_SourcedUnits();

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
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Asset#getHasSkills <em>Has Skills</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Has Skills</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Asset#getHasSkills()
   * @see #getAsset()
   * @generated
   */
  EReference getAsset_HasSkills();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Skill <em>Skill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Skill</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Skill
   * @generated
   */
  EClass getSkill();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Skill#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Skill#getName()
   * @see #getSkill()
   * @generated
   */
  EAttribute getSkill_Name();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Dependency
   * @generated
   */
  EClass getDependency();

  /**
   * Returns the meta object for the reference '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Dependency#getSourceTask <em>Source Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Task</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Dependency#getSourceTask()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_SourceTask();

  /**
   * Returns the meta object for the reference '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Dependency#getTargetTask <em>Target Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Task</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Dependency#getTargetTask()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_TargetTask();

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
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dependencies</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement#getDependencies()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Dependencies();

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
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getTaskDependencies <em>Task Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Task Dependencies</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getTaskDependencies()
   * @see #getTask()
   * @generated
   */
  EReference getTask_TaskDependencies();

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
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel <em>Kanban Task Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kanban Task Model</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel
   * @generated
   */
  EClass getKanbanTaskModel();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel#getName()
   * @see #getKanbanTaskModel()
   * @generated
   */
  EAttribute getKanbanTaskModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel#getCaps <em>Caps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Caps</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel#getCaps()
   * @see #getKanbanTaskModel()
   * @generated
   */
  EReference getKanbanTaskModel_Caps();

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
     * The meta object literal for the '<em><b>Demand Units</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEAM__DEMAND_UNITS = eINSTANCE.getTeam_DemandUnits();

    /**
     * The meta object literal for the '<em><b>Sourced Units</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEAM__SOURCED_UNITS = eINSTANCE.getTeam_SourcedUnits();

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
     * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEAM__SERVICES = eINSTANCE.getTeam_Services();

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
     * The meta object literal for the '<em><b>Has Skills</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSET__HAS_SKILLS = eINSTANCE.getAsset_HasSkills();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.SkillImpl <em>Skill</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.SkillImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getSkill()
     * @generated
     */
    EClass SKILL = eINSTANCE.getSkill();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SKILL__NAME = eINSTANCE.getSkill_Name();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.DependencyImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getDependency()
     * @generated
     */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
     * The meta object literal for the '<em><b>Source Task</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__SOURCE_TASK = eINSTANCE.getDependency_SourceTask();

    /**
     * The meta object literal for the '<em><b>Target Task</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__TARGET_TASK = eINSTANCE.getDependency_TargetTask();

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
     * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__DEPENDENCIES = eINSTANCE.getRequirement_Dependencies();

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
     * The meta object literal for the '<em><b>Task Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__TASK_DEPENDENCIES = eINSTANCE.getTask_TaskDependencies();

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
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanTaskModelImpl <em>Kanban Task Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanTaskModelImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanTaskModel()
     * @generated
     */
    EClass KANBAN_TASK_MODEL = eINSTANCE.getKanbanTaskModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KANBAN_TASK_MODEL__NAME = eINSTANCE.getKanbanTaskModel_Name();

    /**
     * The meta object literal for the '<em><b>Caps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_TASK_MODEL__CAPS = eINSTANCE.getKanbanTaskModel_Caps();

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

  }

} //KanbanmodelPackage
