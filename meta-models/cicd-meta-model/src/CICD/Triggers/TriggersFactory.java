/**
 */
package CICD.Triggers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CICD.Triggers.TriggersPackage
 * @generated
 */
public interface TriggersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TriggersFactory eINSTANCE = CICD.Triggers.impl.TriggersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Push Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Push Trigger</em>'.
	 * @generated
	 */
	PushTrigger createPushTrigger();

	/**
	 * Returns a new object of class '<em>Pull Request Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pull Request Trigger</em>'.
	 * @generated
	 */
	PullRequestTrigger createPullRequestTrigger();

	/**
	 * Returns a new object of class '<em>Manual Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manual Trigger</em>'.
	 * @generated
	 */
	ManualTrigger createManualTrigger();

	/**
	 * Returns a new object of class '<em>Scheduled Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduled Trigger</em>'.
	 * @generated
	 */
	ScheduledTrigger createScheduledTrigger();

	/**
	 * Returns a new object of class '<em>Webhook Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Webhook Trigger</em>'.
	 * @generated
	 */
	WebhookTrigger createWebhookTrigger();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TriggersPackage getTriggersPackage();

} //TriggersFactory
