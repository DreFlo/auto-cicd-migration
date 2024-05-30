package d.fe.up.pt.cicd.circleci.acceleo.services;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDeclaration;
import java.util.List;

public class CICD2CircleCI {
	public List<String> splitString(String string, String regex) {
		return List.of(string.split(regex));
	}
	
	public String logString(String string) {
		System.out.println(string);
		return string;
	}
	
	public String quoteString(String string) {
		if (string.matches("^\"(?:\\\\.|[^\\\"])*\"$") || string.matches("^'(?:\\\\.|[^\\'])*'$")) {
			return string;
		} else {
			return "\"" + string.replaceAll("(?<!\\\\)\"", "\\\\\"").replaceAll("(?<!\\\\)\\\\(?!\\\\)", "\\\\") + "\"";
		}
	}
	
	public String generateVariableReference(VariableDeclaration variableDeclaration, boolean inQuotes) {
		if (isEnvironmentVariable(variableDeclaration))
			return "${" + getVariableName(variableDeclaration) + "}";
		return (inQuotes ? "<< " : "") + getReferenceString(variableDeclaration) + (inQuotes ? " >>" : "");
	}
	
	private boolean isEnvironmentVariable(VariableDeclaration variableDeclaration) {
		if (variableDeclaration.eContainer() instanceof Environment environment) {
			return environment.getEnvironmentVariables().keySet().contains(variableDeclaration);
		}
		return false;
	}
	
	private String getReferenceString(VariableDeclaration variableDeclaration) {
		// TODO
		if (variableDeclaration.eContainer() instanceof Parameter parameter)
			return getParameter(parameter);
		return variableDeclaration.getName();
	}
	
	private String getParameter(Parameter parameter) {
		if (parameter.eContainer() instanceof Job)
			return "parameters." + getVariableName(parameter.getName());
		else if (parameter.eContainer() instanceof Pipeline)
			return "pipeline.parameters." + getVariableName(parameter.getName());
		return getVariableName(parameter.getName());
	}
	
	private String getVariableName(VariableDeclaration variableDeclaration) {
		return variableDeclaration.getName();
	}
}
