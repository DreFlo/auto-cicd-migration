/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.provider;

import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsFactory;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage;

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
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationSetItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationSetItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TransformationsPackage.Literals.TRANSFORMATION_SET__PRE_TIM);
			childrenFeatures.add(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM);
			childrenFeatures.add(TransformationsPackage.Literals.TRANSFORMATION_SET__POST_TIM);
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
	 * This returns TransformationSet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TransformationSet"));
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
		return getString("_UI_TransformationSet_type");
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

		switch (notification.getFeatureID(TransformationSet.class)) {
		case TransformationsPackage.TRANSFORMATION_SET__PRE_TIM:
		case TransformationsPackage.TRANSFORMATION_SET__ON_TIM:
		case TransformationsPackage.TRANSFORMATION_SET__POST_TIM:
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

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__PRE_TIM,
				TransformationsFactory.eINSTANCE.createATLScript()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__PRE_TIM,
				TransformationsFactory.eINSTANCE.createAddOrbReferenceExecutor()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__PRE_TIM,
				TransformationsFactory.eINSTANCE.createSetCircleCIVersion()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__PRE_TIM,
				TransformationsFactory.eINSTANCE.createSelectWorkflow()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM,
				TransformationsFactory.eINSTANCE.createATLScript()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM,
				TransformationsFactory.eINSTANCE.createChangePlugin()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM,
				TransformationsFactory.eINSTANCE.createReplaceAgentLabels()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM,
				TransformationsFactory.eINSTANCE.createAddTrigger()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM,
				TransformationsFactory.eINSTANCE.createJobTransformation()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM,
				TransformationsFactory.eINSTANCE.createEditStep()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM,
				TransformationsFactory.eINSTANCE.createNewStep()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM,
				TransformationsFactory.eINSTANCE.createReplaceStep()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM,
				TransformationsFactory.eINSTANCE.createAddStep()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM,
				TransformationsFactory.eINSTANCE.createDeleteStep()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM,
				TransformationsFactory.eINSTANCE.createAddPorts()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM,
				TransformationsFactory.eINSTANCE.createSetOptions()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM,
				TransformationsFactory.eINSTANCE.createChangeImage()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM,
				TransformationsFactory.eINSTANCE.createAddOrbReferenceExecutor()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM,
				TransformationsFactory.eINSTANCE.createSetCircleCIVersion()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM,
				TransformationsFactory.eINSTANCE.createSelectWorkflow()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__POST_TIM,
				TransformationsFactory.eINSTANCE.createATLScript()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__POST_TIM,
				TransformationsFactory.eINSTANCE.createAddOrbReferenceExecutor()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__POST_TIM,
				TransformationsFactory.eINSTANCE.createSetCircleCIVersion()));

		newChildDescriptors.add(createChildParameter(TransformationsPackage.Literals.TRANSFORMATION_SET__POST_TIM,
				TransformationsFactory.eINSTANCE.createSelectWorkflow()));
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

		boolean qualify = childFeature == TransformationsPackage.Literals.TRANSFORMATION_SET__PRE_TIM
				|| childFeature == TransformationsPackage.Literals.TRANSFORMATION_SET__ON_TIM
				|| childFeature == TransformationsPackage.Literals.TRANSFORMATION_SET__POST_TIM;

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
		return TransformationsEditPlugin.INSTANCE;
	}

}
