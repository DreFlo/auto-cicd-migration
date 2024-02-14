/**
 */
package CICD.Expressions.BinaryOperations.impl;

import CICD.Expressions.BinaryOperations.*;

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
public class BinaryOperationsFactoryImpl extends EFactoryImpl implements BinaryOperationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BinaryOperationsFactory init() {
		try {
			BinaryOperationsFactory theBinaryOperationsFactory = (BinaryOperationsFactory)EPackage.Registry.INSTANCE.getEFactory(BinaryOperationsPackage.eNS_URI);
			if (theBinaryOperationsFactory != null) {
				return theBinaryOperationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BinaryOperationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperationsFactoryImpl() {
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
			case BinaryOperationsPackage.BINARY_OP: return createBinaryOp();
			case BinaryOperationsPackage.CONJUNTION: return createConjuntion();
			case BinaryOperationsPackage.DISJUNCTION: return createDisjunction();
			case BinaryOperationsPackage.ADDITION: return createAddition();
			case BinaryOperationsPackage.SUBTRACTION: return createSubtraction();
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
	public BinaryOp createBinaryOp() {
		BinaryOpImpl binaryOp = new BinaryOpImpl();
		return binaryOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conjuntion createConjuntion() {
		ConjuntionImpl conjuntion = new ConjuntionImpl();
		return conjuntion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Disjunction createDisjunction() {
		DisjunctionImpl disjunction = new DisjunctionImpl();
		return disjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Addition createAddition() {
		AdditionImpl addition = new AdditionImpl();
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subtraction createSubtraction() {
		SubtractionImpl subtraction = new SubtractionImpl();
		return subtraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryOperationsPackage getBinaryOperationsPackage() {
		return (BinaryOperationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BinaryOperationsPackage getPackage() {
		return BinaryOperationsPackage.eINSTANCE;
	}

} //BinaryOperationsFactoryImpl
