/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.NumExpression;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ServiceType;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WorkReference;

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
 * An implementation of the model object '<em><b>Work Item Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getRefTasks <em>Ref Tasks</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getDecTasks <em>Dec Tasks</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getReqSpecialties <em>Req Specialties</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getBefforts <em>Befforts</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getBvalue <em>Bvalue</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getCOS <em>COS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkItemProfileImpl extends MinimalEObjectImpl.Container implements WorkItemProfile
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
   * The cached value of the '{@link #getRefTasks() <em>Ref Tasks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefTasks()
   * @generated
   * @ordered
   */
  protected EList<WorkReference> refTasks;

  /**
   * The cached value of the '{@link #getDecTasks() <em>Dec Tasks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecTasks()
   * @generated
   * @ordered
   */
  protected EList<WorkDecomposition> decTasks;

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
   * The cached value of the '{@link #getBefforts() <em>Befforts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBefforts()
   * @generated
   * @ordered
   */
  protected NumExpression befforts;

  /**
   * The cached value of the '{@link #getBvalue() <em>Bvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBvalue()
   * @generated
   * @ordered
   */
  protected NumExpression bvalue;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkItemProfileImpl()
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
    return KanbanmodelPackage.Literals.WORK_ITEM_PROFILE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkReference> getRefTasks()
  {
    if (refTasks == null)
    {
      refTasks = new EObjectContainmentEList<WorkReference>(WorkReference.class, this, KanbanmodelPackage.WORK_ITEM_PROFILE__REF_TASKS);
    }
    return refTasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkDecomposition> getDecTasks()
  {
    if (decTasks == null)
    {
      decTasks = new EObjectContainmentEList<WorkDecomposition>(WorkDecomposition.class, this, KanbanmodelPackage.WORK_ITEM_PROFILE__DEC_TASKS);
    }
    return decTasks;
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
      reqSpecialties = new EObjectResolvingEList<ServiceType>(ServiceType.class, this, KanbanmodelPackage.WORK_ITEM_PROFILE__REQ_SPECIALTIES);
    }
    return reqSpecialties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumExpression getBefforts()
  {
    return befforts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBefforts(NumExpression newBefforts, NotificationChain msgs)
  {
    NumExpression oldBefforts = befforts;
    befforts = newBefforts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__BEFFORTS, oldBefforts, newBefforts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBefforts(NumExpression newBefforts)
  {
    if (newBefforts != befforts)
    {
      NotificationChain msgs = null;
      if (befforts != null)
        msgs = ((InternalEObject)befforts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.WORK_ITEM_PROFILE__BEFFORTS, null, msgs);
      if (newBefforts != null)
        msgs = ((InternalEObject)newBefforts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.WORK_ITEM_PROFILE__BEFFORTS, null, msgs);
      msgs = basicSetBefforts(newBefforts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__BEFFORTS, newBefforts, newBefforts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumExpression getBvalue()
  {
    return bvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBvalue(NumExpression newBvalue, NotificationChain msgs)
  {
    NumExpression oldBvalue = bvalue;
    bvalue = newBvalue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__BVALUE, oldBvalue, newBvalue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBvalue(NumExpression newBvalue)
  {
    if (newBvalue != bvalue)
    {
      NotificationChain msgs = null;
      if (bvalue != null)
        msgs = ((InternalEObject)bvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.WORK_ITEM_PROFILE__BVALUE, null, msgs);
      if (newBvalue != null)
        msgs = ((InternalEObject)newBvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.WORK_ITEM_PROFILE__BVALUE, null, msgs);
      msgs = basicSetBvalue(newBvalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__BVALUE, newBvalue, newBvalue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__COS, oldCOS, cos));
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
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REF_TASKS:
        return ((InternalEList<?>)getRefTasks()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DEC_TASKS:
        return ((InternalEList<?>)getDecTasks()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.WORK_ITEM_PROFILE__BEFFORTS:
        return basicSetBefforts(null, msgs);
      case KanbanmodelPackage.WORK_ITEM_PROFILE__BVALUE:
        return basicSetBvalue(null, msgs);
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
      case KanbanmodelPackage.WORK_ITEM_PROFILE__NAME:
        return getName();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REF_TASKS:
        return getRefTasks();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DEC_TASKS:
        return getDecTasks();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REQ_SPECIALTIES:
        return getReqSpecialties();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__BEFFORTS:
        return getBefforts();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__BVALUE:
        return getBvalue();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__COS:
        return getCOS();
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
      case KanbanmodelPackage.WORK_ITEM_PROFILE__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REF_TASKS:
        getRefTasks().clear();
        getRefTasks().addAll((Collection<? extends WorkReference>)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DEC_TASKS:
        getDecTasks().clear();
        getDecTasks().addAll((Collection<? extends WorkDecomposition>)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REQ_SPECIALTIES:
        getReqSpecialties().clear();
        getReqSpecialties().addAll((Collection<? extends ServiceType>)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__BEFFORTS:
        setBefforts((NumExpression)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__BVALUE:
        setBvalue((NumExpression)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__COS:
        setCOS((String)newValue);
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
      case KanbanmodelPackage.WORK_ITEM_PROFILE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REF_TASKS:
        getRefTasks().clear();
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DEC_TASKS:
        getDecTasks().clear();
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REQ_SPECIALTIES:
        getReqSpecialties().clear();
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__BEFFORTS:
        setBefforts((NumExpression)null);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__BVALUE:
        setBvalue((NumExpression)null);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__COS:
        setCOS(COS_EDEFAULT);
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
      case KanbanmodelPackage.WORK_ITEM_PROFILE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REF_TASKS:
        return refTasks != null && !refTasks.isEmpty();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DEC_TASKS:
        return decTasks != null && !decTasks.isEmpty();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REQ_SPECIALTIES:
        return reqSpecialties != null && !reqSpecialties.isEmpty();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__BEFFORTS:
        return befforts != null;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__BVALUE:
        return bvalue != null;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__COS:
        return COS_EDEFAULT == null ? cos != null : !COS_EDEFAULT.equals(cos);
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
    result.append(", COS: ");
    result.append(cos);
    result.append(')');
    return result.toString();
  }

} //WorkItemProfileImpl
