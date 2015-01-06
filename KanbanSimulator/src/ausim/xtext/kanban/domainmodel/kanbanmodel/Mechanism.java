/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mechanism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getSourceTask <em>Source Task</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getTargetTask <em>Target Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getMechanism()
 * @model
 * @generated
 */
public interface Mechanism extends EObject
{
  /**
   * Returns the value of the '<em><b>Source Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Task</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Task</em>' reference.
   * @see #setSourceTask(Task)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getMechanism_SourceTask()
   * @model
   * @generated
   */
  Task getSourceTask();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getSourceTask <em>Source Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Task</em>' reference.
   * @see #getSourceTask()
   * @generated
   */
  void setSourceTask(Task value);

  /**
   * Returns the value of the '<em><b>Target Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Task</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Task</em>' reference.
   * @see #setTargetTask(Task)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getMechanism_TargetTask()
   * @model
   * @generated
   */
  Task getTargetTask();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getTargetTask <em>Target Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Task</em>' reference.
   * @see #getTargetTask()
   * @generated
   */
  void setTargetTask(Task value);

} // Mechanism
