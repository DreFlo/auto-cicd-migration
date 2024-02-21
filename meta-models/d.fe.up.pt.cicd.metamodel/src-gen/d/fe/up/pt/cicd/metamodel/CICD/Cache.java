/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Cache#getCacheName <em>Cache Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Cache#getKeys <em>Keys</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Cache#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getCache()
 * @model
 * @generated
 */
public interface Cache extends NonConditionalStep {
	/**
	 * Returns the value of the '<em><b>Cache Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Name</em>' containment reference.
	 * @see #setCacheName(Expression)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getCache_CacheName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCacheName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Cache#getCacheName <em>Cache Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Name</em>' containment reference.
	 * @see #getCacheName()
	 * @generated
	 */
	void setCacheName(Expression value);

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getCache_Keys()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getKeys();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getCache_Paths()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getPaths();

} // Cache
