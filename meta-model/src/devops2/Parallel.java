/**
 */
package devops2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devops2.Parallel#getJob <em>Job</em>}</li>
 * </ul>
 *
 * @see devops2.Devops2Package#getParallel()
 * @model
 * @generated
 */
public interface Parallel extends EObject {
	/**
	 * Returns the value of the '<em><b>Job</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' containment reference list.
	 * @see devops2.Devops2Package#getParallel_Job()
	 * @model containment="true"
	 * @generated
	 */
	EList<Job> getJob();

} // Parallel
