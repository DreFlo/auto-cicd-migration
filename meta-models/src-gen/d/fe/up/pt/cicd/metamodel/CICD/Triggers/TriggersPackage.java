/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Triggers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.TriggersFactory
 * @model kind="package"
 * @generated
 */
public interface TriggersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Triggers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.d.fe.up.pt/CICD/Triggers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Triggers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TriggersPackage eINSTANCE = d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggersPackageImpl.init();

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggerImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggersPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 0;

	/**
	 * The feature id for the '<em><b>Branch Globs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__BRANCH_GLOBS = 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.PushTriggerImpl <em>Push Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.PushTriggerImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggersPackageImpl#getPushTrigger()
	 * @generated
	 */
	int PUSH_TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Branch Globs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__BRANCH_GLOBS = TRIGGER__BRANCH_GLOBS;

	/**
	 * The feature id for the '<em><b>Tag Globs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__TAG_GLOBS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Push Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Push Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.PullRequestTriggerImpl <em>Pull Request Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.PullRequestTriggerImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggersPackageImpl#getPullRequestTrigger()
	 * @generated
	 */
	int PULL_REQUEST_TRIGGER = 2;

	/**
	 * The feature id for the '<em><b>Branch Globs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER__BRANCH_GLOBS = TRIGGER__BRANCH_GLOBS;

	/**
	 * The number of structural features of the '<em>Pull Request Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pull Request Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.ManualTriggerImpl <em>Manual Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.ManualTriggerImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggersPackageImpl#getManualTrigger()
	 * @generated
	 */
	int MANUAL_TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Branch Globs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TRIGGER__BRANCH_GLOBS = TRIGGER__BRANCH_GLOBS;

	/**
	 * The number of structural features of the '<em>Manual Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manual Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.ScheduledTriggerImpl <em>Scheduled Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.ScheduledTriggerImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggersPackageImpl#getScheduledTrigger()
	 * @generated
	 */
	int SCHEDULED_TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Branch Globs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRIGGER__BRANCH_GLOBS = TRIGGER__BRANCH_GLOBS;

	/**
	 * The feature id for the '<em><b>Cron</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRIGGER__CRON = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scheduled Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scheduled Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.WebhookTriggerImpl <em>Webhook Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.WebhookTriggerImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggersPackageImpl#getWebhookTrigger()
	 * @generated
	 */
	int WEBHOOK_TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Branch Globs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBHOOK_TRIGGER__BRANCH_GLOBS = TRIGGER__BRANCH_GLOBS;

	/**
	 * The number of structural features of the '<em>Webhook Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBHOOK_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Webhook Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBHOOK_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute list '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.Trigger#getBranchGlobs <em>Branch Globs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Branch Globs</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.Trigger#getBranchGlobs()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_BranchGlobs();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.PushTrigger <em>Push Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Trigger</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.PushTrigger
	 * @generated
	 */
	EClass getPushTrigger();

	/**
	 * Returns the meta object for the attribute list '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.PushTrigger#getTagGlobs <em>Tag Globs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tag Globs</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.PushTrigger#getTagGlobs()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EAttribute getPushTrigger_TagGlobs();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.PullRequestTrigger <em>Pull Request Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pull Request Trigger</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.PullRequestTrigger
	 * @generated
	 */
	EClass getPullRequestTrigger();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.ManualTrigger <em>Manual Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual Trigger</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.ManualTrigger
	 * @generated
	 */
	EClass getManualTrigger();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.ScheduledTrigger <em>Scheduled Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduled Trigger</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.ScheduledTrigger
	 * @generated
	 */
	EClass getScheduledTrigger();

	/**
	 * Returns the meta object for the attribute list '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.ScheduledTrigger#getCron <em>Cron</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cron</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.ScheduledTrigger#getCron()
	 * @see #getScheduledTrigger()
	 * @generated
	 */
	EAttribute getScheduledTrigger_Cron();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.WebhookTrigger <em>Webhook Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Webhook Trigger</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.WebhookTrigger
	 * @generated
	 */
	EClass getWebhookTrigger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TriggersFactory getTriggersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggerImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggersPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Branch Globs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__BRANCH_GLOBS = eINSTANCE.getTrigger_BranchGlobs();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.PushTriggerImpl <em>Push Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.PushTriggerImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggersPackageImpl#getPushTrigger()
		 * @generated
		 */
		EClass PUSH_TRIGGER = eINSTANCE.getPushTrigger();

		/**
		 * The meta object literal for the '<em><b>Tag Globs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_TRIGGER__TAG_GLOBS = eINSTANCE.getPushTrigger_TagGlobs();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.PullRequestTriggerImpl <em>Pull Request Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.PullRequestTriggerImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggersPackageImpl#getPullRequestTrigger()
		 * @generated
		 */
		EClass PULL_REQUEST_TRIGGER = eINSTANCE.getPullRequestTrigger();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.ManualTriggerImpl <em>Manual Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.ManualTriggerImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggersPackageImpl#getManualTrigger()
		 * @generated
		 */
		EClass MANUAL_TRIGGER = eINSTANCE.getManualTrigger();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.ScheduledTriggerImpl <em>Scheduled Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.ScheduledTriggerImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggersPackageImpl#getScheduledTrigger()
		 * @generated
		 */
		EClass SCHEDULED_TRIGGER = eINSTANCE.getScheduledTrigger();

		/**
		 * The meta object literal for the '<em><b>Cron</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_TRIGGER__CRON = eINSTANCE.getScheduledTrigger_Cron();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.WebhookTriggerImpl <em>Webhook Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.WebhookTriggerImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggersPackageImpl#getWebhookTrigger()
		 * @generated
		 */
		EClass WEBHOOK_TRIGGER = eINSTANCE.getWebhookTrigger();

	}

} //TriggersPackage
