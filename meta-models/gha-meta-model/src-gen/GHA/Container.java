/**
 */
package GHA;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Container#getImage <em>Image</em>}</li>
 *   <li>{@link GHA.Container#getUsername <em>Username</em>}</li>
 *   <li>{@link GHA.Container#getPassword <em>Password</em>}</li>
 *   <li>{@link GHA.Container#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link GHA.Container#getPorts <em>Ports</em>}</li>
 *   <li>{@link GHA.Container#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link GHA.Container#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see GHA.GHAPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(Expression)
	 * @see GHA.GHAPackage#getContainer_Image()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getImage();

	/**
	 * Sets the value of the '{@link GHA.Container#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Expression value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' containment reference.
	 * @see #setUsername(Expression)
	 * @see GHA.GHAPackage#getContainer_Username()
	 * @model containment="true"
	 * @generated
	 */
	Expression getUsername();

	/**
	 * Sets the value of the '{@link GHA.Container#getUsername <em>Username</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' containment reference.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(Expression value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' containment reference.
	 * @see #setPassword(Expression)
	 * @see GHA.GHAPackage#getContainer_Password()
	 * @model containment="true"
	 * @generated
	 */
	Expression getPassword();

	/**
	 * Sets the value of the '{@link GHA.Container#getPassword <em>Password</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' containment reference.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(Expression value);

	/**
	 * Returns the value of the '<em><b>Environment Variables</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link GHA.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Variables</em>' map.
	 * @see GHA.GHAPackage#getContainer_EnvironmentVariables()
	 * @model mapType="GHA.VariableAssignment&lt;org.eclipse.emf.ecore.EString, GHA.Expression&gt;"
	 * @generated
	 */
	EMap<String, Expression> getEnvironmentVariables();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see GHA.GHAPackage#getContainer_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getPorts();

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference list.
	 * @see GHA.GHAPackage#getContainer_Volumes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getVolumes();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(Expression)
	 * @see GHA.GHAPackage#getContainer_Options()
	 * @model containment="true"
	 * @generated
	 */
	Expression getOptions();

	/**
	 * Sets the value of the '{@link GHA.Container#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Expression value);

} // Container
