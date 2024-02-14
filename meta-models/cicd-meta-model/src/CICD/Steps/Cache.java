/**
 */
package CICD.Steps;

import CICD.Expressions.Expression;

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
 *   <li>{@link CICD.Steps.Cache#getCacheName <em>Cache Name</em>}</li>
 *   <li>{@link CICD.Steps.Cache#getKeys <em>Keys</em>}</li>
 *   <li>{@link CICD.Steps.Cache#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @see CICD.Steps.StepsPackage#getCache()
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
	 * @see CICD.Steps.StepsPackage#getCache_CacheName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCacheName();

	/**
	 * Sets the value of the '{@link CICD.Steps.Cache#getCacheName <em>Cache Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Name</em>' containment reference.
	 * @see #getCacheName()
	 * @generated
	 */
	void setCacheName(Expression value);

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference list.
	 * The list contents are of type {@link CICD.Expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference list.
	 * @see CICD.Steps.StepsPackage#getCache_Keys()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getKeys();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link CICD.Expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see CICD.Steps.StepsPackage#getCache_Paths()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getPaths();

} // Cache
