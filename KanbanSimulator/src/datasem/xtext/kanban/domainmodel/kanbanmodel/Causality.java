/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Causality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality#getTriggered <em>Triggered</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality#getTProgress <em>TProgress</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality#getTProbability <em>TProbability</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getCausality()
 * @model
 * @generated
 */
public interface Causality extends EObject
{
  /**
   * Returns the value of the '<em><b>Triggered</b></em>' reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Triggered</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triggered</em>' reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getCausality_Triggered()
   * @model
   * @generated
   */
  EList<WorkItem> getTriggered();

  /**
   * Returns the value of the '<em><b>TProgress</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TProgress</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TProgress</em>' attribute.
   * @see #setTProgress(int)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getCausality_TProgress()
   * @model
   * @generated
   */
  int getTProgress();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality#getTProgress <em>TProgress</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TProgress</em>' attribute.
   * @see #getTProgress()
   * @generated
   */
  void setTProgress(int value);

  /**
   * Returns the value of the '<em><b>TProbability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TProbability</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TProbability</em>' attribute.
   * @see #setTProbability(int)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getCausality_TProbability()
   * @model
   * @generated
   */
  int getTProbability();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality#getTProbability <em>TProbability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TProbability</em>' attribute.
   * @see #getTProbability()
   * @generated
   */
  void setTProbability(int value);

} // Causality
