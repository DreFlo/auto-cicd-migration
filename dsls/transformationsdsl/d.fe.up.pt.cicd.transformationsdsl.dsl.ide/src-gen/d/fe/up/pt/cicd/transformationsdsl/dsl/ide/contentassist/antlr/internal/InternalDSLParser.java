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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CICD'", "'GHA'", "'CircleCI'", "'TransformationSet'", "'{'", "'}'", "'transformations'", "','", "'ChangePlugin'", "'model'", "'version'", "'name'", "'args'", "'ATLRefiningScript'", "'script'", "'ChangeAgentLabel'", "'ReplaceAgentLabels'", "'condition'", "'labels'", "'StringToStringMapEntry'", "'key'", "'value'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
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
    // InternalDSL.g:87:1: ruleTransformation : ( ( rule__Transformation__Alternatives ) ) ;
    public final void ruleTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:91:2: ( ( ( rule__Transformation__Alternatives ) ) )
            // InternalDSL.g:92:2: ( ( rule__Transformation__Alternatives ) )
            {
            // InternalDSL.g:92:2: ( ( rule__Transformation__Alternatives ) )
            // InternalDSL.g:93:3: ( rule__Transformation__Alternatives )
            {
             before(grammarAccess.getTransformationAccess().getAlternatives()); 
            // InternalDSL.g:94:3: ( rule__Transformation__Alternatives )
            // InternalDSL.g:94:4: rule__Transformation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleChangePlugin"
    // InternalDSL.g:103:1: entryRuleChangePlugin : ruleChangePlugin EOF ;
    public final void entryRuleChangePlugin() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( ruleChangePlugin EOF )
            // InternalDSL.g:105:1: ruleChangePlugin EOF
            {
             before(grammarAccess.getChangePluginRule()); 
            pushFollow(FOLLOW_1);
            ruleChangePlugin();

            state._fsp--;

             after(grammarAccess.getChangePluginRule()); 
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
    // $ANTLR end "entryRuleChangePlugin"


    // $ANTLR start "ruleChangePlugin"
    // InternalDSL.g:112:1: ruleChangePlugin : ( ( rule__ChangePlugin__Group__0 ) ) ;
    public final void ruleChangePlugin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__ChangePlugin__Group__0 ) ) )
            // InternalDSL.g:117:2: ( ( rule__ChangePlugin__Group__0 ) )
            {
            // InternalDSL.g:117:2: ( ( rule__ChangePlugin__Group__0 ) )
            // InternalDSL.g:118:3: ( rule__ChangePlugin__Group__0 )
            {
             before(grammarAccess.getChangePluginAccess().getGroup()); 
            // InternalDSL.g:119:3: ( rule__ChangePlugin__Group__0 )
            // InternalDSL.g:119:4: rule__ChangePlugin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangePluginAccess().getGroup()); 

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
    // $ANTLR end "ruleChangePlugin"


    // $ANTLR start "entryRuleATLRefiningScript"
    // InternalDSL.g:128:1: entryRuleATLRefiningScript : ruleATLRefiningScript EOF ;
    public final void entryRuleATLRefiningScript() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( ruleATLRefiningScript EOF )
            // InternalDSL.g:130:1: ruleATLRefiningScript EOF
            {
             before(grammarAccess.getATLRefiningScriptRule()); 
            pushFollow(FOLLOW_1);
            ruleATLRefiningScript();

            state._fsp--;

             after(grammarAccess.getATLRefiningScriptRule()); 
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
    // $ANTLR end "entryRuleATLRefiningScript"


    // $ANTLR start "ruleATLRefiningScript"
    // InternalDSL.g:137:1: ruleATLRefiningScript : ( ( rule__ATLRefiningScript__Group__0 ) ) ;
    public final void ruleATLRefiningScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__ATLRefiningScript__Group__0 ) ) )
            // InternalDSL.g:142:2: ( ( rule__ATLRefiningScript__Group__0 ) )
            {
            // InternalDSL.g:142:2: ( ( rule__ATLRefiningScript__Group__0 ) )
            // InternalDSL.g:143:3: ( rule__ATLRefiningScript__Group__0 )
            {
             before(grammarAccess.getATLRefiningScriptAccess().getGroup()); 
            // InternalDSL.g:144:3: ( rule__ATLRefiningScript__Group__0 )
            // InternalDSL.g:144:4: rule__ATLRefiningScript__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ATLRefiningScript__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getATLRefiningScriptAccess().getGroup()); 

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
    // $ANTLR end "ruleATLRefiningScript"


    // $ANTLR start "entryRuleChangeAgentLabel"
    // InternalDSL.g:153:1: entryRuleChangeAgentLabel : ruleChangeAgentLabel EOF ;
    public final void entryRuleChangeAgentLabel() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( ruleChangeAgentLabel EOF )
            // InternalDSL.g:155:1: ruleChangeAgentLabel EOF
            {
             before(grammarAccess.getChangeAgentLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleChangeAgentLabel();

            state._fsp--;

             after(grammarAccess.getChangeAgentLabelRule()); 
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
    // $ANTLR end "entryRuleChangeAgentLabel"


    // $ANTLR start "ruleChangeAgentLabel"
    // InternalDSL.g:162:1: ruleChangeAgentLabel : ( ( rule__ChangeAgentLabel__Group__0 ) ) ;
    public final void ruleChangeAgentLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__ChangeAgentLabel__Group__0 ) ) )
            // InternalDSL.g:167:2: ( ( rule__ChangeAgentLabel__Group__0 ) )
            {
            // InternalDSL.g:167:2: ( ( rule__ChangeAgentLabel__Group__0 ) )
            // InternalDSL.g:168:3: ( rule__ChangeAgentLabel__Group__0 )
            {
             before(grammarAccess.getChangeAgentLabelAccess().getGroup()); 
            // InternalDSL.g:169:3: ( rule__ChangeAgentLabel__Group__0 )
            // InternalDSL.g:169:4: rule__ChangeAgentLabel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeAgentLabel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangeAgentLabelAccess().getGroup()); 

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
    // $ANTLR end "ruleChangeAgentLabel"


    // $ANTLR start "entryRuleReplaceAgentLabels"
    // InternalDSL.g:178:1: entryRuleReplaceAgentLabels : ruleReplaceAgentLabels EOF ;
    public final void entryRuleReplaceAgentLabels() throws RecognitionException {
        try {
            // InternalDSL.g:179:1: ( ruleReplaceAgentLabels EOF )
            // InternalDSL.g:180:1: ruleReplaceAgentLabels EOF
            {
             before(grammarAccess.getReplaceAgentLabelsRule()); 
            pushFollow(FOLLOW_1);
            ruleReplaceAgentLabels();

            state._fsp--;

             after(grammarAccess.getReplaceAgentLabelsRule()); 
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
    // $ANTLR end "entryRuleReplaceAgentLabels"


    // $ANTLR start "ruleReplaceAgentLabels"
    // InternalDSL.g:187:1: ruleReplaceAgentLabels : ( ( rule__ReplaceAgentLabels__Group__0 ) ) ;
    public final void ruleReplaceAgentLabels() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__ReplaceAgentLabels__Group__0 ) ) )
            // InternalDSL.g:192:2: ( ( rule__ReplaceAgentLabels__Group__0 ) )
            {
            // InternalDSL.g:192:2: ( ( rule__ReplaceAgentLabels__Group__0 ) )
            // InternalDSL.g:193:3: ( rule__ReplaceAgentLabels__Group__0 )
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getGroup()); 
            // InternalDSL.g:194:3: ( rule__ReplaceAgentLabels__Group__0 )
            // InternalDSL.g:194:4: rule__ReplaceAgentLabels__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReplaceAgentLabelsAccess().getGroup()); 

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
    // $ANTLR end "ruleReplaceAgentLabels"


    // $ANTLR start "entryRuleStringToStringMapEntry"
    // InternalDSL.g:203:1: entryRuleStringToStringMapEntry : ruleStringToStringMapEntry EOF ;
    public final void entryRuleStringToStringMapEntry() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( ruleStringToStringMapEntry EOF )
            // InternalDSL.g:205:1: ruleStringToStringMapEntry EOF
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
    // InternalDSL.g:212:1: ruleStringToStringMapEntry : ( ( rule__StringToStringMapEntry__Group__0 ) ) ;
    public final void ruleStringToStringMapEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__StringToStringMapEntry__Group__0 ) ) )
            // InternalDSL.g:217:2: ( ( rule__StringToStringMapEntry__Group__0 ) )
            {
            // InternalDSL.g:217:2: ( ( rule__StringToStringMapEntry__Group__0 ) )
            // InternalDSL.g:218:3: ( rule__StringToStringMapEntry__Group__0 )
            {
             before(grammarAccess.getStringToStringMapEntryAccess().getGroup()); 
            // InternalDSL.g:219:3: ( rule__StringToStringMapEntry__Group__0 )
            // InternalDSL.g:219:4: rule__StringToStringMapEntry__Group__0
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
    // InternalDSL.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleEString EOF )
            // InternalDSL.g:230:1: ruleEString EOF
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
    // InternalDSL.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDSL.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDSL.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalDSL.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDSL.g:244:3: ( rule__EString__Alternatives )
            // InternalDSL.g:244:4: rule__EString__Alternatives
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
    // InternalDSL.g:253:1: ruleMODEL_NAMES : ( ( rule__MODEL_NAMES__Alternatives ) ) ;
    public final void ruleMODEL_NAMES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:257:1: ( ( ( rule__MODEL_NAMES__Alternatives ) ) )
            // InternalDSL.g:258:2: ( ( rule__MODEL_NAMES__Alternatives ) )
            {
            // InternalDSL.g:258:2: ( ( rule__MODEL_NAMES__Alternatives ) )
            // InternalDSL.g:259:3: ( rule__MODEL_NAMES__Alternatives )
            {
             before(grammarAccess.getMODEL_NAMESAccess().getAlternatives()); 
            // InternalDSL.g:260:3: ( rule__MODEL_NAMES__Alternatives )
            // InternalDSL.g:260:4: rule__MODEL_NAMES__Alternatives
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


    // $ANTLR start "rule__Transformation__Alternatives"
    // InternalDSL.g:268:1: rule__Transformation__Alternatives : ( ( ruleChangePlugin ) | ( ruleATLRefiningScript ) | ( ruleChangeAgentLabel ) | ( ruleReplaceAgentLabels ) );
    public final void rule__Transformation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:272:1: ( ( ruleChangePlugin ) | ( ruleATLRefiningScript ) | ( ruleChangeAgentLabel ) | ( ruleReplaceAgentLabels ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            case 27:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDSL.g:273:2: ( ruleChangePlugin )
                    {
                    // InternalDSL.g:273:2: ( ruleChangePlugin )
                    // InternalDSL.g:274:3: ruleChangePlugin
                    {
                     before(grammarAccess.getTransformationAccess().getChangePluginParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleChangePlugin();

                    state._fsp--;

                     after(grammarAccess.getTransformationAccess().getChangePluginParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:279:2: ( ruleATLRefiningScript )
                    {
                    // InternalDSL.g:279:2: ( ruleATLRefiningScript )
                    // InternalDSL.g:280:3: ruleATLRefiningScript
                    {
                     before(grammarAccess.getTransformationAccess().getATLRefiningScriptParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleATLRefiningScript();

                    state._fsp--;

                     after(grammarAccess.getTransformationAccess().getATLRefiningScriptParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:285:2: ( ruleChangeAgentLabel )
                    {
                    // InternalDSL.g:285:2: ( ruleChangeAgentLabel )
                    // InternalDSL.g:286:3: ruleChangeAgentLabel
                    {
                     before(grammarAccess.getTransformationAccess().getChangeAgentLabelParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleChangeAgentLabel();

                    state._fsp--;

                     after(grammarAccess.getTransformationAccess().getChangeAgentLabelParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:291:2: ( ruleReplaceAgentLabels )
                    {
                    // InternalDSL.g:291:2: ( ruleReplaceAgentLabels )
                    // InternalDSL.g:292:3: ruleReplaceAgentLabels
                    {
                     before(grammarAccess.getTransformationAccess().getReplaceAgentLabelsParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleReplaceAgentLabels();

                    state._fsp--;

                     after(grammarAccess.getTransformationAccess().getReplaceAgentLabelsParserRuleCall_3()); 

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
    // $ANTLR end "rule__Transformation__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDSL.g:301:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:305:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:306:2: ( RULE_STRING )
                    {
                    // InternalDSL.g:306:2: ( RULE_STRING )
                    // InternalDSL.g:307:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:312:2: ( RULE_ID )
                    {
                    // InternalDSL.g:312:2: ( RULE_ID )
                    // InternalDSL.g:313:3: RULE_ID
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
    // InternalDSL.g:322:1: rule__MODEL_NAMES__Alternatives : ( ( ( 'CICD' ) ) | ( ( 'GHA' ) ) | ( ( 'CircleCI' ) ) );
    public final void rule__MODEL_NAMES__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:326:1: ( ( ( 'CICD' ) ) | ( ( 'GHA' ) ) | ( ( 'CircleCI' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDSL.g:327:2: ( ( 'CICD' ) )
                    {
                    // InternalDSL.g:327:2: ( ( 'CICD' ) )
                    // InternalDSL.g:328:3: ( 'CICD' )
                    {
                     before(grammarAccess.getMODEL_NAMESAccess().getCICDEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:329:3: ( 'CICD' )
                    // InternalDSL.g:329:4: 'CICD'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMODEL_NAMESAccess().getCICDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:333:2: ( ( 'GHA' ) )
                    {
                    // InternalDSL.g:333:2: ( ( 'GHA' ) )
                    // InternalDSL.g:334:3: ( 'GHA' )
                    {
                     before(grammarAccess.getMODEL_NAMESAccess().getGHAEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:335:3: ( 'GHA' )
                    // InternalDSL.g:335:4: 'GHA'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMODEL_NAMESAccess().getGHAEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:339:2: ( ( 'CircleCI' ) )
                    {
                    // InternalDSL.g:339:2: ( ( 'CircleCI' ) )
                    // InternalDSL.g:340:3: ( 'CircleCI' )
                    {
                     before(grammarAccess.getMODEL_NAMESAccess().getCircleCIEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:341:3: ( 'CircleCI' )
                    // InternalDSL.g:341:4: 'CircleCI'
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
    // InternalDSL.g:349:1: rule__TransformationSet__Group__0 : rule__TransformationSet__Group__0__Impl rule__TransformationSet__Group__1 ;
    public final void rule__TransformationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:353:1: ( rule__TransformationSet__Group__0__Impl rule__TransformationSet__Group__1 )
            // InternalDSL.g:354:2: rule__TransformationSet__Group__0__Impl rule__TransformationSet__Group__1
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
    // InternalDSL.g:361:1: rule__TransformationSet__Group__0__Impl : ( () ) ;
    public final void rule__TransformationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:365:1: ( ( () ) )
            // InternalDSL.g:366:1: ( () )
            {
            // InternalDSL.g:366:1: ( () )
            // InternalDSL.g:367:2: ()
            {
             before(grammarAccess.getTransformationSetAccess().getTransformationSetAction_0()); 
            // InternalDSL.g:368:2: ()
            // InternalDSL.g:368:3: 
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
    // InternalDSL.g:376:1: rule__TransformationSet__Group__1 : rule__TransformationSet__Group__1__Impl rule__TransformationSet__Group__2 ;
    public final void rule__TransformationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:380:1: ( rule__TransformationSet__Group__1__Impl rule__TransformationSet__Group__2 )
            // InternalDSL.g:381:2: rule__TransformationSet__Group__1__Impl rule__TransformationSet__Group__2
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
    // InternalDSL.g:388:1: rule__TransformationSet__Group__1__Impl : ( 'TransformationSet' ) ;
    public final void rule__TransformationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:392:1: ( ( 'TransformationSet' ) )
            // InternalDSL.g:393:1: ( 'TransformationSet' )
            {
            // InternalDSL.g:393:1: ( 'TransformationSet' )
            // InternalDSL.g:394:2: 'TransformationSet'
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
    // InternalDSL.g:403:1: rule__TransformationSet__Group__2 : rule__TransformationSet__Group__2__Impl rule__TransformationSet__Group__3 ;
    public final void rule__TransformationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:407:1: ( rule__TransformationSet__Group__2__Impl rule__TransformationSet__Group__3 )
            // InternalDSL.g:408:2: rule__TransformationSet__Group__2__Impl rule__TransformationSet__Group__3
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
    // InternalDSL.g:415:1: rule__TransformationSet__Group__2__Impl : ( '{' ) ;
    public final void rule__TransformationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:419:1: ( ( '{' ) )
            // InternalDSL.g:420:1: ( '{' )
            {
            // InternalDSL.g:420:1: ( '{' )
            // InternalDSL.g:421:2: '{'
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
    // InternalDSL.g:430:1: rule__TransformationSet__Group__3 : rule__TransformationSet__Group__3__Impl rule__TransformationSet__Group__4 ;
    public final void rule__TransformationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:434:1: ( rule__TransformationSet__Group__3__Impl rule__TransformationSet__Group__4 )
            // InternalDSL.g:435:2: rule__TransformationSet__Group__3__Impl rule__TransformationSet__Group__4
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
    // InternalDSL.g:442:1: rule__TransformationSet__Group__3__Impl : ( ( rule__TransformationSet__Group_3__0 )? ) ;
    public final void rule__TransformationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:446:1: ( ( ( rule__TransformationSet__Group_3__0 )? ) )
            // InternalDSL.g:447:1: ( ( rule__TransformationSet__Group_3__0 )? )
            {
            // InternalDSL.g:447:1: ( ( rule__TransformationSet__Group_3__0 )? )
            // InternalDSL.g:448:2: ( rule__TransformationSet__Group_3__0 )?
            {
             before(grammarAccess.getTransformationSetAccess().getGroup_3()); 
            // InternalDSL.g:449:2: ( rule__TransformationSet__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:449:3: rule__TransformationSet__Group_3__0
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
    // InternalDSL.g:457:1: rule__TransformationSet__Group__4 : rule__TransformationSet__Group__4__Impl ;
    public final void rule__TransformationSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:461:1: ( rule__TransformationSet__Group__4__Impl )
            // InternalDSL.g:462:2: rule__TransformationSet__Group__4__Impl
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
    // InternalDSL.g:468:1: rule__TransformationSet__Group__4__Impl : ( '}' ) ;
    public final void rule__TransformationSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:472:1: ( ( '}' ) )
            // InternalDSL.g:473:1: ( '}' )
            {
            // InternalDSL.g:473:1: ( '}' )
            // InternalDSL.g:474:2: '}'
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
    // InternalDSL.g:484:1: rule__TransformationSet__Group_3__0 : rule__TransformationSet__Group_3__0__Impl rule__TransformationSet__Group_3__1 ;
    public final void rule__TransformationSet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:488:1: ( rule__TransformationSet__Group_3__0__Impl rule__TransformationSet__Group_3__1 )
            // InternalDSL.g:489:2: rule__TransformationSet__Group_3__0__Impl rule__TransformationSet__Group_3__1
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
    // InternalDSL.g:496:1: rule__TransformationSet__Group_3__0__Impl : ( 'transformations' ) ;
    public final void rule__TransformationSet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:500:1: ( ( 'transformations' ) )
            // InternalDSL.g:501:1: ( 'transformations' )
            {
            // InternalDSL.g:501:1: ( 'transformations' )
            // InternalDSL.g:502:2: 'transformations'
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
    // InternalDSL.g:511:1: rule__TransformationSet__Group_3__1 : rule__TransformationSet__Group_3__1__Impl rule__TransformationSet__Group_3__2 ;
    public final void rule__TransformationSet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:515:1: ( rule__TransformationSet__Group_3__1__Impl rule__TransformationSet__Group_3__2 )
            // InternalDSL.g:516:2: rule__TransformationSet__Group_3__1__Impl rule__TransformationSet__Group_3__2
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
    // InternalDSL.g:523:1: rule__TransformationSet__Group_3__1__Impl : ( '{' ) ;
    public final void rule__TransformationSet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:527:1: ( ( '{' ) )
            // InternalDSL.g:528:1: ( '{' )
            {
            // InternalDSL.g:528:1: ( '{' )
            // InternalDSL.g:529:2: '{'
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
    // InternalDSL.g:538:1: rule__TransformationSet__Group_3__2 : rule__TransformationSet__Group_3__2__Impl rule__TransformationSet__Group_3__3 ;
    public final void rule__TransformationSet__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:542:1: ( rule__TransformationSet__Group_3__2__Impl rule__TransformationSet__Group_3__3 )
            // InternalDSL.g:543:2: rule__TransformationSet__Group_3__2__Impl rule__TransformationSet__Group_3__3
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
    // InternalDSL.g:550:1: rule__TransformationSet__Group_3__2__Impl : ( ( rule__TransformationSet__TransformationsAssignment_3_2 ) ) ;
    public final void rule__TransformationSet__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:554:1: ( ( ( rule__TransformationSet__TransformationsAssignment_3_2 ) ) )
            // InternalDSL.g:555:1: ( ( rule__TransformationSet__TransformationsAssignment_3_2 ) )
            {
            // InternalDSL.g:555:1: ( ( rule__TransformationSet__TransformationsAssignment_3_2 ) )
            // InternalDSL.g:556:2: ( rule__TransformationSet__TransformationsAssignment_3_2 )
            {
             before(grammarAccess.getTransformationSetAccess().getTransformationsAssignment_3_2()); 
            // InternalDSL.g:557:2: ( rule__TransformationSet__TransformationsAssignment_3_2 )
            // InternalDSL.g:557:3: rule__TransformationSet__TransformationsAssignment_3_2
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
    // InternalDSL.g:565:1: rule__TransformationSet__Group_3__3 : rule__TransformationSet__Group_3__3__Impl rule__TransformationSet__Group_3__4 ;
    public final void rule__TransformationSet__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:569:1: ( rule__TransformationSet__Group_3__3__Impl rule__TransformationSet__Group_3__4 )
            // InternalDSL.g:570:2: rule__TransformationSet__Group_3__3__Impl rule__TransformationSet__Group_3__4
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
    // InternalDSL.g:577:1: rule__TransformationSet__Group_3__3__Impl : ( ( rule__TransformationSet__Group_3_3__0 )* ) ;
    public final void rule__TransformationSet__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:581:1: ( ( ( rule__TransformationSet__Group_3_3__0 )* ) )
            // InternalDSL.g:582:1: ( ( rule__TransformationSet__Group_3_3__0 )* )
            {
            // InternalDSL.g:582:1: ( ( rule__TransformationSet__Group_3_3__0 )* )
            // InternalDSL.g:583:2: ( rule__TransformationSet__Group_3_3__0 )*
            {
             before(grammarAccess.getTransformationSetAccess().getGroup_3_3()); 
            // InternalDSL.g:584:2: ( rule__TransformationSet__Group_3_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDSL.g:584:3: rule__TransformationSet__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TransformationSet__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalDSL.g:592:1: rule__TransformationSet__Group_3__4 : rule__TransformationSet__Group_3__4__Impl ;
    public final void rule__TransformationSet__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:596:1: ( rule__TransformationSet__Group_3__4__Impl )
            // InternalDSL.g:597:2: rule__TransformationSet__Group_3__4__Impl
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
    // InternalDSL.g:603:1: rule__TransformationSet__Group_3__4__Impl : ( '}' ) ;
    public final void rule__TransformationSet__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:607:1: ( ( '}' ) )
            // InternalDSL.g:608:1: ( '}' )
            {
            // InternalDSL.g:608:1: ( '}' )
            // InternalDSL.g:609:2: '}'
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
    // InternalDSL.g:619:1: rule__TransformationSet__Group_3_3__0 : rule__TransformationSet__Group_3_3__0__Impl rule__TransformationSet__Group_3_3__1 ;
    public final void rule__TransformationSet__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:623:1: ( rule__TransformationSet__Group_3_3__0__Impl rule__TransformationSet__Group_3_3__1 )
            // InternalDSL.g:624:2: rule__TransformationSet__Group_3_3__0__Impl rule__TransformationSet__Group_3_3__1
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
    // InternalDSL.g:631:1: rule__TransformationSet__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__TransformationSet__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:635:1: ( ( ',' ) )
            // InternalDSL.g:636:1: ( ',' )
            {
            // InternalDSL.g:636:1: ( ',' )
            // InternalDSL.g:637:2: ','
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
    // InternalDSL.g:646:1: rule__TransformationSet__Group_3_3__1 : rule__TransformationSet__Group_3_3__1__Impl ;
    public final void rule__TransformationSet__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:650:1: ( rule__TransformationSet__Group_3_3__1__Impl )
            // InternalDSL.g:651:2: rule__TransformationSet__Group_3_3__1__Impl
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
    // InternalDSL.g:657:1: rule__TransformationSet__Group_3_3__1__Impl : ( ( rule__TransformationSet__TransformationsAssignment_3_3_1 ) ) ;
    public final void rule__TransformationSet__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:661:1: ( ( ( rule__TransformationSet__TransformationsAssignment_3_3_1 ) ) )
            // InternalDSL.g:662:1: ( ( rule__TransformationSet__TransformationsAssignment_3_3_1 ) )
            {
            // InternalDSL.g:662:1: ( ( rule__TransformationSet__TransformationsAssignment_3_3_1 ) )
            // InternalDSL.g:663:2: ( rule__TransformationSet__TransformationsAssignment_3_3_1 )
            {
             before(grammarAccess.getTransformationSetAccess().getTransformationsAssignment_3_3_1()); 
            // InternalDSL.g:664:2: ( rule__TransformationSet__TransformationsAssignment_3_3_1 )
            // InternalDSL.g:664:3: rule__TransformationSet__TransformationsAssignment_3_3_1
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


    // $ANTLR start "rule__ChangePlugin__Group__0"
    // InternalDSL.g:673:1: rule__ChangePlugin__Group__0 : rule__ChangePlugin__Group__0__Impl rule__ChangePlugin__Group__1 ;
    public final void rule__ChangePlugin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:677:1: ( rule__ChangePlugin__Group__0__Impl rule__ChangePlugin__Group__1 )
            // InternalDSL.g:678:2: rule__ChangePlugin__Group__0__Impl rule__ChangePlugin__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ChangePlugin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group__1();

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
    // $ANTLR end "rule__ChangePlugin__Group__0"


    // $ANTLR start "rule__ChangePlugin__Group__0__Impl"
    // InternalDSL.g:685:1: rule__ChangePlugin__Group__0__Impl : ( 'ChangePlugin' ) ;
    public final void rule__ChangePlugin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:689:1: ( ( 'ChangePlugin' ) )
            // InternalDSL.g:690:1: ( 'ChangePlugin' )
            {
            // InternalDSL.g:690:1: ( 'ChangePlugin' )
            // InternalDSL.g:691:2: 'ChangePlugin'
            {
             before(grammarAccess.getChangePluginAccess().getChangePluginKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getChangePluginAccess().getChangePluginKeyword_0()); 

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
    // $ANTLR end "rule__ChangePlugin__Group__0__Impl"


    // $ANTLR start "rule__ChangePlugin__Group__1"
    // InternalDSL.g:700:1: rule__ChangePlugin__Group__1 : rule__ChangePlugin__Group__1__Impl rule__ChangePlugin__Group__2 ;
    public final void rule__ChangePlugin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:704:1: ( rule__ChangePlugin__Group__1__Impl rule__ChangePlugin__Group__2 )
            // InternalDSL.g:705:2: rule__ChangePlugin__Group__1__Impl rule__ChangePlugin__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ChangePlugin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group__2();

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
    // $ANTLR end "rule__ChangePlugin__Group__1"


    // $ANTLR start "rule__ChangePlugin__Group__1__Impl"
    // InternalDSL.g:712:1: rule__ChangePlugin__Group__1__Impl : ( '{' ) ;
    public final void rule__ChangePlugin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:716:1: ( ( '{' ) )
            // InternalDSL.g:717:1: ( '{' )
            {
            // InternalDSL.g:717:1: ( '{' )
            // InternalDSL.g:718:2: '{'
            {
             before(grammarAccess.getChangePluginAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChangePluginAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ChangePlugin__Group__1__Impl"


    // $ANTLR start "rule__ChangePlugin__Group__2"
    // InternalDSL.g:727:1: rule__ChangePlugin__Group__2 : rule__ChangePlugin__Group__2__Impl rule__ChangePlugin__Group__3 ;
    public final void rule__ChangePlugin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:731:1: ( rule__ChangePlugin__Group__2__Impl rule__ChangePlugin__Group__3 )
            // InternalDSL.g:732:2: rule__ChangePlugin__Group__2__Impl rule__ChangePlugin__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ChangePlugin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group__3();

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
    // $ANTLR end "rule__ChangePlugin__Group__2"


    // $ANTLR start "rule__ChangePlugin__Group__2__Impl"
    // InternalDSL.g:739:1: rule__ChangePlugin__Group__2__Impl : ( 'model' ) ;
    public final void rule__ChangePlugin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:743:1: ( ( 'model' ) )
            // InternalDSL.g:744:1: ( 'model' )
            {
            // InternalDSL.g:744:1: ( 'model' )
            // InternalDSL.g:745:2: 'model'
            {
             before(grammarAccess.getChangePluginAccess().getModelKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChangePluginAccess().getModelKeyword_2()); 

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
    // $ANTLR end "rule__ChangePlugin__Group__2__Impl"


    // $ANTLR start "rule__ChangePlugin__Group__3"
    // InternalDSL.g:754:1: rule__ChangePlugin__Group__3 : rule__ChangePlugin__Group__3__Impl rule__ChangePlugin__Group__4 ;
    public final void rule__ChangePlugin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:758:1: ( rule__ChangePlugin__Group__3__Impl rule__ChangePlugin__Group__4 )
            // InternalDSL.g:759:2: rule__ChangePlugin__Group__3__Impl rule__ChangePlugin__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__ChangePlugin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group__4();

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
    // $ANTLR end "rule__ChangePlugin__Group__3"


    // $ANTLR start "rule__ChangePlugin__Group__3__Impl"
    // InternalDSL.g:766:1: rule__ChangePlugin__Group__3__Impl : ( ( rule__ChangePlugin__ModelAssignment_3 ) ) ;
    public final void rule__ChangePlugin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:770:1: ( ( ( rule__ChangePlugin__ModelAssignment_3 ) ) )
            // InternalDSL.g:771:1: ( ( rule__ChangePlugin__ModelAssignment_3 ) )
            {
            // InternalDSL.g:771:1: ( ( rule__ChangePlugin__ModelAssignment_3 ) )
            // InternalDSL.g:772:2: ( rule__ChangePlugin__ModelAssignment_3 )
            {
             before(grammarAccess.getChangePluginAccess().getModelAssignment_3()); 
            // InternalDSL.g:773:2: ( rule__ChangePlugin__ModelAssignment_3 )
            // InternalDSL.g:773:3: rule__ChangePlugin__ModelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ChangePlugin__ModelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChangePluginAccess().getModelAssignment_3()); 

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
    // $ANTLR end "rule__ChangePlugin__Group__3__Impl"


    // $ANTLR start "rule__ChangePlugin__Group__4"
    // InternalDSL.g:781:1: rule__ChangePlugin__Group__4 : rule__ChangePlugin__Group__4__Impl rule__ChangePlugin__Group__5 ;
    public final void rule__ChangePlugin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:785:1: ( rule__ChangePlugin__Group__4__Impl rule__ChangePlugin__Group__5 )
            // InternalDSL.g:786:2: rule__ChangePlugin__Group__4__Impl rule__ChangePlugin__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ChangePlugin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group__5();

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
    // $ANTLR end "rule__ChangePlugin__Group__4"


    // $ANTLR start "rule__ChangePlugin__Group__4__Impl"
    // InternalDSL.g:793:1: rule__ChangePlugin__Group__4__Impl : ( 'version' ) ;
    public final void rule__ChangePlugin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:797:1: ( ( 'version' ) )
            // InternalDSL.g:798:1: ( 'version' )
            {
            // InternalDSL.g:798:1: ( 'version' )
            // InternalDSL.g:799:2: 'version'
            {
             before(grammarAccess.getChangePluginAccess().getVersionKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getChangePluginAccess().getVersionKeyword_4()); 

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
    // $ANTLR end "rule__ChangePlugin__Group__4__Impl"


    // $ANTLR start "rule__ChangePlugin__Group__5"
    // InternalDSL.g:808:1: rule__ChangePlugin__Group__5 : rule__ChangePlugin__Group__5__Impl rule__ChangePlugin__Group__6 ;
    public final void rule__ChangePlugin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:812:1: ( rule__ChangePlugin__Group__5__Impl rule__ChangePlugin__Group__6 )
            // InternalDSL.g:813:2: rule__ChangePlugin__Group__5__Impl rule__ChangePlugin__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__ChangePlugin__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group__6();

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
    // $ANTLR end "rule__ChangePlugin__Group__5"


    // $ANTLR start "rule__ChangePlugin__Group__5__Impl"
    // InternalDSL.g:820:1: rule__ChangePlugin__Group__5__Impl : ( ( rule__ChangePlugin__VersionAssignment_5 ) ) ;
    public final void rule__ChangePlugin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:824:1: ( ( ( rule__ChangePlugin__VersionAssignment_5 ) ) )
            // InternalDSL.g:825:1: ( ( rule__ChangePlugin__VersionAssignment_5 ) )
            {
            // InternalDSL.g:825:1: ( ( rule__ChangePlugin__VersionAssignment_5 ) )
            // InternalDSL.g:826:2: ( rule__ChangePlugin__VersionAssignment_5 )
            {
             before(grammarAccess.getChangePluginAccess().getVersionAssignment_5()); 
            // InternalDSL.g:827:2: ( rule__ChangePlugin__VersionAssignment_5 )
            // InternalDSL.g:827:3: rule__ChangePlugin__VersionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ChangePlugin__VersionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getChangePluginAccess().getVersionAssignment_5()); 

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
    // $ANTLR end "rule__ChangePlugin__Group__5__Impl"


    // $ANTLR start "rule__ChangePlugin__Group__6"
    // InternalDSL.g:835:1: rule__ChangePlugin__Group__6 : rule__ChangePlugin__Group__6__Impl rule__ChangePlugin__Group__7 ;
    public final void rule__ChangePlugin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:839:1: ( rule__ChangePlugin__Group__6__Impl rule__ChangePlugin__Group__7 )
            // InternalDSL.g:840:2: rule__ChangePlugin__Group__6__Impl rule__ChangePlugin__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__ChangePlugin__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group__7();

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
    // $ANTLR end "rule__ChangePlugin__Group__6"


    // $ANTLR start "rule__ChangePlugin__Group__6__Impl"
    // InternalDSL.g:847:1: rule__ChangePlugin__Group__6__Impl : ( 'name' ) ;
    public final void rule__ChangePlugin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:851:1: ( ( 'name' ) )
            // InternalDSL.g:852:1: ( 'name' )
            {
            // InternalDSL.g:852:1: ( 'name' )
            // InternalDSL.g:853:2: 'name'
            {
             before(grammarAccess.getChangePluginAccess().getNameKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getChangePluginAccess().getNameKeyword_6()); 

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
    // $ANTLR end "rule__ChangePlugin__Group__6__Impl"


    // $ANTLR start "rule__ChangePlugin__Group__7"
    // InternalDSL.g:862:1: rule__ChangePlugin__Group__7 : rule__ChangePlugin__Group__7__Impl rule__ChangePlugin__Group__8 ;
    public final void rule__ChangePlugin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:866:1: ( rule__ChangePlugin__Group__7__Impl rule__ChangePlugin__Group__8 )
            // InternalDSL.g:867:2: rule__ChangePlugin__Group__7__Impl rule__ChangePlugin__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__ChangePlugin__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group__8();

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
    // $ANTLR end "rule__ChangePlugin__Group__7"


    // $ANTLR start "rule__ChangePlugin__Group__7__Impl"
    // InternalDSL.g:874:1: rule__ChangePlugin__Group__7__Impl : ( ( rule__ChangePlugin__NameAssignment_7 ) ) ;
    public final void rule__ChangePlugin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:878:1: ( ( ( rule__ChangePlugin__NameAssignment_7 ) ) )
            // InternalDSL.g:879:1: ( ( rule__ChangePlugin__NameAssignment_7 ) )
            {
            // InternalDSL.g:879:1: ( ( rule__ChangePlugin__NameAssignment_7 ) )
            // InternalDSL.g:880:2: ( rule__ChangePlugin__NameAssignment_7 )
            {
             before(grammarAccess.getChangePluginAccess().getNameAssignment_7()); 
            // InternalDSL.g:881:2: ( rule__ChangePlugin__NameAssignment_7 )
            // InternalDSL.g:881:3: rule__ChangePlugin__NameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ChangePlugin__NameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getChangePluginAccess().getNameAssignment_7()); 

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
    // $ANTLR end "rule__ChangePlugin__Group__7__Impl"


    // $ANTLR start "rule__ChangePlugin__Group__8"
    // InternalDSL.g:889:1: rule__ChangePlugin__Group__8 : rule__ChangePlugin__Group__8__Impl rule__ChangePlugin__Group__9 ;
    public final void rule__ChangePlugin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:893:1: ( rule__ChangePlugin__Group__8__Impl rule__ChangePlugin__Group__9 )
            // InternalDSL.g:894:2: rule__ChangePlugin__Group__8__Impl rule__ChangePlugin__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__ChangePlugin__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group__9();

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
    // $ANTLR end "rule__ChangePlugin__Group__8"


    // $ANTLR start "rule__ChangePlugin__Group__8__Impl"
    // InternalDSL.g:901:1: rule__ChangePlugin__Group__8__Impl : ( ( rule__ChangePlugin__Group_8__0 )? ) ;
    public final void rule__ChangePlugin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:905:1: ( ( ( rule__ChangePlugin__Group_8__0 )? ) )
            // InternalDSL.g:906:1: ( ( rule__ChangePlugin__Group_8__0 )? )
            {
            // InternalDSL.g:906:1: ( ( rule__ChangePlugin__Group_8__0 )? )
            // InternalDSL.g:907:2: ( rule__ChangePlugin__Group_8__0 )?
            {
             before(grammarAccess.getChangePluginAccess().getGroup_8()); 
            // InternalDSL.g:908:2: ( rule__ChangePlugin__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:908:3: rule__ChangePlugin__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangePlugin__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChangePluginAccess().getGroup_8()); 

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
    // $ANTLR end "rule__ChangePlugin__Group__8__Impl"


    // $ANTLR start "rule__ChangePlugin__Group__9"
    // InternalDSL.g:916:1: rule__ChangePlugin__Group__9 : rule__ChangePlugin__Group__9__Impl ;
    public final void rule__ChangePlugin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:920:1: ( rule__ChangePlugin__Group__9__Impl )
            // InternalDSL.g:921:2: rule__ChangePlugin__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group__9__Impl();

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
    // $ANTLR end "rule__ChangePlugin__Group__9"


    // $ANTLR start "rule__ChangePlugin__Group__9__Impl"
    // InternalDSL.g:927:1: rule__ChangePlugin__Group__9__Impl : ( '}' ) ;
    public final void rule__ChangePlugin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:931:1: ( ( '}' ) )
            // InternalDSL.g:932:1: ( '}' )
            {
            // InternalDSL.g:932:1: ( '}' )
            // InternalDSL.g:933:2: '}'
            {
             before(grammarAccess.getChangePluginAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getChangePluginAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__ChangePlugin__Group__9__Impl"


    // $ANTLR start "rule__ChangePlugin__Group_8__0"
    // InternalDSL.g:943:1: rule__ChangePlugin__Group_8__0 : rule__ChangePlugin__Group_8__0__Impl rule__ChangePlugin__Group_8__1 ;
    public final void rule__ChangePlugin__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:947:1: ( rule__ChangePlugin__Group_8__0__Impl rule__ChangePlugin__Group_8__1 )
            // InternalDSL.g:948:2: rule__ChangePlugin__Group_8__0__Impl rule__ChangePlugin__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__ChangePlugin__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group_8__1();

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
    // $ANTLR end "rule__ChangePlugin__Group_8__0"


    // $ANTLR start "rule__ChangePlugin__Group_8__0__Impl"
    // InternalDSL.g:955:1: rule__ChangePlugin__Group_8__0__Impl : ( 'args' ) ;
    public final void rule__ChangePlugin__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:959:1: ( ( 'args' ) )
            // InternalDSL.g:960:1: ( 'args' )
            {
            // InternalDSL.g:960:1: ( 'args' )
            // InternalDSL.g:961:2: 'args'
            {
             before(grammarAccess.getChangePluginAccess().getArgsKeyword_8_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getChangePluginAccess().getArgsKeyword_8_0()); 

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
    // $ANTLR end "rule__ChangePlugin__Group_8__0__Impl"


    // $ANTLR start "rule__ChangePlugin__Group_8__1"
    // InternalDSL.g:970:1: rule__ChangePlugin__Group_8__1 : rule__ChangePlugin__Group_8__1__Impl rule__ChangePlugin__Group_8__2 ;
    public final void rule__ChangePlugin__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:974:1: ( rule__ChangePlugin__Group_8__1__Impl rule__ChangePlugin__Group_8__2 )
            // InternalDSL.g:975:2: rule__ChangePlugin__Group_8__1__Impl rule__ChangePlugin__Group_8__2
            {
            pushFollow(FOLLOW_14);
            rule__ChangePlugin__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group_8__2();

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
    // $ANTLR end "rule__ChangePlugin__Group_8__1"


    // $ANTLR start "rule__ChangePlugin__Group_8__1__Impl"
    // InternalDSL.g:982:1: rule__ChangePlugin__Group_8__1__Impl : ( '{' ) ;
    public final void rule__ChangePlugin__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:986:1: ( ( '{' ) )
            // InternalDSL.g:987:1: ( '{' )
            {
            // InternalDSL.g:987:1: ( '{' )
            // InternalDSL.g:988:2: '{'
            {
             before(grammarAccess.getChangePluginAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChangePluginAccess().getLeftCurlyBracketKeyword_8_1()); 

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
    // $ANTLR end "rule__ChangePlugin__Group_8__1__Impl"


    // $ANTLR start "rule__ChangePlugin__Group_8__2"
    // InternalDSL.g:997:1: rule__ChangePlugin__Group_8__2 : rule__ChangePlugin__Group_8__2__Impl rule__ChangePlugin__Group_8__3 ;
    public final void rule__ChangePlugin__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1001:1: ( rule__ChangePlugin__Group_8__2__Impl rule__ChangePlugin__Group_8__3 )
            // InternalDSL.g:1002:2: rule__ChangePlugin__Group_8__2__Impl rule__ChangePlugin__Group_8__3
            {
            pushFollow(FOLLOW_7);
            rule__ChangePlugin__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group_8__3();

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
    // $ANTLR end "rule__ChangePlugin__Group_8__2"


    // $ANTLR start "rule__ChangePlugin__Group_8__2__Impl"
    // InternalDSL.g:1009:1: rule__ChangePlugin__Group_8__2__Impl : ( ( rule__ChangePlugin__ArgsAssignment_8_2 ) ) ;
    public final void rule__ChangePlugin__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1013:1: ( ( ( rule__ChangePlugin__ArgsAssignment_8_2 ) ) )
            // InternalDSL.g:1014:1: ( ( rule__ChangePlugin__ArgsAssignment_8_2 ) )
            {
            // InternalDSL.g:1014:1: ( ( rule__ChangePlugin__ArgsAssignment_8_2 ) )
            // InternalDSL.g:1015:2: ( rule__ChangePlugin__ArgsAssignment_8_2 )
            {
             before(grammarAccess.getChangePluginAccess().getArgsAssignment_8_2()); 
            // InternalDSL.g:1016:2: ( rule__ChangePlugin__ArgsAssignment_8_2 )
            // InternalDSL.g:1016:3: rule__ChangePlugin__ArgsAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangePlugin__ArgsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getChangePluginAccess().getArgsAssignment_8_2()); 

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
    // $ANTLR end "rule__ChangePlugin__Group_8__2__Impl"


    // $ANTLR start "rule__ChangePlugin__Group_8__3"
    // InternalDSL.g:1024:1: rule__ChangePlugin__Group_8__3 : rule__ChangePlugin__Group_8__3__Impl rule__ChangePlugin__Group_8__4 ;
    public final void rule__ChangePlugin__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1028:1: ( rule__ChangePlugin__Group_8__3__Impl rule__ChangePlugin__Group_8__4 )
            // InternalDSL.g:1029:2: rule__ChangePlugin__Group_8__3__Impl rule__ChangePlugin__Group_8__4
            {
            pushFollow(FOLLOW_7);
            rule__ChangePlugin__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group_8__4();

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
    // $ANTLR end "rule__ChangePlugin__Group_8__3"


    // $ANTLR start "rule__ChangePlugin__Group_8__3__Impl"
    // InternalDSL.g:1036:1: rule__ChangePlugin__Group_8__3__Impl : ( ( rule__ChangePlugin__Group_8_3__0 )* ) ;
    public final void rule__ChangePlugin__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1040:1: ( ( ( rule__ChangePlugin__Group_8_3__0 )* ) )
            // InternalDSL.g:1041:1: ( ( rule__ChangePlugin__Group_8_3__0 )* )
            {
            // InternalDSL.g:1041:1: ( ( rule__ChangePlugin__Group_8_3__0 )* )
            // InternalDSL.g:1042:2: ( rule__ChangePlugin__Group_8_3__0 )*
            {
             before(grammarAccess.getChangePluginAccess().getGroup_8_3()); 
            // InternalDSL.g:1043:2: ( rule__ChangePlugin__Group_8_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDSL.g:1043:3: rule__ChangePlugin__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ChangePlugin__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getChangePluginAccess().getGroup_8_3()); 

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
    // $ANTLR end "rule__ChangePlugin__Group_8__3__Impl"


    // $ANTLR start "rule__ChangePlugin__Group_8__4"
    // InternalDSL.g:1051:1: rule__ChangePlugin__Group_8__4 : rule__ChangePlugin__Group_8__4__Impl ;
    public final void rule__ChangePlugin__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1055:1: ( rule__ChangePlugin__Group_8__4__Impl )
            // InternalDSL.g:1056:2: rule__ChangePlugin__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group_8__4__Impl();

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
    // $ANTLR end "rule__ChangePlugin__Group_8__4"


    // $ANTLR start "rule__ChangePlugin__Group_8__4__Impl"
    // InternalDSL.g:1062:1: rule__ChangePlugin__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ChangePlugin__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1066:1: ( ( '}' ) )
            // InternalDSL.g:1067:1: ( '}' )
            {
            // InternalDSL.g:1067:1: ( '}' )
            // InternalDSL.g:1068:2: '}'
            {
             before(grammarAccess.getChangePluginAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getChangePluginAccess().getRightCurlyBracketKeyword_8_4()); 

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
    // $ANTLR end "rule__ChangePlugin__Group_8__4__Impl"


    // $ANTLR start "rule__ChangePlugin__Group_8_3__0"
    // InternalDSL.g:1078:1: rule__ChangePlugin__Group_8_3__0 : rule__ChangePlugin__Group_8_3__0__Impl rule__ChangePlugin__Group_8_3__1 ;
    public final void rule__ChangePlugin__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1082:1: ( rule__ChangePlugin__Group_8_3__0__Impl rule__ChangePlugin__Group_8_3__1 )
            // InternalDSL.g:1083:2: rule__ChangePlugin__Group_8_3__0__Impl rule__ChangePlugin__Group_8_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ChangePlugin__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group_8_3__1();

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
    // $ANTLR end "rule__ChangePlugin__Group_8_3__0"


    // $ANTLR start "rule__ChangePlugin__Group_8_3__0__Impl"
    // InternalDSL.g:1090:1: rule__ChangePlugin__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__ChangePlugin__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1094:1: ( ( ',' ) )
            // InternalDSL.g:1095:1: ( ',' )
            {
            // InternalDSL.g:1095:1: ( ',' )
            // InternalDSL.g:1096:2: ','
            {
             before(grammarAccess.getChangePluginAccess().getCommaKeyword_8_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getChangePluginAccess().getCommaKeyword_8_3_0()); 

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
    // $ANTLR end "rule__ChangePlugin__Group_8_3__0__Impl"


    // $ANTLR start "rule__ChangePlugin__Group_8_3__1"
    // InternalDSL.g:1105:1: rule__ChangePlugin__Group_8_3__1 : rule__ChangePlugin__Group_8_3__1__Impl ;
    public final void rule__ChangePlugin__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1109:1: ( rule__ChangePlugin__Group_8_3__1__Impl )
            // InternalDSL.g:1110:2: rule__ChangePlugin__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangePlugin__Group_8_3__1__Impl();

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
    // $ANTLR end "rule__ChangePlugin__Group_8_3__1"


    // $ANTLR start "rule__ChangePlugin__Group_8_3__1__Impl"
    // InternalDSL.g:1116:1: rule__ChangePlugin__Group_8_3__1__Impl : ( ( rule__ChangePlugin__ArgsAssignment_8_3_1 ) ) ;
    public final void rule__ChangePlugin__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1120:1: ( ( ( rule__ChangePlugin__ArgsAssignment_8_3_1 ) ) )
            // InternalDSL.g:1121:1: ( ( rule__ChangePlugin__ArgsAssignment_8_3_1 ) )
            {
            // InternalDSL.g:1121:1: ( ( rule__ChangePlugin__ArgsAssignment_8_3_1 ) )
            // InternalDSL.g:1122:2: ( rule__ChangePlugin__ArgsAssignment_8_3_1 )
            {
             before(grammarAccess.getChangePluginAccess().getArgsAssignment_8_3_1()); 
            // InternalDSL.g:1123:2: ( rule__ChangePlugin__ArgsAssignment_8_3_1 )
            // InternalDSL.g:1123:3: rule__ChangePlugin__ArgsAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ChangePlugin__ArgsAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getChangePluginAccess().getArgsAssignment_8_3_1()); 

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
    // $ANTLR end "rule__ChangePlugin__Group_8_3__1__Impl"


    // $ANTLR start "rule__ATLRefiningScript__Group__0"
    // InternalDSL.g:1132:1: rule__ATLRefiningScript__Group__0 : rule__ATLRefiningScript__Group__0__Impl rule__ATLRefiningScript__Group__1 ;
    public final void rule__ATLRefiningScript__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1136:1: ( rule__ATLRefiningScript__Group__0__Impl rule__ATLRefiningScript__Group__1 )
            // InternalDSL.g:1137:2: rule__ATLRefiningScript__Group__0__Impl rule__ATLRefiningScript__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ATLRefiningScript__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ATLRefiningScript__Group__1();

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
    // $ANTLR end "rule__ATLRefiningScript__Group__0"


    // $ANTLR start "rule__ATLRefiningScript__Group__0__Impl"
    // InternalDSL.g:1144:1: rule__ATLRefiningScript__Group__0__Impl : ( 'ATLRefiningScript' ) ;
    public final void rule__ATLRefiningScript__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1148:1: ( ( 'ATLRefiningScript' ) )
            // InternalDSL.g:1149:1: ( 'ATLRefiningScript' )
            {
            // InternalDSL.g:1149:1: ( 'ATLRefiningScript' )
            // InternalDSL.g:1150:2: 'ATLRefiningScript'
            {
             before(grammarAccess.getATLRefiningScriptAccess().getATLRefiningScriptKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getATLRefiningScriptAccess().getATLRefiningScriptKeyword_0()); 

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
    // $ANTLR end "rule__ATLRefiningScript__Group__0__Impl"


    // $ANTLR start "rule__ATLRefiningScript__Group__1"
    // InternalDSL.g:1159:1: rule__ATLRefiningScript__Group__1 : rule__ATLRefiningScript__Group__1__Impl rule__ATLRefiningScript__Group__2 ;
    public final void rule__ATLRefiningScript__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1163:1: ( rule__ATLRefiningScript__Group__1__Impl rule__ATLRefiningScript__Group__2 )
            // InternalDSL.g:1164:2: rule__ATLRefiningScript__Group__1__Impl rule__ATLRefiningScript__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ATLRefiningScript__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ATLRefiningScript__Group__2();

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
    // $ANTLR end "rule__ATLRefiningScript__Group__1"


    // $ANTLR start "rule__ATLRefiningScript__Group__1__Impl"
    // InternalDSL.g:1171:1: rule__ATLRefiningScript__Group__1__Impl : ( '{' ) ;
    public final void rule__ATLRefiningScript__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1175:1: ( ( '{' ) )
            // InternalDSL.g:1176:1: ( '{' )
            {
            // InternalDSL.g:1176:1: ( '{' )
            // InternalDSL.g:1177:2: '{'
            {
             before(grammarAccess.getATLRefiningScriptAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getATLRefiningScriptAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ATLRefiningScript__Group__1__Impl"


    // $ANTLR start "rule__ATLRefiningScript__Group__2"
    // InternalDSL.g:1186:1: rule__ATLRefiningScript__Group__2 : rule__ATLRefiningScript__Group__2__Impl rule__ATLRefiningScript__Group__3 ;
    public final void rule__ATLRefiningScript__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1190:1: ( rule__ATLRefiningScript__Group__2__Impl rule__ATLRefiningScript__Group__3 )
            // InternalDSL.g:1191:2: rule__ATLRefiningScript__Group__2__Impl rule__ATLRefiningScript__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ATLRefiningScript__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ATLRefiningScript__Group__3();

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
    // $ANTLR end "rule__ATLRefiningScript__Group__2"


    // $ANTLR start "rule__ATLRefiningScript__Group__2__Impl"
    // InternalDSL.g:1198:1: rule__ATLRefiningScript__Group__2__Impl : ( 'model' ) ;
    public final void rule__ATLRefiningScript__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1202:1: ( ( 'model' ) )
            // InternalDSL.g:1203:1: ( 'model' )
            {
            // InternalDSL.g:1203:1: ( 'model' )
            // InternalDSL.g:1204:2: 'model'
            {
             before(grammarAccess.getATLRefiningScriptAccess().getModelKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getATLRefiningScriptAccess().getModelKeyword_2()); 

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
    // $ANTLR end "rule__ATLRefiningScript__Group__2__Impl"


    // $ANTLR start "rule__ATLRefiningScript__Group__3"
    // InternalDSL.g:1213:1: rule__ATLRefiningScript__Group__3 : rule__ATLRefiningScript__Group__3__Impl rule__ATLRefiningScript__Group__4 ;
    public final void rule__ATLRefiningScript__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1217:1: ( rule__ATLRefiningScript__Group__3__Impl rule__ATLRefiningScript__Group__4 )
            // InternalDSL.g:1218:2: rule__ATLRefiningScript__Group__3__Impl rule__ATLRefiningScript__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ATLRefiningScript__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ATLRefiningScript__Group__4();

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
    // $ANTLR end "rule__ATLRefiningScript__Group__3"


    // $ANTLR start "rule__ATLRefiningScript__Group__3__Impl"
    // InternalDSL.g:1225:1: rule__ATLRefiningScript__Group__3__Impl : ( ( rule__ATLRefiningScript__ModelAssignment_3 ) ) ;
    public final void rule__ATLRefiningScript__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1229:1: ( ( ( rule__ATLRefiningScript__ModelAssignment_3 ) ) )
            // InternalDSL.g:1230:1: ( ( rule__ATLRefiningScript__ModelAssignment_3 ) )
            {
            // InternalDSL.g:1230:1: ( ( rule__ATLRefiningScript__ModelAssignment_3 ) )
            // InternalDSL.g:1231:2: ( rule__ATLRefiningScript__ModelAssignment_3 )
            {
             before(grammarAccess.getATLRefiningScriptAccess().getModelAssignment_3()); 
            // InternalDSL.g:1232:2: ( rule__ATLRefiningScript__ModelAssignment_3 )
            // InternalDSL.g:1232:3: rule__ATLRefiningScript__ModelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ATLRefiningScript__ModelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getATLRefiningScriptAccess().getModelAssignment_3()); 

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
    // $ANTLR end "rule__ATLRefiningScript__Group__3__Impl"


    // $ANTLR start "rule__ATLRefiningScript__Group__4"
    // InternalDSL.g:1240:1: rule__ATLRefiningScript__Group__4 : rule__ATLRefiningScript__Group__4__Impl rule__ATLRefiningScript__Group__5 ;
    public final void rule__ATLRefiningScript__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1244:1: ( rule__ATLRefiningScript__Group__4__Impl rule__ATLRefiningScript__Group__5 )
            // InternalDSL.g:1245:2: rule__ATLRefiningScript__Group__4__Impl rule__ATLRefiningScript__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ATLRefiningScript__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ATLRefiningScript__Group__5();

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
    // $ANTLR end "rule__ATLRefiningScript__Group__4"


    // $ANTLR start "rule__ATLRefiningScript__Group__4__Impl"
    // InternalDSL.g:1252:1: rule__ATLRefiningScript__Group__4__Impl : ( 'script' ) ;
    public final void rule__ATLRefiningScript__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1256:1: ( ( 'script' ) )
            // InternalDSL.g:1257:1: ( 'script' )
            {
            // InternalDSL.g:1257:1: ( 'script' )
            // InternalDSL.g:1258:2: 'script'
            {
             before(grammarAccess.getATLRefiningScriptAccess().getScriptKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getATLRefiningScriptAccess().getScriptKeyword_4()); 

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
    // $ANTLR end "rule__ATLRefiningScript__Group__4__Impl"


    // $ANTLR start "rule__ATLRefiningScript__Group__5"
    // InternalDSL.g:1267:1: rule__ATLRefiningScript__Group__5 : rule__ATLRefiningScript__Group__5__Impl rule__ATLRefiningScript__Group__6 ;
    public final void rule__ATLRefiningScript__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1271:1: ( rule__ATLRefiningScript__Group__5__Impl rule__ATLRefiningScript__Group__6 )
            // InternalDSL.g:1272:2: rule__ATLRefiningScript__Group__5__Impl rule__ATLRefiningScript__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__ATLRefiningScript__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ATLRefiningScript__Group__6();

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
    // $ANTLR end "rule__ATLRefiningScript__Group__5"


    // $ANTLR start "rule__ATLRefiningScript__Group__5__Impl"
    // InternalDSL.g:1279:1: rule__ATLRefiningScript__Group__5__Impl : ( ( rule__ATLRefiningScript__ScriptAssignment_5 ) ) ;
    public final void rule__ATLRefiningScript__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1283:1: ( ( ( rule__ATLRefiningScript__ScriptAssignment_5 ) ) )
            // InternalDSL.g:1284:1: ( ( rule__ATLRefiningScript__ScriptAssignment_5 ) )
            {
            // InternalDSL.g:1284:1: ( ( rule__ATLRefiningScript__ScriptAssignment_5 ) )
            // InternalDSL.g:1285:2: ( rule__ATLRefiningScript__ScriptAssignment_5 )
            {
             before(grammarAccess.getATLRefiningScriptAccess().getScriptAssignment_5()); 
            // InternalDSL.g:1286:2: ( rule__ATLRefiningScript__ScriptAssignment_5 )
            // InternalDSL.g:1286:3: rule__ATLRefiningScript__ScriptAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ATLRefiningScript__ScriptAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getATLRefiningScriptAccess().getScriptAssignment_5()); 

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
    // $ANTLR end "rule__ATLRefiningScript__Group__5__Impl"


    // $ANTLR start "rule__ATLRefiningScript__Group__6"
    // InternalDSL.g:1294:1: rule__ATLRefiningScript__Group__6 : rule__ATLRefiningScript__Group__6__Impl ;
    public final void rule__ATLRefiningScript__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1298:1: ( rule__ATLRefiningScript__Group__6__Impl )
            // InternalDSL.g:1299:2: rule__ATLRefiningScript__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ATLRefiningScript__Group__6__Impl();

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
    // $ANTLR end "rule__ATLRefiningScript__Group__6"


    // $ANTLR start "rule__ATLRefiningScript__Group__6__Impl"
    // InternalDSL.g:1305:1: rule__ATLRefiningScript__Group__6__Impl : ( '}' ) ;
    public final void rule__ATLRefiningScript__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1309:1: ( ( '}' ) )
            // InternalDSL.g:1310:1: ( '}' )
            {
            // InternalDSL.g:1310:1: ( '}' )
            // InternalDSL.g:1311:2: '}'
            {
             before(grammarAccess.getATLRefiningScriptAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getATLRefiningScriptAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ATLRefiningScript__Group__6__Impl"


    // $ANTLR start "rule__ChangeAgentLabel__Group__0"
    // InternalDSL.g:1321:1: rule__ChangeAgentLabel__Group__0 : rule__ChangeAgentLabel__Group__0__Impl rule__ChangeAgentLabel__Group__1 ;
    public final void rule__ChangeAgentLabel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1325:1: ( rule__ChangeAgentLabel__Group__0__Impl rule__ChangeAgentLabel__Group__1 )
            // InternalDSL.g:1326:2: rule__ChangeAgentLabel__Group__0__Impl rule__ChangeAgentLabel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ChangeAgentLabel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeAgentLabel__Group__1();

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
    // $ANTLR end "rule__ChangeAgentLabel__Group__0"


    // $ANTLR start "rule__ChangeAgentLabel__Group__0__Impl"
    // InternalDSL.g:1333:1: rule__ChangeAgentLabel__Group__0__Impl : ( 'ChangeAgentLabel' ) ;
    public final void rule__ChangeAgentLabel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1337:1: ( ( 'ChangeAgentLabel' ) )
            // InternalDSL.g:1338:1: ( 'ChangeAgentLabel' )
            {
            // InternalDSL.g:1338:1: ( 'ChangeAgentLabel' )
            // InternalDSL.g:1339:2: 'ChangeAgentLabel'
            {
             before(grammarAccess.getChangeAgentLabelAccess().getChangeAgentLabelKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getChangeAgentLabelAccess().getChangeAgentLabelKeyword_0()); 

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
    // $ANTLR end "rule__ChangeAgentLabel__Group__0__Impl"


    // $ANTLR start "rule__ChangeAgentLabel__Group__1"
    // InternalDSL.g:1348:1: rule__ChangeAgentLabel__Group__1 : rule__ChangeAgentLabel__Group__1__Impl rule__ChangeAgentLabel__Group__2 ;
    public final void rule__ChangeAgentLabel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1352:1: ( rule__ChangeAgentLabel__Group__1__Impl rule__ChangeAgentLabel__Group__2 )
            // InternalDSL.g:1353:2: rule__ChangeAgentLabel__Group__1__Impl rule__ChangeAgentLabel__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ChangeAgentLabel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeAgentLabel__Group__2();

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
    // $ANTLR end "rule__ChangeAgentLabel__Group__1"


    // $ANTLR start "rule__ChangeAgentLabel__Group__1__Impl"
    // InternalDSL.g:1360:1: rule__ChangeAgentLabel__Group__1__Impl : ( '{' ) ;
    public final void rule__ChangeAgentLabel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1364:1: ( ( '{' ) )
            // InternalDSL.g:1365:1: ( '{' )
            {
            // InternalDSL.g:1365:1: ( '{' )
            // InternalDSL.g:1366:2: '{'
            {
             before(grammarAccess.getChangeAgentLabelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChangeAgentLabelAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ChangeAgentLabel__Group__1__Impl"


    // $ANTLR start "rule__ChangeAgentLabel__Group__2"
    // InternalDSL.g:1375:1: rule__ChangeAgentLabel__Group__2 : rule__ChangeAgentLabel__Group__2__Impl rule__ChangeAgentLabel__Group__3 ;
    public final void rule__ChangeAgentLabel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1379:1: ( rule__ChangeAgentLabel__Group__2__Impl rule__ChangeAgentLabel__Group__3 )
            // InternalDSL.g:1380:2: rule__ChangeAgentLabel__Group__2__Impl rule__ChangeAgentLabel__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ChangeAgentLabel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeAgentLabel__Group__3();

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
    // $ANTLR end "rule__ChangeAgentLabel__Group__2"


    // $ANTLR start "rule__ChangeAgentLabel__Group__2__Impl"
    // InternalDSL.g:1387:1: rule__ChangeAgentLabel__Group__2__Impl : ( 'model' ) ;
    public final void rule__ChangeAgentLabel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1391:1: ( ( 'model' ) )
            // InternalDSL.g:1392:1: ( 'model' )
            {
            // InternalDSL.g:1392:1: ( 'model' )
            // InternalDSL.g:1393:2: 'model'
            {
             before(grammarAccess.getChangeAgentLabelAccess().getModelKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChangeAgentLabelAccess().getModelKeyword_2()); 

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
    // $ANTLR end "rule__ChangeAgentLabel__Group__2__Impl"


    // $ANTLR start "rule__ChangeAgentLabel__Group__3"
    // InternalDSL.g:1402:1: rule__ChangeAgentLabel__Group__3 : rule__ChangeAgentLabel__Group__3__Impl rule__ChangeAgentLabel__Group__4 ;
    public final void rule__ChangeAgentLabel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1406:1: ( rule__ChangeAgentLabel__Group__3__Impl rule__ChangeAgentLabel__Group__4 )
            // InternalDSL.g:1407:2: rule__ChangeAgentLabel__Group__3__Impl rule__ChangeAgentLabel__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ChangeAgentLabel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeAgentLabel__Group__4();

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
    // $ANTLR end "rule__ChangeAgentLabel__Group__3"


    // $ANTLR start "rule__ChangeAgentLabel__Group__3__Impl"
    // InternalDSL.g:1414:1: rule__ChangeAgentLabel__Group__3__Impl : ( ( rule__ChangeAgentLabel__ModelAssignment_3 ) ) ;
    public final void rule__ChangeAgentLabel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1418:1: ( ( ( rule__ChangeAgentLabel__ModelAssignment_3 ) ) )
            // InternalDSL.g:1419:1: ( ( rule__ChangeAgentLabel__ModelAssignment_3 ) )
            {
            // InternalDSL.g:1419:1: ( ( rule__ChangeAgentLabel__ModelAssignment_3 ) )
            // InternalDSL.g:1420:2: ( rule__ChangeAgentLabel__ModelAssignment_3 )
            {
             before(grammarAccess.getChangeAgentLabelAccess().getModelAssignment_3()); 
            // InternalDSL.g:1421:2: ( rule__ChangeAgentLabel__ModelAssignment_3 )
            // InternalDSL.g:1421:3: rule__ChangeAgentLabel__ModelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ChangeAgentLabel__ModelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChangeAgentLabelAccess().getModelAssignment_3()); 

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
    // $ANTLR end "rule__ChangeAgentLabel__Group__3__Impl"


    // $ANTLR start "rule__ChangeAgentLabel__Group__4"
    // InternalDSL.g:1429:1: rule__ChangeAgentLabel__Group__4 : rule__ChangeAgentLabel__Group__4__Impl rule__ChangeAgentLabel__Group__5 ;
    public final void rule__ChangeAgentLabel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1433:1: ( rule__ChangeAgentLabel__Group__4__Impl rule__ChangeAgentLabel__Group__5 )
            // InternalDSL.g:1434:2: rule__ChangeAgentLabel__Group__4__Impl rule__ChangeAgentLabel__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ChangeAgentLabel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeAgentLabel__Group__5();

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
    // $ANTLR end "rule__ChangeAgentLabel__Group__4"


    // $ANTLR start "rule__ChangeAgentLabel__Group__4__Impl"
    // InternalDSL.g:1441:1: rule__ChangeAgentLabel__Group__4__Impl : ( 'name' ) ;
    public final void rule__ChangeAgentLabel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1445:1: ( ( 'name' ) )
            // InternalDSL.g:1446:1: ( 'name' )
            {
            // InternalDSL.g:1446:1: ( 'name' )
            // InternalDSL.g:1447:2: 'name'
            {
             before(grammarAccess.getChangeAgentLabelAccess().getNameKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getChangeAgentLabelAccess().getNameKeyword_4()); 

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
    // $ANTLR end "rule__ChangeAgentLabel__Group__4__Impl"


    // $ANTLR start "rule__ChangeAgentLabel__Group__5"
    // InternalDSL.g:1456:1: rule__ChangeAgentLabel__Group__5 : rule__ChangeAgentLabel__Group__5__Impl rule__ChangeAgentLabel__Group__6 ;
    public final void rule__ChangeAgentLabel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1460:1: ( rule__ChangeAgentLabel__Group__5__Impl rule__ChangeAgentLabel__Group__6 )
            // InternalDSL.g:1461:2: rule__ChangeAgentLabel__Group__5__Impl rule__ChangeAgentLabel__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__ChangeAgentLabel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeAgentLabel__Group__6();

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
    // $ANTLR end "rule__ChangeAgentLabel__Group__5"


    // $ANTLR start "rule__ChangeAgentLabel__Group__5__Impl"
    // InternalDSL.g:1468:1: rule__ChangeAgentLabel__Group__5__Impl : ( ( rule__ChangeAgentLabel__NameAssignment_5 ) ) ;
    public final void rule__ChangeAgentLabel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1472:1: ( ( ( rule__ChangeAgentLabel__NameAssignment_5 ) ) )
            // InternalDSL.g:1473:1: ( ( rule__ChangeAgentLabel__NameAssignment_5 ) )
            {
            // InternalDSL.g:1473:1: ( ( rule__ChangeAgentLabel__NameAssignment_5 ) )
            // InternalDSL.g:1474:2: ( rule__ChangeAgentLabel__NameAssignment_5 )
            {
             before(grammarAccess.getChangeAgentLabelAccess().getNameAssignment_5()); 
            // InternalDSL.g:1475:2: ( rule__ChangeAgentLabel__NameAssignment_5 )
            // InternalDSL.g:1475:3: rule__ChangeAgentLabel__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ChangeAgentLabel__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getChangeAgentLabelAccess().getNameAssignment_5()); 

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
    // $ANTLR end "rule__ChangeAgentLabel__Group__5__Impl"


    // $ANTLR start "rule__ChangeAgentLabel__Group__6"
    // InternalDSL.g:1483:1: rule__ChangeAgentLabel__Group__6 : rule__ChangeAgentLabel__Group__6__Impl ;
    public final void rule__ChangeAgentLabel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1487:1: ( rule__ChangeAgentLabel__Group__6__Impl )
            // InternalDSL.g:1488:2: rule__ChangeAgentLabel__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeAgentLabel__Group__6__Impl();

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
    // $ANTLR end "rule__ChangeAgentLabel__Group__6"


    // $ANTLR start "rule__ChangeAgentLabel__Group__6__Impl"
    // InternalDSL.g:1494:1: rule__ChangeAgentLabel__Group__6__Impl : ( '}' ) ;
    public final void rule__ChangeAgentLabel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1498:1: ( ( '}' ) )
            // InternalDSL.g:1499:1: ( '}' )
            {
            // InternalDSL.g:1499:1: ( '}' )
            // InternalDSL.g:1500:2: '}'
            {
             before(grammarAccess.getChangeAgentLabelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getChangeAgentLabelAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ChangeAgentLabel__Group__6__Impl"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__0"
    // InternalDSL.g:1510:1: rule__ReplaceAgentLabels__Group__0 : rule__ReplaceAgentLabels__Group__0__Impl rule__ReplaceAgentLabels__Group__1 ;
    public final void rule__ReplaceAgentLabels__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1514:1: ( rule__ReplaceAgentLabels__Group__0__Impl rule__ReplaceAgentLabels__Group__1 )
            // InternalDSL.g:1515:2: rule__ReplaceAgentLabels__Group__0__Impl rule__ReplaceAgentLabels__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ReplaceAgentLabels__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__Group__1();

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__0"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__0__Impl"
    // InternalDSL.g:1522:1: rule__ReplaceAgentLabels__Group__0__Impl : ( 'ReplaceAgentLabels' ) ;
    public final void rule__ReplaceAgentLabels__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1526:1: ( ( 'ReplaceAgentLabels' ) )
            // InternalDSL.g:1527:1: ( 'ReplaceAgentLabels' )
            {
            // InternalDSL.g:1527:1: ( 'ReplaceAgentLabels' )
            // InternalDSL.g:1528:2: 'ReplaceAgentLabels'
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getReplaceAgentLabelsKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getReplaceAgentLabelsAccess().getReplaceAgentLabelsKeyword_0()); 

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__0__Impl"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__1"
    // InternalDSL.g:1537:1: rule__ReplaceAgentLabels__Group__1 : rule__ReplaceAgentLabels__Group__1__Impl rule__ReplaceAgentLabels__Group__2 ;
    public final void rule__ReplaceAgentLabels__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1541:1: ( rule__ReplaceAgentLabels__Group__1__Impl rule__ReplaceAgentLabels__Group__2 )
            // InternalDSL.g:1542:2: rule__ReplaceAgentLabels__Group__1__Impl rule__ReplaceAgentLabels__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ReplaceAgentLabels__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__Group__2();

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__1"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__1__Impl"
    // InternalDSL.g:1549:1: rule__ReplaceAgentLabels__Group__1__Impl : ( '{' ) ;
    public final void rule__ReplaceAgentLabels__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1553:1: ( ( '{' ) )
            // InternalDSL.g:1554:1: ( '{' )
            {
            // InternalDSL.g:1554:1: ( '{' )
            // InternalDSL.g:1555:2: '{'
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReplaceAgentLabelsAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__1__Impl"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__2"
    // InternalDSL.g:1564:1: rule__ReplaceAgentLabels__Group__2 : rule__ReplaceAgentLabels__Group__2__Impl rule__ReplaceAgentLabels__Group__3 ;
    public final void rule__ReplaceAgentLabels__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1568:1: ( rule__ReplaceAgentLabels__Group__2__Impl rule__ReplaceAgentLabels__Group__3 )
            // InternalDSL.g:1569:2: rule__ReplaceAgentLabels__Group__2__Impl rule__ReplaceAgentLabels__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ReplaceAgentLabels__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__Group__3();

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__2"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__2__Impl"
    // InternalDSL.g:1576:1: rule__ReplaceAgentLabels__Group__2__Impl : ( 'model' ) ;
    public final void rule__ReplaceAgentLabels__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1580:1: ( ( 'model' ) )
            // InternalDSL.g:1581:1: ( 'model' )
            {
            // InternalDSL.g:1581:1: ( 'model' )
            // InternalDSL.g:1582:2: 'model'
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getModelKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getReplaceAgentLabelsAccess().getModelKeyword_2()); 

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__2__Impl"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__3"
    // InternalDSL.g:1591:1: rule__ReplaceAgentLabels__Group__3 : rule__ReplaceAgentLabels__Group__3__Impl rule__ReplaceAgentLabels__Group__4 ;
    public final void rule__ReplaceAgentLabels__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1595:1: ( rule__ReplaceAgentLabels__Group__3__Impl rule__ReplaceAgentLabels__Group__4 )
            // InternalDSL.g:1596:2: rule__ReplaceAgentLabels__Group__3__Impl rule__ReplaceAgentLabels__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__ReplaceAgentLabels__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__Group__4();

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__3"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__3__Impl"
    // InternalDSL.g:1603:1: rule__ReplaceAgentLabels__Group__3__Impl : ( ( rule__ReplaceAgentLabels__ModelAssignment_3 ) ) ;
    public final void rule__ReplaceAgentLabels__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1607:1: ( ( ( rule__ReplaceAgentLabels__ModelAssignment_3 ) ) )
            // InternalDSL.g:1608:1: ( ( rule__ReplaceAgentLabels__ModelAssignment_3 ) )
            {
            // InternalDSL.g:1608:1: ( ( rule__ReplaceAgentLabels__ModelAssignment_3 ) )
            // InternalDSL.g:1609:2: ( rule__ReplaceAgentLabels__ModelAssignment_3 )
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getModelAssignment_3()); 
            // InternalDSL.g:1610:2: ( rule__ReplaceAgentLabels__ModelAssignment_3 )
            // InternalDSL.g:1610:3: rule__ReplaceAgentLabels__ModelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__ModelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReplaceAgentLabelsAccess().getModelAssignment_3()); 

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__3__Impl"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__4"
    // InternalDSL.g:1618:1: rule__ReplaceAgentLabels__Group__4 : rule__ReplaceAgentLabels__Group__4__Impl rule__ReplaceAgentLabels__Group__5 ;
    public final void rule__ReplaceAgentLabels__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1622:1: ( rule__ReplaceAgentLabels__Group__4__Impl rule__ReplaceAgentLabels__Group__5 )
            // InternalDSL.g:1623:2: rule__ReplaceAgentLabels__Group__4__Impl rule__ReplaceAgentLabels__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ReplaceAgentLabels__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__Group__5();

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__4"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__4__Impl"
    // InternalDSL.g:1630:1: rule__ReplaceAgentLabels__Group__4__Impl : ( 'condition' ) ;
    public final void rule__ReplaceAgentLabels__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1634:1: ( ( 'condition' ) )
            // InternalDSL.g:1635:1: ( 'condition' )
            {
            // InternalDSL.g:1635:1: ( 'condition' )
            // InternalDSL.g:1636:2: 'condition'
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getConditionKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getReplaceAgentLabelsAccess().getConditionKeyword_4()); 

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__4__Impl"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__5"
    // InternalDSL.g:1645:1: rule__ReplaceAgentLabels__Group__5 : rule__ReplaceAgentLabels__Group__5__Impl rule__ReplaceAgentLabels__Group__6 ;
    public final void rule__ReplaceAgentLabels__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1649:1: ( rule__ReplaceAgentLabels__Group__5__Impl rule__ReplaceAgentLabels__Group__6 )
            // InternalDSL.g:1650:2: rule__ReplaceAgentLabels__Group__5__Impl rule__ReplaceAgentLabels__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__ReplaceAgentLabels__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__Group__6();

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__5"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__5__Impl"
    // InternalDSL.g:1657:1: rule__ReplaceAgentLabels__Group__5__Impl : ( ( rule__ReplaceAgentLabels__ConditionAssignment_5 ) ) ;
    public final void rule__ReplaceAgentLabels__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1661:1: ( ( ( rule__ReplaceAgentLabels__ConditionAssignment_5 ) ) )
            // InternalDSL.g:1662:1: ( ( rule__ReplaceAgentLabels__ConditionAssignment_5 ) )
            {
            // InternalDSL.g:1662:1: ( ( rule__ReplaceAgentLabels__ConditionAssignment_5 ) )
            // InternalDSL.g:1663:2: ( rule__ReplaceAgentLabels__ConditionAssignment_5 )
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getConditionAssignment_5()); 
            // InternalDSL.g:1664:2: ( rule__ReplaceAgentLabels__ConditionAssignment_5 )
            // InternalDSL.g:1664:3: rule__ReplaceAgentLabels__ConditionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__ConditionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getReplaceAgentLabelsAccess().getConditionAssignment_5()); 

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__5__Impl"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__6"
    // InternalDSL.g:1672:1: rule__ReplaceAgentLabels__Group__6 : rule__ReplaceAgentLabels__Group__6__Impl rule__ReplaceAgentLabels__Group__7 ;
    public final void rule__ReplaceAgentLabels__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1676:1: ( rule__ReplaceAgentLabels__Group__6__Impl rule__ReplaceAgentLabels__Group__7 )
            // InternalDSL.g:1677:2: rule__ReplaceAgentLabels__Group__6__Impl rule__ReplaceAgentLabels__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__ReplaceAgentLabels__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__Group__7();

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__6"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__6__Impl"
    // InternalDSL.g:1684:1: rule__ReplaceAgentLabels__Group__6__Impl : ( 'labels' ) ;
    public final void rule__ReplaceAgentLabels__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1688:1: ( ( 'labels' ) )
            // InternalDSL.g:1689:1: ( 'labels' )
            {
            // InternalDSL.g:1689:1: ( 'labels' )
            // InternalDSL.g:1690:2: 'labels'
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getLabelsKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getReplaceAgentLabelsAccess().getLabelsKeyword_6()); 

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__6__Impl"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__7"
    // InternalDSL.g:1699:1: rule__ReplaceAgentLabels__Group__7 : rule__ReplaceAgentLabels__Group__7__Impl rule__ReplaceAgentLabels__Group__8 ;
    public final void rule__ReplaceAgentLabels__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1703:1: ( rule__ReplaceAgentLabels__Group__7__Impl rule__ReplaceAgentLabels__Group__8 )
            // InternalDSL.g:1704:2: rule__ReplaceAgentLabels__Group__7__Impl rule__ReplaceAgentLabels__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__ReplaceAgentLabels__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__Group__8();

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__7"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__7__Impl"
    // InternalDSL.g:1711:1: rule__ReplaceAgentLabels__Group__7__Impl : ( ( rule__ReplaceAgentLabels__LabelsAssignment_7 ) ) ;
    public final void rule__ReplaceAgentLabels__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1715:1: ( ( ( rule__ReplaceAgentLabels__LabelsAssignment_7 ) ) )
            // InternalDSL.g:1716:1: ( ( rule__ReplaceAgentLabels__LabelsAssignment_7 ) )
            {
            // InternalDSL.g:1716:1: ( ( rule__ReplaceAgentLabels__LabelsAssignment_7 ) )
            // InternalDSL.g:1717:2: ( rule__ReplaceAgentLabels__LabelsAssignment_7 )
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getLabelsAssignment_7()); 
            // InternalDSL.g:1718:2: ( rule__ReplaceAgentLabels__LabelsAssignment_7 )
            // InternalDSL.g:1718:3: rule__ReplaceAgentLabels__LabelsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__LabelsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getReplaceAgentLabelsAccess().getLabelsAssignment_7()); 

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__7__Impl"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__8"
    // InternalDSL.g:1726:1: rule__ReplaceAgentLabels__Group__8 : rule__ReplaceAgentLabels__Group__8__Impl rule__ReplaceAgentLabels__Group__9 ;
    public final void rule__ReplaceAgentLabels__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1730:1: ( rule__ReplaceAgentLabels__Group__8__Impl rule__ReplaceAgentLabels__Group__9 )
            // InternalDSL.g:1731:2: rule__ReplaceAgentLabels__Group__8__Impl rule__ReplaceAgentLabels__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__ReplaceAgentLabels__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__Group__9();

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__8"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__8__Impl"
    // InternalDSL.g:1738:1: rule__ReplaceAgentLabels__Group__8__Impl : ( ( rule__ReplaceAgentLabels__Group_8__0 )* ) ;
    public final void rule__ReplaceAgentLabels__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1742:1: ( ( ( rule__ReplaceAgentLabels__Group_8__0 )* ) )
            // InternalDSL.g:1743:1: ( ( rule__ReplaceAgentLabels__Group_8__0 )* )
            {
            // InternalDSL.g:1743:1: ( ( rule__ReplaceAgentLabels__Group_8__0 )* )
            // InternalDSL.g:1744:2: ( rule__ReplaceAgentLabels__Group_8__0 )*
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getGroup_8()); 
            // InternalDSL.g:1745:2: ( rule__ReplaceAgentLabels__Group_8__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDSL.g:1745:3: rule__ReplaceAgentLabels__Group_8__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ReplaceAgentLabels__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getReplaceAgentLabelsAccess().getGroup_8()); 

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__8__Impl"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__9"
    // InternalDSL.g:1753:1: rule__ReplaceAgentLabels__Group__9 : rule__ReplaceAgentLabels__Group__9__Impl ;
    public final void rule__ReplaceAgentLabels__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1757:1: ( rule__ReplaceAgentLabels__Group__9__Impl )
            // InternalDSL.g:1758:2: rule__ReplaceAgentLabels__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__Group__9__Impl();

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__9"


    // $ANTLR start "rule__ReplaceAgentLabels__Group__9__Impl"
    // InternalDSL.g:1764:1: rule__ReplaceAgentLabels__Group__9__Impl : ( '}' ) ;
    public final void rule__ReplaceAgentLabels__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1768:1: ( ( '}' ) )
            // InternalDSL.g:1769:1: ( '}' )
            {
            // InternalDSL.g:1769:1: ( '}' )
            // InternalDSL.g:1770:2: '}'
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getReplaceAgentLabelsAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group__9__Impl"


    // $ANTLR start "rule__ReplaceAgentLabels__Group_8__0"
    // InternalDSL.g:1780:1: rule__ReplaceAgentLabels__Group_8__0 : rule__ReplaceAgentLabels__Group_8__0__Impl rule__ReplaceAgentLabels__Group_8__1 ;
    public final void rule__ReplaceAgentLabels__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1784:1: ( rule__ReplaceAgentLabels__Group_8__0__Impl rule__ReplaceAgentLabels__Group_8__1 )
            // InternalDSL.g:1785:2: rule__ReplaceAgentLabels__Group_8__0__Impl rule__ReplaceAgentLabels__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__ReplaceAgentLabels__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__Group_8__1();

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group_8__0"


    // $ANTLR start "rule__ReplaceAgentLabels__Group_8__0__Impl"
    // InternalDSL.g:1792:1: rule__ReplaceAgentLabels__Group_8__0__Impl : ( ',' ) ;
    public final void rule__ReplaceAgentLabels__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1796:1: ( ( ',' ) )
            // InternalDSL.g:1797:1: ( ',' )
            {
            // InternalDSL.g:1797:1: ( ',' )
            // InternalDSL.g:1798:2: ','
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getCommaKeyword_8_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getReplaceAgentLabelsAccess().getCommaKeyword_8_0()); 

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group_8__0__Impl"


    // $ANTLR start "rule__ReplaceAgentLabels__Group_8__1"
    // InternalDSL.g:1807:1: rule__ReplaceAgentLabels__Group_8__1 : rule__ReplaceAgentLabels__Group_8__1__Impl ;
    public final void rule__ReplaceAgentLabels__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1811:1: ( rule__ReplaceAgentLabels__Group_8__1__Impl )
            // InternalDSL.g:1812:2: rule__ReplaceAgentLabels__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__Group_8__1__Impl();

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group_8__1"


    // $ANTLR start "rule__ReplaceAgentLabels__Group_8__1__Impl"
    // InternalDSL.g:1818:1: rule__ReplaceAgentLabels__Group_8__1__Impl : ( ( rule__ReplaceAgentLabels__LabelsAssignment_8_1 ) ) ;
    public final void rule__ReplaceAgentLabels__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1822:1: ( ( ( rule__ReplaceAgentLabels__LabelsAssignment_8_1 ) ) )
            // InternalDSL.g:1823:1: ( ( rule__ReplaceAgentLabels__LabelsAssignment_8_1 ) )
            {
            // InternalDSL.g:1823:1: ( ( rule__ReplaceAgentLabels__LabelsAssignment_8_1 ) )
            // InternalDSL.g:1824:2: ( rule__ReplaceAgentLabels__LabelsAssignment_8_1 )
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getLabelsAssignment_8_1()); 
            // InternalDSL.g:1825:2: ( rule__ReplaceAgentLabels__LabelsAssignment_8_1 )
            // InternalDSL.g:1825:3: rule__ReplaceAgentLabels__LabelsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ReplaceAgentLabels__LabelsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getReplaceAgentLabelsAccess().getLabelsAssignment_8_1()); 

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
    // $ANTLR end "rule__ReplaceAgentLabels__Group_8__1__Impl"


    // $ANTLR start "rule__StringToStringMapEntry__Group__0"
    // InternalDSL.g:1834:1: rule__StringToStringMapEntry__Group__0 : rule__StringToStringMapEntry__Group__0__Impl rule__StringToStringMapEntry__Group__1 ;
    public final void rule__StringToStringMapEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1838:1: ( rule__StringToStringMapEntry__Group__0__Impl rule__StringToStringMapEntry__Group__1 )
            // InternalDSL.g:1839:2: rule__StringToStringMapEntry__Group__0__Impl rule__StringToStringMapEntry__Group__1
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
    // InternalDSL.g:1846:1: rule__StringToStringMapEntry__Group__0__Impl : ( 'StringToStringMapEntry' ) ;
    public final void rule__StringToStringMapEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1850:1: ( ( 'StringToStringMapEntry' ) )
            // InternalDSL.g:1851:1: ( 'StringToStringMapEntry' )
            {
            // InternalDSL.g:1851:1: ( 'StringToStringMapEntry' )
            // InternalDSL.g:1852:2: 'StringToStringMapEntry'
            {
             before(grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDSL.g:1861:1: rule__StringToStringMapEntry__Group__1 : rule__StringToStringMapEntry__Group__1__Impl rule__StringToStringMapEntry__Group__2 ;
    public final void rule__StringToStringMapEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1865:1: ( rule__StringToStringMapEntry__Group__1__Impl rule__StringToStringMapEntry__Group__2 )
            // InternalDSL.g:1866:2: rule__StringToStringMapEntry__Group__1__Impl rule__StringToStringMapEntry__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalDSL.g:1873:1: rule__StringToStringMapEntry__Group__1__Impl : ( '{' ) ;
    public final void rule__StringToStringMapEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1877:1: ( ( '{' ) )
            // InternalDSL.g:1878:1: ( '{' )
            {
            // InternalDSL.g:1878:1: ( '{' )
            // InternalDSL.g:1879:2: '{'
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
    // InternalDSL.g:1888:1: rule__StringToStringMapEntry__Group__2 : rule__StringToStringMapEntry__Group__2__Impl rule__StringToStringMapEntry__Group__3 ;
    public final void rule__StringToStringMapEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1892:1: ( rule__StringToStringMapEntry__Group__2__Impl rule__StringToStringMapEntry__Group__3 )
            // InternalDSL.g:1893:2: rule__StringToStringMapEntry__Group__2__Impl rule__StringToStringMapEntry__Group__3
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
    // InternalDSL.g:1900:1: rule__StringToStringMapEntry__Group__2__Impl : ( 'key' ) ;
    public final void rule__StringToStringMapEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1904:1: ( ( 'key' ) )
            // InternalDSL.g:1905:1: ( 'key' )
            {
            // InternalDSL.g:1905:1: ( 'key' )
            // InternalDSL.g:1906:2: 'key'
            {
             before(grammarAccess.getStringToStringMapEntryAccess().getKeyKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDSL.g:1915:1: rule__StringToStringMapEntry__Group__3 : rule__StringToStringMapEntry__Group__3__Impl rule__StringToStringMapEntry__Group__4 ;
    public final void rule__StringToStringMapEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1919:1: ( rule__StringToStringMapEntry__Group__3__Impl rule__StringToStringMapEntry__Group__4 )
            // InternalDSL.g:1920:2: rule__StringToStringMapEntry__Group__3__Impl rule__StringToStringMapEntry__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalDSL.g:1927:1: rule__StringToStringMapEntry__Group__3__Impl : ( ( rule__StringToStringMapEntry__KeyAssignment_3 ) ) ;
    public final void rule__StringToStringMapEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1931:1: ( ( ( rule__StringToStringMapEntry__KeyAssignment_3 ) ) )
            // InternalDSL.g:1932:1: ( ( rule__StringToStringMapEntry__KeyAssignment_3 ) )
            {
            // InternalDSL.g:1932:1: ( ( rule__StringToStringMapEntry__KeyAssignment_3 ) )
            // InternalDSL.g:1933:2: ( rule__StringToStringMapEntry__KeyAssignment_3 )
            {
             before(grammarAccess.getStringToStringMapEntryAccess().getKeyAssignment_3()); 
            // InternalDSL.g:1934:2: ( rule__StringToStringMapEntry__KeyAssignment_3 )
            // InternalDSL.g:1934:3: rule__StringToStringMapEntry__KeyAssignment_3
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
    // InternalDSL.g:1942:1: rule__StringToStringMapEntry__Group__4 : rule__StringToStringMapEntry__Group__4__Impl rule__StringToStringMapEntry__Group__5 ;
    public final void rule__StringToStringMapEntry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1946:1: ( rule__StringToStringMapEntry__Group__4__Impl rule__StringToStringMapEntry__Group__5 )
            // InternalDSL.g:1947:2: rule__StringToStringMapEntry__Group__4__Impl rule__StringToStringMapEntry__Group__5
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
    // InternalDSL.g:1954:1: rule__StringToStringMapEntry__Group__4__Impl : ( 'value' ) ;
    public final void rule__StringToStringMapEntry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1958:1: ( ( 'value' ) )
            // InternalDSL.g:1959:1: ( 'value' )
            {
            // InternalDSL.g:1959:1: ( 'value' )
            // InternalDSL.g:1960:2: 'value'
            {
             before(grammarAccess.getStringToStringMapEntryAccess().getValueKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDSL.g:1969:1: rule__StringToStringMapEntry__Group__5 : rule__StringToStringMapEntry__Group__5__Impl rule__StringToStringMapEntry__Group__6 ;
    public final void rule__StringToStringMapEntry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1973:1: ( rule__StringToStringMapEntry__Group__5__Impl rule__StringToStringMapEntry__Group__6 )
            // InternalDSL.g:1974:2: rule__StringToStringMapEntry__Group__5__Impl rule__StringToStringMapEntry__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalDSL.g:1981:1: rule__StringToStringMapEntry__Group__5__Impl : ( ( rule__StringToStringMapEntry__ValueAssignment_5 ) ) ;
    public final void rule__StringToStringMapEntry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1985:1: ( ( ( rule__StringToStringMapEntry__ValueAssignment_5 ) ) )
            // InternalDSL.g:1986:1: ( ( rule__StringToStringMapEntry__ValueAssignment_5 ) )
            {
            // InternalDSL.g:1986:1: ( ( rule__StringToStringMapEntry__ValueAssignment_5 ) )
            // InternalDSL.g:1987:2: ( rule__StringToStringMapEntry__ValueAssignment_5 )
            {
             before(grammarAccess.getStringToStringMapEntryAccess().getValueAssignment_5()); 
            // InternalDSL.g:1988:2: ( rule__StringToStringMapEntry__ValueAssignment_5 )
            // InternalDSL.g:1988:3: rule__StringToStringMapEntry__ValueAssignment_5
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
    // InternalDSL.g:1996:1: rule__StringToStringMapEntry__Group__6 : rule__StringToStringMapEntry__Group__6__Impl ;
    public final void rule__StringToStringMapEntry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2000:1: ( rule__StringToStringMapEntry__Group__6__Impl )
            // InternalDSL.g:2001:2: rule__StringToStringMapEntry__Group__6__Impl
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
    // InternalDSL.g:2007:1: rule__StringToStringMapEntry__Group__6__Impl : ( '}' ) ;
    public final void rule__StringToStringMapEntry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2011:1: ( ( '}' ) )
            // InternalDSL.g:2012:1: ( '}' )
            {
            // InternalDSL.g:2012:1: ( '}' )
            // InternalDSL.g:2013:2: '}'
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
    // InternalDSL.g:2023:1: rule__TransformationSet__TransformationsAssignment_3_2 : ( ruleTransformation ) ;
    public final void rule__TransformationSet__TransformationsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2027:1: ( ( ruleTransformation ) )
            // InternalDSL.g:2028:2: ( ruleTransformation )
            {
            // InternalDSL.g:2028:2: ( ruleTransformation )
            // InternalDSL.g:2029:3: ruleTransformation
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
    // InternalDSL.g:2038:1: rule__TransformationSet__TransformationsAssignment_3_3_1 : ( ruleTransformation ) ;
    public final void rule__TransformationSet__TransformationsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2042:1: ( ( ruleTransformation ) )
            // InternalDSL.g:2043:2: ( ruleTransformation )
            {
            // InternalDSL.g:2043:2: ( ruleTransformation )
            // InternalDSL.g:2044:3: ruleTransformation
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


    // $ANTLR start "rule__ChangePlugin__ModelAssignment_3"
    // InternalDSL.g:2053:1: rule__ChangePlugin__ModelAssignment_3 : ( ruleMODEL_NAMES ) ;
    public final void rule__ChangePlugin__ModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2057:1: ( ( ruleMODEL_NAMES ) )
            // InternalDSL.g:2058:2: ( ruleMODEL_NAMES )
            {
            // InternalDSL.g:2058:2: ( ruleMODEL_NAMES )
            // InternalDSL.g:2059:3: ruleMODEL_NAMES
            {
             before(grammarAccess.getChangePluginAccess().getModelMODEL_NAMESEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMODEL_NAMES();

            state._fsp--;

             after(grammarAccess.getChangePluginAccess().getModelMODEL_NAMESEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__ChangePlugin__ModelAssignment_3"


    // $ANTLR start "rule__ChangePlugin__VersionAssignment_5"
    // InternalDSL.g:2068:1: rule__ChangePlugin__VersionAssignment_5 : ( ruleEString ) ;
    public final void rule__ChangePlugin__VersionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2072:1: ( ( ruleEString ) )
            // InternalDSL.g:2073:2: ( ruleEString )
            {
            // InternalDSL.g:2073:2: ( ruleEString )
            // InternalDSL.g:2074:3: ruleEString
            {
             before(grammarAccess.getChangePluginAccess().getVersionEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChangePluginAccess().getVersionEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ChangePlugin__VersionAssignment_5"


    // $ANTLR start "rule__ChangePlugin__NameAssignment_7"
    // InternalDSL.g:2083:1: rule__ChangePlugin__NameAssignment_7 : ( ruleStringToStringMapEntry ) ;
    public final void rule__ChangePlugin__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2087:1: ( ( ruleStringToStringMapEntry ) )
            // InternalDSL.g:2088:2: ( ruleStringToStringMapEntry )
            {
            // InternalDSL.g:2088:2: ( ruleStringToStringMapEntry )
            // InternalDSL.g:2089:3: ruleStringToStringMapEntry
            {
             before(grammarAccess.getChangePluginAccess().getNameStringToStringMapEntryParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleStringToStringMapEntry();

            state._fsp--;

             after(grammarAccess.getChangePluginAccess().getNameStringToStringMapEntryParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ChangePlugin__NameAssignment_7"


    // $ANTLR start "rule__ChangePlugin__ArgsAssignment_8_2"
    // InternalDSL.g:2098:1: rule__ChangePlugin__ArgsAssignment_8_2 : ( ruleStringToStringMapEntry ) ;
    public final void rule__ChangePlugin__ArgsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2102:1: ( ( ruleStringToStringMapEntry ) )
            // InternalDSL.g:2103:2: ( ruleStringToStringMapEntry )
            {
            // InternalDSL.g:2103:2: ( ruleStringToStringMapEntry )
            // InternalDSL.g:2104:3: ruleStringToStringMapEntry
            {
             before(grammarAccess.getChangePluginAccess().getArgsStringToStringMapEntryParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringToStringMapEntry();

            state._fsp--;

             after(grammarAccess.getChangePluginAccess().getArgsStringToStringMapEntryParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__ChangePlugin__ArgsAssignment_8_2"


    // $ANTLR start "rule__ChangePlugin__ArgsAssignment_8_3_1"
    // InternalDSL.g:2113:1: rule__ChangePlugin__ArgsAssignment_8_3_1 : ( ruleStringToStringMapEntry ) ;
    public final void rule__ChangePlugin__ArgsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2117:1: ( ( ruleStringToStringMapEntry ) )
            // InternalDSL.g:2118:2: ( ruleStringToStringMapEntry )
            {
            // InternalDSL.g:2118:2: ( ruleStringToStringMapEntry )
            // InternalDSL.g:2119:3: ruleStringToStringMapEntry
            {
             before(grammarAccess.getChangePluginAccess().getArgsStringToStringMapEntryParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringToStringMapEntry();

            state._fsp--;

             after(grammarAccess.getChangePluginAccess().getArgsStringToStringMapEntryParserRuleCall_8_3_1_0()); 

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
    // $ANTLR end "rule__ChangePlugin__ArgsAssignment_8_3_1"


    // $ANTLR start "rule__ATLRefiningScript__ModelAssignment_3"
    // InternalDSL.g:2128:1: rule__ATLRefiningScript__ModelAssignment_3 : ( ruleMODEL_NAMES ) ;
    public final void rule__ATLRefiningScript__ModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2132:1: ( ( ruleMODEL_NAMES ) )
            // InternalDSL.g:2133:2: ( ruleMODEL_NAMES )
            {
            // InternalDSL.g:2133:2: ( ruleMODEL_NAMES )
            // InternalDSL.g:2134:3: ruleMODEL_NAMES
            {
             before(grammarAccess.getATLRefiningScriptAccess().getModelMODEL_NAMESEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMODEL_NAMES();

            state._fsp--;

             after(grammarAccess.getATLRefiningScriptAccess().getModelMODEL_NAMESEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__ATLRefiningScript__ModelAssignment_3"


    // $ANTLR start "rule__ATLRefiningScript__ScriptAssignment_5"
    // InternalDSL.g:2143:1: rule__ATLRefiningScript__ScriptAssignment_5 : ( ruleEString ) ;
    public final void rule__ATLRefiningScript__ScriptAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2147:1: ( ( ruleEString ) )
            // InternalDSL.g:2148:2: ( ruleEString )
            {
            // InternalDSL.g:2148:2: ( ruleEString )
            // InternalDSL.g:2149:3: ruleEString
            {
             before(grammarAccess.getATLRefiningScriptAccess().getScriptEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getATLRefiningScriptAccess().getScriptEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ATLRefiningScript__ScriptAssignment_5"


    // $ANTLR start "rule__ChangeAgentLabel__ModelAssignment_3"
    // InternalDSL.g:2158:1: rule__ChangeAgentLabel__ModelAssignment_3 : ( ruleMODEL_NAMES ) ;
    public final void rule__ChangeAgentLabel__ModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2162:1: ( ( ruleMODEL_NAMES ) )
            // InternalDSL.g:2163:2: ( ruleMODEL_NAMES )
            {
            // InternalDSL.g:2163:2: ( ruleMODEL_NAMES )
            // InternalDSL.g:2164:3: ruleMODEL_NAMES
            {
             before(grammarAccess.getChangeAgentLabelAccess().getModelMODEL_NAMESEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMODEL_NAMES();

            state._fsp--;

             after(grammarAccess.getChangeAgentLabelAccess().getModelMODEL_NAMESEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__ChangeAgentLabel__ModelAssignment_3"


    // $ANTLR start "rule__ChangeAgentLabel__NameAssignment_5"
    // InternalDSL.g:2173:1: rule__ChangeAgentLabel__NameAssignment_5 : ( ruleStringToStringMapEntry ) ;
    public final void rule__ChangeAgentLabel__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2177:1: ( ( ruleStringToStringMapEntry ) )
            // InternalDSL.g:2178:2: ( ruleStringToStringMapEntry )
            {
            // InternalDSL.g:2178:2: ( ruleStringToStringMapEntry )
            // InternalDSL.g:2179:3: ruleStringToStringMapEntry
            {
             before(grammarAccess.getChangeAgentLabelAccess().getNameStringToStringMapEntryParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStringToStringMapEntry();

            state._fsp--;

             after(grammarAccess.getChangeAgentLabelAccess().getNameStringToStringMapEntryParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ChangeAgentLabel__NameAssignment_5"


    // $ANTLR start "rule__ReplaceAgentLabels__ModelAssignment_3"
    // InternalDSL.g:2188:1: rule__ReplaceAgentLabels__ModelAssignment_3 : ( ruleMODEL_NAMES ) ;
    public final void rule__ReplaceAgentLabels__ModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2192:1: ( ( ruleMODEL_NAMES ) )
            // InternalDSL.g:2193:2: ( ruleMODEL_NAMES )
            {
            // InternalDSL.g:2193:2: ( ruleMODEL_NAMES )
            // InternalDSL.g:2194:3: ruleMODEL_NAMES
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getModelMODEL_NAMESEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMODEL_NAMES();

            state._fsp--;

             after(grammarAccess.getReplaceAgentLabelsAccess().getModelMODEL_NAMESEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__ReplaceAgentLabels__ModelAssignment_3"


    // $ANTLR start "rule__ReplaceAgentLabels__ConditionAssignment_5"
    // InternalDSL.g:2203:1: rule__ReplaceAgentLabels__ConditionAssignment_5 : ( ruleEString ) ;
    public final void rule__ReplaceAgentLabels__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2207:1: ( ( ruleEString ) )
            // InternalDSL.g:2208:2: ( ruleEString )
            {
            // InternalDSL.g:2208:2: ( ruleEString )
            // InternalDSL.g:2209:3: ruleEString
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getConditionEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReplaceAgentLabelsAccess().getConditionEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ReplaceAgentLabels__ConditionAssignment_5"


    // $ANTLR start "rule__ReplaceAgentLabels__LabelsAssignment_7"
    // InternalDSL.g:2218:1: rule__ReplaceAgentLabels__LabelsAssignment_7 : ( ruleEString ) ;
    public final void rule__ReplaceAgentLabels__LabelsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2222:1: ( ( ruleEString ) )
            // InternalDSL.g:2223:2: ( ruleEString )
            {
            // InternalDSL.g:2223:2: ( ruleEString )
            // InternalDSL.g:2224:3: ruleEString
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getLabelsEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReplaceAgentLabelsAccess().getLabelsEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ReplaceAgentLabels__LabelsAssignment_7"


    // $ANTLR start "rule__ReplaceAgentLabels__LabelsAssignment_8_1"
    // InternalDSL.g:2233:1: rule__ReplaceAgentLabels__LabelsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__ReplaceAgentLabels__LabelsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2237:1: ( ( ruleEString ) )
            // InternalDSL.g:2238:2: ( ruleEString )
            {
            // InternalDSL.g:2238:2: ( ruleEString )
            // InternalDSL.g:2239:3: ruleEString
            {
             before(grammarAccess.getReplaceAgentLabelsAccess().getLabelsEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReplaceAgentLabelsAccess().getLabelsEStringParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__ReplaceAgentLabels__LabelsAssignment_8_1"


    // $ANTLR start "rule__StringToStringMapEntry__KeyAssignment_3"
    // InternalDSL.g:2248:1: rule__StringToStringMapEntry__KeyAssignment_3 : ( ruleEString ) ;
    public final void rule__StringToStringMapEntry__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2252:1: ( ( ruleEString ) )
            // InternalDSL.g:2253:2: ( ruleEString )
            {
            // InternalDSL.g:2253:2: ( ruleEString )
            // InternalDSL.g:2254:3: ruleEString
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
    // InternalDSL.g:2263:1: rule__StringToStringMapEntry__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__StringToStringMapEntry__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2267:1: ( ( ruleEString ) )
            // InternalDSL.g:2268:2: ( ruleEString )
            {
            // InternalDSL.g:2268:2: ( ruleEString )
            // InternalDSL.g:2269:3: ruleEString
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000D080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});

}