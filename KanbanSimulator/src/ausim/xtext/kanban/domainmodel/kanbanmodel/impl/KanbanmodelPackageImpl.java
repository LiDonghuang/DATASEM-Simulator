/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.Asset;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Capability;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Causality;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Command;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Entity;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Event;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelFactory;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Provision;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Service;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ServiceType;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Skill;
import ausim.xtext.kanban.domainmodel.kanbanmodel.State;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Statemachine;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy;
import ausim.xtext.kanban.domainmodel.kanbanmodel.TaskPattern;
import ausim.xtext.kanban.domainmodel.kanbanmodel.TaskType;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Transition;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ValueFunction;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WIAssignment;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WISelection;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WorkSource;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KanbanmodelPackageImpl extends EPackageImpl implements KanbanmodelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kanbanSchedulingSystemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mechanismEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass strategyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wiAcceptanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wiSelectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wiAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceAllocationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceOutsourcingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass causalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass skillEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kanbanTaskModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass capabilityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass provisionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statemachineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private KanbanmodelPackageImpl()
  {
    super(eNS_URI, KanbanmodelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link KanbanmodelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static KanbanmodelPackage init()
  {
    if (isInited) return (KanbanmodelPackage)EPackage.Registry.INSTANCE.getEPackage(KanbanmodelPackage.eNS_URI);

    // Obtain or create and register package
    KanbanmodelPackageImpl theKanbanmodelPackage = (KanbanmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KanbanmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KanbanmodelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theKanbanmodelPackage.createPackageContents();

    // Initialize created meta-data
    theKanbanmodelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theKanbanmodelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(KanbanmodelPackage.eNS_URI, theKanbanmodelPackage);
    return theKanbanmodelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKanbanSchedulingSystem()
  {
    return kanbanSchedulingSystemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKanbanSchedulingSystem_Name()
  {
    return (EAttribute)kanbanSchedulingSystemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKanbanSchedulingSystem_Mechanisms()
  {
    return (EReference)kanbanSchedulingSystemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKanbanSchedulingSystem_KSSSearchStrategies()
  {
    return (EReference)kanbanSchedulingSystemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKanbanSchedulingSystem_KSSTaskPatterns()
  {
    return (EReference)kanbanSchedulingSystemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKanbanSchedulingSystem_KSStaskPatternTypes()
  {
    return (EReference)kanbanSchedulingSystemEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKanbanSchedulingSystem_KSSValueFunctions()
  {
    return (EReference)kanbanSchedulingSystemEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKanbanSchedulingSystem_SoSServices()
  {
    return (EReference)kanbanSchedulingSystemEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKanbanSchedulingSystem_OrgUnits()
  {
    return (EReference)kanbanSchedulingSystemEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKanbanSchedulingSystem_KssSources()
  {
    return (EReference)kanbanSchedulingSystemEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKanbanSchedulingSystem_KssWItems()
  {
    return (EReference)kanbanSchedulingSystemEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKanbanSchedulingSystem_Replications()
  {
    return (EAttribute)kanbanSchedulingSystemEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKanbanSchedulingSystem_InterArrivalTime()
  {
    return (EAttribute)kanbanSchedulingSystemEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskPattern()
  {
    return taskPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskPattern_Name()
  {
    return (EAttribute)taskPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskPattern_Description()
  {
    return (EAttribute)taskPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskPattern_TaskpatternTypes()
  {
    return (EReference)taskPatternEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskType()
  {
    return taskTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskType_Name()
  {
    return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskType_Description()
  {
    return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueFunction()
  {
    return valueFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueFunction_Name()
  {
    return (EAttribute)valueFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueFunction_Description()
  {
    return (EAttribute)valueFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMechanism()
  {
    return mechanismEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMechanism_Name()
  {
    return (EAttribute)mechanismEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMechanism_Description()
  {
    return (EAttribute)mechanismEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMechanism_Processtype()
  {
    return (EAttribute)mechanismEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMechanism_Strategies()
  {
    return (EReference)mechanismEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStrategy()
  {
    return strategyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStrategy_Name()
  {
    return (EAttribute)strategyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStrategy_Description()
  {
    return (EAttribute)strategyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStrategy_WIAcceptanceRule()
  {
    return (EReference)strategyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStrategy_WISelectionRule()
  {
    return (EReference)strategyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStrategy_WIAssignmentRule()
  {
    return (EReference)strategyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStrategy_ResourceAllocationRule()
  {
    return (EReference)strategyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStrategy_ResourceOutsourcingRule()
  {
    return (EReference)strategyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWIAcceptance()
  {
    return wiAcceptanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWIAcceptance_Name()
  {
    return (EAttribute)wiAcceptanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWIAcceptance_Description()
  {
    return (EAttribute)wiAcceptanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWIAcceptance_BacklogQLimit()
  {
    return (EAttribute)wiAcceptanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWIAcceptance_ReadyQLimit()
  {
    return (EAttribute)wiAcceptanceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWISelection()
  {
    return wiSelectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWISelection_Name()
  {
    return (EAttribute)wiSelectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWISelection_Description()
  {
    return (EAttribute)wiSelectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWIAssignment()
  {
    return wiAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWIAssignment_Name()
  {
    return (EAttribute)wiAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWIAssignment_Description()
  {
    return (EAttribute)wiAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceAllocation()
  {
    return resourceAllocationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceAllocation_Name()
  {
    return (EAttribute)resourceAllocationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceAllocation_Description()
  {
    return (EAttribute)resourceAllocationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceOutsourcing()
  {
    return resourceOutsourcingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceOutsourcing_Name()
  {
    return (EAttribute)resourceOutsourcingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceOutsourcing_Description()
  {
    return (EAttribute)resourceOutsourcingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkSource()
  {
    return workSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkSource_Name()
  {
    return (EAttribute)workSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkSource_Description()
  {
    return (EAttribute)workSourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkSource_AssignmentRule()
  {
    return (EReference)workSourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkItem()
  {
    return workItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_Name()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_Description()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_Pattern()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_PatternType()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_PTasks()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_STasks()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_CausalTriggers()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_ReqSpecialties()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_Befforts()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_Bvalue()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_COS()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_WItemSource()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_Arrtime()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_Duedate()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCausality()
  {
    return causalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCausality_Triggered()
  {
    return (EReference)causalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCausality_TProgress()
  {
    return (EAttribute)causalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCausality_TProbability()
  {
    return (EAttribute)causalityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceType()
  {
    return serviceTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceType_Name()
  {
    return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceType_Description()
  {
    return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getService()
  {
    return serviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Name()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Description()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getService_ServiceType()
  {
    return (EReference)serviceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Efficiency()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceProvider()
  {
    return serviceProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceProvider_Name()
  {
    return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceProvider_Description()
  {
    return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_SourceUnits()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_TargetUnits()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_SubordinateUnits()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_Resources()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_Services()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_DefaultStrategy()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_AcceptanceRule()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_SelectionRule()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_AssignmentRule()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_AllocationRule()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_OutsourcingRule()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAsset()
  {
    return assetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAsset_Name()
  {
    return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAsset_Description()
  {
    return (EAttribute)assetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsset_HasSkills()
  {
    return (EReference)assetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSkill()
  {
    return skillEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSkill_Name()
  {
    return (EAttribute)skillEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSkill_Description()
  {
    return (EAttribute)skillEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKanbanTaskModel()
  {
    return kanbanTaskModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKanbanTaskModel_Name()
  {
    return (EAttribute)kanbanTaskModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKanbanTaskModel_Caps()
  {
    return (EReference)kanbanTaskModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCapability()
  {
    return capabilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapability_Name()
  {
    return (EAttribute)capabilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapability_Description()
  {
    return (EAttribute)capabilityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapability_Reqs()
  {
    return (EReference)capabilityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequirement()
  {
    return requirementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_Name()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_Description()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_RTasks()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_Dependencies()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_Name()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_Sdname()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_ServiceProvisions()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_EntityBehavior()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProvision()
  {
    return provisionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvision_ServiceName()
  {
    return (EReference)provisionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvision_Providers()
  {
    return (EReference)provisionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatemachine()
  {
    return statemachineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatemachine_Events()
  {
    return (EReference)statemachineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatemachine_Commands()
  {
    return (EReference)statemachineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatemachine_States()
  {
    return (EReference)statemachineEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvent_Name()
  {
    return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvent_Code()
  {
    return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommand()
  {
    return commandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommand_Name()
  {
    return (EAttribute)commandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommand_Code()
  {
    return (EAttribute)commandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getState()
  {
    return stateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_Name()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_Actions()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_Transitions()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransition()
  {
    return transitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_Event()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_State()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_Eventactions()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KanbanmodelFactory getKanbanmodelFactory()
  {
    return (KanbanmodelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    kanbanSchedulingSystemEClass = createEClass(KANBAN_SCHEDULING_SYSTEM);
    createEAttribute(kanbanSchedulingSystemEClass, KANBAN_SCHEDULING_SYSTEM__NAME);
    createEReference(kanbanSchedulingSystemEClass, KANBAN_SCHEDULING_SYSTEM__MECHANISMS);
    createEReference(kanbanSchedulingSystemEClass, KANBAN_SCHEDULING_SYSTEM__KSS_SEARCH_STRATEGIES);
    createEReference(kanbanSchedulingSystemEClass, KANBAN_SCHEDULING_SYSTEM__KSS_TASK_PATTERNS);
    createEReference(kanbanSchedulingSystemEClass, KANBAN_SCHEDULING_SYSTEM__KS_STASK_PATTERN_TYPES);
    createEReference(kanbanSchedulingSystemEClass, KANBAN_SCHEDULING_SYSTEM__KSS_VALUE_FUNCTIONS);
    createEReference(kanbanSchedulingSystemEClass, KANBAN_SCHEDULING_SYSTEM__SO_SSERVICES);
    createEReference(kanbanSchedulingSystemEClass, KANBAN_SCHEDULING_SYSTEM__ORG_UNITS);
    createEReference(kanbanSchedulingSystemEClass, KANBAN_SCHEDULING_SYSTEM__KSS_SOURCES);
    createEReference(kanbanSchedulingSystemEClass, KANBAN_SCHEDULING_SYSTEM__KSS_WITEMS);
    createEAttribute(kanbanSchedulingSystemEClass, KANBAN_SCHEDULING_SYSTEM__REPLICATIONS);
    createEAttribute(kanbanSchedulingSystemEClass, KANBAN_SCHEDULING_SYSTEM__INTER_ARRIVAL_TIME);

    taskPatternEClass = createEClass(TASK_PATTERN);
    createEAttribute(taskPatternEClass, TASK_PATTERN__NAME);
    createEAttribute(taskPatternEClass, TASK_PATTERN__DESCRIPTION);
    createEReference(taskPatternEClass, TASK_PATTERN__TASKPATTERN_TYPES);

    taskTypeEClass = createEClass(TASK_TYPE);
    createEAttribute(taskTypeEClass, TASK_TYPE__NAME);
    createEAttribute(taskTypeEClass, TASK_TYPE__DESCRIPTION);

    valueFunctionEClass = createEClass(VALUE_FUNCTION);
    createEAttribute(valueFunctionEClass, VALUE_FUNCTION__NAME);
    createEAttribute(valueFunctionEClass, VALUE_FUNCTION__DESCRIPTION);

    mechanismEClass = createEClass(MECHANISM);
    createEAttribute(mechanismEClass, MECHANISM__NAME);
    createEAttribute(mechanismEClass, MECHANISM__DESCRIPTION);
    createEAttribute(mechanismEClass, MECHANISM__PROCESSTYPE);
    createEReference(mechanismEClass, MECHANISM__STRATEGIES);

    strategyEClass = createEClass(STRATEGY);
    createEAttribute(strategyEClass, STRATEGY__NAME);
    createEAttribute(strategyEClass, STRATEGY__DESCRIPTION);
    createEReference(strategyEClass, STRATEGY__WI_ACCEPTANCE_RULE);
    createEReference(strategyEClass, STRATEGY__WI_SELECTION_RULE);
    createEReference(strategyEClass, STRATEGY__WI_ASSIGNMENT_RULE);
    createEReference(strategyEClass, STRATEGY__RESOURCE_ALLOCATION_RULE);
    createEReference(strategyEClass, STRATEGY__RESOURCE_OUTSOURCING_RULE);

    wiAcceptanceEClass = createEClass(WI_ACCEPTANCE);
    createEAttribute(wiAcceptanceEClass, WI_ACCEPTANCE__NAME);
    createEAttribute(wiAcceptanceEClass, WI_ACCEPTANCE__DESCRIPTION);
    createEAttribute(wiAcceptanceEClass, WI_ACCEPTANCE__BACKLOG_QLIMIT);
    createEAttribute(wiAcceptanceEClass, WI_ACCEPTANCE__READY_QLIMIT);

    wiSelectionEClass = createEClass(WI_SELECTION);
    createEAttribute(wiSelectionEClass, WI_SELECTION__NAME);
    createEAttribute(wiSelectionEClass, WI_SELECTION__DESCRIPTION);

    wiAssignmentEClass = createEClass(WI_ASSIGNMENT);
    createEAttribute(wiAssignmentEClass, WI_ASSIGNMENT__NAME);
    createEAttribute(wiAssignmentEClass, WI_ASSIGNMENT__DESCRIPTION);

    resourceAllocationEClass = createEClass(RESOURCE_ALLOCATION);
    createEAttribute(resourceAllocationEClass, RESOURCE_ALLOCATION__NAME);
    createEAttribute(resourceAllocationEClass, RESOURCE_ALLOCATION__DESCRIPTION);

    resourceOutsourcingEClass = createEClass(RESOURCE_OUTSOURCING);
    createEAttribute(resourceOutsourcingEClass, RESOURCE_OUTSOURCING__NAME);
    createEAttribute(resourceOutsourcingEClass, RESOURCE_OUTSOURCING__DESCRIPTION);

    workSourceEClass = createEClass(WORK_SOURCE);
    createEAttribute(workSourceEClass, WORK_SOURCE__NAME);
    createEAttribute(workSourceEClass, WORK_SOURCE__DESCRIPTION);
    createEReference(workSourceEClass, WORK_SOURCE__ASSIGNMENT_RULE);

    workItemEClass = createEClass(WORK_ITEM);
    createEAttribute(workItemEClass, WORK_ITEM__NAME);
    createEAttribute(workItemEClass, WORK_ITEM__DESCRIPTION);
    createEReference(workItemEClass, WORK_ITEM__PATTERN);
    createEReference(workItemEClass, WORK_ITEM__PATTERN_TYPE);
    createEReference(workItemEClass, WORK_ITEM__PTASKS);
    createEReference(workItemEClass, WORK_ITEM__STASKS);
    createEReference(workItemEClass, WORK_ITEM__CAUSAL_TRIGGERS);
    createEReference(workItemEClass, WORK_ITEM__REQ_SPECIALTIES);
    createEAttribute(workItemEClass, WORK_ITEM__BEFFORTS);
    createEAttribute(workItemEClass, WORK_ITEM__BVALUE);
    createEAttribute(workItemEClass, WORK_ITEM__COS);
    createEReference(workItemEClass, WORK_ITEM__WITEM_SOURCE);
    createEAttribute(workItemEClass, WORK_ITEM__ARRTIME);
    createEAttribute(workItemEClass, WORK_ITEM__DUEDATE);

    causalityEClass = createEClass(CAUSALITY);
    createEReference(causalityEClass, CAUSALITY__TRIGGERED);
    createEAttribute(causalityEClass, CAUSALITY__TPROGRESS);
    createEAttribute(causalityEClass, CAUSALITY__TPROBABILITY);

    serviceTypeEClass = createEClass(SERVICE_TYPE);
    createEAttribute(serviceTypeEClass, SERVICE_TYPE__NAME);
    createEAttribute(serviceTypeEClass, SERVICE_TYPE__DESCRIPTION);

    serviceEClass = createEClass(SERVICE);
    createEAttribute(serviceEClass, SERVICE__NAME);
    createEAttribute(serviceEClass, SERVICE__DESCRIPTION);
    createEReference(serviceEClass, SERVICE__SERVICE_TYPE);
    createEAttribute(serviceEClass, SERVICE__EFFICIENCY);

    serviceProviderEClass = createEClass(SERVICE_PROVIDER);
    createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__NAME);
    createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__DESCRIPTION);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__SOURCE_UNITS);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__TARGET_UNITS);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__SUBORDINATE_UNITS);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__RESOURCES);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__SERVICES);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__DEFAULT_STRATEGY);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__ACCEPTANCE_RULE);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__SELECTION_RULE);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__ASSIGNMENT_RULE);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__ALLOCATION_RULE);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__OUTSOURCING_RULE);

    assetEClass = createEClass(ASSET);
    createEAttribute(assetEClass, ASSET__NAME);
    createEAttribute(assetEClass, ASSET__DESCRIPTION);
    createEReference(assetEClass, ASSET__HAS_SKILLS);

    skillEClass = createEClass(SKILL);
    createEAttribute(skillEClass, SKILL__NAME);
    createEAttribute(skillEClass, SKILL__DESCRIPTION);

    kanbanTaskModelEClass = createEClass(KANBAN_TASK_MODEL);
    createEAttribute(kanbanTaskModelEClass, KANBAN_TASK_MODEL__NAME);
    createEReference(kanbanTaskModelEClass, KANBAN_TASK_MODEL__CAPS);

    capabilityEClass = createEClass(CAPABILITY);
    createEAttribute(capabilityEClass, CAPABILITY__NAME);
    createEAttribute(capabilityEClass, CAPABILITY__DESCRIPTION);
    createEReference(capabilityEClass, CAPABILITY__REQS);

    requirementEClass = createEClass(REQUIREMENT);
    createEAttribute(requirementEClass, REQUIREMENT__NAME);
    createEAttribute(requirementEClass, REQUIREMENT__DESCRIPTION);
    createEReference(requirementEClass, REQUIREMENT__RTASKS);
    createEReference(requirementEClass, REQUIREMENT__DEPENDENCIES);

    entityEClass = createEClass(ENTITY);
    createEAttribute(entityEClass, ENTITY__NAME);
    createEAttribute(entityEClass, ENTITY__SDNAME);
    createEReference(entityEClass, ENTITY__SERVICE_PROVISIONS);
    createEReference(entityEClass, ENTITY__ENTITY_BEHAVIOR);

    provisionEClass = createEClass(PROVISION);
    createEReference(provisionEClass, PROVISION__SERVICE_NAME);
    createEReference(provisionEClass, PROVISION__PROVIDERS);

    statemachineEClass = createEClass(STATEMACHINE);
    createEReference(statemachineEClass, STATEMACHINE__EVENTS);
    createEReference(statemachineEClass, STATEMACHINE__COMMANDS);
    createEReference(statemachineEClass, STATEMACHINE__STATES);

    eventEClass = createEClass(EVENT);
    createEAttribute(eventEClass, EVENT__NAME);
    createEAttribute(eventEClass, EVENT__CODE);

    commandEClass = createEClass(COMMAND);
    createEAttribute(commandEClass, COMMAND__NAME);
    createEAttribute(commandEClass, COMMAND__CODE);

    stateEClass = createEClass(STATE);
    createEAttribute(stateEClass, STATE__NAME);
    createEReference(stateEClass, STATE__ACTIONS);
    createEReference(stateEClass, STATE__TRANSITIONS);

    transitionEClass = createEClass(TRANSITION);
    createEReference(transitionEClass, TRANSITION__EVENT);
    createEReference(transitionEClass, TRANSITION__STATE);
    createEReference(transitionEClass, TRANSITION__EVENTACTIONS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(kanbanSchedulingSystemEClass, KanbanSchedulingSystem.class, "KanbanSchedulingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKanbanSchedulingSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, KanbanSchedulingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKanbanSchedulingSystem_Mechanisms(), this.getMechanism(), null, "Mechanisms", null, 0, -1, KanbanSchedulingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKanbanSchedulingSystem_KSSSearchStrategies(), this.getStrategy(), null, "KSSSearchStrategies", null, 0, -1, KanbanSchedulingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKanbanSchedulingSystem_KSSTaskPatterns(), this.getTaskPattern(), null, "KSSTaskPatterns", null, 0, -1, KanbanSchedulingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKanbanSchedulingSystem_KSStaskPatternTypes(), this.getTaskType(), null, "KSStaskPatternTypes", null, 0, -1, KanbanSchedulingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKanbanSchedulingSystem_KSSValueFunctions(), this.getValueFunction(), null, "KSSValueFunctions", null, 0, -1, KanbanSchedulingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKanbanSchedulingSystem_SoSServices(), this.getServiceType(), null, "SoSServices", null, 0, -1, KanbanSchedulingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKanbanSchedulingSystem_OrgUnits(), this.getServiceProvider(), null, "orgUnits", null, 0, -1, KanbanSchedulingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKanbanSchedulingSystem_KssSources(), this.getWorkSource(), null, "kssSources", null, 0, -1, KanbanSchedulingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKanbanSchedulingSystem_KssWItems(), this.getWorkItem(), null, "kssWItems", null, 0, -1, KanbanSchedulingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKanbanSchedulingSystem_Replications(), ecorePackage.getEInt(), "replications", null, 0, 1, KanbanSchedulingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKanbanSchedulingSystem_InterArrivalTime(), ecorePackage.getEInt(), "interArrivalTime", null, 0, 1, KanbanSchedulingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskPatternEClass, TaskPattern.class, "TaskPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTaskPattern_Name(), ecorePackage.getEString(), "name", null, 0, 1, TaskPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTaskPattern_Description(), ecorePackage.getEString(), "description", null, 0, 1, TaskPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTaskPattern_TaskpatternTypes(), this.getTaskType(), null, "taskpatternTypes", null, 0, -1, TaskPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskTypeEClass, TaskType.class, "TaskType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTaskType_Name(), ecorePackage.getEString(), "name", null, 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTaskType_Description(), ecorePackage.getEString(), "description", null, 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueFunctionEClass, ValueFunction.class, "ValueFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValueFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValueFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValueFunction_Description(), ecorePackage.getEString(), "description", null, 0, 1, ValueFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mechanismEClass, Mechanism.class, "Mechanism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMechanism_Name(), ecorePackage.getEString(), "name", null, 0, 1, Mechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMechanism_Description(), ecorePackage.getEString(), "description", null, 0, 1, Mechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMechanism_Processtype(), ecorePackage.getEString(), "processtype", null, 0, 1, Mechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMechanism_Strategies(), this.getStrategy(), null, "Strategies", null, 0, -1, Mechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(strategyEClass, Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStrategy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStrategy_Description(), ecorePackage.getEString(), "description", null, 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStrategy_WIAcceptanceRule(), this.getWIAcceptance(), null, "WIAcceptanceRule", null, 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStrategy_WISelectionRule(), this.getWISelection(), null, "WISelectionRule", null, 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStrategy_WIAssignmentRule(), this.getWIAssignment(), null, "WIAssignmentRule", null, 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStrategy_ResourceAllocationRule(), this.getResourceAllocation(), null, "ResourceAllocationRule", null, 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStrategy_ResourceOutsourcingRule(), this.getResourceOutsourcing(), null, "ResourceOutsourcingRule", null, 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wiAcceptanceEClass, WIAcceptance.class, "WIAcceptance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWIAcceptance_Name(), ecorePackage.getEString(), "name", null, 0, 1, WIAcceptance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWIAcceptance_Description(), ecorePackage.getEString(), "description", null, 0, 1, WIAcceptance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWIAcceptance_BacklogQLimit(), ecorePackage.getEInt(), "backlogQLimit", null, 0, 1, WIAcceptance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWIAcceptance_ReadyQLimit(), ecorePackage.getEInt(), "readyQLimit", null, 0, 1, WIAcceptance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wiSelectionEClass, WISelection.class, "WISelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWISelection_Name(), ecorePackage.getEString(), "name", null, 0, 1, WISelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWISelection_Description(), ecorePackage.getEString(), "description", null, 0, 1, WISelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wiAssignmentEClass, WIAssignment.class, "WIAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWIAssignment_Name(), ecorePackage.getEString(), "name", null, 0, 1, WIAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWIAssignment_Description(), ecorePackage.getEString(), "description", null, 0, 1, WIAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceAllocationEClass, ResourceAllocation.class, "ResourceAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResourceAllocation_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceAllocation_Description(), ecorePackage.getEString(), "description", null, 0, 1, ResourceAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceOutsourcingEClass, ResourceOutsourcing.class, "ResourceOutsourcing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResourceOutsourcing_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceOutsourcing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceOutsourcing_Description(), ecorePackage.getEString(), "description", null, 0, 1, ResourceOutsourcing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workSourceEClass, WorkSource.class, "WorkSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkSource_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkSource_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkSource_AssignmentRule(), this.getWIAssignment(), null, "assignmentRule", null, 0, 1, WorkSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workItemEClass, WorkItem.class, "WorkItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_Pattern(), this.getTaskPattern(), null, "pattern", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_PatternType(), this.getTaskType(), null, "patternType", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_PTasks(), this.getWorkItem(), null, "pTasks", null, 0, -1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_STasks(), this.getWorkItem(), null, "sTasks", null, 0, -1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_CausalTriggers(), this.getCausality(), null, "causalTriggers", null, 0, -1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_ReqSpecialties(), this.getServiceType(), null, "reqSpecialties", null, 0, -1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_Befforts(), ecorePackage.getEInt(), "befforts", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_Bvalue(), ecorePackage.getEInt(), "bvalue", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_COS(), ecorePackage.getEString(), "COS", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_WItemSource(), this.getWorkSource(), null, "wItemSource", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_Arrtime(), ecorePackage.getEInt(), "arrtime", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_Duedate(), ecorePackage.getEInt(), "duedate", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(causalityEClass, Causality.class, "Causality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCausality_Triggered(), this.getWorkItem(), null, "triggered", null, 0, -1, Causality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCausality_TProgress(), ecorePackage.getEInt(), "tProgress", null, 0, 1, Causality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCausality_TProbability(), ecorePackage.getEInt(), "tProbability", null, 0, 1, Causality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getServiceType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServiceType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getService_Description(), ecorePackage.getEString(), "description", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getService_ServiceType(), this.getServiceType(), null, "serviceType", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getService_Efficiency(), ecorePackage.getEInt(), "efficiency", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceProviderEClass, ServiceProvider.class, "ServiceProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getServiceProvider_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServiceProvider_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_SourceUnits(), this.getServiceProvider(), null, "sourceUnits", null, 0, -1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_TargetUnits(), this.getServiceProvider(), null, "targetUnits", null, 0, -1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_SubordinateUnits(), this.getServiceProvider(), null, "subordinateUnits", null, 0, -1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_Resources(), this.getAsset(), null, "resources", null, 0, -1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_Services(), this.getService(), null, "services", null, 0, -1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_DefaultStrategy(), this.getStrategy(), null, "defaultStrategy", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_AcceptanceRule(), this.getWIAcceptance(), null, "acceptanceRule", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_SelectionRule(), this.getWISelection(), null, "selectionRule", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_AssignmentRule(), this.getWIAssignment(), null, "assignmentRule", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_AllocationRule(), this.getResourceAllocation(), null, "allocationRule", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_OutsourcingRule(), this.getResourceOutsourcing(), null, "outsourcingRule", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAsset_Name(), ecorePackage.getEString(), "name", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAsset_Description(), ecorePackage.getEString(), "description", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsset_HasSkills(), this.getSkill(), null, "hasSkills", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(skillEClass, Skill.class, "Skill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSkill_Name(), ecorePackage.getEString(), "name", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSkill_Description(), ecorePackage.getEString(), "description", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kanbanTaskModelEClass, KanbanTaskModel.class, "KanbanTaskModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKanbanTaskModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, KanbanTaskModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKanbanTaskModel_Caps(), this.getCapability(), null, "caps", null, 0, -1, KanbanTaskModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCapability_Name(), ecorePackage.getEString(), "name", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapability_Description(), ecorePackage.getEString(), "description", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapability_Reqs(), this.getRequirement(), null, "reqs", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequirement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirement_Description(), ecorePackage.getEString(), "description", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_RTasks(), this.getWorkItem(), null, "rTasks", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_Dependencies(), this.getCausality(), null, "dependencies", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEntity_Sdname(), ecorePackage.getEString(), "sdname", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_ServiceProvisions(), this.getProvision(), null, "serviceProvisions", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_EntityBehavior(), this.getStatemachine(), null, "entityBehavior", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(provisionEClass, Provision.class, "Provision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProvision_ServiceName(), this.getServiceType(), null, "serviceName", null, 0, 1, Provision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProvision_Providers(), this.getServiceProvider(), null, "providers", null, 0, -1, Provision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statemachineEClass, Statemachine.class, "Statemachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatemachine_Events(), this.getEvent(), null, "events", null, 0, -1, Statemachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatemachine_Commands(), this.getCommand(), null, "commands", null, 0, -1, Statemachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatemachine_States(), this.getState(), null, "states", null, 0, -1, Statemachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvent_Code(), ecorePackage.getEString(), "code", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCommand_Name(), ecorePackage.getEString(), "name", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommand_Code(), ecorePackage.getEString(), "code", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_Actions(), this.getCommand(), null, "actions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransition_Event(), this.getEvent(), null, "event", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransition_State(), this.getState(), null, "state", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransition_Eventactions(), this.getCommand(), null, "eventactions", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //KanbanmodelPackageImpl
