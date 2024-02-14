/**
 */
package CICD.Options.impl;

import CICD.Expressions.Expression;

import CICD.Options.ConcurrencyGroup;
import CICD.Options.OptionsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concurrency Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CICD.Options.impl.ConcurrencyGroupImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link CICD.Options.impl.ConcurrencyGroupImpl#getCancelInProgress <em>Cancel In Progress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcurrencyGroupImpl extends MinimalEObjectImpl.Container implements ConcurrencyGroup {
	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected Expression groupId;

	/**
	 * The default value of the '{@link #getCancelInProgress() <em>Cancel In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelInProgress()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CANCEL_IN_PROGRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancelInProgress() <em>Cancel In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelInProgress()
	 * @generated
	 * @ordered
	 */
	protected Boolean cancelInProgress = CANCEL_IN_PROGRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcurrencyGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionsPackage.Literals.CONCURRENCY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getGroupId() {
		if (groupId != null && groupId.eIsProxy()) {
			InternalEObject oldGroupId = (InternalEObject)groupId;
			groupId = (Expression)eResolveProxy(oldGroupId);
			if (groupId != oldGroupId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OptionsPackage.CONCURRENCY_GROUP__GROUP_ID, oldGroupId, groupId));
			}
		}
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(Expression newGroupId) {
		Expression oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptionsPackage.CONCURRENCY_GROUP__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCancelInProgress() {
		return cancelInProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelInProgress(Boolean newCancelInProgress) {
		Boolean oldCancelInProgress = cancelInProgress;
		cancelInProgress = newCancelInProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptionsPackage.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS, oldCancelInProgress, cancelInProgress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptionsPackage.CONCURRENCY_GROUP__GROUP_ID:
				if (resolve) return getGroupId();
				return basicGetGroupId();
			case OptionsPackage.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS:
				return getCancelInProgress();
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
			case OptionsPackage.CONCURRENCY_GROUP__GROUP_ID:
				setGroupId((Expression)newValue);
				return;
			case OptionsPackage.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS:
				setCancelInProgress((Boolean)newValue);
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
			case OptionsPackage.CONCURRENCY_GROUP__GROUP_ID:
				setGroupId((Expression)null);
				return;
			case OptionsPackage.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS:
				setCancelInProgress(CANCEL_IN_PROGRESS_EDEFAULT);
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
			case OptionsPackage.CONCURRENCY_GROUP__GROUP_ID:
				return groupId != null;
			case OptionsPackage.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS:
				return CANCEL_IN_PROGRESS_EDEFAULT == null ? cancelInProgress != null : !CANCEL_IN_PROGRESS_EDEFAULT.equals(cancelInProgress);
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cancelInProgress: ");
		result.append(cancelInProgress);
		result.append(')');
		return result.toString();
	}

} //ConcurrencyGroupImpl
