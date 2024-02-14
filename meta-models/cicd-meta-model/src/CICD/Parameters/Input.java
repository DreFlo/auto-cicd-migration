/**
 */
package CICD.Parameters;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CICD.Parameters.Input#getType <em>Type</em>}</li>
 *   <li>{@link CICD.Parameters.Input#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link CICD.Parameters.Input#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see CICD.Parameters.ParametersPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends Parameter {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CICD.Parameters.InputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CICD.Parameters.InputType
	 * @see #setType(InputType)
	 * @see CICD.Parameters.ParametersPackage#getInput_Type()
	 * @model required="true"
	 * @generated
	 */
	InputType getType();

	/**
	 * Sets the value of the '{@link CICD.Parameters.Input#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CICD.Parameters.InputType
	 * @see #getType()
	 * @generated
	 */
	void setType(InputType value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see CICD.Parameters.ParametersPackage#getInput_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link CICD.Parameters.Input#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(Boolean)
	 * @see CICD.Parameters.ParametersPackage#getInput_Required()
	 * @model required="true"
	 * @generated
	 */
	Boolean getRequired();

	/**
	 * Sets the value of the '{@link CICD.Parameters.Input#getRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(Boolean value);

} // Input
