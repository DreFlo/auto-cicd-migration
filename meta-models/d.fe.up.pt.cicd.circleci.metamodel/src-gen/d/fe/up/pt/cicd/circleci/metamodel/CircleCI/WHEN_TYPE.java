/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>WHEN TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getWHEN_TYPE()
 * @model
 * @generated
 */
public enum WHEN_TYPE implements Enumerator {
	/**
	 * The '<em><b>On success</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_SUCCESS_VALUE
	 * @generated
	 * @ordered
	 */
	ON_SUCCESS(0, "on_success", "on_success"),

	/**
	 * The '<em><b>Always</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_VALUE
	 * @generated
	 * @ordered
	 */
	ALWAYS(1, "always", "always"),

	/**
	 * The '<em><b>On fail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_FAIL_VALUE
	 * @generated
	 * @ordered
	 */
	ON_FAIL(0, "on_fail", "on_fail");

	/**
	 * The '<em><b>On success</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_SUCCESS
	 * @model name="on_success"
	 * @generated
	 * @ordered
	 */
	public static final int ON_SUCCESS_VALUE = 0;

	/**
	 * The '<em><b>Always</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS
	 * @model name="always"
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYS_VALUE = 1;

	/**
	 * The '<em><b>On fail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_FAIL
	 * @model name="on_fail"
	 * @generated
	 * @ordered
	 */
	public static final int ON_FAIL_VALUE = 0;

	/**
	 * An array of all the '<em><b>WHEN TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WHEN_TYPE[] VALUES_ARRAY = new WHEN_TYPE[] { ON_SUCCESS, ALWAYS, ON_FAIL, };

	/**
	 * A public read-only list of all the '<em><b>WHEN TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WHEN_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>WHEN TYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WHEN_TYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WHEN_TYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>WHEN TYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WHEN_TYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WHEN_TYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>WHEN TYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WHEN_TYPE get(int value) {
		switch (value) {
		case ON_SUCCESS_VALUE:
			return ON_SUCCESS;
		case ALWAYS_VALUE:
			return ALWAYS;
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
	private WHEN_TYPE(int value, String name, String literal) {
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

} //WHEN_TYPE
