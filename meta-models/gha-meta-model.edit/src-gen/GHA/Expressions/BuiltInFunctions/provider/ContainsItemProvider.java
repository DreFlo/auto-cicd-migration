/**
 */
package GHA.Expressions.BuiltInFunctions.provider;

import GHA.Expressions.BinaryOperators.BinaryOperatorsFactory;

import GHA.Expressions.BinaryOperators.EqualityOperators.EqualityOperatorsFactory;

import GHA.Expressions.BinaryOperators.LogicalOperators.LogicalOperatorsFactory;

import GHA.Expressions.BuiltInFunctions.BuiltInFunctionsFactory;
import GHA.Expressions.BuiltInFunctions.BuiltInFunctionsPackage;
import GHA.Expressions.BuiltInFunctions.Contains;

import GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheckFunctionsFactory;

import GHA.Expressions.UnaryOperators.UnaryOperatorsFactory;

import GHA.Expressions.Values.Literals.LiteralsFactory;

import GHA.Expressions.Values.Variables.VariablesFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link GHA.Expressions.BuiltInFunctions.Contains} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainsItemProvider extends BuiltInFunctionCallItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainsItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH);
			childrenFeatures.add(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM);
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
	 * This returns Contains.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Contains"));
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
		return getString("_UI_Contains_type");
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

		switch (notification.getFeatureID(Contains.class)) {
		case BuiltInFunctionsPackage.CONTAINS__SEARCH:
		case BuiltInFunctionsPackage.CONTAINS__ITEM:
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

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.CONTAINS__ITEM,
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

		boolean qualify = childFeature == BuiltInFunctionsPackage.Literals.CONTAINS__SEARCH
				|| childFeature == BuiltInFunctionsPackage.Literals.CONTAINS__ITEM;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
