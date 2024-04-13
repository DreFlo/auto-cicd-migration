/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

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
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.MatrixCombination#getCombinationEntries <em>Combination Entries</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getMatrixCombination()
 * @model
 * @generated
 */
public interface MatrixCombination extends EObject {
	/**
	 * Returns the value of the '<em><b>Combination Entries</b></em>' map.
	 * The key is of type {@link d.fe.up.pt.cicd.metamodel.CICD.VariableDeclaration},
	 * and the value is of type {@link d.fe.up.pt.cicd.metamodel.CICD.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combination Entries</em>' map.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getMatrixCombination_CombinationEntries()
	 * @model mapType="d.fe.up.pt.cicd.metamodel.CICD.Assignment&lt;d.fe.up.pt.cicd.metamodel.CICD.VariableDeclaration, d.fe.up.pt.cicd.metamodel.CICD.Expression&gt;"
	 * @generated
	 */
	EMap<VariableDeclaration, Expression> getCombinationEntries();

} // MatrixCombination
