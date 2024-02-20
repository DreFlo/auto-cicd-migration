/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Expressions.BuiltInFunctions.impl;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.BuiltInFunctions.*;

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
public class BuiltInFunctionsFactoryImpl extends EFactoryImpl implements BuiltInFunctionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuiltInFunctionsFactory init() {
		try {
			BuiltInFunctionsFactory theBuiltInFunctionsFactory = (BuiltInFunctionsFactory) EPackage.Registry.INSTANCE
					.getEFactory(BuiltInFunctionsPackage.eNS_URI);
			if (theBuiltInFunctionsFactory != null) {
				return theBuiltInFunctionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BuiltInFunctionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInFunctionsFactoryImpl() {
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
		case BuiltInFunctionsPackage.BUILT_IN_FUNCTION:
			return createBuiltInFunction();
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
	public BuiltInFunction createBuiltInFunction() {
		BuiltInFunctionImpl builtInFunction = new BuiltInFunctionImpl();
		return builtInFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuiltInFunctionsPackage getBuiltInFunctionsPackage() {
		return (BuiltInFunctionsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BuiltInFunctionsPackage getPackage() {
		return BuiltInFunctionsPackage.eINSTANCE;
	}

} //BuiltInFunctionsFactoryImpl
