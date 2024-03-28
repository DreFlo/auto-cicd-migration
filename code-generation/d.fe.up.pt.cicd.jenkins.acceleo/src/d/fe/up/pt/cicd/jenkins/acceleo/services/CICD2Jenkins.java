package d.fe.up.pt.cicd.jenkins.acceleo.services;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.And;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BinaryOp;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BooleanBuildStepParameter;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BuildStepParameter;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ComparisonOp;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CredentialsBuildStepParameter;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EqualityOp;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Negation;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Or;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.PasswordBuildStepParameter;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StringBuildStepParameter;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.TextBuildStepParameter;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.UnaryOp;

public class CICD2Jenkins {
	public String getBinaryOperator(BinaryOp binaryOp) {
		if (binaryOp instanceof ComparisonOp comparisonOp) {
			return comparisonOp.getOp().getLiteral();
		} else if (binaryOp instanceof EqualityOp equalityOp) {
			return equalityOp.getOp().getLiteral();
		} else if (binaryOp instanceof And) {
			return "&&";
		} else if (binaryOp instanceof Or) {
			 return "||";
		} else {
			return "<INVALID OP>";
		}
	}
	
	public String getUnaryOperator(UnaryOp unaryOp) {
		if (unaryOp instanceof Negation) {
			return "!";
		}
		else {
			return "<INVALID OP>";
		}
	}
	
	public String quoteString(String string) {
		if (string.matches("^\"(?:\\.|[^\\\"])*\"$") || string.matches("^'(?:\\.|[^\\'])*'$")) {
			return string;
		} else {
			return "'" + string + "'";
		}
	}
	
	public String getBuildStepParameterName(BuildStepParameter buildStepParameter) {
		if (buildStepParameter instanceof StringBuildStepParameter) {
			return "string";
		} else if (buildStepParameter instanceof TextBuildStepParameter) {
			return "text";
		} else if (buildStepParameter instanceof BooleanBuildStepParameter) {
			return "boolean";
		} else if (buildStepParameter instanceof CredentialsBuildStepParameter) {
			return "credentials";
		} else if (buildStepParameter instanceof PasswordBuildStepParameter) {
			return "password";
		} else {
			return "buildStepParameter";
		}
	}
}
