/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Service;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Task;

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
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl#getSTasks <em>STasks</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl#getTaskMechanims <em>Task Mechanims</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl#getReqSpecialties <em>Req Specialties</em>}</li>
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
   * The cached value of the '{@link #getSTasks() <em>STasks</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSTasks()
   * @generated
   * @ordered
   */
  protected EList<Task> sTasks;

  /**
   * The cached value of the '{@link #getTaskMechanims() <em>Task Mechanims</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskMechanims()
   * @generated
   * @ordered
   */
  protected EList<Mechanism> taskMechanims;

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
  public EList<Mechanism> getTaskMechanims()
  {
    if (taskMechanims == null)
    {
      taskMechanims = new EObjectContainmentEList<Mechanism>(Mechanism.class, this, KanbanmodelPackage.TASK__TASK_MECHANIMS);
    }
    return taskMechanims;
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
      case KanbanmodelPackage.TASK__TASK_MECHANIMS:
        return ((InternalEList<?>)getTaskMechanims()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.TASK__STASKS:
        return getSTasks();
      case KanbanmodelPackage.TASK__TASK_MECHANIMS:
        return getTaskMechanims();
      case KanbanmodelPackage.TASK__REQ_SPECIALTIES:
        return getReqSpecialties();
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
      case KanbanmodelPackage.TASK__STASKS:
        getSTasks().clear();
        getSTasks().addAll((Collection<? extends Task>)newValue);
        return;
      case KanbanmodelPackage.TASK__TASK_MECHANIMS:
        getTaskMechanims().clear();
        getTaskMechanims().addAll((Collection<? extends Mechanism>)newValue);
        return;
      case KanbanmodelPackage.TASK__REQ_SPECIALTIES:
        getReqSpecialties().clear();
        getReqSpecialties().addAll((Collection<? extends Service>)newValue);
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
      case KanbanmodelPackage.TASK__STASKS:
        getSTasks().clear();
        return;
      case KanbanmodelPackage.TASK__TASK_MECHANIMS:
        getTaskMechanims().clear();
        return;
      case KanbanmodelPackage.TASK__REQ_SPECIALTIES:
        getReqSpecialties().clear();
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
      case KanbanmodelPackage.TASK__STASKS:
        return sTasks != null && !sTasks.isEmpty();
      case KanbanmodelPackage.TASK__TASK_MECHANIMS:
        return taskMechanims != null && !taskMechanims.isEmpty();
      case KanbanmodelPackage.TASK__REQ_SPECIALTIES:
        return reqSpecialties != null && !reqSpecialties.isEmpty();
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
    result.append(", bvalue: ");
    result.append(bvalue);
    result.append(", COS: ");
    result.append(cos);
    result.append(')');
    return result.toString();
  }

} //TaskImpl
