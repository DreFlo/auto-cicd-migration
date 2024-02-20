/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Parameters;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Parameters.Output#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.Parameters.ParametersPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends Parameter {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Value)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Parameters.ParametersPackage#getOutput_Value()
	 * @model required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Parameters.Output#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // Output
