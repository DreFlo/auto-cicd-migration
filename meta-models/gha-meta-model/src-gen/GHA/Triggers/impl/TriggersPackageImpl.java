/**
 */
package GHA.Triggers.impl;

import GHA.Expressions.BinaryOperators.BinaryOperatorsPackage;

import GHA.Expressions.BinaryOperators.ComparisonOperators.ComparisonOperatorsPackage;

import GHA.Expressions.BinaryOperators.ComparisonOperators.impl.ComparisonOperatorsPackageImpl;

import GHA.Expressions.BinaryOperators.EqualityOperators.EqualityOperatorsPackage;

import GHA.Expressions.BinaryOperators.EqualityOperators.impl.EqualityOperatorsPackageImpl;

import GHA.Expressions.BinaryOperators.LogicalOperators.LogicalOperatorsPackage;

import GHA.Expressions.BinaryOperators.LogicalOperators.impl.LogicalOperatorsPackageImpl;

import GHA.Expressions.BinaryOperators.impl.BinaryOperatorsPackageImpl;

import GHA.Expressions.BuiltInFunctions.BuiltInFunctionsPackage;

import GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheckFunctionsPackage;

import GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckFunctionsPackageImpl;

import GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl;

import GHA.Expressions.ExpressionsPackage;

import GHA.Expressions.UnaryOperators.UnaryOperatorsPackage;

import GHA.Expressions.UnaryOperators.impl.UnaryOperatorsPackageImpl;

import GHA.Expressions.Values.Literals.LiteralsPackage;

import GHA.Expressions.Values.Literals.impl.LiteralsPackageImpl;

import GHA.Expressions.Values.ValuesPackage;

import GHA.Expressions.Values.Variables.VariablesPackage;

import GHA.Expressions.Values.Variables.impl.VariablesPackageImpl;

import GHA.Expressions.Values.impl.ValuesPackageImpl;

import GHA.Expressions.impl.ExpressionsPackageImpl;

import GHA.GHAPackage;

import GHA.Jobs.JobsPackage;

import GHA.Jobs.Matrices.MatricesPackage;

import GHA.Jobs.Matrices.impl.MatricesPackageImpl;

import GHA.Jobs.Steps.StepsPackage;

import GHA.Jobs.Steps.impl.StepsPackageImpl;

import GHA.Jobs.impl.JobsPackageImpl;

import GHA.Options.OptionsPackage;

import GHA.Options.impl.OptionsPackageImpl;

import GHA.Triggers.Parameters.ParametersPackage;

import GHA.Triggers.Parameters.impl.ParametersPackageImpl;

import GHA.Triggers.PullRequestTrigger;
import GHA.Triggers.PushTrigger;
import GHA.Triggers.ScheduleTrigger;
import GHA.Triggers.StandardEventTrigger;
import GHA.Triggers.Trigger;
import GHA.Triggers.TriggersFactory;
import GHA.Triggers.TriggersPackage;
import GHA.Triggers.WorkflowCallTrigger;
import GHA.Triggers.WorkflowDispatchTrigger;
import GHA.Triggers.WorkflowRunTrigger;

import GHA.impl.GHAPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TriggersPackageImpl extends EPackageImpl implements TriggersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardEventTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowRunTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pullRequestTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowCallTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowDispatchTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum webhooK_ACTIVITY_TYPESEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see GHA.Triggers.TriggersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TriggersPackageImpl() {
		super(eNS_URI, TriggersFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TriggersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TriggersPackage init() {
		if (isInited)
			return (TriggersPackage) EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTriggersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TriggersPackageImpl theTriggersPackage = registeredTriggersPackage instanceof TriggersPackageImpl
				? (TriggersPackageImpl) registeredTriggersPackage
				: new TriggersPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GHAPackage.eNS_URI);
		GHAPackageImpl theGHAPackage = (GHAPackageImpl) (registeredPackage instanceof GHAPackageImpl ? registeredPackage
				: GHAPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JobsPackage.eNS_URI);
		JobsPackageImpl theJobsPackage = (JobsPackageImpl) (registeredPackage instanceof JobsPackageImpl
				? registeredPackage
				: JobsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MatricesPackage.eNS_URI);
		MatricesPackageImpl theMatricesPackage = (MatricesPackageImpl) (registeredPackage instanceof MatricesPackageImpl
				? registeredPackage
				: MatricesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl) (registeredPackage instanceof StepsPackageImpl
				? registeredPackage
				: StepsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl) (registeredPackage instanceof ParametersPackageImpl
				? registeredPackage
				: ParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI);
		OptionsPackageImpl theOptionsPackage = (OptionsPackageImpl) (registeredPackage instanceof OptionsPackageImpl
				? registeredPackage
				: OptionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (registeredPackage instanceof ExpressionsPackageImpl
				? registeredPackage
				: ExpressionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BinaryOperatorsPackage.eNS_URI);
		BinaryOperatorsPackageImpl theBinaryOperatorsPackage = (BinaryOperatorsPackageImpl) (registeredPackage instanceof BinaryOperatorsPackageImpl
				? registeredPackage
				: BinaryOperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EqualityOperatorsPackage.eNS_URI);
		EqualityOperatorsPackageImpl theEqualityOperatorsPackage = (EqualityOperatorsPackageImpl) (registeredPackage instanceof EqualityOperatorsPackageImpl
				? registeredPackage
				: EqualityOperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComparisonOperatorsPackage.eNS_URI);
		ComparisonOperatorsPackageImpl theComparisonOperatorsPackage = (ComparisonOperatorsPackageImpl) (registeredPackage instanceof ComparisonOperatorsPackageImpl
				? registeredPackage
				: ComparisonOperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogicalOperatorsPackage.eNS_URI);
		LogicalOperatorsPackageImpl theLogicalOperatorsPackage = (LogicalOperatorsPackageImpl) (registeredPackage instanceof LogicalOperatorsPackageImpl
				? registeredPackage
				: LogicalOperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UnaryOperatorsPackage.eNS_URI);
		UnaryOperatorsPackageImpl theUnaryOperatorsPackage = (UnaryOperatorsPackageImpl) (registeredPackage instanceof UnaryOperatorsPackageImpl
				? registeredPackage
				: UnaryOperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BuiltInFunctionsPackage.eNS_URI);
		BuiltInFunctionsPackageImpl theBuiltInFunctionsPackage = (BuiltInFunctionsPackageImpl) (registeredPackage instanceof BuiltInFunctionsPackageImpl
				? registeredPackage
				: BuiltInFunctionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StatusCheckFunctionsPackage.eNS_URI);
		StatusCheckFunctionsPackageImpl theStatusCheckFunctionsPackage = (StatusCheckFunctionsPackageImpl) (registeredPackage instanceof StatusCheckFunctionsPackageImpl
				? registeredPackage
				: StatusCheckFunctionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl) (registeredPackage instanceof ValuesPackageImpl
				? registeredPackage
				: ValuesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl) (registeredPackage instanceof LiteralsPackageImpl
				? registeredPackage
				: LiteralsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl) (registeredPackage instanceof VariablesPackageImpl
				? registeredPackage
				: VariablesPackage.eINSTANCE);

		// Create package meta-data objects
		theTriggersPackage.createPackageContents();
		theGHAPackage.createPackageContents();
		theJobsPackage.createPackageContents();
		theMatricesPackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theOptionsPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theBinaryOperatorsPackage.createPackageContents();
		theEqualityOperatorsPackage.createPackageContents();
		theComparisonOperatorsPackage.createPackageContents();
		theLogicalOperatorsPackage.createPackageContents();
		theUnaryOperatorsPackage.createPackageContents();
		theBuiltInFunctionsPackage.createPackageContents();
		theStatusCheckFunctionsPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();

		// Initialize created meta-data
		theTriggersPackage.initializePackageContents();
		theGHAPackage.initializePackageContents();
		theJobsPackage.initializePackageContents();
		theMatricesPackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theOptionsPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theBinaryOperatorsPackage.initializePackageContents();
		theEqualityOperatorsPackage.initializePackageContents();
		theComparisonOperatorsPackage.initializePackageContents();
		theLogicalOperatorsPackage.initializePackageContents();
		theUnaryOperatorsPackage.initializePackageContents();
		theBuiltInFunctionsPackage.initializePackageContents();
		theStatusCheckFunctionsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTriggersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TriggersPackage.eNS_URI, theTriggersPackage);
		return theTriggersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandardEventTrigger() {
		return standardEventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardEventTrigger_Event() {
		return (EAttribute) standardEventTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardEventTrigger_EventTypes() {
		return (EAttribute) standardEventTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflowRunTrigger() {
		return workflowRunTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowRunTrigger_Branches() {
		return (EReference) workflowRunTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowRunTrigger_IgnoreSpecifiedBranches() {
		return (EAttribute) workflowRunTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPullRequestTrigger() {
		return pullRequestTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPullRequestTrigger_EventTypes() {
		return (EAttribute) pullRequestTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPullRequestTrigger_Branches() {
		return (EReference) pullRequestTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPullRequestTrigger_IgnoreSpecifiedBranches() {
		return (EAttribute) pullRequestTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPullRequestTrigger_Paths() {
		return (EReference) pullRequestTriggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPullRequestTrigger_IgnoreSpecifiedPaths() {
		return (EAttribute) pullRequestTriggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPushTrigger() {
		return pushTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPushTrigger_Branches() {
		return (EReference) pushTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPushTrigger_IgnoreSpecifiedBranches() {
		return (EAttribute) pushTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPushTrigger_Paths() {
		return (EReference) pushTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPushTrigger_IgnoreSpecifiedPaths() {
		return (EAttribute) pushTriggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPushTrigger_Tags() {
		return (EReference) pushTriggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPushTrigger_IgnoreSpecifiedTags() {
		return (EAttribute) pushTriggerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScheduleTrigger() {
		return scheduleTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScheduleTrigger_Crons() {
		return (EReference) scheduleTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflowCallTrigger() {
		return workflowCallTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowCallTrigger_Inputs() {
		return (EReference) workflowCallTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowCallTrigger_Outputs() {
		return (EReference) workflowCallTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowCallTrigger_Secrets() {
		return (EReference) workflowCallTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflowDispatchTrigger() {
		return workflowDispatchTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowDispatchTrigger_Inputs() {
		return (EReference) workflowDispatchTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEVENTS() {
		return eventsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWEBHOOK_ACTIVITY_TYPES() {
		return webhooK_ACTIVITY_TYPESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggersFactory getTriggersFactory() {
		return (TriggersFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		triggerEClass = createEClass(TRIGGER);

		standardEventTriggerEClass = createEClass(STANDARD_EVENT_TRIGGER);
		createEAttribute(standardEventTriggerEClass, STANDARD_EVENT_TRIGGER__EVENT);
		createEAttribute(standardEventTriggerEClass, STANDARD_EVENT_TRIGGER__EVENT_TYPES);

		workflowRunTriggerEClass = createEClass(WORKFLOW_RUN_TRIGGER);
		createEReference(workflowRunTriggerEClass, WORKFLOW_RUN_TRIGGER__BRANCHES);
		createEAttribute(workflowRunTriggerEClass, WORKFLOW_RUN_TRIGGER__IGNORE_SPECIFIED_BRANCHES);

		pullRequestTriggerEClass = createEClass(PULL_REQUEST_TRIGGER);
		createEAttribute(pullRequestTriggerEClass, PULL_REQUEST_TRIGGER__EVENT_TYPES);
		createEReference(pullRequestTriggerEClass, PULL_REQUEST_TRIGGER__BRANCHES);
		createEAttribute(pullRequestTriggerEClass, PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_BRANCHES);
		createEReference(pullRequestTriggerEClass, PULL_REQUEST_TRIGGER__PATHS);
		createEAttribute(pullRequestTriggerEClass, PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_PATHS);

		pushTriggerEClass = createEClass(PUSH_TRIGGER);
		createEReference(pushTriggerEClass, PUSH_TRIGGER__BRANCHES);
		createEAttribute(pushTriggerEClass, PUSH_TRIGGER__IGNORE_SPECIFIED_BRANCHES);
		createEReference(pushTriggerEClass, PUSH_TRIGGER__PATHS);
		createEAttribute(pushTriggerEClass, PUSH_TRIGGER__IGNORE_SPECIFIED_PATHS);
		createEReference(pushTriggerEClass, PUSH_TRIGGER__TAGS);
		createEAttribute(pushTriggerEClass, PUSH_TRIGGER__IGNORE_SPECIFIED_TAGS);

		scheduleTriggerEClass = createEClass(SCHEDULE_TRIGGER);
		createEReference(scheduleTriggerEClass, SCHEDULE_TRIGGER__CRONS);

		workflowCallTriggerEClass = createEClass(WORKFLOW_CALL_TRIGGER);
		createEReference(workflowCallTriggerEClass, WORKFLOW_CALL_TRIGGER__INPUTS);
		createEReference(workflowCallTriggerEClass, WORKFLOW_CALL_TRIGGER__OUTPUTS);
		createEReference(workflowCallTriggerEClass, WORKFLOW_CALL_TRIGGER__SECRETS);

		workflowDispatchTriggerEClass = createEClass(WORKFLOW_DISPATCH_TRIGGER);
		createEReference(workflowDispatchTriggerEClass, WORKFLOW_DISPATCH_TRIGGER__INPUTS);

		// Create enums
		eventsEEnum = createEEnum(EVENTS);
		webhooK_ACTIVITY_TYPESEEnum = createEEnum(WEBHOOK_ACTIVITY_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ParametersPackage theParametersPackage = (ParametersPackage) EPackage.Registry.INSTANCE
				.getEPackage(ParametersPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theParametersPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		standardEventTriggerEClass.getESuperTypes().add(this.getTrigger());
		workflowRunTriggerEClass.getESuperTypes().add(this.getTrigger());
		pullRequestTriggerEClass.getESuperTypes().add(this.getTrigger());
		pushTriggerEClass.getESuperTypes().add(this.getTrigger());
		scheduleTriggerEClass.getESuperTypes().add(this.getTrigger());
		workflowCallTriggerEClass.getESuperTypes().add(this.getTrigger());
		workflowDispatchTriggerEClass.getESuperTypes().add(this.getTrigger());

		// Initialize classes, features, and operations; add parameters
		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(standardEventTriggerEClass, StandardEventTrigger.class, "StandardEventTrigger", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardEventTrigger_Event(), this.getEVENTS(), "event", null, 1, 1,
				StandardEventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardEventTrigger_EventTypes(), this.getWEBHOOK_ACTIVITY_TYPES(), "eventTypes", null, 0,
				-1, StandardEventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowRunTriggerEClass, WorkflowRunTrigger.class, "WorkflowRunTrigger", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowRunTrigger_Branches(), theExpressionsPackage.getExpression(), null, "branches", null,
				0, -1, WorkflowRunTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowRunTrigger_IgnoreSpecifiedBranches(), ecorePackage.getEBoolean(),
				"ignoreSpecifiedBranches", "false", 1, 1, WorkflowRunTrigger.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pullRequestTriggerEClass, PullRequestTrigger.class, "PullRequestTrigger", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPullRequestTrigger_EventTypes(), this.getWEBHOOK_ACTIVITY_TYPES(), "eventTypes", null, 0, 3,
				PullRequestTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPullRequestTrigger_Branches(), theExpressionsPackage.getExpression(), null, "branches", null,
				0, -1, PullRequestTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPullRequestTrigger_IgnoreSpecifiedBranches(), ecorePackage.getEBoolean(),
				"ignoreSpecifiedBranches", "false", 1, 1, PullRequestTrigger.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPullRequestTrigger_Paths(), theExpressionsPackage.getExpression(), null, "paths", null, 0, -1,
				PullRequestTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPullRequestTrigger_IgnoreSpecifiedPaths(), ecorePackage.getEBoolean(), "ignoreSpecifiedPaths",
				"false", 1, 1, PullRequestTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pushTriggerEClass, PushTrigger.class, "PushTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPushTrigger_Branches(), theExpressionsPackage.getExpression(), null, "branches", null, 0, -1,
				PushTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPushTrigger_IgnoreSpecifiedBranches(), ecorePackage.getEBoolean(), "ignoreSpecifiedBranches",
				"false", 1, 1, PushTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPushTrigger_Paths(), theExpressionsPackage.getExpression(), null, "paths", null, 0, -1,
				PushTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPushTrigger_IgnoreSpecifiedPaths(), ecorePackage.getEBoolean(), "ignoreSpecifiedPaths",
				"false", 1, 1, PushTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPushTrigger_Tags(), theExpressionsPackage.getExpression(), null, "tags", null, 0, -1,
				PushTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPushTrigger_IgnoreSpecifiedTags(), ecorePackage.getEBoolean(), "ignoreSpecifiedTags", "false",
				1, 1, PushTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(scheduleTriggerEClass, ScheduleTrigger.class, "ScheduleTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScheduleTrigger_Crons(), theExpressionsPackage.getExpression(), null, "crons", null, 1, -1,
				ScheduleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowCallTriggerEClass, WorkflowCallTrigger.class, "WorkflowCallTrigger", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowCallTrigger_Inputs(), theParametersPackage.getInput(), null, "inputs", null, 0, -1,
				WorkflowCallTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowCallTrigger_Outputs(), theParametersPackage.getOutput(), null, "outputs", null, 0, -1,
				WorkflowCallTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowCallTrigger_Secrets(), theParametersPackage.getSecret(), null, "secrets", null, 0, -1,
				WorkflowCallTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowDispatchTriggerEClass, WorkflowDispatchTrigger.class, "WorkflowDispatchTrigger",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowDispatchTrigger_Inputs(), theParametersPackage.getInput(), null, "inputs", null, 0,
				-1, WorkflowDispatchTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eventsEEnum, GHA.Triggers.EVENTS.class, "EVENTS");
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.BRANCH_PROTECTION_RULE);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.CHECK_RUN);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.CHECK_SUITE);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.CREATE);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.DELETE);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.DEPLOYMENT);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.DEPLOYMENT_STATUS);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.DISCUSSION);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.DISCUSSION_COMMENT);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.FORK);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.GOLLUM);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.ISSUE_COMMENT);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.ISSUES);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.LABEL);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.MERGE_GROUP);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.MILESTONE);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.PAGE_BUILD);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.PROJECT);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.PROJECT_CARD);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.PROJECT_COLUMN);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.PUBLIC);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.PULL_REQUEST_REVIEW);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.PULL_REQUEST_REVIEW_COMMENT);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.REGISTRY_PACKAGE);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.RELEASE);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.REPOSITORY_DISPATCH);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.STATUS);
		addEEnumLiteral(eventsEEnum, GHA.Triggers.EVENTS.WATCH);

		initEEnum(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.class, "WEBHOOK_ACTIVITY_TYPES");
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.ASSIGNED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.AUTO_MERGE_DISABLED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.AUTO_MERGE_ENABLED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.CLOSED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.CONVERTED_TO_DRAFT);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.EDITED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.LABELED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.LOCKED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.OPENED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.READY_FOR_REVIEW);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.REOPENED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.REVIEW_REQUEST_REMOVED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.REVIEW_REQUESTED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.SYNCHRONIZE);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.UNASSIGNED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.UNLABELED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.UNLOCKED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.CREATED);
		addEEnumLiteral(webhooK_ACTIVITY_TYPESEEnum, GHA.Triggers.WEBHOOK_ACTIVITY_TYPES.DELETED);
	}

} //TriggersPackageImpl
