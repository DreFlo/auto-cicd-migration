/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA.provider;

import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAFactory;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.PushTrigger;

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
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.gha.metamodel.GHA.PushTrigger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PushTriggerItemProvider extends SpecifiedBranchesTriggerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushTriggerItemProvider(AdapterFactory adapterFactory) {
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

			addIgnoreSpecifiedPathsPropertyDescriptor(object);
			addIgnoreSpecifiedTagsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ignore Specified Paths feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIgnoreSpecifiedPathsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SpecifiedPathsTrigger_ignoreSpecifiedPaths_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecifiedPathsTrigger_ignoreSpecifiedPaths_feature", "_UI_SpecifiedPathsTrigger_type"),
				GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__IGNORE_SPECIFIED_PATHS, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ignore Specified Tags feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIgnoreSpecifiedTagsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PushTrigger_ignoreSpecifiedTags_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PushTrigger_ignoreSpecifiedTags_feature",
								"_UI_PushTrigger_type"),
						GHAPackage.Literals.PUSH_TRIGGER__IGNORE_SPECIFIED_TAGS, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS);
			childrenFeatures.add(GHAPackage.Literals.PUSH_TRIGGER__TAGS);
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
	 * This returns PushTrigger.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PushTrigger"));
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
		PushTrigger pushTrigger = (PushTrigger) object;
		return getString("_UI_PushTrigger_type") + " " + pushTrigger.isIgnoreSpecifiedBranches();
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

		switch (notification.getFeatureID(PushTrigger.class)) {
		case GHAPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_PATHS:
		case GHAPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_TAGS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case GHAPackage.PUSH_TRIGGER__PATHS:
		case GHAPackage.PUSH_TRIGGER__TAGS:
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

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.create(GHAPackage.Literals.VARIABLE_ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createDotOp()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createComparison()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS,
				GHAFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS,
				GHAFactory.eINSTANCE.create(GHAPackage.Literals.VARIABLE_ASSIGNMENT)));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createDotOp()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createComparison()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS, GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS,
				GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS,
				GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS,
				GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS,
				GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS,
				GHAFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.PUSH_TRIGGER__TAGS,
				GHAFactory.eINSTANCE.createGitHubContext()));
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

		boolean qualify = childFeature == GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES
				|| childFeature == GHAPackage.Literals.SPECIFIED_PATHS_TRIGGER__PATHS
				|| childFeature == GHAPackage.Literals.PUSH_TRIGGER__TAGS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
