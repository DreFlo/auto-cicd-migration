/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getCommand <em>Command</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getUser <em>User</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getUsername <em>Username</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getPassword <em>Password</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getOidc <em>Oidc</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getAwsAccessKeyID <em>Aws Access Key ID</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getAwsSecretAccessKey <em>Aws Secret Access Key</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getDockerContainer()
 * @model
 * @generated
 */
public interface DockerContainer extends Environment, AbstractDockerContainer {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getDockerContainer_Name()
	 * @model containment="true"
	 * @generated
	 */
	Expression getName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Expression value);

	/**
	 * Returns the value of the '<em><b>Entrypoint</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrypoint</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getDockerContainer_Entrypoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getEntrypoint();

	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getDockerContainer_Command()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getCommand();

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getDockerContainer_User()
	 * @model containment="true"
	 * @generated
	 */
	Expression getUser();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(Expression value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' containment reference.
	 * @see #setUsername(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getDockerContainer_Username()
	 * @model containment="true"
	 * @generated
	 */
	Expression getUsername();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getUsername <em>Username</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' containment reference.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(Expression value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' containment reference.
	 * @see #setPassword(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getDockerContainer_Password()
	 * @model containment="true"
	 * @generated
	 */
	Expression getPassword();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getPassword <em>Password</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' containment reference.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(Expression value);

	/**
	 * Returns the value of the '<em><b>Oidc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oidc</em>' containment reference.
	 * @see #setOidc(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getDockerContainer_Oidc()
	 * @model containment="true"
	 * @generated
	 */
	Expression getOidc();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getOidc <em>Oidc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oidc</em>' containment reference.
	 * @see #getOidc()
	 * @generated
	 */
	void setOidc(Expression value);

	/**
	 * Returns the value of the '<em><b>Aws Access Key ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aws Access Key ID</em>' containment reference.
	 * @see #setAwsAccessKeyID(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getDockerContainer_AwsAccessKeyID()
	 * @model containment="true"
	 * @generated
	 */
	Expression getAwsAccessKeyID();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getAwsAccessKeyID <em>Aws Access Key ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aws Access Key ID</em>' containment reference.
	 * @see #getAwsAccessKeyID()
	 * @generated
	 */
	void setAwsAccessKeyID(Expression value);

	/**
	 * Returns the value of the '<em><b>Aws Secret Access Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aws Secret Access Key</em>' containment reference.
	 * @see #setAwsSecretAccessKey(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getDockerContainer_AwsSecretAccessKey()
	 * @model containment="true"
	 * @generated
	 */
	Expression getAwsSecretAccessKey();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getAwsSecretAccessKey <em>Aws Secret Access Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aws Secret Access Key</em>' containment reference.
	 * @see #getAwsSecretAccessKey()
	 * @generated
	 */
	void setAwsSecretAccessKey(Expression value);

} // DockerContainer
