/**
 */
package GHA.Jobs.impl;

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

import GHA.Jobs.Agent;
import GHA.Jobs.Job;
import GHA.Jobs.JobsFactory;
import GHA.Jobs.JobsPackage;

import GHA.Jobs.Matrices.MatricesPackage;

import GHA.Jobs.Matrices.impl.MatricesPackageImpl;

import GHA.Jobs.ReuseWorkflowJob;
import GHA.Jobs.ScriptJob;
import GHA.Jobs.StagingEnvironment;

import GHA.Jobs.Steps.StepsPackage;

import GHA.Jobs.Steps.impl.StepsPackageImpl;

import GHA.Options.OptionsPackage;

import GHA.Options.impl.OptionsPackageImpl;

import GHA.Triggers.Parameters.ParametersPackage;

import GHA.Triggers.Parameters.impl.ParametersPackageImpl;

import GHA.Triggers.TriggersPackage;

import GHA.Triggers.impl.TriggersPackageImpl;

import GHA.impl.GHAPackageImpl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JobsPackageImpl extends EPackageImpl implements JobsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reuseWorkflowJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stagingEnvironmentEClass = null;

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
	 * @see GHA.Jobs.JobsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JobsPackageImpl() {
		super(eNS_URI, JobsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JobsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JobsPackage init() {
		if (isInited)
			return (JobsPackage) EPackage.Registry.INSTANCE.getEPackage(JobsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJobsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JobsPackageImpl theJobsPackage = registeredJobsPackage instanceof JobsPackageImpl
				? (JobsPackageImpl) registeredJobsPackage
				: new JobsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GHAPackage.eNS_URI);
		GHAPackageImpl theGHAPackage = (GHAPackageImpl) (registeredPackage instanceof GHAPackageImpl ? registeredPackage
				: GHAPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MatricesPackage.eNS_URI);
		MatricesPackageImpl theMatricesPackage = (MatricesPackageImpl) (registeredPackage instanceof MatricesPackageImpl
				? registeredPackage
				: MatricesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl) (registeredPackage instanceof StepsPackageImpl
				? registeredPackage
				: StepsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
		TriggersPackageImpl theTriggersPackage = (TriggersPackageImpl) (registeredPackage instanceof TriggersPackageImpl
				? registeredPackage
				: TriggersPackage.eINSTANCE);
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
		theJobsPackage.createPackageContents();
		theGHAPackage.createPackageContents();
		theMatricesPackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theTriggersPackage.createPackageContents();
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
		theJobsPackage.initializePackageContents();
		theGHAPackage.initializePackageContents();
		theMatricesPackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();
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
		theJobsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JobsPackage.eNS_URI, theJobsPackage);
		return theJobsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJob() {
		return jobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_Name() {
		return (EAttribute) jobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_JobName() {
		return (EReference) jobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Permissions() {
		return (EReference) jobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_DependsOn() {
		return (EReference) jobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_If() {
		return (EReference) jobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Agent() {
		return (EReference) jobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Container() {
		return (EReference) jobEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_StagingEnvironment() {
		return (EReference) jobEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Defaults() {
		return (EReference) jobEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_EnvironmentVariables() {
		return (EReference) jobEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Services() {
		return (EReference) jobEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_ConcurrencyGroup() {
		return (EReference) jobEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_TimeoutMinutes() {
		return (EReference) jobEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_ContinueOnError() {
		return (EReference) jobEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Strategy() {
		return (EReference) jobEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReuseWorkflowJob() {
		return reuseWorkflowJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReuseWorkflowJob_WorkflowPath() {
		return (EReference) reuseWorkflowJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReuseWorkflowJob_Args() {
		return (EReference) reuseWorkflowJobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReuseWorkflowJob_Secrets() {
		return (EReference) reuseWorkflowJobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReuseWorkflowJob_InheritSecrets() {
		return (EAttribute) reuseWorkflowJobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScriptJob() {
		return scriptJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScriptJob_Steps() {
		return (EReference) scriptJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgent_Group() {
		return (EReference) agentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgent_Labels() {
		return (EReference) agentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Image() {
		return (EReference) containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Username() {
		return (EReference) containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Password() {
		return (EReference) containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_EnvironmentVariables() {
		return (EReference) containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Ports() {
		return (EReference) containerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Volumes() {
		return (EReference) containerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Options() {
		return (EReference) containerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Key() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Value() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStagingEnvironment() {
		return stagingEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStagingEnvironment_Name() {
		return (EReference) stagingEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStagingEnvironment_Url() {
		return (EReference) stagingEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobsFactory getJobsFactory() {
		return (JobsFactory) getEFactoryInstance();
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
		jobEClass = createEClass(JOB);
		createEAttribute(jobEClass, JOB__NAME);
		createEReference(jobEClass, JOB__JOB_NAME);
		createEReference(jobEClass, JOB__PERMISSIONS);
		createEReference(jobEClass, JOB__DEPENDS_ON);
		createEReference(jobEClass, JOB__IF);
		createEReference(jobEClass, JOB__AGENT);
		createEReference(jobEClass, JOB__CONTAINER);
		createEReference(jobEClass, JOB__STAGING_ENVIRONMENT);
		createEReference(jobEClass, JOB__DEFAULTS);
		createEReference(jobEClass, JOB__ENVIRONMENT_VARIABLES);
		createEReference(jobEClass, JOB__SERVICES);
		createEReference(jobEClass, JOB__CONCURRENCY_GROUP);
		createEReference(jobEClass, JOB__TIMEOUT_MINUTES);
		createEReference(jobEClass, JOB__CONTINUE_ON_ERROR);
		createEReference(jobEClass, JOB__STRATEGY);

		reuseWorkflowJobEClass = createEClass(REUSE_WORKFLOW_JOB);
		createEReference(reuseWorkflowJobEClass, REUSE_WORKFLOW_JOB__WORKFLOW_PATH);
		createEReference(reuseWorkflowJobEClass, REUSE_WORKFLOW_JOB__ARGS);
		createEReference(reuseWorkflowJobEClass, REUSE_WORKFLOW_JOB__SECRETS);
		createEAttribute(reuseWorkflowJobEClass, REUSE_WORKFLOW_JOB__INHERIT_SECRETS);

		scriptJobEClass = createEClass(SCRIPT_JOB);
		createEReference(scriptJobEClass, SCRIPT_JOB__STEPS);

		agentEClass = createEClass(AGENT);
		createEReference(agentEClass, AGENT__GROUP);
		createEReference(agentEClass, AGENT__LABELS);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__IMAGE);
		createEReference(containerEClass, CONTAINER__USERNAME);
		createEReference(containerEClass, CONTAINER__PASSWORD);
		createEReference(containerEClass, CONTAINER__ENVIRONMENT_VARIABLES);
		createEReference(containerEClass, CONTAINER__PORTS);
		createEReference(containerEClass, CONTAINER__VOLUMES);
		createEReference(containerEClass, CONTAINER__OPTIONS);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__KEY);
		createEReference(serviceEClass, SERVICE__VALUE);

		stagingEnvironmentEClass = createEClass(STAGING_ENVIRONMENT);
		createEReference(stagingEnvironmentEClass, STAGING_ENVIRONMENT__NAME);
		createEReference(stagingEnvironmentEClass, STAGING_ENVIRONMENT__URL);
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
		MatricesPackage theMatricesPackage = (MatricesPackage) EPackage.Registry.INSTANCE
				.getEPackage(MatricesPackage.eNS_URI);
		StepsPackage theStepsPackage = (StepsPackage) EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI);
		OptionsPackage theOptionsPackage = (OptionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(OptionsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theMatricesPackage);
		getESubpackages().add(theStepsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reuseWorkflowJobEClass.getESuperTypes().add(this.getJob());
		scriptJobEClass.getESuperTypes().add(this.getJob());

		// Initialize classes, features, and operations; add parameters
		initEClass(jobEClass, Job.class, "Job", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJob_Name(), ecorePackage.getEString(), "name", null, 1, 1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_JobName(), theExpressionsPackage.getExpression(), null, "jobName", null, 0, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Permissions(), theOptionsPackage.getPermission(), null, "permissions", null, 0, -1,
				Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_DependsOn(), this.getJob(), null, "dependsOn", null, 0, -1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJob_If(), theExpressionsPackage.getExpression(), null, "if", null, 0, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Agent(), this.getAgent(), null, "agent", null, 1, 1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJob_Container(), this.getContainer(), null, "container", null, 0, 1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJob_StagingEnvironment(), this.getStagingEnvironment(), null, "stagingEnvironment", null, 0,
				1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Defaults(), theOptionsPackage.getDefaults(), null, "defaults", null, 0, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_EnvironmentVariables(), theExpressionsPackage.getVariableAssignment(), null,
				"environmentVariables", null, 0, -1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Services(), this.getService(), null, "services", null, 0, -1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJob_ConcurrencyGroup(), theOptionsPackage.getConcurrencyGroup(), null, "concurrencyGroup",
				null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_TimeoutMinutes(), theExpressionsPackage.getExpression(), null, "timeoutMinutes", null, 0,
				1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_ContinueOnError(), theExpressionsPackage.getExpression(), null, "continueOnError", null,
				0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Strategy(), theMatricesPackage.getMatrix(), null, "strategy", null, 0, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reuseWorkflowJobEClass, ReuseWorkflowJob.class, "ReuseWorkflowJob", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReuseWorkflowJob_WorkflowPath(), theExpressionsPackage.getExpression(), null, "workflowPath",
				null, 1, 1, ReuseWorkflowJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReuseWorkflowJob_Args(), theExpressionsPackage.getVariableAssignment(), null, "args", null, 0,
				-1, ReuseWorkflowJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReuseWorkflowJob_Secrets(), theExpressionsPackage.getVariableAssignment(), null, "secrets",
				null, 0, -1, ReuseWorkflowJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReuseWorkflowJob_InheritSecrets(), ecorePackage.getEBooleanObject(), "inheritSecrets", null,
				0, 1, ReuseWorkflowJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptJobEClass, ScriptJob.class, "ScriptJob", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScriptJob_Steps(), theStepsPackage.getStep(), null, "steps", null, 1, -1, ScriptJob.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgent_Group(), theExpressionsPackage.getExpression(), null, "group", null, 0, 1, Agent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_Labels(), theExpressionsPackage.getExpression(), null, "labels", null, 0, -1,
				Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, GHA.Jobs.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Image(), theExpressionsPackage.getExpression(), null, "image", null, 1, 1,
				GHA.Jobs.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Username(), theExpressionsPackage.getExpression(), null, "username", null, 0, 1,
				GHA.Jobs.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Password(), theExpressionsPackage.getExpression(), null, "password", null, 0, 1,
				GHA.Jobs.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_EnvironmentVariables(), theExpressionsPackage.getVariableAssignment(), null,
				"environmentVariables", null, 0, -1, GHA.Jobs.Container.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Ports(), theExpressionsPackage.getExpression(), null, "ports", null, 0, -1,
				GHA.Jobs.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Volumes(), theExpressionsPackage.getExpression(), null, "volumes", null, 0, -1,
				GHA.Jobs.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Options(), theExpressionsPackage.getExpression(), null, "options", null, 0, 1,
				GHA.Jobs.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Map.Entry.class, "Service", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Value(), this.getContainer(), null, "value", null, 1, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stagingEnvironmentEClass, StagingEnvironment.class, "StagingEnvironment", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStagingEnvironment_Name(), theExpressionsPackage.getExpression(), null, "name", null, 1, 1,
				StagingEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStagingEnvironment_Url(), theExpressionsPackage.getExpression(), null, "url", null, 0, 1,
				StagingEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //JobsPackageImpl
