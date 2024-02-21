/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.impl;

import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.ConditionalStep;
import d.fe.up.pt.cicd.metamodel.CICD.Expression;
import d.fe.up.pt.cicd.metamodel.CICD.Step;

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
 * An implementation of the model object '<em><b>Conditional Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ConditionalStepImpl#getIf <em>If</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ConditionalStepImpl#getThen <em>Then</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ConditionalStepImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalStepImpl extends StepImpl implements ConditionalStep {
	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected Expression if_;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> then;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CICDPackage.Literals.CONDITIONAL_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getIf() {
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf(Expression newIf, NotificationChain msgs) {
		Expression oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CICDPackage.CONDITIONAL_STEP__IF, oldIf, newIf);
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
	public void setIf(Expression newIf) {
		if (newIf != if_) {
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject) if_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CICDPackage.CONDITIONAL_STEP__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject) newIf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CICDPackage.CONDITIONAL_STEP__IF, null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICDPackage.CONDITIONAL_STEP__IF, newIf, newIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getThen() {
		if (then == null) {
			then = new EObjectContainmentEList<Step>(Step.class, this, CICDPackage.CONDITIONAL_STEP__THEN);
		}
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getElse() {
		if (else_ == null) {
			else_ = new EObjectContainmentEList<Step>(Step.class, this, CICDPackage.CONDITIONAL_STEP__ELSE);
		}
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CICDPackage.CONDITIONAL_STEP__IF:
			return basicSetIf(null, msgs);
		case CICDPackage.CONDITIONAL_STEP__THEN:
			return ((InternalEList<?>) getThen()).basicRemove(otherEnd, msgs);
		case CICDPackage.CONDITIONAL_STEP__ELSE:
			return ((InternalEList<?>) getElse()).basicRemove(otherEnd, msgs);
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
		case CICDPackage.CONDITIONAL_STEP__IF:
			return getIf();
		case CICDPackage.CONDITIONAL_STEP__THEN:
			return getThen();
		case CICDPackage.CONDITIONAL_STEP__ELSE:
			return getElse();
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
		case CICDPackage.CONDITIONAL_STEP__IF:
			setIf((Expression) newValue);
			return;
		case CICDPackage.CONDITIONAL_STEP__THEN:
			getThen().clear();
			getThen().addAll((Collection<? extends Step>) newValue);
			return;
		case CICDPackage.CONDITIONAL_STEP__ELSE:
			getElse().clear();
			getElse().addAll((Collection<? extends Step>) newValue);
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
		case CICDPackage.CONDITIONAL_STEP__IF:
			setIf((Expression) null);
			return;
		case CICDPackage.CONDITIONAL_STEP__THEN:
			getThen().clear();
			return;
		case CICDPackage.CONDITIONAL_STEP__ELSE:
			getElse().clear();
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
		case CICDPackage.CONDITIONAL_STEP__IF:
			return if_ != null;
		case CICDPackage.CONDITIONAL_STEP__THEN:
			return then != null && !then.isEmpty();
		case CICDPackage.CONDITIONAL_STEP__ELSE:
			return else_ != null && !else_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionalStepImpl
