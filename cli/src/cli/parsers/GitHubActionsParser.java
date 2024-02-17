package cli.parsers;

import com.google.inject.Injector;

import d.fe.up.pt.cicd.gha.dsl.GitHubActionsStandaloneSetup;
import org.yaml.snakeyaml.Yaml;

public class GitHubActionsParser extends AbstractParser {
	@Override
	protected Injector getInjector() {
		return new GitHubActionsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	@Override
	protected String formatPipeline(String pipeline) {
		Yaml yaml = new Yaml();
		return yaml.dump(yaml.load(pipeline));
	}
}
