/**
 */
package GHA.Expressions.BuiltInFunctions.util;

import GHA.Expressions.BuiltInFunctions.*;

import GHA.Expressions.Expression;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see GHA.Expressions.BuiltInFunctions.BuiltInFunctionsPackage
 * @generated
 */
public class BuiltInFunctionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BuiltInFunctionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInFunctionsSwitch() {
		if (modelPackage == null) {
			modelPackage = BuiltInFunctionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case BuiltInFunctionsPackage.BUILT_IN_FUNCTION_CALL: {
			BuiltInFunctionCall builtInFunctionCall = (BuiltInFunctionCall) theEObject;
			T result = caseBuiltInFunctionCall(builtInFunctionCall);
			if (result == null)
				result = caseExpression(builtInFunctionCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BuiltInFunctionsPackage.CONTAINS: {
			Contains contains = (Contains) theEObject;
			T result = caseContains(contains);
			if (result == null)
				result = caseBuiltInFunctionCall(contains);
			if (result == null)
				result = caseExpression(contains);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BuiltInFunctionsPackage.STARTS_WITH: {
			StartsWith startsWith = (StartsWith) theEObject;
			T result = caseStartsWith(startsWith);
			if (result == null)
				result = caseBuiltInFunctionCall(startsWith);
			if (result == null)
				result = caseExpression(startsWith);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BuiltInFunctionsPackage.ENDS_WITH: {
			EndsWith endsWith = (EndsWith) theEObject;
			T result = caseEndsWith(endsWith);
			if (result == null)
				result = caseBuiltInFunctionCall(endsWith);
			if (result == null)
				result = caseExpression(endsWith);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BuiltInFunctionsPackage.FORMAT: {
			Format format = (Format) theEObject;
			T result = caseFormat(format);
			if (result == null)
				result = caseBuiltInFunctionCall(format);
			if (result == null)
				result = caseExpression(format);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BuiltInFunctionsPackage.JOIN: {
			Join join = (Join) theEObject;
			T result = caseJoin(join);
			if (result == null)
				result = caseBuiltInFunctionCall(join);
			if (result == null)
				result = caseExpression(join);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BuiltInFunctionsPackage.TO_JSON: {
			ToJSON toJSON = (ToJSON) theEObject;
			T result = caseToJSON(toJSON);
			if (result == null)
				result = caseBuiltInFunctionCall(toJSON);
			if (result == null)
				result = caseExpression(toJSON);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BuiltInFunctionsPackage.FROM_JSON: {
			FromJSON fromJSON = (FromJSON) theEObject;
			T result = caseFromJSON(fromJSON);
			if (result == null)
				result = caseBuiltInFunctionCall(fromJSON);
			if (result == null)
				result = caseExpression(fromJSON);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BuiltInFunctionsPackage.HASH_FILES: {
			HashFiles hashFiles = (HashFiles) theEObject;
			T result = caseHashFiles(hashFiles);
			if (result == null)
				result = caseBuiltInFunctionCall(hashFiles);
			if (result == null)
				result = caseExpression(hashFiles);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInFunctionCall(BuiltInFunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContains(Contains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Starts With</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Starts With</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartsWith(StartsWith object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ends With</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ends With</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndsWith(EndsWith object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormat(Format object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To JSON</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To JSON</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToJSON(ToJSON object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From JSON</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From JSON</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromJSON(FromJSON object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hash Files</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hash Files</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHashFiles(HashFiles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BuiltInFunctionsSwitch
