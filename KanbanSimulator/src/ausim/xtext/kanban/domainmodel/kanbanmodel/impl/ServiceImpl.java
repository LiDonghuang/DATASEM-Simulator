/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Service;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ServiceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl#getEfficiency <em>Efficiency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service
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
   * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceType()
   * @generated
   * @ordered
   */
  protected ServiceType serviceType;

  /**
   * The default value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEfficiency()
   * @generated
   * @ordered
   */
  protected static final int EFFICIENCY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEfficiency()
   * @generated
   * @ordered
   */
  protected int efficiency = EFFICIENCY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceImpl()
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
    return KanbanmodelPackage.Literals.SERVICE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceType getServiceType()
  {
    if (serviceType != null && serviceType.eIsProxy())
    {
      InternalEObject oldServiceType = (InternalEObject)serviceType;
      serviceType = (ServiceType)eResolveProxy(oldServiceType);
      if (serviceType != oldServiceType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.SERVICE__SERVICE_TYPE, oldServiceType, serviceType));
      }
    }
    return serviceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceType basicGetServiceType()
  {
    return serviceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceType(ServiceType newServiceType)
  {
    ServiceType oldServiceType = serviceType;
    serviceType = newServiceType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE__SERVICE_TYPE, oldServiceType, serviceType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getEfficiency()
  {
    return efficiency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEfficiency(int newEfficiency)
  {
    int oldEfficiency = efficiency;
    efficiency = newEfficiency;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE__EFFICIENCY, oldEfficiency, efficiency));
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
      case KanbanmodelPackage.SERVICE__NAME:
        return getName();
      case KanbanmodelPackage.SERVICE__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.SERVICE__SERVICE_TYPE:
        if (resolve) return getServiceType();
        return basicGetServiceType();
      case KanbanmodelPackage.SERVICE__EFFICIENCY:
        return getEfficiency();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.SERVICE__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.SERVICE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.SERVICE__SERVICE_TYPE:
        setServiceType((ServiceType)newValue);
        return;
      case KanbanmodelPackage.SERVICE__EFFICIENCY:
        setEfficiency((Integer)newValue);
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
      case KanbanmodelPackage.SERVICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.SERVICE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.SERVICE__SERVICE_TYPE:
        setServiceType((ServiceType)null);
        return;
      case KanbanmodelPackage.SERVICE__EFFICIENCY:
        setEfficiency(EFFICIENCY_EDEFAULT);
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
      case KanbanmodelPackage.SERVICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.SERVICE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.SERVICE__SERVICE_TYPE:
        return serviceType != null;
      case KanbanmodelPackage.SERVICE__EFFICIENCY:
        return efficiency != EFFICIENCY_EDEFAULT;
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
    result.append(", efficiency: ");
    result.append(efficiency);
    result.append(')');
    return result.toString();
  }

} //ServiceImpl
