/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

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
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getRTasks <em>RTasks</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getRequirement()
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getRequirement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getRequirement_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>RTasks</b></em>' reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RTasks</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RTasks</em>' reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getRequirement_RTasks()
   * @model
   * @generated
   */
  EList<WorkItem> getRTasks();

  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getRequirement_Dependencies()
   * @model containment="true"
   * @generated
   */
  EList<Causality> getDependencies();

} // Requirement
