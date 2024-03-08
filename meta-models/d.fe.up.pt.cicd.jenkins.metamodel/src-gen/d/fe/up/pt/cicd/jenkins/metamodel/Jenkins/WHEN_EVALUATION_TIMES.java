/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>WHEN EVALUATION TIMES</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getWHEN_EVALUATION_TIMES()
 * @model
 * @generated
 */
public enum WHEN_EVALUATION_TIMES implements Enumerator {
	/**
	 * The '<em><b>AFTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER(0, "AFTER", "AFTER"),

	/**
	 * The '<em><b>BEFORE AGENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_AGENT_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_AGENT(2, "BEFORE_AGENT", "BEFORE_AGENT"),

	/**
	 * The '<em><b>BEFORE INPUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_INPUT(1, "BEFORE_INPUT", "BEFORE_INPUT"),

	/**
	 * The '<em><b>BEFORE OPTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_OPTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_OPTIONS(3, "BEFORE_OPTIONS", "BEFORE_OPTIONS");

	/**
	 * The '<em><b>AFTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_VALUE = 0;

	/**
	 * The '<em><b>BEFORE AGENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_AGENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_AGENT_VALUE = 2;

	/**
	 * The '<em><b>BEFORE INPUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_INPUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_INPUT_VALUE = 1;

	/**
	 * The '<em><b>BEFORE OPTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_OPTIONS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_OPTIONS_VALUE = 3;

	/**
	 * An array of all the '<em><b>WHEN EVALUATION TIMES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WHEN_EVALUATION_TIMES[] VALUES_ARRAY = new WHEN_EVALUATION_TIMES[] { AFTER, BEFORE_AGENT,
			BEFORE_INPUT, BEFORE_OPTIONS, };

	/**
	 * A public read-only list of all the '<em><b>WHEN EVALUATION TIMES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WHEN_EVALUATION_TIMES> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>WHEN EVALUATION TIMES</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WHEN_EVALUATION_TIMES get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WHEN_EVALUATION_TIMES result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>WHEN EVALUATION TIMES</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WHEN_EVALUATION_TIMES getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WHEN_EVALUATION_TIMES result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>WHEN EVALUATION TIMES</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WHEN_EVALUATION_TIMES get(int value) {
		switch (value) {
		case AFTER_VALUE:
			return AFTER;
		case BEFORE_AGENT_VALUE:
			return BEFORE_AGENT;
		case BEFORE_INPUT_VALUE:
			return BEFORE_INPUT;
		case BEFORE_OPTIONS_VALUE:
			return BEFORE_OPTIONS;
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
	private WHEN_EVALUATION_TIMES(int value, String name, String literal) {
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

} //WHEN_EVALUATION_TIMES
