/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DefinitionGroup;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Orb;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DefinitionGroupImpl#getOrbs <em>Orbs</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DefinitionGroupImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DefinitionGroupImpl#getExecutors <em>Executors</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DefinitionGroupImpl#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DefinitionGroupImpl extends MinimalEObjectImpl.Container implements DefinitionGroup {
	/**
	 * The cached value of the '{@link #getOrbs() <em>Orbs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbs()
	 * @generated
	 * @ordered
	 */
	protected EList<Orb> orbs;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> commands;

	/**
	 * The cached value of the '{@link #getExecutors() <em>Executors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutors()
	 * @generated
	 * @ordered
	 */
	protected EList<Executor> executors;

	/**
	 * The cached value of the '{@link #getJobs() <em>Jobs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> jobs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCIPackage.Literals.DEFINITION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Orb> getOrbs() {
		if (orbs == null) {
			orbs = new EObjectContainmentEList<Orb>(Orb.class, this, CircleCIPackage.DEFINITION_GROUP__ORBS);
		}
		return orbs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<Command>(Command.class, this,
					CircleCIPackage.DEFINITION_GROUP__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Executor> getExecutors() {
		if (executors == null) {
			executors = new EObjectContainmentEList<Executor>(Executor.class, this,
					CircleCIPackage.DEFINITION_GROUP__EXECUTORS);
		}
		return executors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getJobs() {
		if (jobs == null) {
			jobs = new EObjectContainmentEList<Job>(Job.class, this, CircleCIPackage.DEFINITION_GROUP__JOBS);
		}
		return jobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCIPackage.DEFINITION_GROUP__ORBS:
			return ((InternalEList<?>) getOrbs()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.DEFINITION_GROUP__COMMANDS:
			return ((InternalEList<?>) getCommands()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.DEFINITION_GROUP__EXECUTORS:
			return ((InternalEList<?>) getExecutors()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.DEFINITION_GROUP__JOBS:
			return ((InternalEList<?>) getJobs()).basicRemove(otherEnd, msgs);
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
		case CircleCIPackage.DEFINITION_GROUP__ORBS:
			return getOrbs();
		case CircleCIPackage.DEFINITION_GROUP__COMMANDS:
			return getCommands();
		case CircleCIPackage.DEFINITION_GROUP__EXECUTORS:
			return getExecutors();
		case CircleCIPackage.DEFINITION_GROUP__JOBS:
			return getJobs();
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
		case CircleCIPackage.DEFINITION_GROUP__ORBS:
			getOrbs().clear();
			getOrbs().addAll((Collection<? extends Orb>) newValue);
			return;
		case CircleCIPackage.DEFINITION_GROUP__COMMANDS:
			getCommands().clear();
			getCommands().addAll((Collection<? extends Command>) newValue);
			return;
		case CircleCIPackage.DEFINITION_GROUP__EXECUTORS:
			getExecutors().clear();
			getExecutors().addAll((Collection<? extends Executor>) newValue);
			return;
		case CircleCIPackage.DEFINITION_GROUP__JOBS:
			getJobs().clear();
			getJobs().addAll((Collection<? extends Job>) newValue);
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
		case CircleCIPackage.DEFINITION_GROUP__ORBS:
			getOrbs().clear();
			return;
		case CircleCIPackage.DEFINITION_GROUP__COMMANDS:
			getCommands().clear();
			return;
		case CircleCIPackage.DEFINITION_GROUP__EXECUTORS:
			getExecutors().clear();
			return;
		case CircleCIPackage.DEFINITION_GROUP__JOBS:
			getJobs().clear();
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
		case CircleCIPackage.DEFINITION_GROUP__ORBS:
			return orbs != null && !orbs.isEmpty();
		case CircleCIPackage.DEFINITION_GROUP__COMMANDS:
			return commands != null && !commands.isEmpty();
		case CircleCIPackage.DEFINITION_GROUP__EXECUTORS:
			return executors != null && !executors.isEmpty();
		case CircleCIPackage.DEFINITION_GROUP__JOBS:
			return jobs != null && !jobs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DefinitionGroupImpl
