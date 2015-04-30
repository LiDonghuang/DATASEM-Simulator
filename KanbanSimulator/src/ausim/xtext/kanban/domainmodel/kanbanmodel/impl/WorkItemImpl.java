/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.Causality;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ServiceType;
import ausim.xtext.kanban.domainmodel.kanbanmodel.TaskPattern;
import ausim.xtext.kanban.domainmodel.kanbanmodel.TaskType;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WorkSource;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getPatternType <em>Pattern Type</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getPTasks <em>PTasks</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getSTasks <em>STasks</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getCausalTriggers <em>Causal Triggers</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getReqSpecialties <em>Req Specialties</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getBefforts <em>Befforts</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getBvalue <em>Bvalue</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getCOS <em>COS</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getWItemSource <em>WItem Source</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getArrtime <em>Arrtime</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getDuedate <em>Duedate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkItemImpl extends MinimalEObjectImpl.Container implements WorkItem
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
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected TaskPattern pattern;

  /**
   * The cached value of the '{@link #getPatternType() <em>Pattern Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternType()
   * @generated
   * @ordered
   */
  protected TaskType patternType;

  /**
   * The cached value of the '{@link #getPTasks() <em>PTasks</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPTasks()
   * @generated
   * @ordered
   */
  protected EList<WorkItem> pTasks;

  /**
   * The cached value of the '{@link #getSTasks() <em>STasks</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSTasks()
   * @generated
   * @ordered
   */
  protected EList<WorkItem> sTasks;

  /**
   * The cached value of the '{@link #getCausalTriggers() <em>Causal Triggers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCausalTriggers()
   * @generated
   * @ordered
   */
  protected EList<Causality> causalTriggers;

  /**
   * The cached value of the '{@link #getReqSpecialties() <em>Req Specialties</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqSpecialties()
   * @generated
   * @ordered
   */
  protected EList<ServiceType> reqSpecialties;

  /**
   * The default value of the '{@link #getBefforts() <em>Befforts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBefforts()
   * @generated
   * @ordered
   */
  protected static final int BEFFORTS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBefforts() <em>Befforts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBefforts()
   * @generated
   * @ordered
   */
  protected int befforts = BEFFORTS_EDEFAULT;

  /**
   * The default value of the '{@link #getBvalue() <em>Bvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBvalue()
   * @generated
   * @ordered
   */
  protected static final int BVALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBvalue() <em>Bvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBvalue()
   * @generated
   * @ordered
   */
  protected int bvalue = BVALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getCOS() <em>COS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCOS()
   * @generated
   * @ordered
   */
  protected static final String COS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCOS() <em>COS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCOS()
   * @generated
   * @ordered
   */
  protected String cos = COS_EDEFAULT;

  /**
   * The cached value of the '{@link #getWItemSource() <em>WItem Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWItemSource()
   * @generated
   * @ordered
   */
  protected WorkSource wItemSource;

  /**
   * The default value of the '{@link #getArrtime() <em>Arrtime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrtime()
   * @generated
   * @ordered
   */
  protected static final int ARRTIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArrtime() <em>Arrtime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrtime()
   * @generated
   * @ordered
   */
  protected int arrtime = ARRTIME_EDEFAULT;

  /**
   * The default value of the '{@link #getDuedate() <em>Duedate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuedate()
   * @generated
   * @ordered
   */
  protected static final int DUEDATE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDuedate() <em>Duedate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuedate()
   * @generated
   * @ordered
   */
  protected int duedate = DUEDATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkItemImpl()
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
    return KanbanmodelPackage.Literals.WORK_ITEM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskPattern getPattern()
  {
    if (pattern != null && pattern.eIsProxy())
    {
      InternalEObject oldPattern = (InternalEObject)pattern;
      pattern = (TaskPattern)eResolveProxy(oldPattern);
      if (pattern != oldPattern)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.WORK_ITEM__PATTERN, oldPattern, pattern));
      }
    }
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskPattern basicGetPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(TaskPattern newPattern)
  {
    TaskPattern oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__PATTERN, oldPattern, pattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskType getPatternType()
  {
    if (patternType != null && patternType.eIsProxy())
    {
      InternalEObject oldPatternType = (InternalEObject)patternType;
      patternType = (TaskType)eResolveProxy(oldPatternType);
      if (patternType != oldPatternType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.WORK_ITEM__PATTERN_TYPE, oldPatternType, patternType));
      }
    }
    return patternType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskType basicGetPatternType()
  {
    return patternType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPatternType(TaskType newPatternType)
  {
    TaskType oldPatternType = patternType;
    patternType = newPatternType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__PATTERN_TYPE, oldPatternType, patternType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkItem> getPTasks()
  {
    if (pTasks == null)
    {
      pTasks = new EObjectResolvingEList<WorkItem>(WorkItem.class, this, KanbanmodelPackage.WORK_ITEM__PTASKS);
    }
    return pTasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkItem> getSTasks()
  {
    if (sTasks == null)
    {
      sTasks = new EObjectResolvingEList<WorkItem>(WorkItem.class, this, KanbanmodelPackage.WORK_ITEM__STASKS);
    }
    return sTasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Causality> getCausalTriggers()
  {
    if (causalTriggers == null)
    {
      causalTriggers = new EObjectContainmentEList<Causality>(Causality.class, this, KanbanmodelPackage.WORK_ITEM__CAUSAL_TRIGGERS);
    }
    return causalTriggers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceType> getReqSpecialties()
  {
    if (reqSpecialties == null)
    {
      reqSpecialties = new EObjectResolvingEList<ServiceType>(ServiceType.class, this, KanbanmodelPackage.WORK_ITEM__REQ_SPECIALTIES);
    }
    return reqSpecialties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBefforts()
  {
    return befforts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBefforts(int newBefforts)
  {
    int oldBefforts = befforts;
    befforts = newBefforts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__BEFFORTS, oldBefforts, befforts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBvalue()
  {
    return bvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBvalue(int newBvalue)
  {
    int oldBvalue = bvalue;
    bvalue = newBvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__BVALUE, oldBvalue, bvalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCOS()
  {
    return cos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCOS(String newCOS)
  {
    String oldCOS = cos;
    cos = newCOS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__COS, oldCOS, cos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkSource getWItemSource()
  {
    if (wItemSource != null && wItemSource.eIsProxy())
    {
      InternalEObject oldWItemSource = (InternalEObject)wItemSource;
      wItemSource = (WorkSource)eResolveProxy(oldWItemSource);
      if (wItemSource != oldWItemSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.WORK_ITEM__WITEM_SOURCE, oldWItemSource, wItemSource));
      }
    }
    return wItemSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkSource basicGetWItemSource()
  {
    return wItemSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWItemSource(WorkSource newWItemSource)
  {
    WorkSource oldWItemSource = wItemSource;
    wItemSource = newWItemSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__WITEM_SOURCE, oldWItemSource, wItemSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getArrtime()
  {
    return arrtime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrtime(int newArrtime)
  {
    int oldArrtime = arrtime;
    arrtime = newArrtime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__ARRTIME, oldArrtime, arrtime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDuedate()
  {
    return duedate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuedate(int newDuedate)
  {
    int oldDuedate = duedate;
    duedate = newDuedate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__DUEDATE, oldDuedate, duedate));
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
      case KanbanmodelPackage.WORK_ITEM__CAUSAL_TRIGGERS:
        return ((InternalEList<?>)getCausalTriggers()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.WORK_ITEM__NAME:
        return getName();
      case KanbanmodelPackage.WORK_ITEM__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.WORK_ITEM__PATTERN:
        if (resolve) return getPattern();
        return basicGetPattern();
      case KanbanmodelPackage.WORK_ITEM__PATTERN_TYPE:
        if (resolve) return getPatternType();
        return basicGetPatternType();
      case KanbanmodelPackage.WORK_ITEM__PTASKS:
        return getPTasks();
      case KanbanmodelPackage.WORK_ITEM__STASKS:
        return getSTasks();
      case KanbanmodelPackage.WORK_ITEM__CAUSAL_TRIGGERS:
        return getCausalTriggers();
      case KanbanmodelPackage.WORK_ITEM__REQ_SPECIALTIES:
        return getReqSpecialties();
      case KanbanmodelPackage.WORK_ITEM__BEFFORTS:
        return getBefforts();
      case KanbanmodelPackage.WORK_ITEM__BVALUE:
        return getBvalue();
      case KanbanmodelPackage.WORK_ITEM__COS:
        return getCOS();
      case KanbanmodelPackage.WORK_ITEM__WITEM_SOURCE:
        if (resolve) return getWItemSource();
        return basicGetWItemSource();
      case KanbanmodelPackage.WORK_ITEM__ARRTIME:
        return getArrtime();
      case KanbanmodelPackage.WORK_ITEM__DUEDATE:
        return getDuedate();
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
      case KanbanmodelPackage.WORK_ITEM__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__PATTERN:
        setPattern((TaskPattern)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__PATTERN_TYPE:
        setPatternType((TaskType)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__PTASKS:
        getPTasks().clear();
        getPTasks().addAll((Collection<? extends WorkItem>)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__STASKS:
        getSTasks().clear();
        getSTasks().addAll((Collection<? extends WorkItem>)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__CAUSAL_TRIGGERS:
        getCausalTriggers().clear();
        getCausalTriggers().addAll((Collection<? extends Causality>)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__REQ_SPECIALTIES:
        getReqSpecialties().clear();
        getReqSpecialties().addAll((Collection<? extends ServiceType>)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__BEFFORTS:
        setBefforts((Integer)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__BVALUE:
        setBvalue((Integer)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__COS:
        setCOS((String)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__WITEM_SOURCE:
        setWItemSource((WorkSource)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__ARRTIME:
        setArrtime((Integer)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__DUEDATE:
        setDuedate((Integer)newValue);
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
      case KanbanmodelPackage.WORK_ITEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM__PATTERN:
        setPattern((TaskPattern)null);
        return;
      case KanbanmodelPackage.WORK_ITEM__PATTERN_TYPE:
        setPatternType((TaskType)null);
        return;
      case KanbanmodelPackage.WORK_ITEM__PTASKS:
        getPTasks().clear();
        return;
      case KanbanmodelPackage.WORK_ITEM__STASKS:
        getSTasks().clear();
        return;
      case KanbanmodelPackage.WORK_ITEM__CAUSAL_TRIGGERS:
        getCausalTriggers().clear();
        return;
      case KanbanmodelPackage.WORK_ITEM__REQ_SPECIALTIES:
        getReqSpecialties().clear();
        return;
      case KanbanmodelPackage.WORK_ITEM__BEFFORTS:
        setBefforts(BEFFORTS_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM__BVALUE:
        setBvalue(BVALUE_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM__COS:
        setCOS(COS_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM__WITEM_SOURCE:
        setWItemSource((WorkSource)null);
        return;
      case KanbanmodelPackage.WORK_ITEM__ARRTIME:
        setArrtime(ARRTIME_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM__DUEDATE:
        setDuedate(DUEDATE_EDEFAULT);
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
      case KanbanmodelPackage.WORK_ITEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.WORK_ITEM__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.WORK_ITEM__PATTERN:
        return pattern != null;
      case KanbanmodelPackage.WORK_ITEM__PATTERN_TYPE:
        return patternType != null;
      case KanbanmodelPackage.WORK_ITEM__PTASKS:
        return pTasks != null && !pTasks.isEmpty();
      case KanbanmodelPackage.WORK_ITEM__STASKS:
        return sTasks != null && !sTasks.isEmpty();
      case KanbanmodelPackage.WORK_ITEM__CAUSAL_TRIGGERS:
        return causalTriggers != null && !causalTriggers.isEmpty();
      case KanbanmodelPackage.WORK_ITEM__REQ_SPECIALTIES:
        return reqSpecialties != null && !reqSpecialties.isEmpty();
      case KanbanmodelPackage.WORK_ITEM__BEFFORTS:
        return befforts != BEFFORTS_EDEFAULT;
      case KanbanmodelPackage.WORK_ITEM__BVALUE:
        return bvalue != BVALUE_EDEFAULT;
      case KanbanmodelPackage.WORK_ITEM__COS:
        return COS_EDEFAULT == null ? cos != null : !COS_EDEFAULT.equals(cos);
      case KanbanmodelPackage.WORK_ITEM__WITEM_SOURCE:
        return wItemSource != null;
      case KanbanmodelPackage.WORK_ITEM__ARRTIME:
        return arrtime != ARRTIME_EDEFAULT;
      case KanbanmodelPackage.WORK_ITEM__DUEDATE:
        return duedate != DUEDATE_EDEFAULT;
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
    result.append(", befforts: ");
    result.append(befforts);
    result.append(", bvalue: ");
    result.append(bvalue);
    result.append(", COS: ");
    result.append(cos);
    result.append(", arrtime: ");
    result.append(arrtime);
    result.append(", duedate: ");
    result.append(duedate);
    result.append(')');
    return result.toString();
  }

} //WorkItemImpl
