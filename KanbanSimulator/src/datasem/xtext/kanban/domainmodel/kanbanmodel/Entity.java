/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getSdname <em>Sdname</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getServiceProvisions <em>Service Provisions</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getEntityBehavior <em>Entity Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Sdname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sdname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sdname</em>' attribute.
   * @see #setSdname(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getEntity_Sdname()
   * @model
   * @generated
   */
  String getSdname();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getSdname <em>Sdname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sdname</em>' attribute.
   * @see #getSdname()
   * @generated
   */
  void setSdname(String value);

  /**
   * Returns the value of the '<em><b>Service Provisions</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.Provision}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Provisions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Provisions</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getEntity_ServiceProvisions()
   * @model containment="true"
   * @generated
   */
  EList<Provision> getServiceProvisions();

  /**
   * Returns the value of the '<em><b>Entity Behavior</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Behavior</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Behavior</em>' containment reference.
   * @see #setEntityBehavior(Statemachine)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getEntity_EntityBehavior()
   * @model containment="true"
   * @generated
   */
  Statemachine getEntityBehavior();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getEntityBehavior <em>Entity Behavior</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Behavior</em>' containment reference.
   * @see #getEntityBehavior()
   * @generated
   */
  void setEntityBehavior(Statemachine value);

} // Entity
