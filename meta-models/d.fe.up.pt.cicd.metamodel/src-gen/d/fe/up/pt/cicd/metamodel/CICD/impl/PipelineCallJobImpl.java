/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.impl;

import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Expression;
import d.fe.up.pt.cicd.metamodel.CICD.PipelineCallJob;
import d.fe.up.pt.cicd.metamodel.CICD.Variable;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline Call Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineCallJobImpl#getPipelinePath <em>Pipeline Path</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineCallJobImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineCallJobImpl extends JobImpl implements PipelineCallJob {
	/**
	 * The cached value of the '{@link #getPipelinePath() <em>Pipeline Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipelinePath()
	 * @generated
	 * @ordered
	 */
	protected Expression pipelinePath;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EMap<Variable, Expression> args;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineCallJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CICDPackage.Literals.PIPELINE_CALL_JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getPipelinePath() {
		return pipelinePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPipelinePath(Expression newPipelinePath, NotificationChain msgs) {
		Expression oldPipelinePath = pipelinePath;
		pipelinePath = newPipelinePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CICDPackage.PIPELINE_CALL_JOB__PIPELINE_PATH, oldPipelinePath, newPipelinePath);
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
	public void setPipelinePath(Expression newPipelinePath) {
		if (newPipelinePath != pipelinePath) {
			NotificationChain msgs = null;
			if (pipelinePath != null)
				msgs = ((InternalEObject) pipelinePath).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CICDPackage.PIPELINE_CALL_JOB__PIPELINE_PATH, null, msgs);
			if (newPipelinePath != null)
				msgs = ((InternalEObject) newPipelinePath).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CICDPackage.PIPELINE_CALL_JOB__PIPELINE_PATH, null, msgs);
			msgs = basicSetPipelinePath(newPipelinePath, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICDPackage.PIPELINE_CALL_JOB__PIPELINE_PATH,
					newPipelinePath, newPipelinePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<Variable, Expression> getArgs() {
		if (args == null) {
			args = new EcoreEMap<Variable, Expression>(CICDPackage.Literals.ASSIGNMENT, AssignmentImpl.class, this,
					CICDPackage.PIPELINE_CALL_JOB__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CICDPackage.PIPELINE_CALL_JOB__PIPELINE_PATH:
			return basicSetPipelinePath(null, msgs);
		case CICDPackage.PIPELINE_CALL_JOB__ARGS:
			return ((InternalEList<?>) getArgs()).basicRemove(otherEnd, msgs);
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
		case CICDPackage.PIPELINE_CALL_JOB__PIPELINE_PATH:
			return getPipelinePath();
		case CICDPackage.PIPELINE_CALL_JOB__ARGS:
			if (coreType)
				return getArgs();
			else
				return getArgs().map();
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
		case CICDPackage.PIPELINE_CALL_JOB__PIPELINE_PATH:
			setPipelinePath((Expression) newValue);
			return;
		case CICDPackage.PIPELINE_CALL_JOB__ARGS:
			((EStructuralFeature.Setting) getArgs()).set(newValue);
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
		case CICDPackage.PIPELINE_CALL_JOB__PIPELINE_PATH:
			setPipelinePath((Expression) null);
			return;
		case CICDPackage.PIPELINE_CALL_JOB__ARGS:
			getArgs().clear();
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
		case CICDPackage.PIPELINE_CALL_JOB__PIPELINE_PATH:
			return pipelinePath != null;
		case CICDPackage.PIPELINE_CALL_JOB__ARGS:
			return args != null && !args.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PipelineCallJobImpl
