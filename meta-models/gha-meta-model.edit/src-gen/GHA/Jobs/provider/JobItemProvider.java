/**
 */
package GHA.Jobs.provider;

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

import GHA.Jobs.Job;
import GHA.Jobs.JobsFactory;
import GHA.Jobs.JobsPackage;

import GHA.Jobs.Matrices.MatricesFactory;

import GHA.Options.OptionsFactory;
import GHA.Options.OptionsPackage;

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
 * This is the item provider adapter for a {@link GHA.Jobs.Job} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JobItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobItemProvider(AdapterFactory adapterFactory) {
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
			addDependsOnPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_Job_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_name_feature", "_UI_Job_type"),
						JobsPackage.Literals.JOB__NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Depends On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependsOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_dependsOn_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_dependsOn_feature", "_UI_Job_type"),
						JobsPackage.Literals.JOB__DEPENDS_ON, true, false, true, null, null, null));
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
			childrenFeatures.add(JobsPackage.Literals.JOB__JOB_NAME);
			childrenFeatures.add(JobsPackage.Literals.JOB__PERMISSIONS);
			childrenFeatures.add(JobsPackage.Literals.JOB__IF);
			childrenFeatures.add(JobsPackage.Literals.JOB__AGENT);
			childrenFeatures.add(JobsPackage.Literals.JOB__CONTAINER);
			childrenFeatures.add(JobsPackage.Literals.JOB__STAGING_ENVIRONMENT);
			childrenFeatures.add(JobsPackage.Literals.JOB__DEFAULTS);
			childrenFeatures.add(JobsPackage.Literals.JOB__ENVIRONMENT_VARIABLES);
			childrenFeatures.add(JobsPackage.Literals.JOB__SERVICES);
			childrenFeatures.add(JobsPackage.Literals.JOB__CONCURRENCY_GROUP);
			childrenFeatures.add(JobsPackage.Literals.JOB__TIMEOUT_MINUTES);
			childrenFeatures.add(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR);
			childrenFeatures.add(JobsPackage.Literals.JOB__STRATEGY);
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
		String label = ((Job) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Job_type")
				: getString("_UI_Job_type") + " " + label;
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

		switch (notification.getFeatureID(Job.class)) {
		case JobsPackage.JOB__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case JobsPackage.JOB__JOB_NAME:
		case JobsPackage.JOB__PERMISSIONS:
		case JobsPackage.JOB__IF:
		case JobsPackage.JOB__AGENT:
		case JobsPackage.JOB__CONTAINER:
		case JobsPackage.JOB__STAGING_ENVIRONMENT:
		case JobsPackage.JOB__DEFAULTS:
		case JobsPackage.JOB__ENVIRONMENT_VARIABLES:
		case JobsPackage.JOB__SERVICES:
		case JobsPackage.JOB__CONCURRENCY_GROUP:
		case JobsPackage.JOB__TIMEOUT_MINUTES:
		case JobsPackage.JOB__CONTINUE_ON_ERROR:
		case JobsPackage.JOB__STRATEGY:
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

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__JOB_NAME, LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__JOB_NAME, UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__JOB_NAME, VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__JOB_NAME,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__PERMISSIONS,
				OptionsFactory.eINSTANCE.create(OptionsPackage.Literals.PERMISSION)));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__IF, BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__IF,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors
				.add(createChildParameter(JobsPackage.Literals.JOB__IF, LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors
				.add(createChildParameter(JobsPackage.Literals.JOB__IF, LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(JobsPackage.Literals.JOB__IF, UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__IF, BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__IF,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__IF, BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__IF, BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__IF, BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__IF, BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__IF, BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__IF,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__IF,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__IF,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__IF,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__IF,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__IF, LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__IF, LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__IF, LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__IF, LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors
				.add(createChildParameter(JobsPackage.Literals.JOB__IF, VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__IF, VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__IF,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors
				.add(createChildParameter(JobsPackage.Literals.JOB__AGENT, JobsFactory.eINSTANCE.createAgent()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__CONTAINER, JobsFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__STAGING_ENVIRONMENT,
				JobsFactory.eINSTANCE.createStagingEnvironment()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__DEFAULTS, OptionsFactory.eINSTANCE.createDefaults()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__ENVIRONMENT_VARIABLES,
				ExpressionsFactory.eINSTANCE.create(ExpressionsPackage.Literals.VARIABLE_ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__SERVICES,
				JobsFactory.eINSTANCE.create(JobsPackage.Literals.SERVICE)));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONCURRENCY_GROUP,
				OptionsFactory.eINSTANCE.createConcurrencyGroup()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__TIMEOUT_MINUTES,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.JOB__CONTINUE_ON_ERROR,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(
				createChildParameter(JobsPackage.Literals.JOB__STRATEGY, MatricesFactory.eINSTANCE.createMatrix()));
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

		boolean qualify = childFeature == JobsPackage.Literals.JOB__JOB_NAME
				|| childFeature == JobsPackage.Literals.JOB__IF
				|| childFeature == JobsPackage.Literals.JOB__TIMEOUT_MINUTES
				|| childFeature == JobsPackage.Literals.JOB__CONTINUE_ON_ERROR;

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
