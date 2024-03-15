package d.fe.up.pt.cicd.gha.acceleo.services;

import d.fe.up.pt.cicd.gha.metamodel.GHA.And;
import d.fe.up.pt.cicd.gha.metamodel.GHA.BinaryOp;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Comparison;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Equality;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Not;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Or;
import d.fe.up.pt.cicd.gha.metamodel.GHA.UnaryOp;

public class CICD2GHA {
	public String getBinaryOperator(BinaryOp binaryOp) {
		if (binaryOp instanceof Comparison comparisonOp) {
			return comparisonOp.getOp().getLiteral();
		} else if (binaryOp instanceof Equality equalityOp) {
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
		if (unaryOp instanceof Not) {
			return "!";
		}
		else {
			return "<INVALID OP>";
		}
	}
}
