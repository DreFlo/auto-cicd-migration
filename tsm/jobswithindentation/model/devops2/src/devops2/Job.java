/**
 */
package devops2;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link devops2.Job#getName1 <em>Name1</em>}</li>
 *   <li>{@link devops2.Job#getDepends <em>Depends</em>}</li>
 *   <li>{@link devops2.Job#getTool_framework_job <em>Tool framework job</em>}</li>
 *   <li>{@link devops2.Job#getOutput <em>Output</em>}</li>
 *   <li>{@link devops2.Job#getCommand <em>Command</em>}</li>
 *   <li>{@link devops2.Job#getJob_parameter <em>Job parameter</em>}</li>
 *   <li>{@link devops2.Job#getIfthenelse <em>Ifthenelse</em>}</li>
 *   <li>{@link devops2.Job#isAllow_faillure <em>Allow faillure</em>}</li>
 *   <li>{@link devops2.Job#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see devops2.Devops2Package#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject {

	/**
	 * Returns the value of the '<em><b>Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name1</em>' attribute.
	 * @see #setName1(String)
	 * @see devops2.Devops2Package#getJob_Name1()
	 * @model
	 * @generated
	 */
	String getName1();

	/**
	 * Sets the value of the '{@link devops2.Job#getName1 <em>Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name1</em>' attribute.
	 * @see #getName1()
	 * @generated
	 */
	void setName1(String value);

	/**
	 * Returns the value of the '<em><b>Depends</b></em>' reference list.
	 * The list contents are of type {@link devops2.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' reference list.
	 * @see devops2.Devops2Package#getJob_Depends()
	 * @model
	 * @generated
	 */
	EList<Job> getDepends();

	/**
	 * Returns the value of the '<em><b>Tool framework job</b></em>' reference list.
	 * The list contents are of type {@link devops2.Tool_framework}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool framework job</em>' reference list.
	 * @see devops2.Devops2Package#getJob_Tool_framework_job()
	 * @model
	 * @generated
	 */
	EList<Tool_framework> getTool_framework_job();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link devops2.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see devops2.Devops2Package#getJob_Output()
	 * @model
	 * @generated
	 */
	EList<Artifact> getOutput();

	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference list.
	 * @see devops2.Devops2Package#getJob_Command()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommand();

	/**
	 * Returns the value of the '<em><b>Job parameter</b></em>' reference list.
	 * The list contents are of type {@link devops2.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job parameter</em>' reference list.
	 * @see devops2.Devops2Package#getJob_Job_parameter()
	 * @model
	 * @generated
	 */
	EList<Environment> getJob_parameter();

	/**
	 * Returns the value of the '<em><b>Ifthenelse</b></em>' reference list.
	 * The list contents are of type {@link devops2.IfThenElse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifthenelse</em>' reference list.
	 * @see devops2.Devops2Package#getJob_Ifthenelse()
	 * @model
	 * @generated
	 */
	EList<IfThenElse> getIfthenelse();

	/**
	 * Returns the value of the '<em><b>Allow faillure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow faillure</em>' attribute.
	 * @see #setAllow_faillure(boolean)
	 * @see devops2.Devops2Package#getJob_Allow_faillure()
	 * @model
	 * @generated
	 */
	boolean isAllow_faillure();

	/**
	 * Sets the value of the '{@link devops2.Job#isAllow_faillure <em>Allow faillure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow faillure</em>' attribute.
	 * @see #isAllow_faillure()
	 * @generated
	 */
	void setAllow_faillure(boolean value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see devops2.Devops2Package#getJob_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getInput();
} // Job
