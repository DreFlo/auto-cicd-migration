/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalStep#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalStep#getThenRun <em>Then Run</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalStep#getElseRun <em>Else Run</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getConditionalStep()
 * @model
 * @generated
 */
public interface ConditionalStep extends ConditionalChildStep {
	/**
	 * Returns the value of the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Condition</em>' containment reference.
	 * @see #setIfCondition(Expression)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getConditionalStep_IfCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getIfCondition();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalStep#getIfCondition <em>If Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Condition</em>' containment reference.
	 * @see #getIfCondition()
	 * @generated
	 */
	void setIfCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Then Run</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalChildStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Run</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getConditionalStep_ThenRun()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConditionalChildStep> getThenRun();

	/**
	 * Returns the value of the '<em><b>Else Run</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalChildStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Run</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getConditionalStep_ElseRun()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalChildStep> getElseRun();

} // ConditionalStep
