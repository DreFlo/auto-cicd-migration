/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>COMPARATORS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getCOMPARATORS()
 * @model
 * @generated
 */
public enum COMPARATORS implements Enumerator {
	/**
	 * The '<em><b>EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALS(0, "EQUALS", "EQUALS"),

	/**
	 * The '<em><b>REGEXP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGEXP_VALUE
	 * @generated
	 * @ordered
	 */
	REGEXP(1, "REGEXP", "REGEXP"),

	/**
	 * The '<em><b>GLOB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLOB_VALUE
	 * @generated
	 * @ordered
	 */
	GLOB(2, "GLOB", "GLOB");

	/**
	 * The '<em><b>EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUALS_VALUE = 0;

	/**
	 * The '<em><b>REGEXP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGEXP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGEXP_VALUE = 1;

	/**
	 * The '<em><b>GLOB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLOB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GLOB_VALUE = 2;

	/**
	 * An array of all the '<em><b>COMPARATORS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final COMPARATORS[] VALUES_ARRAY = new COMPARATORS[] { EQUALS, REGEXP, GLOB, };

	/**
	 * A public read-only list of all the '<em><b>COMPARATORS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<COMPARATORS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>COMPARATORS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COMPARATORS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COMPARATORS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>COMPARATORS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COMPARATORS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COMPARATORS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>COMPARATORS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static COMPARATORS get(int value) {
		switch (value) {
		case EQUALS_VALUE:
			return EQUALS;
		case REGEXP_VALUE:
			return REGEXP;
		case GLOB_VALUE:
			return GLOB;
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
	private COMPARATORS(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //COMPARATORS
