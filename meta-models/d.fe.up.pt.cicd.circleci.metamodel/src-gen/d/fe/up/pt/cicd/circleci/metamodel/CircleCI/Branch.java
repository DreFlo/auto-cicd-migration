/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Branch#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Branch#getBranch_type <em>Branch type</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getBranch_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Branch#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Branch type</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BRANCH_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch type</em>' attribute.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BRANCH_TYPE
	 * @see #setBranch_type(BRANCH_TYPE)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getBranch_Branch_type()
	 * @model
	 * @generated
	 */
	BRANCH_TYPE getBranch_type();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Branch#getBranch_type <em>Branch type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch type</em>' attribute.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BRANCH_TYPE
	 * @see #getBranch_type()
	 * @generated
	 */
	void setBranch_type(BRANCH_TYPE value);

} // Branch
