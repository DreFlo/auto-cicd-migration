/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.util;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.*;

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
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage
 * @generated
 */
public class JenkinsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JenkinsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JenkinsSwitch() {
		if (modelPackage == null) {
			modelPackage = JenkinsPackage.eINSTANCE;
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
		case JenkinsPackage.PIPELINE: {
			Pipeline pipeline = (Pipeline) theEObject;
			T result = casePipeline(pipeline);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.ABSTRACT_PIPELINE_EXECUTION_BLOCK: {
			AbstractPipelineExecutionBlock abstractPipelineExecutionBlock = (AbstractPipelineExecutionBlock) theEObject;
			T result = caseAbstractPipelineExecutionBlock(abstractPipelineExecutionBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.ABSTRACT_STAGE: {
			AbstractStage abstractStage = (AbstractStage) theEObject;
			T result = caseAbstractStage(abstractStage);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(abstractStage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.PARALLEL: {
			Parallel parallel = (Parallel) theEObject;
			T result = caseParallel(parallel);
			if (result == null)
				result = caseAbstractStage(parallel);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(parallel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.STAGE: {
			Stage stage = (Stage) theEObject;
			T result = caseStage(stage);
			if (result == null)
				result = caseAbstractStage(stage);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(stage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.ABSTRACT_STEP: {
			AbstractStep abstractStep = (AbstractStep) theEObject;
			T result = caseAbstractStep(abstractStep);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(abstractStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.STEP: {
			Step step = (Step) theEObject;
			T result = caseStep(step);
			if (result == null)
				result = caseAbstractStep(step);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(step);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.CONDITIONAL_STEP: {
			ConditionalStep conditionalStep = (ConditionalStep) theEObject;
			T result = caseConditionalStep(conditionalStep);
			if (result == null)
				result = caseAbstractStep(conditionalStep);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(conditionalStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.ABSTRACT_AGENT: {
			AbstractAgent abstractAgent = (AbstractAgent) theEObject;
			T result = caseAbstractAgent(abstractAgent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.NONE_AGENT: {
			NoneAgent noneAgent = (NoneAgent) theEObject;
			T result = caseNoneAgent(noneAgent);
			if (result == null)
				result = caseAbstractAgent(noneAgent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.ANY_AGENT: {
			AnyAgent anyAgent = (AnyAgent) theEObject;
			T result = caseAnyAgent(anyAgent);
			if (result == null)
				result = caseAbstractAgent(anyAgent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.OPTIONED_AGENT: {
			OptionedAgent optionedAgent = (OptionedAgent) theEObject;
			T result = caseOptionedAgent(optionedAgent);
			if (result == null)
				result = caseAbstractAgent(optionedAgent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.DOCKER_CONTAINER: {
			DockerContainer dockerContainer = (DockerContainer) theEObject;
			T result = caseDockerContainer(dockerContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipeline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipeline(Pipeline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Pipeline Execution Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Pipeline Execution Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPipelineExecutionBlock(AbstractPipelineExecutionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractStage(AbstractStage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallel(Parallel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStage(Stage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractStep(AbstractStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalStep(ConditionalStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAgent(AbstractAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>None Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>None Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoneAgent(NoneAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyAgent(AnyAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optioned Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optioned Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionedAgent(OptionedAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docker Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docker Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerContainer(DockerContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
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

} //JenkinsSwitch
