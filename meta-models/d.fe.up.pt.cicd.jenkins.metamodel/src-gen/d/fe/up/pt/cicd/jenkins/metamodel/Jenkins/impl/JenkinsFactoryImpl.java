/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JenkinsFactoryImpl extends EFactoryImpl implements JenkinsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JenkinsFactory init() {
		try {
			JenkinsFactory theJenkinsFactory = (JenkinsFactory) EPackage.Registry.INSTANCE
					.getEFactory(JenkinsPackage.eNS_URI);
			if (theJenkinsFactory != null) {
				return theJenkinsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JenkinsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JenkinsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case JenkinsPackage.PIPELINE:
			return createPipeline();
		case JenkinsPackage.PARALLEL:
			return createParallel();
		case JenkinsPackage.STAGE:
			return createStage();
		case JenkinsPackage.STEP:
			return createStep();
		case JenkinsPackage.CONDITIONAL_STEP:
			return createConditionalStep();
		case JenkinsPackage.NONE_AGENT:
			return createNoneAgent();
		case JenkinsPackage.ANY_AGENT:
			return createAnyAgent();
		case JenkinsPackage.OPTIONED_AGENT:
			return createOptionedAgent();
		case JenkinsPackage.DOCKER_CONTAINER:
			return createDockerContainer();
		case JenkinsPackage.EXPRESSION:
			return createExpression();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pipeline createPipeline() {
		PipelineImpl pipeline = new PipelineImpl();
		return pipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parallel createParallel() {
		ParallelImpl parallel = new ParallelImpl();
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stage createStage() {
		StageImpl stage = new StageImpl();
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalStep createConditionalStep() {
		ConditionalStepImpl conditionalStep = new ConditionalStepImpl();
		return conditionalStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoneAgent createNoneAgent() {
		NoneAgentImpl noneAgent = new NoneAgentImpl();
		return noneAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnyAgent createAnyAgent() {
		AnyAgentImpl anyAgent = new AnyAgentImpl();
		return anyAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionedAgent createOptionedAgent() {
		OptionedAgentImpl optionedAgent = new OptionedAgentImpl();
		return optionedAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockerContainer createDockerContainer() {
		DockerContainerImpl dockerContainer = new DockerContainerImpl();
		return dockerContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JenkinsPackage getJenkinsPackage() {
		return (JenkinsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JenkinsPackage getPackage() {
		return JenkinsPackage.eINSTANCE;
	}

} //JenkinsFactoryImpl
