/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.CustomAgent#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getCustomAgent()
 * @model
 * @generated
 */
public interface CustomAgent extends Agent {
	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getCustomAgent_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getLabels();

} // CustomAgent
