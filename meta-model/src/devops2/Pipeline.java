/**
 */
package devops2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devops2.Pipeline#getWhen <em>When</em>}</li>
 *   <li>{@link devops2.Pipeline#getJob <em>Job</em>}</li>
 *   <li>{@link devops2.Pipeline#getName0 <em>Name0</em>}</li>
 *   <li>{@link devops2.Pipeline#getPipeline_tool_framework <em>Pipeline tool framework</em>}</li>
 *   <li>{@link devops2.Pipeline#getPipeline_envirnonment <em>Pipeline envirnonment</em>}</li>
 *   <li>{@link devops2.Pipeline#getPermission <em>Permission</em>}</li>
 *   <li>{@link devops2.Pipeline#getParallel <em>Parallel</em>}</li>
 * </ul>
 *
 * @see devops2.Devops2Package#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject {

	/**
	 * Returns the value of the '<em><b>Job</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' containment reference list.
	 * @see devops2.Devops2Package#getPipeline_Job()
	 * @model containment="true"
	 * @generated
	 */
	EList<Job> getJob();

	/**
	 * Returns the value of the '<em><b>Name0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name0</em>' attribute.
	 * @see #setName0(String)
	 * @see devops2.Devops2Package#getPipeline_Name0()
	 * @model
	 * @generated
	 */
	String getName0();

	/**
	 * Sets the value of the '{@link devops2.Pipeline#getName0 <em>Name0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name0</em>' attribute.
	 * @see #getName0()
	 * @generated
	 */
	void setName0(String value);

	/**
	 * Returns the value of the '<em><b>Pipeline tool framework</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.Tool_framework}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipeline tool framework</em>' containment reference list.
	 * @see devops2.Devops2Package#getPipeline_Pipeline_tool_framework()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool_framework> getPipeline_tool_framework();

	/**
	 * Returns the value of the '<em><b>Pipeline envirnonment</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipeline envirnonment</em>' containment reference list.
	 * @see devops2.Devops2Package#getPipeline_Pipeline_envirnonment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getPipeline_envirnonment();

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.Permission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' containment reference list.
	 * @see devops2.Devops2Package#getPipeline_Permission()
	 * @model containment="true"
	 * @generated
	 */
	EList<Permission> getPermission();

	/**
	 * Returns the value of the '<em><b>Parallel</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.Parallel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel</em>' containment reference list.
	 * @see devops2.Devops2Package#getPipeline_Parallel()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parallel> getParallel();

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.When}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference list.
	 * @see devops2.Devops2Package#getPipeline_When()
	 * @model containment="true"
	 * @generated
	 */
	EList<When> getWhen();
} // Pipeline
