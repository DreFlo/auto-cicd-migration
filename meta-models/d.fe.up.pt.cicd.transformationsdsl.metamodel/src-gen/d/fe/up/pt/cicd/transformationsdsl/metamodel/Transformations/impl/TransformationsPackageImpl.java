/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl;

import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLRefiningScript;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangeAgentLabel;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePlugin;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.OutplaceTransformation;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.RefiningTransformation;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceAgentLabels;
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
	private EClass changePluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atlRefiningScriptEClass = null;

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
	private EClass refiningTransformationEClass = null;

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
	private EClass replaceAgentLabelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeL_NAMESEEnum = null;

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
	public EReference getTransformationSet_Transformations() {
		return (EReference) transformationSetEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getTransformation_Model() {
		return (EAttribute) transformationEClass.getEStructuralFeatures().get(0);
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
	public EClass getATLRefiningScript() {
		return atlRefiningScriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getATLRefiningScript_Script() {
		return (EAttribute) atlRefiningScriptEClass.getEStructuralFeatures().get(0);
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
	public EClass getRefiningTransformation() {
		return refiningTransformationEClass;
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
	public EClass getReplaceAgentLabels() {
		return replaceAgentLabelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReplaceAgentLabels_Condition() {
		return (EAttribute) replaceAgentLabelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReplaceAgentLabels_Labels() {
		return (EAttribute) replaceAgentLabelsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMODEL_NAMES() {
		return modeL_NAMESEEnum;
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
		createEReference(transformationSetEClass, TRANSFORMATION_SET__TRANSFORMATIONS);

		transformationEClass = createEClass(TRANSFORMATION);
		createEAttribute(transformationEClass, TRANSFORMATION__MODEL);

		changePluginEClass = createEClass(CHANGE_PLUGIN);
		createEReference(changePluginEClass, CHANGE_PLUGIN__NAME);
		createEAttribute(changePluginEClass, CHANGE_PLUGIN__VERSION);
		createEReference(changePluginEClass, CHANGE_PLUGIN__ARGS);

		atlRefiningScriptEClass = createEClass(ATL_REFINING_SCRIPT);
		createEAttribute(atlRefiningScriptEClass, ATL_REFINING_SCRIPT__SCRIPT);

		changeAgentLabelEClass = createEClass(CHANGE_AGENT_LABEL);
		createEReference(changeAgentLabelEClass, CHANGE_AGENT_LABEL__NAME);

		refiningTransformationEClass = createEClass(REFINING_TRANSFORMATION);

		outplaceTransformationEClass = createEClass(OUTPLACE_TRANSFORMATION);

		replaceAgentLabelsEClass = createEClass(REPLACE_AGENT_LABELS);
		createEAttribute(replaceAgentLabelsEClass, REPLACE_AGENT_LABELS__CONDITION);
		createEAttribute(replaceAgentLabelsEClass, REPLACE_AGENT_LABELS__LABELS);

		// Create enums
		modeL_NAMESEEnum = createEEnum(MODEL_NAMES);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		changePluginEClass.getESuperTypes().add(this.getRefiningTransformation());
		atlRefiningScriptEClass.getESuperTypes().add(this.getRefiningTransformation());
		changeAgentLabelEClass.getESuperTypes().add(this.getRefiningTransformation());
		refiningTransformationEClass.getESuperTypes().add(this.getTransformation());
		outplaceTransformationEClass.getESuperTypes().add(this.getTransformation());
		replaceAgentLabelsEClass.getESuperTypes().add(this.getOutplaceTransformation());

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
		initEReference(getTransformationSet_Transformations(), this.getTransformation(), null, "transformations", null,
				0, -1, TransformationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_Model(), this.getMODEL_NAMES(), "model", null, 1, 1, Transformation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(atlRefiningScriptEClass, ATLRefiningScript.class, "ATLRefiningScript", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATLRefiningScript_Script(), ecorePackage.getEString(), "script", null, 1, 1,
				ATLRefiningScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(changeAgentLabelEClass, ChangeAgentLabel.class, "ChangeAgentLabel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeAgentLabel_Name(), this.getStringToStringMapEntry(), null, "name", null, 1, 1,
				ChangeAgentLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refiningTransformationEClass, RefiningTransformation.class, "RefiningTransformation", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outplaceTransformationEClass, OutplaceTransformation.class, "OutplaceTransformation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(replaceAgentLabelsEClass, ReplaceAgentLabels.class, "ReplaceAgentLabels", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReplaceAgentLabels_Condition(), ecorePackage.getEString(), "condition", null, 1, 1,
				ReplaceAgentLabels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getReplaceAgentLabels_Labels(), ecorePackage.getEString(), "labels", null, 0, -1,
				ReplaceAgentLabels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modeL_NAMESEEnum, d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODEL_NAMES.class,
				"MODEL_NAMES");
		addEEnumLiteral(modeL_NAMESEEnum,
				d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODEL_NAMES.CICD);
		addEEnumLiteral(modeL_NAMESEEnum, d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODEL_NAMES.GHA);
		addEEnumLiteral(modeL_NAMESEEnum,
				d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODEL_NAMES.CIRCLE_CI);

		// Create resource
		createResource(eNS_URI);
	}

} //TransformationsPackageImpl
