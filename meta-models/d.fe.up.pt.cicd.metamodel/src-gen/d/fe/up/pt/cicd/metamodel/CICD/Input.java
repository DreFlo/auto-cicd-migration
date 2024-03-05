/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Input#getType <em>Type</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Input#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Input#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends Parameter {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.metamodel.CICD.INPUT_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.INPUT_TYPE
	 * @see #setType(INPUT_TYPE)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getInput_Type()
	 * @model required="true"
	 * @generated
	 */
	INPUT_TYPE getType();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Input#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.INPUT_TYPE
	 * @see #getType()
	 * @generated
	 */
	void setType(INPUT_TYPE value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getInput_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Input#getDefaultValue <em>Default Value</em>}' attribute.
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
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getInput_Required()
	 * @model required="true"
	 * @generated
	 */
	Boolean getRequired();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Input#getRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(Boolean value);

} // Input