/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment#getEnvironmentVariables <em>Environment Variables</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getEnvironment()
 * @model abstract="true"
 * @generated
 */
public interface Environment extends EObject {
	/**
	 * Returns the value of the '<em><b>Environment Variables</b></em>' map.
	 * The key is of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDeclaration},
	 * and the value is of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Variables</em>' map.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getEnvironment_EnvironmentVariables()
	 * @model mapType="d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableAssignment&lt;d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDeclaration, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression&gt;"
	 * @generated
	 */
	EMap<VariableDeclaration, Expression> getEnvironmentVariables();

} // Environment
