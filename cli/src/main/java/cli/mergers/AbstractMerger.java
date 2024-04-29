package cli.mergers;

import cli.mergers.policies.diff.CICDDiffPolicy;
import cli.mergers.policies.match.CICDMatchPolicy;
import cli.mergers.policies.merge.CICDMergePolicy;
import cli.utils.EMFUtils;
import cli.utils.JavaUtils;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.diffdata.EComparison;
import org.eclipse.emf.diffmerge.diffdata.impl.EComparisonImpl;
import org.eclipse.emf.diffmerge.generic.api.IComparison;
import org.eclipse.emf.diffmerge.generic.api.IMatch;
import org.eclipse.emf.diffmerge.generic.api.Role;
import org.eclipse.emf.diffmerge.generic.api.diff.IDifference;
import org.eclipse.emf.diffmerge.generic.impl.policies.DefaultDiffPolicy;
import org.eclipse.emf.diffmerge.generic.impl.policies.DefaultMatchPolicy;
import org.eclipse.emf.diffmerge.generic.impl.policies.DefaultMergePolicy;
import org.eclipse.emf.diffmerge.impl.scopes.FragmentedModelScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.epsilon.eml.EmlModule;
import org.eclipse.epsilon.eml.IEmlModule;

import java.nio.file.Path;
import java.util.Collection;
import java.util.List;

public class AbstractMerger<Model extends EObject, Package extends EPackage> {
    private final ResourceSet resourceSet;
    private final Package ePackage;

    protected AbstractMerger(ResourceSet resourceSet, Package ePackage) {
        this.resourceSet = resourceSet;
        this.ePackage = ePackage;
        checkRegistry();
    }

    public Model merge(Model model1, Model model2) {
//        Resource resource1 = createResource(model1);
//        Resource resource2 = createResource(model2);
//        IEditableModelScope scope1 = new FragmentedModelScope(resource1, false);
//        IEditableModelScope scope2 = new FragmentedModelScope(resource2, false);
//
//        EComparison comparison = new EComparisonImpl(scope1, scope2);
//        comparison.compute(
//                new CICDMatchPolicy(),
//                new CICDDiffPolicy(),
//                new CICDMergePolicy(),
//                new NullProgressMonitor()
//        );
//
//        Collection<IDifference<EObject>> merged = comparison.merge(Role.TARGET, true, new NullProgressMonitor());
//
//        System.out.println(merged.size());
//
//        return (Model) resource1.getContents().get(0);
        IEmlModule module = new EmlModule();
        module.getContext().getModelRepository().addModel();
    }

    private Resource createResource(Model model) {
        String tempDir = "intermediate";
        String randomName = JavaUtils.getRandomName() + ".xmi";
        String filePath = Path.of(tempDir, randomName).toString();

        return EMFUtils.createResource(model, filePath, resourceSet);
    }

    protected final void checkRegistry() {
        EMFUtils.registerPackages(getResourceSet(), getPackage());
    }

    public Package getPackage() {
        return ePackage;
    }

    public ResourceSet getResourceSet() {
        return resourceSet;
    }
}
