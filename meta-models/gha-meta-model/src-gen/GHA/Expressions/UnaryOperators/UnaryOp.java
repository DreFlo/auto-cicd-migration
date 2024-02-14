/**
 */
package GHA.Expressions.UnaryOperators;

import GHA.Expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Expressions.UnaryOperators.UnaryOp#getChildExpr <em>Child Expr</em>}</li>
 * </ul>
 *
 * @see GHA.Expressions.UnaryOperators.UnaryOperatorsPackage#getUnaryOp()
 * @model abstract="true"
 * @generated
 */
public interface UnaryOp extends Expression {
	/**
	 * Returns the value of the '<em><b>Child Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Expr</em>' containment reference.
	 * @see #setChildExpr(Expression)
	 * @see GHA.Expressions.UnaryOperators.UnaryOperatorsPackage#getUnaryOp_ChildExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getChildExpr();

	/**
	 * Sets the value of the '{@link GHA.Expressions.UnaryOperators.UnaryOp#getChildExpr <em>Child Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Expr</em>' containment reference.
	 * @see #getChildExpr()
	 * @generated
	 */
	void setChildExpr(Expression value);

} // UnaryOp