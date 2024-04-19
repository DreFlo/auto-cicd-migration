/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Literal;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.VariableDeclaration;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEquals;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
	 * The cached value of the '{@link #getExpected() <em>Expected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpected()
	 * @generated
	 * @ordered
	 */
	protected Literal expected;

	/**
	 * The cached value of the '{@link #getActual() <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclaration actual;

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
		return expected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpected(Literal newExpected, NotificationChain msgs) {
		Literal oldExpected = expected;
		expected = newExpected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JenkinsPackage.WHEN_EQUALS__EXPECTED, oldExpected, newExpected);
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
	public void setExpected(Literal newExpected) {
		if (newExpected != expected) {
			NotificationChain msgs = null;
			if (expected != null)
				msgs = ((InternalEObject) expected).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JenkinsPackage.WHEN_EQUALS__EXPECTED, null, msgs);
			if (newExpected != null)
				msgs = ((InternalEObject) newExpected).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JenkinsPackage.WHEN_EQUALS__EXPECTED, null, msgs);
			msgs = basicSetExpected(newExpected, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.WHEN_EQUALS__EXPECTED, newExpected,
					newExpected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclaration getActual() {
		return actual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActual(VariableDeclaration newActual, NotificationChain msgs) {
		VariableDeclaration oldActual = actual;
		actual = newActual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JenkinsPackage.WHEN_EQUALS__ACTUAL, oldActual, newActual);
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
	public void setActual(VariableDeclaration newActual) {
		if (newActual != actual) {
			NotificationChain msgs = null;
			if (actual != null)
				msgs = ((InternalEObject) actual).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JenkinsPackage.WHEN_EQUALS__ACTUAL, null, msgs);
			if (newActual != null)
				msgs = ((InternalEObject) newActual).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JenkinsPackage.WHEN_EQUALS__ACTUAL, null, msgs);
			msgs = basicSetActual(newActual, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.WHEN_EQUALS__ACTUAL, newActual,
					newActual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JenkinsPackage.WHEN_EQUALS__EXPECTED:
			return basicSetExpected(null, msgs);
		case JenkinsPackage.WHEN_EQUALS__ACTUAL:
			return basicSetActual(null, msgs);
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
		case JenkinsPackage.WHEN_EQUALS__EXPECTED:
			return getExpected();
		case JenkinsPackage.WHEN_EQUALS__ACTUAL:
			return getActual();
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
			setActual((VariableDeclaration) newValue);
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
			setActual((VariableDeclaration) null);
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
