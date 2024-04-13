/*
 * generated by Xtext 2.33.0
 */
package d.fe.up.pt.cicd.gha.dsl.serializer;

import com.google.inject.Inject;
import d.fe.up.pt.cicd.gha.dsl.services.GitHubActionsGrammarAccess;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Always;
import d.fe.up.pt.cicd.gha.metamodel.GHA.And;
import d.fe.up.pt.cicd.gha.metamodel.GHA.BooleanLiteral;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Cancelled;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Comparison;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Contains;
import d.fe.up.pt.cicd.gha.metamodel.GHA.DotOp;
import d.fe.up.pt.cicd.gha.metamodel.GHA.DoubleLiteral;
import d.fe.up.pt.cicd.gha.metamodel.GHA.EndsWith;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Equality;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Failure;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Format;
import d.fe.up.pt.cicd.gha.metamodel.GHA.FromJSON;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GitHubContext;
import d.fe.up.pt.cicd.gha.metamodel.GHA.HashFiles;
import d.fe.up.pt.cicd.gha.metamodel.GHA.IntegerLiteral;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Join;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Not;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Or;
import d.fe.up.pt.cicd.gha.metamodel.GHA.StartsWith;
import d.fe.up.pt.cicd.gha.metamodel.GHA.StringLiteral;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Success;
import d.fe.up.pt.cicd.gha.metamodel.GHA.ToJSON;
import d.fe.up.pt.cicd.gha.metamodel.GHA.VariableReference;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GitHubActionsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GitHubActionsGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GHAPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GHAPackage.ALWAYS:
				sequence_Always(context, (Always) semanticObject); 
				return; 
			case GHAPackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case GHAPackage.BOOLEAN_LITERAL:
				sequence_Atomic(context, (BooleanLiteral) semanticObject); 
				return; 
			case GHAPackage.CANCELLED:
				sequence_Cancelled(context, (Cancelled) semanticObject); 
				return; 
			case GHAPackage.COMPARISON:
				sequence_Comparison(context, (Comparison) semanticObject); 
				return; 
			case GHAPackage.CONTAINS:
				sequence_Contains(context, (Contains) semanticObject); 
				return; 
			case GHAPackage.DOT_OP:
				sequence_VariableDereference(context, (DotOp) semanticObject); 
				return; 
			case GHAPackage.DOUBLE_LITERAL:
				sequence_Atomic(context, (DoubleLiteral) semanticObject); 
				return; 
			case GHAPackage.ENDS_WITH:
				sequence_EndsWith(context, (EndsWith) semanticObject); 
				return; 
			case GHAPackage.EQUALITY:
				sequence_Equality(context, (Equality) semanticObject); 
				return; 
			case GHAPackage.FAILURE:
				sequence_Failure(context, (Failure) semanticObject); 
				return; 
			case GHAPackage.FORMAT:
				sequence_Format(context, (Format) semanticObject); 
				return; 
			case GHAPackage.FROM_JSON:
				sequence_FromJSON(context, (FromJSON) semanticObject); 
				return; 
			case GHAPackage.GIT_HUB_CONTEXT:
				sequence_Atomic(context, (GitHubContext) semanticObject); 
				return; 
			case GHAPackage.HASH_FILES:
				sequence_HashFiles(context, (HashFiles) semanticObject); 
				return; 
			case GHAPackage.INTEGER_LITERAL:
				sequence_Atomic(context, (IntegerLiteral) semanticObject); 
				return; 
			case GHAPackage.JOIN:
				sequence_Join(context, (Join) semanticObject); 
				return; 
			case GHAPackage.NOT:
				sequence_Not(context, (Not) semanticObject); 
				return; 
			case GHAPackage.OR:
				sequence_Or(context, (Or) semanticObject); 
				return; 
			case GHAPackage.STARTS_WITH:
				sequence_StartsWith(context, (StartsWith) semanticObject); 
				return; 
			case GHAPackage.STRING_LITERAL:
				sequence_Atomic(context, (StringLiteral) semanticObject); 
				return; 
			case GHAPackage.SUCCESS:
				sequence_Success(context, (Success) semanticObject); 
				return; 
			case GHAPackage.TO_JSON:
				sequence_ToJSON(context, (ToJSON) semanticObject); 
				return; 
			case GHAPackage.VARIABLE_REFERENCE:
				sequence_Atomic(context, (VariableReference) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Always
	 *     Or returns Always
	 *     Or.Or_1_0 returns Always
	 *     And returns Always
	 *     And.And_1_0 returns Always
	 *     Equality returns Always
	 *     Equality.Equality_1_0 returns Always
	 *     Comparison returns Always
	 *     Comparison.Comparison_1_0 returns Always
	 *     UnaryOp returns Always
	 *     Blank returns Always
	 *     VariableDereference returns Always
	 *     VariableDereference.DotOp_1_0 returns Always
	 *     Primary returns Always
	 *     CallExpression returns Always
	 *     Always returns Always
	 *
	 * Constraint:
	 *     {Always}
	 * </pre>
	 */
	protected void sequence_Always(ISerializationContext context, Always semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns And
	 *     Or returns And
	 *     Or.Or_1_0 returns And
	 *     And returns And
	 *     And.And_1_0 returns And
	 *     Equality returns And
	 *     Equality.Equality_1_0 returns And
	 *     Comparison returns And
	 *     Comparison.Comparison_1_0 returns And
	 *     UnaryOp returns And
	 *     Blank returns And
	 *     VariableDereference returns And
	 *     VariableDereference.DotOp_1_0 returns And
	 *     Primary returns And
	 *
	 * Constraint:
	 *     (lhs=And_And_1_0 rhs=Equality)
	 * </pre>
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.BINARY_OP__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.BINARY_OP__LHS));
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.BINARY_OP__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.BINARY_OP__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndAccess().getAndLhsAction_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getAndAccess().getRhsEqualityParserRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns BooleanLiteral
	 *     Or returns BooleanLiteral
	 *     Or.Or_1_0 returns BooleanLiteral
	 *     And returns BooleanLiteral
	 *     And.And_1_0 returns BooleanLiteral
	 *     Equality returns BooleanLiteral
	 *     Equality.Equality_1_0 returns BooleanLiteral
	 *     Comparison returns BooleanLiteral
	 *     Comparison.Comparison_1_0 returns BooleanLiteral
	 *     UnaryOp returns BooleanLiteral
	 *     Blank returns BooleanLiteral
	 *     VariableDereference returns BooleanLiteral
	 *     VariableDereference.DotOp_1_0 returns BooleanLiteral
	 *     Primary returns BooleanLiteral
	 *     Atomic returns BooleanLiteral
	 *
	 * Constraint:
	 *     value=BOOLEAN
	 * </pre>
	 */
	protected void sequence_Atomic(ISerializationContext context, BooleanLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.BOOLEAN_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.BOOLEAN_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueBOOLEANTerminalRuleCall_4_1_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns DoubleLiteral
	 *     Or returns DoubleLiteral
	 *     Or.Or_1_0 returns DoubleLiteral
	 *     And returns DoubleLiteral
	 *     And.And_1_0 returns DoubleLiteral
	 *     Equality returns DoubleLiteral
	 *     Equality.Equality_1_0 returns DoubleLiteral
	 *     Comparison returns DoubleLiteral
	 *     Comparison.Comparison_1_0 returns DoubleLiteral
	 *     UnaryOp returns DoubleLiteral
	 *     Blank returns DoubleLiteral
	 *     VariableDereference returns DoubleLiteral
	 *     VariableDereference.DotOp_1_0 returns DoubleLiteral
	 *     Primary returns DoubleLiteral
	 *     Atomic returns DoubleLiteral
	 *
	 * Constraint:
	 *     value=DOUBLE
	 * </pre>
	 */
	protected void sequence_Atomic(ISerializationContext context, DoubleLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.DOUBLE_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.DOUBLE_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_3_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns GitHubContext
	 *     Or returns GitHubContext
	 *     Or.Or_1_0 returns GitHubContext
	 *     And returns GitHubContext
	 *     And.And_1_0 returns GitHubContext
	 *     Equality returns GitHubContext
	 *     Equality.Equality_1_0 returns GitHubContext
	 *     Comparison returns GitHubContext
	 *     Comparison.Comparison_1_0 returns GitHubContext
	 *     UnaryOp returns GitHubContext
	 *     Blank returns GitHubContext
	 *     VariableDereference returns GitHubContext
	 *     VariableDereference.DotOp_1_0 returns GitHubContext
	 *     Primary returns GitHubContext
	 *     Atomic returns GitHubContext
	 *
	 * Constraint:
	 *     context=CONTEXT
	 * </pre>
	 */
	protected void sequence_Atomic(ISerializationContext context, GitHubContext semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.GIT_HUB_CONTEXT__CONTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.GIT_HUB_CONTEXT__CONTEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getContextCONTEXTEnumRuleCall_0_1_0(), semanticObject.getContext());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns IntegerLiteral
	 *     Or returns IntegerLiteral
	 *     Or.Or_1_0 returns IntegerLiteral
	 *     And returns IntegerLiteral
	 *     And.And_1_0 returns IntegerLiteral
	 *     Equality returns IntegerLiteral
	 *     Equality.Equality_1_0 returns IntegerLiteral
	 *     Comparison returns IntegerLiteral
	 *     Comparison.Comparison_1_0 returns IntegerLiteral
	 *     UnaryOp returns IntegerLiteral
	 *     Blank returns IntegerLiteral
	 *     VariableDereference returns IntegerLiteral
	 *     VariableDereference.DotOp_1_0 returns IntegerLiteral
	 *     Primary returns IntegerLiteral
	 *     Atomic returns IntegerLiteral
	 *
	 * Constraint:
	 *     value=INT
	 * </pre>
	 */
	protected void sequence_Atomic(ISerializationContext context, IntegerLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.INTEGER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.INTEGER_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns StringLiteral
	 *     Or returns StringLiteral
	 *     Or.Or_1_0 returns StringLiteral
	 *     And returns StringLiteral
	 *     And.And_1_0 returns StringLiteral
	 *     Equality returns StringLiteral
	 *     Equality.Equality_1_0 returns StringLiteral
	 *     Comparison returns StringLiteral
	 *     Comparison.Comparison_1_0 returns StringLiteral
	 *     UnaryOp returns StringLiteral
	 *     Blank returns StringLiteral
	 *     VariableDereference returns StringLiteral
	 *     VariableDereference.DotOp_1_0 returns StringLiteral
	 *     Primary returns StringLiteral
	 *     Atomic returns StringLiteral
	 *
	 * Constraint:
	 *     value=STRING
	 * </pre>
	 */
	protected void sequence_Atomic(ISerializationContext context, StringLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.STRING_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_5_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns VariableReference
	 *     Or returns VariableReference
	 *     Or.Or_1_0 returns VariableReference
	 *     And returns VariableReference
	 *     And.And_1_0 returns VariableReference
	 *     Equality returns VariableReference
	 *     Equality.Equality_1_0 returns VariableReference
	 *     Comparison returns VariableReference
	 *     Comparison.Comparison_1_0 returns VariableReference
	 *     UnaryOp returns VariableReference
	 *     Blank returns VariableReference
	 *     VariableDereference returns VariableReference
	 *     VariableDereference.DotOp_1_0 returns VariableReference
	 *     Primary returns VariableReference
	 *     Atomic returns VariableReference
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Atomic(ISerializationContext context, VariableReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.VARIABLE_REFERENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.VARIABLE_REFERENCE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getNameIDTerminalRuleCall_1_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Cancelled
	 *     Or returns Cancelled
	 *     Or.Or_1_0 returns Cancelled
	 *     And returns Cancelled
	 *     And.And_1_0 returns Cancelled
	 *     Equality returns Cancelled
	 *     Equality.Equality_1_0 returns Cancelled
	 *     Comparison returns Cancelled
	 *     Comparison.Comparison_1_0 returns Cancelled
	 *     UnaryOp returns Cancelled
	 *     Blank returns Cancelled
	 *     VariableDereference returns Cancelled
	 *     VariableDereference.DotOp_1_0 returns Cancelled
	 *     Primary returns Cancelled
	 *     CallExpression returns Cancelled
	 *     Cancelled returns Cancelled
	 *
	 * Constraint:
	 *     {Cancelled}
	 * </pre>
	 */
	protected void sequence_Cancelled(ISerializationContext context, Cancelled semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Comparison
	 *     Or returns Comparison
	 *     Or.Or_1_0 returns Comparison
	 *     And returns Comparison
	 *     And.And_1_0 returns Comparison
	 *     Equality returns Comparison
	 *     Equality.Equality_1_0 returns Comparison
	 *     Comparison returns Comparison
	 *     Comparison.Comparison_1_0 returns Comparison
	 *     UnaryOp returns Comparison
	 *     Blank returns Comparison
	 *     VariableDereference returns Comparison
	 *     VariableDereference.DotOp_1_0 returns Comparison
	 *     Primary returns Comparison
	 *
	 * Constraint:
	 *     (lhs=Comparison_Comparison_1_0 op=COMPARISON_OP rhs=UnaryOp)
	 * </pre>
	 */
	protected void sequence_Comparison(ISerializationContext context, Comparison semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.BINARY_OP__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.BINARY_OP__LHS));
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.COMPARISON__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.COMPARISON__OP));
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.BINARY_OP__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.BINARY_OP__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparisonAccess().getComparisonLhsAction_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getComparisonAccess().getOpCOMPARISON_OPEnumRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getComparisonAccess().getRhsUnaryOpParserRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Contains
	 *     Or returns Contains
	 *     Or.Or_1_0 returns Contains
	 *     And returns Contains
	 *     And.And_1_0 returns Contains
	 *     Equality returns Contains
	 *     Equality.Equality_1_0 returns Contains
	 *     Comparison returns Contains
	 *     Comparison.Comparison_1_0 returns Contains
	 *     UnaryOp returns Contains
	 *     Blank returns Contains
	 *     VariableDereference returns Contains
	 *     VariableDereference.DotOp_1_0 returns Contains
	 *     Primary returns Contains
	 *     CallExpression returns Contains
	 *     Contains returns Contains
	 *
	 * Constraint:
	 *     (search=Expression item=Expression)
	 * </pre>
	 */
	protected void sequence_Contains(ISerializationContext context, Contains semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.CONTAINS__SEARCH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.CONTAINS__SEARCH));
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.CONTAINS__ITEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.CONTAINS__ITEM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContainsAccess().getSearchExpressionParserRuleCall_2_0(), semanticObject.getSearch());
		feeder.accept(grammarAccess.getContainsAccess().getItemExpressionParserRuleCall_4_0(), semanticObject.getItem());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns EndsWith
	 *     Or returns EndsWith
	 *     Or.Or_1_0 returns EndsWith
	 *     And returns EndsWith
	 *     And.And_1_0 returns EndsWith
	 *     Equality returns EndsWith
	 *     Equality.Equality_1_0 returns EndsWith
	 *     Comparison returns EndsWith
	 *     Comparison.Comparison_1_0 returns EndsWith
	 *     UnaryOp returns EndsWith
	 *     Blank returns EndsWith
	 *     VariableDereference returns EndsWith
	 *     VariableDereference.DotOp_1_0 returns EndsWith
	 *     Primary returns EndsWith
	 *     CallExpression returns EndsWith
	 *     EndsWith returns EndsWith
	 *
	 * Constraint:
	 *     (searchString=Expression searchValue=Expression)
	 * </pre>
	 */
	protected void sequence_EndsWith(ISerializationContext context, EndsWith semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.ENDS_WITH__SEARCH_STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.ENDS_WITH__SEARCH_STRING));
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.ENDS_WITH__SEARCH_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.ENDS_WITH__SEARCH_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEndsWithAccess().getSearchStringExpressionParserRuleCall_2_0(), semanticObject.getSearchString());
		feeder.accept(grammarAccess.getEndsWithAccess().getSearchValueExpressionParserRuleCall_4_0(), semanticObject.getSearchValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Equality
	 *     Or returns Equality
	 *     Or.Or_1_0 returns Equality
	 *     And returns Equality
	 *     And.And_1_0 returns Equality
	 *     Equality returns Equality
	 *     Equality.Equality_1_0 returns Equality
	 *     Comparison returns Equality
	 *     Comparison.Comparison_1_0 returns Equality
	 *     UnaryOp returns Equality
	 *     Blank returns Equality
	 *     VariableDereference returns Equality
	 *     VariableDereference.DotOp_1_0 returns Equality
	 *     Primary returns Equality
	 *
	 * Constraint:
	 *     (lhs=Equality_Equality_1_0 op=EQUALITY_OP rhs=Comparison)
	 * </pre>
	 */
	protected void sequence_Equality(ISerializationContext context, Equality semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.BINARY_OP__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.BINARY_OP__LHS));
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.EQUALITY__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.EQUALITY__OP));
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.BINARY_OP__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.BINARY_OP__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEqualityAccess().getEqualityLhsAction_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getEqualityAccess().getOpEQUALITY_OPEnumRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getEqualityAccess().getRhsComparisonParserRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Failure
	 *     Or returns Failure
	 *     Or.Or_1_0 returns Failure
	 *     And returns Failure
	 *     And.And_1_0 returns Failure
	 *     Equality returns Failure
	 *     Equality.Equality_1_0 returns Failure
	 *     Comparison returns Failure
	 *     Comparison.Comparison_1_0 returns Failure
	 *     UnaryOp returns Failure
	 *     Blank returns Failure
	 *     VariableDereference returns Failure
	 *     VariableDereference.DotOp_1_0 returns Failure
	 *     Primary returns Failure
	 *     CallExpression returns Failure
	 *     Failure returns Failure
	 *
	 * Constraint:
	 *     {Failure}
	 * </pre>
	 */
	protected void sequence_Failure(ISerializationContext context, Failure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Format
	 *     Or returns Format
	 *     Or.Or_1_0 returns Format
	 *     And returns Format
	 *     And.And_1_0 returns Format
	 *     Equality returns Format
	 *     Equality.Equality_1_0 returns Format
	 *     Comparison returns Format
	 *     Comparison.Comparison_1_0 returns Format
	 *     UnaryOp returns Format
	 *     Blank returns Format
	 *     VariableDereference returns Format
	 *     VariableDereference.DotOp_1_0 returns Format
	 *     Primary returns Format
	 *     CallExpression returns Format
	 *     Format returns Format
	 *
	 * Constraint:
	 *     (string=Expression replaceValues+=Expression*)
	 * </pre>
	 */
	protected void sequence_Format(ISerializationContext context, Format semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns FromJSON
	 *     Or returns FromJSON
	 *     Or.Or_1_0 returns FromJSON
	 *     And returns FromJSON
	 *     And.And_1_0 returns FromJSON
	 *     Equality returns FromJSON
	 *     Equality.Equality_1_0 returns FromJSON
	 *     Comparison returns FromJSON
	 *     Comparison.Comparison_1_0 returns FromJSON
	 *     UnaryOp returns FromJSON
	 *     Blank returns FromJSON
	 *     VariableDereference returns FromJSON
	 *     VariableDereference.DotOp_1_0 returns FromJSON
	 *     Primary returns FromJSON
	 *     CallExpression returns FromJSON
	 *     FromJSON returns FromJSON
	 *
	 * Constraint:
	 *     value=Expression
	 * </pre>
	 */
	protected void sequence_FromJSON(ISerializationContext context, FromJSON semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.FROM_JSON__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.FROM_JSON__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFromJSONAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns HashFiles
	 *     Or returns HashFiles
	 *     Or.Or_1_0 returns HashFiles
	 *     And returns HashFiles
	 *     And.And_1_0 returns HashFiles
	 *     Equality returns HashFiles
	 *     Equality.Equality_1_0 returns HashFiles
	 *     Comparison returns HashFiles
	 *     Comparison.Comparison_1_0 returns HashFiles
	 *     UnaryOp returns HashFiles
	 *     Blank returns HashFiles
	 *     VariableDereference returns HashFiles
	 *     VariableDereference.DotOp_1_0 returns HashFiles
	 *     Primary returns HashFiles
	 *     CallExpression returns HashFiles
	 *     HashFiles returns HashFiles
	 *
	 * Constraint:
	 *     path=Expression
	 * </pre>
	 */
	protected void sequence_HashFiles(ISerializationContext context, HashFiles semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.HASH_FILES__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.HASH_FILES__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHashFilesAccess().getPathExpressionParserRuleCall_2_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Join
	 *     Or returns Join
	 *     Or.Or_1_0 returns Join
	 *     And returns Join
	 *     And.And_1_0 returns Join
	 *     Equality returns Join
	 *     Equality.Equality_1_0 returns Join
	 *     Comparison returns Join
	 *     Comparison.Comparison_1_0 returns Join
	 *     UnaryOp returns Join
	 *     Blank returns Join
	 *     VariableDereference returns Join
	 *     VariableDereference.DotOp_1_0 returns Join
	 *     Primary returns Join
	 *     CallExpression returns Join
	 *     Join returns Join
	 *
	 * Constraint:
	 *     (array=Expression sep=Expression?)
	 * </pre>
	 */
	protected void sequence_Join(ISerializationContext context, Join semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Not
	 *     Or returns Not
	 *     Or.Or_1_0 returns Not
	 *     And returns Not
	 *     And.And_1_0 returns Not
	 *     Equality returns Not
	 *     Equality.Equality_1_0 returns Not
	 *     Comparison returns Not
	 *     Comparison.Comparison_1_0 returns Not
	 *     UnaryOp returns Not
	 *     Not returns Not
	 *     Blank returns Not
	 *     VariableDereference returns Not
	 *     VariableDereference.DotOp_1_0 returns Not
	 *     Primary returns Not
	 *
	 * Constraint:
	 *     childExpr=VariableDereference
	 * </pre>
	 */
	protected void sequence_Not(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.UNARY_OP__CHILD_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.UNARY_OP__CHILD_EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotAccess().getChildExprVariableDereferenceParserRuleCall_1_0(), semanticObject.getChildExpr());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Or
	 *     Or returns Or
	 *     Or.Or_1_0 returns Or
	 *     And returns Or
	 *     And.And_1_0 returns Or
	 *     Equality returns Or
	 *     Equality.Equality_1_0 returns Or
	 *     Comparison returns Or
	 *     Comparison.Comparison_1_0 returns Or
	 *     UnaryOp returns Or
	 *     Blank returns Or
	 *     VariableDereference returns Or
	 *     VariableDereference.DotOp_1_0 returns Or
	 *     Primary returns Or
	 *
	 * Constraint:
	 *     (lhs=Or_Or_1_0 rhs=And)
	 * </pre>
	 */
	protected void sequence_Or(ISerializationContext context, Or semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.BINARY_OP__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.BINARY_OP__LHS));
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.BINARY_OP__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.BINARY_OP__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrAccess().getOrLhsAction_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getOrAccess().getRhsAndParserRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns StartsWith
	 *     Or returns StartsWith
	 *     Or.Or_1_0 returns StartsWith
	 *     And returns StartsWith
	 *     And.And_1_0 returns StartsWith
	 *     Equality returns StartsWith
	 *     Equality.Equality_1_0 returns StartsWith
	 *     Comparison returns StartsWith
	 *     Comparison.Comparison_1_0 returns StartsWith
	 *     UnaryOp returns StartsWith
	 *     Blank returns StartsWith
	 *     VariableDereference returns StartsWith
	 *     VariableDereference.DotOp_1_0 returns StartsWith
	 *     Primary returns StartsWith
	 *     CallExpression returns StartsWith
	 *     StartsWith returns StartsWith
	 *
	 * Constraint:
	 *     (searchString=Expression searchValue=Expression)
	 * </pre>
	 */
	protected void sequence_StartsWith(ISerializationContext context, StartsWith semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.STARTS_WITH__SEARCH_STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.STARTS_WITH__SEARCH_STRING));
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.STARTS_WITH__SEARCH_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.STARTS_WITH__SEARCH_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStartsWithAccess().getSearchStringExpressionParserRuleCall_2_0(), semanticObject.getSearchString());
		feeder.accept(grammarAccess.getStartsWithAccess().getSearchValueExpressionParserRuleCall_4_0(), semanticObject.getSearchValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Success
	 *     Or returns Success
	 *     Or.Or_1_0 returns Success
	 *     And returns Success
	 *     And.And_1_0 returns Success
	 *     Equality returns Success
	 *     Equality.Equality_1_0 returns Success
	 *     Comparison returns Success
	 *     Comparison.Comparison_1_0 returns Success
	 *     UnaryOp returns Success
	 *     Blank returns Success
	 *     VariableDereference returns Success
	 *     VariableDereference.DotOp_1_0 returns Success
	 *     Primary returns Success
	 *     CallExpression returns Success
	 *     Success returns Success
	 *
	 * Constraint:
	 *     {Success}
	 * </pre>
	 */
	protected void sequence_Success(ISerializationContext context, Success semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns ToJSON
	 *     Or returns ToJSON
	 *     Or.Or_1_0 returns ToJSON
	 *     And returns ToJSON
	 *     And.And_1_0 returns ToJSON
	 *     Equality returns ToJSON
	 *     Equality.Equality_1_0 returns ToJSON
	 *     Comparison returns ToJSON
	 *     Comparison.Comparison_1_0 returns ToJSON
	 *     UnaryOp returns ToJSON
	 *     Blank returns ToJSON
	 *     VariableDereference returns ToJSON
	 *     VariableDereference.DotOp_1_0 returns ToJSON
	 *     Primary returns ToJSON
	 *     CallExpression returns ToJSON
	 *     ToJSON returns ToJSON
	 *
	 * Constraint:
	 *     value=Expression
	 * </pre>
	 */
	protected void sequence_ToJSON(ISerializationContext context, ToJSON semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GHAPackage.Literals.TO_JSON__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GHAPackage.Literals.TO_JSON__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getToJSONAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns DotOp
	 *     Or returns DotOp
	 *     Or.Or_1_0 returns DotOp
	 *     And returns DotOp
	 *     And.And_1_0 returns DotOp
	 *     Equality returns DotOp
	 *     Equality.Equality_1_0 returns DotOp
	 *     Comparison returns DotOp
	 *     Comparison.Comparison_1_0 returns DotOp
	 *     UnaryOp returns DotOp
	 *     Blank returns DotOp
	 *     VariableDereference returns DotOp
	 *     VariableDereference.DotOp_1_0 returns DotOp
	 *     Primary returns DotOp
	 *
	 * Constraint:
	 *     (lhs=VariableDereference_DotOp_1_0 (rhs=VariableDereference | rhs=VariableDereference))
	 * </pre>
	 */
	protected void sequence_VariableDereference(ISerializationContext context, DotOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
