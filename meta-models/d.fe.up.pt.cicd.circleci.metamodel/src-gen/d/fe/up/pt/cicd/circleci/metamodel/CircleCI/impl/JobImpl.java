/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Execution_Env;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Store_Artifact;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Unless;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl#getParallelism <em>Parallelism</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl#getStore_artifact <em>Store artifact</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl#getWhen_unless <em>When unless</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl#getExecution_env <em>Execution env</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends MinimalEObjectImpl.Container implements Job {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParallelism() <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelism()
	 * @generated
	 * @ordered
	 */
	protected static final short PARALLELISM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getParallelism() <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelism()
	 * @generated
	 * @ordered
	 */
	protected short parallelism = PARALLELISM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStore_artifact() <em>Store artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStore_artifact()
	 * @generated
	 * @ordered
	 */
	protected EList<Store_Artifact> store_artifact;

	/**
	 * The cached value of the '{@link #getWhen_unless() <em>When unless</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen_unless()
	 * @generated
	 * @ordered
	 */
	protected When_Unless when_unless;

	/**
	 * The cached value of the '{@link #getExecution_env() <em>Execution env</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution_env()
	 * @generated
	 * @ordered
	 */
	protected Execution_Env execution_env;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> environment;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> step;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCIPackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.JOB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public short getParallelism() {
		return parallelism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParallelism(short newParallelism) {
		short oldParallelism = parallelism;
		parallelism = newParallelism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.JOB__PARALLELISM, oldParallelism,
					parallelism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Store_Artifact> getStore_artifact() {
		if (store_artifact == null) {
			store_artifact = new EObjectContainmentEList<Store_Artifact>(Store_Artifact.class, this,
					CircleCIPackage.JOB__STORE_ARTIFACT);
		}
		return store_artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public When_Unless getWhen_unless() {
		return when_unless;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen_unless(When_Unless newWhen_unless, NotificationChain msgs) {
		When_Unless oldWhen_unless = when_unless;
		when_unless = newWhen_unless;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.JOB__WHEN_UNLESS, oldWhen_unless, newWhen_unless);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhen_unless(When_Unless newWhen_unless) {
		if (newWhen_unless != when_unless) {
			NotificationChain msgs = null;
			if (when_unless != null)
				msgs = ((InternalEObject) when_unless).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.JOB__WHEN_UNLESS, null, msgs);
			if (newWhen_unless != null)
				msgs = ((InternalEObject) newWhen_unless).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.JOB__WHEN_UNLESS, null, msgs);
			msgs = basicSetWhen_unless(newWhen_unless, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.JOB__WHEN_UNLESS, newWhen_unless,
					newWhen_unless));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Execution_Env getExecution_env() {
		return execution_env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecution_env(Execution_Env newExecution_env, NotificationChain msgs) {
		Execution_Env oldExecution_env = execution_env;
		execution_env = newExecution_env;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.JOB__EXECUTION_ENV, oldExecution_env, newExecution_env);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecution_env(Execution_Env newExecution_env) {
		if (newExecution_env != execution_env) {
			NotificationChain msgs = null;
			if (execution_env != null)
				msgs = ((InternalEObject) execution_env).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.JOB__EXECUTION_ENV, null, msgs);
			if (newExecution_env != null)
				msgs = ((InternalEObject) newExecution_env).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.JOB__EXECUTION_ENV, null, msgs);
			msgs = basicSetExecution_env(newExecution_env, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.JOB__EXECUTION_ENV, newExecution_env,
					newExecution_env));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Environment> getEnvironment() {
		if (environment == null) {
			environment = new EObjectContainmentEList<Environment>(Environment.class, this,
					CircleCIPackage.JOB__ENVIRONMENT);
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<Step>(Step.class, this, CircleCIPackage.JOB__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCIPackage.JOB__STORE_ARTIFACT:
			return ((InternalEList<?>) getStore_artifact()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.JOB__WHEN_UNLESS:
			return basicSetWhen_unless(null, msgs);
		case CircleCIPackage.JOB__EXECUTION_ENV:
			return basicSetExecution_env(null, msgs);
		case CircleCIPackage.JOB__ENVIRONMENT:
			return ((InternalEList<?>) getEnvironment()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.JOB__STEP:
			return ((InternalEList<?>) getStep()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircleCIPackage.JOB__NAME:
			return getName();
		case CircleCIPackage.JOB__PARALLELISM:
			return getParallelism();
		case CircleCIPackage.JOB__STORE_ARTIFACT:
			return getStore_artifact();
		case CircleCIPackage.JOB__WHEN_UNLESS:
			return getWhen_unless();
		case CircleCIPackage.JOB__EXECUTION_ENV:
			return getExecution_env();
		case CircleCIPackage.JOB__ENVIRONMENT:
			return getEnvironment();
		case CircleCIPackage.JOB__STEP:
			return getStep();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CircleCIPackage.JOB__NAME:
			setName((String) newValue);
			return;
		case CircleCIPackage.JOB__PARALLELISM:
			setParallelism((Short) newValue);
			return;
		case CircleCIPackage.JOB__STORE_ARTIFACT:
			getStore_artifact().clear();
			getStore_artifact().addAll((Collection<? extends Store_Artifact>) newValue);
			return;
		case CircleCIPackage.JOB__WHEN_UNLESS:
			setWhen_unless((When_Unless) newValue);
			return;
		case CircleCIPackage.JOB__EXECUTION_ENV:
			setExecution_env((Execution_Env) newValue);
			return;
		case CircleCIPackage.JOB__ENVIRONMENT:
			getEnvironment().clear();
			getEnvironment().addAll((Collection<? extends Environment>) newValue);
			return;
		case CircleCIPackage.JOB__STEP:
			getStep().clear();
			getStep().addAll((Collection<? extends Step>) newValue);
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
		case CircleCIPackage.JOB__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CircleCIPackage.JOB__PARALLELISM:
			setParallelism(PARALLELISM_EDEFAULT);
			return;
		case CircleCIPackage.JOB__STORE_ARTIFACT:
			getStore_artifact().clear();
			return;
		case CircleCIPackage.JOB__WHEN_UNLESS:
			setWhen_unless((When_Unless) null);
			return;
		case CircleCIPackage.JOB__EXECUTION_ENV:
			setExecution_env((Execution_Env) null);
			return;
		case CircleCIPackage.JOB__ENVIRONMENT:
			getEnvironment().clear();
			return;
		case CircleCIPackage.JOB__STEP:
			getStep().clear();
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
		case CircleCIPackage.JOB__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CircleCIPackage.JOB__PARALLELISM:
			return parallelism != PARALLELISM_EDEFAULT;
		case CircleCIPackage.JOB__STORE_ARTIFACT:
			return store_artifact != null && !store_artifact.isEmpty();
		case CircleCIPackage.JOB__WHEN_UNLESS:
			return when_unless != null;
		case CircleCIPackage.JOB__EXECUTION_ENV:
			return execution_env != null;
		case CircleCIPackage.JOB__ENVIRONMENT:
			return environment != null && !environment.isEmpty();
		case CircleCIPackage.JOB__STEP:
			return step != null && !step.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", parallelism: ");
		result.append(parallelism);
		result.append(')');
		return result.toString();
	}

} //JobImpl
