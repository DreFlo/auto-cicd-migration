/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AddSSHKeysStep;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.And;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AttachWorkspaceStep;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BooleanLiteral;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Callable;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CheckoutStep;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIFactory;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CommandReferenceStep;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Concat;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ConditionalStep;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DefinitionGroup;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerExecutor;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DotOperator;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DoubleLiteral;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Equals;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ExecutorReferenceExecutor;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.InfinitaryOperator;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.IntegerLiteral;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Literal;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Logic;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.LogicFunction;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOSExecutor;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MachineExecutor;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matches;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matrix;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixCombination;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixParameter;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Not;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.NullWorkflowJobConfiguration;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Or;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Orb;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbDefinition;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReference;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceExecutor;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceStep;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PersistToWorkspaceStep;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ReferenceExecutor;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RestoreCacheStep;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SaveCacheStep;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ScheduleTrigger;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Script;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SetupRemoteDockerStep;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StoreArtifactsStep;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StoreTestResultsStep;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StringLiteral;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Trigger;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.UnaryOperator;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.UnlessStep;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Value;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDeclaration;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableReference;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WhenStep;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WindowsOrbExecutor;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowApprovalJobConfiguration;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowDefinedJobConfiguration;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowOrbJobConfiguration;

import java.util.Map;

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
public class CircleCIPackageImpl extends EPackageImpl implements CircleCIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orbReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orbDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerExecutorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineExecutorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macOSExecutorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowsOrbExecutorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceExecutorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executorReferenceExecutorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orbReferenceExecutorEClass = null;

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
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unlessStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkoutStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setupRemoteDockerStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saveCacheStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restoreCacheStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeArtifactsStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeTestResultsStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistToWorkspaceStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachWorkspaceStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addSSHKeysStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orbReferenceStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandReferenceStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEClass = null;

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
	private EClass scheduleTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowJobConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullWorkflowJobConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowDefinedJobConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowApprovalJobConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowOrbJobConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrixParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrixCombinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infinitaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameteR_TYPESEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wheN_TYPEEEnum = null;

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
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CircleCIPackageImpl() {
		super(eNS_URI, CircleCIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CircleCIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CircleCIPackage init() {
		if (isInited)
			return (CircleCIPackage) EPackage.Registry.INSTANCE.getEPackage(CircleCIPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCircleCIPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CircleCIPackageImpl theCircleCIPackage = registeredCircleCIPackage instanceof CircleCIPackageImpl
				? (CircleCIPackageImpl) registeredCircleCIPackage
				: new CircleCIPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCircleCIPackage.createPackageContents();

		// Initialize created meta-data
		theCircleCIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCircleCIPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CircleCIPackage.eNS_URI, theCircleCIPackage);
		return theCircleCIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitionGroup() {
		return definitionGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionGroup_Orbs() {
		return (EReference) definitionGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionGroup_Commands() {
		return (EReference) definitionGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionGroup_Executors() {
		return (EReference) definitionGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionGroup_Jobs() {
		return (EReference) definitionGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScript_Steps() {
		return (EReference) scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallable() {
		return callableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallable_Parameters() {
		return (EReference) callableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvironment_EnvironmentVariables() {
		return (EReference) environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPipeline() {
		return pipelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPipeline_Version() {
		return (EAttribute) pipelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPipeline_Setup() {
		return (EAttribute) pipelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Workflows() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrb() {
		return orbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrb_Name() {
		return (EAttribute) orbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrbReference() {
		return orbReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrbReference_Reference() {
		return (EAttribute) orbReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrbDefinition() {
		return orbDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommand_Name() {
		return (EAttribute) commandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommand_Description() {
		return (EAttribute) commandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Name() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Type() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_EnumValues() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Default() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Description() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutor() {
		return executorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutor_Name() {
		return (EAttribute) executorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutor_ResourceClass() {
		return (EReference) executorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutor_Shell() {
		return (EReference) executorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutor_WorkingDirectory() {
		return (EReference) executorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDockerExecutor() {
		return dockerExecutorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerExecutor_Containers() {
		return (EReference) dockerExecutorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDockerContainer() {
		return dockerContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_Image() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_Name() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_Entrypoint() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_Command() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_User() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_Username() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_Password() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_Oidc() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_AwsAccessKeyID() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_AwsSecretAccessKey() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachineExecutor() {
		return machineExecutorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMachineExecutor_Image() {
		return (EReference) machineExecutorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMachineExecutor_DockerLayerCaching() {
		return (EReference) machineExecutorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMacOSExecutor() {
		return macOSExecutorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMacOSExecutor_Xcode() {
		return (EReference) macOSExecutorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWindowsOrbExecutor() {
		return windowsOrbExecutorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWindowsOrbExecutor_Executor() {
		return (EReference) windowsOrbExecutorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceExecutor() {
		return referenceExecutorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutorReferenceExecutor() {
		return executorReferenceExecutorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutorReferenceExecutor_Executor() {
		return (EReference) executorReferenceExecutorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrbReferenceExecutor() {
		return orbReferenceExecutorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrbReferenceExecutor_Orb() {
		return (EReference) orbReferenceExecutorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrbReferenceExecutor_OrbExecutorName() {
		return (EAttribute) orbReferenceExecutorEClass.getEStructuralFeatures().get(1);
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
	public EReference getJob_Executor() {
		return (EReference) jobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Parallelism() {
		return (EReference) jobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_CircleCIIPRanges() {
		return (EReference) jobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunStep() {
		return runStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunStep_Command() {
		return (EReference) runStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunStep_Name() {
		return (EReference) runStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunStep_Shell() {
		return (EReference) runStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunStep_Background() {
		return (EReference) runStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunStep_WorkingDirectory() {
		return (EReference) runStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunStep_NoOutputTimeout() {
		return (EReference) runStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRunStep_When() {
		return (EAttribute) runStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalStep() {
		return conditionalStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalStep_Condition() {
		return (EReference) conditionalStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhenStep() {
		return whenStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnlessStep() {
		return unlessStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckoutStep() {
		return checkoutStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckoutStep_Path() {
		return (EReference) checkoutStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetupRemoteDockerStep() {
		return setupRemoteDockerStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetupRemoteDockerStep_Version() {
		return (EReference) setupRemoteDockerStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetupRemoteDockerStep_DockerLayerCaching() {
		return (EReference) setupRemoteDockerStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSaveCacheStep() {
		return saveCacheStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSaveCacheStep_Paths() {
		return (EReference) saveCacheStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSaveCacheStep_Key() {
		return (EReference) saveCacheStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSaveCacheStep_Name() {
		return (EReference) saveCacheStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSaveCacheStep_When() {
		return (EAttribute) saveCacheStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestoreCacheStep() {
		return restoreCacheStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRestoreCacheStep_Keys() {
		return (EReference) restoreCacheStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRestoreCacheStep_Name() {
		return (EReference) restoreCacheStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStoreArtifactsStep() {
		return storeArtifactsStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStoreArtifactsStep_Path() {
		return (EReference) storeArtifactsStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStoreArtifactsStep_Destination() {
		return (EReference) storeArtifactsStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStoreTestResultsStep() {
		return storeTestResultsStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStoreTestResultsStep_Path() {
		return (EReference) storeTestResultsStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersistToWorkspaceStep() {
		return persistToWorkspaceStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersistToWorkspaceStep_Root() {
		return (EReference) persistToWorkspaceStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersistToWorkspaceStep_Paths() {
		return (EReference) persistToWorkspaceStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttachWorkspaceStep() {
		return attachWorkspaceStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachWorkspaceStep_At() {
		return (EReference) attachWorkspaceStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddSSHKeysStep() {
		return addSSHKeysStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddSSHKeysStep_Fingerprints() {
		return (EReference) addSSHKeysStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrbReferenceStep() {
		return orbReferenceStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrbReferenceStep_Orb() {
		return (EReference) orbReferenceStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrbReferenceStep_JobName() {
		return (EAttribute) orbReferenceStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrbReferenceStep_Arguments() {
		return (EReference) orbReferenceStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommandReferenceStep() {
		return commandReferenceStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommandReferenceStep_Command() {
		return (EReference) commandReferenceStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommandReferenceStep_Arguments() {
		return (EReference) commandReferenceStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableAssignment() {
		return variableAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableAssignment_Key() {
		return (EReference) variableAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableAssignment_Value() {
		return (EReference) variableAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclaration() {
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableDeclaration_Name() {
		return (EAttribute) variableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflow_Name() {
		return (EAttribute) workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_Triggers() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_Condition() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflow_IsWhen() {
		return (EAttribute) workflowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_Jobs() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(4);
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
	public EReference getTrigger_Branches() {
		return (EReference) triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrigger_IgnoreSpecifiedBranches() {
		return (EAttribute) triggerEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getScheduleTrigger_Cron() {
		return (EAttribute) scheduleTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflowJobConfiguration() {
		return workflowJobConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowJobConfiguration_Requires() {
		return (EReference) workflowJobConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowJobConfiguration_RequiredBy() {
		return (EReference) workflowJobConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowJobConfiguration_Name() {
		return (EAttribute) workflowJobConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowJobConfiguration_Contexts() {
		return (EReference) workflowJobConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowJobConfiguration_Branches() {
		return (EReference) workflowJobConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowJobConfiguration_IgnoreSpecifiedBranches() {
		return (EAttribute) workflowJobConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowJobConfiguration_Tags() {
		return (EReference) workflowJobConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowJobConfiguration_IgnoreSpecifiedTags() {
		return (EAttribute) workflowJobConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowJobConfiguration_Matrix() {
		return (EReference) workflowJobConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowJobConfiguration_PreSteps() {
		return (EReference) workflowJobConfigurationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowJobConfiguration_PostSteps() {
		return (EReference) workflowJobConfigurationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowJobConfiguration_Arguments() {
		return (EReference) workflowJobConfigurationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNullWorkflowJobConfiguration() {
		return nullWorkflowJobConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflowDefinedJobConfiguration() {
		return workflowDefinedJobConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowDefinedJobConfiguration_Job() {
		return (EReference) workflowDefinedJobConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflowApprovalJobConfiguration() {
		return workflowApprovalJobConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflowOrbJobConfiguration() {
		return workflowOrbJobConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowOrbJobConfiguration_Orb() {
		return (EReference) workflowOrbJobConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowOrbJobConfiguration_Executor() {
		return (EReference) workflowOrbJobConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowOrbJobConfiguration_JobName() {
		return (EAttribute) workflowOrbJobConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatrix() {
		return matrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_Parameters() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_Excludes() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_Alias() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatrixParameter() {
		return matrixParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrixParameter_Name() {
		return (EReference) matrixParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrixParameter_Cells() {
		return (EReference) matrixParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatrixCombination() {
		return matrixCombinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrixCombination_Entries() {
		return (EReference) matrixCombinationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcat() {
		return concatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcat_Expressions() {
		return (EReference) concatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogic() {
		return logicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfinitaryOperator() {
		return infinitaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfinitaryOperator_Operands() {
		return (EReference) infinitaryOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEquals() {
		return equalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryOperator() {
		return unaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryOperator_Operand() {
		return (EReference) unaryOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicFunction() {
		return logicFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatches() {
		return matchesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatches_Pattern() {
		return (EReference) matchesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatches_Value() {
		return (EReference) matchesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDotOperator() {
		return dotOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDotOperator_Lhs() {
		return (EReference) dotOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDotOperator_Rhs() {
		return (EReference) dotOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringLiteral() {
		return stringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringLiteral_Value() {
		return (EAttribute) stringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerLiteral() {
		return integerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerLiteral_Value() {
		return (EAttribute) integerLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoubleLiteral() {
		return doubleLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoubleLiteral_Value() {
		return (EAttribute) doubleLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanLiteral() {
		return booleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanLiteral_Value() {
		return (EAttribute) booleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableReference() {
		return variableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableReference_Reference() {
		return (EReference) variableReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPARAMETER_TYPES() {
		return parameteR_TYPESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWHEN_TYPE() {
		return wheN_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircleCIFactory getCircleCIFactory() {
		return (CircleCIFactory) getEFactoryInstance();
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
		definitionGroupEClass = createEClass(DEFINITION_GROUP);
		createEReference(definitionGroupEClass, DEFINITION_GROUP__ORBS);
		createEReference(definitionGroupEClass, DEFINITION_GROUP__COMMANDS);
		createEReference(definitionGroupEClass, DEFINITION_GROUP__EXECUTORS);
		createEReference(definitionGroupEClass, DEFINITION_GROUP__JOBS);

		scriptEClass = createEClass(SCRIPT);
		createEReference(scriptEClass, SCRIPT__STEPS);

		callableEClass = createEClass(CALLABLE);
		createEReference(callableEClass, CALLABLE__PARAMETERS);

		environmentEClass = createEClass(ENVIRONMENT);
		createEReference(environmentEClass, ENVIRONMENT__ENVIRONMENT_VARIABLES);

		pipelineEClass = createEClass(PIPELINE);
		createEAttribute(pipelineEClass, PIPELINE__VERSION);
		createEAttribute(pipelineEClass, PIPELINE__SETUP);
		createEReference(pipelineEClass, PIPELINE__WORKFLOWS);

		orbEClass = createEClass(ORB);
		createEAttribute(orbEClass, ORB__NAME);

		orbReferenceEClass = createEClass(ORB_REFERENCE);
		createEAttribute(orbReferenceEClass, ORB_REFERENCE__REFERENCE);

		orbDefinitionEClass = createEClass(ORB_DEFINITION);

		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__NAME);
		createEAttribute(commandEClass, COMMAND__DESCRIPTION);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__ENUM_VALUES);
		createEReference(parameterEClass, PARAMETER__DEFAULT);
		createEAttribute(parameterEClass, PARAMETER__DESCRIPTION);

		executorEClass = createEClass(EXECUTOR);
		createEAttribute(executorEClass, EXECUTOR__NAME);
		createEReference(executorEClass, EXECUTOR__RESOURCE_CLASS);
		createEReference(executorEClass, EXECUTOR__SHELL);
		createEReference(executorEClass, EXECUTOR__WORKING_DIRECTORY);

		dockerExecutorEClass = createEClass(DOCKER_EXECUTOR);
		createEReference(dockerExecutorEClass, DOCKER_EXECUTOR__CONTAINERS);

		dockerContainerEClass = createEClass(DOCKER_CONTAINER);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__IMAGE);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__NAME);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__ENTRYPOINT);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__COMMAND);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__USER);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__USERNAME);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__PASSWORD);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__OIDC);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__AWS_ACCESS_KEY_ID);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY);

		machineExecutorEClass = createEClass(MACHINE_EXECUTOR);
		createEReference(machineExecutorEClass, MACHINE_EXECUTOR__IMAGE);
		createEReference(machineExecutorEClass, MACHINE_EXECUTOR__DOCKER_LAYER_CACHING);

		macOSExecutorEClass = createEClass(MAC_OS_EXECUTOR);
		createEReference(macOSExecutorEClass, MAC_OS_EXECUTOR__XCODE);

		windowsOrbExecutorEClass = createEClass(WINDOWS_ORB_EXECUTOR);
		createEReference(windowsOrbExecutorEClass, WINDOWS_ORB_EXECUTOR__EXECUTOR);

		referenceExecutorEClass = createEClass(REFERENCE_EXECUTOR);

		executorReferenceExecutorEClass = createEClass(EXECUTOR_REFERENCE_EXECUTOR);
		createEReference(executorReferenceExecutorEClass, EXECUTOR_REFERENCE_EXECUTOR__EXECUTOR);

		orbReferenceExecutorEClass = createEClass(ORB_REFERENCE_EXECUTOR);
		createEReference(orbReferenceExecutorEClass, ORB_REFERENCE_EXECUTOR__ORB);
		createEAttribute(orbReferenceExecutorEClass, ORB_REFERENCE_EXECUTOR__ORB_EXECUTOR_NAME);

		jobEClass = createEClass(JOB);
		createEAttribute(jobEClass, JOB__NAME);
		createEReference(jobEClass, JOB__EXECUTOR);
		createEReference(jobEClass, JOB__PARALLELISM);
		createEReference(jobEClass, JOB__CIRCLE_CIIP_RANGES);

		stepEClass = createEClass(STEP);

		runStepEClass = createEClass(RUN_STEP);
		createEReference(runStepEClass, RUN_STEP__COMMAND);
		createEReference(runStepEClass, RUN_STEP__NAME);
		createEReference(runStepEClass, RUN_STEP__SHELL);
		createEReference(runStepEClass, RUN_STEP__BACKGROUND);
		createEReference(runStepEClass, RUN_STEP__WORKING_DIRECTORY);
		createEReference(runStepEClass, RUN_STEP__NO_OUTPUT_TIMEOUT);
		createEAttribute(runStepEClass, RUN_STEP__WHEN);

		conditionalStepEClass = createEClass(CONDITIONAL_STEP);
		createEReference(conditionalStepEClass, CONDITIONAL_STEP__CONDITION);

		whenStepEClass = createEClass(WHEN_STEP);

		unlessStepEClass = createEClass(UNLESS_STEP);

		checkoutStepEClass = createEClass(CHECKOUT_STEP);
		createEReference(checkoutStepEClass, CHECKOUT_STEP__PATH);

		setupRemoteDockerStepEClass = createEClass(SETUP_REMOTE_DOCKER_STEP);
		createEReference(setupRemoteDockerStepEClass, SETUP_REMOTE_DOCKER_STEP__VERSION);
		createEReference(setupRemoteDockerStepEClass, SETUP_REMOTE_DOCKER_STEP__DOCKER_LAYER_CACHING);

		saveCacheStepEClass = createEClass(SAVE_CACHE_STEP);
		createEReference(saveCacheStepEClass, SAVE_CACHE_STEP__PATHS);
		createEReference(saveCacheStepEClass, SAVE_CACHE_STEP__KEY);
		createEReference(saveCacheStepEClass, SAVE_CACHE_STEP__NAME);
		createEAttribute(saveCacheStepEClass, SAVE_CACHE_STEP__WHEN);

		restoreCacheStepEClass = createEClass(RESTORE_CACHE_STEP);
		createEReference(restoreCacheStepEClass, RESTORE_CACHE_STEP__KEYS);
		createEReference(restoreCacheStepEClass, RESTORE_CACHE_STEP__NAME);

		storeArtifactsStepEClass = createEClass(STORE_ARTIFACTS_STEP);
		createEReference(storeArtifactsStepEClass, STORE_ARTIFACTS_STEP__PATH);
		createEReference(storeArtifactsStepEClass, STORE_ARTIFACTS_STEP__DESTINATION);

		storeTestResultsStepEClass = createEClass(STORE_TEST_RESULTS_STEP);
		createEReference(storeTestResultsStepEClass, STORE_TEST_RESULTS_STEP__PATH);

		persistToWorkspaceStepEClass = createEClass(PERSIST_TO_WORKSPACE_STEP);
		createEReference(persistToWorkspaceStepEClass, PERSIST_TO_WORKSPACE_STEP__ROOT);
		createEReference(persistToWorkspaceStepEClass, PERSIST_TO_WORKSPACE_STEP__PATHS);

		attachWorkspaceStepEClass = createEClass(ATTACH_WORKSPACE_STEP);
		createEReference(attachWorkspaceStepEClass, ATTACH_WORKSPACE_STEP__AT);

		addSSHKeysStepEClass = createEClass(ADD_SSH_KEYS_STEP);
		createEReference(addSSHKeysStepEClass, ADD_SSH_KEYS_STEP__FINGERPRINTS);

		orbReferenceStepEClass = createEClass(ORB_REFERENCE_STEP);
		createEReference(orbReferenceStepEClass, ORB_REFERENCE_STEP__ORB);
		createEAttribute(orbReferenceStepEClass, ORB_REFERENCE_STEP__JOB_NAME);
		createEReference(orbReferenceStepEClass, ORB_REFERENCE_STEP__ARGUMENTS);

		commandReferenceStepEClass = createEClass(COMMAND_REFERENCE_STEP);
		createEReference(commandReferenceStepEClass, COMMAND_REFERENCE_STEP__COMMAND);
		createEReference(commandReferenceStepEClass, COMMAND_REFERENCE_STEP__ARGUMENTS);

		variableAssignmentEClass = createEClass(VARIABLE_ASSIGNMENT);
		createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__KEY);
		createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__VALUE);

		variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
		createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__NAME);

		workflowEClass = createEClass(WORKFLOW);
		createEAttribute(workflowEClass, WORKFLOW__NAME);
		createEReference(workflowEClass, WORKFLOW__TRIGGERS);
		createEReference(workflowEClass, WORKFLOW__CONDITION);
		createEAttribute(workflowEClass, WORKFLOW__IS_WHEN);
		createEReference(workflowEClass, WORKFLOW__JOBS);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__BRANCHES);
		createEAttribute(triggerEClass, TRIGGER__IGNORE_SPECIFIED_BRANCHES);

		scheduleTriggerEClass = createEClass(SCHEDULE_TRIGGER);
		createEAttribute(scheduleTriggerEClass, SCHEDULE_TRIGGER__CRON);

		workflowJobConfigurationEClass = createEClass(WORKFLOW_JOB_CONFIGURATION);
		createEReference(workflowJobConfigurationEClass, WORKFLOW_JOB_CONFIGURATION__REQUIRES);
		createEReference(workflowJobConfigurationEClass, WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY);
		createEAttribute(workflowJobConfigurationEClass, WORKFLOW_JOB_CONFIGURATION__NAME);
		createEReference(workflowJobConfigurationEClass, WORKFLOW_JOB_CONFIGURATION__CONTEXTS);
		createEReference(workflowJobConfigurationEClass, WORKFLOW_JOB_CONFIGURATION__BRANCHES);
		createEAttribute(workflowJobConfigurationEClass, WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES);
		createEReference(workflowJobConfigurationEClass, WORKFLOW_JOB_CONFIGURATION__TAGS);
		createEAttribute(workflowJobConfigurationEClass, WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS);
		createEReference(workflowJobConfigurationEClass, WORKFLOW_JOB_CONFIGURATION__MATRIX);
		createEReference(workflowJobConfigurationEClass, WORKFLOW_JOB_CONFIGURATION__PRE_STEPS);
		createEReference(workflowJobConfigurationEClass, WORKFLOW_JOB_CONFIGURATION__POST_STEPS);
		createEReference(workflowJobConfigurationEClass, WORKFLOW_JOB_CONFIGURATION__ARGUMENTS);

		nullWorkflowJobConfigurationEClass = createEClass(NULL_WORKFLOW_JOB_CONFIGURATION);

		workflowDefinedJobConfigurationEClass = createEClass(WORKFLOW_DEFINED_JOB_CONFIGURATION);
		createEReference(workflowDefinedJobConfigurationEClass, WORKFLOW_DEFINED_JOB_CONFIGURATION__JOB);

		workflowApprovalJobConfigurationEClass = createEClass(WORKFLOW_APPROVAL_JOB_CONFIGURATION);

		workflowOrbJobConfigurationEClass = createEClass(WORKFLOW_ORB_JOB_CONFIGURATION);
		createEReference(workflowOrbJobConfigurationEClass, WORKFLOW_ORB_JOB_CONFIGURATION__ORB);
		createEReference(workflowOrbJobConfigurationEClass, WORKFLOW_ORB_JOB_CONFIGURATION__EXECUTOR);
		createEAttribute(workflowOrbJobConfigurationEClass, WORKFLOW_ORB_JOB_CONFIGURATION__JOB_NAME);

		matrixEClass = createEClass(MATRIX);
		createEReference(matrixEClass, MATRIX__PARAMETERS);
		createEReference(matrixEClass, MATRIX__EXCLUDES);
		createEReference(matrixEClass, MATRIX__ALIAS);

		matrixParameterEClass = createEClass(MATRIX_PARAMETER);
		createEReference(matrixParameterEClass, MATRIX_PARAMETER__NAME);
		createEReference(matrixParameterEClass, MATRIX_PARAMETER__CELLS);

		matrixCombinationEClass = createEClass(MATRIX_COMBINATION);
		createEReference(matrixCombinationEClass, MATRIX_COMBINATION__ENTRIES);

		expressionEClass = createEClass(EXPRESSION);

		concatEClass = createEClass(CONCAT);
		createEReference(concatEClass, CONCAT__EXPRESSIONS);

		logicEClass = createEClass(LOGIC);

		infinitaryOperatorEClass = createEClass(INFINITARY_OPERATOR);
		createEReference(infinitaryOperatorEClass, INFINITARY_OPERATOR__OPERANDS);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);

		equalsEClass = createEClass(EQUALS);

		unaryOperatorEClass = createEClass(UNARY_OPERATOR);
		createEReference(unaryOperatorEClass, UNARY_OPERATOR__OPERAND);

		notEClass = createEClass(NOT);

		logicFunctionEClass = createEClass(LOGIC_FUNCTION);

		matchesEClass = createEClass(MATCHES);
		createEReference(matchesEClass, MATCHES__PATTERN);
		createEReference(matchesEClass, MATCHES__VALUE);

		valueEClass = createEClass(VALUE);

		dotOperatorEClass = createEClass(DOT_OPERATOR);
		createEReference(dotOperatorEClass, DOT_OPERATOR__LHS);
		createEReference(dotOperatorEClass, DOT_OPERATOR__RHS);

		literalEClass = createEClass(LITERAL);

		stringLiteralEClass = createEClass(STRING_LITERAL);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

		integerLiteralEClass = createEClass(INTEGER_LITERAL);
		createEAttribute(integerLiteralEClass, INTEGER_LITERAL__VALUE);

		doubleLiteralEClass = createEClass(DOUBLE_LITERAL);
		createEAttribute(doubleLiteralEClass, DOUBLE_LITERAL__VALUE);

		booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
		createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

		variableReferenceEClass = createEClass(VARIABLE_REFERENCE);
		createEReference(variableReferenceEClass, VARIABLE_REFERENCE__REFERENCE);

		// Create enums
		parameteR_TYPESEEnum = createEEnum(PARAMETER_TYPES);
		wheN_TYPEEEnum = createEEnum(WHEN_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pipelineEClass.getESuperTypes().add(this.getDefinitionGroup());
		pipelineEClass.getESuperTypes().add(this.getCallable());
		orbReferenceEClass.getESuperTypes().add(this.getOrb());
		orbDefinitionEClass.getESuperTypes().add(this.getOrb());
		orbDefinitionEClass.getESuperTypes().add(this.getDefinitionGroup());
		commandEClass.getESuperTypes().add(this.getScript());
		commandEClass.getESuperTypes().add(this.getCallable());
		executorEClass.getESuperTypes().add(this.getEnvironment());
		dockerExecutorEClass.getESuperTypes().add(this.getExecutor());
		dockerContainerEClass.getESuperTypes().add(this.getEnvironment());
		machineExecutorEClass.getESuperTypes().add(this.getExecutor());
		macOSExecutorEClass.getESuperTypes().add(this.getExecutor());
		windowsOrbExecutorEClass.getESuperTypes().add(this.getExecutor());
		referenceExecutorEClass.getESuperTypes().add(this.getExecutor());
		executorReferenceExecutorEClass.getESuperTypes().add(this.getReferenceExecutor());
		orbReferenceExecutorEClass.getESuperTypes().add(this.getReferenceExecutor());
		jobEClass.getESuperTypes().add(this.getScript());
		jobEClass.getESuperTypes().add(this.getCallable());
		jobEClass.getESuperTypes().add(this.getEnvironment());
		runStepEClass.getESuperTypes().add(this.getStep());
		runStepEClass.getESuperTypes().add(this.getEnvironment());
		conditionalStepEClass.getESuperTypes().add(this.getStep());
		conditionalStepEClass.getESuperTypes().add(this.getScript());
		whenStepEClass.getESuperTypes().add(this.getConditionalStep());
		unlessStepEClass.getESuperTypes().add(this.getConditionalStep());
		checkoutStepEClass.getESuperTypes().add(this.getStep());
		setupRemoteDockerStepEClass.getESuperTypes().add(this.getStep());
		saveCacheStepEClass.getESuperTypes().add(this.getStep());
		restoreCacheStepEClass.getESuperTypes().add(this.getStep());
		storeArtifactsStepEClass.getESuperTypes().add(this.getStep());
		storeTestResultsStepEClass.getESuperTypes().add(this.getStep());
		persistToWorkspaceStepEClass.getESuperTypes().add(this.getStep());
		attachWorkspaceStepEClass.getESuperTypes().add(this.getStep());
		addSSHKeysStepEClass.getESuperTypes().add(this.getStep());
		orbReferenceStepEClass.getESuperTypes().add(this.getStep());
		commandReferenceStepEClass.getESuperTypes().add(this.getStep());
		scheduleTriggerEClass.getESuperTypes().add(this.getTrigger());
		nullWorkflowJobConfigurationEClass.getESuperTypes().add(this.getWorkflowJobConfiguration());
		workflowDefinedJobConfigurationEClass.getESuperTypes().add(this.getWorkflowJobConfiguration());
		workflowApprovalJobConfigurationEClass.getESuperTypes().add(this.getWorkflowJobConfiguration());
		workflowOrbJobConfigurationEClass.getESuperTypes().add(this.getWorkflowJobConfiguration());
		concatEClass.getESuperTypes().add(this.getExpression());
		infinitaryOperatorEClass.getESuperTypes().add(this.getLogic());
		andEClass.getESuperTypes().add(this.getInfinitaryOperator());
		orEClass.getESuperTypes().add(this.getInfinitaryOperator());
		equalsEClass.getESuperTypes().add(this.getInfinitaryOperator());
		unaryOperatorEClass.getESuperTypes().add(this.getLogic());
		notEClass.getESuperTypes().add(this.getUnaryOperator());
		logicFunctionEClass.getESuperTypes().add(this.getLogic());
		matchesEClass.getESuperTypes().add(this.getLogicFunction());
		valueEClass.getESuperTypes().add(this.getExpression());
		valueEClass.getESuperTypes().add(this.getLogic());
		dotOperatorEClass.getESuperTypes().add(this.getValue());
		literalEClass.getESuperTypes().add(this.getValue());
		stringLiteralEClass.getESuperTypes().add(this.getLiteral());
		integerLiteralEClass.getESuperTypes().add(this.getLiteral());
		doubleLiteralEClass.getESuperTypes().add(this.getLiteral());
		booleanLiteralEClass.getESuperTypes().add(this.getLiteral());
		variableReferenceEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(definitionGroupEClass, DefinitionGroup.class, "DefinitionGroup", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionGroup_Orbs(), this.getOrb(), null, "orbs", null, 0, -1, DefinitionGroup.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionGroup_Commands(), this.getCommand(), null, "commands", null, 0, -1,
				DefinitionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionGroup_Executors(), this.getExecutor(), null, "executors", null, 0, -1,
				DefinitionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionGroup_Jobs(), this.getJob(), null, "jobs", null, 0, -1, DefinitionGroup.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptEClass, Script.class, "Script", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScript_Steps(), this.getStep(), null, "steps", null, 0, -1, Script.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(callableEClass, Callable.class, "Callable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallable_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Callable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironment_EnvironmentVariables(), this.getVariableAssignment(), null,
				"environmentVariables", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pipelineEClass, Pipeline.class, "Pipeline", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPipeline_Version(), ecorePackage.getEString(), "version", null, 1, 1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPipeline_Setup(), ecorePackage.getEBooleanObject(), "setup", null, 0, 1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Workflows(), this.getWorkflow(), null, "workflows", null, 0, -1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orbEClass, Orb.class, "Orb", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrb_Name(), ecorePackage.getEString(), "name", null, 1, 1, Orb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orbReferenceEClass, OrbReference.class, "OrbReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrbReference_Reference(), ecorePackage.getEString(), "reference", null, 1, 1,
				OrbReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(orbDefinitionEClass, OrbDefinition.class, "OrbDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_Name(), ecorePackage.getEString(), "name", null, 1, 1, Command.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_Description(), ecorePackage.getEString(), "description", null, 0, 1, Command.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Name(), this.getVariableDeclaration(), null, "name", null, 1, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), this.getPARAMETER_TYPES(), "type", null, 1, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_EnumValues(), ecorePackage.getEString(), "enumValues", null, 0, -1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Default(), this.getExpression(), null, "default", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(executorEClass, Executor.class, "Executor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Executor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutor_ResourceClass(), this.getExpression(), null, "resourceClass", null, 0, 1,
				Executor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutor_Shell(), this.getExpression(), null, "shell", null, 0, 1, Executor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutor_WorkingDirectory(), this.getExpression(), null, "workingDirectory", null, 0, 1,
				Executor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerExecutorEClass, DockerExecutor.class, "DockerExecutor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDockerExecutor_Containers(), this.getDockerContainer(), null, "containers", null, 0, -1,
				DockerExecutor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerContainerEClass, DockerContainer.class, "DockerContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDockerContainer_Image(), this.getExpression(), null, "image", null, 1, 1,
				DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_Name(), this.getExpression(), null, "name", null, 0, 1, DockerContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_Entrypoint(), this.getExpression(), null, "entrypoint", null, 0, -1,
				DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_Command(), this.getExpression(), null, "command", null, 0, -1,
				DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_User(), this.getExpression(), null, "user", null, 0, 1, DockerContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_Username(), this.getExpression(), null, "username", null, 0, 1,
				DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_Password(), this.getExpression(), null, "password", null, 0, 1,
				DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_Oidc(), this.getExpression(), null, "oidc", null, 0, 1, DockerContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_AwsAccessKeyID(), this.getExpression(), null, "awsAccessKeyID", null, 0, 1,
				DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_AwsSecretAccessKey(), this.getExpression(), null, "awsSecretAccessKey", null,
				0, 1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineExecutorEClass, MachineExecutor.class, "MachineExecutor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMachineExecutor_Image(), this.getExpression(), null, "image", null, 1, 1,
				MachineExecutor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMachineExecutor_DockerLayerCaching(), this.getExpression(), null, "dockerLayerCaching", null,
				0, 1, MachineExecutor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(macOSExecutorEClass, MacOSExecutor.class, "MacOSExecutor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMacOSExecutor_Xcode(), this.getExpression(), null, "xcode", null, 1, 1, MacOSExecutor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(windowsOrbExecutorEClass, WindowsOrbExecutor.class, "WindowsOrbExecutor", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWindowsOrbExecutor_Executor(), this.getExpression(), null, "executor", null, 1, 1,
				WindowsOrbExecutor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceExecutorEClass, ReferenceExecutor.class, "ReferenceExecutor", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(executorReferenceExecutorEClass, ExecutorReferenceExecutor.class, "ExecutorReferenceExecutor",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutorReferenceExecutor_Executor(), this.getExecutor(), null, "executor", null, 1, 1,
				ExecutorReferenceExecutor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orbReferenceExecutorEClass, OrbReferenceExecutor.class, "OrbReferenceExecutor", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrbReferenceExecutor_Orb(), this.getOrb(), null, "orb", null, 1, 1,
				OrbReferenceExecutor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrbReferenceExecutor_OrbExecutorName(), ecorePackage.getEString(), "orbExecutorName", null, 1,
				1, OrbReferenceExecutor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobEClass, Job.class, "Job", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJob_Name(), ecorePackage.getEString(), "name", null, 1, 1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Executor(), this.getExecutor(), null, "executor", null, 1, 1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJob_Parallelism(), this.getExpression(), null, "parallelism", null, 0, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_CircleCIIPRanges(), this.getExpression(), null, "circleCIIPRanges", null, 0, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runStepEClass, RunStep.class, "RunStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunStep_Command(), this.getExpression(), null, "command", null, 1, 1, RunStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunStep_Name(), this.getExpression(), null, "name", null, 0, 1, RunStep.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRunStep_Shell(), this.getExpression(), null, "shell", null, 0, 1, RunStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunStep_Background(), this.getExpression(), null, "background", null, 1, 1, RunStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunStep_WorkingDirectory(), this.getExpression(), null, "workingDirectory", null, 0, 1,
				RunStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunStep_NoOutputTimeout(), this.getExpression(), null, "noOutputTimeout", null, 0, 1,
				RunStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRunStep_When(), this.getWHEN_TYPE(), "when", null, 0, 1, RunStep.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalStepEClass, ConditionalStep.class, "ConditionalStep", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalStep_Condition(), this.getLogic(), null, "condition", null, 1, 1,
				ConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whenStepEClass, WhenStep.class, "WhenStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(unlessStepEClass, UnlessStep.class, "UnlessStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkoutStepEClass, CheckoutStep.class, "CheckoutStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckoutStep_Path(), this.getExpression(), null, "path", null, 0, 1, CheckoutStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setupRemoteDockerStepEClass, SetupRemoteDockerStep.class, "SetupRemoteDockerStep", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetupRemoteDockerStep_Version(), this.getExpression(), null, "version", null, 0, 1,
				SetupRemoteDockerStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetupRemoteDockerStep_DockerLayerCaching(), this.getExpression(), null, "dockerLayerCaching",
				null, 0, 1, SetupRemoteDockerStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(saveCacheStepEClass, SaveCacheStep.class, "SaveCacheStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSaveCacheStep_Paths(), this.getExpression(), null, "paths", null, 1, -1, SaveCacheStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSaveCacheStep_Key(), this.getExpression(), null, "key", null, 1, 1, SaveCacheStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSaveCacheStep_Name(), this.getExpression(), null, "name", null, 0, 1, SaveCacheStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSaveCacheStep_When(), this.getWHEN_TYPE(), "when", "on_success", 1, 1, SaveCacheStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restoreCacheStepEClass, RestoreCacheStep.class, "RestoreCacheStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestoreCacheStep_Keys(), this.getExpression(), null, "keys", null, 1, -1,
				RestoreCacheStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestoreCacheStep_Name(), this.getExpression(), null, "name", null, 0, 1,
				RestoreCacheStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeArtifactsStepEClass, StoreArtifactsStep.class, "StoreArtifactsStep", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoreArtifactsStep_Path(), this.getExpression(), null, "path", null, 1, 1,
				StoreArtifactsStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoreArtifactsStep_Destination(), this.getExpression(), null, "destination", null, 0, 1,
				StoreArtifactsStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeTestResultsStepEClass, StoreTestResultsStep.class, "StoreTestResultsStep", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoreTestResultsStep_Path(), this.getExpression(), null, "path", null, 1, 1,
				StoreTestResultsStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistToWorkspaceStepEClass, PersistToWorkspaceStep.class, "PersistToWorkspaceStep", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersistToWorkspaceStep_Root(), this.getExpression(), null, "root", null, 1, 1,
				PersistToWorkspaceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersistToWorkspaceStep_Paths(), this.getExpression(), null, "paths", null, 1, -1,
				PersistToWorkspaceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachWorkspaceStepEClass, AttachWorkspaceStep.class, "AttachWorkspaceStep", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachWorkspaceStep_At(), this.getExpression(), null, "at", null, 1, 1,
				AttachWorkspaceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addSSHKeysStepEClass, AddSSHKeysStep.class, "AddSSHKeysStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddSSHKeysStep_Fingerprints(), this.getExpression(), null, "fingerprints", null, 0, -1,
				AddSSHKeysStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orbReferenceStepEClass, OrbReferenceStep.class, "OrbReferenceStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrbReferenceStep_Orb(), this.getOrb(), null, "orb", null, 1, 1, OrbReferenceStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrbReferenceStep_JobName(), ecorePackage.getEString(), "jobName", null, 0, 1,
				OrbReferenceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getOrbReferenceStep_Arguments(), this.getVariableAssignment(), null, "arguments", null, 0, -1,
				OrbReferenceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandReferenceStepEClass, CommandReferenceStep.class, "CommandReferenceStep", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandReferenceStep_Command(), this.getCommand(), null, "command", null, 1, 1,
				CommandReferenceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandReferenceStep_Arguments(), this.getVariableAssignment(), null, "arguments", null, 0,
				-1, CommandReferenceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableAssignmentEClass, Map.Entry.class, "VariableAssignment", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAssignment_Key(), this.getVariableDeclaration(), null, "key", null, 1, 1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableAssignment_Value(), this.getExpression(), null, "value", null, 1, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflow_Name(), ecorePackage.getEString(), "name", null, 1, 1, Workflow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Triggers(), this.getTrigger(), null, "triggers", null, 0, -1, Workflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Condition(), this.getLogic(), null, "condition", null, 1, 1, Workflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_IsWhen(), ecorePackage.getEBooleanObject(), "isWhen", null, 0, 1, Workflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Jobs(), this.getWorkflowJobConfiguration(), null, "jobs", null, 0, -1,
				Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_Branches(), this.getExpression(), null, "branches", null, 0, -1, Trigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_IgnoreSpecifiedBranches(), ecorePackage.getEBooleanObject(),
				"ignoreSpecifiedBranches", "false", 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scheduleTriggerEClass, ScheduleTrigger.class, "ScheduleTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduleTrigger_Cron(), ecorePackage.getEString(), "cron", null, 0, 1, ScheduleTrigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowJobConfigurationEClass, WorkflowJobConfiguration.class, "WorkflowJobConfiguration",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowJobConfiguration_Requires(), this.getWorkflowJobConfiguration(),
				this.getWorkflowJobConfiguration_RequiredBy(), "requires", null, 0, -1, WorkflowJobConfiguration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowJobConfiguration_RequiredBy(), this.getWorkflowJobConfiguration(),
				this.getWorkflowJobConfiguration_Requires(), "requiredBy", null, 0, -1, WorkflowJobConfiguration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowJobConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				WorkflowJobConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowJobConfiguration_Contexts(), this.getExpression(), null, "contexts", null, 0, -1,
				WorkflowJobConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowJobConfiguration_Branches(), this.getExpression(), null, "branches", null, 0, -1,
				WorkflowJobConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowJobConfiguration_IgnoreSpecifiedBranches(), ecorePackage.getEBooleanObject(),
				"ignoreSpecifiedBranches", null, 0, 1, WorkflowJobConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowJobConfiguration_Tags(), this.getExpression(), null, "tags", null, 0, -1,
				WorkflowJobConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowJobConfiguration_IgnoreSpecifiedTags(), ecorePackage.getEBooleanObject(),
				"ignoreSpecifiedTags", null, 0, 1, WorkflowJobConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowJobConfiguration_Matrix(), this.getMatrix(), null, "matrix", null, 0, 1,
				WorkflowJobConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowJobConfiguration_PreSteps(), this.getStep(), null, "preSteps", null, 0, -1,
				WorkflowJobConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowJobConfiguration_PostSteps(), this.getStep(), null, "postSteps", null, 0, -1,
				WorkflowJobConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowJobConfiguration_Arguments(), this.getVariableAssignment(), null, "arguments", null,
				0, -1, WorkflowJobConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullWorkflowJobConfigurationEClass, NullWorkflowJobConfiguration.class,
				"NullWorkflowJobConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workflowDefinedJobConfigurationEClass, WorkflowDefinedJobConfiguration.class,
				"WorkflowDefinedJobConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowDefinedJobConfiguration_Job(), this.getJob(), null, "job", null, 1, 1,
				WorkflowDefinedJobConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowApprovalJobConfigurationEClass, WorkflowApprovalJobConfiguration.class,
				"WorkflowApprovalJobConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workflowOrbJobConfigurationEClass, WorkflowOrbJobConfiguration.class, "WorkflowOrbJobConfiguration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowOrbJobConfiguration_Orb(), this.getOrb(), null, "orb", null, 1, 1,
				WorkflowOrbJobConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowOrbJobConfiguration_Executor(), this.getExecutor(), null, "executor", null, 0, 1,
				WorkflowOrbJobConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowOrbJobConfiguration_JobName(), ecorePackage.getEString(), "jobName", null, 0, 1,
				WorkflowOrbJobConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matrixEClass, Matrix.class, "Matrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatrix_Parameters(), this.getMatrixParameter(), null, "parameters", null, 1, -1, Matrix.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatrix_Excludes(), this.getMatrixCombination(), null, "excludes", null, 0, -1, Matrix.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatrix_Alias(), this.getExpression(), null, "alias", null, 0, 1, Matrix.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(matrixParameterEClass, MatrixParameter.class, "MatrixParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatrixParameter_Name(), this.getVariableDeclaration(), null, "name", null, 1, 1,
				MatrixParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatrixParameter_Cells(), this.getExpression(), null, "cells", null, 1, -1,
				MatrixParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matrixCombinationEClass, MatrixCombination.class, "MatrixCombination", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatrixCombination_Entries(), this.getVariableAssignment(), null, "entries", null, 1, -1,
				MatrixCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(concatEClass, Concat.class, "Concat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcat_Expressions(), this.getExpression(), null, "expressions", null, 1, -1, Concat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicEClass, Logic.class, "Logic", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(infinitaryOperatorEClass, InfinitaryOperator.class, "InfinitaryOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfinitaryOperator_Operands(), this.getLogic(), null, "operands", null, 1, -1,
				InfinitaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalsEClass, Equals.class, "Equals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryOperatorEClass, UnaryOperator.class, "UnaryOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryOperator_Operand(), this.getLogic(), null, "operand", null, 1, 1, UnaryOperator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicFunctionEClass, LogicFunction.class, "LogicFunction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(matchesEClass, Matches.class, "Matches", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatches_Pattern(), this.getExpression(), null, "pattern", null, 1, 1, Matches.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatches_Value(), this.getExpression(), null, "value", null, 1, 1, Matches.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dotOperatorEClass, DotOperator.class, "DotOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDotOperator_Lhs(), this.getValue(), null, "lhs", null, 1, 1, DotOperator.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDotOperator_Rhs(), this.getValue(), null, "rhs", null, 1, 1, DotOperator.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringLiteral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerLiteralEClass, IntegerLiteral.class, "IntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerLiteral_Value(), ecorePackage.getEIntegerObject(), "value", null, 1, 1,
				IntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(doubleLiteralEClass, DoubleLiteral.class, "DoubleLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleLiteral_Value(), ecorePackage.getEDoubleObject(), "value", null, 1, 1,
				DoubleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteral_Value(), ecorePackage.getEBooleanObject(), "value", null, 1, 1,
				BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableReference_Reference(), this.getVariableDeclaration(), null, "reference", null, 1, 1,
				VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parameteR_TYPESEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PARAMETER_TYPES.class,
				"PARAMETER_TYPES");
		addEEnumLiteral(parameteR_TYPESEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PARAMETER_TYPES.STRING);
		addEEnumLiteral(parameteR_TYPESEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PARAMETER_TYPES.BOOLEAN);
		addEEnumLiteral(parameteR_TYPESEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PARAMETER_TYPES.INTEGER);
		addEEnumLiteral(parameteR_TYPESEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PARAMETER_TYPES.ENUM);
		addEEnumLiteral(parameteR_TYPESEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PARAMETER_TYPES.EXECUTOR);
		addEEnumLiteral(parameteR_TYPESEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PARAMETER_TYPES.STEPS);
		addEEnumLiteral(parameteR_TYPESEEnum,
				d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PARAMETER_TYPES.ENVIRONMENT_VARIABLE_NAME);

		initEEnum(wheN_TYPEEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE.class, "WHEN_TYPE");
		addEEnumLiteral(wheN_TYPEEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE.ON_SUCCESS);
		addEEnumLiteral(wheN_TYPEEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE.ALWAYS);
		addEEnumLiteral(wheN_TYPEEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE.ON_FAIL);

		// Create resource
		createResource(eNS_URI);
	}

} //CircleCIPackageImpl
