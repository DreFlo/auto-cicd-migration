/**
 */
package GHA.impl;

import GHA.Expression;
import GHA.GHAPackage;
import GHA.WorkflowRunTrigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Run Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GHA.impl.WorkflowRunTriggerImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link GHA.impl.WorkflowRunTriggerImpl#isIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowRunTriggerImpl extends TriggerImpl implements WorkflowRunTrigger {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowRunTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHAPackage.Literals.WORKFLOW_RUN_TRIGGER;
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
					GHAPackage.WORKFLOW_RUN_TRIGGER__BRANCHES);
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
					GHAPackage.WORKFLOW_RUN_TRIGGER__IGNORE_SPECIFIED_BRANCHES, oldIgnoreSpecifiedBranches,
					ignoreSpecifiedBranches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GHAPackage.WORKFLOW_RUN_TRIGGER__BRANCHES:
			return ((InternalEList<?>) getBranches()).basicRemove(otherEnd, msgs);
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
		case GHAPackage.WORKFLOW_RUN_TRIGGER__BRANCHES:
			return getBranches();
		case GHAPackage.WORKFLOW_RUN_TRIGGER__IGNORE_SPECIFIED_BRANCHES:
			return isIgnoreSpecifiedBranches();
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
		case GHAPackage.WORKFLOW_RUN_TRIGGER__BRANCHES:
			getBranches().clear();
			getBranches().addAll((Collection<? extends Expression>) newValue);
			return;
		case GHAPackage.WORKFLOW_RUN_TRIGGER__IGNORE_SPECIFIED_BRANCHES:
			setIgnoreSpecifiedBranches((Boolean) newValue);
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
		case GHAPackage.WORKFLOW_RUN_TRIGGER__BRANCHES:
			getBranches().clear();
			return;
		case GHAPackage.WORKFLOW_RUN_TRIGGER__IGNORE_SPECIFIED_BRANCHES:
			setIgnoreSpecifiedBranches(IGNORE_SPECIFIED_BRANCHES_EDEFAULT);
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
		case GHAPackage.WORKFLOW_RUN_TRIGGER__BRANCHES:
			return branches != null && !branches.isEmpty();
		case GHAPackage.WORKFLOW_RUN_TRIGGER__IGNORE_SPECIFIED_BRANCHES:
			return ignoreSpecifiedBranches != IGNORE_SPECIFIED_BRANCHES_EDEFAULT;
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
		result.append(" (ignoreSpecifiedBranches: ");
		result.append(ignoreSpecifiedBranches);
		result.append(')');
		return result.toString();
	}

} //WorkflowRunTriggerImpl
