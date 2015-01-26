/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.Entity;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Provision;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Statemachine;

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
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.EntityImpl#getSdname <em>Sdname</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.EntityImpl#getServiceProvisions <em>Service Provisions</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.EntityImpl#getEntityBehavior <em>Entity Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity
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
   * The default value of the '{@link #getSdname() <em>Sdname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSdname()
   * @generated
   * @ordered
   */
  protected static final String SDNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSdname() <em>Sdname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSdname()
   * @generated
   * @ordered
   */
  protected String sdname = SDNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getServiceProvisions() <em>Service Provisions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceProvisions()
   * @generated
   * @ordered
   */
  protected EList<Provision> serviceProvisions;

  /**
   * The cached value of the '{@link #getEntityBehavior() <em>Entity Behavior</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityBehavior()
   * @generated
   * @ordered
   */
  protected Statemachine entityBehavior;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
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
    return KanbanmodelPackage.Literals.ENTITY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSdname()
  {
    return sdname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSdname(String newSdname)
  {
    String oldSdname = sdname;
    sdname = newSdname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.ENTITY__SDNAME, oldSdname, sdname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Provision> getServiceProvisions()
  {
    if (serviceProvisions == null)
    {
      serviceProvisions = new EObjectContainmentEList<Provision>(Provision.class, this, KanbanmodelPackage.ENTITY__SERVICE_PROVISIONS);
    }
    return serviceProvisions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statemachine getEntityBehavior()
  {
    return entityBehavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntityBehavior(Statemachine newEntityBehavior, NotificationChain msgs)
  {
    Statemachine oldEntityBehavior = entityBehavior;
    entityBehavior = newEntityBehavior;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.ENTITY__ENTITY_BEHAVIOR, oldEntityBehavior, newEntityBehavior);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityBehavior(Statemachine newEntityBehavior)
  {
    if (newEntityBehavior != entityBehavior)
    {
      NotificationChain msgs = null;
      if (entityBehavior != null)
        msgs = ((InternalEObject)entityBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.ENTITY__ENTITY_BEHAVIOR, null, msgs);
      if (newEntityBehavior != null)
        msgs = ((InternalEObject)newEntityBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.ENTITY__ENTITY_BEHAVIOR, null, msgs);
      msgs = basicSetEntityBehavior(newEntityBehavior, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.ENTITY__ENTITY_BEHAVIOR, newEntityBehavior, newEntityBehavior));
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
      case KanbanmodelPackage.ENTITY__SERVICE_PROVISIONS:
        return ((InternalEList<?>)getServiceProvisions()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.ENTITY__ENTITY_BEHAVIOR:
        return basicSetEntityBehavior(null, msgs);
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
      case KanbanmodelPackage.ENTITY__NAME:
        return getName();
      case KanbanmodelPackage.ENTITY__SDNAME:
        return getSdname();
      case KanbanmodelPackage.ENTITY__SERVICE_PROVISIONS:
        return getServiceProvisions();
      case KanbanmodelPackage.ENTITY__ENTITY_BEHAVIOR:
        return getEntityBehavior();
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
      case KanbanmodelPackage.ENTITY__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.ENTITY__SDNAME:
        setSdname((String)newValue);
        return;
      case KanbanmodelPackage.ENTITY__SERVICE_PROVISIONS:
        getServiceProvisions().clear();
        getServiceProvisions().addAll((Collection<? extends Provision>)newValue);
        return;
      case KanbanmodelPackage.ENTITY__ENTITY_BEHAVIOR:
        setEntityBehavior((Statemachine)newValue);
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
      case KanbanmodelPackage.ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.ENTITY__SDNAME:
        setSdname(SDNAME_EDEFAULT);
        return;
      case KanbanmodelPackage.ENTITY__SERVICE_PROVISIONS:
        getServiceProvisions().clear();
        return;
      case KanbanmodelPackage.ENTITY__ENTITY_BEHAVIOR:
        setEntityBehavior((Statemachine)null);
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
      case KanbanmodelPackage.ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.ENTITY__SDNAME:
        return SDNAME_EDEFAULT == null ? sdname != null : !SDNAME_EDEFAULT.equals(sdname);
      case KanbanmodelPackage.ENTITY__SERVICE_PROVISIONS:
        return serviceProvisions != null && !serviceProvisions.isEmpty();
      case KanbanmodelPackage.ENTITY__ENTITY_BEHAVIOR:
        return entityBehavior != null;
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
    result.append(", sdname: ");
    result.append(sdname);
    result.append(')');
    return result.toString();
  }

} //EntityImpl
