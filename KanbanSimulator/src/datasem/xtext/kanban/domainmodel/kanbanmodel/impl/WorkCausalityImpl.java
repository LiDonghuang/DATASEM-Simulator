/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkCausality;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Causality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkCausalityImpl#getWorkItem <em>Work Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkCausalityImpl extends MinimalEObjectImpl.Container implements WorkCausality
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkCausalityImpl()
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
    return KanbanmodelPackage.Literals.WORK_CAUSALITY;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.WORK_CAUSALITY__WORK_ITEM, oldWorkItem, workItem));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_CAUSALITY__WORK_ITEM, oldWorkItem, workItem));
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
      case KanbanmodelPackage.WORK_CAUSALITY__WORK_ITEM:
        if (resolve) return getWorkItem();
        return basicGetWorkItem();
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
      case KanbanmodelPackage.WORK_CAUSALITY__WORK_ITEM:
        setWorkItem((WorkItemProfile)newValue);
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
      case KanbanmodelPackage.WORK_CAUSALITY__WORK_ITEM:
        setWorkItem((WorkItemProfile)null);
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
      case KanbanmodelPackage.WORK_CAUSALITY__WORK_ITEM:
        return workItem != null;
    }
    return super.eIsSet(featureID);
  }

} //WorkCausalityImpl
