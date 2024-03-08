/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangeRequest;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When Change Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenChangeRequestImpl#getMatcher <em>Matcher</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhenChangeRequestImpl extends WhenComparisonImpl implements WhenChangeRequest {
	/**
	 * The default value of the '{@link #getMatcher() <em>Matcher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatcher()
	 * @generated
	 * @ordered
	 */
	protected static final CHANGE_REQUEST_MATCHER MATCHER_EDEFAULT = CHANGE_REQUEST_MATCHER.ID;

	/**
	 * The cached value of the '{@link #getMatcher() <em>Matcher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatcher()
	 * @generated
	 * @ordered
	 */
	protected CHANGE_REQUEST_MATCHER matcher = MATCHER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhenChangeRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JenkinsPackage.Literals.WHEN_CHANGE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CHANGE_REQUEST_MATCHER getMatcher() {
		return matcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatcher(CHANGE_REQUEST_MATCHER newMatcher) {
		CHANGE_REQUEST_MATCHER oldMatcher = matcher;
		matcher = newMatcher == null ? MATCHER_EDEFAULT : newMatcher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.WHEN_CHANGE_REQUEST__MATCHER,
					oldMatcher, matcher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JenkinsPackage.WHEN_CHANGE_REQUEST__MATCHER:
			return getMatcher();
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
		case JenkinsPackage.WHEN_CHANGE_REQUEST__MATCHER:
			setMatcher((CHANGE_REQUEST_MATCHER) newValue);
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
		case JenkinsPackage.WHEN_CHANGE_REQUEST__MATCHER:
			setMatcher(MATCHER_EDEFAULT);
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
		case JenkinsPackage.WHEN_CHANGE_REQUEST__MATCHER:
			return matcher != MATCHER_EDEFAULT;
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
		result.append(" (matcher: ");
		result.append(matcher);
		result.append(')');
		return result.toString();
	}

} //WhenChangeRequestImpl
