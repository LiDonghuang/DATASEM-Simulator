/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WIAssignment;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WISelection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl#getWIAcceptanceRule <em>WI Acceptance Rule</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl#getWISelectionRule <em>WI Selection Rule</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl#getWIAssignmentRule <em>WI Assignment Rule</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl#getResourceAllocationRule <em>Resource Allocation Rule</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl#getResourceOutsourcingRule <em>Resource Outsourcing Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrategyImpl extends MinimalEObjectImpl.Container implements Strategy
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
   * The cached value of the '{@link #getWIAcceptanceRule() <em>WI Acceptance Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWIAcceptanceRule()
   * @generated
   * @ordered
   */
  protected WIAcceptance wiAcceptanceRule;

  /**
   * The cached value of the '{@link #getWISelectionRule() <em>WI Selection Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWISelectionRule()
   * @generated
   * @ordered
   */
  protected WISelection wiSelectionRule;

  /**
   * The cached value of the '{@link #getWIAssignmentRule() <em>WI Assignment Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWIAssignmentRule()
   * @generated
   * @ordered
   */
  protected WIAssignment wiAssignmentRule;

  /**
   * The cached value of the '{@link #getResourceAllocationRule() <em>Resource Allocation Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceAllocationRule()
   * @generated
   * @ordered
   */
  protected ResourceAllocation resourceAllocationRule;

  /**
   * The cached value of the '{@link #getResourceOutsourcingRule() <em>Resource Outsourcing Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceOutsourcingRule()
   * @generated
   * @ordered
   */
  protected ResourceOutsourcing resourceOutsourcingRule;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StrategyImpl()
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
    return KanbanmodelPackage.Literals.STRATEGY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.STRATEGY__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.STRATEGY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WIAcceptance getWIAcceptanceRule()
  {
    return wiAcceptanceRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWIAcceptanceRule(WIAcceptance newWIAcceptanceRule, NotificationChain msgs)
  {
    WIAcceptance oldWIAcceptanceRule = wiAcceptanceRule;
    wiAcceptanceRule = newWIAcceptanceRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.STRATEGY__WI_ACCEPTANCE_RULE, oldWIAcceptanceRule, newWIAcceptanceRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWIAcceptanceRule(WIAcceptance newWIAcceptanceRule)
  {
    if (newWIAcceptanceRule != wiAcceptanceRule)
    {
      NotificationChain msgs = null;
      if (wiAcceptanceRule != null)
        msgs = ((InternalEObject)wiAcceptanceRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.STRATEGY__WI_ACCEPTANCE_RULE, null, msgs);
      if (newWIAcceptanceRule != null)
        msgs = ((InternalEObject)newWIAcceptanceRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.STRATEGY__WI_ACCEPTANCE_RULE, null, msgs);
      msgs = basicSetWIAcceptanceRule(newWIAcceptanceRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.STRATEGY__WI_ACCEPTANCE_RULE, newWIAcceptanceRule, newWIAcceptanceRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WISelection getWISelectionRule()
  {
    return wiSelectionRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWISelectionRule(WISelection newWISelectionRule, NotificationChain msgs)
  {
    WISelection oldWISelectionRule = wiSelectionRule;
    wiSelectionRule = newWISelectionRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.STRATEGY__WI_SELECTION_RULE, oldWISelectionRule, newWISelectionRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWISelectionRule(WISelection newWISelectionRule)
  {
    if (newWISelectionRule != wiSelectionRule)
    {
      NotificationChain msgs = null;
      if (wiSelectionRule != null)
        msgs = ((InternalEObject)wiSelectionRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.STRATEGY__WI_SELECTION_RULE, null, msgs);
      if (newWISelectionRule != null)
        msgs = ((InternalEObject)newWISelectionRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.STRATEGY__WI_SELECTION_RULE, null, msgs);
      msgs = basicSetWISelectionRule(newWISelectionRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.STRATEGY__WI_SELECTION_RULE, newWISelectionRule, newWISelectionRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WIAssignment getWIAssignmentRule()
  {
    return wiAssignmentRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWIAssignmentRule(WIAssignment newWIAssignmentRule, NotificationChain msgs)
  {
    WIAssignment oldWIAssignmentRule = wiAssignmentRule;
    wiAssignmentRule = newWIAssignmentRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.STRATEGY__WI_ASSIGNMENT_RULE, oldWIAssignmentRule, newWIAssignmentRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWIAssignmentRule(WIAssignment newWIAssignmentRule)
  {
    if (newWIAssignmentRule != wiAssignmentRule)
    {
      NotificationChain msgs = null;
      if (wiAssignmentRule != null)
        msgs = ((InternalEObject)wiAssignmentRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.STRATEGY__WI_ASSIGNMENT_RULE, null, msgs);
      if (newWIAssignmentRule != null)
        msgs = ((InternalEObject)newWIAssignmentRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.STRATEGY__WI_ASSIGNMENT_RULE, null, msgs);
      msgs = basicSetWIAssignmentRule(newWIAssignmentRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.STRATEGY__WI_ASSIGNMENT_RULE, newWIAssignmentRule, newWIAssignmentRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceAllocation getResourceAllocationRule()
  {
    return resourceAllocationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResourceAllocationRule(ResourceAllocation newResourceAllocationRule, NotificationChain msgs)
  {
    ResourceAllocation oldResourceAllocationRule = resourceAllocationRule;
    resourceAllocationRule = newResourceAllocationRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.STRATEGY__RESOURCE_ALLOCATION_RULE, oldResourceAllocationRule, newResourceAllocationRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourceAllocationRule(ResourceAllocation newResourceAllocationRule)
  {
    if (newResourceAllocationRule != resourceAllocationRule)
    {
      NotificationChain msgs = null;
      if (resourceAllocationRule != null)
        msgs = ((InternalEObject)resourceAllocationRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.STRATEGY__RESOURCE_ALLOCATION_RULE, null, msgs);
      if (newResourceAllocationRule != null)
        msgs = ((InternalEObject)newResourceAllocationRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.STRATEGY__RESOURCE_ALLOCATION_RULE, null, msgs);
      msgs = basicSetResourceAllocationRule(newResourceAllocationRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.STRATEGY__RESOURCE_ALLOCATION_RULE, newResourceAllocationRule, newResourceAllocationRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceOutsourcing getResourceOutsourcingRule()
  {
    return resourceOutsourcingRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResourceOutsourcingRule(ResourceOutsourcing newResourceOutsourcingRule, NotificationChain msgs)
  {
    ResourceOutsourcing oldResourceOutsourcingRule = resourceOutsourcingRule;
    resourceOutsourcingRule = newResourceOutsourcingRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.STRATEGY__RESOURCE_OUTSOURCING_RULE, oldResourceOutsourcingRule, newResourceOutsourcingRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourceOutsourcingRule(ResourceOutsourcing newResourceOutsourcingRule)
  {
    if (newResourceOutsourcingRule != resourceOutsourcingRule)
    {
      NotificationChain msgs = null;
      if (resourceOutsourcingRule != null)
        msgs = ((InternalEObject)resourceOutsourcingRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.STRATEGY__RESOURCE_OUTSOURCING_RULE, null, msgs);
      if (newResourceOutsourcingRule != null)
        msgs = ((InternalEObject)newResourceOutsourcingRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.STRATEGY__RESOURCE_OUTSOURCING_RULE, null, msgs);
      msgs = basicSetResourceOutsourcingRule(newResourceOutsourcingRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.STRATEGY__RESOURCE_OUTSOURCING_RULE, newResourceOutsourcingRule, newResourceOutsourcingRule));
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
      case KanbanmodelPackage.STRATEGY__WI_ACCEPTANCE_RULE:
        return basicSetWIAcceptanceRule(null, msgs);
      case KanbanmodelPackage.STRATEGY__WI_SELECTION_RULE:
        return basicSetWISelectionRule(null, msgs);
      case KanbanmodelPackage.STRATEGY__WI_ASSIGNMENT_RULE:
        return basicSetWIAssignmentRule(null, msgs);
      case KanbanmodelPackage.STRATEGY__RESOURCE_ALLOCATION_RULE:
        return basicSetResourceAllocationRule(null, msgs);
      case KanbanmodelPackage.STRATEGY__RESOURCE_OUTSOURCING_RULE:
        return basicSetResourceOutsourcingRule(null, msgs);
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
      case KanbanmodelPackage.STRATEGY__NAME:
        return getName();
      case KanbanmodelPackage.STRATEGY__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.STRATEGY__WI_ACCEPTANCE_RULE:
        return getWIAcceptanceRule();
      case KanbanmodelPackage.STRATEGY__WI_SELECTION_RULE:
        return getWISelectionRule();
      case KanbanmodelPackage.STRATEGY__WI_ASSIGNMENT_RULE:
        return getWIAssignmentRule();
      case KanbanmodelPackage.STRATEGY__RESOURCE_ALLOCATION_RULE:
        return getResourceAllocationRule();
      case KanbanmodelPackage.STRATEGY__RESOURCE_OUTSOURCING_RULE:
        return getResourceOutsourcingRule();
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
      case KanbanmodelPackage.STRATEGY__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.STRATEGY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.STRATEGY__WI_ACCEPTANCE_RULE:
        setWIAcceptanceRule((WIAcceptance)newValue);
        return;
      case KanbanmodelPackage.STRATEGY__WI_SELECTION_RULE:
        setWISelectionRule((WISelection)newValue);
        return;
      case KanbanmodelPackage.STRATEGY__WI_ASSIGNMENT_RULE:
        setWIAssignmentRule((WIAssignment)newValue);
        return;
      case KanbanmodelPackage.STRATEGY__RESOURCE_ALLOCATION_RULE:
        setResourceAllocationRule((ResourceAllocation)newValue);
        return;
      case KanbanmodelPackage.STRATEGY__RESOURCE_OUTSOURCING_RULE:
        setResourceOutsourcingRule((ResourceOutsourcing)newValue);
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
      case KanbanmodelPackage.STRATEGY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.STRATEGY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.STRATEGY__WI_ACCEPTANCE_RULE:
        setWIAcceptanceRule((WIAcceptance)null);
        return;
      case KanbanmodelPackage.STRATEGY__WI_SELECTION_RULE:
        setWISelectionRule((WISelection)null);
        return;
      case KanbanmodelPackage.STRATEGY__WI_ASSIGNMENT_RULE:
        setWIAssignmentRule((WIAssignment)null);
        return;
      case KanbanmodelPackage.STRATEGY__RESOURCE_ALLOCATION_RULE:
        setResourceAllocationRule((ResourceAllocation)null);
        return;
      case KanbanmodelPackage.STRATEGY__RESOURCE_OUTSOURCING_RULE:
        setResourceOutsourcingRule((ResourceOutsourcing)null);
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
      case KanbanmodelPackage.STRATEGY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.STRATEGY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.STRATEGY__WI_ACCEPTANCE_RULE:
        return wiAcceptanceRule != null;
      case KanbanmodelPackage.STRATEGY__WI_SELECTION_RULE:
        return wiSelectionRule != null;
      case KanbanmodelPackage.STRATEGY__WI_ASSIGNMENT_RULE:
        return wiAssignmentRule != null;
      case KanbanmodelPackage.STRATEGY__RESOURCE_ALLOCATION_RULE:
        return resourceAllocationRule != null;
      case KanbanmodelPackage.STRATEGY__RESOURCE_OUTSOURCING_RULE:
        return resourceOutsourcingRule != null;
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

} //StrategyImpl
