/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statemachine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getEvents <em>Events</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getCommands <em>Commands</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatemachine()
 * @model
 * @generated
 */
public interface Statemachine extends EObject
{
  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatemachine_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatemachine_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatemachine_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

} // Statemachine
