/**
 */
package GHA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Dispatch Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.WorkflowDispatchTrigger#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see GHA.GHAPackage#getWorkflowDispatchTrigger()
 * @model
 * @generated
 */
public interface WorkflowDispatchTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see GHA.GHAPackage#getWorkflowDispatchTrigger_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

} // WorkflowDispatchTrigger
