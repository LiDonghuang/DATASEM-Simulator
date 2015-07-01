/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.LocalValue#getOwner <em>Owner</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.LocalValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getLocalValue()
 * @model
 * @generated
 */
public interface LocalValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' reference.
   * @see #setOwner(ServiceProvider)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getLocalValue_Owner()
   * @model
   * @generated
   */
  ServiceProvider getOwner();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.LocalValue#getOwner <em>Owner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner</em>' reference.
   * @see #getOwner()
   * @generated
   */
  void setOwner(ServiceProvider value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getLocalValue_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.LocalValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // LocalValue
