/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Profile Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getProfileType()
 * @model
 * @generated
 */
public enum ProfileType implements Enumerator
{
  /**
   * The '<em><b>STABILIZER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STABILIZER_VALUE
   * @generated
   * @ordered
   */
  STABILIZER(0, "STABILIZER", "STABILIZER"),

  /**
   * The '<em><b>VISIONARY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VISIONARY_VALUE
   * @generated
   * @ordered
   */
  VISIONARY(1, "VISIONARY", "VISIONARY"),

  /**
   * The '<em><b>COOPERATOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COOPERATOR_VALUE
   * @generated
   * @ordered
   */
  COOPERATOR(2, "COOPERATOR", "COOPERATOR"),

  /**
   * The '<em><b>CATALYST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CATALYST_VALUE
   * @generated
   * @ordered
   */
  CATALYST(3, "CATALYST", "CATALYST");

  /**
   * The '<em><b>STABILIZER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STABILIZER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STABILIZER
   * @model
   * @generated
   * @ordered
   */
  public static final int STABILIZER_VALUE = 0;

  /**
   * The '<em><b>VISIONARY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VISIONARY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VISIONARY
   * @model
   * @generated
   * @ordered
   */
  public static final int VISIONARY_VALUE = 1;

  /**
   * The '<em><b>COOPERATOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COOPERATOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COOPERATOR
   * @model
   * @generated
   * @ordered
   */
  public static final int COOPERATOR_VALUE = 2;

  /**
   * The '<em><b>CATALYST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CATALYST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CATALYST
   * @model
   * @generated
   * @ordered
   */
  public static final int CATALYST_VALUE = 3;

  /**
   * An array of all the '<em><b>Profile Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ProfileType[] VALUES_ARRAY =
    new ProfileType[]
    {
      STABILIZER,
      VISIONARY,
      COOPERATOR,
      CATALYST,
    };

  /**
   * A public read-only list of all the '<em><b>Profile Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ProfileType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Profile Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProfileType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ProfileType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Profile Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProfileType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ProfileType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Profile Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProfileType get(int value)
  {
    switch (value)
    {
      case STABILIZER_VALUE: return STABILIZER;
      case VISIONARY_VALUE: return VISIONARY;
      case COOPERATOR_VALUE: return COOPERATOR;
      case CATALYST_VALUE: return CATALYST;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ProfileType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ProfileType
