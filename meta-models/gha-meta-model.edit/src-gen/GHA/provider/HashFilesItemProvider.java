/**
 */
package GHA.provider;

import GHA.GHAFactory;
import GHA.GHAPackage;
import GHA.HashFiles;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link GHA.HashFiles} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HashFilesItemProvider extends BuiltInFunctionCallItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashFilesItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(GHAPackage.Literals.HASH_FILES__PATH);
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
	 * This returns HashFiles.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HashFiles"));
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
		return getString("_UI_HashFiles_type");
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

		switch (notification.getFeatureID(HashFiles.class)) {
		case GHAPackage.HASH_FILES__PATH:
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

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH,
				GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH,
				GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.HASH_FILES__PATH, GHAFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.HASH_FILES__PATH,
				GHAFactory.eINSTANCE.createVariableDereference()));
	}

}
