/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA.impl;

import d.fe.up.pt.cicd.gha.metamodel.GHA.Expression;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.WorkflowCallJob;
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
 * An implementation of the model object '<em><b>Workflow Call Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.impl.WorkflowCallJobImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.impl.WorkflowCallJobImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.impl.WorkflowCallJobImpl#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.impl.WorkflowCallJobImpl#getInheritSecrets <em>Inherit Secrets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowCallJobImpl extends JobImpl implements WorkflowCallJob {
	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected Expression uses;

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
	protected static final Boolean INHERIT_SECRETS_EDEFAULT = Boolean.FALSE;

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
	protected WorkflowCallJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHAPackage.Literals.WORKFLOW_CALL_JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getUses() {
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUses(Expression newUses, NotificationChain msgs) {
		Expression oldUses = uses;
		uses = newUses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GHAPackage.WORKFLOW_CALL_JOB__USES, oldUses, newUses);
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
	public void setUses(Expression newUses) {
		if (newUses != uses) {
			NotificationChain msgs = null;
			if (uses != null)
				msgs = ((InternalEObject) uses).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GHAPackage.WORKFLOW_CALL_JOB__USES, null, msgs);
			if (newUses != null)
				msgs = ((InternalEObject) newUses).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GHAPackage.WORKFLOW_CALL_JOB__USES, null, msgs);
			msgs = basicSetUses(newUses, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHAPackage.WORKFLOW_CALL_JOB__USES, newUses,
					newUses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Expression> getArgs() {
		if (args == null) {
			args = new EcoreEMap<String, Expression>(GHAPackage.Literals.VARIABLE_ASSIGNMENT,
					VariableAssignmentImpl.class, this, GHAPackage.WORKFLOW_CALL_JOB__ARGS);
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
			secrets = new EcoreEMap<String, Expression>(GHAPackage.Literals.VARIABLE_ASSIGNMENT,
					VariableAssignmentImpl.class, this, GHAPackage.WORKFLOW_CALL_JOB__SECRETS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GHAPackage.WORKFLOW_CALL_JOB__INHERIT_SECRETS,
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
		case GHAPackage.WORKFLOW_CALL_JOB__USES:
			return basicSetUses(null, msgs);
		case GHAPackage.WORKFLOW_CALL_JOB__ARGS:
			return ((InternalEList<?>) getArgs()).basicRemove(otherEnd, msgs);
		case GHAPackage.WORKFLOW_CALL_JOB__SECRETS:
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
		case GHAPackage.WORKFLOW_CALL_JOB__USES:
			return getUses();
		case GHAPackage.WORKFLOW_CALL_JOB__ARGS:
			if (coreType)
				return getArgs();
			else
				return getArgs().map();
		case GHAPackage.WORKFLOW_CALL_JOB__SECRETS:
			if (coreType)
				return getSecrets();
			else
				return getSecrets().map();
		case GHAPackage.WORKFLOW_CALL_JOB__INHERIT_SECRETS:
			return getInheritSecrets();
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
		case GHAPackage.WORKFLOW_CALL_JOB__USES:
			setUses((Expression) newValue);
			return;
		case GHAPackage.WORKFLOW_CALL_JOB__ARGS:
			((EStructuralFeature.Setting) getArgs()).set(newValue);
			return;
		case GHAPackage.WORKFLOW_CALL_JOB__SECRETS:
			((EStructuralFeature.Setting) getSecrets()).set(newValue);
			return;
		case GHAPackage.WORKFLOW_CALL_JOB__INHERIT_SECRETS:
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
		case GHAPackage.WORKFLOW_CALL_JOB__USES:
			setUses((Expression) null);
			return;
		case GHAPackage.WORKFLOW_CALL_JOB__ARGS:
			getArgs().clear();
			return;
		case GHAPackage.WORKFLOW_CALL_JOB__SECRETS:
			getSecrets().clear();
			return;
		case GHAPackage.WORKFLOW_CALL_JOB__INHERIT_SECRETS:
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
		case GHAPackage.WORKFLOW_CALL_JOB__USES:
			return uses != null;
		case GHAPackage.WORKFLOW_CALL_JOB__ARGS:
			return args != null && !args.isEmpty();
		case GHAPackage.WORKFLOW_CALL_JOB__SECRETS:
			return secrets != null && !secrets.isEmpty();
		case GHAPackage.WORKFLOW_CALL_JOB__INHERIT_SECRETS:
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

} //WorkflowCallJobImpl
