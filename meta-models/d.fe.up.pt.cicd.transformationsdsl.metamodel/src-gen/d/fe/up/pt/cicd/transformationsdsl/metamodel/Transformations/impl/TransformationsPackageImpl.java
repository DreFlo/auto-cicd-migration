/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;

import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLScript;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddExecutor;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddOrbReferenceExecutor;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddTrigger;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangeAgentLabel;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePlugin;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.CircleCITransformation;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ConditionalTransformation;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.GHATransformation;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.InplaceTransformation;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.OutplaceTransformation;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceAgentLabels;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SetCircleCIVersion;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TIMTransformation;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TSMTransformation;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.Transformation;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsFactory;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage;

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
public class TransformationsPackageImpl extends EPackageImpl implements TransformationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsmTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inplaceTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outplaceTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atlScriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changePluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeAgentLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replaceAgentLabelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ghaTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circleCITransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addExecutorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addOrbReferenceExecutorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setCircleCIVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelsEEnum = null;

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
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TransformationsPackageImpl() {
		super(eNS_URI, TransformationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TransformationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TransformationsPackage init() {
		if (isInited)
			return (TransformationsPackage) EPackage.Registry.INSTANCE.getEPackage(TransformationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTransformationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TransformationsPackageImpl theTransformationsPackage = registeredTransformationsPackage instanceof TransformationsPackageImpl
				? (TransformationsPackageImpl) registeredTransformationsPackage
				: new TransformationsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CICDPackage.eINSTANCE.eClass();
		CircleCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTransformationsPackage.createPackageContents();

		// Initialize created meta-data
		theTransformationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTransformationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TransformationsPackage.eNS_URI, theTransformationsPackage);
		return theTransformationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringToStringMapEntry() {
		return stringToStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToStringMapEntry_Key() {
		return (EAttribute) stringToStringMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToStringMapEntry_Value() {
		return (EAttribute) stringToStringMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransformationSet() {
		return transformationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransformationSet_PreTIM() {
		return (EReference) transformationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransformationSet_OnTIM() {
		return (EReference) transformationSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransformationSet_PostTIM() {
		return (EReference) transformationSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTIMTransformation() {
		return timTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSMTransformation() {
		return tsmTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInplaceTransformation() {
		return inplaceTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutplaceTransformation() {
		return outplaceTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalTransformation() {
		return conditionalTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConditionalTransformation_Condition() {
		return (EAttribute) conditionalTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getATLScript() {
		return atlScriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getATLScript_Script() {
		return (EAttribute) atlScriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getATLScript_Model() {
		return (EAttribute) atlScriptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangePlugin() {
		return changePluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChangePlugin_Name() {
		return (EReference) changePluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangePlugin_Version() {
		return (EAttribute) changePluginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChangePlugin_Args() {
		return (EReference) changePluginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeAgentLabel() {
		return changeAgentLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChangeAgentLabel_Name() {
		return (EReference) changeAgentLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReplaceAgentLabels() {
		return replaceAgentLabelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReplaceAgentLabels_Labels() {
		return (EAttribute) replaceAgentLabelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddTrigger() {
		return addTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddTrigger_Trigger() {
		return (EReference) addTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGHATransformation() {
		return ghaTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCircleCITransformation() {
		return circleCITransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddExecutor() {
		return addExecutorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddExecutor_JobName() {
		return (EAttribute) addExecutorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddOrbReferenceExecutor() {
		return addOrbReferenceExecutorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddOrbReferenceExecutor_Orb() {
		return (EAttribute) addOrbReferenceExecutorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddOrbReferenceExecutor_Executor() {
		return (EAttribute) addOrbReferenceExecutorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetCircleCIVersion() {
		return setCircleCIVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetCircleCIVersion_Version() {
		return (EAttribute) setCircleCIVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMODELS() {
		return modelsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationsFactory getTransformationsFactory() {
		return (TransformationsFactory) getEFactoryInstance();
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
		stringToStringMapEntryEClass = createEClass(STRING_TO_STRING_MAP_ENTRY);
		createEAttribute(stringToStringMapEntryEClass, STRING_TO_STRING_MAP_ENTRY__KEY);
		createEAttribute(stringToStringMapEntryEClass, STRING_TO_STRING_MAP_ENTRY__VALUE);

		transformationSetEClass = createEClass(TRANSFORMATION_SET);
		createEReference(transformationSetEClass, TRANSFORMATION_SET__PRE_TIM);
		createEReference(transformationSetEClass, TRANSFORMATION_SET__ON_TIM);
		createEReference(transformationSetEClass, TRANSFORMATION_SET__POST_TIM);

		transformationEClass = createEClass(TRANSFORMATION);

		timTransformationEClass = createEClass(TIM_TRANSFORMATION);

		tsmTransformationEClass = createEClass(TSM_TRANSFORMATION);

		inplaceTransformationEClass = createEClass(INPLACE_TRANSFORMATION);

		outplaceTransformationEClass = createEClass(OUTPLACE_TRANSFORMATION);

		conditionalTransformationEClass = createEClass(CONDITIONAL_TRANSFORMATION);
		createEAttribute(conditionalTransformationEClass, CONDITIONAL_TRANSFORMATION__CONDITION);

		atlScriptEClass = createEClass(ATL_SCRIPT);
		createEAttribute(atlScriptEClass, ATL_SCRIPT__SCRIPT);
		createEAttribute(atlScriptEClass, ATL_SCRIPT__MODEL);

		changePluginEClass = createEClass(CHANGE_PLUGIN);
		createEReference(changePluginEClass, CHANGE_PLUGIN__NAME);
		createEAttribute(changePluginEClass, CHANGE_PLUGIN__VERSION);
		createEReference(changePluginEClass, CHANGE_PLUGIN__ARGS);

		changeAgentLabelEClass = createEClass(CHANGE_AGENT_LABEL);
		createEReference(changeAgentLabelEClass, CHANGE_AGENT_LABEL__NAME);

		replaceAgentLabelsEClass = createEClass(REPLACE_AGENT_LABELS);
		createEAttribute(replaceAgentLabelsEClass, REPLACE_AGENT_LABELS__LABELS);

		addTriggerEClass = createEClass(ADD_TRIGGER);
		createEReference(addTriggerEClass, ADD_TRIGGER__TRIGGER);

		ghaTransformationEClass = createEClass(GHA_TRANSFORMATION);

		circleCITransformationEClass = createEClass(CIRCLE_CI_TRANSFORMATION);

		addExecutorEClass = createEClass(ADD_EXECUTOR);
		createEAttribute(addExecutorEClass, ADD_EXECUTOR__JOB_NAME);

		addOrbReferenceExecutorEClass = createEClass(ADD_ORB_REFERENCE_EXECUTOR);
		createEAttribute(addOrbReferenceExecutorEClass, ADD_ORB_REFERENCE_EXECUTOR__ORB);
		createEAttribute(addOrbReferenceExecutorEClass, ADD_ORB_REFERENCE_EXECUTOR__EXECUTOR);

		setCircleCIVersionEClass = createEClass(SET_CIRCLE_CI_VERSION);
		createEAttribute(setCircleCIVersionEClass, SET_CIRCLE_CI_VERSION__VERSION);

		// Create enums
		modelsEEnum = createEEnum(MODELS);
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
		CICDPackage theCICDPackage = (CICDPackage) EPackage.Registry.INSTANCE.getEPackage(CICDPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timTransformationEClass.getESuperTypes().add(this.getTransformation());
		tsmTransformationEClass.getESuperTypes().add(this.getTransformation());
		inplaceTransformationEClass.getESuperTypes().add(this.getTransformation());
		outplaceTransformationEClass.getESuperTypes().add(this.getTransformation());
		conditionalTransformationEClass.getESuperTypes().add(this.getTransformation());
		atlScriptEClass.getESuperTypes().add(this.getTransformation());
		atlScriptEClass.getESuperTypes().add(this.getTSMTransformation());
		atlScriptEClass.getESuperTypes().add(this.getTIMTransformation());
		changePluginEClass.getESuperTypes().add(this.getInplaceTransformation());
		changePluginEClass.getESuperTypes().add(this.getTIMTransformation());
		changeAgentLabelEClass.getESuperTypes().add(this.getInplaceTransformation());
		changeAgentLabelEClass.getESuperTypes().add(this.getTIMTransformation());
		replaceAgentLabelsEClass.getESuperTypes().add(this.getOutplaceTransformation());
		replaceAgentLabelsEClass.getESuperTypes().add(this.getTIMTransformation());
		replaceAgentLabelsEClass.getESuperTypes().add(this.getConditionalTransformation());
		addTriggerEClass.getESuperTypes().add(this.getOutplaceTransformation());
		addTriggerEClass.getESuperTypes().add(this.getTIMTransformation());
		addTriggerEClass.getESuperTypes().add(this.getConditionalTransformation());
		ghaTransformationEClass.getESuperTypes().add(this.getTSMTransformation());
		circleCITransformationEClass.getESuperTypes().add(this.getTSMTransformation());
		addExecutorEClass.getESuperTypes().add(this.getCircleCITransformation());
		addExecutorEClass.getESuperTypes().add(this.getOutplaceTransformation());
		addOrbReferenceExecutorEClass.getESuperTypes().add(this.getAddExecutor());
		setCircleCIVersionEClass.getESuperTypes().add(this.getCircleCITransformation());
		setCircleCIVersionEClass.getESuperTypes().add(this.getInplaceTransformation());

		// Initialize classes, features, and operations; add parameters
		initEClass(stringToStringMapEntryEClass, Map.Entry.class, "StringToStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToStringMapEntry_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToStringMapEntry_Value(), ecorePackage.getEString(), "value", null, 1, 1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(transformationSetEClass, TransformationSet.class, "TransformationSet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformationSet_PreTIM(), this.getTSMTransformation(), null, "preTIM", null, 0, -1,
				TransformationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationSet_OnTIM(), this.getTransformation(), null, "onTIM", null, 0, -1,
				TransformationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationSet_PostTIM(), this.getTSMTransformation(), null, "postTIM", null, 0, -1,
				TransformationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(timTransformationEClass, TIMTransformation.class, "TIMTransformation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tsmTransformationEClass, TSMTransformation.class, "TSMTransformation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(inplaceTransformationEClass, InplaceTransformation.class, "InplaceTransformation", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outplaceTransformationEClass, OutplaceTransformation.class, "OutplaceTransformation", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalTransformationEClass, ConditionalTransformation.class, "ConditionalTransformation",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionalTransformation_Condition(), ecorePackage.getEString(), "condition", null, 0, 1,
				ConditionalTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atlScriptEClass, ATLScript.class, "ATLScript", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATLScript_Script(), ecorePackage.getEString(), "script", null, 1, 1, ATLScript.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATLScript_Model(), this.getMODELS(), "model", null, 1, 1, ATLScript.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changePluginEClass, ChangePlugin.class, "ChangePlugin", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangePlugin_Name(), this.getStringToStringMapEntry(), null, "name", null, 1, 1,
				ChangePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangePlugin_Version(), ecorePackage.getEString(), "version", null, 1, 1, ChangePlugin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangePlugin_Args(), this.getStringToStringMapEntry(), null, "args", null, 0, -1,
				ChangePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeAgentLabelEClass, ChangeAgentLabel.class, "ChangeAgentLabel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeAgentLabel_Name(), this.getStringToStringMapEntry(), null, "name", null, 1, 1,
				ChangeAgentLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replaceAgentLabelsEClass, ReplaceAgentLabels.class, "ReplaceAgentLabels", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReplaceAgentLabels_Labels(), ecorePackage.getEString(), "labels", null, 0, -1,
				ReplaceAgentLabels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(addTriggerEClass, AddTrigger.class, "AddTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddTrigger_Trigger(), theCICDPackage.getTrigger(), null, "trigger", null, 0, 1,
				AddTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ghaTransformationEClass, GHATransformation.class, "GHATransformation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(circleCITransformationEClass, CircleCITransformation.class, "CircleCITransformation", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addExecutorEClass, AddExecutor.class, "AddExecutor", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddExecutor_JobName(), ecorePackage.getEString(), "jobName", null, 1, 1, AddExecutor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addOrbReferenceExecutorEClass, AddOrbReferenceExecutor.class, "AddOrbReferenceExecutor",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddOrbReferenceExecutor_Orb(), ecorePackage.getEString(), "orb", null, 1, 1,
				AddOrbReferenceExecutor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddOrbReferenceExecutor_Executor(), ecorePackage.getEString(), "executor", null, 1, 1,
				AddOrbReferenceExecutor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setCircleCIVersionEClass, SetCircleCIVersion.class, "SetCircleCIVersion", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetCircleCIVersion_Version(), ecorePackage.getEString(), "version", null, 1, 1,
				SetCircleCIVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modelsEEnum, d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODELS.class, "MODELS");
		addEEnumLiteral(modelsEEnum, d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODELS.CICD);
		addEEnumLiteral(modelsEEnum, d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODELS.CIRCLE_CI);
		addEEnumLiteral(modelsEEnum, d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODELS.GHA);

		// Create resource
		createResource(eNS_URI);
	}

} //TransformationsPackageImpl
