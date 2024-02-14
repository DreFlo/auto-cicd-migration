/**
 */
package CICD.Expressions.BinaryOperations;

import CICD.Expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CICD.Expressions.BinaryOperations.BinaryOp#getLhs <em>Lhs</em>}</li>
 *   <li>{@link CICD.Expressions.BinaryOperations.BinaryOp#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see CICD.Expressions.BinaryOperations.BinaryOperationsPackage#getBinaryOp()
 * @model
 * @generated
 */
public interface BinaryOp extends Expression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' reference.
	 * @see #setLhs(Expression)
	 * @see CICD.Expressions.BinaryOperations.BinaryOperationsPackage#getBinaryOp_Lhs()
	 * @model required="true"
	 * @generated
	 */
	Expression getLhs();

	/**
	 * Sets the value of the '{@link CICD.Expressions.BinaryOperations.BinaryOp#getLhs <em>Lhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Expression value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' reference.
	 * @see #setRhs(Expression)
	 * @see CICD.Expressions.BinaryOperations.BinaryOperationsPackage#getBinaryOp_Rhs()
	 * @model required="true"
	 * @generated
	 */
	Expression getRhs();

	/**
	 * Sets the value of the '{@link CICD.Expressions.BinaryOperations.BinaryOp#getRhs <em>Rhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Expression value);

} // BinaryOp