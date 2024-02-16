package cli.parsers;

import com.google.inject.Injector;

import d.fe.up.pt.cicd.gha.GitHubActionsStandaloneSetup;

public class GitHubActionsParser extends AbstractParser {
	@Override
	protected Injector getInjector() {
		return new GitHubActionsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
