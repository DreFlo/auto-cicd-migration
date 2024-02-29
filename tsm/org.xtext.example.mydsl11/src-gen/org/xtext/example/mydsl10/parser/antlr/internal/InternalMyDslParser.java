package org.xtext.example.mydsl10.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl10.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Allow_faillure", "Else", "FailFast", "End", "Strategy", "Outputs", "RunsOn", "Secrets", "Uses_1", "If_1", "Matrix", "Path", "Run_2", "Needs", "Run_3", "Run_4", "Run_5", "Steps", "False", "Jobs", "Run_1", "Uses", "With", "Env", "Run", "True", "If", "On", "HyphenMinusSpace", "RULE_TRIGGER_WORDS", "RULE_NAME", "RULE_TRIGGERS", "RULE_HTTP", "RULE_CHARACTERS", "RULE_INT", "RULE_ALPHANUMERICSTRING", "RULE_KEY", "RULE_NEWLINE", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_BEGIN=42;
    public static final int Secrets=11;
    public static final int Needs=17;
    public static final int True=29;
    public static final int False=22;
    public static final int RULE_ALPHANUMERICSTRING=39;
    public static final int If_1=13;
    public static final int Uses_1=12;
    public static final int Matrix=14;
    public static final int HyphenMinusSpace=32;
    public static final int RULE_ID=44;
    public static final int FailFast=6;
    public static final int RULE_INT=38;
    public static final int Outputs=9;
    public static final int RULE_ML_COMMENT=46;
    public static final int End=7;
    public static final int RULE_CHARACTERS=37;
    public static final int If=30;
    public static final int Steps=21;
    public static final int RULE_END=43;
    public static final int Uses=25;
    public static final int RULE_NEWLINE=41;
    public static final int RULE_KEY=40;
    public static final int RULE_NAME=34;
    public static final int RULE_STRING=45;
    public static final int Env=27;
    public static final int RULE_TRIGGER_WORDS=33;
    public static final int With=26;
    public static final int RULE_HTTP=36;
    public static final int RULE_SL_COMMENT=47;
    public static final int Jobs=23;
    public static final int RULE_TRIGGERS=35;
    public static final int Run_4=19;
    public static final int Run_5=20;
    public static final int EOF=-1;
    public static final int Path=15;
    public static final int Run_2=16;
    public static final int Run_3=18;
    public static final int RULE_WS=48;
    public static final int Run_1=24;
    public static final int Run=28;
    public static final int RULE_ANY_OTHER=49;
    public static final int Allow_faillure=4;
    public static final int RunsOn=10;
    public static final int Else=5;
    public static final int Strategy=8;
    public static final int On=31;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDslParser.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Pipeline";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePipeline"
    // InternalMyDslParser.g:57:1: entryRulePipeline returns [EObject current=null] : iv_rulePipeline= rulePipeline EOF ;
    public final EObject entryRulePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipeline = null;


        try {
            // InternalMyDslParser.g:57:49: (iv_rulePipeline= rulePipeline EOF )
            // InternalMyDslParser.g:58:2: iv_rulePipeline= rulePipeline EOF
            {
             newCompositeNode(grammarAccess.getPipelineRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePipeline=rulePipeline();

            state._fsp--;

             current =iv_rulePipeline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePipeline"


    // $ANTLR start "rulePipeline"
    // InternalMyDslParser.g:64:1: rulePipeline returns [EObject current=null] : ( () ( (this_NAME_1= RULE_NAME ( (lv_Name0_2_0= ruleEString ) ) (this_NEWLINE_3= RULE_NEWLINE )? ) | (otherlv_4= On ( (this_BEGIN_5= RULE_BEGIN ( (lv_when_6_0= ruleWhen ) )+ this_END_7= RULE_END ) | ( (lv_Trigger_8_0= ruleEString ) ) ) (this_NEWLINE_9= RULE_NEWLINE )? ) | (otherlv_10= Env (this_BEGIN_11= RULE_BEGIN ( (lv_pipeline_envirnonment_12_0= ruleEnvironment ) )+ this_END_13= RULE_END ) (this_NEWLINE_14= RULE_NEWLINE )? ) | (otherlv_15= Jobs (this_BEGIN_16= RULE_BEGIN ( (lv_job_17_0= ruleJobIfThenElse ) )+ this_END_18= RULE_END ) (this_NEWLINE_19= RULE_NEWLINE )? ) | ( ( (lv_pipeline_envirnonment_20_0= ruleEnvironment ) ) (this_NEWLINE_21= RULE_NEWLINE )? ) )* ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

        Token this_NAME_1=null;
        Token this_NEWLINE_3=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        Token this_NEWLINE_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        Token this_NEWLINE_14=null;
        Token otherlv_15=null;
        Token this_BEGIN_16=null;
        Token this_END_18=null;
        Token this_NEWLINE_19=null;
        Token this_NEWLINE_21=null;
        AntlrDatatypeRuleToken lv_Name0_2_0 = null;

        EObject lv_when_6_0 = null;

        AntlrDatatypeRuleToken lv_Trigger_8_0 = null;

        EObject lv_pipeline_envirnonment_12_0 = null;

        EObject lv_job_17_0 = null;

        EObject lv_pipeline_envirnonment_20_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:70:2: ( ( () ( (this_NAME_1= RULE_NAME ( (lv_Name0_2_0= ruleEString ) ) (this_NEWLINE_3= RULE_NEWLINE )? ) | (otherlv_4= On ( (this_BEGIN_5= RULE_BEGIN ( (lv_when_6_0= ruleWhen ) )+ this_END_7= RULE_END ) | ( (lv_Trigger_8_0= ruleEString ) ) ) (this_NEWLINE_9= RULE_NEWLINE )? ) | (otherlv_10= Env (this_BEGIN_11= RULE_BEGIN ( (lv_pipeline_envirnonment_12_0= ruleEnvironment ) )+ this_END_13= RULE_END ) (this_NEWLINE_14= RULE_NEWLINE )? ) | (otherlv_15= Jobs (this_BEGIN_16= RULE_BEGIN ( (lv_job_17_0= ruleJobIfThenElse ) )+ this_END_18= RULE_END ) (this_NEWLINE_19= RULE_NEWLINE )? ) | ( ( (lv_pipeline_envirnonment_20_0= ruleEnvironment ) ) (this_NEWLINE_21= RULE_NEWLINE )? ) )* ) )
            // InternalMyDslParser.g:71:2: ( () ( (this_NAME_1= RULE_NAME ( (lv_Name0_2_0= ruleEString ) ) (this_NEWLINE_3= RULE_NEWLINE )? ) | (otherlv_4= On ( (this_BEGIN_5= RULE_BEGIN ( (lv_when_6_0= ruleWhen ) )+ this_END_7= RULE_END ) | ( (lv_Trigger_8_0= ruleEString ) ) ) (this_NEWLINE_9= RULE_NEWLINE )? ) | (otherlv_10= Env (this_BEGIN_11= RULE_BEGIN ( (lv_pipeline_envirnonment_12_0= ruleEnvironment ) )+ this_END_13= RULE_END ) (this_NEWLINE_14= RULE_NEWLINE )? ) | (otherlv_15= Jobs (this_BEGIN_16= RULE_BEGIN ( (lv_job_17_0= ruleJobIfThenElse ) )+ this_END_18= RULE_END ) (this_NEWLINE_19= RULE_NEWLINE )? ) | ( ( (lv_pipeline_envirnonment_20_0= ruleEnvironment ) ) (this_NEWLINE_21= RULE_NEWLINE )? ) )* )
            {
            // InternalMyDslParser.g:71:2: ( () ( (this_NAME_1= RULE_NAME ( (lv_Name0_2_0= ruleEString ) ) (this_NEWLINE_3= RULE_NEWLINE )? ) | (otherlv_4= On ( (this_BEGIN_5= RULE_BEGIN ( (lv_when_6_0= ruleWhen ) )+ this_END_7= RULE_END ) | ( (lv_Trigger_8_0= ruleEString ) ) ) (this_NEWLINE_9= RULE_NEWLINE )? ) | (otherlv_10= Env (this_BEGIN_11= RULE_BEGIN ( (lv_pipeline_envirnonment_12_0= ruleEnvironment ) )+ this_END_13= RULE_END ) (this_NEWLINE_14= RULE_NEWLINE )? ) | (otherlv_15= Jobs (this_BEGIN_16= RULE_BEGIN ( (lv_job_17_0= ruleJobIfThenElse ) )+ this_END_18= RULE_END ) (this_NEWLINE_19= RULE_NEWLINE )? ) | ( ( (lv_pipeline_envirnonment_20_0= ruleEnvironment ) ) (this_NEWLINE_21= RULE_NEWLINE )? ) )* )
            // InternalMyDslParser.g:72:3: () ( (this_NAME_1= RULE_NAME ( (lv_Name0_2_0= ruleEString ) ) (this_NEWLINE_3= RULE_NEWLINE )? ) | (otherlv_4= On ( (this_BEGIN_5= RULE_BEGIN ( (lv_when_6_0= ruleWhen ) )+ this_END_7= RULE_END ) | ( (lv_Trigger_8_0= ruleEString ) ) ) (this_NEWLINE_9= RULE_NEWLINE )? ) | (otherlv_10= Env (this_BEGIN_11= RULE_BEGIN ( (lv_pipeline_envirnonment_12_0= ruleEnvironment ) )+ this_END_13= RULE_END ) (this_NEWLINE_14= RULE_NEWLINE )? ) | (otherlv_15= Jobs (this_BEGIN_16= RULE_BEGIN ( (lv_job_17_0= ruleJobIfThenElse ) )+ this_END_18= RULE_END ) (this_NEWLINE_19= RULE_NEWLINE )? ) | ( ( (lv_pipeline_envirnonment_20_0= ruleEnvironment ) ) (this_NEWLINE_21= RULE_NEWLINE )? ) )*
            {
            // InternalMyDslParser.g:72:3: ()
            // InternalMyDslParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPipelineAccess().getPipelineAction_0(),
            					current);
            			

            }

            // InternalMyDslParser.g:79:3: ( (this_NAME_1= RULE_NAME ( (lv_Name0_2_0= ruleEString ) ) (this_NEWLINE_3= RULE_NEWLINE )? ) | (otherlv_4= On ( (this_BEGIN_5= RULE_BEGIN ( (lv_when_6_0= ruleWhen ) )+ this_END_7= RULE_END ) | ( (lv_Trigger_8_0= ruleEString ) ) ) (this_NEWLINE_9= RULE_NEWLINE )? ) | (otherlv_10= Env (this_BEGIN_11= RULE_BEGIN ( (lv_pipeline_envirnonment_12_0= ruleEnvironment ) )+ this_END_13= RULE_END ) (this_NEWLINE_14= RULE_NEWLINE )? ) | (otherlv_15= Jobs (this_BEGIN_16= RULE_BEGIN ( (lv_job_17_0= ruleJobIfThenElse ) )+ this_END_18= RULE_END ) (this_NEWLINE_19= RULE_NEWLINE )? ) | ( ( (lv_pipeline_envirnonment_20_0= ruleEnvironment ) ) (this_NEWLINE_21= RULE_NEWLINE )? ) )*
            loop10:
            do {
                int alt10=6;
                switch ( input.LA(1) ) {
                case RULE_NAME:
                    {
                    alt10=1;
                    }
                    break;
                case On:
                    {
                    alt10=2;
                    }
                    break;
                case Env:
                    {
                    alt10=3;
                    }
                    break;
                case Jobs:
                    {
                    alt10=4;
                    }
                    break;
                case Path:
                case RULE_TRIGGERS:
                case RULE_KEY:
                    {
                    alt10=5;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // InternalMyDslParser.g:80:4: (this_NAME_1= RULE_NAME ( (lv_Name0_2_0= ruleEString ) ) (this_NEWLINE_3= RULE_NEWLINE )? )
            	    {
            	    // InternalMyDslParser.g:80:4: (this_NAME_1= RULE_NAME ( (lv_Name0_2_0= ruleEString ) ) (this_NEWLINE_3= RULE_NEWLINE )? )
            	    // InternalMyDslParser.g:81:5: this_NAME_1= RULE_NAME ( (lv_Name0_2_0= ruleEString ) ) (this_NEWLINE_3= RULE_NEWLINE )?
            	    {
            	    this_NAME_1=(Token)match(input,RULE_NAME,FOLLOW_3); 

            	    					newLeafNode(this_NAME_1, grammarAccess.getPipelineAccess().getNAMETerminalRuleCall_1_0_0());
            	    				
            	    // InternalMyDslParser.g:85:5: ( (lv_Name0_2_0= ruleEString ) )
            	    // InternalMyDslParser.g:86:6: (lv_Name0_2_0= ruleEString )
            	    {
            	    // InternalMyDslParser.g:86:6: (lv_Name0_2_0= ruleEString )
            	    // InternalMyDslParser.g:87:7: lv_Name0_2_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getPipelineAccess().getName0EStringParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_4);
            	    lv_Name0_2_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    							}
            	    							set(
            	    								current,
            	    								"Name0",
            	    								lv_Name0_2_0,
            	    								"org.xtext.example.mydsl10.MyDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDslParser.g:104:5: (this_NEWLINE_3= RULE_NEWLINE )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==RULE_NEWLINE) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalMyDslParser.g:105:6: this_NEWLINE_3= RULE_NEWLINE
            	            {
            	            this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_4); 

            	            						newLeafNode(this_NEWLINE_3, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_1_0_2());
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDslParser.g:112:4: (otherlv_4= On ( (this_BEGIN_5= RULE_BEGIN ( (lv_when_6_0= ruleWhen ) )+ this_END_7= RULE_END ) | ( (lv_Trigger_8_0= ruleEString ) ) ) (this_NEWLINE_9= RULE_NEWLINE )? )
            	    {
            	    // InternalMyDslParser.g:112:4: (otherlv_4= On ( (this_BEGIN_5= RULE_BEGIN ( (lv_when_6_0= ruleWhen ) )+ this_END_7= RULE_END ) | ( (lv_Trigger_8_0= ruleEString ) ) ) (this_NEWLINE_9= RULE_NEWLINE )? )
            	    // InternalMyDslParser.g:113:5: otherlv_4= On ( (this_BEGIN_5= RULE_BEGIN ( (lv_when_6_0= ruleWhen ) )+ this_END_7= RULE_END ) | ( (lv_Trigger_8_0= ruleEString ) ) ) (this_NEWLINE_9= RULE_NEWLINE )?
            	    {
            	    otherlv_4=(Token)match(input,On,FOLLOW_5); 

            	    					newLeafNode(otherlv_4, grammarAccess.getPipelineAccess().getOnKeyword_1_1_0());
            	    				
            	    // InternalMyDslParser.g:117:5: ( (this_BEGIN_5= RULE_BEGIN ( (lv_when_6_0= ruleWhen ) )+ this_END_7= RULE_END ) | ( (lv_Trigger_8_0= ruleEString ) ) )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_BEGIN) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==False||LA3_0==True||LA3_0==RULE_TRIGGER_WORDS||LA3_0==RULE_ALPHANUMERICSTRING||LA3_0==RULE_STRING) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalMyDslParser.g:118:6: (this_BEGIN_5= RULE_BEGIN ( (lv_when_6_0= ruleWhen ) )+ this_END_7= RULE_END )
            	            {
            	            // InternalMyDslParser.g:118:6: (this_BEGIN_5= RULE_BEGIN ( (lv_when_6_0= ruleWhen ) )+ this_END_7= RULE_END )
            	            // InternalMyDslParser.g:119:7: this_BEGIN_5= RULE_BEGIN ( (lv_when_6_0= ruleWhen ) )+ this_END_7= RULE_END
            	            {
            	            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            	            							newLeafNode(this_BEGIN_5, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_1_1_1_0_0());
            	            						
            	            // InternalMyDslParser.g:123:7: ( (lv_when_6_0= ruleWhen ) )+
            	            int cnt2=0;
            	            loop2:
            	            do {
            	                int alt2=2;
            	                int LA2_0 = input.LA(1);

            	                if ( (LA2_0==RULE_TRIGGERS) ) {
            	                    alt2=1;
            	                }


            	                switch (alt2) {
            	            	case 1 :
            	            	    // InternalMyDslParser.g:124:8: (lv_when_6_0= ruleWhen )
            	            	    {
            	            	    // InternalMyDslParser.g:124:8: (lv_when_6_0= ruleWhen )
            	            	    // InternalMyDslParser.g:125:9: lv_when_6_0= ruleWhen
            	            	    {

            	            	    									newCompositeNode(grammarAccess.getPipelineAccess().getWhenWhenParserRuleCall_1_1_1_0_1_0());
            	            	    								
            	            	    pushFollow(FOLLOW_7);
            	            	    lv_when_6_0=ruleWhen();

            	            	    state._fsp--;


            	            	    									if (current==null) {
            	            	    										current = createModelElementForParent(grammarAccess.getPipelineRule());
            	            	    									}
            	            	    									add(
            	            	    										current,
            	            	    										"when",
            	            	    										lv_when_6_0,
            	            	    										"org.xtext.example.mydsl10.MyDsl.When");
            	            	    									afterParserOrEnumRuleCall();
            	            	    								

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt2 >= 1 ) break loop2;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(2, input);
            	                        throw eee;
            	                }
            	                cnt2++;
            	            } while (true);

            	            this_END_7=(Token)match(input,RULE_END,FOLLOW_4); 

            	            							newLeafNode(this_END_7, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_1_1_1_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDslParser.g:148:6: ( (lv_Trigger_8_0= ruleEString ) )
            	            {
            	            // InternalMyDslParser.g:148:6: ( (lv_Trigger_8_0= ruleEString ) )
            	            // InternalMyDslParser.g:149:7: (lv_Trigger_8_0= ruleEString )
            	            {
            	            // InternalMyDslParser.g:149:7: (lv_Trigger_8_0= ruleEString )
            	            // InternalMyDslParser.g:150:8: lv_Trigger_8_0= ruleEString
            	            {

            	            								newCompositeNode(grammarAccess.getPipelineAccess().getTriggerEStringParserRuleCall_1_1_1_1_0());
            	            							
            	            pushFollow(FOLLOW_4);
            	            lv_Trigger_8_0=ruleEString();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getPipelineRule());
            	            								}
            	            								set(
            	            									current,
            	            									"Trigger",
            	            									lv_Trigger_8_0,
            	            									"org.xtext.example.mydsl10.MyDsl.EString");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMyDslParser.g:168:5: (this_NEWLINE_9= RULE_NEWLINE )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==RULE_NEWLINE) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMyDslParser.g:169:6: this_NEWLINE_9= RULE_NEWLINE
            	            {
            	            this_NEWLINE_9=(Token)match(input,RULE_NEWLINE,FOLLOW_4); 

            	            						newLeafNode(this_NEWLINE_9, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_1_1_2());
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDslParser.g:176:4: (otherlv_10= Env (this_BEGIN_11= RULE_BEGIN ( (lv_pipeline_envirnonment_12_0= ruleEnvironment ) )+ this_END_13= RULE_END ) (this_NEWLINE_14= RULE_NEWLINE )? )
            	    {
            	    // InternalMyDslParser.g:176:4: (otherlv_10= Env (this_BEGIN_11= RULE_BEGIN ( (lv_pipeline_envirnonment_12_0= ruleEnvironment ) )+ this_END_13= RULE_END ) (this_NEWLINE_14= RULE_NEWLINE )? )
            	    // InternalMyDslParser.g:177:5: otherlv_10= Env (this_BEGIN_11= RULE_BEGIN ( (lv_pipeline_envirnonment_12_0= ruleEnvironment ) )+ this_END_13= RULE_END ) (this_NEWLINE_14= RULE_NEWLINE )?
            	    {
            	    otherlv_10=(Token)match(input,Env,FOLLOW_8); 

            	    					newLeafNode(otherlv_10, grammarAccess.getPipelineAccess().getEnvKeyword_1_2_0());
            	    				
            	    // InternalMyDslParser.g:181:5: (this_BEGIN_11= RULE_BEGIN ( (lv_pipeline_envirnonment_12_0= ruleEnvironment ) )+ this_END_13= RULE_END )
            	    // InternalMyDslParser.g:182:6: this_BEGIN_11= RULE_BEGIN ( (lv_pipeline_envirnonment_12_0= ruleEnvironment ) )+ this_END_13= RULE_END
            	    {
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_9); 

            	    						newLeafNode(this_BEGIN_11, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_1_2_1_0());
            	    					
            	    // InternalMyDslParser.g:186:6: ( (lv_pipeline_envirnonment_12_0= ruleEnvironment ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==Path||LA5_0==RULE_TRIGGERS||LA5_0==RULE_KEY) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMyDslParser.g:187:7: (lv_pipeline_envirnonment_12_0= ruleEnvironment )
            	    	    {
            	    	    // InternalMyDslParser.g:187:7: (lv_pipeline_envirnonment_12_0= ruleEnvironment )
            	    	    // InternalMyDslParser.g:188:8: lv_pipeline_envirnonment_12_0= ruleEnvironment
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getPipelineAccess().getPipeline_envirnonmentEnvironmentParserRuleCall_1_2_1_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_pipeline_envirnonment_12_0=ruleEnvironment();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"pipeline_envirnonment",
            	    	    									lv_pipeline_envirnonment_12_0,
            	    	    									"org.xtext.example.mydsl10.MyDsl.Environment");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    this_END_13=(Token)match(input,RULE_END,FOLLOW_4); 

            	    						newLeafNode(this_END_13, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_1_2_1_2());
            	    					

            	    }

            	    // InternalMyDslParser.g:210:5: (this_NEWLINE_14= RULE_NEWLINE )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_NEWLINE) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalMyDslParser.g:211:6: this_NEWLINE_14= RULE_NEWLINE
            	            {
            	            this_NEWLINE_14=(Token)match(input,RULE_NEWLINE,FOLLOW_4); 

            	            						newLeafNode(this_NEWLINE_14, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_1_2_2());
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDslParser.g:218:4: (otherlv_15= Jobs (this_BEGIN_16= RULE_BEGIN ( (lv_job_17_0= ruleJobIfThenElse ) )+ this_END_18= RULE_END ) (this_NEWLINE_19= RULE_NEWLINE )? )
            	    {
            	    // InternalMyDslParser.g:218:4: (otherlv_15= Jobs (this_BEGIN_16= RULE_BEGIN ( (lv_job_17_0= ruleJobIfThenElse ) )+ this_END_18= RULE_END ) (this_NEWLINE_19= RULE_NEWLINE )? )
            	    // InternalMyDslParser.g:219:5: otherlv_15= Jobs (this_BEGIN_16= RULE_BEGIN ( (lv_job_17_0= ruleJobIfThenElse ) )+ this_END_18= RULE_END ) (this_NEWLINE_19= RULE_NEWLINE )?
            	    {
            	    otherlv_15=(Token)match(input,Jobs,FOLLOW_8); 

            	    					newLeafNode(otherlv_15, grammarAccess.getPipelineAccess().getJobsKeyword_1_3_0());
            	    				
            	    // InternalMyDslParser.g:223:5: (this_BEGIN_16= RULE_BEGIN ( (lv_job_17_0= ruleJobIfThenElse ) )+ this_END_18= RULE_END )
            	    // InternalMyDslParser.g:224:6: this_BEGIN_16= RULE_BEGIN ( (lv_job_17_0= ruleJobIfThenElse ) )+ this_END_18= RULE_END
            	    {
            	    this_BEGIN_16=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            	    						newLeafNode(this_BEGIN_16, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_1_3_1_0());
            	    					
            	    // InternalMyDslParser.g:228:6: ( (lv_job_17_0= ruleJobIfThenElse ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==Allow_faillure||LA7_0==If_1||LA7_0==If||LA7_0==RULE_KEY) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalMyDslParser.g:229:7: (lv_job_17_0= ruleJobIfThenElse )
            	    	    {
            	    	    // InternalMyDslParser.g:229:7: (lv_job_17_0= ruleJobIfThenElse )
            	    	    // InternalMyDslParser.g:230:8: lv_job_17_0= ruleJobIfThenElse
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getPipelineAccess().getJobJobIfThenElseParserRuleCall_1_3_1_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_job_17_0=ruleJobIfThenElse();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"job",
            	    	    									lv_job_17_0,
            	    	    									"org.xtext.example.mydsl10.MyDsl.JobIfThenElse");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt7 >= 1 ) break loop7;
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);

            	    this_END_18=(Token)match(input,RULE_END,FOLLOW_4); 

            	    						newLeafNode(this_END_18, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_1_3_1_2());
            	    					

            	    }

            	    // InternalMyDslParser.g:252:5: (this_NEWLINE_19= RULE_NEWLINE )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==RULE_NEWLINE) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalMyDslParser.g:253:6: this_NEWLINE_19= RULE_NEWLINE
            	            {
            	            this_NEWLINE_19=(Token)match(input,RULE_NEWLINE,FOLLOW_4); 

            	            						newLeafNode(this_NEWLINE_19, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_1_3_2());
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDslParser.g:260:4: ( ( (lv_pipeline_envirnonment_20_0= ruleEnvironment ) ) (this_NEWLINE_21= RULE_NEWLINE )? )
            	    {
            	    // InternalMyDslParser.g:260:4: ( ( (lv_pipeline_envirnonment_20_0= ruleEnvironment ) ) (this_NEWLINE_21= RULE_NEWLINE )? )
            	    // InternalMyDslParser.g:261:5: ( (lv_pipeline_envirnonment_20_0= ruleEnvironment ) ) (this_NEWLINE_21= RULE_NEWLINE )?
            	    {
            	    // InternalMyDslParser.g:261:5: ( (lv_pipeline_envirnonment_20_0= ruleEnvironment ) )
            	    // InternalMyDslParser.g:262:6: (lv_pipeline_envirnonment_20_0= ruleEnvironment )
            	    {
            	    // InternalMyDslParser.g:262:6: (lv_pipeline_envirnonment_20_0= ruleEnvironment )
            	    // InternalMyDslParser.g:263:7: lv_pipeline_envirnonment_20_0= ruleEnvironment
            	    {

            	    							newCompositeNode(grammarAccess.getPipelineAccess().getPipeline_envirnonmentEnvironmentParserRuleCall_1_4_0_0());
            	    						
            	    pushFollow(FOLLOW_4);
            	    lv_pipeline_envirnonment_20_0=ruleEnvironment();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    							}
            	    							add(
            	    								current,
            	    								"pipeline_envirnonment",
            	    								lv_pipeline_envirnonment_20_0,
            	    								"org.xtext.example.mydsl10.MyDsl.Environment");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDslParser.g:280:5: (this_NEWLINE_21= RULE_NEWLINE )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_NEWLINE) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalMyDslParser.g:281:6: this_NEWLINE_21= RULE_NEWLINE
            	            {
            	            this_NEWLINE_21=(Token)match(input,RULE_NEWLINE,FOLLOW_4); 

            	            						newLeafNode(this_NEWLINE_21, grammarAccess.getPipelineAccess().getNEWLINETerminalRuleCall_1_4_1());
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePipeline"


    // $ANTLR start "entryRuleWhen"
    // InternalMyDslParser.g:292:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalMyDslParser.g:292:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalMyDslParser.g:293:2: iv_ruleWhen= ruleWhen EOF
            {
             newCompositeNode(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen=ruleWhen();

            state._fsp--;

             current =iv_ruleWhen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalMyDslParser.g:299:1: ruleWhen returns [EObject current=null] : ( ( (lv_Trigger_0_0= RULE_TRIGGERS ) ) (this_BEGIN_1= RULE_BEGIN ( (lv_environment_when_2_0= ruleEnvironment ) )+ this_END_3= RULE_END )? ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token lv_Trigger_0_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_environment_when_2_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:305:2: ( ( ( (lv_Trigger_0_0= RULE_TRIGGERS ) ) (this_BEGIN_1= RULE_BEGIN ( (lv_environment_when_2_0= ruleEnvironment ) )+ this_END_3= RULE_END )? ) )
            // InternalMyDslParser.g:306:2: ( ( (lv_Trigger_0_0= RULE_TRIGGERS ) ) (this_BEGIN_1= RULE_BEGIN ( (lv_environment_when_2_0= ruleEnvironment ) )+ this_END_3= RULE_END )? )
            {
            // InternalMyDslParser.g:306:2: ( ( (lv_Trigger_0_0= RULE_TRIGGERS ) ) (this_BEGIN_1= RULE_BEGIN ( (lv_environment_when_2_0= ruleEnvironment ) )+ this_END_3= RULE_END )? )
            // InternalMyDslParser.g:307:3: ( (lv_Trigger_0_0= RULE_TRIGGERS ) ) (this_BEGIN_1= RULE_BEGIN ( (lv_environment_when_2_0= ruleEnvironment ) )+ this_END_3= RULE_END )?
            {
            // InternalMyDslParser.g:307:3: ( (lv_Trigger_0_0= RULE_TRIGGERS ) )
            // InternalMyDslParser.g:308:4: (lv_Trigger_0_0= RULE_TRIGGERS )
            {
            // InternalMyDslParser.g:308:4: (lv_Trigger_0_0= RULE_TRIGGERS )
            // InternalMyDslParser.g:309:5: lv_Trigger_0_0= RULE_TRIGGERS
            {
            lv_Trigger_0_0=(Token)match(input,RULE_TRIGGERS,FOLLOW_12); 

            					newLeafNode(lv_Trigger_0_0, grammarAccess.getWhenAccess().getTriggerTRIGGERSTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Trigger",
            						lv_Trigger_0_0,
            						"org.xtext.example.mydsl10.MyDsl.TRIGGERS");
            				

            }


            }

            // InternalMyDslParser.g:325:3: (this_BEGIN_1= RULE_BEGIN ( (lv_environment_when_2_0= ruleEnvironment ) )+ this_END_3= RULE_END )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_BEGIN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDslParser.g:326:4: this_BEGIN_1= RULE_BEGIN ( (lv_environment_when_2_0= ruleEnvironment ) )+ this_END_3= RULE_END
                    {
                    this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_9); 

                    				newLeafNode(this_BEGIN_1, grammarAccess.getWhenAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalMyDslParser.g:330:4: ( (lv_environment_when_2_0= ruleEnvironment ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Path||LA11_0==RULE_TRIGGERS||LA11_0==RULE_KEY) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDslParser.g:331:5: (lv_environment_when_2_0= ruleEnvironment )
                    	    {
                    	    // InternalMyDslParser.g:331:5: (lv_environment_when_2_0= ruleEnvironment )
                    	    // InternalMyDslParser.g:332:6: lv_environment_when_2_0= ruleEnvironment
                    	    {

                    	    						newCompositeNode(grammarAccess.getWhenAccess().getEnvironment_whenEnvironmentParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_environment_when_2_0=ruleEnvironment();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getWhenRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"environment_when",
                    	    							lv_environment_when_2_0,
                    	    							"org.xtext.example.mydsl10.MyDsl.Environment");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_3, grammarAccess.getWhenAccess().getENDTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleJobIfThenElse"
    // InternalMyDslParser.g:358:1: entryRuleJobIfThenElse returns [EObject current=null] : iv_ruleJobIfThenElse= ruleJobIfThenElse EOF ;
    public final EObject entryRuleJobIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobIfThenElse = null;


        try {
            // InternalMyDslParser.g:358:54: (iv_ruleJobIfThenElse= ruleJobIfThenElse EOF )
            // InternalMyDslParser.g:359:2: iv_ruleJobIfThenElse= ruleJobIfThenElse EOF
            {
             newCompositeNode(grammarAccess.getJobIfThenElseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJobIfThenElse=ruleJobIfThenElse();

            state._fsp--;

             current =iv_ruleJobIfThenElse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJobIfThenElse"


    // $ANTLR start "ruleJobIfThenElse"
    // InternalMyDslParser.g:365:1: ruleJobIfThenElse returns [EObject current=null] : ( ( (lv_option_0_1= ruleIfThenElse | lv_option_0_2= ruleJob ) ) ) ;
    public final EObject ruleJobIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject lv_option_0_1 = null;

        EObject lv_option_0_2 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:371:2: ( ( ( (lv_option_0_1= ruleIfThenElse | lv_option_0_2= ruleJob ) ) ) )
            // InternalMyDslParser.g:372:2: ( ( (lv_option_0_1= ruleIfThenElse | lv_option_0_2= ruleJob ) ) )
            {
            // InternalMyDslParser.g:372:2: ( ( (lv_option_0_1= ruleIfThenElse | lv_option_0_2= ruleJob ) ) )
            // InternalMyDslParser.g:373:3: ( (lv_option_0_1= ruleIfThenElse | lv_option_0_2= ruleJob ) )
            {
            // InternalMyDslParser.g:373:3: ( (lv_option_0_1= ruleIfThenElse | lv_option_0_2= ruleJob ) )
            // InternalMyDslParser.g:374:4: (lv_option_0_1= ruleIfThenElse | lv_option_0_2= ruleJob )
            {
            // InternalMyDslParser.g:374:4: (lv_option_0_1= ruleIfThenElse | lv_option_0_2= ruleJob )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==If_1||LA13_0==If) ) {
                alt13=1;
            }
            else if ( (LA13_0==Allow_faillure||LA13_0==RULE_KEY) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDslParser.g:375:5: lv_option_0_1= ruleIfThenElse
                    {

                    					newCompositeNode(grammarAccess.getJobIfThenElseAccess().getOptionIfThenElseParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_option_0_1=ruleIfThenElse();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJobIfThenElseRule());
                    					}
                    					set(
                    						current,
                    						"option",
                    						lv_option_0_1,
                    						"org.xtext.example.mydsl10.MyDsl.IfThenElse");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:391:5: lv_option_0_2= ruleJob
                    {

                    					newCompositeNode(grammarAccess.getJobIfThenElseAccess().getOptionJobParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_option_0_2=ruleJob();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJobIfThenElseRule());
                    					}
                    					set(
                    						current,
                    						"option",
                    						lv_option_0_2,
                    						"org.xtext.example.mydsl10.MyDsl.Job");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJobIfThenElse"


    // $ANTLR start "entryRuleJob"
    // InternalMyDslParser.g:412:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalMyDslParser.g:412:44: (iv_ruleJob= ruleJob EOF )
            // InternalMyDslParser.g:413:2: iv_ruleJob= ruleJob EOF
            {
             newCompositeNode(grammarAccess.getJobRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJob=ruleJob();

            state._fsp--;

             current =iv_ruleJob; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJob"


    // $ANTLR start "ruleJob"
    // InternalMyDslParser.g:419:1: ruleJob returns [EObject current=null] : ( ( (lv_Allow_faillure_0_0= Allow_faillure ) )? ( (lv_Name1_1_0= RULE_KEY ) ) (this_BEGIN_2= RULE_BEGIN ( (this_NAME_3= RULE_NAME ( (lv_Description_4_0= ruleEString ) ) ) | ( (otherlv_5= Env | otherlv_6= Secrets ) (this_BEGIN_7= RULE_BEGIN ( (lv_depends_8_0= ruleEnvironment ) )+ this_END_9= RULE_END ) ) | ( (otherlv_10= RunsOn | otherlv_11= Needs | otherlv_12= Uses ) ( (lv_tool_framework_job_13_0= ruleTool_framework ) ) ) | (otherlv_14= Outputs (this_BEGIN_15= RULE_BEGIN ( (lv_output_16_0= ruleArtifact ) )+ this_END_17= RULE_END ) ) | ( (lv_ifthenelse_18_0= ruleIfThenElse ) ) | ( (lv_steps_19_0= ruleSteps ) ) | ( (lv_strategy_20_0= ruleStrategy ) ) )+ this_END_21= RULE_END ) ) ;
    public final EObject ruleJob() throws RecognitionException {
        EObject current = null;

        Token lv_Allow_faillure_0_0=null;
        Token lv_Name1_1_0=null;
        Token this_BEGIN_2=null;
        Token this_NAME_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token this_BEGIN_15=null;
        Token this_END_17=null;
        Token this_END_21=null;
        AntlrDatatypeRuleToken lv_Description_4_0 = null;

        EObject lv_depends_8_0 = null;

        EObject lv_tool_framework_job_13_0 = null;

        EObject lv_output_16_0 = null;

        EObject lv_ifthenelse_18_0 = null;

        EObject lv_steps_19_0 = null;

        EObject lv_strategy_20_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:425:2: ( ( ( (lv_Allow_faillure_0_0= Allow_faillure ) )? ( (lv_Name1_1_0= RULE_KEY ) ) (this_BEGIN_2= RULE_BEGIN ( (this_NAME_3= RULE_NAME ( (lv_Description_4_0= ruleEString ) ) ) | ( (otherlv_5= Env | otherlv_6= Secrets ) (this_BEGIN_7= RULE_BEGIN ( (lv_depends_8_0= ruleEnvironment ) )+ this_END_9= RULE_END ) ) | ( (otherlv_10= RunsOn | otherlv_11= Needs | otherlv_12= Uses ) ( (lv_tool_framework_job_13_0= ruleTool_framework ) ) ) | (otherlv_14= Outputs (this_BEGIN_15= RULE_BEGIN ( (lv_output_16_0= ruleArtifact ) )+ this_END_17= RULE_END ) ) | ( (lv_ifthenelse_18_0= ruleIfThenElse ) ) | ( (lv_steps_19_0= ruleSteps ) ) | ( (lv_strategy_20_0= ruleStrategy ) ) )+ this_END_21= RULE_END ) ) )
            // InternalMyDslParser.g:426:2: ( ( (lv_Allow_faillure_0_0= Allow_faillure ) )? ( (lv_Name1_1_0= RULE_KEY ) ) (this_BEGIN_2= RULE_BEGIN ( (this_NAME_3= RULE_NAME ( (lv_Description_4_0= ruleEString ) ) ) | ( (otherlv_5= Env | otherlv_6= Secrets ) (this_BEGIN_7= RULE_BEGIN ( (lv_depends_8_0= ruleEnvironment ) )+ this_END_9= RULE_END ) ) | ( (otherlv_10= RunsOn | otherlv_11= Needs | otherlv_12= Uses ) ( (lv_tool_framework_job_13_0= ruleTool_framework ) ) ) | (otherlv_14= Outputs (this_BEGIN_15= RULE_BEGIN ( (lv_output_16_0= ruleArtifact ) )+ this_END_17= RULE_END ) ) | ( (lv_ifthenelse_18_0= ruleIfThenElse ) ) | ( (lv_steps_19_0= ruleSteps ) ) | ( (lv_strategy_20_0= ruleStrategy ) ) )+ this_END_21= RULE_END ) )
            {
            // InternalMyDslParser.g:426:2: ( ( (lv_Allow_faillure_0_0= Allow_faillure ) )? ( (lv_Name1_1_0= RULE_KEY ) ) (this_BEGIN_2= RULE_BEGIN ( (this_NAME_3= RULE_NAME ( (lv_Description_4_0= ruleEString ) ) ) | ( (otherlv_5= Env | otherlv_6= Secrets ) (this_BEGIN_7= RULE_BEGIN ( (lv_depends_8_0= ruleEnvironment ) )+ this_END_9= RULE_END ) ) | ( (otherlv_10= RunsOn | otherlv_11= Needs | otherlv_12= Uses ) ( (lv_tool_framework_job_13_0= ruleTool_framework ) ) ) | (otherlv_14= Outputs (this_BEGIN_15= RULE_BEGIN ( (lv_output_16_0= ruleArtifact ) )+ this_END_17= RULE_END ) ) | ( (lv_ifthenelse_18_0= ruleIfThenElse ) ) | ( (lv_steps_19_0= ruleSteps ) ) | ( (lv_strategy_20_0= ruleStrategy ) ) )+ this_END_21= RULE_END ) )
            // InternalMyDslParser.g:427:3: ( (lv_Allow_faillure_0_0= Allow_faillure ) )? ( (lv_Name1_1_0= RULE_KEY ) ) (this_BEGIN_2= RULE_BEGIN ( (this_NAME_3= RULE_NAME ( (lv_Description_4_0= ruleEString ) ) ) | ( (otherlv_5= Env | otherlv_6= Secrets ) (this_BEGIN_7= RULE_BEGIN ( (lv_depends_8_0= ruleEnvironment ) )+ this_END_9= RULE_END ) ) | ( (otherlv_10= RunsOn | otherlv_11= Needs | otherlv_12= Uses ) ( (lv_tool_framework_job_13_0= ruleTool_framework ) ) ) | (otherlv_14= Outputs (this_BEGIN_15= RULE_BEGIN ( (lv_output_16_0= ruleArtifact ) )+ this_END_17= RULE_END ) ) | ( (lv_ifthenelse_18_0= ruleIfThenElse ) ) | ( (lv_steps_19_0= ruleSteps ) ) | ( (lv_strategy_20_0= ruleStrategy ) ) )+ this_END_21= RULE_END )
            {
            // InternalMyDslParser.g:427:3: ( (lv_Allow_faillure_0_0= Allow_faillure ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Allow_faillure) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDslParser.g:428:4: (lv_Allow_faillure_0_0= Allow_faillure )
                    {
                    // InternalMyDslParser.g:428:4: (lv_Allow_faillure_0_0= Allow_faillure )
                    // InternalMyDslParser.g:429:5: lv_Allow_faillure_0_0= Allow_faillure
                    {
                    lv_Allow_faillure_0_0=(Token)match(input,Allow_faillure,FOLLOW_13); 

                    					newLeafNode(lv_Allow_faillure_0_0, grammarAccess.getJobAccess().getAllow_faillureAllow_faillureKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJobRule());
                    					}
                    					setWithLastConsumed(current, "Allow_faillure", lv_Allow_faillure_0_0 != null, "Allow_faillure");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:441:3: ( (lv_Name1_1_0= RULE_KEY ) )
            // InternalMyDslParser.g:442:4: (lv_Name1_1_0= RULE_KEY )
            {
            // InternalMyDslParser.g:442:4: (lv_Name1_1_0= RULE_KEY )
            // InternalMyDslParser.g:443:5: lv_Name1_1_0= RULE_KEY
            {
            lv_Name1_1_0=(Token)match(input,RULE_KEY,FOLLOW_8); 

            					newLeafNode(lv_Name1_1_0, grammarAccess.getJobAccess().getName1KEYTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJobRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name1",
            						lv_Name1_1_0,
            						"org.xtext.example.mydsl10.MyDsl.KEY");
            				

            }


            }

            // InternalMyDslParser.g:459:3: (this_BEGIN_2= RULE_BEGIN ( (this_NAME_3= RULE_NAME ( (lv_Description_4_0= ruleEString ) ) ) | ( (otherlv_5= Env | otherlv_6= Secrets ) (this_BEGIN_7= RULE_BEGIN ( (lv_depends_8_0= ruleEnvironment ) )+ this_END_9= RULE_END ) ) | ( (otherlv_10= RunsOn | otherlv_11= Needs | otherlv_12= Uses ) ( (lv_tool_framework_job_13_0= ruleTool_framework ) ) ) | (otherlv_14= Outputs (this_BEGIN_15= RULE_BEGIN ( (lv_output_16_0= ruleArtifact ) )+ this_END_17= RULE_END ) ) | ( (lv_ifthenelse_18_0= ruleIfThenElse ) ) | ( (lv_steps_19_0= ruleSteps ) ) | ( (lv_strategy_20_0= ruleStrategy ) ) )+ this_END_21= RULE_END )
            // InternalMyDslParser.g:460:4: this_BEGIN_2= RULE_BEGIN ( (this_NAME_3= RULE_NAME ( (lv_Description_4_0= ruleEString ) ) ) | ( (otherlv_5= Env | otherlv_6= Secrets ) (this_BEGIN_7= RULE_BEGIN ( (lv_depends_8_0= ruleEnvironment ) )+ this_END_9= RULE_END ) ) | ( (otherlv_10= RunsOn | otherlv_11= Needs | otherlv_12= Uses ) ( (lv_tool_framework_job_13_0= ruleTool_framework ) ) ) | (otherlv_14= Outputs (this_BEGIN_15= RULE_BEGIN ( (lv_output_16_0= ruleArtifact ) )+ this_END_17= RULE_END ) ) | ( (lv_ifthenelse_18_0= ruleIfThenElse ) ) | ( (lv_steps_19_0= ruleSteps ) ) | ( (lv_strategy_20_0= ruleStrategy ) ) )+ this_END_21= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getJobAccess().getBEGINTerminalRuleCall_2_0());
            			
            // InternalMyDslParser.g:464:4: ( (this_NAME_3= RULE_NAME ( (lv_Description_4_0= ruleEString ) ) ) | ( (otherlv_5= Env | otherlv_6= Secrets ) (this_BEGIN_7= RULE_BEGIN ( (lv_depends_8_0= ruleEnvironment ) )+ this_END_9= RULE_END ) ) | ( (otherlv_10= RunsOn | otherlv_11= Needs | otherlv_12= Uses ) ( (lv_tool_framework_job_13_0= ruleTool_framework ) ) ) | (otherlv_14= Outputs (this_BEGIN_15= RULE_BEGIN ( (lv_output_16_0= ruleArtifact ) )+ this_END_17= RULE_END ) ) | ( (lv_ifthenelse_18_0= ruleIfThenElse ) ) | ( (lv_steps_19_0= ruleSteps ) ) | ( (lv_strategy_20_0= ruleStrategy ) ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=8;
                switch ( input.LA(1) ) {
                case RULE_NAME:
                    {
                    alt19=1;
                    }
                    break;
                case Secrets:
                case Env:
                    {
                    alt19=2;
                    }
                    break;
                case RunsOn:
                case Needs:
                case Uses:
                    {
                    alt19=3;
                    }
                    break;
                case Outputs:
                    {
                    alt19=4;
                    }
                    break;
                case If_1:
                case If:
                    {
                    alt19=5;
                    }
                    break;
                case Steps:
                    {
                    alt19=6;
                    }
                    break;
                case Strategy:
                    {
                    alt19=7;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // InternalMyDslParser.g:465:5: (this_NAME_3= RULE_NAME ( (lv_Description_4_0= ruleEString ) ) )
            	    {
            	    // InternalMyDslParser.g:465:5: (this_NAME_3= RULE_NAME ( (lv_Description_4_0= ruleEString ) ) )
            	    // InternalMyDslParser.g:466:6: this_NAME_3= RULE_NAME ( (lv_Description_4_0= ruleEString ) )
            	    {
            	    this_NAME_3=(Token)match(input,RULE_NAME,FOLLOW_3); 

            	    						newLeafNode(this_NAME_3, grammarAccess.getJobAccess().getNAMETerminalRuleCall_2_1_0_0());
            	    					
            	    // InternalMyDslParser.g:470:6: ( (lv_Description_4_0= ruleEString ) )
            	    // InternalMyDslParser.g:471:7: (lv_Description_4_0= ruleEString )
            	    {
            	    // InternalMyDslParser.g:471:7: (lv_Description_4_0= ruleEString )
            	    // InternalMyDslParser.g:472:8: lv_Description_4_0= ruleEString
            	    {

            	    								newCompositeNode(grammarAccess.getJobAccess().getDescriptionEStringParserRuleCall_2_1_0_1_0());
            	    							
            	    pushFollow(FOLLOW_15);
            	    lv_Description_4_0=ruleEString();

            	    state._fsp--;


            	    								if (current==null) {
            	    									current = createModelElementForParent(grammarAccess.getJobRule());
            	    								}
            	    								add(
            	    									current,
            	    									"Description",
            	    									lv_Description_4_0,
            	    									"org.xtext.example.mydsl10.MyDsl.EString");
            	    								afterParserOrEnumRuleCall();
            	    							

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDslParser.g:491:5: ( (otherlv_5= Env | otherlv_6= Secrets ) (this_BEGIN_7= RULE_BEGIN ( (lv_depends_8_0= ruleEnvironment ) )+ this_END_9= RULE_END ) )
            	    {
            	    // InternalMyDslParser.g:491:5: ( (otherlv_5= Env | otherlv_6= Secrets ) (this_BEGIN_7= RULE_BEGIN ( (lv_depends_8_0= ruleEnvironment ) )+ this_END_9= RULE_END ) )
            	    // InternalMyDslParser.g:492:6: (otherlv_5= Env | otherlv_6= Secrets ) (this_BEGIN_7= RULE_BEGIN ( (lv_depends_8_0= ruleEnvironment ) )+ this_END_9= RULE_END )
            	    {
            	    // InternalMyDslParser.g:492:6: (otherlv_5= Env | otherlv_6= Secrets )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==Env) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==Secrets) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalMyDslParser.g:493:7: otherlv_5= Env
            	            {
            	            otherlv_5=(Token)match(input,Env,FOLLOW_8); 

            	            							newLeafNode(otherlv_5, grammarAccess.getJobAccess().getEnvKeyword_2_1_1_0_0());
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDslParser.g:498:7: otherlv_6= Secrets
            	            {
            	            otherlv_6=(Token)match(input,Secrets,FOLLOW_8); 

            	            							newLeafNode(otherlv_6, grammarAccess.getJobAccess().getSecretsKeyword_2_1_1_0_1());
            	            						

            	            }
            	            break;

            	    }

            	    // InternalMyDslParser.g:503:6: (this_BEGIN_7= RULE_BEGIN ( (lv_depends_8_0= ruleEnvironment ) )+ this_END_9= RULE_END )
            	    // InternalMyDslParser.g:504:7: this_BEGIN_7= RULE_BEGIN ( (lv_depends_8_0= ruleEnvironment ) )+ this_END_9= RULE_END
            	    {
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_9); 

            	    							newLeafNode(this_BEGIN_7, grammarAccess.getJobAccess().getBEGINTerminalRuleCall_2_1_1_1_0());
            	    						
            	    // InternalMyDslParser.g:508:7: ( (lv_depends_8_0= ruleEnvironment ) )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==Path||LA16_0==RULE_TRIGGERS||LA16_0==RULE_KEY) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalMyDslParser.g:509:8: (lv_depends_8_0= ruleEnvironment )
            	    	    {
            	    	    // InternalMyDslParser.g:509:8: (lv_depends_8_0= ruleEnvironment )
            	    	    // InternalMyDslParser.g:510:9: lv_depends_8_0= ruleEnvironment
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getJobAccess().getDependsEnvironmentParserRuleCall_2_1_1_1_1_0());
            	    	    								
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_depends_8_0=ruleEnvironment();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getJobRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"depends",
            	    	    										lv_depends_8_0,
            	    	    										"org.xtext.example.mydsl10.MyDsl.Environment");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt16 >= 1 ) break loop16;
            	                EarlyExitException eee =
            	                    new EarlyExitException(16, input);
            	                throw eee;
            	        }
            	        cnt16++;
            	    } while (true);

            	    this_END_9=(Token)match(input,RULE_END,FOLLOW_15); 

            	    							newLeafNode(this_END_9, grammarAccess.getJobAccess().getENDTerminalRuleCall_2_1_1_1_2());
            	    						

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDslParser.g:534:5: ( (otherlv_10= RunsOn | otherlv_11= Needs | otherlv_12= Uses ) ( (lv_tool_framework_job_13_0= ruleTool_framework ) ) )
            	    {
            	    // InternalMyDslParser.g:534:5: ( (otherlv_10= RunsOn | otherlv_11= Needs | otherlv_12= Uses ) ( (lv_tool_framework_job_13_0= ruleTool_framework ) ) )
            	    // InternalMyDslParser.g:535:6: (otherlv_10= RunsOn | otherlv_11= Needs | otherlv_12= Uses ) ( (lv_tool_framework_job_13_0= ruleTool_framework ) )
            	    {
            	    // InternalMyDslParser.g:535:6: (otherlv_10= RunsOn | otherlv_11= Needs | otherlv_12= Uses )
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case RunsOn:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case Needs:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case Uses:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // InternalMyDslParser.g:536:7: otherlv_10= RunsOn
            	            {
            	            otherlv_10=(Token)match(input,RunsOn,FOLLOW_16); 

            	            							newLeafNode(otherlv_10, grammarAccess.getJobAccess().getRunsOnKeyword_2_1_2_0_0());
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDslParser.g:541:7: otherlv_11= Needs
            	            {
            	            otherlv_11=(Token)match(input,Needs,FOLLOW_16); 

            	            							newLeafNode(otherlv_11, grammarAccess.getJobAccess().getNeedsKeyword_2_1_2_0_1());
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDslParser.g:546:7: otherlv_12= Uses
            	            {
            	            otherlv_12=(Token)match(input,Uses,FOLLOW_16); 

            	            							newLeafNode(otherlv_12, grammarAccess.getJobAccess().getUsesKeyword_2_1_2_0_2());
            	            						

            	            }
            	            break;

            	    }

            	    // InternalMyDslParser.g:551:6: ( (lv_tool_framework_job_13_0= ruleTool_framework ) )
            	    // InternalMyDslParser.g:552:7: (lv_tool_framework_job_13_0= ruleTool_framework )
            	    {
            	    // InternalMyDslParser.g:552:7: (lv_tool_framework_job_13_0= ruleTool_framework )
            	    // InternalMyDslParser.g:553:8: lv_tool_framework_job_13_0= ruleTool_framework
            	    {

            	    								newCompositeNode(grammarAccess.getJobAccess().getTool_framework_jobTool_frameworkParserRuleCall_2_1_2_1_0());
            	    							
            	    pushFollow(FOLLOW_15);
            	    lv_tool_framework_job_13_0=ruleTool_framework();

            	    state._fsp--;


            	    								if (current==null) {
            	    									current = createModelElementForParent(grammarAccess.getJobRule());
            	    								}
            	    								add(
            	    									current,
            	    									"tool_framework_job",
            	    									lv_tool_framework_job_13_0,
            	    									"org.xtext.example.mydsl10.MyDsl.Tool_framework");
            	    								afterParserOrEnumRuleCall();
            	    							

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDslParser.g:572:5: (otherlv_14= Outputs (this_BEGIN_15= RULE_BEGIN ( (lv_output_16_0= ruleArtifact ) )+ this_END_17= RULE_END ) )
            	    {
            	    // InternalMyDslParser.g:572:5: (otherlv_14= Outputs (this_BEGIN_15= RULE_BEGIN ( (lv_output_16_0= ruleArtifact ) )+ this_END_17= RULE_END ) )
            	    // InternalMyDslParser.g:573:6: otherlv_14= Outputs (this_BEGIN_15= RULE_BEGIN ( (lv_output_16_0= ruleArtifact ) )+ this_END_17= RULE_END )
            	    {
            	    otherlv_14=(Token)match(input,Outputs,FOLLOW_8); 

            	    						newLeafNode(otherlv_14, grammarAccess.getJobAccess().getOutputsKeyword_2_1_3_0());
            	    					
            	    // InternalMyDslParser.g:577:6: (this_BEGIN_15= RULE_BEGIN ( (lv_output_16_0= ruleArtifact ) )+ this_END_17= RULE_END )
            	    // InternalMyDslParser.g:578:7: this_BEGIN_15= RULE_BEGIN ( (lv_output_16_0= ruleArtifact ) )+ this_END_17= RULE_END
            	    {
            	    this_BEGIN_15=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

            	    							newLeafNode(this_BEGIN_15, grammarAccess.getJobAccess().getBEGINTerminalRuleCall_2_1_3_1_0());
            	    						
            	    // InternalMyDslParser.g:582:7: ( (lv_output_16_0= ruleArtifact ) )+
            	    int cnt18=0;
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==RULE_TRIGGERS||LA18_0==RULE_KEY) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalMyDslParser.g:583:8: (lv_output_16_0= ruleArtifact )
            	    	    {
            	    	    // InternalMyDslParser.g:583:8: (lv_output_16_0= ruleArtifact )
            	    	    // InternalMyDslParser.g:584:9: lv_output_16_0= ruleArtifact
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getJobAccess().getOutputArtifactParserRuleCall_2_1_3_1_1_0());
            	    	    								
            	    	    pushFollow(FOLLOW_18);
            	    	    lv_output_16_0=ruleArtifact();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getJobRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"output",
            	    	    										lv_output_16_0,
            	    	    										"org.xtext.example.mydsl10.MyDsl.Artifact");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt18 >= 1 ) break loop18;
            	                EarlyExitException eee =
            	                    new EarlyExitException(18, input);
            	                throw eee;
            	        }
            	        cnt18++;
            	    } while (true);

            	    this_END_17=(Token)match(input,RULE_END,FOLLOW_15); 

            	    							newLeafNode(this_END_17, grammarAccess.getJobAccess().getENDTerminalRuleCall_2_1_3_1_2());
            	    						

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDslParser.g:608:5: ( (lv_ifthenelse_18_0= ruleIfThenElse ) )
            	    {
            	    // InternalMyDslParser.g:608:5: ( (lv_ifthenelse_18_0= ruleIfThenElse ) )
            	    // InternalMyDslParser.g:609:6: (lv_ifthenelse_18_0= ruleIfThenElse )
            	    {
            	    // InternalMyDslParser.g:609:6: (lv_ifthenelse_18_0= ruleIfThenElse )
            	    // InternalMyDslParser.g:610:7: lv_ifthenelse_18_0= ruleIfThenElse
            	    {

            	    							newCompositeNode(grammarAccess.getJobAccess().getIfthenelseIfThenElseParserRuleCall_2_1_4_0());
            	    						
            	    pushFollow(FOLLOW_15);
            	    lv_ifthenelse_18_0=ruleIfThenElse();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getJobRule());
            	    							}
            	    							add(
            	    								current,
            	    								"ifthenelse",
            	    								lv_ifthenelse_18_0,
            	    								"org.xtext.example.mydsl10.MyDsl.IfThenElse");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDslParser.g:628:5: ( (lv_steps_19_0= ruleSteps ) )
            	    {
            	    // InternalMyDslParser.g:628:5: ( (lv_steps_19_0= ruleSteps ) )
            	    // InternalMyDslParser.g:629:6: (lv_steps_19_0= ruleSteps )
            	    {
            	    // InternalMyDslParser.g:629:6: (lv_steps_19_0= ruleSteps )
            	    // InternalMyDslParser.g:630:7: lv_steps_19_0= ruleSteps
            	    {

            	    							newCompositeNode(grammarAccess.getJobAccess().getStepsStepsParserRuleCall_2_1_5_0());
            	    						
            	    pushFollow(FOLLOW_15);
            	    lv_steps_19_0=ruleSteps();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getJobRule());
            	    							}
            	    							add(
            	    								current,
            	    								"steps",
            	    								lv_steps_19_0,
            	    								"org.xtext.example.mydsl10.MyDsl.Steps");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMyDslParser.g:648:5: ( (lv_strategy_20_0= ruleStrategy ) )
            	    {
            	    // InternalMyDslParser.g:648:5: ( (lv_strategy_20_0= ruleStrategy ) )
            	    // InternalMyDslParser.g:649:6: (lv_strategy_20_0= ruleStrategy )
            	    {
            	    // InternalMyDslParser.g:649:6: (lv_strategy_20_0= ruleStrategy )
            	    // InternalMyDslParser.g:650:7: lv_strategy_20_0= ruleStrategy
            	    {

            	    							newCompositeNode(grammarAccess.getJobAccess().getStrategyStrategyParserRuleCall_2_1_6_0());
            	    						
            	    pushFollow(FOLLOW_15);
            	    lv_strategy_20_0=ruleStrategy();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getJobRule());
            	    							}
            	    							add(
            	    								current,
            	    								"strategy",
            	    								lv_strategy_20_0,
            	    								"org.xtext.example.mydsl10.MyDsl.Strategy");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            this_END_21=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_21, grammarAccess.getJobAccess().getENDTerminalRuleCall_2_2());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJob"


    // $ANTLR start "entryRuleStrategy"
    // InternalMyDslParser.g:677:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // InternalMyDslParser.g:677:49: (iv_ruleStrategy= ruleStrategy EOF )
            // InternalMyDslParser.g:678:2: iv_ruleStrategy= ruleStrategy EOF
            {
             newCompositeNode(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;

             current =iv_ruleStrategy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // InternalMyDslParser.g:684:1: ruleStrategy returns [EObject current=null] : (otherlv_0= Strategy (this_BEGIN_1= RULE_BEGIN (otherlv_2= FailFast ( (lv_fail_fast_3_0= ruleEBoolean ) ) (this_NEWLINE_4= RULE_NEWLINE )? )? (otherlv_5= Matrix (this_BEGIN_6= RULE_BEGIN ( ( (lv_input_7_0= ruleArtifact ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )? (otherlv_10= FailFast ( (lv_fail_fast_11_0= ruleEBoolean ) ) (this_NEWLINE_12= RULE_NEWLINE )? )? )? this_END_13= RULE_END ) ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_NEWLINE_4=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_NEWLINE_8=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_NEWLINE_12=null;
        Token this_END_13=null;
        AntlrDatatypeRuleToken lv_fail_fast_3_0 = null;

        EObject lv_input_7_0 = null;

        AntlrDatatypeRuleToken lv_fail_fast_11_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:690:2: ( (otherlv_0= Strategy (this_BEGIN_1= RULE_BEGIN (otherlv_2= FailFast ( (lv_fail_fast_3_0= ruleEBoolean ) ) (this_NEWLINE_4= RULE_NEWLINE )? )? (otherlv_5= Matrix (this_BEGIN_6= RULE_BEGIN ( ( (lv_input_7_0= ruleArtifact ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )? (otherlv_10= FailFast ( (lv_fail_fast_11_0= ruleEBoolean ) ) (this_NEWLINE_12= RULE_NEWLINE )? )? )? this_END_13= RULE_END ) ) )
            // InternalMyDslParser.g:691:2: (otherlv_0= Strategy (this_BEGIN_1= RULE_BEGIN (otherlv_2= FailFast ( (lv_fail_fast_3_0= ruleEBoolean ) ) (this_NEWLINE_4= RULE_NEWLINE )? )? (otherlv_5= Matrix (this_BEGIN_6= RULE_BEGIN ( ( (lv_input_7_0= ruleArtifact ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )? (otherlv_10= FailFast ( (lv_fail_fast_11_0= ruleEBoolean ) ) (this_NEWLINE_12= RULE_NEWLINE )? )? )? this_END_13= RULE_END ) )
            {
            // InternalMyDslParser.g:691:2: (otherlv_0= Strategy (this_BEGIN_1= RULE_BEGIN (otherlv_2= FailFast ( (lv_fail_fast_3_0= ruleEBoolean ) ) (this_NEWLINE_4= RULE_NEWLINE )? )? (otherlv_5= Matrix (this_BEGIN_6= RULE_BEGIN ( ( (lv_input_7_0= ruleArtifact ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )? (otherlv_10= FailFast ( (lv_fail_fast_11_0= ruleEBoolean ) ) (this_NEWLINE_12= RULE_NEWLINE )? )? )? this_END_13= RULE_END ) )
            // InternalMyDslParser.g:692:3: otherlv_0= Strategy (this_BEGIN_1= RULE_BEGIN (otherlv_2= FailFast ( (lv_fail_fast_3_0= ruleEBoolean ) ) (this_NEWLINE_4= RULE_NEWLINE )? )? (otherlv_5= Matrix (this_BEGIN_6= RULE_BEGIN ( ( (lv_input_7_0= ruleArtifact ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )? (otherlv_10= FailFast ( (lv_fail_fast_11_0= ruleEBoolean ) ) (this_NEWLINE_12= RULE_NEWLINE )? )? )? this_END_13= RULE_END )
            {
            otherlv_0=(Token)match(input,Strategy,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getStrategyAccess().getStrategyKeyword_0());
            		
            // InternalMyDslParser.g:696:3: (this_BEGIN_1= RULE_BEGIN (otherlv_2= FailFast ( (lv_fail_fast_3_0= ruleEBoolean ) ) (this_NEWLINE_4= RULE_NEWLINE )? )? (otherlv_5= Matrix (this_BEGIN_6= RULE_BEGIN ( ( (lv_input_7_0= ruleArtifact ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )? (otherlv_10= FailFast ( (lv_fail_fast_11_0= ruleEBoolean ) ) (this_NEWLINE_12= RULE_NEWLINE )? )? )? this_END_13= RULE_END )
            // InternalMyDslParser.g:697:4: this_BEGIN_1= RULE_BEGIN (otherlv_2= FailFast ( (lv_fail_fast_3_0= ruleEBoolean ) ) (this_NEWLINE_4= RULE_NEWLINE )? )? (otherlv_5= Matrix (this_BEGIN_6= RULE_BEGIN ( ( (lv_input_7_0= ruleArtifact ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )? (otherlv_10= FailFast ( (lv_fail_fast_11_0= ruleEBoolean ) ) (this_NEWLINE_12= RULE_NEWLINE )? )? )? this_END_13= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_19); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getStrategyAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalMyDslParser.g:701:4: (otherlv_2= FailFast ( (lv_fail_fast_3_0= ruleEBoolean ) ) (this_NEWLINE_4= RULE_NEWLINE )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==FailFast) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDslParser.g:702:5: otherlv_2= FailFast ( (lv_fail_fast_3_0= ruleEBoolean ) ) (this_NEWLINE_4= RULE_NEWLINE )?
                    {
                    otherlv_2=(Token)match(input,FailFast,FOLLOW_20); 

                    					newLeafNode(otherlv_2, grammarAccess.getStrategyAccess().getFailFastKeyword_1_1_0());
                    				
                    // InternalMyDslParser.g:706:5: ( (lv_fail_fast_3_0= ruleEBoolean ) )
                    // InternalMyDslParser.g:707:6: (lv_fail_fast_3_0= ruleEBoolean )
                    {
                    // InternalMyDslParser.g:707:6: (lv_fail_fast_3_0= ruleEBoolean )
                    // InternalMyDslParser.g:708:7: lv_fail_fast_3_0= ruleEBoolean
                    {

                    							newCompositeNode(grammarAccess.getStrategyAccess().getFail_fastEBooleanParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_fail_fast_3_0=ruleEBoolean();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStrategyRule());
                    							}
                    							set(
                    								current,
                    								"fail_fast",
                    								lv_fail_fast_3_0,
                    								"org.xtext.example.mydsl10.MyDsl.EBoolean");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDslParser.g:725:5: (this_NEWLINE_4= RULE_NEWLINE )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_NEWLINE) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalMyDslParser.g:726:6: this_NEWLINE_4= RULE_NEWLINE
                            {
                            this_NEWLINE_4=(Token)match(input,RULE_NEWLINE,FOLLOW_22); 

                            						newLeafNode(this_NEWLINE_4, grammarAccess.getStrategyAccess().getNEWLINETerminalRuleCall_1_1_2());
                            					

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:732:4: (otherlv_5= Matrix (this_BEGIN_6= RULE_BEGIN ( ( (lv_input_7_0= ruleArtifact ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )? (otherlv_10= FailFast ( (lv_fail_fast_11_0= ruleEBoolean ) ) (this_NEWLINE_12= RULE_NEWLINE )? )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Matrix) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDslParser.g:733:5: otherlv_5= Matrix (this_BEGIN_6= RULE_BEGIN ( ( (lv_input_7_0= ruleArtifact ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )? (otherlv_10= FailFast ( (lv_fail_fast_11_0= ruleEBoolean ) ) (this_NEWLINE_12= RULE_NEWLINE )? )?
                    {
                    otherlv_5=(Token)match(input,Matrix,FOLLOW_23); 

                    					newLeafNode(otherlv_5, grammarAccess.getStrategyAccess().getMatrixKeyword_1_2_0());
                    				
                    // InternalMyDslParser.g:737:5: (this_BEGIN_6= RULE_BEGIN ( ( (lv_input_7_0= ruleArtifact ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_BEGIN) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalMyDslParser.g:738:6: this_BEGIN_6= RULE_BEGIN ( ( (lv_input_7_0= ruleArtifact ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END
                            {
                            this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

                            						newLeafNode(this_BEGIN_6, grammarAccess.getStrategyAccess().getBEGINTerminalRuleCall_1_2_1_0());
                            					
                            // InternalMyDslParser.g:742:6: ( ( (lv_input_7_0= ruleArtifact ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+
                            int cnt23=0;
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==RULE_TRIGGERS||LA23_0==RULE_KEY) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // InternalMyDslParser.g:743:7: ( (lv_input_7_0= ruleArtifact ) ) (this_NEWLINE_8= RULE_NEWLINE )?
                            	    {
                            	    // InternalMyDslParser.g:743:7: ( (lv_input_7_0= ruleArtifact ) )
                            	    // InternalMyDslParser.g:744:8: (lv_input_7_0= ruleArtifact )
                            	    {
                            	    // InternalMyDslParser.g:744:8: (lv_input_7_0= ruleArtifact )
                            	    // InternalMyDslParser.g:745:9: lv_input_7_0= ruleArtifact
                            	    {

                            	    									newCompositeNode(grammarAccess.getStrategyAccess().getInputArtifactParserRuleCall_1_2_1_1_0_0());
                            	    								
                            	    pushFollow(FOLLOW_24);
                            	    lv_input_7_0=ruleArtifact();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getStrategyRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"input",
                            	    										lv_input_7_0,
                            	    										"org.xtext.example.mydsl10.MyDsl.Artifact");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }

                            	    // InternalMyDslParser.g:762:7: (this_NEWLINE_8= RULE_NEWLINE )?
                            	    int alt22=2;
                            	    int LA22_0 = input.LA(1);

                            	    if ( (LA22_0==RULE_NEWLINE) ) {
                            	        alt22=1;
                            	    }
                            	    switch (alt22) {
                            	        case 1 :
                            	            // InternalMyDslParser.g:763:8: this_NEWLINE_8= RULE_NEWLINE
                            	            {
                            	            this_NEWLINE_8=(Token)match(input,RULE_NEWLINE,FOLLOW_18); 

                            	            								newLeafNode(this_NEWLINE_8, grammarAccess.getStrategyAccess().getNEWLINETerminalRuleCall_1_2_1_1_1());
                            	            							

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt23 >= 1 ) break loop23;
                                        EarlyExitException eee =
                                            new EarlyExitException(23, input);
                                        throw eee;
                                }
                                cnt23++;
                            } while (true);

                            this_END_9=(Token)match(input,RULE_END,FOLLOW_25); 

                            						newLeafNode(this_END_9, grammarAccess.getStrategyAccess().getENDTerminalRuleCall_1_2_1_2());
                            					

                            }
                            break;

                    }

                    // InternalMyDslParser.g:774:5: (otherlv_10= FailFast ( (lv_fail_fast_11_0= ruleEBoolean ) ) (this_NEWLINE_12= RULE_NEWLINE )? )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==FailFast) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalMyDslParser.g:775:6: otherlv_10= FailFast ( (lv_fail_fast_11_0= ruleEBoolean ) ) (this_NEWLINE_12= RULE_NEWLINE )?
                            {
                            otherlv_10=(Token)match(input,FailFast,FOLLOW_20); 

                            						newLeafNode(otherlv_10, grammarAccess.getStrategyAccess().getFailFastKeyword_1_2_2_0());
                            					
                            // InternalMyDslParser.g:779:6: ( (lv_fail_fast_11_0= ruleEBoolean ) )
                            // InternalMyDslParser.g:780:7: (lv_fail_fast_11_0= ruleEBoolean )
                            {
                            // InternalMyDslParser.g:780:7: (lv_fail_fast_11_0= ruleEBoolean )
                            // InternalMyDslParser.g:781:8: lv_fail_fast_11_0= ruleEBoolean
                            {

                            								newCompositeNode(grammarAccess.getStrategyAccess().getFail_fastEBooleanParserRuleCall_1_2_2_1_0());
                            							
                            pushFollow(FOLLOW_26);
                            lv_fail_fast_11_0=ruleEBoolean();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getStrategyRule());
                            								}
                            								set(
                            									current,
                            									"fail_fast",
                            									lv_fail_fast_11_0,
                            									"org.xtext.example.mydsl10.MyDsl.EBoolean");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMyDslParser.g:798:6: (this_NEWLINE_12= RULE_NEWLINE )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==RULE_NEWLINE) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // InternalMyDslParser.g:799:7: this_NEWLINE_12= RULE_NEWLINE
                                    {
                                    this_NEWLINE_12=(Token)match(input,RULE_NEWLINE,FOLLOW_27); 

                                    							newLeafNode(this_NEWLINE_12, grammarAccess.getStrategyAccess().getNEWLINETerminalRuleCall_1_2_2_2());
                                    						

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            this_END_13=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_13, grammarAccess.getStrategyAccess().getENDTerminalRuleCall_1_3());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleSteps"
    // InternalMyDslParser.g:815:1: entryRuleSteps returns [EObject current=null] : iv_ruleSteps= ruleSteps EOF ;
    public final EObject entryRuleSteps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSteps = null;


        try {
            // InternalMyDslParser.g:815:46: (iv_ruleSteps= ruleSteps EOF )
            // InternalMyDslParser.g:816:2: iv_ruleSteps= ruleSteps EOF
            {
             newCompositeNode(grammarAccess.getStepsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSteps=ruleSteps();

            state._fsp--;

             current =iv_ruleSteps; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSteps"


    // $ANTLR start "ruleSteps"
    // InternalMyDslParser.g:822:1: ruleSteps returns [EObject current=null] : (otherlv_0= Steps (this_BEGIN_1= RULE_BEGIN ( ( ( (lv_steps_2_1= ruleIFThenElseSteps | lv_steps_2_2= ruleStepOptions ) ) ) (this_NEWLINE_3= RULE_NEWLINE )? )+ this_END_4= RULE_END )? ) ;
    public final EObject ruleSteps() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_NEWLINE_3=null;
        Token this_END_4=null;
        EObject lv_steps_2_1 = null;

        EObject lv_steps_2_2 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:828:2: ( (otherlv_0= Steps (this_BEGIN_1= RULE_BEGIN ( ( ( (lv_steps_2_1= ruleIFThenElseSteps | lv_steps_2_2= ruleStepOptions ) ) ) (this_NEWLINE_3= RULE_NEWLINE )? )+ this_END_4= RULE_END )? ) )
            // InternalMyDslParser.g:829:2: (otherlv_0= Steps (this_BEGIN_1= RULE_BEGIN ( ( ( (lv_steps_2_1= ruleIFThenElseSteps | lv_steps_2_2= ruleStepOptions ) ) ) (this_NEWLINE_3= RULE_NEWLINE )? )+ this_END_4= RULE_END )? )
            {
            // InternalMyDslParser.g:829:2: (otherlv_0= Steps (this_BEGIN_1= RULE_BEGIN ( ( ( (lv_steps_2_1= ruleIFThenElseSteps | lv_steps_2_2= ruleStepOptions ) ) ) (this_NEWLINE_3= RULE_NEWLINE )? )+ this_END_4= RULE_END )? )
            // InternalMyDslParser.g:830:3: otherlv_0= Steps (this_BEGIN_1= RULE_BEGIN ( ( ( (lv_steps_2_1= ruleIFThenElseSteps | lv_steps_2_2= ruleStepOptions ) ) ) (this_NEWLINE_3= RULE_NEWLINE )? )+ this_END_4= RULE_END )?
            {
            otherlv_0=(Token)match(input,Steps,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getStepsAccess().getStepsKeyword_0());
            		
            // InternalMyDslParser.g:834:3: (this_BEGIN_1= RULE_BEGIN ( ( ( (lv_steps_2_1= ruleIFThenElseSteps | lv_steps_2_2= ruleStepOptions ) ) ) (this_NEWLINE_3= RULE_NEWLINE )? )+ this_END_4= RULE_END )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_BEGIN) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDslParser.g:835:4: this_BEGIN_1= RULE_BEGIN ( ( ( (lv_steps_2_1= ruleIFThenElseSteps | lv_steps_2_2= ruleStepOptions ) ) ) (this_NEWLINE_3= RULE_NEWLINE )? )+ this_END_4= RULE_END
                    {
                    this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_28); 

                    				newLeafNode(this_BEGIN_1, grammarAccess.getStepsAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalMyDslParser.g:839:4: ( ( ( (lv_steps_2_1= ruleIFThenElseSteps | lv_steps_2_2= ruleStepOptions ) ) ) (this_NEWLINE_3= RULE_NEWLINE )? )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=Uses_1 && LA30_0<=If_1)||LA30_0==Run_2||LA30_0==Uses||LA30_0==Env||LA30_0==If||LA30_0==RULE_NAME) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalMyDslParser.g:840:5: ( ( (lv_steps_2_1= ruleIFThenElseSteps | lv_steps_2_2= ruleStepOptions ) ) ) (this_NEWLINE_3= RULE_NEWLINE )?
                    	    {
                    	    // InternalMyDslParser.g:840:5: ( ( (lv_steps_2_1= ruleIFThenElseSteps | lv_steps_2_2= ruleStepOptions ) ) )
                    	    // InternalMyDslParser.g:841:6: ( (lv_steps_2_1= ruleIFThenElseSteps | lv_steps_2_2= ruleStepOptions ) )
                    	    {
                    	    // InternalMyDslParser.g:841:6: ( (lv_steps_2_1= ruleIFThenElseSteps | lv_steps_2_2= ruleStepOptions ) )
                    	    // InternalMyDslParser.g:842:7: (lv_steps_2_1= ruleIFThenElseSteps | lv_steps_2_2= ruleStepOptions )
                    	    {
                    	    // InternalMyDslParser.g:842:7: (lv_steps_2_1= ruleIFThenElseSteps | lv_steps_2_2= ruleStepOptions )
                    	    int alt28=2;
                    	    int LA28_0 = input.LA(1);

                    	    if ( (LA28_0==If_1||LA28_0==If) ) {
                    	        alt28=1;
                    	    }
                    	    else if ( (LA28_0==Uses_1||LA28_0==Run_2||LA28_0==Uses||LA28_0==Env||LA28_0==RULE_NAME) ) {
                    	        alt28=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 28, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt28) {
                    	        case 1 :
                    	            // InternalMyDslParser.g:843:8: lv_steps_2_1= ruleIFThenElseSteps
                    	            {

                    	            								newCompositeNode(grammarAccess.getStepsAccess().getStepsIFThenElseStepsParserRuleCall_1_1_0_0_0());
                    	            							
                    	            pushFollow(FOLLOW_29);
                    	            lv_steps_2_1=ruleIFThenElseSteps();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getStepsRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"steps",
                    	            									lv_steps_2_1,
                    	            									"org.xtext.example.mydsl10.MyDsl.IFThenElseSteps");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMyDslParser.g:859:8: lv_steps_2_2= ruleStepOptions
                    	            {

                    	            								newCompositeNode(grammarAccess.getStepsAccess().getStepsStepOptionsParserRuleCall_1_1_0_0_1());
                    	            							
                    	            pushFollow(FOLLOW_29);
                    	            lv_steps_2_2=ruleStepOptions();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getStepsRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"steps",
                    	            									lv_steps_2_2,
                    	            									"org.xtext.example.mydsl10.MyDsl.StepOptions");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // InternalMyDslParser.g:877:5: (this_NEWLINE_3= RULE_NEWLINE )?
                    	    int alt29=2;
                    	    int LA29_0 = input.LA(1);

                    	    if ( (LA29_0==RULE_NEWLINE) ) {
                    	        alt29=1;
                    	    }
                    	    switch (alt29) {
                    	        case 1 :
                    	            // InternalMyDslParser.g:878:6: this_NEWLINE_3= RULE_NEWLINE
                    	            {
                    	            this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_30); 

                    	            						newLeafNode(this_NEWLINE_3, grammarAccess.getStepsAccess().getNEWLINETerminalRuleCall_1_1_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);

                    this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_4, grammarAccess.getStepsAccess().getENDTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSteps"


    // $ANTLR start "entryRuleStepOptions"
    // InternalMyDslParser.g:893:1: entryRuleStepOptions returns [EObject current=null] : iv_ruleStepOptions= ruleStepOptions EOF ;
    public final EObject entryRuleStepOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepOptions = null;


        try {
            // InternalMyDslParser.g:893:52: (iv_ruleStepOptions= ruleStepOptions EOF )
            // InternalMyDslParser.g:894:2: iv_ruleStepOptions= ruleStepOptions EOF
            {
             newCompositeNode(grammarAccess.getStepOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStepOptions=ruleStepOptions();

            state._fsp--;

             current =iv_ruleStepOptions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStepOptions"


    // $ANTLR start "ruleStepOptions"
    // InternalMyDslParser.g:900:1: ruleStepOptions returns [EObject current=null] : ( ( (lv_stepOption_0_1= ruleSteps1 | lv_stepOption_0_2= ruleSteps2 | lv_stepOption_0_3= ruleSteps3 ) ) ) ;
    public final EObject ruleStepOptions() throws RecognitionException {
        EObject current = null;

        EObject lv_stepOption_0_1 = null;

        EObject lv_stepOption_0_2 = null;

        EObject lv_stepOption_0_3 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:906:2: ( ( ( (lv_stepOption_0_1= ruleSteps1 | lv_stepOption_0_2= ruleSteps2 | lv_stepOption_0_3= ruleSteps3 ) ) ) )
            // InternalMyDslParser.g:907:2: ( ( (lv_stepOption_0_1= ruleSteps1 | lv_stepOption_0_2= ruleSteps2 | lv_stepOption_0_3= ruleSteps3 ) ) )
            {
            // InternalMyDslParser.g:907:2: ( ( (lv_stepOption_0_1= ruleSteps1 | lv_stepOption_0_2= ruleSteps2 | lv_stepOption_0_3= ruleSteps3 ) ) )
            // InternalMyDslParser.g:908:3: ( (lv_stepOption_0_1= ruleSteps1 | lv_stepOption_0_2= ruleSteps2 | lv_stepOption_0_3= ruleSteps3 ) )
            {
            // InternalMyDslParser.g:908:3: ( (lv_stepOption_0_1= ruleSteps1 | lv_stepOption_0_2= ruleSteps2 | lv_stepOption_0_3= ruleSteps3 ) )
            // InternalMyDslParser.g:909:4: (lv_stepOption_0_1= ruleSteps1 | lv_stepOption_0_2= ruleSteps2 | lv_stepOption_0_3= ruleSteps3 )
            {
            // InternalMyDslParser.g:909:4: (lv_stepOption_0_1= ruleSteps1 | lv_stepOption_0_2= ruleSteps2 | lv_stepOption_0_3= ruleSteps3 )
            int alt32=3;
            switch ( input.LA(1) ) {
            case Uses_1:
            case Uses:
                {
                alt32=1;
                }
                break;
            case Env:
                {
                alt32=2;
                }
                break;
            case Run_2:
            case RULE_NAME:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalMyDslParser.g:910:5: lv_stepOption_0_1= ruleSteps1
                    {

                    					newCompositeNode(grammarAccess.getStepOptionsAccess().getStepOptionSteps1ParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_stepOption_0_1=ruleSteps1();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStepOptionsRule());
                    					}
                    					set(
                    						current,
                    						"stepOption",
                    						lv_stepOption_0_1,
                    						"org.xtext.example.mydsl10.MyDsl.Steps1");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:926:5: lv_stepOption_0_2= ruleSteps2
                    {

                    					newCompositeNode(grammarAccess.getStepOptionsAccess().getStepOptionSteps2ParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_stepOption_0_2=ruleSteps2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStepOptionsRule());
                    					}
                    					set(
                    						current,
                    						"stepOption",
                    						lv_stepOption_0_2,
                    						"org.xtext.example.mydsl10.MyDsl.Steps2");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDslParser.g:942:5: lv_stepOption_0_3= ruleSteps3
                    {

                    					newCompositeNode(grammarAccess.getStepOptionsAccess().getStepOptionSteps3ParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_stepOption_0_3=ruleSteps3();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStepOptionsRule());
                    					}
                    					set(
                    						current,
                    						"stepOption",
                    						lv_stepOption_0_3,
                    						"org.xtext.example.mydsl10.MyDsl.Steps3");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStepOptions"


    // $ANTLR start "entryRuleSteps1"
    // InternalMyDslParser.g:963:1: entryRuleSteps1 returns [EObject current=null] : iv_ruleSteps1= ruleSteps1 EOF ;
    public final EObject entryRuleSteps1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSteps1 = null;


        try {
            // InternalMyDslParser.g:963:47: (iv_ruleSteps1= ruleSteps1 EOF )
            // InternalMyDslParser.g:964:2: iv_ruleSteps1= ruleSteps1 EOF
            {
             newCompositeNode(grammarAccess.getSteps1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSteps1=ruleSteps1();

            state._fsp--;

             current =iv_ruleSteps1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSteps1"


    // $ANTLR start "ruleSteps1"
    // InternalMyDslParser.g:970:1: ruleSteps1 returns [EObject current=null] : ( ( (otherlv_0= Uses_1 | otherlv_1= Uses ) ( (lv_tool_framework_step_2_0= ruleTool_framework ) ) ) (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= With | otherlv_5= Env ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_environemnt_job_7_0= ruleEnvironment ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )* (this_NEWLINE_10= RULE_NEWLINE )? )+ this_END_11= RULE_END )? ) ;
    public final EObject ruleSteps1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_NEWLINE_8=null;
        Token this_END_9=null;
        Token this_NEWLINE_10=null;
        Token this_END_11=null;
        EObject lv_tool_framework_step_2_0 = null;

        EObject lv_environemnt_job_7_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:976:2: ( ( ( (otherlv_0= Uses_1 | otherlv_1= Uses ) ( (lv_tool_framework_step_2_0= ruleTool_framework ) ) ) (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= With | otherlv_5= Env ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_environemnt_job_7_0= ruleEnvironment ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )* (this_NEWLINE_10= RULE_NEWLINE )? )+ this_END_11= RULE_END )? ) )
            // InternalMyDslParser.g:977:2: ( ( (otherlv_0= Uses_1 | otherlv_1= Uses ) ( (lv_tool_framework_step_2_0= ruleTool_framework ) ) ) (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= With | otherlv_5= Env ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_environemnt_job_7_0= ruleEnvironment ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )* (this_NEWLINE_10= RULE_NEWLINE )? )+ this_END_11= RULE_END )? )
            {
            // InternalMyDslParser.g:977:2: ( ( (otherlv_0= Uses_1 | otherlv_1= Uses ) ( (lv_tool_framework_step_2_0= ruleTool_framework ) ) ) (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= With | otherlv_5= Env ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_environemnt_job_7_0= ruleEnvironment ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )* (this_NEWLINE_10= RULE_NEWLINE )? )+ this_END_11= RULE_END )? )
            // InternalMyDslParser.g:978:3: ( (otherlv_0= Uses_1 | otherlv_1= Uses ) ( (lv_tool_framework_step_2_0= ruleTool_framework ) ) ) (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= With | otherlv_5= Env ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_environemnt_job_7_0= ruleEnvironment ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )* (this_NEWLINE_10= RULE_NEWLINE )? )+ this_END_11= RULE_END )?
            {
            // InternalMyDslParser.g:978:3: ( (otherlv_0= Uses_1 | otherlv_1= Uses ) ( (lv_tool_framework_step_2_0= ruleTool_framework ) ) )
            // InternalMyDslParser.g:979:4: (otherlv_0= Uses_1 | otherlv_1= Uses ) ( (lv_tool_framework_step_2_0= ruleTool_framework ) )
            {
            // InternalMyDslParser.g:979:4: (otherlv_0= Uses_1 | otherlv_1= Uses )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Uses_1) ) {
                alt33=1;
            }
            else if ( (LA33_0==Uses) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDslParser.g:980:5: otherlv_0= Uses_1
                    {
                    otherlv_0=(Token)match(input,Uses_1,FOLLOW_16); 

                    					newLeafNode(otherlv_0, grammarAccess.getSteps1Access().getUsesKeyword_0_0_0());
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:985:5: otherlv_1= Uses
                    {
                    otherlv_1=(Token)match(input,Uses,FOLLOW_16); 

                    					newLeafNode(otherlv_1, grammarAccess.getSteps1Access().getUsesKeyword_0_0_1());
                    				

                    }
                    break;

            }

            // InternalMyDslParser.g:990:4: ( (lv_tool_framework_step_2_0= ruleTool_framework ) )
            // InternalMyDslParser.g:991:5: (lv_tool_framework_step_2_0= ruleTool_framework )
            {
            // InternalMyDslParser.g:991:5: (lv_tool_framework_step_2_0= ruleTool_framework )
            // InternalMyDslParser.g:992:6: lv_tool_framework_step_2_0= ruleTool_framework
            {

            						newCompositeNode(grammarAccess.getSteps1Access().getTool_framework_stepTool_frameworkParserRuleCall_0_1_0());
            					
            pushFollow(FOLLOW_12);
            lv_tool_framework_step_2_0=ruleTool_framework();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getSteps1Rule());
            						}
            						add(
            							current,
            							"tool_framework_step",
            							lv_tool_framework_step_2_0,
            							"org.xtext.example.mydsl10.MyDsl.Tool_framework");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDslParser.g:1010:3: (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= With | otherlv_5= Env ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_environemnt_job_7_0= ruleEnvironment ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )* (this_NEWLINE_10= RULE_NEWLINE )? )+ this_END_11= RULE_END )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_BEGIN) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDslParser.g:1011:4: this_BEGIN_3= RULE_BEGIN ( (otherlv_4= With | otherlv_5= Env ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_environemnt_job_7_0= ruleEnvironment ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )* (this_NEWLINE_10= RULE_NEWLINE )? )+ this_END_11= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_31); 

                    				newLeafNode(this_BEGIN_3, grammarAccess.getSteps1Access().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalMyDslParser.g:1015:4: ( (otherlv_4= With | otherlv_5= Env ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_environemnt_job_7_0= ruleEnvironment ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )* (this_NEWLINE_10= RULE_NEWLINE )? )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( ((LA39_0>=With && LA39_0<=Env)) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1016:5: (otherlv_4= With | otherlv_5= Env ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_environemnt_job_7_0= ruleEnvironment ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )* (this_NEWLINE_10= RULE_NEWLINE )?
                    	    {
                    	    // InternalMyDslParser.g:1016:5: (otherlv_4= With | otherlv_5= Env )
                    	    int alt34=2;
                    	    int LA34_0 = input.LA(1);

                    	    if ( (LA34_0==With) ) {
                    	        alt34=1;
                    	    }
                    	    else if ( (LA34_0==Env) ) {
                    	        alt34=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 34, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt34) {
                    	        case 1 :
                    	            // InternalMyDslParser.g:1017:6: otherlv_4= With
                    	            {
                    	            otherlv_4=(Token)match(input,With,FOLLOW_32); 

                    	            						newLeafNode(otherlv_4, grammarAccess.getSteps1Access().getWithKeyword_1_1_0_0());
                    	            					

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMyDslParser.g:1022:6: otherlv_5= Env
                    	            {
                    	            otherlv_5=(Token)match(input,Env,FOLLOW_32); 

                    	            						newLeafNode(otherlv_5, grammarAccess.getSteps1Access().getEnvKeyword_1_1_0_1());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalMyDslParser.g:1027:5: (this_BEGIN_6= RULE_BEGIN ( ( (lv_environemnt_job_7_0= ruleEnvironment ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END )*
                    	    loop37:
                    	    do {
                    	        int alt37=2;
                    	        int LA37_0 = input.LA(1);

                    	        if ( (LA37_0==RULE_BEGIN) ) {
                    	            alt37=1;
                    	        }


                    	        switch (alt37) {
                    	    	case 1 :
                    	    	    // InternalMyDslParser.g:1028:6: this_BEGIN_6= RULE_BEGIN ( ( (lv_environemnt_job_7_0= ruleEnvironment ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ this_END_9= RULE_END
                    	    	    {
                    	    	    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_9); 

                    	    	    						newLeafNode(this_BEGIN_6, grammarAccess.getSteps1Access().getBEGINTerminalRuleCall_1_1_1_0());
                    	    	    					
                    	    	    // InternalMyDslParser.g:1032:6: ( ( (lv_environemnt_job_7_0= ruleEnvironment ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+
                    	    	    int cnt36=0;
                    	    	    loop36:
                    	    	    do {
                    	    	        int alt36=2;
                    	    	        int LA36_0 = input.LA(1);

                    	    	        if ( (LA36_0==Path||LA36_0==RULE_TRIGGERS||LA36_0==RULE_KEY) ) {
                    	    	            alt36=1;
                    	    	        }


                    	    	        switch (alt36) {
                    	    	    	case 1 :
                    	    	    	    // InternalMyDslParser.g:1033:7: ( (lv_environemnt_job_7_0= ruleEnvironment ) ) (this_NEWLINE_8= RULE_NEWLINE )?
                    	    	    	    {
                    	    	    	    // InternalMyDslParser.g:1033:7: ( (lv_environemnt_job_7_0= ruleEnvironment ) )
                    	    	    	    // InternalMyDslParser.g:1034:8: (lv_environemnt_job_7_0= ruleEnvironment )
                    	    	    	    {
                    	    	    	    // InternalMyDslParser.g:1034:8: (lv_environemnt_job_7_0= ruleEnvironment )
                    	    	    	    // InternalMyDslParser.g:1035:9: lv_environemnt_job_7_0= ruleEnvironment
                    	    	    	    {

                    	    	    	    									newCompositeNode(grammarAccess.getSteps1Access().getEnvironemnt_jobEnvironmentParserRuleCall_1_1_1_1_0_0());
                    	    	    	    								
                    	    	    	    pushFollow(FOLLOW_9);
                    	    	    	    lv_environemnt_job_7_0=ruleEnvironment();

                    	    	    	    state._fsp--;


                    	    	    	    									if (current==null) {
                    	    	    	    										current = createModelElementForParent(grammarAccess.getSteps1Rule());
                    	    	    	    									}
                    	    	    	    									add(
                    	    	    	    										current,
                    	    	    	    										"environemnt_job",
                    	    	    	    										lv_environemnt_job_7_0,
                    	    	    	    										"org.xtext.example.mydsl10.MyDsl.Environment");
                    	    	    	    									afterParserOrEnumRuleCall();
                    	    	    	    								

                    	    	    	    }


                    	    	    	    }

                    	    	    	    // InternalMyDslParser.g:1052:7: (this_NEWLINE_8= RULE_NEWLINE )?
                    	    	    	    int alt35=2;
                    	    	    	    int LA35_0 = input.LA(1);

                    	    	    	    if ( (LA35_0==RULE_NEWLINE) ) {
                    	    	    	        alt35=1;
                    	    	    	    }
                    	    	    	    switch (alt35) {
                    	    	    	        case 1 :
                    	    	    	            // InternalMyDslParser.g:1053:8: this_NEWLINE_8= RULE_NEWLINE
                    	    	    	            {
                    	    	    	            this_NEWLINE_8=(Token)match(input,RULE_NEWLINE,FOLLOW_9); 

                    	    	    	            								newLeafNode(this_NEWLINE_8, grammarAccess.getSteps1Access().getNEWLINETerminalRuleCall_1_1_1_1_1());
                    	    	    	            							

                    	    	    	            }
                    	    	    	            break;

                    	    	    	    }


                    	    	    	    }
                    	    	    	    break;

                    	    	    	default :
                    	    	    	    if ( cnt36 >= 1 ) break loop36;
                    	    	                EarlyExitException eee =
                    	    	                    new EarlyExitException(36, input);
                    	    	                throw eee;
                    	    	        }
                    	    	        cnt36++;
                    	    	    } while (true);

                    	    	    this_END_9=(Token)match(input,RULE_END,FOLLOW_32); 

                    	    	    						newLeafNode(this_END_9, grammarAccess.getSteps1Access().getENDTerminalRuleCall_1_1_1_2());
                    	    	    					

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop37;
                    	        }
                    	    } while (true);

                    	    // InternalMyDslParser.g:1064:5: (this_NEWLINE_10= RULE_NEWLINE )?
                    	    int alt38=2;
                    	    int LA38_0 = input.LA(1);

                    	    if ( (LA38_0==RULE_NEWLINE) ) {
                    	        alt38=1;
                    	    }
                    	    switch (alt38) {
                    	        case 1 :
                    	            // InternalMyDslParser.g:1065:6: this_NEWLINE_10= RULE_NEWLINE
                    	            {
                    	            this_NEWLINE_10=(Token)match(input,RULE_NEWLINE,FOLLOW_33); 

                    	            						newLeafNode(this_NEWLINE_10, grammarAccess.getSteps1Access().getNEWLINETerminalRuleCall_1_1_2());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);

                    this_END_11=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_11, grammarAccess.getSteps1Access().getENDTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSteps1"


    // $ANTLR start "entryRuleSteps2"
    // InternalMyDslParser.g:1080:1: entryRuleSteps2 returns [EObject current=null] : iv_ruleSteps2= ruleSteps2 EOF ;
    public final EObject entryRuleSteps2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSteps2 = null;


        try {
            // InternalMyDslParser.g:1080:47: (iv_ruleSteps2= ruleSteps2 EOF )
            // InternalMyDslParser.g:1081:2: iv_ruleSteps2= ruleSteps2 EOF
            {
             newCompositeNode(grammarAccess.getSteps2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSteps2=ruleSteps2();

            state._fsp--;

             current =iv_ruleSteps2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSteps2"


    // $ANTLR start "ruleSteps2"
    // InternalMyDslParser.g:1087:1: ruleSteps2 returns [EObject current=null] : (otherlv_0= Env (this_BEGIN_1= RULE_BEGIN ( ( (lv_depends_2_0= ruleEnvironment ) ) this_NEWLINE_3= RULE_NEWLINE )* this_END_4= RULE_END ) ) ;
    public final EObject ruleSteps2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_NEWLINE_3=null;
        Token this_END_4=null;
        EObject lv_depends_2_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1093:2: ( (otherlv_0= Env (this_BEGIN_1= RULE_BEGIN ( ( (lv_depends_2_0= ruleEnvironment ) ) this_NEWLINE_3= RULE_NEWLINE )* this_END_4= RULE_END ) ) )
            // InternalMyDslParser.g:1094:2: (otherlv_0= Env (this_BEGIN_1= RULE_BEGIN ( ( (lv_depends_2_0= ruleEnvironment ) ) this_NEWLINE_3= RULE_NEWLINE )* this_END_4= RULE_END ) )
            {
            // InternalMyDslParser.g:1094:2: (otherlv_0= Env (this_BEGIN_1= RULE_BEGIN ( ( (lv_depends_2_0= ruleEnvironment ) ) this_NEWLINE_3= RULE_NEWLINE )* this_END_4= RULE_END ) )
            // InternalMyDslParser.g:1095:3: otherlv_0= Env (this_BEGIN_1= RULE_BEGIN ( ( (lv_depends_2_0= ruleEnvironment ) ) this_NEWLINE_3= RULE_NEWLINE )* this_END_4= RULE_END )
            {
            otherlv_0=(Token)match(input,Env,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSteps2Access().getEnvKeyword_0());
            		
            // InternalMyDslParser.g:1099:3: (this_BEGIN_1= RULE_BEGIN ( ( (lv_depends_2_0= ruleEnvironment ) ) this_NEWLINE_3= RULE_NEWLINE )* this_END_4= RULE_END )
            // InternalMyDslParser.g:1100:4: this_BEGIN_1= RULE_BEGIN ( ( (lv_depends_2_0= ruleEnvironment ) ) this_NEWLINE_3= RULE_NEWLINE )* this_END_4= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_9); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getSteps2Access().getBEGINTerminalRuleCall_1_0());
            			
            // InternalMyDslParser.g:1104:4: ( ( (lv_depends_2_0= ruleEnvironment ) ) this_NEWLINE_3= RULE_NEWLINE )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==Path||LA41_0==RULE_TRIGGERS||LA41_0==RULE_KEY) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMyDslParser.g:1105:5: ( (lv_depends_2_0= ruleEnvironment ) ) this_NEWLINE_3= RULE_NEWLINE
            	    {
            	    // InternalMyDslParser.g:1105:5: ( (lv_depends_2_0= ruleEnvironment ) )
            	    // InternalMyDslParser.g:1106:6: (lv_depends_2_0= ruleEnvironment )
            	    {
            	    // InternalMyDslParser.g:1106:6: (lv_depends_2_0= ruleEnvironment )
            	    // InternalMyDslParser.g:1107:7: lv_depends_2_0= ruleEnvironment
            	    {

            	    							newCompositeNode(grammarAccess.getSteps2Access().getDependsEnvironmentParserRuleCall_1_1_0_0());
            	    						
            	    pushFollow(FOLLOW_34);
            	    lv_depends_2_0=ruleEnvironment();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getSteps2Rule());
            	    							}
            	    							add(
            	    								current,
            	    								"depends",
            	    								lv_depends_2_0,
            	    								"org.xtext.example.mydsl10.MyDsl.Environment");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_9); 

            	    					newLeafNode(this_NEWLINE_3, grammarAccess.getSteps2Access().getNEWLINETerminalRuleCall_1_1_1());
            	    				

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getSteps2Access().getENDTerminalRuleCall_1_2());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSteps2"


    // $ANTLR start "entryRuleSteps3"
    // InternalMyDslParser.g:1138:1: entryRuleSteps3 returns [EObject current=null] : iv_ruleSteps3= ruleSteps3 EOF ;
    public final EObject entryRuleSteps3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSteps3 = null;


        try {
            // InternalMyDslParser.g:1138:47: (iv_ruleSteps3= ruleSteps3 EOF )
            // InternalMyDslParser.g:1139:2: iv_ruleSteps3= ruleSteps3 EOF
            {
             newCompositeNode(grammarAccess.getSteps3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSteps3=ruleSteps3();

            state._fsp--;

             current =iv_ruleSteps3; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSteps3"


    // $ANTLR start "ruleSteps3"
    // InternalMyDslParser.g:1145:1: ruleSteps3 returns [EObject current=null] : ( (lv_command_0_0= ruleCommand ) ) ;
    public final EObject ruleSteps3() throws RecognitionException {
        EObject current = null;

        EObject lv_command_0_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1151:2: ( ( (lv_command_0_0= ruleCommand ) ) )
            // InternalMyDslParser.g:1152:2: ( (lv_command_0_0= ruleCommand ) )
            {
            // InternalMyDslParser.g:1152:2: ( (lv_command_0_0= ruleCommand ) )
            // InternalMyDslParser.g:1153:3: (lv_command_0_0= ruleCommand )
            {
            // InternalMyDslParser.g:1153:3: (lv_command_0_0= ruleCommand )
            // InternalMyDslParser.g:1154:4: lv_command_0_0= ruleCommand
            {

            				newCompositeNode(grammarAccess.getSteps3Access().getCommandCommandParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_command_0_0=ruleCommand();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSteps3Rule());
            				}
            				add(
            					current,
            					"command",
            					lv_command_0_0,
            					"org.xtext.example.mydsl10.MyDsl.Command");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSteps3"


    // $ANTLR start "entryRuleTool_framework"
    // InternalMyDslParser.g:1174:1: entryRuleTool_framework returns [EObject current=null] : iv_ruleTool_framework= ruleTool_framework EOF ;
    public final EObject entryRuleTool_framework() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTool_framework = null;


        try {
            // InternalMyDslParser.g:1174:55: (iv_ruleTool_framework= ruleTool_framework EOF )
            // InternalMyDslParser.g:1175:2: iv_ruleTool_framework= ruleTool_framework EOF
            {
             newCompositeNode(grammarAccess.getTool_frameworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTool_framework=ruleTool_framework();

            state._fsp--;

             current =iv_ruleTool_framework; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTool_framework"


    // $ANTLR start "ruleTool_framework"
    // InternalMyDslParser.g:1181:1: ruleTool_framework returns [EObject current=null] : ( () ( (lv_Name5_1_0= RULE_ALPHANUMERICSTRING ) ) ) ;
    public final EObject ruleTool_framework() throws RecognitionException {
        EObject current = null;

        Token lv_Name5_1_0=null;


        	enterRule();

        try {
            // InternalMyDslParser.g:1187:2: ( ( () ( (lv_Name5_1_0= RULE_ALPHANUMERICSTRING ) ) ) )
            // InternalMyDslParser.g:1188:2: ( () ( (lv_Name5_1_0= RULE_ALPHANUMERICSTRING ) ) )
            {
            // InternalMyDslParser.g:1188:2: ( () ( (lv_Name5_1_0= RULE_ALPHANUMERICSTRING ) ) )
            // InternalMyDslParser.g:1189:3: () ( (lv_Name5_1_0= RULE_ALPHANUMERICSTRING ) )
            {
            // InternalMyDslParser.g:1189:3: ()
            // InternalMyDslParser.g:1190:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTool_frameworkAccess().getTool_frameworkAction_0(),
            					current);
            			

            }

            // InternalMyDslParser.g:1196:3: ( (lv_Name5_1_0= RULE_ALPHANUMERICSTRING ) )
            // InternalMyDslParser.g:1197:4: (lv_Name5_1_0= RULE_ALPHANUMERICSTRING )
            {
            // InternalMyDslParser.g:1197:4: (lv_Name5_1_0= RULE_ALPHANUMERICSTRING )
            // InternalMyDslParser.g:1198:5: lv_Name5_1_0= RULE_ALPHANUMERICSTRING
            {
            lv_Name5_1_0=(Token)match(input,RULE_ALPHANUMERICSTRING,FOLLOW_2); 

            					newLeafNode(lv_Name5_1_0, grammarAccess.getTool_frameworkAccess().getName5ALPHANUMERICSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTool_frameworkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name5",
            						lv_Name5_1_0,
            						"org.xtext.example.mydsl10.MyDsl.ALPHANUMERICSTRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTool_framework"


    // $ANTLR start "entryRuleEnvironment"
    // InternalMyDslParser.g:1218:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalMyDslParser.g:1218:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalMyDslParser.g:1219:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalMyDslParser.g:1225:1: ruleEnvironment returns [EObject current=null] : ( ( ( ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) ) ) ( (lv_Value_1_0= ruleEString ) ) ) | ( (otherlv_2= Path | ( (lv_Key_3_0= RULE_KEY ) ) ) (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= HyphenMinusSpace )? ( (lv_Value_6_0= RULE_ALPHANUMERICSTRING ) ) )* this_END_7= RULE_END )? ) ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token lv_Key_0_1=null;
        Token lv_Key_0_2=null;
        Token otherlv_2=null;
        Token lv_Key_3_0=null;
        Token this_BEGIN_4=null;
        Token otherlv_5=null;
        Token lv_Value_6_0=null;
        Token this_END_7=null;
        AntlrDatatypeRuleToken lv_Value_1_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1231:2: ( ( ( ( ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) ) ) ( (lv_Value_1_0= ruleEString ) ) ) | ( (otherlv_2= Path | ( (lv_Key_3_0= RULE_KEY ) ) ) (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= HyphenMinusSpace )? ( (lv_Value_6_0= RULE_ALPHANUMERICSTRING ) ) )* this_END_7= RULE_END )? ) ) )
            // InternalMyDslParser.g:1232:2: ( ( ( ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) ) ) ( (lv_Value_1_0= ruleEString ) ) ) | ( (otherlv_2= Path | ( (lv_Key_3_0= RULE_KEY ) ) ) (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= HyphenMinusSpace )? ( (lv_Value_6_0= RULE_ALPHANUMERICSTRING ) ) )* this_END_7= RULE_END )? ) )
            {
            // InternalMyDslParser.g:1232:2: ( ( ( ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) ) ) ( (lv_Value_1_0= ruleEString ) ) ) | ( (otherlv_2= Path | ( (lv_Key_3_0= RULE_KEY ) ) ) (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= HyphenMinusSpace )? ( (lv_Value_6_0= RULE_ALPHANUMERICSTRING ) ) )* this_END_7= RULE_END )? ) )
            int alt47=2;
            switch ( input.LA(1) ) {
            case RULE_KEY:
                {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==False||LA47_1==True||LA47_1==RULE_TRIGGER_WORDS||LA47_1==RULE_ALPHANUMERICSTRING||LA47_1==RULE_STRING) ) {
                    alt47=1;
                }
                else if ( (LA47_1==EOF||LA47_1==Path||LA47_1==Jobs||LA47_1==Env||LA47_1==On||(LA47_1>=RULE_NAME && LA47_1<=RULE_TRIGGERS)||(LA47_1>=RULE_KEY && LA47_1<=RULE_END)) ) {
                    alt47=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_TRIGGERS:
                {
                alt47=1;
                }
                break;
            case Path:
                {
                alt47=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalMyDslParser.g:1233:3: ( ( ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) ) ) ( (lv_Value_1_0= ruleEString ) ) )
                    {
                    // InternalMyDslParser.g:1233:3: ( ( ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) ) ) ( (lv_Value_1_0= ruleEString ) ) )
                    // InternalMyDslParser.g:1234:4: ( ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) ) ) ( (lv_Value_1_0= ruleEString ) )
                    {
                    // InternalMyDslParser.g:1234:4: ( ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) ) )
                    // InternalMyDslParser.g:1235:5: ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) )
                    {
                    // InternalMyDslParser.g:1235:5: ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) )
                    // InternalMyDslParser.g:1236:6: (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS )
                    {
                    // InternalMyDslParser.g:1236:6: (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_KEY) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==RULE_TRIGGERS) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalMyDslParser.g:1237:7: lv_Key_0_1= RULE_KEY
                            {
                            lv_Key_0_1=(Token)match(input,RULE_KEY,FOLLOW_3); 

                            							newLeafNode(lv_Key_0_1, grammarAccess.getEnvironmentAccess().getKeyKEYTerminalRuleCall_0_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEnvironmentRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"Key",
                            								lv_Key_0_1,
                            								"org.xtext.example.mydsl10.MyDsl.KEY");
                            						

                            }
                            break;
                        case 2 :
                            // InternalMyDslParser.g:1252:7: lv_Key_0_2= RULE_TRIGGERS
                            {
                            lv_Key_0_2=(Token)match(input,RULE_TRIGGERS,FOLLOW_3); 

                            							newLeafNode(lv_Key_0_2, grammarAccess.getEnvironmentAccess().getKeyTRIGGERSTerminalRuleCall_0_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEnvironmentRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"Key",
                            								lv_Key_0_2,
                            								"org.xtext.example.mydsl10.MyDsl.TRIGGERS");
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalMyDslParser.g:1269:4: ( (lv_Value_1_0= ruleEString ) )
                    // InternalMyDslParser.g:1270:5: (lv_Value_1_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1270:5: (lv_Value_1_0= ruleEString )
                    // InternalMyDslParser.g:1271:6: lv_Value_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getValueEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Value_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						set(
                    							current,
                    							"Value",
                    							lv_Value_1_0,
                    							"org.xtext.example.mydsl10.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:1290:3: ( (otherlv_2= Path | ( (lv_Key_3_0= RULE_KEY ) ) ) (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= HyphenMinusSpace )? ( (lv_Value_6_0= RULE_ALPHANUMERICSTRING ) ) )* this_END_7= RULE_END )? )
                    {
                    // InternalMyDslParser.g:1290:3: ( (otherlv_2= Path | ( (lv_Key_3_0= RULE_KEY ) ) ) (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= HyphenMinusSpace )? ( (lv_Value_6_0= RULE_ALPHANUMERICSTRING ) ) )* this_END_7= RULE_END )? )
                    // InternalMyDslParser.g:1291:4: (otherlv_2= Path | ( (lv_Key_3_0= RULE_KEY ) ) ) (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= HyphenMinusSpace )? ( (lv_Value_6_0= RULE_ALPHANUMERICSTRING ) ) )* this_END_7= RULE_END )?
                    {
                    // InternalMyDslParser.g:1291:4: (otherlv_2= Path | ( (lv_Key_3_0= RULE_KEY ) ) )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==Path) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==RULE_KEY) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalMyDslParser.g:1292:5: otherlv_2= Path
                            {
                            otherlv_2=(Token)match(input,Path,FOLLOW_12); 

                            					newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getPathKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDslParser.g:1297:5: ( (lv_Key_3_0= RULE_KEY ) )
                            {
                            // InternalMyDslParser.g:1297:5: ( (lv_Key_3_0= RULE_KEY ) )
                            // InternalMyDslParser.g:1298:6: (lv_Key_3_0= RULE_KEY )
                            {
                            // InternalMyDslParser.g:1298:6: (lv_Key_3_0= RULE_KEY )
                            // InternalMyDslParser.g:1299:7: lv_Key_3_0= RULE_KEY
                            {
                            lv_Key_3_0=(Token)match(input,RULE_KEY,FOLLOW_12); 

                            							newLeafNode(lv_Key_3_0, grammarAccess.getEnvironmentAccess().getKeyKEYTerminalRuleCall_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEnvironmentRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"Key",
                            								lv_Key_3_0,
                            								"org.xtext.example.mydsl10.MyDsl.KEY");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalMyDslParser.g:1316:4: (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= HyphenMinusSpace )? ( (lv_Value_6_0= RULE_ALPHANUMERICSTRING ) ) )* this_END_7= RULE_END )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_BEGIN) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalMyDslParser.g:1317:5: this_BEGIN_4= RULE_BEGIN ( (otherlv_5= HyphenMinusSpace )? ( (lv_Value_6_0= RULE_ALPHANUMERICSTRING ) ) )* this_END_7= RULE_END
                            {
                            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_35); 

                            					newLeafNode(this_BEGIN_4, grammarAccess.getEnvironmentAccess().getBEGINTerminalRuleCall_1_1_0());
                            				
                            // InternalMyDslParser.g:1321:5: ( (otherlv_5= HyphenMinusSpace )? ( (lv_Value_6_0= RULE_ALPHANUMERICSTRING ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==HyphenMinusSpace||LA45_0==RULE_ALPHANUMERICSTRING) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // InternalMyDslParser.g:1322:6: (otherlv_5= HyphenMinusSpace )? ( (lv_Value_6_0= RULE_ALPHANUMERICSTRING ) )
                            	    {
                            	    // InternalMyDslParser.g:1322:6: (otherlv_5= HyphenMinusSpace )?
                            	    int alt44=2;
                            	    int LA44_0 = input.LA(1);

                            	    if ( (LA44_0==HyphenMinusSpace) ) {
                            	        alt44=1;
                            	    }
                            	    switch (alt44) {
                            	        case 1 :
                            	            // InternalMyDslParser.g:1323:7: otherlv_5= HyphenMinusSpace
                            	            {
                            	            otherlv_5=(Token)match(input,HyphenMinusSpace,FOLLOW_16); 

                            	            							newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getHyphenMinusSpaceKeyword_1_1_1_0());
                            	            						

                            	            }
                            	            break;

                            	    }

                            	    // InternalMyDslParser.g:1328:6: ( (lv_Value_6_0= RULE_ALPHANUMERICSTRING ) )
                            	    // InternalMyDslParser.g:1329:7: (lv_Value_6_0= RULE_ALPHANUMERICSTRING )
                            	    {
                            	    // InternalMyDslParser.g:1329:7: (lv_Value_6_0= RULE_ALPHANUMERICSTRING )
                            	    // InternalMyDslParser.g:1330:8: lv_Value_6_0= RULE_ALPHANUMERICSTRING
                            	    {
                            	    lv_Value_6_0=(Token)match(input,RULE_ALPHANUMERICSTRING,FOLLOW_35); 

                            	    								newLeafNode(lv_Value_6_0, grammarAccess.getEnvironmentAccess().getValueALPHANUMERICSTRINGTerminalRuleCall_1_1_1_1_0());
                            	    							

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getEnvironmentRule());
                            	    								}
                            	    								setWithLastConsumed(
                            	    									current,
                            	    									"Value",
                            	    									lv_Value_6_0,
                            	    									"org.xtext.example.mydsl10.MyDsl.ALPHANUMERICSTRING");
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);

                            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

                            					newLeafNode(this_END_7, grammarAccess.getEnvironmentAccess().getENDTerminalRuleCall_1_1_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleArtifact"
    // InternalMyDslParser.g:1357:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalMyDslParser.g:1357:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalMyDslParser.g:1358:2: iv_ruleArtifact= ruleArtifact EOF
            {
             newCompositeNode(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtifact=ruleArtifact();

            state._fsp--;

             current =iv_ruleArtifact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // InternalMyDslParser.g:1364:1: ruleArtifact returns [EObject current=null] : ( ( ( ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) ) ) ( (lv_Value_1_0= ruleEString ) ) ) | ( ( (lv_Key_2_0= RULE_KEY ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_Value_4_0= ruleEString ) ) this_END_5= RULE_END ) ) ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token lv_Key_0_1=null;
        Token lv_Key_0_2=null;
        Token lv_Key_2_0=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_Value_1_0 = null;

        AntlrDatatypeRuleToken lv_Value_4_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1370:2: ( ( ( ( ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) ) ) ( (lv_Value_1_0= ruleEString ) ) ) | ( ( (lv_Key_2_0= RULE_KEY ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_Value_4_0= ruleEString ) ) this_END_5= RULE_END ) ) ) )
            // InternalMyDslParser.g:1371:2: ( ( ( ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) ) ) ( (lv_Value_1_0= ruleEString ) ) ) | ( ( (lv_Key_2_0= RULE_KEY ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_Value_4_0= ruleEString ) ) this_END_5= RULE_END ) ) )
            {
            // InternalMyDslParser.g:1371:2: ( ( ( ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) ) ) ( (lv_Value_1_0= ruleEString ) ) ) | ( ( (lv_Key_2_0= RULE_KEY ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_Value_4_0= ruleEString ) ) this_END_5= RULE_END ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_KEY) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==RULE_BEGIN) ) {
                    alt49=2;
                }
                else if ( (LA49_1==False||LA49_1==True||LA49_1==RULE_TRIGGER_WORDS||LA49_1==RULE_ALPHANUMERICSTRING||LA49_1==RULE_STRING) ) {
                    alt49=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA49_0==RULE_TRIGGERS) ) {
                alt49=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDslParser.g:1372:3: ( ( ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) ) ) ( (lv_Value_1_0= ruleEString ) ) )
                    {
                    // InternalMyDslParser.g:1372:3: ( ( ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) ) ) ( (lv_Value_1_0= ruleEString ) ) )
                    // InternalMyDslParser.g:1373:4: ( ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) ) ) ( (lv_Value_1_0= ruleEString ) )
                    {
                    // InternalMyDslParser.g:1373:4: ( ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) ) )
                    // InternalMyDslParser.g:1374:5: ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) )
                    {
                    // InternalMyDslParser.g:1374:5: ( (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS ) )
                    // InternalMyDslParser.g:1375:6: (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS )
                    {
                    // InternalMyDslParser.g:1375:6: (lv_Key_0_1= RULE_KEY | lv_Key_0_2= RULE_TRIGGERS )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_KEY) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==RULE_TRIGGERS) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalMyDslParser.g:1376:7: lv_Key_0_1= RULE_KEY
                            {
                            lv_Key_0_1=(Token)match(input,RULE_KEY,FOLLOW_3); 

                            							newLeafNode(lv_Key_0_1, grammarAccess.getArtifactAccess().getKeyKEYTerminalRuleCall_0_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArtifactRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"Key",
                            								lv_Key_0_1,
                            								"org.xtext.example.mydsl10.MyDsl.KEY");
                            						

                            }
                            break;
                        case 2 :
                            // InternalMyDslParser.g:1391:7: lv_Key_0_2= RULE_TRIGGERS
                            {
                            lv_Key_0_2=(Token)match(input,RULE_TRIGGERS,FOLLOW_3); 

                            							newLeafNode(lv_Key_0_2, grammarAccess.getArtifactAccess().getKeyTRIGGERSTerminalRuleCall_0_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArtifactRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"Key",
                            								lv_Key_0_2,
                            								"org.xtext.example.mydsl10.MyDsl.TRIGGERS");
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalMyDslParser.g:1408:4: ( (lv_Value_1_0= ruleEString ) )
                    // InternalMyDslParser.g:1409:5: (lv_Value_1_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1409:5: (lv_Value_1_0= ruleEString )
                    // InternalMyDslParser.g:1410:6: lv_Value_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getArtifactAccess().getValueEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Value_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArtifactRule());
                    						}
                    						set(
                    							current,
                    							"Value",
                    							lv_Value_1_0,
                    							"org.xtext.example.mydsl10.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:1429:3: ( ( (lv_Key_2_0= RULE_KEY ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_Value_4_0= ruleEString ) ) this_END_5= RULE_END ) )
                    {
                    // InternalMyDslParser.g:1429:3: ( ( (lv_Key_2_0= RULE_KEY ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_Value_4_0= ruleEString ) ) this_END_5= RULE_END ) )
                    // InternalMyDslParser.g:1430:4: ( (lv_Key_2_0= RULE_KEY ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_Value_4_0= ruleEString ) ) this_END_5= RULE_END )
                    {
                    // InternalMyDslParser.g:1430:4: ( (lv_Key_2_0= RULE_KEY ) )
                    // InternalMyDslParser.g:1431:5: (lv_Key_2_0= RULE_KEY )
                    {
                    // InternalMyDslParser.g:1431:5: (lv_Key_2_0= RULE_KEY )
                    // InternalMyDslParser.g:1432:6: lv_Key_2_0= RULE_KEY
                    {
                    lv_Key_2_0=(Token)match(input,RULE_KEY,FOLLOW_8); 

                    						newLeafNode(lv_Key_2_0, grammarAccess.getArtifactAccess().getKeyKEYTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getArtifactRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Key",
                    							lv_Key_2_0,
                    							"org.xtext.example.mydsl10.MyDsl.KEY");
                    					

                    }


                    }

                    // InternalMyDslParser.g:1448:4: (this_BEGIN_3= RULE_BEGIN ( (lv_Value_4_0= ruleEString ) ) this_END_5= RULE_END )
                    // InternalMyDslParser.g:1449:5: this_BEGIN_3= RULE_BEGIN ( (lv_Value_4_0= ruleEString ) ) this_END_5= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_3); 

                    					newLeafNode(this_BEGIN_3, grammarAccess.getArtifactAccess().getBEGINTerminalRuleCall_1_1_0());
                    				
                    // InternalMyDslParser.g:1453:5: ( (lv_Value_4_0= ruleEString ) )
                    // InternalMyDslParser.g:1454:6: (lv_Value_4_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1454:6: (lv_Value_4_0= ruleEString )
                    // InternalMyDslParser.g:1455:7: lv_Value_4_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getArtifactAccess().getValueEStringParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_27);
                    lv_Value_4_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getArtifactRule());
                    							}
                    							set(
                    								current,
                    								"Value",
                    								lv_Value_4_0,
                    								"org.xtext.example.mydsl10.MyDsl.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

                    					newLeafNode(this_END_5, grammarAccess.getArtifactAccess().getENDTerminalRuleCall_1_1_2());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDslParser.g:1482:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalMyDslParser.g:1482:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalMyDslParser.g:1483:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalMyDslParser.g:1489:1: ruleCommand returns [EObject current=null] : (this_Command1_0= ruleCommand1 | this_Command2_1= ruleCommand2 ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Command1_0 = null;

        EObject this_Command2_1 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1495:2: ( (this_Command1_0= ruleCommand1 | this_Command2_1= ruleCommand2 ) )
            // InternalMyDslParser.g:1496:2: (this_Command1_0= ruleCommand1 | this_Command2_1= ruleCommand2 )
            {
            // InternalMyDslParser.g:1496:2: (this_Command1_0= ruleCommand1 | this_Command2_1= ruleCommand2 )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Run_2) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_NAME) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDslParser.g:1497:3: this_Command1_0= ruleCommand1
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCommand1ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Command1_0=ruleCommand1();

                    state._fsp--;


                    			current = this_Command1_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:1506:3: this_Command2_1= ruleCommand2
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCommand2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Command2_1=ruleCommand2();

                    state._fsp--;


                    			current = this_Command2_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleCommand1"
    // InternalMyDslParser.g:1518:1: entryRuleCommand1 returns [EObject current=null] : iv_ruleCommand1= ruleCommand1 EOF ;
    public final EObject entryRuleCommand1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand1 = null;


        try {
            // InternalMyDslParser.g:1518:49: (iv_ruleCommand1= ruleCommand1 EOF )
            // InternalMyDslParser.g:1519:2: iv_ruleCommand1= ruleCommand1 EOF
            {
             newCompositeNode(grammarAccess.getCommand1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand1=ruleCommand1();

            state._fsp--;

             current =iv_ruleCommand1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand1"


    // $ANTLR start "ruleCommand1"
    // InternalMyDslParser.g:1525:1: ruleCommand1 returns [EObject current=null] : (otherlv_0= Run_2 ( ( (lv_tool_1_0= ruleTool_framework ) ) ( (lv_Parameters_2_0= ruleEString ) )? ) (this_BEGIN_3= RULE_BEGIN otherlv_4= Env (this_BEGIN_5= RULE_BEGIN ( (lv_environment_command_6_0= ruleEnvironment ) )+ this_END_7= RULE_END ) this_END_8= RULE_END )? ) ;
    public final EObject ruleCommand1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        Token this_END_8=null;
        EObject lv_tool_1_0 = null;

        AntlrDatatypeRuleToken lv_Parameters_2_0 = null;

        EObject lv_environment_command_6_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1531:2: ( (otherlv_0= Run_2 ( ( (lv_tool_1_0= ruleTool_framework ) ) ( (lv_Parameters_2_0= ruleEString ) )? ) (this_BEGIN_3= RULE_BEGIN otherlv_4= Env (this_BEGIN_5= RULE_BEGIN ( (lv_environment_command_6_0= ruleEnvironment ) )+ this_END_7= RULE_END ) this_END_8= RULE_END )? ) )
            // InternalMyDslParser.g:1532:2: (otherlv_0= Run_2 ( ( (lv_tool_1_0= ruleTool_framework ) ) ( (lv_Parameters_2_0= ruleEString ) )? ) (this_BEGIN_3= RULE_BEGIN otherlv_4= Env (this_BEGIN_5= RULE_BEGIN ( (lv_environment_command_6_0= ruleEnvironment ) )+ this_END_7= RULE_END ) this_END_8= RULE_END )? )
            {
            // InternalMyDslParser.g:1532:2: (otherlv_0= Run_2 ( ( (lv_tool_1_0= ruleTool_framework ) ) ( (lv_Parameters_2_0= ruleEString ) )? ) (this_BEGIN_3= RULE_BEGIN otherlv_4= Env (this_BEGIN_5= RULE_BEGIN ( (lv_environment_command_6_0= ruleEnvironment ) )+ this_END_7= RULE_END ) this_END_8= RULE_END )? )
            // InternalMyDslParser.g:1533:3: otherlv_0= Run_2 ( ( (lv_tool_1_0= ruleTool_framework ) ) ( (lv_Parameters_2_0= ruleEString ) )? ) (this_BEGIN_3= RULE_BEGIN otherlv_4= Env (this_BEGIN_5= RULE_BEGIN ( (lv_environment_command_6_0= ruleEnvironment ) )+ this_END_7= RULE_END ) this_END_8= RULE_END )?
            {
            otherlv_0=(Token)match(input,Run_2,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCommand1Access().getRunKeyword_0());
            		
            // InternalMyDslParser.g:1537:3: ( ( (lv_tool_1_0= ruleTool_framework ) ) ( (lv_Parameters_2_0= ruleEString ) )? )
            // InternalMyDslParser.g:1538:4: ( (lv_tool_1_0= ruleTool_framework ) ) ( (lv_Parameters_2_0= ruleEString ) )?
            {
            // InternalMyDslParser.g:1538:4: ( (lv_tool_1_0= ruleTool_framework ) )
            // InternalMyDslParser.g:1539:5: (lv_tool_1_0= ruleTool_framework )
            {
            // InternalMyDslParser.g:1539:5: (lv_tool_1_0= ruleTool_framework )
            // InternalMyDslParser.g:1540:6: lv_tool_1_0= ruleTool_framework
            {

            						newCompositeNode(grammarAccess.getCommand1Access().getToolTool_frameworkParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_36);
            lv_tool_1_0=ruleTool_framework();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCommand1Rule());
            						}
            						add(
            							current,
            							"tool",
            							lv_tool_1_0,
            							"org.xtext.example.mydsl10.MyDsl.Tool_framework");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMyDslParser.g:1557:4: ( (lv_Parameters_2_0= ruleEString ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==False||LA51_0==True||LA51_0==RULE_TRIGGER_WORDS||LA51_0==RULE_ALPHANUMERICSTRING||LA51_0==RULE_STRING) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDslParser.g:1558:5: (lv_Parameters_2_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1558:5: (lv_Parameters_2_0= ruleEString )
                    // InternalMyDslParser.g:1559:6: lv_Parameters_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommand1Access().getParametersEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_Parameters_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommand1Rule());
                    						}
                    						add(
                    							current,
                    							"Parameters",
                    							lv_Parameters_2_0,
                    							"org.xtext.example.mydsl10.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }


            }

            // InternalMyDslParser.g:1577:3: (this_BEGIN_3= RULE_BEGIN otherlv_4= Env (this_BEGIN_5= RULE_BEGIN ( (lv_environment_command_6_0= ruleEnvironment ) )+ this_END_7= RULE_END ) this_END_8= RULE_END )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_BEGIN) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDslParser.g:1578:4: this_BEGIN_3= RULE_BEGIN otherlv_4= Env (this_BEGIN_5= RULE_BEGIN ( (lv_environment_command_6_0= ruleEnvironment ) )+ this_END_7= RULE_END ) this_END_8= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

                    				newLeafNode(this_BEGIN_3, grammarAccess.getCommand1Access().getBEGINTerminalRuleCall_2_0());
                    			
                    otherlv_4=(Token)match(input,Env,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getCommand1Access().getEnvKeyword_2_1());
                    			
                    // InternalMyDslParser.g:1586:4: (this_BEGIN_5= RULE_BEGIN ( (lv_environment_command_6_0= ruleEnvironment ) )+ this_END_7= RULE_END )
                    // InternalMyDslParser.g:1587:5: this_BEGIN_5= RULE_BEGIN ( (lv_environment_command_6_0= ruleEnvironment ) )+ this_END_7= RULE_END
                    {
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_9); 

                    					newLeafNode(this_BEGIN_5, grammarAccess.getCommand1Access().getBEGINTerminalRuleCall_2_2_0());
                    				
                    // InternalMyDslParser.g:1591:5: ( (lv_environment_command_6_0= ruleEnvironment ) )+
                    int cnt52=0;
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==Path||LA52_0==RULE_TRIGGERS||LA52_0==RULE_KEY) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1592:6: (lv_environment_command_6_0= ruleEnvironment )
                    	    {
                    	    // InternalMyDslParser.g:1592:6: (lv_environment_command_6_0= ruleEnvironment )
                    	    // InternalMyDslParser.g:1593:7: lv_environment_command_6_0= ruleEnvironment
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommand1Access().getEnvironment_commandEnvironmentParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_environment_command_6_0=ruleEnvironment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCommand1Rule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"environment_command",
                    	    								lv_environment_command_6_0,
                    	    								"org.xtext.example.mydsl10.MyDsl.Environment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt52 >= 1 ) break loop52;
                                EarlyExitException eee =
                                    new EarlyExitException(52, input);
                                throw eee;
                        }
                        cnt52++;
                    } while (true);

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_27); 

                    					newLeafNode(this_END_7, grammarAccess.getCommand1Access().getENDTerminalRuleCall_2_2_2());
                    				

                    }

                    this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_8, grammarAccess.getCommand1Access().getENDTerminalRuleCall_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand1"


    // $ANTLR start "entryRuleCommand2"
    // InternalMyDslParser.g:1624:1: entryRuleCommand2 returns [EObject current=null] : iv_ruleCommand2= ruleCommand2 EOF ;
    public final EObject entryRuleCommand2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand2 = null;


        try {
            // InternalMyDslParser.g:1624:49: (iv_ruleCommand2= ruleCommand2 EOF )
            // InternalMyDslParser.g:1625:2: iv_ruleCommand2= ruleCommand2 EOF
            {
             newCompositeNode(grammarAccess.getCommand2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand2=ruleCommand2();

            state._fsp--;

             current =iv_ruleCommand2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand2"


    // $ANTLR start "ruleCommand2"
    // InternalMyDslParser.g:1631:1: ruleCommand2 returns [EObject current=null] : (this_NAME_0= RULE_NAME ( (lv_Description_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( ( (lv_command_options_3_1= ruleIFThenElseSteps | lv_command_options_3_2= ruleCommand2Env | lv_command_options_3_3= ruleCommand2RunMultiple | lv_command_options_3_4= ruleCommand2RunOne | lv_command_options_3_5= ruleCommand2Uses | lv_command_options_3_6= ruleCommand2RunTool ) ) )+ this_END_4= RULE_END )? ) ;
    public final EObject ruleCommand2() throws RecognitionException {
        EObject current = null;

        Token this_NAME_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_Description_1_0 = null;

        EObject lv_command_options_3_1 = null;

        EObject lv_command_options_3_2 = null;

        EObject lv_command_options_3_3 = null;

        EObject lv_command_options_3_4 = null;

        EObject lv_command_options_3_5 = null;

        EObject lv_command_options_3_6 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1637:2: ( (this_NAME_0= RULE_NAME ( (lv_Description_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( ( (lv_command_options_3_1= ruleIFThenElseSteps | lv_command_options_3_2= ruleCommand2Env | lv_command_options_3_3= ruleCommand2RunMultiple | lv_command_options_3_4= ruleCommand2RunOne | lv_command_options_3_5= ruleCommand2Uses | lv_command_options_3_6= ruleCommand2RunTool ) ) )+ this_END_4= RULE_END )? ) )
            // InternalMyDslParser.g:1638:2: (this_NAME_0= RULE_NAME ( (lv_Description_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( ( (lv_command_options_3_1= ruleIFThenElseSteps | lv_command_options_3_2= ruleCommand2Env | lv_command_options_3_3= ruleCommand2RunMultiple | lv_command_options_3_4= ruleCommand2RunOne | lv_command_options_3_5= ruleCommand2Uses | lv_command_options_3_6= ruleCommand2RunTool ) ) )+ this_END_4= RULE_END )? )
            {
            // InternalMyDslParser.g:1638:2: (this_NAME_0= RULE_NAME ( (lv_Description_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( ( (lv_command_options_3_1= ruleIFThenElseSteps | lv_command_options_3_2= ruleCommand2Env | lv_command_options_3_3= ruleCommand2RunMultiple | lv_command_options_3_4= ruleCommand2RunOne | lv_command_options_3_5= ruleCommand2Uses | lv_command_options_3_6= ruleCommand2RunTool ) ) )+ this_END_4= RULE_END )? )
            // InternalMyDslParser.g:1639:3: this_NAME_0= RULE_NAME ( (lv_Description_1_0= ruleEString ) ) (this_BEGIN_2= RULE_BEGIN ( ( (lv_command_options_3_1= ruleIFThenElseSteps | lv_command_options_3_2= ruleCommand2Env | lv_command_options_3_3= ruleCommand2RunMultiple | lv_command_options_3_4= ruleCommand2RunOne | lv_command_options_3_5= ruleCommand2Uses | lv_command_options_3_6= ruleCommand2RunTool ) ) )+ this_END_4= RULE_END )?
            {
            this_NAME_0=(Token)match(input,RULE_NAME,FOLLOW_3); 

            			newLeafNode(this_NAME_0, grammarAccess.getCommand2Access().getNAMETerminalRuleCall_0());
            		
            // InternalMyDslParser.g:1643:3: ( (lv_Description_1_0= ruleEString ) )
            // InternalMyDslParser.g:1644:4: (lv_Description_1_0= ruleEString )
            {
            // InternalMyDslParser.g:1644:4: (lv_Description_1_0= ruleEString )
            // InternalMyDslParser.g:1645:5: lv_Description_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommand2Access().getDescriptionEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_Description_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommand2Rule());
            					}
            					add(
            						current,
            						"Description",
            						lv_Description_1_0,
            						"org.xtext.example.mydsl10.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDslParser.g:1662:3: (this_BEGIN_2= RULE_BEGIN ( ( (lv_command_options_3_1= ruleIFThenElseSteps | lv_command_options_3_2= ruleCommand2Env | lv_command_options_3_3= ruleCommand2RunMultiple | lv_command_options_3_4= ruleCommand2RunOne | lv_command_options_3_5= ruleCommand2Uses | lv_command_options_3_6= ruleCommand2RunTool ) ) )+ this_END_4= RULE_END )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_BEGIN) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDslParser.g:1663:4: this_BEGIN_2= RULE_BEGIN ( ( (lv_command_options_3_1= ruleIFThenElseSteps | lv_command_options_3_2= ruleCommand2Env | lv_command_options_3_3= ruleCommand2RunMultiple | lv_command_options_3_4= ruleCommand2RunOne | lv_command_options_3_5= ruleCommand2Uses | lv_command_options_3_6= ruleCommand2RunTool ) ) )+ this_END_4= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_38); 

                    				newLeafNode(this_BEGIN_2, grammarAccess.getCommand2Access().getBEGINTerminalRuleCall_2_0());
                    			
                    // InternalMyDslParser.g:1667:4: ( ( (lv_command_options_3_1= ruleIFThenElseSteps | lv_command_options_3_2= ruleCommand2Env | lv_command_options_3_3= ruleCommand2RunMultiple | lv_command_options_3_4= ruleCommand2RunOne | lv_command_options_3_5= ruleCommand2Uses | lv_command_options_3_6= ruleCommand2RunTool ) ) )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( ((LA55_0>=Uses_1 && LA55_0<=If_1)||(LA55_0>=Run_3 && LA55_0<=Run_5)||(LA55_0>=Run_1 && LA55_0<=Run)||LA55_0==If||LA55_0==RULE_KEY) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1668:5: ( (lv_command_options_3_1= ruleIFThenElseSteps | lv_command_options_3_2= ruleCommand2Env | lv_command_options_3_3= ruleCommand2RunMultiple | lv_command_options_3_4= ruleCommand2RunOne | lv_command_options_3_5= ruleCommand2Uses | lv_command_options_3_6= ruleCommand2RunTool ) )
                    	    {
                    	    // InternalMyDslParser.g:1668:5: ( (lv_command_options_3_1= ruleIFThenElseSteps | lv_command_options_3_2= ruleCommand2Env | lv_command_options_3_3= ruleCommand2RunMultiple | lv_command_options_3_4= ruleCommand2RunOne | lv_command_options_3_5= ruleCommand2Uses | lv_command_options_3_6= ruleCommand2RunTool ) )
                    	    // InternalMyDslParser.g:1669:6: (lv_command_options_3_1= ruleIFThenElseSteps | lv_command_options_3_2= ruleCommand2Env | lv_command_options_3_3= ruleCommand2RunMultiple | lv_command_options_3_4= ruleCommand2RunOne | lv_command_options_3_5= ruleCommand2Uses | lv_command_options_3_6= ruleCommand2RunTool )
                    	    {
                    	    // InternalMyDslParser.g:1669:6: (lv_command_options_3_1= ruleIFThenElseSteps | lv_command_options_3_2= ruleCommand2Env | lv_command_options_3_3= ruleCommand2RunMultiple | lv_command_options_3_4= ruleCommand2RunOne | lv_command_options_3_5= ruleCommand2Uses | lv_command_options_3_6= ruleCommand2RunTool )
                    	    int alt54=6;
                    	    switch ( input.LA(1) ) {
                    	    case If_1:
                    	    case If:
                    	        {
                    	        alt54=1;
                    	        }
                    	        break;
                    	    case With:
                    	    case Env:
                    	        {
                    	        alt54=2;
                    	        }
                    	        break;
                    	    case Run_3:
                    	    case Run_4:
                    	    case Run_5:
                    	        {
                    	        alt54=3;
                    	        }
                    	        break;
                    	    case Run_1:
                    	    case Run:
                    	        {
                    	        alt54=4;
                    	        }
                    	        break;
                    	    case Uses_1:
                    	    case Uses:
                    	        {
                    	        alt54=5;
                    	        }
                    	        break;
                    	    case RULE_KEY:
                    	        {
                    	        alt54=6;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 54, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt54) {
                    	        case 1 :
                    	            // InternalMyDslParser.g:1670:7: lv_command_options_3_1= ruleIFThenElseSteps
                    	            {

                    	            							newCompositeNode(grammarAccess.getCommand2Access().getCommand_optionsIFThenElseStepsParserRuleCall_2_1_0_0());
                    	            						
                    	            pushFollow(FOLLOW_39);
                    	            lv_command_options_3_1=ruleIFThenElseSteps();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getCommand2Rule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"command_options",
                    	            								lv_command_options_3_1,
                    	            								"org.xtext.example.mydsl10.MyDsl.IFThenElseSteps");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMyDslParser.g:1686:7: lv_command_options_3_2= ruleCommand2Env
                    	            {

                    	            							newCompositeNode(grammarAccess.getCommand2Access().getCommand_optionsCommand2EnvParserRuleCall_2_1_0_1());
                    	            						
                    	            pushFollow(FOLLOW_39);
                    	            lv_command_options_3_2=ruleCommand2Env();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getCommand2Rule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"command_options",
                    	            								lv_command_options_3_2,
                    	            								"org.xtext.example.mydsl10.MyDsl.Command2Env");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalMyDslParser.g:1702:7: lv_command_options_3_3= ruleCommand2RunMultiple
                    	            {

                    	            							newCompositeNode(grammarAccess.getCommand2Access().getCommand_optionsCommand2RunMultipleParserRuleCall_2_1_0_2());
                    	            						
                    	            pushFollow(FOLLOW_39);
                    	            lv_command_options_3_3=ruleCommand2RunMultiple();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getCommand2Rule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"command_options",
                    	            								lv_command_options_3_3,
                    	            								"org.xtext.example.mydsl10.MyDsl.Command2RunMultiple");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 4 :
                    	            // InternalMyDslParser.g:1718:7: lv_command_options_3_4= ruleCommand2RunOne
                    	            {

                    	            							newCompositeNode(grammarAccess.getCommand2Access().getCommand_optionsCommand2RunOneParserRuleCall_2_1_0_3());
                    	            						
                    	            pushFollow(FOLLOW_39);
                    	            lv_command_options_3_4=ruleCommand2RunOne();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getCommand2Rule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"command_options",
                    	            								lv_command_options_3_4,
                    	            								"org.xtext.example.mydsl10.MyDsl.Command2RunOne");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 5 :
                    	            // InternalMyDslParser.g:1734:7: lv_command_options_3_5= ruleCommand2Uses
                    	            {

                    	            							newCompositeNode(grammarAccess.getCommand2Access().getCommand_optionsCommand2UsesParserRuleCall_2_1_0_4());
                    	            						
                    	            pushFollow(FOLLOW_39);
                    	            lv_command_options_3_5=ruleCommand2Uses();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getCommand2Rule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"command_options",
                    	            								lv_command_options_3_5,
                    	            								"org.xtext.example.mydsl10.MyDsl.Command2Uses");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 6 :
                    	            // InternalMyDslParser.g:1750:7: lv_command_options_3_6= ruleCommand2RunTool
                    	            {

                    	            							newCompositeNode(grammarAccess.getCommand2Access().getCommand_optionsCommand2RunToolParserRuleCall_2_1_0_5());
                    	            						
                    	            pushFollow(FOLLOW_39);
                    	            lv_command_options_3_6=ruleCommand2RunTool();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getCommand2Rule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"command_options",
                    	            								lv_command_options_3_6,
                    	            								"org.xtext.example.mydsl10.MyDsl.Command2RunTool");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt55 >= 1 ) break loop55;
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
                    } while (true);

                    this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_4, grammarAccess.getCommand2Access().getENDTerminalRuleCall_2_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand2"


    // $ANTLR start "entryRuleCommand2Env"
    // InternalMyDslParser.g:1777:1: entryRuleCommand2Env returns [EObject current=null] : iv_ruleCommand2Env= ruleCommand2Env EOF ;
    public final EObject entryRuleCommand2Env() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand2Env = null;


        try {
            // InternalMyDslParser.g:1777:52: (iv_ruleCommand2Env= ruleCommand2Env EOF )
            // InternalMyDslParser.g:1778:2: iv_ruleCommand2Env= ruleCommand2Env EOF
            {
             newCompositeNode(grammarAccess.getCommand2EnvRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand2Env=ruleCommand2Env();

            state._fsp--;

             current =iv_ruleCommand2Env; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand2Env"


    // $ANTLR start "ruleCommand2Env"
    // InternalMyDslParser.g:1784:1: ruleCommand2Env returns [EObject current=null] : ( (otherlv_0= Env | otherlv_1= With ) (this_BEGIN_2= RULE_BEGIN ( ( (lv_environment_command_3_0= ruleEnvironment ) ) (this_NEWLINE_4= RULE_NEWLINE )? )+ this_END_5= RULE_END )? ) ;
    public final EObject ruleCommand2Env() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_NEWLINE_4=null;
        Token this_END_5=null;
        EObject lv_environment_command_3_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1790:2: ( ( (otherlv_0= Env | otherlv_1= With ) (this_BEGIN_2= RULE_BEGIN ( ( (lv_environment_command_3_0= ruleEnvironment ) ) (this_NEWLINE_4= RULE_NEWLINE )? )+ this_END_5= RULE_END )? ) )
            // InternalMyDslParser.g:1791:2: ( (otherlv_0= Env | otherlv_1= With ) (this_BEGIN_2= RULE_BEGIN ( ( (lv_environment_command_3_0= ruleEnvironment ) ) (this_NEWLINE_4= RULE_NEWLINE )? )+ this_END_5= RULE_END )? )
            {
            // InternalMyDslParser.g:1791:2: ( (otherlv_0= Env | otherlv_1= With ) (this_BEGIN_2= RULE_BEGIN ( ( (lv_environment_command_3_0= ruleEnvironment ) ) (this_NEWLINE_4= RULE_NEWLINE )? )+ this_END_5= RULE_END )? )
            // InternalMyDslParser.g:1792:3: (otherlv_0= Env | otherlv_1= With ) (this_BEGIN_2= RULE_BEGIN ( ( (lv_environment_command_3_0= ruleEnvironment ) ) (this_NEWLINE_4= RULE_NEWLINE )? )+ this_END_5= RULE_END )?
            {
            // InternalMyDslParser.g:1792:3: (otherlv_0= Env | otherlv_1= With )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==Env) ) {
                alt57=1;
            }
            else if ( (LA57_0==With) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDslParser.g:1793:4: otherlv_0= Env
                    {
                    otherlv_0=(Token)match(input,Env,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getCommand2EnvAccess().getEnvKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:1798:4: otherlv_1= With
                    {
                    otherlv_1=(Token)match(input,With,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getCommand2EnvAccess().getWithKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:1803:3: (this_BEGIN_2= RULE_BEGIN ( ( (lv_environment_command_3_0= ruleEnvironment ) ) (this_NEWLINE_4= RULE_NEWLINE )? )+ this_END_5= RULE_END )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_BEGIN) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDslParser.g:1804:4: this_BEGIN_2= RULE_BEGIN ( ( (lv_environment_command_3_0= ruleEnvironment ) ) (this_NEWLINE_4= RULE_NEWLINE )? )+ this_END_5= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_9); 

                    				newLeafNode(this_BEGIN_2, grammarAccess.getCommand2EnvAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalMyDslParser.g:1808:4: ( ( (lv_environment_command_3_0= ruleEnvironment ) ) (this_NEWLINE_4= RULE_NEWLINE )? )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==Path||LA59_0==RULE_TRIGGERS||LA59_0==RULE_KEY) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1809:5: ( (lv_environment_command_3_0= ruleEnvironment ) ) (this_NEWLINE_4= RULE_NEWLINE )?
                    	    {
                    	    // InternalMyDslParser.g:1809:5: ( (lv_environment_command_3_0= ruleEnvironment ) )
                    	    // InternalMyDslParser.g:1810:6: (lv_environment_command_3_0= ruleEnvironment )
                    	    {
                    	    // InternalMyDslParser.g:1810:6: (lv_environment_command_3_0= ruleEnvironment )
                    	    // InternalMyDslParser.g:1811:7: lv_environment_command_3_0= ruleEnvironment
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommand2EnvAccess().getEnvironment_commandEnvironmentParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_environment_command_3_0=ruleEnvironment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCommand2EnvRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"environment_command",
                    	    								lv_environment_command_3_0,
                    	    								"org.xtext.example.mydsl10.MyDsl.Environment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalMyDslParser.g:1828:5: (this_NEWLINE_4= RULE_NEWLINE )?
                    	    int alt58=2;
                    	    int LA58_0 = input.LA(1);

                    	    if ( (LA58_0==RULE_NEWLINE) ) {
                    	        alt58=1;
                    	    }
                    	    switch (alt58) {
                    	        case 1 :
                    	            // InternalMyDslParser.g:1829:6: this_NEWLINE_4= RULE_NEWLINE
                    	            {
                    	            this_NEWLINE_4=(Token)match(input,RULE_NEWLINE,FOLLOW_9); 

                    	            						newLeafNode(this_NEWLINE_4, grammarAccess.getCommand2EnvAccess().getNEWLINETerminalRuleCall_1_1_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt59 >= 1 ) break loop59;
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_5, grammarAccess.getCommand2EnvAccess().getENDTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand2Env"


    // $ANTLR start "entryRuleCommand2RunMultiple"
    // InternalMyDslParser.g:1844:1: entryRuleCommand2RunMultiple returns [EObject current=null] : iv_ruleCommand2RunMultiple= ruleCommand2RunMultiple EOF ;
    public final EObject entryRuleCommand2RunMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand2RunMultiple = null;


        try {
            // InternalMyDslParser.g:1844:60: (iv_ruleCommand2RunMultiple= ruleCommand2RunMultiple EOF )
            // InternalMyDslParser.g:1845:2: iv_ruleCommand2RunMultiple= ruleCommand2RunMultiple EOF
            {
             newCompositeNode(grammarAccess.getCommand2RunMultipleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand2RunMultiple=ruleCommand2RunMultiple();

            state._fsp--;

             current =iv_ruleCommand2RunMultiple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand2RunMultiple"


    // $ANTLR start "ruleCommand2RunMultiple"
    // InternalMyDslParser.g:1851:1: ruleCommand2RunMultiple returns [EObject current=null] : ( (otherlv_0= Run_5 | otherlv_1= Run_3 | otherlv_2= Run_4 ) (this_BEGIN_3= RULE_BEGIN ( ( (lv_Parameters_4_0= ruleEString ) ) this_NEWLINE_5= RULE_NEWLINE )* ( (lv_Parameters_6_0= ruleEString ) ) this_END_7= RULE_END )? ) ;
    public final EObject ruleCommand2RunMultiple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_NEWLINE_5=null;
        Token this_END_7=null;
        AntlrDatatypeRuleToken lv_Parameters_4_0 = null;

        AntlrDatatypeRuleToken lv_Parameters_6_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1857:2: ( ( (otherlv_0= Run_5 | otherlv_1= Run_3 | otherlv_2= Run_4 ) (this_BEGIN_3= RULE_BEGIN ( ( (lv_Parameters_4_0= ruleEString ) ) this_NEWLINE_5= RULE_NEWLINE )* ( (lv_Parameters_6_0= ruleEString ) ) this_END_7= RULE_END )? ) )
            // InternalMyDslParser.g:1858:2: ( (otherlv_0= Run_5 | otherlv_1= Run_3 | otherlv_2= Run_4 ) (this_BEGIN_3= RULE_BEGIN ( ( (lv_Parameters_4_0= ruleEString ) ) this_NEWLINE_5= RULE_NEWLINE )* ( (lv_Parameters_6_0= ruleEString ) ) this_END_7= RULE_END )? )
            {
            // InternalMyDslParser.g:1858:2: ( (otherlv_0= Run_5 | otherlv_1= Run_3 | otherlv_2= Run_4 ) (this_BEGIN_3= RULE_BEGIN ( ( (lv_Parameters_4_0= ruleEString ) ) this_NEWLINE_5= RULE_NEWLINE )* ( (lv_Parameters_6_0= ruleEString ) ) this_END_7= RULE_END )? )
            // InternalMyDslParser.g:1859:3: (otherlv_0= Run_5 | otherlv_1= Run_3 | otherlv_2= Run_4 ) (this_BEGIN_3= RULE_BEGIN ( ( (lv_Parameters_4_0= ruleEString ) ) this_NEWLINE_5= RULE_NEWLINE )* ( (lv_Parameters_6_0= ruleEString ) ) this_END_7= RULE_END )?
            {
            // InternalMyDslParser.g:1859:3: (otherlv_0= Run_5 | otherlv_1= Run_3 | otherlv_2= Run_4 )
            int alt61=3;
            switch ( input.LA(1) ) {
            case Run_5:
                {
                alt61=1;
                }
                break;
            case Run_3:
                {
                alt61=2;
                }
                break;
            case Run_4:
                {
                alt61=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalMyDslParser.g:1860:4: otherlv_0= Run_5
                    {
                    otherlv_0=(Token)match(input,Run_5,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getCommand2RunMultipleAccess().getRunKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:1865:4: otherlv_1= Run_3
                    {
                    otherlv_1=(Token)match(input,Run_3,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getCommand2RunMultipleAccess().getRunKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDslParser.g:1870:4: otherlv_2= Run_4
                    {
                    otherlv_2=(Token)match(input,Run_4,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getCommand2RunMultipleAccess().getRunKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:1875:3: (this_BEGIN_3= RULE_BEGIN ( ( (lv_Parameters_4_0= ruleEString ) ) this_NEWLINE_5= RULE_NEWLINE )* ( (lv_Parameters_6_0= ruleEString ) ) this_END_7= RULE_END )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_BEGIN) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMyDslParser.g:1876:4: this_BEGIN_3= RULE_BEGIN ( ( (lv_Parameters_4_0= ruleEString ) ) this_NEWLINE_5= RULE_NEWLINE )* ( (lv_Parameters_6_0= ruleEString ) ) this_END_7= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_3); 

                    				newLeafNode(this_BEGIN_3, grammarAccess.getCommand2RunMultipleAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalMyDslParser.g:1880:4: ( ( (lv_Parameters_4_0= ruleEString ) ) this_NEWLINE_5= RULE_NEWLINE )*
                    loop62:
                    do {
                        int alt62=2;
                        alt62 = dfa62.predict(input);
                        switch (alt62) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1881:5: ( (lv_Parameters_4_0= ruleEString ) ) this_NEWLINE_5= RULE_NEWLINE
                    	    {
                    	    // InternalMyDslParser.g:1881:5: ( (lv_Parameters_4_0= ruleEString ) )
                    	    // InternalMyDslParser.g:1882:6: (lv_Parameters_4_0= ruleEString )
                    	    {
                    	    // InternalMyDslParser.g:1882:6: (lv_Parameters_4_0= ruleEString )
                    	    // InternalMyDslParser.g:1883:7: lv_Parameters_4_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommand2RunMultipleAccess().getParametersEStringParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    lv_Parameters_4_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCommand2RunMultipleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"Parameters",
                    	    								lv_Parameters_4_0,
                    	    								"org.xtext.example.mydsl10.MyDsl.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    this_NEWLINE_5=(Token)match(input,RULE_NEWLINE,FOLLOW_3); 

                    	    					newLeafNode(this_NEWLINE_5, grammarAccess.getCommand2RunMultipleAccess().getNEWLINETerminalRuleCall_1_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    // InternalMyDslParser.g:1905:4: ( (lv_Parameters_6_0= ruleEString ) )
                    // InternalMyDslParser.g:1906:5: (lv_Parameters_6_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1906:5: (lv_Parameters_6_0= ruleEString )
                    // InternalMyDslParser.g:1907:6: lv_Parameters_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommand2RunMultipleAccess().getParametersEStringParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_Parameters_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommand2RunMultipleRule());
                    						}
                    						add(
                    							current,
                    							"Parameters",
                    							lv_Parameters_6_0,
                    							"org.xtext.example.mydsl10.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_7, grammarAccess.getCommand2RunMultipleAccess().getENDTerminalRuleCall_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand2RunMultiple"


    // $ANTLR start "entryRuleCommand2RunOne"
    // InternalMyDslParser.g:1933:1: entryRuleCommand2RunOne returns [EObject current=null] : iv_ruleCommand2RunOne= ruleCommand2RunOne EOF ;
    public final EObject entryRuleCommand2RunOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand2RunOne = null;


        try {
            // InternalMyDslParser.g:1933:55: (iv_ruleCommand2RunOne= ruleCommand2RunOne EOF )
            // InternalMyDslParser.g:1934:2: iv_ruleCommand2RunOne= ruleCommand2RunOne EOF
            {
             newCompositeNode(grammarAccess.getCommand2RunOneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand2RunOne=ruleCommand2RunOne();

            state._fsp--;

             current =iv_ruleCommand2RunOne; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand2RunOne"


    // $ANTLR start "ruleCommand2RunOne"
    // InternalMyDslParser.g:1940:1: ruleCommand2RunOne returns [EObject current=null] : ( (otherlv_0= Run | otherlv_1= Run_1 ) ( ( (lv_command_conditional_2_0= ruleIFThenElseRun ) ) | ( ( (lv_tool_3_0= ruleTool_framework ) ) ( (lv_Parameters_4_0= ruleEString ) )? ) | ( (lv_command_string_5_0= RULE_STRING ) ) ) (this_NEWLINE_6= RULE_NEWLINE )? ) ;
    public final EObject ruleCommand2RunOne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_command_string_5_0=null;
        Token this_NEWLINE_6=null;
        EObject lv_command_conditional_2_0 = null;

        EObject lv_tool_3_0 = null;

        AntlrDatatypeRuleToken lv_Parameters_4_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1946:2: ( ( (otherlv_0= Run | otherlv_1= Run_1 ) ( ( (lv_command_conditional_2_0= ruleIFThenElseRun ) ) | ( ( (lv_tool_3_0= ruleTool_framework ) ) ( (lv_Parameters_4_0= ruleEString ) )? ) | ( (lv_command_string_5_0= RULE_STRING ) ) ) (this_NEWLINE_6= RULE_NEWLINE )? ) )
            // InternalMyDslParser.g:1947:2: ( (otherlv_0= Run | otherlv_1= Run_1 ) ( ( (lv_command_conditional_2_0= ruleIFThenElseRun ) ) | ( ( (lv_tool_3_0= ruleTool_framework ) ) ( (lv_Parameters_4_0= ruleEString ) )? ) | ( (lv_command_string_5_0= RULE_STRING ) ) ) (this_NEWLINE_6= RULE_NEWLINE )? )
            {
            // InternalMyDslParser.g:1947:2: ( (otherlv_0= Run | otherlv_1= Run_1 ) ( ( (lv_command_conditional_2_0= ruleIFThenElseRun ) ) | ( ( (lv_tool_3_0= ruleTool_framework ) ) ( (lv_Parameters_4_0= ruleEString ) )? ) | ( (lv_command_string_5_0= RULE_STRING ) ) ) (this_NEWLINE_6= RULE_NEWLINE )? )
            // InternalMyDslParser.g:1948:3: (otherlv_0= Run | otherlv_1= Run_1 ) ( ( (lv_command_conditional_2_0= ruleIFThenElseRun ) ) | ( ( (lv_tool_3_0= ruleTool_framework ) ) ( (lv_Parameters_4_0= ruleEString ) )? ) | ( (lv_command_string_5_0= RULE_STRING ) ) ) (this_NEWLINE_6= RULE_NEWLINE )?
            {
            // InternalMyDslParser.g:1948:3: (otherlv_0= Run | otherlv_1= Run_1 )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==Run) ) {
                alt64=1;
            }
            else if ( (LA64_0==Run_1) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalMyDslParser.g:1949:4: otherlv_0= Run
                    {
                    otherlv_0=(Token)match(input,Run,FOLLOW_40); 

                    				newLeafNode(otherlv_0, grammarAccess.getCommand2RunOneAccess().getRunKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:1954:4: otherlv_1= Run_1
                    {
                    otherlv_1=(Token)match(input,Run_1,FOLLOW_40); 

                    				newLeafNode(otherlv_1, grammarAccess.getCommand2RunOneAccess().getRunKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:1959:3: ( ( (lv_command_conditional_2_0= ruleIFThenElseRun ) ) | ( ( (lv_tool_3_0= ruleTool_framework ) ) ( (lv_Parameters_4_0= ruleEString ) )? ) | ( (lv_command_string_5_0= RULE_STRING ) ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case If_1:
                {
                alt66=1;
                }
                break;
            case RULE_ALPHANUMERICSTRING:
                {
                alt66=2;
                }
                break;
            case RULE_STRING:
                {
                alt66=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalMyDslParser.g:1960:4: ( (lv_command_conditional_2_0= ruleIFThenElseRun ) )
                    {
                    // InternalMyDslParser.g:1960:4: ( (lv_command_conditional_2_0= ruleIFThenElseRun ) )
                    // InternalMyDslParser.g:1961:5: (lv_command_conditional_2_0= ruleIFThenElseRun )
                    {
                    // InternalMyDslParser.g:1961:5: (lv_command_conditional_2_0= ruleIFThenElseRun )
                    // InternalMyDslParser.g:1962:6: lv_command_conditional_2_0= ruleIFThenElseRun
                    {

                    						newCompositeNode(grammarAccess.getCommand2RunOneAccess().getCommand_conditionalIFThenElseRunParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_command_conditional_2_0=ruleIFThenElseRun();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommand2RunOneRule());
                    						}
                    						add(
                    							current,
                    							"command_conditional",
                    							lv_command_conditional_2_0,
                    							"org.xtext.example.mydsl10.MyDsl.IFThenElseRun");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:1980:4: ( ( (lv_tool_3_0= ruleTool_framework ) ) ( (lv_Parameters_4_0= ruleEString ) )? )
                    {
                    // InternalMyDslParser.g:1980:4: ( ( (lv_tool_3_0= ruleTool_framework ) ) ( (lv_Parameters_4_0= ruleEString ) )? )
                    // InternalMyDslParser.g:1981:5: ( (lv_tool_3_0= ruleTool_framework ) ) ( (lv_Parameters_4_0= ruleEString ) )?
                    {
                    // InternalMyDslParser.g:1981:5: ( (lv_tool_3_0= ruleTool_framework ) )
                    // InternalMyDslParser.g:1982:6: (lv_tool_3_0= ruleTool_framework )
                    {
                    // InternalMyDslParser.g:1982:6: (lv_tool_3_0= ruleTool_framework )
                    // InternalMyDslParser.g:1983:7: lv_tool_3_0= ruleTool_framework
                    {

                    							newCompositeNode(grammarAccess.getCommand2RunOneAccess().getToolTool_frameworkParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_42);
                    lv_tool_3_0=ruleTool_framework();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCommand2RunOneRule());
                    							}
                    							add(
                    								current,
                    								"tool",
                    								lv_tool_3_0,
                    								"org.xtext.example.mydsl10.MyDsl.Tool_framework");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDslParser.g:2000:5: ( (lv_Parameters_4_0= ruleEString ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==False||LA65_0==True||LA65_0==RULE_TRIGGER_WORDS||LA65_0==RULE_ALPHANUMERICSTRING||LA65_0==RULE_STRING) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalMyDslParser.g:2001:6: (lv_Parameters_4_0= ruleEString )
                            {
                            // InternalMyDslParser.g:2001:6: (lv_Parameters_4_0= ruleEString )
                            // InternalMyDslParser.g:2002:7: lv_Parameters_4_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getCommand2RunOneAccess().getParametersEStringParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_41);
                            lv_Parameters_4_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCommand2RunOneRule());
                            							}
                            							add(
                            								current,
                            								"Parameters",
                            								lv_Parameters_4_0,
                            								"org.xtext.example.mydsl10.MyDsl.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDslParser.g:2021:4: ( (lv_command_string_5_0= RULE_STRING ) )
                    {
                    // InternalMyDslParser.g:2021:4: ( (lv_command_string_5_0= RULE_STRING ) )
                    // InternalMyDslParser.g:2022:5: (lv_command_string_5_0= RULE_STRING )
                    {
                    // InternalMyDslParser.g:2022:5: (lv_command_string_5_0= RULE_STRING )
                    // InternalMyDslParser.g:2023:6: lv_command_string_5_0= RULE_STRING
                    {
                    lv_command_string_5_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

                    						newLeafNode(lv_command_string_5_0, grammarAccess.getCommand2RunOneAccess().getCommand_stringSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommand2RunOneRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"command_string",
                    							lv_command_string_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:2040:3: (this_NEWLINE_6= RULE_NEWLINE )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_NEWLINE) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyDslParser.g:2041:4: this_NEWLINE_6= RULE_NEWLINE
                    {
                    this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                    				newLeafNode(this_NEWLINE_6, grammarAccess.getCommand2RunOneAccess().getNEWLINETerminalRuleCall_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand2RunOne"


    // $ANTLR start "entryRuleCommand2Uses"
    // InternalMyDslParser.g:2050:1: entryRuleCommand2Uses returns [EObject current=null] : iv_ruleCommand2Uses= ruleCommand2Uses EOF ;
    public final EObject entryRuleCommand2Uses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand2Uses = null;


        try {
            // InternalMyDslParser.g:2050:53: (iv_ruleCommand2Uses= ruleCommand2Uses EOF )
            // InternalMyDslParser.g:2051:2: iv_ruleCommand2Uses= ruleCommand2Uses EOF
            {
             newCompositeNode(grammarAccess.getCommand2UsesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand2Uses=ruleCommand2Uses();

            state._fsp--;

             current =iv_ruleCommand2Uses; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand2Uses"


    // $ANTLR start "ruleCommand2Uses"
    // InternalMyDslParser.g:2057:1: ruleCommand2Uses returns [EObject current=null] : ( (otherlv_0= Uses_1 | otherlv_1= Uses ) ( (lv_tool_2_0= ruleTool_framework ) ) (this_NEWLINE_3= RULE_NEWLINE )? ) ;
    public final EObject ruleCommand2Uses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_NEWLINE_3=null;
        EObject lv_tool_2_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:2063:2: ( ( (otherlv_0= Uses_1 | otherlv_1= Uses ) ( (lv_tool_2_0= ruleTool_framework ) ) (this_NEWLINE_3= RULE_NEWLINE )? ) )
            // InternalMyDslParser.g:2064:2: ( (otherlv_0= Uses_1 | otherlv_1= Uses ) ( (lv_tool_2_0= ruleTool_framework ) ) (this_NEWLINE_3= RULE_NEWLINE )? )
            {
            // InternalMyDslParser.g:2064:2: ( (otherlv_0= Uses_1 | otherlv_1= Uses ) ( (lv_tool_2_0= ruleTool_framework ) ) (this_NEWLINE_3= RULE_NEWLINE )? )
            // InternalMyDslParser.g:2065:3: (otherlv_0= Uses_1 | otherlv_1= Uses ) ( (lv_tool_2_0= ruleTool_framework ) ) (this_NEWLINE_3= RULE_NEWLINE )?
            {
            // InternalMyDslParser.g:2065:3: (otherlv_0= Uses_1 | otherlv_1= Uses )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==Uses_1) ) {
                alt68=1;
            }
            else if ( (LA68_0==Uses) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyDslParser.g:2066:4: otherlv_0= Uses_1
                    {
                    otherlv_0=(Token)match(input,Uses_1,FOLLOW_16); 

                    				newLeafNode(otherlv_0, grammarAccess.getCommand2UsesAccess().getUsesKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:2071:4: otherlv_1= Uses
                    {
                    otherlv_1=(Token)match(input,Uses,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getCommand2UsesAccess().getUsesKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:2076:3: ( (lv_tool_2_0= ruleTool_framework ) )
            // InternalMyDslParser.g:2077:4: (lv_tool_2_0= ruleTool_framework )
            {
            // InternalMyDslParser.g:2077:4: (lv_tool_2_0= ruleTool_framework )
            // InternalMyDslParser.g:2078:5: lv_tool_2_0= ruleTool_framework
            {

            					newCompositeNode(grammarAccess.getCommand2UsesAccess().getToolTool_frameworkParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_41);
            lv_tool_2_0=ruleTool_framework();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommand2UsesRule());
            					}
            					add(
            						current,
            						"tool",
            						lv_tool_2_0,
            						"org.xtext.example.mydsl10.MyDsl.Tool_framework");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDslParser.g:2095:3: (this_NEWLINE_3= RULE_NEWLINE )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_NEWLINE) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyDslParser.g:2096:4: this_NEWLINE_3= RULE_NEWLINE
                    {
                    this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                    				newLeafNode(this_NEWLINE_3, grammarAccess.getCommand2UsesAccess().getNEWLINETerminalRuleCall_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand2Uses"


    // $ANTLR start "entryRuleCommand2RunTool"
    // InternalMyDslParser.g:2105:1: entryRuleCommand2RunTool returns [EObject current=null] : iv_ruleCommand2RunTool= ruleCommand2RunTool EOF ;
    public final EObject entryRuleCommand2RunTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand2RunTool = null;


        try {
            // InternalMyDslParser.g:2105:56: (iv_ruleCommand2RunTool= ruleCommand2RunTool EOF )
            // InternalMyDslParser.g:2106:2: iv_ruleCommand2RunTool= ruleCommand2RunTool EOF
            {
             newCompositeNode(grammarAccess.getCommand2RunToolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand2RunTool=ruleCommand2RunTool();

            state._fsp--;

             current =iv_ruleCommand2RunTool; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand2RunTool"


    // $ANTLR start "ruleCommand2RunTool"
    // InternalMyDslParser.g:2112:1: ruleCommand2RunTool returns [EObject current=null] : ( ( (lv_toolkey_0_0= RULE_KEY ) ) ( (lv_Parameters_1_0= ruleEString ) )? (this_NEWLINE_2= RULE_NEWLINE )? ) ;
    public final EObject ruleCommand2RunTool() throws RecognitionException {
        EObject current = null;

        Token lv_toolkey_0_0=null;
        Token this_NEWLINE_2=null;
        AntlrDatatypeRuleToken lv_Parameters_1_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:2118:2: ( ( ( (lv_toolkey_0_0= RULE_KEY ) ) ( (lv_Parameters_1_0= ruleEString ) )? (this_NEWLINE_2= RULE_NEWLINE )? ) )
            // InternalMyDslParser.g:2119:2: ( ( (lv_toolkey_0_0= RULE_KEY ) ) ( (lv_Parameters_1_0= ruleEString ) )? (this_NEWLINE_2= RULE_NEWLINE )? )
            {
            // InternalMyDslParser.g:2119:2: ( ( (lv_toolkey_0_0= RULE_KEY ) ) ( (lv_Parameters_1_0= ruleEString ) )? (this_NEWLINE_2= RULE_NEWLINE )? )
            // InternalMyDslParser.g:2120:3: ( (lv_toolkey_0_0= RULE_KEY ) ) ( (lv_Parameters_1_0= ruleEString ) )? (this_NEWLINE_2= RULE_NEWLINE )?
            {
            // InternalMyDslParser.g:2120:3: ( (lv_toolkey_0_0= RULE_KEY ) )
            // InternalMyDslParser.g:2121:4: (lv_toolkey_0_0= RULE_KEY )
            {
            // InternalMyDslParser.g:2121:4: (lv_toolkey_0_0= RULE_KEY )
            // InternalMyDslParser.g:2122:5: lv_toolkey_0_0= RULE_KEY
            {
            lv_toolkey_0_0=(Token)match(input,RULE_KEY,FOLLOW_42); 

            					newLeafNode(lv_toolkey_0_0, grammarAccess.getCommand2RunToolAccess().getToolkeyKEYTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommand2RunToolRule());
            					}
            					addWithLastConsumed(
            						current,
            						"toolkey",
            						lv_toolkey_0_0,
            						"org.xtext.example.mydsl10.MyDsl.KEY");
            				

            }


            }

            // InternalMyDslParser.g:2138:3: ( (lv_Parameters_1_0= ruleEString ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==False||LA70_0==True||LA70_0==RULE_TRIGGER_WORDS||LA70_0==RULE_ALPHANUMERICSTRING||LA70_0==RULE_STRING) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalMyDslParser.g:2139:4: (lv_Parameters_1_0= ruleEString )
                    {
                    // InternalMyDslParser.g:2139:4: (lv_Parameters_1_0= ruleEString )
                    // InternalMyDslParser.g:2140:5: lv_Parameters_1_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getCommand2RunToolAccess().getParametersEStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_41);
                    lv_Parameters_1_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommand2RunToolRule());
                    					}
                    					add(
                    						current,
                    						"Parameters",
                    						lv_Parameters_1_0,
                    						"org.xtext.example.mydsl10.MyDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:2157:3: (this_NEWLINE_2= RULE_NEWLINE )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_NEWLINE) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMyDslParser.g:2158:4: this_NEWLINE_2= RULE_NEWLINE
                    {
                    this_NEWLINE_2=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                    				newLeafNode(this_NEWLINE_2, grammarAccess.getCommand2RunToolAccess().getNEWLINETerminalRuleCall_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand2RunTool"


    // $ANTLR start "entryRuleIfThenElse"
    // InternalMyDslParser.g:2167:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // InternalMyDslParser.g:2167:51: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // InternalMyDslParser.g:2168:2: iv_ruleIfThenElse= ruleIfThenElse EOF
            {
             newCompositeNode(grammarAccess.getIfThenElseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfThenElse=ruleIfThenElse();

            state._fsp--;

             current =iv_ruleIfThenElse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // InternalMyDslParser.g:2174:1: ruleIfThenElse returns [EObject current=null] : ( ( (lv_alt_0_1= ruleIfThenElse_alt1 | lv_alt_0_2= ruleIFThenElseJobsSteps_alt2 ) ) ) ;
    public final EObject ruleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject lv_alt_0_1 = null;

        EObject lv_alt_0_2 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:2180:2: ( ( ( (lv_alt_0_1= ruleIfThenElse_alt1 | lv_alt_0_2= ruleIFThenElseJobsSteps_alt2 ) ) ) )
            // InternalMyDslParser.g:2181:2: ( ( (lv_alt_0_1= ruleIfThenElse_alt1 | lv_alt_0_2= ruleIFThenElseJobsSteps_alt2 ) ) )
            {
            // InternalMyDslParser.g:2181:2: ( ( (lv_alt_0_1= ruleIfThenElse_alt1 | lv_alt_0_2= ruleIFThenElseJobsSteps_alt2 ) ) )
            // InternalMyDslParser.g:2182:3: ( (lv_alt_0_1= ruleIfThenElse_alt1 | lv_alt_0_2= ruleIFThenElseJobsSteps_alt2 ) )
            {
            // InternalMyDslParser.g:2182:3: ( (lv_alt_0_1= ruleIfThenElse_alt1 | lv_alt_0_2= ruleIFThenElseJobsSteps_alt2 ) )
            // InternalMyDslParser.g:2183:4: (lv_alt_0_1= ruleIfThenElse_alt1 | lv_alt_0_2= ruleIFThenElseJobsSteps_alt2 )
            {
            // InternalMyDslParser.g:2183:4: (lv_alt_0_1= ruleIfThenElse_alt1 | lv_alt_0_2= ruleIFThenElseJobsSteps_alt2 )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==If_1) ) {
                alt72=1;
            }
            else if ( (LA72_0==If) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalMyDslParser.g:2184:5: lv_alt_0_1= ruleIfThenElse_alt1
                    {

                    					newCompositeNode(grammarAccess.getIfThenElseAccess().getAltIfThenElse_alt1ParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_alt_0_1=ruleIfThenElse_alt1();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    					}
                    					set(
                    						current,
                    						"alt",
                    						lv_alt_0_1,
                    						"org.xtext.example.mydsl10.MyDsl.IfThenElse_alt1");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:2200:5: lv_alt_0_2= ruleIFThenElseJobsSteps_alt2
                    {

                    					newCompositeNode(grammarAccess.getIfThenElseAccess().getAltIFThenElseJobsSteps_alt2ParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_alt_0_2=ruleIFThenElseJobsSteps_alt2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    					}
                    					set(
                    						current,
                    						"alt",
                    						lv_alt_0_2,
                    						"org.xtext.example.mydsl10.MyDsl.IFThenElseJobsSteps_alt2");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleIfThenElse_alt1"
    // InternalMyDslParser.g:2221:1: entryRuleIfThenElse_alt1 returns [EObject current=null] : iv_ruleIfThenElse_alt1= ruleIfThenElse_alt1 EOF ;
    public final EObject entryRuleIfThenElse_alt1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse_alt1 = null;


        try {
            // InternalMyDslParser.g:2221:56: (iv_ruleIfThenElse_alt1= ruleIfThenElse_alt1 EOF )
            // InternalMyDslParser.g:2222:2: iv_ruleIfThenElse_alt1= ruleIfThenElse_alt1 EOF
            {
             newCompositeNode(grammarAccess.getIfThenElse_alt1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfThenElse_alt1=ruleIfThenElse_alt1();

            state._fsp--;

             current =iv_ruleIfThenElse_alt1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfThenElse_alt1"


    // $ANTLR start "ruleIfThenElse_alt1"
    // InternalMyDslParser.g:2228:1: ruleIfThenElse_alt1 returns [EObject current=null] : (otherlv_0= If_1 ( (lv_Condition_1_0= ruleEString ) ) (this_NEWLINE_2= RULE_NEWLINE )? ( (lv_if_3_0= ruleJob ) )? (otherlv_4= Else (this_NEWLINE_5= RULE_NEWLINE )? ( (lv_else_6_0= ruleJob ) )? )? otherlv_7= End ) ;
    public final EObject ruleIfThenElse_alt1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_NEWLINE_2=null;
        Token otherlv_4=null;
        Token this_NEWLINE_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_Condition_1_0 = null;

        EObject lv_if_3_0 = null;

        EObject lv_else_6_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:2234:2: ( (otherlv_0= If_1 ( (lv_Condition_1_0= ruleEString ) ) (this_NEWLINE_2= RULE_NEWLINE )? ( (lv_if_3_0= ruleJob ) )? (otherlv_4= Else (this_NEWLINE_5= RULE_NEWLINE )? ( (lv_else_6_0= ruleJob ) )? )? otherlv_7= End ) )
            // InternalMyDslParser.g:2235:2: (otherlv_0= If_1 ( (lv_Condition_1_0= ruleEString ) ) (this_NEWLINE_2= RULE_NEWLINE )? ( (lv_if_3_0= ruleJob ) )? (otherlv_4= Else (this_NEWLINE_5= RULE_NEWLINE )? ( (lv_else_6_0= ruleJob ) )? )? otherlv_7= End )
            {
            // InternalMyDslParser.g:2235:2: (otherlv_0= If_1 ( (lv_Condition_1_0= ruleEString ) ) (this_NEWLINE_2= RULE_NEWLINE )? ( (lv_if_3_0= ruleJob ) )? (otherlv_4= Else (this_NEWLINE_5= RULE_NEWLINE )? ( (lv_else_6_0= ruleJob ) )? )? otherlv_7= End )
            // InternalMyDslParser.g:2236:3: otherlv_0= If_1 ( (lv_Condition_1_0= ruleEString ) ) (this_NEWLINE_2= RULE_NEWLINE )? ( (lv_if_3_0= ruleJob ) )? (otherlv_4= Else (this_NEWLINE_5= RULE_NEWLINE )? ( (lv_else_6_0= ruleJob ) )? )? otherlv_7= End
            {
            otherlv_0=(Token)match(input,If_1,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIfThenElse_alt1Access().getIfKeyword_0());
            		
            // InternalMyDslParser.g:2240:3: ( (lv_Condition_1_0= ruleEString ) )
            // InternalMyDslParser.g:2241:4: (lv_Condition_1_0= ruleEString )
            {
            // InternalMyDslParser.g:2241:4: (lv_Condition_1_0= ruleEString )
            // InternalMyDslParser.g:2242:5: lv_Condition_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIfThenElse_alt1Access().getConditionEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_43);
            lv_Condition_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfThenElse_alt1Rule());
            					}
            					set(
            						current,
            						"Condition",
            						lv_Condition_1_0,
            						"org.xtext.example.mydsl10.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDslParser.g:2259:3: (this_NEWLINE_2= RULE_NEWLINE )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_NEWLINE) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalMyDslParser.g:2260:4: this_NEWLINE_2= RULE_NEWLINE
                    {
                    this_NEWLINE_2=(Token)match(input,RULE_NEWLINE,FOLLOW_44); 

                    				newLeafNode(this_NEWLINE_2, grammarAccess.getIfThenElse_alt1Access().getNEWLINETerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:2265:3: ( (lv_if_3_0= ruleJob ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==Allow_faillure||LA74_0==RULE_KEY) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalMyDslParser.g:2266:4: (lv_if_3_0= ruleJob )
                    {
                    // InternalMyDslParser.g:2266:4: (lv_if_3_0= ruleJob )
                    // InternalMyDslParser.g:2267:5: lv_if_3_0= ruleJob
                    {

                    					newCompositeNode(grammarAccess.getIfThenElse_alt1Access().getIfJobParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_45);
                    lv_if_3_0=ruleJob();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIfThenElse_alt1Rule());
                    					}
                    					add(
                    						current,
                    						"if",
                    						lv_if_3_0,
                    						"org.xtext.example.mydsl10.MyDsl.Job");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:2284:3: (otherlv_4= Else (this_NEWLINE_5= RULE_NEWLINE )? ( (lv_else_6_0= ruleJob ) )? )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==Else) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalMyDslParser.g:2285:4: otherlv_4= Else (this_NEWLINE_5= RULE_NEWLINE )? ( (lv_else_6_0= ruleJob ) )?
                    {
                    otherlv_4=(Token)match(input,Else,FOLLOW_46); 

                    				newLeafNode(otherlv_4, grammarAccess.getIfThenElse_alt1Access().getElseKeyword_4_0());
                    			
                    // InternalMyDslParser.g:2289:4: (this_NEWLINE_5= RULE_NEWLINE )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==RULE_NEWLINE) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalMyDslParser.g:2290:5: this_NEWLINE_5= RULE_NEWLINE
                            {
                            this_NEWLINE_5=(Token)match(input,RULE_NEWLINE,FOLLOW_47); 

                            					newLeafNode(this_NEWLINE_5, grammarAccess.getIfThenElse_alt1Access().getNEWLINETerminalRuleCall_4_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDslParser.g:2295:4: ( (lv_else_6_0= ruleJob ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==Allow_faillure||LA76_0==RULE_KEY) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalMyDslParser.g:2296:5: (lv_else_6_0= ruleJob )
                            {
                            // InternalMyDslParser.g:2296:5: (lv_else_6_0= ruleJob )
                            // InternalMyDslParser.g:2297:6: lv_else_6_0= ruleJob
                            {

                            						newCompositeNode(grammarAccess.getIfThenElse_alt1Access().getElseJobParserRuleCall_4_2_0());
                            					
                            pushFollow(FOLLOW_48);
                            lv_else_6_0=ruleJob();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getIfThenElse_alt1Rule());
                            						}
                            						add(
                            							current,
                            							"else",
                            							lv_else_6_0,
                            							"org.xtext.example.mydsl10.MyDsl.Job");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,End,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIfThenElse_alt1Access().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfThenElse_alt1"


    // $ANTLR start "entryRuleIFThenElseRun"
    // InternalMyDslParser.g:2323:1: entryRuleIFThenElseRun returns [EObject current=null] : iv_ruleIFThenElseRun= ruleIFThenElseRun EOF ;
    public final EObject entryRuleIFThenElseRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIFThenElseRun = null;


        try {
            // InternalMyDslParser.g:2323:54: (iv_ruleIFThenElseRun= ruleIFThenElseRun EOF )
            // InternalMyDslParser.g:2324:2: iv_ruleIFThenElseRun= ruleIFThenElseRun EOF
            {
             newCompositeNode(grammarAccess.getIFThenElseRunRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIFThenElseRun=ruleIFThenElseRun();

            state._fsp--;

             current =iv_ruleIFThenElseRun; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIFThenElseRun"


    // $ANTLR start "ruleIFThenElseRun"
    // InternalMyDslParser.g:2330:1: ruleIFThenElseRun returns [EObject current=null] : (otherlv_0= If_1 ( (lv_Condition_1_0= RULE_ALPHANUMERICSTRING ) ) ( (lv_if_2_0= ruleEString ) )? (otherlv_3= Else ( (lv_else_4_0= ruleEString ) )? )? otherlv_5= End ) ;
    public final EObject ruleIFThenElseRun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Condition_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_if_2_0 = null;

        AntlrDatatypeRuleToken lv_else_4_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:2336:2: ( (otherlv_0= If_1 ( (lv_Condition_1_0= RULE_ALPHANUMERICSTRING ) ) ( (lv_if_2_0= ruleEString ) )? (otherlv_3= Else ( (lv_else_4_0= ruleEString ) )? )? otherlv_5= End ) )
            // InternalMyDslParser.g:2337:2: (otherlv_0= If_1 ( (lv_Condition_1_0= RULE_ALPHANUMERICSTRING ) ) ( (lv_if_2_0= ruleEString ) )? (otherlv_3= Else ( (lv_else_4_0= ruleEString ) )? )? otherlv_5= End )
            {
            // InternalMyDslParser.g:2337:2: (otherlv_0= If_1 ( (lv_Condition_1_0= RULE_ALPHANUMERICSTRING ) ) ( (lv_if_2_0= ruleEString ) )? (otherlv_3= Else ( (lv_else_4_0= ruleEString ) )? )? otherlv_5= End )
            // InternalMyDslParser.g:2338:3: otherlv_0= If_1 ( (lv_Condition_1_0= RULE_ALPHANUMERICSTRING ) ) ( (lv_if_2_0= ruleEString ) )? (otherlv_3= Else ( (lv_else_4_0= ruleEString ) )? )? otherlv_5= End
            {
            otherlv_0=(Token)match(input,If_1,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getIFThenElseRunAccess().getIfKeyword_0());
            		
            // InternalMyDslParser.g:2342:3: ( (lv_Condition_1_0= RULE_ALPHANUMERICSTRING ) )
            // InternalMyDslParser.g:2343:4: (lv_Condition_1_0= RULE_ALPHANUMERICSTRING )
            {
            // InternalMyDslParser.g:2343:4: (lv_Condition_1_0= RULE_ALPHANUMERICSTRING )
            // InternalMyDslParser.g:2344:5: lv_Condition_1_0= RULE_ALPHANUMERICSTRING
            {
            lv_Condition_1_0=(Token)match(input,RULE_ALPHANUMERICSTRING,FOLLOW_49); 

            					newLeafNode(lv_Condition_1_0, grammarAccess.getIFThenElseRunAccess().getConditionALPHANUMERICSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIFThenElseRunRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Condition",
            						lv_Condition_1_0,
            						"org.xtext.example.mydsl10.MyDsl.ALPHANUMERICSTRING");
            				

            }


            }

            // InternalMyDslParser.g:2360:3: ( (lv_if_2_0= ruleEString ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==False||LA78_0==True||LA78_0==RULE_TRIGGER_WORDS||LA78_0==RULE_ALPHANUMERICSTRING||LA78_0==RULE_STRING) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalMyDslParser.g:2361:4: (lv_if_2_0= ruleEString )
                    {
                    // InternalMyDslParser.g:2361:4: (lv_if_2_0= ruleEString )
                    // InternalMyDslParser.g:2362:5: lv_if_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getIFThenElseRunAccess().getIfEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_45);
                    lv_if_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIFThenElseRunRule());
                    					}
                    					set(
                    						current,
                    						"if",
                    						lv_if_2_0,
                    						"org.xtext.example.mydsl10.MyDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:2379:3: (otherlv_3= Else ( (lv_else_4_0= ruleEString ) )? )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==Else) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalMyDslParser.g:2380:4: otherlv_3= Else ( (lv_else_4_0= ruleEString ) )?
                    {
                    otherlv_3=(Token)match(input,Else,FOLLOW_50); 

                    				newLeafNode(otherlv_3, grammarAccess.getIFThenElseRunAccess().getElseKeyword_3_0());
                    			
                    // InternalMyDslParser.g:2384:4: ( (lv_else_4_0= ruleEString ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==False||LA79_0==True||LA79_0==RULE_TRIGGER_WORDS||LA79_0==RULE_ALPHANUMERICSTRING||LA79_0==RULE_STRING) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalMyDslParser.g:2385:5: (lv_else_4_0= ruleEString )
                            {
                            // InternalMyDslParser.g:2385:5: (lv_else_4_0= ruleEString )
                            // InternalMyDslParser.g:2386:6: lv_else_4_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getIFThenElseRunAccess().getElseEStringParserRuleCall_3_1_0());
                            					
                            pushFollow(FOLLOW_48);
                            lv_else_4_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getIFThenElseRunRule());
                            						}
                            						set(
                            							current,
                            							"else",
                            							lv_else_4_0,
                            							"org.xtext.example.mydsl10.MyDsl.EString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,End,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIFThenElseRunAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIFThenElseRun"


    // $ANTLR start "entryRuleIFThenElseSteps"
    // InternalMyDslParser.g:2412:1: entryRuleIFThenElseSteps returns [EObject current=null] : iv_ruleIFThenElseSteps= ruleIFThenElseSteps EOF ;
    public final EObject entryRuleIFThenElseSteps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIFThenElseSteps = null;


        try {
            // InternalMyDslParser.g:2412:56: (iv_ruleIFThenElseSteps= ruleIFThenElseSteps EOF )
            // InternalMyDslParser.g:2413:2: iv_ruleIFThenElseSteps= ruleIFThenElseSteps EOF
            {
             newCompositeNode(grammarAccess.getIFThenElseStepsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIFThenElseSteps=ruleIFThenElseSteps();

            state._fsp--;

             current =iv_ruleIFThenElseSteps; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIFThenElseSteps"


    // $ANTLR start "ruleIFThenElseSteps"
    // InternalMyDslParser.g:2419:1: ruleIFThenElseSteps returns [EObject current=null] : ( ( (lv_alt_0_1= ruleIFThenElseSteps_alt1 | lv_alt_0_2= ruleIFThenElseJobsSteps_alt2 ) ) ) ;
    public final EObject ruleIFThenElseSteps() throws RecognitionException {
        EObject current = null;

        EObject lv_alt_0_1 = null;

        EObject lv_alt_0_2 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:2425:2: ( ( ( (lv_alt_0_1= ruleIFThenElseSteps_alt1 | lv_alt_0_2= ruleIFThenElseJobsSteps_alt2 ) ) ) )
            // InternalMyDslParser.g:2426:2: ( ( (lv_alt_0_1= ruleIFThenElseSteps_alt1 | lv_alt_0_2= ruleIFThenElseJobsSteps_alt2 ) ) )
            {
            // InternalMyDslParser.g:2426:2: ( ( (lv_alt_0_1= ruleIFThenElseSteps_alt1 | lv_alt_0_2= ruleIFThenElseJobsSteps_alt2 ) ) )
            // InternalMyDslParser.g:2427:3: ( (lv_alt_0_1= ruleIFThenElseSteps_alt1 | lv_alt_0_2= ruleIFThenElseJobsSteps_alt2 ) )
            {
            // InternalMyDslParser.g:2427:3: ( (lv_alt_0_1= ruleIFThenElseSteps_alt1 | lv_alt_0_2= ruleIFThenElseJobsSteps_alt2 ) )
            // InternalMyDslParser.g:2428:4: (lv_alt_0_1= ruleIFThenElseSteps_alt1 | lv_alt_0_2= ruleIFThenElseJobsSteps_alt2 )
            {
            // InternalMyDslParser.g:2428:4: (lv_alt_0_1= ruleIFThenElseSteps_alt1 | lv_alt_0_2= ruleIFThenElseJobsSteps_alt2 )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==If_1) ) {
                alt81=1;
            }
            else if ( (LA81_0==If) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalMyDslParser.g:2429:5: lv_alt_0_1= ruleIFThenElseSteps_alt1
                    {

                    					newCompositeNode(grammarAccess.getIFThenElseStepsAccess().getAltIFThenElseSteps_alt1ParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_alt_0_1=ruleIFThenElseSteps_alt1();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIFThenElseStepsRule());
                    					}
                    					set(
                    						current,
                    						"alt",
                    						lv_alt_0_1,
                    						"org.xtext.example.mydsl10.MyDsl.IFThenElseSteps_alt1");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:2445:5: lv_alt_0_2= ruleIFThenElseJobsSteps_alt2
                    {

                    					newCompositeNode(grammarAccess.getIFThenElseStepsAccess().getAltIFThenElseJobsSteps_alt2ParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_alt_0_2=ruleIFThenElseJobsSteps_alt2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIFThenElseStepsRule());
                    					}
                    					set(
                    						current,
                    						"alt",
                    						lv_alt_0_2,
                    						"org.xtext.example.mydsl10.MyDsl.IFThenElseJobsSteps_alt2");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIFThenElseSteps"


    // $ANTLR start "entryRuleIFThenElseSteps_alt1"
    // InternalMyDslParser.g:2466:1: entryRuleIFThenElseSteps_alt1 returns [EObject current=null] : iv_ruleIFThenElseSteps_alt1= ruleIFThenElseSteps_alt1 EOF ;
    public final EObject entryRuleIFThenElseSteps_alt1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIFThenElseSteps_alt1 = null;


        try {
            // InternalMyDslParser.g:2466:61: (iv_ruleIFThenElseSteps_alt1= ruleIFThenElseSteps_alt1 EOF )
            // InternalMyDslParser.g:2467:2: iv_ruleIFThenElseSteps_alt1= ruleIFThenElseSteps_alt1 EOF
            {
             newCompositeNode(grammarAccess.getIFThenElseSteps_alt1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIFThenElseSteps_alt1=ruleIFThenElseSteps_alt1();

            state._fsp--;

             current =iv_ruleIFThenElseSteps_alt1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIFThenElseSteps_alt1"


    // $ANTLR start "ruleIFThenElseSteps_alt1"
    // InternalMyDslParser.g:2473:1: ruleIFThenElseSteps_alt1 returns [EObject current=null] : (otherlv_0= If_1 ( (lv_Condition_1_0= RULE_ALPHANUMERICSTRING ) ) (this_NEWLINE_2= RULE_NEWLINE )? ( ( (lv_if_3_0= ruleStepOptions ) ) (this_NEWLINE_4= RULE_NEWLINE )? )+ (otherlv_5= Else (this_NEWLINE_6= RULE_NEWLINE )? ( ( (lv_elsef_7_0= ruleStepOptions ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ )? otherlv_9= End ) ;
    public final EObject ruleIFThenElseSteps_alt1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Condition_1_0=null;
        Token this_NEWLINE_2=null;
        Token this_NEWLINE_4=null;
        Token otherlv_5=null;
        Token this_NEWLINE_6=null;
        Token this_NEWLINE_8=null;
        Token otherlv_9=null;
        EObject lv_if_3_0 = null;

        EObject lv_elsef_7_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:2479:2: ( (otherlv_0= If_1 ( (lv_Condition_1_0= RULE_ALPHANUMERICSTRING ) ) (this_NEWLINE_2= RULE_NEWLINE )? ( ( (lv_if_3_0= ruleStepOptions ) ) (this_NEWLINE_4= RULE_NEWLINE )? )+ (otherlv_5= Else (this_NEWLINE_6= RULE_NEWLINE )? ( ( (lv_elsef_7_0= ruleStepOptions ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ )? otherlv_9= End ) )
            // InternalMyDslParser.g:2480:2: (otherlv_0= If_1 ( (lv_Condition_1_0= RULE_ALPHANUMERICSTRING ) ) (this_NEWLINE_2= RULE_NEWLINE )? ( ( (lv_if_3_0= ruleStepOptions ) ) (this_NEWLINE_4= RULE_NEWLINE )? )+ (otherlv_5= Else (this_NEWLINE_6= RULE_NEWLINE )? ( ( (lv_elsef_7_0= ruleStepOptions ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ )? otherlv_9= End )
            {
            // InternalMyDslParser.g:2480:2: (otherlv_0= If_1 ( (lv_Condition_1_0= RULE_ALPHANUMERICSTRING ) ) (this_NEWLINE_2= RULE_NEWLINE )? ( ( (lv_if_3_0= ruleStepOptions ) ) (this_NEWLINE_4= RULE_NEWLINE )? )+ (otherlv_5= Else (this_NEWLINE_6= RULE_NEWLINE )? ( ( (lv_elsef_7_0= ruleStepOptions ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ )? otherlv_9= End )
            // InternalMyDslParser.g:2481:3: otherlv_0= If_1 ( (lv_Condition_1_0= RULE_ALPHANUMERICSTRING ) ) (this_NEWLINE_2= RULE_NEWLINE )? ( ( (lv_if_3_0= ruleStepOptions ) ) (this_NEWLINE_4= RULE_NEWLINE )? )+ (otherlv_5= Else (this_NEWLINE_6= RULE_NEWLINE )? ( ( (lv_elsef_7_0= ruleStepOptions ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ )? otherlv_9= End
            {
            otherlv_0=(Token)match(input,If_1,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getIFThenElseSteps_alt1Access().getIfKeyword_0());
            		
            // InternalMyDslParser.g:2485:3: ( (lv_Condition_1_0= RULE_ALPHANUMERICSTRING ) )
            // InternalMyDslParser.g:2486:4: (lv_Condition_1_0= RULE_ALPHANUMERICSTRING )
            {
            // InternalMyDslParser.g:2486:4: (lv_Condition_1_0= RULE_ALPHANUMERICSTRING )
            // InternalMyDslParser.g:2487:5: lv_Condition_1_0= RULE_ALPHANUMERICSTRING
            {
            lv_Condition_1_0=(Token)match(input,RULE_ALPHANUMERICSTRING,FOLLOW_51); 

            					newLeafNode(lv_Condition_1_0, grammarAccess.getIFThenElseSteps_alt1Access().getConditionALPHANUMERICSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIFThenElseSteps_alt1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"Condition",
            						lv_Condition_1_0,
            						"org.xtext.example.mydsl10.MyDsl.ALPHANUMERICSTRING");
            				

            }


            }

            // InternalMyDslParser.g:2503:3: (this_NEWLINE_2= RULE_NEWLINE )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_NEWLINE) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalMyDslParser.g:2504:4: this_NEWLINE_2= RULE_NEWLINE
                    {
                    this_NEWLINE_2=(Token)match(input,RULE_NEWLINE,FOLLOW_28); 

                    				newLeafNode(this_NEWLINE_2, grammarAccess.getIFThenElseSteps_alt1Access().getNEWLINETerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:2509:3: ( ( (lv_if_3_0= ruleStepOptions ) ) (this_NEWLINE_4= RULE_NEWLINE )? )+
            int cnt84=0;
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==Uses_1||LA84_0==Run_2||LA84_0==Uses||LA84_0==Env||LA84_0==RULE_NAME) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalMyDslParser.g:2510:4: ( (lv_if_3_0= ruleStepOptions ) ) (this_NEWLINE_4= RULE_NEWLINE )?
            	    {
            	    // InternalMyDslParser.g:2510:4: ( (lv_if_3_0= ruleStepOptions ) )
            	    // InternalMyDslParser.g:2511:5: (lv_if_3_0= ruleStepOptions )
            	    {
            	    // InternalMyDslParser.g:2511:5: (lv_if_3_0= ruleStepOptions )
            	    // InternalMyDslParser.g:2512:6: lv_if_3_0= ruleStepOptions
            	    {

            	    						newCompositeNode(grammarAccess.getIFThenElseSteps_alt1Access().getIfStepOptionsParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_52);
            	    lv_if_3_0=ruleStepOptions();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIFThenElseSteps_alt1Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"if",
            	    							lv_if_3_0,
            	    							"org.xtext.example.mydsl10.MyDsl.StepOptions");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyDslParser.g:2529:4: (this_NEWLINE_4= RULE_NEWLINE )?
            	    int alt83=2;
            	    int LA83_0 = input.LA(1);

            	    if ( (LA83_0==RULE_NEWLINE) ) {
            	        alt83=1;
            	    }
            	    switch (alt83) {
            	        case 1 :
            	            // InternalMyDslParser.g:2530:5: this_NEWLINE_4= RULE_NEWLINE
            	            {
            	            this_NEWLINE_4=(Token)match(input,RULE_NEWLINE,FOLLOW_53); 

            	            					newLeafNode(this_NEWLINE_4, grammarAccess.getIFThenElseSteps_alt1Access().getNEWLINETerminalRuleCall_3_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt84 >= 1 ) break loop84;
                        EarlyExitException eee =
                            new EarlyExitException(84, input);
                        throw eee;
                }
                cnt84++;
            } while (true);

            // InternalMyDslParser.g:2536:3: (otherlv_5= Else (this_NEWLINE_6= RULE_NEWLINE )? ( ( (lv_elsef_7_0= ruleStepOptions ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+ )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==Else) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalMyDslParser.g:2537:4: otherlv_5= Else (this_NEWLINE_6= RULE_NEWLINE )? ( ( (lv_elsef_7_0= ruleStepOptions ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+
                    {
                    otherlv_5=(Token)match(input,Else,FOLLOW_51); 

                    				newLeafNode(otherlv_5, grammarAccess.getIFThenElseSteps_alt1Access().getElseKeyword_4_0());
                    			
                    // InternalMyDslParser.g:2541:4: (this_NEWLINE_6= RULE_NEWLINE )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==RULE_NEWLINE) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalMyDslParser.g:2542:5: this_NEWLINE_6= RULE_NEWLINE
                            {
                            this_NEWLINE_6=(Token)match(input,RULE_NEWLINE,FOLLOW_28); 

                            					newLeafNode(this_NEWLINE_6, grammarAccess.getIFThenElseSteps_alt1Access().getNEWLINETerminalRuleCall_4_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDslParser.g:2547:4: ( ( (lv_elsef_7_0= ruleStepOptions ) ) (this_NEWLINE_8= RULE_NEWLINE )? )+
                    int cnt87=0;
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==Uses_1||LA87_0==Run_2||LA87_0==Uses||LA87_0==Env||LA87_0==RULE_NAME) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalMyDslParser.g:2548:5: ( (lv_elsef_7_0= ruleStepOptions ) ) (this_NEWLINE_8= RULE_NEWLINE )?
                    	    {
                    	    // InternalMyDslParser.g:2548:5: ( (lv_elsef_7_0= ruleStepOptions ) )
                    	    // InternalMyDslParser.g:2549:6: (lv_elsef_7_0= ruleStepOptions )
                    	    {
                    	    // InternalMyDslParser.g:2549:6: (lv_elsef_7_0= ruleStepOptions )
                    	    // InternalMyDslParser.g:2550:7: lv_elsef_7_0= ruleStepOptions
                    	    {

                    	    							newCompositeNode(grammarAccess.getIFThenElseSteps_alt1Access().getElsefStepOptionsParserRuleCall_4_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_54);
                    	    lv_elsef_7_0=ruleStepOptions();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIFThenElseSteps_alt1Rule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elsef",
                    	    								lv_elsef_7_0,
                    	    								"org.xtext.example.mydsl10.MyDsl.StepOptions");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalMyDslParser.g:2567:5: (this_NEWLINE_8= RULE_NEWLINE )?
                    	    int alt86=2;
                    	    int LA86_0 = input.LA(1);

                    	    if ( (LA86_0==RULE_NEWLINE) ) {
                    	        alt86=1;
                    	    }
                    	    switch (alt86) {
                    	        case 1 :
                    	            // InternalMyDslParser.g:2568:6: this_NEWLINE_8= RULE_NEWLINE
                    	            {
                    	            this_NEWLINE_8=(Token)match(input,RULE_NEWLINE,FOLLOW_55); 

                    	            						newLeafNode(this_NEWLINE_8, grammarAccess.getIFThenElseSteps_alt1Access().getNEWLINETerminalRuleCall_4_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt87 >= 1 ) break loop87;
                                EarlyExitException eee =
                                    new EarlyExitException(87, input);
                                throw eee;
                        }
                        cnt87++;
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,End,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getIFThenElseSteps_alt1Access().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIFThenElseSteps_alt1"


    // $ANTLR start "entryRuleIFThenElseJobsSteps_alt2"
    // InternalMyDslParser.g:2583:1: entryRuleIFThenElseJobsSteps_alt2 returns [EObject current=null] : iv_ruleIFThenElseJobsSteps_alt2= ruleIFThenElseJobsSteps_alt2 EOF ;
    public final EObject entryRuleIFThenElseJobsSteps_alt2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIFThenElseJobsSteps_alt2 = null;


        try {
            // InternalMyDslParser.g:2583:65: (iv_ruleIFThenElseJobsSteps_alt2= ruleIFThenElseJobsSteps_alt2 EOF )
            // InternalMyDslParser.g:2584:2: iv_ruleIFThenElseJobsSteps_alt2= ruleIFThenElseJobsSteps_alt2 EOF
            {
             newCompositeNode(grammarAccess.getIFThenElseJobsSteps_alt2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIFThenElseJobsSteps_alt2=ruleIFThenElseJobsSteps_alt2();

            state._fsp--;

             current =iv_ruleIFThenElseJobsSteps_alt2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIFThenElseJobsSteps_alt2"


    // $ANTLR start "ruleIFThenElseJobsSteps_alt2"
    // InternalMyDslParser.g:2590:1: ruleIFThenElseJobsSteps_alt2 returns [EObject current=null] : (otherlv_0= If ( (lv_Condition_1_0= ruleEString ) ) ) ;
    public final EObject ruleIFThenElseJobsSteps_alt2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_Condition_1_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:2596:2: ( (otherlv_0= If ( (lv_Condition_1_0= ruleEString ) ) ) )
            // InternalMyDslParser.g:2597:2: (otherlv_0= If ( (lv_Condition_1_0= ruleEString ) ) )
            {
            // InternalMyDslParser.g:2597:2: (otherlv_0= If ( (lv_Condition_1_0= ruleEString ) ) )
            // InternalMyDslParser.g:2598:3: otherlv_0= If ( (lv_Condition_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,If,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIFThenElseJobsSteps_alt2Access().getIfKeyword_0());
            		
            // InternalMyDslParser.g:2602:3: ( (lv_Condition_1_0= ruleEString ) )
            // InternalMyDslParser.g:2603:4: (lv_Condition_1_0= ruleEString )
            {
            // InternalMyDslParser.g:2603:4: (lv_Condition_1_0= ruleEString )
            // InternalMyDslParser.g:2604:5: lv_Condition_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIFThenElseJobsSteps_alt2Access().getConditionEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_Condition_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIFThenElseJobsSteps_alt2Rule());
            					}
            					set(
            						current,
            						"Condition",
            						lv_Condition_1_0,
            						"org.xtext.example.mydsl10.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIFThenElseJobsSteps_alt2"


    // $ANTLR start "entryRuleEString"
    // InternalMyDslParser.g:2625:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDslParser.g:2625:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDslParser.g:2626:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDslParser.g:2632:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ALPHANUMERICSTRING_0= RULE_ALPHANUMERICSTRING | this_STRING_1= RULE_STRING | this_EBoolean_2= ruleEBoolean | this_TRIGGER_WORDS_3= RULE_TRIGGER_WORDS )+ ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ALPHANUMERICSTRING_0=null;
        Token this_STRING_1=null;
        Token this_TRIGGER_WORDS_3=null;
        AntlrDatatypeRuleToken this_EBoolean_2 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:2638:2: ( (this_ALPHANUMERICSTRING_0= RULE_ALPHANUMERICSTRING | this_STRING_1= RULE_STRING | this_EBoolean_2= ruleEBoolean | this_TRIGGER_WORDS_3= RULE_TRIGGER_WORDS )+ )
            // InternalMyDslParser.g:2639:2: (this_ALPHANUMERICSTRING_0= RULE_ALPHANUMERICSTRING | this_STRING_1= RULE_STRING | this_EBoolean_2= ruleEBoolean | this_TRIGGER_WORDS_3= RULE_TRIGGER_WORDS )+
            {
            // InternalMyDslParser.g:2639:2: (this_ALPHANUMERICSTRING_0= RULE_ALPHANUMERICSTRING | this_STRING_1= RULE_STRING | this_EBoolean_2= ruleEBoolean | this_TRIGGER_WORDS_3= RULE_TRIGGER_WORDS )+
            int cnt89=0;
            loop89:
            do {
                int alt89=5;
                switch ( input.LA(1) ) {
                case RULE_ALPHANUMERICSTRING:
                    {
                    alt89=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt89=2;
                    }
                    break;
                case False:
                case True:
                    {
                    alt89=3;
                    }
                    break;
                case RULE_TRIGGER_WORDS:
                    {
                    alt89=4;
                    }
                    break;

                }

                switch (alt89) {
            	case 1 :
            	    // InternalMyDslParser.g:2640:3: this_ALPHANUMERICSTRING_0= RULE_ALPHANUMERICSTRING
            	    {
            	    this_ALPHANUMERICSTRING_0=(Token)match(input,RULE_ALPHANUMERICSTRING,FOLLOW_56); 

            	    			current.merge(this_ALPHANUMERICSTRING_0);
            	    		

            	    			newLeafNode(this_ALPHANUMERICSTRING_0, grammarAccess.getEStringAccess().getALPHANUMERICSTRINGTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDslParser.g:2648:3: this_STRING_1= RULE_STRING
            	    {
            	    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_56); 

            	    			current.merge(this_STRING_1);
            	    		

            	    			newLeafNode(this_STRING_1, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalMyDslParser.g:2656:3: this_EBoolean_2= ruleEBoolean
            	    {

            	    			newCompositeNode(grammarAccess.getEStringAccess().getEBooleanParserRuleCall_2());
            	    		
            	    pushFollow(FOLLOW_56);
            	    this_EBoolean_2=ruleEBoolean();

            	    state._fsp--;


            	    			current.merge(this_EBoolean_2);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalMyDslParser.g:2667:3: this_TRIGGER_WORDS_3= RULE_TRIGGER_WORDS
            	    {
            	    this_TRIGGER_WORDS_3=(Token)match(input,RULE_TRIGGER_WORDS,FOLLOW_56); 

            	    			current.merge(this_TRIGGER_WORDS_3);
            	    		

            	    			newLeafNode(this_TRIGGER_WORDS_3, grammarAccess.getEStringAccess().getTRIGGER_WORDSTerminalRuleCall_3());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt89 >= 1 ) break loop89;
                        EarlyExitException eee =
                            new EarlyExitException(89, input);
                        throw eee;
                }
                cnt89++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDslParser.g:2678:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMyDslParser.g:2678:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMyDslParser.g:2679:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMyDslParser.g:2685:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDslParser.g:2691:2: ( (kw= True | kw= False ) )
            // InternalMyDslParser.g:2692:2: (kw= True | kw= False )
            {
            // InternalMyDslParser.g:2692:2: (kw= True | kw= False )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==True) ) {
                alt90=1;
            }
            else if ( (LA90_0==False) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalMyDslParser.g:2693:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:2699:3: kw= False
                    {
                    kw=(Token)match(input,False,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"

    // Delegated rules


    protected DFA62 dfa62 = new DFA62(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\6\26\2\uffff";
    static final String dfa_3s = "\6\55\2\uffff";
    static final String dfa_4s = "\6\uffff\1\1\1\2";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\6\uffff\1\3\3\uffff\1\5\5\uffff\1\1\5\uffff\1\2",
            "\1\4\6\uffff\1\3\3\uffff\1\5\5\uffff\1\1\1\uffff\1\6\1\uffff\1\7\1\uffff\1\2",
            "\1\4\6\uffff\1\3\3\uffff\1\5\5\uffff\1\1\1\uffff\1\6\1\uffff\1\7\1\uffff\1\2",
            "\1\4\6\uffff\1\3\3\uffff\1\5\5\uffff\1\1\1\uffff\1\6\1\uffff\1\7\1\uffff\1\2",
            "\1\4\6\uffff\1\3\3\uffff\1\5\5\uffff\1\1\1\uffff\1\6\1\uffff\1\7\1\uffff\1\2",
            "\1\4\6\uffff\1\3\3\uffff\1\5\5\uffff\1\1\1\uffff\1\6\1\uffff\1\7\1\uffff\1\2",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 1880:4: ( ( (lv_Parameters_4_0= ruleEString ) ) this_NEWLINE_5= RULE_NEWLINE )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000208220400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000030C88808002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000248220400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000B0C88808000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000010040002010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000090040002010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000044A222F00L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000008044A222F00L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000090800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000004040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000A0000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000C0000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000B0800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000044A013000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000A044A013000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000008044A013000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000E000C000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000008000C000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000088100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000248220400002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000001005F1C3000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000009005F1C3000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000208000002000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000228220400002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000300400020B0L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000100400020B0L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000030040002090L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000010040002090L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00002082204000A0L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000208220400080L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x000002044A013000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000002044A0130A0L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x000000044A0130A0L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000002044A013080L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000000044A013080L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000208220400002L});

}