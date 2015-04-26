/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage
 * @generated
 */
public interface KanbanmodelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KanbanmodelFactory eINSTANCE = ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Kanban Scheduling System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kanban Scheduling System</em>'.
   * @generated
   */
  KanbanSchedulingSystem createKanbanSchedulingSystem();

  /**
   * Returns a new object of class '<em>Task Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Pattern</em>'.
   * @generated
   */
  TaskPattern createTaskPattern();

  /**
   * Returns a new object of class '<em>Task Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Type</em>'.
   * @generated
   */
  TaskType createTaskType();

  /**
   * Returns a new object of class '<em>Value Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Function</em>'.
   * @generated
   */
  ValueFunction createValueFunction();

  /**
   * Returns a new object of class '<em>Mechanism</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mechanism</em>'.
   * @generated
   */
  Mechanism createMechanism();

  /**
   * Returns a new object of class '<em>Strategy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Strategy</em>'.
   * @generated
   */
  Strategy createStrategy();

  /**
   * Returns a new object of class '<em>WI Acceptance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WI Acceptance</em>'.
   * @generated
   */
  WIAcceptance createWIAcceptance();

  /**
   * Returns a new object of class '<em>WI Selection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WI Selection</em>'.
   * @generated
   */
  WISelection createWISelection();

  /**
   * Returns a new object of class '<em>WI Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WI Assignment</em>'.
   * @generated
   */
  WIAssignment createWIAssignment();

  /**
   * Returns a new object of class '<em>Resource Allocation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Allocation</em>'.
   * @generated
   */
  ResourceAllocation createResourceAllocation();

  /**
   * Returns a new object of class '<em>Resource Outsourcing</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Outsourcing</em>'.
   * @generated
   */
  ResourceOutsourcing createResourceOutsourcing();

  /**
   * Returns a new object of class '<em>Work Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Source</em>'.
   * @generated
   */
  WorkSource createWorkSource();

  /**
   * Returns a new object of class '<em>Work Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Item</em>'.
   * @generated
   */
  WorkItem createWorkItem();

  /**
   * Returns a new object of class '<em>Causality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Causality</em>'.
   * @generated
   */
  Causality createCausality();

  /**
   * Returns a new object of class '<em>Service Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Type</em>'.
   * @generated
   */
  ServiceType createServiceType();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Service Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Provider</em>'.
   * @generated
   */
  ServiceProvider createServiceProvider();

  /**
   * Returns a new object of class '<em>Asset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Asset</em>'.
   * @generated
   */
  Asset createAsset();

  /**
   * Returns a new object of class '<em>Skill</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Skill</em>'.
   * @generated
   */
  Skill createSkill();

  /**
   * Returns a new object of class '<em>Kanban Task Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kanban Task Model</em>'.
   * @generated
   */
  KanbanTaskModel createKanbanTaskModel();

  /**
   * Returns a new object of class '<em>Capability</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Capability</em>'.
   * @generated
   */
  Capability createCapability();

  /**
   * Returns a new object of class '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requirement</em>'.
   * @generated
   */
  Requirement createRequirement();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Provision</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provision</em>'.
   * @generated
   */
  Provision createProvision();

  /**
   * Returns a new object of class '<em>Statemachine</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statemachine</em>'.
   * @generated
   */
  Statemachine createStatemachine();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  KanbanmodelPackage getKanbanmodelPackage();

} //KanbanmodelFactory
