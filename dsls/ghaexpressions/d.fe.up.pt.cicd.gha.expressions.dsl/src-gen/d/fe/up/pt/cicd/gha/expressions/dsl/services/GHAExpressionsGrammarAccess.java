/*
 * generated by Xtext 2.33.0
 */
package d.fe.up.pt.cicd.gha.expressions.dsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class GHAExpressionsGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.Expression");
		private final RuleCall cOrParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Expression returns Expression:
		//    Or
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Or
		public RuleCall getOrParserRuleCall() { return cOrParserRuleCall; }
	}
	public class OrElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.Or");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAndParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cOrLhsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cVerticalLineVerticalLineKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRhsAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRhsAndParserRuleCall_1_2_0 = (RuleCall)cRhsAssignment_1_2.eContents().get(0);
		
		//Or returns Expression:
		//    And ({Or.lhs=current} '||' rhs=And)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//And ({Or.lhs=current} '||' rhs=And)*
		public Group getGroup() { return cGroup; }
		
		//And
		public RuleCall getAndParserRuleCall_0() { return cAndParserRuleCall_0; }
		
		//({Or.lhs=current} '||' rhs=And)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Or.lhs=current}
		public Action getOrLhsAction_1_0() { return cOrLhsAction_1_0; }
		
		//'||'
		public Keyword getVerticalLineVerticalLineKeyword_1_1() { return cVerticalLineVerticalLineKeyword_1_1; }
		
		//rhs=And
		public Assignment getRhsAssignment_1_2() { return cRhsAssignment_1_2; }
		
		//And
		public RuleCall getRhsAndParserRuleCall_1_2_0() { return cRhsAndParserRuleCall_1_2_0; }
	}
	public class AndElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.And");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cEqualityParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAndLhsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cAmpersandAmpersandKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRhsAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRhsEqualityParserRuleCall_1_2_0 = (RuleCall)cRhsAssignment_1_2.eContents().get(0);
		
		//And returns Expression:
		//    Equality ({And.lhs=current}  '&&'  rhs=Equality )*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Equality ({And.lhs=current}  '&&'  rhs=Equality )*
		public Group getGroup() { return cGroup; }
		
		//Equality
		public RuleCall getEqualityParserRuleCall_0() { return cEqualityParserRuleCall_0; }
		
		//({And.lhs=current}  '&&'  rhs=Equality )*
		public Group getGroup_1() { return cGroup_1; }
		
		//{And.lhs=current}
		public Action getAndLhsAction_1_0() { return cAndLhsAction_1_0; }
		
		//'&&'
		public Keyword getAmpersandAmpersandKeyword_1_1() { return cAmpersandAmpersandKeyword_1_1; }
		
		//rhs=Equality
		public Assignment getRhsAssignment_1_2() { return cRhsAssignment_1_2; }
		
		//Equality
		public RuleCall getRhsEqualityParserRuleCall_1_2_0() { return cRhsEqualityParserRuleCall_1_2_0; }
	}
	public class EqualityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.Equality");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cComparisonParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cEqualityLhsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOpEQUALITY_OPEnumRuleCall_1_1_0 = (RuleCall)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cRhsAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRhsComparisonParserRuleCall_1_2_0 = (RuleCall)cRhsAssignment_1_2.eContents().get(0);
		
		//Equality returns Expression:
		//    Comparison ({Equality.lhs=current}  op=EQUALITY_OP  rhs=Comparison )*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Comparison ({Equality.lhs=current}  op=EQUALITY_OP  rhs=Comparison )*
		public Group getGroup() { return cGroup; }
		
		//Comparison
		public RuleCall getComparisonParserRuleCall_0() { return cComparisonParserRuleCall_0; }
		
		//({Equality.lhs=current}  op=EQUALITY_OP  rhs=Comparison )*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Equality.lhs=current}
		public Action getEqualityLhsAction_1_0() { return cEqualityLhsAction_1_0; }
		
		//op=EQUALITY_OP
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//EQUALITY_OP
		public RuleCall getOpEQUALITY_OPEnumRuleCall_1_1_0() { return cOpEQUALITY_OPEnumRuleCall_1_1_0; }
		
		//rhs=Comparison
		public Assignment getRhsAssignment_1_2() { return cRhsAssignment_1_2; }
		
		//Comparison
		public RuleCall getRhsComparisonParserRuleCall_1_2_0() { return cRhsComparisonParserRuleCall_1_2_0; }
	}
	public class ComparisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.Comparison");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cUnaryOpParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cComparisonLhsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOpCOMPARISON_OPEnumRuleCall_1_1_0 = (RuleCall)cOpAssignment_1_1.eContents().get(0);
		private final Assignment cRhsAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRhsUnaryOpParserRuleCall_1_2_0 = (RuleCall)cRhsAssignment_1_2.eContents().get(0);
		
		//Comparison returns Expression:
		//    UnaryOp ({Comparison.lhs=current}  op=COMPARISON_OP  rhs=UnaryOp )*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//UnaryOp ({Comparison.lhs=current}  op=COMPARISON_OP  rhs=UnaryOp )*
		public Group getGroup() { return cGroup; }
		
		//UnaryOp
		public RuleCall getUnaryOpParserRuleCall_0() { return cUnaryOpParserRuleCall_0; }
		
		//({Comparison.lhs=current}  op=COMPARISON_OP  rhs=UnaryOp )*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Comparison.lhs=current}
		public Action getComparisonLhsAction_1_0() { return cComparisonLhsAction_1_0; }
		
		//op=COMPARISON_OP
		public Assignment getOpAssignment_1_1() { return cOpAssignment_1_1; }
		
		//COMPARISON_OP
		public RuleCall getOpCOMPARISON_OPEnumRuleCall_1_1_0() { return cOpCOMPARISON_OPEnumRuleCall_1_1_0; }
		
		//rhs=UnaryOp
		public Assignment getRhsAssignment_1_2() { return cRhsAssignment_1_2; }
		
		//UnaryOp
		public RuleCall getRhsUnaryOpParserRuleCall_1_2_0() { return cRhsUnaryOpParserRuleCall_1_2_0; }
	}
	public class UnaryOpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.UnaryOp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNotParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cPrimaryParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//UnaryOp returns Expression:
		//    Not | Primary
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Not | Primary
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Not
		public RuleCall getNotParserRuleCall_0() { return cNotParserRuleCall_0; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_1() { return cPrimaryParserRuleCall_1; }
	}
	public class NotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.Not");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNotAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cExclamationMarkKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cChildExprAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cChildExprPrimaryParserRuleCall_2_0 = (RuleCall)cChildExprAssignment_2.eContents().get(0);
		
		//Not returns Expression:
		//    {Not} '!' childExpr=Primary
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Not} '!' childExpr=Primary
		public Group getGroup() { return cGroup; }
		
		//{Not}
		public Action getNotAction_0() { return cNotAction_0; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_1() { return cExclamationMarkKeyword_1; }
		
		//childExpr=Primary
		public Assignment getChildExprAssignment_2() { return cChildExprAssignment_2; }
		
		//Primary
		public RuleCall getChildExprPrimaryParserRuleCall_2_0() { return cChildExprPrimaryParserRuleCall_2_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final RuleCall cFunctionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cAtomicParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Primary returns Expression:
		//    ('('  Expression  ')') | Function | Atomic
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//('('  Expression  ')') | Function | Atomic
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//('('  Expression  ')')
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//Expression
		public RuleCall getExpressionParserRuleCall_0_1() { return cExpressionParserRuleCall_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }
		
		//Function
		public RuleCall getFunctionParserRuleCall_1() { return cFunctionParserRuleCall_1; }
		
		//Atomic
		public RuleCall getAtomicParserRuleCall_2() { return cAtomicParserRuleCall_2; }
	}
	public class FunctionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.Function");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFunctionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cArgsAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cArgsExpressionParserRuleCall_3_0_0 = (RuleCall)cArgsAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cArgsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cArgsExpressionParserRuleCall_3_1_1_0 = (RuleCall)cArgsAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Function returns Expression:
		//    {Function} name=ID '(' ( args+=Expression (',' args+=Expression)* )? ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Function} name=ID '(' ( args+=Expression (',' args+=Expression)* )? ')'
		public Group getGroup() { return cGroup; }
		
		//{Function}
		public Action getFunctionAction_0() { return cFunctionAction_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//( args+=Expression (',' args+=Expression)* )?
		public Group getGroup_3() { return cGroup_3; }
		
		//args+=Expression
		public Assignment getArgsAssignment_3_0() { return cArgsAssignment_3_0; }
		
		//Expression
		public RuleCall getArgsExpressionParserRuleCall_3_0_0() { return cArgsExpressionParserRuleCall_3_0_0; }
		
		//(',' args+=Expression)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//','
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//args+=Expression
		public Assignment getArgsAssignment_3_1_1() { return cArgsAssignment_3_1_1; }
		
		//Expression
		public RuleCall getArgsExpressionParserRuleCall_3_1_1_0() { return cArgsExpressionParserRuleCall_3_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class AtomicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.Atomic");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cVariableReferenceAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final Alternatives cValueAlternatives_0_1_0 = (Alternatives)cValueAssignment_0_1.eContents().get(0);
		private final RuleCall cValueIDTerminalRuleCall_0_1_0_0 = (RuleCall)cValueAlternatives_0_1_0.eContents().get(0);
		private final RuleCall cValueVARIABLE_REFERENCETerminalRuleCall_0_1_0_1 = (RuleCall)cValueAlternatives_0_1_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cIntegerLiteralAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cDoubleLiteralAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueDOUBLETerminalRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cBooleanLiteralAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Assignment cValueAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cValueBOOLEANTerminalRuleCall_3_1_0 = (RuleCall)cValueAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Action cStringLiteralAction_4_0 = (Action)cGroup_4.eContents().get(0);
		private final Assignment cValueAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cValueAssignment_4_1.eContents().get(0);
		
		//Atomic returns Expression:
		//    ({VariableReference} value=(ID | VARIABLE_REFERENCE)) |
		//    ({IntegerLiteral} value=INT) |
		//    ({DoubleLiteral} value=DOUBLE) |
		//    ({BooleanLiteral} value=BOOLEAN) |
		//    ({StringLiteral} value=STRING)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//({VariableReference} value=(ID | VARIABLE_REFERENCE)) |
		//({IntegerLiteral} value=INT) |
		//({DoubleLiteral} value=DOUBLE) |
		//({BooleanLiteral} value=BOOLEAN) |
		//({StringLiteral} value=STRING)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//({VariableReference} value=(ID | VARIABLE_REFERENCE))
		public Group getGroup_0() { return cGroup_0; }
		
		//{VariableReference}
		public Action getVariableReferenceAction_0_0() { return cVariableReferenceAction_0_0; }
		
		//value=(ID | VARIABLE_REFERENCE)
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//(ID | VARIABLE_REFERENCE)
		public Alternatives getValueAlternatives_0_1_0() { return cValueAlternatives_0_1_0; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_0_1_0_0() { return cValueIDTerminalRuleCall_0_1_0_0; }
		
		//VARIABLE_REFERENCE
		public RuleCall getValueVARIABLE_REFERENCETerminalRuleCall_0_1_0_1() { return cValueVARIABLE_REFERENCETerminalRuleCall_0_1_0_1; }
		
		//({IntegerLiteral} value=INT)
		public Group getGroup_1() { return cGroup_1; }
		
		//{IntegerLiteral}
		public Action getIntegerLiteralAction_1_0() { return cIntegerLiteralAction_1_0; }
		
		//value=INT
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_1_0() { return cValueINTTerminalRuleCall_1_1_0; }
		
		//({DoubleLiteral} value=DOUBLE)
		public Group getGroup_2() { return cGroup_2; }
		
		//{DoubleLiteral}
		public Action getDoubleLiteralAction_2_0() { return cDoubleLiteralAction_2_0; }
		
		//value=DOUBLE
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }
		
		//DOUBLE
		public RuleCall getValueDOUBLETerminalRuleCall_2_1_0() { return cValueDOUBLETerminalRuleCall_2_1_0; }
		
		//({BooleanLiteral} value=BOOLEAN)
		public Group getGroup_3() { return cGroup_3; }
		
		//{BooleanLiteral}
		public Action getBooleanLiteralAction_3_0() { return cBooleanLiteralAction_3_0; }
		
		//value=BOOLEAN
		public Assignment getValueAssignment_3_1() { return cValueAssignment_3_1; }
		
		//BOOLEAN
		public RuleCall getValueBOOLEANTerminalRuleCall_3_1_0() { return cValueBOOLEANTerminalRuleCall_3_1_0; }
		
		//({StringLiteral} value=STRING)
		public Group getGroup_4() { return cGroup_4; }
		
		//{StringLiteral}
		public Action getStringLiteralAction_4_0() { return cStringLiteralAction_4_0; }
		
		//value=STRING
		public Assignment getValueAssignment_4_1() { return cValueAssignment_4_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_4_1_0() { return cValueSTRINGTerminalRuleCall_4_1_0; }
	}
	
	public class COMPARISON_OPElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.COMPARISON_OP");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cGTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cGTGreaterThanSignKeyword_0_0 = (Keyword)cGTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cGTEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cGTEGreaterThanSignEqualsSignKeyword_1_0 = (Keyword)cGTEEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cLTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cLTLessThanSignKeyword_2_0 = (Keyword)cLTEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cLTEEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cLTELessThanSignEqualsSignKeyword_3_0 = (Keyword)cLTEEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum COMPARISON_OP:
		//    GT='>' |
		//    GTE='>=' |
		//    LT='<' |
		//    LTE='<='
		//;
		public EnumRule getRule() { return rule; }
		
		//GT='>' |
		//GTE='>=' |
		//LT='<' |
		//LTE='<='
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GT='>'
		public EnumLiteralDeclaration getGTEnumLiteralDeclaration_0() { return cGTEnumLiteralDeclaration_0; }
		
		//'>'
		public Keyword getGTGreaterThanSignKeyword_0_0() { return cGTGreaterThanSignKeyword_0_0; }
		
		//GTE='>='
		public EnumLiteralDeclaration getGTEEnumLiteralDeclaration_1() { return cGTEEnumLiteralDeclaration_1; }
		
		//'>='
		public Keyword getGTEGreaterThanSignEqualsSignKeyword_1_0() { return cGTEGreaterThanSignEqualsSignKeyword_1_0; }
		
		//LT='<'
		public EnumLiteralDeclaration getLTEnumLiteralDeclaration_2() { return cLTEnumLiteralDeclaration_2; }
		
		//'<'
		public Keyword getLTLessThanSignKeyword_2_0() { return cLTLessThanSignKeyword_2_0; }
		
		//LTE='<='
		public EnumLiteralDeclaration getLTEEnumLiteralDeclaration_3() { return cLTEEnumLiteralDeclaration_3; }
		
		//'<='
		public Keyword getLTELessThanSignEqualsSignKeyword_3_0() { return cLTELessThanSignEqualsSignKeyword_3_0; }
	}
	public class EQUALITY_OPElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.EQUALITY_OP");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cEQUALSEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cEQUALSEqualsSignEqualsSignKeyword_0_0 = (Keyword)cEQUALSEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cNOT_EQUALSEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cNOT_EQUALSExclamationMarkEqualsSignKeyword_1_0 = (Keyword)cNOT_EQUALSEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum EQUALITY_OP:
		//    EQUALS='==' |
		//    NOT_EQUALS='!='
		//;
		public EnumRule getRule() { return rule; }
		
		//EQUALS='==' |
		//NOT_EQUALS='!='
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//EQUALS='=='
		public EnumLiteralDeclaration getEQUALSEnumLiteralDeclaration_0() { return cEQUALSEnumLiteralDeclaration_0; }
		
		//'=='
		public Keyword getEQUALSEqualsSignEqualsSignKeyword_0_0() { return cEQUALSEqualsSignEqualsSignKeyword_0_0; }
		
		//NOT_EQUALS='!='
		public EnumLiteralDeclaration getNOT_EQUALSEnumLiteralDeclaration_1() { return cNOT_EQUALSEnumLiteralDeclaration_1; }
		
		//'!='
		public Keyword getNOT_EQUALSExclamationMarkEqualsSignKeyword_1_0() { return cNOT_EQUALSExclamationMarkEqualsSignKeyword_1_0; }
	}
	
	private final ExpressionElements pExpression;
	private final OrElements pOr;
	private final AndElements pAnd;
	private final EqualityElements pEquality;
	private final ComparisonElements pComparison;
	private final UnaryOpElements pUnaryOp;
	private final NotElements pNot;
	private final PrimaryElements pPrimary;
	private final FunctionElements pFunction;
	private final AtomicElements pAtomic;
	private final COMPARISON_OPElements eCOMPARISON_OP;
	private final EQUALITY_OPElements eEQUALITY_OP;
	private final TerminalRule tVARIABLE_REFERENCE;
	private final TerminalRule tDOUBLE;
	private final TerminalRule tBOOLEAN;
	private final TerminalRule tID;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GHAExpressionsGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pExpression = new ExpressionElements();
		this.pOr = new OrElements();
		this.pAnd = new AndElements();
		this.pEquality = new EqualityElements();
		this.pComparison = new ComparisonElements();
		this.pUnaryOp = new UnaryOpElements();
		this.pNot = new NotElements();
		this.pPrimary = new PrimaryElements();
		this.pFunction = new FunctionElements();
		this.pAtomic = new AtomicElements();
		this.eCOMPARISON_OP = new COMPARISON_OPElements();
		this.eEQUALITY_OP = new EQUALITY_OPElements();
		this.tVARIABLE_REFERENCE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.VARIABLE_REFERENCE");
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.DOUBLE");
		this.tBOOLEAN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.BOOLEAN");
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.ID");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Expression returns Expression:
	//    Or
	//;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//Or returns Expression:
	//    And ({Or.lhs=current} '||' rhs=And)*
	//;
	public OrElements getOrAccess() {
		return pOr;
	}
	
	public ParserRule getOrRule() {
		return getOrAccess().getRule();
	}
	
	//And returns Expression:
	//    Equality ({And.lhs=current}  '&&'  rhs=Equality )*
	//;
	public AndElements getAndAccess() {
		return pAnd;
	}
	
	public ParserRule getAndRule() {
		return getAndAccess().getRule();
	}
	
	//Equality returns Expression:
	//    Comparison ({Equality.lhs=current}  op=EQUALITY_OP  rhs=Comparison )*
	//;
	public EqualityElements getEqualityAccess() {
		return pEquality;
	}
	
	public ParserRule getEqualityRule() {
		return getEqualityAccess().getRule();
	}
	
	//Comparison returns Expression:
	//    UnaryOp ({Comparison.lhs=current}  op=COMPARISON_OP  rhs=UnaryOp )*
	//;
	public ComparisonElements getComparisonAccess() {
		return pComparison;
	}
	
	public ParserRule getComparisonRule() {
		return getComparisonAccess().getRule();
	}
	
	//UnaryOp returns Expression:
	//    Not | Primary
	//;
	public UnaryOpElements getUnaryOpAccess() {
		return pUnaryOp;
	}
	
	public ParserRule getUnaryOpRule() {
		return getUnaryOpAccess().getRule();
	}
	
	//Not returns Expression:
	//    {Not} '!' childExpr=Primary
	//;
	public NotElements getNotAccess() {
		return pNot;
	}
	
	public ParserRule getNotRule() {
		return getNotAccess().getRule();
	}
	
	//Primary returns Expression:
	//    ('('  Expression  ')') | Function | Atomic
	//;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//Function returns Expression:
	//    {Function} name=ID '(' ( args+=Expression (',' args+=Expression)* )? ')'
	//;
	public FunctionElements getFunctionAccess() {
		return pFunction;
	}
	
	public ParserRule getFunctionRule() {
		return getFunctionAccess().getRule();
	}
	
	//Atomic returns Expression:
	//    ({VariableReference} value=(ID | VARIABLE_REFERENCE)) |
	//    ({IntegerLiteral} value=INT) |
	//    ({DoubleLiteral} value=DOUBLE) |
	//    ({BooleanLiteral} value=BOOLEAN) |
	//    ({StringLiteral} value=STRING)
	//;
	public AtomicElements getAtomicAccess() {
		return pAtomic;
	}
	
	public ParserRule getAtomicRule() {
		return getAtomicAccess().getRule();
	}
	
	//enum COMPARISON_OP:
	//    GT='>' |
	//    GTE='>=' |
	//    LT='<' |
	//    LTE='<='
	//;
	public COMPARISON_OPElements getCOMPARISON_OPAccess() {
		return eCOMPARISON_OP;
	}
	
	public EnumRule getCOMPARISON_OPRule() {
		return getCOMPARISON_OPAccess().getRule();
	}
	
	//enum EQUALITY_OP:
	//    EQUALS='==' |
	//    NOT_EQUALS='!='
	//;
	public EQUALITY_OPElements getEQUALITY_OPAccess() {
		return eEQUALITY_OP;
	}
	
	public EnumRule getEQUALITY_OPRule() {
		return getEQUALITY_OPAccess().getRule();
	}
	
	//terminal VARIABLE_REFERENCE returns ecore::EString:
	//    ID (('.' ID) | '[' (ID | INT) ']')+
	//;
	public TerminalRule getVARIABLE_REFERENCERule() {
		return tVARIABLE_REFERENCE;
	}
	
	//terminal DOUBLE returns ecore::EDoubleObject:
	//    INT '.' INT
	//;
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
	}
	
	//terminal BOOLEAN returns ecore::EBooleanObject:
	//    'true' | 'false'
	//;
	public TerminalRule getBOOLEANRule() {
		return tBOOLEAN;
	}
	
	//@Override
	//terminal ID returns ecore::EString:
	//    '^'?('a'..'z'|'A'..'Z'|'_'|'-') ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9')*
	//;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}