/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import datasem.xtext.kanban.domainmodel.kanbanmodel.Command;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Event;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.State;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl#getState <em>State</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl#getEventactions <em>Eventactions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected Event event;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected State state;

  /**
   * The cached value of the '{@link #getEventactions() <em>Eventactions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventactions()
   * @generated
   * @ordered
   */
  protected EList<Command> eventactions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return KanbanmodelPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event getEvent()
  {
    if (event != null && event.eIsProxy())
    {
      InternalEObject oldEvent = (InternalEObject)event;
      event = (Event)eResolveProxy(oldEvent);
      if (event != oldEvent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.TRANSITION__EVENT, oldEvent, event));
      }
    }
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event basicGetEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(Event newEvent)
  {
    Event oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.TRANSITION__EVENT, oldEvent, event));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getState()
  {
    if (state != null && state.eIsProxy())
    {
      InternalEObject oldState = (InternalEObject)state;
      state = (State)eResolveProxy(oldState);
      if (state != oldState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.TRANSITION__STATE, oldState, state));
      }
    }
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(State newState)
  {
    State oldState = state;
    state = newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.TRANSITION__STATE, oldState, state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getEventactions()
  {
    if (eventactions == null)
    {
      eventactions = new EObjectResolvingEList<Command>(Command.class, this, KanbanmodelPackage.TRANSITION__EVENTACTIONS);
    }
    return eventactions;
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
      case KanbanmodelPackage.TRANSITION__EVENT:
        if (resolve) return getEvent();
        return basicGetEvent();
      case KanbanmodelPackage.TRANSITION__STATE:
        if (resolve) return getState();
        return basicGetState();
      case KanbanmodelPackage.TRANSITION__EVENTACTIONS:
        return getEventactions();
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
      case KanbanmodelPackage.TRANSITION__EVENT:
        setEvent((Event)newValue);
        return;
      case KanbanmodelPackage.TRANSITION__STATE:
        setState((State)newValue);
        return;
      case KanbanmodelPackage.TRANSITION__EVENTACTIONS:
        getEventactions().clear();
        getEventactions().addAll((Collection<? extends Command>)newValue);
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
      case KanbanmodelPackage.TRANSITION__EVENT:
        setEvent((Event)null);
        return;
      case KanbanmodelPackage.TRANSITION__STATE:
        setState((State)null);
        return;
      case KanbanmodelPackage.TRANSITION__EVENTACTIONS:
        getEventactions().clear();
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
      case KanbanmodelPackage.TRANSITION__EVENT:
        return event != null;
      case KanbanmodelPackage.TRANSITION__STATE:
        return state != null;
      case KanbanmodelPackage.TRANSITION__EVENTACTIONS:
        return eventactions != null && !eventactions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TransitionImpl
