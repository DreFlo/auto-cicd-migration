/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Call Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.WorkflowCallJob#getUses <em>Uses</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.WorkflowCallJob#getArgs <em>Args</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.WorkflowCallJob#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.WorkflowCallJob#getInheritSecrets <em>Inherit Secrets</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getWorkflowCallJob()
 * @model
 * @generated
 */
public interface WorkflowCallJob extends Job {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference.
	 * @see #setUses(Expression)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getWorkflowCallJob_Uses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getUses();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.WorkflowCallJob#getUses <em>Uses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' containment reference.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(Expression value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' map.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getWorkflowCallJob_Args()
	 * @model mapType="d.fe.up.pt.cicd.gha.metamodel.GHA.VariableAssignment&lt;org.eclipse.emf.ecore.EString, d.fe.up.pt.cicd.gha.metamodel.GHA.Expression&gt;"
	 * @generated
	 */
	EMap<String, Expression> getArgs();

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' map.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getWorkflowCallJob_Secrets()
	 * @model mapType="d.fe.up.pt.cicd.gha.metamodel.GHA.VariableAssignment&lt;org.eclipse.emf.ecore.EString, d.fe.up.pt.cicd.gha.metamodel.GHA.Expression&gt;"
	 * @generated
	 */
	EMap<String, Expression> getSecrets();

	/**
	 * Returns the value of the '<em><b>Inherit Secrets</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherit Secrets</em>' attribute.
	 * @see #setInheritSecrets(Boolean)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getWorkflowCallJob_InheritSecrets()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getInheritSecrets();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.WorkflowCallJob#getInheritSecrets <em>Inherit Secrets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherit Secrets</em>' attribute.
	 * @see #getInheritSecrets()
	 * @generated
	 */
	void setInheritSecrets(Boolean value);

} // WorkflowCallJob
