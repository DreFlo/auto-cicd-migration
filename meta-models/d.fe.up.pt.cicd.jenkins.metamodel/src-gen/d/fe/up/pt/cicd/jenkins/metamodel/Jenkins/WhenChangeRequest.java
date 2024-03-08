/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Change Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangeRequest#getMatcher <em>Matcher</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getWhenChangeRequest()
 * @model
 * @generated
 */
public interface WhenChangeRequest extends WhenComparison {
	/**
	 * Returns the value of the '<em><b>Matcher</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matcher</em>' attribute.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER
	 * @see #setMatcher(CHANGE_REQUEST_MATCHER)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getWhenChangeRequest_Matcher()
	 * @model required="true"
	 * @generated
	 */
	CHANGE_REQUEST_MATCHER getMatcher();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangeRequest#getMatcher <em>Matcher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matcher</em>' attribute.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER
	 * @see #getMatcher()
	 * @generated
	 */
	void setMatcher(CHANGE_REQUEST_MATCHER value);

} // WhenChangeRequest
