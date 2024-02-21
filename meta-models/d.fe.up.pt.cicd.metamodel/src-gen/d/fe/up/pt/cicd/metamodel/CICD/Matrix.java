/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

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
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Matrix#getAxes <em>Axes</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Matrix#getIncludes <em>Includes</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Matrix#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Matrix#getFailFast <em>Fail Fast</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends EObject {
	/**
	 * Returns the value of the '<em><b>Axes</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.MatrixAxis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axes</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getMatrix_Axes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MatrixAxis> getAxes();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.MatrixCombination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getMatrix_Includes()
	 * @model
	 * @generated
	 */
	EList<MatrixCombination> getIncludes();

	/**
	 * Returns the value of the '<em><b>Excludes</b></em>' reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.MatrixCombination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excludes</em>' reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getMatrix_Excludes()
	 * @model
	 * @generated
	 */
	EList<MatrixCombination> getExcludes();

	/**
	 * Returns the value of the '<em><b>Fail Fast</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail Fast</em>' attribute.
	 * @see #setFailFast(Boolean)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getMatrix_FailFast()
	 * @model default="true" required="true"
	 * @generated
	 */
	Boolean getFailFast();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Matrix#getFailFast <em>Fail Fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail Fast</em>' attribute.
	 * @see #getFailFast()
	 * @generated
	 */
	void setFailFast(Boolean value);

} // Matrix
