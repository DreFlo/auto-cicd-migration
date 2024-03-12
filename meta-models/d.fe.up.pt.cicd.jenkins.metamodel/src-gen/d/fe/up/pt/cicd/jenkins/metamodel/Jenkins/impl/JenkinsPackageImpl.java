/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractAgent;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractPipelineExecutionBlock;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStep;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.And;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AnyAgent;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BinaryOp;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BooleanLiteral;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ComparisonOp;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Concat;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalChildStep;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalStep;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerAgent;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DoubleLiteral;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EqualityOp;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Expression;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.IntegerLiteral;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsContext;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsFactory;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.LabelAgent;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Literal;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.LogicalOp;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixAxis;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixCombination;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixStage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MultipleNestedWhen;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Negation;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NestedStage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NestedWhen;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NodeAgent;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NoneAgent;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Or;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ParallelNestedStage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.PollingTrigger;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ScheduledTrigger;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ScriptedBlock;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SequentialNestedStage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SingleNestedWhen;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StageChildStep;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Step;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StepStage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StringLiteral;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Tool;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Trigger;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.UnaryOp;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.UpstreamTrigger;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Value;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Variable;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.VariableDereference;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.When;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenAllOf;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenAnyOf;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenBranch;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenBuildingTag;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangeRequest;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangelog;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangeset;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEnvironment;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEquals;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenExpression;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenNot;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTag;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTriggeredBy;

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
public class JenkinsPackageImpl extends EPackageImpl implements JenkinsPackage {
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
	private EClass abstractPipelineExecutionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelNestedStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequentialNestedStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrixStageEClass = null;

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
	private EClass stepStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageChildStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalChildStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptedBlockEClass = null;

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
	private EClass abstractAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noneAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerAgentEClass = null;

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
	private EClass expressionEClass = null;

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
	private EClass jenkinsContextEClass = null;

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
	private EClass assignmentEClass = null;

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
	private EClass binaryOpEClass = null;

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
	private EClass triggerEClass = null;

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
	private EClass pollingTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upstreamTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenBranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenChangesetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenChangeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenBuildingTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenChangelogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenEqualsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedWhenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleNestedWhenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleNestedWhenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenNotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenAnyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenAllOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenTriggeredByEClass = null;

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
	private EEnum supporteD_TOOLSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparatorsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changE_REQUEST_MATCHEREEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wheN_EVALUATION_TIMESEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jenkinS_CONTEXTSEEnum = null;

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
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JenkinsPackageImpl() {
		super(eNS_URI, JenkinsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JenkinsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JenkinsPackage init() {
		if (isInited)
			return (JenkinsPackage) EPackage.Registry.INSTANCE.getEPackage(JenkinsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJenkinsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JenkinsPackageImpl theJenkinsPackage = registeredJenkinsPackage instanceof JenkinsPackageImpl
				? (JenkinsPackageImpl) registeredJenkinsPackage
				: new JenkinsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theJenkinsPackage.createPackageContents();

		// Initialize created meta-data
		theJenkinsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJenkinsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JenkinsPackage.eNS_URI, theJenkinsPackage);
		return theJenkinsPackage;
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
	public EReference getPipeline_Stages() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Agent() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_EnvironmentVariables() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Triggers() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Tools() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractPipelineExecutionBlock() {
		return abstractPipelineExecutionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractStage() {
		return abstractStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractStage_Name() {
		return (EAttribute) abstractStageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractStage_Agent() {
		return (EReference) abstractStageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractStage_Conditions() {
		return (EReference) abstractStageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractStage_EnvironmentVariables() {
		return (EReference) abstractStageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractStage_Whens() {
		return (EReference) abstractStageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractStage_WhenEvaluationTime() {
		return (EAttribute) abstractStageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNestedStage() {
		return nestedStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNestedStage_Stages() {
		return (EReference) nestedStageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParallelNestedStage() {
		return parallelNestedStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequentialNestedStage() {
		return sequentialNestedStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatrixStage() {
		return matrixStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrixStage_Axes() {
		return (EReference) matrixStageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrixStage_Includes() {
		return (EReference) matrixStageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatrixStage_Excludes() {
		return (EReference) matrixStageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatrixStage_FailFast() {
		return (EAttribute) matrixStageEClass.getEStructuralFeatures().get(3);
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
	public EReference getMatrixCombination_Entries() {
		return (EReference) matrixCombinationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStepStage() {
		return stepStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStepStage_Steps() {
		return (EReference) stepStageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractStep() {
		return abstractStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStageChildStep() {
		return stageChildStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalChildStep() {
		return conditionalChildStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScriptedBlock() {
		return scriptedBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScriptedBlock_Steps() {
		return (EReference) scriptedBlockEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getStep_Command() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Arguments() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(1);
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
	public EClass getAbstractAgent() {
		return abstractAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoneAgent() {
		return noneAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnyAgent() {
		return anyAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelAgent() {
		return labelAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelAgent_Labels() {
		return (EReference) labelAgentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeAgent() {
		return nodeAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeAgent_CustomWorkspace() {
		return (EAttribute) nodeAgentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDockerAgent() {
		return dockerAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDockerAgent_Docker() {
		return (EReference) dockerAgentEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getDockerContainer_Image() {
		return (EAttribute) dockerContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerContainer_Label() {
		return (EAttribute) dockerContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerContainer_Args() {
		return (EAttribute) dockerContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerContainer_RegistryURL() {
		return (EAttribute) dockerContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDockerContainer_RegistryCredentialsId() {
		return (EAttribute) dockerContainerEClass.getEStructuralFeatures().get(4);
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
	public EClass getJenkinsContext() {
		return jenkinsContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJenkinsContext_Name() {
		return (EAttribute) jenkinsContextEClass.getEStructuralFeatures().get(0);
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
	public EClass getUnaryOp() {
		return unaryOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryOp_ChildExpr() {
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
	public EClass getTrigger() {
		return triggerEClass;
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
	public EAttribute getScheduledTrigger_Cron() {
		return (EAttribute) scheduledTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPollingTrigger() {
		return pollingTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPollingTrigger_Cron() {
		return (EAttribute) pollingTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpstreamTrigger() {
		return upstreamTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpstreamTrigger_Jobs() {
		return (EAttribute) upstreamTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTool() {
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTool_Tool() {
		return (EAttribute) toolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTool_Version() {
		return (EAttribute) toolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhen() {
		return whenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhenComparison() {
		return whenComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWhenComparison_Pattern() {
		return (EAttribute) whenComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWhenComparison_Comparator() {
		return (EAttribute) whenComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWhenComparison_CaseSensitive() {
		return (EAttribute) whenComparisonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhenBranch() {
		return whenBranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhenChangeset() {
		return whenChangesetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhenTag() {
		return whenTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhenChangeRequest() {
		return whenChangeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWhenChangeRequest_Matcher() {
		return (EAttribute) whenChangeRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhenBuildingTag() {
		return whenBuildingTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhenChangelog() {
		return whenChangelogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhenEquals() {
		return whenEqualsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhenEquals_Expected() {
		return (EReference) whenEqualsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhenEquals_Actual() {
		return (EReference) whenEqualsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhenEnvironment() {
		return whenEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWhenEnvironment_Name() {
		return (EAttribute) whenEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWhenEnvironment_Value() {
		return (EAttribute) whenEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhenExpression() {
		return whenExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhenExpression_Expression() {
		return (EReference) whenExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNestedWhen() {
		return nestedWhenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleNestedWhen() {
		return singleNestedWhenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleNestedWhen_NestedWhen() {
		return (EReference) singleNestedWhenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultipleNestedWhen() {
		return multipleNestedWhenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultipleNestedWhen_NestedWhens() {
		return (EReference) multipleNestedWhenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhenNot() {
		return whenNotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhenAnyOf() {
		return whenAnyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhenAllOf() {
		return whenAllOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhenTriggeredBy() {
		return whenTriggeredByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWhenTriggeredBy_Cause() {
		return (EAttribute) whenTriggeredByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWhenTriggeredBy_Detail() {
		return (EAttribute) whenTriggeredByEClass.getEStructuralFeatures().get(1);
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
	public EEnum getSUPPORTED_TOOLS() {
		return supporteD_TOOLSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCOMPARATORS() {
		return comparatorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCHANGE_REQUEST_MATCHER() {
		return changE_REQUEST_MATCHEREEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWHEN_EVALUATION_TIMES() {
		return wheN_EVALUATION_TIMESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJENKINS_CONTEXTS() {
		return jenkinS_CONTEXTSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JenkinsFactory getJenkinsFactory() {
		return (JenkinsFactory) getEFactoryInstance();
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
		pipelineEClass = createEClass(PIPELINE);
		createEReference(pipelineEClass, PIPELINE__STAGES);
		createEReference(pipelineEClass, PIPELINE__AGENT);
		createEReference(pipelineEClass, PIPELINE__ENVIRONMENT_VARIABLES);
		createEReference(pipelineEClass, PIPELINE__TRIGGERS);
		createEReference(pipelineEClass, PIPELINE__TOOLS);

		abstractPipelineExecutionBlockEClass = createEClass(ABSTRACT_PIPELINE_EXECUTION_BLOCK);

		abstractStageEClass = createEClass(ABSTRACT_STAGE);
		createEAttribute(abstractStageEClass, ABSTRACT_STAGE__NAME);
		createEReference(abstractStageEClass, ABSTRACT_STAGE__AGENT);
		createEReference(abstractStageEClass, ABSTRACT_STAGE__CONDITIONS);
		createEReference(abstractStageEClass, ABSTRACT_STAGE__ENVIRONMENT_VARIABLES);
		createEReference(abstractStageEClass, ABSTRACT_STAGE__WHENS);
		createEAttribute(abstractStageEClass, ABSTRACT_STAGE__WHEN_EVALUATION_TIME);

		nestedStageEClass = createEClass(NESTED_STAGE);
		createEReference(nestedStageEClass, NESTED_STAGE__STAGES);

		parallelNestedStageEClass = createEClass(PARALLEL_NESTED_STAGE);

		sequentialNestedStageEClass = createEClass(SEQUENTIAL_NESTED_STAGE);

		matrixStageEClass = createEClass(MATRIX_STAGE);
		createEReference(matrixStageEClass, MATRIX_STAGE__AXES);
		createEReference(matrixStageEClass, MATRIX_STAGE__INCLUDES);
		createEReference(matrixStageEClass, MATRIX_STAGE__EXCLUDES);
		createEAttribute(matrixStageEClass, MATRIX_STAGE__FAIL_FAST);

		matrixAxisEClass = createEClass(MATRIX_AXIS);
		createEAttribute(matrixAxisEClass, MATRIX_AXIS__NAME);
		createEReference(matrixAxisEClass, MATRIX_AXIS__CELLS);

		matrixCombinationEClass = createEClass(MATRIX_COMBINATION);
		createEReference(matrixCombinationEClass, MATRIX_COMBINATION__ENTRIES);

		stepStageEClass = createEClass(STEP_STAGE);
		createEReference(stepStageEClass, STEP_STAGE__STEPS);

		abstractStepEClass = createEClass(ABSTRACT_STEP);

		stageChildStepEClass = createEClass(STAGE_CHILD_STEP);

		conditionalChildStepEClass = createEClass(CONDITIONAL_CHILD_STEP);

		scriptedBlockEClass = createEClass(SCRIPTED_BLOCK);
		createEReference(scriptedBlockEClass, SCRIPTED_BLOCK__STEPS);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__COMMAND);
		createEAttribute(stepEClass, STEP__ARGUMENTS);

		conditionalStepEClass = createEClass(CONDITIONAL_STEP);
		createEReference(conditionalStepEClass, CONDITIONAL_STEP__IF_CONDITION);
		createEReference(conditionalStepEClass, CONDITIONAL_STEP__THEN_RUN);
		createEReference(conditionalStepEClass, CONDITIONAL_STEP__ELSE_RUN);

		abstractAgentEClass = createEClass(ABSTRACT_AGENT);

		noneAgentEClass = createEClass(NONE_AGENT);

		anyAgentEClass = createEClass(ANY_AGENT);

		labelAgentEClass = createEClass(LABEL_AGENT);
		createEReference(labelAgentEClass, LABEL_AGENT__LABELS);

		nodeAgentEClass = createEClass(NODE_AGENT);
		createEAttribute(nodeAgentEClass, NODE_AGENT__CUSTOM_WORKSPACE);

		dockerAgentEClass = createEClass(DOCKER_AGENT);
		createEReference(dockerAgentEClass, DOCKER_AGENT__DOCKER);

		dockerContainerEClass = createEClass(DOCKER_CONTAINER);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__IMAGE);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__LABEL);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__ARGS);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__REGISTRY_URL);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__REGISTRY_CREDENTIALS_ID);

		expressionEClass = createEClass(EXPRESSION);

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

		jenkinsContextEClass = createEClass(JENKINS_CONTEXT);
		createEAttribute(jenkinsContextEClass, JENKINS_CONTEXT__NAME);

		variableDereferenceEClass = createEClass(VARIABLE_DEREFERENCE);
		createEReference(variableDereferenceEClass, VARIABLE_DEREFERENCE__VARIABLE);
		createEAttribute(variableDereferenceEClass, VARIABLE_DEREFERENCE__PROPERTY);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__KEY);
		createEReference(assignmentEClass, ASSIGNMENT__VALUE);

		concatEClass = createEClass(CONCAT);
		createEReference(concatEClass, CONCAT__EXPRESSIONS);

		binaryOpEClass = createEClass(BINARY_OP);
		createEReference(binaryOpEClass, BINARY_OP__LHS);
		createEReference(binaryOpEClass, BINARY_OP__RHS);

		unaryOpEClass = createEClass(UNARY_OP);
		createEReference(unaryOpEClass, UNARY_OP__CHILD_EXPR);

		negationEClass = createEClass(NEGATION);

		equalityOpEClass = createEClass(EQUALITY_OP);
		createEAttribute(equalityOpEClass, EQUALITY_OP__OP);

		comparisonOpEClass = createEClass(COMPARISON_OP);
		createEAttribute(comparisonOpEClass, COMPARISON_OP__OP);

		logicalOpEClass = createEClass(LOGICAL_OP);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);

		triggerEClass = createEClass(TRIGGER);

		scheduledTriggerEClass = createEClass(SCHEDULED_TRIGGER);
		createEAttribute(scheduledTriggerEClass, SCHEDULED_TRIGGER__CRON);

		pollingTriggerEClass = createEClass(POLLING_TRIGGER);
		createEAttribute(pollingTriggerEClass, POLLING_TRIGGER__CRON);

		upstreamTriggerEClass = createEClass(UPSTREAM_TRIGGER);
		createEAttribute(upstreamTriggerEClass, UPSTREAM_TRIGGER__JOBS);

		toolEClass = createEClass(TOOL);
		createEAttribute(toolEClass, TOOL__TOOL);
		createEAttribute(toolEClass, TOOL__VERSION);

		whenEClass = createEClass(WHEN);

		whenComparisonEClass = createEClass(WHEN_COMPARISON);
		createEAttribute(whenComparisonEClass, WHEN_COMPARISON__PATTERN);
		createEAttribute(whenComparisonEClass, WHEN_COMPARISON__COMPARATOR);
		createEAttribute(whenComparisonEClass, WHEN_COMPARISON__CASE_SENSITIVE);

		whenBranchEClass = createEClass(WHEN_BRANCH);

		whenChangesetEClass = createEClass(WHEN_CHANGESET);

		whenTagEClass = createEClass(WHEN_TAG);

		whenChangeRequestEClass = createEClass(WHEN_CHANGE_REQUEST);
		createEAttribute(whenChangeRequestEClass, WHEN_CHANGE_REQUEST__MATCHER);

		whenBuildingTagEClass = createEClass(WHEN_BUILDING_TAG);

		whenChangelogEClass = createEClass(WHEN_CHANGELOG);

		whenEqualsEClass = createEClass(WHEN_EQUALS);
		createEReference(whenEqualsEClass, WHEN_EQUALS__EXPECTED);
		createEReference(whenEqualsEClass, WHEN_EQUALS__ACTUAL);

		whenEnvironmentEClass = createEClass(WHEN_ENVIRONMENT);
		createEAttribute(whenEnvironmentEClass, WHEN_ENVIRONMENT__NAME);
		createEAttribute(whenEnvironmentEClass, WHEN_ENVIRONMENT__VALUE);

		whenExpressionEClass = createEClass(WHEN_EXPRESSION);
		createEReference(whenExpressionEClass, WHEN_EXPRESSION__EXPRESSION);

		nestedWhenEClass = createEClass(NESTED_WHEN);

		singleNestedWhenEClass = createEClass(SINGLE_NESTED_WHEN);
		createEReference(singleNestedWhenEClass, SINGLE_NESTED_WHEN__NESTED_WHEN);

		multipleNestedWhenEClass = createEClass(MULTIPLE_NESTED_WHEN);
		createEReference(multipleNestedWhenEClass, MULTIPLE_NESTED_WHEN__NESTED_WHENS);

		whenNotEClass = createEClass(WHEN_NOT);

		whenAnyOfEClass = createEClass(WHEN_ANY_OF);

		whenAllOfEClass = createEClass(WHEN_ALL_OF);

		whenTriggeredByEClass = createEClass(WHEN_TRIGGERED_BY);
		createEAttribute(whenTriggeredByEClass, WHEN_TRIGGERED_BY__CAUSE);
		createEAttribute(whenTriggeredByEClass, WHEN_TRIGGERED_BY__DETAIL);

		// Create enums
		equalitY_OPSEEnum = createEEnum(EQUALITY_OPS);
		comparisoN_OPSEEnum = createEEnum(COMPARISON_OPS);
		supporteD_TOOLSEEnum = createEEnum(SUPPORTED_TOOLS);
		comparatorsEEnum = createEEnum(COMPARATORS);
		changE_REQUEST_MATCHEREEnum = createEEnum(CHANGE_REQUEST_MATCHER);
		wheN_EVALUATION_TIMESEEnum = createEEnum(WHEN_EVALUATION_TIMES);
		jenkinS_CONTEXTSEEnum = createEEnum(JENKINS_CONTEXTS);
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
		abstractStageEClass.getESuperTypes().add(this.getAbstractPipelineExecutionBlock());
		nestedStageEClass.getESuperTypes().add(this.getAbstractStage());
		parallelNestedStageEClass.getESuperTypes().add(this.getNestedStage());
		sequentialNestedStageEClass.getESuperTypes().add(this.getNestedStage());
		matrixStageEClass.getESuperTypes().add(this.getSequentialNestedStage());
		stepStageEClass.getESuperTypes().add(this.getAbstractStage());
		abstractStepEClass.getESuperTypes().add(this.getAbstractPipelineExecutionBlock());
		stageChildStepEClass.getESuperTypes().add(this.getAbstractStep());
		conditionalChildStepEClass.getESuperTypes().add(this.getAbstractStep());
		scriptedBlockEClass.getESuperTypes().add(this.getStageChildStep());
		stepEClass.getESuperTypes().add(this.getStageChildStep());
		stepEClass.getESuperTypes().add(this.getConditionalChildStep());
		conditionalStepEClass.getESuperTypes().add(this.getConditionalChildStep());
		noneAgentEClass.getESuperTypes().add(this.getAbstractAgent());
		anyAgentEClass.getESuperTypes().add(this.getAbstractAgent());
		labelAgentEClass.getESuperTypes().add(this.getAbstractAgent());
		nodeAgentEClass.getESuperTypes().add(this.getLabelAgent());
		dockerAgentEClass.getESuperTypes().add(this.getLabelAgent());
		valueEClass.getESuperTypes().add(this.getExpression());
		literalEClass.getESuperTypes().add(this.getValue());
		stringLiteralEClass.getESuperTypes().add(this.getLiteral());
		integerLiteralEClass.getESuperTypes().add(this.getLiteral());
		doubleLiteralEClass.getESuperTypes().add(this.getLiteral());
		booleanLiteralEClass.getESuperTypes().add(this.getLiteral());
		variableEClass.getESuperTypes().add(this.getValue());
		jenkinsContextEClass.getESuperTypes().add(this.getValue());
		variableDereferenceEClass.getESuperTypes().add(this.getExpression());
		concatEClass.getESuperTypes().add(this.getExpression());
		binaryOpEClass.getESuperTypes().add(this.getExpression());
		unaryOpEClass.getESuperTypes().add(this.getExpression());
		negationEClass.getESuperTypes().add(this.getUnaryOp());
		equalityOpEClass.getESuperTypes().add(this.getBinaryOp());
		comparisonOpEClass.getESuperTypes().add(this.getBinaryOp());
		logicalOpEClass.getESuperTypes().add(this.getBinaryOp());
		andEClass.getESuperTypes().add(this.getLogicalOp());
		orEClass.getESuperTypes().add(this.getLogicalOp());
		scheduledTriggerEClass.getESuperTypes().add(this.getTrigger());
		pollingTriggerEClass.getESuperTypes().add(this.getTrigger());
		upstreamTriggerEClass.getESuperTypes().add(this.getTrigger());
		whenComparisonEClass.getESuperTypes().add(this.getWhen());
		whenBranchEClass.getESuperTypes().add(this.getWhenComparison());
		whenChangesetEClass.getESuperTypes().add(this.getWhenComparison());
		whenTagEClass.getESuperTypes().add(this.getWhenComparison());
		whenChangeRequestEClass.getESuperTypes().add(this.getWhenComparison());
		whenBuildingTagEClass.getESuperTypes().add(this.getWhen());
		whenChangelogEClass.getESuperTypes().add(this.getWhen());
		whenEqualsEClass.getESuperTypes().add(this.getWhen());
		whenEnvironmentEClass.getESuperTypes().add(this.getWhen());
		whenExpressionEClass.getESuperTypes().add(this.getWhen());
		nestedWhenEClass.getESuperTypes().add(this.getWhen());
		singleNestedWhenEClass.getESuperTypes().add(this.getNestedWhen());
		multipleNestedWhenEClass.getESuperTypes().add(this.getNestedWhen());
		whenNotEClass.getESuperTypes().add(this.getSingleNestedWhen());
		whenAnyOfEClass.getESuperTypes().add(this.getMultipleNestedWhen());
		whenAllOfEClass.getESuperTypes().add(this.getMultipleNestedWhen());
		whenTriggeredByEClass.getESuperTypes().add(this.getWhen());

		// Initialize classes, features, and operations; add parameters
		initEClass(pipelineEClass, Pipeline.class, "Pipeline", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipeline_Stages(), this.getAbstractStage(), null, "stages", null, 1, -1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Agent(), this.getAbstractAgent(), null, "agent", null, 1, 1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_EnvironmentVariables(), this.getAssignment(), null, "environmentVariables", null, 0,
				-1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Triggers(), this.getTrigger(), null, "triggers", null, 0, -1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Tools(), this.getTool(), null, "tools", null, 0, -1, Pipeline.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(abstractPipelineExecutionBlockEClass, AbstractPipelineExecutionBlock.class,
				"AbstractPipelineExecutionBlock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractStageEClass, AbstractStage.class, "AbstractStage", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractStage_Name(), ecorePackage.getEString(), "name", null, 1, 1, AbstractStage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStage_Agent(), this.getAbstractAgent(), null, "agent", null, 1, 1,
				AbstractStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStage_Conditions(), this.getWhen(), null, "conditions", null, 0, -1,
				AbstractStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStage_EnvironmentVariables(), this.getAssignment(), null, "environmentVariables",
				null, 0, -1, AbstractStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStage_Whens(), this.getWhen(), null, "whens", null, 0, -1, AbstractStage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractStage_WhenEvaluationTime(), this.getWHEN_EVALUATION_TIMES(), "whenEvaluationTime",
				null, 0, -1, AbstractStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nestedStageEClass, NestedStage.class, "NestedStage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNestedStage_Stages(), this.getStepStage(), null, "stages", null, 1, -1, NestedStage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelNestedStageEClass, ParallelNestedStage.class, "ParallelNestedStage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequentialNestedStageEClass, SequentialNestedStage.class, "SequentialNestedStage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(matrixStageEClass, MatrixStage.class, "MatrixStage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatrixStage_Axes(), this.getMatrixAxis(), null, "axes", null, 1, -1, MatrixStage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatrixStage_Includes(), this.getMatrixCombination(), null, "includes", null, 0, -1,
				MatrixStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatrixStage_Excludes(), this.getMatrixCombination(), null, "excludes", null, 0, -1,
				MatrixStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrixStage_FailFast(), ecorePackage.getEBooleanObject(), "failFast", null, 0, 1,
				MatrixStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(matrixAxisEClass, MatrixAxis.class, "MatrixAxis", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatrixAxis_Name(), ecorePackage.getEString(), "name", null, 1, 1, MatrixAxis.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatrixAxis_Cells(), this.getExpression(), null, "cells", null, 1, -1, MatrixAxis.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matrixCombinationEClass, MatrixCombination.class, "MatrixCombination", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatrixCombination_Entries(), this.getAssignment(), null, "entries", null, 0, -1,
				MatrixCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepStageEClass, StepStage.class, "StepStage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStepStage_Steps(), this.getStageChildStep(), null, "steps", null, 0, -1, StepStage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractStepEClass, AbstractStep.class, "AbstractStep", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(stageChildStepEClass, StageChildStep.class, "StageChildStep", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalChildStepEClass, ConditionalChildStep.class, "ConditionalChildStep", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scriptedBlockEClass, ScriptedBlock.class, "ScriptedBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScriptedBlock_Steps(), this.getConditionalChildStep(), null, "steps", null, 0, -1,
				ScriptedBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_Command(), ecorePackage.getEString(), "command", null, 1, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Arguments(), ecorePackage.getEString(), "arguments", null, 1, 1, Step.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalStepEClass, ConditionalStep.class, "ConditionalStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalStep_IfCondition(), this.getExpression(), null, "ifCondition", null, 1, 1,
				ConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalStep_ThenRun(), this.getConditionalChildStep(), null, "thenRun", null, 1, -1,
				ConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalStep_ElseRun(), this.getConditionalChildStep(), null, "elseRun", null, 0, -1,
				ConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractAgentEClass, AbstractAgent.class, "AbstractAgent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(noneAgentEClass, NoneAgent.class, "NoneAgent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(anyAgentEClass, AnyAgent.class, "AnyAgent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelAgentEClass, LabelAgent.class, "LabelAgent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelAgent_Labels(), this.getExpression(), null, "labels", null, 0, 1, LabelAgent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeAgentEClass, NodeAgent.class, "NodeAgent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeAgent_CustomWorkspace(), ecorePackage.getEString(), "customWorkspace", null, 0, 1,
				NodeAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dockerAgentEClass, DockerAgent.class, "DockerAgent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDockerAgent_Docker(), this.getDockerContainer(), null, "docker", null, 0, 1,
				DockerAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerContainerEClass, DockerContainer.class, "DockerContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerContainer_Image(), ecorePackage.getEString(), "image", null, 1, 1,
				DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerContainer_Label(), ecorePackage.getEString(), "label", null, 0, 1,
				DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerContainer_Args(), ecorePackage.getEString(), "args", null, 0, 1, DockerContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerContainer_RegistryURL(), ecorePackage.getEString(), "registryURL", null, 0, 1,
				DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerContainer_RegistryCredentialsId(), ecorePackage.getEString(), "registryCredentialsId",
				null, 0, 1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		initEAttribute(getDoubleLiteral_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, DoubleLiteral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteral_Value(), ecorePackage.getEBooleanObject(), "value", null, 1, 1,
				BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jenkinsContextEClass, JenkinsContext.class, "JenkinsContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJenkinsContext_Name(), this.getJENKINS_CONTEXTS(), "name", null, 1, 1, JenkinsContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDereferenceEClass, VariableDereference.class, "VariableDereference", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDereference_Variable(), this.getExpression(), null, "variable", null, 1, 1,
				VariableDereference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableDereference_Property(), ecorePackage.getEString(), "property", null, 1, 1,
				VariableDereference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Map.Entry.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_Key(), this.getVariable(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAssignment_Value(), this.getExpression(), null, "value", null, 1, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concatEClass, Concat.class, "Concat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcat_Expressions(), this.getExpression(), null, "expressions", null, 1, -1, Concat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryOpEClass, BinaryOp.class, "BinaryOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOp_Lhs(), this.getExpression(), null, "lhs", null, 1, 1, BinaryOp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getBinaryOp_Rhs(), this.getExpression(), null, "rhs", null, 1, 1, BinaryOp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(unaryOpEClass, UnaryOp.class, "UnaryOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryOp_ChildExpr(), this.getExpression(), null, "childExpr", null, 1, 1, UnaryOp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negationEClass, Negation.class, "Negation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

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

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scheduledTriggerEClass, ScheduledTrigger.class, "ScheduledTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduledTrigger_Cron(), ecorePackage.getEString(), "cron", null, 1, 1,
				ScheduledTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(pollingTriggerEClass, PollingTrigger.class, "PollingTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPollingTrigger_Cron(), ecorePackage.getEString(), "cron", null, 1, 1, PollingTrigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(upstreamTriggerEClass, UpstreamTrigger.class, "UpstreamTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpstreamTrigger_Jobs(), ecorePackage.getEString(), "jobs", null, 1, -1, UpstreamTrigger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEClass, Tool.class, "Tool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTool_Tool(), this.getSUPPORTED_TOOLS(), "tool", null, 1, 1, Tool.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Version(), ecorePackage.getEString(), "version", null, 1, 1, Tool.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whenEClass, When.class, "When", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whenComparisonEClass, WhenComparison.class, "WhenComparison", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhenComparison_Pattern(), ecorePackage.getEString(), "pattern", null, 1, 1,
				WhenComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhenComparison_Comparator(), this.getCOMPARATORS(), "comparator", "EQUALS", 1, 1,
				WhenComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhenComparison_CaseSensitive(), ecorePackage.getEBooleanObject(), "caseSensitive", "false", 1,
				1, WhenComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(whenBranchEClass, WhenBranch.class, "WhenBranch", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(whenChangesetEClass, WhenChangeset.class, "WhenChangeset", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(whenTagEClass, WhenTag.class, "WhenTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whenChangeRequestEClass, WhenChangeRequest.class, "WhenChangeRequest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhenChangeRequest_Matcher(), this.getCHANGE_REQUEST_MATCHER(), "matcher", null, 1, 1,
				WhenChangeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(whenBuildingTagEClass, WhenBuildingTag.class, "WhenBuildingTag", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(whenChangelogEClass, WhenChangelog.class, "WhenChangelog", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(whenEqualsEClass, WhenEquals.class, "WhenEquals", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhenEquals_Expected(), this.getLiteral(), null, "expected", null, 1, 1, WhenEquals.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhenEquals_Actual(), this.getVariable(), null, "actual", null, 1, 1, WhenEquals.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whenEnvironmentEClass, WhenEnvironment.class, "WhenEnvironment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhenEnvironment_Name(), ecorePackage.getEString(), "name", null, 1, 1, WhenEnvironment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhenEnvironment_Value(), ecorePackage.getEString(), "value", null, 1, 1,
				WhenEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(whenExpressionEClass, WhenExpression.class, "WhenExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhenExpression_Expression(), this.getExpression(), null, "expression", null, 1, 1,
				WhenExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nestedWhenEClass, NestedWhen.class, "NestedWhen", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleNestedWhenEClass, SingleNestedWhen.class, "SingleNestedWhen", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleNestedWhen_NestedWhen(), this.getWhen(), null, "nestedWhen", null, 1, 1,
				SingleNestedWhen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleNestedWhenEClass, MultipleNestedWhen.class, "MultipleNestedWhen", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultipleNestedWhen_NestedWhens(), this.getWhen(), null, "nestedWhens", null, 1, -1,
				MultipleNestedWhen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whenNotEClass, WhenNot.class, "WhenNot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whenAnyOfEClass, WhenAnyOf.class, "WhenAnyOf", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(whenAllOfEClass, WhenAllOf.class, "WhenAllOf", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(whenTriggeredByEClass, WhenTriggeredBy.class, "WhenTriggeredBy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhenTriggeredBy_Cause(), ecorePackage.getEString(), "cause", null, 1, 1,
				WhenTriggeredBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhenTriggeredBy_Detail(), ecorePackage.getEString(), "detail", null, 0, 1,
				WhenTriggeredBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(equalitY_OPSEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EQUALITY_OPS.class, "EQUALITY_OPS");
		addEEnumLiteral(equalitY_OPSEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EQUALITY_OPS.EQUALS);
		addEEnumLiteral(equalitY_OPSEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EQUALITY_OPS.NOT_EQUALS);

		initEEnum(comparisoN_OPSEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARISON_OPS.class,
				"COMPARISON_OPS");
		addEEnumLiteral(comparisoN_OPSEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARISON_OPS.GT);
		addEEnumLiteral(comparisoN_OPSEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARISON_OPS.GTE);
		addEEnumLiteral(comparisoN_OPSEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARISON_OPS.LT);
		addEEnumLiteral(comparisoN_OPSEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARISON_OPS.LTE);

		initEEnum(supporteD_TOOLSEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SUPPORTED_TOOLS.class,
				"SUPPORTED_TOOLS");
		addEEnumLiteral(supporteD_TOOLSEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SUPPORTED_TOOLS.MAVEN);
		addEEnumLiteral(supporteD_TOOLSEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SUPPORTED_TOOLS.JDK);
		addEEnumLiteral(supporteD_TOOLSEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SUPPORTED_TOOLS.GRADLE);

		initEEnum(comparatorsEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARATORS.class, "COMPARATORS");
		addEEnumLiteral(comparatorsEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARATORS.EQUALS);
		addEEnumLiteral(comparatorsEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARATORS.REGEXP);
		addEEnumLiteral(comparatorsEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARATORS.GLOB);

		initEEnum(changE_REQUEST_MATCHEREEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER.class,
				"CHANGE_REQUEST_MATCHER");
		addEEnumLiteral(changE_REQUEST_MATCHEREEnum,
				d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER.ID);
		addEEnumLiteral(changE_REQUEST_MATCHEREEnum,
				d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER.TARGET);
		addEEnumLiteral(changE_REQUEST_MATCHEREEnum,
				d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER.BRANCH);
		addEEnumLiteral(changE_REQUEST_MATCHEREEnum,
				d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER.FORK);
		addEEnumLiteral(changE_REQUEST_MATCHEREEnum,
				d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER.URL);
		addEEnumLiteral(changE_REQUEST_MATCHEREEnum,
				d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER.TITLE);
		addEEnumLiteral(changE_REQUEST_MATCHEREEnum,
				d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER.AUTHOR);
		addEEnumLiteral(changE_REQUEST_MATCHEREEnum,
				d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER.AUTHOR_DISPLAY_NAME);
		addEEnumLiteral(changE_REQUEST_MATCHEREEnum,
				d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER.AUTHOR_EMAIL);

		initEEnum(wheN_EVALUATION_TIMESEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WHEN_EVALUATION_TIMES.class,
				"WHEN_EVALUATION_TIMES");
		addEEnumLiteral(wheN_EVALUATION_TIMESEEnum,
				d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WHEN_EVALUATION_TIMES.AFTER);
		addEEnumLiteral(wheN_EVALUATION_TIMESEEnum,
				d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WHEN_EVALUATION_TIMES.BEFORE_AGENT);
		addEEnumLiteral(wheN_EVALUATION_TIMESEEnum,
				d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WHEN_EVALUATION_TIMES.BEFORE_INPUT);
		addEEnumLiteral(wheN_EVALUATION_TIMESEEnum,
				d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WHEN_EVALUATION_TIMES.BEFORE_OPTIONS);

		initEEnum(jenkinS_CONTEXTSEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JENKINS_CONTEXTS.class,
				"JENKINS_CONTEXTS");
		addEEnumLiteral(jenkinS_CONTEXTSEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JENKINS_CONTEXTS.ENV);
		addEEnumLiteral(jenkinS_CONTEXTSEEnum, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JENKINS_CONTEXTS.PARAMS);

		// Create resource
		createResource(eNS_URI);
	}

} //JenkinsPackageImpl
