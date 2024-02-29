/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ComparisonOp#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getComparisonOp()
 * @model
 * @generated
 */
public interface ComparisonOp extends BinaryOp {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARISON_OPS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARISON_OPS
	 * @see #setOp(COMPARISON_OPS)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getComparisonOp_Op()
	 * @model required="true"
	 * @generated
	 */
	COMPARISON_OPS getOp();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ComparisonOp#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARISON_OPS
	 * @see #getOp()
	 * @generated
	 */
	void setOp(COMPARISON_OPS value);

} // ComparisonOp
