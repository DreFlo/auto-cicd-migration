/**
 */
package GHA.Jobs.impl;

import GHA.Jobs.*;

import java.util.Map;

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
public class JobsFactoryImpl extends EFactoryImpl implements JobsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobsFactory init() {
		try {
			JobsFactory theJobsFactory = (JobsFactory) EPackage.Registry.INSTANCE.getEFactory(JobsPackage.eNS_URI);
			if (theJobsFactory != null) {
				return theJobsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JobsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobsFactoryImpl() {
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
		case JobsPackage.REUSE_WORKFLOW_JOB:
			return createReuseWorkflowJob();
		case JobsPackage.SCRIPT_JOB:
			return createScriptJob();
		case JobsPackage.AGENT:
			return createAgent();
		case JobsPackage.CONTAINER:
			return createContainer();
		case JobsPackage.SERVICE:
			return (EObject) createService();
		case JobsPackage.STAGING_ENVIRONMENT:
			return createStagingEnvironment();
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
	public ReuseWorkflowJob createReuseWorkflowJob() {
		ReuseWorkflowJobImpl reuseWorkflowJob = new ReuseWorkflowJobImpl();
		return reuseWorkflowJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScriptJob createScriptJob() {
		ScriptJobImpl scriptJob = new ScriptJobImpl();
		return scriptJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GHA.Jobs.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, GHA.Jobs.Container> createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StagingEnvironment createStagingEnvironment() {
		StagingEnvironmentImpl stagingEnvironment = new StagingEnvironmentImpl();
		return stagingEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobsPackage getJobsPackage() {
		return (JobsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JobsPackage getPackage() {
		return JobsPackage.eINSTANCE;
	}

} //JobsFactoryImpl
