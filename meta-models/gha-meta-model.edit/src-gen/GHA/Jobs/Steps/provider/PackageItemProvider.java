/**
 */
package GHA.Jobs.Steps.provider;

import GHA.Expressions.BinaryOperators.BinaryOperatorsFactory;

import GHA.Expressions.BinaryOperators.EqualityOperators.EqualityOperatorsFactory;

import GHA.Expressions.BinaryOperators.LogicalOperators.LogicalOperatorsFactory;

import GHA.Expressions.BuiltInFunctions.BuiltInFunctionsFactory;

import GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheckFunctionsFactory;

import GHA.Expressions.ExpressionsFactory;
import GHA.Expressions.ExpressionsPackage;

import GHA.Expressions.UnaryOperators.UnaryOperatorsFactory;

import GHA.Expressions.Values.Literals.LiteralsFactory;

import GHA.Expressions.Values.Variables.VariablesFactory;

import GHA.Jobs.Steps.StepsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link GHA.Jobs.Steps.Package} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageItemProvider extends StepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StepsPackage.Literals.PACKAGE__USES);
			childrenFeatures.add(StepsPackage.Literals.PACKAGE__ARGS);
			childrenFeatures.add(StepsPackage.Literals.PACKAGE__ENTRYPOINT);
			childrenFeatures.add(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS);
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
	 * This returns Package.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Package"));
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
		String label = ((GHA.Jobs.Steps.Package) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_Package_type")
				: getString("_UI_Package_type") + " " + label;
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

		switch (notification.getFeatureID(GHA.Jobs.Steps.Package.class)) {
		case StepsPackage.PACKAGE__USES:
		case StepsPackage.PACKAGE__ARGS:
		case StepsPackage.PACKAGE__ENTRYPOINT:
		case StepsPackage.PACKAGE__CONTAINER_ARGS:
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

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.PACKAGE__USES, UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.PACKAGE__USES, VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__USES,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ARGS,
				ExpressionsFactory.eINSTANCE.create(ExpressionsPackage.Literals.VARIABLE_ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__ENTRYPOINT,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.PACKAGE__CONTAINER_ARGS,
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

		boolean qualify = childFeature == StepsPackage.Literals.STEP__IF
				|| childFeature == StepsPackage.Literals.STEP__NAME
				|| childFeature == StepsPackage.Literals.STEP__TIMEOUT_MINUTES
				|| childFeature == StepsPackage.Literals.STEP__CONTINUE_ON_ERROR
				|| childFeature == StepsPackage.Literals.STEP__SHELL
				|| childFeature == StepsPackage.Literals.STEP__WORKING_DIRECTORY
				|| childFeature == StepsPackage.Literals.PACKAGE__USES
				|| childFeature == StepsPackage.Literals.PACKAGE__ENTRYPOINT
				|| childFeature == StepsPackage.Literals.PACKAGE__CONTAINER_ARGS
				|| childFeature == StepsPackage.Literals.STEP__ENVIRONMENT_VARIABLES
				|| childFeature == StepsPackage.Literals.PACKAGE__ARGS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
