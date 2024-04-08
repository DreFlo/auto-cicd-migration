/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MODEL NAMES</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getMODEL_NAMES()
 * @model
 * @generated
 */
public enum MODEL_NAMES implements Enumerator {
	/**
	 * The '<em><b>CICD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CICD_VALUE
	 * @generated
	 * @ordered
	 */
	CICD(0, "CICD", "CICD"),

	/**
	 * The '<em><b>GHA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GHA_VALUE
	 * @generated
	 * @ordered
	 */
	GHA(1, "GHA", "GHA"),

	/**
	 * The '<em><b>Circle CI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCLE_CI_VALUE
	 * @generated
	 * @ordered
	 */
	CIRCLE_CI(2, "CircleCI", "CircleCI");

	/**
	 * The '<em><b>CICD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CICD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CICD_VALUE = 0;

	/**
	 * The '<em><b>GHA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GHA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GHA_VALUE = 1;

	/**
	 * The '<em><b>Circle CI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCLE_CI
	 * @model name="CircleCI"
	 * @generated
	 * @ordered
	 */
	public static final int CIRCLE_CI_VALUE = 2;

	/**
	 * An array of all the '<em><b>MODEL NAMES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MODEL_NAMES[] VALUES_ARRAY = new MODEL_NAMES[] { CICD, GHA, CIRCLE_CI, };

	/**
	 * A public read-only list of all the '<em><b>MODEL NAMES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MODEL_NAMES> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MODEL NAMES</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MODEL_NAMES get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MODEL_NAMES result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MODEL NAMES</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MODEL_NAMES getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MODEL_NAMES result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MODEL NAMES</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MODEL_NAMES get(int value) {
		switch (value) {
		case CICD_VALUE:
			return CICD;
		case GHA_VALUE:
			return GHA;
		case CIRCLE_CI_VALUE:
			return CIRCLE_CI;
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
	private MODEL_NAMES(int value, String name, String literal) {
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

} //MODEL_NAMES
