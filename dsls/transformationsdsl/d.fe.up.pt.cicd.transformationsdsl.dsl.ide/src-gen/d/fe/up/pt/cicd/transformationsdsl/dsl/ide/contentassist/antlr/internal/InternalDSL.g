/*
 * generated by Xtext 2.33.0
 */
grammar InternalDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package d.fe.up.pt.cicd.transformationsdsl.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package d.fe.up.pt.cicd.transformationsdsl.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import d.fe.up.pt.cicd.transformationsdsl.dsl.services.DSLGrammarAccess;

}
@parser::members {
	private DSLGrammarAccess grammarAccess;

	public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleTransformationSet
entryRuleTransformationSet
:
{ before(grammarAccess.getTransformationSetRule()); }
	 ruleTransformationSet
{ after(grammarAccess.getTransformationSetRule()); } 
	 EOF 
;

// Rule TransformationSet
ruleTransformationSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTransformationSetAccess().getGroup()); }
		(rule__TransformationSet__Group__0)
		{ after(grammarAccess.getTransformationSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTransformation
entryRuleTransformation
:
{ before(grammarAccess.getTransformationRule()); }
	 ruleTransformation
{ after(grammarAccess.getTransformationRule()); } 
	 EOF 
;

// Rule Transformation
ruleTransformation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTransformationAccess().getChangePluginTransformationParserRuleCall()); }
		ruleChangePluginTransformation
		{ after(grammarAccess.getTransformationAccess().getChangePluginTransformationParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChangePluginTransformation
entryRuleChangePluginTransformation
:
{ before(grammarAccess.getChangePluginTransformationRule()); }
	 ruleChangePluginTransformation
{ after(grammarAccess.getChangePluginTransformationRule()); } 
	 EOF 
;

// Rule ChangePluginTransformation
ruleChangePluginTransformation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChangePluginTransformationAccess().getGroup()); }
		(rule__ChangePluginTransformation__Group__0)
		{ after(grammarAccess.getChangePluginTransformationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringToStringMapEntry
entryRuleStringToStringMapEntry
:
{ before(grammarAccess.getStringToStringMapEntryRule()); }
	 ruleStringToStringMapEntry
{ after(grammarAccess.getStringToStringMapEntryRule()); } 
	 EOF 
;

// Rule StringToStringMapEntry
ruleStringToStringMapEntry 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringToStringMapEntryAccess().getGroup()); }
		(rule__StringToStringMapEntry__Group__0)
		{ after(grammarAccess.getStringToStringMapEntryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule MODEL_NAMES
ruleMODEL_NAMES
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMODEL_NAMESAccess().getAlternatives()); }
		(rule__MODEL_NAMES__Alternatives)
		{ after(grammarAccess.getMODEL_NAMESAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODEL_NAMES__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMODEL_NAMESAccess().getCICDEnumLiteralDeclaration_0()); }
		('CICD')
		{ after(grammarAccess.getMODEL_NAMESAccess().getCICDEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getMODEL_NAMESAccess().getGHAEnumLiteralDeclaration_1()); }
		('GHA')
		{ after(grammarAccess.getMODEL_NAMESAccess().getGHAEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getMODEL_NAMESAccess().getCircleCIEnumLiteralDeclaration_2()); }
		('CircleCI')
		{ after(grammarAccess.getMODEL_NAMESAccess().getCircleCIEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransformationSet__Group__0__Impl
	rule__TransformationSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransformationSetAccess().getTransformationSetAction_0()); }
	()
	{ after(grammarAccess.getTransformationSetAccess().getTransformationSetAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransformationSet__Group__1__Impl
	rule__TransformationSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransformationSetAccess().getTransformationSetKeyword_1()); }
	'TransformationSet'
	{ after(grammarAccess.getTransformationSetAccess().getTransformationSetKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransformationSet__Group__2__Impl
	rule__TransformationSet__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransformationSetAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTransformationSetAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransformationSet__Group__3__Impl
	rule__TransformationSet__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransformationSetAccess().getGroup_3()); }
	(rule__TransformationSet__Group_3__0)?
	{ after(grammarAccess.getTransformationSetAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransformationSet__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransformationSetAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTransformationSetAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TransformationSet__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransformationSet__Group_3__0__Impl
	rule__TransformationSet__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransformationSetAccess().getTransformationsKeyword_3_0()); }
	'transformations'
	{ after(grammarAccess.getTransformationSetAccess().getTransformationsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransformationSet__Group_3__1__Impl
	rule__TransformationSet__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransformationSetAccess().getLeftCurlyBracketKeyword_3_1()); }
	'{'
	{ after(grammarAccess.getTransformationSetAccess().getLeftCurlyBracketKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransformationSet__Group_3__2__Impl
	rule__TransformationSet__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransformationSetAccess().getTransformationsAssignment_3_2()); }
	(rule__TransformationSet__TransformationsAssignment_3_2)
	{ after(grammarAccess.getTransformationSetAccess().getTransformationsAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransformationSet__Group_3__3__Impl
	rule__TransformationSet__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransformationSetAccess().getGroup_3_3()); }
	(rule__TransformationSet__Group_3_3__0)*
	{ after(grammarAccess.getTransformationSetAccess().getGroup_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransformationSet__Group_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransformationSetAccess().getRightCurlyBracketKeyword_3_4()); }
	'}'
	{ after(grammarAccess.getTransformationSetAccess().getRightCurlyBracketKeyword_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TransformationSet__Group_3_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransformationSet__Group_3_3__0__Impl
	rule__TransformationSet__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group_3_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransformationSetAccess().getCommaKeyword_3_3_0()); }
	','
	{ after(grammarAccess.getTransformationSetAccess().getCommaKeyword_3_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group_3_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TransformationSet__Group_3_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__Group_3_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransformationSetAccess().getTransformationsAssignment_3_3_1()); }
	(rule__TransformationSet__TransformationsAssignment_3_3_1)
	{ after(grammarAccess.getTransformationSetAccess().getTransformationsAssignment_3_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ChangePluginTransformation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group__0__Impl
	rule__ChangePluginTransformation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getChangePluginTransformationKeyword_0()); }
	'ChangePluginTransformation'
	{ after(grammarAccess.getChangePluginTransformationAccess().getChangePluginTransformationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group__1__Impl
	rule__ChangePluginTransformation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getChangePluginTransformationAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group__2__Impl
	rule__ChangePluginTransformation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getModelKeyword_2()); }
	'model'
	{ after(grammarAccess.getChangePluginTransformationAccess().getModelKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group__3__Impl
	rule__ChangePluginTransformation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getModelAssignment_3()); }
	(rule__ChangePluginTransformation__ModelAssignment_3)
	{ after(grammarAccess.getChangePluginTransformationAccess().getModelAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group__4__Impl
	rule__ChangePluginTransformation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getVersionKeyword_4()); }
	'version'
	{ after(grammarAccess.getChangePluginTransformationAccess().getVersionKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group__5__Impl
	rule__ChangePluginTransformation__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getVersionAssignment_5()); }
	(rule__ChangePluginTransformation__VersionAssignment_5)
	{ after(grammarAccess.getChangePluginTransformationAccess().getVersionAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group__6__Impl
	rule__ChangePluginTransformation__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getChangePluginTransformationAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group__7__Impl
	rule__ChangePluginTransformation__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getNameAssignment_7()); }
	(rule__ChangePluginTransformation__NameAssignment_7)
	{ after(grammarAccess.getChangePluginTransformationAccess().getNameAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group__8__Impl
	rule__ChangePluginTransformation__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getGroup_8()); }
	(rule__ChangePluginTransformation__Group_8__0)?
	{ after(grammarAccess.getChangePluginTransformationAccess().getGroup_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getChangePluginTransformationAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ChangePluginTransformation__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group_8__0__Impl
	rule__ChangePluginTransformation__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getArgsKeyword_8_0()); }
	'args'
	{ after(grammarAccess.getChangePluginTransformationAccess().getArgsKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group_8__1__Impl
	rule__ChangePluginTransformation__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getLeftCurlyBracketKeyword_8_1()); }
	'{'
	{ after(grammarAccess.getChangePluginTransformationAccess().getLeftCurlyBracketKeyword_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group_8__2__Impl
	rule__ChangePluginTransformation__Group_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getArgsAssignment_8_2()); }
	(rule__ChangePluginTransformation__ArgsAssignment_8_2)
	{ after(grammarAccess.getChangePluginTransformationAccess().getArgsAssignment_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group_8__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group_8__3__Impl
	rule__ChangePluginTransformation__Group_8__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group_8__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getGroup_8_3()); }
	(rule__ChangePluginTransformation__Group_8_3__0)*
	{ after(grammarAccess.getChangePluginTransformationAccess().getGroup_8_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group_8__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group_8__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group_8__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getRightCurlyBracketKeyword_8_4()); }
	'}'
	{ after(grammarAccess.getChangePluginTransformationAccess().getRightCurlyBracketKeyword_8_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ChangePluginTransformation__Group_8_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group_8_3__0__Impl
	rule__ChangePluginTransformation__Group_8_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group_8_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getCommaKeyword_8_3_0()); }
	','
	{ after(grammarAccess.getChangePluginTransformationAccess().getCommaKeyword_8_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group_8_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChangePluginTransformation__Group_8_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__Group_8_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChangePluginTransformationAccess().getArgsAssignment_8_3_1()); }
	(rule__ChangePluginTransformation__ArgsAssignment_8_3_1)
	{ after(grammarAccess.getChangePluginTransformationAccess().getArgsAssignment_8_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringToStringMapEntry__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringToStringMapEntry__Group__0__Impl
	rule__StringToStringMapEntry__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringToStringMapEntry__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryKeyword_0()); }
	'StringToStringMapEntry'
	{ after(grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringToStringMapEntry__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringToStringMapEntry__Group__1__Impl
	rule__StringToStringMapEntry__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StringToStringMapEntry__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringToStringMapEntry__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringToStringMapEntry__Group__2__Impl
	rule__StringToStringMapEntry__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StringToStringMapEntry__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringToStringMapEntryAccess().getKeyKeyword_2()); }
	'key'
	{ after(grammarAccess.getStringToStringMapEntryAccess().getKeyKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringToStringMapEntry__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringToStringMapEntry__Group__3__Impl
	rule__StringToStringMapEntry__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StringToStringMapEntry__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringToStringMapEntryAccess().getKeyAssignment_3()); }
	(rule__StringToStringMapEntry__KeyAssignment_3)
	{ after(grammarAccess.getStringToStringMapEntryAccess().getKeyAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringToStringMapEntry__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringToStringMapEntry__Group__4__Impl
	rule__StringToStringMapEntry__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StringToStringMapEntry__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringToStringMapEntryAccess().getValueKeyword_4()); }
	'value'
	{ after(grammarAccess.getStringToStringMapEntryAccess().getValueKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringToStringMapEntry__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringToStringMapEntry__Group__5__Impl
	rule__StringToStringMapEntry__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__StringToStringMapEntry__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringToStringMapEntryAccess().getValueAssignment_5()); }
	(rule__StringToStringMapEntry__ValueAssignment_5)
	{ after(grammarAccess.getStringToStringMapEntryAccess().getValueAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringToStringMapEntry__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringToStringMapEntry__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringToStringMapEntry__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringToStringMapEntryAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getStringToStringMapEntryAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TransformationSet__TransformationsAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransformationSetAccess().getTransformationsTransformationParserRuleCall_3_2_0()); }
		ruleTransformation
		{ after(grammarAccess.getTransformationSetAccess().getTransformationsTransformationParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TransformationSet__TransformationsAssignment_3_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransformationSetAccess().getTransformationsTransformationParserRuleCall_3_3_1_0()); }
		ruleTransformation
		{ after(grammarAccess.getTransformationSetAccess().getTransformationsTransformationParserRuleCall_3_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__ModelAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChangePluginTransformationAccess().getModelMODEL_NAMESEnumRuleCall_3_0()); }
		ruleMODEL_NAMES
		{ after(grammarAccess.getChangePluginTransformationAccess().getModelMODEL_NAMESEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__VersionAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChangePluginTransformationAccess().getVersionEStringParserRuleCall_5_0()); }
		ruleEString
		{ after(grammarAccess.getChangePluginTransformationAccess().getVersionEStringParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__NameAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChangePluginTransformationAccess().getNameStringToStringMapEntryParserRuleCall_7_0()); }
		ruleStringToStringMapEntry
		{ after(grammarAccess.getChangePluginTransformationAccess().getNameStringToStringMapEntryParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__ArgsAssignment_8_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChangePluginTransformationAccess().getArgsStringToStringMapEntryParserRuleCall_8_2_0()); }
		ruleStringToStringMapEntry
		{ after(grammarAccess.getChangePluginTransformationAccess().getArgsStringToStringMapEntryParserRuleCall_8_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChangePluginTransformation__ArgsAssignment_8_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChangePluginTransformationAccess().getArgsStringToStringMapEntryParserRuleCall_8_3_1_0()); }
		ruleStringToStringMapEntry
		{ after(grammarAccess.getChangePluginTransformationAccess().getArgsStringToStringMapEntryParserRuleCall_8_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringToStringMapEntry__KeyAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringToStringMapEntry__ValueAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringToStringMapEntryAccess().getValueEStringParserRuleCall_5_0()); }
		ruleEString
		{ after(grammarAccess.getStringToStringMapEntryAccess().getValueEStringParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
