/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kanban Scheduling System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getTestItems <em>Test Items</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSSRepositories <em>KSS Repositories</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getMechanisms <em>Mechanisms</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSSSearchStrategies <em>KSS Search Strategies</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSSTaskPatterns <em>KSS Task Patterns</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSStaskPatternTypes <em>KS Stask Pattern Types</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKSSValueFunctions <em>KSS Value Functions</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getSoSServices <em>So SServices</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getOrgUnits <em>Org Units</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKssSources <em>Kss Sources</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getKssWItems <em>Kss WItems</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getReplications <em>Replications</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getInterArrivalTime <em>Inter Arrival Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem()
 * @model
 * @generated
 */
public interface KanbanSchedulingSystem extends EObject
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
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Test Items</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Items</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Items</em>' attribute list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_TestItems()
   * @model unique="false"
   * @generated
   */
  EList<String> getTestItems();

  /**
   * Returns the value of the '<em><b>KSS Repositories</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.Repository}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>KSS Repositories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>KSS Repositories</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_KSSRepositories()
   * @model containment="true"
   * @generated
   */
  EList<Repository> getKSSRepositories();

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
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_Mechanisms()
   * @model containment="true"
   * @generated
   */
  EList<Mechanism> getMechanisms();

  /**
   * Returns the value of the '<em><b>KSS Search Strategies</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>KSS Search Strategies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>KSS Search Strategies</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_KSSSearchStrategies()
   * @model containment="true"
   * @generated
   */
  EList<Strategy> getKSSSearchStrategies();

  /**
   * Returns the value of the '<em><b>KSS Task Patterns</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.TaskPattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>KSS Task Patterns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>KSS Task Patterns</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_KSSTaskPatterns()
   * @model containment="true"
   * @generated
   */
  EList<TaskPattern> getKSSTaskPatterns();

  /**
   * Returns the value of the '<em><b>KS Stask Pattern Types</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.TaskType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>KS Stask Pattern Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>KS Stask Pattern Types</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_KSStaskPatternTypes()
   * @model containment="true"
   * @generated
   */
  EList<TaskType> getKSStaskPatternTypes();

  /**
   * Returns the value of the '<em><b>KSS Value Functions</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.ValueFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>KSS Value Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>KSS Value Functions</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_KSSValueFunctions()
   * @model containment="true"
   * @generated
   */
  EList<ValueFunction> getKSSValueFunctions();

  /**
   * Returns the value of the '<em><b>So SServices</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.ServiceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>So SServices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>So SServices</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_SoSServices()
   * @model containment="true"
   * @generated
   */
  EList<ServiceType> getSoSServices();

  /**
   * Returns the value of the '<em><b>Org Units</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Org Units</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Org Units</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_OrgUnits()
   * @model containment="true"
   * @generated
   */
  EList<ServiceProvider> getOrgUnits();

  /**
   * Returns the value of the '<em><b>Kss Sources</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkSource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kss Sources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kss Sources</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_KssSources()
   * @model containment="true"
   * @generated
   */
  EList<WorkSource> getKssSources();

  /**
   * Returns the value of the '<em><b>Kss WItems</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kss WItems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kss WItems</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_KssWItems()
   * @model containment="true"
   * @generated
   */
  EList<WorkItem> getKssWItems();

  /**
   * Returns the value of the '<em><b>Replications</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Replications</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Replications</em>' attribute.
   * @see #setReplications(int)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_Replications()
   * @model
   * @generated
   */
  int getReplications();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getReplications <em>Replications</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replications</em>' attribute.
   * @see #getReplications()
   * @generated
   */
  void setReplications(int value);

  /**
   * Returns the value of the '<em><b>Inter Arrival Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inter Arrival Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inter Arrival Time</em>' attribute.
   * @see #setInterArrivalTime(int)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_InterArrivalTime()
   * @model
   * @generated
   */
  int getInterArrivalTime();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getInterArrivalTime <em>Inter Arrival Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inter Arrival Time</em>' attribute.
   * @see #getInterArrivalTime()
   * @generated
   */
  void setInterArrivalTime(int value);

} // KanbanSchedulingSystem
