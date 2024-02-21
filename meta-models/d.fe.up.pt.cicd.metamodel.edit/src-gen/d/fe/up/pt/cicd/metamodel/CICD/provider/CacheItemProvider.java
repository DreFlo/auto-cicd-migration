/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.provider;

import d.fe.up.pt.cicd.metamodel.CICD.CICDFactory;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Cache;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Cache} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CacheItemProvider extends NonConditionalStepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CICDPackage.Literals.CACHE__CACHE_NAME);
			childrenFeatures.add(CICDPackage.Literals.CACHE__KEYS);
			childrenFeatures.add(CICDPackage.Literals.CACHE__PATHS);
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
	 * This returns Cache.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Cache"));
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
		String label = ((Cache) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Cache_type")
				: getString("_UI_Cache_type") + " " + label;
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

		switch (notification.getFeatureID(Cache.class)) {
		case CICDPackage.CACHE__CACHE_NAME:
		case CICDPackage.CACHE__KEYS:
		case CICDPackage.CACHE__PATHS:
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
				.add(createChildParameter(CICDPackage.Literals.CACHE__CACHE_NAME, CICDFactory.eINSTANCE.createValue()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__CACHE_NAME, CICDFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CACHE__CACHE_NAME,
				CICDFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CACHE__CACHE_NAME,
				CICDFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CACHE__CACHE_NAME,
				CICDFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__CACHE_NAME, CICDFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CACHE__CACHE_NAME,
				CICDFactory.eINSTANCE.createEnvironmentVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CACHE__CACHE_NAME,
				CICDFactory.eINSTANCE.createSecretVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CACHE__CACHE_NAME,
				CICDFactory.eINSTANCE.createBuiltInFunction()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__CACHE_NAME, CICDFactory.eINSTANCE.createBinaryOp()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__CACHE_NAME, CICDFactory.eINSTANCE.createConjuntion()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CACHE__CACHE_NAME,
				CICDFactory.eINSTANCE.createDisjunction()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__CACHE_NAME, CICDFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CACHE__CACHE_NAME,
				CICDFactory.eINSTANCE.createSubtraction()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__CACHE_NAME, CICDFactory.eINSTANCE.createUnaryOp()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__CACHE_NAME, CICDFactory.eINSTANCE.createNegation()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__KEYS, CICDFactory.eINSTANCE.createValue()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__KEYS, CICDFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__KEYS, CICDFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__KEYS, CICDFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__KEYS, CICDFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__KEYS, CICDFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CACHE__KEYS,
				CICDFactory.eINSTANCE.createEnvironmentVariable()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__KEYS, CICDFactory.eINSTANCE.createSecretVariable()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__KEYS, CICDFactory.eINSTANCE.createBuiltInFunction()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__KEYS, CICDFactory.eINSTANCE.createBinaryOp()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__KEYS, CICDFactory.eINSTANCE.createConjuntion()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__KEYS, CICDFactory.eINSTANCE.createDisjunction()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__KEYS, CICDFactory.eINSTANCE.createAddition()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__KEYS, CICDFactory.eINSTANCE.createSubtraction()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__KEYS, CICDFactory.eINSTANCE.createUnaryOp()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__KEYS, CICDFactory.eINSTANCE.createNegation()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__PATHS, CICDFactory.eINSTANCE.createValue()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__PATHS, CICDFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__PATHS, CICDFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__PATHS, CICDFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__PATHS, CICDFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__PATHS, CICDFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CACHE__PATHS,
				CICDFactory.eINSTANCE.createEnvironmentVariable()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__PATHS, CICDFactory.eINSTANCE.createSecretVariable()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__PATHS, CICDFactory.eINSTANCE.createBuiltInFunction()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__PATHS, CICDFactory.eINSTANCE.createBinaryOp()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__PATHS, CICDFactory.eINSTANCE.createConjuntion()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__PATHS, CICDFactory.eINSTANCE.createDisjunction()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__PATHS, CICDFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CACHE__PATHS, CICDFactory.eINSTANCE.createSubtraction()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__PATHS, CICDFactory.eINSTANCE.createUnaryOp()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CACHE__PATHS, CICDFactory.eINSTANCE.createNegation()));
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

		boolean qualify = childFeature == CICDPackage.Literals.CACHE__CACHE_NAME
				|| childFeature == CICDPackage.Literals.CACHE__KEYS
				|| childFeature == CICDPackage.Literals.CACHE__PATHS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
