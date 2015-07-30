/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

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

import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mechanism</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl#getProcesstype <em>Processtype</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl#getStrategies <em>Strategies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MechanismImpl extends MinimalEObjectImpl.Container implements Mechanism
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
   * The default value of the '{@link #getProcesstype() <em>Processtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcesstype()
   * @generated
   * @ordered
   */
  protected static final String PROCESSTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProcesstype() <em>Processtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcesstype()
   * @generated
   * @ordered
   */
  protected String processtype = PROCESSTYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getStrategies() <em>Strategies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategies()
   * @generated
   * @ordered
   */
  protected EList<Strategy> strategies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MechanismImpl()
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
    return KanbanmodelPackage.Literals.MECHANISM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.MECHANISM__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.MECHANISM__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProcesstype()
  {
    return processtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcesstype(String newProcesstype)
  {
    String oldProcesstype = processtype;
    processtype = newProcesstype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.MECHANISM__PROCESSTYPE, oldProcesstype, processtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Strategy> getStrategies()
  {
    if (strategies == null)
    {
      strategies = new EObjectContainmentEList<Strategy>(Strategy.class, this, KanbanmodelPackage.MECHANISM__STRATEGIES);
    }
    return strategies;
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
      case KanbanmodelPackage.MECHANISM__STRATEGIES:
        return ((InternalEList<?>)getStrategies()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.MECHANISM__NAME:
        return getName();
      case KanbanmodelPackage.MECHANISM__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.MECHANISM__PROCESSTYPE:
        return getProcesstype();
      case KanbanmodelPackage.MECHANISM__STRATEGIES:
        return getStrategies();
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
      case KanbanmodelPackage.MECHANISM__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.MECHANISM__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.MECHANISM__PROCESSTYPE:
        setProcesstype((String)newValue);
        return;
      case KanbanmodelPackage.MECHANISM__STRATEGIES:
        getStrategies().clear();
        getStrategies().addAll((Collection<? extends Strategy>)newValue);
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
      case KanbanmodelPackage.MECHANISM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.MECHANISM__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.MECHANISM__PROCESSTYPE:
        setProcesstype(PROCESSTYPE_EDEFAULT);
        return;
      case KanbanmodelPackage.MECHANISM__STRATEGIES:
        getStrategies().clear();
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
      case KanbanmodelPackage.MECHANISM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.MECHANISM__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.MECHANISM__PROCESSTYPE:
        return PROCESSTYPE_EDEFAULT == null ? processtype != null : !PROCESSTYPE_EDEFAULT.equals(processtype);
      case KanbanmodelPackage.MECHANISM__STRATEGIES:
        return strategies != null && !strategies.isEmpty();
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
    result.append(", processtype: ");
    result.append(processtype);
    result.append(')');
    return result.toString();
  }

} //MechanismImpl
