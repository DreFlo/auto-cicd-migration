/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Output#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends Parameter {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getOutput_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Output#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // Output
