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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CICD'", "'GHA'", "'CircleCI'", "'TransformationSet'", "'{'", "'}'", "'transformations'", "','", "'ChangePluginTransformation'", "'model'", "'version'", "'name'", "'args'", "'StringToStringMapEntry'", "'key'", "'value'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDSL.g"; }


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



    // $ANTLR start "entryRuleTransformationSet"
    // InternalDSL.g:53:1: entryRuleTransformationSet : ruleTransformationSet EOF ;
    public final void entryRuleTransformationSet() throws RecognitionException {
        try {
            // InternalDSL.g:54:1: ( ruleTransformationSet EOF )
            // InternalDSL.g:55:1: ruleTransformationSet EOF
            {
             before(grammarAccess.getTransformationSetRule()); 
            pushFollow(FOLLOW_1);
            ruleTransformationSet();

            state._fsp--;

             after(grammarAccess.getTransformationSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransformationSet"


    // $ANTLR start "ruleTransformationSet"
    // InternalDSL.g:62:1: ruleTransformationSet : ( ( rule__TransformationSet__Group__0 ) ) ;
    public final void ruleTransformationSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:66:2: ( ( ( rule__TransformationSet__Group__0 ) ) )
            // InternalDSL.g:67:2: ( ( rule__TransformationSet__Group__0 ) )
            {
            // InternalDSL.g:67:2: ( ( rule__TransformationSet__Group__0 ) )
            // InternalDSL.g:68:3: ( rule__TransformationSet__Group__0 )
            {
             before(grammarAccess.getTransformationSetAccess().getGroup()); 
            // InternalDSL.g:69:3: ( rule__TransformationSet__Group__0 )
            // InternalDSL.g:69:4: rule__TransformationSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransformationSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransformationSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransformationSet"


    // $ANTLR start "entryRuleTransformation"
    // InternalDSL.g:78:1: entryRuleTransformation : ruleTransformation EOF ;
    public final void entryRuleTransformation() throws RecognitionException {
        try {
            // InternalDSL.g:79:1: ( ruleTransformation EOF )
            // InternalDSL.g:80:1: ruleTransformation EOF
            {
             before(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // InternalDSL.g:87:1: ruleTransformation : ( ruleChangePluginTransformation ) ;
    public final void ruleTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:91:2: ( ( ruleChangePluginTransformation ) )
            // InternalDSL.g:92:2: ( ruleChangePluginTransformation )
            {
            // InternalDSL.g:92:2: ( ruleChangePluginTransformation )
            // InternalDSL.g:93:3: ruleChangePluginTransformation
            {
             before(grammarAccess.getTransformationAccess().getChangePluginTransformationParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleChangePluginTransformation();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getChangePluginTransformationParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleChangePluginTransformation"
    // InternalDSL.g:103:1: entryRuleChangePluginTransformation : ruleChangePluginTransformation EOF ;
    public final void entryRuleChangePluginTransformation() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( ruleChangePluginTransformation EOF )
            // InternalDSL.g:105:1: ruleChangePluginTransformation EOF
            {
             before(grammarAccess.getChangePluginTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleChangePluginTransformation();

            state._fsp--;

             after(grammarAccess.getChangePluginTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChangePluginTransformation"


    // $ANTLR start "ruleChangePluginTransformation"
    // InternalDSL.g:112:1: ruleChangePluginTransformation : ( ( rule__ChangePluginTransformation__Group__0 ) ) ;
    public final void ruleChangePluginTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__ChangePluginTransformation__Group__0 ) ) )
            // InternalDSL.g:117:2: ( ( rule__ChangePluginTransformation__Group__0 ) )
            {
            // InternalDSL.g:117:2: ( ( rule__ChangePluginTransformation__Group__0 ) )
            // InternalDSL.g:118:3: ( rule__ChangePluginTransformation__Group__0 )
            {
             before(grammarAccess.getChangePluginTransformationAccess().getGroup()); 
            // InternalDSL.g:119:3: ( rule__ChangePluginTransformation__Group__0 )
            // InternalDSL.g:119:4: rule__ChangePluginTransformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangePluginTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChangePluginTransformation"


    // $ANTLR start "entryRuleStringToStringMapEntry"
    // InternalDSL.g:128:1: entryRuleStringToStringMapEntry : ruleStringToStringMapEntry EOF ;
    public final void entryRuleStringToStringMapEntry() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( ruleStringToStringMapEntry EOF )
            // InternalDSL.g:130:1: ruleStringToStringMapEntry EOF
            {
             before(grammarAccess.getStringToStringMapEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleStringToStringMapEntry();

            state._fsp--;

             after(grammarAccess.getStringToStringMapEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringToStringMapEntry"


    // $ANTLR start "ruleStringToStringMapEntry"
    // InternalDSL.g:137:1: ruleStringToStringMapEntry : ( ( rule__StringToStringMapEntry__Group__0 ) ) ;
    public final void ruleStringToStringMapEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__StringToStringMapEntry__Group__0 ) ) )
            // InternalDSL.g:142:2: ( ( rule__StringToStringMapEntry__Group__0 ) )
            {
            // InternalDSL.g:142:2: ( ( rule__StringToStringMapEntry__Group__0 ) )
            // InternalDSL.g:143:3: ( rule__StringToStringMapEntry__Group__0 )
            {
             before(grammarAccess.getStringToStringMapEntryAccess().getGroup()); 
            // InternalDSL.g:144:3: ( rule__StringToStringMapEntry__Group__0 )
            // InternalDSL.g:144:4: rule__StringToStringMapEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringToStringMapEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringToStringMapEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringToStringMapEntry"


    // $ANTLR start "entryRuleEString"
    // InternalDSL.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( ruleEString EOF )
            // InternalDSL.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDSL.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDSL.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDSL.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalDSL.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDSL.g:169:3: ( rule__EString__Alternatives )
            // InternalDSL.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleMODEL_NAMES"
    // InternalDSL.g:178:1: ruleMODEL_NAMES : ( ( rule__MODEL_NAMES__Alternatives ) ) ;
    public final void ruleMODEL_NAMES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:182:1: ( ( ( rule__MODEL_NAMES__Alternatives ) ) )
            // InternalDSL.g:183:2: ( ( rule__MODEL_NAMES__Alternatives ) )
            {
            // InternalDSL.g:183:2: ( ( rule__MODEL_NAMES__Alternatives ) )
            // InternalDSL.g:184:3: ( rule__MODEL_NAMES__Alternatives )
            {
             before(grammarAccess.getMODEL_NAMESAccess().getAlternatives()); 
            // InternalDSL.g:185:3: ( rule__MODEL_NAMES__Alternatives )
            // InternalDSL.g:185:4: rule__MODEL_NAMES__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MODEL_NAMES__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMODEL_NAMESAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMODEL_NAMES"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDSL.g:193:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:197:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDSL.g:198:2: ( RULE_STRING )
                    {
                    // InternalDSL.g:198:2: ( RULE_STRING )
                    // InternalDSL.g:199:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:204:2: ( RULE_ID )
                    {
                    // InternalDSL.g:204:2: ( RULE_ID )
                    // InternalDSL.g:205:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__MODEL_NAMES__Alternatives"
    // InternalDSL.g:214:1: rule__MODEL_NAMES__Alternatives : ( ( ( 'CICD' ) ) | ( ( 'GHA' ) ) | ( ( 'CircleCI' ) ) );
    public final void rule__MODEL_NAMES__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:218:1: ( ( ( 'CICD' ) ) | ( ( 'GHA' ) ) | ( ( 'CircleCI' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDSL.g:219:2: ( ( 'CICD' ) )
                    {
                    // InternalDSL.g:219:2: ( ( 'CICD' ) )
                    // InternalDSL.g:220:3: ( 'CICD' )
                    {
                     before(grammarAccess.getMODEL_NAMESAccess().getCICDEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:221:3: ( 'CICD' )
                    // InternalDSL.g:221:4: 'CICD'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMODEL_NAMESAccess().getCICDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:225:2: ( ( 'GHA' ) )
                    {
                    // InternalDSL.g:225:2: ( ( 'GHA' ) )
                    // InternalDSL.g:226:3: ( 'GHA' )
                    {
                     before(grammarAccess.getMODEL_NAMESAccess().getGHAEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:227:3: ( 'GHA' )
                    // InternalDSL.g:227:4: 'GHA'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMODEL_NAMESAccess().getGHAEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:231:2: ( ( 'CircleCI' ) )
                    {
                    // InternalDSL.g:231:2: ( ( 'CircleCI' ) )
                    // InternalDSL.g:232:3: ( 'CircleCI' )
                    {
                     before(grammarAccess.getMODEL_NAMESAccess().getCircleCIEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:233:3: ( 'CircleCI' )
                    // InternalDSL.g:233:4: 'CircleCI'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMODEL_NAMESAccess().getCircleCIEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODEL_NAMES__Alternatives"


    // $ANTLR start "rule__TransformationSet__Group__0"
    // InternalDSL.g:241:1: rule__TransformationSet__Group__0 : rule__TransformationSet__Group__0__Impl rule__TransformationSet__Group__1 ;
    public final void rule__TransformationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:245:1: ( rule__TransformationSet__Group__0__Impl rule__TransformationSet__Group__1 )
            // InternalDSL.g:246:2: rule__TransformationSet__Group__0__Impl rule__TransformationSet__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TransformationSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransformationSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group__0"


    // $ANTLR start "rule__TransformationSet__Group__0__Impl"
    // InternalDSL.g:253:1: rule__TransformationSet__Group__0__Impl : ( () ) ;
    public final void rule__TransformationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:257:1: ( ( () ) )
            // InternalDSL.g:258:1: ( () )
            {
            // InternalDSL.g:258:1: ( () )
            // InternalDSL.g:259:2: ()
            {
             before(grammarAccess.getTransformationSetAccess().getTransformationSetAction_0()); 
            // InternalDSL.g:260:2: ()
            // InternalDSL.g:260:3: 
            {
            }

             after(grammarAccess.getTransformationSetAccess().getTransformationSetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group__0__Impl"


    // $ANTLR start "rule__TransformationSet__Group__1"
    // InternalDSL.g:268:1: rule__TransformationSet__Group__1 : rule__TransformationSet__Group__1__Impl rule__TransformationSet__Group__2 ;
    public final void rule__TransformationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:272:1: ( rule__TransformationSet__Group__1__Impl rule__TransformationSet__Group__2 )
            // InternalDSL.g:273:2: rule__TransformationSet__Group__1__Impl rule__TransformationSet__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TransformationSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransformationSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group__1"


    // $ANTLR start "rule__TransformationSet__Group__1__Impl"
    // InternalDSL.g:280:1: rule__TransformationSet__Group__1__Impl : ( 'TransformationSet' ) ;
    public final void rule__TransformationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:284:1: ( ( 'TransformationSet' ) )
            // InternalDSL.g:285:1: ( 'TransformationSet' )
            {
            // InternalDSL.g:285:1: ( 'TransformationSet' )
            // InternalDSL.g:286:2: 'TransformationSet'
            {
             before(grammarAccess.getTransformationSetAccess().getTransformationSetKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransformationSetAccess().getTransformationSetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group__1__Impl"


    // $ANTLR start "rule__TransformationSet__Group__2"
    // InternalDSL.g:295:1: rule__TransformationSet__Group__2 : rule__TransformationSet__Group__2__Impl rule__TransformationSet__Group__3 ;
    public final void rule__TransformationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:299:1: ( rule__TransformationSet__Group__2__Impl rule__TransformationSet__Group__3 )
            // InternalDSL.g:300:2: rule__TransformationSet__Group__2__Impl rule__TransformationSet__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TransformationSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransformationSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group__2"


    // $ANTLR start "rule__TransformationSet__Group__2__Impl"
    // InternalDSL.g:307:1: rule__TransformationSet__Group__2__Impl : ( '{' ) ;
    public final void rule__TransformationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:311:1: ( ( '{' ) )
            // InternalDSL.g:312:1: ( '{' )
            {
            // InternalDSL.g:312:1: ( '{' )
            // InternalDSL.g:313:2: '{'
            {
             before(grammarAccess.getTransformationSetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransformationSetAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group__2__Impl"


    // $ANTLR start "rule__TransformationSet__Group__3"
    // InternalDSL.g:322:1: rule__TransformationSet__Group__3 : rule__TransformationSet__Group__3__Impl rule__TransformationSet__Group__4 ;
    public final void rule__TransformationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:326:1: ( rule__TransformationSet__Group__3__Impl rule__TransformationSet__Group__4 )
            // InternalDSL.g:327:2: rule__TransformationSet__Group__3__Impl rule__TransformationSet__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__TransformationSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransformationSet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group__3"


    // $ANTLR start "rule__TransformationSet__Group__3__Impl"
    // InternalDSL.g:334:1: rule__TransformationSet__Group__3__Impl : ( ( rule__TransformationSet__Group_3__0 )? ) ;
    public final void rule__TransformationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:338:1: ( ( ( rule__TransformationSet__Group_3__0 )? ) )
            // InternalDSL.g:339:1: ( ( rule__TransformationSet__Group_3__0 )? )
            {
            // InternalDSL.g:339:1: ( ( rule__TransformationSet__Group_3__0 )? )
            // InternalDSL.g:340:2: ( rule__TransformationSet__Group_3__0 )?
            {
             before(grammarAccess.getTransformationSetAccess().getGroup_3()); 
            // InternalDSL.g:341:2: ( rule__TransformationSet__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:341:3: rule__TransformationSet__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransformationSet__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransformationSetAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group__3__Impl"


    // $ANTLR start "rule__TransformationSet__Group__4"
    // InternalDSL.g:349:1: rule__TransformationSet__Group__4 : rule__TransformationSet__Group__4__Impl ;
    public final void rule__TransformationSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:353:1: ( rule__TransformationSet__Group__4__Impl )
            // InternalDSL.g:354:2: rule__TransformationSet__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransformationSet__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group__4"


    // $ANTLR start "rule__TransformationSet__Group__4__Impl"
    // InternalDSL.g:360:1: rule__TransformationSet__Group__4__Impl : ( '}' ) ;
    public final void rule__TransformationSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:364:1: ( ( '}' ) )
            // InternalDSL.g:365:1: ( '}' )
            {
            // InternalDSL.g:365:1: ( '}' )
            // InternalDSL.g:366:2: '}'
            {
             before(grammarAccess.getTransformationSetAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTransformationSetAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group__4__Impl"


    // $ANTLR start "rule__TransformationSet__Group_3__0"
    // InternalDSL.g:376:1: rule__TransformationSet__Group_3__0 : rule__TransformationSet__Group_3__0__Impl rule__TransformationSet__Group_3__1 ;
    public final void rule__TransformationSet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:380:1: ( rule__TransformationSet__Group_3__0__Impl rule__TransformationSet__Group_3__1 )
            // InternalDSL.g:381:2: rule__TransformationSet__Group_3__0__Impl rule__TransformationSet__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TransformationSet__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransformationSet__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group_3__0"


    // $ANTLR start "rule__TransformationSet__Group_3__0__Impl"
    // InternalDSL.g:388:1: rule__TransformationSet__Group_3__0__Impl : ( 'transformations' ) ;
    public final void rule__TransformationSet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:392:1: ( ( 'transformations' ) )
            // InternalDSL.g:393:1: ( 'transformations' )
            {
            // InternalDSL.g:393:1: ( 'transformations' )
            // InternalDSL.g:394:2: 'transformations'
            {
             before(grammarAccess.getTransformationSetAccess().getTransformationsKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTransformationSetAccess().getTransformationsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group_3__0__Impl"


    // $ANTLR start "rule__TransformationSet__Group_3__1"
    // InternalDSL.g:403:1: rule__TransformationSet__Group_3__1 : rule__TransformationSet__Group_3__1__Impl rule__TransformationSet__Group_3__2 ;
    public final void rule__TransformationSet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:407:1: ( rule__TransformationSet__Group_3__1__Impl rule__TransformationSet__Group_3__2 )
            // InternalDSL.g:408:2: rule__TransformationSet__Group_3__1__Impl rule__TransformationSet__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__TransformationSet__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransformationSet__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group_3__1"


    // $ANTLR start "rule__TransformationSet__Group_3__1__Impl"
    // InternalDSL.g:415:1: rule__TransformationSet__Group_3__1__Impl : ( '{' ) ;
    public final void rule__TransformationSet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:419:1: ( ( '{' ) )
            // InternalDSL.g:420:1: ( '{' )
            {
            // InternalDSL.g:420:1: ( '{' )
            // InternalDSL.g:421:2: '{'
            {
             before(grammarAccess.getTransformationSetAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransformationSetAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group_3__1__Impl"


    // $ANTLR start "rule__TransformationSet__Group_3__2"
    // InternalDSL.g:430:1: rule__TransformationSet__Group_3__2 : rule__TransformationSet__Group_3__2__Impl rule__TransformationSet__Group_3__3 ;
    public final void rule__TransformationSet__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:434:1: ( rule__TransformationSet__Group_3__2__Impl rule__TransformationSet__Group_3__3 )
            // InternalDSL.g:435:2: rule__TransformationSet__Group_3__2__Impl rule__TransformationSet__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__TransformationSet__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransformationSet__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group_3__2"


    // $ANTLR start "rule__TransformationSet__Group_3__2__Impl"
    // InternalDSL.g:442:1: rule__TransformationSet__Group_3__2__Impl : ( ( rule__TransformationSet__TransformationsAssignment_3_2 ) ) ;
    public final void rule__TransformationSet__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:446:1: ( ( ( rule__TransformationSet__TransformationsAssignment_3_2 ) ) )
            // InternalDSL.g:447:1: ( ( rule__TransformationSet__TransformationsAssignment_3_2 ) )
            {
            // InternalDSL.g:447:1: ( ( rule__TransformationSet__TransformationsAssignment_3_2 ) )
            // InternalDSL.g:448:2: ( rule__TransformationSet__TransformationsAssignment_3_2 )
            {
             before(grammarAccess.getTransformationSetAccess().getTransformationsAssignment_3_2()); 
            // InternalDSL.g:449:2: ( rule__TransformationSet__TransformationsAssignment_3_2 )
            // InternalDSL.g:449:3: rule__TransformationSet__TransformationsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__TransformationSet__TransformationsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTransformationSetAccess().getTransformationsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group_3__2__Impl"


    // $ANTLR start "rule__TransformationSet__Group_3__3"
    // InternalDSL.g:457:1: rule__TransformationSet__Group_3__3 : rule__TransformationSet__Group_3__3__Impl rule__TransformationSet__Group_3__4 ;
    public final void rule__TransformationSet__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:461:1: ( rule__TransformationSet__Group_3__3__Impl rule__TransformationSet__Group_3__4 )
            // InternalDSL.g:462:2: rule__TransformationSet__Group_3__3__Impl rule__TransformationSet__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__TransformationSet__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransformationSet__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group_3__3"


    // $ANTLR start "rule__TransformationSet__Group_3__3__Impl"
    // InternalDSL.g:469:1: rule__TransformationSet__Group_3__3__Impl : ( ( rule__TransformationSet__Group_3_3__0 )* ) ;
    public final void rule__TransformationSet__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:473:1: ( ( ( rule__TransformationSet__Group_3_3__0 )* ) )
            // InternalDSL.g:474:1: ( ( rule__TransformationSet__Group_3_3__0 )* )
            {
            // InternalDSL.g:474:1: ( ( rule__TransformationSet__Group_3_3__0 )* )
            // InternalDSL.g:475:2: ( rule__TransformationSet__Group_3_3__0 )*
            {
             before(grammarAccess.getTransformationSetAccess().getGroup_3_3()); 
            // InternalDSL.g:476:2: ( rule__TransformationSet__Group_3_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDSL.g:476:3: rule__TransformationSet__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TransformationSet__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTransformationSetAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group_3__3__Impl"


    // $ANTLR start "rule__TransformationSet__Group_3__4"
    // InternalDSL.g:484:1: rule__TransformationSet__Group_3__4 : rule__TransformationSet__Group_3__4__Impl ;
    public final void rule__TransformationSet__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:488:1: ( rule__TransformationSet__Group_3__4__Impl )
            // InternalDSL.g:489:2: rule__TransformationSet__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransformationSet__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group_3__4"


    // $ANTLR start "rule__TransformationSet__Group_3__4__Impl"
    // InternalDSL.g:495:1: rule__TransformationSet__Group_3__4__Impl : ( '}' ) ;
    public final void rule__TransformationSet__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:499:1: ( ( '}' ) )
            // InternalDSL.g:500:1: ( '}' )
            {
            // InternalDSL.g:500:1: ( '}' )
            // InternalDSL.g:501:2: '}'
            {
             before(grammarAccess.getTransformationSetAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTransformationSetAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group_3__4__Impl"


    // $ANTLR start "rule__TransformationSet__Group_3_3__0"
    // InternalDSL.g:511:1: rule__TransformationSet__Group_3_3__0 : rule__TransformationSet__Group_3_3__0__Impl rule__TransformationSet__Group_3_3__1 ;
    public final void rule__TransformationSet__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:515:1: ( rule__TransformationSet__Group_3_3__0__Impl rule__TransformationSet__Group_3_3__1 )
            // InternalDSL.g:516:2: rule__TransformationSet__Group_3_3__0__Impl rule__TransformationSet__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__TransformationSet__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransformationSet__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group_3_3__0"


    // $ANTLR start "rule__TransformationSet__Group_3_3__0__Impl"
    // InternalDSL.g:523:1: rule__TransformationSet__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__TransformationSet__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:527:1: ( ( ',' ) )
            // InternalDSL.g:528:1: ( ',' )
            {
            // InternalDSL.g:528:1: ( ',' )
            // InternalDSL.g:529:2: ','
            {
             before(grammarAccess.getTransformationSetAccess().getCommaKeyword_3_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTransformationSetAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group_3_3__0__Impl"


    // $ANTLR start "rule__TransformationSet__Group_3_3__1"
    // InternalDSL.g:538:1: rule__TransformationSet__Group_3_3__1 : rule__TransformationSet__Group_3_3__1__Impl ;
    public final void rule__TransformationSet__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:542:1: ( rule__TransformationSet__Group_3_3__1__Impl )
            // InternalDSL.g:543:2: rule__TransformationSet__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransformationSet__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group_3_3__1"


    // $ANTLR start "rule__TransformationSet__Group_3_3__1__Impl"
    // InternalDSL.g:549:1: rule__TransformationSet__Group_3_3__1__Impl : ( ( rule__TransformationSet__TransformationsAssignment_3_3_1 ) ) ;
    public final void rule__TransformationSet__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:553:1: ( ( ( rule__TransformationSet__TransformationsAssignment_3_3_1 ) ) )
            // InternalDSL.g:554:1: ( ( rule__TransformationSet__TransformationsAssignment_3_3_1 ) )
            {
            // InternalDSL.g:554:1: ( ( rule__TransformationSet__TransformationsAssignment_3_3_1 ) )
            // InternalDSL.g:555:2: ( rule__TransformationSet__TransformationsAssignment_3_3_1 )
            {
             before(grammarAccess.getTransformationSetAccess().getTransformationsAssignment_3_3_1()); 
            // InternalDSL.g:556:2: ( rule__TransformationSet__TransformationsAssignment_3_3_1 )
            // InternalDSL.g:556:3: rule__TransformationSet__TransformationsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TransformationSet__TransformationsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransformationSetAccess().getTransformationsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__Group_3_3__1__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group__0"
    // InternalDSL.g:565:1: rule__ChangePluginTransformation__Group__0 : rule__ChangePluginTransformation__Group__0__Impl rule__ChangePluginTransformation__Group__1 ;
    public final void rule__ChangePluginTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:569:1: ( rule__ChangePluginTransformation__Group__0__Impl rule__ChangePluginTransformation__Group__1 )
            // InternalDSL.g:570:2: rule__ChangePluginTransformation__Group__0__Impl rule__ChangePluginTransformation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ChangePluginTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__0"


    // $ANTLR start "rule__ChangePluginTransformation__Group__0__Impl"
    // InternalDSL.g:577:1: rule__ChangePluginTransformation__Group__0__Impl : ( 'ChangePluginTransformation' ) ;
    public final void rule__ChangePluginTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:581:1: ( ( 'ChangePluginTransformation' ) )
            // InternalDSL.g:582:1: ( 'ChangePluginTransformation' )
            {
            // InternalDSL.g:582:1: ( 'ChangePluginTransformation' )
            // InternalDSL.g:583:2: 'ChangePluginTransformation'
            {
             before(grammarAccess.getChangePluginTransformationAccess().getChangePluginTransformationKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getChangePluginTransformationAccess().getChangePluginTransformationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__0__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group__1"
    // InternalDSL.g:592:1: rule__ChangePluginTransformation__Group__1 : rule__ChangePluginTransformation__Group__1__Impl rule__ChangePluginTransformation__Group__2 ;
    public final void rule__ChangePluginTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:596:1: ( rule__ChangePluginTransformation__Group__1__Impl rule__ChangePluginTransformation__Group__2 )
            // InternalDSL.g:597:2: rule__ChangePluginTransformation__Group__1__Impl rule__ChangePluginTransformation__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ChangePluginTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__1"


    // $ANTLR start "rule__ChangePluginTransformation__Group__1__Impl"
    // InternalDSL.g:604:1: rule__ChangePluginTransformation__Group__1__Impl : ( '{' ) ;
    public final void rule__ChangePluginTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:608:1: ( ( '{' ) )
            // InternalDSL.g:609:1: ( '{' )
            {
            // InternalDSL.g:609:1: ( '{' )
            // InternalDSL.g:610:2: '{'
            {
             before(grammarAccess.getChangePluginTransformationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChangePluginTransformationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__1__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group__2"
    // InternalDSL.g:619:1: rule__ChangePluginTransformation__Group__2 : rule__ChangePluginTransformation__Group__2__Impl rule__ChangePluginTransformation__Group__3 ;
    public final void rule__ChangePluginTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:623:1: ( rule__ChangePluginTransformation__Group__2__Impl rule__ChangePluginTransformation__Group__3 )
            // InternalDSL.g:624:2: rule__ChangePluginTransformation__Group__2__Impl rule__ChangePluginTransformation__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ChangePluginTransformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__2"


    // $ANTLR start "rule__ChangePluginTransformation__Group__2__Impl"
    // InternalDSL.g:631:1: rule__ChangePluginTransformation__Group__2__Impl : ( 'model' ) ;
    public final void rule__ChangePluginTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:635:1: ( ( 'model' ) )
            // InternalDSL.g:636:1: ( 'model' )
            {
            // InternalDSL.g:636:1: ( 'model' )
            // InternalDSL.g:637:2: 'model'
            {
             before(grammarAccess.getChangePluginTransformationAccess().getModelKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChangePluginTransformationAccess().getModelKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__2__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group__3"
    // InternalDSL.g:646:1: rule__ChangePluginTransformation__Group__3 : rule__ChangePluginTransformation__Group__3__Impl rule__ChangePluginTransformation__Group__4 ;
    public final void rule__ChangePluginTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:650:1: ( rule__ChangePluginTransformation__Group__3__Impl rule__ChangePluginTransformation__Group__4 )
            // InternalDSL.g:651:2: rule__ChangePluginTransformation__Group__3__Impl rule__ChangePluginTransformation__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__ChangePluginTransformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__3"


    // $ANTLR start "rule__ChangePluginTransformation__Group__3__Impl"
    // InternalDSL.g:658:1: rule__ChangePluginTransformation__Group__3__Impl : ( ( rule__ChangePluginTransformation__ModelAssignment_3 ) ) ;
    public final void rule__ChangePluginTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:662:1: ( ( ( rule__ChangePluginTransformation__ModelAssignment_3 ) ) )
            // InternalDSL.g:663:1: ( ( rule__ChangePluginTransformation__ModelAssignment_3 ) )
            {
            // InternalDSL.g:663:1: ( ( rule__ChangePluginTransformation__ModelAssignment_3 ) )
            // InternalDSL.g:664:2: ( rule__ChangePluginTransformation__ModelAssignment_3 )
            {
             before(grammarAccess.getChangePluginTransformationAccess().getModelAssignment_3()); 
            // InternalDSL.g:665:2: ( rule__ChangePluginTransformation__ModelAssignment_3 )
            // InternalDSL.g:665:3: rule__ChangePluginTransformation__ModelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__ModelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChangePluginTransformationAccess().getModelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__3__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group__4"
    // InternalDSL.g:673:1: rule__ChangePluginTransformation__Group__4 : rule__ChangePluginTransformation__Group__4__Impl rule__ChangePluginTransformation__Group__5 ;
    public final void rule__ChangePluginTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:677:1: ( rule__ChangePluginTransformation__Group__4__Impl rule__ChangePluginTransformation__Group__5 )
            // InternalDSL.g:678:2: rule__ChangePluginTransformation__Group__4__Impl rule__ChangePluginTransformation__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ChangePluginTransformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__4"


    // $ANTLR start "rule__ChangePluginTransformation__Group__4__Impl"
    // InternalDSL.g:685:1: rule__ChangePluginTransformation__Group__4__Impl : ( 'version' ) ;
    public final void rule__ChangePluginTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:689:1: ( ( 'version' ) )
            // InternalDSL.g:690:1: ( 'version' )
            {
            // InternalDSL.g:690:1: ( 'version' )
            // InternalDSL.g:691:2: 'version'
            {
             before(grammarAccess.getChangePluginTransformationAccess().getVersionKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getChangePluginTransformationAccess().getVersionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__4__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group__5"
    // InternalDSL.g:700:1: rule__ChangePluginTransformation__Group__5 : rule__ChangePluginTransformation__Group__5__Impl rule__ChangePluginTransformation__Group__6 ;
    public final void rule__ChangePluginTransformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:704:1: ( rule__ChangePluginTransformation__Group__5__Impl rule__ChangePluginTransformation__Group__6 )
            // InternalDSL.g:705:2: rule__ChangePluginTransformation__Group__5__Impl rule__ChangePluginTransformation__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__ChangePluginTransformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__5"


    // $ANTLR start "rule__ChangePluginTransformation__Group__5__Impl"
    // InternalDSL.g:712:1: rule__ChangePluginTransformation__Group__5__Impl : ( ( rule__ChangePluginTransformation__VersionAssignment_5 ) ) ;
    public final void rule__ChangePluginTransformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:716:1: ( ( ( rule__ChangePluginTransformation__VersionAssignment_5 ) ) )
            // InternalDSL.g:717:1: ( ( rule__ChangePluginTransformation__VersionAssignment_5 ) )
            {
            // InternalDSL.g:717:1: ( ( rule__ChangePluginTransformation__VersionAssignment_5 ) )
            // InternalDSL.g:718:2: ( rule__ChangePluginTransformation__VersionAssignment_5 )
            {
             before(grammarAccess.getChangePluginTransformationAccess().getVersionAssignment_5()); 
            // InternalDSL.g:719:2: ( rule__ChangePluginTransformation__VersionAssignment_5 )
            // InternalDSL.g:719:3: rule__ChangePluginTransformation__VersionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__VersionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getChangePluginTransformationAccess().getVersionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__5__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group__6"
    // InternalDSL.g:727:1: rule__ChangePluginTransformation__Group__6 : rule__ChangePluginTransformation__Group__6__Impl rule__ChangePluginTransformation__Group__7 ;
    public final void rule__ChangePluginTransformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:731:1: ( rule__ChangePluginTransformation__Group__6__Impl rule__ChangePluginTransformation__Group__7 )
            // InternalDSL.g:732:2: rule__ChangePluginTransformation__Group__6__Impl rule__ChangePluginTransformation__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__ChangePluginTransformation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__6"


    // $ANTLR start "rule__ChangePluginTransformation__Group__6__Impl"
    // InternalDSL.g:739:1: rule__ChangePluginTransformation__Group__6__Impl : ( 'name' ) ;
    public final void rule__ChangePluginTransformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:743:1: ( ( 'name' ) )
            // InternalDSL.g:744:1: ( 'name' )
            {
            // InternalDSL.g:744:1: ( 'name' )
            // InternalDSL.g:745:2: 'name'
            {
             before(grammarAccess.getChangePluginTransformationAccess().getNameKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getChangePluginTransformationAccess().getNameKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__6__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group__7"
    // InternalDSL.g:754:1: rule__ChangePluginTransformation__Group__7 : rule__ChangePluginTransformation__Group__7__Impl rule__ChangePluginTransformation__Group__8 ;
    public final void rule__ChangePluginTransformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:758:1: ( rule__ChangePluginTransformation__Group__7__Impl rule__ChangePluginTransformation__Group__8 )
            // InternalDSL.g:759:2: rule__ChangePluginTransformation__Group__7__Impl rule__ChangePluginTransformation__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__ChangePluginTransformation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__7"


    // $ANTLR start "rule__ChangePluginTransformation__Group__7__Impl"
    // InternalDSL.g:766:1: rule__ChangePluginTransformation__Group__7__Impl : ( ( rule__ChangePluginTransformation__NameAssignment_7 ) ) ;
    public final void rule__ChangePluginTransformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:770:1: ( ( ( rule__ChangePluginTransformation__NameAssignment_7 ) ) )
            // InternalDSL.g:771:1: ( ( rule__ChangePluginTransformation__NameAssignment_7 ) )
            {
            // InternalDSL.g:771:1: ( ( rule__ChangePluginTransformation__NameAssignment_7 ) )
            // InternalDSL.g:772:2: ( rule__ChangePluginTransformation__NameAssignment_7 )
            {
             before(grammarAccess.getChangePluginTransformationAccess().getNameAssignment_7()); 
            // InternalDSL.g:773:2: ( rule__ChangePluginTransformation__NameAssignment_7 )
            // InternalDSL.g:773:3: rule__ChangePluginTransformation__NameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__NameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getChangePluginTransformationAccess().getNameAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__7__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group__8"
    // InternalDSL.g:781:1: rule__ChangePluginTransformation__Group__8 : rule__ChangePluginTransformation__Group__8__Impl rule__ChangePluginTransformation__Group__9 ;
    public final void rule__ChangePluginTransformation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:785:1: ( rule__ChangePluginTransformation__Group__8__Impl rule__ChangePluginTransformation__Group__9 )
            // InternalDSL.g:786:2: rule__ChangePluginTransformation__Group__8__Impl rule__ChangePluginTransformation__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__ChangePluginTransformation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__8"


    // $ANTLR start "rule__ChangePluginTransformation__Group__8__Impl"
    // InternalDSL.g:793:1: rule__ChangePluginTransformation__Group__8__Impl : ( ( rule__ChangePluginTransformation__Group_8__0 )? ) ;
    public final void rule__ChangePluginTransformation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:797:1: ( ( ( rule__ChangePluginTransformation__Group_8__0 )? ) )
            // InternalDSL.g:798:1: ( ( rule__ChangePluginTransformation__Group_8__0 )? )
            {
            // InternalDSL.g:798:1: ( ( rule__ChangePluginTransformation__Group_8__0 )? )
            // InternalDSL.g:799:2: ( rule__ChangePluginTransformation__Group_8__0 )?
            {
             before(grammarAccess.getChangePluginTransformationAccess().getGroup_8()); 
            // InternalDSL.g:800:2: ( rule__ChangePluginTransformation__Group_8__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDSL.g:800:3: rule__ChangePluginTransformation__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangePluginTransformation__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChangePluginTransformationAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__8__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group__9"
    // InternalDSL.g:808:1: rule__ChangePluginTransformation__Group__9 : rule__ChangePluginTransformation__Group__9__Impl ;
    public final void rule__ChangePluginTransformation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:812:1: ( rule__ChangePluginTransformation__Group__9__Impl )
            // InternalDSL.g:813:2: rule__ChangePluginTransformation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__9"


    // $ANTLR start "rule__ChangePluginTransformation__Group__9__Impl"
    // InternalDSL.g:819:1: rule__ChangePluginTransformation__Group__9__Impl : ( '}' ) ;
    public final void rule__ChangePluginTransformation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:823:1: ( ( '}' ) )
            // InternalDSL.g:824:1: ( '}' )
            {
            // InternalDSL.g:824:1: ( '}' )
            // InternalDSL.g:825:2: '}'
            {
             before(grammarAccess.getChangePluginTransformationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getChangePluginTransformationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group__9__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group_8__0"
    // InternalDSL.g:835:1: rule__ChangePluginTransformation__Group_8__0 : rule__ChangePluginTransformation__Group_8__0__Impl rule__ChangePluginTransformation__Group_8__1 ;
    public final void rule__ChangePluginTransformation__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:839:1: ( rule__ChangePluginTransformation__Group_8__0__Impl rule__ChangePluginTransformation__Group_8__1 )
            // InternalDSL.g:840:2: rule__ChangePluginTransformation__Group_8__0__Impl rule__ChangePluginTransformation__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__ChangePluginTransformation__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group_8__0"


    // $ANTLR start "rule__ChangePluginTransformation__Group_8__0__Impl"
    // InternalDSL.g:847:1: rule__ChangePluginTransformation__Group_8__0__Impl : ( 'args' ) ;
    public final void rule__ChangePluginTransformation__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:851:1: ( ( 'args' ) )
            // InternalDSL.g:852:1: ( 'args' )
            {
            // InternalDSL.g:852:1: ( 'args' )
            // InternalDSL.g:853:2: 'args'
            {
             before(grammarAccess.getChangePluginTransformationAccess().getArgsKeyword_8_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getChangePluginTransformationAccess().getArgsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group_8__0__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group_8__1"
    // InternalDSL.g:862:1: rule__ChangePluginTransformation__Group_8__1 : rule__ChangePluginTransformation__Group_8__1__Impl rule__ChangePluginTransformation__Group_8__2 ;
    public final void rule__ChangePluginTransformation__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:866:1: ( rule__ChangePluginTransformation__Group_8__1__Impl rule__ChangePluginTransformation__Group_8__2 )
            // InternalDSL.g:867:2: rule__ChangePluginTransformation__Group_8__1__Impl rule__ChangePluginTransformation__Group_8__2
            {
            pushFollow(FOLLOW_14);
            rule__ChangePluginTransformation__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group_8__1"


    // $ANTLR start "rule__ChangePluginTransformation__Group_8__1__Impl"
    // InternalDSL.g:874:1: rule__ChangePluginTransformation__Group_8__1__Impl : ( '{' ) ;
    public final void rule__ChangePluginTransformation__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:878:1: ( ( '{' ) )
            // InternalDSL.g:879:1: ( '{' )
            {
            // InternalDSL.g:879:1: ( '{' )
            // InternalDSL.g:880:2: '{'
            {
             before(grammarAccess.getChangePluginTransformationAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChangePluginTransformationAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group_8__1__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group_8__2"
    // InternalDSL.g:889:1: rule__ChangePluginTransformation__Group_8__2 : rule__ChangePluginTransformation__Group_8__2__Impl rule__ChangePluginTransformation__Group_8__3 ;
    public final void rule__ChangePluginTransformation__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:893:1: ( rule__ChangePluginTransformation__Group_8__2__Impl rule__ChangePluginTransformation__Group_8__3 )
            // InternalDSL.g:894:2: rule__ChangePluginTransformation__Group_8__2__Impl rule__ChangePluginTransformation__Group_8__3
            {
            pushFollow(FOLLOW_7);
            rule__ChangePluginTransformation__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group_8__2"


    // $ANTLR start "rule__ChangePluginTransformation__Group_8__2__Impl"
    // InternalDSL.g:901:1: rule__ChangePluginTransformation__Group_8__2__Impl : ( ( rule__ChangePluginTransformation__ArgsAssignment_8_2 ) ) ;
    public final void rule__ChangePluginTransformation__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:905:1: ( ( ( rule__ChangePluginTransformation__ArgsAssignment_8_2 ) ) )
            // InternalDSL.g:906:1: ( ( rule__ChangePluginTransformation__ArgsAssignment_8_2 ) )
            {
            // InternalDSL.g:906:1: ( ( rule__ChangePluginTransformation__ArgsAssignment_8_2 ) )
            // InternalDSL.g:907:2: ( rule__ChangePluginTransformation__ArgsAssignment_8_2 )
            {
             before(grammarAccess.getChangePluginTransformationAccess().getArgsAssignment_8_2()); 
            // InternalDSL.g:908:2: ( rule__ChangePluginTransformation__ArgsAssignment_8_2 )
            // InternalDSL.g:908:3: rule__ChangePluginTransformation__ArgsAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__ArgsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getChangePluginTransformationAccess().getArgsAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group_8__2__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group_8__3"
    // InternalDSL.g:916:1: rule__ChangePluginTransformation__Group_8__3 : rule__ChangePluginTransformation__Group_8__3__Impl rule__ChangePluginTransformation__Group_8__4 ;
    public final void rule__ChangePluginTransformation__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:920:1: ( rule__ChangePluginTransformation__Group_8__3__Impl rule__ChangePluginTransformation__Group_8__4 )
            // InternalDSL.g:921:2: rule__ChangePluginTransformation__Group_8__3__Impl rule__ChangePluginTransformation__Group_8__4
            {
            pushFollow(FOLLOW_7);
            rule__ChangePluginTransformation__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group_8__3"


    // $ANTLR start "rule__ChangePluginTransformation__Group_8__3__Impl"
    // InternalDSL.g:928:1: rule__ChangePluginTransformation__Group_8__3__Impl : ( ( rule__ChangePluginTransformation__Group_8_3__0 )* ) ;
    public final void rule__ChangePluginTransformation__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:932:1: ( ( ( rule__ChangePluginTransformation__Group_8_3__0 )* ) )
            // InternalDSL.g:933:1: ( ( rule__ChangePluginTransformation__Group_8_3__0 )* )
            {
            // InternalDSL.g:933:1: ( ( rule__ChangePluginTransformation__Group_8_3__0 )* )
            // InternalDSL.g:934:2: ( rule__ChangePluginTransformation__Group_8_3__0 )*
            {
             before(grammarAccess.getChangePluginTransformationAccess().getGroup_8_3()); 
            // InternalDSL.g:935:2: ( rule__ChangePluginTransformation__Group_8_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDSL.g:935:3: rule__ChangePluginTransformation__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ChangePluginTransformation__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getChangePluginTransformationAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group_8__3__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group_8__4"
    // InternalDSL.g:943:1: rule__ChangePluginTransformation__Group_8__4 : rule__ChangePluginTransformation__Group_8__4__Impl ;
    public final void rule__ChangePluginTransformation__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:947:1: ( rule__ChangePluginTransformation__Group_8__4__Impl )
            // InternalDSL.g:948:2: rule__ChangePluginTransformation__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group_8__4"


    // $ANTLR start "rule__ChangePluginTransformation__Group_8__4__Impl"
    // InternalDSL.g:954:1: rule__ChangePluginTransformation__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ChangePluginTransformation__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:958:1: ( ( '}' ) )
            // InternalDSL.g:959:1: ( '}' )
            {
            // InternalDSL.g:959:1: ( '}' )
            // InternalDSL.g:960:2: '}'
            {
             before(grammarAccess.getChangePluginTransformationAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getChangePluginTransformationAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group_8__4__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group_8_3__0"
    // InternalDSL.g:970:1: rule__ChangePluginTransformation__Group_8_3__0 : rule__ChangePluginTransformation__Group_8_3__0__Impl rule__ChangePluginTransformation__Group_8_3__1 ;
    public final void rule__ChangePluginTransformation__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:974:1: ( rule__ChangePluginTransformation__Group_8_3__0__Impl rule__ChangePluginTransformation__Group_8_3__1 )
            // InternalDSL.g:975:2: rule__ChangePluginTransformation__Group_8_3__0__Impl rule__ChangePluginTransformation__Group_8_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ChangePluginTransformation__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group_8_3__0"


    // $ANTLR start "rule__ChangePluginTransformation__Group_8_3__0__Impl"
    // InternalDSL.g:982:1: rule__ChangePluginTransformation__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__ChangePluginTransformation__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:986:1: ( ( ',' ) )
            // InternalDSL.g:987:1: ( ',' )
            {
            // InternalDSL.g:987:1: ( ',' )
            // InternalDSL.g:988:2: ','
            {
             before(grammarAccess.getChangePluginTransformationAccess().getCommaKeyword_8_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getChangePluginTransformationAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group_8_3__0__Impl"


    // $ANTLR start "rule__ChangePluginTransformation__Group_8_3__1"
    // InternalDSL.g:997:1: rule__ChangePluginTransformation__Group_8_3__1 : rule__ChangePluginTransformation__Group_8_3__1__Impl ;
    public final void rule__ChangePluginTransformation__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1001:1: ( rule__ChangePluginTransformation__Group_8_3__1__Impl )
            // InternalDSL.g:1002:2: rule__ChangePluginTransformation__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group_8_3__1"


    // $ANTLR start "rule__ChangePluginTransformation__Group_8_3__1__Impl"
    // InternalDSL.g:1008:1: rule__ChangePluginTransformation__Group_8_3__1__Impl : ( ( rule__ChangePluginTransformation__ArgsAssignment_8_3_1 ) ) ;
    public final void rule__ChangePluginTransformation__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1012:1: ( ( ( rule__ChangePluginTransformation__ArgsAssignment_8_3_1 ) ) )
            // InternalDSL.g:1013:1: ( ( rule__ChangePluginTransformation__ArgsAssignment_8_3_1 ) )
            {
            // InternalDSL.g:1013:1: ( ( rule__ChangePluginTransformation__ArgsAssignment_8_3_1 ) )
            // InternalDSL.g:1014:2: ( rule__ChangePluginTransformation__ArgsAssignment_8_3_1 )
            {
             before(grammarAccess.getChangePluginTransformationAccess().getArgsAssignment_8_3_1()); 
            // InternalDSL.g:1015:2: ( rule__ChangePluginTransformation__ArgsAssignment_8_3_1 )
            // InternalDSL.g:1015:3: rule__ChangePluginTransformation__ArgsAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ChangePluginTransformation__ArgsAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getChangePluginTransformationAccess().getArgsAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__Group_8_3__1__Impl"


    // $ANTLR start "rule__StringToStringMapEntry__Group__0"
    // InternalDSL.g:1024:1: rule__StringToStringMapEntry__Group__0 : rule__StringToStringMapEntry__Group__0__Impl rule__StringToStringMapEntry__Group__1 ;
    public final void rule__StringToStringMapEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1028:1: ( rule__StringToStringMapEntry__Group__0__Impl rule__StringToStringMapEntry__Group__1 )
            // InternalDSL.g:1029:2: rule__StringToStringMapEntry__Group__0__Impl rule__StringToStringMapEntry__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__StringToStringMapEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringToStringMapEntry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringToStringMapEntry__Group__0"


    // $ANTLR start "rule__StringToStringMapEntry__Group__0__Impl"
    // InternalDSL.g:1036:1: rule__StringToStringMapEntry__Group__0__Impl : ( 'StringToStringMapEntry' ) ;
    public final void rule__StringToStringMapEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1040:1: ( ( 'StringToStringMapEntry' ) )
            // InternalDSL.g:1041:1: ( 'StringToStringMapEntry' )
            {
            // InternalDSL.g:1041:1: ( 'StringToStringMapEntry' )
            // InternalDSL.g:1042:2: 'StringToStringMapEntry'
            {
             before(grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringToStringMapEntry__Group__0__Impl"


    // $ANTLR start "rule__StringToStringMapEntry__Group__1"
    // InternalDSL.g:1051:1: rule__StringToStringMapEntry__Group__1 : rule__StringToStringMapEntry__Group__1__Impl rule__StringToStringMapEntry__Group__2 ;
    public final void rule__StringToStringMapEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1055:1: ( rule__StringToStringMapEntry__Group__1__Impl rule__StringToStringMapEntry__Group__2 )
            // InternalDSL.g:1056:2: rule__StringToStringMapEntry__Group__1__Impl rule__StringToStringMapEntry__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__StringToStringMapEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringToStringMapEntry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringToStringMapEntry__Group__1"


    // $ANTLR start "rule__StringToStringMapEntry__Group__1__Impl"
    // InternalDSL.g:1063:1: rule__StringToStringMapEntry__Group__1__Impl : ( '{' ) ;
    public final void rule__StringToStringMapEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1067:1: ( ( '{' ) )
            // InternalDSL.g:1068:1: ( '{' )
            {
            // InternalDSL.g:1068:1: ( '{' )
            // InternalDSL.g:1069:2: '{'
            {
             before(grammarAccess.getStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringToStringMapEntry__Group__1__Impl"


    // $ANTLR start "rule__StringToStringMapEntry__Group__2"
    // InternalDSL.g:1078:1: rule__StringToStringMapEntry__Group__2 : rule__StringToStringMapEntry__Group__2__Impl rule__StringToStringMapEntry__Group__3 ;
    public final void rule__StringToStringMapEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1082:1: ( rule__StringToStringMapEntry__Group__2__Impl rule__StringToStringMapEntry__Group__3 )
            // InternalDSL.g:1083:2: rule__StringToStringMapEntry__Group__2__Impl rule__StringToStringMapEntry__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__StringToStringMapEntry__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringToStringMapEntry__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringToStringMapEntry__Group__2"


    // $ANTLR start "rule__StringToStringMapEntry__Group__2__Impl"
    // InternalDSL.g:1090:1: rule__StringToStringMapEntry__Group__2__Impl : ( 'key' ) ;
    public final void rule__StringToStringMapEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1094:1: ( ( 'key' ) )
            // InternalDSL.g:1095:1: ( 'key' )
            {
            // InternalDSL.g:1095:1: ( 'key' )
            // InternalDSL.g:1096:2: 'key'
            {
             before(grammarAccess.getStringToStringMapEntryAccess().getKeyKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStringToStringMapEntryAccess().getKeyKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringToStringMapEntry__Group__2__Impl"


    // $ANTLR start "rule__StringToStringMapEntry__Group__3"
    // InternalDSL.g:1105:1: rule__StringToStringMapEntry__Group__3 : rule__StringToStringMapEntry__Group__3__Impl rule__StringToStringMapEntry__Group__4 ;
    public final void rule__StringToStringMapEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1109:1: ( rule__StringToStringMapEntry__Group__3__Impl rule__StringToStringMapEntry__Group__4 )
            // InternalDSL.g:1110:2: rule__StringToStringMapEntry__Group__3__Impl rule__StringToStringMapEntry__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__StringToStringMapEntry__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringToStringMapEntry__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringToStringMapEntry__Group__3"


    // $ANTLR start "rule__StringToStringMapEntry__Group__3__Impl"
    // InternalDSL.g:1117:1: rule__StringToStringMapEntry__Group__3__Impl : ( ( rule__StringToStringMapEntry__KeyAssignment_3 ) ) ;
    public final void rule__StringToStringMapEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1121:1: ( ( ( rule__StringToStringMapEntry__KeyAssignment_3 ) ) )
            // InternalDSL.g:1122:1: ( ( rule__StringToStringMapEntry__KeyAssignment_3 ) )
            {
            // InternalDSL.g:1122:1: ( ( rule__StringToStringMapEntry__KeyAssignment_3 ) )
            // InternalDSL.g:1123:2: ( rule__StringToStringMapEntry__KeyAssignment_3 )
            {
             before(grammarAccess.getStringToStringMapEntryAccess().getKeyAssignment_3()); 
            // InternalDSL.g:1124:2: ( rule__StringToStringMapEntry__KeyAssignment_3 )
            // InternalDSL.g:1124:3: rule__StringToStringMapEntry__KeyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StringToStringMapEntry__KeyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStringToStringMapEntryAccess().getKeyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringToStringMapEntry__Group__3__Impl"


    // $ANTLR start "rule__StringToStringMapEntry__Group__4"
    // InternalDSL.g:1132:1: rule__StringToStringMapEntry__Group__4 : rule__StringToStringMapEntry__Group__4__Impl rule__StringToStringMapEntry__Group__5 ;
    public final void rule__StringToStringMapEntry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1136:1: ( rule__StringToStringMapEntry__Group__4__Impl rule__StringToStringMapEntry__Group__5 )
            // InternalDSL.g:1137:2: rule__StringToStringMapEntry__Group__4__Impl rule__StringToStringMapEntry__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__StringToStringMapEntry__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringToStringMapEntry__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringToStringMapEntry__Group__4"


    // $ANTLR start "rule__StringToStringMapEntry__Group__4__Impl"
    // InternalDSL.g:1144:1: rule__StringToStringMapEntry__Group__4__Impl : ( 'value' ) ;
    public final void rule__StringToStringMapEntry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1148:1: ( ( 'value' ) )
            // InternalDSL.g:1149:1: ( 'value' )
            {
            // InternalDSL.g:1149:1: ( 'value' )
            // InternalDSL.g:1150:2: 'value'
            {
             before(grammarAccess.getStringToStringMapEntryAccess().getValueKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStringToStringMapEntryAccess().getValueKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringToStringMapEntry__Group__4__Impl"


    // $ANTLR start "rule__StringToStringMapEntry__Group__5"
    // InternalDSL.g:1159:1: rule__StringToStringMapEntry__Group__5 : rule__StringToStringMapEntry__Group__5__Impl rule__StringToStringMapEntry__Group__6 ;
    public final void rule__StringToStringMapEntry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1163:1: ( rule__StringToStringMapEntry__Group__5__Impl rule__StringToStringMapEntry__Group__6 )
            // InternalDSL.g:1164:2: rule__StringToStringMapEntry__Group__5__Impl rule__StringToStringMapEntry__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__StringToStringMapEntry__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringToStringMapEntry__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringToStringMapEntry__Group__5"


    // $ANTLR start "rule__StringToStringMapEntry__Group__5__Impl"
    // InternalDSL.g:1171:1: rule__StringToStringMapEntry__Group__5__Impl : ( ( rule__StringToStringMapEntry__ValueAssignment_5 ) ) ;
    public final void rule__StringToStringMapEntry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1175:1: ( ( ( rule__StringToStringMapEntry__ValueAssignment_5 ) ) )
            // InternalDSL.g:1176:1: ( ( rule__StringToStringMapEntry__ValueAssignment_5 ) )
            {
            // InternalDSL.g:1176:1: ( ( rule__StringToStringMapEntry__ValueAssignment_5 ) )
            // InternalDSL.g:1177:2: ( rule__StringToStringMapEntry__ValueAssignment_5 )
            {
             before(grammarAccess.getStringToStringMapEntryAccess().getValueAssignment_5()); 
            // InternalDSL.g:1178:2: ( rule__StringToStringMapEntry__ValueAssignment_5 )
            // InternalDSL.g:1178:3: rule__StringToStringMapEntry__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__StringToStringMapEntry__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStringToStringMapEntryAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringToStringMapEntry__Group__5__Impl"


    // $ANTLR start "rule__StringToStringMapEntry__Group__6"
    // InternalDSL.g:1186:1: rule__StringToStringMapEntry__Group__6 : rule__StringToStringMapEntry__Group__6__Impl ;
    public final void rule__StringToStringMapEntry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1190:1: ( rule__StringToStringMapEntry__Group__6__Impl )
            // InternalDSL.g:1191:2: rule__StringToStringMapEntry__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringToStringMapEntry__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringToStringMapEntry__Group__6"


    // $ANTLR start "rule__StringToStringMapEntry__Group__6__Impl"
    // InternalDSL.g:1197:1: rule__StringToStringMapEntry__Group__6__Impl : ( '}' ) ;
    public final void rule__StringToStringMapEntry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1201:1: ( ( '}' ) )
            // InternalDSL.g:1202:1: ( '}' )
            {
            // InternalDSL.g:1202:1: ( '}' )
            // InternalDSL.g:1203:2: '}'
            {
             before(grammarAccess.getStringToStringMapEntryAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStringToStringMapEntryAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringToStringMapEntry__Group__6__Impl"


    // $ANTLR start "rule__TransformationSet__TransformationsAssignment_3_2"
    // InternalDSL.g:1213:1: rule__TransformationSet__TransformationsAssignment_3_2 : ( ruleTransformation ) ;
    public final void rule__TransformationSet__TransformationsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1217:1: ( ( ruleTransformation ) )
            // InternalDSL.g:1218:2: ( ruleTransformation )
            {
            // InternalDSL.g:1218:2: ( ruleTransformation )
            // InternalDSL.g:1219:3: ruleTransformation
            {
             before(grammarAccess.getTransformationSetAccess().getTransformationsTransformationParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getTransformationSetAccess().getTransformationsTransformationParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__TransformationsAssignment_3_2"


    // $ANTLR start "rule__TransformationSet__TransformationsAssignment_3_3_1"
    // InternalDSL.g:1228:1: rule__TransformationSet__TransformationsAssignment_3_3_1 : ( ruleTransformation ) ;
    public final void rule__TransformationSet__TransformationsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1232:1: ( ( ruleTransformation ) )
            // InternalDSL.g:1233:2: ( ruleTransformation )
            {
            // InternalDSL.g:1233:2: ( ruleTransformation )
            // InternalDSL.g:1234:3: ruleTransformation
            {
             before(grammarAccess.getTransformationSetAccess().getTransformationsTransformationParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getTransformationSetAccess().getTransformationsTransformationParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationSet__TransformationsAssignment_3_3_1"


    // $ANTLR start "rule__ChangePluginTransformation__ModelAssignment_3"
    // InternalDSL.g:1243:1: rule__ChangePluginTransformation__ModelAssignment_3 : ( ruleMODEL_NAMES ) ;
    public final void rule__ChangePluginTransformation__ModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1247:1: ( ( ruleMODEL_NAMES ) )
            // InternalDSL.g:1248:2: ( ruleMODEL_NAMES )
            {
            // InternalDSL.g:1248:2: ( ruleMODEL_NAMES )
            // InternalDSL.g:1249:3: ruleMODEL_NAMES
            {
             before(grammarAccess.getChangePluginTransformationAccess().getModelMODEL_NAMESEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMODEL_NAMES();

            state._fsp--;

             after(grammarAccess.getChangePluginTransformationAccess().getModelMODEL_NAMESEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__ModelAssignment_3"


    // $ANTLR start "rule__ChangePluginTransformation__VersionAssignment_5"
    // InternalDSL.g:1258:1: rule__ChangePluginTransformation__VersionAssignment_5 : ( ruleEString ) ;
    public final void rule__ChangePluginTransformation__VersionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1262:1: ( ( ruleEString ) )
            // InternalDSL.g:1263:2: ( ruleEString )
            {
            // InternalDSL.g:1263:2: ( ruleEString )
            // InternalDSL.g:1264:3: ruleEString
            {
             before(grammarAccess.getChangePluginTransformationAccess().getVersionEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChangePluginTransformationAccess().getVersionEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__VersionAssignment_5"


    // $ANTLR start "rule__ChangePluginTransformation__NameAssignment_7"
    // InternalDSL.g:1273:1: rule__ChangePluginTransformation__NameAssignment_7 : ( ruleStringToStringMapEntry ) ;
    public final void rule__ChangePluginTransformation__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1277:1: ( ( ruleStringToStringMapEntry ) )
            // InternalDSL.g:1278:2: ( ruleStringToStringMapEntry )
            {
            // InternalDSL.g:1278:2: ( ruleStringToStringMapEntry )
            // InternalDSL.g:1279:3: ruleStringToStringMapEntry
            {
             before(grammarAccess.getChangePluginTransformationAccess().getNameStringToStringMapEntryParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleStringToStringMapEntry();

            state._fsp--;

             after(grammarAccess.getChangePluginTransformationAccess().getNameStringToStringMapEntryParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__NameAssignment_7"


    // $ANTLR start "rule__ChangePluginTransformation__ArgsAssignment_8_2"
    // InternalDSL.g:1288:1: rule__ChangePluginTransformation__ArgsAssignment_8_2 : ( ruleStringToStringMapEntry ) ;
    public final void rule__ChangePluginTransformation__ArgsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1292:1: ( ( ruleStringToStringMapEntry ) )
            // InternalDSL.g:1293:2: ( ruleStringToStringMapEntry )
            {
            // InternalDSL.g:1293:2: ( ruleStringToStringMapEntry )
            // InternalDSL.g:1294:3: ruleStringToStringMapEntry
            {
             before(grammarAccess.getChangePluginTransformationAccess().getArgsStringToStringMapEntryParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringToStringMapEntry();

            state._fsp--;

             after(grammarAccess.getChangePluginTransformationAccess().getArgsStringToStringMapEntryParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__ArgsAssignment_8_2"


    // $ANTLR start "rule__ChangePluginTransformation__ArgsAssignment_8_3_1"
    // InternalDSL.g:1303:1: rule__ChangePluginTransformation__ArgsAssignment_8_3_1 : ( ruleStringToStringMapEntry ) ;
    public final void rule__ChangePluginTransformation__ArgsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1307:1: ( ( ruleStringToStringMapEntry ) )
            // InternalDSL.g:1308:2: ( ruleStringToStringMapEntry )
            {
            // InternalDSL.g:1308:2: ( ruleStringToStringMapEntry )
            // InternalDSL.g:1309:3: ruleStringToStringMapEntry
            {
             before(grammarAccess.getChangePluginTransformationAccess().getArgsStringToStringMapEntryParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringToStringMapEntry();

            state._fsp--;

             after(grammarAccess.getChangePluginTransformationAccess().getArgsStringToStringMapEntryParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangePluginTransformation__ArgsAssignment_8_3_1"


    // $ANTLR start "rule__StringToStringMapEntry__KeyAssignment_3"
    // InternalDSL.g:1318:1: rule__StringToStringMapEntry__KeyAssignment_3 : ( ruleEString ) ;
    public final void rule__StringToStringMapEntry__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1322:1: ( ( ruleEString ) )
            // InternalDSL.g:1323:2: ( ruleEString )
            {
            // InternalDSL.g:1323:2: ( ruleEString )
            // InternalDSL.g:1324:3: ruleEString
            {
             before(grammarAccess.getStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringToStringMapEntry__KeyAssignment_3"


    // $ANTLR start "rule__StringToStringMapEntry__ValueAssignment_5"
    // InternalDSL.g:1333:1: rule__StringToStringMapEntry__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__StringToStringMapEntry__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1337:1: ( ( ruleEString ) )
            // InternalDSL.g:1338:2: ( ruleEString )
            {
            // InternalDSL.g:1338:2: ( ruleEString )
            // InternalDSL.g:1339:3: ruleEString
            {
             before(grammarAccess.getStringToStringMapEntryAccess().getValueEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringToStringMapEntryAccess().getValueEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringToStringMapEntry__ValueAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});

}