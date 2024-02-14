/**
 */
package GHA.Triggers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see GHA.Triggers.TriggersFactory
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
	String eNS_URI = "http://d.fe.up.pt/GHA/Triggers";

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
	TriggersPackage eINSTANCE = GHA.Triggers.impl.TriggersPackageImpl.init();

	/**
	 * The meta object id for the '{@link GHA.Triggers.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Triggers.impl.TriggerImpl
	 * @see GHA.Triggers.impl.TriggersPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GHA.Triggers.impl.StandardEventTriggerImpl <em>Standard Event Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Triggers.impl.StandardEventTriggerImpl
	 * @see GHA.Triggers.impl.TriggersPackageImpl#getStandardEventTrigger()
	 * @generated
	 */
	int STANDARD_EVENT_TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EVENT_TRIGGER__EVENT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EVENT_TRIGGER__EVENT_TYPES = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Standard Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EVENT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Standard Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EVENT_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Triggers.impl.WorkflowRunTriggerImpl <em>Workflow Run Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Triggers.impl.WorkflowRunTriggerImpl
	 * @see GHA.Triggers.impl.TriggersPackageImpl#getWorkflowRunTrigger()
	 * @generated
	 */
	int WORKFLOW_RUN_TRIGGER = 2;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUN_TRIGGER__BRANCHES = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignore Specified Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUN_TRIGGER__IGNORE_SPECIFIED_BRANCHES = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workflow Run Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUN_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Workflow Run Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUN_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Triggers.impl.PullRequestTriggerImpl <em>Pull Request Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Triggers.impl.PullRequestTriggerImpl
	 * @see GHA.Triggers.impl.TriggersPackageImpl#getPullRequestTrigger()
	 * @generated
	 */
	int PULL_REQUEST_TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Event Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER__EVENT_TYPES = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER__BRANCHES = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ignore Specified Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_BRANCHES = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER__PATHS = TRIGGER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ignore Specified Paths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_PATHS = TRIGGER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Pull Request Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Pull Request Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Triggers.impl.PushTriggerImpl <em>Push Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Triggers.impl.PushTriggerImpl
	 * @see GHA.Triggers.impl.TriggersPackageImpl#getPushTrigger()
	 * @generated
	 */
	int PUSH_TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__BRANCHES = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignore Specified Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__IGNORE_SPECIFIED_BRANCHES = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__PATHS = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ignore Specified Paths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__IGNORE_SPECIFIED_PATHS = TRIGGER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__TAGS = TRIGGER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ignore Specified Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__IGNORE_SPECIFIED_TAGS = TRIGGER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Push Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Push Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Triggers.impl.ScheduleTriggerImpl <em>Schedule Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Triggers.impl.ScheduleTriggerImpl
	 * @see GHA.Triggers.impl.TriggersPackageImpl#getScheduleTrigger()
	 * @generated
	 */
	int SCHEDULE_TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Crons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER__CRONS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schedule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schedule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Triggers.impl.WorkflowCallTriggerImpl <em>Workflow Call Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Triggers.impl.WorkflowCallTriggerImpl
	 * @see GHA.Triggers.impl.TriggersPackageImpl#getWorkflowCallTrigger()
	 * @generated
	 */
	int WORKFLOW_CALL_TRIGGER = 6;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_TRIGGER__INPUTS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_TRIGGER__OUTPUTS = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Secrets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_TRIGGER__SECRETS = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workflow Call Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Workflow Call Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Triggers.impl.WorkflowDispatchTriggerImpl <em>Workflow Dispatch Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Triggers.impl.WorkflowDispatchTriggerImpl
	 * @see GHA.Triggers.impl.TriggersPackageImpl#getWorkflowDispatchTrigger()
	 * @generated
	 */
	int WORKFLOW_DISPATCH_TRIGGER = 7;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DISPATCH_TRIGGER__INPUTS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow Dispatch Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DISPATCH_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Workflow Dispatch Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DISPATCH_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Triggers.EVENTS <em>EVENTS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Triggers.EVENTS
	 * @see GHA.Triggers.impl.TriggersPackageImpl#getEVENTS()
	 * @generated
	 */
	int EVENTS = 8;

	/**
	 * The meta object id for the '{@link GHA.Triggers.WEBHOOK_ACTIVITY_TYPES <em>WEBHOOK ACTIVITY TYPES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Triggers.WEBHOOK_ACTIVITY_TYPES
	 * @see GHA.Triggers.impl.TriggersPackageImpl#getWEBHOOK_ACTIVITY_TYPES()
	 * @generated
	 */
	int WEBHOOK_ACTIVITY_TYPES = 9;

	/**
	 * Returns the meta object for class '{@link GHA.Triggers.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see GHA.Triggers.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for class '{@link GHA.Triggers.StandardEventTrigger <em>Standard Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Event Trigger</em>'.
	 * @see GHA.Triggers.StandardEventTrigger
	 * @generated
	 */
	EClass getStandardEventTrigger();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Triggers.StandardEventTrigger#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see GHA.Triggers.StandardEventTrigger#getEvent()
	 * @see #getStandardEventTrigger()
	 * @generated
	 */
	EAttribute getStandardEventTrigger_Event();

	/**
	 * Returns the meta object for the attribute list '{@link GHA.Triggers.StandardEventTrigger#getEventTypes <em>Event Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Event Types</em>'.
	 * @see GHA.Triggers.StandardEventTrigger#getEventTypes()
	 * @see #getStandardEventTrigger()
	 * @generated
	 */
	EAttribute getStandardEventTrigger_EventTypes();

	/**
	 * Returns the meta object for class '{@link GHA.Triggers.WorkflowRunTrigger <em>Workflow Run Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Run Trigger</em>'.
	 * @see GHA.Triggers.WorkflowRunTrigger
	 * @generated
	 */
	EClass getWorkflowRunTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Triggers.WorkflowRunTrigger#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see GHA.Triggers.WorkflowRunTrigger#getBranches()
	 * @see #getWorkflowRunTrigger()
	 * @generated
	 */
	EReference getWorkflowRunTrigger_Branches();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Triggers.WorkflowRunTrigger#isIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Specified Branches</em>'.
	 * @see GHA.Triggers.WorkflowRunTrigger#isIgnoreSpecifiedBranches()
	 * @see #getWorkflowRunTrigger()
	 * @generated
	 */
	EAttribute getWorkflowRunTrigger_IgnoreSpecifiedBranches();

	/**
	 * Returns the meta object for class '{@link GHA.Triggers.PullRequestTrigger <em>Pull Request Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pull Request Trigger</em>'.
	 * @see GHA.Triggers.PullRequestTrigger
	 * @generated
	 */
	EClass getPullRequestTrigger();

	/**
	 * Returns the meta object for the attribute list '{@link GHA.Triggers.PullRequestTrigger#getEventTypes <em>Event Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Event Types</em>'.
	 * @see GHA.Triggers.PullRequestTrigger#getEventTypes()
	 * @see #getPullRequestTrigger()
	 * @generated
	 */
	EAttribute getPullRequestTrigger_EventTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Triggers.PullRequestTrigger#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see GHA.Triggers.PullRequestTrigger#getBranches()
	 * @see #getPullRequestTrigger()
	 * @generated
	 */
	EReference getPullRequestTrigger_Branches();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Triggers.PullRequestTrigger#isIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Specified Branches</em>'.
	 * @see GHA.Triggers.PullRequestTrigger#isIgnoreSpecifiedBranches()
	 * @see #getPullRequestTrigger()
	 * @generated
	 */
	EAttribute getPullRequestTrigger_IgnoreSpecifiedBranches();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Triggers.PullRequestTrigger#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see GHA.Triggers.PullRequestTrigger#getPaths()
	 * @see #getPullRequestTrigger()
	 * @generated
	 */
	EReference getPullRequestTrigger_Paths();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Triggers.PullRequestTrigger#isIgnoreSpecifiedPaths <em>Ignore Specified Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Specified Paths</em>'.
	 * @see GHA.Triggers.PullRequestTrigger#isIgnoreSpecifiedPaths()
	 * @see #getPullRequestTrigger()
	 * @generated
	 */
	EAttribute getPullRequestTrigger_IgnoreSpecifiedPaths();

	/**
	 * Returns the meta object for class '{@link GHA.Triggers.PushTrigger <em>Push Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Trigger</em>'.
	 * @see GHA.Triggers.PushTrigger
	 * @generated
	 */
	EClass getPushTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Triggers.PushTrigger#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see GHA.Triggers.PushTrigger#getBranches()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EReference getPushTrigger_Branches();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Triggers.PushTrigger#isIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Specified Branches</em>'.
	 * @see GHA.Triggers.PushTrigger#isIgnoreSpecifiedBranches()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EAttribute getPushTrigger_IgnoreSpecifiedBranches();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Triggers.PushTrigger#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see GHA.Triggers.PushTrigger#getPaths()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EReference getPushTrigger_Paths();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Triggers.PushTrigger#isIgnoreSpecifiedPaths <em>Ignore Specified Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Specified Paths</em>'.
	 * @see GHA.Triggers.PushTrigger#isIgnoreSpecifiedPaths()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EAttribute getPushTrigger_IgnoreSpecifiedPaths();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Triggers.PushTrigger#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see GHA.Triggers.PushTrigger#getTags()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EReference getPushTrigger_Tags();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Triggers.PushTrigger#isIgnoreSpecifiedTags <em>Ignore Specified Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Specified Tags</em>'.
	 * @see GHA.Triggers.PushTrigger#isIgnoreSpecifiedTags()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EAttribute getPushTrigger_IgnoreSpecifiedTags();

	/**
	 * Returns the meta object for class '{@link GHA.Triggers.ScheduleTrigger <em>Schedule Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Trigger</em>'.
	 * @see GHA.Triggers.ScheduleTrigger
	 * @generated
	 */
	EClass getScheduleTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Triggers.ScheduleTrigger#getCrons <em>Crons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Crons</em>'.
	 * @see GHA.Triggers.ScheduleTrigger#getCrons()
	 * @see #getScheduleTrigger()
	 * @generated
	 */
	EReference getScheduleTrigger_Crons();

	/**
	 * Returns the meta object for class '{@link GHA.Triggers.WorkflowCallTrigger <em>Workflow Call Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Call Trigger</em>'.
	 * @see GHA.Triggers.WorkflowCallTrigger
	 * @generated
	 */
	EClass getWorkflowCallTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Triggers.WorkflowCallTrigger#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see GHA.Triggers.WorkflowCallTrigger#getInputs()
	 * @see #getWorkflowCallTrigger()
	 * @generated
	 */
	EReference getWorkflowCallTrigger_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Triggers.WorkflowCallTrigger#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see GHA.Triggers.WorkflowCallTrigger#getOutputs()
	 * @see #getWorkflowCallTrigger()
	 * @generated
	 */
	EReference getWorkflowCallTrigger_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Triggers.WorkflowCallTrigger#getSecrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secrets</em>'.
	 * @see GHA.Triggers.WorkflowCallTrigger#getSecrets()
	 * @see #getWorkflowCallTrigger()
	 * @generated
	 */
	EReference getWorkflowCallTrigger_Secrets();

	/**
	 * Returns the meta object for class '{@link GHA.Triggers.WorkflowDispatchTrigger <em>Workflow Dispatch Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Dispatch Trigger</em>'.
	 * @see GHA.Triggers.WorkflowDispatchTrigger
	 * @generated
	 */
	EClass getWorkflowDispatchTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Triggers.WorkflowDispatchTrigger#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see GHA.Triggers.WorkflowDispatchTrigger#getInputs()
	 * @see #getWorkflowDispatchTrigger()
	 * @generated
	 */
	EReference getWorkflowDispatchTrigger_Inputs();

	/**
	 * Returns the meta object for enum '{@link GHA.Triggers.EVENTS <em>EVENTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EVENTS</em>'.
	 * @see GHA.Triggers.EVENTS
	 * @generated
	 */
	EEnum getEVENTS();

	/**
	 * Returns the meta object for enum '{@link GHA.Triggers.WEBHOOK_ACTIVITY_TYPES <em>WEBHOOK ACTIVITY TYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>WEBHOOK ACTIVITY TYPES</em>'.
	 * @see GHA.Triggers.WEBHOOK_ACTIVITY_TYPES
	 * @generated
	 */
	EEnum getWEBHOOK_ACTIVITY_TYPES();

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
		 * The meta object literal for the '{@link GHA.Triggers.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Triggers.impl.TriggerImpl
		 * @see GHA.Triggers.impl.TriggersPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '{@link GHA.Triggers.impl.StandardEventTriggerImpl <em>Standard Event Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Triggers.impl.StandardEventTriggerImpl
		 * @see GHA.Triggers.impl.TriggersPackageImpl#getStandardEventTrigger()
		 * @generated
		 */
		EClass STANDARD_EVENT_TRIGGER = eINSTANCE.getStandardEventTrigger();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_EVENT_TRIGGER__EVENT = eINSTANCE.getStandardEventTrigger_Event();

		/**
		 * The meta object literal for the '<em><b>Event Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_EVENT_TRIGGER__EVENT_TYPES = eINSTANCE.getStandardEventTrigger_EventTypes();

		/**
		 * The meta object literal for the '{@link GHA.Triggers.impl.WorkflowRunTriggerImpl <em>Workflow Run Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Triggers.impl.WorkflowRunTriggerImpl
		 * @see GHA.Triggers.impl.TriggersPackageImpl#getWorkflowRunTrigger()
		 * @generated
		 */
		EClass WORKFLOW_RUN_TRIGGER = eINSTANCE.getWorkflowRunTrigger();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_RUN_TRIGGER__BRANCHES = eINSTANCE.getWorkflowRunTrigger_Branches();

		/**
		 * The meta object literal for the '<em><b>Ignore Specified Branches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_RUN_TRIGGER__IGNORE_SPECIFIED_BRANCHES = eINSTANCE
				.getWorkflowRunTrigger_IgnoreSpecifiedBranches();

		/**
		 * The meta object literal for the '{@link GHA.Triggers.impl.PullRequestTriggerImpl <em>Pull Request Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Triggers.impl.PullRequestTriggerImpl
		 * @see GHA.Triggers.impl.TriggersPackageImpl#getPullRequestTrigger()
		 * @generated
		 */
		EClass PULL_REQUEST_TRIGGER = eINSTANCE.getPullRequestTrigger();

		/**
		 * The meta object literal for the '<em><b>Event Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULL_REQUEST_TRIGGER__EVENT_TYPES = eINSTANCE.getPullRequestTrigger_EventTypes();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PULL_REQUEST_TRIGGER__BRANCHES = eINSTANCE.getPullRequestTrigger_Branches();

		/**
		 * The meta object literal for the '<em><b>Ignore Specified Branches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_BRANCHES = eINSTANCE
				.getPullRequestTrigger_IgnoreSpecifiedBranches();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PULL_REQUEST_TRIGGER__PATHS = eINSTANCE.getPullRequestTrigger_Paths();

		/**
		 * The meta object literal for the '<em><b>Ignore Specified Paths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_PATHS = eINSTANCE
				.getPullRequestTrigger_IgnoreSpecifiedPaths();

		/**
		 * The meta object literal for the '{@link GHA.Triggers.impl.PushTriggerImpl <em>Push Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Triggers.impl.PushTriggerImpl
		 * @see GHA.Triggers.impl.TriggersPackageImpl#getPushTrigger()
		 * @generated
		 */
		EClass PUSH_TRIGGER = eINSTANCE.getPushTrigger();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_TRIGGER__BRANCHES = eINSTANCE.getPushTrigger_Branches();

		/**
		 * The meta object literal for the '<em><b>Ignore Specified Branches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_TRIGGER__IGNORE_SPECIFIED_BRANCHES = eINSTANCE.getPushTrigger_IgnoreSpecifiedBranches();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_TRIGGER__PATHS = eINSTANCE.getPushTrigger_Paths();

		/**
		 * The meta object literal for the '<em><b>Ignore Specified Paths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_TRIGGER__IGNORE_SPECIFIED_PATHS = eINSTANCE.getPushTrigger_IgnoreSpecifiedPaths();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_TRIGGER__TAGS = eINSTANCE.getPushTrigger_Tags();

		/**
		 * The meta object literal for the '<em><b>Ignore Specified Tags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_TRIGGER__IGNORE_SPECIFIED_TAGS = eINSTANCE.getPushTrigger_IgnoreSpecifiedTags();

		/**
		 * The meta object literal for the '{@link GHA.Triggers.impl.ScheduleTriggerImpl <em>Schedule Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Triggers.impl.ScheduleTriggerImpl
		 * @see GHA.Triggers.impl.TriggersPackageImpl#getScheduleTrigger()
		 * @generated
		 */
		EClass SCHEDULE_TRIGGER = eINSTANCE.getScheduleTrigger();

		/**
		 * The meta object literal for the '<em><b>Crons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_TRIGGER__CRONS = eINSTANCE.getScheduleTrigger_Crons();

		/**
		 * The meta object literal for the '{@link GHA.Triggers.impl.WorkflowCallTriggerImpl <em>Workflow Call Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Triggers.impl.WorkflowCallTriggerImpl
		 * @see GHA.Triggers.impl.TriggersPackageImpl#getWorkflowCallTrigger()
		 * @generated
		 */
		EClass WORKFLOW_CALL_TRIGGER = eINSTANCE.getWorkflowCallTrigger();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_CALL_TRIGGER__INPUTS = eINSTANCE.getWorkflowCallTrigger_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_CALL_TRIGGER__OUTPUTS = eINSTANCE.getWorkflowCallTrigger_Outputs();

		/**
		 * The meta object literal for the '<em><b>Secrets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_CALL_TRIGGER__SECRETS = eINSTANCE.getWorkflowCallTrigger_Secrets();

		/**
		 * The meta object literal for the '{@link GHA.Triggers.impl.WorkflowDispatchTriggerImpl <em>Workflow Dispatch Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Triggers.impl.WorkflowDispatchTriggerImpl
		 * @see GHA.Triggers.impl.TriggersPackageImpl#getWorkflowDispatchTrigger()
		 * @generated
		 */
		EClass WORKFLOW_DISPATCH_TRIGGER = eINSTANCE.getWorkflowDispatchTrigger();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_DISPATCH_TRIGGER__INPUTS = eINSTANCE.getWorkflowDispatchTrigger_Inputs();

		/**
		 * The meta object literal for the '{@link GHA.Triggers.EVENTS <em>EVENTS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Triggers.EVENTS
		 * @see GHA.Triggers.impl.TriggersPackageImpl#getEVENTS()
		 * @generated
		 */
		EEnum EVENTS = eINSTANCE.getEVENTS();

		/**
		 * The meta object literal for the '{@link GHA.Triggers.WEBHOOK_ACTIVITY_TYPES <em>WEBHOOK ACTIVITY TYPES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Triggers.WEBHOOK_ACTIVITY_TYPES
		 * @see GHA.Triggers.impl.TriggersPackageImpl#getWEBHOOK_ACTIVITY_TYPES()
		 * @generated
		 */
		EEnum WEBHOOK_ACTIVITY_TYPES = eINSTANCE.getWEBHOOK_ACTIVITY_TYPES();

	}

} //TriggersPackage
