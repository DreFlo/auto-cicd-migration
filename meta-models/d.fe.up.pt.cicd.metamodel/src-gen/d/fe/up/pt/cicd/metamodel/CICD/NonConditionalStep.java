/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Conditional Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getId <em>Id</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getAllowFailure <em>Allow Failure</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getWorkingDirectory <em>Working Directory</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getTimeoutMinutes <em>Timeout Minutes</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getNonConditionalStep()
 * @model abstract="true"
 * @generated
 */
public interface NonConditionalStep extends Step {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getNonConditionalStep_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getNonConditionalStep_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Environment Variables</b></em>' map.
	 * The key is of type {@link d.fe.up.pt.cicd.metamodel.CICD.VariableDeclaration},
	 * and the value is of type {@link d.fe.up.pt.cicd.metamodel.CICD.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Variables</em>' map.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getNonConditionalStep_EnvironmentVariables()
	 * @model mapType="d.fe.up.pt.cicd.metamodel.CICD.Assignment&lt;d.fe.up.pt.cicd.metamodel.CICD.VariableDeclaration, d.fe.up.pt.cicd.metamodel.CICD.Expression&gt;"
	 * @generated
	 */
	EMap<VariableDeclaration, Expression> getEnvironmentVariables();

	/**
	 * Returns the value of the '<em><b>Timeout Minutes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Minutes</em>' containment reference.
	 * @see #setTimeoutMinutes(Expression)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getNonConditionalStep_TimeoutMinutes()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTimeoutMinutes();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getTimeoutMinutes <em>Timeout Minutes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Minutes</em>' containment reference.
	 * @see #getTimeoutMinutes()
	 * @generated
	 */
	void setTimeoutMinutes(Expression value);

	/**
	 * Returns the value of the '<em><b>Allow Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Failure</em>' attribute.
	 * @see #setAllowFailure(Boolean)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getNonConditionalStep_AllowFailure()
	 * @model
	 * @generated
	 */
	Boolean getAllowFailure();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getAllowFailure <em>Allow Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Failure</em>' attribute.
	 * @see #getAllowFailure()
	 * @generated
	 */
	void setAllowFailure(Boolean value);

	/**
	 * Returns the value of the '<em><b>Working Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Directory</em>' containment reference.
	 * @see #setWorkingDirectory(Expression)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getNonConditionalStep_WorkingDirectory()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWorkingDirectory();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getWorkingDirectory <em>Working Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Directory</em>' containment reference.
	 * @see #getWorkingDirectory()
	 * @generated
	 */
	void setWorkingDirectory(Expression value);

} // NonConditionalStep
