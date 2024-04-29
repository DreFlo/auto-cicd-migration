package cli.mergers.policies.match;

import d.fe.up.pt.cicd.metamodel.CICD.Command;
import d.fe.up.pt.cicd.metamodel.CICD.Job;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.diffmerge.generic.api.scopes.ITreeDataScope;
import org.eclipse.emf.diffmerge.impl.policies.DefaultMatchPolicy;
import org.eclipse.emf.ecore.EObject;

public class CICDMatchPolicy extends DefaultMatchPolicy {
    @Override
    public Object getMatchID(EObject element_p, ITreeDataScope<EObject> scope_p) {
        if (element_p instanceof Pipeline) {
            return Pipeline.class;
        }
        else if (element_p instanceof Job job) {
            return job.getId();
        } else if (element_p instanceof Command command) {
            return command.getProgram();
        }
        return super.getMatchID(element_p, scope_p);
    }
}
