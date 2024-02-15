/**
 */
package GHA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Call Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.WorkflowCallTrigger#getInputs <em>Inputs</em>}</li>
 *   <li>{@link GHA.WorkflowCallTrigger#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link GHA.WorkflowCallTrigger#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see GHA.GHAPackage#getWorkflowCallTrigger()
 * @model
 * @generated
 */
public interface WorkflowCallTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see GHA.GHAPackage#getWorkflowCallTrigger_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see GHA.GHAPackage#getWorkflowCallTrigger_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Secret}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference list.
	 * @see GHA.GHAPackage#getWorkflowCallTrigger_Secrets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Secret> getSecrets();

} // WorkflowCallTrigger
