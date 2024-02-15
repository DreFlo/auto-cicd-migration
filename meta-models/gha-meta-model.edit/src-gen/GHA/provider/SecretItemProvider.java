/**
 */
package GHA.provider;

import GHA.GHAFactory;
import GHA.GHAPackage;
import GHA.Secret;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link GHA.Secret} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SecretItemProvider extends ParameterItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(GHAPackage.Literals.SECRET__IS_REQUIRED);
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
	 * This returns Secret.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Secret"));
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
		String label = ((Secret) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_Secret_type")
				: getString("_UI_Secret_type") + " " + label;
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

		switch (notification.getFeatureID(Secret.class)) {
		case GHAPackage.SECRET__IS_REQUIRED:
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

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED,
				GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED,
				GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED,
				GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED,
				GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED, GHAFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED,
				GHAFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SECRET__IS_REQUIRED,
				GHAFactory.eINSTANCE.createVariableDereference()));
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

		boolean qualify = childFeature == GHAPackage.Literals.PARAMETER__DESCRIPTION
				|| childFeature == GHAPackage.Literals.SECRET__IS_REQUIRED;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
