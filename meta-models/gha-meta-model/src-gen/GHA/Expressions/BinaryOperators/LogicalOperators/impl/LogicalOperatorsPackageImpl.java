/**
 */
package GHA.Expressions.BinaryOperators.LogicalOperators.impl;

import GHA.Expressions.BinaryOperators.BinaryOperatorsPackage;

import GHA.Expressions.BinaryOperators.ComparisonOperators.ComparisonOperatorsPackage;

import GHA.Expressions.BinaryOperators.ComparisonOperators.impl.ComparisonOperatorsPackageImpl;

import GHA.Expressions.BinaryOperators.EqualityOperators.EqualityOperatorsPackage;

import GHA.Expressions.BinaryOperators.EqualityOperators.impl.EqualityOperatorsPackageImpl;

import GHA.Expressions.BinaryOperators.LogicalOperators.And;
import GHA.Expressions.BinaryOperators.LogicalOperators.LogicalOp;
import GHA.Expressions.BinaryOperators.LogicalOperators.LogicalOperatorsFactory;
import GHA.Expressions.BinaryOperators.LogicalOperators.LogicalOperatorsPackage;
import GHA.Expressions.BinaryOperators.LogicalOperators.Or;

import GHA.Expressions.BinaryOperators.impl.BinaryOperatorsPackageImpl;

import GHA.Expressions.BuiltInFunctions.BuiltInFunctionsPackage;

import GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheckFunctionsPackage;

import GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckFunctionsPackageImpl;

import GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl;

import GHA.Expressions.ExpressionsPackage;

import GHA.Expressions.UnaryOperators.UnaryOperatorsPackage;

import GHA.Expressions.UnaryOperators.impl.UnaryOperatorsPackageImpl;

import GHA.Expressions.Values.Literals.LiteralsPackage;

import GHA.Expressions.Values.Literals.impl.LiteralsPackageImpl;

import GHA.Expressions.Values.ValuesPackage;

import GHA.Expressions.Values.Variables.VariablesPackage;

import GHA.Expressions.Values.Variables.impl.VariablesPackageImpl;

import GHA.Expressions.Values.impl.ValuesPackageImpl;

import GHA.Expressions.impl.ExpressionsPackageImpl;

import GHA.GHAPackage;

import GHA.Jobs.JobsPackage;

import GHA.Jobs.Matrices.MatricesPackage;

import GHA.Jobs.Matrices.impl.MatricesPackageImpl;

import GHA.Jobs.Steps.StepsPackage;

import GHA.Jobs.Steps.impl.StepsPackageImpl;

import GHA.Jobs.impl.JobsPackageImpl;

import GHA.Options.OptionsPackage;

import GHA.Options.impl.OptionsPackageImpl;

import GHA.Triggers.Parameters.ParametersPackage;

import GHA.Triggers.Parameters.impl.ParametersPackageImpl;

import GHA.Triggers.TriggersPackage;

import GHA.Triggers.impl.TriggersPackageImpl;

import GHA.impl.GHAPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalOperatorsPackageImpl extends EPackageImpl implements LogicalOperatorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

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
	 * @see GHA.Expressions.BinaryOperators.LogicalOperators.LogicalOperatorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogicalOperatorsPackageImpl() {
		super(eNS_URI, LogicalOperatorsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LogicalOperatorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogicalOperatorsPackage init() {
		if (isInited)
			return (LogicalOperatorsPackage) EPackage.Registry.INSTANCE.getEPackage(LogicalOperatorsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLogicalOperatorsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LogicalOperatorsPackageImpl theLogicalOperatorsPackage = registeredLogicalOperatorsPackage instanceof LogicalOperatorsPackageImpl
				? (LogicalOperatorsPackageImpl) registeredLogicalOperatorsPackage
				: new LogicalOperatorsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GHAPackage.eNS_URI);
		GHAPackageImpl theGHAPackage = (GHAPackageImpl) (registeredPackage instanceof GHAPackageImpl ? registeredPackage
				: GHAPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JobsPackage.eNS_URI);
		JobsPackageImpl theJobsPackage = (JobsPackageImpl) (registeredPackage instanceof JobsPackageImpl
				? registeredPackage
				: JobsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MatricesPackage.eNS_URI);
		MatricesPackageImpl theMatricesPackage = (MatricesPackageImpl) (registeredPackage instanceof MatricesPackageImpl
				? registeredPackage
				: MatricesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl) (registeredPackage instanceof StepsPackageImpl
				? registeredPackage
				: StepsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
		TriggersPackageImpl theTriggersPackage = (TriggersPackageImpl) (registeredPackage instanceof TriggersPackageImpl
				? registeredPackage
				: TriggersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl) (registeredPackage instanceof ParametersPackageImpl
				? registeredPackage
				: ParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI);
		OptionsPackageImpl theOptionsPackage = (OptionsPackageImpl) (registeredPackage instanceof OptionsPackageImpl
				? registeredPackage
				: OptionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (registeredPackage instanceof ExpressionsPackageImpl
				? registeredPackage
				: ExpressionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BinaryOperatorsPackage.eNS_URI);
		BinaryOperatorsPackageImpl theBinaryOperatorsPackage = (BinaryOperatorsPackageImpl) (registeredPackage instanceof BinaryOperatorsPackageImpl
				? registeredPackage
				: BinaryOperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EqualityOperatorsPackage.eNS_URI);
		EqualityOperatorsPackageImpl theEqualityOperatorsPackage = (EqualityOperatorsPackageImpl) (registeredPackage instanceof EqualityOperatorsPackageImpl
				? registeredPackage
				: EqualityOperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComparisonOperatorsPackage.eNS_URI);
		ComparisonOperatorsPackageImpl theComparisonOperatorsPackage = (ComparisonOperatorsPackageImpl) (registeredPackage instanceof ComparisonOperatorsPackageImpl
				? registeredPackage
				: ComparisonOperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UnaryOperatorsPackage.eNS_URI);
		UnaryOperatorsPackageImpl theUnaryOperatorsPackage = (UnaryOperatorsPackageImpl) (registeredPackage instanceof UnaryOperatorsPackageImpl
				? registeredPackage
				: UnaryOperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BuiltInFunctionsPackage.eNS_URI);
		BuiltInFunctionsPackageImpl theBuiltInFunctionsPackage = (BuiltInFunctionsPackageImpl) (registeredPackage instanceof BuiltInFunctionsPackageImpl
				? registeredPackage
				: BuiltInFunctionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StatusCheckFunctionsPackage.eNS_URI);
		StatusCheckFunctionsPackageImpl theStatusCheckFunctionsPackage = (StatusCheckFunctionsPackageImpl) (registeredPackage instanceof StatusCheckFunctionsPackageImpl
				? registeredPackage
				: StatusCheckFunctionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl) (registeredPackage instanceof ValuesPackageImpl
				? registeredPackage
				: ValuesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl) (registeredPackage instanceof LiteralsPackageImpl
				? registeredPackage
				: LiteralsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl) (registeredPackage instanceof VariablesPackageImpl
				? registeredPackage
				: VariablesPackage.eINSTANCE);

		// Create package meta-data objects
		theLogicalOperatorsPackage.createPackageContents();
		theGHAPackage.createPackageContents();
		theJobsPackage.createPackageContents();
		theMatricesPackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theTriggersPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theOptionsPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theBinaryOperatorsPackage.createPackageContents();
		theEqualityOperatorsPackage.createPackageContents();
		theComparisonOperatorsPackage.createPackageContents();
		theUnaryOperatorsPackage.createPackageContents();
		theBuiltInFunctionsPackage.createPackageContents();
		theStatusCheckFunctionsPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();

		// Initialize created meta-data
		theLogicalOperatorsPackage.initializePackageContents();
		theGHAPackage.initializePackageContents();
		theJobsPackage.initializePackageContents();
		theMatricesPackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theOptionsPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theBinaryOperatorsPackage.initializePackageContents();
		theEqualityOperatorsPackage.initializePackageContents();
		theComparisonOperatorsPackage.initializePackageContents();
		theUnaryOperatorsPackage.initializePackageContents();
		theBuiltInFunctionsPackage.initializePackageContents();
		theStatusCheckFunctionsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogicalOperatorsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogicalOperatorsPackage.eNS_URI, theLogicalOperatorsPackage);
		return theLogicalOperatorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalOp() {
		return logicalOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalOperatorsFactory getLogicalOperatorsFactory() {
		return (LogicalOperatorsFactory) getEFactoryInstance();
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
		logicalOpEClass = createEClass(LOGICAL_OP);

		orEClass = createEClass(OR);

		andEClass = createEClass(AND);
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
		BinaryOperatorsPackage theBinaryOperatorsPackage = (BinaryOperatorsPackage) EPackage.Registry.INSTANCE
				.getEPackage(BinaryOperatorsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		logicalOpEClass.getESuperTypes().add(theBinaryOperatorsPackage.getBinaryOp());
		orEClass.getESuperTypes().add(this.getLogicalOp());
		andEClass.getESuperTypes().add(this.getLogicalOp());

		// Initialize classes, features, and operations; add parameters
		initEClass(logicalOpEClass, LogicalOp.class, "LogicalOp", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //LogicalOperatorsPackageImpl
