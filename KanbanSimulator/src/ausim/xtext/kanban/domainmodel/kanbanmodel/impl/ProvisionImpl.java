/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Provision;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ServiceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ProvisionImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.ProvisionImpl#getProviders <em>Providers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvisionImpl extends MinimalEObjectImpl.Container implements Provision
{
  /**
   * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceName()
   * @generated
   * @ordered
   */
  protected ServiceType serviceName;

  /**
   * The cached value of the '{@link #getProviders() <em>Providers</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProviders()
   * @generated
   * @ordered
   */
  protected EList<ServiceProvider> providers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProvisionImpl()
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
    return KanbanmodelPackage.Literals.PROVISION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceType getServiceName()
  {
    if (serviceName != null && serviceName.eIsProxy())
    {
      InternalEObject oldServiceName = (InternalEObject)serviceName;
      serviceName = (ServiceType)eResolveProxy(oldServiceName);
      if (serviceName != oldServiceName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.PROVISION__SERVICE_NAME, oldServiceName, serviceName));
      }
    }
    return serviceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceType basicGetServiceName()
  {
    return serviceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceName(ServiceType newServiceName)
  {
    ServiceType oldServiceName = serviceName;
    serviceName = newServiceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.PROVISION__SERVICE_NAME, oldServiceName, serviceName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceProvider> getProviders()
  {
    if (providers == null)
    {
      providers = new EObjectResolvingEList<ServiceProvider>(ServiceProvider.class, this, KanbanmodelPackage.PROVISION__PROVIDERS);
    }
    return providers;
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
      case KanbanmodelPackage.PROVISION__SERVICE_NAME:
        if (resolve) return getServiceName();
        return basicGetServiceName();
      case KanbanmodelPackage.PROVISION__PROVIDERS:
        return getProviders();
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
      case KanbanmodelPackage.PROVISION__SERVICE_NAME:
        setServiceName((ServiceType)newValue);
        return;
      case KanbanmodelPackage.PROVISION__PROVIDERS:
        getProviders().clear();
        getProviders().addAll((Collection<? extends ServiceProvider>)newValue);
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
      case KanbanmodelPackage.PROVISION__SERVICE_NAME:
        setServiceName((ServiceType)null);
        return;
      case KanbanmodelPackage.PROVISION__PROVIDERS:
        getProviders().clear();
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
      case KanbanmodelPackage.PROVISION__SERVICE_NAME:
        return serviceName != null;
      case KanbanmodelPackage.PROVISION__PROVIDERS:
        return providers != null && !providers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProvisionImpl
