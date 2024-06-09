/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.provider;

import d.fe.up.pt.cicd.metamodel.CICD.CICDFactory;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock;

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
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PipelineBlockItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineBlockItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addInputsPropertyDescriptor(object);
			addOutputsPropertyDescriptor(object);
			addTimeoutMinutesPropertyDescriptor(object);
			addWorkingDirectoryPropertyDescriptor(object);
			addShellPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PipelineBlock_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PipelineBlock_name_feature",
								"_UI_PipelineBlock_type"),
						CICDPackage.Literals.PIPELINE_BLOCK__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Inputs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PipelineBlock_inputs_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PipelineBlock_inputs_feature",
								"_UI_PipelineBlock_type"),
						CICDPackage.Literals.PIPELINE_BLOCK__INPUTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Outputs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PipelineBlock_outputs_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PipelineBlock_outputs_feature",
								"_UI_PipelineBlock_type"),
						CICDPackage.Literals.PIPELINE_BLOCK__OUTPUTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Timeout Minutes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeoutMinutesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PipelineBlock_timeoutMinutes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PipelineBlock_timeoutMinutes_feature",
								"_UI_PipelineBlock_type"),
						CICDPackage.Literals.PIPELINE_BLOCK__TIMEOUT_MINUTES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Working Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkingDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PipelineBlock_workingDirectory_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PipelineBlock_workingDirectory_feature",
								"_UI_PipelineBlock_type"),
						CICDPackage.Literals.PIPELINE_BLOCK__WORKING_DIRECTORY, true, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Shell feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShellPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PipelineBlock_shell_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PipelineBlock_shell_feature",
								"_UI_PipelineBlock_type"),
						CICDPackage.Literals.PIPELINE_BLOCK__SHELL, true, false, false, null, null, null));
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
			childrenFeatures.add(CICDPackage.Literals.PIPELINE_BLOCK__AGENT);
			childrenFeatures.add(CICDPackage.Literals.PIPELINE_BLOCK__ENVIRONMENT_VARIABLES);
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
		String label = ((PipelineBlock) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_PipelineBlock_type")
				: getString("_UI_PipelineBlock_type") + " " + label;
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

		switch (notification.getFeatureID(PipelineBlock.class)) {
		case CICDPackage.PIPELINE_BLOCK__NAME:
		case CICDPackage.PIPELINE_BLOCK__TIMEOUT_MINUTES:
		case CICDPackage.PIPELINE_BLOCK__WORKING_DIRECTORY:
		case CICDPackage.PIPELINE_BLOCK__SHELL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case CICDPackage.PIPELINE_BLOCK__AGENT:
		case CICDPackage.PIPELINE_BLOCK__ENVIRONMENT_VARIABLES:
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

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.PIPELINE_BLOCK__AGENT,
				CICDFactory.eINSTANCE.createCustomAgent()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.PIPELINE_BLOCK__AGENT,
				CICDFactory.eINSTANCE.createLinuxAgent()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.PIPELINE_BLOCK__AGENT,
				CICDFactory.eINSTANCE.createWindowsAgent()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.PIPELINE_BLOCK__AGENT,
				CICDFactory.eINSTANCE.createMacOSAgent()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.PIPELINE_BLOCK__ENVIRONMENT_VARIABLES,
				CICDFactory.eINSTANCE.create(CICDPackage.Literals.ASSIGNMENT)));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CICDEditPlugin.INSTANCE;
	}

}
