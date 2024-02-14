/**
 */
package GHA.Jobs.impl;

import GHA.Expressions.Expression;
import GHA.Expressions.ExpressionsPackage;

import GHA.Expressions.impl.VariableAssignmentImpl;

import GHA.Jobs.Agent;
import GHA.Jobs.Job;
import GHA.Jobs.JobsPackage;

import GHA.Jobs.Matrices.Matrix;

import GHA.Jobs.StagingEnvironment;

import GHA.Options.ConcurrencyGroup;
import GHA.Options.Defaults;
import GHA.Options.OptionsPackage;
import GHA.Options.PERMISSIONS;
import GHA.Options.PERMISSION_SCOPES;

import GHA.Options.impl.PermissionImpl;

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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link GHA.Jobs.impl.JobImpl#getName <em>Name</em>}</li>
 *   <li>{@link GHA.Jobs.impl.JobImpl#getJobName <em>Job Name</em>}</li>
 *   <li>{@link GHA.Jobs.impl.JobImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link GHA.Jobs.impl.JobImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link GHA.Jobs.impl.JobImpl#getIf <em>If</em>}</li>
 *   <li>{@link GHA.Jobs.impl.JobImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link GHA.Jobs.impl.JobImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link GHA.Jobs.impl.JobImpl#getStagingEnvironment <em>Staging Environment</em>}</li>
 *   <li>{@link GHA.Jobs.impl.JobImpl#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link GHA.Jobs.impl.JobImpl#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link GHA.Jobs.impl.JobImpl#getServices <em>Services</em>}</li>
 *   <li>{@link GHA.Jobs.impl.JobImpl#getConcurrencyGroup <em>Concurrency Group</em>}</li>
 *   <li>{@link GHA.Jobs.impl.JobImpl#getTimeoutMinutes <em>Timeout Minutes</em>}</li>
 *   <li>{@link GHA.Jobs.impl.JobImpl#getContinueOnError <em>Continue On Error</em>}</li>
 *   <li>{@link GHA.Jobs.impl.JobImpl#getStrategy <em>Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JobImpl extends MinimalEObjectImpl.Container implements Job {
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
	 * The cached value of the '{@link #getJobName() <em>Job Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobName()
	 * @generated
	 * @ordered
	 */
	protected Expression jobName;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EMap<PERMISSION_SCOPES, PERMISSIONS> permissions;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> dependsOn;

	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected Expression if_;

	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected Agent agent;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected GHA.Jobs.Container container;

	/**
	 * The cached value of the '{@link #getStagingEnvironment() <em>Staging Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStagingEnvironment()
	 * @generated
	 * @ordered
	 */
	protected StagingEnvironment stagingEnvironment;

	/**
	 * The cached value of the '{@link #getDefaults() <em>Defaults</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaults()
	 * @generated
	 * @ordered
	 */
	protected Defaults defaults;

	/**
	 * The cached value of the '{@link #getEnvironmentVariables() <em>Environment Variables</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentVariables()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Expression> environmentVariables;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, GHA.Jobs.Container> services;

	/**
	 * The cached value of the '{@link #getConcurrencyGroup() <em>Concurrency Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrencyGroup()
	 * @generated
	 * @ordered
	 */
	protected ConcurrencyGroup concurrencyGroup;

	/**
	 * The cached value of the '{@link #getTimeoutMinutes() <em>Timeout Minutes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutMinutes()
	 * @generated
	 * @ordered
	 */
	protected Expression timeoutMinutes;

	/**
	 * The cached value of the '{@link #getContinueOnError() <em>Continue On Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinueOnError()
	 * @generated
	 * @ordered
	 */
	protected Expression continueOnError;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected Matrix strategy;

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
		return JobsPackage.Literals.JOB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getJobName() {
		return jobName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobName(Expression newJobName, NotificationChain msgs) {
		Expression oldJobName = jobName;
		jobName = newJobName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__JOB_NAME,
					oldJobName, newJobName);
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
	public void setJobName(Expression newJobName) {
		if (newJobName != jobName) {
			NotificationChain msgs = null;
			if (jobName != null)
				msgs = ((InternalEObject) jobName).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__JOB_NAME, null, msgs);
			if (newJobName != null)
				msgs = ((InternalEObject) newJobName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__JOB_NAME, null, msgs);
			msgs = basicSetJobName(newJobName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__JOB_NAME, newJobName, newJobName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<PERMISSION_SCOPES, PERMISSIONS> getPermissions() {
		if (permissions == null) {
			permissions = new EcoreEMap<PERMISSION_SCOPES, PERMISSIONS>(OptionsPackage.Literals.PERMISSION,
					PermissionImpl.class, this, JobsPackage.JOB__PERMISSIONS);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getDependsOn() {
		if (dependsOn == null) {
			dependsOn = new EObjectResolvingEList<Job>(Job.class, this, JobsPackage.JOB__DEPENDS_ON);
		}
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getIf() {
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf(Expression newIf, NotificationChain msgs) {
		Expression oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__IF, oldIf,
					newIf);
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
	public void setIf(Expression newIf) {
		if (newIf != if_) {
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject) if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__IF, null,
						msgs);
			if (newIf != null)
				msgs = ((InternalEObject) newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__IF, null,
						msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__IF, newIf, newIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent getAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgent(Agent newAgent, NotificationChain msgs) {
		Agent oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__AGENT,
					oldAgent, newAgent);
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
	public void setAgent(Agent newAgent) {
		if (newAgent != agent) {
			NotificationChain msgs = null;
			if (agent != null)
				msgs = ((InternalEObject) agent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__AGENT,
						null, msgs);
			if (newAgent != null)
				msgs = ((InternalEObject) newAgent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__AGENT,
						null, msgs);
			msgs = basicSetAgent(newAgent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__AGENT, newAgent, newAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GHA.Jobs.Container getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(GHA.Jobs.Container newContainer, NotificationChain msgs) {
		GHA.Jobs.Container oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__CONTAINER,
					oldContainer, newContainer);
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
	public void setContainer(GHA.Jobs.Container newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject) container).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__CONTAINER, null, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__CONTAINER, null, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__CONTAINER, newContainer,
					newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StagingEnvironment getStagingEnvironment() {
		return stagingEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStagingEnvironment(StagingEnvironment newStagingEnvironment,
			NotificationChain msgs) {
		StagingEnvironment oldStagingEnvironment = stagingEnvironment;
		stagingEnvironment = newStagingEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JobsPackage.JOB__STAGING_ENVIRONMENT, oldStagingEnvironment, newStagingEnvironment);
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
	public void setStagingEnvironment(StagingEnvironment newStagingEnvironment) {
		if (newStagingEnvironment != stagingEnvironment) {
			NotificationChain msgs = null;
			if (stagingEnvironment != null)
				msgs = ((InternalEObject) stagingEnvironment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__STAGING_ENVIRONMENT, null, msgs);
			if (newStagingEnvironment != null)
				msgs = ((InternalEObject) newStagingEnvironment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__STAGING_ENVIRONMENT, null, msgs);
			msgs = basicSetStagingEnvironment(newStagingEnvironment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__STAGING_ENVIRONMENT,
					newStagingEnvironment, newStagingEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Defaults getDefaults() {
		return defaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaults(Defaults newDefaults, NotificationChain msgs) {
		Defaults oldDefaults = defaults;
		defaults = newDefaults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__DEFAULTS,
					oldDefaults, newDefaults);
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
	public void setDefaults(Defaults newDefaults) {
		if (newDefaults != defaults) {
			NotificationChain msgs = null;
			if (defaults != null)
				msgs = ((InternalEObject) defaults).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__DEFAULTS, null, msgs);
			if (newDefaults != null)
				msgs = ((InternalEObject) newDefaults).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__DEFAULTS, null, msgs);
			msgs = basicSetDefaults(newDefaults, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__DEFAULTS, newDefaults, newDefaults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Expression> getEnvironmentVariables() {
		if (environmentVariables == null) {
			environmentVariables = new EcoreEMap<String, Expression>(ExpressionsPackage.Literals.VARIABLE_ASSIGNMENT,
					VariableAssignmentImpl.class, this, JobsPackage.JOB__ENVIRONMENT_VARIABLES);
		}
		return environmentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, GHA.Jobs.Container> getServices() {
		if (services == null) {
			services = new EcoreEMap<String, GHA.Jobs.Container>(JobsPackage.Literals.SERVICE, ServiceImpl.class, this,
					JobsPackage.JOB__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyGroup getConcurrencyGroup() {
		return concurrencyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcurrencyGroup(ConcurrencyGroup newConcurrencyGroup, NotificationChain msgs) {
		ConcurrencyGroup oldConcurrencyGroup = concurrencyGroup;
		concurrencyGroup = newConcurrencyGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JobsPackage.JOB__CONCURRENCY_GROUP, oldConcurrencyGroup, newConcurrencyGroup);
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
	public void setConcurrencyGroup(ConcurrencyGroup newConcurrencyGroup) {
		if (newConcurrencyGroup != concurrencyGroup) {
			NotificationChain msgs = null;
			if (concurrencyGroup != null)
				msgs = ((InternalEObject) concurrencyGroup).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__CONCURRENCY_GROUP, null, msgs);
			if (newConcurrencyGroup != null)
				msgs = ((InternalEObject) newConcurrencyGroup).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__CONCURRENCY_GROUP, null, msgs);
			msgs = basicSetConcurrencyGroup(newConcurrencyGroup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__CONCURRENCY_GROUP,
					newConcurrencyGroup, newConcurrencyGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getTimeoutMinutes() {
		return timeoutMinutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeoutMinutes(Expression newTimeoutMinutes, NotificationChain msgs) {
		Expression oldTimeoutMinutes = timeoutMinutes;
		timeoutMinutes = newTimeoutMinutes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JobsPackage.JOB__TIMEOUT_MINUTES, oldTimeoutMinutes, newTimeoutMinutes);
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
	public void setTimeoutMinutes(Expression newTimeoutMinutes) {
		if (newTimeoutMinutes != timeoutMinutes) {
			NotificationChain msgs = null;
			if (timeoutMinutes != null)
				msgs = ((InternalEObject) timeoutMinutes).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__TIMEOUT_MINUTES, null, msgs);
			if (newTimeoutMinutes != null)
				msgs = ((InternalEObject) newTimeoutMinutes).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__TIMEOUT_MINUTES, null, msgs);
			msgs = basicSetTimeoutMinutes(newTimeoutMinutes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__TIMEOUT_MINUTES, newTimeoutMinutes,
					newTimeoutMinutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getContinueOnError() {
		return continueOnError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinueOnError(Expression newContinueOnError, NotificationChain msgs) {
		Expression oldContinueOnError = continueOnError;
		continueOnError = newContinueOnError;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JobsPackage.JOB__CONTINUE_ON_ERROR, oldContinueOnError, newContinueOnError);
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
	public void setContinueOnError(Expression newContinueOnError) {
		if (newContinueOnError != continueOnError) {
			NotificationChain msgs = null;
			if (continueOnError != null)
				msgs = ((InternalEObject) continueOnError).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__CONTINUE_ON_ERROR, null, msgs);
			if (newContinueOnError != null)
				msgs = ((InternalEObject) newContinueOnError).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__CONTINUE_ON_ERROR, null, msgs);
			msgs = basicSetContinueOnError(newContinueOnError, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__CONTINUE_ON_ERROR,
					newContinueOnError, newContinueOnError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Matrix getStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrategy(Matrix newStrategy, NotificationChain msgs) {
		Matrix oldStrategy = strategy;
		strategy = newStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__STRATEGY,
					oldStrategy, newStrategy);
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
	public void setStrategy(Matrix newStrategy) {
		if (newStrategy != strategy) {
			NotificationChain msgs = null;
			if (strategy != null)
				msgs = ((InternalEObject) strategy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__STRATEGY, null, msgs);
			if (newStrategy != null)
				msgs = ((InternalEObject) newStrategy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JobsPackage.JOB__STRATEGY, null, msgs);
			msgs = basicSetStrategy(newStrategy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobsPackage.JOB__STRATEGY, newStrategy, newStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JobsPackage.JOB__JOB_NAME:
			return basicSetJobName(null, msgs);
		case JobsPackage.JOB__PERMISSIONS:
			return ((InternalEList<?>) getPermissions()).basicRemove(otherEnd, msgs);
		case JobsPackage.JOB__IF:
			return basicSetIf(null, msgs);
		case JobsPackage.JOB__AGENT:
			return basicSetAgent(null, msgs);
		case JobsPackage.JOB__CONTAINER:
			return basicSetContainer(null, msgs);
		case JobsPackage.JOB__STAGING_ENVIRONMENT:
			return basicSetStagingEnvironment(null, msgs);
		case JobsPackage.JOB__DEFAULTS:
			return basicSetDefaults(null, msgs);
		case JobsPackage.JOB__ENVIRONMENT_VARIABLES:
			return ((InternalEList<?>) getEnvironmentVariables()).basicRemove(otherEnd, msgs);
		case JobsPackage.JOB__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd, msgs);
		case JobsPackage.JOB__CONCURRENCY_GROUP:
			return basicSetConcurrencyGroup(null, msgs);
		case JobsPackage.JOB__TIMEOUT_MINUTES:
			return basicSetTimeoutMinutes(null, msgs);
		case JobsPackage.JOB__CONTINUE_ON_ERROR:
			return basicSetContinueOnError(null, msgs);
		case JobsPackage.JOB__STRATEGY:
			return basicSetStrategy(null, msgs);
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
		case JobsPackage.JOB__NAME:
			return getName();
		case JobsPackage.JOB__JOB_NAME:
			return getJobName();
		case JobsPackage.JOB__PERMISSIONS:
			if (coreType)
				return getPermissions();
			else
				return getPermissions().map();
		case JobsPackage.JOB__DEPENDS_ON:
			return getDependsOn();
		case JobsPackage.JOB__IF:
			return getIf();
		case JobsPackage.JOB__AGENT:
			return getAgent();
		case JobsPackage.JOB__CONTAINER:
			return getContainer();
		case JobsPackage.JOB__STAGING_ENVIRONMENT:
			return getStagingEnvironment();
		case JobsPackage.JOB__DEFAULTS:
			return getDefaults();
		case JobsPackage.JOB__ENVIRONMENT_VARIABLES:
			if (coreType)
				return getEnvironmentVariables();
			else
				return getEnvironmentVariables().map();
		case JobsPackage.JOB__SERVICES:
			if (coreType)
				return getServices();
			else
				return getServices().map();
		case JobsPackage.JOB__CONCURRENCY_GROUP:
			return getConcurrencyGroup();
		case JobsPackage.JOB__TIMEOUT_MINUTES:
			return getTimeoutMinutes();
		case JobsPackage.JOB__CONTINUE_ON_ERROR:
			return getContinueOnError();
		case JobsPackage.JOB__STRATEGY:
			return getStrategy();
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
		case JobsPackage.JOB__NAME:
			setName((String) newValue);
			return;
		case JobsPackage.JOB__JOB_NAME:
			setJobName((Expression) newValue);
			return;
		case JobsPackage.JOB__PERMISSIONS:
			((EStructuralFeature.Setting) getPermissions()).set(newValue);
			return;
		case JobsPackage.JOB__DEPENDS_ON:
			getDependsOn().clear();
			getDependsOn().addAll((Collection<? extends Job>) newValue);
			return;
		case JobsPackage.JOB__IF:
			setIf((Expression) newValue);
			return;
		case JobsPackage.JOB__AGENT:
			setAgent((Agent) newValue);
			return;
		case JobsPackage.JOB__CONTAINER:
			setContainer((GHA.Jobs.Container) newValue);
			return;
		case JobsPackage.JOB__STAGING_ENVIRONMENT:
			setStagingEnvironment((StagingEnvironment) newValue);
			return;
		case JobsPackage.JOB__DEFAULTS:
			setDefaults((Defaults) newValue);
			return;
		case JobsPackage.JOB__ENVIRONMENT_VARIABLES:
			((EStructuralFeature.Setting) getEnvironmentVariables()).set(newValue);
			return;
		case JobsPackage.JOB__SERVICES:
			((EStructuralFeature.Setting) getServices()).set(newValue);
			return;
		case JobsPackage.JOB__CONCURRENCY_GROUP:
			setConcurrencyGroup((ConcurrencyGroup) newValue);
			return;
		case JobsPackage.JOB__TIMEOUT_MINUTES:
			setTimeoutMinutes((Expression) newValue);
			return;
		case JobsPackage.JOB__CONTINUE_ON_ERROR:
			setContinueOnError((Expression) newValue);
			return;
		case JobsPackage.JOB__STRATEGY:
			setStrategy((Matrix) newValue);
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
		case JobsPackage.JOB__NAME:
			setName(NAME_EDEFAULT);
			return;
		case JobsPackage.JOB__JOB_NAME:
			setJobName((Expression) null);
			return;
		case JobsPackage.JOB__PERMISSIONS:
			getPermissions().clear();
			return;
		case JobsPackage.JOB__DEPENDS_ON:
			getDependsOn().clear();
			return;
		case JobsPackage.JOB__IF:
			setIf((Expression) null);
			return;
		case JobsPackage.JOB__AGENT:
			setAgent((Agent) null);
			return;
		case JobsPackage.JOB__CONTAINER:
			setContainer((GHA.Jobs.Container) null);
			return;
		case JobsPackage.JOB__STAGING_ENVIRONMENT:
			setStagingEnvironment((StagingEnvironment) null);
			return;
		case JobsPackage.JOB__DEFAULTS:
			setDefaults((Defaults) null);
			return;
		case JobsPackage.JOB__ENVIRONMENT_VARIABLES:
			getEnvironmentVariables().clear();
			return;
		case JobsPackage.JOB__SERVICES:
			getServices().clear();
			return;
		case JobsPackage.JOB__CONCURRENCY_GROUP:
			setConcurrencyGroup((ConcurrencyGroup) null);
			return;
		case JobsPackage.JOB__TIMEOUT_MINUTES:
			setTimeoutMinutes((Expression) null);
			return;
		case JobsPackage.JOB__CONTINUE_ON_ERROR:
			setContinueOnError((Expression) null);
			return;
		case JobsPackage.JOB__STRATEGY:
			setStrategy((Matrix) null);
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
		case JobsPackage.JOB__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case JobsPackage.JOB__JOB_NAME:
			return jobName != null;
		case JobsPackage.JOB__PERMISSIONS:
			return permissions != null && !permissions.isEmpty();
		case JobsPackage.JOB__DEPENDS_ON:
			return dependsOn != null && !dependsOn.isEmpty();
		case JobsPackage.JOB__IF:
			return if_ != null;
		case JobsPackage.JOB__AGENT:
			return agent != null;
		case JobsPackage.JOB__CONTAINER:
			return container != null;
		case JobsPackage.JOB__STAGING_ENVIRONMENT:
			return stagingEnvironment != null;
		case JobsPackage.JOB__DEFAULTS:
			return defaults != null;
		case JobsPackage.JOB__ENVIRONMENT_VARIABLES:
			return environmentVariables != null && !environmentVariables.isEmpty();
		case JobsPackage.JOB__SERVICES:
			return services != null && !services.isEmpty();
		case JobsPackage.JOB__CONCURRENCY_GROUP:
			return concurrencyGroup != null;
		case JobsPackage.JOB__TIMEOUT_MINUTES:
			return timeoutMinutes != null;
		case JobsPackage.JOB__CONTINUE_ON_ERROR:
			return continueOnError != null;
		case JobsPackage.JOB__STRATEGY:
			return strategy != null;
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
		result.append(')');
		return result.toString();
	}

} //JobImpl
