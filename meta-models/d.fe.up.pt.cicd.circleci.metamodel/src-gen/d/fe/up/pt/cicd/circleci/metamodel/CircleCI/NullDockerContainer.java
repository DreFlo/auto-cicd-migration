/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null Docker Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.NullDockerContainer#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getNullDockerContainer()
 * @model
 * @generated
 */
public interface NullDockerContainer extends AbstractDockerContainer {

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CICD_AGENTS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' attribute.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CICD_AGENTS
	 * @see #setAgent(CICD_AGENTS)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getNullDockerContainer_Agent()
	 * @model required="true"
	 * @generated
	 */
	CICD_AGENTS getAgent();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.NullDockerContainer#getAgent <em>Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' attribute.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CICD_AGENTS
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(CICD_AGENTS value);
} // NullDockerContainer
