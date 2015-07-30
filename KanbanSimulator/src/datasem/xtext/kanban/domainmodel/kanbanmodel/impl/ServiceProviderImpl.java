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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Resource;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Service;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getSourceUnits <em>Source Units</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getTargetUnits <em>Target Units</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getSubordinateUnits <em>Subordinate Units</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getServices <em>Services</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getDefaultStrategy <em>Default Strategy</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getAcceptanceRule <em>Acceptance Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getSelectionRule <em>Selection Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getAssignmentRule <em>Assignment Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getAllocationRule <em>Allocation Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getOutsourcingRule <em>Outsourcing Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceProviderImpl extends MinimalEObjectImpl.Container implements ServiceProvider
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
   * The cached value of the '{@link #getSourceUnits() <em>Source Units</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceUnits()
   * @generated
   * @ordered
   */
  protected EList<ServiceProvider> sourceUnits;

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
   * The cached value of the '{@link #getSubordinateUnits() <em>Subordinate Units</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubordinateUnits()
   * @generated
   * @ordered
   */
  protected EList<ServiceProvider> subordinateUnits;

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
   * The cached value of the '{@link #getDefaultStrategy() <em>Default Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultStrategy()
   * @generated
   * @ordered
   */
  protected Strategy defaultStrategy;

  /**
   * The cached value of the '{@link #getAcceptanceRule() <em>Acceptance Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcceptanceRule()
   * @generated
   * @ordered
   */
  protected WIAcceptance acceptanceRule;

  /**
   * The cached value of the '{@link #getSelectionRule() <em>Selection Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectionRule()
   * @generated
   * @ordered
   */
  protected WISelection selectionRule;

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
   * The cached value of the '{@link #getAllocationRule() <em>Allocation Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllocationRule()
   * @generated
   * @ordered
   */
  protected ResourceAllocation allocationRule;

  /**
   * The cached value of the '{@link #getOutsourcingRule() <em>Outsourcing Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutsourcingRule()
   * @generated
   * @ordered
   */
  protected ResourceOutsourcing outsourcingRule;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<Resource> resources;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceProviderImpl()
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
    return KanbanmodelPackage.Literals.SERVICE_PROVIDER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceProvider> getSourceUnits()
  {
    if (sourceUnits == null)
    {
      sourceUnits = new EObjectResolvingEList<ServiceProvider>(ServiceProvider.class, this, KanbanmodelPackage.SERVICE_PROVIDER__SOURCE_UNITS);
    }
    return sourceUnits;
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
      targetUnits = new EObjectResolvingEList<ServiceProvider>(ServiceProvider.class, this, KanbanmodelPackage.SERVICE_PROVIDER__TARGET_UNITS);
    }
    return targetUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceProvider> getSubordinateUnits()
  {
    if (subordinateUnits == null)
    {
      subordinateUnits = new EObjectResolvingEList<ServiceProvider>(ServiceProvider.class, this, KanbanmodelPackage.SERVICE_PROVIDER__SUBORDINATE_UNITS);
    }
    return subordinateUnits;
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
      services = new EObjectContainmentEList<Service>(Service.class, this, KanbanmodelPackage.SERVICE_PROVIDER__SERVICES);
    }
    return services;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Strategy getDefaultStrategy()
  {
    if (defaultStrategy != null && defaultStrategy.eIsProxy())
    {
      InternalEObject oldDefaultStrategy = (InternalEObject)defaultStrategy;
      defaultStrategy = (Strategy)eResolveProxy(oldDefaultStrategy);
      if (defaultStrategy != oldDefaultStrategy)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.SERVICE_PROVIDER__DEFAULT_STRATEGY, oldDefaultStrategy, defaultStrategy));
      }
    }
    return defaultStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Strategy basicGetDefaultStrategy()
  {
    return defaultStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultStrategy(Strategy newDefaultStrategy)
  {
    Strategy oldDefaultStrategy = defaultStrategy;
    defaultStrategy = newDefaultStrategy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__DEFAULT_STRATEGY, oldDefaultStrategy, defaultStrategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WIAcceptance getAcceptanceRule()
  {
    return acceptanceRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAcceptanceRule(WIAcceptance newAcceptanceRule, NotificationChain msgs)
  {
    WIAcceptance oldAcceptanceRule = acceptanceRule;
    acceptanceRule = newAcceptanceRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__ACCEPTANCE_RULE, oldAcceptanceRule, newAcceptanceRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcceptanceRule(WIAcceptance newAcceptanceRule)
  {
    if (newAcceptanceRule != acceptanceRule)
    {
      NotificationChain msgs = null;
      if (acceptanceRule != null)
        msgs = ((InternalEObject)acceptanceRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.SERVICE_PROVIDER__ACCEPTANCE_RULE, null, msgs);
      if (newAcceptanceRule != null)
        msgs = ((InternalEObject)newAcceptanceRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.SERVICE_PROVIDER__ACCEPTANCE_RULE, null, msgs);
      msgs = basicSetAcceptanceRule(newAcceptanceRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__ACCEPTANCE_RULE, newAcceptanceRule, newAcceptanceRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WISelection getSelectionRule()
  {
    return selectionRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectionRule(WISelection newSelectionRule, NotificationChain msgs)
  {
    WISelection oldSelectionRule = selectionRule;
    selectionRule = newSelectionRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__SELECTION_RULE, oldSelectionRule, newSelectionRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectionRule(WISelection newSelectionRule)
  {
    if (newSelectionRule != selectionRule)
    {
      NotificationChain msgs = null;
      if (selectionRule != null)
        msgs = ((InternalEObject)selectionRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.SERVICE_PROVIDER__SELECTION_RULE, null, msgs);
      if (newSelectionRule != null)
        msgs = ((InternalEObject)newSelectionRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.SERVICE_PROVIDER__SELECTION_RULE, null, msgs);
      msgs = basicSetSelectionRule(newSelectionRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__SELECTION_RULE, newSelectionRule, newSelectionRule));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__ASSIGNMENT_RULE, oldAssignmentRule, newAssignmentRule);
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
        msgs = ((InternalEObject)assignmentRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.SERVICE_PROVIDER__ASSIGNMENT_RULE, null, msgs);
      if (newAssignmentRule != null)
        msgs = ((InternalEObject)newAssignmentRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.SERVICE_PROVIDER__ASSIGNMENT_RULE, null, msgs);
      msgs = basicSetAssignmentRule(newAssignmentRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__ASSIGNMENT_RULE, newAssignmentRule, newAssignmentRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceAllocation getAllocationRule()
  {
    return allocationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAllocationRule(ResourceAllocation newAllocationRule, NotificationChain msgs)
  {
    ResourceAllocation oldAllocationRule = allocationRule;
    allocationRule = newAllocationRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__ALLOCATION_RULE, oldAllocationRule, newAllocationRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllocationRule(ResourceAllocation newAllocationRule)
  {
    if (newAllocationRule != allocationRule)
    {
      NotificationChain msgs = null;
      if (allocationRule != null)
        msgs = ((InternalEObject)allocationRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.SERVICE_PROVIDER__ALLOCATION_RULE, null, msgs);
      if (newAllocationRule != null)
        msgs = ((InternalEObject)newAllocationRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.SERVICE_PROVIDER__ALLOCATION_RULE, null, msgs);
      msgs = basicSetAllocationRule(newAllocationRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__ALLOCATION_RULE, newAllocationRule, newAllocationRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceOutsourcing getOutsourcingRule()
  {
    return outsourcingRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutsourcingRule(ResourceOutsourcing newOutsourcingRule, NotificationChain msgs)
  {
    ResourceOutsourcing oldOutsourcingRule = outsourcingRule;
    outsourcingRule = newOutsourcingRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__OUTSOURCING_RULE, oldOutsourcingRule, newOutsourcingRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutsourcingRule(ResourceOutsourcing newOutsourcingRule)
  {
    if (newOutsourcingRule != outsourcingRule)
    {
      NotificationChain msgs = null;
      if (outsourcingRule != null)
        msgs = ((InternalEObject)outsourcingRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.SERVICE_PROVIDER__OUTSOURCING_RULE, null, msgs);
      if (newOutsourcingRule != null)
        msgs = ((InternalEObject)newOutsourcingRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.SERVICE_PROVIDER__OUTSOURCING_RULE, null, msgs);
      msgs = basicSetOutsourcingRule(newOutsourcingRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__OUTSOURCING_RULE, newOutsourcingRule, newOutsourcingRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Resource> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<Resource>(Resource.class, this, KanbanmodelPackage.SERVICE_PROVIDER__RESOURCES);
    }
    return resources;
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
      case KanbanmodelPackage.SERVICE_PROVIDER__SERVICES:
        return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.SERVICE_PROVIDER__ACCEPTANCE_RULE:
        return basicSetAcceptanceRule(null, msgs);
      case KanbanmodelPackage.SERVICE_PROVIDER__SELECTION_RULE:
        return basicSetSelectionRule(null, msgs);
      case KanbanmodelPackage.SERVICE_PROVIDER__ASSIGNMENT_RULE:
        return basicSetAssignmentRule(null, msgs);
      case KanbanmodelPackage.SERVICE_PROVIDER__ALLOCATION_RULE:
        return basicSetAllocationRule(null, msgs);
      case KanbanmodelPackage.SERVICE_PROVIDER__OUTSOURCING_RULE:
        return basicSetOutsourcingRule(null, msgs);
      case KanbanmodelPackage.SERVICE_PROVIDER__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.SERVICE_PROVIDER__NAME:
        return getName();
      case KanbanmodelPackage.SERVICE_PROVIDER__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.SERVICE_PROVIDER__SOURCE_UNITS:
        return getSourceUnits();
      case KanbanmodelPackage.SERVICE_PROVIDER__TARGET_UNITS:
        return getTargetUnits();
      case KanbanmodelPackage.SERVICE_PROVIDER__SUBORDINATE_UNITS:
        return getSubordinateUnits();
      case KanbanmodelPackage.SERVICE_PROVIDER__SERVICES:
        return getServices();
      case KanbanmodelPackage.SERVICE_PROVIDER__DEFAULT_STRATEGY:
        if (resolve) return getDefaultStrategy();
        return basicGetDefaultStrategy();
      case KanbanmodelPackage.SERVICE_PROVIDER__ACCEPTANCE_RULE:
        return getAcceptanceRule();
      case KanbanmodelPackage.SERVICE_PROVIDER__SELECTION_RULE:
        return getSelectionRule();
      case KanbanmodelPackage.SERVICE_PROVIDER__ASSIGNMENT_RULE:
        return getAssignmentRule();
      case KanbanmodelPackage.SERVICE_PROVIDER__ALLOCATION_RULE:
        return getAllocationRule();
      case KanbanmodelPackage.SERVICE_PROVIDER__OUTSOURCING_RULE:
        return getOutsourcingRule();
      case KanbanmodelPackage.SERVICE_PROVIDER__RESOURCES:
        return getResources();
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
      case KanbanmodelPackage.SERVICE_PROVIDER__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__SOURCE_UNITS:
        getSourceUnits().clear();
        getSourceUnits().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__TARGET_UNITS:
        getTargetUnits().clear();
        getTargetUnits().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__SUBORDINATE_UNITS:
        getSubordinateUnits().clear();
        getSubordinateUnits().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__SERVICES:
        getServices().clear();
        getServices().addAll((Collection<? extends Service>)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__DEFAULT_STRATEGY:
        setDefaultStrategy((Strategy)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__ACCEPTANCE_RULE:
        setAcceptanceRule((WIAcceptance)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__SELECTION_RULE:
        setSelectionRule((WISelection)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__ASSIGNMENT_RULE:
        setAssignmentRule((WIAssignment)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__ALLOCATION_RULE:
        setAllocationRule((ResourceAllocation)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__OUTSOURCING_RULE:
        setOutsourcingRule((ResourceOutsourcing)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends Resource>)newValue);
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
      case KanbanmodelPackage.SERVICE_PROVIDER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__SOURCE_UNITS:
        getSourceUnits().clear();
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__TARGET_UNITS:
        getTargetUnits().clear();
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__SUBORDINATE_UNITS:
        getSubordinateUnits().clear();
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__SERVICES:
        getServices().clear();
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__DEFAULT_STRATEGY:
        setDefaultStrategy((Strategy)null);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__ACCEPTANCE_RULE:
        setAcceptanceRule((WIAcceptance)null);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__SELECTION_RULE:
        setSelectionRule((WISelection)null);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__ASSIGNMENT_RULE:
        setAssignmentRule((WIAssignment)null);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__ALLOCATION_RULE:
        setAllocationRule((ResourceAllocation)null);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__OUTSOURCING_RULE:
        setOutsourcingRule((ResourceOutsourcing)null);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__RESOURCES:
        getResources().clear();
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
      case KanbanmodelPackage.SERVICE_PROVIDER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.SERVICE_PROVIDER__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.SERVICE_PROVIDER__SOURCE_UNITS:
        return sourceUnits != null && !sourceUnits.isEmpty();
      case KanbanmodelPackage.SERVICE_PROVIDER__TARGET_UNITS:
        return targetUnits != null && !targetUnits.isEmpty();
      case KanbanmodelPackage.SERVICE_PROVIDER__SUBORDINATE_UNITS:
        return subordinateUnits != null && !subordinateUnits.isEmpty();
      case KanbanmodelPackage.SERVICE_PROVIDER__SERVICES:
        return services != null && !services.isEmpty();
      case KanbanmodelPackage.SERVICE_PROVIDER__DEFAULT_STRATEGY:
        return defaultStrategy != null;
      case KanbanmodelPackage.SERVICE_PROVIDER__ACCEPTANCE_RULE:
        return acceptanceRule != null;
      case KanbanmodelPackage.SERVICE_PROVIDER__SELECTION_RULE:
        return selectionRule != null;
      case KanbanmodelPackage.SERVICE_PROVIDER__ASSIGNMENT_RULE:
        return assignmentRule != null;
      case KanbanmodelPackage.SERVICE_PROVIDER__ALLOCATION_RULE:
        return allocationRule != null;
      case KanbanmodelPackage.SERVICE_PROVIDER__OUTSOURCING_RULE:
        return outsourcingRule != null;
      case KanbanmodelPackage.SERVICE_PROVIDER__RESOURCES:
        return resources != null && !resources.isEmpty();
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

} //ServiceProviderImpl
