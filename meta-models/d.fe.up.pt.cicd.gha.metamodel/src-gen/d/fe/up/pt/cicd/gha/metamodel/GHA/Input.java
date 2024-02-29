/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Input#getType <em>Type</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Input#getIsRequired <em>Is Required</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Input#getDefault <em>Default</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Input#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends Parameter {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.gha.metamodel.GHA.INPUT_TYPES}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.INPUT_TYPES
	 * @see #setType(INPUT_TYPES)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getInput_Type()
	 * @model required="true"
	 * @generated
	 */
	INPUT_TYPES getType();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Input#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.INPUT_TYPES
	 * @see #getType()
	 * @generated
	 */
	void setType(INPUT_TYPES value);

	/**
	 * Returns the value of the '<em><b>Is Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required</em>' containment reference.
	 * @see #setIsRequired(Expression)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getInput_IsRequired()
	 * @model containment="true"
	 * @generated
	 */
	Expression getIsRequired();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Input#getIsRequired <em>Is Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Required</em>' containment reference.
	 * @see #getIsRequired()
	 * @generated
	 */
	void setIsRequired(Expression value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(Expression)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getInput_Default()
	 * @model containment="true"
	 * @generated
	 */
	Expression getDefault();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Input#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(Expression value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getInput_Options()
	 * @model
	 * @generated
	 */
	EList<String> getOptions();

} // Input
