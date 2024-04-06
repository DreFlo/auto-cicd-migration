/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matrix;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Job Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowJobConfigurationImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowJobConfigurationImpl#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowJobConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowJobConfigurationImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowJobConfigurationImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowJobConfigurationImpl#getIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowJobConfigurationImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowJobConfigurationImpl#getIgnoreSpecifiedTags <em>Ignore Specified Tags</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowJobConfigurationImpl#getMatrix <em>Matrix</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowJobConfigurationImpl#getPreSteps <em>Pre Steps</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowJobConfigurationImpl#getPostSteps <em>Post Steps</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowJobConfigurationImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class WorkflowJobConfigurationImpl extends MinimalEObjectImpl.Container
		implements WorkflowJobConfiguration {
	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowJobConfiguration> requires;

	/**
	 * The cached value of the '{@link #getRequiredBy() <em>Required By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowJobConfiguration> requiredBy;

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
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> contexts;

	/**
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> branches;

	/**
	 * The default value of the '{@link #getIgnoreSpecifiedBranches() <em>Ignore Specified Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreSpecifiedBranches()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IGNORE_SPECIFIED_BRANCHES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreSpecifiedBranches() <em>Ignore Specified Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreSpecifiedBranches()
	 * @generated
	 * @ordered
	 */
	protected Boolean ignoreSpecifiedBranches = IGNORE_SPECIFIED_BRANCHES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> tags;

	/**
	 * The default value of the '{@link #getIgnoreSpecifiedTags() <em>Ignore Specified Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreSpecifiedTags()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IGNORE_SPECIFIED_TAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreSpecifiedTags() <em>Ignore Specified Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreSpecifiedTags()
	 * @generated
	 * @ordered
	 */
	protected Boolean ignoreSpecifiedTags = IGNORE_SPECIFIED_TAGS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatrix() <em>Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrix()
	 * @generated
	 * @ordered
	 */
	protected Matrix matrix;

	/**
	 * The cached value of the '{@link #getPreSteps() <em>Pre Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> preSteps;

	/**
	 * The cached value of the '{@link #getPostSteps() <em>Post Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> postSteps;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Expression> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowJobConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkflowJobConfiguration> getRequires() {
		if (requires == null) {
			requires = new EObjectWithInverseResolvingEList.ManyInverse<WorkflowJobConfiguration>(
					WorkflowJobConfiguration.class, this, CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__REQUIRES,
					CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkflowJobConfiguration> getRequiredBy() {
		if (requiredBy == null) {
			requiredBy = new EObjectWithInverseResolvingEList.ManyInverse<WorkflowJobConfiguration>(
					WorkflowJobConfiguration.class, this, CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY,
					CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__REQUIRES);
		}
		return requiredBy;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getContexts() {
		if (contexts == null) {
			contexts = new EObjectContainmentEList<Expression>(Expression.class, this,
					CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getBranches() {
		if (branches == null) {
			branches = new EObjectContainmentEList<Expression>(Expression.class, this,
					CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__BRANCHES);
		}
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIgnoreSpecifiedBranches() {
		return ignoreSpecifiedBranches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreSpecifiedBranches(Boolean newIgnoreSpecifiedBranches) {
		Boolean oldIgnoreSpecifiedBranches = ignoreSpecifiedBranches;
		ignoreSpecifiedBranches = newIgnoreSpecifiedBranches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES, oldIgnoreSpecifiedBranches,
					ignoreSpecifiedBranches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Expression>(Expression.class, this,
					CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIgnoreSpecifiedTags() {
		return ignoreSpecifiedTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreSpecifiedTags(Boolean newIgnoreSpecifiedTags) {
		Boolean oldIgnoreSpecifiedTags = ignoreSpecifiedTags;
		ignoreSpecifiedTags = newIgnoreSpecifiedTags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS, oldIgnoreSpecifiedTags,
					ignoreSpecifiedTags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Matrix getMatrix() {
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatrix(Matrix newMatrix, NotificationChain msgs) {
		Matrix oldMatrix = matrix;
		matrix = newMatrix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__MATRIX, oldMatrix, newMatrix);
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
	public void setMatrix(Matrix newMatrix) {
		if (newMatrix != matrix) {
			NotificationChain msgs = null;
			if (matrix != null)
				msgs = ((InternalEObject) matrix).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__MATRIX, null, msgs);
			if (newMatrix != null)
				msgs = ((InternalEObject) newMatrix).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__MATRIX, null, msgs);
			msgs = basicSetMatrix(newMatrix, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__MATRIX,
					newMatrix, newMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getPreSteps() {
		if (preSteps == null) {
			preSteps = new EObjectContainmentEList<Step>(Step.class, this,
					CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS);
		}
		return preSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getPostSteps() {
		if (postSteps == null) {
			postSteps = new EObjectContainmentEList<Step>(Step.class, this,
					CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__POST_STEPS);
		}
		return postSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Expression> getArguments() {
		if (arguments == null) {
			arguments = new EcoreEMap<String, Expression>(CircleCIPackage.Literals.VARIABLE_ASSIGNMENT,
					VariableAssignmentImpl.class, this, CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__REQUIRES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequires()).basicAdd(otherEnd, msgs);
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequiredBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__REQUIRES:
			return ((InternalEList<?>) getRequires()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY:
			return ((InternalEList<?>) getRequiredBy()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__CONTEXTS:
			return ((InternalEList<?>) getContexts()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__BRANCHES:
			return ((InternalEList<?>) getBranches()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__TAGS:
			return ((InternalEList<?>) getTags()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__MATRIX:
			return basicSetMatrix(null, msgs);
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS:
			return ((InternalEList<?>) getPreSteps()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__POST_STEPS:
			return ((InternalEList<?>) getPostSteps()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__ARGUMENTS:
			return ((InternalEList<?>) getArguments()).basicRemove(otherEnd, msgs);
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
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__REQUIRES:
			return getRequires();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY:
			return getRequiredBy();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__NAME:
			return getName();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__CONTEXTS:
			return getContexts();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__BRANCHES:
			return getBranches();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES:
			return getIgnoreSpecifiedBranches();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__TAGS:
			return getTags();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS:
			return getIgnoreSpecifiedTags();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__MATRIX:
			return getMatrix();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS:
			return getPreSteps();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__POST_STEPS:
			return getPostSteps();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__ARGUMENTS:
			if (coreType)
				return getArguments();
			else
				return getArguments().map();
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
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__REQUIRES:
			getRequires().clear();
			getRequires().addAll((Collection<? extends WorkflowJobConfiguration>) newValue);
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY:
			getRequiredBy().clear();
			getRequiredBy().addAll((Collection<? extends WorkflowJobConfiguration>) newValue);
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__NAME:
			setName((String) newValue);
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__CONTEXTS:
			getContexts().clear();
			getContexts().addAll((Collection<? extends Expression>) newValue);
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__BRANCHES:
			getBranches().clear();
			getBranches().addAll((Collection<? extends Expression>) newValue);
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES:
			setIgnoreSpecifiedBranches((Boolean) newValue);
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__TAGS:
			getTags().clear();
			getTags().addAll((Collection<? extends Expression>) newValue);
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS:
			setIgnoreSpecifiedTags((Boolean) newValue);
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__MATRIX:
			setMatrix((Matrix) newValue);
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS:
			getPreSteps().clear();
			getPreSteps().addAll((Collection<? extends Step>) newValue);
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__POST_STEPS:
			getPostSteps().clear();
			getPostSteps().addAll((Collection<? extends Step>) newValue);
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__ARGUMENTS:
			((EStructuralFeature.Setting) getArguments()).set(newValue);
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
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__REQUIRES:
			getRequires().clear();
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY:
			getRequiredBy().clear();
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__CONTEXTS:
			getContexts().clear();
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__BRANCHES:
			getBranches().clear();
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES:
			setIgnoreSpecifiedBranches(IGNORE_SPECIFIED_BRANCHES_EDEFAULT);
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__TAGS:
			getTags().clear();
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS:
			setIgnoreSpecifiedTags(IGNORE_SPECIFIED_TAGS_EDEFAULT);
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__MATRIX:
			setMatrix((Matrix) null);
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS:
			getPreSteps().clear();
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__POST_STEPS:
			getPostSteps().clear();
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__ARGUMENTS:
			getArguments().clear();
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
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__REQUIRES:
			return requires != null && !requires.isEmpty();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY:
			return requiredBy != null && !requiredBy.isEmpty();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__CONTEXTS:
			return contexts != null && !contexts.isEmpty();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__BRANCHES:
			return branches != null && !branches.isEmpty();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES:
			return IGNORE_SPECIFIED_BRANCHES_EDEFAULT == null ? ignoreSpecifiedBranches != null
					: !IGNORE_SPECIFIED_BRANCHES_EDEFAULT.equals(ignoreSpecifiedBranches);
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__TAGS:
			return tags != null && !tags.isEmpty();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS:
			return IGNORE_SPECIFIED_TAGS_EDEFAULT == null ? ignoreSpecifiedTags != null
					: !IGNORE_SPECIFIED_TAGS_EDEFAULT.equals(ignoreSpecifiedTags);
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__MATRIX:
			return matrix != null;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS:
			return preSteps != null && !preSteps.isEmpty();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__POST_STEPS:
			return postSteps != null && !postSteps.isEmpty();
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__ARGUMENTS:
			return arguments != null && !arguments.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", ignoreSpecifiedBranches: ");
		result.append(ignoreSpecifiedBranches);
		result.append(", ignoreSpecifiedTags: ");
		result.append(ignoreSpecifiedTags);
		result.append(')');
		return result.toString();
	}

} //WorkflowJobConfigurationImpl
