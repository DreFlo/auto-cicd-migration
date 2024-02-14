/**
 */
package GHA.Expressions.BuiltInFunctions.impl;

import GHA.Expressions.BuiltInFunctions.*;

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
		case BuiltInFunctionsPackage.CONTAINS:
			return createContains();
		case BuiltInFunctionsPackage.STARTS_WITH:
			return createStartsWith();
		case BuiltInFunctionsPackage.ENDS_WITH:
			return createEndsWith();
		case BuiltInFunctionsPackage.FORMAT:
			return createFormat();
		case BuiltInFunctionsPackage.JOIN:
			return createJoin();
		case BuiltInFunctionsPackage.TO_JSON:
			return createToJSON();
		case BuiltInFunctionsPackage.FROM_JSON:
			return createFromJSON();
		case BuiltInFunctionsPackage.HASH_FILES:
			return createHashFiles();
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
	public Contains createContains() {
		ContainsImpl contains = new ContainsImpl();
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartsWith createStartsWith() {
		StartsWithImpl startsWith = new StartsWithImpl();
		return startsWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndsWith createEndsWith() {
		EndsWithImpl endsWith = new EndsWithImpl();
		return endsWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Format createFormat() {
		FormatImpl format = new FormatImpl();
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToJSON createToJSON() {
		ToJSONImpl toJSON = new ToJSONImpl();
		return toJSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FromJSON createFromJSON() {
		FromJSONImpl fromJSON = new FromJSONImpl();
		return fromJSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HashFiles createHashFiles() {
		HashFilesImpl hashFiles = new HashFilesImpl();
		return hashFiles;
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
