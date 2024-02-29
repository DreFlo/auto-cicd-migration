/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.provider;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BinaryOp;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsFactory;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BinaryOp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryOpItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOpItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(JenkinsPackage.Literals.BINARY_OP__LHS);
			childrenFeatures.add(JenkinsPackage.Literals.BINARY_OP__RHS);
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
	 * This returns BinaryOp.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BinaryOp"));
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
		return getString("_UI_BinaryOp_type");
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

		switch (notification.getFeatureID(BinaryOp.class)) {
		case JenkinsPackage.BINARY_OP__LHS:
		case JenkinsPackage.BINARY_OP__RHS:
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

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__LHS,
				JenkinsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__LHS,
				JenkinsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__LHS,
				JenkinsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__LHS,
				JenkinsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__LHS,
				JenkinsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__LHS,
				JenkinsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(
				createChildParameter(JenkinsPackage.Literals.BINARY_OP__LHS, JenkinsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__LHS,
				JenkinsFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__LHS,
				JenkinsFactory.eINSTANCE.createEqualityOp()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__LHS,
				JenkinsFactory.eINSTANCE.createComparisonOp()));

		newChildDescriptors.add(
				createChildParameter(JenkinsPackage.Literals.BINARY_OP__LHS, JenkinsFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__LHS, JenkinsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__RHS,
				JenkinsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__RHS,
				JenkinsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__RHS,
				JenkinsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__RHS,
				JenkinsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__RHS,
				JenkinsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__RHS,
				JenkinsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(
				createChildParameter(JenkinsPackage.Literals.BINARY_OP__RHS, JenkinsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__RHS,
				JenkinsFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__RHS,
				JenkinsFactory.eINSTANCE.createEqualityOp()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__RHS,
				JenkinsFactory.eINSTANCE.createComparisonOp()));

		newChildDescriptors.add(
				createChildParameter(JenkinsPackage.Literals.BINARY_OP__RHS, JenkinsFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(JenkinsPackage.Literals.BINARY_OP__RHS, JenkinsFactory.eINSTANCE.createOr()));
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

		boolean qualify = childFeature == JenkinsPackage.Literals.BINARY_OP__LHS
				|| childFeature == JenkinsPackage.Literals.BINARY_OP__RHS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
