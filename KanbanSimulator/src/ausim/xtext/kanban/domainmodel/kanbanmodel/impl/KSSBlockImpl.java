/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Team;

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
 * An implementation of the model object '<em><b>KSS Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KSSBlockImpl#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KSSBlockImpl#getAssignedUnit <em>Assigned Unit</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KSSBlockImpl#getDemandUnits <em>Demand Units</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KSSBlockImpl#getSourcedUnits <em>Sourced Units</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KSSBlockImpl#getRQueueLimit <em>RQueue Limit</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KSSBlockImpl#getWipLimit <em>Wip Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KSSBlockImpl extends MinimalEObjectImpl.Container implements KSSBlock
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
   * The cached value of the '{@link #getAssignedUnit() <em>Assigned Unit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignedUnit()
   * @generated
   * @ordered
   */
  protected Team assignedUnit;

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
   * The default value of the '{@link #getRQueueLimit() <em>RQueue Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRQueueLimit()
   * @generated
   * @ordered
   */
  protected static final int RQUEUE_LIMIT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRQueueLimit() <em>RQueue Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRQueueLimit()
   * @generated
   * @ordered
   */
  protected int rQueueLimit = RQUEUE_LIMIT_EDEFAULT;

  /**
   * The default value of the '{@link #getWipLimit() <em>Wip Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWipLimit()
   * @generated
   * @ordered
   */
  protected static final int WIP_LIMIT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getWipLimit() <em>Wip Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWipLimit()
   * @generated
   * @ordered
   */
  protected int wipLimit = WIP_LIMIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KSSBlockImpl()
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
    return KanbanmodelPackage.Literals.KSS_BLOCK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.KSS_BLOCK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Team getAssignedUnit()
  {
    if (assignedUnit != null && assignedUnit.eIsProxy())
    {
      InternalEObject oldAssignedUnit = (InternalEObject)assignedUnit;
      assignedUnit = (Team)eResolveProxy(oldAssignedUnit);
      if (assignedUnit != oldAssignedUnit)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.KSS_BLOCK__ASSIGNED_UNIT, oldAssignedUnit, assignedUnit));
      }
    }
    return assignedUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Team basicGetAssignedUnit()
  {
    return assignedUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignedUnit(Team newAssignedUnit)
  {
    Team oldAssignedUnit = assignedUnit;
    assignedUnit = newAssignedUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.KSS_BLOCK__ASSIGNED_UNIT, oldAssignedUnit, assignedUnit));
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
      demandUnits = new EObjectResolvingEList<Team>(Team.class, this, KanbanmodelPackage.KSS_BLOCK__DEMAND_UNITS);
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
      sourcedUnits = new EObjectResolvingEList<Team>(Team.class, this, KanbanmodelPackage.KSS_BLOCK__SOURCED_UNITS);
    }
    return sourcedUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRQueueLimit()
  {
    return rQueueLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRQueueLimit(int newRQueueLimit)
  {
    int oldRQueueLimit = rQueueLimit;
    rQueueLimit = newRQueueLimit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.KSS_BLOCK__RQUEUE_LIMIT, oldRQueueLimit, rQueueLimit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWipLimit()
  {
    return wipLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWipLimit(int newWipLimit)
  {
    int oldWipLimit = wipLimit;
    wipLimit = newWipLimit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.KSS_BLOCK__WIP_LIMIT, oldWipLimit, wipLimit));
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
      case KanbanmodelPackage.KSS_BLOCK__NAME:
        return getName();
      case KanbanmodelPackage.KSS_BLOCK__ASSIGNED_UNIT:
        if (resolve) return getAssignedUnit();
        return basicGetAssignedUnit();
      case KanbanmodelPackage.KSS_BLOCK__DEMAND_UNITS:
        return getDemandUnits();
      case KanbanmodelPackage.KSS_BLOCK__SOURCED_UNITS:
        return getSourcedUnits();
      case KanbanmodelPackage.KSS_BLOCK__RQUEUE_LIMIT:
        return getRQueueLimit();
      case KanbanmodelPackage.KSS_BLOCK__WIP_LIMIT:
        return getWipLimit();
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
      case KanbanmodelPackage.KSS_BLOCK__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.KSS_BLOCK__ASSIGNED_UNIT:
        setAssignedUnit((Team)newValue);
        return;
      case KanbanmodelPackage.KSS_BLOCK__DEMAND_UNITS:
        getDemandUnits().clear();
        getDemandUnits().addAll((Collection<? extends Team>)newValue);
        return;
      case KanbanmodelPackage.KSS_BLOCK__SOURCED_UNITS:
        getSourcedUnits().clear();
        getSourcedUnits().addAll((Collection<? extends Team>)newValue);
        return;
      case KanbanmodelPackage.KSS_BLOCK__RQUEUE_LIMIT:
        setRQueueLimit((Integer)newValue);
        return;
      case KanbanmodelPackage.KSS_BLOCK__WIP_LIMIT:
        setWipLimit((Integer)newValue);
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
      case KanbanmodelPackage.KSS_BLOCK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.KSS_BLOCK__ASSIGNED_UNIT:
        setAssignedUnit((Team)null);
        return;
      case KanbanmodelPackage.KSS_BLOCK__DEMAND_UNITS:
        getDemandUnits().clear();
        return;
      case KanbanmodelPackage.KSS_BLOCK__SOURCED_UNITS:
        getSourcedUnits().clear();
        return;
      case KanbanmodelPackage.KSS_BLOCK__RQUEUE_LIMIT:
        setRQueueLimit(RQUEUE_LIMIT_EDEFAULT);
        return;
      case KanbanmodelPackage.KSS_BLOCK__WIP_LIMIT:
        setWipLimit(WIP_LIMIT_EDEFAULT);
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
      case KanbanmodelPackage.KSS_BLOCK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.KSS_BLOCK__ASSIGNED_UNIT:
        return assignedUnit != null;
      case KanbanmodelPackage.KSS_BLOCK__DEMAND_UNITS:
        return demandUnits != null && !demandUnits.isEmpty();
      case KanbanmodelPackage.KSS_BLOCK__SOURCED_UNITS:
        return sourcedUnits != null && !sourcedUnits.isEmpty();
      case KanbanmodelPackage.KSS_BLOCK__RQUEUE_LIMIT:
        return rQueueLimit != RQUEUE_LIMIT_EDEFAULT;
      case KanbanmodelPackage.KSS_BLOCK__WIP_LIMIT:
        return wipLimit != WIP_LIMIT_EDEFAULT;
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
    result.append(", rQueueLimit: ");
    result.append(rQueueLimit);
    result.append(", wipLimit: ");
    result.append(wipLimit);
    result.append(')');
    return result.toString();
  }

} //KSSBlockImpl
