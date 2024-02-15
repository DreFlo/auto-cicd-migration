/**
 */
package GHA.provider;

import GHA.BinaryOp;
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
 * This is the item provider adapter for a {@link GHA.BinaryOp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryOpItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOpItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(GHAPackage.Literals.BINARY_OP__LHS);
			childrenFeatures.add(GHAPackage.Literals.BINARY_OP__RHS);
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
		return getString("_UI_BinaryOp_type");
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

		switch (notification.getFeatureID(BinaryOp.class)) {
		case GHAPackage.BINARY_OP__LHS:
		case GHAPackage.BINARY_OP__RHS:
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
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.BINARY_OP__LHS, GHAFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.BINARY_OP__LHS,
				GHAFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.BINARY_OP__RHS, GHAFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.BINARY_OP__RHS,
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

		boolean qualify = childFeature == GHAPackage.Literals.BINARY_OP__LHS
				|| childFeature == GHAPackage.Literals.BINARY_OP__RHS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
