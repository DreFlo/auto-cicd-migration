/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.provider;

import d.fe.up.pt.cicd.metamodel.CICD.Artifact;
import d.fe.up.pt.cicd.metamodel.CICD.CICDFactory;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;

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
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Artifact} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactItemProvider extends NonConditionalStepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactItemProvider(AdapterFactory adapterFactory) {
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

			addStorePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Store feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStorePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Artifact_store_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Artifact_store_feature",
								"_UI_Artifact_type"),
						CICDPackage.Literals.ARTIFACT__STORE, true, false, false,
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
			childrenFeatures.add(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME);
			childrenFeatures.add(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS);
			childrenFeatures.add(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS);
			childrenFeatures.add(CICDPackage.Literals.ARTIFACT__RETENTION_TIME);
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
	 * This returns Artifact.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Artifact"));
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
		String label = ((Artifact) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Artifact_type")
				: getString("_UI_Artifact_type") + " " + label;
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

		switch (notification.getFeatureID(Artifact.class)) {
		case CICDPackage.ARTIFACT__STORE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case CICDPackage.ARTIFACT__ARTIFACT_NAME:
		case CICDPackage.ARTIFACT__INCLUDE_PATHS:
		case CICDPackage.ARTIFACT__EXCLUDE_PATHS:
		case CICDPackage.ARTIFACT__RETENTION_TIME:
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

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME,
				CICDFactory.eINSTANCE.create(CICDPackage.Literals.ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME,
				CICDFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME,
				CICDFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME,
				CICDFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME,
				CICDFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME,
				CICDFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME,
				CICDFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME,
				CICDFactory.eINSTANCE.createSecretVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME,
				CICDFactory.eINSTANCE.createVariableContext()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME,
				CICDFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME,
				CICDFactory.eINSTANCE.createBuiltInFunction()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME,
				CICDFactory.eINSTANCE.createEqualityOp()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME,
				CICDFactory.eINSTANCE.createComparisonOp()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME, CICDFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME, CICDFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME,
				CICDFactory.eINSTANCE.createUnaryOp()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME,
				CICDFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS,
				CICDFactory.eINSTANCE.create(CICDPackage.Literals.ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS,
				CICDFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS,
				CICDFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS,
				CICDFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS,
				CICDFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS,
				CICDFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS,
				CICDFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS,
				CICDFactory.eINSTANCE.createSecretVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS,
				CICDFactory.eINSTANCE.createVariableContext()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS,
				CICDFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS,
				CICDFactory.eINSTANCE.createBuiltInFunction()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS,
				CICDFactory.eINSTANCE.createEqualityOp()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS,
				CICDFactory.eINSTANCE.createComparisonOp()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS, CICDFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS, CICDFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS,
				CICDFactory.eINSTANCE.createUnaryOp()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS,
				CICDFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS,
				CICDFactory.eINSTANCE.create(CICDPackage.Literals.ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS,
				CICDFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS,
				CICDFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS,
				CICDFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS,
				CICDFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS,
				CICDFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS,
				CICDFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS,
				CICDFactory.eINSTANCE.createSecretVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS,
				CICDFactory.eINSTANCE.createVariableContext()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS,
				CICDFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS,
				CICDFactory.eINSTANCE.createBuiltInFunction()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS,
				CICDFactory.eINSTANCE.createEqualityOp()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS,
				CICDFactory.eINSTANCE.createComparisonOp()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS, CICDFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS, CICDFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS,
				CICDFactory.eINSTANCE.createUnaryOp()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS,
				CICDFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME,
				CICDFactory.eINSTANCE.create(CICDPackage.Literals.ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME,
				CICDFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME,
				CICDFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME,
				CICDFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME,
				CICDFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME,
				CICDFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME,
				CICDFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME,
				CICDFactory.eINSTANCE.createSecretVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME,
				CICDFactory.eINSTANCE.createVariableContext()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME,
				CICDFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME,
				CICDFactory.eINSTANCE.createBuiltInFunction()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME,
				CICDFactory.eINSTANCE.createEqualityOp()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME,
				CICDFactory.eINSTANCE.createComparisonOp()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME, CICDFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME, CICDFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME,
				CICDFactory.eINSTANCE.createUnaryOp()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.ARTIFACT__RETENTION_TIME,
				CICDFactory.eINSTANCE.createNegation()));
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

		boolean qualify = childFeature == CICDPackage.Literals.ARTIFACT__ARTIFACT_NAME
				|| childFeature == CICDPackage.Literals.ARTIFACT__INCLUDE_PATHS
				|| childFeature == CICDPackage.Literals.ARTIFACT__EXCLUDE_PATHS
				|| childFeature == CICDPackage.Literals.ARTIFACT__RETENTION_TIME;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
