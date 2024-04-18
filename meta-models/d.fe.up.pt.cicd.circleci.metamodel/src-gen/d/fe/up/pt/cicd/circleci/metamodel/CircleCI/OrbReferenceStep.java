/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orb Reference Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceStep#getOrb <em>Orb</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceStep#getJobName <em>Job Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceStep#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getOrbReferenceStep()
 * @model
 * @generated
 */
public interface OrbReferenceStep extends Step {
	/**
	 * Returns the value of the '<em><b>Orb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orb</em>' reference.
	 * @see #setOrb(Orb)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getOrbReferenceStep_Orb()
	 * @model required="true"
	 * @generated
	 */
	Orb getOrb();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceStep#getOrb <em>Orb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orb</em>' reference.
	 * @see #getOrb()
	 * @generated
	 */
	void setOrb(Orb value);

	/**
	 * Returns the value of the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Name</em>' attribute.
	 * @see #setJobName(String)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getOrbReferenceStep_JobName()
	 * @model
	 * @generated
	 */
	String getJobName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceStep#getJobName <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Name</em>' attribute.
	 * @see #getJobName()
	 * @generated
	 */
	void setJobName(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' map.
	 * The key is of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDeclaration},
	 * and the value is of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' map.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getOrbReferenceStep_Arguments()
	 * @model mapType="d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableAssignment&lt;d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDeclaration, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression&gt;"
	 * @generated
	 */
	EMap<VariableDeclaration, Expression> getArguments();

} // OrbReferenceStep
