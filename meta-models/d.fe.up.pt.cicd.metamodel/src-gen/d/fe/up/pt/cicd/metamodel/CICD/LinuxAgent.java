/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linux Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.LinuxAgent#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getLinuxAgent()
 * @model
 * @generated
 */
public interface LinuxAgent extends PresetAgent {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(DockerContainer)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getLinuxAgent_Container()
	 * @model
	 * @generated
	 */
	DockerContainer getContainer();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.LinuxAgent#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(DockerContainer value);

} // LinuxAgent
