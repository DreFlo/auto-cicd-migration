/**
 */
package GHA.Expressions.BuiltInFunctions;

import GHA.Expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hash Files</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Expressions.BuiltInFunctions.HashFiles#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see GHA.Expressions.BuiltInFunctions.BuiltInFunctionsPackage#getHashFiles()
 * @model
 * @generated
 */
public interface HashFiles extends BuiltInFunctionCall {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(Expression)
	 * @see GHA.Expressions.BuiltInFunctions.BuiltInFunctionsPackage#getHashFiles_Path()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getPath();

	/**
	 * Sets the value of the '{@link GHA.Expressions.BuiltInFunctions.HashFiles#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Expression value);

} // HashFiles
