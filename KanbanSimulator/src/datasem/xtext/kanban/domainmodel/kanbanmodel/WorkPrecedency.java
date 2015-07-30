/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Precedency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkPrecedency#getWorkItem <em>Work Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkPrecedency()
 * @model
 * @generated
 */
public interface WorkPrecedency extends EObject
{
  /**
   * Returns the value of the '<em><b>Work Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Work Item</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Work Item</em>' reference.
   * @see #setWorkItem(WorkItemProfile)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkPrecedency_WorkItem()
   * @model
   * @generated
   */
  WorkItemProfile getWorkItem();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkPrecedency#getWorkItem <em>Work Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Work Item</em>' reference.
   * @see #getWorkItem()
   * @generated
   */
  void setWorkItem(WorkItemProfile value);

} // WorkPrecedency
