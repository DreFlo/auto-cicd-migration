/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix Combination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixCombination#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getMatrixCombination()
 * @model
 * @generated
 */
public interface MatrixCombination extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' map.
	 * The key is of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDeclaration},
	 * and the value is of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' map.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getMatrixCombination_Entries()
	 * @model mapType="d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableAssignment&lt;d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDeclaration, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression&gt;"
	 * @generated
	 */
	EMap<VariableDeclaration, Expression> getEntries();

} // MatrixCombination
