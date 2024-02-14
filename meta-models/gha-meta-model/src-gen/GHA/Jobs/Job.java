/**
 */
package GHA.Jobs;

import GHA.Expressions.Expression;

import GHA.Jobs.Matrices.Matrix;

import GHA.Options.ConcurrencyGroup;
import GHA.Options.Defaults;
import GHA.Options.PERMISSIONS;
import GHA.Options.PERMISSION_SCOPES;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Jobs.Job#getName <em>Name</em>}</li>
 *   <li>{@link GHA.Jobs.Job#getJobName <em>Job Name</em>}</li>
 *   <li>{@link GHA.Jobs.Job#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link GHA.Jobs.Job#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link GHA.Jobs.Job#getIf <em>If</em>}</li>
 *   <li>{@link GHA.Jobs.Job#getAgent <em>Agent</em>}</li>
 *   <li>{@link GHA.Jobs.Job#getContainer <em>Container</em>}</li>
 *   <li>{@link GHA.Jobs.Job#getStagingEnvironment <em>Staging Environment</em>}</li>
 *   <li>{@link GHA.Jobs.Job#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link GHA.Jobs.Job#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link GHA.Jobs.Job#getServices <em>Services</em>}</li>
 *   <li>{@link GHA.Jobs.Job#getConcurrencyGroup <em>Concurrency Group</em>}</li>
 *   <li>{@link GHA.Jobs.Job#getTimeoutMinutes <em>Timeout Minutes</em>}</li>
 *   <li>{@link GHA.Jobs.Job#getContinueOnError <em>Continue On Error</em>}</li>
 *   <li>{@link GHA.Jobs.Job#getStrategy <em>Strategy</em>}</li>
 * </ul>
 *
 * @see GHA.Jobs.JobsPackage#getJob()
 * @model abstract="true"
 * @generated
 */
public interface Job extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see GHA.Jobs.JobsPackage#getJob_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Job#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Job Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Name</em>' containment reference.
	 * @see #setJobName(Expression)
	 * @see GHA.Jobs.JobsPackage#getJob_JobName()
	 * @model containment="true"
	 * @generated
	 */
	Expression getJobName();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Job#getJobName <em>Job Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Name</em>' containment reference.
	 * @see #getJobName()
	 * @generated
	 */
	void setJobName(Expression value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' map.
	 * The key is of type {@link GHA.Options.PERMISSION_SCOPES},
	 * and the value is of type {@link GHA.Options.PERMISSIONS},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' map.
	 * @see GHA.Jobs.JobsPackage#getJob_Permissions()
	 * @model mapType="GHA.Options.Permission&lt;GHA.Options.PERMISSION_SCOPES, GHA.Options.PERMISSIONS&gt;"
	 * @generated
	 */
	EMap<PERMISSION_SCOPES, PERMISSIONS> getPermissions();

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference list.
	 * The list contents are of type {@link GHA.Jobs.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' reference list.
	 * @see GHA.Jobs.JobsPackage#getJob_DependsOn()
	 * @model
	 * @generated
	 */
	EList<Job> getDependsOn();

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(Expression)
	 * @see GHA.Jobs.JobsPackage#getJob_If()
	 * @model containment="true"
	 * @generated
	 */
	Expression getIf();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Job#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(Expression value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference.
	 * @see #setAgent(Agent)
	 * @see GHA.Jobs.JobsPackage#getJob_Agent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Job#getAgent <em>Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' containment reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Agent value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(Container)
	 * @see GHA.Jobs.JobsPackage#getJob_Container()
	 * @model containment="true"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Job#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Staging Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staging Environment</em>' containment reference.
	 * @see #setStagingEnvironment(StagingEnvironment)
	 * @see GHA.Jobs.JobsPackage#getJob_StagingEnvironment()
	 * @model containment="true"
	 * @generated
	 */
	StagingEnvironment getStagingEnvironment();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Job#getStagingEnvironment <em>Staging Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staging Environment</em>' containment reference.
	 * @see #getStagingEnvironment()
	 * @generated
	 */
	void setStagingEnvironment(StagingEnvironment value);

	/**
	 * Returns the value of the '<em><b>Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaults</em>' containment reference.
	 * @see #setDefaults(Defaults)
	 * @see GHA.Jobs.JobsPackage#getJob_Defaults()
	 * @model containment="true"
	 * @generated
	 */
	Defaults getDefaults();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Job#getDefaults <em>Defaults</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaults</em>' containment reference.
	 * @see #getDefaults()
	 * @generated
	 */
	void setDefaults(Defaults value);

	/**
	 * Returns the value of the '<em><b>Environment Variables</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link GHA.Expressions.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Variables</em>' map.
	 * @see GHA.Jobs.JobsPackage#getJob_EnvironmentVariables()
	 * @model mapType="GHA.Expressions.VariableAssignment&lt;org.eclipse.emf.ecore.EString, GHA.Expressions.Expression&gt;"
	 * @generated
	 */
	EMap<String, Expression> getEnvironmentVariables();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link GHA.Jobs.Container},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' map.
	 * @see GHA.Jobs.JobsPackage#getJob_Services()
	 * @model mapType="GHA.Jobs.Service&lt;org.eclipse.emf.ecore.EString, GHA.Jobs.Container&gt;"
	 * @generated
	 */
	EMap<String, Container> getServices();

	/**
	 * Returns the value of the '<em><b>Concurrency Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency Group</em>' containment reference.
	 * @see #setConcurrencyGroup(ConcurrencyGroup)
	 * @see GHA.Jobs.JobsPackage#getJob_ConcurrencyGroup()
	 * @model containment="true"
	 * @generated
	 */
	ConcurrencyGroup getConcurrencyGroup();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Job#getConcurrencyGroup <em>Concurrency Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency Group</em>' containment reference.
	 * @see #getConcurrencyGroup()
	 * @generated
	 */
	void setConcurrencyGroup(ConcurrencyGroup value);

	/**
	 * Returns the value of the '<em><b>Timeout Minutes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Minutes</em>' containment reference.
	 * @see #setTimeoutMinutes(Expression)
	 * @see GHA.Jobs.JobsPackage#getJob_TimeoutMinutes()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTimeoutMinutes();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Job#getTimeoutMinutes <em>Timeout Minutes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Minutes</em>' containment reference.
	 * @see #getTimeoutMinutes()
	 * @generated
	 */
	void setTimeoutMinutes(Expression value);

	/**
	 * Returns the value of the '<em><b>Continue On Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue On Error</em>' containment reference.
	 * @see #setContinueOnError(Expression)
	 * @see GHA.Jobs.JobsPackage#getJob_ContinueOnError()
	 * @model containment="true"
	 * @generated
	 */
	Expression getContinueOnError();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Job#getContinueOnError <em>Continue On Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue On Error</em>' containment reference.
	 * @see #getContinueOnError()
	 * @generated
	 */
	void setContinueOnError(Expression value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' containment reference.
	 * @see #setStrategy(Matrix)
	 * @see GHA.Jobs.JobsPackage#getJob_Strategy()
	 * @model containment="true"
	 * @generated
	 */
	Matrix getStrategy();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Job#getStrategy <em>Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' containment reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(Matrix value);

} // Job
