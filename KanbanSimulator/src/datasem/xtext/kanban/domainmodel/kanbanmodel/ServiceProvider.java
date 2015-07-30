/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getSourceUnits <em>Source Units</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getTargetUnits <em>Target Units</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getSubordinateUnits <em>Subordinate Units</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getServices <em>Services</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getDefaultStrategy <em>Default Strategy</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getAcceptanceRule <em>Acceptance Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getSelectionRule <em>Selection Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getAssignmentRule <em>Assignment Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getAllocationRule <em>Allocation Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getOutsourcingRule <em>Outsourcing Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getServiceProvider()
 * @model
 * @generated
 */
public interface ServiceProvider extends EObject
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getServiceProvider_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getName <em>Name</em>}' attribute.
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getServiceProvider_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Source Units</b></em>' reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Units</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Units</em>' reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getServiceProvider_SourceUnits()
   * @model
   * @generated
   */
  EList<ServiceProvider> getSourceUnits();

  /**
   * Returns the value of the '<em><b>Target Units</b></em>' reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Units</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Units</em>' reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getServiceProvider_TargetUnits()
   * @model
   * @generated
   */
  EList<ServiceProvider> getTargetUnits();

  /**
   * Returns the value of the '<em><b>Subordinate Units</b></em>' reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subordinate Units</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subordinate Units</em>' reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getServiceProvider_SubordinateUnits()
   * @model
   * @generated
   */
  EList<ServiceProvider> getSubordinateUnits();

  /**
   * Returns the value of the '<em><b>Services</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.Service}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Services</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getServiceProvider_Services()
   * @model containment="true"
   * @generated
   */
  EList<Service> getServices();

  /**
   * Returns the value of the '<em><b>Default Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Strategy</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Strategy</em>' reference.
   * @see #setDefaultStrategy(Strategy)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getServiceProvider_DefaultStrategy()
   * @model
   * @generated
   */
  Strategy getDefaultStrategy();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getDefaultStrategy <em>Default Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Strategy</em>' reference.
   * @see #getDefaultStrategy()
   * @generated
   */
  void setDefaultStrategy(Strategy value);

  /**
   * Returns the value of the '<em><b>Acceptance Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acceptance Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acceptance Rule</em>' containment reference.
   * @see #setAcceptanceRule(WIAcceptance)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getServiceProvider_AcceptanceRule()
   * @model containment="true"
   * @generated
   */
  WIAcceptance getAcceptanceRule();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getAcceptanceRule <em>Acceptance Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acceptance Rule</em>' containment reference.
   * @see #getAcceptanceRule()
   * @generated
   */
  void setAcceptanceRule(WIAcceptance value);

  /**
   * Returns the value of the '<em><b>Selection Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection Rule</em>' containment reference.
   * @see #setSelectionRule(WISelection)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getServiceProvider_SelectionRule()
   * @model containment="true"
   * @generated
   */
  WISelection getSelectionRule();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getSelectionRule <em>Selection Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection Rule</em>' containment reference.
   * @see #getSelectionRule()
   * @generated
   */
  void setSelectionRule(WISelection value);

  /**
   * Returns the value of the '<em><b>Assignment Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment Rule</em>' containment reference.
   * @see #setAssignmentRule(WIAssignment)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getServiceProvider_AssignmentRule()
   * @model containment="true"
   * @generated
   */
  WIAssignment getAssignmentRule();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getAssignmentRule <em>Assignment Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment Rule</em>' containment reference.
   * @see #getAssignmentRule()
   * @generated
   */
  void setAssignmentRule(WIAssignment value);

  /**
   * Returns the value of the '<em><b>Allocation Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Allocation Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Allocation Rule</em>' containment reference.
   * @see #setAllocationRule(ResourceAllocation)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getServiceProvider_AllocationRule()
   * @model containment="true"
   * @generated
   */
  ResourceAllocation getAllocationRule();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getAllocationRule <em>Allocation Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Allocation Rule</em>' containment reference.
   * @see #getAllocationRule()
   * @generated
   */
  void setAllocationRule(ResourceAllocation value);

  /**
   * Returns the value of the '<em><b>Outsourcing Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outsourcing Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outsourcing Rule</em>' containment reference.
   * @see #setOutsourcingRule(ResourceOutsourcing)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getServiceProvider_OutsourcingRule()
   * @model containment="true"
   * @generated
   */
  ResourceOutsourcing getOutsourcingRule();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getOutsourcingRule <em>Outsourcing Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outsourcing Rule</em>' containment reference.
   * @see #getOutsourcingRule()
   * @generated
   */
  void setOutsourcingRule(ResourceOutsourcing value);

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.Resource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getServiceProvider_Resources()
   * @model containment="true"
   * @generated
   */
  EList<Resource> getResources();

} // ServiceProvider
