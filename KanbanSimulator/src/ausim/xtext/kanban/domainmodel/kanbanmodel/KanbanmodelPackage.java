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
   * The feature id for the '<em><b>KSS Task Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__KSS_TASK_PATTERNS = 1;

  /**
   * The feature id for the '<em><b>KS Stask Pattern Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__KS_STASK_PATTERN_TYPES = 2;

  /**
   * The feature id for the '<em><b>So SServices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__SO_SSERVICES = 3;

  /**
   * The feature id for the '<em><b>Org Units</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__ORG_UNITS = 4;

  /**
   * The feature id for the '<em><b>Kss Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__KSS_TASKS = 5;

  /**
   * The feature id for the '<em><b>Kss Work Flow</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__KSS_WORK_FLOW = 6;

  /**
   * The feature id for the '<em><b>Kss Gov Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__KSS_GOV_MODEL = 7;

  /**
   * The number of structural features of the '<em>Kanban Scheduling System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskPatternImpl <em>Task Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskPatternImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTaskPattern()
   * @generated
   */
  int TASK_PATTERN = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_PATTERN__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_PATTERN__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Taskpattern Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_PATTERN__TASKPATTERN_TYPES = 2;

  /**
   * The number of structural features of the '<em>Task Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_PATTERN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskTypeImpl <em>Task Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskTypeImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTaskType()
   * @generated
   */
  int TASK_TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_TYPE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Task Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getService()
   * @generated
   */
  int SERVICE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTask()
   * @generated
   */
  int TASK = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__PATTERN = 2;

  /**
   * The feature id for the '<em><b>Pattern Type</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__PATTERN_TYPE = 3;

  /**
   * The feature id for the '<em><b>STasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__STASKS = 4;

  /**
   * The feature id for the '<em><b>Task Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__TASK_DEPENDENCIES = 5;

  /**
   * The feature id for the '<em><b>Req Specialties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__REQ_SPECIALTIES = 6;

  /**
   * The feature id for the '<em><b>Befforts</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__BEFFORTS = 7;

  /**
   * The feature id for the '<em><b>Bvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__BVALUE = 8;

  /**
   * The feature id for the '<em><b>COS</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__COS = 9;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = 10;

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
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TeamImpl <em>Team</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TeamImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTeam()
   * @generated
   */
  int TEAM = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Demand Units</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__DEMAND_UNITS = 2;

  /**
   * The feature id for the '<em><b>Sourced Units</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__SOURCED_UNITS = 3;

  /**
   * The feature id for the '<em><b>Groupmembers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__GROUPMEMBERS = 4;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__RESOURCES = 5;

  /**
   * The feature id for the '<em><b>Services</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__SERVICES = 6;

  /**
   * The number of structural features of the '<em>Team</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl <em>Asset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAsset()
   * @generated
   */
  int ASSET = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Has Skills</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__HAS_SKILLS = 2;

  /**
   * The number of structural features of the '<em>Asset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.SkillImpl <em>Skill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.SkillImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getSkill()
   * @generated
   */
  int SKILL = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKILL__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKILL__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Skill</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKILL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.RequirementImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>RTasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__RTASKS = 2;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DEPENDENCIES = 3;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanTaskModelImpl <em>Kanban Task Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanTaskModelImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanTaskModel()
   * @generated
   */
  int KANBAN_TASK_MODEL = 10;

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
  int CAPABILITY = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Reqs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__REQS = 2;

  /**
   * The number of structural features of the '<em>Capability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanGovModelImpl <em>Kanban Gov Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanGovModelImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanGovModel()
   * @generated
   */
  int KANBAN_GOV_MODEL = 12;

  /**
   * The feature id for the '<em><b>Strategy</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_GOV_MODEL__STRATEGY = 0;

  /**
   * The number of structural features of the '<em>Kanban Gov Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_GOV_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl <em>Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getStrategy()
   * @generated
   */
  int STRATEGY = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__NAME = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__ENTITIES = 1;

  /**
   * The number of structural features of the '<em>Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.EntityImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Sdname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SDNAME = 1;

  /**
   * The feature id for the '<em><b>Service Provisions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SERVICE_PROVISIONS = 2;

  /**
   * The feature id for the '<em><b>Entity Behavior</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ENTITY_BEHAVIOR = 3;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ProvisionImpl <em>Provision</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ProvisionImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getProvision()
   * @generated
   */
  int PROVISION = 15;

  /**
   * The feature id for the '<em><b>Service Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISION__SERVICE_NAME = 0;

  /**
   * The feature id for the '<em><b>Providers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISION__PROVIDERS = 1;

  /**
   * The number of structural features of the '<em>Provision</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StatemachineImpl <em>Statemachine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StatemachineImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getStatemachine()
   * @generated
   */
  int STATEMACHINE = 16;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__EVENTS = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__COMMANDS = 1;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__STATES = 2;

  /**
   * The number of structural features of the '<em>Statemachine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.EventImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__CODE = 1;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.CommandImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NAME = 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__CODE = 1;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StateImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getState()
   * @generated
   */
  int STATE = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ACTIONS = 1;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TRANSITIONS = 2;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 20;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__STATE = 1;

  /**
   * The feature id for the '<em><b>Eventactions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENTACTIONS = 2;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 3;


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
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSSTaskPatterns <em>KSS Task Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>KSS Task Patterns</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSSTaskPatterns()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_KSSTaskPatterns();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSStaskPatternTypes <em>KS Stask Pattern Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>KS Stask Pattern Types</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSStaskPatternTypes()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_KSStaskPatternTypes();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getSoSServices <em>So SServices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>So SServices</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getSoSServices()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_SoSServices();

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
   * Returns the meta object for the containment reference '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKssGovModel <em>Kss Gov Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kss Gov Model</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKssGovModel()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_KssGovModel();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.TaskPattern <em>Task Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Pattern</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.TaskPattern
   * @generated
   */
  EClass getTaskPattern();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.TaskPattern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.TaskPattern#getName()
   * @see #getTaskPattern()
   * @generated
   */
  EAttribute getTaskPattern_Name();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.TaskPattern#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.TaskPattern#getDescription()
   * @see #getTaskPattern()
   * @generated
   */
  EAttribute getTaskPattern_Description();

  /**
   * Returns the meta object for the reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.TaskPattern#getTaskpatternTypes <em>Taskpattern Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Taskpattern Types</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.TaskPattern#getTaskpatternTypes()
   * @see #getTaskPattern()
   * @generated
   */
  EReference getTaskPattern_TaskpatternTypes();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.TaskType <em>Task Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Type</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.TaskType
   * @generated
   */
  EClass getTaskType();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.TaskType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.TaskType#getName()
   * @see #getTaskType()
   * @generated
   */
  EAttribute getTaskType_Name();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.TaskType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.TaskType#getDescription()
   * @see #getTaskType()
   * @generated
   */
  EAttribute getTaskType_Description();

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
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Service#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Service#getDescription()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Description();

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
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getDescription()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Description();

  /**
   * Returns the meta object for the reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Pattern</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getPattern()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Pattern();

  /**
   * Returns the meta object for the reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getPatternType <em>Pattern Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Pattern Type</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getPatternType()
   * @see #getTask()
   * @generated
   */
  EReference getTask_PatternType();

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
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getBefforts <em>Befforts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Befforts</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Task#getBefforts()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Befforts();

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
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getDescription()
   * @see #getTeam()
   * @generated
   */
  EAttribute getTeam_Description();

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
   * Returns the meta object for the reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Services</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getServices()
   * @see #getTeam()
   * @generated
   */
  EReference getTeam_Services();

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
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Asset#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Asset#getDescription()
   * @see #getAsset()
   * @generated
   */
  EAttribute getAsset_Description();

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
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Skill#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Skill#getDescription()
   * @see #getSkill()
   * @generated
   */
  EAttribute getSkill_Description();

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
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement#getDescription()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Description();

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
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Capability#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Capability#getDescription()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Description();

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
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanGovModel <em>Kanban Gov Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kanban Gov Model</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanGovModel
   * @generated
   */
  EClass getKanbanGovModel();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanGovModel#getStrategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Strategy</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanGovModel#getStrategy()
   * @see #getKanbanGovModel()
   * @generated
   */
  EReference getKanbanGovModel_Strategy();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Strategy</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy
   * @generated
   */
  EClass getStrategy();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy#getName()
   * @see #getStrategy()
   * @generated
   */
  EAttribute getStrategy_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy#getEntities()
   * @see #getStrategy()
   * @generated
   */
  EReference getStrategy_Entities();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Entity#getSdname <em>Sdname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sdname</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Entity#getSdname()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Sdname();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Entity#getServiceProvisions <em>Service Provisions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service Provisions</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Entity#getServiceProvisions()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_ServiceProvisions();

  /**
   * Returns the meta object for the containment reference '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Entity#getEntityBehavior <em>Entity Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity Behavior</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Entity#getEntityBehavior()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_EntityBehavior();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Provision <em>Provision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provision</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Provision
   * @generated
   */
  EClass getProvision();

  /**
   * Returns the meta object for the reference '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Provision#getServiceName <em>Service Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Service Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Provision#getServiceName()
   * @see #getProvision()
   * @generated
   */
  EReference getProvision_ServiceName();

  /**
   * Returns the meta object for the reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Provision#getProviders <em>Providers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Providers</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Provision#getProviders()
   * @see #getProvision()
   * @generated
   */
  EReference getProvision_Providers();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Statemachine <em>Statemachine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statemachine</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Statemachine
   * @generated
   */
  EClass getStatemachine();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getEvents()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Events();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getCommands()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Commands();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getStates()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_States();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Event#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Event#getCode()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Code();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Command#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Command#getName()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Name();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Command#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Command#getCode()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Code();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.State#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Actions</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.State#getActions()
   * @see #getState()
   * @generated
   */
  EReference getState_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.State#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.State#getTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_Transitions();

  /**
   * Returns the meta object for class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the reference '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Transition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Transition#getEvent()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Event();

  /**
   * Returns the meta object for the reference '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Transition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Transition#getState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_State();

  /**
   * Returns the meta object for the reference list '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Transition#getEventactions <em>Eventactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Eventactions</em>'.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Transition#getEventactions()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Eventactions();

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
     * The meta object literal for the '<em><b>KSS Task Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__KSS_TASK_PATTERNS = eINSTANCE.getKanbanSchedulingSystem_KSSTaskPatterns();

    /**
     * The meta object literal for the '<em><b>KS Stask Pattern Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__KS_STASK_PATTERN_TYPES = eINSTANCE.getKanbanSchedulingSystem_KSStaskPatternTypes();

    /**
     * The meta object literal for the '<em><b>So SServices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__SO_SSERVICES = eINSTANCE.getKanbanSchedulingSystem_SoSServices();

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
     * The meta object literal for the '<em><b>Kss Gov Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__KSS_GOV_MODEL = eINSTANCE.getKanbanSchedulingSystem_KssGovModel();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskPatternImpl <em>Task Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskPatternImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTaskPattern()
     * @generated
     */
    EClass TASK_PATTERN = eINSTANCE.getTaskPattern();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK_PATTERN__NAME = eINSTANCE.getTaskPattern_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK_PATTERN__DESCRIPTION = eINSTANCE.getTaskPattern_Description();

    /**
     * The meta object literal for the '<em><b>Taskpattern Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_PATTERN__TASKPATTERN_TYPES = eINSTANCE.getTaskPattern_TaskpatternTypes();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskTypeImpl <em>Task Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskTypeImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTaskType()
     * @generated
     */
    EClass TASK_TYPE = eINSTANCE.getTaskType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK_TYPE__NAME = eINSTANCE.getTaskType_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK_TYPE__DESCRIPTION = eINSTANCE.getTaskType_Description();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__PATTERN = eINSTANCE.getTask_Pattern();

    /**
     * The meta object literal for the '<em><b>Pattern Type</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__PATTERN_TYPE = eINSTANCE.getTask_PatternType();

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
     * The meta object literal for the '<em><b>Befforts</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__BEFFORTS = eINSTANCE.getTask_Befforts();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEAM__DESCRIPTION = eINSTANCE.getTeam_Description();

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
     * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEAM__SERVICES = eINSTANCE.getTeam_Services();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSET__DESCRIPTION = eINSTANCE.getAsset_Description();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SKILL__DESCRIPTION = eINSTANCE.getSkill_Description();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__DESCRIPTION = eINSTANCE.getCapability_Description();

    /**
     * The meta object literal for the '<em><b>Reqs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY__REQS = eINSTANCE.getCapability_Reqs();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanGovModelImpl <em>Kanban Gov Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanGovModelImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanGovModel()
     * @generated
     */
    EClass KANBAN_GOV_MODEL = eINSTANCE.getKanbanGovModel();

    /**
     * The meta object literal for the '<em><b>Strategy</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_GOV_MODEL__STRATEGY = eINSTANCE.getKanbanGovModel_Strategy();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl <em>Strategy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getStrategy()
     * @generated
     */
    EClass STRATEGY = eINSTANCE.getStrategy();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRATEGY__NAME = eINSTANCE.getStrategy_Name();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY__ENTITIES = eINSTANCE.getStrategy_Entities();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.EntityImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Sdname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__SDNAME = eINSTANCE.getEntity_Sdname();

    /**
     * The meta object literal for the '<em><b>Service Provisions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SERVICE_PROVISIONS = eINSTANCE.getEntity_ServiceProvisions();

    /**
     * The meta object literal for the '<em><b>Entity Behavior</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ENTITY_BEHAVIOR = eINSTANCE.getEntity_EntityBehavior();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ProvisionImpl <em>Provision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ProvisionImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getProvision()
     * @generated
     */
    EClass PROVISION = eINSTANCE.getProvision();

    /**
     * The meta object literal for the '<em><b>Service Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVISION__SERVICE_NAME = eINSTANCE.getProvision_ServiceName();

    /**
     * The meta object literal for the '<em><b>Providers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVISION__PROVIDERS = eINSTANCE.getProvision_Providers();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StatemachineImpl <em>Statemachine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StatemachineImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getStatemachine()
     * @generated
     */
    EClass STATEMACHINE = eINSTANCE.getStatemachine();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__EVENTS = eINSTANCE.getStatemachine_Events();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__COMMANDS = eINSTANCE.getStatemachine_Commands();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__STATES = eINSTANCE.getStatemachine_States();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.EventImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__CODE = eINSTANCE.getEvent_Code();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.CommandImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__CODE = eINSTANCE.getCommand_Code();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StateImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__ACTIONS = eINSTANCE.getState_Actions();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

    /**
     * The meta object literal for the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl
     * @see ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__STATE = eINSTANCE.getTransition_State();

    /**
     * The meta object literal for the '<em><b>Eventactions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EVENTACTIONS = eINSTANCE.getTransition_Eventactions();

  }

} //KanbanmodelPackage
