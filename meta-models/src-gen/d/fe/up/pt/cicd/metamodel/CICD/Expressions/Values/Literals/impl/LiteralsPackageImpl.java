/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Literals.impl;

import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.BinaryOperations.BinaryOperationsPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.BinaryOperations.impl.BinaryOperationsPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.BuiltInFunctions.BuiltInFunctionsPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.ExpressionsPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.UnaryOperations.UnaryOperationsPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.UnaryOperations.impl.UnaryOperationsPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Literals.BooleanLiteral;
import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Literals.Literal;
import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Literals.LiteralsFactory;
import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Literals.LiteralsPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Literals.NumberLiteral;
import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Literals.StringLiteral;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.ValuesPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.VariablesPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.impl.VariablesPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.impl.ValuesPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.impl.ExpressionsPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Matrices.MatricesPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Matrices.impl.MatricesPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Options.OptionsPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Options.impl.OptionsPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Parameters.ParametersPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Parameters.impl.ParametersPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Steps.impl.StepsPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Triggers.TriggersPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggersPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiteralsPackageImpl extends EPackageImpl implements LiteralsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Literals.LiteralsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LiteralsPackageImpl() {
		super(eNS_URI, LiteralsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LiteralsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LiteralsPackage init() {
		if (isInited)
			return (LiteralsPackage) EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLiteralsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LiteralsPackageImpl theLiteralsPackage = registeredLiteralsPackage instanceof LiteralsPackageImpl
				? (LiteralsPackageImpl) registeredLiteralsPackage
				: new LiteralsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CICDPackage.eNS_URI);
		CICDPackageImpl theCICDPackage = (CICDPackageImpl) (registeredPackage instanceof CICDPackageImpl
				? registeredPackage
				: CICDPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
		TriggersPackageImpl theTriggersPackage = (TriggersPackageImpl) (registeredPackage instanceof TriggersPackageImpl
				? registeredPackage
				: TriggersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI);
		OptionsPackageImpl theOptionsPackage = (OptionsPackageImpl) (registeredPackage instanceof OptionsPackageImpl
				? registeredPackage
				: OptionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MatricesPackage.eNS_URI);
		MatricesPackageImpl theMatricesPackage = (MatricesPackageImpl) (registeredPackage instanceof MatricesPackageImpl
				? registeredPackage
				: MatricesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl) (registeredPackage instanceof ParametersPackageImpl
				? registeredPackage
				: ParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl) (registeredPackage instanceof StepsPackageImpl
				? registeredPackage
				: StepsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (registeredPackage instanceof ExpressionsPackageImpl
				? registeredPackage
				: ExpressionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl) (registeredPackage instanceof ValuesPackageImpl
				? registeredPackage
				: ValuesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl) (registeredPackage instanceof VariablesPackageImpl
				? registeredPackage
				: VariablesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BuiltInFunctionsPackage.eNS_URI);
		BuiltInFunctionsPackageImpl theBuiltInFunctionsPackage = (BuiltInFunctionsPackageImpl) (registeredPackage instanceof BuiltInFunctionsPackageImpl
				? registeredPackage
				: BuiltInFunctionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BinaryOperationsPackage.eNS_URI);
		BinaryOperationsPackageImpl theBinaryOperationsPackage = (BinaryOperationsPackageImpl) (registeredPackage instanceof BinaryOperationsPackageImpl
				? registeredPackage
				: BinaryOperationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UnaryOperationsPackage.eNS_URI);
		UnaryOperationsPackageImpl theUnaryOperationsPackage = (UnaryOperationsPackageImpl) (registeredPackage instanceof UnaryOperationsPackageImpl
				? registeredPackage
				: UnaryOperationsPackage.eINSTANCE);

		// Create package meta-data objects
		theLiteralsPackage.createPackageContents();
		theCICDPackage.createPackageContents();
		theTriggersPackage.createPackageContents();
		theOptionsPackage.createPackageContents();
		theMatricesPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theBuiltInFunctionsPackage.createPackageContents();
		theBinaryOperationsPackage.createPackageContents();
		theUnaryOperationsPackage.createPackageContents();

		// Initialize created meta-data
		theLiteralsPackage.initializePackageContents();
		theCICDPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();
		theOptionsPackage.initializePackageContents();
		theMatricesPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theBuiltInFunctionsPackage.initializePackageContents();
		theBinaryOperationsPackage.initializePackageContents();
		theUnaryOperationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLiteralsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LiteralsPackage.eNS_URI, theLiteralsPackage);
		return theLiteralsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringLiteral() {
		return stringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringLiteral_Value() {
		return (EAttribute) stringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberLiteral() {
		return numberLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanLiteral() {
		return booleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralsFactory getLiteralsFactory() {
		return (LiteralsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		literalEClass = createEClass(LITERAL);

		stringLiteralEClass = createEClass(STRING_LITERAL);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

		numberLiteralEClass = createEClass(NUMBER_LITERAL);

		booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ValuesPackage theValuesPackage = (ValuesPackage) EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		literalEClass.getESuperTypes().add(theValuesPackage.getValue());
		stringLiteralEClass.getESuperTypes().add(this.getLiteral());
		numberLiteralEClass.getESuperTypes().add(this.getLiteral());
		booleanLiteralEClass.getESuperTypes().add(this.getLiteral());

		// Initialize classes, features, and operations; add parameters
		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringLiteral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberLiteralEClass, NumberLiteral.class, "NumberLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //LiteralsPackageImpl