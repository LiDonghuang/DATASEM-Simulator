/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Provision#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Provision#getProviders <em>Providers</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getProvision()
 * @model
 * @generated
 */
public interface Provision extends EObject
{
  /**
   * Returns the value of the '<em><b>Service Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Name</em>' reference.
   * @see #setServiceName(ServiceType)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getProvision_ServiceName()
   * @model
   * @generated
   */
  ServiceType getServiceName();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Provision#getServiceName <em>Service Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service Name</em>' reference.
   * @see #getServiceName()
   * @generated
   */
  void setServiceName(ServiceType value);

  /**
   * Returns the value of the '<em><b>Providers</b></em>' reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Providers</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Providers</em>' reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getProvision_Providers()
   * @model
   * @generated
   */
  EList<ServiceProvider> getProviders();

} // Provision
