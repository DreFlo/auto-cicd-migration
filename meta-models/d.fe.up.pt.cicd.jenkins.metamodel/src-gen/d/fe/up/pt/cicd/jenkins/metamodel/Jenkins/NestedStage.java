/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NestedStage#getStages <em>Stages</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getNestedStage()
 * @model
 * @generated
 */
public interface NestedStage extends AbstractStage {
	/**
	 * Returns the value of the '<em><b>Stages</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StepStage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stages</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getNestedStage_Stages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StepStage> getStages();

} // NestedStage
