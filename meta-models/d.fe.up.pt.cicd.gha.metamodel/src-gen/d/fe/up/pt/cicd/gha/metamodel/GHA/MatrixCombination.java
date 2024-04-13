/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA;

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
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.MatrixCombination#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getMatrixCombination()
 * @model
 * @generated
 */
public interface MatrixCombination extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' map.
	 * The key is of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.VariableDeclaration},
	 * and the value is of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' map.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getMatrixCombination_Entries()
	 * @model mapType="d.fe.up.pt.cicd.gha.metamodel.GHA.VariableAssignment&lt;d.fe.up.pt.cicd.gha.metamodel.GHA.VariableDeclaration, d.fe.up.pt.cicd.gha.metamodel.GHA.Expression&gt;"
	 * @generated
	 */
	EMap<VariableDeclaration, Expression> getEntries();

} // MatrixCombination
