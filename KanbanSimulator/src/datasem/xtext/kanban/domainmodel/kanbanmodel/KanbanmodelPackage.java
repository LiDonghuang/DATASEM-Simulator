/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

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
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelFactory
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
  KanbanmodelPackage eINSTANCE = datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl <em>Kanban Scheduling System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanSchedulingSystem()
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
   * The feature id for the '<em><b>Test Items</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__TEST_ITEMS = 1;

  /**
   * The feature id for the '<em><b>KSS Repositories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__KSS_REPOSITORIES = 2;

  /**
   * The feature id for the '<em><b>Mechanisms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__MECHANISMS = 3;

  /**
   * The feature id for the '<em><b>KSS Search Strategies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__KSS_SEARCH_STRATEGIES = 4;

  /**
   * The feature id for the '<em><b>KSS Task Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__KSS_TASK_PATTERNS = 5;

  /**
   * The feature id for the '<em><b>KS Stask Pattern Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__KS_STASK_PATTERN_TYPES = 6;

  /**
   * The feature id for the '<em><b>KSS Value Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__KSS_VALUE_FUNCTIONS = 7;

  /**
   * The feature id for the '<em><b>So SServices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__SO_SSERVICES = 8;

  /**
   * The feature id for the '<em><b>Org Units</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__ORG_UNITS = 9;

  /**
   * The feature id for the '<em><b>Kss Sources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__KSS_SOURCES = 10;

  /**
   * The feature id for the '<em><b>Kss WItems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__KSS_WITEMS = 11;

  /**
   * The feature id for the '<em><b>Replications</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__REPLICATIONS = 12;

  /**
   * The feature id for the '<em><b>Inter Arrival Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__INTER_ARRIVAL_TIME = 13;

  /**
   * The number of structural features of the '<em>Kanban Scheduling System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM_FEATURE_COUNT = 14;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.NumExpressionImpl <em>Num Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.NumExpressionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getNumExpression()
   * @generated
   */
  int NUM_EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Num Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_EXPRESSION__NUM_VALUE = 0;

  /**
   * The feature id for the '<em><b>Distribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_EXPRESSION__DISTRIBUTION = 1;

  /**
   * The feature id for the '<em><b>Num Dist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_EXPRESSION__NUM_DIST = 2;

  /**
   * The number of structural features of the '<em>Num Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl <em>Distribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getDistribution()
   * @generated
   */
  int DISTRIBUTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Distribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RepositoryImpl <em>Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RepositoryImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getRepository()
   * @generated
   */
  int REPOSITORY = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__TYPE = 0;

  /**
   * The feature id for the '<em><b>Profiles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__PROFILES = 1;

  /**
   * The number of structural features of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl <em>Work Item Profile</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItemProfile()
   * @generated
   */
  int WORK_ITEM_PROFILE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Ref Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__REF_TASKS = 2;

  /**
   * The feature id for the '<em><b>Dec Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__DEC_TASKS = 3;

  /**
   * The feature id for the '<em><b>Req Specialties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__REQ_SPECIALTIES = 4;

  /**
   * The feature id for the '<em><b>Befforts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__BEFFORTS = 5;

  /**
   * The feature id for the '<em><b>Bvalue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__BVALUE = 6;

  /**
   * The feature id for the '<em><b>COS</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__COS = 7;

  /**
   * The number of structural features of the '<em>Work Item Profile</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkReferenceImpl <em>Work Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkReferenceImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkReference()
   * @generated
   */
  int WORK_REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Work Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_REFERENCE__WORK_ITEM = 0;

  /**
   * The feature id for the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_REFERENCE__AMOUNT = 1;

  /**
   * The number of structural features of the '<em>Work Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkDecompositionImpl <em>Work Decomposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkDecompositionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkDecomposition()
   * @generated
   */
  int WORK_DECOMPOSITION = 6;

  /**
   * The feature id for the '<em><b>Work Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DECOMPOSITION__WORK_ITEM = 0;

  /**
   * The feature id for the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DECOMPOSITION__AMOUNT = 1;

  /**
   * The number of structural features of the '<em>Work Decomposition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DECOMPOSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkPrecedencyImpl <em>Work Precedency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkPrecedencyImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkPrecedency()
   * @generated
   */
  int WORK_PRECEDENCY = 7;

  /**
   * The feature id for the '<em><b>Work Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PRECEDENCY__WORK_ITEM = 0;

  /**
   * The number of structural features of the '<em>Work Precedency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PRECEDENCY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkCausalityImpl <em>Work Causality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkCausalityImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkCausality()
   * @generated
   */
  int WORK_CAUSALITY = 8;

  /**
   * The feature id for the '<em><b>Work Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_CAUSALITY__WORK_ITEM = 0;

  /**
   * The number of structural features of the '<em>Work Causality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_CAUSALITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskPatternImpl <em>Task Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskPatternImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTaskPattern()
   * @generated
   */
  int TASK_PATTERN = 9;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskTypeImpl <em>Task Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTaskType()
   * @generated
   */
  int TASK_TYPE = 10;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ValueFunctionImpl <em>Value Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ValueFunctionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getValueFunction()
   * @generated
   */
  int VALUE_FUNCTION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FUNCTION__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Value Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl <em>Mechanism</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getMechanism()
   * @generated
   */
  int MECHANISM = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Processtype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__PROCESSTYPE = 2;

  /**
   * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__STRATEGIES = 3;

  /**
   * The number of structural features of the '<em>Mechanism</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl <em>Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getStrategy()
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
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>WI Acceptance Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__WI_ACCEPTANCE_RULE = 2;

  /**
   * The feature id for the '<em><b>WI Selection Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__WI_SELECTION_RULE = 3;

  /**
   * The feature id for the '<em><b>WI Assignment Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__WI_ASSIGNMENT_RULE = 4;

  /**
   * The feature id for the '<em><b>Resource Allocation Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__RESOURCE_ALLOCATION_RULE = 5;

  /**
   * The feature id for the '<em><b>Resource Outsourcing Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__RESOURCE_OUTSOURCING_RULE = 6;

  /**
   * The number of structural features of the '<em>Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceImpl <em>WI Acceptance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWIAcceptance()
   * @generated
   */
  int WI_ACCEPTANCE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ACCEPTANCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ACCEPTANCE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Backlog QLimit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ACCEPTANCE__BACKLOG_QLIMIT = 2;

  /**
   * The feature id for the '<em><b>Ready QLimit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ACCEPTANCE__READY_QLIMIT = 3;

  /**
   * The number of structural features of the '<em>WI Acceptance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ACCEPTANCE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WISelectionImpl <em>WI Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WISelectionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWISelection()
   * @generated
   */
  int WI_SELECTION = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_SELECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_SELECTION__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>WI Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_SELECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAssignmentImpl <em>WI Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAssignmentImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWIAssignment()
   * @generated
   */
  int WI_ASSIGNMENT = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ASSIGNMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ASSIGNMENT__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>WI Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceAllocationImpl <em>Resource Allocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceAllocationImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getResourceAllocation()
   * @generated
   */
  int RESOURCE_ALLOCATION = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ALLOCATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ALLOCATION__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Resource Allocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ALLOCATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceOutsourcingImpl <em>Resource Outsourcing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceOutsourcingImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getResourceOutsourcing()
   * @generated
   */
  int RESOURCE_OUTSOURCING = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OUTSOURCING__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OUTSOURCING__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Resource Outsourcing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OUTSOURCING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkSourceImpl <em>Work Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkSourceImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkSource()
   * @generated
   */
  int WORK_SOURCE = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Target Units</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE__TARGET_UNITS = 2;

  /**
   * The feature id for the '<em><b>Assignment Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE__ASSIGNMENT_RULE = 3;

  /**
   * The number of structural features of the '<em>Work Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl <em>Work Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItem()
   * @generated
   */
  int WORK_ITEM = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Profile</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__PROFILE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__PATTERN = 3;

  /**
   * The feature id for the '<em><b>Pattern Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__PATTERN_TYPE = 4;

  /**
   * The feature id for the '<em><b>PTasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__PTASKS = 5;

  /**
   * The feature id for the '<em><b>STasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__STASKS = 6;

  /**
   * The feature id for the '<em><b>Causal Triggers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__CAUSAL_TRIGGERS = 7;

  /**
   * The feature id for the '<em><b>Req Specialties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__REQ_SPECIALTIES = 8;

  /**
   * The feature id for the '<em><b>Befforts</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__BEFFORTS = 9;

  /**
   * The feature id for the '<em><b>Bvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__BVALUE = 10;

  /**
   * The feature id for the '<em><b>Lvalue</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__LVALUE = 11;

  /**
   * The feature id for the '<em><b>COS</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__COS = 12;

  /**
   * The feature id for the '<em><b>WItem Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__WITEM_SOURCE = 13;

  /**
   * The feature id for the '<em><b>Arrtime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__ARRTIME = 14;

  /**
   * The feature id for the '<em><b>Duedate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__DUEDATE = 15;

  /**
   * The number of structural features of the '<em>Work Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_FEATURE_COUNT = 16;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CausalityImpl <em>Causality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CausalityImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCausality()
   * @generated
   */
  int CAUSALITY = 21;

  /**
   * The feature id for the '<em><b>Triggered</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAUSALITY__TRIGGERED = 0;

  /**
   * The feature id for the '<em><b>TProgress</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAUSALITY__TPROGRESS = 1;

  /**
   * The feature id for the '<em><b>TProbability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAUSALITY__TPROBABILITY = 2;

  /**
   * The number of structural features of the '<em>Causality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAUSALITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.LocalValueImpl <em>Local Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.LocalValueImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getLocalValue()
   * @generated
   */
  int LOCAL_VALUE = 22;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VALUE__OWNER = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Local Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceTypeImpl <em>Service Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getServiceType()
   * @generated
   */
  int SERVICE_TYPE = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_TYPE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Service Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getService()
   * @generated
   */
  int SERVICE = 24;

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
   * The feature id for the '<em><b>Service Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__SERVICE_TYPE = 2;

  /**
   * The feature id for the '<em><b>Efficiency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__EFFICIENCY = 3;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getServiceProvider()
   * @generated
   */
  int SERVICE_PROVIDER = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Source Units</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__SOURCE_UNITS = 2;

  /**
   * The feature id for the '<em><b>Target Units</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__TARGET_UNITS = 3;

  /**
   * The feature id for the '<em><b>Subordinate Units</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__SUBORDINATE_UNITS = 4;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__SERVICES = 5;

  /**
   * The feature id for the '<em><b>Default Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__DEFAULT_STRATEGY = 6;

  /**
   * The feature id for the '<em><b>Acceptance Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__ACCEPTANCE_RULE = 7;

  /**
   * The feature id for the '<em><b>Selection Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__SELECTION_RULE = 8;

  /**
   * The feature id for the '<em><b>Assignment Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__ASSIGNMENT_RULE = 9;

  /**
   * The feature id for the '<em><b>Allocation Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__ALLOCATION_RULE = 10;

  /**
   * The feature id for the '<em><b>Outsourcing Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__OUTSOURCING_RULE = 11;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__RESOURCES = 12;

  /**
   * The number of structural features of the '<em>Service Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_FEATURE_COUNT = 13;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__SERVICES = 2;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl <em>Asset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAsset()
   * @generated
   */
  int ASSET = 27;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SkillImpl <em>Skill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SkillImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getSkill()
   * @generated
   */
  int SKILL = 28;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanTaskModelImpl <em>Kanban Task Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanTaskModelImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanTaskModel()
   * @generated
   */
  int KANBAN_TASK_MODEL = 29;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CapabilityImpl <em>Capability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CapabilityImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCapability()
   * @generated
   */
  int CAPABILITY = 30;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RequirementImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 31;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EntityImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 32;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ProvisionImpl <em>Provision</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ProvisionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getProvision()
   * @generated
   */
  int PROVISION = 33;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StatemachineImpl <em>Statemachine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StatemachineImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getStatemachine()
   * @generated
   */
  int STATEMACHINE = 34;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EventImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 35;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CommandImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 36;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StateImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getState()
   * @generated
   */
  int STATE = 37;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 38;

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
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem <em>Kanban Scheduling System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kanban Scheduling System</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem
   * @generated
   */
  EClass getKanbanSchedulingSystem();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getName()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EAttribute getKanbanSchedulingSystem_Name();

  /**
   * Returns the meta object for the attribute list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getTestItems <em>Test Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Test Items</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getTestItems()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EAttribute getKanbanSchedulingSystem_TestItems();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSSRepositories <em>KSS Repositories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>KSS Repositories</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSSRepositories()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_KSSRepositories();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getMechanisms <em>Mechanisms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mechanisms</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getMechanisms()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_Mechanisms();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSSSearchStrategies <em>KSS Search Strategies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>KSS Search Strategies</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSSSearchStrategies()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_KSSSearchStrategies();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSSTaskPatterns <em>KSS Task Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>KSS Task Patterns</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSSTaskPatterns()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_KSSTaskPatterns();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSStaskPatternTypes <em>KS Stask Pattern Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>KS Stask Pattern Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSStaskPatternTypes()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_KSStaskPatternTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSSValueFunctions <em>KSS Value Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>KSS Value Functions</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSSValueFunctions()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_KSSValueFunctions();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getSoSServices <em>So SServices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>So SServices</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getSoSServices()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_SoSServices();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getOrgUnits <em>Org Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Org Units</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getOrgUnits()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_OrgUnits();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKssSources <em>Kss Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Kss Sources</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKssSources()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_KssSources();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKssWItems <em>Kss WItems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Kss WItems</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKssWItems()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_KssWItems();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getReplications <em>Replications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replications</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getReplications()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EAttribute getKanbanSchedulingSystem_Replications();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getInterArrivalTime <em>Inter Arrival Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inter Arrival Time</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getInterArrivalTime()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EAttribute getKanbanSchedulingSystem_InterArrivalTime();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression <em>Num Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Num Expression</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression
   * @generated
   */
  EClass getNumExpression();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#getNumValue <em>Num Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#getNumValue()
   * @see #getNumExpression()
   * @generated
   */
  EAttribute getNumExpression_NumValue();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#isDistribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distribution</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#isDistribution()
   * @see #getNumExpression()
   * @generated
   */
  EAttribute getNumExpression_Distribution();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#getNumDist <em>Num Dist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num Dist</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#getNumDist()
   * @see #getNumExpression()
   * @generated
   */
  EReference getNumExpression_NumDist();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Distribution</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution
   * @generated
   */
  EClass getDistribution();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution#getType()
   * @see #getDistribution()
   * @generated
   */
  EAttribute getDistribution_Type();

  /**
   * Returns the meta object for the attribute list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution#getParameters()
   * @see #getDistribution()
   * @generated
   */
  EAttribute getDistribution_Parameters();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Repository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Repository
   * @generated
   */
  EClass getRepository();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Repository#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Repository#getType()
   * @see #getRepository()
   * @generated
   */
  EReference getRepository_Type();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Repository#getProfiles <em>Profiles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Profiles</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Repository#getProfiles()
   * @see #getRepository()
   * @generated
   */
  EReference getRepository_Profiles();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile <em>Work Item Profile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Item Profile</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile
   * @generated
   */
  EClass getWorkItemProfile();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getName()
   * @see #getWorkItemProfile()
   * @generated
   */
  EAttribute getWorkItemProfile_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getDescription()
   * @see #getWorkItemProfile()
   * @generated
   */
  EAttribute getWorkItemProfile_Description();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getRefTasks <em>Ref Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Tasks</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getRefTasks()
   * @see #getWorkItemProfile()
   * @generated
   */
  EReference getWorkItemProfile_RefTasks();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getDecTasks <em>Dec Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dec Tasks</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getDecTasks()
   * @see #getWorkItemProfile()
   * @generated
   */
  EReference getWorkItemProfile_DecTasks();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getReqSpecialties <em>Req Specialties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Req Specialties</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getReqSpecialties()
   * @see #getWorkItemProfile()
   * @generated
   */
  EReference getWorkItemProfile_ReqSpecialties();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getBefforts <em>Befforts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Befforts</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getBefforts()
   * @see #getWorkItemProfile()
   * @generated
   */
  EReference getWorkItemProfile_Befforts();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getBvalue <em>Bvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bvalue</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getBvalue()
   * @see #getWorkItemProfile()
   * @generated
   */
  EReference getWorkItemProfile_Bvalue();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getCOS <em>COS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>COS</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getCOS()
   * @see #getWorkItemProfile()
   * @generated
   */
  EAttribute getWorkItemProfile_COS();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkReference <em>Work Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Reference</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkReference
   * @generated
   */
  EClass getWorkReference();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkReference#getWorkItem <em>Work Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Work Item</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkReference#getWorkItem()
   * @see #getWorkReference()
   * @generated
   */
  EReference getWorkReference_WorkItem();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkReference#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Amount</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkReference#getAmount()
   * @see #getWorkReference()
   * @generated
   */
  EReference getWorkReference_Amount();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition <em>Work Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Decomposition</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition
   * @generated
   */
  EClass getWorkDecomposition();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition#getWorkItem <em>Work Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Work Item</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition#getWorkItem()
   * @see #getWorkDecomposition()
   * @generated
   */
  EReference getWorkDecomposition_WorkItem();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Amount</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition#getAmount()
   * @see #getWorkDecomposition()
   * @generated
   */
  EReference getWorkDecomposition_Amount();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkPrecedency <em>Work Precedency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Precedency</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkPrecedency
   * @generated
   */
  EClass getWorkPrecedency();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkPrecedency#getWorkItem <em>Work Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Work Item</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkPrecedency#getWorkItem()
   * @see #getWorkPrecedency()
   * @generated
   */
  EReference getWorkPrecedency_WorkItem();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkCausality <em>Work Causality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Causality</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkCausality
   * @generated
   */
  EClass getWorkCausality();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkCausality#getWorkItem <em>Work Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Work Item</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkCausality#getWorkItem()
   * @see #getWorkCausality()
   * @generated
   */
  EReference getWorkCausality_WorkItem();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskPattern <em>Task Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Pattern</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TaskPattern
   * @generated
   */
  EClass getTaskPattern();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskPattern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TaskPattern#getName()
   * @see #getTaskPattern()
   * @generated
   */
  EAttribute getTaskPattern_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskPattern#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TaskPattern#getDescription()
   * @see #getTaskPattern()
   * @generated
   */
  EAttribute getTaskPattern_Description();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskPattern#getTaskpatternTypes <em>Taskpattern Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Taskpattern Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TaskPattern#getTaskpatternTypes()
   * @see #getTaskPattern()
   * @generated
   */
  EReference getTaskPattern_TaskpatternTypes();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType <em>Task Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType
   * @generated
   */
  EClass getTaskType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType#getName()
   * @see #getTaskType()
   * @generated
   */
  EAttribute getTaskType_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType#getDescription()
   * @see #getTaskType()
   * @generated
   */
  EAttribute getTaskType_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction <em>Value Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Function</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction
   * @generated
   */
  EClass getValueFunction();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction#getName()
   * @see #getValueFunction()
   * @generated
   */
  EAttribute getValueFunction_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction#getDescription()
   * @see #getValueFunction()
   * @generated
   */
  EAttribute getValueFunction_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism <em>Mechanism</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mechanism</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism
   * @generated
   */
  EClass getMechanism();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getName()
   * @see #getMechanism()
   * @generated
   */
  EAttribute getMechanism_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getDescription()
   * @see #getMechanism()
   * @generated
   */
  EAttribute getMechanism_Description();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getProcesstype <em>Processtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Processtype</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getProcesstype()
   * @see #getMechanism()
   * @generated
   */
  EAttribute getMechanism_Processtype();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getStrategies <em>Strategies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Strategies</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getStrategies()
   * @see #getMechanism()
   * @generated
   */
  EReference getMechanism_Strategies();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Strategy</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy
   * @generated
   */
  EClass getStrategy();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy#getName()
   * @see #getStrategy()
   * @generated
   */
  EAttribute getStrategy_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy#getDescription()
   * @see #getStrategy()
   * @generated
   */
  EAttribute getStrategy_Description();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy#getWIAcceptanceRule <em>WI Acceptance Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>WI Acceptance Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy#getWIAcceptanceRule()
   * @see #getStrategy()
   * @generated
   */
  EReference getStrategy_WIAcceptanceRule();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy#getWISelectionRule <em>WI Selection Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>WI Selection Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy#getWISelectionRule()
   * @see #getStrategy()
   * @generated
   */
  EReference getStrategy_WISelectionRule();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy#getWIAssignmentRule <em>WI Assignment Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>WI Assignment Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy#getWIAssignmentRule()
   * @see #getStrategy()
   * @generated
   */
  EReference getStrategy_WIAssignmentRule();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy#getResourceAllocationRule <em>Resource Allocation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource Allocation Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy#getResourceAllocationRule()
   * @see #getStrategy()
   * @generated
   */
  EReference getStrategy_ResourceAllocationRule();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy#getResourceOutsourcingRule <em>Resource Outsourcing Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource Outsourcing Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy#getResourceOutsourcingRule()
   * @see #getStrategy()
   * @generated
   */
  EReference getStrategy_ResourceOutsourcingRule();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance <em>WI Acceptance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WI Acceptance</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance
   * @generated
   */
  EClass getWIAcceptance();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getName()
   * @see #getWIAcceptance()
   * @generated
   */
  EAttribute getWIAcceptance_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getDescription()
   * @see #getWIAcceptance()
   * @generated
   */
  EAttribute getWIAcceptance_Description();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getBacklogQLimit <em>Backlog QLimit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Backlog QLimit</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getBacklogQLimit()
   * @see #getWIAcceptance()
   * @generated
   */
  EAttribute getWIAcceptance_BacklogQLimit();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getReadyQLimit <em>Ready QLimit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ready QLimit</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getReadyQLimit()
   * @see #getWIAcceptance()
   * @generated
   */
  EAttribute getWIAcceptance_ReadyQLimit();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection <em>WI Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WI Selection</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection
   * @generated
   */
  EClass getWISelection();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection#getName()
   * @see #getWISelection()
   * @generated
   */
  EAttribute getWISelection_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection#getDescription()
   * @see #getWISelection()
   * @generated
   */
  EAttribute getWISelection_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment <em>WI Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WI Assignment</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment
   * @generated
   */
  EClass getWIAssignment();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment#getName()
   * @see #getWIAssignment()
   * @generated
   */
  EAttribute getWIAssignment_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment#getDescription()
   * @see #getWIAssignment()
   * @generated
   */
  EAttribute getWIAssignment_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation <em>Resource Allocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Allocation</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation
   * @generated
   */
  EClass getResourceAllocation();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation#getName()
   * @see #getResourceAllocation()
   * @generated
   */
  EAttribute getResourceAllocation_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation#getDescription()
   * @see #getResourceAllocation()
   * @generated
   */
  EAttribute getResourceAllocation_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing <em>Resource Outsourcing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Outsourcing</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing
   * @generated
   */
  EClass getResourceOutsourcing();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing#getName()
   * @see #getResourceOutsourcing()
   * @generated
   */
  EAttribute getResourceOutsourcing_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing#getDescription()
   * @see #getResourceOutsourcing()
   * @generated
   */
  EAttribute getResourceOutsourcing_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource <em>Work Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Source</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource
   * @generated
   */
  EClass getWorkSource();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getName()
   * @see #getWorkSource()
   * @generated
   */
  EAttribute getWorkSource_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getDescription()
   * @see #getWorkSource()
   * @generated
   */
  EAttribute getWorkSource_Description();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getTargetUnits <em>Target Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Target Units</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getTargetUnits()
   * @see #getWorkSource()
   * @generated
   */
  EReference getWorkSource_TargetUnits();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getAssignmentRule <em>Assignment Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignment Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getAssignmentRule()
   * @see #getWorkSource()
   * @generated
   */
  EReference getWorkSource_AssignmentRule();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem <em>Work Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Item</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem
   * @generated
   */
  EClass getWorkItem();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getName()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Name();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getProfile <em>Profile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Profile</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getProfile()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_Profile();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDescription()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Description();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pattern</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPattern()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_Pattern();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPatternType <em>Pattern Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pattern Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPatternType()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_PatternType();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPTasks <em>PTasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>PTasks</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPTasks()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_PTasks();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getSTasks <em>STasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>STasks</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getSTasks()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_STasks();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getCausalTriggers <em>Causal Triggers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Causal Triggers</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getCausalTriggers()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_CausalTriggers();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getReqSpecialties <em>Req Specialties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Req Specialties</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getReqSpecialties()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_ReqSpecialties();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getBefforts <em>Befforts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Befforts</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getBefforts()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Befforts();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getBvalue <em>Bvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bvalue</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getBvalue()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Bvalue();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getLvalue <em>Lvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lvalue</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getLvalue()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_Lvalue();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getCOS <em>COS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>COS</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getCOS()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_COS();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getWItemSource <em>WItem Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>WItem Source</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getWItemSource()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_WItemSource();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getArrtime <em>Arrtime</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arrtime</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getArrtime()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Arrtime();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDuedate <em>Duedate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duedate</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDuedate()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Duedate();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality <em>Causality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Causality</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Causality
   * @generated
   */
  EClass getCausality();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality#getTriggered <em>Triggered</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Triggered</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Causality#getTriggered()
   * @see #getCausality()
   * @generated
   */
  EReference getCausality_Triggered();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality#getTProgress <em>TProgress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>TProgress</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Causality#getTProgress()
   * @see #getCausality()
   * @generated
   */
  EAttribute getCausality_TProgress();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality#getTProbability <em>TProbability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>TProbability</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Causality#getTProbability()
   * @see #getCausality()
   * @generated
   */
  EAttribute getCausality_TProbability();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.LocalValue <em>Local Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.LocalValue
   * @generated
   */
  EClass getLocalValue();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.LocalValue#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Owner</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.LocalValue#getOwner()
   * @see #getLocalValue()
   * @generated
   */
  EReference getLocalValue_Owner();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.LocalValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.LocalValue#getValue()
   * @see #getLocalValue()
   * @generated
   */
  EAttribute getLocalValue_Value();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceType <em>Service Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceType
   * @generated
   */
  EClass getServiceType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceType#getName()
   * @see #getServiceType()
   * @generated
   */
  EAttribute getServiceType_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceType#getDescription()
   * @see #getServiceType()
   * @generated
   */
  EAttribute getServiceType_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Service#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Service#getDescription()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Description();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Service#getServiceType <em>Service Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Service Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Service#getServiceType()
   * @see #getService()
   * @generated
   */
  EReference getService_ServiceType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Service#getEfficiency <em>Efficiency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Efficiency</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Service#getEfficiency()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Efficiency();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider <em>Service Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Provider</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider
   * @generated
   */
  EClass getServiceProvider();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getName()
   * @see #getServiceProvider()
   * @generated
   */
  EAttribute getServiceProvider_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getDescription()
   * @see #getServiceProvider()
   * @generated
   */
  EAttribute getServiceProvider_Description();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getSourceUnits <em>Source Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Source Units</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getSourceUnits()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_SourceUnits();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getTargetUnits <em>Target Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Target Units</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getTargetUnits()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_TargetUnits();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getSubordinateUnits <em>Subordinate Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Subordinate Units</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getSubordinateUnits()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_SubordinateUnits();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Services</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getServices()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_Services();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getDefaultStrategy <em>Default Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Default Strategy</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getDefaultStrategy()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_DefaultStrategy();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getAcceptanceRule <em>Acceptance Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Acceptance Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getAcceptanceRule()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_AcceptanceRule();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getSelectionRule <em>Selection Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selection Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getSelectionRule()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_SelectionRule();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getAssignmentRule <em>Assignment Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignment Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getAssignmentRule()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_AssignmentRule();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getAllocationRule <em>Allocation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Allocation Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getAllocationRule()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_AllocationRule();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getOutsourcingRule <em>Outsourcing Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Outsourcing Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getOutsourcingRule()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_OutsourcingRule();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getResources()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_Resources();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Resource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Resource#getName()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Resource#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Resource#getDescription()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Description();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Resource#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Services</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Resource#getServices()
   * @see #getResource()
   * @generated
   */
  EReference getResource_Services();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Asset <em>Asset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asset</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Asset
   * @generated
   */
  EClass getAsset();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Asset#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Asset#getName()
   * @see #getAsset()
   * @generated
   */
  EAttribute getAsset_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Asset#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Asset#getDescription()
   * @see #getAsset()
   * @generated
   */
  EAttribute getAsset_Description();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Asset#getHasSkills <em>Has Skills</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Has Skills</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Asset#getHasSkills()
   * @see #getAsset()
   * @generated
   */
  EReference getAsset_HasSkills();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Skill <em>Skill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Skill</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Skill
   * @generated
   */
  EClass getSkill();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Skill#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Skill#getName()
   * @see #getSkill()
   * @generated
   */
  EAttribute getSkill_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Skill#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Skill#getDescription()
   * @see #getSkill()
   * @generated
   */
  EAttribute getSkill_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel <em>Kanban Task Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kanban Task Model</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel
   * @generated
   */
  EClass getKanbanTaskModel();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel#getName()
   * @see #getKanbanTaskModel()
   * @generated
   */
  EAttribute getKanbanTaskModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel#getCaps <em>Caps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Caps</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel#getCaps()
   * @see #getKanbanTaskModel()
   * @generated
   */
  EReference getKanbanTaskModel_Caps();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Capability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capability</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Capability
   * @generated
   */
  EClass getCapability();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Capability#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Capability#getName()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Capability#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Capability#getDescription()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Description();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Capability#getReqs <em>Reqs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reqs</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Capability#getReqs()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_Reqs();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement
   * @generated
   */
  EClass getRequirement();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getName()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getDescription()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Description();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getRTasks <em>RTasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>RTasks</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getRTasks()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_RTasks();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dependencies</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getDependencies()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Dependencies();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getSdname <em>Sdname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sdname</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getSdname()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Sdname();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getServiceProvisions <em>Service Provisions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service Provisions</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getServiceProvisions()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_ServiceProvisions();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getEntityBehavior <em>Entity Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity Behavior</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getEntityBehavior()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_EntityBehavior();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Provision <em>Provision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provision</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Provision
   * @generated
   */
  EClass getProvision();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Provision#getServiceName <em>Service Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Service Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Provision#getServiceName()
   * @see #getProvision()
   * @generated
   */
  EReference getProvision_ServiceName();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Provision#getProviders <em>Providers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Providers</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Provision#getProviders()
   * @see #getProvision()
   * @generated
   */
  EReference getProvision_Providers();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine <em>Statemachine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statemachine</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine
   * @generated
   */
  EClass getStatemachine();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getEvents()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Events();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getCommands()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Commands();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getStates()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_States();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Event#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Event#getCode()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Code();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Command#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Command#getName()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Command#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Command#getCode()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Code();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.State#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Actions</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.State#getActions()
   * @see #getState()
   * @generated
   */
  EReference getState_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.State#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.State#getTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_Transitions();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getEvent()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Event();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_State();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getEventactions <em>Eventactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Eventactions</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getEventactions()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl <em>Kanban Scheduling System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanSchedulingSystem()
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
     * The meta object literal for the '<em><b>Test Items</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KANBAN_SCHEDULING_SYSTEM__TEST_ITEMS = eINSTANCE.getKanbanSchedulingSystem_TestItems();

    /**
     * The meta object literal for the '<em><b>KSS Repositories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__KSS_REPOSITORIES = eINSTANCE.getKanbanSchedulingSystem_KSSRepositories();

    /**
     * The meta object literal for the '<em><b>Mechanisms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__MECHANISMS = eINSTANCE.getKanbanSchedulingSystem_Mechanisms();

    /**
     * The meta object literal for the '<em><b>KSS Search Strategies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__KSS_SEARCH_STRATEGIES = eINSTANCE.getKanbanSchedulingSystem_KSSSearchStrategies();

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
     * The meta object literal for the '<em><b>KSS Value Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__KSS_VALUE_FUNCTIONS = eINSTANCE.getKanbanSchedulingSystem_KSSValueFunctions();

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
     * The meta object literal for the '<em><b>Kss Sources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__KSS_SOURCES = eINSTANCE.getKanbanSchedulingSystem_KssSources();

    /**
     * The meta object literal for the '<em><b>Kss WItems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__KSS_WITEMS = eINSTANCE.getKanbanSchedulingSystem_KssWItems();

    /**
     * The meta object literal for the '<em><b>Replications</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KANBAN_SCHEDULING_SYSTEM__REPLICATIONS = eINSTANCE.getKanbanSchedulingSystem_Replications();

    /**
     * The meta object literal for the '<em><b>Inter Arrival Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KANBAN_SCHEDULING_SYSTEM__INTER_ARRIVAL_TIME = eINSTANCE.getKanbanSchedulingSystem_InterArrivalTime();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.NumExpressionImpl <em>Num Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.NumExpressionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getNumExpression()
     * @generated
     */
    EClass NUM_EXPRESSION = eINSTANCE.getNumExpression();

    /**
     * The meta object literal for the '<em><b>Num Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUM_EXPRESSION__NUM_VALUE = eINSTANCE.getNumExpression_NumValue();

    /**
     * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUM_EXPRESSION__DISTRIBUTION = eINSTANCE.getNumExpression_Distribution();

    /**
     * The meta object literal for the '<em><b>Num Dist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUM_EXPRESSION__NUM_DIST = eINSTANCE.getNumExpression_NumDist();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl <em>Distribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getDistribution()
     * @generated
     */
    EClass DISTRIBUTION = eINSTANCE.getDistribution();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTION__TYPE = eINSTANCE.getDistribution_Type();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTION__PARAMETERS = eINSTANCE.getDistribution_Parameters();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RepositoryImpl <em>Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RepositoryImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getRepository()
     * @generated
     */
    EClass REPOSITORY = eINSTANCE.getRepository();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY__TYPE = eINSTANCE.getRepository_Type();

    /**
     * The meta object literal for the '<em><b>Profiles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY__PROFILES = eINSTANCE.getRepository_Profiles();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl <em>Work Item Profile</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItemProfile()
     * @generated
     */
    EClass WORK_ITEM_PROFILE = eINSTANCE.getWorkItemProfile();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_PROFILE__NAME = eINSTANCE.getWorkItemProfile_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_PROFILE__DESCRIPTION = eINSTANCE.getWorkItemProfile_Description();

    /**
     * The meta object literal for the '<em><b>Ref Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM_PROFILE__REF_TASKS = eINSTANCE.getWorkItemProfile_RefTasks();

    /**
     * The meta object literal for the '<em><b>Dec Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM_PROFILE__DEC_TASKS = eINSTANCE.getWorkItemProfile_DecTasks();

    /**
     * The meta object literal for the '<em><b>Req Specialties</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM_PROFILE__REQ_SPECIALTIES = eINSTANCE.getWorkItemProfile_ReqSpecialties();

    /**
     * The meta object literal for the '<em><b>Befforts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM_PROFILE__BEFFORTS = eINSTANCE.getWorkItemProfile_Befforts();

    /**
     * The meta object literal for the '<em><b>Bvalue</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM_PROFILE__BVALUE = eINSTANCE.getWorkItemProfile_Bvalue();

    /**
     * The meta object literal for the '<em><b>COS</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_PROFILE__COS = eINSTANCE.getWorkItemProfile_COS();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkReferenceImpl <em>Work Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkReferenceImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkReference()
     * @generated
     */
    EClass WORK_REFERENCE = eINSTANCE.getWorkReference();

    /**
     * The meta object literal for the '<em><b>Work Item</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_REFERENCE__WORK_ITEM = eINSTANCE.getWorkReference_WorkItem();

    /**
     * The meta object literal for the '<em><b>Amount</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_REFERENCE__AMOUNT = eINSTANCE.getWorkReference_Amount();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkDecompositionImpl <em>Work Decomposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkDecompositionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkDecomposition()
     * @generated
     */
    EClass WORK_DECOMPOSITION = eINSTANCE.getWorkDecomposition();

    /**
     * The meta object literal for the '<em><b>Work Item</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_DECOMPOSITION__WORK_ITEM = eINSTANCE.getWorkDecomposition_WorkItem();

    /**
     * The meta object literal for the '<em><b>Amount</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_DECOMPOSITION__AMOUNT = eINSTANCE.getWorkDecomposition_Amount();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkPrecedencyImpl <em>Work Precedency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkPrecedencyImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkPrecedency()
     * @generated
     */
    EClass WORK_PRECEDENCY = eINSTANCE.getWorkPrecedency();

    /**
     * The meta object literal for the '<em><b>Work Item</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_PRECEDENCY__WORK_ITEM = eINSTANCE.getWorkPrecedency_WorkItem();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkCausalityImpl <em>Work Causality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkCausalityImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkCausality()
     * @generated
     */
    EClass WORK_CAUSALITY = eINSTANCE.getWorkCausality();

    /**
     * The meta object literal for the '<em><b>Work Item</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_CAUSALITY__WORK_ITEM = eINSTANCE.getWorkCausality_WorkItem();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskPatternImpl <em>Task Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskPatternImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTaskPattern()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskTypeImpl <em>Task Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskTypeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTaskType()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ValueFunctionImpl <em>Value Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ValueFunctionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getValueFunction()
     * @generated
     */
    EClass VALUE_FUNCTION = eINSTANCE.getValueFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_FUNCTION__NAME = eINSTANCE.getValueFunction_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_FUNCTION__DESCRIPTION = eINSTANCE.getValueFunction_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl <em>Mechanism</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getMechanism()
     * @generated
     */
    EClass MECHANISM = eINSTANCE.getMechanism();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECHANISM__NAME = eINSTANCE.getMechanism_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECHANISM__DESCRIPTION = eINSTANCE.getMechanism_Description();

    /**
     * The meta object literal for the '<em><b>Processtype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECHANISM__PROCESSTYPE = eINSTANCE.getMechanism_Processtype();

    /**
     * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MECHANISM__STRATEGIES = eINSTANCE.getMechanism_Strategies();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl <em>Strategy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getStrategy()
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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRATEGY__DESCRIPTION = eINSTANCE.getStrategy_Description();

    /**
     * The meta object literal for the '<em><b>WI Acceptance Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY__WI_ACCEPTANCE_RULE = eINSTANCE.getStrategy_WIAcceptanceRule();

    /**
     * The meta object literal for the '<em><b>WI Selection Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY__WI_SELECTION_RULE = eINSTANCE.getStrategy_WISelectionRule();

    /**
     * The meta object literal for the '<em><b>WI Assignment Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY__WI_ASSIGNMENT_RULE = eINSTANCE.getStrategy_WIAssignmentRule();

    /**
     * The meta object literal for the '<em><b>Resource Allocation Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY__RESOURCE_ALLOCATION_RULE = eINSTANCE.getStrategy_ResourceAllocationRule();

    /**
     * The meta object literal for the '<em><b>Resource Outsourcing Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY__RESOURCE_OUTSOURCING_RULE = eINSTANCE.getStrategy_ResourceOutsourcingRule();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceImpl <em>WI Acceptance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWIAcceptance()
     * @generated
     */
    EClass WI_ACCEPTANCE = eINSTANCE.getWIAcceptance();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_ACCEPTANCE__NAME = eINSTANCE.getWIAcceptance_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_ACCEPTANCE__DESCRIPTION = eINSTANCE.getWIAcceptance_Description();

    /**
     * The meta object literal for the '<em><b>Backlog QLimit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_ACCEPTANCE__BACKLOG_QLIMIT = eINSTANCE.getWIAcceptance_BacklogQLimit();

    /**
     * The meta object literal for the '<em><b>Ready QLimit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_ACCEPTANCE__READY_QLIMIT = eINSTANCE.getWIAcceptance_ReadyQLimit();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WISelectionImpl <em>WI Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WISelectionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWISelection()
     * @generated
     */
    EClass WI_SELECTION = eINSTANCE.getWISelection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_SELECTION__NAME = eINSTANCE.getWISelection_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_SELECTION__DESCRIPTION = eINSTANCE.getWISelection_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAssignmentImpl <em>WI Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAssignmentImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWIAssignment()
     * @generated
     */
    EClass WI_ASSIGNMENT = eINSTANCE.getWIAssignment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_ASSIGNMENT__NAME = eINSTANCE.getWIAssignment_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_ASSIGNMENT__DESCRIPTION = eINSTANCE.getWIAssignment_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceAllocationImpl <em>Resource Allocation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceAllocationImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getResourceAllocation()
     * @generated
     */
    EClass RESOURCE_ALLOCATION = eINSTANCE.getResourceAllocation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_ALLOCATION__NAME = eINSTANCE.getResourceAllocation_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_ALLOCATION__DESCRIPTION = eINSTANCE.getResourceAllocation_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceOutsourcingImpl <em>Resource Outsourcing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceOutsourcingImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getResourceOutsourcing()
     * @generated
     */
    EClass RESOURCE_OUTSOURCING = eINSTANCE.getResourceOutsourcing();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_OUTSOURCING__NAME = eINSTANCE.getResourceOutsourcing_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_OUTSOURCING__DESCRIPTION = eINSTANCE.getResourceOutsourcing_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkSourceImpl <em>Work Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkSourceImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkSource()
     * @generated
     */
    EClass WORK_SOURCE = eINSTANCE.getWorkSource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_SOURCE__NAME = eINSTANCE.getWorkSource_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_SOURCE__DESCRIPTION = eINSTANCE.getWorkSource_Description();

    /**
     * The meta object literal for the '<em><b>Target Units</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_SOURCE__TARGET_UNITS = eINSTANCE.getWorkSource_TargetUnits();

    /**
     * The meta object literal for the '<em><b>Assignment Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_SOURCE__ASSIGNMENT_RULE = eINSTANCE.getWorkSource_AssignmentRule();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl <em>Work Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItem()
     * @generated
     */
    EClass WORK_ITEM = eINSTANCE.getWorkItem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__NAME = eINSTANCE.getWorkItem_Name();

    /**
     * The meta object literal for the '<em><b>Profile</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__PROFILE = eINSTANCE.getWorkItem_Profile();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__DESCRIPTION = eINSTANCE.getWorkItem_Description();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__PATTERN = eINSTANCE.getWorkItem_Pattern();

    /**
     * The meta object literal for the '<em><b>Pattern Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__PATTERN_TYPE = eINSTANCE.getWorkItem_PatternType();

    /**
     * The meta object literal for the '<em><b>PTasks</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__PTASKS = eINSTANCE.getWorkItem_PTasks();

    /**
     * The meta object literal for the '<em><b>STasks</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__STASKS = eINSTANCE.getWorkItem_STasks();

    /**
     * The meta object literal for the '<em><b>Causal Triggers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__CAUSAL_TRIGGERS = eINSTANCE.getWorkItem_CausalTriggers();

    /**
     * The meta object literal for the '<em><b>Req Specialties</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__REQ_SPECIALTIES = eINSTANCE.getWorkItem_ReqSpecialties();

    /**
     * The meta object literal for the '<em><b>Befforts</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__BEFFORTS = eINSTANCE.getWorkItem_Befforts();

    /**
     * The meta object literal for the '<em><b>Bvalue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__BVALUE = eINSTANCE.getWorkItem_Bvalue();

    /**
     * The meta object literal for the '<em><b>Lvalue</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__LVALUE = eINSTANCE.getWorkItem_Lvalue();

    /**
     * The meta object literal for the '<em><b>COS</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__COS = eINSTANCE.getWorkItem_COS();

    /**
     * The meta object literal for the '<em><b>WItem Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__WITEM_SOURCE = eINSTANCE.getWorkItem_WItemSource();

    /**
     * The meta object literal for the '<em><b>Arrtime</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__ARRTIME = eINSTANCE.getWorkItem_Arrtime();

    /**
     * The meta object literal for the '<em><b>Duedate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__DUEDATE = eINSTANCE.getWorkItem_Duedate();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CausalityImpl <em>Causality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CausalityImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCausality()
     * @generated
     */
    EClass CAUSALITY = eINSTANCE.getCausality();

    /**
     * The meta object literal for the '<em><b>Triggered</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAUSALITY__TRIGGERED = eINSTANCE.getCausality_Triggered();

    /**
     * The meta object literal for the '<em><b>TProgress</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAUSALITY__TPROGRESS = eINSTANCE.getCausality_TProgress();

    /**
     * The meta object literal for the '<em><b>TProbability</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAUSALITY__TPROBABILITY = eINSTANCE.getCausality_TProbability();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.LocalValueImpl <em>Local Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.LocalValueImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getLocalValue()
     * @generated
     */
    EClass LOCAL_VALUE = eINSTANCE.getLocalValue();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_VALUE__OWNER = eINSTANCE.getLocalValue_Owner();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_VALUE__VALUE = eINSTANCE.getLocalValue_Value();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceTypeImpl <em>Service Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceTypeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getServiceType()
     * @generated
     */
    EClass SERVICE_TYPE = eINSTANCE.getServiceType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_TYPE__NAME = eINSTANCE.getServiceType_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_TYPE__DESCRIPTION = eINSTANCE.getServiceType_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getService()
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
     * The meta object literal for the '<em><b>Service Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__SERVICE_TYPE = eINSTANCE.getService_ServiceType();

    /**
     * The meta object literal for the '<em><b>Efficiency</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__EFFICIENCY = eINSTANCE.getService_Efficiency();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getServiceProvider()
     * @generated
     */
    EClass SERVICE_PROVIDER = eINSTANCE.getServiceProvider();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER__NAME = eINSTANCE.getServiceProvider_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER__DESCRIPTION = eINSTANCE.getServiceProvider_Description();

    /**
     * The meta object literal for the '<em><b>Source Units</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__SOURCE_UNITS = eINSTANCE.getServiceProvider_SourceUnits();

    /**
     * The meta object literal for the '<em><b>Target Units</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__TARGET_UNITS = eINSTANCE.getServiceProvider_TargetUnits();

    /**
     * The meta object literal for the '<em><b>Subordinate Units</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__SUBORDINATE_UNITS = eINSTANCE.getServiceProvider_SubordinateUnits();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__SERVICES = eINSTANCE.getServiceProvider_Services();

    /**
     * The meta object literal for the '<em><b>Default Strategy</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__DEFAULT_STRATEGY = eINSTANCE.getServiceProvider_DefaultStrategy();

    /**
     * The meta object literal for the '<em><b>Acceptance Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__ACCEPTANCE_RULE = eINSTANCE.getServiceProvider_AcceptanceRule();

    /**
     * The meta object literal for the '<em><b>Selection Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__SELECTION_RULE = eINSTANCE.getServiceProvider_SelectionRule();

    /**
     * The meta object literal for the '<em><b>Assignment Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__ASSIGNMENT_RULE = eINSTANCE.getServiceProvider_AssignmentRule();

    /**
     * The meta object literal for the '<em><b>Allocation Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__ALLOCATION_RULE = eINSTANCE.getServiceProvider_AllocationRule();

    /**
     * The meta object literal for the '<em><b>Outsourcing Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__OUTSOURCING_RULE = eINSTANCE.getServiceProvider_OutsourcingRule();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__RESOURCES = eINSTANCE.getServiceProvider_Resources();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__DESCRIPTION = eINSTANCE.getResource_Description();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__SERVICES = eINSTANCE.getResource_Services();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl <em>Asset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAsset()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SkillImpl <em>Skill</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SkillImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getSkill()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanTaskModelImpl <em>Kanban Task Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanTaskModelImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanTaskModel()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CapabilityImpl <em>Capability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CapabilityImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCapability()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RequirementImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getRequirement()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EntityImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getEntity()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ProvisionImpl <em>Provision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ProvisionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getProvision()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StatemachineImpl <em>Statemachine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StatemachineImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getStatemachine()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EventImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getEvent()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CommandImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCommand()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StateImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getState()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTransition()
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
