/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Steps;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.Command#getProgram <em>Program</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.Command#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends NonConditionalStep {
	/**
	 * Returns the value of the '<em><b>Program</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' attribute.
	 * @see #setProgram(String)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage#getCommand_Program()
	 * @model required="true"
	 * @generated
	 */
	String getProgram();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.Command#getProgram <em>Program</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' attribute.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute.
	 * @see #setArgs(String)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage#getCommand_Args()
	 * @model
	 * @generated
	 */
	String getArgs();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.Command#getArgs <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' attribute.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(String value);

} // Command
