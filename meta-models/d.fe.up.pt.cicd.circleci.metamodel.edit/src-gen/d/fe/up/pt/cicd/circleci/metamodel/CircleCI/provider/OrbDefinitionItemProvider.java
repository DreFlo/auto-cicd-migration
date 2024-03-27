/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.provider;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIFactory;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbDefinition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrbDefinitionItemProvider extends OrbItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbDefinitionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CircleCIPackage.Literals.ORB_DEFINITION__ORBS);
			childrenFeatures.add(CircleCIPackage.Literals.ORB_DEFINITION__COMMANDS);
			childrenFeatures.add(CircleCIPackage.Literals.ORB_DEFINITION__EXECUTORS);
			childrenFeatures.add(CircleCIPackage.Literals.ORB_DEFINITION__JOBS);
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
	 * This returns OrbDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OrbDefinition"));
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
		String label = ((OrbDefinition) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_OrbDefinition_type")
				: getString("_UI_OrbDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(OrbDefinition.class)) {
		case CircleCIPackage.ORB_DEFINITION__ORBS:
		case CircleCIPackage.ORB_DEFINITION__COMMANDS:
		case CircleCIPackage.ORB_DEFINITION__EXECUTORS:
		case CircleCIPackage.ORB_DEFINITION__JOBS:
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

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.ORB_DEFINITION__ORBS,
				CircleCIFactory.eINSTANCE.createOrbReference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.ORB_DEFINITION__ORBS,
				CircleCIFactory.eINSTANCE.createOrbDefinition()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.ORB_DEFINITION__COMMANDS,
				CircleCIFactory.eINSTANCE.createCommand()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.ORB_DEFINITION__EXECUTORS,
				CircleCIFactory.eINSTANCE.createDockerExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.ORB_DEFINITION__EXECUTORS,
				CircleCIFactory.eINSTANCE.createMachineExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.ORB_DEFINITION__EXECUTORS,
				CircleCIFactory.eINSTANCE.createMacOSExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.ORB_DEFINITION__EXECUTORS,
				CircleCIFactory.eINSTANCE.createWindowsOrbExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.ORB_DEFINITION__EXECUTORS,
				CircleCIFactory.eINSTANCE.createExecutorReferenceExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.ORB_DEFINITION__EXECUTORS,
				CircleCIFactory.eINSTANCE.createOrbReferenceExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.ORB_DEFINITION__JOBS,
				CircleCIFactory.eINSTANCE.createJob()));
	}

}
