/**
 */
package GHA.Jobs.Matrices;

import GHA.Expressions.Expression;

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
 *   <li>{@link GHA.Jobs.Matrices.Matrix#getAxes <em>Axes</em>}</li>
 *   <li>{@link GHA.Jobs.Matrices.Matrix#getIncludes <em>Includes</em>}</li>
 *   <li>{@link GHA.Jobs.Matrices.Matrix#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link GHA.Jobs.Matrices.Matrix#getFailFast <em>Fail Fast</em>}</li>
 *   <li>{@link GHA.Jobs.Matrices.Matrix#getMaxParallel <em>Max Parallel</em>}</li>
 * </ul>
 *
 * @see GHA.Jobs.Matrices.MatricesPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends EObject {
	/**
	 * Returns the value of the '<em><b>Axes</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Jobs.Matrices.MatrixAxis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axes</em>' containment reference list.
	 * @see GHA.Jobs.Matrices.MatricesPackage#getMatrix_Axes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MatrixAxis> getAxes();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Jobs.Matrices.MatrixCombination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' containment reference list.
	 * @see GHA.Jobs.Matrices.MatricesPackage#getMatrix_Includes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatrixCombination> getIncludes();

	/**
	 * Returns the value of the '<em><b>Excludes</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Jobs.Matrices.MatrixCombination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excludes</em>' containment reference list.
	 * @see GHA.Jobs.Matrices.MatricesPackage#getMatrix_Excludes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatrixCombination> getExcludes();

	/**
	 * Returns the value of the '<em><b>Fail Fast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail Fast</em>' containment reference.
	 * @see #setFailFast(Expression)
	 * @see GHA.Jobs.Matrices.MatricesPackage#getMatrix_FailFast()
	 * @model containment="true"
	 * @generated
	 */
	Expression getFailFast();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Matrices.Matrix#getFailFast <em>Fail Fast</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail Fast</em>' containment reference.
	 * @see #getFailFast()
	 * @generated
	 */
	void setFailFast(Expression value);

	/**
	 * Returns the value of the '<em><b>Max Parallel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Parallel</em>' containment reference.
	 * @see #setMaxParallel(Expression)
	 * @see GHA.Jobs.Matrices.MatricesPackage#getMatrix_MaxParallel()
	 * @model containment="true"
	 * @generated
	 */
	Expression getMaxParallel();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Matrices.Matrix#getMaxParallel <em>Max Parallel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Parallel</em>' containment reference.
	 * @see #getMaxParallel()
	 * @generated
	 */
	void setMaxParallel(Expression value);

} // Matrix
