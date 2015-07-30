/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getState <em>State</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getEventactions <em>Eventactions</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference.
   * @see #setEvent(Event)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getTransition_Event()
   * @model
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getEvent <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(State)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getTransition_State()
   * @model
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);

  /**
   * Returns the value of the '<em><b>Eventactions</b></em>' reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eventactions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eventactions</em>' reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getTransition_Eventactions()
   * @model
   * @generated
   */
  EList<Command> getEventactions();

} // Transition
