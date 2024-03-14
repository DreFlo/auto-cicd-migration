/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getParallelism <em>Parallelism</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getStore_artifact <em>Store artifact</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getWhen_unless <em>When unless</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getExecution_env <em>Execution env</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getJob_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallelism</em>' attribute.
	 * @see #setParallelism(short)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getJob_Parallelism()
	 * @model
	 * @generated
	 */
	short getParallelism();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getParallelism <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallelism</em>' attribute.
	 * @see #getParallelism()
	 * @generated
	 */
	void setParallelism(short value);

	/**
	 * Returns the value of the '<em><b>Store artifact</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Store_Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store artifact</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getJob_Store_artifact()
	 * @model containment="true"
	 * @generated
	 */
	EList<Store_Artifact> getStore_artifact();

	/**
	 * Returns the value of the '<em><b>When unless</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When unless</em>' containment reference.
	 * @see #setWhen_unless(When_Unless)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getJob_When_unless()
	 * @model containment="true"
	 * @generated
	 */
	When_Unless getWhen_unless();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getWhen_unless <em>When unless</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When unless</em>' containment reference.
	 * @see #getWhen_unless()
	 * @generated
	 */
	void setWhen_unless(When_Unless value);

	/**
	 * Returns the value of the '<em><b>Execution env</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution env</em>' containment reference.
	 * @see #setExecution_env(Execution_Env)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getJob_Execution_env()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Execution_Env getExecution_env();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getExecution_env <em>Execution env</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution env</em>' containment reference.
	 * @see #getExecution_env()
	 * @generated
	 */
	void setExecution_env(Execution_Env value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getJob_Environment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironment();

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getJob_Step()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getStep();

} // Job
