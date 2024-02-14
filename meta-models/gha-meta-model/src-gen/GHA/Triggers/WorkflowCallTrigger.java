/**
 */
package GHA.Triggers;

import GHA.Triggers.Parameters.Input;
import GHA.Triggers.Parameters.Output;
import GHA.Triggers.Parameters.Secret;

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
 *   <li>{@link GHA.Triggers.WorkflowCallTrigger#getInputs <em>Inputs</em>}</li>
 *   <li>{@link GHA.Triggers.WorkflowCallTrigger#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link GHA.Triggers.WorkflowCallTrigger#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see GHA.Triggers.TriggersPackage#getWorkflowCallTrigger()
 * @model
 * @generated
 */
public interface WorkflowCallTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Triggers.Parameters.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see GHA.Triggers.TriggersPackage#getWorkflowCallTrigger_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Triggers.Parameters.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see GHA.Triggers.TriggersPackage#getWorkflowCallTrigger_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Triggers.Parameters.Secret}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference list.
	 * @see GHA.Triggers.TriggersPackage#getWorkflowCallTrigger_Secrets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Secret> getSecrets();

} // WorkflowCallTrigger
