/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Matrices;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Expression;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.EnvironmentVariable;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Matrices.MatrixCombination#getCombinationEntries <em>Combination Entries</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.Matrices.MatricesPackage#getMatrixCombination()
 * @model
 * @generated
 */
public interface MatrixCombination extends EObject {
	/**
	 * Returns the value of the '<em><b>Combination Entries</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.EnvironmentVariable, d.fe.up.pt.cicd.metamodel.CICD.Expressions.Expression&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combination Entries</em>' reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Matrices.MatricesPackage#getMatrixCombination_CombinationEntries()
	 * @model mapType="d.fe.up.pt.cicd.metamodel.CICD.Expressions.Assignment&lt;d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.EnvironmentVariable, d.fe.up.pt.cicd.metamodel.CICD.Expressions.Expression&gt;"
	 * @generated
	 */
	EList<Map.Entry<EnvironmentVariable, Expression>> getCombinationEntries();

} // MatrixCombination
