/**
 */
package GHA.Jobs.impl;

import GHA.Expressions.Expression;
import GHA.Expressions.ExpressionsPackage;

import GHA.Expressions.impl.VariableAssignmentImpl;

import GHA.Jobs.JobsPackage;
import GHA.Jobs.ReuseWorkflowJob;

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
 * An implementation of the model object '<em><b>Reuse Workflow Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GHA.Jobs.impl.ReuseWorkflowJobImpl#getWorkflowPath <em>Workflow Path</em>}</li>
 *   <li>{@link GHA.Jobs.impl.ReuseWorkflowJobImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link GHA.Jobs.impl.ReuseWorkflowJobImpl#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link GHA.Jobs.impl.ReuseWorkflowJobImpl#getInheritSecrets <em>Inherit Secrets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReuseWorkflowJobImpl extends JobImpl implements ReuseWorkflowJob {
	/**
	 * The cached value of the '{@link #getWorkflowPath() <em>Workflow Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowPath()
	 * @generated
	 * @ordered
	 */
	protected Expression workflowPath;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Expression> args;

	/**
	 * The cached value of the '{@link #getSecrets() <em>Secrets</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Expression> secrets;

	/**
	 * The default value of the '{@link #getInheritSecrets() <em>Inherit Secrets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritSecrets()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INHERIT_SECRETS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInheritSecrets() <em>Inherit Secrets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritSecrets()
	 * @generated
	 * @ordered
	 */
	protected Boolean inheritSecrets = INHERIT_SECRETS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReuseWorkflowJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobsPackage.Literals.REUSE_WORKFLOW_JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getWorkflowPath() {
		return workflowPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkflowPath(Expression newWorkflowPath, NotificationChain msgs) {
		Expression oldWorkflowPath = workflowPath;
		workflowPath = newWorkflowPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JobsPackage.REUSE_WORKFLOW_JOB__WORKFLOW_PATH, oldWorkflowPath, newWorkflowPath);
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
	public void setWorkflowPath(Expression newWorkflowPath) {
		if (newWorkflowPath != workflowPath) {
			NotificationChain msgs = null;
			if (workflowPath != null)
				msgs = ((InternalEObject) workflowPath).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.REUSE_WORKFLOW_JOB__WORKFLOW_PATH, null, msgs);
			if (newWorkflowPath != null)
				msgs = ((InternalEObject) newWorkflowPath).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.REUSE_WORKFLOW_JOB__WORKFLOW_PATH, null, msgs);
			msgs = basicSetWorkflowPath(newWorkflowPath, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobsPackage.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
					newWorkflowPath, newWorkflowPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Expression> getArgs() {
		if (args == null) {
			args = new EcoreEMap<String, Expression>(ExpressionsPackage.Literals.VARIABLE_ASSIGNMENT,
					VariableAssignmentImpl.class, this, JobsPackage.REUSE_WORKFLOW_JOB__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Expression> getSecrets() {
		if (secrets == null) {
			secrets = new EcoreEMap<String, Expression>(ExpressionsPackage.Literals.VARIABLE_ASSIGNMENT,
					VariableAssignmentImpl.class, this, JobsPackage.REUSE_WORKFLOW_JOB__SECRETS);
		}
		return secrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getInheritSecrets() {
		return inheritSecrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInheritSecrets(Boolean newInheritSecrets) {
		Boolean oldInheritSecrets = inheritSecrets;
		inheritSecrets = newInheritSecrets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobsPackage.REUSE_WORKFLOW_JOB__INHERIT_SECRETS,
					oldInheritSecrets, inheritSecrets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JobsPackage.REUSE_WORKFLOW_JOB__WORKFLOW_PATH:
			return basicSetWorkflowPath(null, msgs);
		case JobsPackage.REUSE_WORKFLOW_JOB__ARGS:
			return ((InternalEList<?>) getArgs()).basicRemove(otherEnd, msgs);
		case JobsPackage.REUSE_WORKFLOW_JOB__SECRETS:
			return ((InternalEList<?>) getSecrets()).basicRemove(otherEnd, msgs);
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
		case JobsPackage.REUSE_WORKFLOW_JOB__WORKFLOW_PATH:
			return getWorkflowPath();
		case JobsPackage.REUSE_WORKFLOW_JOB__ARGS:
			if (coreType)
				return getArgs();
			else
				return getArgs().map();
		case JobsPackage.REUSE_WORKFLOW_JOB__SECRETS:
			if (coreType)
				return getSecrets();
			else
				return getSecrets().map();
		case JobsPackage.REUSE_WORKFLOW_JOB__INHERIT_SECRETS:
			return getInheritSecrets();
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
		case JobsPackage.REUSE_WORKFLOW_JOB__WORKFLOW_PATH:
			setWorkflowPath((Expression) newValue);
			return;
		case JobsPackage.REUSE_WORKFLOW_JOB__ARGS:
			((EStructuralFeature.Setting) getArgs()).set(newValue);
			return;
		case JobsPackage.REUSE_WORKFLOW_JOB__SECRETS:
			((EStructuralFeature.Setting) getSecrets()).set(newValue);
			return;
		case JobsPackage.REUSE_WORKFLOW_JOB__INHERIT_SECRETS:
			setInheritSecrets((Boolean) newValue);
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
		case JobsPackage.REUSE_WORKFLOW_JOB__WORKFLOW_PATH:
			setWorkflowPath((Expression) null);
			return;
		case JobsPackage.REUSE_WORKFLOW_JOB__ARGS:
			getArgs().clear();
			return;
		case JobsPackage.REUSE_WORKFLOW_JOB__SECRETS:
			getSecrets().clear();
			return;
		case JobsPackage.REUSE_WORKFLOW_JOB__INHERIT_SECRETS:
			setInheritSecrets(INHERIT_SECRETS_EDEFAULT);
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
		case JobsPackage.REUSE_WORKFLOW_JOB__WORKFLOW_PATH:
			return workflowPath != null;
		case JobsPackage.REUSE_WORKFLOW_JOB__ARGS:
			return args != null && !args.isEmpty();
		case JobsPackage.REUSE_WORKFLOW_JOB__SECRETS:
			return secrets != null && !secrets.isEmpty();
		case JobsPackage.REUSE_WORKFLOW_JOB__INHERIT_SECRETS:
			return INHERIT_SECRETS_EDEFAULT == null ? inheritSecrets != null
					: !INHERIT_SECRETS_EDEFAULT.equals(inheritSecrets);
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
		result.append(" (inheritSecrets: ");
		result.append(inheritSecrets);
		result.append(')');
		return result.toString();
	}

} //ReuseWorkflowJobImpl
