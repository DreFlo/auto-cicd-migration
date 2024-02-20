/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Options.impl;

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

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.VariablesPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.impl.VariablesPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.impl.ValuesPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.impl.ExpressionsPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Matrices.MatricesPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Matrices.impl.MatricesPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Options.ConcurrencyGroup;
import d.fe.up.pt.cicd.metamodel.CICD.Options.OptionsFactory;
import d.fe.up.pt.cicd.metamodel.CICD.Options.OptionsPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Options.PermissionType;
import d.fe.up.pt.cicd.metamodel.CICD.Options.ShellType;

import d.fe.up.pt.cicd.metamodel.CICD.Parameters.ParametersPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Parameters.impl.ParametersPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Steps.impl.StepsPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Triggers.TriggersPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggersPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptionsPackageImpl extends EPackageImpl implements OptionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum permissionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shellTypeEEnum = null;

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
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Options.OptionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OptionsPackageImpl() {
		super(eNS_URI, OptionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OptionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OptionsPackage init() {
		if (isInited)
			return (OptionsPackage) EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOptionsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OptionsPackageImpl theOptionsPackage = registeredOptionsPackage instanceof OptionsPackageImpl
				? (OptionsPackageImpl) registeredOptionsPackage
				: new OptionsPackageImpl();

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
		theOptionsPackage.createPackageContents();
		theCICDPackage.createPackageContents();
		theTriggersPackage.createPackageContents();
		theMatricesPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theBuiltInFunctionsPackage.createPackageContents();
		theBinaryOperationsPackage.createPackageContents();
		theUnaryOperationsPackage.createPackageContents();

		// Initialize created meta-data
		theOptionsPackage.initializePackageContents();
		theCICDPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();
		theMatricesPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theBuiltInFunctionsPackage.initializePackageContents();
		theBinaryOperationsPackage.initializePackageContents();
		theUnaryOperationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOptionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OptionsPackage.eNS_URI, theOptionsPackage);
		return theOptionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyGroup() {
		return concurrencyGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcurrencyGroup_GroupId() {
		return (EReference) concurrencyGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcurrencyGroup_CancelInProgress() {
		return (EAttribute) concurrencyGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermission() {
		return permissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermission_Key() {
		return (EAttribute) permissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermission_Value() {
		return (EAttribute) permissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPermissionType() {
		return permissionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getShellType() {
		return shellTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionsFactory getOptionsFactory() {
		return (OptionsFactory) getEFactoryInstance();
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
		concurrencyGroupEClass = createEClass(CONCURRENCY_GROUP);
		createEReference(concurrencyGroupEClass, CONCURRENCY_GROUP__GROUP_ID);
		createEAttribute(concurrencyGroupEClass, CONCURRENCY_GROUP__CANCEL_IN_PROGRESS);

		permissionEClass = createEClass(PERMISSION);
		createEAttribute(permissionEClass, PERMISSION__KEY);
		createEAttribute(permissionEClass, PERMISSION__VALUE);

		// Create enums
		permissionTypeEEnum = createEEnum(PERMISSION_TYPE);
		shellTypeEEnum = createEEnum(SHELL_TYPE);
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
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(concurrencyGroupEClass, ConcurrencyGroup.class, "ConcurrencyGroup", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcurrencyGroup_GroupId(), theExpressionsPackage.getExpression(), null, "groupId", null, 1,
				1, ConcurrencyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcurrencyGroup_CancelInProgress(), ecorePackage.getEBooleanObject(), "cancelInProgress",
				null, 1, 1, ConcurrencyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permissionEClass, Map.Entry.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPermission_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_Value(), this.getPermissionType(), "value", null, 1, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(permissionTypeEEnum, PermissionType.class, "PermissionType");
		addEEnumLiteral(permissionTypeEEnum, PermissionType.READ);
		addEEnumLiteral(permissionTypeEEnum, PermissionType.WRITE);
		addEEnumLiteral(permissionTypeEEnum, PermissionType.NONE);

		initEEnum(shellTypeEEnum, ShellType.class, "ShellType");
		addEEnumLiteral(shellTypeEEnum, ShellType.BASH);
	}

} //OptionsPackageImpl
