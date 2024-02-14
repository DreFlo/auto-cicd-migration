/**
 */
package CICD;

import CICD.Steps.Step;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CICD.Job#getId <em>Id</em>}</li>
 *   <li>{@link CICD.Job#getSteps <em>Steps</em>}</li>
 *   <li>{@link CICD.Job#getServices <em>Services</em>}</li>
 *   <li>{@link CICD.Job#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link CICD.Job#getNecessaryFor <em>Necessary For</em>}</li>
 *   <li>{@link CICD.Job#getMaxAttempts <em>Max Attempts</em>}</li>
 *   <li>{@link CICD.Job#isAllowFailure <em>Allow Failure</em>}</li>
 * </ul>
 *
 * @see CICD.CICDPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends PipelineBlock {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see CICD.CICDPackage#getJob_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link CICD.Job#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link CICD.Steps.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see CICD.CICDPackage#getJob_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link CICD.DockerContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see CICD.CICDPackage#getJob_Services()
	 * @model
	 * @generated
	 */
	EList<DockerContainer> getServices();

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference list.
	 * The list contents are of type {@link CICD.Job}.
	 * It is bidirectional and its opposite is '{@link CICD.Job#getNecessaryFor <em>Necessary For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' reference list.
	 * @see CICD.CICDPackage#getJob_DependsOn()
	 * @see CICD.Job#getNecessaryFor
	 * @model opposite="necessaryFor"
	 * @generated
	 */
	EList<Job> getDependsOn();

	/**
	 * Returns the value of the '<em><b>Necessary For</b></em>' reference list.
	 * The list contents are of type {@link CICD.Job}.
	 * It is bidirectional and its opposite is '{@link CICD.Job#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Necessary For</em>' reference list.
	 * @see CICD.CICDPackage#getJob_NecessaryFor()
	 * @see CICD.Job#getDependsOn
	 * @model opposite="dependsOn"
	 * @generated
	 */
	EList<Job> getNecessaryFor();

	/**
	 * Returns the value of the '<em><b>Max Attempts</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Attempts</em>' attribute.
	 * @see #setMaxAttempts(Integer)
	 * @see CICD.CICDPackage#getJob_MaxAttempts()
	 * @model default="1"
	 * @generated
	 */
	Integer getMaxAttempts();

	/**
	 * Sets the value of the '{@link CICD.Job#getMaxAttempts <em>Max Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Attempts</em>' attribute.
	 * @see #getMaxAttempts()
	 * @generated
	 */
	void setMaxAttempts(Integer value);

	/**
	 * Returns the value of the '<em><b>Allow Failure</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Failure</em>' attribute.
	 * @see #setAllowFailure(boolean)
	 * @see CICD.CICDPackage#getJob_AllowFailure()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAllowFailure();

	/**
	 * Sets the value of the '{@link CICD.Job#isAllowFailure <em>Allow Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Failure</em>' attribute.
	 * @see #isAllowFailure()
	 * @generated
	 */
	void setAllowFailure(boolean value);

} // Job
