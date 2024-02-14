/**
 */
package CICD.Matrices;

import CICD.Expressions.Expression;

import CICD.Expressions.Values.Variables.EnvironmentVariable;

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
 *   <li>{@link CICD.Matrices.MatrixCombination#getCombinationEntries <em>Combination Entries</em>}</li>
 * </ul>
 *
 * @see CICD.Matrices.MatricesPackage#getMatrixCombination()
 * @model
 * @generated
 */
public interface MatrixCombination extends EObject {
	/**
	 * Returns the value of the '<em><b>Combination Entries</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;CICD.Expressions.Values.Variables.EnvironmentVariable, CICD.Expressions.Expression&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combination Entries</em>' reference list.
	 * @see CICD.Matrices.MatricesPackage#getMatrixCombination_CombinationEntries()
	 * @model mapType="CICD.Expressions.Assignment&lt;CICD.Expressions.Values.Variables.EnvironmentVariable, CICD.Expressions.Expression&gt;"
	 * @generated
	 */
	EList<Map.Entry<EnvironmentVariable, Expression>> getCombinationEntries();

} // MatrixCombination
