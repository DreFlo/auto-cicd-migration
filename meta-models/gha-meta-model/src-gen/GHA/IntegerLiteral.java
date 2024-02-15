/**
 */
package GHA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.IntegerLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see GHA.GHAPackage#getIntegerLiteral()
 * @model
 * @generated
 */
public interface IntegerLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see GHA.GHAPackage#getIntegerLiteral_Value()
	 * @model required="true"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link GHA.IntegerLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

} // IntegerLiteral
