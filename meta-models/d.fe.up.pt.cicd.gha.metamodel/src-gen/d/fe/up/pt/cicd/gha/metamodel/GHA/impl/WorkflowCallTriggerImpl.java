/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA.impl;

import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Output;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Secret;
import d.fe.up.pt.cicd.gha.metamodel.GHA.WorkflowCallTrigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Call Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.impl.WorkflowCallTriggerImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.impl.WorkflowCallTriggerImpl#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowCallTriggerImpl extends InputTriggerImpl implements WorkflowCallTrigger {
	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputs;

	/**
	 * The cached value of the '{@link #getSecrets() <em>Secrets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets()
	 * @generated
	 * @ordered
	 */
	protected EList<Secret> secrets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowCallTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHAPackage.Literals.WORKFLOW_CALL_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Output>(Output.class, this,
					GHAPackage.WORKFLOW_CALL_TRIGGER__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Secret> getSecrets() {
		if (secrets == null) {
			secrets = new EObjectContainmentEList<Secret>(Secret.class, this,
					GHAPackage.WORKFLOW_CALL_TRIGGER__SECRETS);
		}
		return secrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GHAPackage.WORKFLOW_CALL_TRIGGER__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd, msgs);
		case GHAPackage.WORKFLOW_CALL_TRIGGER__SECRETS:
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
		case GHAPackage.WORKFLOW_CALL_TRIGGER__OUTPUTS:
			return getOutputs();
		case GHAPackage.WORKFLOW_CALL_TRIGGER__SECRETS:
			return getSecrets();
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
		case GHAPackage.WORKFLOW_CALL_TRIGGER__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends Output>) newValue);
			return;
		case GHAPackage.WORKFLOW_CALL_TRIGGER__SECRETS:
			getSecrets().clear();
			getSecrets().addAll((Collection<? extends Secret>) newValue);
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
		case GHAPackage.WORKFLOW_CALL_TRIGGER__OUTPUTS:
			getOutputs().clear();
			return;
		case GHAPackage.WORKFLOW_CALL_TRIGGER__SECRETS:
			getSecrets().clear();
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
		case GHAPackage.WORKFLOW_CALL_TRIGGER__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		case GHAPackage.WORKFLOW_CALL_TRIGGER__SECRETS:
			return secrets != null && !secrets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkflowCallTriggerImpl
