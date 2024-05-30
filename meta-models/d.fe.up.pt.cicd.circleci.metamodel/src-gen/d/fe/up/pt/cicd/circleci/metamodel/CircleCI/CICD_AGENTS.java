/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CICD AGENTS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getCICD_AGENTS()
 * @model
 * @generated
 */
public enum CICD_AGENTS implements Enumerator {
	/**
	 * The '<em><b>WINDOWS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS(0, "WINDOWS", "WINDOWS"),

	/**
	 * The '<em><b>LINUX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX(1, "LINUX", "LINUX"),

	/**
	 * The '<em><b>MACOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACOS_VALUE
	 * @generated
	 * @ordered
	 */
	MACOS(3, "MACOS", "MACOS");

	/**
	 * The '<em><b>WINDOWS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS_VALUE = 0;

	/**
	 * The '<em><b>LINUX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_VALUE = 1;

	/**
	 * The '<em><b>MACOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MACOS_VALUE = 3;

	/**
	 * An array of all the '<em><b>CICD AGENTS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CICD_AGENTS[] VALUES_ARRAY = new CICD_AGENTS[] { WINDOWS, LINUX, MACOS, };

	/**
	 * A public read-only list of all the '<em><b>CICD AGENTS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CICD_AGENTS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CICD AGENTS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CICD_AGENTS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CICD_AGENTS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CICD AGENTS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CICD_AGENTS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CICD_AGENTS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CICD AGENTS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CICD_AGENTS get(int value) {
		switch (value) {
		case WINDOWS_VALUE:
			return WINDOWS;
		case LINUX_VALUE:
			return LINUX;
		case MACOS_VALUE:
			return MACOS;
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
	private CICD_AGENTS(int value, String name, String literal) {
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

} //CICD_AGENTS
