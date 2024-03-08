/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getWhenExpression()
 * @model
 * @generated
 */
public interface WhenExpression extends When {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(Expression)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getWhenExpression_Expression()
	 * @model required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenExpression#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // WhenExpression
