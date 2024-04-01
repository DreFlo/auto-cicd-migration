/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Reference Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CommandReferenceStep#getCommand <em>Command</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CommandReferenceStep#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getCommandReferenceStep()
 * @model
 * @generated
 */
public interface CommandReferenceStep extends Step {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Command)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getCommandReferenceStep_Command()
	 * @model required="true"
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CommandReferenceStep#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' map.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getCommandReferenceStep_Arguments()
	 * @model mapType="d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableAssignment&lt;org.eclipse.emf.ecore.EString, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression&gt;"
	 * @generated
	 */
	EMap<String, Expression> getArguments();

} // CommandReferenceStep
