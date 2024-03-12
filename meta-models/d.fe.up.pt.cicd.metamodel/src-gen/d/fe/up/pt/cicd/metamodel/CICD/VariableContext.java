/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.VariableContext#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getVariableContext()
 * @model
 * @generated
 */
public interface VariableContext extends Value {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.metamodel.CICD.VARIABLE_CONTEXTS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.VARIABLE_CONTEXTS
	 * @see #setContext(VARIABLE_CONTEXTS)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getVariableContext_Context()
	 * @model required="true"
	 * @generated
	 */
	VARIABLE_CONTEXTS getContext();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.VariableContext#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.VARIABLE_CONTEXTS
	 * @see #getContext()
	 * @generated
	 */
	void setContext(VARIABLE_CONTEXTS value);

} // VariableContext
