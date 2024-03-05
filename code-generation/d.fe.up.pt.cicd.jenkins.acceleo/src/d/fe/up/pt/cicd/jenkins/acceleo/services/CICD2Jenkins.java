package d.fe.up.pt.cicd.jenkins.acceleo.services;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.And;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BinaryOp;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ComparisonOp;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EqualityOp;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Negation;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Or;
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
		return string.isEmpty() ? "''" : string.replaceAll("^|$", "\'");
	}
}
