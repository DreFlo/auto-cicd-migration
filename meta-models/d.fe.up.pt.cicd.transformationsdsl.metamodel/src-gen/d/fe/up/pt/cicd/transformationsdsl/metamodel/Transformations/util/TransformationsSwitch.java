/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.util;

import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.*;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage
 * @generated
 */
public class TransformationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TransformationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationsSwitch() {
		if (modelPackage == null) {
			modelPackage = TransformationsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case TransformationsPackage.STRING_TO_STRING_MAP_ENTRY: {
			@SuppressWarnings("unchecked")
			Map.Entry<String, String> stringToStringMapEntry = (Map.Entry<String, String>) theEObject;
			T result = caseStringToStringMapEntry(stringToStringMapEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TransformationsPackage.TRANSFORMATION_SET: {
			TransformationSet transformationSet = (TransformationSet) theEObject;
			T result = caseTransformationSet(transformationSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TransformationsPackage.TRANSFORMATION: {
			Transformation transformation = (Transformation) theEObject;
			T result = caseTransformation(transformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TransformationsPackage.CHANGE_PLUGIN: {
			ChangePlugin changePlugin = (ChangePlugin) theEObject;
			T result = caseChangePlugin(changePlugin);
			if (result == null)
				result = caseRefiningTransformation(changePlugin);
			if (result == null)
				result = caseTransformation(changePlugin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TransformationsPackage.ATL_REFINING_SCRIPT: {
			ATLRefiningScript atlRefiningScript = (ATLRefiningScript) theEObject;
			T result = caseATLRefiningScript(atlRefiningScript);
			if (result == null)
				result = caseRefiningTransformation(atlRefiningScript);
			if (result == null)
				result = caseTransformation(atlRefiningScript);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TransformationsPackage.CHANGE_AGENT_LABEL: {
			ChangeAgentLabel changeAgentLabel = (ChangeAgentLabel) theEObject;
			T result = caseChangeAgentLabel(changeAgentLabel);
			if (result == null)
				result = caseRefiningTransformation(changeAgentLabel);
			if (result == null)
				result = caseTransformation(changeAgentLabel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TransformationsPackage.REFINING_TRANSFORMATION: {
			RefiningTransformation refiningTransformation = (RefiningTransformation) theEObject;
			T result = caseRefiningTransformation(refiningTransformation);
			if (result == null)
				result = caseTransformation(refiningTransformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TransformationsPackage.OUTPLACE_TRANSFORMATION: {
			OutplaceTransformation outplaceTransformation = (OutplaceTransformation) theEObject;
			T result = caseOutplaceTransformation(outplaceTransformation);
			if (result == null)
				result = caseTransformation(outplaceTransformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TransformationsPackage.REPLACE_AGENT_LABELS: {
			ReplaceAgentLabels replaceAgentLabels = (ReplaceAgentLabels) theEObject;
			T result = caseReplaceAgentLabels(replaceAgentLabels);
			if (result == null)
				result = caseOutplaceTransformation(replaceAgentLabels);
			if (result == null)
				result = caseTransformation(replaceAgentLabels);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To String Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To String Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToStringMapEntry(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationSet(TransformationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Plugin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangePlugin(ChangePlugin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATL Refining Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATL Refining Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATLRefiningScript(ATLRefiningScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Agent Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Agent Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeAgentLabel(ChangeAgentLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refining Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refining Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefiningTransformation(RefiningTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outplace Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outplace Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutplaceTransformation(OutplaceTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Agent Labels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Agent Labels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceAgentLabels(ReplaceAgentLabels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TransformationsSwitch
