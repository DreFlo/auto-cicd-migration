/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NodeAgent#getCustomWorkspace <em>Custom Workspace</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getNodeAgent()
 * @model
 * @generated
 */
public interface NodeAgent extends LabelAgent {
	/**
	 * Returns the value of the '<em><b>Custom Workspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Workspace</em>' attribute.
	 * @see #setCustomWorkspace(String)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getNodeAgent_CustomWorkspace()
	 * @model
	 * @generated
	 */
	String getCustomWorkspace();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NodeAgent#getCustomWorkspace <em>Custom Workspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Workspace</em>' attribute.
	 * @see #getCustomWorkspace()
	 * @generated
	 */
	void setCustomWorkspace(String value);

} // NodeAgent
