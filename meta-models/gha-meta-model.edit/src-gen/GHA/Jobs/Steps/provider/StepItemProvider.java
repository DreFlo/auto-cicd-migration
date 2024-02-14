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

import GHA.Jobs.Steps.Step;
import GHA.Jobs.Steps.StepsPackage;

import GHA.provider.GHAEditPlugin;

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
 * This is the item provider adapter for a {@link GHA.Jobs.Steps.Step} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StepItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Step_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Step_id_feature", "_UI_Step_type"),
						StepsPackage.Literals.STEP__ID, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
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
			childrenFeatures.add(StepsPackage.Literals.STEP__IF);
			childrenFeatures.add(StepsPackage.Literals.STEP__NAME);
			childrenFeatures.add(StepsPackage.Literals.STEP__TIMEOUT_MINUTES);
			childrenFeatures.add(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR);
			childrenFeatures.add(StepsPackage.Literals.STEP__SHELL);
			childrenFeatures.add(StepsPackage.Literals.STEP__WORKING_DIRECTORY);
			childrenFeatures.add(StepsPackage.Literals.STEP__ENVIRONMENT_VARIABLES);
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
		String label = ((Step) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_Step_type")
				: getString("_UI_Step_type") + " " + label;
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

		switch (notification.getFeatureID(Step.class)) {
		case StepsPackage.STEP__ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case StepsPackage.STEP__IF:
		case StepsPackage.STEP__NAME:
		case StepsPackage.STEP__TIMEOUT_MINUTES:
		case StepsPackage.STEP__CONTINUE_ON_ERROR:
		case StepsPackage.STEP__SHELL:
		case StepsPackage.STEP__WORKING_DIRECTORY:
		case StepsPackage.STEP__ENVIRONMENT_VARIABLES:
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
				createChildParameter(StepsPackage.Literals.STEP__IF, BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__IF,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__IF, LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__IF, LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(StepsPackage.Literals.STEP__IF, UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__IF,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__IF,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__IF,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__IF, BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__IF, BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__IF, BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__IF,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__IF,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__IF,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__IF,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__IF,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__IF,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__IF, LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__IF, LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__IF, LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__IF, LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors
				.add(createChildParameter(StepsPackage.Literals.STEP__IF, VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__IF, VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__IF,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__NAME, LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__NAME, LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__NAME, UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__NAME, BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__NAME, VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__NAME,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__TIMEOUT_MINUTES,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__CONTINUE_ON_ERROR,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__SHELL, LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__SHELL, LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__SHELL, UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(
				createChildParameter(StepsPackage.Literals.STEP__SHELL, VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__SHELL,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__WORKING_DIRECTORY,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(StepsPackage.Literals.STEP__ENVIRONMENT_VARIABLES,
				ExpressionsFactory.eINSTANCE.create(ExpressionsPackage.Literals.VARIABLE_ASSIGNMENT)));
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
				|| childFeature == StepsPackage.Literals.STEP__WORKING_DIRECTORY;

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
