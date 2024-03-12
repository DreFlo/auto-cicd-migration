/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix Combination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixCombination#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getMatrixCombination()
 * @model
 * @generated
 */
public interface MatrixCombination extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' map.
	 * The key is of type {@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Variable},
	 * and the value is of type {@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' map.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getMatrixCombination_Entries()
	 * @model mapType="d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Assignment&lt;d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Variable, d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Expression&gt;"
	 * @generated
	 */
	EMap<Variable, Expression> getEntries();

} // MatrixCombination
