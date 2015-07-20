/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WorkPrecedency;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Precedency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkPrecedencyImpl#getWorkItem <em>Work Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkPrecedencyImpl extends MinimalEObjectImpl.Container implements WorkPrecedency
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
  protected WorkPrecedencyImpl()
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
    return KanbanmodelPackage.Literals.WORK_PRECEDENCY;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.WORK_PRECEDENCY__WORK_ITEM, oldWorkItem, workItem));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_PRECEDENCY__WORK_ITEM, oldWorkItem, workItem));
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
      case KanbanmodelPackage.WORK_PRECEDENCY__WORK_ITEM:
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
      case KanbanmodelPackage.WORK_PRECEDENCY__WORK_ITEM:
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
      case KanbanmodelPackage.WORK_PRECEDENCY__WORK_ITEM:
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
      case KanbanmodelPackage.WORK_PRECEDENCY__WORK_ITEM:
        return workItem != null;
    }
    return super.eIsSet(featureID);
  }

} //WorkPrecedencyImpl
