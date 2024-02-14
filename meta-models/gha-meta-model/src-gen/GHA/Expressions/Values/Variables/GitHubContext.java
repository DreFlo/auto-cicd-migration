/**
 */
package GHA.Expressions.Values.Variables;

import GHA.Expressions.Values.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Git Hub Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Expressions.Values.Variables.GitHubContext#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see GHA.Expressions.Values.Variables.VariablesPackage#getGitHubContext()
 * @model
 * @generated
 */
public interface GitHubContext extends Value {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * The literals are from the enumeration {@link GHA.Expressions.Values.Variables.CONTEXTS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see GHA.Expressions.Values.Variables.CONTEXTS
	 * @see #setContext(CONTEXTS)
	 * @see GHA.Expressions.Values.Variables.VariablesPackage#getGitHubContext_Context()
	 * @model required="true"
	 * @generated
	 */
	CONTEXTS getContext();

	/**
	 * Sets the value of the '{@link GHA.Expressions.Values.Variables.GitHubContext#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see GHA.Expressions.Values.Variables.CONTEXTS
	 * @see #getContext()
	 * @generated
	 */
	void setContext(CONTEXTS value);

} // GitHubContext
