/**
 */
package GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl;

import GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatusCheckFunctionsFactoryImpl extends EFactoryImpl implements StatusCheckFunctionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatusCheckFunctionsFactory init() {
		try {
			StatusCheckFunctionsFactory theStatusCheckFunctionsFactory = (StatusCheckFunctionsFactory) EPackage.Registry.INSTANCE
					.getEFactory(StatusCheckFunctionsPackage.eNS_URI);
			if (theStatusCheckFunctionsFactory != null) {
				return theStatusCheckFunctionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatusCheckFunctionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCheckFunctionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case StatusCheckFunctionsPackage.ALWAYS:
			return createAlways();
		case StatusCheckFunctionsPackage.SUCCESS:
			return createSuccess();
		case StatusCheckFunctionsPackage.CANCELLED:
			return createCancelled();
		case StatusCheckFunctionsPackage.FAILURE:
			return createFailure();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Always createAlways() {
		AlwaysImpl always = new AlwaysImpl();
		return always;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Success createSuccess() {
		SuccessImpl success = new SuccessImpl();
		return success;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cancelled createCancelled() {
		CancelledImpl cancelled = new CancelledImpl();
		return cancelled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Failure createFailure() {
		FailureImpl failure = new FailureImpl();
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusCheckFunctionsPackage getStatusCheckFunctionsPackage() {
		return (StatusCheckFunctionsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatusCheckFunctionsPackage getPackage() {
		return StatusCheckFunctionsPackage.eINSTANCE;
	}

} //StatusCheckFunctionsFactoryImpl
