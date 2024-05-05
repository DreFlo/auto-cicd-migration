/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getCommand <em>Command</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getShell <em>Shell</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getBackground <em>Background</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getWorkingDirectory <em>Working Directory</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getNoOutputTimeout <em>No Output Timeout</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getRunStep()
 * @model
 * @generated
 */
public interface RunStep extends Step, Environment {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference.
	 * @see #setCommand(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getRunStep_Command()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCommand();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getCommand <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' containment reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Expression value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getRunStep_Name()
	 * @model containment="true"
	 * @generated
	 */
	Expression getName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Expression value);

	/**
	 * Returns the value of the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' containment reference.
	 * @see #setShell(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getRunStep_Shell()
	 * @model containment="true"
	 * @generated
	 */
	Expression getShell();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getShell <em>Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' containment reference.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(Expression value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' containment reference.
	 * @see #setBackground(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getRunStep_Background()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getBackground();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getBackground <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' containment reference.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(Expression value);

	/**
	 * Returns the value of the '<em><b>Working Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Directory</em>' containment reference.
	 * @see #setWorkingDirectory(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getRunStep_WorkingDirectory()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWorkingDirectory();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getWorkingDirectory <em>Working Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Directory</em>' containment reference.
	 * @see #getWorkingDirectory()
	 * @generated
	 */
	void setWorkingDirectory(Expression value);

	/**
	 * Returns the value of the '<em><b>No Output Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Output Timeout</em>' containment reference.
	 * @see #setNoOutputTimeout(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getRunStep_NoOutputTimeout()
	 * @model containment="true"
	 * @generated
	 */
	Expression getNoOutputTimeout();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getNoOutputTimeout <em>No Output Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Output Timeout</em>' containment reference.
	 * @see #getNoOutputTimeout()
	 * @generated
	 */
	void setNoOutputTimeout(Expression value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE
	 * @see #setWhen(WHEN_TYPE)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getRunStep_When()
	 * @model
	 * @generated
	 */
	WHEN_TYPE getWhen();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(WHEN_TYPE value);

} // RunStep
