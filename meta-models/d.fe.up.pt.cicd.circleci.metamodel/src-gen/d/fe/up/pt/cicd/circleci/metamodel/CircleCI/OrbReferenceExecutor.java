/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orb Reference Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceExecutor#getOrb <em>Orb</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceExecutor#getOrbExecutorName <em>Orb Executor Name</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getOrbReferenceExecutor()
 * @model
 * @generated
 */
public interface OrbReferenceExecutor extends ReferenceExecutor {
	/**
	 * Returns the value of the '<em><b>Orb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orb</em>' reference.
	 * @see #setOrb(Orb)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getOrbReferenceExecutor_Orb()
	 * @model required="true"
	 * @generated
	 */
	Orb getOrb();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceExecutor#getOrb <em>Orb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orb</em>' reference.
	 * @see #getOrb()
	 * @generated
	 */
	void setOrb(Orb value);

	/**
	 * Returns the value of the '<em><b>Orb Executor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orb Executor Name</em>' attribute.
	 * @see #setOrbExecutorName(String)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getOrbReferenceExecutor_OrbExecutorName()
	 * @model required="true"
	 * @generated
	 */
	String getOrbExecutorName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceExecutor#getOrbExecutorName <em>Orb Executor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orb Executor Name</em>' attribute.
	 * @see #getOrbExecutorName()
	 * @generated
	 */
	void setOrbExecutorName(String value);

} // OrbReferenceExecutor
