/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Orb;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowOrbJobConfiguration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Orb Job Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowOrbJobConfigurationImpl#getOrb <em>Orb</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowOrbJobConfigurationImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowOrbJobConfigurationImpl#getJobName <em>Job Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowOrbJobConfigurationImpl extends WorkflowJobConfigurationImpl
		implements WorkflowOrbJobConfiguration {
	/**
	 * The cached value of the '{@link #getOrb() <em>Orb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrb()
	 * @generated
	 * @ordered
	 */
	protected Orb orb;

	/**
	 * The cached value of the '{@link #getExecutor() <em>Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor()
	 * @generated
	 * @ordered
	 */
	protected Executor executor;

	/**
	 * The default value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobName()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobName()
	 * @generated
	 * @ordered
	 */
	protected String jobName = JOB_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowOrbJobConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCIPackage.Literals.WORKFLOW_ORB_JOB_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Orb getOrb() {
		if (orb != null && orb.eIsProxy()) {
			InternalEObject oldOrb = (InternalEObject) orb;
			orb = (Orb) eResolveProxy(oldOrb);
			if (orb != oldOrb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__ORB, oldOrb, orb));
			}
		}
		return orb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orb basicGetOrb() {
		return orb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrb(Orb newOrb) {
		Orb oldOrb = orb;
		orb = newOrb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__ORB,
					oldOrb, orb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Executor getExecutor() {
		if (executor != null && executor.eIsProxy()) {
			InternalEObject oldExecutor = (InternalEObject) executor;
			executor = (Executor) eResolveProxy(oldExecutor);
			if (executor != oldExecutor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__EXECUTOR, oldExecutor, executor));
			}
		}
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor basicGetExecutor() {
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutor(Executor newExecutor) {
		Executor oldExecutor = executor;
		executor = newExecutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__EXECUTOR, oldExecutor, executor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobName() {
		return jobName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobName(String newJobName) {
		String oldJobName = jobName;
		jobName = newJobName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__JOB_NAME, oldJobName, jobName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__ORB:
			if (resolve)
				return getOrb();
			return basicGetOrb();
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__EXECUTOR:
			if (resolve)
				return getExecutor();
			return basicGetExecutor();
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__JOB_NAME:
			return getJobName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__ORB:
			setOrb((Orb) newValue);
			return;
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__EXECUTOR:
			setExecutor((Executor) newValue);
			return;
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__JOB_NAME:
			setJobName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__ORB:
			setOrb((Orb) null);
			return;
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__EXECUTOR:
			setExecutor((Executor) null);
			return;
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__JOB_NAME:
			setJobName(JOB_NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__ORB:
			return orb != null;
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__EXECUTOR:
			return executor != null;
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__JOB_NAME:
			return JOB_NAME_EDEFAULT == null ? jobName != null : !JOB_NAME_EDEFAULT.equals(jobName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (jobName: ");
		result.append(jobName);
		result.append(')');
		return result.toString();
	}

} //WorkflowOrbJobConfigurationImpl
