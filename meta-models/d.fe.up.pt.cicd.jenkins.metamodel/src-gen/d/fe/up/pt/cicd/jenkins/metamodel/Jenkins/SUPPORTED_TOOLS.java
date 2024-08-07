/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SUPPORTED TOOLS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getSUPPORTED_TOOLS()
 * @model
 * @generated
 */
public enum SUPPORTED_TOOLS implements Enumerator {
	/**
	 * The '<em><b>MAVEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAVEN_VALUE
	 * @generated
	 * @ordered
	 */
	MAVEN(0, "MAVEN", "maven"),

	/**
	 * The '<em><b>JDK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JDK_VALUE
	 * @generated
	 * @ordered
	 */
	JDK(1, "JDK", "jdk"),

	/**
	 * The '<em><b>GRADLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRADLE_VALUE
	 * @generated
	 * @ordered
	 */
	GRADLE(2, "GRADLE", "gradle");

	/**
	 * The '<em><b>MAVEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAVEN
	 * @model literal="maven"
	 * @generated
	 * @ordered
	 */
	public static final int MAVEN_VALUE = 0;

	/**
	 * The '<em><b>JDK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JDK
	 * @model literal="jdk"
	 * @generated
	 * @ordered
	 */
	public static final int JDK_VALUE = 1;

	/**
	 * The '<em><b>GRADLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRADLE
	 * @model literal="gradle"
	 * @generated
	 * @ordered
	 */
	public static final int GRADLE_VALUE = 2;

	/**
	 * An array of all the '<em><b>SUPPORTED TOOLS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SUPPORTED_TOOLS[] VALUES_ARRAY = new SUPPORTED_TOOLS[] { MAVEN, JDK, GRADLE, };

	/**
	 * A public read-only list of all the '<em><b>SUPPORTED TOOLS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SUPPORTED_TOOLS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SUPPORTED TOOLS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SUPPORTED_TOOLS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SUPPORTED_TOOLS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SUPPORTED TOOLS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SUPPORTED_TOOLS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SUPPORTED_TOOLS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SUPPORTED TOOLS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SUPPORTED_TOOLS get(int value) {
		switch (value) {
		case MAVEN_VALUE:
			return MAVEN;
		case JDK_VALUE:
			return JDK;
		case GRADLE_VALUE:
			return GRADLE;
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
	private SUPPORTED_TOOLS(int value, String name, String literal) {
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

} //SUPPORTED_TOOLS
