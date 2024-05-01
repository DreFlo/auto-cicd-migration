/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.provider;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIFactory;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutorItemProvider extends EnvironmentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutorItemProvider(AdapterFactory adapterFactory) {
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
						getResourceLocator(), getString("_UI_Executor_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Executor_name_feature",
								"_UI_Executor_type"),
						CircleCIPackage.Literals.EXECUTOR__NAME, true, false, false,
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
			childrenFeatures.add(CircleCIPackage.Literals.EXECUTOR__RESOURCE_CLASS);
			childrenFeatures.add(CircleCIPackage.Literals.EXECUTOR__SHELL);
			childrenFeatures.add(CircleCIPackage.Literals.EXECUTOR__WORKING_DIRECTORY);
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
	 * This returns Executor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Executor"));
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
		String label = ((Executor) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Executor_type")
				: getString("_UI_Executor_type") + " " + label;
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

		switch (notification.getFeatureID(Executor.class)) {
		case CircleCIPackage.EXECUTOR__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case CircleCIPackage.EXECUTOR__RESOURCE_CLASS:
		case CircleCIPackage.EXECUTOR__SHELL:
		case CircleCIPackage.EXECUTOR__WORKING_DIRECTORY:
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

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__RESOURCE_CLASS,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__RESOURCE_CLASS,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__RESOURCE_CLASS,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__RESOURCE_CLASS,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__RESOURCE_CLASS,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__RESOURCE_CLASS,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__RESOURCE_CLASS,
				CircleCIFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__SHELL,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__SHELL,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__SHELL,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__SHELL,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__SHELL,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__SHELL,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__SHELL,
				CircleCIFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__WORKING_DIRECTORY,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__WORKING_DIRECTORY,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__WORKING_DIRECTORY,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__WORKING_DIRECTORY,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__WORKING_DIRECTORY,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__WORKING_DIRECTORY,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.EXECUTOR__WORKING_DIRECTORY,
				CircleCIFactory.eINSTANCE.createVariableReference()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == CircleCIPackage.Literals.EXECUTOR__RESOURCE_CLASS
				|| childFeature == CircleCIPackage.Literals.EXECUTOR__SHELL
				|| childFeature == CircleCIPackage.Literals.EXECUTOR__WORKING_DIRECTORY;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
