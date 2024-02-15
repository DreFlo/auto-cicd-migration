/**
 */
package GHA.impl;

import GHA.Expression;
import GHA.GHAPackage;
import GHA.PullRequestTrigger;
import GHA.WEBHOOK_ACTIVITY_TYPES;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pull Request Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GHA.impl.PullRequestTriggerImpl#getEventTypes <em>Event Types</em>}</li>
 *   <li>{@link GHA.impl.PullRequestTriggerImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link GHA.impl.PullRequestTriggerImpl#isIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}</li>
 *   <li>{@link GHA.impl.PullRequestTriggerImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link GHA.impl.PullRequestTriggerImpl#isIgnoreSpecifiedPaths <em>Ignore Specified Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PullRequestTriggerImpl extends TriggerImpl implements PullRequestTrigger {
	/**
	 * The cached value of the '{@link #getEventTypes() <em>Event Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<WEBHOOK_ACTIVITY_TYPES> eventTypes;

	/**
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> branches;

	/**
	 * The default value of the '{@link #isIgnoreSpecifiedBranches() <em>Ignore Specified Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreSpecifiedBranches()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_SPECIFIED_BRANCHES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreSpecifiedBranches() <em>Ignore Specified Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreSpecifiedBranches()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreSpecifiedBranches = IGNORE_SPECIFIED_BRANCHES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> paths;

	/**
	 * The default value of the '{@link #isIgnoreSpecifiedPaths() <em>Ignore Specified Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreSpecifiedPaths()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_SPECIFIED_PATHS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreSpecifiedPaths() <em>Ignore Specified Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreSpecifiedPaths()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreSpecifiedPaths = IGNORE_SPECIFIED_PATHS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PullRequestTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHAPackage.Literals.PULL_REQUEST_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WEBHOOK_ACTIVITY_TYPES> getEventTypes() {
		if (eventTypes == null) {
			eventTypes = new EDataTypeUniqueEList<WEBHOOK_ACTIVITY_TYPES>(WEBHOOK_ACTIVITY_TYPES.class, this,
					GHAPackage.PULL_REQUEST_TRIGGER__EVENT_TYPES);
		}
		return eventTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getBranches() {
		if (branches == null) {
			branches = new EObjectContainmentEList<Expression>(Expression.class, this,
					GHAPackage.PULL_REQUEST_TRIGGER__BRANCHES);
		}
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIgnoreSpecifiedBranches() {
		return ignoreSpecifiedBranches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreSpecifiedBranches(boolean newIgnoreSpecifiedBranches) {
		boolean oldIgnoreSpecifiedBranches = ignoreSpecifiedBranches;
		ignoreSpecifiedBranches = newIgnoreSpecifiedBranches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GHAPackage.PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_BRANCHES, oldIgnoreSpecifiedBranches,
					ignoreSpecifiedBranches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentEList<Expression>(Expression.class, this,
					GHAPackage.PULL_REQUEST_TRIGGER__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIgnoreSpecifiedPaths() {
		return ignoreSpecifiedPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreSpecifiedPaths(boolean newIgnoreSpecifiedPaths) {
		boolean oldIgnoreSpecifiedPaths = ignoreSpecifiedPaths;
		ignoreSpecifiedPaths = newIgnoreSpecifiedPaths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GHAPackage.PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_PATHS, oldIgnoreSpecifiedPaths,
					ignoreSpecifiedPaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GHAPackage.PULL_REQUEST_TRIGGER__BRANCHES:
			return ((InternalEList<?>) getBranches()).basicRemove(otherEnd, msgs);
		case GHAPackage.PULL_REQUEST_TRIGGER__PATHS:
			return ((InternalEList<?>) getPaths()).basicRemove(otherEnd, msgs);
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
		case GHAPackage.PULL_REQUEST_TRIGGER__EVENT_TYPES:
			return getEventTypes();
		case GHAPackage.PULL_REQUEST_TRIGGER__BRANCHES:
			return getBranches();
		case GHAPackage.PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_BRANCHES:
			return isIgnoreSpecifiedBranches();
		case GHAPackage.PULL_REQUEST_TRIGGER__PATHS:
			return getPaths();
		case GHAPackage.PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_PATHS:
			return isIgnoreSpecifiedPaths();
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
		case GHAPackage.PULL_REQUEST_TRIGGER__EVENT_TYPES:
			getEventTypes().clear();
			getEventTypes().addAll((Collection<? extends WEBHOOK_ACTIVITY_TYPES>) newValue);
			return;
		case GHAPackage.PULL_REQUEST_TRIGGER__BRANCHES:
			getBranches().clear();
			getBranches().addAll((Collection<? extends Expression>) newValue);
			return;
		case GHAPackage.PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_BRANCHES:
			setIgnoreSpecifiedBranches((Boolean) newValue);
			return;
		case GHAPackage.PULL_REQUEST_TRIGGER__PATHS:
			getPaths().clear();
			getPaths().addAll((Collection<? extends Expression>) newValue);
			return;
		case GHAPackage.PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_PATHS:
			setIgnoreSpecifiedPaths((Boolean) newValue);
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
		case GHAPackage.PULL_REQUEST_TRIGGER__EVENT_TYPES:
			getEventTypes().clear();
			return;
		case GHAPackage.PULL_REQUEST_TRIGGER__BRANCHES:
			getBranches().clear();
			return;
		case GHAPackage.PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_BRANCHES:
			setIgnoreSpecifiedBranches(IGNORE_SPECIFIED_BRANCHES_EDEFAULT);
			return;
		case GHAPackage.PULL_REQUEST_TRIGGER__PATHS:
			getPaths().clear();
			return;
		case GHAPackage.PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_PATHS:
			setIgnoreSpecifiedPaths(IGNORE_SPECIFIED_PATHS_EDEFAULT);
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
		case GHAPackage.PULL_REQUEST_TRIGGER__EVENT_TYPES:
			return eventTypes != null && !eventTypes.isEmpty();
		case GHAPackage.PULL_REQUEST_TRIGGER__BRANCHES:
			return branches != null && !branches.isEmpty();
		case GHAPackage.PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_BRANCHES:
			return ignoreSpecifiedBranches != IGNORE_SPECIFIED_BRANCHES_EDEFAULT;
		case GHAPackage.PULL_REQUEST_TRIGGER__PATHS:
			return paths != null && !paths.isEmpty();
		case GHAPackage.PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_PATHS:
			return ignoreSpecifiedPaths != IGNORE_SPECIFIED_PATHS_EDEFAULT;
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
		result.append(" (eventTypes: ");
		result.append(eventTypes);
		result.append(", ignoreSpecifiedBranches: ");
		result.append(ignoreSpecifiedBranches);
		result.append(", ignoreSpecifiedPaths: ");
		result.append(ignoreSpecifiedPaths);
		result.append(')');
		return result.toString();
	}

} //PullRequestTriggerImpl
