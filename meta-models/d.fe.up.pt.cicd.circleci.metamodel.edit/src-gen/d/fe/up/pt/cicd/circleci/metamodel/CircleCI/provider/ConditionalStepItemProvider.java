/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.provider;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIFactory;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ConditionalStep;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ConditionalStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionalStepItemProvider extends StepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalStepItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CircleCIPackage.Literals.CONDITIONAL_STEP__CONDITION);
			childrenFeatures.add(CircleCIPackage.Literals.CONDITIONAL_STEP__STEPS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ConditionalStep_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ConditionalStep.class)) {
		case CircleCIPackage.CONDITIONAL_STEP__CONDITION:
		case CircleCIPackage.CONDITIONAL_STEP__STEPS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__CONDITION,
				CircleCIFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__CONDITION,
				CircleCIFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__CONDITION,
				CircleCIFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__CONDITION,
				CircleCIFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__CONDITION,
				CircleCIFactory.eINSTANCE.createMatches()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__CONDITION,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__CONDITION,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__CONDITION,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__CONDITION,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__CONDITION,
				CircleCIFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__STEPS,
				CircleCIFactory.eINSTANCE.createRunStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__STEPS,
				CircleCIFactory.eINSTANCE.createWhenStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__STEPS,
				CircleCIFactory.eINSTANCE.createUnlessStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__STEPS,
				CircleCIFactory.eINSTANCE.createCheckoutStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__STEPS,
				CircleCIFactory.eINSTANCE.createSetupRemoteDockerStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__STEPS,
				CircleCIFactory.eINSTANCE.createSaveCacheStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__STEPS,
				CircleCIFactory.eINSTANCE.createRestoreCacheStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__STEPS,
				CircleCIFactory.eINSTANCE.createStoreArtifactsStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__STEPS,
				CircleCIFactory.eINSTANCE.createStoreTestResultsStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__STEPS,
				CircleCIFactory.eINSTANCE.createPersistToWorkspaceStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__STEPS,
				CircleCIFactory.eINSTANCE.createAttachWorkspaceStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__STEPS,
				CircleCIFactory.eINSTANCE.createAddSSHKeysStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__STEPS,
				CircleCIFactory.eINSTANCE.createOrbReferenceStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CONDITIONAL_STEP__STEPS,
				CircleCIFactory.eINSTANCE.createCommandReferenceStep()));
	}

}
