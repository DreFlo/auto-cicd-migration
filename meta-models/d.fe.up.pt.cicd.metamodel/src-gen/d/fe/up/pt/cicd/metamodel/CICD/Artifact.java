/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Artifact#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Artifact#getIncludePaths <em>Include Paths</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Artifact#getExcludePaths <em>Exclude Paths</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Artifact#getRetentionTime <em>Retention Time</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Artifact#getStore <em>Store</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends NonConditionalStep {
	/**
	 * Returns the value of the '<em><b>Artifact Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Name</em>' containment reference.
	 * @see #setArtifactName(Expression)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getArtifact_ArtifactName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getArtifactName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Artifact#getArtifactName <em>Artifact Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Name</em>' containment reference.
	 * @see #getArtifactName()
	 * @generated
	 */
	void setArtifactName(Expression value);

	/**
	 * Returns the value of the '<em><b>Include Paths</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Paths</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getArtifact_IncludePaths()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getIncludePaths();

	/**
	 * Returns the value of the '<em><b>Exclude Paths</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Paths</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getArtifact_ExcludePaths()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getExcludePaths();

	/**
	 * Returns the value of the '<em><b>Retention Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retention Time</em>' containment reference.
	 * @see #setRetentionTime(Expression)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getArtifact_RetentionTime()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRetentionTime();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Artifact#getRetentionTime <em>Retention Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retention Time</em>' containment reference.
	 * @see #getRetentionTime()
	 * @generated
	 */
	void setRetentionTime(Expression value);

	/**
	 * Returns the value of the '<em><b>Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' attribute.
	 * @see #setStore(Boolean)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getArtifact_Store()
	 * @model required="true"
	 * @generated
	 */
	Boolean getStore();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Artifact#getStore <em>Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store</em>' attribute.
	 * @see #getStore()
	 * @generated
	 */
	void setStore(Boolean value);

} // Artifact
