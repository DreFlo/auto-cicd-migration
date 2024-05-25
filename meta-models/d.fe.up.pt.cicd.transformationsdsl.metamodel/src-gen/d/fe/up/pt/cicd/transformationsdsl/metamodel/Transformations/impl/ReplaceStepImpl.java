/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl;

import d.fe.up.pt.cicd.metamodel.CICD.Step;

import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceStep;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replace Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ReplaceStepImpl#getJob <em>Job</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ReplaceStepImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ReplaceStepImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReplaceStepImpl extends TIMTransformationImpl implements ReplaceStep {
	/**
	 * The default value of the '{@link #getJob() <em>Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJob() <em>Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected String job = JOB_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected Integer index = INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected Step step;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplaceStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransformationsPackage.Literals.REPLACE_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJob() {
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJob(String newJob) {
		String oldJob = job;
		job = newJob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationsPackage.REPLACE_STEP__JOB, oldJob,
					job));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndex(Integer newIndex) {
		Integer oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationsPackage.REPLACE_STEP__INDEX, oldIndex,
					index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(Step newStep, NotificationChain msgs) {
		Step oldStep = step;
		step = newStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TransformationsPackage.REPLACE_STEP__STEP, oldStep, newStep);
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
	public void setStep(Step newStep) {
		if (newStep != step) {
			NotificationChain msgs = null;
			if (step != null)
				msgs = ((InternalEObject) step).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TransformationsPackage.REPLACE_STEP__STEP, null, msgs);
			if (newStep != null)
				msgs = ((InternalEObject) newStep).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TransformationsPackage.REPLACE_STEP__STEP, null, msgs);
			msgs = basicSetStep(newStep, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformationsPackage.REPLACE_STEP__STEP, newStep,
					newStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TransformationsPackage.REPLACE_STEP__STEP:
			return basicSetStep(null, msgs);
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
		case TransformationsPackage.REPLACE_STEP__JOB:
			return getJob();
		case TransformationsPackage.REPLACE_STEP__INDEX:
			return getIndex();
		case TransformationsPackage.REPLACE_STEP__STEP:
			return getStep();
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
		case TransformationsPackage.REPLACE_STEP__JOB:
			setJob((String) newValue);
			return;
		case TransformationsPackage.REPLACE_STEP__INDEX:
			setIndex((Integer) newValue);
			return;
		case TransformationsPackage.REPLACE_STEP__STEP:
			setStep((Step) newValue);
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
		case TransformationsPackage.REPLACE_STEP__JOB:
			setJob(JOB_EDEFAULT);
			return;
		case TransformationsPackage.REPLACE_STEP__INDEX:
			setIndex(INDEX_EDEFAULT);
			return;
		case TransformationsPackage.REPLACE_STEP__STEP:
			setStep((Step) null);
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
		case TransformationsPackage.REPLACE_STEP__JOB:
			return JOB_EDEFAULT == null ? job != null : !JOB_EDEFAULT.equals(job);
		case TransformationsPackage.REPLACE_STEP__INDEX:
			return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
		case TransformationsPackage.REPLACE_STEP__STEP:
			return step != null;
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
		result.append(" (job: ");
		result.append(job);
		result.append(", index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //ReplaceStepImpl
