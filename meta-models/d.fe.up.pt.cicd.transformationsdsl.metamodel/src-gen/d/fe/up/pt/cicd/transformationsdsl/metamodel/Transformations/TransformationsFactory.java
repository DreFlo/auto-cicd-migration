/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage
 * @generated
 */
public interface TransformationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransformationsFactory eINSTANCE = d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Transformation Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Set</em>'.
	 * @generated
	 */
	TransformationSet createTransformationSet();

	/**
	 * Returns a new object of class '<em>ATL Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ATL Script</em>'.
	 * @generated
	 */
	ATLScript createATLScript();

	/**
	 * Returns a new object of class '<em>Change Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Plugin</em>'.
	 * @generated
	 */
	ChangePlugin createChangePlugin();

	/**
	 * Returns a new object of class '<em>Replace Agent Labels</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replace Agent Labels</em>'.
	 * @generated
	 */
	ReplaceAgentLabels createReplaceAgentLabels();

	/**
	 * Returns a new object of class '<em>Add Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Trigger</em>'.
	 * @generated
	 */
	AddTrigger createAddTrigger();

	/**
	 * Returns a new object of class '<em>Job Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Transformation</em>'.
	 * @generated
	 */
	JobTransformation createJobTransformation();

	/**
	 * Returns a new object of class '<em>Edit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edit Step</em>'.
	 * @generated
	 */
	EditStep createEditStep();

	/**
	 * Returns a new object of class '<em>New Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Step</em>'.
	 * @generated
	 */
	NewStep createNewStep();

	/**
	 * Returns a new object of class '<em>Replace Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replace Step</em>'.
	 * @generated
	 */
	ReplaceStep createReplaceStep();

	/**
	 * Returns a new object of class '<em>Add Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Step</em>'.
	 * @generated
	 */
	AddStep createAddStep();

	/**
	 * Returns a new object of class '<em>Delete Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Step</em>'.
	 * @generated
	 */
	DeleteStep createDeleteStep();

	/**
	 * Returns a new object of class '<em>Add Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Ports</em>'.
	 * @generated
	 */
	AddPorts createAddPorts();

	/**
	 * Returns a new object of class '<em>Set Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Options</em>'.
	 * @generated
	 */
	SetOptions createSetOptions();

	/**
	 * Returns a new object of class '<em>Change Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Image</em>'.
	 * @generated
	 */
	ChangeImage createChangeImage();

	/**
	 * Returns a new object of class '<em>Add Orb Reference Executor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Orb Reference Executor</em>'.
	 * @generated
	 */
	AddOrbReferenceExecutor createAddOrbReferenceExecutor();

	/**
	 * Returns a new object of class '<em>Set Circle CI Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Circle CI Version</em>'.
	 * @generated
	 */
	SetCircleCIVersion createSetCircleCIVersion();

	/**
	 * Returns a new object of class '<em>Select Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Workflow</em>'.
	 * @generated
	 */
	SelectWorkflow createSelectWorkflow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TransformationsPackage getTransformationsPackage();

} //TransformationsFactory
