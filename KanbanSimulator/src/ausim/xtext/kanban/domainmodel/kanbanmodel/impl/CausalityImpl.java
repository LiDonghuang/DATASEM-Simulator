/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.Causality;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Causality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.CausalityImpl#getTriggered <em>Triggered</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.CausalityImpl#getTProgress <em>TProgress</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.CausalityImpl#getTProbability <em>TProbability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CausalityImpl extends MinimalEObjectImpl.Container implements Causality
{
  /**
   * The cached value of the '{@link #getTriggered() <em>Triggered</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggered()
   * @generated
   * @ordered
   */
  protected EList<WorkItem> triggered;

  /**
   * The default value of the '{@link #getTProgress() <em>TProgress</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTProgress()
   * @generated
   * @ordered
   */
  protected static final int TPROGRESS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTProgress() <em>TProgress</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTProgress()
   * @generated
   * @ordered
   */
  protected int tProgress = TPROGRESS_EDEFAULT;

  /**
   * The default value of the '{@link #getTProbability() <em>TProbability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTProbability()
   * @generated
   * @ordered
   */
  protected static final int TPROBABILITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTProbability() <em>TProbability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTProbability()
   * @generated
   * @ordered
   */
  protected int tProbability = TPROBABILITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CausalityImpl()
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
    return KanbanmodelPackage.Literals.CAUSALITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkItem> getTriggered()
  {
    if (triggered == null)
    {
      triggered = new EObjectResolvingEList<WorkItem>(WorkItem.class, this, KanbanmodelPackage.CAUSALITY__TRIGGERED);
    }
    return triggered;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTProgress()
  {
    return tProgress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTProgress(int newTProgress)
  {
    int oldTProgress = tProgress;
    tProgress = newTProgress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.CAUSALITY__TPROGRESS, oldTProgress, tProgress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTProbability()
  {
    return tProbability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTProbability(int newTProbability)
  {
    int oldTProbability = tProbability;
    tProbability = newTProbability;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.CAUSALITY__TPROBABILITY, oldTProbability, tProbability));
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
      case KanbanmodelPackage.CAUSALITY__TRIGGERED:
        return getTriggered();
      case KanbanmodelPackage.CAUSALITY__TPROGRESS:
        return getTProgress();
      case KanbanmodelPackage.CAUSALITY__TPROBABILITY:
        return getTProbability();
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
      case KanbanmodelPackage.CAUSALITY__TRIGGERED:
        getTriggered().clear();
        getTriggered().addAll((Collection<? extends WorkItem>)newValue);
        return;
      case KanbanmodelPackage.CAUSALITY__TPROGRESS:
        setTProgress((Integer)newValue);
        return;
      case KanbanmodelPackage.CAUSALITY__TPROBABILITY:
        setTProbability((Integer)newValue);
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
      case KanbanmodelPackage.CAUSALITY__TRIGGERED:
        getTriggered().clear();
        return;
      case KanbanmodelPackage.CAUSALITY__TPROGRESS:
        setTProgress(TPROGRESS_EDEFAULT);
        return;
      case KanbanmodelPackage.CAUSALITY__TPROBABILITY:
        setTProbability(TPROBABILITY_EDEFAULT);
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
      case KanbanmodelPackage.CAUSALITY__TRIGGERED:
        return triggered != null && !triggered.isEmpty();
      case KanbanmodelPackage.CAUSALITY__TPROGRESS:
        return tProgress != TPROGRESS_EDEFAULT;
      case KanbanmodelPackage.CAUSALITY__TPROBABILITY:
        return tProbability != TPROBABILITY_EDEFAULT;
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
    result.append(" (tProgress: ");
    result.append(tProgress);
    result.append(", tProbability: ");
    result.append(tProbability);
    result.append(')');
    return result.toString();
  }

} //CausalityImpl
