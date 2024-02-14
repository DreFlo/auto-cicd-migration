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

import GHA.Jobs.JobsPackage;
import GHA.Jobs.ReuseWorkflowJob;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link GHA.Jobs.ReuseWorkflowJob} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReuseWorkflowJobItemProvider extends JobItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReuseWorkflowJobItemProvider(AdapterFactory adapterFactory) {
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

			addInheritSecretsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Inherit Secrets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritSecretsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ReuseWorkflowJob_inheritSecrets_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ReuseWorkflowJob_inheritSecrets_feature",
								"_UI_ReuseWorkflowJob_type"),
						JobsPackage.Literals.REUSE_WORKFLOW_JOB__INHERIT_SECRETS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH);
			childrenFeatures.add(JobsPackage.Literals.REUSE_WORKFLOW_JOB__ARGS);
			childrenFeatures.add(JobsPackage.Literals.REUSE_WORKFLOW_JOB__SECRETS);
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
	 * This returns ReuseWorkflowJob.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReuseWorkflowJob"));
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
		String label = ((ReuseWorkflowJob) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ReuseWorkflowJob_type")
				: getString("_UI_ReuseWorkflowJob_type") + " " + label;
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

		switch (notification.getFeatureID(ReuseWorkflowJob.class)) {
		case JobsPackage.REUSE_WORKFLOW_JOB__INHERIT_SECRETS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case JobsPackage.REUSE_WORKFLOW_JOB__WORKFLOW_PATH:
		case JobsPackage.REUSE_WORKFLOW_JOB__ARGS:
		case JobsPackage.REUSE_WORKFLOW_JOB__SECRETS:
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

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__ARGS,
				ExpressionsFactory.eINSTANCE.create(ExpressionsPackage.Literals.VARIABLE_ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(JobsPackage.Literals.REUSE_WORKFLOW_JOB__SECRETS,
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

		boolean qualify = childFeature == JobsPackage.Literals.JOB__JOB_NAME
				|| childFeature == JobsPackage.Literals.JOB__IF
				|| childFeature == JobsPackage.Literals.JOB__TIMEOUT_MINUTES
				|| childFeature == JobsPackage.Literals.JOB__CONTINUE_ON_ERROR
				|| childFeature == JobsPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH
				|| childFeature == JobsPackage.Literals.JOB__ENVIRONMENT_VARIABLES
				|| childFeature == JobsPackage.Literals.REUSE_WORKFLOW_JOB__ARGS
				|| childFeature == JobsPackage.Literals.REUSE_WORKFLOW_JOB__SECRETS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
