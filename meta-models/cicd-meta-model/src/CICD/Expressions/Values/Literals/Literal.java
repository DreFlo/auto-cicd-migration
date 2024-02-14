/**
 */
package CICD.Expressions.Values.Literals;

import CICD.Expressions.Values.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CICD.Expressions.Values.Literals.Literal#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see CICD.Expressions.Values.Literals.LiteralsPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see CICD.Expressions.Values.Literals.LiteralsPackage#getLiteral_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link CICD.Expressions.Values.Literals.Literal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Literal
