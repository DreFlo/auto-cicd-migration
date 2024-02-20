/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Matrices;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Matrices.MatrixAxis#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Matrices.MatrixAxis#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.Matrices.MatricesPackage#getMatrixAxis()
 * @model
 * @generated
 */
public interface MatrixAxis extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Matrices.MatricesPackage#getMatrixAxis_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Matrices.MatrixAxis#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.Expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Matrices.MatricesPackage#getMatrixAxis_Cells()
	 * @model required="true"
	 * @generated
	 */
	EList<Expression> getCells();

} // MatrixAxis
