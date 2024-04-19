/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractAgent;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Expression;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.VariableDeclaration;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WHEN_EVALUATION_TIMES;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.When;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractStageImpl#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractStageImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractStageImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractStageImpl#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractStageImpl#getWhens <em>Whens</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractStageImpl#getWhenEvaluationTime <em>When Evaluation Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractStageImpl extends AbstractPipelineExecutionBlockImpl implements AbstractStage {
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
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected AbstractAgent agent;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<When> conditions;

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
	 * The cached value of the '{@link #getWhens() <em>Whens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhens()
	 * @generated
	 * @ordered
	 */
	protected EList<When> whens;

	/**
	 * The cached value of the '{@link #getWhenEvaluationTime() <em>When Evaluation Time</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenEvaluationTime()
	 * @generated
	 * @ordered
	 */
	protected EList<WHEN_EVALUATION_TIMES> whenEvaluationTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JenkinsPackage.Literals.ABSTRACT_STAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.ABSTRACT_STAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractAgent getAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgent(AbstractAgent newAgent, NotificationChain msgs) {
		AbstractAgent oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JenkinsPackage.ABSTRACT_STAGE__AGENT, oldAgent, newAgent);
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
	public void setAgent(AbstractAgent newAgent) {
		if (newAgent != agent) {
			NotificationChain msgs = null;
			if (agent != null)
				msgs = ((InternalEObject) agent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JenkinsPackage.ABSTRACT_STAGE__AGENT, null, msgs);
			if (newAgent != null)
				msgs = ((InternalEObject) newAgent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JenkinsPackage.ABSTRACT_STAGE__AGENT, null, msgs);
			msgs = basicSetAgent(newAgent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.ABSTRACT_STAGE__AGENT, newAgent,
					newAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<When> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<When>(When.class, this, JenkinsPackage.ABSTRACT_STAGE__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<VariableDeclaration, Expression> getEnvironmentVariables() {
		if (environmentVariables == null) {
			environmentVariables = new EcoreEMap<VariableDeclaration, Expression>(JenkinsPackage.Literals.ASSIGNMENT,
					AssignmentImpl.class, this, JenkinsPackage.ABSTRACT_STAGE__ENVIRONMENT_VARIABLES);
		}
		return environmentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<When> getWhens() {
		if (whens == null) {
			whens = new EObjectContainmentEList<When>(When.class, this, JenkinsPackage.ABSTRACT_STAGE__WHENS);
		}
		return whens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WHEN_EVALUATION_TIMES> getWhenEvaluationTime() {
		if (whenEvaluationTime == null) {
			whenEvaluationTime = new EDataTypeUniqueEList<WHEN_EVALUATION_TIMES>(WHEN_EVALUATION_TIMES.class, this,
					JenkinsPackage.ABSTRACT_STAGE__WHEN_EVALUATION_TIME);
		}
		return whenEvaluationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JenkinsPackage.ABSTRACT_STAGE__AGENT:
			return basicSetAgent(null, msgs);
		case JenkinsPackage.ABSTRACT_STAGE__CONDITIONS:
			return ((InternalEList<?>) getConditions()).basicRemove(otherEnd, msgs);
		case JenkinsPackage.ABSTRACT_STAGE__ENVIRONMENT_VARIABLES:
			return ((InternalEList<?>) getEnvironmentVariables()).basicRemove(otherEnd, msgs);
		case JenkinsPackage.ABSTRACT_STAGE__WHENS:
			return ((InternalEList<?>) getWhens()).basicRemove(otherEnd, msgs);
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
		case JenkinsPackage.ABSTRACT_STAGE__NAME:
			return getName();
		case JenkinsPackage.ABSTRACT_STAGE__AGENT:
			return getAgent();
		case JenkinsPackage.ABSTRACT_STAGE__CONDITIONS:
			return getConditions();
		case JenkinsPackage.ABSTRACT_STAGE__ENVIRONMENT_VARIABLES:
			if (coreType)
				return getEnvironmentVariables();
			else
				return getEnvironmentVariables().map();
		case JenkinsPackage.ABSTRACT_STAGE__WHENS:
			return getWhens();
		case JenkinsPackage.ABSTRACT_STAGE__WHEN_EVALUATION_TIME:
			return getWhenEvaluationTime();
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
		case JenkinsPackage.ABSTRACT_STAGE__NAME:
			setName((String) newValue);
			return;
		case JenkinsPackage.ABSTRACT_STAGE__AGENT:
			setAgent((AbstractAgent) newValue);
			return;
		case JenkinsPackage.ABSTRACT_STAGE__CONDITIONS:
			getConditions().clear();
			getConditions().addAll((Collection<? extends When>) newValue);
			return;
		case JenkinsPackage.ABSTRACT_STAGE__ENVIRONMENT_VARIABLES:
			((EStructuralFeature.Setting) getEnvironmentVariables()).set(newValue);
			return;
		case JenkinsPackage.ABSTRACT_STAGE__WHENS:
			getWhens().clear();
			getWhens().addAll((Collection<? extends When>) newValue);
			return;
		case JenkinsPackage.ABSTRACT_STAGE__WHEN_EVALUATION_TIME:
			getWhenEvaluationTime().clear();
			getWhenEvaluationTime().addAll((Collection<? extends WHEN_EVALUATION_TIMES>) newValue);
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
		case JenkinsPackage.ABSTRACT_STAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case JenkinsPackage.ABSTRACT_STAGE__AGENT:
			setAgent((AbstractAgent) null);
			return;
		case JenkinsPackage.ABSTRACT_STAGE__CONDITIONS:
			getConditions().clear();
			return;
		case JenkinsPackage.ABSTRACT_STAGE__ENVIRONMENT_VARIABLES:
			getEnvironmentVariables().clear();
			return;
		case JenkinsPackage.ABSTRACT_STAGE__WHENS:
			getWhens().clear();
			return;
		case JenkinsPackage.ABSTRACT_STAGE__WHEN_EVALUATION_TIME:
			getWhenEvaluationTime().clear();
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
		case JenkinsPackage.ABSTRACT_STAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case JenkinsPackage.ABSTRACT_STAGE__AGENT:
			return agent != null;
		case JenkinsPackage.ABSTRACT_STAGE__CONDITIONS:
			return conditions != null && !conditions.isEmpty();
		case JenkinsPackage.ABSTRACT_STAGE__ENVIRONMENT_VARIABLES:
			return environmentVariables != null && !environmentVariables.isEmpty();
		case JenkinsPackage.ABSTRACT_STAGE__WHENS:
			return whens != null && !whens.isEmpty();
		case JenkinsPackage.ABSTRACT_STAGE__WHEN_EVALUATION_TIME:
			return whenEvaluationTime != null && !whenEvaluationTime.isEmpty();
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
		result.append(", whenEvaluationTime: ");
		result.append(whenEvaluationTime);
		result.append(')');
		return result.toString();
	}

} //AbstractStageImpl
