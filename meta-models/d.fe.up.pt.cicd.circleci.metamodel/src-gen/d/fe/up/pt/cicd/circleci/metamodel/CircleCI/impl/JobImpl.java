/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Callable;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl#getParallelism <em>Parallelism</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl#getCircleCIIPRanges <em>Circle CIIP Ranges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends ScriptImpl implements Job {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getEnvironmentVariables() <em>Environment Variables</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentVariables()
	 * @generated
	 * @ordered
	 */
	protected EMap<VariableDeclaration, Expression> environmentVariables;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExecutor() <em>Executor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor()
	 * @generated
	 * @ordered
	 */
	protected Executor executor;

	/**
	 * The cached value of the '{@link #getParallelism() <em>Parallelism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelism()
	 * @generated
	 * @ordered
	 */
	protected Expression parallelism;

	/**
	 * The cached value of the '{@link #getCircleCIIPRanges() <em>Circle CIIP Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircleCIIPRanges()
	 * @generated
	 * @ordered
	 */
	protected Expression circleCIIPRanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCIPackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.JOB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Executor getExecutor() {
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutor(Executor newExecutor, NotificationChain msgs) {
		Executor oldExecutor = executor;
		executor = newExecutor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.JOB__EXECUTOR, oldExecutor, newExecutor);
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
	public void setExecutor(Executor newExecutor) {
		if (newExecutor != executor) {
			NotificationChain msgs = null;
			if (executor != null)
				msgs = ((InternalEObject) executor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.JOB__EXECUTOR, null, msgs);
			if (newExecutor != null)
				msgs = ((InternalEObject) newExecutor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.JOB__EXECUTOR, null, msgs);
			msgs = basicSetExecutor(newExecutor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.JOB__EXECUTOR, newExecutor,
					newExecutor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, CircleCIPackage.JOB__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getParallelism() {
		return parallelism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParallelism(Expression newParallelism, NotificationChain msgs) {
		Expression oldParallelism = parallelism;
		parallelism = newParallelism;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.JOB__PARALLELISM, oldParallelism, newParallelism);
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
	public void setParallelism(Expression newParallelism) {
		if (newParallelism != parallelism) {
			NotificationChain msgs = null;
			if (parallelism != null)
				msgs = ((InternalEObject) parallelism).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.JOB__PARALLELISM, null, msgs);
			if (newParallelism != null)
				msgs = ((InternalEObject) newParallelism).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.JOB__PARALLELISM, null, msgs);
			msgs = basicSetParallelism(newParallelism, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.JOB__PARALLELISM, newParallelism,
					newParallelism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<VariableDeclaration, Expression> getEnvironmentVariables() {
		if (environmentVariables == null) {
			environmentVariables = new EcoreEMap<VariableDeclaration, Expression>(
					CircleCIPackage.Literals.VARIABLE_ASSIGNMENT, VariableAssignmentImpl.class, this,
					CircleCIPackage.JOB__ENVIRONMENT_VARIABLES);
		}
		return environmentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getCircleCIIPRanges() {
		return circleCIIPRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircleCIIPRanges(Expression newCircleCIIPRanges, NotificationChain msgs) {
		Expression oldCircleCIIPRanges = circleCIIPRanges;
		circleCIIPRanges = newCircleCIIPRanges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.JOB__CIRCLE_CIIP_RANGES, oldCircleCIIPRanges, newCircleCIIPRanges);
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
	public void setCircleCIIPRanges(Expression newCircleCIIPRanges) {
		if (newCircleCIIPRanges != circleCIIPRanges) {
			NotificationChain msgs = null;
			if (circleCIIPRanges != null)
				msgs = ((InternalEObject) circleCIIPRanges).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.JOB__CIRCLE_CIIP_RANGES, null, msgs);
			if (newCircleCIIPRanges != null)
				msgs = ((InternalEObject) newCircleCIIPRanges).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.JOB__CIRCLE_CIIP_RANGES, null, msgs);
			msgs = basicSetCircleCIIPRanges(newCircleCIIPRanges, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.JOB__CIRCLE_CIIP_RANGES,
					newCircleCIIPRanges, newCircleCIIPRanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCIPackage.JOB__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.JOB__ENVIRONMENT_VARIABLES:
			return ((InternalEList<?>) getEnvironmentVariables()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.JOB__EXECUTOR:
			return basicSetExecutor(null, msgs);
		case CircleCIPackage.JOB__PARALLELISM:
			return basicSetParallelism(null, msgs);
		case CircleCIPackage.JOB__CIRCLE_CIIP_RANGES:
			return basicSetCircleCIIPRanges(null, msgs);
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
		case CircleCIPackage.JOB__PARAMETERS:
			return getParameters();
		case CircleCIPackage.JOB__ENVIRONMENT_VARIABLES:
			if (coreType)
				return getEnvironmentVariables();
			else
				return getEnvironmentVariables().map();
		case CircleCIPackage.JOB__NAME:
			return getName();
		case CircleCIPackage.JOB__EXECUTOR:
			return getExecutor();
		case CircleCIPackage.JOB__PARALLELISM:
			return getParallelism();
		case CircleCIPackage.JOB__CIRCLE_CIIP_RANGES:
			return getCircleCIIPRanges();
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
		case CircleCIPackage.JOB__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case CircleCIPackage.JOB__ENVIRONMENT_VARIABLES:
			((EStructuralFeature.Setting) getEnvironmentVariables()).set(newValue);
			return;
		case CircleCIPackage.JOB__NAME:
			setName((String) newValue);
			return;
		case CircleCIPackage.JOB__EXECUTOR:
			setExecutor((Executor) newValue);
			return;
		case CircleCIPackage.JOB__PARALLELISM:
			setParallelism((Expression) newValue);
			return;
		case CircleCIPackage.JOB__CIRCLE_CIIP_RANGES:
			setCircleCIIPRanges((Expression) newValue);
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
		case CircleCIPackage.JOB__PARAMETERS:
			getParameters().clear();
			return;
		case CircleCIPackage.JOB__ENVIRONMENT_VARIABLES:
			getEnvironmentVariables().clear();
			return;
		case CircleCIPackage.JOB__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CircleCIPackage.JOB__EXECUTOR:
			setExecutor((Executor) null);
			return;
		case CircleCIPackage.JOB__PARALLELISM:
			setParallelism((Expression) null);
			return;
		case CircleCIPackage.JOB__CIRCLE_CIIP_RANGES:
			setCircleCIIPRanges((Expression) null);
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
		case CircleCIPackage.JOB__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case CircleCIPackage.JOB__ENVIRONMENT_VARIABLES:
			return environmentVariables != null && !environmentVariables.isEmpty();
		case CircleCIPackage.JOB__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CircleCIPackage.JOB__EXECUTOR:
			return executor != null;
		case CircleCIPackage.JOB__PARALLELISM:
			return parallelism != null;
		case CircleCIPackage.JOB__CIRCLE_CIIP_RANGES:
			return circleCIIPRanges != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Callable.class) {
			switch (derivedFeatureID) {
			case CircleCIPackage.JOB__PARAMETERS:
				return CircleCIPackage.CALLABLE__PARAMETERS;
			default:
				return -1;
			}
		}
		if (baseClass == Environment.class) {
			switch (derivedFeatureID) {
			case CircleCIPackage.JOB__ENVIRONMENT_VARIABLES:
				return CircleCIPackage.ENVIRONMENT__ENVIRONMENT_VARIABLES;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Callable.class) {
			switch (baseFeatureID) {
			case CircleCIPackage.CALLABLE__PARAMETERS:
				return CircleCIPackage.JOB__PARAMETERS;
			default:
				return -1;
			}
		}
		if (baseClass == Environment.class) {
			switch (baseFeatureID) {
			case CircleCIPackage.ENVIRONMENT__ENVIRONMENT_VARIABLES:
				return CircleCIPackage.JOB__ENVIRONMENT_VARIABLES;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //JobImpl
