/**
 */
package GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.util;

import GHA.Expressions.BuiltInFunctions.BuiltInFunctionCall;

import GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.*;

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
 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheckFunctionsPackage
 * @generated
 */
public class StatusCheckFunctionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatusCheckFunctionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCheckFunctionsSwitch() {
		if (modelPackage == null) {
			modelPackage = StatusCheckFunctionsPackage.eINSTANCE;
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
		case StatusCheckFunctionsPackage.STATUS_CHECK: {
			StatusCheck statusCheck = (StatusCheck) theEObject;
			T result = caseStatusCheck(statusCheck);
			if (result == null)
				result = caseBuiltInFunctionCall(statusCheck);
			if (result == null)
				result = caseExpression(statusCheck);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatusCheckFunctionsPackage.ALWAYS: {
			Always always = (Always) theEObject;
			T result = caseAlways(always);
			if (result == null)
				result = caseStatusCheck(always);
			if (result == null)
				result = caseBuiltInFunctionCall(always);
			if (result == null)
				result = caseExpression(always);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatusCheckFunctionsPackage.SUCCESS: {
			Success success = (Success) theEObject;
			T result = caseSuccess(success);
			if (result == null)
				result = caseStatusCheck(success);
			if (result == null)
				result = caseBuiltInFunctionCall(success);
			if (result == null)
				result = caseExpression(success);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatusCheckFunctionsPackage.CANCELLED: {
			Cancelled cancelled = (Cancelled) theEObject;
			T result = caseCancelled(cancelled);
			if (result == null)
				result = caseStatusCheck(cancelled);
			if (result == null)
				result = caseBuiltInFunctionCall(cancelled);
			if (result == null)
				result = caseExpression(cancelled);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StatusCheckFunctionsPackage.FAILURE: {
			Failure failure = (Failure) theEObject;
			T result = caseFailure(failure);
			if (result == null)
				result = caseStatusCheck(failure);
			if (result == null)
				result = caseBuiltInFunctionCall(failure);
			if (result == null)
				result = caseExpression(failure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusCheck(StatusCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Always</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Always</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlways(Always object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Success</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Success</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccess(Success object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancelled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancelled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancelled(Cancelled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailure(Failure object) {
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

} //StatusCheckFunctionsSwitch
