/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.provider;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIFactory;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PipelineItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineItemProvider(AdapterFactory adapterFactory) {
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

			addVersionPropertyDescriptor(object);
			addSetupPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Pipeline_version_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Pipeline_version_feature",
								"_UI_Pipeline_type"),
						CircleCIPackage.Literals.PIPELINE__VERSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Setup feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSetupPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Pipeline_setup_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Pipeline_setup_feature",
								"_UI_Pipeline_type"),
						CircleCIPackage.Literals.PIPELINE__SETUP, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(CircleCIPackage.Literals.PIPELINE__ORBS);
			childrenFeatures.add(CircleCIPackage.Literals.PIPELINE__COMMANDS);
			childrenFeatures.add(CircleCIPackage.Literals.PIPELINE__PARAMETERS);
			childrenFeatures.add(CircleCIPackage.Literals.PIPELINE__EXECUTORS);
			childrenFeatures.add(CircleCIPackage.Literals.PIPELINE__JOBS);
			childrenFeatures.add(CircleCIPackage.Literals.PIPELINE__WORKFLOWS);
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
	 * This returns Pipeline.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Pipeline"));
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
		String label = ((Pipeline) object).getVersion();
		return label == null || label.length() == 0 ? getString("_UI_Pipeline_type")
				: getString("_UI_Pipeline_type") + " " + label;
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

		switch (notification.getFeatureID(Pipeline.class)) {
		case CircleCIPackage.PIPELINE__VERSION:
		case CircleCIPackage.PIPELINE__SETUP:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case CircleCIPackage.PIPELINE__ORBS:
		case CircleCIPackage.PIPELINE__COMMANDS:
		case CircleCIPackage.PIPELINE__PARAMETERS:
		case CircleCIPackage.PIPELINE__EXECUTORS:
		case CircleCIPackage.PIPELINE__JOBS:
		case CircleCIPackage.PIPELINE__WORKFLOWS:
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

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.PIPELINE__ORBS,
				CircleCIFactory.eINSTANCE.createOrbReference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.PIPELINE__ORBS,
				CircleCIFactory.eINSTANCE.createOrbDefinition()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.PIPELINE__COMMANDS,
				CircleCIFactory.eINSTANCE.createCommand()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.PIPELINE__PARAMETERS,
				CircleCIFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.PIPELINE__EXECUTORS,
				CircleCIFactory.eINSTANCE.createDockerExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.PIPELINE__EXECUTORS,
				CircleCIFactory.eINSTANCE.createMachineExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.PIPELINE__EXECUTORS,
				CircleCIFactory.eINSTANCE.createMacOSExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.PIPELINE__EXECUTORS,
				CircleCIFactory.eINSTANCE.createWindowsOrbExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.PIPELINE__EXECUTORS,
				CircleCIFactory.eINSTANCE.createExecutorReferenceExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.PIPELINE__EXECUTORS,
				CircleCIFactory.eINSTANCE.createOrbReferenceExecutor()));

		newChildDescriptors.add(
				createChildParameter(CircleCIPackage.Literals.PIPELINE__JOBS, CircleCIFactory.eINSTANCE.createJob()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.PIPELINE__WORKFLOWS,
				CircleCIFactory.eINSTANCE.createWorkflow()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CircleCIEditPlugin.INSTANCE;
	}

}
