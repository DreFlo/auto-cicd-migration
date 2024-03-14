/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>VARIABLE CONTEXTS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getVARIABLE_CONTEXTS()
 * @model
 * @generated
 */
public enum VARIABLE_CONTEXTS implements Enumerator {
	/**
	 * The '<em><b>ENV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENV_VALUE
	 * @generated
	 * @ordered
	 */
	ENV(0, "ENV", "ENV"),

	/**
	 * The '<em><b>PARAMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMS_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMS(1, "PARAMS", "PARAMS"),
	/**
	 * The '<em><b>SECRETS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SECRETS_VALUE
	 * @generated
	 * @ordered
	 */
	SECRETS(2, "SECRETS", "SECRETS");

	/**
	 * The '<em><b>ENV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENV_VALUE = 0;

	/**
	 * The '<em><b>PARAMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARAMS_VALUE = 1;

	/**
	 * The '<em><b>SECRETS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRETS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECRETS_VALUE = 2;

	/**
	 * An array of all the '<em><b>VARIABLE CONTEXTS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VARIABLE_CONTEXTS[] VALUES_ARRAY = new VARIABLE_CONTEXTS[] { ENV, PARAMS, SECRETS, };

	/**
	 * A public read-only list of all the '<em><b>VARIABLE CONTEXTS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VARIABLE_CONTEXTS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>VARIABLE CONTEXTS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VARIABLE_CONTEXTS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VARIABLE_CONTEXTS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>VARIABLE CONTEXTS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VARIABLE_CONTEXTS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VARIABLE_CONTEXTS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>VARIABLE CONTEXTS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VARIABLE_CONTEXTS get(int value) {
		switch (value) {
		case ENV_VALUE:
			return ENV;
		case PARAMS_VALUE:
			return PARAMS;
		case SECRETS_VALUE:
			return SECRETS;
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
	private VARIABLE_CONTEXTS(int value, String name, String literal) {
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

} //VARIABLE_CONTEXTS
