/**
 */
package GHA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Command#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see GHA.GHAPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends Step {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference.
	 * @see #setCommand(Expression)
	 * @see GHA.GHAPackage#getCommand_Command()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCommand();

	/**
	 * Sets the value of the '{@link GHA.Command#getCommand <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' containment reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Expression value);

} // Command
