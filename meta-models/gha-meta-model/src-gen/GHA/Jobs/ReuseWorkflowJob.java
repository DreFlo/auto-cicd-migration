/**
 */
package GHA.Jobs;

import GHA.Expressions.Expression;

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
 *   <li>{@link GHA.Jobs.ReuseWorkflowJob#getWorkflowPath <em>Workflow Path</em>}</li>
 *   <li>{@link GHA.Jobs.ReuseWorkflowJob#getArgs <em>Args</em>}</li>
 *   <li>{@link GHA.Jobs.ReuseWorkflowJob#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link GHA.Jobs.ReuseWorkflowJob#getInheritSecrets <em>Inherit Secrets</em>}</li>
 * </ul>
 *
 * @see GHA.Jobs.JobsPackage#getReuseWorkflowJob()
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
	 * @see GHA.Jobs.JobsPackage#getReuseWorkflowJob_WorkflowPath()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getWorkflowPath();

	/**
	 * Sets the value of the '{@link GHA.Jobs.ReuseWorkflowJob#getWorkflowPath <em>Workflow Path</em>}' containment reference.
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
	 * and the value is of type {@link GHA.Expressions.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' map.
	 * @see GHA.Jobs.JobsPackage#getReuseWorkflowJob_Args()
	 * @model mapType="GHA.Expressions.VariableAssignment&lt;org.eclipse.emf.ecore.EString, GHA.Expressions.Expression&gt;"
	 * @generated
	 */
	EMap<String, Expression> getArgs();

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link GHA.Expressions.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' map.
	 * @see GHA.Jobs.JobsPackage#getReuseWorkflowJob_Secrets()
	 * @model mapType="GHA.Expressions.VariableAssignment&lt;org.eclipse.emf.ecore.EString, GHA.Expressions.Expression&gt;"
	 * @generated
	 */
	EMap<String, Expression> getSecrets();

	/**
	 * Returns the value of the '<em><b>Inherit Secrets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherit Secrets</em>' attribute.
	 * @see #setInheritSecrets(Boolean)
	 * @see GHA.Jobs.JobsPackage#getReuseWorkflowJob_InheritSecrets()
	 * @model
	 * @generated
	 */
	Boolean getInheritSecrets();

	/**
	 * Sets the value of the '{@link GHA.Jobs.ReuseWorkflowJob#getInheritSecrets <em>Inherit Secrets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherit Secrets</em>' attribute.
	 * @see #getInheritSecrets()
	 * @generated
	 */
	void setInheritSecrets(Boolean value);

} // ReuseWorkflowJob
