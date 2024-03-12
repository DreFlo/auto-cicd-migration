/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>JENKINS CONTEXTS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getJENKINS_CONTEXTS()
 * @model
 * @generated
 */
public enum JENKINS_CONTEXTS implements Enumerator {
	/**
	 * The '<em><b>ENV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENV_VALUE
	 * @generated
	 * @ordered
	 */
	ENV(0, "ENV", "env"),

	/**
	 * The '<em><b>PARAMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMS_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMS(1, "PARAMS", "params");

	/**
	 * The '<em><b>ENV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENV
	 * @model literal="env"
	 * @generated
	 * @ordered
	 */
	public static final int ENV_VALUE = 0;

	/**
	 * The '<em><b>PARAMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMS
	 * @model literal="params"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMS_VALUE = 1;

	/**
	 * An array of all the '<em><b>JENKINS CONTEXTS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JENKINS_CONTEXTS[] VALUES_ARRAY = new JENKINS_CONTEXTS[] { ENV, PARAMS, };

	/**
	 * A public read-only list of all the '<em><b>JENKINS CONTEXTS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JENKINS_CONTEXTS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>JENKINS CONTEXTS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JENKINS_CONTEXTS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JENKINS_CONTEXTS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>JENKINS CONTEXTS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JENKINS_CONTEXTS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JENKINS_CONTEXTS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>JENKINS CONTEXTS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JENKINS_CONTEXTS get(int value) {
		switch (value) {
		case ENV_VALUE:
			return ENV;
		case PARAMS_VALUE:
			return PARAMS;
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
	private JENKINS_CONTEXTS(int value, String name, String literal) {
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

} //JENKINS_CONTEXTS
