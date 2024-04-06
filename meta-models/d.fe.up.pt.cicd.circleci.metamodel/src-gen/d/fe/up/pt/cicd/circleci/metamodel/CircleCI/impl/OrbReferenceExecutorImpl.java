/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Orb;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceExecutor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orb Reference Executor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbReferenceExecutorImpl#getOrb <em>Orb</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbReferenceExecutorImpl#getOrbExecutorName <em>Orb Executor Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrbReferenceExecutorImpl extends ReferenceExecutorImpl implements OrbReferenceExecutor {
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
	 * The default value of the '{@link #getOrbExecutorName() <em>Orb Executor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbExecutorName()
	 * @generated
	 * @ordered
	 */
	protected static final String ORB_EXECUTOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrbExecutorName() <em>Orb Executor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbExecutorName()
	 * @generated
	 * @ordered
	 */
	protected String orbExecutorName = ORB_EXECUTOR_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrbReferenceExecutorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCIPackage.Literals.ORB_REFERENCE_EXECUTOR;
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
							CircleCIPackage.ORB_REFERENCE_EXECUTOR__ORB, oldOrb, orb));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.ORB_REFERENCE_EXECUTOR__ORB, oldOrb,
					orb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrbExecutorName() {
		return orbExecutorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrbExecutorName(String newOrbExecutorName) {
		String oldOrbExecutorName = orbExecutorName;
		orbExecutorName = newOrbExecutorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.ORB_REFERENCE_EXECUTOR__ORB_EXECUTOR_NAME, oldOrbExecutorName, orbExecutorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircleCIPackage.ORB_REFERENCE_EXECUTOR__ORB:
			if (resolve)
				return getOrb();
			return basicGetOrb();
		case CircleCIPackage.ORB_REFERENCE_EXECUTOR__ORB_EXECUTOR_NAME:
			return getOrbExecutorName();
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
		case CircleCIPackage.ORB_REFERENCE_EXECUTOR__ORB:
			setOrb((Orb) newValue);
			return;
		case CircleCIPackage.ORB_REFERENCE_EXECUTOR__ORB_EXECUTOR_NAME:
			setOrbExecutorName((String) newValue);
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
		case CircleCIPackage.ORB_REFERENCE_EXECUTOR__ORB:
			setOrb((Orb) null);
			return;
		case CircleCIPackage.ORB_REFERENCE_EXECUTOR__ORB_EXECUTOR_NAME:
			setOrbExecutorName(ORB_EXECUTOR_NAME_EDEFAULT);
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
		case CircleCIPackage.ORB_REFERENCE_EXECUTOR__ORB:
			return orb != null;
		case CircleCIPackage.ORB_REFERENCE_EXECUTOR__ORB_EXECUTOR_NAME:
			return ORB_EXECUTOR_NAME_EDEFAULT == null ? orbExecutorName != null
					: !ORB_EXECUTOR_NAME_EDEFAULT.equals(orbExecutorName);
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
		result.append(" (orbExecutorName: ");
		result.append(orbExecutorName);
		result.append(')');
		return result.toString();
	}

} //OrbReferenceExecutorImpl
