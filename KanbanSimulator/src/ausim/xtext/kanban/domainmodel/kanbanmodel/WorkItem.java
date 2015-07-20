/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getProfile <em>Profile</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDescription <em>Description</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPattern <em>Pattern</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPatternType <em>Pattern Type</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPTasks <em>PTasks</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getSTasks <em>STasks</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getCausalTriggers <em>Causal Triggers</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getReqSpecialties <em>Req Specialties</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getBefforts <em>Befforts</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getBvalue <em>Bvalue</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getLvalue <em>Lvalue</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getCOS <em>COS</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getWItemSource <em>WItem Source</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getArrtime <em>Arrtime</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDuedate <em>Duedate</em>}</li>
 * </ul>
 * </p>
 *
 * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem()
 * @model
 * @generated
 */
public interface WorkItem extends EObject
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
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Profile</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Profile</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Profile</em>' reference.
   * @see #setProfile(WorkItemProfile)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Profile()
   * @model
   * @generated
   */
  WorkItemProfile getProfile();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getProfile <em>Profile</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Profile</em>' reference.
   * @see #getProfile()
   * @generated
   */
  void setProfile(WorkItemProfile value);

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
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' reference.
   * @see #setPattern(TaskPattern)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Pattern()
   * @model
   * @generated
   */
  TaskPattern getPattern();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPattern <em>Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(TaskPattern value);

  /**
   * Returns the value of the '<em><b>Pattern Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern Type</em>' reference.
   * @see #setPatternType(TaskType)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_PatternType()
   * @model
   * @generated
   */
  TaskType getPatternType();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPatternType <em>Pattern Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern Type</em>' reference.
   * @see #getPatternType()
   * @generated
   */
  void setPatternType(TaskType value);

  /**
   * Returns the value of the '<em><b>PTasks</b></em>' reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PTasks</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PTasks</em>' reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_PTasks()
   * @model
   * @generated
   */
  EList<WorkItem> getPTasks();

  /**
   * Returns the value of the '<em><b>STasks</b></em>' reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>STasks</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>STasks</em>' reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_STasks()
   * @model
   * @generated
   */
  EList<WorkItem> getSTasks();

  /**
   * Returns the value of the '<em><b>Causal Triggers</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.Causality}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Causal Triggers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Causal Triggers</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_CausalTriggers()
   * @model containment="true"
   * @generated
   */
  EList<Causality> getCausalTriggers();

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
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_ReqSpecialties()
   * @model
   * @generated
   */
  EList<ServiceType> getReqSpecialties();

  /**
   * Returns the value of the '<em><b>Befforts</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Befforts</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Befforts</em>' attribute.
   * @see #setBefforts(int)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Befforts()
   * @model
   * @generated
   */
  int getBefforts();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getBefforts <em>Befforts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Befforts</em>' attribute.
   * @see #getBefforts()
   * @generated
   */
  void setBefforts(int value);

  /**
   * Returns the value of the '<em><b>Bvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bvalue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bvalue</em>' attribute.
   * @see #setBvalue(int)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Bvalue()
   * @model
   * @generated
   */
  int getBvalue();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getBvalue <em>Bvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bvalue</em>' attribute.
   * @see #getBvalue()
   * @generated
   */
  void setBvalue(int value);

  /**
   * Returns the value of the '<em><b>Lvalue</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.LocalValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lvalue</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lvalue</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Lvalue()
   * @model containment="true"
   * @generated
   */
  EList<LocalValue> getLvalue();

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
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_COS()
   * @model
   * @generated
   */
  String getCOS();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getCOS <em>COS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>COS</em>' attribute.
   * @see #getCOS()
   * @generated
   */
  void setCOS(String value);

  /**
   * Returns the value of the '<em><b>WItem Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>WItem Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>WItem Source</em>' reference.
   * @see #setWItemSource(WorkSource)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_WItemSource()
   * @model
   * @generated
   */
  WorkSource getWItemSource();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getWItemSource <em>WItem Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>WItem Source</em>' reference.
   * @see #getWItemSource()
   * @generated
   */
  void setWItemSource(WorkSource value);

  /**
   * Returns the value of the '<em><b>Arrtime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arrtime</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arrtime</em>' attribute.
   * @see #setArrtime(int)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Arrtime()
   * @model
   * @generated
   */
  int getArrtime();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getArrtime <em>Arrtime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arrtime</em>' attribute.
   * @see #getArrtime()
   * @generated
   */
  void setArrtime(int value);

  /**
   * Returns the value of the '<em><b>Duedate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duedate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duedate</em>' attribute.
   * @see #setDuedate(int)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Duedate()
   * @model
   * @generated
   */
  int getDuedate();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDuedate <em>Duedate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duedate</em>' attribute.
   * @see #getDuedate()
   * @generated
   */
  void setDuedate(int value);

} // WorkItem
