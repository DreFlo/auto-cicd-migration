/**
 */
package GHA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.DoubleLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see GHA.GHAPackage#getDoubleLiteral()
 * @model
 * @generated
 */
public interface DoubleLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see GHA.GHAPackage#getDoubleLiteral_Value()
	 * @model required="true"
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link GHA.DoubleLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

} // DoubleLiteral
