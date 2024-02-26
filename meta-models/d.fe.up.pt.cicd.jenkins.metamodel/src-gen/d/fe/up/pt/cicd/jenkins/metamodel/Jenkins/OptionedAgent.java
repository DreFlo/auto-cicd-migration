/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optioned Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent#getLabels <em>Labels</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent#getDocker <em>Docker</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent#getCustomWorkspace <em>Custom Workspace</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getOptionedAgent()
 * @model
 * @generated
 */
public interface OptionedAgent extends AbstractAgent {
	/**
	 * Returns the value of the '<em><b>Labels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' reference.
	 * @see #setLabels(Expression)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getOptionedAgent_Labels()
	 * @model required="true"
	 * @generated
	 */
	Expression getLabels();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent#getLabels <em>Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labels</em>' reference.
	 * @see #getLabels()
	 * @generated
	 */
	void setLabels(Expression value);

	/**
	 * Returns the value of the '<em><b>Docker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker</em>' reference.
	 * @see #setDocker(DockerContainer)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getOptionedAgent_Docker()
	 * @model
	 * @generated
	 */
	DockerContainer getDocker();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent#getDocker <em>Docker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker</em>' reference.
	 * @see #getDocker()
	 * @generated
	 */
	void setDocker(DockerContainer value);

	/**
	 * Returns the value of the '<em><b>Custom Workspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Workspace</em>' attribute.
	 * @see #setCustomWorkspace(String)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getOptionedAgent_CustomWorkspace()
	 * @model
	 * @generated
	 */
	String getCustomWorkspace();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent#getCustomWorkspace <em>Custom Workspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Workspace</em>' attribute.
	 * @see #getCustomWorkspace()
	 * @generated
	 */
	void setCustomWorkspace(String value);

} // OptionedAgent
