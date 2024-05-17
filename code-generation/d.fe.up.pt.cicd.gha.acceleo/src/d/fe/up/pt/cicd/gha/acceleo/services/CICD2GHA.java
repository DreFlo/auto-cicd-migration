package d.fe.up.pt.cicd.gha.acceleo.services;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import d.fe.up.pt.cicd.gha.metamodel.GHA.And;
import d.fe.up.pt.cicd.gha.metamodel.GHA.BinaryOp;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Comparison;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Equality;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Input;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Job;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Matrix;
import d.fe.up.pt.cicd.gha.metamodel.GHA.MatrixAxis;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Not;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Or;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Output;
import d.fe.up.pt.cicd.gha.metamodel.GHA.ScriptJob;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Step;
import d.fe.up.pt.cicd.gha.metamodel.GHA.UnaryOp;
import d.fe.up.pt.cicd.gha.metamodel.GHA.VariableDeclaration;
import d.fe.up.pt.cicd.gha.metamodel.GHA.WEBHOOK_ACTIVITY_TYPES;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Workflow;

public class CICD2GHA {
	public List<String> splitString(String string, String regex) {
		return List.of(string.split(regex));
	}
	
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
	
	public String quoteString(String string) {
		if (string.matches("^\"(?:\\.|[^\\\"])*\"$") || string.matches("^'(?:\\.|[^\\'])*'$")) {
			return string;
		} else {
			return "\"" + string.replaceAll("(?<!\\\\)\"", "\\\"") + "\"";
		}
	}
	
	public String generateVariableReference(VariableDeclaration variableDeclaration) {
		EObject current = variableDeclaration;
		
		while (true) {
			if (current == null)
				break;
			else if (current instanceof Step step)
				return generateStepVariableReference(variableDeclaration, step);
			else if (current instanceof Job job)
				return generateJobVariableReference(variableDeclaration, job);
			else if (current instanceof Workflow)
				return generateWorkflowVariableReference(variableDeclaration);
			
			current = current.eContainer();
		}
		
		return "<INVALID VARIABLE REFERENCE>";
	}
	
	public String generateStepVariableReference(VariableDeclaration variableDeclaration, Step step) {
		if (variableDeclaration.eContainingFeature().getFeatureID() == GHAPackage.VARIABLE_ASSIGNMENT__KEY)
			return generateStepReference(step) + ".env." + variableDeclaration.getName(); 
		return "<INVALID STEP VARIABLE REFERENCE>";
	}
	
	public String generateMatrixVariableReference(VariableDeclaration variableDeclaration) {
		return "matrix." + variableDeclaration.getName();
	}
	
	public String  generateJobVariableReference(VariableDeclaration variableDeclaration, Job job) {
		if (variableDeclaration.eContainer() instanceof MatrixAxis)
			return generateJobReference(job) + "." + generateMatrixVariableReference(variableDeclaration);
		else if (variableDeclaration.eContainer() instanceof Output)
			return generateJobReference(job) + ".outputs." + variableDeclaration.getName();
		else if (variableDeclaration.eContainingFeature().getFeatureID() == GHAPackage.VARIABLE_ASSIGNMENT__KEY)
			return generateJobReference(job) + ".env." + variableDeclaration.getName();
		return "<INVALID JOB VARIABLE REFERENCE>";
	}
	
	public String generateWorkflowVariableReference(VariableDeclaration variableDeclaration) {
		if (variableDeclaration.eContainer() instanceof Input)
			return "inputs." + variableDeclaration.getName();
		else if (variableDeclaration.eContainer() instanceof Output)
			return "outputs." + variableDeclaration.getName();
		else if (variableDeclaration.eContainingFeature().getFeatureID() == GHAPackage.VARIABLE_ASSIGNMENT__KEY)
			return "env." + variableDeclaration.getName();
		return "<INVALID WORKFLOW VARIABLE REFERENCE>";
	}
	
	public String generateJobReference(Job job) {
		return "jobs." + job.getName();
	}
	
	public String generateStepReference(Step step) {
		EObject current = step;
		while (!(current instanceof ScriptJob job)) {
			if (current == null)
				return "<INVALID STEP>";
		
			current = current.eContainer();
		}
		
		return generateJobReference(job) + "." + "steps." + job.getSteps().indexOf(step);
	}
	
	public String repeatString(String string, Integer n) {
		return string.repeat(n);
	}
	
	public String getEventTypeLiteral(WEBHOOK_ACTIVITY_TYPES eventType) {
		return eventType.getLiteral();
	}
}
