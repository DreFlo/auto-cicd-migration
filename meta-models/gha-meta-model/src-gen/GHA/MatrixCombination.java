/**
 */
package GHA;

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
 *   <li>{@link GHA.MatrixCombination#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see GHA.GHAPackage#getMatrixCombination()
 * @model
 * @generated
 */
public interface MatrixCombination extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link GHA.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' map.
	 * @see GHA.GHAPackage#getMatrixCombination_Entries()
	 * @model mapType="GHA.VariableAssignment&lt;org.eclipse.emf.ecore.EString, GHA.Expression&gt;"
	 * @generated
	 */
	EMap<String, Expression> getEntries();

} // MatrixCombination
