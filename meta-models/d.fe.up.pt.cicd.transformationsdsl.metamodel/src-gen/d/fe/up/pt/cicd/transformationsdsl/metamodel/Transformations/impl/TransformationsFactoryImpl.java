/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl;

import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class TransformationsFactoryImpl extends EFactoryImpl implements TransformationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransformationsFactory init() {
		try {
			TransformationsFactory theTransformationsFactory = (TransformationsFactory) EPackage.Registry.INSTANCE
					.getEFactory(TransformationsPackage.eNS_URI);
			if (theTransformationsFactory != null) {
				return theTransformationsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TransformationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationsFactoryImpl() {
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
		case TransformationsPackage.STRING_TO_STRING_MAP_ENTRY:
			return (EObject) createStringToStringMapEntry();
		case TransformationsPackage.TRANSFORMATION_SET:
			return createTransformationSet();
		case TransformationsPackage.CHANGE_PLUGIN:
			return createChangePlugin();
		case TransformationsPackage.ATL_REFINING_SCRIPT:
			return createATLRefiningScript();
		case TransformationsPackage.CHANGE_AGENT_LABEL:
			return createChangeAgentLabel();
		case TransformationsPackage.OUTPLACE_TRANSFORMATION:
			return createOutplaceTransformation();
		case TransformationsPackage.REPLACE_AGENT_LABELS:
			return createReplaceAgentLabels();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case TransformationsPackage.MODEL_NAMES:
			return createMODEL_NAMESFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case TransformationsPackage.MODEL_NAMES:
			return convertMODEL_NAMESToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createStringToStringMapEntry() {
		StringToStringMapEntryImpl stringToStringMapEntry = new StringToStringMapEntryImpl();
		return stringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationSet createTransformationSet() {
		TransformationSetImpl transformationSet = new TransformationSetImpl();
		return transformationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangePlugin createChangePlugin() {
		ChangePluginImpl changePlugin = new ChangePluginImpl();
		return changePlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATLRefiningScript createATLRefiningScript() {
		ATLRefiningScriptImpl atlRefiningScript = new ATLRefiningScriptImpl();
		return atlRefiningScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeAgentLabel createChangeAgentLabel() {
		ChangeAgentLabelImpl changeAgentLabel = new ChangeAgentLabelImpl();
		return changeAgentLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutplaceTransformation createOutplaceTransformation() {
		OutplaceTransformationImpl outplaceTransformation = new OutplaceTransformationImpl();
		return outplaceTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReplaceAgentLabels createReplaceAgentLabels() {
		ReplaceAgentLabelsImpl replaceAgentLabels = new ReplaceAgentLabelsImpl();
		return replaceAgentLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MODEL_NAMES createMODEL_NAMESFromString(EDataType eDataType, String initialValue) {
		MODEL_NAMES result = MODEL_NAMES.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMODEL_NAMESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationsPackage getTransformationsPackage() {
		return (TransformationsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TransformationsPackage getPackage() {
		return TransformationsPackage.eINSTANCE;
	}

} //TransformationsFactoryImpl
