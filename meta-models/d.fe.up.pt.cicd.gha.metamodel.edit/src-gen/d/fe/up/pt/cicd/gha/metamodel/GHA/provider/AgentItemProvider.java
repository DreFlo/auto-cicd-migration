/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA.provider;

import d.fe.up.pt.cicd.gha.metamodel.GHA.Agent;
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
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.gha.metamodel.GHA.Agent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AgentItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(GHAPackage.Literals.AGENT__GROUP);
			childrenFeatures.add(GHAPackage.Literals.AGENT__LABELS);
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
	 * This returns Agent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Agent"));
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
		return getString("_UI_Agent_type");
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

		switch (notification.getFeatureID(Agent.class)) {
		case GHAPackage.AGENT__GROUP:
		case GHAPackage.AGENT__LABELS:
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

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP,
				GHAFactory.eINSTANCE.create(GHAPackage.Literals.VARIABLE_ASSIGNMENT)));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createDotOp()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createComparison()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.AGENT__GROUP, GHAFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS,
				GHAFactory.eINSTANCE.create(GHAPackage.Literals.VARIABLE_ASSIGNMENT)));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createDotOp()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createComparison()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.AGENT__LABELS,
				GHAFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(
				createChildParameter(GHAPackage.Literals.AGENT__LABELS, GHAFactory.eINSTANCE.createGitHubContext()));
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

		boolean qualify = childFeature == GHAPackage.Literals.AGENT__GROUP
				|| childFeature == GHAPackage.Literals.AGENT__LABELS;

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
