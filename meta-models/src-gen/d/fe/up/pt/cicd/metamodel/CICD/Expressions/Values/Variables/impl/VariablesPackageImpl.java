/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.impl;

import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.BinaryOperations.BinaryOperationsPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.BinaryOperations.impl.BinaryOperationsPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.BuiltInFunctions.BuiltInFunctionsPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.ExpressionsPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.UnaryOperations.UnaryOperationsPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.UnaryOperations.impl.UnaryOperationsPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Literals.LiteralsPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Literals.impl.LiteralsPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.ValuesPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.EnvironmentVariable;
import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.SecretVariable;
import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.Variable;
import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.VariablesFactory;
import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.VariablesPackage;

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
public class VariablesPackageImpl extends EPackageImpl implements VariablesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secretVariableEClass = null;

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
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.VariablesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VariablesPackageImpl() {
		super(eNS_URI, VariablesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VariablesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VariablesPackage init() {
		if (isInited)
			return (VariablesPackage) EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVariablesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VariablesPackageImpl theVariablesPackage = registeredVariablesPackage instanceof VariablesPackageImpl
				? (VariablesPackageImpl) registeredVariablesPackage
				: new VariablesPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl) (registeredPackage instanceof LiteralsPackageImpl
				? registeredPackage
				: LiteralsPackage.eINSTANCE);
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
		theVariablesPackage.createPackageContents();
		theCICDPackage.createPackageContents();
		theTriggersPackage.createPackageContents();
		theOptionsPackage.createPackageContents();
		theMatricesPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theBuiltInFunctionsPackage.createPackageContents();
		theBinaryOperationsPackage.createPackageContents();
		theUnaryOperationsPackage.createPackageContents();

		// Initialize created meta-data
		theVariablesPackage.initializePackageContents();
		theCICDPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();
		theOptionsPackage.initializePackageContents();
		theMatricesPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theBuiltInFunctionsPackage.initializePackageContents();
		theBinaryOperationsPackage.initializePackageContents();
		theUnaryOperationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVariablesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VariablesPackage.eNS_URI, theVariablesPackage);
		return theVariablesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Name() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentVariable() {
		return environmentVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecretVariable() {
		return secretVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariablesFactory getVariablesFactory() {
		return (VariablesFactory) getEFactoryInstance();
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
		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);

		environmentVariableEClass = createEClass(ENVIRONMENT_VARIABLE);

		secretVariableEClass = createEClass(SECRET_VARIABLE);
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
		variableEClass.getESuperTypes().add(theValuesPackage.getValue());
		environmentVariableEClass.getESuperTypes().add(this.getVariable());
		secretVariableEClass.getESuperTypes().add(this.getVariable());

		// Initialize classes, features, and operations; add parameters
		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentVariableEClass, EnvironmentVariable.class, "EnvironmentVariable", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(secretVariableEClass, SecretVariable.class, "SecretVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //VariablesPackageImpl
