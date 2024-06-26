/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA.provider;

import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAFactory;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.SpecifiedBranchesTrigger;

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
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.gha.metamodel.GHA.SpecifiedBranchesTrigger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecifiedBranchesTriggerItemProvider extends TriggerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecifiedBranchesTriggerItemProvider(AdapterFactory adapterFactory) {
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
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SpecifiedBranchesTrigger_ignoreSpecifiedBranches_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_SpecifiedBranchesTrigger_ignoreSpecifiedBranches_feature",
								"_UI_SpecifiedBranchesTrigger_type"),
						GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__IGNORE_SPECIFIED_BRANCHES, true, false, false,
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
			childrenFeatures.add(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES);
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
		SpecifiedBranchesTrigger specifiedBranchesTrigger = (SpecifiedBranchesTrigger) object;
		return getString("_UI_SpecifiedBranchesTrigger_type") + " "
				+ specifiedBranchesTrigger.isIgnoreSpecifiedBranches();
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

		switch (notification.getFeatureID(SpecifiedBranchesTrigger.class)) {
		case GHAPackage.SPECIFIED_BRANCHES_TRIGGER__IGNORE_SPECIFIED_BRANCHES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case GHAPackage.SPECIFIED_BRANCHES_TRIGGER__BRANCHES:
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

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.create(GHAPackage.Literals.VARIABLE_ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createDotOp()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createComparison()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.SPECIFIED_BRANCHES_TRIGGER__BRANCHES,
				GHAFactory.eINSTANCE.createGitHubContext()));
	}

}
