/**
 */
package GHA;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Step#getId <em>Id</em>}</li>
 *   <li>{@link GHA.Step#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link GHA.Step#getName <em>Name</em>}</li>
 *   <li>{@link GHA.Step#getTimeoutMinutes <em>Timeout Minutes</em>}</li>
 *   <li>{@link GHA.Step#getContinueOnError <em>Continue On Error</em>}</li>
 *   <li>{@link GHA.Step#getShell <em>Shell</em>}</li>
 *   <li>{@link GHA.Step#getWorkingDirectory <em>Working Directory</em>}</li>
 *   <li>{@link GHA.Step#getEnvironmentVariables <em>Environment Variables</em>}</li>
 * </ul>
 *
 * @see GHA.GHAPackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see GHA.GHAPackage#getStep_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link GHA.Step#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Condition</em>' containment reference.
	 * @see #setIfCondition(Expression)
	 * @see GHA.GHAPackage#getStep_IfCondition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getIfCondition();

	/**
	 * Sets the value of the '{@link GHA.Step#getIfCondition <em>If Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Condition</em>' containment reference.
	 * @see #getIfCondition()
	 * @generated
	 */
	void setIfCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Expression)
	 * @see GHA.GHAPackage#getStep_Name()
	 * @model containment="true"
	 * @generated
	 */
	Expression getName();

	/**
	 * Sets the value of the '{@link GHA.Step#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Expression value);

	/**
	 * Returns the value of the '<em><b>Timeout Minutes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Minutes</em>' containment reference.
	 * @see #setTimeoutMinutes(Expression)
	 * @see GHA.GHAPackage#getStep_TimeoutMinutes()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTimeoutMinutes();

	/**
	 * Sets the value of the '{@link GHA.Step#getTimeoutMinutes <em>Timeout Minutes</em>}' containment reference.
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
	 * @see GHA.GHAPackage#getStep_ContinueOnError()
	 * @model containment="true"
	 * @generated
	 */
	Expression getContinueOnError();

	/**
	 * Sets the value of the '{@link GHA.Step#getContinueOnError <em>Continue On Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue On Error</em>' containment reference.
	 * @see #getContinueOnError()
	 * @generated
	 */
	void setContinueOnError(Expression value);

	/**
	 * Returns the value of the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' containment reference.
	 * @see #setShell(Expression)
	 * @see GHA.GHAPackage#getStep_Shell()
	 * @model containment="true"
	 * @generated
	 */
	Expression getShell();

	/**
	 * Sets the value of the '{@link GHA.Step#getShell <em>Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' containment reference.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(Expression value);

	/**
	 * Returns the value of the '<em><b>Working Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Directory</em>' containment reference.
	 * @see #setWorkingDirectory(Expression)
	 * @see GHA.GHAPackage#getStep_WorkingDirectory()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWorkingDirectory();

	/**
	 * Sets the value of the '{@link GHA.Step#getWorkingDirectory <em>Working Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Directory</em>' containment reference.
	 * @see #getWorkingDirectory()
	 * @generated
	 */
	void setWorkingDirectory(Expression value);

	/**
	 * Returns the value of the '<em><b>Environment Variables</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link GHA.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Variables</em>' map.
	 * @see GHA.GHAPackage#getStep_EnvironmentVariables()
	 * @model mapType="GHA.VariableAssignment&lt;org.eclipse.emf.ecore.EString, GHA.Expression&gt;"
	 * @generated
	 */
	EMap<String, Expression> getEnvironmentVariables();

} // Step
