/*
 * generated by Xtext 2.33.0
 */
package d.fe.up.pt.cicd.gha.expressions.dsl.serializer;

import com.google.inject.Inject;
import d.fe.up.pt.cicd.gha.expressions.dsl.services.GHAExpressionsGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class GHAExpressionsSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GHAExpressionsGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GHAExpressionsGrammarAccess) access;
		match_Primary_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_Primary_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Primary_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '!' childExpr=Primary
	 *     (rule start) (ambiguity) name=ID
	 *     (rule start) (ambiguity) value=BOOLEAN
	 *     (rule start) (ambiguity) value=DOUBLE
	 *     (rule start) (ambiguity) value=ID
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) value=VARIABLE_REFERENCE
	 *     (rule start) (ambiguity) {And.lhs=}
	 *     (rule start) (ambiguity) {Comparison.lhs=}
	 *     (rule start) (ambiguity) {Equality.lhs=}
	 *     (rule start) (ambiguity) {Or.lhs=}
	 
	 * </pre>
	 */
	protected void emit_Primary_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '!' childExpr=Primary
	 *     (rule start) (ambiguity) {And.lhs=}
	 *     (rule start) (ambiguity) {Comparison.lhs=}
	 *     (rule start) (ambiguity) {Equality.lhs=}
	 *     (rule start) (ambiguity) {Or.lhs=}
	 
	 * </pre>
	 */
	protected void emit_Primary_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
