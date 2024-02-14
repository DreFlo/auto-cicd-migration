/**
 */
package GHA.Expressions.BinaryOperators.EqualityOperators;

import GHA.Expressions.BinaryOperators.BinaryOp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Expressions.BinaryOperators.EqualityOperators.Equality#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see GHA.Expressions.BinaryOperators.EqualityOperators.EqualityOperatorsPackage#getEquality()
 * @model
 * @generated
 */
public interface Equality extends BinaryOp {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link GHA.Expressions.BinaryOperators.EqualityOperators.EQUALITY_OPS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see GHA.Expressions.BinaryOperators.EqualityOperators.EQUALITY_OPS
	 * @see #setOp(EQUALITY_OPS)
	 * @see GHA.Expressions.BinaryOperators.EqualityOperators.EqualityOperatorsPackage#getEquality_Op()
	 * @model required="true"
	 * @generated
	 */
	EQUALITY_OPS getOp();

	/**
	 * Sets the value of the '{@link GHA.Expressions.BinaryOperators.EqualityOperators.Equality#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see GHA.Expressions.BinaryOperators.EqualityOperators.EQUALITY_OPS
	 * @see #getOp()
	 * @generated
	 */
	void setOp(EQUALITY_OPS value);

} // Equality
