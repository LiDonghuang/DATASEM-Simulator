/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.TaskPattern;
import datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskPatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskPatternImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskPatternImpl#getTaskpatternTypes <em>Taskpattern Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskPatternImpl extends MinimalEObjectImpl.Container implements TaskPattern
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
   * The cached value of the '{@link #getTaskpatternTypes() <em>Taskpattern Types</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskpatternTypes()
   * @generated
   * @ordered
   */
  protected EList<TaskType> taskpatternTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskPatternImpl()
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
    return KanbanmodelPackage.Literals.TASK_PATTERN;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.TASK_PATTERN__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.TASK_PATTERN__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TaskType> getTaskpatternTypes()
  {
    if (taskpatternTypes == null)
    {
      taskpatternTypes = new EObjectResolvingEList<TaskType>(TaskType.class, this, KanbanmodelPackage.TASK_PATTERN__TASKPATTERN_TYPES);
    }
    return taskpatternTypes;
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
      case KanbanmodelPackage.TASK_PATTERN__NAME:
        return getName();
      case KanbanmodelPackage.TASK_PATTERN__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.TASK_PATTERN__TASKPATTERN_TYPES:
        return getTaskpatternTypes();
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
      case KanbanmodelPackage.TASK_PATTERN__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.TASK_PATTERN__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.TASK_PATTERN__TASKPATTERN_TYPES:
        getTaskpatternTypes().clear();
        getTaskpatternTypes().addAll((Collection<? extends TaskType>)newValue);
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
      case KanbanmodelPackage.TASK_PATTERN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.TASK_PATTERN__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.TASK_PATTERN__TASKPATTERN_TYPES:
        getTaskpatternTypes().clear();
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
      case KanbanmodelPackage.TASK_PATTERN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.TASK_PATTERN__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.TASK_PATTERN__TASKPATTERN_TYPES:
        return taskpatternTypes != null && !taskpatternTypes.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //TaskPatternImpl
