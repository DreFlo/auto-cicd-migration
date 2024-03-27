/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add SSH Keys Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AddSSHKeysStep#getFingerprints <em>Fingerprints</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getAddSSHKeysStep()
 * @model
 * @generated
 */
public interface AddSSHKeysStep extends Step {
	/**
	 * Returns the value of the '<em><b>Fingerprints</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fingerprints</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getAddSSHKeysStep_Fingerprints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getFingerprints();

} // AddSSHKeysStep
