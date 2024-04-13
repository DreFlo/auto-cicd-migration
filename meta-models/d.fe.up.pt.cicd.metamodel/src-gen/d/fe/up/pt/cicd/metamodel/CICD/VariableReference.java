/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.VariableReference#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends Value {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(VariableDeclaration)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getVariableReference_Reference()
	 * @model required="true"
	 * @generated
	 */
	VariableDeclaration getReference();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.VariableReference#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(VariableDeclaration value);

} // VariableReference
