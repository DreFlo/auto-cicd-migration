/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA.provider;

import d.fe.up.pt.cicd.gha.metamodel.GHA.ConcurrencyGroup;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAFactory;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.gha.metamodel.GHA.ConcurrencyGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcurrencyGroupItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrencyGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(GHAPackage.Literals.CONCURRENCY_GROUP__NAME);
			childrenFeatures.add(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS);
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
	 * This returns ConcurrencyGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConcurrencyGroup"));
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
		return getString("_UI_ConcurrencyGroup_type");
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

		switch (notification.getFeatureID(ConcurrencyGroup.class)) {
		case GHAPackage.CONCURRENCY_GROUP__NAME:
		case GHAPackage.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS:
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

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.create(GHAPackage.Literals.VARIABLE_ASSIGNMENT)));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME, GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME, GHAFactory.eINSTANCE.createDotOp()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.createComparison()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME, GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME, GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME, GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME, GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME, GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME, GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME, GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__NAME,
				GHAFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.create(GHAPackage.Literals.VARIABLE_ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createDotOp()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createComparison()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
				GHAFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS,
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

		boolean qualify = childFeature == GHAPackage.Literals.CONCURRENCY_GROUP__NAME
				|| childFeature == GHAPackage.Literals.CONCURRENCY_GROUP__CANCEL_IN_PROGRESS;

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
