/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mechanism</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl#getSourceTask <em>Source Task</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl#getTargetTask <em>Target Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MechanismImpl extends MinimalEObjectImpl.Container implements Mechanism
{
  /**
   * The cached value of the '{@link #getSourceTask() <em>Source Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceTask()
   * @generated
   * @ordered
   */
  protected Task sourceTask;

  /**
   * The cached value of the '{@link #getTargetTask() <em>Target Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetTask()
   * @generated
   * @ordered
   */
  protected Task targetTask;

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
  public Task getSourceTask()
  {
    if (sourceTask != null && sourceTask.eIsProxy())
    {
      InternalEObject oldSourceTask = (InternalEObject)sourceTask;
      sourceTask = (Task)eResolveProxy(oldSourceTask);
      if (sourceTask != oldSourceTask)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.MECHANISM__SOURCE_TASK, oldSourceTask, sourceTask));
      }
    }
    return sourceTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task basicGetSourceTask()
  {
    return sourceTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceTask(Task newSourceTask)
  {
    Task oldSourceTask = sourceTask;
    sourceTask = newSourceTask;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.MECHANISM__SOURCE_TASK, oldSourceTask, sourceTask));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task getTargetTask()
  {
    if (targetTask != null && targetTask.eIsProxy())
    {
      InternalEObject oldTargetTask = (InternalEObject)targetTask;
      targetTask = (Task)eResolveProxy(oldTargetTask);
      if (targetTask != oldTargetTask)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.MECHANISM__TARGET_TASK, oldTargetTask, targetTask));
      }
    }
    return targetTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task basicGetTargetTask()
  {
    return targetTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetTask(Task newTargetTask)
  {
    Task oldTargetTask = targetTask;
    targetTask = newTargetTask;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.MECHANISM__TARGET_TASK, oldTargetTask, targetTask));
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
      case KanbanmodelPackage.MECHANISM__SOURCE_TASK:
        if (resolve) return getSourceTask();
        return basicGetSourceTask();
      case KanbanmodelPackage.MECHANISM__TARGET_TASK:
        if (resolve) return getTargetTask();
        return basicGetTargetTask();
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
      case KanbanmodelPackage.MECHANISM__SOURCE_TASK:
        setSourceTask((Task)newValue);
        return;
      case KanbanmodelPackage.MECHANISM__TARGET_TASK:
        setTargetTask((Task)newValue);
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
      case KanbanmodelPackage.MECHANISM__SOURCE_TASK:
        setSourceTask((Task)null);
        return;
      case KanbanmodelPackage.MECHANISM__TARGET_TASK:
        setTargetTask((Task)null);
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
      case KanbanmodelPackage.MECHANISM__SOURCE_TASK:
        return sourceTask != null;
      case KanbanmodelPackage.MECHANISM__TARGET_TASK:
        return targetTask != null;
    }
    return super.eIsSet(featureID);
  }

} //MechanismImpl
