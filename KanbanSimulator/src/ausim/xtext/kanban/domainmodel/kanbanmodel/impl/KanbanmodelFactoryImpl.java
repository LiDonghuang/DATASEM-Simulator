/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KanbanmodelFactoryImpl extends EFactoryImpl implements KanbanmodelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KanbanmodelFactory init()
  {
    try
    {
      KanbanmodelFactory theKanbanmodelFactory = (KanbanmodelFactory)EPackage.Registry.INSTANCE.getEFactory(KanbanmodelPackage.eNS_URI);
      if (theKanbanmodelFactory != null)
      {
        return theKanbanmodelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new KanbanmodelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KanbanmodelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM: return createKanbanSchedulingSystem();
      case KanbanmodelPackage.TASK_PATTERN: return createTaskPattern();
      case KanbanmodelPackage.TASK_TYPE: return createTaskType();
      case KanbanmodelPackage.VALUE_FUNCTION: return createValueFunction();
      case KanbanmodelPackage.MECHANISM: return createMechanism();
      case KanbanmodelPackage.STRATEGY: return createStrategy();
      case KanbanmodelPackage.WI_ACCEPTANCE: return createWIAcceptance();
      case KanbanmodelPackage.WI_SELECTION: return createWISelection();
      case KanbanmodelPackage.WI_ASSIGNMENT: return createWIAssignment();
      case KanbanmodelPackage.RESOURCE_ALLOCATION: return createResourceAllocation();
      case KanbanmodelPackage.RESOURCE_OUTSOURCING: return createResourceOutsourcing();
      case KanbanmodelPackage.WORK_SOURCE: return createWorkSource();
      case KanbanmodelPackage.WORK_ITEM: return createWorkItem();
      case KanbanmodelPackage.CAUSALITY: return createCausality();
      case KanbanmodelPackage.LOCAL_VALUE: return createLocalValue();
      case KanbanmodelPackage.SERVICE_TYPE: return createServiceType();
      case KanbanmodelPackage.SERVICE: return createService();
      case KanbanmodelPackage.SERVICE_PROVIDER: return createServiceProvider();
      case KanbanmodelPackage.RESOURCE: return createResource();
      case KanbanmodelPackage.ASSET: return createAsset();
      case KanbanmodelPackage.SKILL: return createSkill();
      case KanbanmodelPackage.KANBAN_TASK_MODEL: return createKanbanTaskModel();
      case KanbanmodelPackage.CAPABILITY: return createCapability();
      case KanbanmodelPackage.REQUIREMENT: return createRequirement();
      case KanbanmodelPackage.ENTITY: return createEntity();
      case KanbanmodelPackage.PROVISION: return createProvision();
      case KanbanmodelPackage.STATEMACHINE: return createStatemachine();
      case KanbanmodelPackage.EVENT: return createEvent();
      case KanbanmodelPackage.COMMAND: return createCommand();
      case KanbanmodelPackage.STATE: return createState();
      case KanbanmodelPackage.TRANSITION: return createTransition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KanbanSchedulingSystem createKanbanSchedulingSystem()
  {
    KanbanSchedulingSystemImpl kanbanSchedulingSystem = new KanbanSchedulingSystemImpl();
    return kanbanSchedulingSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskPattern createTaskPattern()
  {
    TaskPatternImpl taskPattern = new TaskPatternImpl();
    return taskPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskType createTaskType()
  {
    TaskTypeImpl taskType = new TaskTypeImpl();
    return taskType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueFunction createValueFunction()
  {
    ValueFunctionImpl valueFunction = new ValueFunctionImpl();
    return valueFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mechanism createMechanism()
  {
    MechanismImpl mechanism = new MechanismImpl();
    return mechanism;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Strategy createStrategy()
  {
    StrategyImpl strategy = new StrategyImpl();
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WIAcceptance createWIAcceptance()
  {
    WIAcceptanceImpl wiAcceptance = new WIAcceptanceImpl();
    return wiAcceptance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WISelection createWISelection()
  {
    WISelectionImpl wiSelection = new WISelectionImpl();
    return wiSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WIAssignment createWIAssignment()
  {
    WIAssignmentImpl wiAssignment = new WIAssignmentImpl();
    return wiAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceAllocation createResourceAllocation()
  {
    ResourceAllocationImpl resourceAllocation = new ResourceAllocationImpl();
    return resourceAllocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceOutsourcing createResourceOutsourcing()
  {
    ResourceOutsourcingImpl resourceOutsourcing = new ResourceOutsourcingImpl();
    return resourceOutsourcing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkSource createWorkSource()
  {
    WorkSourceImpl workSource = new WorkSourceImpl();
    return workSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkItem createWorkItem()
  {
    WorkItemImpl workItem = new WorkItemImpl();
    return workItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Causality createCausality()
  {
    CausalityImpl causality = new CausalityImpl();
    return causality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalValue createLocalValue()
  {
    LocalValueImpl localValue = new LocalValueImpl();
    return localValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceType createServiceType()
  {
    ServiceTypeImpl serviceType = new ServiceTypeImpl();
    return serviceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceProvider createServiceProvider()
  {
    ServiceProviderImpl serviceProvider = new ServiceProviderImpl();
    return serviceProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource createResource()
  {
    ResourceImpl resource = new ResourceImpl();
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Asset createAsset()
  {
    AssetImpl asset = new AssetImpl();
    return asset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Skill createSkill()
  {
    SkillImpl skill = new SkillImpl();
    return skill;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KanbanTaskModel createKanbanTaskModel()
  {
    KanbanTaskModelImpl kanbanTaskModel = new KanbanTaskModelImpl();
    return kanbanTaskModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Capability createCapability()
  {
    CapabilityImpl capability = new CapabilityImpl();
    return capability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement createRequirement()
  {
    RequirementImpl requirement = new RequirementImpl();
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Provision createProvision()
  {
    ProvisionImpl provision = new ProvisionImpl();
    return provision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statemachine createStatemachine()
  {
    StatemachineImpl statemachine = new StatemachineImpl();
    return statemachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KanbanmodelPackage getKanbanmodelPackage()
  {
    return (KanbanmodelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static KanbanmodelPackage getPackage()
  {
    return KanbanmodelPackage.eINSTANCE;
  }

} //KanbanmodelFactoryImpl
