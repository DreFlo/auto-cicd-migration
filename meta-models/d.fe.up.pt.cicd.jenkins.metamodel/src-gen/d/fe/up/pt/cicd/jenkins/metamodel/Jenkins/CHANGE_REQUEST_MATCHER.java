/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CHANGE REQUEST MATCHER</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getCHANGE_REQUEST_MATCHER()
 * @model
 * @generated
 */
public enum CHANGE_REQUEST_MATCHER implements Enumerator {
	/**
	 * The '<em><b>ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_VALUE
	 * @generated
	 * @ordered
	 */
	ID(0, "ID", "id"),

	/**
	 * The '<em><b>TARGET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TARGET_VALUE
	 * @generated
	 * @ordered
	 */
	TARGET(1, "TARGET", "target"),

	/**
	 * The '<em><b>BRANCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRANCH_VALUE
	 * @generated
	 * @ordered
	 */
	BRANCH(2, "BRANCH", "branch"),

	/**
	 * The '<em><b>FORK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORK_VALUE
	 * @generated
	 * @ordered
	 */
	FORK(3, "FORK", "fork"),

	/**
	 * The '<em><b>URL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL_VALUE
	 * @generated
	 * @ordered
	 */
	URL(4, "URL", "url"),

	/**
	 * The '<em><b>TITLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TITLE_VALUE
	 * @generated
	 * @ordered
	 */
	TITLE(5, "TITLE", "title"),

	/**
	 * The '<em><b>AUTHOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHOR(6, "AUTHOR", "author"),

	/**
	 * The '<em><b>AUTHOR DISPLAY NAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_DISPLAY_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHOR_DISPLAY_NAME(7, "AUTHOR_DISPLAY_NAME", "authorDisplayName"),

	/**
	 * The '<em><b>AUTHOR EMAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_EMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHOR_EMAIL(7, "AUTHOR_EMAIL", "authorEmail");

	/**
	 * The '<em><b>ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID
	 * @model literal="id"
	 * @generated
	 * @ordered
	 */
	public static final int ID_VALUE = 0;

	/**
	 * The '<em><b>TARGET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TARGET
	 * @model literal="target"
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_VALUE = 1;

	/**
	 * The '<em><b>BRANCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRANCH
	 * @model literal="branch"
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_VALUE = 2;

	/**
	 * The '<em><b>FORK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORK
	 * @model literal="fork"
	 * @generated
	 * @ordered
	 */
	public static final int FORK_VALUE = 3;

	/**
	 * The '<em><b>URL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL
	 * @model literal="url"
	 * @generated
	 * @ordered
	 */
	public static final int URL_VALUE = 4;

	/**
	 * The '<em><b>TITLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TITLE
	 * @model literal="title"
	 * @generated
	 * @ordered
	 */
	public static final int TITLE_VALUE = 5;

	/**
	 * The '<em><b>AUTHOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR
	 * @model literal="author"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHOR_VALUE = 6;

	/**
	 * The '<em><b>AUTHOR DISPLAY NAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_DISPLAY_NAME
	 * @model literal="authorDisplayName"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHOR_DISPLAY_NAME_VALUE = 7;

	/**
	 * The '<em><b>AUTHOR EMAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_EMAIL
	 * @model literal="authorEmail"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHOR_EMAIL_VALUE = 7;

	/**
	 * An array of all the '<em><b>CHANGE REQUEST MATCHER</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CHANGE_REQUEST_MATCHER[] VALUES_ARRAY = new CHANGE_REQUEST_MATCHER[] { ID, TARGET, BRANCH,
			FORK, URL, TITLE, AUTHOR, AUTHOR_DISPLAY_NAME, AUTHOR_EMAIL, };

	/**
	 * A public read-only list of all the '<em><b>CHANGE REQUEST MATCHER</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CHANGE_REQUEST_MATCHER> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CHANGE REQUEST MATCHER</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CHANGE_REQUEST_MATCHER get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CHANGE_REQUEST_MATCHER result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CHANGE REQUEST MATCHER</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CHANGE_REQUEST_MATCHER getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CHANGE_REQUEST_MATCHER result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CHANGE REQUEST MATCHER</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CHANGE_REQUEST_MATCHER get(int value) {
		switch (value) {
		case ID_VALUE:
			return ID;
		case TARGET_VALUE:
			return TARGET;
		case BRANCH_VALUE:
			return BRANCH;
		case FORK_VALUE:
			return FORK;
		case URL_VALUE:
			return URL;
		case TITLE_VALUE:
			return TITLE;
		case AUTHOR_VALUE:
			return AUTHOR;
		case AUTHOR_DISPLAY_NAME_VALUE:
			return AUTHOR_DISPLAY_NAME;
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
	private CHANGE_REQUEST_MATCHER(int value, String name, String literal) {
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

} //CHANGE_REQUEST_MATCHER
