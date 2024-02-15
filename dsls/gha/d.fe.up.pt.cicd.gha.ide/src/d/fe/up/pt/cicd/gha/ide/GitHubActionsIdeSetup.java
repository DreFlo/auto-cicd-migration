/*
 * generated by Xtext 2.33.0
 */
package d.fe.up.pt.cicd.gha.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import d.fe.up.pt.cicd.gha.GitHubActionsRuntimeModule;
import d.fe.up.pt.cicd.gha.GitHubActionsStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class GitHubActionsIdeSetup extends GitHubActionsStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new GitHubActionsRuntimeModule(), new GitHubActionsIdeModule()));
	}
	
}
