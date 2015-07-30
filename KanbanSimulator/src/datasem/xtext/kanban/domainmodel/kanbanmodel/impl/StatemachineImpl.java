/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import datasem.xtext.kanban.domainmodel.kanbanmodel.Command;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Event;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.State;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statemachine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StatemachineImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StatemachineImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StatemachineImpl#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatemachineImpl extends MinimalEObjectImpl.Container implements Statemachine
{
  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> events;

  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected EList<Command> commands;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<State> states;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatemachineImpl()
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
    return KanbanmodelPackage.Literals.STATEMACHINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getEvents()
  {
    if (events == null)
    {
      events = new EObjectContainmentEList<Event>(Event.class, this, KanbanmodelPackage.STATEMACHINE__EVENTS);
    }
    return events;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCommands()
  {
    if (commands == null)
    {
      commands = new EObjectContainmentEList<Command>(Command.class, this, KanbanmodelPackage.STATEMACHINE__COMMANDS);
    }
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<State>(State.class, this, KanbanmodelPackage.STATEMACHINE__STATES);
    }
    return states;
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
      case KanbanmodelPackage.STATEMACHINE__EVENTS:
        return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.STATEMACHINE__COMMANDS:
        return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.STATEMACHINE__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.STATEMACHINE__EVENTS:
        return getEvents();
      case KanbanmodelPackage.STATEMACHINE__COMMANDS:
        return getCommands();
      case KanbanmodelPackage.STATEMACHINE__STATES:
        return getStates();
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
      case KanbanmodelPackage.STATEMACHINE__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends Event>)newValue);
        return;
      case KanbanmodelPackage.STATEMACHINE__COMMANDS:
        getCommands().clear();
        getCommands().addAll((Collection<? extends Command>)newValue);
        return;
      case KanbanmodelPackage.STATEMACHINE__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends State>)newValue);
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
      case KanbanmodelPackage.STATEMACHINE__EVENTS:
        getEvents().clear();
        return;
      case KanbanmodelPackage.STATEMACHINE__COMMANDS:
        getCommands().clear();
        return;
      case KanbanmodelPackage.STATEMACHINE__STATES:
        getStates().clear();
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
      case KanbanmodelPackage.STATEMACHINE__EVENTS:
        return events != null && !events.isEmpty();
      case KanbanmodelPackage.STATEMACHINE__COMMANDS:
        return commands != null && !commands.isEmpty();
      case KanbanmodelPackage.STATEMACHINE__STATES:
        return states != null && !states.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StatemachineImpl
