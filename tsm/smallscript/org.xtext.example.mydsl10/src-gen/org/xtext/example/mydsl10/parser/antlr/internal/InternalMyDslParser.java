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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Pipeline_tool_framework", "Pipeline_envirnonment", "Tool_framework_job", "Allow_faillure", "Ifthenelse", "Condition", "Artifact", "Name_2", "Depends", "Run", "Elseif", "Ifelse", "Output", "Run_1", "Steps", "Name3", "Name", "False", "Input", "Jobs", "Name_1", "Else", "Env", "True", "On", "If", "LeftParenthesis", "RightParenthesis", "Comma", "Colon", "LeftCurlyBracket", "RightCurlyBracket", "RULE_TRIGGERS", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_BEGIN=37;
    public static final int True=27;
    public static final int False=21;
    public static final int Name=20;
    public static final int Name3=19;
    public static final int Input=22;
    public static final int LeftParenthesis=30;
    public static final int Pipeline_envirnonment=5;
    public static final int RULE_ID=39;
    public static final int Ifelse=15;
    public static final int RightParenthesis=31;
    public static final int RULE_INT=40;
    public static final int RULE_ML_COMMENT=42;
    public static final int Depends=12;
    public static final int Name_2=11;
    public static final int If=29;
    public static final int Name_1=24;
    public static final int Steps=18;
    public static final int RULE_END=38;
    public static final int RULE_STRING=41;
    public static final int Env=26;
    public static final int Tool_framework_job=6;
    public static final int Ifthenelse=8;
    public static final int RULE_SL_COMMENT=43;
    public static final int Elseif=14;
    public static final int Comma=32;
    public static final int Jobs=23;
    public static final int Output=16;
    public static final int RULE_TRIGGERS=36;
    public static final int Colon=33;
    public static final int RightCurlyBracket=35;
    public static final int EOF=-1;
    public static final int Pipeline_tool_framework=4;
    public static final int Condition=9;
    public static final int RULE_WS=44;
    public static final int Run_1=17;
    public static final int LeftCurlyBracket=34;
    public static final int Run=13;
    public static final int RULE_ANY_OTHER=45;
    public static final int Artifact=10;
    public static final int Allow_faillure=7;
    public static final int Else=25;
    public static final int On=28;

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
    // InternalMyDslParser.g:64:1: rulePipeline returns [EObject current=null] : ( () ( (otherlv_1= Name | otherlv_2= Name_1 ) ( (lv_Name0_3_0= ruleEString ) ) )? (otherlv_4= Pipeline_tool_framework otherlv_5= LeftParenthesis ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightParenthesis )? (otherlv_10= Pipeline_envirnonment otherlv_11= LeftParenthesis ( ( ruleEString ) ) (otherlv_13= Comma ( ( ruleEString ) ) )* otherlv_15= RightParenthesis )? (otherlv_16= On (this_BEGIN_17= RULE_BEGIN ( (lv_when_18_0= ruleWhen ) ) ( (lv_when_19_0= ruleWhen ) )* this_END_20= RULE_END )? )? (otherlv_21= Jobs (this_BEGIN_22= RULE_BEGIN ( (lv_job_23_0= ruleJob ) ) ( (lv_job_24_0= ruleJob ) )* this_END_25= RULE_END )? )? ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token this_BEGIN_17=null;
        Token this_END_20=null;
        Token otherlv_21=null;
        Token this_BEGIN_22=null;
        Token this_END_25=null;
        AntlrDatatypeRuleToken lv_Name0_3_0 = null;

        EObject lv_when_18_0 = null;

        EObject lv_when_19_0 = null;

        EObject lv_job_23_0 = null;

        EObject lv_job_24_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:70:2: ( ( () ( (otherlv_1= Name | otherlv_2= Name_1 ) ( (lv_Name0_3_0= ruleEString ) ) )? (otherlv_4= Pipeline_tool_framework otherlv_5= LeftParenthesis ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightParenthesis )? (otherlv_10= Pipeline_envirnonment otherlv_11= LeftParenthesis ( ( ruleEString ) ) (otherlv_13= Comma ( ( ruleEString ) ) )* otherlv_15= RightParenthesis )? (otherlv_16= On (this_BEGIN_17= RULE_BEGIN ( (lv_when_18_0= ruleWhen ) ) ( (lv_when_19_0= ruleWhen ) )* this_END_20= RULE_END )? )? (otherlv_21= Jobs (this_BEGIN_22= RULE_BEGIN ( (lv_job_23_0= ruleJob ) ) ( (lv_job_24_0= ruleJob ) )* this_END_25= RULE_END )? )? ) )
            // InternalMyDslParser.g:71:2: ( () ( (otherlv_1= Name | otherlv_2= Name_1 ) ( (lv_Name0_3_0= ruleEString ) ) )? (otherlv_4= Pipeline_tool_framework otherlv_5= LeftParenthesis ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightParenthesis )? (otherlv_10= Pipeline_envirnonment otherlv_11= LeftParenthesis ( ( ruleEString ) ) (otherlv_13= Comma ( ( ruleEString ) ) )* otherlv_15= RightParenthesis )? (otherlv_16= On (this_BEGIN_17= RULE_BEGIN ( (lv_when_18_0= ruleWhen ) ) ( (lv_when_19_0= ruleWhen ) )* this_END_20= RULE_END )? )? (otherlv_21= Jobs (this_BEGIN_22= RULE_BEGIN ( (lv_job_23_0= ruleJob ) ) ( (lv_job_24_0= ruleJob ) )* this_END_25= RULE_END )? )? )
            {
            // InternalMyDslParser.g:71:2: ( () ( (otherlv_1= Name | otherlv_2= Name_1 ) ( (lv_Name0_3_0= ruleEString ) ) )? (otherlv_4= Pipeline_tool_framework otherlv_5= LeftParenthesis ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightParenthesis )? (otherlv_10= Pipeline_envirnonment otherlv_11= LeftParenthesis ( ( ruleEString ) ) (otherlv_13= Comma ( ( ruleEString ) ) )* otherlv_15= RightParenthesis )? (otherlv_16= On (this_BEGIN_17= RULE_BEGIN ( (lv_when_18_0= ruleWhen ) ) ( (lv_when_19_0= ruleWhen ) )* this_END_20= RULE_END )? )? (otherlv_21= Jobs (this_BEGIN_22= RULE_BEGIN ( (lv_job_23_0= ruleJob ) ) ( (lv_job_24_0= ruleJob ) )* this_END_25= RULE_END )? )? )
            // InternalMyDslParser.g:72:3: () ( (otherlv_1= Name | otherlv_2= Name_1 ) ( (lv_Name0_3_0= ruleEString ) ) )? (otherlv_4= Pipeline_tool_framework otherlv_5= LeftParenthesis ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightParenthesis )? (otherlv_10= Pipeline_envirnonment otherlv_11= LeftParenthesis ( ( ruleEString ) ) (otherlv_13= Comma ( ( ruleEString ) ) )* otherlv_15= RightParenthesis )? (otherlv_16= On (this_BEGIN_17= RULE_BEGIN ( (lv_when_18_0= ruleWhen ) ) ( (lv_when_19_0= ruleWhen ) )* this_END_20= RULE_END )? )? (otherlv_21= Jobs (this_BEGIN_22= RULE_BEGIN ( (lv_job_23_0= ruleJob ) ) ( (lv_job_24_0= ruleJob ) )* this_END_25= RULE_END )? )?
            {
            // InternalMyDslParser.g:72:3: ()
            // InternalMyDslParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPipelineAccess().getPipelineAction_0(),
            					current);
            			

            }

            // InternalMyDslParser.g:79:3: ( (otherlv_1= Name | otherlv_2= Name_1 ) ( (lv_Name0_3_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Name||LA2_0==Name_1) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDslParser.g:80:4: (otherlv_1= Name | otherlv_2= Name_1 ) ( (lv_Name0_3_0= ruleEString ) )
                    {
                    // InternalMyDslParser.g:80:4: (otherlv_1= Name | otherlv_2= Name_1 )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==Name) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0==Name_1) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalMyDslParser.g:81:5: otherlv_1= Name
                            {
                            otherlv_1=(Token)match(input,Name,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getPipelineAccess().getNameKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDslParser.g:86:5: otherlv_2= Name_1
                            {
                            otherlv_2=(Token)match(input,Name_1,FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getPipelineAccess().getNameKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDslParser.g:91:4: ( (lv_Name0_3_0= ruleEString ) )
                    // InternalMyDslParser.g:92:5: (lv_Name0_3_0= ruleEString )
                    {
                    // InternalMyDslParser.g:92:5: (lv_Name0_3_0= ruleEString )
                    // InternalMyDslParser.g:93:6: lv_Name0_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPipelineAccess().getName0EStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_Name0_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    						}
                    						set(
                    							current,
                    							"Name0",
                    							lv_Name0_3_0,
                    							"org.xtext.example.mydsl10.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:111:3: (otherlv_4= Pipeline_tool_framework otherlv_5= LeftParenthesis ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightParenthesis )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Pipeline_tool_framework) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDslParser.g:112:4: otherlv_4= Pipeline_tool_framework otherlv_5= LeftParenthesis ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightParenthesis
                    {
                    otherlv_4=(Token)match(input,Pipeline_tool_framework,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPipelineAccess().getPipeline_tool_frameworkKeyword_2_0());
                    			
                    otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getPipelineAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalMyDslParser.g:120:4: ( ( ruleEString ) )
                    // InternalMyDslParser.g:121:5: ( ruleEString )
                    {
                    // InternalMyDslParser.g:121:5: ( ruleEString )
                    // InternalMyDslParser.g:122:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPipelineRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPipelineAccess().getPipeline_tool_frameworkTool_frameworkCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:136:4: (otherlv_7= Comma ( ( ruleEString ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==Comma) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDslParser.g:137:5: otherlv_7= Comma ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPipelineAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalMyDslParser.g:141:5: ( ( ruleEString ) )
                    	    // InternalMyDslParser.g:142:6: ( ruleEString )
                    	    {
                    	    // InternalMyDslParser.g:142:6: ( ruleEString )
                    	    // InternalMyDslParser.g:143:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPipelineRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPipelineAccess().getPipeline_tool_frameworkTool_frameworkCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getPipelineAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:163:3: (otherlv_10= Pipeline_envirnonment otherlv_11= LeftParenthesis ( ( ruleEString ) ) (otherlv_13= Comma ( ( ruleEString ) ) )* otherlv_15= RightParenthesis )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Pipeline_envirnonment) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDslParser.g:164:4: otherlv_10= Pipeline_envirnonment otherlv_11= LeftParenthesis ( ( ruleEString ) ) (otherlv_13= Comma ( ( ruleEString ) ) )* otherlv_15= RightParenthesis
                    {
                    otherlv_10=(Token)match(input,Pipeline_envirnonment,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getPipelineAccess().getPipeline_envirnonmentKeyword_3_0());
                    			
                    otherlv_11=(Token)match(input,LeftParenthesis,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getPipelineAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalMyDslParser.g:172:4: ( ( ruleEString ) )
                    // InternalMyDslParser.g:173:5: ( ruleEString )
                    {
                    // InternalMyDslParser.g:173:5: ( ruleEString )
                    // InternalMyDslParser.g:174:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPipelineRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPipelineAccess().getPipeline_envirnonmentEnvironmentCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:188:4: (otherlv_13= Comma ( ( ruleEString ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Comma) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDslParser.g:189:5: otherlv_13= Comma ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getPipelineAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDslParser.g:193:5: ( ( ruleEString ) )
                    	    // InternalMyDslParser.g:194:6: ( ruleEString )
                    	    {
                    	    // InternalMyDslParser.g:194:6: ( ruleEString )
                    	    // InternalMyDslParser.g:195:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPipelineRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPipelineAccess().getPipeline_envirnonmentEnvironmentCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,RightParenthesis,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getPipelineAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:215:3: (otherlv_16= On (this_BEGIN_17= RULE_BEGIN ( (lv_when_18_0= ruleWhen ) ) ( (lv_when_19_0= ruleWhen ) )* this_END_20= RULE_END )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==On) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDslParser.g:216:4: otherlv_16= On (this_BEGIN_17= RULE_BEGIN ( (lv_when_18_0= ruleWhen ) ) ( (lv_when_19_0= ruleWhen ) )* this_END_20= RULE_END )?
                    {
                    otherlv_16=(Token)match(input,On,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getPipelineAccess().getOnKeyword_4_0());
                    			
                    // InternalMyDslParser.g:220:4: (this_BEGIN_17= RULE_BEGIN ( (lv_when_18_0= ruleWhen ) ) ( (lv_when_19_0= ruleWhen ) )* this_END_20= RULE_END )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_BEGIN) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDslParser.g:221:5: this_BEGIN_17= RULE_BEGIN ( (lv_when_18_0= ruleWhen ) ) ( (lv_when_19_0= ruleWhen ) )* this_END_20= RULE_END
                            {
                            this_BEGIN_17=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

                            					newLeafNode(this_BEGIN_17, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_4_1_0());
                            				
                            // InternalMyDslParser.g:225:5: ( (lv_when_18_0= ruleWhen ) )
                            // InternalMyDslParser.g:226:6: (lv_when_18_0= ruleWhen )
                            {
                            // InternalMyDslParser.g:226:6: (lv_when_18_0= ruleWhen )
                            // InternalMyDslParser.g:227:7: lv_when_18_0= ruleWhen
                            {

                            							newCompositeNode(grammarAccess.getPipelineAccess().getWhenWhenParserRuleCall_4_1_1_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_when_18_0=ruleWhen();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPipelineRule());
                            							}
                            							add(
                            								current,
                            								"when",
                            								lv_when_18_0,
                            								"org.xtext.example.mydsl10.MyDsl.When");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyDslParser.g:244:5: ( (lv_when_19_0= ruleWhen ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==RULE_TRIGGERS) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalMyDslParser.g:245:6: (lv_when_19_0= ruleWhen )
                            	    {
                            	    // InternalMyDslParser.g:245:6: (lv_when_19_0= ruleWhen )
                            	    // InternalMyDslParser.g:246:7: lv_when_19_0= ruleWhen
                            	    {

                            	    							newCompositeNode(grammarAccess.getPipelineAccess().getWhenWhenParserRuleCall_4_1_2_0());
                            	    						
                            	    pushFollow(FOLLOW_11);
                            	    lv_when_19_0=ruleWhen();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getPipelineRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"when",
                            	    								lv_when_19_0,
                            	    								"org.xtext.example.mydsl10.MyDsl.When");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);

                            this_END_20=(Token)match(input,RULE_END,FOLLOW_12); 

                            					newLeafNode(this_END_20, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_4_1_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:269:3: (otherlv_21= Jobs (this_BEGIN_22= RULE_BEGIN ( (lv_job_23_0= ruleJob ) ) ( (lv_job_24_0= ruleJob ) )* this_END_25= RULE_END )? )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Jobs) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDslParser.g:270:4: otherlv_21= Jobs (this_BEGIN_22= RULE_BEGIN ( (lv_job_23_0= ruleJob ) ) ( (lv_job_24_0= ruleJob ) )* this_END_25= RULE_END )?
                    {
                    otherlv_21=(Token)match(input,Jobs,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getPipelineAccess().getJobsKeyword_5_0());
                    			
                    // InternalMyDslParser.g:274:4: (this_BEGIN_22= RULE_BEGIN ( (lv_job_23_0= ruleJob ) ) ( (lv_job_24_0= ruleJob ) )* this_END_25= RULE_END )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_BEGIN) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMyDslParser.g:275:5: this_BEGIN_22= RULE_BEGIN ( (lv_job_23_0= ruleJob ) ) ( (lv_job_24_0= ruleJob ) )* this_END_25= RULE_END
                            {
                            this_BEGIN_22=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

                            					newLeafNode(this_BEGIN_22, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_5_1_0());
                            				
                            // InternalMyDslParser.g:279:5: ( (lv_job_23_0= ruleJob ) )
                            // InternalMyDslParser.g:280:6: (lv_job_23_0= ruleJob )
                            {
                            // InternalMyDslParser.g:280:6: (lv_job_23_0= ruleJob )
                            // InternalMyDslParser.g:281:7: lv_job_23_0= ruleJob
                            {

                            							newCompositeNode(grammarAccess.getPipelineAccess().getJobJobParserRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_15);
                            lv_job_23_0=ruleJob();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPipelineRule());
                            							}
                            							add(
                            								current,
                            								"job",
                            								lv_job_23_0,
                            								"org.xtext.example.mydsl10.MyDsl.Job");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyDslParser.g:298:5: ( (lv_job_24_0= ruleJob ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==Allow_faillure||LA10_0==RULE_ID||LA10_0==RULE_STRING) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalMyDslParser.g:299:6: (lv_job_24_0= ruleJob )
                            	    {
                            	    // InternalMyDslParser.g:299:6: (lv_job_24_0= ruleJob )
                            	    // InternalMyDslParser.g:300:7: lv_job_24_0= ruleJob
                            	    {

                            	    							newCompositeNode(grammarAccess.getPipelineAccess().getJobJobParserRuleCall_5_1_2_0());
                            	    						
                            	    pushFollow(FOLLOW_15);
                            	    lv_job_24_0=ruleJob();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getPipelineRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"job",
                            	    								lv_job_24_0,
                            	    								"org.xtext.example.mydsl10.MyDsl.Job");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);

                            this_END_25=(Token)match(input,RULE_END,FOLLOW_2); 

                            					newLeafNode(this_END_25, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_5_1_3());
                            				

                            }
                            break;

                    }


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
    // $ANTLR end "rulePipeline"


    // $ANTLR start "entryRuleWhen"
    // InternalMyDslParser.g:327:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalMyDslParser.g:327:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalMyDslParser.g:328:2: iv_ruleWhen= ruleWhen EOF
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
    // InternalMyDslParser.g:334:1: ruleWhen returns [EObject current=null] : ( ( (lv_Trigger_0_0= RULE_TRIGGERS ) ) otherlv_1= Colon ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token lv_Trigger_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDslParser.g:340:2: ( ( ( (lv_Trigger_0_0= RULE_TRIGGERS ) ) otherlv_1= Colon ) )
            // InternalMyDslParser.g:341:2: ( ( (lv_Trigger_0_0= RULE_TRIGGERS ) ) otherlv_1= Colon )
            {
            // InternalMyDslParser.g:341:2: ( ( (lv_Trigger_0_0= RULE_TRIGGERS ) ) otherlv_1= Colon )
            // InternalMyDslParser.g:342:3: ( (lv_Trigger_0_0= RULE_TRIGGERS ) ) otherlv_1= Colon
            {
            // InternalMyDslParser.g:342:3: ( (lv_Trigger_0_0= RULE_TRIGGERS ) )
            // InternalMyDslParser.g:343:4: (lv_Trigger_0_0= RULE_TRIGGERS )
            {
            // InternalMyDslParser.g:343:4: (lv_Trigger_0_0= RULE_TRIGGERS )
            // InternalMyDslParser.g:344:5: lv_Trigger_0_0= RULE_TRIGGERS
            {
            lv_Trigger_0_0=(Token)match(input,RULE_TRIGGERS,FOLLOW_16); 

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

            otherlv_1=(Token)match(input,Colon,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getWhenAccess().getColonKeyword_1());
            		

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


    // $ANTLR start "entryRuleJob"
    // InternalMyDslParser.g:368:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalMyDslParser.g:368:44: (iv_ruleJob= ruleJob EOF )
            // InternalMyDslParser.g:369:2: iv_ruleJob= ruleJob EOF
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
    // InternalMyDslParser.g:375:1: ruleJob returns [EObject current=null] : ( ( (lv_Allow_faillure_0_0= Allow_faillure ) )? ( (lv_Name1_1_0= ruleEString ) ) otherlv_2= Colon (this_BEGIN_3= RULE_BEGIN (otherlv_4= Depends otherlv_5= LeftParenthesis ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightParenthesis )? (otherlv_10= Tool_framework_job otherlv_11= LeftParenthesis ( ( ruleEString ) ) (otherlv_13= Comma ( ( ruleEString ) ) )* otherlv_15= RightParenthesis )? (otherlv_16= Output otherlv_17= LeftParenthesis ( ( ruleEString ) ) (otherlv_19= Comma ( ( ruleEString ) ) )* otherlv_21= RightParenthesis )? (otherlv_22= Ifthenelse otherlv_23= LeftParenthesis ( ( ruleEString ) ) (otherlv_25= Comma ( ( ruleEString ) ) )* otherlv_27= RightParenthesis )? (otherlv_28= Steps (this_BEGIN_29= RULE_BEGIN ( (lv_command_30_0= ruleCommand ) ) ( (lv_command_31_0= ruleCommand ) )* this_END_32= RULE_END )? )? (otherlv_33= Input otherlv_34= LeftCurlyBracket ( (lv_input_35_0= ruleArtifact ) ) (otherlv_36= Comma ( (lv_input_37_0= ruleArtifact ) ) )* otherlv_38= RightCurlyBracket )? this_END_39= RULE_END )? ) ;
    public final EObject ruleJob() throws RecognitionException {
        EObject current = null;

        Token lv_Allow_faillure_0_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token this_BEGIN_29=null;
        Token this_END_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token this_END_39=null;
        AntlrDatatypeRuleToken lv_Name1_1_0 = null;

        EObject lv_command_30_0 = null;

        EObject lv_command_31_0 = null;

        EObject lv_input_35_0 = null;

        EObject lv_input_37_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:381:2: ( ( ( (lv_Allow_faillure_0_0= Allow_faillure ) )? ( (lv_Name1_1_0= ruleEString ) ) otherlv_2= Colon (this_BEGIN_3= RULE_BEGIN (otherlv_4= Depends otherlv_5= LeftParenthesis ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightParenthesis )? (otherlv_10= Tool_framework_job otherlv_11= LeftParenthesis ( ( ruleEString ) ) (otherlv_13= Comma ( ( ruleEString ) ) )* otherlv_15= RightParenthesis )? (otherlv_16= Output otherlv_17= LeftParenthesis ( ( ruleEString ) ) (otherlv_19= Comma ( ( ruleEString ) ) )* otherlv_21= RightParenthesis )? (otherlv_22= Ifthenelse otherlv_23= LeftParenthesis ( ( ruleEString ) ) (otherlv_25= Comma ( ( ruleEString ) ) )* otherlv_27= RightParenthesis )? (otherlv_28= Steps (this_BEGIN_29= RULE_BEGIN ( (lv_command_30_0= ruleCommand ) ) ( (lv_command_31_0= ruleCommand ) )* this_END_32= RULE_END )? )? (otherlv_33= Input otherlv_34= LeftCurlyBracket ( (lv_input_35_0= ruleArtifact ) ) (otherlv_36= Comma ( (lv_input_37_0= ruleArtifact ) ) )* otherlv_38= RightCurlyBracket )? this_END_39= RULE_END )? ) )
            // InternalMyDslParser.g:382:2: ( ( (lv_Allow_faillure_0_0= Allow_faillure ) )? ( (lv_Name1_1_0= ruleEString ) ) otherlv_2= Colon (this_BEGIN_3= RULE_BEGIN (otherlv_4= Depends otherlv_5= LeftParenthesis ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightParenthesis )? (otherlv_10= Tool_framework_job otherlv_11= LeftParenthesis ( ( ruleEString ) ) (otherlv_13= Comma ( ( ruleEString ) ) )* otherlv_15= RightParenthesis )? (otherlv_16= Output otherlv_17= LeftParenthesis ( ( ruleEString ) ) (otherlv_19= Comma ( ( ruleEString ) ) )* otherlv_21= RightParenthesis )? (otherlv_22= Ifthenelse otherlv_23= LeftParenthesis ( ( ruleEString ) ) (otherlv_25= Comma ( ( ruleEString ) ) )* otherlv_27= RightParenthesis )? (otherlv_28= Steps (this_BEGIN_29= RULE_BEGIN ( (lv_command_30_0= ruleCommand ) ) ( (lv_command_31_0= ruleCommand ) )* this_END_32= RULE_END )? )? (otherlv_33= Input otherlv_34= LeftCurlyBracket ( (lv_input_35_0= ruleArtifact ) ) (otherlv_36= Comma ( (lv_input_37_0= ruleArtifact ) ) )* otherlv_38= RightCurlyBracket )? this_END_39= RULE_END )? )
            {
            // InternalMyDslParser.g:382:2: ( ( (lv_Allow_faillure_0_0= Allow_faillure ) )? ( (lv_Name1_1_0= ruleEString ) ) otherlv_2= Colon (this_BEGIN_3= RULE_BEGIN (otherlv_4= Depends otherlv_5= LeftParenthesis ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightParenthesis )? (otherlv_10= Tool_framework_job otherlv_11= LeftParenthesis ( ( ruleEString ) ) (otherlv_13= Comma ( ( ruleEString ) ) )* otherlv_15= RightParenthesis )? (otherlv_16= Output otherlv_17= LeftParenthesis ( ( ruleEString ) ) (otherlv_19= Comma ( ( ruleEString ) ) )* otherlv_21= RightParenthesis )? (otherlv_22= Ifthenelse otherlv_23= LeftParenthesis ( ( ruleEString ) ) (otherlv_25= Comma ( ( ruleEString ) ) )* otherlv_27= RightParenthesis )? (otherlv_28= Steps (this_BEGIN_29= RULE_BEGIN ( (lv_command_30_0= ruleCommand ) ) ( (lv_command_31_0= ruleCommand ) )* this_END_32= RULE_END )? )? (otherlv_33= Input otherlv_34= LeftCurlyBracket ( (lv_input_35_0= ruleArtifact ) ) (otherlv_36= Comma ( (lv_input_37_0= ruleArtifact ) ) )* otherlv_38= RightCurlyBracket )? this_END_39= RULE_END )? )
            // InternalMyDslParser.g:383:3: ( (lv_Allow_faillure_0_0= Allow_faillure ) )? ( (lv_Name1_1_0= ruleEString ) ) otherlv_2= Colon (this_BEGIN_3= RULE_BEGIN (otherlv_4= Depends otherlv_5= LeftParenthesis ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightParenthesis )? (otherlv_10= Tool_framework_job otherlv_11= LeftParenthesis ( ( ruleEString ) ) (otherlv_13= Comma ( ( ruleEString ) ) )* otherlv_15= RightParenthesis )? (otherlv_16= Output otherlv_17= LeftParenthesis ( ( ruleEString ) ) (otherlv_19= Comma ( ( ruleEString ) ) )* otherlv_21= RightParenthesis )? (otherlv_22= Ifthenelse otherlv_23= LeftParenthesis ( ( ruleEString ) ) (otherlv_25= Comma ( ( ruleEString ) ) )* otherlv_27= RightParenthesis )? (otherlv_28= Steps (this_BEGIN_29= RULE_BEGIN ( (lv_command_30_0= ruleCommand ) ) ( (lv_command_31_0= ruleCommand ) )* this_END_32= RULE_END )? )? (otherlv_33= Input otherlv_34= LeftCurlyBracket ( (lv_input_35_0= ruleArtifact ) ) (otherlv_36= Comma ( (lv_input_37_0= ruleArtifact ) ) )* otherlv_38= RightCurlyBracket )? this_END_39= RULE_END )?
            {
            // InternalMyDslParser.g:383:3: ( (lv_Allow_faillure_0_0= Allow_faillure ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Allow_faillure) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDslParser.g:384:4: (lv_Allow_faillure_0_0= Allow_faillure )
                    {
                    // InternalMyDslParser.g:384:4: (lv_Allow_faillure_0_0= Allow_faillure )
                    // InternalMyDslParser.g:385:5: lv_Allow_faillure_0_0= Allow_faillure
                    {
                    lv_Allow_faillure_0_0=(Token)match(input,Allow_faillure,FOLLOW_3); 

                    					newLeafNode(lv_Allow_faillure_0_0, grammarAccess.getJobAccess().getAllow_faillureAllow_faillureKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJobRule());
                    					}
                    					setWithLastConsumed(current, "Allow_faillure", lv_Allow_faillure_0_0 != null, "Allow_faillure");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:397:3: ( (lv_Name1_1_0= ruleEString ) )
            // InternalMyDslParser.g:398:4: (lv_Name1_1_0= ruleEString )
            {
            // InternalMyDslParser.g:398:4: (lv_Name1_1_0= ruleEString )
            // InternalMyDslParser.g:399:5: lv_Name1_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJobAccess().getName1EStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_Name1_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJobRule());
            					}
            					set(
            						current,
            						"Name1",
            						lv_Name1_1_0,
            						"org.xtext.example.mydsl10.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getJobAccess().getColonKeyword_2());
            		
            // InternalMyDslParser.g:420:3: (this_BEGIN_3= RULE_BEGIN (otherlv_4= Depends otherlv_5= LeftParenthesis ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightParenthesis )? (otherlv_10= Tool_framework_job otherlv_11= LeftParenthesis ( ( ruleEString ) ) (otherlv_13= Comma ( ( ruleEString ) ) )* otherlv_15= RightParenthesis )? (otherlv_16= Output otherlv_17= LeftParenthesis ( ( ruleEString ) ) (otherlv_19= Comma ( ( ruleEString ) ) )* otherlv_21= RightParenthesis )? (otherlv_22= Ifthenelse otherlv_23= LeftParenthesis ( ( ruleEString ) ) (otherlv_25= Comma ( ( ruleEString ) ) )* otherlv_27= RightParenthesis )? (otherlv_28= Steps (this_BEGIN_29= RULE_BEGIN ( (lv_command_30_0= ruleCommand ) ) ( (lv_command_31_0= ruleCommand ) )* this_END_32= RULE_END )? )? (otherlv_33= Input otherlv_34= LeftCurlyBracket ( (lv_input_35_0= ruleArtifact ) ) (otherlv_36= Comma ( (lv_input_37_0= ruleArtifact ) ) )* otherlv_38= RightCurlyBracket )? this_END_39= RULE_END )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_BEGIN) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDslParser.g:421:4: this_BEGIN_3= RULE_BEGIN (otherlv_4= Depends otherlv_5= LeftParenthesis ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightParenthesis )? (otherlv_10= Tool_framework_job otherlv_11= LeftParenthesis ( ( ruleEString ) ) (otherlv_13= Comma ( ( ruleEString ) ) )* otherlv_15= RightParenthesis )? (otherlv_16= Output otherlv_17= LeftParenthesis ( ( ruleEString ) ) (otherlv_19= Comma ( ( ruleEString ) ) )* otherlv_21= RightParenthesis )? (otherlv_22= Ifthenelse otherlv_23= LeftParenthesis ( ( ruleEString ) ) (otherlv_25= Comma ( ( ruleEString ) ) )* otherlv_27= RightParenthesis )? (otherlv_28= Steps (this_BEGIN_29= RULE_BEGIN ( (lv_command_30_0= ruleCommand ) ) ( (lv_command_31_0= ruleCommand ) )* this_END_32= RULE_END )? )? (otherlv_33= Input otherlv_34= LeftCurlyBracket ( (lv_input_35_0= ruleArtifact ) ) (otherlv_36= Comma ( (lv_input_37_0= ruleArtifact ) ) )* otherlv_38= RightCurlyBracket )? this_END_39= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

                    				newLeafNode(this_BEGIN_3, grammarAccess.getJobAccess().getBEGINTerminalRuleCall_3_0());
                    			
                    // InternalMyDslParser.g:425:4: (otherlv_4= Depends otherlv_5= LeftParenthesis ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightParenthesis )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==Depends) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMyDslParser.g:426:5: otherlv_4= Depends otherlv_5= LeftParenthesis ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightParenthesis
                            {
                            otherlv_4=(Token)match(input,Depends,FOLLOW_5); 

                            					newLeafNode(otherlv_4, grammarAccess.getJobAccess().getDependsKeyword_3_1_0());
                            				
                            otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_3); 

                            					newLeafNode(otherlv_5, grammarAccess.getJobAccess().getLeftParenthesisKeyword_3_1_1());
                            				
                            // InternalMyDslParser.g:434:5: ( ( ruleEString ) )
                            // InternalMyDslParser.g:435:6: ( ruleEString )
                            {
                            // InternalMyDslParser.g:435:6: ( ruleEString )
                            // InternalMyDslParser.g:436:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getJobRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getJobAccess().getDependsJobCrossReference_3_1_2_0());
                            						
                            pushFollow(FOLLOW_6);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyDslParser.g:450:5: (otherlv_7= Comma ( ( ruleEString ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==Comma) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalMyDslParser.g:451:6: otherlv_7= Comma ( ( ruleEString ) )
                            	    {
                            	    otherlv_7=(Token)match(input,Comma,FOLLOW_3); 

                            	    						newLeafNode(otherlv_7, grammarAccess.getJobAccess().getCommaKeyword_3_1_3_0());
                            	    					
                            	    // InternalMyDslParser.g:455:6: ( ( ruleEString ) )
                            	    // InternalMyDslParser.g:456:7: ( ruleEString )
                            	    {
                            	    // InternalMyDslParser.g:456:7: ( ruleEString )
                            	    // InternalMyDslParser.g:457:8: ruleEString
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getJobRule());
                            	    								}
                            	    							

                            	    								newCompositeNode(grammarAccess.getJobAccess().getDependsJobCrossReference_3_1_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_6);
                            	    ruleEString();

                            	    state._fsp--;


                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);

                            otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_18); 

                            					newLeafNode(otherlv_9, grammarAccess.getJobAccess().getRightParenthesisKeyword_3_1_4());
                            				

                            }
                            break;

                    }

                    // InternalMyDslParser.g:477:4: (otherlv_10= Tool_framework_job otherlv_11= LeftParenthesis ( ( ruleEString ) ) (otherlv_13= Comma ( ( ruleEString ) ) )* otherlv_15= RightParenthesis )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==Tool_framework_job) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMyDslParser.g:478:5: otherlv_10= Tool_framework_job otherlv_11= LeftParenthesis ( ( ruleEString ) ) (otherlv_13= Comma ( ( ruleEString ) ) )* otherlv_15= RightParenthesis
                            {
                            otherlv_10=(Token)match(input,Tool_framework_job,FOLLOW_5); 

                            					newLeafNode(otherlv_10, grammarAccess.getJobAccess().getTool_framework_jobKeyword_3_2_0());
                            				
                            otherlv_11=(Token)match(input,LeftParenthesis,FOLLOW_3); 

                            					newLeafNode(otherlv_11, grammarAccess.getJobAccess().getLeftParenthesisKeyword_3_2_1());
                            				
                            // InternalMyDslParser.g:486:5: ( ( ruleEString ) )
                            // InternalMyDslParser.g:487:6: ( ruleEString )
                            {
                            // InternalMyDslParser.g:487:6: ( ruleEString )
                            // InternalMyDslParser.g:488:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getJobRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getJobAccess().getTool_framework_jobTool_frameworkCrossReference_3_2_2_0());
                            						
                            pushFollow(FOLLOW_6);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyDslParser.g:502:5: (otherlv_13= Comma ( ( ruleEString ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==Comma) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalMyDslParser.g:503:6: otherlv_13= Comma ( ( ruleEString ) )
                            	    {
                            	    otherlv_13=(Token)match(input,Comma,FOLLOW_3); 

                            	    						newLeafNode(otherlv_13, grammarAccess.getJobAccess().getCommaKeyword_3_2_3_0());
                            	    					
                            	    // InternalMyDslParser.g:507:6: ( ( ruleEString ) )
                            	    // InternalMyDslParser.g:508:7: ( ruleEString )
                            	    {
                            	    // InternalMyDslParser.g:508:7: ( ruleEString )
                            	    // InternalMyDslParser.g:509:8: ruleEString
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getJobRule());
                            	    								}
                            	    							

                            	    								newCompositeNode(grammarAccess.getJobAccess().getTool_framework_jobTool_frameworkCrossReference_3_2_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_6);
                            	    ruleEString();

                            	    state._fsp--;


                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);

                            otherlv_15=(Token)match(input,RightParenthesis,FOLLOW_19); 

                            					newLeafNode(otherlv_15, grammarAccess.getJobAccess().getRightParenthesisKeyword_3_2_4());
                            				

                            }
                            break;

                    }

                    // InternalMyDslParser.g:529:4: (otherlv_16= Output otherlv_17= LeftParenthesis ( ( ruleEString ) ) (otherlv_19= Comma ( ( ruleEString ) ) )* otherlv_21= RightParenthesis )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==Output) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalMyDslParser.g:530:5: otherlv_16= Output otherlv_17= LeftParenthesis ( ( ruleEString ) ) (otherlv_19= Comma ( ( ruleEString ) ) )* otherlv_21= RightParenthesis
                            {
                            otherlv_16=(Token)match(input,Output,FOLLOW_5); 

                            					newLeafNode(otherlv_16, grammarAccess.getJobAccess().getOutputKeyword_3_3_0());
                            				
                            otherlv_17=(Token)match(input,LeftParenthesis,FOLLOW_3); 

                            					newLeafNode(otherlv_17, grammarAccess.getJobAccess().getLeftParenthesisKeyword_3_3_1());
                            				
                            // InternalMyDslParser.g:538:5: ( ( ruleEString ) )
                            // InternalMyDslParser.g:539:6: ( ruleEString )
                            {
                            // InternalMyDslParser.g:539:6: ( ruleEString )
                            // InternalMyDslParser.g:540:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getJobRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getJobAccess().getOutputArtifactCrossReference_3_3_2_0());
                            						
                            pushFollow(FOLLOW_6);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyDslParser.g:554:5: (otherlv_19= Comma ( ( ruleEString ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==Comma) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // InternalMyDslParser.g:555:6: otherlv_19= Comma ( ( ruleEString ) )
                            	    {
                            	    otherlv_19=(Token)match(input,Comma,FOLLOW_3); 

                            	    						newLeafNode(otherlv_19, grammarAccess.getJobAccess().getCommaKeyword_3_3_3_0());
                            	    					
                            	    // InternalMyDslParser.g:559:6: ( ( ruleEString ) )
                            	    // InternalMyDslParser.g:560:7: ( ruleEString )
                            	    {
                            	    // InternalMyDslParser.g:560:7: ( ruleEString )
                            	    // InternalMyDslParser.g:561:8: ruleEString
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getJobRule());
                            	    								}
                            	    							

                            	    								newCompositeNode(grammarAccess.getJobAccess().getOutputArtifactCrossReference_3_3_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_6);
                            	    ruleEString();

                            	    state._fsp--;


                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);

                            otherlv_21=(Token)match(input,RightParenthesis,FOLLOW_20); 

                            					newLeafNode(otherlv_21, grammarAccess.getJobAccess().getRightParenthesisKeyword_3_3_4());
                            				

                            }
                            break;

                    }

                    // InternalMyDslParser.g:581:4: (otherlv_22= Ifthenelse otherlv_23= LeftParenthesis ( ( ruleEString ) ) (otherlv_25= Comma ( ( ruleEString ) ) )* otherlv_27= RightParenthesis )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==Ifthenelse) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMyDslParser.g:582:5: otherlv_22= Ifthenelse otherlv_23= LeftParenthesis ( ( ruleEString ) ) (otherlv_25= Comma ( ( ruleEString ) ) )* otherlv_27= RightParenthesis
                            {
                            otherlv_22=(Token)match(input,Ifthenelse,FOLLOW_5); 

                            					newLeafNode(otherlv_22, grammarAccess.getJobAccess().getIfthenelseKeyword_3_4_0());
                            				
                            otherlv_23=(Token)match(input,LeftParenthesis,FOLLOW_3); 

                            					newLeafNode(otherlv_23, grammarAccess.getJobAccess().getLeftParenthesisKeyword_3_4_1());
                            				
                            // InternalMyDslParser.g:590:5: ( ( ruleEString ) )
                            // InternalMyDslParser.g:591:6: ( ruleEString )
                            {
                            // InternalMyDslParser.g:591:6: ( ruleEString )
                            // InternalMyDslParser.g:592:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getJobRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getJobAccess().getIfthenelseIfThenElseCrossReference_3_4_2_0());
                            						
                            pushFollow(FOLLOW_6);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyDslParser.g:606:5: (otherlv_25= Comma ( ( ruleEString ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==Comma) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // InternalMyDslParser.g:607:6: otherlv_25= Comma ( ( ruleEString ) )
                            	    {
                            	    otherlv_25=(Token)match(input,Comma,FOLLOW_3); 

                            	    						newLeafNode(otherlv_25, grammarAccess.getJobAccess().getCommaKeyword_3_4_3_0());
                            	    					
                            	    // InternalMyDslParser.g:611:6: ( ( ruleEString ) )
                            	    // InternalMyDslParser.g:612:7: ( ruleEString )
                            	    {
                            	    // InternalMyDslParser.g:612:7: ( ruleEString )
                            	    // InternalMyDslParser.g:613:8: ruleEString
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getJobRule());
                            	    								}
                            	    							

                            	    								newCompositeNode(grammarAccess.getJobAccess().getIfthenelseIfThenElseCrossReference_3_4_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_6);
                            	    ruleEString();

                            	    state._fsp--;


                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);

                            otherlv_27=(Token)match(input,RightParenthesis,FOLLOW_21); 

                            					newLeafNode(otherlv_27, grammarAccess.getJobAccess().getRightParenthesisKeyword_3_4_4());
                            				

                            }
                            break;

                    }

                    // InternalMyDslParser.g:633:4: (otherlv_28= Steps (this_BEGIN_29= RULE_BEGIN ( (lv_command_30_0= ruleCommand ) ) ( (lv_command_31_0= ruleCommand ) )* this_END_32= RULE_END )? )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==Steps) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalMyDslParser.g:634:5: otherlv_28= Steps (this_BEGIN_29= RULE_BEGIN ( (lv_command_30_0= ruleCommand ) ) ( (lv_command_31_0= ruleCommand ) )* this_END_32= RULE_END )?
                            {
                            otherlv_28=(Token)match(input,Steps,FOLLOW_22); 

                            					newLeafNode(otherlv_28, grammarAccess.getJobAccess().getStepsKeyword_3_5_0());
                            				
                            // InternalMyDslParser.g:638:5: (this_BEGIN_29= RULE_BEGIN ( (lv_command_30_0= ruleCommand ) ) ( (lv_command_31_0= ruleCommand ) )* this_END_32= RULE_END )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0==RULE_BEGIN) ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // InternalMyDslParser.g:639:6: this_BEGIN_29= RULE_BEGIN ( (lv_command_30_0= ruleCommand ) ) ( (lv_command_31_0= ruleCommand ) )* this_END_32= RULE_END
                                    {
                                    this_BEGIN_29=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

                                    						newLeafNode(this_BEGIN_29, grammarAccess.getJobAccess().getBEGINTerminalRuleCall_3_5_1_0());
                                    					
                                    // InternalMyDslParser.g:643:6: ( (lv_command_30_0= ruleCommand ) )
                                    // InternalMyDslParser.g:644:7: (lv_command_30_0= ruleCommand )
                                    {
                                    // InternalMyDslParser.g:644:7: (lv_command_30_0= ruleCommand )
                                    // InternalMyDslParser.g:645:8: lv_command_30_0= ruleCommand
                                    {

                                    								newCompositeNode(grammarAccess.getJobAccess().getCommandCommandParserRuleCall_3_5_1_1_0());
                                    							
                                    pushFollow(FOLLOW_24);
                                    lv_command_30_0=ruleCommand();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getJobRule());
                                    								}
                                    								add(
                                    									current,
                                    									"command",
                                    									lv_command_30_0,
                                    									"org.xtext.example.mydsl10.MyDsl.Command");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalMyDslParser.g:662:6: ( (lv_command_31_0= ruleCommand ) )*
                                    loop22:
                                    do {
                                        int alt22=2;
                                        int LA22_0 = input.LA(1);

                                        if ( (LA22_0==Name_2||LA22_0==Run) ) {
                                            alt22=1;
                                        }


                                        switch (alt22) {
                                    	case 1 :
                                    	    // InternalMyDslParser.g:663:7: (lv_command_31_0= ruleCommand )
                                    	    {
                                    	    // InternalMyDslParser.g:663:7: (lv_command_31_0= ruleCommand )
                                    	    // InternalMyDslParser.g:664:8: lv_command_31_0= ruleCommand
                                    	    {

                                    	    								newCompositeNode(grammarAccess.getJobAccess().getCommandCommandParserRuleCall_3_5_1_2_0());
                                    	    							
                                    	    pushFollow(FOLLOW_24);
                                    	    lv_command_31_0=ruleCommand();

                                    	    state._fsp--;


                                    	    								if (current==null) {
                                    	    									current = createModelElementForParent(grammarAccess.getJobRule());
                                    	    								}
                                    	    								add(
                                    	    									current,
                                    	    									"command",
                                    	    									lv_command_31_0,
                                    	    									"org.xtext.example.mydsl10.MyDsl.Command");
                                    	    								afterParserOrEnumRuleCall();
                                    	    							

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop22;
                                        }
                                    } while (true);

                                    this_END_32=(Token)match(input,RULE_END,FOLLOW_25); 

                                    						newLeafNode(this_END_32, grammarAccess.getJobAccess().getENDTerminalRuleCall_3_5_1_3());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalMyDslParser.g:687:4: (otherlv_33= Input otherlv_34= LeftCurlyBracket ( (lv_input_35_0= ruleArtifact ) ) (otherlv_36= Comma ( (lv_input_37_0= ruleArtifact ) ) )* otherlv_38= RightCurlyBracket )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==Input) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalMyDslParser.g:688:5: otherlv_33= Input otherlv_34= LeftCurlyBracket ( (lv_input_35_0= ruleArtifact ) ) (otherlv_36= Comma ( (lv_input_37_0= ruleArtifact ) ) )* otherlv_38= RightCurlyBracket
                            {
                            otherlv_33=(Token)match(input,Input,FOLLOW_26); 

                            					newLeafNode(otherlv_33, grammarAccess.getJobAccess().getInputKeyword_3_6_0());
                            				
                            otherlv_34=(Token)match(input,LeftCurlyBracket,FOLLOW_27); 

                            					newLeafNode(otherlv_34, grammarAccess.getJobAccess().getLeftCurlyBracketKeyword_3_6_1());
                            				
                            // InternalMyDslParser.g:696:5: ( (lv_input_35_0= ruleArtifact ) )
                            // InternalMyDslParser.g:697:6: (lv_input_35_0= ruleArtifact )
                            {
                            // InternalMyDslParser.g:697:6: (lv_input_35_0= ruleArtifact )
                            // InternalMyDslParser.g:698:7: lv_input_35_0= ruleArtifact
                            {

                            							newCompositeNode(grammarAccess.getJobAccess().getInputArtifactParserRuleCall_3_6_2_0());
                            						
                            pushFollow(FOLLOW_28);
                            lv_input_35_0=ruleArtifact();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getJobRule());
                            							}
                            							add(
                            								current,
                            								"input",
                            								lv_input_35_0,
                            								"org.xtext.example.mydsl10.MyDsl.Artifact");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyDslParser.g:715:5: (otherlv_36= Comma ( (lv_input_37_0= ruleArtifact ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==Comma) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalMyDslParser.g:716:6: otherlv_36= Comma ( (lv_input_37_0= ruleArtifact ) )
                            	    {
                            	    otherlv_36=(Token)match(input,Comma,FOLLOW_27); 

                            	    						newLeafNode(otherlv_36, grammarAccess.getJobAccess().getCommaKeyword_3_6_3_0());
                            	    					
                            	    // InternalMyDslParser.g:720:6: ( (lv_input_37_0= ruleArtifact ) )
                            	    // InternalMyDslParser.g:721:7: (lv_input_37_0= ruleArtifact )
                            	    {
                            	    // InternalMyDslParser.g:721:7: (lv_input_37_0= ruleArtifact )
                            	    // InternalMyDslParser.g:722:8: lv_input_37_0= ruleArtifact
                            	    {

                            	    								newCompositeNode(grammarAccess.getJobAccess().getInputArtifactParserRuleCall_3_6_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_28);
                            	    lv_input_37_0=ruleArtifact();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getJobRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"input",
                            	    									lv_input_37_0,
                            	    									"org.xtext.example.mydsl10.MyDsl.Artifact");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop25;
                                }
                            } while (true);

                            otherlv_38=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                            					newLeafNode(otherlv_38, grammarAccess.getJobAccess().getRightCurlyBracketKeyword_3_6_4());
                            				

                            }
                            break;

                    }

                    this_END_39=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_39, grammarAccess.getJobAccess().getENDTerminalRuleCall_3_7());
                    			

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
    // $ANTLR end "ruleJob"


    // $ANTLR start "entryRuleEString"
    // InternalMyDslParser.g:754:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDslParser.g:754:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDslParser.g:755:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDslParser.g:761:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDslParser.g:767:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDslParser.g:768:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDslParser.g:768:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDslParser.g:769:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:777:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTool_framework"
    // InternalMyDslParser.g:788:1: entryRuleTool_framework returns [EObject current=null] : iv_ruleTool_framework= ruleTool_framework EOF ;
    public final EObject entryRuleTool_framework() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTool_framework = null;


        try {
            // InternalMyDslParser.g:788:55: (iv_ruleTool_framework= ruleTool_framework EOF )
            // InternalMyDslParser.g:789:2: iv_ruleTool_framework= ruleTool_framework EOF
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
    // InternalMyDslParser.g:795:1: ruleTool_framework returns [EObject current=null] : ( () ( (lv_Name5_1_0= ruleEString ) ) ) ;
    public final EObject ruleTool_framework() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_Name5_1_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:801:2: ( ( () ( (lv_Name5_1_0= ruleEString ) ) ) )
            // InternalMyDslParser.g:802:2: ( () ( (lv_Name5_1_0= ruleEString ) ) )
            {
            // InternalMyDslParser.g:802:2: ( () ( (lv_Name5_1_0= ruleEString ) ) )
            // InternalMyDslParser.g:803:3: () ( (lv_Name5_1_0= ruleEString ) )
            {
            // InternalMyDslParser.g:803:3: ()
            // InternalMyDslParser.g:804:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTool_frameworkAccess().getTool_frameworkAction_0(),
            					current);
            			

            }

            // InternalMyDslParser.g:810:3: ( (lv_Name5_1_0= ruleEString ) )
            // InternalMyDslParser.g:811:4: (lv_Name5_1_0= ruleEString )
            {
            // InternalMyDslParser.g:811:4: (lv_Name5_1_0= ruleEString )
            // InternalMyDslParser.g:812:5: lv_Name5_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTool_frameworkAccess().getName5EStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_Name5_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTool_frameworkRule());
            					}
            					set(
            						current,
            						"Name5",
            						lv_Name5_1_0,
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
    // $ANTLR end "ruleTool_framework"


    // $ANTLR start "entryRuleEnvironment"
    // InternalMyDslParser.g:833:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalMyDslParser.g:833:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalMyDslParser.g:834:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalMyDslParser.g:840:1: ruleEnvironment returns [EObject current=null] : ( ( (lv_Key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_Value_2_0= ruleEString ) ) ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_Key_0_0 = null;

        AntlrDatatypeRuleToken lv_Value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:846:2: ( ( ( (lv_Key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_Value_2_0= ruleEString ) ) ) )
            // InternalMyDslParser.g:847:2: ( ( (lv_Key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_Value_2_0= ruleEString ) ) )
            {
            // InternalMyDslParser.g:847:2: ( ( (lv_Key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_Value_2_0= ruleEString ) ) )
            // InternalMyDslParser.g:848:3: ( (lv_Key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_Value_2_0= ruleEString ) )
            {
            // InternalMyDslParser.g:848:3: ( (lv_Key_0_0= ruleEString ) )
            // InternalMyDslParser.g:849:4: (lv_Key_0_0= ruleEString )
            {
            // InternalMyDslParser.g:849:4: (lv_Key_0_0= ruleEString )
            // InternalMyDslParser.g:850:5: lv_Key_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvironmentAccess().getKeyEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_Key_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            					}
            					set(
            						current,
            						"Key",
            						lv_Key_0_0,
            						"org.xtext.example.mydsl10.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getColonKeyword_1());
            		
            // InternalMyDslParser.g:871:3: ( (lv_Value_2_0= ruleEString ) )
            // InternalMyDslParser.g:872:4: (lv_Value_2_0= ruleEString )
            {
            // InternalMyDslParser.g:872:4: (lv_Value_2_0= ruleEString )
            // InternalMyDslParser.g:873:5: lv_Value_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvironmentAccess().getValueEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_Value_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            					}
            					set(
            						current,
            						"Value",
            						lv_Value_2_0,
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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleArtifact"
    // InternalMyDslParser.g:894:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalMyDslParser.g:894:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalMyDslParser.g:895:2: iv_ruleArtifact= ruleArtifact EOF
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
    // InternalMyDslParser.g:901:1: ruleArtifact returns [EObject current=null] : (otherlv_0= Artifact otherlv_1= LeftCurlyBracket (otherlv_2= Name3 ( (lv_Name3_3_0= ruleEString ) ) )? otherlv_4= RightCurlyBracket ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_Name3_3_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:907:2: ( (otherlv_0= Artifact otherlv_1= LeftCurlyBracket (otherlv_2= Name3 ( (lv_Name3_3_0= ruleEString ) ) )? otherlv_4= RightCurlyBracket ) )
            // InternalMyDslParser.g:908:2: (otherlv_0= Artifact otherlv_1= LeftCurlyBracket (otherlv_2= Name3 ( (lv_Name3_3_0= ruleEString ) ) )? otherlv_4= RightCurlyBracket )
            {
            // InternalMyDslParser.g:908:2: (otherlv_0= Artifact otherlv_1= LeftCurlyBracket (otherlv_2= Name3 ( (lv_Name3_3_0= ruleEString ) ) )? otherlv_4= RightCurlyBracket )
            // InternalMyDslParser.g:909:3: otherlv_0= Artifact otherlv_1= LeftCurlyBracket (otherlv_2= Name3 ( (lv_Name3_3_0= ruleEString ) ) )? otherlv_4= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Artifact,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getArtifactAccess().getArtifactKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDslParser.g:917:3: (otherlv_2= Name3 ( (lv_Name3_3_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Name3) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDslParser.g:918:4: otherlv_2= Name3 ( (lv_Name3_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Name3,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getName3Keyword_2_0());
                    			
                    // InternalMyDslParser.g:922:4: ( (lv_Name3_3_0= ruleEString ) )
                    // InternalMyDslParser.g:923:5: (lv_Name3_3_0= ruleEString )
                    {
                    // InternalMyDslParser.g:923:5: (lv_Name3_3_0= ruleEString )
                    // InternalMyDslParser.g:924:6: lv_Name3_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getArtifactAccess().getName3EStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_Name3_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArtifactRule());
                    						}
                    						set(
                    							current,
                    							"Name3",
                    							lv_Name3_3_0,
                    							"org.xtext.example.mydsl10.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalMyDslParser.g:950:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalMyDslParser.g:950:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalMyDslParser.g:951:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalMyDslParser.g:957:1: ruleCommand returns [EObject current=null] : ( (otherlv_0= Run ( ( (lv_tool_1_0= ruleTool_framework ) ) ( (lv_Parameters_2_0= ruleEString ) ) ) ) | (otherlv_3= Name_2 ( (lv_Description_4_0= ruleEString ) ) (this_BEGIN_5= RULE_BEGIN (otherlv_6= Env (this_BEGIN_7= RULE_BEGIN ( (lv_environment_8_0= ruleEnvironment ) ) ( (lv_environment_9_0= ruleEnvironment ) )* this_END_10= RULE_END )? )? otherlv_11= Run_1 (this_BEGIN_12= RULE_BEGIN ( ( (lv_tool_13_0= ruleTool_framework ) ) ( (lv_Parameters_14_0= ruleEString ) ) ) ( ( (lv_tool_15_0= ruleTool_framework ) ) ( (lv_Parameters_16_0= ruleEString ) ) )* this_END_17= RULE_END )? this_END_18= RULE_END )? ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token this_BEGIN_5=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_10=null;
        Token otherlv_11=null;
        Token this_BEGIN_12=null;
        Token this_END_17=null;
        Token this_END_18=null;
        EObject lv_tool_1_0 = null;

        AntlrDatatypeRuleToken lv_Parameters_2_0 = null;

        AntlrDatatypeRuleToken lv_Description_4_0 = null;

        EObject lv_environment_8_0 = null;

        EObject lv_environment_9_0 = null;

        EObject lv_tool_13_0 = null;

        AntlrDatatypeRuleToken lv_Parameters_14_0 = null;

        EObject lv_tool_15_0 = null;

        AntlrDatatypeRuleToken lv_Parameters_16_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:963:2: ( ( (otherlv_0= Run ( ( (lv_tool_1_0= ruleTool_framework ) ) ( (lv_Parameters_2_0= ruleEString ) ) ) ) | (otherlv_3= Name_2 ( (lv_Description_4_0= ruleEString ) ) (this_BEGIN_5= RULE_BEGIN (otherlv_6= Env (this_BEGIN_7= RULE_BEGIN ( (lv_environment_8_0= ruleEnvironment ) ) ( (lv_environment_9_0= ruleEnvironment ) )* this_END_10= RULE_END )? )? otherlv_11= Run_1 (this_BEGIN_12= RULE_BEGIN ( ( (lv_tool_13_0= ruleTool_framework ) ) ( (lv_Parameters_14_0= ruleEString ) ) ) ( ( (lv_tool_15_0= ruleTool_framework ) ) ( (lv_Parameters_16_0= ruleEString ) ) )* this_END_17= RULE_END )? this_END_18= RULE_END )? ) ) )
            // InternalMyDslParser.g:964:2: ( (otherlv_0= Run ( ( (lv_tool_1_0= ruleTool_framework ) ) ( (lv_Parameters_2_0= ruleEString ) ) ) ) | (otherlv_3= Name_2 ( (lv_Description_4_0= ruleEString ) ) (this_BEGIN_5= RULE_BEGIN (otherlv_6= Env (this_BEGIN_7= RULE_BEGIN ( (lv_environment_8_0= ruleEnvironment ) ) ( (lv_environment_9_0= ruleEnvironment ) )* this_END_10= RULE_END )? )? otherlv_11= Run_1 (this_BEGIN_12= RULE_BEGIN ( ( (lv_tool_13_0= ruleTool_framework ) ) ( (lv_Parameters_14_0= ruleEString ) ) ) ( ( (lv_tool_15_0= ruleTool_framework ) ) ( (lv_Parameters_16_0= ruleEString ) ) )* this_END_17= RULE_END )? this_END_18= RULE_END )? ) )
            {
            // InternalMyDslParser.g:964:2: ( (otherlv_0= Run ( ( (lv_tool_1_0= ruleTool_framework ) ) ( (lv_Parameters_2_0= ruleEString ) ) ) ) | (otherlv_3= Name_2 ( (lv_Description_4_0= ruleEString ) ) (this_BEGIN_5= RULE_BEGIN (otherlv_6= Env (this_BEGIN_7= RULE_BEGIN ( (lv_environment_8_0= ruleEnvironment ) ) ( (lv_environment_9_0= ruleEnvironment ) )* this_END_10= RULE_END )? )? otherlv_11= Run_1 (this_BEGIN_12= RULE_BEGIN ( ( (lv_tool_13_0= ruleTool_framework ) ) ( (lv_Parameters_14_0= ruleEString ) ) ) ( ( (lv_tool_15_0= ruleTool_framework ) ) ( (lv_Parameters_16_0= ruleEString ) ) )* this_END_17= RULE_END )? this_END_18= RULE_END )? ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Run) ) {
                alt36=1;
            }
            else if ( (LA36_0==Name_2) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDslParser.g:965:3: (otherlv_0= Run ( ( (lv_tool_1_0= ruleTool_framework ) ) ( (lv_Parameters_2_0= ruleEString ) ) ) )
                    {
                    // InternalMyDslParser.g:965:3: (otherlv_0= Run ( ( (lv_tool_1_0= ruleTool_framework ) ) ( (lv_Parameters_2_0= ruleEString ) ) ) )
                    // InternalMyDslParser.g:966:4: otherlv_0= Run ( ( (lv_tool_1_0= ruleTool_framework ) ) ( (lv_Parameters_2_0= ruleEString ) ) )
                    {
                    otherlv_0=(Token)match(input,Run,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getRunKeyword_0_0());
                    			
                    // InternalMyDslParser.g:970:4: ( ( (lv_tool_1_0= ruleTool_framework ) ) ( (lv_Parameters_2_0= ruleEString ) ) )
                    // InternalMyDslParser.g:971:5: ( (lv_tool_1_0= ruleTool_framework ) ) ( (lv_Parameters_2_0= ruleEString ) )
                    {
                    // InternalMyDslParser.g:971:5: ( (lv_tool_1_0= ruleTool_framework ) )
                    // InternalMyDslParser.g:972:6: (lv_tool_1_0= ruleTool_framework )
                    {
                    // InternalMyDslParser.g:972:6: (lv_tool_1_0= ruleTool_framework )
                    // InternalMyDslParser.g:973:7: lv_tool_1_0= ruleTool_framework
                    {

                    							newCompositeNode(grammarAccess.getCommandAccess().getToolTool_frameworkParserRuleCall_0_1_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_tool_1_0=ruleTool_framework();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCommandRule());
                    							}
                    							add(
                    								current,
                    								"tool",
                    								lv_tool_1_0,
                    								"org.xtext.example.mydsl10.MyDsl.Tool_framework");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDslParser.g:990:5: ( (lv_Parameters_2_0= ruleEString ) )
                    // InternalMyDslParser.g:991:6: (lv_Parameters_2_0= ruleEString )
                    {
                    // InternalMyDslParser.g:991:6: (lv_Parameters_2_0= ruleEString )
                    // InternalMyDslParser.g:992:7: lv_Parameters_2_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getCommandAccess().getParametersEStringParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_Parameters_2_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCommandRule());
                    							}
                    							add(
                    								current,
                    								"Parameters",
                    								lv_Parameters_2_0,
                    								"org.xtext.example.mydsl10.MyDsl.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:1012:3: (otherlv_3= Name_2 ( (lv_Description_4_0= ruleEString ) ) (this_BEGIN_5= RULE_BEGIN (otherlv_6= Env (this_BEGIN_7= RULE_BEGIN ( (lv_environment_8_0= ruleEnvironment ) ) ( (lv_environment_9_0= ruleEnvironment ) )* this_END_10= RULE_END )? )? otherlv_11= Run_1 (this_BEGIN_12= RULE_BEGIN ( ( (lv_tool_13_0= ruleTool_framework ) ) ( (lv_Parameters_14_0= ruleEString ) ) ) ( ( (lv_tool_15_0= ruleTool_framework ) ) ( (lv_Parameters_16_0= ruleEString ) ) )* this_END_17= RULE_END )? this_END_18= RULE_END )? )
                    {
                    // InternalMyDslParser.g:1012:3: (otherlv_3= Name_2 ( (lv_Description_4_0= ruleEString ) ) (this_BEGIN_5= RULE_BEGIN (otherlv_6= Env (this_BEGIN_7= RULE_BEGIN ( (lv_environment_8_0= ruleEnvironment ) ) ( (lv_environment_9_0= ruleEnvironment ) )* this_END_10= RULE_END )? )? otherlv_11= Run_1 (this_BEGIN_12= RULE_BEGIN ( ( (lv_tool_13_0= ruleTool_framework ) ) ( (lv_Parameters_14_0= ruleEString ) ) ) ( ( (lv_tool_15_0= ruleTool_framework ) ) ( (lv_Parameters_16_0= ruleEString ) ) )* this_END_17= RULE_END )? this_END_18= RULE_END )? )
                    // InternalMyDslParser.g:1013:4: otherlv_3= Name_2 ( (lv_Description_4_0= ruleEString ) ) (this_BEGIN_5= RULE_BEGIN (otherlv_6= Env (this_BEGIN_7= RULE_BEGIN ( (lv_environment_8_0= ruleEnvironment ) ) ( (lv_environment_9_0= ruleEnvironment ) )* this_END_10= RULE_END )? )? otherlv_11= Run_1 (this_BEGIN_12= RULE_BEGIN ( ( (lv_tool_13_0= ruleTool_framework ) ) ( (lv_Parameters_14_0= ruleEString ) ) ) ( ( (lv_tool_15_0= ruleTool_framework ) ) ( (lv_Parameters_16_0= ruleEString ) ) )* this_END_17= RULE_END )? this_END_18= RULE_END )?
                    {
                    otherlv_3=(Token)match(input,Name_2,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCommandAccess().getNameKeyword_1_0());
                    			
                    // InternalMyDslParser.g:1017:4: ( (lv_Description_4_0= ruleEString ) )
                    // InternalMyDslParser.g:1018:5: (lv_Description_4_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1018:5: (lv_Description_4_0= ruleEString )
                    // InternalMyDslParser.g:1019:6: lv_Description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getDescriptionEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_Description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"Description",
                    							lv_Description_4_0,
                    							"org.xtext.example.mydsl10.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:1036:4: (this_BEGIN_5= RULE_BEGIN (otherlv_6= Env (this_BEGIN_7= RULE_BEGIN ( (lv_environment_8_0= ruleEnvironment ) ) ( (lv_environment_9_0= ruleEnvironment ) )* this_END_10= RULE_END )? )? otherlv_11= Run_1 (this_BEGIN_12= RULE_BEGIN ( ( (lv_tool_13_0= ruleTool_framework ) ) ( (lv_Parameters_14_0= ruleEString ) ) ) ( ( (lv_tool_15_0= ruleTool_framework ) ) ( (lv_Parameters_16_0= ruleEString ) ) )* this_END_17= RULE_END )? this_END_18= RULE_END )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_BEGIN) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalMyDslParser.g:1037:5: this_BEGIN_5= RULE_BEGIN (otherlv_6= Env (this_BEGIN_7= RULE_BEGIN ( (lv_environment_8_0= ruleEnvironment ) ) ( (lv_environment_9_0= ruleEnvironment ) )* this_END_10= RULE_END )? )? otherlv_11= Run_1 (this_BEGIN_12= RULE_BEGIN ( ( (lv_tool_13_0= ruleTool_framework ) ) ( (lv_Parameters_14_0= ruleEString ) ) ) ( ( (lv_tool_15_0= ruleTool_framework ) ) ( (lv_Parameters_16_0= ruleEString ) ) )* this_END_17= RULE_END )? this_END_18= RULE_END
                            {
                            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_32); 

                            					newLeafNode(this_BEGIN_5, grammarAccess.getCommandAccess().getBEGINTerminalRuleCall_1_2_0());
                            				
                            // InternalMyDslParser.g:1041:5: (otherlv_6= Env (this_BEGIN_7= RULE_BEGIN ( (lv_environment_8_0= ruleEnvironment ) ) ( (lv_environment_9_0= ruleEnvironment ) )* this_END_10= RULE_END )? )?
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==Env) ) {
                                alt32=1;
                            }
                            switch (alt32) {
                                case 1 :
                                    // InternalMyDslParser.g:1042:6: otherlv_6= Env (this_BEGIN_7= RULE_BEGIN ( (lv_environment_8_0= ruleEnvironment ) ) ( (lv_environment_9_0= ruleEnvironment ) )* this_END_10= RULE_END )?
                                    {
                                    otherlv_6=(Token)match(input,Env,FOLLOW_33); 

                                    						newLeafNode(otherlv_6, grammarAccess.getCommandAccess().getEnvKeyword_1_2_1_0());
                                    					
                                    // InternalMyDslParser.g:1046:6: (this_BEGIN_7= RULE_BEGIN ( (lv_environment_8_0= ruleEnvironment ) ) ( (lv_environment_9_0= ruleEnvironment ) )* this_END_10= RULE_END )?
                                    int alt31=2;
                                    int LA31_0 = input.LA(1);

                                    if ( (LA31_0==RULE_BEGIN) ) {
                                        alt31=1;
                                    }
                                    switch (alt31) {
                                        case 1 :
                                            // InternalMyDslParser.g:1047:7: this_BEGIN_7= RULE_BEGIN ( (lv_environment_8_0= ruleEnvironment ) ) ( (lv_environment_9_0= ruleEnvironment ) )* this_END_10= RULE_END
                                            {
                                            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_3); 

                                            							newLeafNode(this_BEGIN_7, grammarAccess.getCommandAccess().getBEGINTerminalRuleCall_1_2_1_1_0());
                                            						
                                            // InternalMyDslParser.g:1051:7: ( (lv_environment_8_0= ruleEnvironment ) )
                                            // InternalMyDslParser.g:1052:8: (lv_environment_8_0= ruleEnvironment )
                                            {
                                            // InternalMyDslParser.g:1052:8: (lv_environment_8_0= ruleEnvironment )
                                            // InternalMyDslParser.g:1053:9: lv_environment_8_0= ruleEnvironment
                                            {

                                            									newCompositeNode(grammarAccess.getCommandAccess().getEnvironmentEnvironmentParserRuleCall_1_2_1_1_1_0());
                                            								
                                            pushFollow(FOLLOW_34);
                                            lv_environment_8_0=ruleEnvironment();

                                            state._fsp--;


                                            									if (current==null) {
                                            										current = createModelElementForParent(grammarAccess.getCommandRule());
                                            									}
                                            									add(
                                            										current,
                                            										"environment",
                                            										lv_environment_8_0,
                                            										"org.xtext.example.mydsl10.MyDsl.Environment");
                                            									afterParserOrEnumRuleCall();
                                            								

                                            }


                                            }

                                            // InternalMyDslParser.g:1070:7: ( (lv_environment_9_0= ruleEnvironment ) )*
                                            loop30:
                                            do {
                                                int alt30=2;
                                                int LA30_0 = input.LA(1);

                                                if ( (LA30_0==RULE_ID||LA30_0==RULE_STRING) ) {
                                                    alt30=1;
                                                }


                                                switch (alt30) {
                                            	case 1 :
                                            	    // InternalMyDslParser.g:1071:8: (lv_environment_9_0= ruleEnvironment )
                                            	    {
                                            	    // InternalMyDslParser.g:1071:8: (lv_environment_9_0= ruleEnvironment )
                                            	    // InternalMyDslParser.g:1072:9: lv_environment_9_0= ruleEnvironment
                                            	    {

                                            	    									newCompositeNode(grammarAccess.getCommandAccess().getEnvironmentEnvironmentParserRuleCall_1_2_1_1_2_0());
                                            	    								
                                            	    pushFollow(FOLLOW_34);
                                            	    lv_environment_9_0=ruleEnvironment();

                                            	    state._fsp--;


                                            	    									if (current==null) {
                                            	    										current = createModelElementForParent(grammarAccess.getCommandRule());
                                            	    									}
                                            	    									add(
                                            	    										current,
                                            	    										"environment",
                                            	    										lv_environment_9_0,
                                            	    										"org.xtext.example.mydsl10.MyDsl.Environment");
                                            	    									afterParserOrEnumRuleCall();
                                            	    								

                                            	    }


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop30;
                                                }
                                            } while (true);

                                            this_END_10=(Token)match(input,RULE_END,FOLLOW_35); 

                                            							newLeafNode(this_END_10, grammarAccess.getCommandAccess().getENDTerminalRuleCall_1_2_1_1_3());
                                            						

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }

                            otherlv_11=(Token)match(input,Run_1,FOLLOW_36); 

                            					newLeafNode(otherlv_11, grammarAccess.getCommandAccess().getRunKeyword_1_2_2());
                            				
                            // InternalMyDslParser.g:1099:5: (this_BEGIN_12= RULE_BEGIN ( ( (lv_tool_13_0= ruleTool_framework ) ) ( (lv_Parameters_14_0= ruleEString ) ) ) ( ( (lv_tool_15_0= ruleTool_framework ) ) ( (lv_Parameters_16_0= ruleEString ) ) )* this_END_17= RULE_END )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==RULE_BEGIN) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // InternalMyDslParser.g:1100:6: this_BEGIN_12= RULE_BEGIN ( ( (lv_tool_13_0= ruleTool_framework ) ) ( (lv_Parameters_14_0= ruleEString ) ) ) ( ( (lv_tool_15_0= ruleTool_framework ) ) ( (lv_Parameters_16_0= ruleEString ) ) )* this_END_17= RULE_END
                                    {
                                    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_3); 

                                    						newLeafNode(this_BEGIN_12, grammarAccess.getCommandAccess().getBEGINTerminalRuleCall_1_2_3_0());
                                    					
                                    // InternalMyDslParser.g:1104:6: ( ( (lv_tool_13_0= ruleTool_framework ) ) ( (lv_Parameters_14_0= ruleEString ) ) )
                                    // InternalMyDslParser.g:1105:7: ( (lv_tool_13_0= ruleTool_framework ) ) ( (lv_Parameters_14_0= ruleEString ) )
                                    {
                                    // InternalMyDslParser.g:1105:7: ( (lv_tool_13_0= ruleTool_framework ) )
                                    // InternalMyDslParser.g:1106:8: (lv_tool_13_0= ruleTool_framework )
                                    {
                                    // InternalMyDslParser.g:1106:8: (lv_tool_13_0= ruleTool_framework )
                                    // InternalMyDslParser.g:1107:9: lv_tool_13_0= ruleTool_framework
                                    {

                                    									newCompositeNode(grammarAccess.getCommandAccess().getToolTool_frameworkParserRuleCall_1_2_3_1_0_0());
                                    								
                                    pushFollow(FOLLOW_3);
                                    lv_tool_13_0=ruleTool_framework();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getCommandRule());
                                    									}
                                    									add(
                                    										current,
                                    										"tool",
                                    										lv_tool_13_0,
                                    										"org.xtext.example.mydsl10.MyDsl.Tool_framework");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }

                                    // InternalMyDslParser.g:1124:7: ( (lv_Parameters_14_0= ruleEString ) )
                                    // InternalMyDslParser.g:1125:8: (lv_Parameters_14_0= ruleEString )
                                    {
                                    // InternalMyDslParser.g:1125:8: (lv_Parameters_14_0= ruleEString )
                                    // InternalMyDslParser.g:1126:9: lv_Parameters_14_0= ruleEString
                                    {

                                    									newCompositeNode(grammarAccess.getCommandAccess().getParametersEStringParserRuleCall_1_2_3_1_1_0());
                                    								
                                    pushFollow(FOLLOW_34);
                                    lv_Parameters_14_0=ruleEString();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getCommandRule());
                                    									}
                                    									add(
                                    										current,
                                    										"Parameters",
                                    										lv_Parameters_14_0,
                                    										"org.xtext.example.mydsl10.MyDsl.EString");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }


                                    }

                                    // InternalMyDslParser.g:1144:6: ( ( (lv_tool_15_0= ruleTool_framework ) ) ( (lv_Parameters_16_0= ruleEString ) ) )*
                                    loop33:
                                    do {
                                        int alt33=2;
                                        int LA33_0 = input.LA(1);

                                        if ( (LA33_0==RULE_ID||LA33_0==RULE_STRING) ) {
                                            alt33=1;
                                        }


                                        switch (alt33) {
                                    	case 1 :
                                    	    // InternalMyDslParser.g:1145:7: ( (lv_tool_15_0= ruleTool_framework ) ) ( (lv_Parameters_16_0= ruleEString ) )
                                    	    {
                                    	    // InternalMyDslParser.g:1145:7: ( (lv_tool_15_0= ruleTool_framework ) )
                                    	    // InternalMyDslParser.g:1146:8: (lv_tool_15_0= ruleTool_framework )
                                    	    {
                                    	    // InternalMyDslParser.g:1146:8: (lv_tool_15_0= ruleTool_framework )
                                    	    // InternalMyDslParser.g:1147:9: lv_tool_15_0= ruleTool_framework
                                    	    {

                                    	    									newCompositeNode(grammarAccess.getCommandAccess().getToolTool_frameworkParserRuleCall_1_2_3_2_0_0());
                                    	    								
                                    	    pushFollow(FOLLOW_3);
                                    	    lv_tool_15_0=ruleTool_framework();

                                    	    state._fsp--;


                                    	    									if (current==null) {
                                    	    										current = createModelElementForParent(grammarAccess.getCommandRule());
                                    	    									}
                                    	    									add(
                                    	    										current,
                                    	    										"tool",
                                    	    										lv_tool_15_0,
                                    	    										"org.xtext.example.mydsl10.MyDsl.Tool_framework");
                                    	    									afterParserOrEnumRuleCall();
                                    	    								

                                    	    }


                                    	    }

                                    	    // InternalMyDslParser.g:1164:7: ( (lv_Parameters_16_0= ruleEString ) )
                                    	    // InternalMyDslParser.g:1165:8: (lv_Parameters_16_0= ruleEString )
                                    	    {
                                    	    // InternalMyDslParser.g:1165:8: (lv_Parameters_16_0= ruleEString )
                                    	    // InternalMyDslParser.g:1166:9: lv_Parameters_16_0= ruleEString
                                    	    {

                                    	    									newCompositeNode(grammarAccess.getCommandAccess().getParametersEStringParserRuleCall_1_2_3_2_1_0());
                                    	    								
                                    	    pushFollow(FOLLOW_34);
                                    	    lv_Parameters_16_0=ruleEString();

                                    	    state._fsp--;


                                    	    									if (current==null) {
                                    	    										current = createModelElementForParent(grammarAccess.getCommandRule());
                                    	    									}
                                    	    									add(
                                    	    										current,
                                    	    										"Parameters",
                                    	    										lv_Parameters_16_0,
                                    	    										"org.xtext.example.mydsl10.MyDsl.EString");
                                    	    									afterParserOrEnumRuleCall();
                                    	    								

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop33;
                                        }
                                    } while (true);

                                    this_END_17=(Token)match(input,RULE_END,FOLLOW_29); 

                                    						newLeafNode(this_END_17, grammarAccess.getCommandAccess().getENDTerminalRuleCall_1_2_3_3());
                                    					

                                    }
                                    break;

                            }

                            this_END_18=(Token)match(input,RULE_END,FOLLOW_2); 

                            					newLeafNode(this_END_18, grammarAccess.getCommandAccess().getENDTerminalRuleCall_1_2_4());
                            				

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleIfThenElse"
    // InternalMyDslParser.g:1199:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // InternalMyDslParser.g:1199:51: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // InternalMyDslParser.g:1200:2: iv_ruleIfThenElse= ruleIfThenElse EOF
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
    // InternalMyDslParser.g:1206:1: ruleIfThenElse returns [EObject current=null] : (otherlv_0= LeftCurlyBracket (otherlv_1= Condition ( (lv_Condition_2_0= ruleEString ) ) )? (otherlv_3= If otherlv_4= LeftCurlyBracket ( (lv_if_5_0= ruleCommand ) ) (otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) ) )* otherlv_8= RightCurlyBracket )? (otherlv_9= Else otherlv_10= LeftCurlyBracket ( (lv_else_11_0= ruleCommand ) ) (otherlv_12= Comma ( (lv_else_13_0= ruleCommand ) ) )* otherlv_14= RightCurlyBracket )? (otherlv_15= Ifelse otherlv_16= LeftCurlyBracket ( (lv_ifelse_17_0= ruleIfThenElse ) ) (otherlv_18= Comma ( (lv_ifelse_19_0= ruleIfThenElse ) ) )* otherlv_20= RightCurlyBracket )? (otherlv_21= Elseif otherlv_22= LeftCurlyBracket ( (lv_elseif_23_0= ruleIfThenElse ) ) (otherlv_24= Comma ( (lv_elseif_25_0= ruleIfThenElse ) ) )* otherlv_26= RightCurlyBracket )? otherlv_27= RightCurlyBracket ) ;
    public final EObject ruleIfThenElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_Condition_2_0 = null;

        EObject lv_if_5_0 = null;

        EObject lv_if_7_0 = null;

        EObject lv_else_11_0 = null;

        EObject lv_else_13_0 = null;

        EObject lv_ifelse_17_0 = null;

        EObject lv_ifelse_19_0 = null;

        EObject lv_elseif_23_0 = null;

        EObject lv_elseif_25_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1212:2: ( (otherlv_0= LeftCurlyBracket (otherlv_1= Condition ( (lv_Condition_2_0= ruleEString ) ) )? (otherlv_3= If otherlv_4= LeftCurlyBracket ( (lv_if_5_0= ruleCommand ) ) (otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) ) )* otherlv_8= RightCurlyBracket )? (otherlv_9= Else otherlv_10= LeftCurlyBracket ( (lv_else_11_0= ruleCommand ) ) (otherlv_12= Comma ( (lv_else_13_0= ruleCommand ) ) )* otherlv_14= RightCurlyBracket )? (otherlv_15= Ifelse otherlv_16= LeftCurlyBracket ( (lv_ifelse_17_0= ruleIfThenElse ) ) (otherlv_18= Comma ( (lv_ifelse_19_0= ruleIfThenElse ) ) )* otherlv_20= RightCurlyBracket )? (otherlv_21= Elseif otherlv_22= LeftCurlyBracket ( (lv_elseif_23_0= ruleIfThenElse ) ) (otherlv_24= Comma ( (lv_elseif_25_0= ruleIfThenElse ) ) )* otherlv_26= RightCurlyBracket )? otherlv_27= RightCurlyBracket ) )
            // InternalMyDslParser.g:1213:2: (otherlv_0= LeftCurlyBracket (otherlv_1= Condition ( (lv_Condition_2_0= ruleEString ) ) )? (otherlv_3= If otherlv_4= LeftCurlyBracket ( (lv_if_5_0= ruleCommand ) ) (otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) ) )* otherlv_8= RightCurlyBracket )? (otherlv_9= Else otherlv_10= LeftCurlyBracket ( (lv_else_11_0= ruleCommand ) ) (otherlv_12= Comma ( (lv_else_13_0= ruleCommand ) ) )* otherlv_14= RightCurlyBracket )? (otherlv_15= Ifelse otherlv_16= LeftCurlyBracket ( (lv_ifelse_17_0= ruleIfThenElse ) ) (otherlv_18= Comma ( (lv_ifelse_19_0= ruleIfThenElse ) ) )* otherlv_20= RightCurlyBracket )? (otherlv_21= Elseif otherlv_22= LeftCurlyBracket ( (lv_elseif_23_0= ruleIfThenElse ) ) (otherlv_24= Comma ( (lv_elseif_25_0= ruleIfThenElse ) ) )* otherlv_26= RightCurlyBracket )? otherlv_27= RightCurlyBracket )
            {
            // InternalMyDslParser.g:1213:2: (otherlv_0= LeftCurlyBracket (otherlv_1= Condition ( (lv_Condition_2_0= ruleEString ) ) )? (otherlv_3= If otherlv_4= LeftCurlyBracket ( (lv_if_5_0= ruleCommand ) ) (otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) ) )* otherlv_8= RightCurlyBracket )? (otherlv_9= Else otherlv_10= LeftCurlyBracket ( (lv_else_11_0= ruleCommand ) ) (otherlv_12= Comma ( (lv_else_13_0= ruleCommand ) ) )* otherlv_14= RightCurlyBracket )? (otherlv_15= Ifelse otherlv_16= LeftCurlyBracket ( (lv_ifelse_17_0= ruleIfThenElse ) ) (otherlv_18= Comma ( (lv_ifelse_19_0= ruleIfThenElse ) ) )* otherlv_20= RightCurlyBracket )? (otherlv_21= Elseif otherlv_22= LeftCurlyBracket ( (lv_elseif_23_0= ruleIfThenElse ) ) (otherlv_24= Comma ( (lv_elseif_25_0= ruleIfThenElse ) ) )* otherlv_26= RightCurlyBracket )? otherlv_27= RightCurlyBracket )
            // InternalMyDslParser.g:1214:3: otherlv_0= LeftCurlyBracket (otherlv_1= Condition ( (lv_Condition_2_0= ruleEString ) ) )? (otherlv_3= If otherlv_4= LeftCurlyBracket ( (lv_if_5_0= ruleCommand ) ) (otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) ) )* otherlv_8= RightCurlyBracket )? (otherlv_9= Else otherlv_10= LeftCurlyBracket ( (lv_else_11_0= ruleCommand ) ) (otherlv_12= Comma ( (lv_else_13_0= ruleCommand ) ) )* otherlv_14= RightCurlyBracket )? (otherlv_15= Ifelse otherlv_16= LeftCurlyBracket ( (lv_ifelse_17_0= ruleIfThenElse ) ) (otherlv_18= Comma ( (lv_ifelse_19_0= ruleIfThenElse ) ) )* otherlv_20= RightCurlyBracket )? (otherlv_21= Elseif otherlv_22= LeftCurlyBracket ( (lv_elseif_23_0= ruleIfThenElse ) ) (otherlv_24= Comma ( (lv_elseif_25_0= ruleIfThenElse ) ) )* otherlv_26= RightCurlyBracket )? otherlv_27= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMyDslParser.g:1218:3: (otherlv_1= Condition ( (lv_Condition_2_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Condition) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDslParser.g:1219:4: otherlv_1= Condition ( (lv_Condition_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,Condition,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getIfThenElseAccess().getConditionKeyword_1_0());
                    			
                    // InternalMyDslParser.g:1223:4: ( (lv_Condition_2_0= ruleEString ) )
                    // InternalMyDslParser.g:1224:5: (lv_Condition_2_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1224:5: (lv_Condition_2_0= ruleEString )
                    // InternalMyDslParser.g:1225:6: lv_Condition_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseAccess().getConditionEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_Condition_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    						}
                    						set(
                    							current,
                    							"Condition",
                    							lv_Condition_2_0,
                    							"org.xtext.example.mydsl10.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:1243:3: (otherlv_3= If otherlv_4= LeftCurlyBracket ( (lv_if_5_0= ruleCommand ) ) (otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) ) )* otherlv_8= RightCurlyBracket )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==If) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDslParser.g:1244:4: otherlv_3= If otherlv_4= LeftCurlyBracket ( (lv_if_5_0= ruleCommand ) ) (otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) ) )* otherlv_8= RightCurlyBracket
                    {
                    otherlv_3=(Token)match(input,If,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getIfThenElseAccess().getIfKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,LeftCurlyBracket,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalMyDslParser.g:1252:4: ( (lv_if_5_0= ruleCommand ) )
                    // InternalMyDslParser.g:1253:5: (lv_if_5_0= ruleCommand )
                    {
                    // InternalMyDslParser.g:1253:5: (lv_if_5_0= ruleCommand )
                    // InternalMyDslParser.g:1254:6: lv_if_5_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseAccess().getIfCommandParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_if_5_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    						}
                    						add(
                    							current,
                    							"if",
                    							lv_if_5_0,
                    							"org.xtext.example.mydsl10.MyDsl.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:1271:4: (otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==Comma) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1272:5: otherlv_6= Comma ( (lv_if_7_0= ruleCommand ) )
                    	    {
                    	    otherlv_6=(Token)match(input,Comma,FOLLOW_23); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getIfThenElseAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalMyDslParser.g:1276:5: ( (lv_if_7_0= ruleCommand ) )
                    	    // InternalMyDslParser.g:1277:6: (lv_if_7_0= ruleCommand )
                    	    {
                    	    // InternalMyDslParser.g:1277:6: (lv_if_7_0= ruleCommand )
                    	    // InternalMyDslParser.g:1278:7: lv_if_7_0= ruleCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfThenElseAccess().getIfCommandParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_if_7_0=ruleCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"if",
                    	    								lv_if_7_0,
                    	    								"org.xtext.example.mydsl10.MyDsl.Command");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,RightCurlyBracket,FOLLOW_39); 

                    				newLeafNode(otherlv_8, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:1301:3: (otherlv_9= Else otherlv_10= LeftCurlyBracket ( (lv_else_11_0= ruleCommand ) ) (otherlv_12= Comma ( (lv_else_13_0= ruleCommand ) ) )* otherlv_14= RightCurlyBracket )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Else) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDslParser.g:1302:4: otherlv_9= Else otherlv_10= LeftCurlyBracket ( (lv_else_11_0= ruleCommand ) ) (otherlv_12= Comma ( (lv_else_13_0= ruleCommand ) ) )* otherlv_14= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,Else,FOLLOW_26); 

                    				newLeafNode(otherlv_9, grammarAccess.getIfThenElseAccess().getElseKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDslParser.g:1310:4: ( (lv_else_11_0= ruleCommand ) )
                    // InternalMyDslParser.g:1311:5: (lv_else_11_0= ruleCommand )
                    {
                    // InternalMyDslParser.g:1311:5: (lv_else_11_0= ruleCommand )
                    // InternalMyDslParser.g:1312:6: lv_else_11_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseAccess().getElseCommandParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_else_11_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    						}
                    						add(
                    							current,
                    							"else",
                    							lv_else_11_0,
                    							"org.xtext.example.mydsl10.MyDsl.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:1329:4: (otherlv_12= Comma ( (lv_else_13_0= ruleCommand ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==Comma) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1330:5: otherlv_12= Comma ( (lv_else_13_0= ruleCommand ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_23); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getIfThenElseAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDslParser.g:1334:5: ( (lv_else_13_0= ruleCommand ) )
                    	    // InternalMyDslParser.g:1335:6: (lv_else_13_0= ruleCommand )
                    	    {
                    	    // InternalMyDslParser.g:1335:6: (lv_else_13_0= ruleCommand )
                    	    // InternalMyDslParser.g:1336:7: lv_else_13_0= ruleCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfThenElseAccess().getElseCommandParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_else_13_0=ruleCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"else",
                    	    								lv_else_13_0,
                    	    								"org.xtext.example.mydsl10.MyDsl.Command");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_40); 

                    				newLeafNode(otherlv_14, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:1359:3: (otherlv_15= Ifelse otherlv_16= LeftCurlyBracket ( (lv_ifelse_17_0= ruleIfThenElse ) ) (otherlv_18= Comma ( (lv_ifelse_19_0= ruleIfThenElse ) ) )* otherlv_20= RightCurlyBracket )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Ifelse) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDslParser.g:1360:4: otherlv_15= Ifelse otherlv_16= LeftCurlyBracket ( (lv_ifelse_17_0= ruleIfThenElse ) ) (otherlv_18= Comma ( (lv_ifelse_19_0= ruleIfThenElse ) ) )* otherlv_20= RightCurlyBracket
                    {
                    otherlv_15=(Token)match(input,Ifelse,FOLLOW_26); 

                    				newLeafNode(otherlv_15, grammarAccess.getIfThenElseAccess().getIfelseKeyword_4_0());
                    			
                    otherlv_16=(Token)match(input,LeftCurlyBracket,FOLLOW_26); 

                    				newLeafNode(otherlv_16, grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDslParser.g:1368:4: ( (lv_ifelse_17_0= ruleIfThenElse ) )
                    // InternalMyDslParser.g:1369:5: (lv_ifelse_17_0= ruleIfThenElse )
                    {
                    // InternalMyDslParser.g:1369:5: (lv_ifelse_17_0= ruleIfThenElse )
                    // InternalMyDslParser.g:1370:6: lv_ifelse_17_0= ruleIfThenElse
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseAccess().getIfelseIfThenElseParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_ifelse_17_0=ruleIfThenElse();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    						}
                    						add(
                    							current,
                    							"ifelse",
                    							lv_ifelse_17_0,
                    							"org.xtext.example.mydsl10.MyDsl.IfThenElse");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:1387:4: (otherlv_18= Comma ( (lv_ifelse_19_0= ruleIfThenElse ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==Comma) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1388:5: otherlv_18= Comma ( (lv_ifelse_19_0= ruleIfThenElse ) )
                    	    {
                    	    otherlv_18=(Token)match(input,Comma,FOLLOW_26); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getIfThenElseAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDslParser.g:1392:5: ( (lv_ifelse_19_0= ruleIfThenElse ) )
                    	    // InternalMyDslParser.g:1393:6: (lv_ifelse_19_0= ruleIfThenElse )
                    	    {
                    	    // InternalMyDslParser.g:1393:6: (lv_ifelse_19_0= ruleIfThenElse )
                    	    // InternalMyDslParser.g:1394:7: lv_ifelse_19_0= ruleIfThenElse
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfThenElseAccess().getIfelseIfThenElseParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_ifelse_19_0=ruleIfThenElse();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ifelse",
                    	    								lv_ifelse_19_0,
                    	    								"org.xtext.example.mydsl10.MyDsl.IfThenElse");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,RightCurlyBracket,FOLLOW_41); 

                    				newLeafNode(otherlv_20, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:1417:3: (otherlv_21= Elseif otherlv_22= LeftCurlyBracket ( (lv_elseif_23_0= ruleIfThenElse ) ) (otherlv_24= Comma ( (lv_elseif_25_0= ruleIfThenElse ) ) )* otherlv_26= RightCurlyBracket )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Elseif) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDslParser.g:1418:4: otherlv_21= Elseif otherlv_22= LeftCurlyBracket ( (lv_elseif_23_0= ruleIfThenElse ) ) (otherlv_24= Comma ( (lv_elseif_25_0= ruleIfThenElse ) ) )* otherlv_26= RightCurlyBracket
                    {
                    otherlv_21=(Token)match(input,Elseif,FOLLOW_26); 

                    				newLeafNode(otherlv_21, grammarAccess.getIfThenElseAccess().getElseifKeyword_5_0());
                    			
                    otherlv_22=(Token)match(input,LeftCurlyBracket,FOLLOW_26); 

                    				newLeafNode(otherlv_22, grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDslParser.g:1426:4: ( (lv_elseif_23_0= ruleIfThenElse ) )
                    // InternalMyDslParser.g:1427:5: (lv_elseif_23_0= ruleIfThenElse )
                    {
                    // InternalMyDslParser.g:1427:5: (lv_elseif_23_0= ruleIfThenElse )
                    // InternalMyDslParser.g:1428:6: lv_elseif_23_0= ruleIfThenElse
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseAccess().getElseifIfThenElseParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_elseif_23_0=ruleIfThenElse();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    						}
                    						add(
                    							current,
                    							"elseif",
                    							lv_elseif_23_0,
                    							"org.xtext.example.mydsl10.MyDsl.IfThenElse");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:1445:4: (otherlv_24= Comma ( (lv_elseif_25_0= ruleIfThenElse ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==Comma) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1446:5: otherlv_24= Comma ( (lv_elseif_25_0= ruleIfThenElse ) )
                    	    {
                    	    otherlv_24=(Token)match(input,Comma,FOLLOW_26); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getIfThenElseAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDslParser.g:1450:5: ( (lv_elseif_25_0= ruleIfThenElse ) )
                    	    // InternalMyDslParser.g:1451:6: (lv_elseif_25_0= ruleIfThenElse )
                    	    {
                    	    // InternalMyDslParser.g:1451:6: (lv_elseif_25_0= ruleIfThenElse )
                    	    // InternalMyDslParser.g:1452:7: lv_elseif_25_0= ruleIfThenElse
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfThenElseAccess().getElseifIfThenElseParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_elseif_25_0=ruleIfThenElse();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elseif",
                    	    								lv_elseif_25_0,
                    	    								"org.xtext.example.mydsl10.MyDsl.IfThenElse");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,RightCurlyBracket,FOLLOW_31); 

                    				newLeafNode(otherlv_26, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_6());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010800032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010800022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010800002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000028000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000002C000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000451140L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000450140L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000450100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000440100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000440000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000006000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000002800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000002C000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000082200C200L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000082200C000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000080200C000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000080000C000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800004000L});

}