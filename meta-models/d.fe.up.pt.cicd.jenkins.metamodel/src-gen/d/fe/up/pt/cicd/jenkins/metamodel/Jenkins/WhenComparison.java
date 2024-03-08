/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison#getPattern <em>Pattern</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison#getComparator <em>Comparator</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison#getCaseSensitive <em>Case Sensitive</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getWhenComparison()
 * @model abstract="true"
 * @generated
 */
public interface WhenComparison extends When {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getWhenComparison_Pattern()
	 * @model required="true"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' attribute.
	 * The default value is <code>"EQUALS"</code>.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARATORS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' attribute.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARATORS
	 * @see #setComparator(COMPARATORS)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getWhenComparison_Comparator()
	 * @model default="EQUALS" required="true"
	 * @generated
	 */
	COMPARATORS getComparator();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison#getComparator <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' attribute.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARATORS
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(COMPARATORS value);

	/**
	 * Returns the value of the '<em><b>Case Sensitive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Sensitive</em>' attribute.
	 * @see #setCaseSensitive(Boolean)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getWhenComparison_CaseSensitive()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getCaseSensitive();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison#getCaseSensitive <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Sensitive</em>' attribute.
	 * @see #getCaseSensitive()
	 * @generated
	 */
	void setCaseSensitive(Boolean value);

} // WhenComparison
