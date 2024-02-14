/**
 */
package GHA.Triggers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see GHA.Triggers.TriggersPackage
 * @generated
 */
public interface TriggersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TriggersFactory eINSTANCE = GHA.Triggers.impl.TriggersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Standard Event Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Event Trigger</em>'.
	 * @generated
	 */
	StandardEventTrigger createStandardEventTrigger();

	/**
	 * Returns a new object of class '<em>Workflow Run Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Run Trigger</em>'.
	 * @generated
	 */
	WorkflowRunTrigger createWorkflowRunTrigger();

	/**
	 * Returns a new object of class '<em>Pull Request Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pull Request Trigger</em>'.
	 * @generated
	 */
	PullRequestTrigger createPullRequestTrigger();

	/**
	 * Returns a new object of class '<em>Push Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Push Trigger</em>'.
	 * @generated
	 */
	PushTrigger createPushTrigger();

	/**
	 * Returns a new object of class '<em>Schedule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule Trigger</em>'.
	 * @generated
	 */
	ScheduleTrigger createScheduleTrigger();

	/**
	 * Returns a new object of class '<em>Workflow Call Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Call Trigger</em>'.
	 * @generated
	 */
	WorkflowCallTrigger createWorkflowCallTrigger();

	/**
	 * Returns a new object of class '<em>Workflow Dispatch Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Dispatch Trigger</em>'.
	 * @generated
	 */
	WorkflowDispatchTrigger createWorkflowDispatchTrigger();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TriggersPackage getTriggersPackage();

} //TriggersFactory
