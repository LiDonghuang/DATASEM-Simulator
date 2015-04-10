/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.Dependency;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Service;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Task;
import ausim.xtext.kanban.domainmodel.kanbanmodel.TaskPattern;
import ausim.xtext.kanban.domainmodel.kanbanmodel.TaskType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl#getPatternType <em>Pattern Type</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl#getSTasks <em>STasks</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl#getTaskDependencies <em>Task Dependencies</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl#getReqSpecialties <em>Req Specialties</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl#getBefforts <em>Befforts</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl#getBvalue <em>Bvalue</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl#getCOS <em>COS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected EList<TaskPattern> pattern;

  /**
   * The cached value of the '{@link #getPatternType() <em>Pattern Type</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternType()
   * @generated
   * @ordered
   */
  protected EList<TaskType> patternType;

  /**
   * The cached value of the '{@link #getSTasks() <em>STasks</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSTasks()
   * @generated
   * @ordered
   */
  protected EList<Task> sTasks;

  /**
   * The cached value of the '{@link #getTaskDependencies() <em>Task Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskDependencies()
   * @generated
   * @ordered
   */
  protected EList<Dependency> taskDependencies;

  /**
   * The cached value of the '{@link #getReqSpecialties() <em>Req Specialties</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqSpecialties()
   * @generated
   * @ordered
   */
  protected EList<Service> reqSpecialties;

  /**
   * The default value of the '{@link #getBefforts() <em>Befforts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBefforts()
   * @generated
   * @ordered
   */
  protected static final int BEFFORTS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBefforts() <em>Befforts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBefforts()
   * @generated
   * @ordered
   */
  protected int befforts = BEFFORTS_EDEFAULT;

  /**
   * The default value of the '{@link #getBvalue() <em>Bvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBvalue()
   * @generated
   * @ordered
   */
  protected static final int BVALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBvalue() <em>Bvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBvalue()
   * @generated
   * @ordered
   */
  protected int bvalue = BVALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getCOS() <em>COS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCOS()
   * @generated
   * @ordered
   */
  protected static final String COS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCOS() <em>COS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCOS()
   * @generated
   * @ordered
   */
  protected String cos = COS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return KanbanmodelPackage.Literals.TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.TASK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.TASK__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TaskPattern> getPattern()
  {
    if (pattern == null)
    {
      pattern = new EObjectResolvingEList<TaskPattern>(TaskPattern.class, this, KanbanmodelPackage.TASK__PATTERN);
    }
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TaskType> getPatternType()
  {
    if (patternType == null)
    {
      patternType = new EObjectResolvingEList<TaskType>(TaskType.class, this, KanbanmodelPackage.TASK__PATTERN_TYPE);
    }
    return patternType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Task> getSTasks()
  {
    if (sTasks == null)
    {
      sTasks = new EObjectResolvingEList<Task>(Task.class, this, KanbanmodelPackage.TASK__STASKS);
    }
    return sTasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Dependency> getTaskDependencies()
  {
    if (taskDependencies == null)
    {
      taskDependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, KanbanmodelPackage.TASK__TASK_DEPENDENCIES);
    }
    return taskDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Service> getReqSpecialties()
  {
    if (reqSpecialties == null)
    {
      reqSpecialties = new EObjectResolvingEList<Service>(Service.class, this, KanbanmodelPackage.TASK__REQ_SPECIALTIES);
    }
    return reqSpecialties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBefforts()
  {
    return befforts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBefforts(int newBefforts)
  {
    int oldBefforts = befforts;
    befforts = newBefforts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.TASK__BEFFORTS, oldBefforts, befforts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBvalue()
  {
    return bvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBvalue(int newBvalue)
  {
    int oldBvalue = bvalue;
    bvalue = newBvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.TASK__BVALUE, oldBvalue, bvalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCOS()
  {
    return cos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCOS(String newCOS)
  {
    String oldCOS = cos;
    cos = newCOS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.TASK__COS, oldCOS, cos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.TASK__TASK_DEPENDENCIES:
        return ((InternalEList<?>)getTaskDependencies()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.TASK__NAME:
        return getName();
      case KanbanmodelPackage.TASK__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.TASK__PATTERN:
        return getPattern();
      case KanbanmodelPackage.TASK__PATTERN_TYPE:
        return getPatternType();
      case KanbanmodelPackage.TASK__STASKS:
        return getSTasks();
      case KanbanmodelPackage.TASK__TASK_DEPENDENCIES:
        return getTaskDependencies();
      case KanbanmodelPackage.TASK__REQ_SPECIALTIES:
        return getReqSpecialties();
      case KanbanmodelPackage.TASK__BEFFORTS:
        return getBefforts();
      case KanbanmodelPackage.TASK__BVALUE:
        return getBvalue();
      case KanbanmodelPackage.TASK__COS:
        return getCOS();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.TASK__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.TASK__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.TASK__PATTERN:
        getPattern().clear();
        getPattern().addAll((Collection<? extends TaskPattern>)newValue);
        return;
      case KanbanmodelPackage.TASK__PATTERN_TYPE:
        getPatternType().clear();
        getPatternType().addAll((Collection<? extends TaskType>)newValue);
        return;
      case KanbanmodelPackage.TASK__STASKS:
        getSTasks().clear();
        getSTasks().addAll((Collection<? extends Task>)newValue);
        return;
      case KanbanmodelPackage.TASK__TASK_DEPENDENCIES:
        getTaskDependencies().clear();
        getTaskDependencies().addAll((Collection<? extends Dependency>)newValue);
        return;
      case KanbanmodelPackage.TASK__REQ_SPECIALTIES:
        getReqSpecialties().clear();
        getReqSpecialties().addAll((Collection<? extends Service>)newValue);
        return;
      case KanbanmodelPackage.TASK__BEFFORTS:
        setBefforts((Integer)newValue);
        return;
      case KanbanmodelPackage.TASK__BVALUE:
        setBvalue((Integer)newValue);
        return;
      case KanbanmodelPackage.TASK__COS:
        setCOS((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.TASK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.TASK__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.TASK__PATTERN:
        getPattern().clear();
        return;
      case KanbanmodelPackage.TASK__PATTERN_TYPE:
        getPatternType().clear();
        return;
      case KanbanmodelPackage.TASK__STASKS:
        getSTasks().clear();
        return;
      case KanbanmodelPackage.TASK__TASK_DEPENDENCIES:
        getTaskDependencies().clear();
        return;
      case KanbanmodelPackage.TASK__REQ_SPECIALTIES:
        getReqSpecialties().clear();
        return;
      case KanbanmodelPackage.TASK__BEFFORTS:
        setBefforts(BEFFORTS_EDEFAULT);
        return;
      case KanbanmodelPackage.TASK__BVALUE:
        setBvalue(BVALUE_EDEFAULT);
        return;
      case KanbanmodelPackage.TASK__COS:
        setCOS(COS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.TASK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.TASK__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.TASK__PATTERN:
        return pattern != null && !pattern.isEmpty();
      case KanbanmodelPackage.TASK__PATTERN_TYPE:
        return patternType != null && !patternType.isEmpty();
      case KanbanmodelPackage.TASK__STASKS:
        return sTasks != null && !sTasks.isEmpty();
      case KanbanmodelPackage.TASK__TASK_DEPENDENCIES:
        return taskDependencies != null && !taskDependencies.isEmpty();
      case KanbanmodelPackage.TASK__REQ_SPECIALTIES:
        return reqSpecialties != null && !reqSpecialties.isEmpty();
      case KanbanmodelPackage.TASK__BEFFORTS:
        return befforts != BEFFORTS_EDEFAULT;
      case KanbanmodelPackage.TASK__BVALUE:
        return bvalue != BVALUE_EDEFAULT;
      case KanbanmodelPackage.TASK__COS:
        return COS_EDEFAULT == null ? cos != null : !COS_EDEFAULT.equals(cos);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", befforts: ");
    result.append(befforts);
    result.append(", bvalue: ");
    result.append(bvalue);
    result.append(", COS: ");
    result.append(cos);
    result.append(')');
    return result.toString();
  }

} //TaskImpl
