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
   * Returns a new object of class '<em>Team</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Team</em>'.
   * @generated
   */
  Team createTeam();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Asset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Asset</em>'.
   * @generated
   */
  Asset createAsset();

  /**
   * Returns a new object of class '<em>KSS Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>KSS Block</em>'.
   * @generated
   */
  KSSBlock createKSSBlock();

  /**
   * Returns a new object of class '<em>Mechanism</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mechanism</em>'.
   * @generated
   */
  Mechanism createMechanism();

  /**
   * Returns a new object of class '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requirement</em>'.
   * @generated
   */
  Requirement createRequirement();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  Task createTask();

  /**
   * Returns a new object of class '<em>Kanban Work Flow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kanban Work Flow</em>'.
   * @generated
   */
  KanbanWorkFlow createKanbanWorkFlow();

  /**
   * Returns a new object of class '<em>Capability</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Capability</em>'.
   * @generated
   */
  Capability createCapability();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  KanbanmodelPackage getKanbanmodelPackage();

} //KanbanmodelFactory
