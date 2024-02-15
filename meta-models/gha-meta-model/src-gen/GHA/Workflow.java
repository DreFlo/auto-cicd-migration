/**
 */
package GHA;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Workflow#getName <em>Name</em>}</li>
 *   <li>{@link GHA.Workflow#getRunName <em>Run Name</em>}</li>
 *   <li>{@link GHA.Workflow#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link GHA.Workflow#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link GHA.Workflow#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link GHA.Workflow#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link GHA.Workflow#getConcurrencyGroup <em>Concurrency Group</em>}</li>
 *   <li>{@link GHA.Workflow#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @see GHA.GHAPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Expression)
	 * @see GHA.GHAPackage#getWorkflow_Name()
	 * @model containment="true"
	 * @generated
	 */
	Expression getName();

	/**
	 * Sets the value of the '{@link GHA.Workflow#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Expression value);

	/**
	 * Returns the value of the '<em><b>Run Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Name</em>' containment reference.
	 * @see #setRunName(Expression)
	 * @see GHA.GHAPackage#getWorkflow_RunName()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRunName();

	/**
	 * Sets the value of the '{@link GHA.Workflow#getRunName <em>Run Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Name</em>' containment reference.
	 * @see #getRunName()
	 * @generated
	 */
	void setRunName(Expression value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see GHA.GHAPackage#getWorkflow_Triggers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' map.
	 * The key is of type {@link GHA.PERMISSION_SCOPES},
	 * and the value is of type {@link GHA.PERMISSIONS},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' map.
	 * @see GHA.GHAPackage#getWorkflow_Permissions()
	 * @model mapType="GHA.Permission&lt;GHA.PERMISSION_SCOPES, GHA.PERMISSIONS&gt;"
	 * @generated
	 */
	EMap<PERMISSION_SCOPES, PERMISSIONS> getPermissions();

	/**
	 * Returns the value of the '<em><b>Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaults</em>' containment reference.
	 * @see #setDefaults(Defaults)
	 * @see GHA.GHAPackage#getWorkflow_Defaults()
	 * @model containment="true"
	 * @generated
	 */
	Defaults getDefaults();

	/**
	 * Sets the value of the '{@link GHA.Workflow#getDefaults <em>Defaults</em>}' containment reference.
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
	 * and the value is of type {@link GHA.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Variables</em>' map.
	 * @see GHA.GHAPackage#getWorkflow_EnvironmentVariables()
	 * @model mapType="GHA.VariableAssignment&lt;org.eclipse.emf.ecore.EString, GHA.Expression&gt;"
	 * @generated
	 */
	EMap<String, Expression> getEnvironmentVariables();

	/**
	 * Returns the value of the '<em><b>Concurrency Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency Group</em>' containment reference.
	 * @see #setConcurrencyGroup(ConcurrencyGroup)
	 * @see GHA.GHAPackage#getWorkflow_ConcurrencyGroup()
	 * @model containment="true"
	 * @generated
	 */
	ConcurrencyGroup getConcurrencyGroup();

	/**
	 * Sets the value of the '{@link GHA.Workflow#getConcurrencyGroup <em>Concurrency Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency Group</em>' containment reference.
	 * @see #getConcurrencyGroup()
	 * @generated
	 */
	void setConcurrencyGroup(ConcurrencyGroup value);

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see GHA.GHAPackage#getWorkflow_Jobs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Job> getJobs();

} // Workflow
