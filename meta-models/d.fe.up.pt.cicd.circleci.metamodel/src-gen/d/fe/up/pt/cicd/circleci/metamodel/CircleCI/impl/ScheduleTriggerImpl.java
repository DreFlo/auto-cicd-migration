/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ScheduleTrigger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ScheduleTriggerImpl#getCron <em>Cron</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleTriggerImpl extends TriggerImpl implements ScheduleTrigger {
	/**
	 * The default value of the '{@link #getCron() <em>Cron</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCron()
	 * @generated
	 * @ordered
	 */
	protected static final String CRON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCron() <em>Cron</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCron()
	 * @generated
	 * @ordered
	 */
	protected String cron = CRON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCIPackage.Literals.SCHEDULE_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCron() {
		return cron;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCron(String newCron) {
		String oldCron = cron;
		cron = newCron;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.SCHEDULE_TRIGGER__CRON, oldCron,
					cron));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircleCIPackage.SCHEDULE_TRIGGER__CRON:
			return getCron();
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
		case CircleCIPackage.SCHEDULE_TRIGGER__CRON:
			setCron((String) newValue);
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
		case CircleCIPackage.SCHEDULE_TRIGGER__CRON:
			setCron(CRON_EDEFAULT);
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
		case CircleCIPackage.SCHEDULE_TRIGGER__CRON:
			return CRON_EDEFAULT == null ? cron != null : !CRON_EDEFAULT.equals(cron);
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
		result.append(" (cron: ");
		result.append(cron);
		result.append(')');
		return result.toString();
	}

} //ScheduleTriggerImpl