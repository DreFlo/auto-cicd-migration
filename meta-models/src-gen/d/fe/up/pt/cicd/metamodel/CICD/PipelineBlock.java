/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Expression;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.EnvironmentVariable;

import d.fe.up.pt.cicd.metamodel.CICD.Options.ConcurrencyGroup;
import d.fe.up.pt.cicd.metamodel.CICD.Options.PermissionType;
import d.fe.up.pt.cicd.metamodel.CICD.Options.ShellType;

import d.fe.up.pt.cicd.metamodel.CICD.Parameters.Input;
import d.fe.up.pt.cicd.metamodel.CICD.Parameters.Output;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getAgent <em>Agent</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getInputs <em>Inputs</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getTimeoutMinutes <em>Timeout Minutes</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getWorkingDirectory <em>Working Directory</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getConcurrencyGroup <em>Concurrency Group</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getShell <em>Shell</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock()
 * @model abstract="true"
 * @generated
 */
public interface PipelineBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference.
	 * @see #setAgent(Agent)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock_Agent()
	 * @model containment="true"
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getAgent <em>Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' containment reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Agent value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.Parameters.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock_Inputs()
	 * @model
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.Parameters.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock_Outputs()
	 * @model
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Environment Variables</b></em>' map.
	 * The key is of type {@link d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.EnvironmentVariable},
	 * and the value is of type {@link d.fe.up.pt.cicd.metamodel.CICD.Expressions.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Variables</em>' map.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock_EnvironmentVariables()
	 * @model mapType="d.fe.up.pt.cicd.metamodel.CICD.Expressions.Assignment&lt;d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.EnvironmentVariable, d.fe.up.pt.cicd.metamodel.CICD.Expressions.Expression&gt;"
	 * @generated
	 */
	EMap<EnvironmentVariable, Expression> getEnvironmentVariables();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link d.fe.up.pt.cicd.metamodel.CICD.Options.PermissionType},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' map.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock_Permissions()
	 * @model mapType="d.fe.up.pt.cicd.metamodel.CICD.Options.Permission&lt;org.eclipse.emf.ecore.EString, d.fe.up.pt.cicd.metamodel.CICD.Options.PermissionType&gt;"
	 * @generated
	 */
	EMap<String, PermissionType> getPermissions();

	/**
	 * Returns the value of the '<em><b>Timeout Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Minutes</em>' attribute.
	 * @see #setTimeoutMinutes(Integer)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock_TimeoutMinutes()
	 * @model
	 * @generated
	 */
	Integer getTimeoutMinutes();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getTimeoutMinutes <em>Timeout Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Minutes</em>' attribute.
	 * @see #getTimeoutMinutes()
	 * @generated
	 */
	void setTimeoutMinutes(Integer value);

	/**
	 * Returns the value of the '<em><b>Working Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Directory</em>' attribute.
	 * @see #setWorkingDirectory(String)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock_WorkingDirectory()
	 * @model
	 * @generated
	 */
	String getWorkingDirectory();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getWorkingDirectory <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Directory</em>' attribute.
	 * @see #getWorkingDirectory()
	 * @generated
	 */
	void setWorkingDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Concurrency Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency Group</em>' reference.
	 * @see #setConcurrencyGroup(ConcurrencyGroup)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock_ConcurrencyGroup()
	 * @model
	 * @generated
	 */
	ConcurrencyGroup getConcurrencyGroup();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getConcurrencyGroup <em>Concurrency Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency Group</em>' reference.
	 * @see #getConcurrencyGroup()
	 * @generated
	 */
	void setConcurrencyGroup(ConcurrencyGroup value);

	/**
	 * Returns the value of the '<em><b>Shell</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.metamodel.CICD.Options.ShellType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' attribute.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Options.ShellType
	 * @see #setShell(ShellType)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock_Shell()
	 * @model required="true"
	 * @generated
	 */
	ShellType getShell();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getShell <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' attribute.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Options.ShellType
	 * @see #getShell()
	 * @generated
	 */
	void setShell(ShellType value);

} // PipelineBlock