/**
 */
package GHA.Expressions.BinaryOperators.provider;

import GHA.Expressions.BinaryOperators.BinaryOp;
import GHA.Expressions.BinaryOperators.BinaryOperatorsFactory;
import GHA.Expressions.BinaryOperators.BinaryOperatorsPackage;

import GHA.Expressions.BinaryOperators.EqualityOperators.EqualityOperatorsFactory;

import GHA.Expressions.BinaryOperators.LogicalOperators.LogicalOperatorsFactory;

import GHA.Expressions.BuiltInFunctions.BuiltInFunctionsFactory;

import GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheckFunctionsFactory;

import GHA.Expressions.UnaryOperators.UnaryOperatorsFactory;

import GHA.Expressions.Values.Literals.LiteralsFactory;

import GHA.Expressions.Values.Variables.VariablesFactory;

import GHA.Expressions.provider.ExpressionItemProvider;

import GHA.provider.GHAEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link GHA.Expressions.BinaryOperators.BinaryOp} object.
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
			childrenFeatures.add(BinaryOperatorsPackage.Literals.BINARY_OP__LHS);
			childrenFeatures.add(BinaryOperatorsPackage.Literals.BINARY_OP__RHS);
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
		case BinaryOperatorsPackage.BINARY_OP__LHS:
		case BinaryOperatorsPackage.BINARY_OP__RHS:
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

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__LHS,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(BinaryOperatorsPackage.Literals.BINARY_OP__RHS,
				VariablesFactory.eINSTANCE.createVariableDereference()));
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

		boolean qualify = childFeature == BinaryOperatorsPackage.Literals.BINARY_OP__LHS
				|| childFeature == BinaryOperatorsPackage.Literals.BINARY_OP__RHS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GHAEditPlugin.INSTANCE;
	}

}
