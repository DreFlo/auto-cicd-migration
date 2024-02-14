/**
 */
package CICD.Expressions.UnaryOperations.impl;

import CICD.CICDPackage;

import CICD.Expressions.BinaryOperations.BinaryOperationsPackage;

import CICD.Expressions.BinaryOperations.impl.BinaryOperationsPackageImpl;

import CICD.Expressions.BuiltInFunctions.BuiltInFunctionsPackage;

import CICD.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl;

import CICD.Expressions.ExpressionsPackage;

import CICD.Expressions.UnaryOperations.Negation;
import CICD.Expressions.UnaryOperations.UnaryOp;
import CICD.Expressions.UnaryOperations.UnaryOperationsFactory;
import CICD.Expressions.UnaryOperations.UnaryOperationsPackage;

import CICD.Expressions.Values.Literals.LiteralsPackage;

import CICD.Expressions.Values.Literals.impl.LiteralsPackageImpl;

import CICD.Expressions.Values.ValuesPackage;

import CICD.Expressions.Values.Variables.VariablesPackage;

import CICD.Expressions.Values.Variables.impl.VariablesPackageImpl;

import CICD.Expressions.Values.impl.ValuesPackageImpl;

import CICD.Expressions.impl.ExpressionsPackageImpl;

import CICD.Matrices.MatricesPackage;

import CICD.Matrices.impl.MatricesPackageImpl;

import CICD.Options.OptionsPackage;

import CICD.Options.impl.OptionsPackageImpl;

import CICD.Parameters.ParametersPackage;

import CICD.Parameters.impl.ParametersPackageImpl;

import CICD.Steps.StepsPackage;

import CICD.Steps.impl.StepsPackageImpl;

import CICD.Triggers.TriggersPackage;

import CICD.Triggers.impl.TriggersPackageImpl;

import CICD.impl.CICDPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnaryOperationsPackageImpl extends EPackageImpl implements UnaryOperationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negationEClass = null;

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
	 * @see CICD.Expressions.UnaryOperations.UnaryOperationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UnaryOperationsPackageImpl() {
		super(eNS_URI, UnaryOperationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UnaryOperationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UnaryOperationsPackage init() {
		if (isInited) return (UnaryOperationsPackage)EPackage.Registry.INSTANCE.getEPackage(UnaryOperationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUnaryOperationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UnaryOperationsPackageImpl theUnaryOperationsPackage = registeredUnaryOperationsPackage instanceof UnaryOperationsPackageImpl ? (UnaryOperationsPackageImpl)registeredUnaryOperationsPackage : new UnaryOperationsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CICDPackage.eNS_URI);
		CICDPackageImpl theCICDPackage = (CICDPackageImpl)(registeredPackage instanceof CICDPackageImpl ? registeredPackage : CICDPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
		TriggersPackageImpl theTriggersPackage = (TriggersPackageImpl)(registeredPackage instanceof TriggersPackageImpl ? registeredPackage : TriggersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI);
		OptionsPackageImpl theOptionsPackage = (OptionsPackageImpl)(registeredPackage instanceof OptionsPackageImpl ? registeredPackage : OptionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MatricesPackage.eNS_URI);
		MatricesPackageImpl theMatricesPackage = (MatricesPackageImpl)(registeredPackage instanceof MatricesPackageImpl ? registeredPackage : MatricesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(registeredPackage instanceof ParametersPackageImpl ? registeredPackage : ParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(registeredPackage instanceof StepsPackageImpl ? registeredPackage : StepsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(registeredPackage instanceof ExpressionsPackageImpl ? registeredPackage : ExpressionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(registeredPackage instanceof ValuesPackageImpl ? registeredPackage : ValuesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl)(registeredPackage instanceof LiteralsPackageImpl ? registeredPackage : LiteralsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(registeredPackage instanceof VariablesPackageImpl ? registeredPackage : VariablesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BuiltInFunctionsPackage.eNS_URI);
		BuiltInFunctionsPackageImpl theBuiltInFunctionsPackage = (BuiltInFunctionsPackageImpl)(registeredPackage instanceof BuiltInFunctionsPackageImpl ? registeredPackage : BuiltInFunctionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BinaryOperationsPackage.eNS_URI);
		BinaryOperationsPackageImpl theBinaryOperationsPackage = (BinaryOperationsPackageImpl)(registeredPackage instanceof BinaryOperationsPackageImpl ? registeredPackage : BinaryOperationsPackage.eINSTANCE);

		// Create package meta-data objects
		theUnaryOperationsPackage.createPackageContents();
		theCICDPackage.createPackageContents();
		theTriggersPackage.createPackageContents();
		theOptionsPackage.createPackageContents();
		theMatricesPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theBuiltInFunctionsPackage.createPackageContents();
		theBinaryOperationsPackage.createPackageContents();

		// Initialize created meta-data
		theUnaryOperationsPackage.initializePackageContents();
		theCICDPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();
		theOptionsPackage.initializePackageContents();
		theMatricesPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theBuiltInFunctionsPackage.initializePackageContents();
		theBinaryOperationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUnaryOperationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UnaryOperationsPackage.eNS_URI, theUnaryOperationsPackage);
		return theUnaryOperationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryOp() {
		return unaryOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryOp_Rhs() {
		return (EReference)unaryOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegation() {
		return negationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryOperationsFactory getUnaryOperationsFactory() {
		return (UnaryOperationsFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		unaryOpEClass = createEClass(UNARY_OP);
		createEReference(unaryOpEClass, UNARY_OP__RHS);

		negationEClass = createEClass(NEGATION);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		unaryOpEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		negationEClass.getESuperTypes().add(this.getUnaryOp());

		// Initialize classes, features, and operations; add parameters
		initEClass(unaryOpEClass, UnaryOp.class, "UnaryOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryOp_Rhs(), theExpressionsPackage.getExpression(), null, "rhs", null, 1, 1, UnaryOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negationEClass, Negation.class, "Negation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //UnaryOperationsPackageImpl
