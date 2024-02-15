/**
 */
package GHA.provider;

import GHA.Format;
import GHA.GHAFactory;
import GHA.GHAPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link GHA.Format} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FormatItemProvider extends BuiltInFunctionCallItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(GHAPackage.Literals.FORMAT__STRING);
			childrenFeatures.add(GHAPackage.Literals.FORMAT__REPLACE_VALUES);
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
	 * This returns Format.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Format"));
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
		return getString("_UI_Format_type");
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

		switch (notification.getFeatureID(Format.class)) {
		case GHAPackage.FORMAT__STRING:
		case GHAPackage.FORMAT__REPLACE_VALUES:
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
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.FORMAT__STRING, GHAFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.FORMAT__STRING,
				GHAFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES, GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES,
				GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES, GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES, GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES, GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES,
				GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES,
				GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES,
				GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES, GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES, GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES, GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES,
				GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES,
				GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES, GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES, GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES,
				GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES, GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES,
				GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES,
				GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES,
				GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES,
				GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES,
				GHAFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES,
				GHAFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.FORMAT__REPLACE_VALUES,
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

		boolean qualify = childFeature == GHAPackage.Literals.FORMAT__STRING
				|| childFeature == GHAPackage.Literals.FORMAT__REPLACE_VALUES;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
