/**
 */
package GHA.Expressions.BuiltInFunctions.provider;

import GHA.Expressions.BinaryOperators.BinaryOperatorsFactory;

import GHA.Expressions.BinaryOperators.EqualityOperators.EqualityOperatorsFactory;

import GHA.Expressions.BinaryOperators.LogicalOperators.LogicalOperatorsFactory;

import GHA.Expressions.BuiltInFunctions.BuiltInFunctionsFactory;
import GHA.Expressions.BuiltInFunctions.BuiltInFunctionsPackage;
import GHA.Expressions.BuiltInFunctions.Format;

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
 * This is the item provider adapter for a {@link GHA.Expressions.BuiltInFunctions.Format} object.
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
			childrenFeatures.add(BuiltInFunctionsPackage.Literals.FORMAT__STRING);
			childrenFeatures.add(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES);
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
		case BuiltInFunctionsPackage.FORMAT__STRING:
		case BuiltInFunctionsPackage.FORMAT__REPLACE_VALUES:
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

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__STRING,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES,
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

		boolean qualify = childFeature == BuiltInFunctionsPackage.Literals.FORMAT__STRING
				|| childFeature == BuiltInFunctionsPackage.Literals.FORMAT__REPLACE_VALUES;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
