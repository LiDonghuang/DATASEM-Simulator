/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkSourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkSourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkSourceImpl#getTargetUnits <em>Target Units</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkSourceImpl#getAssignmentRule <em>Assignment Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkSourceImpl extends MinimalEObjectImpl.Container implements WorkSource
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
   * The cached value of the '{@link #getTargetUnits() <em>Target Units</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetUnits()
   * @generated
   * @ordered
   */
  protected EList<ServiceProvider> targetUnits;

  /**
   * The cached value of the '{@link #getAssignmentRule() <em>Assignment Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignmentRule()
   * @generated
   * @ordered
   */
  protected WIAssignment assignmentRule;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkSourceImpl()
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
    return KanbanmodelPackage.Literals.WORK_SOURCE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_SOURCE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_SOURCE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceProvider> getTargetUnits()
  {
    if (targetUnits == null)
    {
      targetUnits = new EObjectResolvingEList<ServiceProvider>(ServiceProvider.class, this, KanbanmodelPackage.WORK_SOURCE__TARGET_UNITS);
    }
    return targetUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WIAssignment getAssignmentRule()
  {
    return assignmentRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignmentRule(WIAssignment newAssignmentRule, NotificationChain msgs)
  {
    WIAssignment oldAssignmentRule = assignmentRule;
    assignmentRule = newAssignmentRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_SOURCE__ASSIGNMENT_RULE, oldAssignmentRule, newAssignmentRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignmentRule(WIAssignment newAssignmentRule)
  {
    if (newAssignmentRule != assignmentRule)
    {
      NotificationChain msgs = null;
      if (assignmentRule != null)
        msgs = ((InternalEObject)assignmentRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.WORK_SOURCE__ASSIGNMENT_RULE, null, msgs);
      if (newAssignmentRule != null)
        msgs = ((InternalEObject)newAssignmentRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.WORK_SOURCE__ASSIGNMENT_RULE, null, msgs);
      msgs = basicSetAssignmentRule(newAssignmentRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_SOURCE__ASSIGNMENT_RULE, newAssignmentRule, newAssignmentRule));
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
      case KanbanmodelPackage.WORK_SOURCE__ASSIGNMENT_RULE:
        return basicSetAssignmentRule(null, msgs);
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
      case KanbanmodelPackage.WORK_SOURCE__NAME:
        return getName();
      case KanbanmodelPackage.WORK_SOURCE__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.WORK_SOURCE__TARGET_UNITS:
        return getTargetUnits();
      case KanbanmodelPackage.WORK_SOURCE__ASSIGNMENT_RULE:
        return getAssignmentRule();
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
      case KanbanmodelPackage.WORK_SOURCE__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.WORK_SOURCE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.WORK_SOURCE__TARGET_UNITS:
        getTargetUnits().clear();
        getTargetUnits().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case KanbanmodelPackage.WORK_SOURCE__ASSIGNMENT_RULE:
        setAssignmentRule((WIAssignment)newValue);
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
      case KanbanmodelPackage.WORK_SOURCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_SOURCE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_SOURCE__TARGET_UNITS:
        getTargetUnits().clear();
        return;
      case KanbanmodelPackage.WORK_SOURCE__ASSIGNMENT_RULE:
        setAssignmentRule((WIAssignment)null);
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
      case KanbanmodelPackage.WORK_SOURCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.WORK_SOURCE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.WORK_SOURCE__TARGET_UNITS:
        return targetUnits != null && !targetUnits.isEmpty();
      case KanbanmodelPackage.WORK_SOURCE__ASSIGNMENT_RULE:
        return assignmentRule != null;
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

} //WorkSourceImpl
