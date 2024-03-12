/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Nested When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MultipleNestedWhen#getNestedWhens <em>Nested Whens</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getMultipleNestedWhen()
 * @model
 * @generated
 */
public interface MultipleNestedWhen extends NestedWhen {
	/**
	 * Returns the value of the '<em><b>Nested Whens</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.When}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Whens</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getMultipleNestedWhen_NestedWhens()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<When> getNestedWhens();

} // MultipleNestedWhen
