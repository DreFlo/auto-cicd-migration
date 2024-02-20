/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Steps.impl;

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

import d.fe.up.pt.cicd.metamodel.CICD.Options.OptionsPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Options.impl.OptionsPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Parameters.ParametersPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Parameters.impl.ParametersPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.Steps.Artifact;
import d.fe.up.pt.cicd.metamodel.CICD.Steps.Cache;
import d.fe.up.pt.cicd.metamodel.CICD.Steps.Command;
import d.fe.up.pt.cicd.metamodel.CICD.Steps.ConditionalStep;
import d.fe.up.pt.cicd.metamodel.CICD.Steps.NonConditionalStep;
import d.fe.up.pt.cicd.metamodel.CICD.Steps.Plugin;
import d.fe.up.pt.cicd.metamodel.CICD.Steps.Step;
import d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsFactory;
import d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Triggers.TriggersPackage;

import d.fe.up.pt.cicd.metamodel.CICD.Triggers.impl.TriggersPackageImpl;

import d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class StepsPackageImpl extends EPackageImpl implements StepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonConditionalStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

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
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StepsPackageImpl() {
		super(eNS_URI, StepsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StepsPackage init() {
		if (isInited)
			return (StepsPackage) EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStepsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StepsPackageImpl theStepsPackage = registeredStepsPackage instanceof StepsPackageImpl
				? (StepsPackageImpl) registeredStepsPackage
				: new StepsPackageImpl();

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
		theStepsPackage.createPackageContents();
		theCICDPackage.createPackageContents();
		theTriggersPackage.createPackageContents();
		theOptionsPackage.createPackageContents();
		theMatricesPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theBuiltInFunctionsPackage.createPackageContents();
		theBinaryOperationsPackage.createPackageContents();
		theUnaryOperationsPackage.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		theCICDPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();
		theOptionsPackage.initializePackageContents();
		theMatricesPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theBuiltInFunctionsPackage.initializePackageContents();
		theBinaryOperationsPackage.initializePackageContents();
		theUnaryOperationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStepsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StepsPackage.eNS_URI, theStepsPackage);
		return theStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalStep() {
		return conditionalStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalStep_If() {
		return (EReference) conditionalStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalStep_Then() {
		return (EReference) conditionalStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalStep_Else() {
		return (EReference) conditionalStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNonConditionalStep() {
		return nonConditionalStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonConditionalStep_Id() {
		return (EAttribute) nonConditionalStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonConditionalStep_Name() {
		return (EAttribute) nonConditionalStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNonConditionalStep_EnvironmentVariables() {
		return (EReference) nonConditionalStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonConditionalStep_TimeoutMinutes() {
		return (EAttribute) nonConditionalStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonConditionalStep_AllowFailure() {
		return (EAttribute) nonConditionalStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommand_Program() {
		return (EAttribute) commandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommand_Args() {
		return (EAttribute) commandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlugin() {
		return pluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlugin_PluginName() {
		return (EAttribute) pluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlugin_Version() {
		return (EAttribute) pluginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlugin_Kwargs() {
		return (EReference) pluginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCache() {
		return cacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCache_CacheName() {
		return (EReference) cacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCache_Keys() {
		return (EReference) cacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCache_Paths() {
		return (EReference) cacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_ArtifactName() {
		return (EReference) artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_IncludePaths() {
		return (EReference) artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_ExcludePaths() {
		return (EReference) artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_RetentionTime() {
		return (EReference) artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepsFactory getStepsFactory() {
		return (StepsFactory) getEFactoryInstance();
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
		stepEClass = createEClass(STEP);

		conditionalStepEClass = createEClass(CONDITIONAL_STEP);
		createEReference(conditionalStepEClass, CONDITIONAL_STEP__IF);
		createEReference(conditionalStepEClass, CONDITIONAL_STEP__THEN);
		createEReference(conditionalStepEClass, CONDITIONAL_STEP__ELSE);

		nonConditionalStepEClass = createEClass(NON_CONDITIONAL_STEP);
		createEAttribute(nonConditionalStepEClass, NON_CONDITIONAL_STEP__ID);
		createEAttribute(nonConditionalStepEClass, NON_CONDITIONAL_STEP__NAME);
		createEReference(nonConditionalStepEClass, NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES);
		createEAttribute(nonConditionalStepEClass, NON_CONDITIONAL_STEP__TIMEOUT_MINUTES);
		createEAttribute(nonConditionalStepEClass, NON_CONDITIONAL_STEP__ALLOW_FAILURE);

		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__PROGRAM);
		createEAttribute(commandEClass, COMMAND__ARGS);

		pluginEClass = createEClass(PLUGIN);
		createEAttribute(pluginEClass, PLUGIN__PLUGIN_NAME);
		createEAttribute(pluginEClass, PLUGIN__VERSION);
		createEReference(pluginEClass, PLUGIN__KWARGS);

		cacheEClass = createEClass(CACHE);
		createEReference(cacheEClass, CACHE__CACHE_NAME);
		createEReference(cacheEClass, CACHE__KEYS);
		createEReference(cacheEClass, CACHE__PATHS);

		artifactEClass = createEClass(ARTIFACT);
		createEReference(artifactEClass, ARTIFACT__ARTIFACT_NAME);
		createEReference(artifactEClass, ARTIFACT__INCLUDE_PATHS);
		createEReference(artifactEClass, ARTIFACT__EXCLUDE_PATHS);
		createEReference(artifactEClass, ARTIFACT__RETENTION_TIME);
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
		conditionalStepEClass.getESuperTypes().add(this.getStep());
		nonConditionalStepEClass.getESuperTypes().add(this.getStep());
		commandEClass.getESuperTypes().add(this.getNonConditionalStep());
		pluginEClass.getESuperTypes().add(this.getNonConditionalStep());
		cacheEClass.getESuperTypes().add(this.getNonConditionalStep());
		artifactEClass.getESuperTypes().add(this.getNonConditionalStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalStepEClass, ConditionalStep.class, "ConditionalStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalStep_If(), theExpressionsPackage.getExpression(), null, "if", null, 1, 1,
				ConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalStep_Then(), this.getStep(), null, "then", null, 1, -1, ConditionalStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalStep_Else(), this.getStep(), null, "else", null, 0, -1, ConditionalStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonConditionalStepEClass, NonConditionalStep.class, "NonConditionalStep", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonConditionalStep_Id(), ecorePackage.getEString(), "id", null, 0, 1,
				NonConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonConditionalStep_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				NonConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getNonConditionalStep_EnvironmentVariables(), theExpressionsPackage.getAssignment(), null,
				"environmentVariables", null, 0, -1, NonConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonConditionalStep_TimeoutMinutes(), ecorePackage.getEIntegerObject(), "timeoutMinutes", null,
				0, 1, NonConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonConditionalStep_AllowFailure(), ecorePackage.getEBoolean(), "allowFailure", "false", 1, 1,
				NonConditionalStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_Program(), ecorePackage.getEString(), "program", null, 1, 1, Command.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_Args(), ecorePackage.getEString(), "args", null, 0, 1, Command.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginEClass, Plugin.class, "Plugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlugin_PluginName(), ecorePackage.getEString(), "pluginName", null, 1, 1, Plugin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlugin_Version(), ecorePackage.getEString(), "version", null, 1, 1, Plugin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlugin_Kwargs(), theExpressionsPackage.getAssignment(), null, "kwargs", null, 0, -1,
				Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheEClass, Cache.class, "Cache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCache_CacheName(), theExpressionsPackage.getExpression(), null, "cacheName", null, 1, 1,
				Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCache_Keys(), theExpressionsPackage.getExpression(), null, "keys", null, 1, -1, Cache.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCache_Paths(), theExpressionsPackage.getExpression(), null, "paths", null, 1, -1, Cache.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifact_ArtifactName(), theExpressionsPackage.getExpression(), null, "artifactName", null, 1,
				1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_IncludePaths(), theExpressionsPackage.getExpression(), null, "includePaths", null, 1,
				-1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_ExcludePaths(), theExpressionsPackage.getExpression(), null, "excludePaths", null, 1,
				-1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_RetentionTime(), theExpressionsPackage.getExpression(), null, "retentionTime", null,
				0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StepsPackageImpl
