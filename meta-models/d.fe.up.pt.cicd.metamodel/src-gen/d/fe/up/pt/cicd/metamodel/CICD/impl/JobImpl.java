/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.impl;

import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.DockerContainer;
import d.fe.up.pt.cicd.metamodel.CICD.Job;
import d.fe.up.pt.cicd.metamodel.CICD.Step;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.JobImpl#getId <em>Id</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.JobImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.JobImpl#getServices <em>Services</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.JobImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.JobImpl#getNecessaryFor <em>Necessary For</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.JobImpl#getMaxAttempts <em>Max Attempts</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.JobImpl#isAllowFailure <em>Allow Failure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends PipelineBlockImpl implements Job {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<DockerContainer> services;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> dependsOn;

	/**
	 * The cached value of the '{@link #getNecessaryFor() <em>Necessary For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNecessaryFor()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> necessaryFor;

	/**
	 * The default value of the '{@link #getMaxAttempts() <em>Max Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAttempts()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_ATTEMPTS_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getMaxAttempts() <em>Max Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAttempts()
	 * @generated
	 * @ordered
	 */
	protected Integer maxAttempts = MAX_ATTEMPTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowFailure() <em>Allow Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowFailure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_FAILURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowFailure() <em>Allow Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowFailure()
	 * @generated
	 * @ordered
	 */
	protected boolean allowFailure = ALLOW_FAILURE_EDEFAULT;

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
		return CICDPackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICDPackage.JOB__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<Step>(Step.class, this, CICDPackage.JOB__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DockerContainer> getServices() {
		if (services == null) {
			services = new EObjectResolvingEList<DockerContainer>(DockerContainer.class, this,
					CICDPackage.JOB__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getDependsOn() {
		if (dependsOn == null) {
			dependsOn = new EObjectWithInverseResolvingEList.ManyInverse<Job>(Job.class, this,
					CICDPackage.JOB__DEPENDS_ON, CICDPackage.JOB__NECESSARY_FOR);
		}
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getNecessaryFor() {
		if (necessaryFor == null) {
			necessaryFor = new EObjectWithInverseResolvingEList.ManyInverse<Job>(Job.class, this,
					CICDPackage.JOB__NECESSARY_FOR, CICDPackage.JOB__DEPENDS_ON);
		}
		return necessaryFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxAttempts() {
		return maxAttempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAttempts(Integer newMaxAttempts) {
		Integer oldMaxAttempts = maxAttempts;
		maxAttempts = newMaxAttempts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICDPackage.JOB__MAX_ATTEMPTS, oldMaxAttempts,
					maxAttempts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowFailure() {
		return allowFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowFailure(boolean newAllowFailure) {
		boolean oldAllowFailure = allowFailure;
		allowFailure = newAllowFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICDPackage.JOB__ALLOW_FAILURE, oldAllowFailure,
					allowFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CICDPackage.JOB__DEPENDS_ON:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDependsOn()).basicAdd(otherEnd, msgs);
		case CICDPackage.JOB__NECESSARY_FOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNecessaryFor()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CICDPackage.JOB__STEPS:
			return ((InternalEList<?>) getSteps()).basicRemove(otherEnd, msgs);
		case CICDPackage.JOB__DEPENDS_ON:
			return ((InternalEList<?>) getDependsOn()).basicRemove(otherEnd, msgs);
		case CICDPackage.JOB__NECESSARY_FOR:
			return ((InternalEList<?>) getNecessaryFor()).basicRemove(otherEnd, msgs);
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
		case CICDPackage.JOB__ID:
			return getId();
		case CICDPackage.JOB__STEPS:
			return getSteps();
		case CICDPackage.JOB__SERVICES:
			return getServices();
		case CICDPackage.JOB__DEPENDS_ON:
			return getDependsOn();
		case CICDPackage.JOB__NECESSARY_FOR:
			return getNecessaryFor();
		case CICDPackage.JOB__MAX_ATTEMPTS:
			return getMaxAttempts();
		case CICDPackage.JOB__ALLOW_FAILURE:
			return isAllowFailure();
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
		case CICDPackage.JOB__ID:
			setId((String) newValue);
			return;
		case CICDPackage.JOB__STEPS:
			getSteps().clear();
			getSteps().addAll((Collection<? extends Step>) newValue);
			return;
		case CICDPackage.JOB__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends DockerContainer>) newValue);
			return;
		case CICDPackage.JOB__DEPENDS_ON:
			getDependsOn().clear();
			getDependsOn().addAll((Collection<? extends Job>) newValue);
			return;
		case CICDPackage.JOB__NECESSARY_FOR:
			getNecessaryFor().clear();
			getNecessaryFor().addAll((Collection<? extends Job>) newValue);
			return;
		case CICDPackage.JOB__MAX_ATTEMPTS:
			setMaxAttempts((Integer) newValue);
			return;
		case CICDPackage.JOB__ALLOW_FAILURE:
			setAllowFailure((Boolean) newValue);
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
		case CICDPackage.JOB__ID:
			setId(ID_EDEFAULT);
			return;
		case CICDPackage.JOB__STEPS:
			getSteps().clear();
			return;
		case CICDPackage.JOB__SERVICES:
			getServices().clear();
			return;
		case CICDPackage.JOB__DEPENDS_ON:
			getDependsOn().clear();
			return;
		case CICDPackage.JOB__NECESSARY_FOR:
			getNecessaryFor().clear();
			return;
		case CICDPackage.JOB__MAX_ATTEMPTS:
			setMaxAttempts(MAX_ATTEMPTS_EDEFAULT);
			return;
		case CICDPackage.JOB__ALLOW_FAILURE:
			setAllowFailure(ALLOW_FAILURE_EDEFAULT);
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
		case CICDPackage.JOB__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case CICDPackage.JOB__STEPS:
			return steps != null && !steps.isEmpty();
		case CICDPackage.JOB__SERVICES:
			return services != null && !services.isEmpty();
		case CICDPackage.JOB__DEPENDS_ON:
			return dependsOn != null && !dependsOn.isEmpty();
		case CICDPackage.JOB__NECESSARY_FOR:
			return necessaryFor != null && !necessaryFor.isEmpty();
		case CICDPackage.JOB__MAX_ATTEMPTS:
			return MAX_ATTEMPTS_EDEFAULT == null ? maxAttempts != null : !MAX_ATTEMPTS_EDEFAULT.equals(maxAttempts);
		case CICDPackage.JOB__ALLOW_FAILURE:
			return allowFailure != ALLOW_FAILURE_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", maxAttempts: ");
		result.append(maxAttempts);
		result.append(", allowFailure: ");
		result.append(allowFailure);
		result.append(')');
		return result.toString();
	}

} //JobImpl
