/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Git Hub Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.GitHubContext#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getGitHubContext()
 * @model
 * @generated
 */
public interface GitHubContext extends Value {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.gha.metamodel.GHA.CONTEXTS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.CONTEXTS
	 * @see #setContext(CONTEXTS)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getGitHubContext_Context()
	 * @model required="true"
	 * @generated
	 */
	CONTEXTS getContext();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.GitHubContext#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.CONTEXTS
	 * @see #getContext()
	 * @generated
	 */
	void setContext(CONTEXTS value);

} // GitHubContext
