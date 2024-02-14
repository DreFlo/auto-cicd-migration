/**
 */
package CICD.Expressions.Values.Variables;

import CICD.Expressions.Values.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CICD.Expressions.Values.Variables.Variable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see CICD.Expressions.Values.Variables.VariablesPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Value {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CICD.Expressions.Values.Variables.VariablesPackage#getVariable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CICD.Expressions.Values.Variables.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Variable
