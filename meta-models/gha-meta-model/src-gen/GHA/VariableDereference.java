/**
 */
package GHA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Dereference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.VariableDereference#getVariable <em>Variable</em>}</li>
 *   <li>{@link GHA.VariableDereference#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see GHA.GHAPackage#getVariableDereference()
 * @model
 * @generated
 */
public interface VariableDereference extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Expression)
	 * @see GHA.GHAPackage#getVariableDereference_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getVariable();

	/**
	 * Sets the value of the '{@link GHA.VariableDereference#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Expression value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see GHA.GHAPackage#getVariableDereference_Property()
	 * @model required="true"
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link GHA.VariableDereference#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

} // VariableDereference
