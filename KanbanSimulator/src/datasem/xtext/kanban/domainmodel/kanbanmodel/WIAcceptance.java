/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WI Acceptance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getBacklogQLimit <em>Backlog QLimit</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getReadyQLimit <em>Ready QLimit</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWIAcceptance()
 * @model
 * @generated
 */
public interface WIAcceptance extends EObject
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWIAcceptance_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getName <em>Name</em>}' attribute.
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWIAcceptance_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Backlog QLimit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Backlog QLimit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Backlog QLimit</em>' attribute.
   * @see #setBacklogQLimit(int)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWIAcceptance_BacklogQLimit()
   * @model
   * @generated
   */
  int getBacklogQLimit();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getBacklogQLimit <em>Backlog QLimit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Backlog QLimit</em>' attribute.
   * @see #getBacklogQLimit()
   * @generated
   */
  void setBacklogQLimit(int value);

  /**
   * Returns the value of the '<em><b>Ready QLimit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ready QLimit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ready QLimit</em>' attribute.
   * @see #setReadyQLimit(int)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWIAcceptance_ReadyQLimit()
   * @model
   * @generated
   */
  int getReadyQLimit();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getReadyQLimit <em>Ready QLimit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ready QLimit</em>' attribute.
   * @see #getReadyQLimit()
   * @generated
   */
  void setReadyQLimit(int value);

} // WIAcceptance
