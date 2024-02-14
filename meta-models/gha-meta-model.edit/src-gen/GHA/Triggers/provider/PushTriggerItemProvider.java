/**
 */
package GHA.Triggers.provider;

import GHA.Expressions.BinaryOperators.BinaryOperatorsFactory;

import GHA.Expressions.BinaryOperators.EqualityOperators.EqualityOperatorsFactory;

import GHA.Expressions.BinaryOperators.LogicalOperators.LogicalOperatorsFactory;

import GHA.Expressions.BuiltInFunctions.BuiltInFunctionsFactory;

import GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheckFunctionsFactory;

import GHA.Expressions.UnaryOperators.UnaryOperatorsFactory;

import GHA.Expressions.Values.Literals.LiteralsFactory;

import GHA.Expressions.Values.Variables.VariablesFactory;

import GHA.Triggers.PushTrigger;
import GHA.Triggers.TriggersPackage;

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
 * This is the item provider adapter for a {@link GHA.Triggers.PushTrigger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PushTriggerItemProvider extends TriggerItemProvider {
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

			addIgnoreSpecifiedBranchesPropertyDescriptor(object);
			addIgnoreSpecifiedPathsPropertyDescriptor(object);
			addIgnoreSpecifiedTagsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ignore Specified Branches feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIgnoreSpecifiedBranchesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PushTrigger_ignoreSpecifiedBranches_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PushTrigger_ignoreSpecifiedBranches_feature",
						"_UI_PushTrigger_type"),
				TriggersPackage.Literals.PUSH_TRIGGER__IGNORE_SPECIFIED_BRANCHES, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ignore Specified Paths feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIgnoreSpecifiedPathsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PushTrigger_ignoreSpecifiedPaths_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PushTrigger_ignoreSpecifiedPaths_feature",
								"_UI_PushTrigger_type"),
						TriggersPackage.Literals.PUSH_TRIGGER__IGNORE_SPECIFIED_PATHS, true, false, false,
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
						TriggersPackage.Literals.PUSH_TRIGGER__IGNORE_SPECIFIED_TAGS, true, false, false,
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
			childrenFeatures.add(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES);
			childrenFeatures.add(TriggersPackage.Literals.PUSH_TRIGGER__PATHS);
			childrenFeatures.add(TriggersPackage.Literals.PUSH_TRIGGER__TAGS);
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
		case TriggersPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_BRANCHES:
		case TriggersPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_PATHS:
		case TriggersPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_TAGS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TriggersPackage.PUSH_TRIGGER__BRANCHES:
		case TriggersPackage.PUSH_TRIGGER__PATHS:
		case TriggersPackage.PUSH_TRIGGER__TAGS:
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

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__PATHS,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(TriggersPackage.Literals.PUSH_TRIGGER__TAGS,
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

		boolean qualify = childFeature == TriggersPackage.Literals.PUSH_TRIGGER__BRANCHES
				|| childFeature == TriggersPackage.Literals.PUSH_TRIGGER__PATHS
				|| childFeature == TriggersPackage.Literals.PUSH_TRIGGER__TAGS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}