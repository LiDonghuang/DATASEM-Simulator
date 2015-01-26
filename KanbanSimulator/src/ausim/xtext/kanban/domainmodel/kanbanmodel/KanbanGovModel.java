/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kanban Gov Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanGovModel#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanGovModel()
 * @model
 * @generated
 */
public interface KanbanGovModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Strategy</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strategy</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategy</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanGovModel_Strategy()
   * @model containment="true"
   * @generated
   */
  EList<Strategy> getStrategy();

} // KanbanGovModel
