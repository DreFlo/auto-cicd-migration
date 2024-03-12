/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

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
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Environment Variables</b></em>' map.
	 * The key is of type {@link d.fe.up.pt.cicd.metamodel.CICD.Variable},
	 * and the value is of type {@link d.fe.up.pt.cicd.metamodel.CICD.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Variables</em>' map.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock_EnvironmentVariables()
	 * @model mapType="d.fe.up.pt.cicd.metamodel.CICD.Assignment&lt;d.fe.up.pt.cicd.metamodel.CICD.Variable, d.fe.up.pt.cicd.metamodel.CICD.Expression&gt;"
	 * @generated
	 */
	EMap<Variable, Expression> getEnvironmentVariables();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link d.fe.up.pt.cicd.metamodel.CICD.PERMISSION_TYPE},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' map.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock_Permissions()
	 * @model mapType="d.fe.up.pt.cicd.metamodel.CICD.Permission&lt;org.eclipse.emf.ecore.EString, d.fe.up.pt.cicd.metamodel.CICD.PERMISSION_TYPE&gt;"
	 * @generated
	 */
	EMap<String, PERMISSION_TYPE> getPermissions();

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
	 * Returns the value of the '<em><b>Concurrency Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency Group</em>' containment reference.
	 * @see #setConcurrencyGroup(ConcurrencyGroup)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock_ConcurrencyGroup()
	 * @model containment="true"
	 * @generated
	 */
	ConcurrencyGroup getConcurrencyGroup();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getConcurrencyGroup <em>Concurrency Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency Group</em>' containment reference.
	 * @see #getConcurrencyGroup()
	 * @generated
	 */
	void setConcurrencyGroup(ConcurrencyGroup value);

	/**
	 * Returns the value of the '<em><b>Shell</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.metamodel.CICD.SHELL_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' attribute.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.SHELL_TYPE
	 * @see #setShell(SHELL_TYPE)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineBlock_Shell()
	 * @model required="true"
	 * @generated
	 */
	SHELL_TYPE getShell();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getShell <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' attribute.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.SHELL_TYPE
	 * @see #getShell()
	 * @generated
	 */
	void setShell(SHELL_TYPE value);

} // PipelineBlock
