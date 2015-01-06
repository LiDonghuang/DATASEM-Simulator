/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement#getRTasks <em>RTasks</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement#getMechanisms <em>Mechanisms</em>}</li>
 * </ul>
 * </p>
 *
 * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getRequirement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>RTasks</b></em>' reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.Task}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RTasks</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RTasks</em>' reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getRequirement_RTasks()
   * @model
   * @generated
   */
  EList<Task> getRTasks();

  /**
   * Returns the value of the '<em><b>Mechanisms</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mechanisms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mechanisms</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getRequirement_Mechanisms()
   * @model containment="true"
   * @generated
   */
  EList<Mechanism> getMechanisms();

} // Requirement
