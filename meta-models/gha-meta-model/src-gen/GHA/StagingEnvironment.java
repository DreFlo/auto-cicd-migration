/**
 */
package GHA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staging Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.StagingEnvironment#getName <em>Name</em>}</li>
 *   <li>{@link GHA.StagingEnvironment#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see GHA.GHAPackage#getStagingEnvironment()
 * @model
 * @generated
 */
public interface StagingEnvironment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Expression)
	 * @see GHA.GHAPackage#getStagingEnvironment_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getName();

	/**
	 * Sets the value of the '{@link GHA.StagingEnvironment#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Expression value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Expression)
	 * @see GHA.GHAPackage#getStagingEnvironment_Url()
	 * @model containment="true"
	 * @generated
	 */
	Expression getUrl();

	/**
	 * Sets the value of the '{@link GHA.StagingEnvironment#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Expression value);

} // StagingEnvironment
