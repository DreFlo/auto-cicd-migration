/**
 */
package GHA.Expressions.BuiltInFunctions.impl;

import GHA.Expressions.BinaryOperators.BinaryOperatorsPackage;

import GHA.Expressions.BinaryOperators.ComparisonOperators.ComparisonOperatorsPackage;

import GHA.Expressions.BinaryOperators.ComparisonOperators.impl.ComparisonOperatorsPackageImpl;

import GHA.Expressions.BinaryOperators.EqualityOperators.EqualityOperatorsPackage;

import GHA.Expressions.BinaryOperators.EqualityOperators.impl.EqualityOperatorsPackageImpl;

import GHA.Expressions.BinaryOperators.LogicalOperators.LogicalOperatorsPackage;

import GHA.Expressions.BinaryOperators.LogicalOperators.impl.LogicalOperatorsPackageImpl;

import GHA.Expressions.BinaryOperators.impl.BinaryOperatorsPackageImpl;

import GHA.Expressions.BuiltInFunctions.BuiltInFunctionCall;
import GHA.Expressions.BuiltInFunctions.BuiltInFunctionsFactory;
import GHA.Expressions.BuiltInFunctions.BuiltInFunctionsPackage;
import GHA.Expressions.BuiltInFunctions.Contains;
import GHA.Expressions.BuiltInFunctions.EndsWith;
import GHA.Expressions.BuiltInFunctions.Format;
import GHA.Expressions.BuiltInFunctions.FromJSON;
import GHA.Expressions.BuiltInFunctions.HashFiles;
import GHA.Expressions.BuiltInFunctions.Join;
import GHA.Expressions.BuiltInFunctions.StartsWith;

import GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheckFunctionsPackage;

import GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckFunctionsPackageImpl;

import GHA.Expressions.BuiltInFunctions.ToJSON;

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
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuiltInFunctionsPackageImpl extends EPackageImpl implements BuiltInFunctionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInFunctionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startsWithEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endsWithEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toJSONEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromJSONEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashFilesEClass = null;

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
	 * @see GHA.Expressions.BuiltInFunctions.BuiltInFunctionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BuiltInFunctionsPackageImpl() {
		super(eNS_URI, BuiltInFunctionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BuiltInFunctionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BuiltInFunctionsPackage init() {
		if (isInited)
			return (BuiltInFunctionsPackage) EPackage.Registry.INSTANCE.getEPackage(BuiltInFunctionsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBuiltInFunctionsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BuiltInFunctionsPackageImpl theBuiltInFunctionsPackage = registeredBuiltInFunctionsPackage instanceof BuiltInFunctionsPackageImpl
				? (BuiltInFunctionsPackageImpl) registeredBuiltInFunctionsPackage
				: new BuiltInFunctionsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogicalOperatorsPackage.eNS_URI);
		LogicalOperatorsPackageImpl theLogicalOperatorsPackage = (LogicalOperatorsPackageImpl) (registeredPackage instanceof LogicalOperatorsPackageImpl
				? registeredPackage
				: LogicalOperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UnaryOperatorsPackage.eNS_URI);
		UnaryOperatorsPackageImpl theUnaryOperatorsPackage = (UnaryOperatorsPackageImpl) (registeredPackage instanceof UnaryOperatorsPackageImpl
				? registeredPackage
				: UnaryOperatorsPackage.eINSTANCE);
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
		theBuiltInFunctionsPackage.createPackageContents();
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
		theLogicalOperatorsPackage.createPackageContents();
		theUnaryOperatorsPackage.createPackageContents();
		theStatusCheckFunctionsPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();

		// Initialize created meta-data
		theBuiltInFunctionsPackage.initializePackageContents();
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
		theLogicalOperatorsPackage.initializePackageContents();
		theUnaryOperatorsPackage.initializePackageContents();
		theStatusCheckFunctionsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBuiltInFunctionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BuiltInFunctionsPackage.eNS_URI, theBuiltInFunctionsPackage);
		return theBuiltInFunctionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuiltInFunctionCall() {
		return builtInFunctionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContains() {
		return containsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContains_Search() {
		return (EReference) containsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContains_Item() {
		return (EReference) containsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStartsWith() {
		return startsWithEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStartsWith_SearchString() {
		return (EReference) startsWithEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStartsWith_SearchValue() {
		return (EReference) startsWithEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndsWith() {
		return endsWithEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndsWith_SearchString() {
		return (EReference) endsWithEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndsWith_SearchValue() {
		return (EReference) endsWithEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormat() {
		return formatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormat_String() {
		return (EReference) formatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormat_ReplaceValues() {
		return (EReference) formatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJoin() {
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJoin_Array() {
		return (EReference) joinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJoin_Sep() {
		return (EReference) joinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToJSON() {
		return toJSONEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToJSON_Value() {
		return (EReference) toJSONEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFromJSON() {
		return fromJSONEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFromJSON_Value() {
		return (EReference) fromJSONEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHashFiles() {
		return hashFilesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHashFiles_Path() {
		return (EReference) hashFilesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuiltInFunctionsFactory getBuiltInFunctionsFactory() {
		return (BuiltInFunctionsFactory) getEFactoryInstance();
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
		builtInFunctionCallEClass = createEClass(BUILT_IN_FUNCTION_CALL);

		containsEClass = createEClass(CONTAINS);
		createEReference(containsEClass, CONTAINS__SEARCH);
		createEReference(containsEClass, CONTAINS__ITEM);

		startsWithEClass = createEClass(STARTS_WITH);
		createEReference(startsWithEClass, STARTS_WITH__SEARCH_STRING);
		createEReference(startsWithEClass, STARTS_WITH__SEARCH_VALUE);

		endsWithEClass = createEClass(ENDS_WITH);
		createEReference(endsWithEClass, ENDS_WITH__SEARCH_STRING);
		createEReference(endsWithEClass, ENDS_WITH__SEARCH_VALUE);

		formatEClass = createEClass(FORMAT);
		createEReference(formatEClass, FORMAT__STRING);
		createEReference(formatEClass, FORMAT__REPLACE_VALUES);

		joinEClass = createEClass(JOIN);
		createEReference(joinEClass, JOIN__ARRAY);
		createEReference(joinEClass, JOIN__SEP);

		toJSONEClass = createEClass(TO_JSON);
		createEReference(toJSONEClass, TO_JSON__VALUE);

		fromJSONEClass = createEClass(FROM_JSON);
		createEReference(fromJSONEClass, FROM_JSON__VALUE);

		hashFilesEClass = createEClass(HASH_FILES);
		createEReference(hashFilesEClass, HASH_FILES__PATH);
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
		StatusCheckFunctionsPackage theStatusCheckFunctionsPackage = (StatusCheckFunctionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(StatusCheckFunctionsPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStatusCheckFunctionsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		builtInFunctionCallEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		containsEClass.getESuperTypes().add(this.getBuiltInFunctionCall());
		startsWithEClass.getESuperTypes().add(this.getBuiltInFunctionCall());
		endsWithEClass.getESuperTypes().add(this.getBuiltInFunctionCall());
		formatEClass.getESuperTypes().add(this.getBuiltInFunctionCall());
		joinEClass.getESuperTypes().add(this.getBuiltInFunctionCall());
		toJSONEClass.getESuperTypes().add(this.getBuiltInFunctionCall());
		fromJSONEClass.getESuperTypes().add(this.getBuiltInFunctionCall());
		hashFilesEClass.getESuperTypes().add(this.getBuiltInFunctionCall());

		// Initialize classes, features, and operations; add parameters
		initEClass(builtInFunctionCallEClass, BuiltInFunctionCall.class, "BuiltInFunctionCall", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containsEClass, Contains.class, "Contains", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContains_Search(), theExpressionsPackage.getExpression(), null, "search", null, 1, 1,
				Contains.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContains_Item(), theExpressionsPackage.getExpression(), null, "item", null, 1, 1,
				Contains.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startsWithEClass, StartsWith.class, "StartsWith", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartsWith_SearchString(), theExpressionsPackage.getExpression(), null, "searchString", null,
				1, 1, StartsWith.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStartsWith_SearchValue(), theExpressionsPackage.getExpression(), null, "searchValue", null, 1,
				1, StartsWith.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endsWithEClass, EndsWith.class, "EndsWith", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndsWith_SearchString(), theExpressionsPackage.getExpression(), null, "searchString", null, 1,
				1, EndsWith.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndsWith_SearchValue(), theExpressionsPackage.getExpression(), null, "searchValue", null, 1,
				1, EndsWith.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formatEClass, Format.class, "Format", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormat_String(), theExpressionsPackage.getExpression(), null, "string", null, 1, 1,
				Format.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormat_ReplaceValues(), theExpressionsPackage.getExpression(), null, "replaceValues", null, 0,
				-1, Format.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoin_Array(), theExpressionsPackage.getExpression(), null, "array", null, 1, 1, Join.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoin_Sep(), theExpressionsPackage.getExpression(), null, "sep", null, 0, 1, Join.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toJSONEClass, ToJSON.class, "ToJSON", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToJSON_Value(), theExpressionsPackage.getExpression(), null, "value", null, 1, 1,
				ToJSON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fromJSONEClass, FromJSON.class, "FromJSON", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFromJSON_Value(), theExpressionsPackage.getExpression(), null, "value", null, 1, 1,
				FromJSON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hashFilesEClass, HashFiles.class, "HashFiles", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHashFiles_Path(), theExpressionsPackage.getExpression(), null, "path", null, 1, 1,
				HashFiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //BuiltInFunctionsPackageImpl
