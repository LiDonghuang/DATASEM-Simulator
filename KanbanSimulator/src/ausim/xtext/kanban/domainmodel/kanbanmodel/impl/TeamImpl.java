/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.Asset;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Service;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TeamImpl#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TeamImpl#getDemandUnits <em>Demand Units</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TeamImpl#getSourcedUnits <em>Sourced Units</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TeamImpl#getGroupmembers <em>Groupmembers</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TeamImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.TeamImpl#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TeamImpl extends MinimalEObjectImpl.Container implements Team
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
   * The cached value of the '{@link #getDemandUnits() <em>Demand Units</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDemandUnits()
   * @generated
   * @ordered
   */
  protected EList<Team> demandUnits;

  /**
   * The cached value of the '{@link #getSourcedUnits() <em>Sourced Units</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcedUnits()
   * @generated
   * @ordered
   */
  protected EList<Team> sourcedUnits;

  /**
   * The cached value of the '{@link #getGroupmembers() <em>Groupmembers</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupmembers()
   * @generated
   * @ordered
   */
  protected EList<Team> groupmembers;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<Asset> resources;

  /**
   * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServices()
   * @generated
   * @ordered
   */
  protected EList<Service> services;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TeamImpl()
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
    return KanbanmodelPackage.Literals.TEAM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.TEAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Team> getDemandUnits()
  {
    if (demandUnits == null)
    {
      demandUnits = new EObjectResolvingEList<Team>(Team.class, this, KanbanmodelPackage.TEAM__DEMAND_UNITS);
    }
    return demandUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Team> getSourcedUnits()
  {
    if (sourcedUnits == null)
    {
      sourcedUnits = new EObjectResolvingEList<Team>(Team.class, this, KanbanmodelPackage.TEAM__SOURCED_UNITS);
    }
    return sourcedUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Team> getGroupmembers()
  {
    if (groupmembers == null)
    {
      groupmembers = new EObjectResolvingEList<Team>(Team.class, this, KanbanmodelPackage.TEAM__GROUPMEMBERS);
    }
    return groupmembers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Asset> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<Asset>(Asset.class, this, KanbanmodelPackage.TEAM__RESOURCES);
    }
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Service> getServices()
  {
    if (services == null)
    {
      services = new EObjectContainmentEList<Service>(Service.class, this, KanbanmodelPackage.TEAM__SERVICES);
    }
    return services;
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
      case KanbanmodelPackage.TEAM__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.TEAM__SERVICES:
        return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.TEAM__NAME:
        return getName();
      case KanbanmodelPackage.TEAM__DEMAND_UNITS:
        return getDemandUnits();
      case KanbanmodelPackage.TEAM__SOURCED_UNITS:
        return getSourcedUnits();
      case KanbanmodelPackage.TEAM__GROUPMEMBERS:
        return getGroupmembers();
      case KanbanmodelPackage.TEAM__RESOURCES:
        return getResources();
      case KanbanmodelPackage.TEAM__SERVICES:
        return getServices();
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
      case KanbanmodelPackage.TEAM__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.TEAM__DEMAND_UNITS:
        getDemandUnits().clear();
        getDemandUnits().addAll((Collection<? extends Team>)newValue);
        return;
      case KanbanmodelPackage.TEAM__SOURCED_UNITS:
        getSourcedUnits().clear();
        getSourcedUnits().addAll((Collection<? extends Team>)newValue);
        return;
      case KanbanmodelPackage.TEAM__GROUPMEMBERS:
        getGroupmembers().clear();
        getGroupmembers().addAll((Collection<? extends Team>)newValue);
        return;
      case KanbanmodelPackage.TEAM__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends Asset>)newValue);
        return;
      case KanbanmodelPackage.TEAM__SERVICES:
        getServices().clear();
        getServices().addAll((Collection<? extends Service>)newValue);
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
      case KanbanmodelPackage.TEAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.TEAM__DEMAND_UNITS:
        getDemandUnits().clear();
        return;
      case KanbanmodelPackage.TEAM__SOURCED_UNITS:
        getSourcedUnits().clear();
        return;
      case KanbanmodelPackage.TEAM__GROUPMEMBERS:
        getGroupmembers().clear();
        return;
      case KanbanmodelPackage.TEAM__RESOURCES:
        getResources().clear();
        return;
      case KanbanmodelPackage.TEAM__SERVICES:
        getServices().clear();
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
      case KanbanmodelPackage.TEAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.TEAM__DEMAND_UNITS:
        return demandUnits != null && !demandUnits.isEmpty();
      case KanbanmodelPackage.TEAM__SOURCED_UNITS:
        return sourcedUnits != null && !sourcedUnits.isEmpty();
      case KanbanmodelPackage.TEAM__GROUPMEMBERS:
        return groupmembers != null && !groupmembers.isEmpty();
      case KanbanmodelPackage.TEAM__RESOURCES:
        return resources != null && !resources.isEmpty();
      case KanbanmodelPackage.TEAM__SERVICES:
        return services != null && !services.isEmpty();
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

} //TeamImpl
