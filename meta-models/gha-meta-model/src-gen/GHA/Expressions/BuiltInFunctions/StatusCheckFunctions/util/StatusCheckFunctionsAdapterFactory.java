/**
 */
package GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.util;

import GHA.Expressions.BuiltInFunctions.BuiltInFunctionCall;

import GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.*;

import GHA.Expressions.Expression;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheckFunctionsPackage
 * @generated
 */
public class StatusCheckFunctionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatusCheckFunctionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCheckFunctionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StatusCheckFunctionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusCheckFunctionsSwitch<Adapter> modelSwitch = new StatusCheckFunctionsSwitch<Adapter>() {
		@Override
		public Adapter caseStatusCheck(StatusCheck object) {
			return createStatusCheckAdapter();
		}

		@Override
		public Adapter caseAlways(Always object) {
			return createAlwaysAdapter();
		}

		@Override
		public Adapter caseSuccess(Success object) {
			return createSuccessAdapter();
		}

		@Override
		public Adapter caseCancelled(Cancelled object) {
			return createCancelledAdapter();
		}

		@Override
		public Adapter caseFailure(Failure object) {
			return createFailureAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseBuiltInFunctionCall(BuiltInFunctionCall object) {
			return createBuiltInFunctionCallAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheck <em>Status Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheck
	 * @generated
	 */
	public Adapter createStatusCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.Always <em>Always</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.Always
	 * @generated
	 */
	public Adapter createAlwaysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.Success <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.Success
	 * @generated
	 */
	public Adapter createSuccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.Cancelled <em>Cancelled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.Cancelled
	 * @generated
	 */
	public Adapter createCancelledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.Failure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.Failure
	 * @generated
	 */
	public Adapter createFailureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Expressions.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Expressions.BuiltInFunctions.BuiltInFunctionCall <em>Built In Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Expressions.BuiltInFunctions.BuiltInFunctionCall
	 * @generated
	 */
	public Adapter createBuiltInFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StatusCheckFunctionsAdapterFactory
