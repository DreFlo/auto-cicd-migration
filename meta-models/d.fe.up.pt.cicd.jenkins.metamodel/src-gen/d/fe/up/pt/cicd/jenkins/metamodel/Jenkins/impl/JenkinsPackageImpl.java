/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractAgent;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractPipelineExecutionBlock;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AnyAgent;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Expression;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsFactory;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NoneAgent;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Parallel;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Stage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Step;

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
	private EClass parallelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageEClass = null;

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
	private EClass optionedAgentEClass = null;

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
	public EReference getPipeline_Begin() {
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
	public EReference getAbstractStage_Next() {
		return (EReference) abstractStageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParallel() {
		return parallelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallel_Stages() {
		return (EReference) parallelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStage() {
		return stageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStage_Steps() {
		return (EReference) stageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStage_Name() {
		return (EAttribute) stageEClass.getEStructuralFeatures().get(1);
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
	public EClass getOptionedAgent() {
		return optionedAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOptionedAgent_Labels() {
		return (EReference) optionedAgentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOptionedAgent_Docker() {
		return (EReference) optionedAgentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOptionedAgent_CustomWorkspace() {
		return (EAttribute) optionedAgentEClass.getEStructuralFeatures().get(2);
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
		createEReference(pipelineEClass, PIPELINE__BEGIN);
		createEReference(pipelineEClass, PIPELINE__AGENT);

		abstractPipelineExecutionBlockEClass = createEClass(ABSTRACT_PIPELINE_EXECUTION_BLOCK);

		abstractStageEClass = createEClass(ABSTRACT_STAGE);
		createEReference(abstractStageEClass, ABSTRACT_STAGE__NEXT);

		parallelEClass = createEClass(PARALLEL);
		createEReference(parallelEClass, PARALLEL__STAGES);

		stageEClass = createEClass(STAGE);
		createEReference(stageEClass, STAGE__STEPS);
		createEAttribute(stageEClass, STAGE__NAME);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__COMMAND);

		abstractAgentEClass = createEClass(ABSTRACT_AGENT);

		noneAgentEClass = createEClass(NONE_AGENT);

		anyAgentEClass = createEClass(ANY_AGENT);

		optionedAgentEClass = createEClass(OPTIONED_AGENT);
		createEReference(optionedAgentEClass, OPTIONED_AGENT__LABELS);
		createEReference(optionedAgentEClass, OPTIONED_AGENT__DOCKER);
		createEAttribute(optionedAgentEClass, OPTIONED_AGENT__CUSTOM_WORKSPACE);

		dockerContainerEClass = createEClass(DOCKER_CONTAINER);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__IMAGE);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__LABEL);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__ARGS);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__REGISTRY_URL);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__REGISTRY_CREDENTIALS_ID);

		expressionEClass = createEClass(EXPRESSION);
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
		parallelEClass.getESuperTypes().add(this.getAbstractStage());
		stageEClass.getESuperTypes().add(this.getAbstractStage());
		stepEClass.getESuperTypes().add(this.getAbstractPipelineExecutionBlock());
		noneAgentEClass.getESuperTypes().add(this.getAbstractAgent());
		anyAgentEClass.getESuperTypes().add(this.getAbstractAgent());
		optionedAgentEClass.getESuperTypes().add(this.getAbstractAgent());

		// Initialize classes, features, and operations; add parameters
		initEClass(pipelineEClass, Pipeline.class, "Pipeline", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipeline_Begin(), this.getAbstractStage(), null, "begin", null, 1, 1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Agent(), this.getAbstractAgent(), null, "agent", null, 1, 1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPipelineExecutionBlockEClass, AbstractPipelineExecutionBlock.class,
				"AbstractPipelineExecutionBlock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractStageEClass, AbstractStage.class, "AbstractStage", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractStage_Next(), this.getAbstractStage(), null, "next", null, 0, 1, AbstractStage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParallel_Stages(), this.getStage(), null, "stages", null, 1, -1, Parallel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stageEClass, Stage.class, "Stage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStage_Steps(), this.getStep(), null, "steps", null, 0, -1, Stage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getStage_Name(), ecorePackage.getEString(), "name", null, 1, 1, Stage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_Command(), ecorePackage.getEString(), "command", null, 1, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractAgentEClass, AbstractAgent.class, "AbstractAgent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(noneAgentEClass, NoneAgent.class, "NoneAgent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(anyAgentEClass, AnyAgent.class, "AnyAgent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(optionedAgentEClass, OptionedAgent.class, "OptionedAgent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionedAgent_Labels(), this.getExpression(), null, "labels", null, 1, 1, OptionedAgent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionedAgent_Docker(), this.getDockerContainer(), null, "docker", null, 0, 1,
				OptionedAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionedAgent_CustomWorkspace(), ecorePackage.getEString(), "customWorkspace", null, 0, 1,
				OptionedAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

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

		// Create resource
		createResource(eNS_URI);
	}

} //JenkinsPackageImpl
