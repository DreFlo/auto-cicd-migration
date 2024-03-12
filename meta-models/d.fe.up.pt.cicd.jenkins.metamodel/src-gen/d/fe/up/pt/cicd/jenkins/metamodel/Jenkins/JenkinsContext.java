/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsContext#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getJenkinsContext()
 * @model
 * @generated
 */
public interface JenkinsContext extends Value {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JENKINS_CONTEXTS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JENKINS_CONTEXTS
	 * @see #setName(JENKINS_CONTEXTS)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getJenkinsContext_Name()
	 * @model required="true"
	 * @generated
	 */
	JENKINS_CONTEXTS getName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsContext#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JENKINS_CONTEXTS
	 * @see #getName()
	 * @generated
	 */
	void setName(JENKINS_CONTEXTS value);

} // JenkinsContext
