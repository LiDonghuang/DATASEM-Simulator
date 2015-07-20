/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Item Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getDescription <em>Description</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getRefTasks <em>Ref Tasks</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getDecTasks <em>Dec Tasks</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getReqSpecialties <em>Req Specialties</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getBefforts <em>Befforts</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getBvalue <em>Bvalue</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getCOS <em>COS</em>}</li>
 * </ul>
 * </p>
 *
 * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile()
 * @model
 * @generated
 */
public interface WorkItemProfile extends EObject
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
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getName <em>Name</em>}' attribute.
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
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Ref Tasks</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Tasks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Tasks</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_RefTasks()
   * @model containment="true"
   * @generated
   */
  EList<WorkReference> getRefTasks();

  /**
   * Returns the value of the '<em><b>Dec Tasks</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dec Tasks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dec Tasks</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_DecTasks()
   * @model containment="true"
   * @generated
   */
  EList<WorkDecomposition> getDecTasks();

  /**
   * Returns the value of the '<em><b>Req Specialties</b></em>' reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.ServiceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Req Specialties</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Req Specialties</em>' reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_ReqSpecialties()
   * @model
   * @generated
   */
  EList<ServiceType> getReqSpecialties();

  /**
   * Returns the value of the '<em><b>Befforts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Befforts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Befforts</em>' containment reference.
   * @see #setBefforts(NumExpression)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_Befforts()
   * @model containment="true"
   * @generated
   */
  NumExpression getBefforts();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getBefforts <em>Befforts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Befforts</em>' containment reference.
   * @see #getBefforts()
   * @generated
   */
  void setBefforts(NumExpression value);

  /**
   * Returns the value of the '<em><b>Bvalue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bvalue</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bvalue</em>' containment reference.
   * @see #setBvalue(NumExpression)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_Bvalue()
   * @model containment="true"
   * @generated
   */
  NumExpression getBvalue();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getBvalue <em>Bvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bvalue</em>' containment reference.
   * @see #getBvalue()
   * @generated
   */
  void setBvalue(NumExpression value);

  /**
   * Returns the value of the '<em><b>COS</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>COS</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>COS</em>' attribute.
   * @see #setCOS(String)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_COS()
   * @model
   * @generated
   */
  String getCOS();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getCOS <em>COS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>COS</em>' attribute.
   * @see #getCOS()
   * @generated
   */
  void setCOS(String value);

} // WorkItemProfile
