/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.util;

import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage
 * @generated
 */
public class TransformationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TransformationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TransformationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationsSwitch<Adapter> modelSwitch = new TransformationsSwitch<Adapter>() {
		@Override
		public Adapter caseStringToStringMapEntry(Map.Entry<String, String> object) {
			return createStringToStringMapEntryAdapter();
		}

		@Override
		public Adapter caseTransformationSet(TransformationSet object) {
			return createTransformationSetAdapter();
		}

		@Override
		public Adapter caseTransformation(Transformation object) {
			return createTransformationAdapter();
		}

		@Override
		public Adapter caseTIMTransformation(TIMTransformation object) {
			return createTIMTransformationAdapter();
		}

		@Override
		public Adapter caseTSMTransformation(TSMTransformation object) {
			return createTSMTransformationAdapter();
		}

		@Override
		public Adapter caseInplaceTransformation(InplaceTransformation object) {
			return createInplaceTransformationAdapter();
		}

		@Override
		public Adapter caseOutplaceTransformation(OutplaceTransformation object) {
			return createOutplaceTransformationAdapter();
		}

		@Override
		public Adapter caseConditionalTransformation(ConditionalTransformation object) {
			return createConditionalTransformationAdapter();
		}

		@Override
		public Adapter caseATLScript(ATLScript object) {
			return createATLScriptAdapter();
		}

		@Override
		public Adapter caseChangePlugin(ChangePlugin object) {
			return createChangePluginAdapter();
		}

		@Override
		public Adapter caseChangeAgentLabel(ChangeAgentLabel object) {
			return createChangeAgentLabelAdapter();
		}

		@Override
		public Adapter caseReplaceAgentLabels(ReplaceAgentLabels object) {
			return createReplaceAgentLabelsAdapter();
		}

		@Override
		public Adapter caseAddTrigger(AddTrigger object) {
			return createAddTriggerAdapter();
		}

		@Override
		public Adapter caseReplaceStep(ReplaceStep object) {
			return createReplaceStepAdapter();
		}

		@Override
		public Adapter caseDeleteStep(DeleteStep object) {
			return createDeleteStepAdapter();
		}

		@Override
		public Adapter caseGHATransformation(GHATransformation object) {
			return createGHATransformationAdapter();
		}

		@Override
		public Adapter caseCircleCITransformation(CircleCITransformation object) {
			return createCircleCITransformationAdapter();
		}

		@Override
		public Adapter caseAddExecutor(AddExecutor object) {
			return createAddExecutorAdapter();
		}

		@Override
		public Adapter caseAddOrbReferenceExecutor(AddOrbReferenceExecutor object) {
			return createAddOrbReferenceExecutorAdapter();
		}

		@Override
		public Adapter caseSetCircleCIVersion(SetCircleCIVersion object) {
			return createSetCircleCIVersionAdapter();
		}

		@Override
		public Adapter caseSelectWorkflow(SelectWorkflow object) {
			return createSelectWorkflowAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToStringMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet <em>Transformation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet
	 * @generated
	 */
	public Adapter createTransformationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TIMTransformation <em>TIM Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TIMTransformation
	 * @generated
	 */
	public Adapter createTIMTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TSMTransformation <em>TSM Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TSMTransformation
	 * @generated
	 */
	public Adapter createTSMTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.InplaceTransformation <em>Inplace Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.InplaceTransformation
	 * @generated
	 */
	public Adapter createInplaceTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.OutplaceTransformation <em>Outplace Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.OutplaceTransformation
	 * @generated
	 */
	public Adapter createOutplaceTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ConditionalTransformation <em>Conditional Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ConditionalTransformation
	 * @generated
	 */
	public Adapter createConditionalTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLScript <em>ATL Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLScript
	 * @generated
	 */
	public Adapter createATLScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePlugin <em>Change Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePlugin
	 * @generated
	 */
	public Adapter createChangePluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangeAgentLabel <em>Change Agent Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangeAgentLabel
	 * @generated
	 */
	public Adapter createChangeAgentLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceAgentLabels <em>Replace Agent Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceAgentLabels
	 * @generated
	 */
	public Adapter createReplaceAgentLabelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddTrigger <em>Add Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddTrigger
	 * @generated
	 */
	public Adapter createAddTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceStep <em>Replace Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceStep
	 * @generated
	 */
	public Adapter createReplaceStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.DeleteStep <em>Delete Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.DeleteStep
	 * @generated
	 */
	public Adapter createDeleteStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.GHATransformation <em>GHA Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.GHATransformation
	 * @generated
	 */
	public Adapter createGHATransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.CircleCITransformation <em>Circle CI Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.CircleCITransformation
	 * @generated
	 */
	public Adapter createCircleCITransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddExecutor <em>Add Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddExecutor
	 * @generated
	 */
	public Adapter createAddExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddOrbReferenceExecutor <em>Add Orb Reference Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddOrbReferenceExecutor
	 * @generated
	 */
	public Adapter createAddOrbReferenceExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SetCircleCIVersion <em>Set Circle CI Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SetCircleCIVersion
	 * @generated
	 */
	public Adapter createSetCircleCIVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SelectWorkflow <em>Select Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SelectWorkflow
	 * @generated
	 */
	public Adapter createSelectWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TransformationsAdapterFactory
