/**
 */
package devops2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devops2.Command#getEnvirnoment_c <em>Envirnoment c</em>}</li>
 *   <li>{@link devops2.Command#getDescription <em>Description</em>}</li>
 *   <li>{@link devops2.Command#getTool <em>Tool</em>}</li>
 *   <li>{@link devops2.Command#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see devops2.Devops2Package#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject {
	/**
	 * Returns the value of the '<em><b>Envirnoment c</b></em>' reference list.
	 * The list contents are of type {@link devops2.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envirnoment c</em>' reference list.
	 * @see devops2.Devops2Package#getCommand_Envirnoment_c()
	 * @model
	 * @generated
	 */
	EList<Environment> getEnvirnoment_c();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(String)
	 * @see devops2.Devops2Package#getCommand_Parameters()
	 * @model
	 * @generated
	 */
	String getParameters();

	/**
	 * Sets the value of the '{@link devops2.Command#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see devops2.Devops2Package#getCommand_Description()
	 * @model id="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link devops2.Command#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' reference.
	 * @see #setTool(Tool_framework)
	 * @see devops2.Devops2Package#getCommand_Tool()
	 * @model
	 * @generated
	 */
	Tool_framework getTool();

	/**
	 * Sets the value of the '{@link devops2.Command#getTool <em>Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool</em>' reference.
	 * @see #getTool()
	 * @generated
	 */
	void setTool(Tool_framework value);

} // Command
