/**
 */
package GHA.Expressions.BuiltInFunctions;

import GHA.Expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From JSON</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Expressions.BuiltInFunctions.FromJSON#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see GHA.Expressions.BuiltInFunctions.BuiltInFunctionsPackage#getFromJSON()
 * @model
 * @generated
 */
public interface FromJSON extends BuiltInFunctionCall {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see GHA.Expressions.BuiltInFunctions.BuiltInFunctionsPackage#getFromJSON_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link GHA.Expressions.BuiltInFunctions.FromJSON#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // FromJSON
