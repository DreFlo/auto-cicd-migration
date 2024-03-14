/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Branch;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIFactory;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command_Params;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Docker;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Execution_Env;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Linux;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOs;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Orb;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameters;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Store_Artifact;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Tool_Framework;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Trigger;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Attribute;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Unless;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WindowsOrb;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow;

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
	private EClass pipelineEClass = null;

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
	private EClass execution_EnvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linuxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macOsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowsOrbEClass = null;

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
	private EClass commandEClass = null;

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
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tool_FrameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass when_UnlessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass when_AttributeEClass = null;

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
	private EClass branchEClass = null;

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
	private EClass store_ArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass command_ParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wheN_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum brancH_TYPEEEnum = null;

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
	public EReference getPipeline_Orb() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Command() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Workflow() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeline_Job() {
		return (EReference) pipelineEClass.getEStructuralFeatures().get(4);
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
	public EReference getStep_Parameters() {
		return (EReference) stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Name() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_When_attribute() {
		return (EReference) stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_Tool_framework() {
		return (EReference) stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecution_Env() {
		return execution_EnvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecution_Env_Environment() {
		return (EReference) execution_EnvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecution_Env_Step() {
		return (EReference) execution_EnvEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecution_Env_Name() {
		return (EAttribute) execution_EnvEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocker() {
		return dockerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocker_Image() {
		return (EAttribute) dockerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinux() {
		return linuxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinux_Image() {
		return (EAttribute) linuxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMacOs() {
		return macOsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMacOs_Xcode() {
		return (EAttribute) macOsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWindowsOrb() {
		return windowsOrbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWindowsOrb_Executor() {
		return (EAttribute) windowsOrbEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getOrb_Key() {
		return (EAttribute) orbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrb_Value() {
		return (EAttribute) orbEClass.getEStructuralFeatures().get(1);
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
	public EReference getCommand_Step() {
		return (EReference) commandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommand_Command_params() {
		return (EReference) commandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommand_Description() {
		return (EAttribute) commandEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getWorkflow_Version() {
		return (EAttribute) workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_Trigger() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_When_unless() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_Branch() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getEnvironment_Key() {
		return (EAttribute) environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironment_Value() {
		return (EAttribute) environmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameters() {
		return parametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameters_Parameter() {
		return (EAttribute) parametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTool_Framework() {
		return tool_FrameworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTool_Framework_Name() {
		return (EAttribute) tool_FrameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhen_Unless() {
		return when_UnlessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWhen_Unless_Condition() {
		return (EAttribute) when_UnlessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhen_Unless_When_step() {
		return (EReference) when_UnlessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhen_Unless_Unless_step() {
		return (EReference) when_UnlessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhen_Attribute() {
		return when_AttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWhen_Attribute_When_type() {
		return (EAttribute) when_AttributeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getTrigger_Cron() {
		return (EAttribute) triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_Name() {
		return (EAttribute) branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_Branch_type() {
		return (EAttribute) branchEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getJob_Parallelism() {
		return (EAttribute) jobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Store_artifact() {
		return (EReference) jobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_When_unless() {
		return (EReference) jobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Execution_env() {
		return (EReference) jobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Environment() {
		return (EReference) jobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Step() {
		return (EReference) jobEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStore_Artifact() {
		return store_ArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_Artifact_Path() {
		return (EAttribute) store_ArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_Artifact_Destination() {
		return (EAttribute) store_ArtifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommand_Params() {
		return command_ParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommand_Params_Type() {
		return (EAttribute) command_ParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommand_Params_Default() {
		return (EAttribute) command_ParamsEClass.getEStructuralFeatures().get(1);
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
	public EEnum getBRANCH_TYPE() {
		return brancH_TYPEEEnum;
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
		pipelineEClass = createEClass(PIPELINE);
		createEAttribute(pipelineEClass, PIPELINE__VERSION);
		createEReference(pipelineEClass, PIPELINE__ORB);
		createEReference(pipelineEClass, PIPELINE__COMMAND);
		createEReference(pipelineEClass, PIPELINE__WORKFLOW);
		createEReference(pipelineEClass, PIPELINE__JOB);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__PARAMETERS);
		createEAttribute(stepEClass, STEP__NAME);
		createEReference(stepEClass, STEP__WHEN_ATTRIBUTE);
		createEReference(stepEClass, STEP__TOOL_FRAMEWORK);

		execution_EnvEClass = createEClass(EXECUTION_ENV);
		createEReference(execution_EnvEClass, EXECUTION_ENV__ENVIRONMENT);
		createEReference(execution_EnvEClass, EXECUTION_ENV__STEP);
		createEAttribute(execution_EnvEClass, EXECUTION_ENV__NAME);

		dockerEClass = createEClass(DOCKER);
		createEAttribute(dockerEClass, DOCKER__IMAGE);

		linuxEClass = createEClass(LINUX);
		createEAttribute(linuxEClass, LINUX__IMAGE);

		macOsEClass = createEClass(MAC_OS);
		createEAttribute(macOsEClass, MAC_OS__XCODE);

		windowsOrbEClass = createEClass(WINDOWS_ORB);
		createEAttribute(windowsOrbEClass, WINDOWS_ORB__EXECUTOR);

		orbEClass = createEClass(ORB);
		createEAttribute(orbEClass, ORB__KEY);
		createEAttribute(orbEClass, ORB__VALUE);

		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__NAME);
		createEReference(commandEClass, COMMAND__STEP);
		createEReference(commandEClass, COMMAND__COMMAND_PARAMS);
		createEAttribute(commandEClass, COMMAND__DESCRIPTION);

		workflowEClass = createEClass(WORKFLOW);
		createEAttribute(workflowEClass, WORKFLOW__NAME);
		createEAttribute(workflowEClass, WORKFLOW__VERSION);
		createEReference(workflowEClass, WORKFLOW__TRIGGER);
		createEReference(workflowEClass, WORKFLOW__WHEN_UNLESS);
		createEReference(workflowEClass, WORKFLOW__BRANCH);

		environmentEClass = createEClass(ENVIRONMENT);
		createEAttribute(environmentEClass, ENVIRONMENT__KEY);
		createEAttribute(environmentEClass, ENVIRONMENT__VALUE);

		parametersEClass = createEClass(PARAMETERS);
		createEAttribute(parametersEClass, PARAMETERS__PARAMETER);

		tool_FrameworkEClass = createEClass(TOOL_FRAMEWORK);
		createEAttribute(tool_FrameworkEClass, TOOL_FRAMEWORK__NAME);

		when_UnlessEClass = createEClass(WHEN_UNLESS);
		createEAttribute(when_UnlessEClass, WHEN_UNLESS__CONDITION);
		createEReference(when_UnlessEClass, WHEN_UNLESS__WHEN_STEP);
		createEReference(when_UnlessEClass, WHEN_UNLESS__UNLESS_STEP);

		when_AttributeEClass = createEClass(WHEN_ATTRIBUTE);
		createEAttribute(when_AttributeEClass, WHEN_ATTRIBUTE__WHEN_TYPE);

		triggerEClass = createEClass(TRIGGER);
		createEAttribute(triggerEClass, TRIGGER__CRON);

		branchEClass = createEClass(BRANCH);
		createEAttribute(branchEClass, BRANCH__NAME);
		createEAttribute(branchEClass, BRANCH__BRANCH_TYPE);

		jobEClass = createEClass(JOB);
		createEAttribute(jobEClass, JOB__NAME);
		createEAttribute(jobEClass, JOB__PARALLELISM);
		createEReference(jobEClass, JOB__STORE_ARTIFACT);
		createEReference(jobEClass, JOB__WHEN_UNLESS);
		createEReference(jobEClass, JOB__EXECUTION_ENV);
		createEReference(jobEClass, JOB__ENVIRONMENT);
		createEReference(jobEClass, JOB__STEP);

		store_ArtifactEClass = createEClass(STORE_ARTIFACT);
		createEAttribute(store_ArtifactEClass, STORE_ARTIFACT__PATH);
		createEAttribute(store_ArtifactEClass, STORE_ARTIFACT__DESTINATION);

		command_ParamsEClass = createEClass(COMMAND_PARAMS);
		createEAttribute(command_ParamsEClass, COMMAND_PARAMS__TYPE);
		createEAttribute(command_ParamsEClass, COMMAND_PARAMS__DEFAULT);

		// Create enums
		wheN_TYPEEEnum = createEEnum(WHEN_TYPE);
		brancH_TYPEEEnum = createEEnum(BRANCH_TYPE);
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
		dockerEClass.getESuperTypes().add(this.getExecution_Env());
		linuxEClass.getESuperTypes().add(this.getExecution_Env());
		macOsEClass.getESuperTypes().add(this.getExecution_Env());
		windowsOrbEClass.getESuperTypes().add(this.getExecution_Env());

		// Initialize classes, features, and operations; add parameters
		initEClass(pipelineEClass, Pipeline.class, "Pipeline", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPipeline_Version(), ecorePackage.getEString(), "version", null, 0, 1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Orb(), this.getOrb(), null, "orb", null, 0, -1, Pipeline.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPipeline_Command(), this.getCommand(), null, "command", null, 0, -1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Workflow(), this.getWorkflow(), null, "workflow", null, 0, 1, Pipeline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Job(), this.getJob(), null, "job", null, 0, -1, Pipeline.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Parameters(), this.getParameters(), null, "parameters", null, 0, -1, Step.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Name(), ecorePackage.getEString(), "name", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_When_attribute(), this.getWhen_Attribute(), null, "when_attribute", null, 0, 1,
				Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Tool_framework(), this.getTool_Framework(), null, "tool_framework", null, 0, -1,
				Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(execution_EnvEClass, Execution_Env.class, "Execution_Env", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecution_Env_Environment(), this.getEnvironment(), null, "environment", null, 0, -1,
				Execution_Env.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecution_Env_Step(), this.getStep(), null, "step", null, 0, -1, Execution_Env.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_Env_Name(), ecorePackage.getEString(), "name", null, 0, 1, Execution_Env.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerEClass, Docker.class, "Docker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocker_Image(), ecorePackage.getEString(), "image", null, 0, 1, Docker.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linuxEClass, Linux.class, "Linux", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinux_Image(), ecorePackage.getEString(), "image", null, 0, 1, Linux.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(macOsEClass, MacOs.class, "MacOs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMacOs_Xcode(), ecorePackage.getEString(), "xcode", null, 0, 1, MacOs.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(windowsOrbEClass, WindowsOrb.class, "WindowsOrb", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWindowsOrb_Executor(), ecorePackage.getEString(), "executor", null, 0, 1, WindowsOrb.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orbEClass, Orb.class, "Orb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrb_Key(), ecorePackage.getEString(), "key", null, 0, 1, Orb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrb_Value(), ecorePackage.getEString(), "value", null, 0, 1, Orb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_Name(), ecorePackage.getEString(), "name", null, 0, 1, Command.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommand_Step(), this.getStep(), null, "step", null, 0, -1, Command.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCommand_Command_params(), this.getCommand_Params(), null, "command_params", null, 0, 1,
				Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_Description(), ecorePackage.getEString(), "description", null, 0, 1, Command.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflow_Name(), ecorePackage.getEString(), "name", null, 0, 1, Workflow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_Version(), ecorePackage.getEString(), "version", null, 0, 1, Workflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Trigger(), this.getTrigger(), null, "trigger", null, 0, -1, Workflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_When_unless(), this.getWhen_Unless(), null, "when_unless", null, 0, 1,
				Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Branch(), this.getBranch(), null, "branch", null, 0, -1, Workflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironment_Key(), ecorePackage.getEString(), "key", null, 0, 1, Environment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_Value(), ecorePackage.getEString(), "value", null, 0, 1, Environment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametersEClass, Parameters.class, "Parameters", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameters_Parameter(), ecorePackage.getEString(), "parameter", null, 0, 1, Parameters.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tool_FrameworkEClass, Tool_Framework.class, "Tool_Framework", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTool_Framework_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tool_Framework.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(when_UnlessEClass, When_Unless.class, "When_Unless", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhen_Unless_Condition(), ecorePackage.getEString(), "condition", null, 0, 1,
				When_Unless.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getWhen_Unless_When_step(), this.getStep(), null, "when_step", null, 0, -1, When_Unless.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhen_Unless_Unless_step(), this.getStep(), null, "unless_step", null, 0, -1,
				When_Unless.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(when_AttributeEClass, When_Attribute.class, "When_Attribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhen_Attribute_When_type(), this.getWHEN_TYPE(), "when_type", null, 0, 1,
				When_Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrigger_Cron(), ecorePackage.getEString(), "cron", null, 0, 1, Trigger.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBranch_Name(), ecorePackage.getEString(), "name", null, 0, 1, Branch.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Branch_type(), this.getBRANCH_TYPE(), "branch_type", null, 0, 1, Branch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobEClass, Job.class, "Job", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJob_Name(), ecorePackage.getEString(), "name", null, 0, 1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Parallelism(), ecorePackage.getEShort(), "parallelism", null, 0, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Store_artifact(), this.getStore_Artifact(), null, "store_artifact", null, 0, -1,
				Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_When_unless(), this.getWhen_Unless(), null, "when_unless", null, 0, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Execution_env(), this.getExecution_Env(), null, "execution_env", null, 1, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Environment(), this.getEnvironment(), null, "environment", null, 0, -1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Step(), this.getStep(), null, "step", null, 0, -1, Job.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(store_ArtifactEClass, Store_Artifact.class, "Store_Artifact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStore_Artifact_Path(), ecorePackage.getEString(), "path", null, 0, 1, Store_Artifact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_Artifact_Destination(), ecorePackage.getEString(), "destination", null, 0, 1,
				Store_Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(command_ParamsEClass, Command_Params.class, "Command_Params", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_Params_Type(), ecorePackage.getEString(), "type", null, 0, 1, Command_Params.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_Params_Default(), ecorePackage.getEString(), "default", null, 0, 1,
				Command_Params.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(wheN_TYPEEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE.class, "WHEN_TYPE");
		addEEnumLiteral(wheN_TYPEEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE.ON_SUCCESS);
		addEEnumLiteral(wheN_TYPEEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE.ALWAYS);
		addEEnumLiteral(wheN_TYPEEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE.ON_FAIL);

		initEEnum(brancH_TYPEEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BRANCH_TYPE.class, "BRANCH_TYPE");
		addEEnumLiteral(brancH_TYPEEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BRANCH_TYPE.ONLY);
		addEEnumLiteral(brancH_TYPEEEnum, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BRANCH_TYPE.IGNORE);

		// Create resource
		createResource(eNS_URI);
	}

} //CircleCIPackageImpl
