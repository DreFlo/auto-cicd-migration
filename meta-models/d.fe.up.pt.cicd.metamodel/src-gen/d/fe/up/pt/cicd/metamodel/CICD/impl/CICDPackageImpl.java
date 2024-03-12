/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.impl;

import d.fe.up.pt.cicd.metamodel.CICD.Addition;
import d.fe.up.pt.cicd.metamodel.CICD.Agent;
import d.fe.up.pt.cicd.metamodel.CICD.And;
import d.fe.up.pt.cicd.metamodel.CICD.Artifact;
import d.fe.up.pt.cicd.metamodel.CICD.BinaryOp;
import d.fe.up.pt.cicd.metamodel.CICD.BooleanLiteral;
import d.fe.up.pt.cicd.metamodel.CICD.BuiltInFunction;
import d.fe.up.pt.cicd.metamodel.CICD.CICDFactory;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Cache;
import d.fe.up.pt.cicd.metamodel.CICD.Command;
import d.fe.up.pt.cicd.metamodel.CICD.ComparisonOp;
import d.fe.up.pt.cicd.metamodel.CICD.Concat;
import d.fe.up.pt.cicd.metamodel.CICD.ConcurrencyGroup;
import d.fe.up.pt.cicd.metamodel.CICD.ConditionalStep;
import d.fe.up.pt.cicd.metamodel.CICD.DockerContainer;
import d.fe.up.pt.cicd.metamodel.CICD.DoubleLiteral;
import d.fe.up.pt.cicd.metamodel.CICD.EqualityOp;
import d.fe.up.pt.cicd.metamodel.CICD.Expression;
import d.fe.up.pt.cicd.metamodel.CICD.Input;
import d.fe.up.pt.cicd.metamodel.CICD.IntegerLiteral;
import d.fe.up.pt.cicd.metamodel.CICD.Job;
import d.fe.up.pt.cicd.metamodel.CICD.Literal;
import d.fe.up.pt.cicd.metamodel.CICD.LogicalOp;
import d.fe.up.pt.cicd.metamodel.CICD.ManualTrigger;
import d.fe.up.pt.cicd.metamodel.CICD.Matrix;
import d.fe.up.pt.cicd.metamodel.CICD.MatrixAxis;
import d.fe.up.pt.cicd.metamodel.CICD.MatrixCombination;
import d.fe.up.pt.cicd.metamodel.CICD.Negation;
import d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep;
import d.fe.up.pt.cicd.metamodel.CICD.Or;
import d.fe.up.pt.cicd.metamodel.CICD.Output;
import d.fe.up.pt.cicd.metamodel.CICD.Parameter;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock;
import d.fe.up.pt.cicd.metamodel.CICD.Plugin;
import d.fe.up.pt.cicd.metamodel.CICD.PullRequestTrigger;
import d.fe.up.pt.cicd.metamodel.CICD.PushTrigger;
import d.fe.up.pt.cicd.metamodel.CICD.ScheduledTrigger;
import d.fe.up.pt.cicd.metamodel.CICD.Step;
import d.fe.up.pt.cicd.metamodel.CICD.StringLiteral;
import d.fe.up.pt.cicd.metamodel.CICD.Subtraction;
import d.fe.up.pt.cicd.metamodel.CICD.Trigger;
import d.fe.up.pt.cicd.metamodel.CICD.UnaryOp;
import d.fe.up.pt.cicd.metamodel.CICD.Value;
import d.fe.up.pt.cicd.metamodel.CICD.Variable;
import d.fe.up.pt.cicd.metamodel.CICD.VariableContext;
import d.fe.up.pt.cicd.metamodel.CICD.VariableDereference;
import d.fe.up.pt.cicd.metamodel.CICD.WebhookTrigger;

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
public class CICDPackageImpl extends EPackageImpl implements CICDPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipelineBlockEClass = null;

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
	private EClass jobEClass = null;

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
	private EClass dockerContainerEClass = null;

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
	private EClass pushTriggerEClass = null;

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
	private EClass manualTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduledTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webhookTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionEClass = null;

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
	private EClass matrixAxisEClass = null;

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
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

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
	private EClass conditionalStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonConditionalStepEClass = null;

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
	private EClass pluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

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
	private EClass valueEClass = null;

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
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDereferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalOpEClass = null;

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
	private EClass additionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum permissioN_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shelL_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inpuT_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum equalitY_OPSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisoN_OPSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variablE_CONTEXTSEEnum = null;

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
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CICDPackageImpl() {
		super(eNS_URI, CICDFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CICDPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CICDPackage init() {
		if (isInited)
			return (CICDPackage) EPackage.Registry.INSTANCE.getEPackage(CICDPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCICDPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CICDPackageImpl theCICDPackage = registeredCICDPackage instanceof CICDPackageImpl
				? (CICDPackageImpl) registeredCICDPackage
				: new CICDPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCICDPackage.createPackageContents();

		// Initialize created meta-data
		theCICDPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCICDPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CICDPackage.eNS_URI, theCICDPackage);
		return theCICDPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPipelineBlock() {
		return pipelineBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPipelineBlock_Name() {
		return (EAttribute) pipelineBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipelineBlock_Agent() {
		return (EReference) pipelineBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipelineBlock_Inputs() {
		return (EReference) pipelineBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipelineBlock_Outputs() {
		return (EReference) pipelineBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipelineBlock_EnvironmentVariables() {
		return (EReference) pipelineBlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipelineBlock_Permissions() {
		return (EReference) pipelineBlockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPipelineBlock_TimeoutMinutes() {
		return (EAttribute) pipelineBlockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPipelineBlock_WorkingDirectory() {
		return (EAttribute) pipelineBlockEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipelineBlock_ConcurrencyGroup() {
		return (EReference) pipelineBlockEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPipelineBlock_Shell() {
		return (EAttribute) pipelineBlockEClass.getEStructuralFeatures().get(9);
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
	public EReference getPipeline_Triggers() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_JobStreams() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getJob_Id() {
		return (EAttribute) jobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Steps() {
		return (EReference) jobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Services() {
		return (EReference) jobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Previous() {
		return (EReference) jobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Next() {
		return (EReference) jobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_MaxAttempts() {
		return (EAttribute) jobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_AllowFailure() {
		return (EAttribute) jobEClass.getEStructuralFeatures().get(6);
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
	public EReference getAgent_Labels() {
		return (EReference) agentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgent_Container() {
		return (EReference) agentEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDockerContainer_Label() {
		return (EAttribute) dockerContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_Image() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_EnvironmentVariables() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_Volumes() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_Ports() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerContainer_Options() {
		return (EAttribute) dockerContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_RegistryUsername() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_RegistryPassword() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerContainer_Network() {
		return (EReference) dockerContainerEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getTrigger_BranchGlobs() {
		return (EAttribute) triggerEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getPushTrigger_TagGlobs() {
		return (EAttribute) pushTriggerEClass.getEStructuralFeatures().get(0);
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
	public EClass getManualTrigger() {
		return manualTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScheduledTrigger() {
		return scheduledTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheduledTrigger_Crons() {
		return (EAttribute) scheduledTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebhookTrigger() {
		return webhookTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyGroup() {
		return concurrencyGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcurrencyGroup_GroupId() {
		return (EReference) concurrencyGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcurrencyGroup_CancelInProgress() {
		return (EAttribute) concurrencyGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermission() {
		return permissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermission_Key() {
		return (EAttribute) permissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermission_Value() {
		return (EAttribute) permissionEClass.getEStructuralFeatures().get(1);
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
	public EReference getMatrix_Axes() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_Includes() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrix_Excludes() {
		return (EReference) matrixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatrix_FailFast() {
		return (EAttribute) matrixEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatrixAxis() {
		return matrixAxisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatrixAxis_Name() {
		return (EAttribute) matrixAxisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrixAxis_Cells() {
		return (EReference) matrixAxisEClass.getEStructuralFeatures().get(1);
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
	public EReference getMatrixCombination_CombinationEntries() {
		return (EReference) matrixCombinationEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getParameter_Id() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Description() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Type() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_DefaultValue() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Required() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutput_Value() {
		return (EReference) outputEClass.getEStructuralFeatures().get(0);
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
	public EClass getConditionalStep() {
		return conditionalStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalStep_IfCondition() {
		return (EReference) conditionalStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalStep_ThenRun() {
		return (EReference) conditionalStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalStep_ElseRun() {
		return (EReference) conditionalStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNonConditionalStep() {
		return nonConditionalStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonConditionalStep_Id() {
		return (EAttribute) nonConditionalStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonConditionalStep_Name() {
		return (EAttribute) nonConditionalStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNonConditionalStep_EnvironmentVariables() {
		return (EReference) nonConditionalStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonConditionalStep_TimeoutMinutes() {
		return (EAttribute) nonConditionalStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonConditionalStep_AllowFailure() {
		return (EAttribute) nonConditionalStepEClass.getEStructuralFeatures().get(4);
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
	public EReference getCommand_Program() {
		return (EReference) commandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlugin() {
		return pluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlugin_PluginName() {
		return (EAttribute) pluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlugin_Version() {
		return (EAttribute) pluginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlugin_Kwargs() {
		return (EReference) pluginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCache() {
		return cacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCache_CacheName() {
		return (EReference) cacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCache_Keys() {
		return (EReference) cacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCache_Paths() {
		return (EReference) cacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_ArtifactName() {
		return (EReference) artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_IncludePaths() {
		return (EReference) artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_ExcludePaths() {
		return (EReference) artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_RetentionTime() {
		return (EReference) artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignment_Key() {
		return (EReference) assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignment_Value() {
		return (EReference) assignmentEClass.getEStructuralFeatures().get(1);
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
	public EClass getValue() {
		return valueEClass;
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
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Name() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableContext() {
		return variableContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableContext_Context() {
		return (EAttribute) variableContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDereference() {
		return variableDereferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDereference_Variable() {
		return (EReference) variableDereferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableDereference_Property() {
		return (EAttribute) variableDereferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuiltInFunction() {
		return builtInFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryOp() {
		return binaryOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryOp_Lhs() {
		return (EReference) binaryOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryOp_Rhs() {
		return (EReference) binaryOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEqualityOp() {
		return equalityOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEqualityOp_Op() {
		return (EAttribute) equalityOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparisonOp() {
		return comparisonOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComparisonOp_Op() {
		return (EAttribute) comparisonOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalOp() {
		return logicalOpEClass;
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
	public EClass getAddition() {
		return additionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubtraction() {
		return subtractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryOp() {
		return unaryOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryOp_Rhs() {
		return (EReference) unaryOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegation() {
		return negationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPERMISSION_TYPE() {
		return permissioN_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSHELL_TYPE() {
		return shelL_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getINPUT_TYPE() {
		return inpuT_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEQUALITY_OPS() {
		return equalitY_OPSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCOMPARISON_OPS() {
		return comparisoN_OPSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVARIABLE_CONTEXTS() {
		return variablE_CONTEXTSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CICDFactory getCICDFactory() {
		return (CICDFactory) getEFactoryInstance();
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
		pipelineBlockEClass = createEClass(PIPELINE_BLOCK);
		createEAttribute(pipelineBlockEClass, PIPELINE_BLOCK__NAME);
		createEReference(pipelineBlockEClass, PIPELINE_BLOCK__AGENT);
		createEReference(pipelineBlockEClass, PIPELINE_BLOCK__INPUTS);
		createEReference(pipelineBlockEClass, PIPELINE_BLOCK__OUTPUTS);
		createEReference(pipelineBlockEClass, PIPELINE_BLOCK__ENVIRONMENT_VARIABLES);
		createEReference(pipelineBlockEClass, PIPELINE_BLOCK__PERMISSIONS);
		createEAttribute(pipelineBlockEClass, PIPELINE_BLOCK__TIMEOUT_MINUTES);
		createEAttribute(pipelineBlockEClass, PIPELINE_BLOCK__WORKING_DIRECTORY);
		createEReference(pipelineBlockEClass, PIPELINE_BLOCK__CONCURRENCY_GROUP);
		createEAttribute(pipelineBlockEClass, PIPELINE_BLOCK__SHELL);

		pipelineEClass = createEClass(PIPELINE);
		createEReference(pipelineEClass, PIPELINE__TRIGGERS);
		createEReference(pipelineEClass, PIPELINE__JOB_STREAMS);

		jobEClass = createEClass(JOB);
		createEAttribute(jobEClass, JOB__ID);
		createEReference(jobEClass, JOB__STEPS);
		createEReference(jobEClass, JOB__SERVICES);
		createEReference(jobEClass, JOB__PREVIOUS);
		createEReference(jobEClass, JOB__NEXT);
		createEAttribute(jobEClass, JOB__MAX_ATTEMPTS);
		createEAttribute(jobEClass, JOB__ALLOW_FAILURE);

		agentEClass = createEClass(AGENT);
		createEReference(agentEClass, AGENT__LABELS);
		createEReference(agentEClass, AGENT__CONTAINER);

		dockerContainerEClass = createEClass(DOCKER_CONTAINER);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__LABEL);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__IMAGE);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__ENVIRONMENT_VARIABLES);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__VOLUMES);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__PORTS);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__OPTIONS);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__REGISTRY_USERNAME);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__REGISTRY_PASSWORD);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__NETWORK);

		triggerEClass = createEClass(TRIGGER);
		createEAttribute(triggerEClass, TRIGGER__BRANCH_GLOBS);

		pushTriggerEClass = createEClass(PUSH_TRIGGER);
		createEAttribute(pushTriggerEClass, PUSH_TRIGGER__TAG_GLOBS);

		pullRequestTriggerEClass = createEClass(PULL_REQUEST_TRIGGER);

		manualTriggerEClass = createEClass(MANUAL_TRIGGER);

		scheduledTriggerEClass = createEClass(SCHEDULED_TRIGGER);
		createEAttribute(scheduledTriggerEClass, SCHEDULED_TRIGGER__CRONS);

		webhookTriggerEClass = createEClass(WEBHOOK_TRIGGER);

		concurrencyGroupEClass = createEClass(CONCURRENCY_GROUP);
		createEReference(concurrencyGroupEClass, CONCURRENCY_GROUP__GROUP_ID);
		createEAttribute(concurrencyGroupEClass, CONCURRENCY_GROUP__CANCEL_IN_PROGRESS);

		permissionEClass = createEClass(PERMISSION);
		createEAttribute(permissionEClass, PERMISSION__KEY);
		createEAttribute(permissionEClass, PERMISSION__VALUE);

		matrixEClass = createEClass(MATRIX);
		createEReference(matrixEClass, MATRIX__AXES);
		createEReference(matrixEClass, MATRIX__INCLUDES);
		createEReference(matrixEClass, MATRIX__EXCLUDES);
		createEAttribute(matrixEClass, MATRIX__FAIL_FAST);

		matrixAxisEClass = createEClass(MATRIX_AXIS);
		createEAttribute(matrixAxisEClass, MATRIX_AXIS__NAME);
		createEReference(matrixAxisEClass, MATRIX_AXIS__CELLS);

		matrixCombinationEClass = createEClass(MATRIX_COMBINATION);
		createEReference(matrixCombinationEClass, MATRIX_COMBINATION__COMBINATION_ENTRIES);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__ID);
		createEAttribute(parameterEClass, PARAMETER__DESCRIPTION);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__TYPE);
		createEAttribute(inputEClass, INPUT__DEFAULT_VALUE);
		createEAttribute(inputEClass, INPUT__REQUIRED);

		outputEClass = createEClass(OUTPUT);
		createEReference(outputEClass, OUTPUT__VALUE);

		stepEClass = createEClass(STEP);

		conditionalStepEClass = createEClass(CONDITIONAL_STEP);
		createEReference(conditionalStepEClass, CONDITIONAL_STEP__IF_CONDITION);
		createEReference(conditionalStepEClass, CONDITIONAL_STEP__THEN_RUN);
		createEReference(conditionalStepEClass, CONDITIONAL_STEP__ELSE_RUN);

		nonConditionalStepEClass = createEClass(NON_CONDITIONAL_STEP);
		createEAttribute(nonConditionalStepEClass, NON_CONDITIONAL_STEP__ID);
		createEAttribute(nonConditionalStepEClass, NON_CONDITIONAL_STEP__NAME);
		createEReference(nonConditionalStepEClass, NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES);
		createEAttribute(nonConditionalStepEClass, NON_CONDITIONAL_STEP__TIMEOUT_MINUTES);
		createEAttribute(nonConditionalStepEClass, NON_CONDITIONAL_STEP__ALLOW_FAILURE);

		commandEClass = createEClass(COMMAND);
		createEReference(commandEClass, COMMAND__PROGRAM);

		pluginEClass = createEClass(PLUGIN);
		createEAttribute(pluginEClass, PLUGIN__PLUGIN_NAME);
		createEAttribute(pluginEClass, PLUGIN__VERSION);
		createEReference(pluginEClass, PLUGIN__KWARGS);

		cacheEClass = createEClass(CACHE);
		createEReference(cacheEClass, CACHE__CACHE_NAME);
		createEReference(cacheEClass, CACHE__KEYS);
		createEReference(cacheEClass, CACHE__PATHS);

		artifactEClass = createEClass(ARTIFACT);
		createEReference(artifactEClass, ARTIFACT__ARTIFACT_NAME);
		createEReference(artifactEClass, ARTIFACT__INCLUDE_PATHS);
		createEReference(artifactEClass, ARTIFACT__EXCLUDE_PATHS);
		createEReference(artifactEClass, ARTIFACT__RETENTION_TIME);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__KEY);
		createEReference(assignmentEClass, ASSIGNMENT__VALUE);

		expressionEClass = createEClass(EXPRESSION);

		concatEClass = createEClass(CONCAT);
		createEReference(concatEClass, CONCAT__EXPRESSIONS);

		valueEClass = createEClass(VALUE);

		literalEClass = createEClass(LITERAL);

		stringLiteralEClass = createEClass(STRING_LITERAL);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

		integerLiteralEClass = createEClass(INTEGER_LITERAL);
		createEAttribute(integerLiteralEClass, INTEGER_LITERAL__VALUE);

		doubleLiteralEClass = createEClass(DOUBLE_LITERAL);
		createEAttribute(doubleLiteralEClass, DOUBLE_LITERAL__VALUE);

		booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
		createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);

		variableContextEClass = createEClass(VARIABLE_CONTEXT);
		createEAttribute(variableContextEClass, VARIABLE_CONTEXT__CONTEXT);

		variableDereferenceEClass = createEClass(VARIABLE_DEREFERENCE);
		createEReference(variableDereferenceEClass, VARIABLE_DEREFERENCE__VARIABLE);
		createEAttribute(variableDereferenceEClass, VARIABLE_DEREFERENCE__PROPERTY);

		builtInFunctionEClass = createEClass(BUILT_IN_FUNCTION);

		binaryOpEClass = createEClass(BINARY_OP);
		createEReference(binaryOpEClass, BINARY_OP__LHS);
		createEReference(binaryOpEClass, BINARY_OP__RHS);

		equalityOpEClass = createEClass(EQUALITY_OP);
		createEAttribute(equalityOpEClass, EQUALITY_OP__OP);

		comparisonOpEClass = createEClass(COMPARISON_OP);
		createEAttribute(comparisonOpEClass, COMPARISON_OP__OP);

		logicalOpEClass = createEClass(LOGICAL_OP);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);

		additionEClass = createEClass(ADDITION);

		subtractionEClass = createEClass(SUBTRACTION);

		unaryOpEClass = createEClass(UNARY_OP);
		createEReference(unaryOpEClass, UNARY_OP__RHS);

		negationEClass = createEClass(NEGATION);

		// Create enums
		permissioN_TYPEEEnum = createEEnum(PERMISSION_TYPE);
		shelL_TYPEEEnum = createEEnum(SHELL_TYPE);
		inpuT_TYPEEEnum = createEEnum(INPUT_TYPE);
		equalitY_OPSEEnum = createEEnum(EQUALITY_OPS);
		comparisoN_OPSEEnum = createEEnum(COMPARISON_OPS);
		variablE_CONTEXTSEEnum = createEEnum(VARIABLE_CONTEXTS);
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
		pipelineEClass.getESuperTypes().add(this.getPipelineBlock());
		jobEClass.getESuperTypes().add(this.getPipelineBlock());
		pushTriggerEClass.getESuperTypes().add(this.getTrigger());
		pullRequestTriggerEClass.getESuperTypes().add(this.getTrigger());
		manualTriggerEClass.getESuperTypes().add(this.getTrigger());
		scheduledTriggerEClass.getESuperTypes().add(this.getTrigger());
		webhookTriggerEClass.getESuperTypes().add(this.getTrigger());
		inputEClass.getESuperTypes().add(this.getParameter());
		outputEClass.getESuperTypes().add(this.getParameter());
		conditionalStepEClass.getESuperTypes().add(this.getStep());
		nonConditionalStepEClass.getESuperTypes().add(this.getStep());
		commandEClass.getESuperTypes().add(this.getNonConditionalStep());
		pluginEClass.getESuperTypes().add(this.getNonConditionalStep());
		cacheEClass.getESuperTypes().add(this.getNonConditionalStep());
		artifactEClass.getESuperTypes().add(this.getNonConditionalStep());
		concatEClass.getESuperTypes().add(this.getExpression());
		valueEClass.getESuperTypes().add(this.getExpression());
		literalEClass.getESuperTypes().add(this.getValue());
		stringLiteralEClass.getESuperTypes().add(this.getLiteral());
		integerLiteralEClass.getESuperTypes().add(this.getLiteral());
		doubleLiteralEClass.getESuperTypes().add(this.getLiteral());
		booleanLiteralEClass.getESuperTypes().add(this.getLiteral());
		variableEClass.getESuperTypes().add(this.getValue());
		variableContextEClass.getESuperTypes().add(this.getValue());
		variableDereferenceEClass.getESuperTypes().add(this.getExpression());
		builtInFunctionEClass.getESuperTypes().add(this.getExpression());
		binaryOpEClass.getESuperTypes().add(this.getExpression());
		equalityOpEClass.getESuperTypes().add(this.getBinaryOp());
		comparisonOpEClass.getESuperTypes().add(this.getBinaryOp());
		logicalOpEClass.getESuperTypes().add(this.getBinaryOp());
		andEClass.getESuperTypes().add(this.getLogicalOp());
		orEClass.getESuperTypes().add(this.getLogicalOp());
		additionEClass.getESuperTypes().add(this.getBinaryOp());
		subtractionEClass.getESuperTypes().add(this.getBinaryOp());
		unaryOpEClass.getESuperTypes().add(this.getExpression());
		negationEClass.getESuperTypes().add(this.getUnaryOp());

		// Initialize classes, features, and operations; add parameters
		initEClass(pipelineBlockEClass, PipelineBlock.class, "PipelineBlock", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPipelineBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, PipelineBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipelineBlock_Agent(), this.getAgent(), null, "agent", null, 0, 1, PipelineBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipelineBlock_Inputs(), this.getInput(), null, "inputs", null, 0, -1, PipelineBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipelineBlock_Outputs(), this.getOutput(), null, "outputs", null, 0, -1, PipelineBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipelineBlock_EnvironmentVariables(), this.getAssignment(), null, "environmentVariables",
				null, 0, -1, PipelineBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipelineBlock_Permissions(), this.getPermission(), null, "permissions", null, 0, -1,
				PipelineBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPipelineBlock_TimeoutMinutes(), ecorePackage.getEIntegerObject(), "timeoutMinutes", null, 0,
				1, PipelineBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPipelineBlock_WorkingDirectory(), ecorePackage.getEString(), "workingDirectory", null, 0, 1,
				PipelineBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPipelineBlock_ConcurrencyGroup(), this.getConcurrencyGroup(), null, "concurrencyGroup", null,
				0, 1, PipelineBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPipelineBlock_Shell(), this.getSHELL_TYPE(), "shell", null, 1, 1, PipelineBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pipelineEClass, Pipeline.class, "Pipeline", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipeline_Triggers(), this.getTrigger(), null, "triggers", null, 0, -1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_JobStreams(), this.getJob(), null, "jobStreams", null, 0, -1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(jobEClass, Job.class, "Job", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJob_Id(), ecorePackage.getEString(), "id", null, 1, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Steps(), this.getStep(), null, "steps", null, 0, -1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJob_Services(), this.getDockerContainer(), null, "services", null, 0, -1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Previous(), this.getJob(), this.getJob_Next(), "previous", null, 0, -1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Next(), this.getJob(), this.getJob_Previous(), "next", null, 0, -1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_MaxAttempts(), ecorePackage.getEIntegerObject(), "maxAttempts", "1", 0, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_AllowFailure(), ecorePackage.getEBoolean(), "allowFailure", "false", 1, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgent_Labels(), this.getExpression(), null, "labels", null, 0, -1, Agent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAgent_Container(), this.getDockerContainer(), null, "container", null, 0, 1, Agent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerContainerEClass, DockerContainer.class, "DockerContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerContainer_Label(), ecorePackage.getEString(), "label", null, 0, 1,
				DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_Image(), this.getExpression(), null, "image", null, 1, 1,
				DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_EnvironmentVariables(), this.getAssignment(), null, "environmentVariables",
				null, 0, -1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_Volumes(), this.getExpression(), null, "volumes", null, 0, -1,
				DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_Ports(), this.getExpression(), null, "ports", null, 0, -1,
				DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerContainer_Options(), ecorePackage.getEString(), "options", null, 0, 1,
				DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_RegistryUsername(), this.getExpression(), null, "registryUsername", null, 1,
				1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_RegistryPassword(), this.getExpression(), null, "registryPassword", null, 1,
				1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_Network(), this.getExpression(), null, "network", null, 1, 1,
				DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrigger_BranchGlobs(), ecorePackage.getEString(), "branchGlobs", null, 0, -1, Trigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pushTriggerEClass, PushTrigger.class, "PushTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPushTrigger_TagGlobs(), ecorePackage.getEString(), "tagGlobs", null, 0, -1, PushTrigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pullRequestTriggerEClass, PullRequestTrigger.class, "PullRequestTrigger", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualTriggerEClass, ManualTrigger.class, "ManualTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(scheduledTriggerEClass, ScheduledTrigger.class, "ScheduledTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduledTrigger_Crons(), ecorePackage.getEString(), "crons", null, 1, -1,
				ScheduledTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(webhookTriggerEClass, WebhookTrigger.class, "WebhookTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(concurrencyGroupEClass, ConcurrencyGroup.class, "ConcurrencyGroup", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcurrencyGroup_GroupId(), this.getExpression(), null, "groupId", null, 1, 1,
				ConcurrencyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcurrencyGroup_CancelInProgress(), ecorePackage.getEBooleanObject(), "cancelInProgress",
				null, 1, 1, ConcurrencyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permissionEClass, Map.Entry.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPermission_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_Value(), this.getPERMISSION_TYPE(), "value", null, 1, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matrixEClass, Matrix.class, "Matrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatrix_Axes(), this.getMatrixAxis(), null, "axes", null, 1, -1, Matrix.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMatrix_Includes(), this.getMatrixCombination(), null, "includes", null, 0, -1, Matrix.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatrix_Excludes(), this.getMatrixCombination(), null, "excludes", null, 0, -1, Matrix.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix_FailFast(), ecorePackage.getEBooleanObject(), "failFast", "true", 1, 1, Matrix.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matrixAxisEClass, MatrixAxis.class, "MatrixAxis", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatrixAxis_Name(), ecorePackage.getEString(), "name", null, 1, 1, MatrixAxis.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatrixAxis_Cells(), this.getExpression(), null, "cells", null, 1, -1, MatrixAxis.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matrixCombinationEClass, MatrixCombination.class, "MatrixCombination", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatrixCombination_CombinationEntries(), this.getAssignment(), null, "combinationEntries",
				null, 1, -1, MatrixCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Id(), ecorePackage.getEString(), "id", null, 1, 1, Parameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_Type(), this.getINPUT_TYPE(), "type", null, 1, 1, Input.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Required(), ecorePackage.getEBooleanObject(), "required", null, 1, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutput_Value(), this.getValue(), null, "value", null, 1, 1, Output.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalStepEClass, ConditionalStep.class, "ConditionalStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalStep_IfCondition(), this.getExpression(), null, "ifCondition", null, 1, 1,
				ConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalStep_ThenRun(), this.getStep(), null, "thenRun", null, 1, -1,
				ConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalStep_ElseRun(), this.getStep(), null, "elseRun", null, 0, -1,
				ConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonConditionalStepEClass, NonConditionalStep.class, "NonConditionalStep", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonConditionalStep_Id(), ecorePackage.getEString(), "id", null, 0, 1,
				NonConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonConditionalStep_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				NonConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getNonConditionalStep_EnvironmentVariables(), this.getAssignment(), null, "environmentVariables",
				null, 0, -1, NonConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonConditionalStep_TimeoutMinutes(), ecorePackage.getEIntegerObject(), "timeoutMinutes", null,
				0, 1, NonConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonConditionalStep_AllowFailure(), ecorePackage.getEBoolean(), "allowFailure", "false", 1, 1,
				NonConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommand_Program(), this.getExpression(), null, "program", null, 1, 1, Command.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginEClass, Plugin.class, "Plugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlugin_PluginName(), ecorePackage.getEString(), "pluginName", null, 1, 1, Plugin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlugin_Version(), ecorePackage.getEString(), "version", null, 1, 1, Plugin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlugin_Kwargs(), this.getAssignment(), null, "kwargs", null, 0, -1, Plugin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheEClass, Cache.class, "Cache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCache_CacheName(), this.getExpression(), null, "cacheName", null, 1, 1, Cache.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCache_Keys(), this.getExpression(), null, "keys", null, 1, -1, Cache.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCache_Paths(), this.getExpression(), null, "paths", null, 1, -1, Cache.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifact_ArtifactName(), this.getExpression(), null, "artifactName", null, 1, 1,
				Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_IncludePaths(), this.getExpression(), null, "includePaths", null, 1, -1,
				Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_ExcludePaths(), this.getExpression(), null, "excludePaths", null, 1, -1,
				Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_RetentionTime(), this.getExpression(), null, "retentionTime", null, 0, 1,
				Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Map.Entry.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_Key(), this.getVariable(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAssignment_Value(), this.getExpression(), null, "value", null, 1, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(concatEClass, Concat.class, "Concat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcat_Expressions(), this.getExpression(), null, "expressions", null, 1, -1, Concat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableContextEClass, VariableContext.class, "VariableContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableContext_Context(), this.getVARIABLE_CONTEXTS(), "context", null, 1, 1,
				VariableContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(variableDereferenceEClass, VariableDereference.class, "VariableDereference", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDereference_Variable(), this.getExpression(), null, "variable", null, 1, 1,
				VariableDereference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableDereference_Property(), ecorePackage.getEString(), "property", null, 1, 1,
				VariableDereference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builtInFunctionEClass, BuiltInFunction.class, "BuiltInFunction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryOpEClass, BinaryOp.class, "BinaryOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOp_Lhs(), this.getExpression(), null, "lhs", null, 1, 1, BinaryOp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getBinaryOp_Rhs(), this.getExpression(), null, "rhs", null, 1, 1, BinaryOp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(equalityOpEClass, EqualityOp.class, "EqualityOp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEqualityOp_Op(), this.getEQUALITY_OPS(), "op", null, 1, 1, EqualityOp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonOpEClass, ComparisonOp.class, "ComparisonOp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparisonOp_Op(), this.getCOMPARISON_OPS(), "op", null, 1, 1, ComparisonOp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalOpEClass, LogicalOp.class, "LogicalOp", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(subtractionEClass, Subtraction.class, "Subtraction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryOpEClass, UnaryOp.class, "UnaryOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryOp_Rhs(), this.getExpression(), null, "rhs", null, 1, 1, UnaryOp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(negationEClass, Negation.class, "Negation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(permissioN_TYPEEEnum, d.fe.up.pt.cicd.metamodel.CICD.PERMISSION_TYPE.class, "PERMISSION_TYPE");
		addEEnumLiteral(permissioN_TYPEEEnum, d.fe.up.pt.cicd.metamodel.CICD.PERMISSION_TYPE.READ);
		addEEnumLiteral(permissioN_TYPEEEnum, d.fe.up.pt.cicd.metamodel.CICD.PERMISSION_TYPE.WRITE);
		addEEnumLiteral(permissioN_TYPEEEnum, d.fe.up.pt.cicd.metamodel.CICD.PERMISSION_TYPE.NONE);

		initEEnum(shelL_TYPEEEnum, d.fe.up.pt.cicd.metamodel.CICD.SHELL_TYPE.class, "SHELL_TYPE");
		addEEnumLiteral(shelL_TYPEEEnum, d.fe.up.pt.cicd.metamodel.CICD.SHELL_TYPE.BASH);

		initEEnum(inpuT_TYPEEEnum, d.fe.up.pt.cicd.metamodel.CICD.INPUT_TYPE.class, "INPUT_TYPE");
		addEEnumLiteral(inpuT_TYPEEEnum, d.fe.up.pt.cicd.metamodel.CICD.INPUT_TYPE.STRING);
		addEEnumLiteral(inpuT_TYPEEEnum, d.fe.up.pt.cicd.metamodel.CICD.INPUT_TYPE.NUMBER);
		addEEnumLiteral(inpuT_TYPEEEnum, d.fe.up.pt.cicd.metamodel.CICD.INPUT_TYPE.BOOLEAN);
		addEEnumLiteral(inpuT_TYPEEEnum, d.fe.up.pt.cicd.metamodel.CICD.INPUT_TYPE.SECRET);
		addEEnumLiteral(inpuT_TYPEEEnum, d.fe.up.pt.cicd.metamodel.CICD.INPUT_TYPE.CHOICE);

		initEEnum(equalitY_OPSEEnum, d.fe.up.pt.cicd.metamodel.CICD.EQUALITY_OPS.class, "EQUALITY_OPS");
		addEEnumLiteral(equalitY_OPSEEnum, d.fe.up.pt.cicd.metamodel.CICD.EQUALITY_OPS.EQUALS);
		addEEnumLiteral(equalitY_OPSEEnum, d.fe.up.pt.cicd.metamodel.CICD.EQUALITY_OPS.NOT_EQUALS);

		initEEnum(comparisoN_OPSEEnum, d.fe.up.pt.cicd.metamodel.CICD.COMPARISON_OPS.class, "COMPARISON_OPS");
		addEEnumLiteral(comparisoN_OPSEEnum, d.fe.up.pt.cicd.metamodel.CICD.COMPARISON_OPS.GT);
		addEEnumLiteral(comparisoN_OPSEEnum, d.fe.up.pt.cicd.metamodel.CICD.COMPARISON_OPS.GTE);
		addEEnumLiteral(comparisoN_OPSEEnum, d.fe.up.pt.cicd.metamodel.CICD.COMPARISON_OPS.LT);
		addEEnumLiteral(comparisoN_OPSEEnum, d.fe.up.pt.cicd.metamodel.CICD.COMPARISON_OPS.LTE);

		initEEnum(variablE_CONTEXTSEEnum, d.fe.up.pt.cicd.metamodel.CICD.VARIABLE_CONTEXTS.class, "VARIABLE_CONTEXTS");
		addEEnumLiteral(variablE_CONTEXTSEEnum, d.fe.up.pt.cicd.metamodel.CICD.VARIABLE_CONTEXTS.ENV);
		addEEnumLiteral(variablE_CONTEXTSEEnum, d.fe.up.pt.cicd.metamodel.CICD.VARIABLE_CONTEXTS.PARAMS);

		// Create resource
		createResource(eNS_URI);
	}

} //CICDPackageImpl
