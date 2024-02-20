/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

import d.fe.up.pt.cicd.metamodel.CICD.Triggers.Trigger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Pipeline#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Pipeline#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends PipelineBlock {
	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipeline_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipeline_Jobs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Job> getJobs();

} // Pipeline
