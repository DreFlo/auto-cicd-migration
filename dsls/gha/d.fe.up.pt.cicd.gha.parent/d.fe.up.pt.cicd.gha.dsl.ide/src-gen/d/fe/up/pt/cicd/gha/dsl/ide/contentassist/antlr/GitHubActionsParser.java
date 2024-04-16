/*
 * generated by Xtext 2.33.0
 */
package d.fe.up.pt.cicd.gha.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import d.fe.up.pt.cicd.gha.dsl.ide.contentassist.antlr.internal.InternalGitHubActionsParser;
import d.fe.up.pt.cicd.gha.dsl.services.GitHubActionsGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class GitHubActionsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GitHubActionsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GitHubActionsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getUnaryOpAccess().getAlternatives(), "rule__UnaryOp__Alternatives");
			builder.put(grammarAccess.getVariableDereferenceAccess().getAlternatives_1_1(), "rule__VariableDereference__Alternatives_1_1");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
			builder.put(grammarAccess.getCallExpressionAccess().getAlternatives(), "rule__CallExpression__Alternatives");
			builder.put(grammarAccess.getCOMPARISON_OPAccess().getAlternatives(), "rule__COMPARISON_OP__Alternatives");
			builder.put(grammarAccess.getEQUALITY_OPAccess().getAlternatives(), "rule__EQUALITY_OP__Alternatives");
			builder.put(grammarAccess.getCONTEXTAccess().getAlternatives(), "rule__CONTEXT__Alternatives");
			builder.put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
			builder.put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
			builder.put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup_1(), "rule__Equality__Group_1__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
			builder.put(grammarAccess.getNotAccess().getGroup(), "rule__Not__Group__0");
			builder.put(grammarAccess.getVariableDereferenceAccess().getGroup(), "rule__VariableDereference__Group__0");
			builder.put(grammarAccess.getVariableDereferenceAccess().getGroup_1(), "rule__VariableDereference__Group_1__0");
			builder.put(grammarAccess.getVariableDereferenceAccess().getGroup_1_1_0(), "rule__VariableDereference__Group_1_1_0__0");
			builder.put(grammarAccess.getVariableDereferenceAccess().getGroup_1_1_1(), "rule__VariableDereference__Group_1_1_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_3(), "rule__Atomic__Group_3__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_4(), "rule__Atomic__Group_4__0");
			builder.put(grammarAccess.getContainsAccess().getGroup(), "rule__Contains__Group__0");
			builder.put(grammarAccess.getStartsWithAccess().getGroup(), "rule__StartsWith__Group__0");
			builder.put(grammarAccess.getEndsWithAccess().getGroup(), "rule__EndsWith__Group__0");
			builder.put(grammarAccess.getFormatAccess().getGroup(), "rule__Format__Group__0");
			builder.put(grammarAccess.getFormatAccess().getGroup_3(), "rule__Format__Group_3__0");
			builder.put(grammarAccess.getJoinAccess().getGroup(), "rule__Join__Group__0");
			builder.put(grammarAccess.getJoinAccess().getGroup_3(), "rule__Join__Group_3__0");
			builder.put(grammarAccess.getToJSONAccess().getGroup(), "rule__ToJSON__Group__0");
			builder.put(grammarAccess.getFromJSONAccess().getGroup(), "rule__FromJSON__Group__0");
			builder.put(grammarAccess.getHashFilesAccess().getGroup(), "rule__HashFiles__Group__0");
			builder.put(grammarAccess.getSuccessAccess().getGroup(), "rule__Success__Group__0");
			builder.put(grammarAccess.getAlwaysAccess().getGroup(), "rule__Always__Group__0");
			builder.put(grammarAccess.getCancelledAccess().getGroup(), "rule__Cancelled__Group__0");
			builder.put(grammarAccess.getFailureAccess().getGroup(), "rule__Failure__Group__0");
			builder.put(grammarAccess.getOrAccess().getRhsAssignment_1_2(), "rule__Or__RhsAssignment_1_2");
			builder.put(grammarAccess.getAndAccess().getRhsAssignment_1_2(), "rule__And__RhsAssignment_1_2");
			builder.put(grammarAccess.getEqualityAccess().getOpAssignment_1_1(), "rule__Equality__OpAssignment_1_1");
			builder.put(grammarAccess.getEqualityAccess().getRhsAssignment_1_2(), "rule__Equality__RhsAssignment_1_2");
			builder.put(grammarAccess.getComparisonAccess().getOpAssignment_1_1(), "rule__Comparison__OpAssignment_1_1");
			builder.put(grammarAccess.getComparisonAccess().getRhsAssignment_1_2(), "rule__Comparison__RhsAssignment_1_2");
			builder.put(grammarAccess.getNotAccess().getChildExprAssignment_1(), "rule__Not__ChildExprAssignment_1");
			builder.put(grammarAccess.getVariableDereferenceAccess().getRhsAssignment_1_1_0_1(), "rule__VariableDereference__RhsAssignment_1_1_0_1");
			builder.put(grammarAccess.getVariableDereferenceAccess().getRhsAssignment_1_1_1_1(), "rule__VariableDereference__RhsAssignment_1_1_1_1");
			builder.put(grammarAccess.getAtomicAccess().getContextAssignment_0_1(), "rule__Atomic__ContextAssignment_0_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_2_1(), "rule__Atomic__ValueAssignment_2_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_3_1(), "rule__Atomic__ValueAssignment_3_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_4_1(), "rule__Atomic__ValueAssignment_4_1");
			builder.put(grammarAccess.getContainsAccess().getSearchAssignment_2(), "rule__Contains__SearchAssignment_2");
			builder.put(grammarAccess.getContainsAccess().getItemAssignment_4(), "rule__Contains__ItemAssignment_4");
			builder.put(grammarAccess.getStartsWithAccess().getSearchStringAssignment_2(), "rule__StartsWith__SearchStringAssignment_2");
			builder.put(grammarAccess.getStartsWithAccess().getSearchValueAssignment_4(), "rule__StartsWith__SearchValueAssignment_4");
			builder.put(grammarAccess.getEndsWithAccess().getSearchStringAssignment_2(), "rule__EndsWith__SearchStringAssignment_2");
			builder.put(grammarAccess.getEndsWithAccess().getSearchValueAssignment_4(), "rule__EndsWith__SearchValueAssignment_4");
			builder.put(grammarAccess.getFormatAccess().getStringAssignment_2(), "rule__Format__StringAssignment_2");
			builder.put(grammarAccess.getFormatAccess().getReplaceValuesAssignment_3_1(), "rule__Format__ReplaceValuesAssignment_3_1");
			builder.put(grammarAccess.getJoinAccess().getArrayAssignment_2(), "rule__Join__ArrayAssignment_2");
			builder.put(grammarAccess.getJoinAccess().getSepAssignment_3_1(), "rule__Join__SepAssignment_3_1");
			builder.put(grammarAccess.getToJSONAccess().getValueAssignment_2(), "rule__ToJSON__ValueAssignment_2");
			builder.put(grammarAccess.getFromJSONAccess().getValueAssignment_2(), "rule__FromJSON__ValueAssignment_2");
			builder.put(grammarAccess.getHashFilesAccess().getPathAssignment_2(), "rule__HashFiles__PathAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GitHubActionsGrammarAccess grammarAccess;

	@Override
	protected InternalGitHubActionsParser createParser() {
		InternalGitHubActionsParser result = new InternalGitHubActionsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GitHubActionsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GitHubActionsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
