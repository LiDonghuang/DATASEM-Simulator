/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Decomposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkDecompositionImpl#getWorkItem <em>Work Item</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkDecompositionImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkDecompositionImpl extends MinimalEObjectImpl.Container implements WorkDecomposition
{
  /**
   * The cached value of the '{@link #getWorkItem() <em>Work Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkItem()
   * @generated
   * @ordered
   */
  protected WorkItemProfile workItem;

  /**
   * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected NumExpression amount;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkDecompositionImpl()
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
    return KanbanmodelPackage.Literals.WORK_DECOMPOSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkItemProfile getWorkItem()
  {
    if (workItem != null && workItem.eIsProxy())
    {
      InternalEObject oldWorkItem = (InternalEObject)workItem;
      workItem = (WorkItemProfile)eResolveProxy(oldWorkItem);
      if (workItem != oldWorkItem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.WORK_DECOMPOSITION__WORK_ITEM, oldWorkItem, workItem));
      }
    }
    return workItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkItemProfile basicGetWorkItem()
  {
    return workItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkItem(WorkItemProfile newWorkItem)
  {
    WorkItemProfile oldWorkItem = workItem;
    workItem = newWorkItem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_DECOMPOSITION__WORK_ITEM, oldWorkItem, workItem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumExpression getAmount()
  {
    return amount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAmount(NumExpression newAmount, NotificationChain msgs)
  {
    NumExpression oldAmount = amount;
    amount = newAmount;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_DECOMPOSITION__AMOUNT, oldAmount, newAmount);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAmount(NumExpression newAmount)
  {
    if (newAmount != amount)
    {
      NotificationChain msgs = null;
      if (amount != null)
        msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.WORK_DECOMPOSITION__AMOUNT, null, msgs);
      if (newAmount != null)
        msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.WORK_DECOMPOSITION__AMOUNT, null, msgs);
      msgs = basicSetAmount(newAmount, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_DECOMPOSITION__AMOUNT, newAmount, newAmount));
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
      case KanbanmodelPackage.WORK_DECOMPOSITION__AMOUNT:
        return basicSetAmount(null, msgs);
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
      case KanbanmodelPackage.WORK_DECOMPOSITION__WORK_ITEM:
        if (resolve) return getWorkItem();
        return basicGetWorkItem();
      case KanbanmodelPackage.WORK_DECOMPOSITION__AMOUNT:
        return getAmount();
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
      case KanbanmodelPackage.WORK_DECOMPOSITION__WORK_ITEM:
        setWorkItem((WorkItemProfile)newValue);
        return;
      case KanbanmodelPackage.WORK_DECOMPOSITION__AMOUNT:
        setAmount((NumExpression)newValue);
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
      case KanbanmodelPackage.WORK_DECOMPOSITION__WORK_ITEM:
        setWorkItem((WorkItemProfile)null);
        return;
      case KanbanmodelPackage.WORK_DECOMPOSITION__AMOUNT:
        setAmount((NumExpression)null);
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
      case KanbanmodelPackage.WORK_DECOMPOSITION__WORK_ITEM:
        return workItem != null;
      case KanbanmodelPackage.WORK_DECOMPOSITION__AMOUNT:
        return amount != null;
    }
    return super.eIsSet(featureID);
  }

} //WorkDecompositionImpl
