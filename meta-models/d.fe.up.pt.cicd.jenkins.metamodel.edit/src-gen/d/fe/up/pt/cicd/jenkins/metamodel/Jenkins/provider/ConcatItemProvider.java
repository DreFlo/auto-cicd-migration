/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.provider;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Concat;
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
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Concat} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcatItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcatItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(JenkinsPackage.Literals.CONCAT__EXPRESSIONS);
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
	 * This returns Concat.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Concat"));
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
		return getString("_UI_Concat_type");
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

		switch (notification.getFeatureID(Concat.class)) {
		case JenkinsPackage.CONCAT__EXPRESSIONS:
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

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.CONCAT__EXPRESSIONS,
				JenkinsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.CONCAT__EXPRESSIONS,
				JenkinsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.CONCAT__EXPRESSIONS,
				JenkinsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.CONCAT__EXPRESSIONS,
				JenkinsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.CONCAT__EXPRESSIONS,
				JenkinsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.CONCAT__EXPRESSIONS,
				JenkinsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.CONCAT__EXPRESSIONS,
				JenkinsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.CONCAT__EXPRESSIONS,
				JenkinsFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.CONCAT__EXPRESSIONS,
				JenkinsFactory.eINSTANCE.createEqualityOp()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.CONCAT__EXPRESSIONS,
				JenkinsFactory.eINSTANCE.createComparisonOp()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.CONCAT__EXPRESSIONS,
				JenkinsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(
				createChildParameter(JenkinsPackage.Literals.CONCAT__EXPRESSIONS, JenkinsFactory.eINSTANCE.createOr()));
	}

}