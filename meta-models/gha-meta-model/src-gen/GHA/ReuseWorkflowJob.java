/**
 */
package GHA;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reuse Workflow Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.ReuseWorkflowJob#getWorkflowPath <em>Workflow Path</em>}</li>
 *   <li>{@link GHA.ReuseWorkflowJob#getArgs <em>Args</em>}</li>
 *   <li>{@link GHA.ReuseWorkflowJob#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link GHA.ReuseWorkflowJob#getInheritSecrets <em>Inherit Secrets</em>}</li>
 * </ul>
 *
 * @see GHA.GHAPackage#getReuseWorkflowJob()
 * @model
 * @generated
 */
public interface ReuseWorkflowJob extends Job {
	/**
	 * Returns the value of the '<em><b>Workflow Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow Path</em>' containment reference.
	 * @see #setWorkflowPath(Expression)
	 * @see GHA.GHAPackage#getReuseWorkflowJob_WorkflowPath()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getWorkflowPath();

	/**
	 * Sets the value of the '{@link GHA.ReuseWorkflowJob#getWorkflowPath <em>Workflow Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow Path</em>' containment reference.
	 * @see #getWorkflowPath()
	 * @generated
	 */
	void setWorkflowPath(Expression value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link GHA.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' map.
	 * @see GHA.GHAPackage#getReuseWorkflowJob_Args()
	 * @model mapType="GHA.VariableAssignment&lt;org.eclipse.emf.ecore.EString, GHA.Expression&gt;"
	 * @generated
	 */
	EMap<String, Expression> getArgs();

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link GHA.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' map.
	 * @see GHA.GHAPackage#getReuseWorkflowJob_Secrets()
	 * @model mapType="GHA.VariableAssignment&lt;org.eclipse.emf.ecore.EString, GHA.Expression&gt;"
	 * @generated
	 */
	EMap<String, Expression> getSecrets();

	/**
	 * Returns the value of the '<em><b>Inherit Secrets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherit Secrets</em>' attribute.
	 * @see #setInheritSecrets(Boolean)
	 * @see GHA.GHAPackage#getReuseWorkflowJob_InheritSecrets()
	 * @model
	 * @generated
	 */
	Boolean getInheritSecrets();

	/**
	 * Sets the value of the '{@link GHA.ReuseWorkflowJob#getInheritSecrets <em>Inherit Secrets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherit Secrets</em>' attribute.
	 * @see #getInheritSecrets()
	 * @generated
	 */
	void setInheritSecrets(Boolean value);

} // ReuseWorkflowJob
