/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getGroupmembers <em>Groupmembers</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getResources <em>Resources</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getTeamProfile <em>Team Profile</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getServices <em>Services</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getKssBlock <em>Kss Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends EObject
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
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getTeam_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Groupmembers</b></em>' reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groupmembers</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groupmembers</em>' reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getTeam_Groupmembers()
   * @model
   * @generated
   */
  EList<Team> getGroupmembers();

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.Asset}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getTeam_Resources()
   * @model containment="true"
   * @generated
   */
  EList<Asset> getResources();

  /**
   * Returns the value of the '<em><b>Team Profile</b></em>' attribute.
   * The literals are from the enumeration {@link ausim.xtext.kanban.domainmodel.kanbanmodel.ProfileType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Team Profile</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Team Profile</em>' attribute.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.ProfileType
   * @see #setTeamProfile(ProfileType)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getTeam_TeamProfile()
   * @model
   * @generated
   */
  ProfileType getTeamProfile();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getTeamProfile <em>Team Profile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Team Profile</em>' attribute.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.ProfileType
   * @see #getTeamProfile()
   * @generated
   */
  void setTeamProfile(ProfileType value);

  /**
   * Returns the value of the '<em><b>Services</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.Service}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Services</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getTeam_Services()
   * @model containment="true"
   * @generated
   */
  EList<Service> getServices();

  /**
   * Returns the value of the '<em><b>Kss Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kss Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kss Block</em>' containment reference.
   * @see #setKssBlock(KSSBlock)
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getTeam_KssBlock()
   * @model containment="true"
   * @generated
   */
  KSSBlock getKssBlock();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team#getKssBlock <em>Kss Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kss Block</em>' containment reference.
   * @see #getKssBlock()
   * @generated
   */
  void setKssBlock(KSSBlock value);

} // Team
