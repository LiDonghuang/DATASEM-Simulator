/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Num Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#getNumValue <em>Num Value</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#isDistribution <em>Distribution</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#getNumDist <em>Num Dist</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getNumExpression()
 * @model
 * @generated
 */
public interface NumExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Num Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Value</em>' attribute.
   * @see #setNumValue(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getNumExpression_NumValue()
   * @model
   * @generated
   */
  String getNumValue();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#getNumValue <em>Num Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Value</em>' attribute.
   * @see #getNumValue()
   * @generated
   */
  void setNumValue(String value);

  /**
   * Returns the value of the '<em><b>Distribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distribution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distribution</em>' attribute.
   * @see #setDistribution(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getNumExpression_Distribution()
   * @model
   * @generated
   */
  boolean isDistribution();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#isDistribution <em>Distribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distribution</em>' attribute.
   * @see #isDistribution()
   * @generated
   */
  void setDistribution(boolean value);

  /**
   * Returns the value of the '<em><b>Num Dist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Dist</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Dist</em>' containment reference.
   * @see #setNumDist(Distribution)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getNumExpression_NumDist()
   * @model containment="true"
   * @generated
   */
  Distribution getNumDist();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#getNumDist <em>Num Dist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Dist</em>' containment reference.
   * @see #getNumDist()
   * @generated
   */
  void setNumDist(Distribution value);

} // NumExpression
