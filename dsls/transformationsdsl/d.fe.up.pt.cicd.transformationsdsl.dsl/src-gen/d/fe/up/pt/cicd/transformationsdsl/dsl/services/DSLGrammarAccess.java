/*
 * generated by Xtext 2.33.0
 */
package d.fe.up.pt.cicd.transformationsdsl.dsl.services;

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
public class DSLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class TransformationSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.TransformationSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTransformationSetAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTransformationSetKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cTransformationsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cTransformationsAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cTransformationsTransformationParserRuleCall_3_2_0 = (RuleCall)cTransformationsAssignment_3_2.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cCommaKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cTransformationsAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cTransformationsTransformationParserRuleCall_3_3_1_0 = (RuleCall)cTransformationsAssignment_3_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//TransformationSet returns TransformationSet:
		//    {TransformationSet}
		//    'TransformationSet'
		//    '{'
		//        ('transformations' '{' transformations+=Transformation ( "," transformations+=Transformation)* '}' )?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{TransformationSet}
		//'TransformationSet'
		//'{'
		//    ('transformations' '{' transformations+=Transformation ( "," transformations+=Transformation)* '}' )?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{TransformationSet}
		public Action getTransformationSetAction_0() { return cTransformationSetAction_0; }
		
		//'TransformationSet'
		public Keyword getTransformationSetKeyword_1() { return cTransformationSetKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('transformations' '{' transformations+=Transformation ( "," transformations+=Transformation)* '}' )?
		public Group getGroup_3() { return cGroup_3; }
		
		//'transformations'
		public Keyword getTransformationsKeyword_3_0() { return cTransformationsKeyword_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }
		
		//transformations+=Transformation
		public Assignment getTransformationsAssignment_3_2() { return cTransformationsAssignment_3_2; }
		
		//Transformation
		public RuleCall getTransformationsTransformationParserRuleCall_3_2_0() { return cTransformationsTransformationParserRuleCall_3_2_0; }
		
		//( "," transformations+=Transformation)*
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//","
		public Keyword getCommaKeyword_3_3_0() { return cCommaKeyword_3_3_0; }
		
		//transformations+=Transformation
		public Assignment getTransformationsAssignment_3_3_1() { return cTransformationsAssignment_3_3_1; }
		
		//Transformation
		public RuleCall getTransformationsTransformationParserRuleCall_3_3_1_0() { return cTransformationsTransformationParserRuleCall_3_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_4() { return cRightCurlyBracketKeyword_3_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class TransformationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.Transformation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cChangePluginParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cATLRefiningScriptParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cChangeAgentLabelParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cReplaceAgentLabelsParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Transformation returns Transformation:
		//    ChangePlugin | ATLRefiningScript | ChangeAgentLabel | ReplaceAgentLabels;
		@Override public ParserRule getRule() { return rule; }
		
		//ChangePlugin | ATLRefiningScript | ChangeAgentLabel | ReplaceAgentLabels
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ChangePlugin
		public RuleCall getChangePluginParserRuleCall_0() { return cChangePluginParserRuleCall_0; }
		
		//ATLRefiningScript
		public RuleCall getATLRefiningScriptParserRuleCall_1() { return cATLRefiningScriptParserRuleCall_1; }
		
		//ChangeAgentLabel
		public RuleCall getChangeAgentLabelParserRuleCall_2() { return cChangeAgentLabelParserRuleCall_2; }
		
		//ReplaceAgentLabels
		public RuleCall getReplaceAgentLabelsParserRuleCall_3() { return cReplaceAgentLabelsParserRuleCall_3; }
	}
	public class ChangePluginElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.ChangePlugin");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChangePluginKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cModelKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cModelAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cModelMODEL_NAMESEnumRuleCall_3_0 = (RuleCall)cModelAssignment_3.eContents().get(0);
		private final Keyword cVersionKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cVersionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cVersionEStringParserRuleCall_5_0 = (RuleCall)cVersionAssignment_5.eContents().get(0);
		private final Keyword cNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cNameAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cNameStringToStringMapEntryParserRuleCall_7_0 = (RuleCall)cNameAssignment_7.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cArgsKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cArgsAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final RuleCall cArgsStringToStringMapEntryParserRuleCall_8_2_0 = (RuleCall)cArgsAssignment_8_2.eContents().get(0);
		private final Group cGroup_8_3 = (Group)cGroup_8.eContents().get(3);
		private final Keyword cCommaKeyword_8_3_0 = (Keyword)cGroup_8_3.eContents().get(0);
		private final Assignment cArgsAssignment_8_3_1 = (Assignment)cGroup_8_3.eContents().get(1);
		private final RuleCall cArgsStringToStringMapEntryParserRuleCall_8_3_1_0 = (RuleCall)cArgsAssignment_8_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8_4 = (Keyword)cGroup_8.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//ChangePlugin returns ChangePlugin:
		//    'ChangePlugin'
		//    '{'
		//        'model' model=MODEL_NAMES
		//        'version' version=EString
		//        'name' name=StringToStringMapEntry
		//        ('args' '{' args+=StringToStringMapEntry ( "," args+=StringToStringMapEntry)* '}' )?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ChangePlugin'
		//'{'
		//    'model' model=MODEL_NAMES
		//    'version' version=EString
		//    'name' name=StringToStringMapEntry
		//    ('args' '{' args+=StringToStringMapEntry ( "," args+=StringToStringMapEntry)* '}' )?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'ChangePlugin'
		public Keyword getChangePluginKeyword_0() { return cChangePluginKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'model'
		public Keyword getModelKeyword_2() { return cModelKeyword_2; }
		
		//model=MODEL_NAMES
		public Assignment getModelAssignment_3() { return cModelAssignment_3; }
		
		//MODEL_NAMES
		public RuleCall getModelMODEL_NAMESEnumRuleCall_3_0() { return cModelMODEL_NAMESEnumRuleCall_3_0; }
		
		//'version'
		public Keyword getVersionKeyword_4() { return cVersionKeyword_4; }
		
		//version=EString
		public Assignment getVersionAssignment_5() { return cVersionAssignment_5; }
		
		//EString
		public RuleCall getVersionEStringParserRuleCall_5_0() { return cVersionEStringParserRuleCall_5_0; }
		
		//'name'
		public Keyword getNameKeyword_6() { return cNameKeyword_6; }
		
		//name=StringToStringMapEntry
		public Assignment getNameAssignment_7() { return cNameAssignment_7; }
		
		//StringToStringMapEntry
		public RuleCall getNameStringToStringMapEntryParserRuleCall_7_0() { return cNameStringToStringMapEntryParserRuleCall_7_0; }
		
		//('args' '{' args+=StringToStringMapEntry ( "," args+=StringToStringMapEntry)* '}' )?
		public Group getGroup_8() { return cGroup_8; }
		
		//'args'
		public Keyword getArgsKeyword_8_0() { return cArgsKeyword_8_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_8_1() { return cLeftCurlyBracketKeyword_8_1; }
		
		//args+=StringToStringMapEntry
		public Assignment getArgsAssignment_8_2() { return cArgsAssignment_8_2; }
		
		//StringToStringMapEntry
		public RuleCall getArgsStringToStringMapEntryParserRuleCall_8_2_0() { return cArgsStringToStringMapEntryParserRuleCall_8_2_0; }
		
		//( "," args+=StringToStringMapEntry)*
		public Group getGroup_8_3() { return cGroup_8_3; }
		
		//","
		public Keyword getCommaKeyword_8_3_0() { return cCommaKeyword_8_3_0; }
		
		//args+=StringToStringMapEntry
		public Assignment getArgsAssignment_8_3_1() { return cArgsAssignment_8_3_1; }
		
		//StringToStringMapEntry
		public RuleCall getArgsStringToStringMapEntryParserRuleCall_8_3_1_0() { return cArgsStringToStringMapEntryParserRuleCall_8_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8_4() { return cRightCurlyBracketKeyword_8_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	public class ATLRefiningScriptElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.ATLRefiningScript");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cATLRefiningScriptKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cModelKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cModelAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cModelMODEL_NAMESEnumRuleCall_3_0 = (RuleCall)cModelAssignment_3.eContents().get(0);
		private final Keyword cScriptKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cScriptAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cScriptEStringParserRuleCall_5_0 = (RuleCall)cScriptAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ATLRefiningScript returns ATLRefiningScript:
		//    'ATLRefiningScript'
		//    '{'
		//        'model' model=MODEL_NAMES
		//        'script' script=EString
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ATLRefiningScript'
		//'{'
		//    'model' model=MODEL_NAMES
		//    'script' script=EString
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'ATLRefiningScript'
		public Keyword getATLRefiningScriptKeyword_0() { return cATLRefiningScriptKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'model'
		public Keyword getModelKeyword_2() { return cModelKeyword_2; }
		
		//model=MODEL_NAMES
		public Assignment getModelAssignment_3() { return cModelAssignment_3; }
		
		//MODEL_NAMES
		public RuleCall getModelMODEL_NAMESEnumRuleCall_3_0() { return cModelMODEL_NAMESEnumRuleCall_3_0; }
		
		//'script'
		public Keyword getScriptKeyword_4() { return cScriptKeyword_4; }
		
		//script=EString
		public Assignment getScriptAssignment_5() { return cScriptAssignment_5; }
		
		//EString
		public RuleCall getScriptEStringParserRuleCall_5_0() { return cScriptEStringParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class ChangeAgentLabelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.ChangeAgentLabel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChangeAgentLabelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cModelKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cModelAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cModelMODEL_NAMESEnumRuleCall_3_0 = (RuleCall)cModelAssignment_3.eContents().get(0);
		private final Keyword cNameKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cNameAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNameStringToStringMapEntryParserRuleCall_5_0 = (RuleCall)cNameAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ChangeAgentLabel returns ChangeAgentLabel:
		//    'ChangeAgentLabel'
		//    '{'
		//        'model' model=MODEL_NAMES
		//        'name' name=StringToStringMapEntry
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ChangeAgentLabel'
		//'{'
		//    'model' model=MODEL_NAMES
		//    'name' name=StringToStringMapEntry
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'ChangeAgentLabel'
		public Keyword getChangeAgentLabelKeyword_0() { return cChangeAgentLabelKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'model'
		public Keyword getModelKeyword_2() { return cModelKeyword_2; }
		
		//model=MODEL_NAMES
		public Assignment getModelAssignment_3() { return cModelAssignment_3; }
		
		//MODEL_NAMES
		public RuleCall getModelMODEL_NAMESEnumRuleCall_3_0() { return cModelMODEL_NAMESEnumRuleCall_3_0; }
		
		//'name'
		public Keyword getNameKeyword_4() { return cNameKeyword_4; }
		
		//name=StringToStringMapEntry
		public Assignment getNameAssignment_5() { return cNameAssignment_5; }
		
		//StringToStringMapEntry
		public RuleCall getNameStringToStringMapEntryParserRuleCall_5_0() { return cNameStringToStringMapEntryParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class ReplaceAgentLabelsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.ReplaceAgentLabels");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReplaceAgentLabelsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cModelKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cModelAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cModelMODEL_NAMESEnumRuleCall_3_0 = (RuleCall)cModelAssignment_3.eContents().get(0);
		private final Keyword cConditionKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cConditionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cConditionEStringParserRuleCall_5_0 = (RuleCall)cConditionAssignment_5.eContents().get(0);
		private final Keyword cLabelsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cLabelsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cLabelsEStringParserRuleCall_7_0 = (RuleCall)cLabelsAssignment_7.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cCommaKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cLabelsAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cLabelsEStringParserRuleCall_8_1_0 = (RuleCall)cLabelsAssignment_8_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//ReplaceAgentLabels returns ReplaceAgentLabels:
		//    'ReplaceAgentLabels'
		//    '{'
		//        'model' model=MODEL_NAMES
		//        'condition' condition=EString
		//        'labels' labels+=EString (',' labels+=EString)*
		//    '}'
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//'ReplaceAgentLabels'
		//'{'
		//    'model' model=MODEL_NAMES
		//    'condition' condition=EString
		//    'labels' labels+=EString (',' labels+=EString)*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'ReplaceAgentLabels'
		public Keyword getReplaceAgentLabelsKeyword_0() { return cReplaceAgentLabelsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'model'
		public Keyword getModelKeyword_2() { return cModelKeyword_2; }
		
		//model=MODEL_NAMES
		public Assignment getModelAssignment_3() { return cModelAssignment_3; }
		
		//MODEL_NAMES
		public RuleCall getModelMODEL_NAMESEnumRuleCall_3_0() { return cModelMODEL_NAMESEnumRuleCall_3_0; }
		
		//'condition'
		public Keyword getConditionKeyword_4() { return cConditionKeyword_4; }
		
		//condition=EString
		public Assignment getConditionAssignment_5() { return cConditionAssignment_5; }
		
		//EString
		public RuleCall getConditionEStringParserRuleCall_5_0() { return cConditionEStringParserRuleCall_5_0; }
		
		//'labels'
		public Keyword getLabelsKeyword_6() { return cLabelsKeyword_6; }
		
		//labels+=EString
		public Assignment getLabelsAssignment_7() { return cLabelsAssignment_7; }
		
		//EString
		public RuleCall getLabelsEStringParserRuleCall_7_0() { return cLabelsEStringParserRuleCall_7_0; }
		
		//(',' labels+=EString)*
		public Group getGroup_8() { return cGroup_8; }
		
		//','
		public Keyword getCommaKeyword_8_0() { return cCommaKeyword_8_0; }
		
		//labels+=EString
		public Assignment getLabelsAssignment_8_1() { return cLabelsAssignment_8_1; }
		
		//EString
		public RuleCall getLabelsEStringParserRuleCall_8_1_0() { return cLabelsEStringParserRuleCall_8_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	public class StringToStringMapEntryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringToStringMapEntry");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStringToStringMapEntryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cKeyKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cKeyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cKeyEStringParserRuleCall_3_0 = (RuleCall)cKeyAssignment_3.eContents().get(0);
		private final Keyword cValueKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cValueAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cValueEStringParserRuleCall_5_0 = (RuleCall)cValueAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//StringToStringMapEntry returns StringToStringMapEntry:
		//    'StringToStringMapEntry'
		//    '{'
		//        'key' key=EString
		//        'value' value=EString
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'StringToStringMapEntry'
		//'{'
		//    'key' key=EString
		//    'value' value=EString
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'StringToStringMapEntry'
		public Keyword getStringToStringMapEntryKeyword_0() { return cStringToStringMapEntryKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'key'
		public Keyword getKeyKeyword_2() { return cKeyKeyword_2; }
		
		//key=EString
		public Assignment getKeyAssignment_3() { return cKeyAssignment_3; }
		
		//EString
		public RuleCall getKeyEStringParserRuleCall_3_0() { return cKeyEStringParserRuleCall_3_0; }
		
		//'value'
		public Keyword getValueKeyword_4() { return cValueKeyword_4; }
		
		//value=EString
		public Assignment getValueAssignment_5() { return cValueAssignment_5; }
		
		//EString
		public RuleCall getValueEStringParserRuleCall_5_0() { return cValueEStringParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	public class MODEL_NAMESElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.MODEL_NAMES");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCICDEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCICDCICDKeyword_0_0 = (Keyword)cCICDEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cGHAEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cGHAGHAKeyword_1_0 = (Keyword)cGHAEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cCircleCIEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cCircleCICircleCIKeyword_2_0 = (Keyword)cCircleCIEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum MODEL_NAMES returns MODEL_NAMES:
		//                CICD = 'CICD' | GHA = 'GHA' | CircleCI = 'CircleCI';
		public EnumRule getRule() { return rule; }
		
		//CICD = 'CICD' | GHA = 'GHA' | CircleCI = 'CircleCI'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CICD = 'CICD'
		public EnumLiteralDeclaration getCICDEnumLiteralDeclaration_0() { return cCICDEnumLiteralDeclaration_0; }
		
		//'CICD'
		public Keyword getCICDCICDKeyword_0_0() { return cCICDCICDKeyword_0_0; }
		
		//GHA = 'GHA'
		public EnumLiteralDeclaration getGHAEnumLiteralDeclaration_1() { return cGHAEnumLiteralDeclaration_1; }
		
		//'GHA'
		public Keyword getGHAGHAKeyword_1_0() { return cGHAGHAKeyword_1_0; }
		
		//CircleCI = 'CircleCI'
		public EnumLiteralDeclaration getCircleCIEnumLiteralDeclaration_2() { return cCircleCIEnumLiteralDeclaration_2; }
		
		//'CircleCI'
		public Keyword getCircleCICircleCIKeyword_2_0() { return cCircleCICircleCIKeyword_2_0; }
	}
	
	private final TransformationSetElements pTransformationSet;
	private final TransformationElements pTransformation;
	private final MODEL_NAMESElements eMODEL_NAMES;
	private final ChangePluginElements pChangePlugin;
	private final ATLRefiningScriptElements pATLRefiningScript;
	private final ChangeAgentLabelElements pChangeAgentLabel;
	private final ReplaceAgentLabelsElements pReplaceAgentLabels;
	private final StringToStringMapEntryElements pStringToStringMapEntry;
	private final EStringElements pEString;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTransformationSet = new TransformationSetElements();
		this.pTransformation = new TransformationElements();
		this.eMODEL_NAMES = new MODEL_NAMESElements();
		this.pChangePlugin = new ChangePluginElements();
		this.pATLRefiningScript = new ATLRefiningScriptElements();
		this.pChangeAgentLabel = new ChangeAgentLabelElements();
		this.pReplaceAgentLabels = new ReplaceAgentLabelsElements();
		this.pStringToStringMapEntry = new StringToStringMapEntryElements();
		this.pEString = new EStringElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("d.fe.up.pt.cicd.transformationsdsl.dsl.DSL".equals(grammar.getName())) {
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

	
	//TransformationSet returns TransformationSet:
	//    {TransformationSet}
	//    'TransformationSet'
	//    '{'
	//        ('transformations' '{' transformations+=Transformation ( "," transformations+=Transformation)* '}' )?
	//    '}';
	public TransformationSetElements getTransformationSetAccess() {
		return pTransformationSet;
	}
	
	public ParserRule getTransformationSetRule() {
		return getTransformationSetAccess().getRule();
	}
	
	//Transformation returns Transformation:
	//    ChangePlugin | ATLRefiningScript | ChangeAgentLabel | ReplaceAgentLabels;
	public TransformationElements getTransformationAccess() {
		return pTransformation;
	}
	
	public ParserRule getTransformationRule() {
		return getTransformationAccess().getRule();
	}
	
	//enum MODEL_NAMES returns MODEL_NAMES:
	//                CICD = 'CICD' | GHA = 'GHA' | CircleCI = 'CircleCI';
	public MODEL_NAMESElements getMODEL_NAMESAccess() {
		return eMODEL_NAMES;
	}
	
	public EnumRule getMODEL_NAMESRule() {
		return getMODEL_NAMESAccess().getRule();
	}
	
	//ChangePlugin returns ChangePlugin:
	//    'ChangePlugin'
	//    '{'
	//        'model' model=MODEL_NAMES
	//        'version' version=EString
	//        'name' name=StringToStringMapEntry
	//        ('args' '{' args+=StringToStringMapEntry ( "," args+=StringToStringMapEntry)* '}' )?
	//    '}';
	public ChangePluginElements getChangePluginAccess() {
		return pChangePlugin;
	}
	
	public ParserRule getChangePluginRule() {
		return getChangePluginAccess().getRule();
	}
	
	//ATLRefiningScript returns ATLRefiningScript:
	//    'ATLRefiningScript'
	//    '{'
	//        'model' model=MODEL_NAMES
	//        'script' script=EString
	//    '}';
	public ATLRefiningScriptElements getATLRefiningScriptAccess() {
		return pATLRefiningScript;
	}
	
	public ParserRule getATLRefiningScriptRule() {
		return getATLRefiningScriptAccess().getRule();
	}
	
	//ChangeAgentLabel returns ChangeAgentLabel:
	//    'ChangeAgentLabel'
	//    '{'
	//        'model' model=MODEL_NAMES
	//        'name' name=StringToStringMapEntry
	//    '}';
	public ChangeAgentLabelElements getChangeAgentLabelAccess() {
		return pChangeAgentLabel;
	}
	
	public ParserRule getChangeAgentLabelRule() {
		return getChangeAgentLabelAccess().getRule();
	}
	
	//ReplaceAgentLabels returns ReplaceAgentLabels:
	//    'ReplaceAgentLabels'
	//    '{'
	//        'model' model=MODEL_NAMES
	//        'condition' condition=EString
	//        'labels' labels+=EString (',' labels+=EString)*
	//    '}'
	//    ;
	public ReplaceAgentLabelsElements getReplaceAgentLabelsAccess() {
		return pReplaceAgentLabels;
	}
	
	public ParserRule getReplaceAgentLabelsRule() {
		return getReplaceAgentLabelsAccess().getRule();
	}
	
	//StringToStringMapEntry returns StringToStringMapEntry:
	//    'StringToStringMapEntry'
	//    '{'
	//        'key' key=EString
	//        'value' value=EString
	//    '}';
	public StringToStringMapEntryElements getStringToStringMapEntryAccess() {
		return pStringToStringMapEntry;
	}
	
	public ParserRule getStringToStringMapEntryRule() {
		return getStringToStringMapEntryAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
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
