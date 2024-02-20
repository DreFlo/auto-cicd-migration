/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Expressions.UnaryOperations;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Expressions.UnaryOperations.UnaryOp#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.Expressions.UnaryOperations.UnaryOperationsPackage#getUnaryOp()
 * @model
 * @generated
 */
public interface UnaryOp extends Expression {
	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' reference.
	 * @see #setRhs(Expression)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Expressions.UnaryOperations.UnaryOperationsPackage#getUnaryOp_Rhs()
	 * @model required="true"
	 * @generated
	 */
	Expression getRhs();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Expressions.UnaryOperations.UnaryOp#getRhs <em>Rhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Expression value);

} // UnaryOp
