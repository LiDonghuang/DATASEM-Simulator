/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Repository#getType <em>Type</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Repository#getProfiles <em>Profiles</em>}</li>
 * </ul>
 * </p>
 *
 * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(TaskType)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getRepository_Type()
   * @model
   * @generated
   */
  TaskType getType();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Repository#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(TaskType value);

  /**
   * Returns the value of the '<em><b>Profiles</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Profiles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Profiles</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getRepository_Profiles()
   * @model containment="true"
   * @generated
   */
  EList<WorkItemProfile> getProfiles();

} // Repository
