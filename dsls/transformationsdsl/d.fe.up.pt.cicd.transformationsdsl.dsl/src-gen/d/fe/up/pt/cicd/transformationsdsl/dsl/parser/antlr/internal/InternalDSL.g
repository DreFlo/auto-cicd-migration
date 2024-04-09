/*
 * generated by Xtext 2.33.0
 */
grammar InternalDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package d.fe.up.pt.cicd.transformationsdsl.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package d.fe.up.pt.cicd.transformationsdsl.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import d.fe.up.pt.cicd.transformationsdsl.dsl.services.DSLGrammarAccess;

}

@parser::members {

 	private DSLGrammarAccess grammarAccess;

    public InternalDSLParser(TokenStream input, DSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "TransformationSet";
   	}

   	@Override
   	protected DSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTransformationSet
entryRuleTransformationSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransformationSetRule()); }
	iv_ruleTransformationSet=ruleTransformationSet
	{ $current=$iv_ruleTransformationSet.current; }
	EOF;

// Rule TransformationSet
ruleTransformationSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTransformationSetAccess().getTransformationSetAction_0(),
					$current);
			}
		)
		otherlv_1='TransformationSet'
		{
			newLeafNode(otherlv_1, grammarAccess.getTransformationSetAccess().getTransformationSetKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTransformationSetAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='transformations'
			{
				newLeafNode(otherlv_3, grammarAccess.getTransformationSetAccess().getTransformationsKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getTransformationSetAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTransformationSetAccess().getTransformationsTransformationParserRuleCall_3_2_0());
					}
					lv_transformations_5_0=ruleTransformation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransformationSetRule());
						}
						add(
							$current,
							"transformations",
							lv_transformations_5_0,
							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.Transformation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getTransformationSetAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTransformationSetAccess().getTransformationsTransformationParserRuleCall_3_3_1_0());
						}
						lv_transformations_7_0=ruleTransformation
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTransformationSetRule());
							}
							add(
								$current,
								"transformations",
								lv_transformations_7_0,
								"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.Transformation");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getTransformationSetAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getTransformationSetAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleTransformation
entryRuleTransformation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransformationRule()); }
	iv_ruleTransformation=ruleTransformation
	{ $current=$iv_ruleTransformation.current; }
	EOF;

// Rule Transformation
ruleTransformation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getTransformationAccess().getChangePluginTransformationParserRuleCall());
	}
	this_ChangePluginTransformation_0=ruleChangePluginTransformation
	{
		$current = $this_ChangePluginTransformation_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleChangePluginTransformation
entryRuleChangePluginTransformation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChangePluginTransformationRule()); }
	iv_ruleChangePluginTransformation=ruleChangePluginTransformation
	{ $current=$iv_ruleChangePluginTransformation.current; }
	EOF;

// Rule ChangePluginTransformation
ruleChangePluginTransformation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ChangePluginTransformation'
		{
			newLeafNode(otherlv_0, grammarAccess.getChangePluginTransformationAccess().getChangePluginTransformationKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getChangePluginTransformationAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='model'
		{
			newLeafNode(otherlv_2, grammarAccess.getChangePluginTransformationAccess().getModelKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChangePluginTransformationAccess().getModelMODEL_NAMESEnumRuleCall_3_0());
				}
				lv_model_3_0=ruleMODEL_NAMES
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChangePluginTransformationRule());
					}
					set(
						$current,
						"model",
						lv_model_3_0,
						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.MODEL_NAMES");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='version'
		{
			newLeafNode(otherlv_4, grammarAccess.getChangePluginTransformationAccess().getVersionKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChangePluginTransformationAccess().getVersionEStringParserRuleCall_5_0());
				}
				lv_version_5_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChangePluginTransformationRule());
					}
					set(
						$current,
						"version",
						lv_version_5_0,
						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getChangePluginTransformationAccess().getNameKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChangePluginTransformationAccess().getNameStringToStringMapEntryParserRuleCall_7_0());
				}
				lv_name_7_0=ruleStringToStringMapEntry
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChangePluginTransformationRule());
					}
					set(
						$current,
						"name",
						lv_name_7_0,
						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringToStringMapEntry");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_8='args'
			{
				newLeafNode(otherlv_8, grammarAccess.getChangePluginTransformationAccess().getArgsKeyword_8_0());
			}
			otherlv_9='{'
			{
				newLeafNode(otherlv_9, grammarAccess.getChangePluginTransformationAccess().getLeftCurlyBracketKeyword_8_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getChangePluginTransformationAccess().getArgsStringToStringMapEntryParserRuleCall_8_2_0());
					}
					lv_args_10_0=ruleStringToStringMapEntry
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getChangePluginTransformationRule());
						}
						add(
							$current,
							"args",
							lv_args_10_0,
							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringToStringMapEntry");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_11=','
				{
					newLeafNode(otherlv_11, grammarAccess.getChangePluginTransformationAccess().getCommaKeyword_8_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getChangePluginTransformationAccess().getArgsStringToStringMapEntryParserRuleCall_8_3_1_0());
						}
						lv_args_12_0=ruleStringToStringMapEntry
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getChangePluginTransformationRule());
							}
							add(
								$current,
								"args",
								lv_args_12_0,
								"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringToStringMapEntry");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_13='}'
			{
				newLeafNode(otherlv_13, grammarAccess.getChangePluginTransformationAccess().getRightCurlyBracketKeyword_8_4());
			}
		)?
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getChangePluginTransformationAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleStringToStringMapEntry
entryRuleStringToStringMapEntry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringToStringMapEntryRule()); }
	iv_ruleStringToStringMapEntry=ruleStringToStringMapEntry
	{ $current=$iv_ruleStringToStringMapEntry.current; }
	EOF;

// Rule StringToStringMapEntry
ruleStringToStringMapEntry returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='StringToStringMapEntry'
		{
			newLeafNode(otherlv_0, grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='key'
		{
			newLeafNode(otherlv_2, grammarAccess.getStringToStringMapEntryAccess().getKeyKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_0());
				}
				lv_key_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStringToStringMapEntryRule());
					}
					set(
						$current,
						"key",
						lv_key_3_0,
						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='value'
		{
			newLeafNode(otherlv_4, grammarAccess.getStringToStringMapEntryAccess().getValueKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getValueEStringParserRuleCall_5_0());
				}
				lv_value_5_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStringToStringMapEntryRule());
					}
					set(
						$current,
						"value",
						lv_value_5_0,
						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getStringToStringMapEntryAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Rule MODEL_NAMES
ruleMODEL_NAMES returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='CICD'
			{
				$current = grammarAccess.getMODEL_NAMESAccess().getCICDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getMODEL_NAMESAccess().getCICDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='GHA'
			{
				$current = grammarAccess.getMODEL_NAMESAccess().getGHAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getMODEL_NAMESAccess().getGHAEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='CircleCI'
			{
				$current = grammarAccess.getMODEL_NAMESAccess().getCircleCIEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getMODEL_NAMESAccess().getCircleCIEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
