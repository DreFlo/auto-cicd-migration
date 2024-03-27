/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setup Remote Docker Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SetupRemoteDockerStep#getVersion <em>Version</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SetupRemoteDockerStep#getDockerLayerCaching <em>Docker Layer Caching</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getSetupRemoteDockerStep()
 * @model
 * @generated
 */
public interface SetupRemoteDockerStep extends Step {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getSetupRemoteDockerStep_Version()
	 * @model containment="true"
	 * @generated
	 */
	Expression getVersion();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SetupRemoteDockerStep#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Expression value);

	/**
	 * Returns the value of the '<em><b>Docker Layer Caching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Layer Caching</em>' containment reference.
	 * @see #setDockerLayerCaching(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getSetupRemoteDockerStep_DockerLayerCaching()
	 * @model containment="true"
	 * @generated
	 */
	Expression getDockerLayerCaching();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SetupRemoteDockerStep#getDockerLayerCaching <em>Docker Layer Caching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Layer Caching</em>' containment reference.
	 * @see #getDockerLayerCaching()
	 * @generated
	 */
	void setDockerLayerCaching(Expression value);

} // SetupRemoteDockerStep
