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
import org.eclipse.emf.ecore.util.InternalEList;

import datasem.xtext.kanban.domainmodel.kanbanmodel.Capability;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kanban Task Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanTaskModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanTaskModelImpl#getCaps <em>Caps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KanbanTaskModelImpl extends MinimalEObjectImpl.Container implements KanbanTaskModel
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
   * The cached value of the '{@link #getCaps() <em>Caps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaps()
   * @generated
   * @ordered
   */
  protected EList<Capability> caps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KanbanTaskModelImpl()
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
    return KanbanmodelPackage.Literals.KANBAN_TASK_MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.KANBAN_TASK_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Capability> getCaps()
  {
    if (caps == null)
    {
      caps = new EObjectContainmentEList<Capability>(Capability.class, this, KanbanmodelPackage.KANBAN_TASK_MODEL__CAPS);
    }
    return caps;
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
      case KanbanmodelPackage.KANBAN_TASK_MODEL__CAPS:
        return ((InternalEList<?>)getCaps()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.KANBAN_TASK_MODEL__NAME:
        return getName();
      case KanbanmodelPackage.KANBAN_TASK_MODEL__CAPS:
        return getCaps();
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
      case KanbanmodelPackage.KANBAN_TASK_MODEL__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.KANBAN_TASK_MODEL__CAPS:
        getCaps().clear();
        getCaps().addAll((Collection<? extends Capability>)newValue);
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
      case KanbanmodelPackage.KANBAN_TASK_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.KANBAN_TASK_MODEL__CAPS:
        getCaps().clear();
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
      case KanbanmodelPackage.KANBAN_TASK_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.KANBAN_TASK_MODEL__CAPS:
        return caps != null && !caps.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //KanbanTaskModelImpl
