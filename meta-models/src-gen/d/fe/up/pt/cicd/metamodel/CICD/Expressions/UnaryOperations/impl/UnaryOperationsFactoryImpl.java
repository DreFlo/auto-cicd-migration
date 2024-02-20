/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Expressions.UnaryOperations.impl;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.UnaryOperations.*;

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
public class UnaryOperationsFactoryImpl extends EFactoryImpl implements UnaryOperationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnaryOperationsFactory init() {
		try {
			UnaryOperationsFactory theUnaryOperationsFactory = (UnaryOperationsFactory) EPackage.Registry.INSTANCE
					.getEFactory(UnaryOperationsPackage.eNS_URI);
			if (theUnaryOperationsFactory != null) {
				return theUnaryOperationsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UnaryOperationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperationsFactoryImpl() {
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
		case UnaryOperationsPackage.UNARY_OP:
			return createUnaryOp();
		case UnaryOperationsPackage.NEGATION:
			return createNegation();
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
	public UnaryOp createUnaryOp() {
		UnaryOpImpl unaryOp = new UnaryOpImpl();
		return unaryOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Negation createNegation() {
		NegationImpl negation = new NegationImpl();
		return negation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryOperationsPackage getUnaryOperationsPackage() {
		return (UnaryOperationsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UnaryOperationsPackage getPackage() {
		return UnaryOperationsPackage.eINSTANCE;
	}

} //UnaryOperationsFactoryImpl
