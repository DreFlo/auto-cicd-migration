/**
 */
package GHA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contains</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Contains#getSearch <em>Search</em>}</li>
 *   <li>{@link GHA.Contains#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see GHA.GHAPackage#getContains()
 * @model
 * @generated
 */
public interface Contains extends BuiltInFunctionCall {
	/**
	 * Returns the value of the '<em><b>Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search</em>' containment reference.
	 * @see #setSearch(Expression)
	 * @see GHA.GHAPackage#getContains_Search()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getSearch();

	/**
	 * Sets the value of the '{@link GHA.Contains#getSearch <em>Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search</em>' containment reference.
	 * @see #getSearch()
	 * @generated
	 */
	void setSearch(Expression value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(Expression)
	 * @see GHA.GHAPackage#getContains_Item()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getItem();

	/**
	 * Sets the value of the '{@link GHA.Contains#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Expression value);

} // Contains
