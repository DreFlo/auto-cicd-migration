/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secret</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Secret#getIsRequired <em>Is Required</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getSecret()
 * @model
 * @generated
 */
public interface Secret extends Parameter {
	/**
	 * Returns the value of the '<em><b>Is Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required</em>' containment reference.
	 * @see #setIsRequired(Expression)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getSecret_IsRequired()
	 * @model containment="true"
	 * @generated
	 */
	Expression getIsRequired();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Secret#getIsRequired <em>Is Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Required</em>' containment reference.
	 * @see #getIsRequired()
	 * @generated
	 */
	void setIsRequired(Expression value);

} // Secret
