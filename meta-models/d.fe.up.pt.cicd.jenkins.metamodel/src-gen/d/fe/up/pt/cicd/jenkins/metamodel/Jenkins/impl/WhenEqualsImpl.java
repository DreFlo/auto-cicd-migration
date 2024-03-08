/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Literal;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Variable;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEquals;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When Equals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenEqualsImpl#getExpected <em>Expected</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenEqualsImpl#getActual <em>Actual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhenEqualsImpl extends WhenImpl implements WhenEquals {
	/**
	 * The cached value of the '{@link #getExpected() <em>Expected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpected()
	 * @generated
	 * @ordered
	 */
	protected Literal expected;

	/**
	 * The cached value of the '{@link #getActual() <em>Actual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual()
	 * @generated
	 * @ordered
	 */
	protected Variable actual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhenEqualsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JenkinsPackage.Literals.WHEN_EQUALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal getExpected() {
		if (expected != null && expected.eIsProxy()) {
			InternalEObject oldExpected = (InternalEObject) expected;
			expected = (Literal) eResolveProxy(oldExpected);
			if (expected != oldExpected) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JenkinsPackage.WHEN_EQUALS__EXPECTED,
							oldExpected, expected));
			}
		}
		return expected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal basicGetExpected() {
		return expected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpected(Literal newExpected) {
		Literal oldExpected = expected;
		expected = newExpected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.WHEN_EQUALS__EXPECTED, oldExpected,
					expected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getActual() {
		if (actual != null && actual.eIsProxy()) {
			InternalEObject oldActual = (InternalEObject) actual;
			actual = (Variable) eResolveProxy(oldActual);
			if (actual != oldActual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JenkinsPackage.WHEN_EQUALS__ACTUAL,
							oldActual, actual));
			}
		}
		return actual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetActual() {
		return actual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActual(Variable newActual) {
		Variable oldActual = actual;
		actual = newActual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.WHEN_EQUALS__ACTUAL, oldActual,
					actual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JenkinsPackage.WHEN_EQUALS__EXPECTED:
			if (resolve)
				return getExpected();
			return basicGetExpected();
		case JenkinsPackage.WHEN_EQUALS__ACTUAL:
			if (resolve)
				return getActual();
			return basicGetActual();
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
		case JenkinsPackage.WHEN_EQUALS__EXPECTED:
			setExpected((Literal) newValue);
			return;
		case JenkinsPackage.WHEN_EQUALS__ACTUAL:
			setActual((Variable) newValue);
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
		case JenkinsPackage.WHEN_EQUALS__EXPECTED:
			setExpected((Literal) null);
			return;
		case JenkinsPackage.WHEN_EQUALS__ACTUAL:
			setActual((Variable) null);
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
		case JenkinsPackage.WHEN_EQUALS__EXPECTED:
			return expected != null;
		case JenkinsPackage.WHEN_EQUALS__ACTUAL:
			return actual != null;
		}
		return super.eIsSet(featureID);
	}

} //WhenEqualsImpl
