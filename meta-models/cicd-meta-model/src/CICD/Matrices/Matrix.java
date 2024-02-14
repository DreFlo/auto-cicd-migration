/**
 */
package CICD.Matrices;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CICD.Matrices.Matrix#getAxes <em>Axes</em>}</li>
 *   <li>{@link CICD.Matrices.Matrix#getIncludes <em>Includes</em>}</li>
 *   <li>{@link CICD.Matrices.Matrix#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link CICD.Matrices.Matrix#getFailFast <em>Fail Fast</em>}</li>
 * </ul>
 *
 * @see CICD.Matrices.MatricesPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends EObject {
	/**
	 * Returns the value of the '<em><b>Axes</b></em>' containment reference list.
	 * The list contents are of type {@link CICD.Matrices.MatrixAxis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axes</em>' containment reference list.
	 * @see CICD.Matrices.MatricesPackage#getMatrix_Axes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MatrixAxis> getAxes();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link CICD.Matrices.MatrixCombination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see CICD.Matrices.MatricesPackage#getMatrix_Includes()
	 * @model
	 * @generated
	 */
	EList<MatrixCombination> getIncludes();

	/**
	 * Returns the value of the '<em><b>Excludes</b></em>' reference list.
	 * The list contents are of type {@link CICD.Matrices.MatrixCombination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excludes</em>' reference list.
	 * @see CICD.Matrices.MatricesPackage#getMatrix_Excludes()
	 * @model
	 * @generated
	 */
	EList<MatrixCombination> getExcludes();

	/**
	 * Returns the value of the '<em><b>Fail Fast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail Fast</em>' attribute.
	 * @see #setFailFast(Boolean)
	 * @see CICD.Matrices.MatricesPackage#getMatrix_FailFast()
	 * @model required="true"
	 * @generated
	 */
	Boolean getFailFast();

	/**
	 * Sets the value of the '{@link CICD.Matrices.Matrix#getFailFast <em>Fail Fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail Fast</em>' attribute.
	 * @see #getFailFast()
	 * @generated
	 */
	void setFailFast(Boolean value);

} // Matrix
