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
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ConditionalStepImpl#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ConditionalStepImpl#getThenRun <em>Then Run</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ConditionalStepImpl#getElseRun <em>Else Run</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalStepImpl extends StepImpl implements ConditionalStep {
	/**
	 * The cached value of the '{@link #getIfCondition() <em>If Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression ifCondition;

	/**
	 * The cached value of the '{@link #getThenRun() <em>Then Run</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenRun()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> thenRun;

	/**
	 * The cached value of the '{@link #getElseRun() <em>Else Run</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseRun()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> elseRun;

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
	public Expression getIfCondition() {
		return ifCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfCondition(Expression newIfCondition, NotificationChain msgs) {
		Expression oldIfCondition = ifCondition;
		ifCondition = newIfCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CICDPackage.CONDITIONAL_STEP__IF_CONDITION, oldIfCondition, newIfCondition);
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
	public void setIfCondition(Expression newIfCondition) {
		if (newIfCondition != ifCondition) {
			NotificationChain msgs = null;
			if (ifCondition != null)
				msgs = ((InternalEObject) ifCondition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CICDPackage.CONDITIONAL_STEP__IF_CONDITION, null, msgs);
			if (newIfCondition != null)
				msgs = ((InternalEObject) newIfCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CICDPackage.CONDITIONAL_STEP__IF_CONDITION, null, msgs);
			msgs = basicSetIfCondition(newIfCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICDPackage.CONDITIONAL_STEP__IF_CONDITION,
					newIfCondition, newIfCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getThenRun() {
		if (thenRun == null) {
			thenRun = new EObjectContainmentEList<Step>(Step.class, this, CICDPackage.CONDITIONAL_STEP__THEN_RUN);
		}
		return thenRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getElseRun() {
		if (elseRun == null) {
			elseRun = new EObjectContainmentEList<Step>(Step.class, this, CICDPackage.CONDITIONAL_STEP__ELSE_RUN);
		}
		return elseRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CICDPackage.CONDITIONAL_STEP__IF_CONDITION:
			return basicSetIfCondition(null, msgs);
		case CICDPackage.CONDITIONAL_STEP__THEN_RUN:
			return ((InternalEList<?>) getThenRun()).basicRemove(otherEnd, msgs);
		case CICDPackage.CONDITIONAL_STEP__ELSE_RUN:
			return ((InternalEList<?>) getElseRun()).basicRemove(otherEnd, msgs);
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
		case CICDPackage.CONDITIONAL_STEP__IF_CONDITION:
			return getIfCondition();
		case CICDPackage.CONDITIONAL_STEP__THEN_RUN:
			return getThenRun();
		case CICDPackage.CONDITIONAL_STEP__ELSE_RUN:
			return getElseRun();
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
		case CICDPackage.CONDITIONAL_STEP__IF_CONDITION:
			setIfCondition((Expression) newValue);
			return;
		case CICDPackage.CONDITIONAL_STEP__THEN_RUN:
			getThenRun().clear();
			getThenRun().addAll((Collection<? extends Step>) newValue);
			return;
		case CICDPackage.CONDITIONAL_STEP__ELSE_RUN:
			getElseRun().clear();
			getElseRun().addAll((Collection<? extends Step>) newValue);
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
		case CICDPackage.CONDITIONAL_STEP__IF_CONDITION:
			setIfCondition((Expression) null);
			return;
		case CICDPackage.CONDITIONAL_STEP__THEN_RUN:
			getThenRun().clear();
			return;
		case CICDPackage.CONDITIONAL_STEP__ELSE_RUN:
			getElseRun().clear();
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
		case CICDPackage.CONDITIONAL_STEP__IF_CONDITION:
			return ifCondition != null;
		case CICDPackage.CONDITIONAL_STEP__THEN_RUN:
			return thenRun != null && !thenRun.isEmpty();
		case CICDPackage.CONDITIONAL_STEP__ELSE_RUN:
			return elseRun != null && !elseRun.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionalStepImpl
