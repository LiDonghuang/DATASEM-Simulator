/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanWorkFlow;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Task;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Team;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kanban Scheduling System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getOrgUnits <em>Org Units</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getKssTasks <em>Kss Tasks</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getKssWorkFlow <em>Kss Work Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KanbanSchedulingSystemImpl extends MinimalEObjectImpl.Container implements KanbanSchedulingSystem
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
   * The cached value of the '{@link #getOrgUnits() <em>Org Units</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrgUnits()
   * @generated
   * @ordered
   */
  protected EList<Team> orgUnits;

  /**
   * The cached value of the '{@link #getKssTasks() <em>Kss Tasks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKssTasks()
   * @generated
   * @ordered
   */
  protected EList<Task> kssTasks;

  /**
   * The cached value of the '{@link #getKssWorkFlow() <em>Kss Work Flow</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKssWorkFlow()
   * @generated
   * @ordered
   */
  protected KanbanWorkFlow kssWorkFlow;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KanbanSchedulingSystemImpl()
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
    return KanbanmodelPackage.Literals.KANBAN_SCHEDULING_SYSTEM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Team> getOrgUnits()
  {
    if (orgUnits == null)
    {
      orgUnits = new EObjectContainmentEList<Team>(Team.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__ORG_UNITS);
    }
    return orgUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Task> getKssTasks()
  {
    if (kssTasks == null)
    {
      kssTasks = new EObjectContainmentEList<Task>(Task.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_TASKS);
    }
    return kssTasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KanbanWorkFlow getKssWorkFlow()
  {
    return kssWorkFlow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKssWorkFlow(KanbanWorkFlow newKssWorkFlow, NotificationChain msgs)
  {
    KanbanWorkFlow oldKssWorkFlow = kssWorkFlow;
    kssWorkFlow = newKssWorkFlow;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_WORK_FLOW, oldKssWorkFlow, newKssWorkFlow);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKssWorkFlow(KanbanWorkFlow newKssWorkFlow)
  {
    if (newKssWorkFlow != kssWorkFlow)
    {
      NotificationChain msgs = null;
      if (kssWorkFlow != null)
        msgs = ((InternalEObject)kssWorkFlow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_WORK_FLOW, null, msgs);
      if (newKssWorkFlow != null)
        msgs = ((InternalEObject)newKssWorkFlow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_WORK_FLOW, null, msgs);
      msgs = basicSetKssWorkFlow(newKssWorkFlow, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_WORK_FLOW, newKssWorkFlow, newKssWorkFlow));
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__ORG_UNITS:
        return ((InternalEList<?>)getOrgUnits()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_TASKS:
        return ((InternalEList<?>)getKssTasks()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_WORK_FLOW:
        return basicSetKssWorkFlow(null, msgs);
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME:
        return getName();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__ORG_UNITS:
        return getOrgUnits();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_TASKS:
        return getKssTasks();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_WORK_FLOW:
        return getKssWorkFlow();
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__ORG_UNITS:
        getOrgUnits().clear();
        getOrgUnits().addAll((Collection<? extends Team>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_TASKS:
        getKssTasks().clear();
        getKssTasks().addAll((Collection<? extends Task>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_WORK_FLOW:
        setKssWorkFlow((KanbanWorkFlow)newValue);
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__ORG_UNITS:
        getOrgUnits().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_TASKS:
        getKssTasks().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_WORK_FLOW:
        setKssWorkFlow((KanbanWorkFlow)null);
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__ORG_UNITS:
        return orgUnits != null && !orgUnits.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_TASKS:
        return kssTasks != null && !kssTasks.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_WORK_FLOW:
        return kssWorkFlow != null;
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
    result.append(')');
    return result.toString();
  }

} //KanbanSchedulingSystemImpl
