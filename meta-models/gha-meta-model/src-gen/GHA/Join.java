/**
 */
package GHA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Join#getArray <em>Array</em>}</li>
 *   <li>{@link GHA.Join#getSep <em>Sep</em>}</li>
 * </ul>
 *
 * @see GHA.GHAPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends BuiltInFunctionCall {
	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' containment reference.
	 * @see #setArray(Expression)
	 * @see GHA.GHAPackage#getJoin_Array()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getArray();

	/**
	 * Sets the value of the '{@link GHA.Join#getArray <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' containment reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(Expression value);

	/**
	 * Returns the value of the '<em><b>Sep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sep</em>' containment reference.
	 * @see #setSep(Expression)
	 * @see GHA.GHAPackage#getJoin_Sep()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSep();

	/**
	 * Sets the value of the '{@link GHA.Join#getSep <em>Sep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sep</em>' containment reference.
	 * @see #getSep()
	 * @generated
	 */
	void setSep(Expression value);

} // Join
