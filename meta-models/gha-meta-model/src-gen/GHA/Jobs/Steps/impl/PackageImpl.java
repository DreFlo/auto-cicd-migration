/**
 */
package GHA.Jobs.Steps.impl;

import GHA.Expressions.Expression;
import GHA.Expressions.ExpressionsPackage;

import GHA.Expressions.impl.VariableAssignmentImpl;

import GHA.Jobs.Steps.StepsPackage;

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
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GHA.Jobs.Steps.impl.PackageImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link GHA.Jobs.Steps.impl.PackageImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link GHA.Jobs.Steps.impl.PackageImpl#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link GHA.Jobs.Steps.impl.PackageImpl#getContainerArgs <em>Container Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends StepImpl implements GHA.Jobs.Steps.Package {
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
	 * The cached value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrypoint()
	 * @generated
	 * @ordered
	 */
	protected Expression entrypoint;

	/**
	 * The cached value of the '{@link #getContainerArgs() <em>Container Args</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerArgs()
	 * @generated
	 * @ordered
	 */
	protected Expression containerArgs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.PACKAGE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StepsPackage.PACKAGE__USES,
					oldUses, newUses);
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
						EOPPOSITE_FEATURE_BASE - StepsPackage.PACKAGE__USES, null, msgs);
			if (newUses != null)
				msgs = ((InternalEObject) newUses).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StepsPackage.PACKAGE__USES, null, msgs);
			msgs = basicSetUses(newUses, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.PACKAGE__USES, newUses, newUses));
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
					VariableAssignmentImpl.class, this, StepsPackage.PACKAGE__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getEntrypoint() {
		return entrypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntrypoint(Expression newEntrypoint, NotificationChain msgs) {
		Expression oldEntrypoint = entrypoint;
		entrypoint = newEntrypoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StepsPackage.PACKAGE__ENTRYPOINT, oldEntrypoint, newEntrypoint);
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
	public void setEntrypoint(Expression newEntrypoint) {
		if (newEntrypoint != entrypoint) {
			NotificationChain msgs = null;
			if (entrypoint != null)
				msgs = ((InternalEObject) entrypoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StepsPackage.PACKAGE__ENTRYPOINT, null, msgs);
			if (newEntrypoint != null)
				msgs = ((InternalEObject) newEntrypoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StepsPackage.PACKAGE__ENTRYPOINT, null, msgs);
			msgs = basicSetEntrypoint(newEntrypoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.PACKAGE__ENTRYPOINT, newEntrypoint,
					newEntrypoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getContainerArgs() {
		return containerArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerArgs(Expression newContainerArgs, NotificationChain msgs) {
		Expression oldContainerArgs = containerArgs;
		containerArgs = newContainerArgs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StepsPackage.PACKAGE__CONTAINER_ARGS, oldContainerArgs, newContainerArgs);
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
	public void setContainerArgs(Expression newContainerArgs) {
		if (newContainerArgs != containerArgs) {
			NotificationChain msgs = null;
			if (containerArgs != null)
				msgs = ((InternalEObject) containerArgs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StepsPackage.PACKAGE__CONTAINER_ARGS, null, msgs);
			if (newContainerArgs != null)
				msgs = ((InternalEObject) newContainerArgs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StepsPackage.PACKAGE__CONTAINER_ARGS, null, msgs);
			msgs = basicSetContainerArgs(newContainerArgs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.PACKAGE__CONTAINER_ARGS,
					newContainerArgs, newContainerArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StepsPackage.PACKAGE__USES:
			return basicSetUses(null, msgs);
		case StepsPackage.PACKAGE__ARGS:
			return ((InternalEList<?>) getArgs()).basicRemove(otherEnd, msgs);
		case StepsPackage.PACKAGE__ENTRYPOINT:
			return basicSetEntrypoint(null, msgs);
		case StepsPackage.PACKAGE__CONTAINER_ARGS:
			return basicSetContainerArgs(null, msgs);
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
		case StepsPackage.PACKAGE__USES:
			return getUses();
		case StepsPackage.PACKAGE__ARGS:
			if (coreType)
				return getArgs();
			else
				return getArgs().map();
		case StepsPackage.PACKAGE__ENTRYPOINT:
			return getEntrypoint();
		case StepsPackage.PACKAGE__CONTAINER_ARGS:
			return getContainerArgs();
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
		case StepsPackage.PACKAGE__USES:
			setUses((Expression) newValue);
			return;
		case StepsPackage.PACKAGE__ARGS:
			((EStructuralFeature.Setting) getArgs()).set(newValue);
			return;
		case StepsPackage.PACKAGE__ENTRYPOINT:
			setEntrypoint((Expression) newValue);
			return;
		case StepsPackage.PACKAGE__CONTAINER_ARGS:
			setContainerArgs((Expression) newValue);
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
		case StepsPackage.PACKAGE__USES:
			setUses((Expression) null);
			return;
		case StepsPackage.PACKAGE__ARGS:
			getArgs().clear();
			return;
		case StepsPackage.PACKAGE__ENTRYPOINT:
			setEntrypoint((Expression) null);
			return;
		case StepsPackage.PACKAGE__CONTAINER_ARGS:
			setContainerArgs((Expression) null);
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
		case StepsPackage.PACKAGE__USES:
			return uses != null;
		case StepsPackage.PACKAGE__ARGS:
			return args != null && !args.isEmpty();
		case StepsPackage.PACKAGE__ENTRYPOINT:
			return entrypoint != null;
		case StepsPackage.PACKAGE__CONTAINER_ARGS:
			return containerArgs != null;
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
