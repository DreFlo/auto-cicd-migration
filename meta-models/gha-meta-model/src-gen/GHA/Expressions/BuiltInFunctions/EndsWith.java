/**
 */
package GHA.Expressions.BuiltInFunctions;

import GHA.Expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ends With</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Expressions.BuiltInFunctions.EndsWith#getSearchString <em>Search String</em>}</li>
 *   <li>{@link GHA.Expressions.BuiltInFunctions.EndsWith#getSearchValue <em>Search Value</em>}</li>
 * </ul>
 *
 * @see GHA.Expressions.BuiltInFunctions.BuiltInFunctionsPackage#getEndsWith()
 * @model
 * @generated
 */
public interface EndsWith extends BuiltInFunctionCall {
	/**
	 * Returns the value of the '<em><b>Search String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search String</em>' containment reference.
	 * @see #setSearchString(Expression)
	 * @see GHA.Expressions.BuiltInFunctions.BuiltInFunctionsPackage#getEndsWith_SearchString()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getSearchString();

	/**
	 * Sets the value of the '{@link GHA.Expressions.BuiltInFunctions.EndsWith#getSearchString <em>Search String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search String</em>' containment reference.
	 * @see #getSearchString()
	 * @generated
	 */
	void setSearchString(Expression value);

	/**
	 * Returns the value of the '<em><b>Search Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Value</em>' containment reference.
	 * @see #setSearchValue(Expression)
	 * @see GHA.Expressions.BuiltInFunctions.BuiltInFunctionsPackage#getEndsWith_SearchValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getSearchValue();

	/**
	 * Sets the value of the '{@link GHA.Expressions.BuiltInFunctions.EndsWith#getSearchValue <em>Search Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Value</em>' containment reference.
	 * @see #getSearchValue()
	 * @generated
	 */
	void setSearchValue(Expression value);

} // EndsWith
