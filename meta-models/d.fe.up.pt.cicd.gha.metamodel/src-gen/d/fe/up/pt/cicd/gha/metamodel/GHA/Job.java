/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA;

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
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getJobName <em>Job Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getNecessaryFor <em>Necessary For</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getAgent <em>Agent</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getContainer <em>Container</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getStagingEnvironment <em>Staging Environment</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getServices <em>Services</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getConcurrencyGroup <em>Concurrency Group</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getTimeoutMinutes <em>Timeout Minutes</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getContinueOnError <em>Continue On Error</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getName <em>Name</em>}' attribute.
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
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_JobName()
	 * @model containment="true"
	 * @generated
	 */
	Expression getJobName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getJobName <em>Job Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Name</em>' containment reference.
	 * @see #getJobName()
	 * @generated
	 */
	void setJobName(Expression value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' map.
	 * The key is of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.PERMISSION_SCOPES},
	 * and the value is of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.PERMISSIONS},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' map.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_Permissions()
	 * @model mapType="d.fe.up.pt.cicd.gha.metamodel.GHA.Permission&lt;d.fe.up.pt.cicd.gha.metamodel.GHA.PERMISSION_SCOPES, d.fe.up.pt.cicd.gha.metamodel.GHA.PERMISSIONS&gt;"
	 * @generated
	 */
	EMap<PERMISSION_SCOPES, PERMISSIONS> getPermissions();

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job}.
	 * It is bidirectional and its opposite is '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getNecessaryFor <em>Necessary For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' reference list.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_DependsOn()
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getNecessaryFor
	 * @model opposite="necessaryFor"
	 * @generated
	 */
	EList<Job> getDependsOn();

	/**
	 * Returns the value of the '<em><b>Necessary For</b></em>' reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job}.
	 * It is bidirectional and its opposite is '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Necessary For</em>' reference list.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_NecessaryFor()
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getDependsOn
	 * @model opposite="dependsOn"
	 * @generated
	 */
	EList<Job> getNecessaryFor();

	/**
	 * Returns the value of the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Condition</em>' containment reference.
	 * @see #setIfCondition(Expression)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_IfCondition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getIfCondition();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getIfCondition <em>If Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Condition</em>' containment reference.
	 * @see #getIfCondition()
	 * @generated
	 */
	void setIfCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference.
	 * @see #setAgent(Agent)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_Agent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getAgent <em>Agent</em>}' containment reference.
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
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_Container()
	 * @model containment="true"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getContainer <em>Container</em>}' containment reference.
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
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_StagingEnvironment()
	 * @model containment="true"
	 * @generated
	 */
	StagingEnvironment getStagingEnvironment();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getStagingEnvironment <em>Staging Environment</em>}' containment reference.
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
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_Defaults()
	 * @model containment="true"
	 * @generated
	 */
	Defaults getDefaults();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getDefaults <em>Defaults</em>}' containment reference.
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
	 * and the value is of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Variables</em>' map.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_EnvironmentVariables()
	 * @model mapType="d.fe.up.pt.cicd.gha.metamodel.GHA.VariableAssignment&lt;org.eclipse.emf.ecore.EString, d.fe.up.pt.cicd.gha.metamodel.GHA.Expression&gt;"
	 * @generated
	 */
	EMap<String, Expression> getEnvironmentVariables();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.Container},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' map.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_Services()
	 * @model mapType="d.fe.up.pt.cicd.gha.metamodel.GHA.Service&lt;org.eclipse.emf.ecore.EString, d.fe.up.pt.cicd.gha.metamodel.GHA.Container&gt;"
	 * @generated
	 */
	EMap<String, Container> getServices();

	/**
	 * Returns the value of the '<em><b>Concurrency Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency Group</em>' containment reference.
	 * @see #setConcurrencyGroup(ConcurrencyGroup)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_ConcurrencyGroup()
	 * @model containment="true"
	 * @generated
	 */
	ConcurrencyGroup getConcurrencyGroup();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getConcurrencyGroup <em>Concurrency Group</em>}' containment reference.
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
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_TimeoutMinutes()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTimeoutMinutes();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getTimeoutMinutes <em>Timeout Minutes</em>}' containment reference.
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
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_ContinueOnError()
	 * @model containment="true"
	 * @generated
	 */
	Expression getContinueOnError();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getContinueOnError <em>Continue On Error</em>}' containment reference.
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
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_Strategy()
	 * @model containment="true"
	 * @generated
	 */
	Matrix getStrategy();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Job#getStrategy <em>Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' containment reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(Matrix value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getJob_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Step> getSteps();

} // Job
