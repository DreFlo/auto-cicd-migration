/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.provider;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsFactory;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;

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
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractStageItemProvider extends AbstractPipelineExecutionBlockItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStageItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addWhensPropertyDescriptor(object);
			addWhenEvaluationTimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AbstractStage_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AbstractStage_name_feature",
								"_UI_AbstractStage_type"),
						JenkinsPackage.Literals.ABSTRACT_STAGE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Whens feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhensPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AbstractStage_whens_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AbstractStage_whens_feature",
								"_UI_AbstractStage_type"),
						JenkinsPackage.Literals.ABSTRACT_STAGE__WHENS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the When Evaluation Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhenEvaluationTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AbstractStage_whenEvaluationTime_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AbstractStage_whenEvaluationTime_feature",
								"_UI_AbstractStage_type"),
						JenkinsPackage.Literals.ABSTRACT_STAGE__WHEN_EVALUATION_TIME, true, false, false,
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
			childrenFeatures.add(JenkinsPackage.Literals.ABSTRACT_STAGE__AGENT);
			childrenFeatures.add(JenkinsPackage.Literals.ABSTRACT_STAGE__CONDITIONS);
			childrenFeatures.add(JenkinsPackage.Literals.ABSTRACT_STAGE__ENVIRONMENT_VARIABLES);
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
		String label = ((AbstractStage) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_AbstractStage_type")
				: getString("_UI_AbstractStage_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractStage.class)) {
		case JenkinsPackage.ABSTRACT_STAGE__NAME:
		case JenkinsPackage.ABSTRACT_STAGE__WHEN_EVALUATION_TIME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case JenkinsPackage.ABSTRACT_STAGE__AGENT:
		case JenkinsPackage.ABSTRACT_STAGE__CONDITIONS:
		case JenkinsPackage.ABSTRACT_STAGE__ENVIRONMENT_VARIABLES:
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

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__AGENT,
				JenkinsFactory.eINSTANCE.createNoneAgent()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__AGENT,
				JenkinsFactory.eINSTANCE.createAnyAgent()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__AGENT,
				JenkinsFactory.eINSTANCE.createLabelAgent()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__AGENT,
				JenkinsFactory.eINSTANCE.createNodeAgent()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__AGENT,
				JenkinsFactory.eINSTANCE.createDockerAgent()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__CONDITIONS,
				JenkinsFactory.eINSTANCE.createWhenBranch()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__CONDITIONS,
				JenkinsFactory.eINSTANCE.createWhenChangeset()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__CONDITIONS,
				JenkinsFactory.eINSTANCE.createWhenTag()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__CONDITIONS,
				JenkinsFactory.eINSTANCE.createWhenChangeRequest()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__CONDITIONS,
				JenkinsFactory.eINSTANCE.createWhenBuildingTag()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__CONDITIONS,
				JenkinsFactory.eINSTANCE.createWhenChangelog()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__CONDITIONS,
				JenkinsFactory.eINSTANCE.createWhenEquals()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__CONDITIONS,
				JenkinsFactory.eINSTANCE.createWhenEnvironment()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__CONDITIONS,
				JenkinsFactory.eINSTANCE.createWhenExpression()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__CONDITIONS,
				JenkinsFactory.eINSTANCE.createSingleNestedWhen()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__CONDITIONS,
				JenkinsFactory.eINSTANCE.createMultipleNestedWhen()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__CONDITIONS,
				JenkinsFactory.eINSTANCE.createWhenNot()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__CONDITIONS,
				JenkinsFactory.eINSTANCE.createWhenAnyOf()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__CONDITIONS,
				JenkinsFactory.eINSTANCE.createWhenAllOf()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__CONDITIONS,
				JenkinsFactory.eINSTANCE.createWhenTriggeredBy()));

		newChildDescriptors.add(createChildParameter(JenkinsPackage.Literals.ABSTRACT_STAGE__ENVIRONMENT_VARIABLES,
				JenkinsFactory.eINSTANCE.create(JenkinsPackage.Literals.ASSIGNMENT)));
	}

}
