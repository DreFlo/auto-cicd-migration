/**
 */
package GHA.provider;

import GHA.GHAFactory;
import GHA.GHAPackage;
import GHA.Job;

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
 * This is the item provider adapter for a {@link GHA.Job} object.
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
						GHAPackage.Literals.JOB__NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
						GHAPackage.Literals.JOB__DEPENDS_ON, true, false, true, null, null, null));
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
			childrenFeatures.add(GHAPackage.Literals.JOB__JOB_NAME);
			childrenFeatures.add(GHAPackage.Literals.JOB__PERMISSIONS);
			childrenFeatures.add(GHAPackage.Literals.JOB__IF);
			childrenFeatures.add(GHAPackage.Literals.JOB__AGENT);
			childrenFeatures.add(GHAPackage.Literals.JOB__CONTAINER);
			childrenFeatures.add(GHAPackage.Literals.JOB__STAGING_ENVIRONMENT);
			childrenFeatures.add(GHAPackage.Literals.JOB__DEFAULTS);
			childrenFeatures.add(GHAPackage.Literals.JOB__ENVIRONMENT_VARIABLES);
			childrenFeatures.add(GHAPackage.Literals.JOB__SERVICES);
			childrenFeatures.add(GHAPackage.Literals.JOB__CONCURRENCY_GROUP);
			childrenFeatures.add(GHAPackage.Literals.JOB__TIMEOUT_MINUTES);
			childrenFeatures.add(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR);
			childrenFeatures.add(GHAPackage.Literals.JOB__STRATEGY);
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
		case GHAPackage.JOB__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case GHAPackage.JOB__JOB_NAME:
		case GHAPackage.JOB__PERMISSIONS:
		case GHAPackage.JOB__IF:
		case GHAPackage.JOB__AGENT:
		case GHAPackage.JOB__CONTAINER:
		case GHAPackage.JOB__STAGING_ENVIRONMENT:
		case GHAPackage.JOB__DEFAULTS:
		case GHAPackage.JOB__ENVIRONMENT_VARIABLES:
		case GHAPackage.JOB__SERVICES:
		case GHAPackage.JOB__CONCURRENCY_GROUP:
		case GHAPackage.JOB__TIMEOUT_MINUTES:
		case GHAPackage.JOB__CONTINUE_ON_ERROR:
		case GHAPackage.JOB__STRATEGY:
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
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__JOB_NAME, GHAFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__JOB_NAME,
				GHAFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__PERMISSIONS,
				GHAFactory.eINSTANCE.create(GHAPackage.Literals.PERMISSION)));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createVariable()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__IF, GHAFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__AGENT, GHAFactory.eINSTANCE.createAgent()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__CONTAINER, GHAFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__STAGING_ENVIRONMENT,
				GHAFactory.eINSTANCE.createStagingEnvironment()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__DEFAULTS, GHAFactory.eINSTANCE.createDefaults()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__ENVIRONMENT_VARIABLES,
				GHAFactory.eINSTANCE.create(GHAPackage.Literals.VARIABLE_ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__SERVICES,
				GHAFactory.eINSTANCE.create(GHAPackage.Literals.SERVICE)));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__CONCURRENCY_GROUP,
				GHAFactory.eINSTANCE.createConcurrencyGroup()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES,
				GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES,
				GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES,
				GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES,
				GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES,
				GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES, GHAFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES,
				GHAFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__TIMEOUT_MINUTES,
				GHAFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR, GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR,
				GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR, GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR, GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR, GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR,
				GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR,
				GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR,
				GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR, GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR, GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR, GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR,
				GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR,
				GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR, GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR, GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR,
				GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR, GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR,
				GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR,
				GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR,
				GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR,
				GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR,
				GHAFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR,
				GHAFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.JOB__CONTINUE_ON_ERROR,
				GHAFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.JOB__STRATEGY, GHAFactory.eINSTANCE.createMatrix()));
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

		boolean qualify = childFeature == GHAPackage.Literals.JOB__JOB_NAME
				|| childFeature == GHAPackage.Literals.JOB__IF
				|| childFeature == GHAPackage.Literals.JOB__TIMEOUT_MINUTES
				|| childFeature == GHAPackage.Literals.JOB__CONTINUE_ON_ERROR;

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
