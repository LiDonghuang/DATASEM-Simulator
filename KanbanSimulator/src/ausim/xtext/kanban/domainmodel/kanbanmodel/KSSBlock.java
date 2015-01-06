/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KSS Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getAssignedUnit <em>Assigned Unit</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getDemandUnits <em>Demand Units</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getSourcedUnits <em>Sourced Units</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getRQueueLimit <em>RQueue Limit</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getWipLimit <em>Wip Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKSSBlock()
 * @model
 * @generated
 */
public interface KSSBlock extends EObject
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
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKSSBlock_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Assigned Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assigned Unit</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assigned Unit</em>' reference.
   * @see #setAssignedUnit(Team)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKSSBlock_AssignedUnit()
   * @model
   * @generated
   */
  Team getAssignedUnit();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getAssignedUnit <em>Assigned Unit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assigned Unit</em>' reference.
   * @see #getAssignedUnit()
   * @generated
   */
  void setAssignedUnit(Team value);

  /**
   * Returns the value of the '<em><b>Demand Units</b></em>' reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Demand Units</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Demand Units</em>' reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKSSBlock_DemandUnits()
   * @model
   * @generated
   */
  EList<Team> getDemandUnits();

  /**
   * Returns the value of the '<em><b>Sourced Units</b></em>' reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sourced Units</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sourced Units</em>' reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKSSBlock_SourcedUnits()
   * @model
   * @generated
   */
  EList<Team> getSourcedUnits();

  /**
   * Returns the value of the '<em><b>RQueue Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RQueue Limit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RQueue Limit</em>' attribute.
   * @see #setRQueueLimit(int)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKSSBlock_RQueueLimit()
   * @model
   * @generated
   */
  int getRQueueLimit();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getRQueueLimit <em>RQueue Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RQueue Limit</em>' attribute.
   * @see #getRQueueLimit()
   * @generated
   */
  void setRQueueLimit(int value);

  /**
   * Returns the value of the '<em><b>Wip Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wip Limit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wip Limit</em>' attribute.
   * @see #setWipLimit(int)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKSSBlock_WipLimit()
   * @model
   * @generated
   */
  int getWipLimit();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock#getWipLimit <em>Wip Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wip Limit</em>' attribute.
   * @see #getWipLimit()
   * @generated
   */
  void setWipLimit(int value);

} // KSSBlock
