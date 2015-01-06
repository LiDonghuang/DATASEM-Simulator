/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
      case KanbanmodelPackage.TEAM: return createTeam();
      case KanbanmodelPackage.SERVICE: return createService();
      case KanbanmodelPackage.ASSET: return createAsset();
      case KanbanmodelPackage.KSS_BLOCK: return createKSSBlock();
      case KanbanmodelPackage.MECHANISM: return createMechanism();
      case KanbanmodelPackage.REQUIREMENT: return createRequirement();
      case KanbanmodelPackage.TASK: return createTask();
      case KanbanmodelPackage.KANBAN_WORK_FLOW: return createKanbanWorkFlow();
      case KanbanmodelPackage.CAPABILITY: return createCapability();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case KanbanmodelPackage.PROFILE_TYPE:
        return createProfileTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case KanbanmodelPackage.PROFILE_TYPE:
        return convertProfileTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
  public Team createTeam()
  {
    TeamImpl team = new TeamImpl();
    return team;
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
  public KSSBlock createKSSBlock()
  {
    KSSBlockImpl kssBlock = new KSSBlockImpl();
    return kssBlock;
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
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KanbanWorkFlow createKanbanWorkFlow()
  {
    KanbanWorkFlowImpl kanbanWorkFlow = new KanbanWorkFlowImpl();
    return kanbanWorkFlow;
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
  public ProfileType createProfileTypeFromString(EDataType eDataType, String initialValue)
  {
    ProfileType result = ProfileType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertProfileTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
