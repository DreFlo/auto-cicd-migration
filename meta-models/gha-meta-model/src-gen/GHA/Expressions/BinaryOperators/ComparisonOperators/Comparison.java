/**
 */
package GHA.Expressions.BinaryOperators.ComparisonOperators;

import GHA.Expressions.BinaryOperators.BinaryOp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Expressions.BinaryOperators.ComparisonOperators.Comparison#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see GHA.Expressions.BinaryOperators.ComparisonOperators.ComparisonOperatorsPackage#getComparison()
 * @model abstract="true"
 * @generated
 */
public interface Comparison extends BinaryOp {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link GHA.Expressions.BinaryOperators.ComparisonOperators.COMPARISON_OPS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see GHA.Expressions.BinaryOperators.ComparisonOperators.COMPARISON_OPS
	 * @see #setOp(COMPARISON_OPS)
	 * @see GHA.Expressions.BinaryOperators.ComparisonOperators.ComparisonOperatorsPackage#getComparison_Op()
	 * @model required="true"
	 * @generated
	 */
	COMPARISON_OPS getOp();

	/**
	 * Sets the value of the '{@link GHA.Expressions.BinaryOperators.ComparisonOperators.Comparison#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see GHA.Expressions.BinaryOperators.ComparisonOperators.COMPARISON_OPS
	 * @see #getOp()
	 * @generated
	 */
	void setOp(COMPARISON_OPS value);

} // Comparison
