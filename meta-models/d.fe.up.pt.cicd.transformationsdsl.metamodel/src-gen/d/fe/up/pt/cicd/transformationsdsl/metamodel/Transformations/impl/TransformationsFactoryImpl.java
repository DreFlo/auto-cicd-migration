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
		case TransformationsPackage.ATL_SCRIPT:
			return createATLScript();
		case TransformationsPackage.CHANGE_PLUGIN:
			return createChangePlugin();
		case TransformationsPackage.CHANGE_AGENT_LABEL:
			return createChangeAgentLabel();
		case TransformationsPackage.REPLACE_AGENT_LABELS:
			return createReplaceAgentLabels();
		case TransformationsPackage.ADD_TRIGGER:
			return createAddTrigger();
		case TransformationsPackage.REPLACE_STEP:
			return createReplaceStep();
		case TransformationsPackage.DELETE_STEP:
			return createDeleteStep();
		case TransformationsPackage.ADD_ORB_REFERENCE_EXECUTOR:
			return createAddOrbReferenceExecutor();
		case TransformationsPackage.SET_CIRCLE_CI_VERSION:
			return createSetCircleCIVersion();
		case TransformationsPackage.SELECT_WORKFLOW:
			return createSelectWorkflow();
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
		case TransformationsPackage.MODELS:
			return createMODELSFromString(eDataType, initialValue);
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
		case TransformationsPackage.MODELS:
			return convertMODELSToString(eDataType, instanceValue);
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
	public ATLScript createATLScript() {
		ATLScriptImpl atlScript = new ATLScriptImpl();
		return atlScript;
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
	public ReplaceAgentLabels createReplaceAgentLabels() {
		ReplaceAgentLabelsImpl replaceAgentLabels = new ReplaceAgentLabelsImpl();
		return replaceAgentLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddTrigger createAddTrigger() {
		AddTriggerImpl addTrigger = new AddTriggerImpl();
		return addTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReplaceStep createReplaceStep() {
		ReplaceStepImpl replaceStep = new ReplaceStepImpl();
		return replaceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeleteStep createDeleteStep() {
		DeleteStepImpl deleteStep = new DeleteStepImpl();
		return deleteStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddOrbReferenceExecutor createAddOrbReferenceExecutor() {
		AddOrbReferenceExecutorImpl addOrbReferenceExecutor = new AddOrbReferenceExecutorImpl();
		return addOrbReferenceExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetCircleCIVersion createSetCircleCIVersion() {
		SetCircleCIVersionImpl setCircleCIVersion = new SetCircleCIVersionImpl();
		return setCircleCIVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectWorkflow createSelectWorkflow() {
		SelectWorkflowImpl selectWorkflow = new SelectWorkflowImpl();
		return selectWorkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MODELS createMODELSFromString(EDataType eDataType, String initialValue) {
		MODELS result = MODELS.get(initialValue);
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
	public String convertMODELSToString(EDataType eDataType, Object instanceValue) {
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
