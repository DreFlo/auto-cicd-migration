package org.xtext.example.mydsl5.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl5.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Pipeline_tool_framework", "Pipeline_envirnonment", "Tool_framework_job", "Allow_faillure", "Tool_framework", "Environment", "IfThenElse", "Parameters", "Ifthenelse", "Condition", "Artifact", "Command", "Trigger", "Command_1", "Depends", "Elseif", "Ifelse", "Output", "Name1", "Name3", "Name5", "Timer", "Value", "False", "Input", "Jobs", "Name", "When", "Else", "Tool", "True", "When_1", "Key", "If", "LeftParenthesis", "RightParenthesis", "Comma", "Colon", "LeftCurlyBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Command_1=17;
    public static final int RULE_BEGIN=44;
    public static final int True=34;
    public static final int False=27;
    public static final int Name=30;
    public static final int Name3=23;
    public static final int Name5=24;
    public static final int Input=28;
    public static final int Trigger=16;
    public static final int LeftParenthesis=38;
    public static final int Name1=22;
    public static final int Tool=33;
    public static final int Pipeline_envirnonment=5;
    public static final int Parameters=11;
    public static final int RULE_ID=46;
    public static final int Ifelse=20;
    public static final int RightParenthesis=39;
    public static final int RULE_INT=47;
    public static final int Value=26;
    public static final int RULE_ML_COMMENT=49;
    public static final int Environment=9;
    public static final int Depends=18;
    public static final int If=37;
    public static final int Key=36;
    public static final int RULE_END=45;
    public static final int RULE_STRING=48;
    public static final int Tool_framework_job=6;
    public static final int Ifthenelse=12;
    public static final int RULE_SL_COMMENT=50;
    public static final int Tool_framework=8;
    public static final int Elseif=19;
    public static final int Comma=40;
    public static final int When_1=35;
    public static final int Jobs=29;
    public static final int Output=21;
    public static final int Colon=41;
    public static final int RightCurlyBracket=43;
    public static final int EOF=-1;
    public static final int Pipeline_tool_framework=4;
    public static final int Condition=13;
    public static final int RULE_WS=51;
    public static final int LeftCurlyBracket=42;
    public static final int RULE_ANY_OTHER=52;
    public static final int Artifact=14;
    public static final int Allow_faillure=7;
    public static final int When=31;
    public static final int Timer=25;
    public static final int Command=15;
    public static final int Else=32;
    public static final int IfThenElse=10;

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
    // InternalMyDslParser.g:64:1: rulePipeline returns [EObject current=null] : ( () (otherlv_1= Name ( (lv_Name0_2_0= ruleEString ) ) )? (otherlv_3= Pipeline_tool_framework otherlv_4= LeftParenthesis ( ( ruleEString ) ) (otherlv_6= Comma ( ( ruleEString ) ) )* otherlv_8= RightParenthesis )? (otherlv_9= Pipeline_envirnonment otherlv_10= LeftParenthesis ( ( ruleEString ) ) (otherlv_12= Comma ( ( ruleEString ) ) )* otherlv_14= RightParenthesis )? (otherlv_15= When_1 otherlv_16= LeftCurlyBracket ( (lv_when_17_0= ruleWhen ) ) (otherlv_18= Comma ( (lv_when_19_0= ruleWhen ) ) )* otherlv_20= RightCurlyBracket )? (otherlv_21= Jobs this_BEGIN_22= RULE_BEGIN ( (lv_job_23_0= ruleJob ) ) ( (lv_job_24_0= ruleJob ) )* this_END_25= RULE_END )? ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

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
        Token this_BEGIN_22=null;
        Token this_END_25=null;
        AntlrDatatypeRuleToken lv_Name0_2_0 = null;

        EObject lv_when_17_0 = null;

        EObject lv_when_19_0 = null;

        EObject lv_job_23_0 = null;

        EObject lv_job_24_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:70:2: ( ( () (otherlv_1= Name ( (lv_Name0_2_0= ruleEString ) ) )? (otherlv_3= Pipeline_tool_framework otherlv_4= LeftParenthesis ( ( ruleEString ) ) (otherlv_6= Comma ( ( ruleEString ) ) )* otherlv_8= RightParenthesis )? (otherlv_9= Pipeline_envirnonment otherlv_10= LeftParenthesis ( ( ruleEString ) ) (otherlv_12= Comma ( ( ruleEString ) ) )* otherlv_14= RightParenthesis )? (otherlv_15= When_1 otherlv_16= LeftCurlyBracket ( (lv_when_17_0= ruleWhen ) ) (otherlv_18= Comma ( (lv_when_19_0= ruleWhen ) ) )* otherlv_20= RightCurlyBracket )? (otherlv_21= Jobs this_BEGIN_22= RULE_BEGIN ( (lv_job_23_0= ruleJob ) ) ( (lv_job_24_0= ruleJob ) )* this_END_25= RULE_END )? ) )
            // InternalMyDslParser.g:71:2: ( () (otherlv_1= Name ( (lv_Name0_2_0= ruleEString ) ) )? (otherlv_3= Pipeline_tool_framework otherlv_4= LeftParenthesis ( ( ruleEString ) ) (otherlv_6= Comma ( ( ruleEString ) ) )* otherlv_8= RightParenthesis )? (otherlv_9= Pipeline_envirnonment otherlv_10= LeftParenthesis ( ( ruleEString ) ) (otherlv_12= Comma ( ( ruleEString ) ) )* otherlv_14= RightParenthesis )? (otherlv_15= When_1 otherlv_16= LeftCurlyBracket ( (lv_when_17_0= ruleWhen ) ) (otherlv_18= Comma ( (lv_when_19_0= ruleWhen ) ) )* otherlv_20= RightCurlyBracket )? (otherlv_21= Jobs this_BEGIN_22= RULE_BEGIN ( (lv_job_23_0= ruleJob ) ) ( (lv_job_24_0= ruleJob ) )* this_END_25= RULE_END )? )
            {
            // InternalMyDslParser.g:71:2: ( () (otherlv_1= Name ( (lv_Name0_2_0= ruleEString ) ) )? (otherlv_3= Pipeline_tool_framework otherlv_4= LeftParenthesis ( ( ruleEString ) ) (otherlv_6= Comma ( ( ruleEString ) ) )* otherlv_8= RightParenthesis )? (otherlv_9= Pipeline_envirnonment otherlv_10= LeftParenthesis ( ( ruleEString ) ) (otherlv_12= Comma ( ( ruleEString ) ) )* otherlv_14= RightParenthesis )? (otherlv_15= When_1 otherlv_16= LeftCurlyBracket ( (lv_when_17_0= ruleWhen ) ) (otherlv_18= Comma ( (lv_when_19_0= ruleWhen ) ) )* otherlv_20= RightCurlyBracket )? (otherlv_21= Jobs this_BEGIN_22= RULE_BEGIN ( (lv_job_23_0= ruleJob ) ) ( (lv_job_24_0= ruleJob ) )* this_END_25= RULE_END )? )
            // InternalMyDslParser.g:72:3: () (otherlv_1= Name ( (lv_Name0_2_0= ruleEString ) ) )? (otherlv_3= Pipeline_tool_framework otherlv_4= LeftParenthesis ( ( ruleEString ) ) (otherlv_6= Comma ( ( ruleEString ) ) )* otherlv_8= RightParenthesis )? (otherlv_9= Pipeline_envirnonment otherlv_10= LeftParenthesis ( ( ruleEString ) ) (otherlv_12= Comma ( ( ruleEString ) ) )* otherlv_14= RightParenthesis )? (otherlv_15= When_1 otherlv_16= LeftCurlyBracket ( (lv_when_17_0= ruleWhen ) ) (otherlv_18= Comma ( (lv_when_19_0= ruleWhen ) ) )* otherlv_20= RightCurlyBracket )? (otherlv_21= Jobs this_BEGIN_22= RULE_BEGIN ( (lv_job_23_0= ruleJob ) ) ( (lv_job_24_0= ruleJob ) )* this_END_25= RULE_END )?
            {
            // InternalMyDslParser.g:72:3: ()
            // InternalMyDslParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPipelineAccess().getPipelineAction_0(),
            					current);
            			

            }

            // InternalMyDslParser.g:79:3: (otherlv_1= Name ( (lv_Name0_2_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Name) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDslParser.g:80:4: otherlv_1= Name ( (lv_Name0_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,Name,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getPipelineAccess().getNameKeyword_1_0());
                    			
                    // InternalMyDslParser.g:84:4: ( (lv_Name0_2_0= ruleEString ) )
                    // InternalMyDslParser.g:85:5: (lv_Name0_2_0= ruleEString )
                    {
                    // InternalMyDslParser.g:85:5: (lv_Name0_2_0= ruleEString )
                    // InternalMyDslParser.g:86:6: lv_Name0_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPipelineAccess().getName0EStringParserRuleCall_1_1_0());
                    					
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
                    							"org.xtext.example.mydsl5.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:104:3: (otherlv_3= Pipeline_tool_framework otherlv_4= LeftParenthesis ( ( ruleEString ) ) (otherlv_6= Comma ( ( ruleEString ) ) )* otherlv_8= RightParenthesis )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Pipeline_tool_framework) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDslParser.g:105:4: otherlv_3= Pipeline_tool_framework otherlv_4= LeftParenthesis ( ( ruleEString ) ) (otherlv_6= Comma ( ( ruleEString ) ) )* otherlv_8= RightParenthesis
                    {
                    otherlv_3=(Token)match(input,Pipeline_tool_framework,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getPipelineAccess().getPipeline_tool_frameworkKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,LeftParenthesis,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPipelineAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalMyDslParser.g:113:4: ( ( ruleEString ) )
                    // InternalMyDslParser.g:114:5: ( ruleEString )
                    {
                    // InternalMyDslParser.g:114:5: ( ruleEString )
                    // InternalMyDslParser.g:115:6: ruleEString
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

                    // InternalMyDslParser.g:129:4: (otherlv_6= Comma ( ( ruleEString ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==Comma) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDslParser.g:130:5: otherlv_6= Comma ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPipelineAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalMyDslParser.g:134:5: ( ( ruleEString ) )
                    	    // InternalMyDslParser.g:135:6: ( ruleEString )
                    	    {
                    	    // InternalMyDslParser.g:135:6: ( ruleEString )
                    	    // InternalMyDslParser.g:136:7: ruleEString
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
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,RightParenthesis,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getPipelineAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:156:3: (otherlv_9= Pipeline_envirnonment otherlv_10= LeftParenthesis ( ( ruleEString ) ) (otherlv_12= Comma ( ( ruleEString ) ) )* otherlv_14= RightParenthesis )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Pipeline_envirnonment) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDslParser.g:157:4: otherlv_9= Pipeline_envirnonment otherlv_10= LeftParenthesis ( ( ruleEString ) ) (otherlv_12= Comma ( ( ruleEString ) ) )* otherlv_14= RightParenthesis
                    {
                    otherlv_9=(Token)match(input,Pipeline_envirnonment,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getPipelineAccess().getPipeline_envirnonmentKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,LeftParenthesis,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getPipelineAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalMyDslParser.g:165:4: ( ( ruleEString ) )
                    // InternalMyDslParser.g:166:5: ( ruleEString )
                    {
                    // InternalMyDslParser.g:166:5: ( ruleEString )
                    // InternalMyDslParser.g:167:6: ruleEString
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

                    // InternalMyDslParser.g:181:4: (otherlv_12= Comma ( ( ruleEString ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Comma) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDslParser.g:182:5: otherlv_12= Comma ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPipelineAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDslParser.g:186:5: ( ( ruleEString ) )
                    	    // InternalMyDslParser.g:187:6: ( ruleEString )
                    	    {
                    	    // InternalMyDslParser.g:187:6: ( ruleEString )
                    	    // InternalMyDslParser.g:188:7: ruleEString
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
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,RightParenthesis,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getPipelineAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:208:3: (otherlv_15= When_1 otherlv_16= LeftCurlyBracket ( (lv_when_17_0= ruleWhen ) ) (otherlv_18= Comma ( (lv_when_19_0= ruleWhen ) ) )* otherlv_20= RightCurlyBracket )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==When_1) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDslParser.g:209:4: otherlv_15= When_1 otherlv_16= LeftCurlyBracket ( (lv_when_17_0= ruleWhen ) ) (otherlv_18= Comma ( (lv_when_19_0= ruleWhen ) ) )* otherlv_20= RightCurlyBracket
                    {
                    otherlv_15=(Token)match(input,When_1,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getPipelineAccess().getWhenKeyword_4_0());
                    			
                    otherlv_16=(Token)match(input,LeftCurlyBracket,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getPipelineAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDslParser.g:217:4: ( (lv_when_17_0= ruleWhen ) )
                    // InternalMyDslParser.g:218:5: (lv_when_17_0= ruleWhen )
                    {
                    // InternalMyDslParser.g:218:5: (lv_when_17_0= ruleWhen )
                    // InternalMyDslParser.g:219:6: lv_when_17_0= ruleWhen
                    {

                    						newCompositeNode(grammarAccess.getPipelineAccess().getWhenWhenParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_when_17_0=ruleWhen();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPipelineRule());
                    						}
                    						add(
                    							current,
                    							"when",
                    							lv_when_17_0,
                    							"org.xtext.example.mydsl5.MyDsl.When");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:236:4: (otherlv_18= Comma ( (lv_when_19_0= ruleWhen ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==Comma) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDslParser.g:237:5: otherlv_18= Comma ( (lv_when_19_0= ruleWhen ) )
                    	    {
                    	    otherlv_18=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getPipelineAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDslParser.g:241:5: ( (lv_when_19_0= ruleWhen ) )
                    	    // InternalMyDslParser.g:242:6: (lv_when_19_0= ruleWhen )
                    	    {
                    	    // InternalMyDslParser.g:242:6: (lv_when_19_0= ruleWhen )
                    	    // InternalMyDslParser.g:243:7: lv_when_19_0= ruleWhen
                    	    {

                    	    							newCompositeNode(grammarAccess.getPipelineAccess().getWhenWhenParserRuleCall_4_3_1_0());
                    	    						
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
                    	    								"org.xtext.example.mydsl5.MyDsl.When");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,RightCurlyBracket,FOLLOW_12); 

                    				newLeafNode(otherlv_20, grammarAccess.getPipelineAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:266:3: (otherlv_21= Jobs this_BEGIN_22= RULE_BEGIN ( (lv_job_23_0= ruleJob ) ) ( (lv_job_24_0= ruleJob ) )* this_END_25= RULE_END )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Jobs) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDslParser.g:267:4: otherlv_21= Jobs this_BEGIN_22= RULE_BEGIN ( (lv_job_23_0= ruleJob ) ) ( (lv_job_24_0= ruleJob ) )* this_END_25= RULE_END
                    {
                    otherlv_21=(Token)match(input,Jobs,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getPipelineAccess().getJobsKeyword_5_0());
                    			
                    this_BEGIN_22=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

                    				newLeafNode(this_BEGIN_22, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_5_1());
                    			
                    // InternalMyDslParser.g:275:4: ( (lv_job_23_0= ruleJob ) )
                    // InternalMyDslParser.g:276:5: (lv_job_23_0= ruleJob )
                    {
                    // InternalMyDslParser.g:276:5: (lv_job_23_0= ruleJob )
                    // InternalMyDslParser.g:277:6: lv_job_23_0= ruleJob
                    {

                    						newCompositeNode(grammarAccess.getPipelineAccess().getJobJobParserRuleCall_5_2_0());
                    					
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
                    							"org.xtext.example.mydsl5.MyDsl.Job");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:294:4: ( (lv_job_24_0= ruleJob ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==Allow_faillure||LA8_0==RULE_ID||LA8_0==RULE_STRING) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDslParser.g:295:5: (lv_job_24_0= ruleJob )
                    	    {
                    	    // InternalMyDslParser.g:295:5: (lv_job_24_0= ruleJob )
                    	    // InternalMyDslParser.g:296:6: lv_job_24_0= ruleJob
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineAccess().getJobJobParserRuleCall_5_3_0());
                    	    					
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
                    	    							"org.xtext.example.mydsl5.MyDsl.Job");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    this_END_25=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_25, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_5_4());
                    			

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
    // InternalMyDslParser.g:322:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalMyDslParser.g:322:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalMyDslParser.g:323:2: iv_ruleWhen= ruleWhen EOF
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
    // InternalMyDslParser.g:329:1: ruleWhen returns [EObject current=null] : ( () otherlv_1= When ( (lv_Name4_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= Trigger ( (lv_Trigger_5_0= ruleEString ) ) )? (otherlv_6= Timer ( (lv_Timer_7_0= ruleEString ) ) )? otherlv_8= RightCurlyBracket ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_Name4_2_0 = null;

        AntlrDatatypeRuleToken lv_Trigger_5_0 = null;

        AntlrDatatypeRuleToken lv_Timer_7_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:335:2: ( ( () otherlv_1= When ( (lv_Name4_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= Trigger ( (lv_Trigger_5_0= ruleEString ) ) )? (otherlv_6= Timer ( (lv_Timer_7_0= ruleEString ) ) )? otherlv_8= RightCurlyBracket ) )
            // InternalMyDslParser.g:336:2: ( () otherlv_1= When ( (lv_Name4_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= Trigger ( (lv_Trigger_5_0= ruleEString ) ) )? (otherlv_6= Timer ( (lv_Timer_7_0= ruleEString ) ) )? otherlv_8= RightCurlyBracket )
            {
            // InternalMyDslParser.g:336:2: ( () otherlv_1= When ( (lv_Name4_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= Trigger ( (lv_Trigger_5_0= ruleEString ) ) )? (otherlv_6= Timer ( (lv_Timer_7_0= ruleEString ) ) )? otherlv_8= RightCurlyBracket )
            // InternalMyDslParser.g:337:3: () otherlv_1= When ( (lv_Name4_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= Trigger ( (lv_Trigger_5_0= ruleEString ) ) )? (otherlv_6= Timer ( (lv_Timer_7_0= ruleEString ) ) )? otherlv_8= RightCurlyBracket
            {
            // InternalMyDslParser.g:337:3: ()
            // InternalMyDslParser.g:338:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhenAccess().getWhenAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,When,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWhenAccess().getWhenKeyword_1());
            		
            // InternalMyDslParser.g:348:3: ( (lv_Name4_2_0= ruleEString ) )
            // InternalMyDslParser.g:349:4: (lv_Name4_2_0= ruleEString )
            {
            // InternalMyDslParser.g:349:4: (lv_Name4_2_0= ruleEString )
            // InternalMyDslParser.g:350:5: lv_Name4_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWhenAccess().getName4EStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_Name4_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhenRule());
            					}
            					set(
            						current,
            						"Name4",
            						lv_Name4_2_0,
            						"org.xtext.example.mydsl5.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getWhenAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDslParser.g:371:3: (otherlv_4= Trigger ( (lv_Trigger_5_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Trigger) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDslParser.g:372:4: otherlv_4= Trigger ( (lv_Trigger_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,Trigger,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getWhenAccess().getTriggerKeyword_4_0());
                    			
                    // InternalMyDslParser.g:376:4: ( (lv_Trigger_5_0= ruleEString ) )
                    // InternalMyDslParser.g:377:5: (lv_Trigger_5_0= ruleEString )
                    {
                    // InternalMyDslParser.g:377:5: (lv_Trigger_5_0= ruleEString )
                    // InternalMyDslParser.g:378:6: lv_Trigger_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWhenAccess().getTriggerEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_Trigger_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhenRule());
                    						}
                    						set(
                    							current,
                    							"Trigger",
                    							lv_Trigger_5_0,
                    							"org.xtext.example.mydsl5.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:396:3: (otherlv_6= Timer ( (lv_Timer_7_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Timer) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDslParser.g:397:4: otherlv_6= Timer ( (lv_Timer_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Timer,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getWhenAccess().getTimerKeyword_5_0());
                    			
                    // InternalMyDslParser.g:401:4: ( (lv_Timer_7_0= ruleEString ) )
                    // InternalMyDslParser.g:402:5: (lv_Timer_7_0= ruleEString )
                    {
                    // InternalMyDslParser.g:402:5: (lv_Timer_7_0= ruleEString )
                    // InternalMyDslParser.g:403:6: lv_Timer_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWhenAccess().getTimerEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_Timer_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhenRule());
                    						}
                    						set(
                    							current,
                    							"Timer",
                    							lv_Timer_7_0,
                    							"org.xtext.example.mydsl5.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getWhenAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalMyDslParser.g:429:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalMyDslParser.g:429:44: (iv_ruleJob= ruleJob EOF )
            // InternalMyDslParser.g:430:2: iv_ruleJob= ruleJob EOF
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
    // InternalMyDslParser.g:436:1: ruleJob returns [EObject current=null] : ( () ( (lv_Allow_faillure_1_0= Allow_faillure ) )? ruleEString otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Name1 ( (lv_Name1_6_0= ruleEString ) ) )? (otherlv_7= Depends otherlv_8= LeftParenthesis ( ( ruleEString ) ) (otherlv_10= Comma ( ( ruleEString ) ) )* otherlv_12= RightParenthesis )? (otherlv_13= Tool_framework_job otherlv_14= LeftParenthesis ( ( ruleEString ) ) (otherlv_16= Comma ( ( ruleEString ) ) )* otherlv_18= RightParenthesis )? (otherlv_19= Output otherlv_20= LeftParenthesis ( ( ruleEString ) ) (otherlv_22= Comma ( ( ruleEString ) ) )* otherlv_24= RightParenthesis )? (otherlv_25= Ifthenelse otherlv_26= LeftParenthesis ( ( ruleEString ) ) (otherlv_28= Comma ( ( ruleEString ) ) )* otherlv_30= RightParenthesis )? (otherlv_31= Command_1 otherlv_32= LeftCurlyBracket ( (lv_command_33_0= ruleCommand ) ) (otherlv_34= Comma ( (lv_command_35_0= ruleCommand ) ) )* otherlv_36= RightCurlyBracket )? (otherlv_37= Input otherlv_38= LeftCurlyBracket ( (lv_input_39_0= ruleArtifact ) ) (otherlv_40= Comma ( (lv_input_41_0= ruleArtifact ) ) )* otherlv_42= RightCurlyBracket )? this_END_43= RULE_END ) ;
    public final EObject ruleJob() throws RecognitionException {
        EObject current = null;

        Token lv_Allow_faillure_1_0=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token this_END_43=null;
        AntlrDatatypeRuleToken lv_Name1_6_0 = null;

        EObject lv_command_33_0 = null;

        EObject lv_command_35_0 = null;

        EObject lv_input_39_0 = null;

        EObject lv_input_41_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:442:2: ( ( () ( (lv_Allow_faillure_1_0= Allow_faillure ) )? ruleEString otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Name1 ( (lv_Name1_6_0= ruleEString ) ) )? (otherlv_7= Depends otherlv_8= LeftParenthesis ( ( ruleEString ) ) (otherlv_10= Comma ( ( ruleEString ) ) )* otherlv_12= RightParenthesis )? (otherlv_13= Tool_framework_job otherlv_14= LeftParenthesis ( ( ruleEString ) ) (otherlv_16= Comma ( ( ruleEString ) ) )* otherlv_18= RightParenthesis )? (otherlv_19= Output otherlv_20= LeftParenthesis ( ( ruleEString ) ) (otherlv_22= Comma ( ( ruleEString ) ) )* otherlv_24= RightParenthesis )? (otherlv_25= Ifthenelse otherlv_26= LeftParenthesis ( ( ruleEString ) ) (otherlv_28= Comma ( ( ruleEString ) ) )* otherlv_30= RightParenthesis )? (otherlv_31= Command_1 otherlv_32= LeftCurlyBracket ( (lv_command_33_0= ruleCommand ) ) (otherlv_34= Comma ( (lv_command_35_0= ruleCommand ) ) )* otherlv_36= RightCurlyBracket )? (otherlv_37= Input otherlv_38= LeftCurlyBracket ( (lv_input_39_0= ruleArtifact ) ) (otherlv_40= Comma ( (lv_input_41_0= ruleArtifact ) ) )* otherlv_42= RightCurlyBracket )? this_END_43= RULE_END ) )
            // InternalMyDslParser.g:443:2: ( () ( (lv_Allow_faillure_1_0= Allow_faillure ) )? ruleEString otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Name1 ( (lv_Name1_6_0= ruleEString ) ) )? (otherlv_7= Depends otherlv_8= LeftParenthesis ( ( ruleEString ) ) (otherlv_10= Comma ( ( ruleEString ) ) )* otherlv_12= RightParenthesis )? (otherlv_13= Tool_framework_job otherlv_14= LeftParenthesis ( ( ruleEString ) ) (otherlv_16= Comma ( ( ruleEString ) ) )* otherlv_18= RightParenthesis )? (otherlv_19= Output otherlv_20= LeftParenthesis ( ( ruleEString ) ) (otherlv_22= Comma ( ( ruleEString ) ) )* otherlv_24= RightParenthesis )? (otherlv_25= Ifthenelse otherlv_26= LeftParenthesis ( ( ruleEString ) ) (otherlv_28= Comma ( ( ruleEString ) ) )* otherlv_30= RightParenthesis )? (otherlv_31= Command_1 otherlv_32= LeftCurlyBracket ( (lv_command_33_0= ruleCommand ) ) (otherlv_34= Comma ( (lv_command_35_0= ruleCommand ) ) )* otherlv_36= RightCurlyBracket )? (otherlv_37= Input otherlv_38= LeftCurlyBracket ( (lv_input_39_0= ruleArtifact ) ) (otherlv_40= Comma ( (lv_input_41_0= ruleArtifact ) ) )* otherlv_42= RightCurlyBracket )? this_END_43= RULE_END )
            {
            // InternalMyDslParser.g:443:2: ( () ( (lv_Allow_faillure_1_0= Allow_faillure ) )? ruleEString otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Name1 ( (lv_Name1_6_0= ruleEString ) ) )? (otherlv_7= Depends otherlv_8= LeftParenthesis ( ( ruleEString ) ) (otherlv_10= Comma ( ( ruleEString ) ) )* otherlv_12= RightParenthesis )? (otherlv_13= Tool_framework_job otherlv_14= LeftParenthesis ( ( ruleEString ) ) (otherlv_16= Comma ( ( ruleEString ) ) )* otherlv_18= RightParenthesis )? (otherlv_19= Output otherlv_20= LeftParenthesis ( ( ruleEString ) ) (otherlv_22= Comma ( ( ruleEString ) ) )* otherlv_24= RightParenthesis )? (otherlv_25= Ifthenelse otherlv_26= LeftParenthesis ( ( ruleEString ) ) (otherlv_28= Comma ( ( ruleEString ) ) )* otherlv_30= RightParenthesis )? (otherlv_31= Command_1 otherlv_32= LeftCurlyBracket ( (lv_command_33_0= ruleCommand ) ) (otherlv_34= Comma ( (lv_command_35_0= ruleCommand ) ) )* otherlv_36= RightCurlyBracket )? (otherlv_37= Input otherlv_38= LeftCurlyBracket ( (lv_input_39_0= ruleArtifact ) ) (otherlv_40= Comma ( (lv_input_41_0= ruleArtifact ) ) )* otherlv_42= RightCurlyBracket )? this_END_43= RULE_END )
            // InternalMyDslParser.g:444:3: () ( (lv_Allow_faillure_1_0= Allow_faillure ) )? ruleEString otherlv_3= Colon this_BEGIN_4= RULE_BEGIN (otherlv_5= Name1 ( (lv_Name1_6_0= ruleEString ) ) )? (otherlv_7= Depends otherlv_8= LeftParenthesis ( ( ruleEString ) ) (otherlv_10= Comma ( ( ruleEString ) ) )* otherlv_12= RightParenthesis )? (otherlv_13= Tool_framework_job otherlv_14= LeftParenthesis ( ( ruleEString ) ) (otherlv_16= Comma ( ( ruleEString ) ) )* otherlv_18= RightParenthesis )? (otherlv_19= Output otherlv_20= LeftParenthesis ( ( ruleEString ) ) (otherlv_22= Comma ( ( ruleEString ) ) )* otherlv_24= RightParenthesis )? (otherlv_25= Ifthenelse otherlv_26= LeftParenthesis ( ( ruleEString ) ) (otherlv_28= Comma ( ( ruleEString ) ) )* otherlv_30= RightParenthesis )? (otherlv_31= Command_1 otherlv_32= LeftCurlyBracket ( (lv_command_33_0= ruleCommand ) ) (otherlv_34= Comma ( (lv_command_35_0= ruleCommand ) ) )* otherlv_36= RightCurlyBracket )? (otherlv_37= Input otherlv_38= LeftCurlyBracket ( (lv_input_39_0= ruleArtifact ) ) (otherlv_40= Comma ( (lv_input_41_0= ruleArtifact ) ) )* otherlv_42= RightCurlyBracket )? this_END_43= RULE_END
            {
            // InternalMyDslParser.g:444:3: ()
            // InternalMyDslParser.g:445:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJobAccess().getJobAction_0(),
            					current);
            			

            }

            // InternalMyDslParser.g:451:3: ( (lv_Allow_faillure_1_0= Allow_faillure ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Allow_faillure) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDslParser.g:452:4: (lv_Allow_faillure_1_0= Allow_faillure )
                    {
                    // InternalMyDslParser.g:452:4: (lv_Allow_faillure_1_0= Allow_faillure )
                    // InternalMyDslParser.g:453:5: lv_Allow_faillure_1_0= Allow_faillure
                    {
                    lv_Allow_faillure_1_0=(Token)match(input,Allow_faillure,FOLLOW_3); 

                    					newLeafNode(lv_Allow_faillure_1_0, grammarAccess.getJobAccess().getAllow_faillureAllow_faillureKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJobRule());
                    					}
                    					setWithLastConsumed(current, "Allow_faillure", lv_Allow_faillure_1_0 != null, "Allow_faillure");
                    				

                    }


                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getJobAccess().getEStringParserRuleCall_2());
            		
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,Colon,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getJobAccess().getColonKeyword_3());
            		
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getJobAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalMyDslParser.g:480:3: (otherlv_5= Name1 ( (lv_Name1_6_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Name1) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDslParser.g:481:4: otherlv_5= Name1 ( (lv_Name1_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,Name1,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getJobAccess().getName1Keyword_5_0());
                    			
                    // InternalMyDslParser.g:485:4: ( (lv_Name1_6_0= ruleEString ) )
                    // InternalMyDslParser.g:486:5: (lv_Name1_6_0= ruleEString )
                    {
                    // InternalMyDslParser.g:486:5: (lv_Name1_6_0= ruleEString )
                    // InternalMyDslParser.g:487:6: lv_Name1_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getName1EStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_Name1_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						set(
                    							current,
                    							"Name1",
                    							lv_Name1_6_0,
                    							"org.xtext.example.mydsl5.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:505:3: (otherlv_7= Depends otherlv_8= LeftParenthesis ( ( ruleEString ) ) (otherlv_10= Comma ( ( ruleEString ) ) )* otherlv_12= RightParenthesis )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Depends) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDslParser.g:506:4: otherlv_7= Depends otherlv_8= LeftParenthesis ( ( ruleEString ) ) (otherlv_10= Comma ( ( ruleEString ) ) )* otherlv_12= RightParenthesis
                    {
                    otherlv_7=(Token)match(input,Depends,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getJobAccess().getDependsKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,LeftParenthesis,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getJobAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalMyDslParser.g:514:4: ( ( ruleEString ) )
                    // InternalMyDslParser.g:515:5: ( ruleEString )
                    {
                    // InternalMyDslParser.g:515:5: ( ruleEString )
                    // InternalMyDslParser.g:516:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJobRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getJobAccess().getDependsJobCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:530:4: (otherlv_10= Comma ( ( ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Comma) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDslParser.g:531:5: otherlv_10= Comma ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getJobAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDslParser.g:535:5: ( ( ruleEString ) )
                    	    // InternalMyDslParser.g:536:6: ( ruleEString )
                    	    {
                    	    // InternalMyDslParser.g:536:6: ( ruleEString )
                    	    // InternalMyDslParser.g:537:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJobRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getJobAccess().getDependsJobCrossReference_6_3_1_0());
                    	    						
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

                    otherlv_12=(Token)match(input,RightParenthesis,FOLLOW_22); 

                    				newLeafNode(otherlv_12, grammarAccess.getJobAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:557:3: (otherlv_13= Tool_framework_job otherlv_14= LeftParenthesis ( ( ruleEString ) ) (otherlv_16= Comma ( ( ruleEString ) ) )* otherlv_18= RightParenthesis )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Tool_framework_job) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDslParser.g:558:4: otherlv_13= Tool_framework_job otherlv_14= LeftParenthesis ( ( ruleEString ) ) (otherlv_16= Comma ( ( ruleEString ) ) )* otherlv_18= RightParenthesis
                    {
                    otherlv_13=(Token)match(input,Tool_framework_job,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getJobAccess().getTool_framework_jobKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,LeftParenthesis,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getJobAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalMyDslParser.g:566:4: ( ( ruleEString ) )
                    // InternalMyDslParser.g:567:5: ( ruleEString )
                    {
                    // InternalMyDslParser.g:567:5: ( ruleEString )
                    // InternalMyDslParser.g:568:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJobRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getJobAccess().getTool_framework_jobTool_frameworkCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:582:4: (otherlv_16= Comma ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Comma) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMyDslParser.g:583:5: otherlv_16= Comma ( ( ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getJobAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDslParser.g:587:5: ( ( ruleEString ) )
                    	    // InternalMyDslParser.g:588:6: ( ruleEString )
                    	    {
                    	    // InternalMyDslParser.g:588:6: ( ruleEString )
                    	    // InternalMyDslParser.g:589:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJobRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getJobAccess().getTool_framework_jobTool_frameworkCrossReference_7_3_1_0());
                    	    						
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

                    otherlv_18=(Token)match(input,RightParenthesis,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getJobAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:609:3: (otherlv_19= Output otherlv_20= LeftParenthesis ( ( ruleEString ) ) (otherlv_22= Comma ( ( ruleEString ) ) )* otherlv_24= RightParenthesis )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Output) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDslParser.g:610:4: otherlv_19= Output otherlv_20= LeftParenthesis ( ( ruleEString ) ) (otherlv_22= Comma ( ( ruleEString ) ) )* otherlv_24= RightParenthesis
                    {
                    otherlv_19=(Token)match(input,Output,FOLLOW_5); 

                    				newLeafNode(otherlv_19, grammarAccess.getJobAccess().getOutputKeyword_8_0());
                    			
                    otherlv_20=(Token)match(input,LeftParenthesis,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getJobAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalMyDslParser.g:618:4: ( ( ruleEString ) )
                    // InternalMyDslParser.g:619:5: ( ruleEString )
                    {
                    // InternalMyDslParser.g:619:5: ( ruleEString )
                    // InternalMyDslParser.g:620:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJobRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getJobAccess().getOutputArtifactCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:634:4: (otherlv_22= Comma ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==Comma) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyDslParser.g:635:5: otherlv_22= Comma ( ( ruleEString ) )
                    	    {
                    	    otherlv_22=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getJobAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMyDslParser.g:639:5: ( ( ruleEString ) )
                    	    // InternalMyDslParser.g:640:6: ( ruleEString )
                    	    {
                    	    // InternalMyDslParser.g:640:6: ( ruleEString )
                    	    // InternalMyDslParser.g:641:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJobRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getJobAccess().getOutputArtifactCrossReference_8_3_1_0());
                    	    						
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

                    otherlv_24=(Token)match(input,RightParenthesis,FOLLOW_24); 

                    				newLeafNode(otherlv_24, grammarAccess.getJobAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:661:3: (otherlv_25= Ifthenelse otherlv_26= LeftParenthesis ( ( ruleEString ) ) (otherlv_28= Comma ( ( ruleEString ) ) )* otherlv_30= RightParenthesis )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Ifthenelse) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDslParser.g:662:4: otherlv_25= Ifthenelse otherlv_26= LeftParenthesis ( ( ruleEString ) ) (otherlv_28= Comma ( ( ruleEString ) ) )* otherlv_30= RightParenthesis
                    {
                    otherlv_25=(Token)match(input,Ifthenelse,FOLLOW_5); 

                    				newLeafNode(otherlv_25, grammarAccess.getJobAccess().getIfthenelseKeyword_9_0());
                    			
                    otherlv_26=(Token)match(input,LeftParenthesis,FOLLOW_3); 

                    				newLeafNode(otherlv_26, grammarAccess.getJobAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalMyDslParser.g:670:4: ( ( ruleEString ) )
                    // InternalMyDslParser.g:671:5: ( ruleEString )
                    {
                    // InternalMyDslParser.g:671:5: ( ruleEString )
                    // InternalMyDslParser.g:672:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJobRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getJobAccess().getIfthenelseIfThenElseCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:686:4: (otherlv_28= Comma ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Comma) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMyDslParser.g:687:5: otherlv_28= Comma ( ( ruleEString ) )
                    	    {
                    	    otherlv_28=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_28, grammarAccess.getJobAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMyDslParser.g:691:5: ( ( ruleEString ) )
                    	    // InternalMyDslParser.g:692:6: ( ruleEString )
                    	    {
                    	    // InternalMyDslParser.g:692:6: ( ruleEString )
                    	    // InternalMyDslParser.g:693:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJobRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getJobAccess().getIfthenelseIfThenElseCrossReference_9_3_1_0());
                    	    						
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

                    otherlv_30=(Token)match(input,RightParenthesis,FOLLOW_25); 

                    				newLeafNode(otherlv_30, grammarAccess.getJobAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:713:3: (otherlv_31= Command_1 otherlv_32= LeftCurlyBracket ( (lv_command_33_0= ruleCommand ) ) (otherlv_34= Comma ( (lv_command_35_0= ruleCommand ) ) )* otherlv_36= RightCurlyBracket )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Command_1) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDslParser.g:714:4: otherlv_31= Command_1 otherlv_32= LeftCurlyBracket ( (lv_command_33_0= ruleCommand ) ) (otherlv_34= Comma ( (lv_command_35_0= ruleCommand ) ) )* otherlv_36= RightCurlyBracket
                    {
                    otherlv_31=(Token)match(input,Command_1,FOLLOW_9); 

                    				newLeafNode(otherlv_31, grammarAccess.getJobAccess().getCommandKeyword_10_0());
                    			
                    otherlv_32=(Token)match(input,LeftCurlyBracket,FOLLOW_26); 

                    				newLeafNode(otherlv_32, grammarAccess.getJobAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalMyDslParser.g:722:4: ( (lv_command_33_0= ruleCommand ) )
                    // InternalMyDslParser.g:723:5: (lv_command_33_0= ruleCommand )
                    {
                    // InternalMyDslParser.g:723:5: (lv_command_33_0= ruleCommand )
                    // InternalMyDslParser.g:724:6: lv_command_33_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getCommandCommandParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_command_33_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						add(
                    							current,
                    							"command",
                    							lv_command_33_0,
                    							"org.xtext.example.mydsl5.MyDsl.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:741:4: (otherlv_34= Comma ( (lv_command_35_0= ruleCommand ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Comma) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalMyDslParser.g:742:5: otherlv_34= Comma ( (lv_command_35_0= ruleCommand ) )
                    	    {
                    	    otherlv_34=(Token)match(input,Comma,FOLLOW_26); 

                    	    					newLeafNode(otherlv_34, grammarAccess.getJobAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalMyDslParser.g:746:5: ( (lv_command_35_0= ruleCommand ) )
                    	    // InternalMyDslParser.g:747:6: (lv_command_35_0= ruleCommand )
                    	    {
                    	    // InternalMyDslParser.g:747:6: (lv_command_35_0= ruleCommand )
                    	    // InternalMyDslParser.g:748:7: lv_command_35_0= ruleCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getJobAccess().getCommandCommandParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_command_35_0=ruleCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJobRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"command",
                    	    								lv_command_35_0,
                    	    								"org.xtext.example.mydsl5.MyDsl.Command");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,RightCurlyBracket,FOLLOW_27); 

                    				newLeafNode(otherlv_36, grammarAccess.getJobAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:771:3: (otherlv_37= Input otherlv_38= LeftCurlyBracket ( (lv_input_39_0= ruleArtifact ) ) (otherlv_40= Comma ( (lv_input_41_0= ruleArtifact ) ) )* otherlv_42= RightCurlyBracket )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Input) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDslParser.g:772:4: otherlv_37= Input otherlv_38= LeftCurlyBracket ( (lv_input_39_0= ruleArtifact ) ) (otherlv_40= Comma ( (lv_input_41_0= ruleArtifact ) ) )* otherlv_42= RightCurlyBracket
                    {
                    otherlv_37=(Token)match(input,Input,FOLLOW_9); 

                    				newLeafNode(otherlv_37, grammarAccess.getJobAccess().getInputKeyword_11_0());
                    			
                    otherlv_38=(Token)match(input,LeftCurlyBracket,FOLLOW_28); 

                    				newLeafNode(otherlv_38, grammarAccess.getJobAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalMyDslParser.g:780:4: ( (lv_input_39_0= ruleArtifact ) )
                    // InternalMyDslParser.g:781:5: (lv_input_39_0= ruleArtifact )
                    {
                    // InternalMyDslParser.g:781:5: (lv_input_39_0= ruleArtifact )
                    // InternalMyDslParser.g:782:6: lv_input_39_0= ruleArtifact
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getInputArtifactParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_input_39_0=ruleArtifact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						add(
                    							current,
                    							"input",
                    							lv_input_39_0,
                    							"org.xtext.example.mydsl5.MyDsl.Artifact");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:799:4: (otherlv_40= Comma ( (lv_input_41_0= ruleArtifact ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Comma) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalMyDslParser.g:800:5: otherlv_40= Comma ( (lv_input_41_0= ruleArtifact ) )
                    	    {
                    	    otherlv_40=(Token)match(input,Comma,FOLLOW_28); 

                    	    					newLeafNode(otherlv_40, grammarAccess.getJobAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalMyDslParser.g:804:5: ( (lv_input_41_0= ruleArtifact ) )
                    	    // InternalMyDslParser.g:805:6: (lv_input_41_0= ruleArtifact )
                    	    {
                    	    // InternalMyDslParser.g:805:6: (lv_input_41_0= ruleArtifact )
                    	    // InternalMyDslParser.g:806:7: lv_input_41_0= ruleArtifact
                    	    {

                    	    							newCompositeNode(grammarAccess.getJobAccess().getInputArtifactParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_input_41_0=ruleArtifact();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJobRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"input",
                    	    								lv_input_41_0,
                    	    								"org.xtext.example.mydsl5.MyDsl.Artifact");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_42=(Token)match(input,RightCurlyBracket,FOLLOW_29); 

                    				newLeafNode(otherlv_42, grammarAccess.getJobAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            this_END_43=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_43, grammarAccess.getJobAccess().getENDTerminalRuleCall_12());
            		

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
    // InternalMyDslParser.g:837:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDslParser.g:837:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDslParser.g:838:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDslParser.g:844:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDslParser.g:850:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDslParser.g:851:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDslParser.g:851:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDslParser.g:852:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDslParser.g:860:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleArtifact"
    // InternalMyDslParser.g:871:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalMyDslParser.g:871:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalMyDslParser.g:872:2: iv_ruleArtifact= ruleArtifact EOF
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
    // InternalMyDslParser.g:878:1: ruleArtifact returns [EObject current=null] : ( () otherlv_1= Artifact otherlv_2= LeftCurlyBracket (otherlv_3= Name3 ( (lv_Name3_4_0= ruleEString ) ) )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_Name3_4_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:884:2: ( ( () otherlv_1= Artifact otherlv_2= LeftCurlyBracket (otherlv_3= Name3 ( (lv_Name3_4_0= ruleEString ) ) )? otherlv_5= RightCurlyBracket ) )
            // InternalMyDslParser.g:885:2: ( () otherlv_1= Artifact otherlv_2= LeftCurlyBracket (otherlv_3= Name3 ( (lv_Name3_4_0= ruleEString ) ) )? otherlv_5= RightCurlyBracket )
            {
            // InternalMyDslParser.g:885:2: ( () otherlv_1= Artifact otherlv_2= LeftCurlyBracket (otherlv_3= Name3 ( (lv_Name3_4_0= ruleEString ) ) )? otherlv_5= RightCurlyBracket )
            // InternalMyDslParser.g:886:3: () otherlv_1= Artifact otherlv_2= LeftCurlyBracket (otherlv_3= Name3 ( (lv_Name3_4_0= ruleEString ) ) )? otherlv_5= RightCurlyBracket
            {
            // InternalMyDslParser.g:886:3: ()
            // InternalMyDslParser.g:887:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArtifactAccess().getArtifactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Artifact,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getArtifactAccess().getArtifactKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDslParser.g:901:3: (otherlv_3= Name3 ( (lv_Name3_4_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Name3) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDslParser.g:902:4: otherlv_3= Name3 ( (lv_Name3_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,Name3,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getName3Keyword_3_0());
                    			
                    // InternalMyDslParser.g:906:4: ( (lv_Name3_4_0= ruleEString ) )
                    // InternalMyDslParser.g:907:5: (lv_Name3_4_0= ruleEString )
                    {
                    // InternalMyDslParser.g:907:5: (lv_Name3_4_0= ruleEString )
                    // InternalMyDslParser.g:908:6: lv_Name3_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getArtifactAccess().getName3EStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_Name3_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArtifactRule());
                    						}
                    						set(
                    							current,
                    							"Name3",
                    							lv_Name3_4_0,
                    							"org.xtext.example.mydsl5.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalMyDslParser.g:934:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalMyDslParser.g:934:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalMyDslParser.g:935:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalMyDslParser.g:941:1: ruleCommand returns [EObject current=null] : ( () otherlv_1= Command ( (lv_Description_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= Parameters ( (lv_Parameters_5_0= ruleEString ) ) )? (otherlv_6= Tool ( ( ruleEString ) ) )? otherlv_8= RightCurlyBracket ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_Description_2_0 = null;

        AntlrDatatypeRuleToken lv_Parameters_5_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:947:2: ( ( () otherlv_1= Command ( (lv_Description_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= Parameters ( (lv_Parameters_5_0= ruleEString ) ) )? (otherlv_6= Tool ( ( ruleEString ) ) )? otherlv_8= RightCurlyBracket ) )
            // InternalMyDslParser.g:948:2: ( () otherlv_1= Command ( (lv_Description_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= Parameters ( (lv_Parameters_5_0= ruleEString ) ) )? (otherlv_6= Tool ( ( ruleEString ) ) )? otherlv_8= RightCurlyBracket )
            {
            // InternalMyDslParser.g:948:2: ( () otherlv_1= Command ( (lv_Description_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= Parameters ( (lv_Parameters_5_0= ruleEString ) ) )? (otherlv_6= Tool ( ( ruleEString ) ) )? otherlv_8= RightCurlyBracket )
            // InternalMyDslParser.g:949:3: () otherlv_1= Command ( (lv_Description_2_0= ruleEString ) ) otherlv_3= LeftCurlyBracket (otherlv_4= Parameters ( (lv_Parameters_5_0= ruleEString ) ) )? (otherlv_6= Tool ( ( ruleEString ) ) )? otherlv_8= RightCurlyBracket
            {
            // InternalMyDslParser.g:949:3: ()
            // InternalMyDslParser.g:950:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandAccess().getCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Command,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getCommandKeyword_1());
            		
            // InternalMyDslParser.g:960:3: ( (lv_Description_2_0= ruleEString ) )
            // InternalMyDslParser.g:961:4: (lv_Description_2_0= ruleEString )
            {
            // InternalMyDslParser.g:961:4: (lv_Description_2_0= ruleEString )
            // InternalMyDslParser.g:962:5: lv_Description_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommandAccess().getDescriptionEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_Description_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandRule());
            					}
            					set(
            						current,
            						"Description",
            						lv_Description_2_0,
            						"org.xtext.example.mydsl5.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDslParser.g:983:3: (otherlv_4= Parameters ( (lv_Parameters_5_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Parameters) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDslParser.g:984:4: otherlv_4= Parameters ( (lv_Parameters_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,Parameters,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCommandAccess().getParametersKeyword_4_0());
                    			
                    // InternalMyDslParser.g:988:4: ( (lv_Parameters_5_0= ruleEString ) )
                    // InternalMyDslParser.g:989:5: (lv_Parameters_5_0= ruleEString )
                    {
                    // InternalMyDslParser.g:989:5: (lv_Parameters_5_0= ruleEString )
                    // InternalMyDslParser.g:990:6: lv_Parameters_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getParametersEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_Parameters_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"Parameters",
                    							lv_Parameters_5_0,
                    							"org.xtext.example.mydsl5.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:1008:3: (otherlv_6= Tool ( ( ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Tool) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDslParser.g:1009:4: otherlv_6= Tool ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Tool,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCommandAccess().getToolKeyword_5_0());
                    			
                    // InternalMyDslParser.g:1013:4: ( ( ruleEString ) )
                    // InternalMyDslParser.g:1014:5: ( ruleEString )
                    {
                    // InternalMyDslParser.g:1014:5: ( ruleEString )
                    // InternalMyDslParser.g:1015:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommandRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCommandAccess().getToolTool_frameworkCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalMyDslParser.g:1038:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // InternalMyDslParser.g:1038:51: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // InternalMyDslParser.g:1039:2: iv_ruleIfThenElse= ruleIfThenElse EOF
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
    // InternalMyDslParser.g:1045:1: ruleIfThenElse returns [EObject current=null] : ( () otherlv_1= IfThenElse otherlv_2= LeftCurlyBracket (otherlv_3= Condition ( (lv_Condition_4_0= ruleEString ) ) )? (otherlv_5= If otherlv_6= LeftCurlyBracket ( (lv_if_7_0= ruleCommand ) ) (otherlv_8= Comma ( (lv_if_9_0= ruleCommand ) ) )* otherlv_10= RightCurlyBracket )? (otherlv_11= Else otherlv_12= LeftCurlyBracket ( (lv_else_13_0= ruleCommand ) ) (otherlv_14= Comma ( (lv_else_15_0= ruleCommand ) ) )* otherlv_16= RightCurlyBracket )? (otherlv_17= Ifelse otherlv_18= LeftCurlyBracket ( (lv_ifelse_19_0= ruleIfThenElse ) ) (otherlv_20= Comma ( (lv_ifelse_21_0= ruleIfThenElse ) ) )* otherlv_22= RightCurlyBracket )? (otherlv_23= Elseif otherlv_24= LeftCurlyBracket ( (lv_elseif_25_0= ruleIfThenElse ) ) (otherlv_26= Comma ( (lv_elseif_27_0= ruleIfThenElse ) ) )* otherlv_28= RightCurlyBracket )? otherlv_29= RightCurlyBracket ) ;
    public final EObject ruleIfThenElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_Condition_4_0 = null;

        EObject lv_if_7_0 = null;

        EObject lv_if_9_0 = null;

        EObject lv_else_13_0 = null;

        EObject lv_else_15_0 = null;

        EObject lv_ifelse_19_0 = null;

        EObject lv_ifelse_21_0 = null;

        EObject lv_elseif_25_0 = null;

        EObject lv_elseif_27_0 = null;



        	enterRule();

        try {
            // InternalMyDslParser.g:1051:2: ( ( () otherlv_1= IfThenElse otherlv_2= LeftCurlyBracket (otherlv_3= Condition ( (lv_Condition_4_0= ruleEString ) ) )? (otherlv_5= If otherlv_6= LeftCurlyBracket ( (lv_if_7_0= ruleCommand ) ) (otherlv_8= Comma ( (lv_if_9_0= ruleCommand ) ) )* otherlv_10= RightCurlyBracket )? (otherlv_11= Else otherlv_12= LeftCurlyBracket ( (lv_else_13_0= ruleCommand ) ) (otherlv_14= Comma ( (lv_else_15_0= ruleCommand ) ) )* otherlv_16= RightCurlyBracket )? (otherlv_17= Ifelse otherlv_18= LeftCurlyBracket ( (lv_ifelse_19_0= ruleIfThenElse ) ) (otherlv_20= Comma ( (lv_ifelse_21_0= ruleIfThenElse ) ) )* otherlv_22= RightCurlyBracket )? (otherlv_23= Elseif otherlv_24= LeftCurlyBracket ( (lv_elseif_25_0= ruleIfThenElse ) ) (otherlv_26= Comma ( (lv_elseif_27_0= ruleIfThenElse ) ) )* otherlv_28= RightCurlyBracket )? otherlv_29= RightCurlyBracket ) )
            // InternalMyDslParser.g:1052:2: ( () otherlv_1= IfThenElse otherlv_2= LeftCurlyBracket (otherlv_3= Condition ( (lv_Condition_4_0= ruleEString ) ) )? (otherlv_5= If otherlv_6= LeftCurlyBracket ( (lv_if_7_0= ruleCommand ) ) (otherlv_8= Comma ( (lv_if_9_0= ruleCommand ) ) )* otherlv_10= RightCurlyBracket )? (otherlv_11= Else otherlv_12= LeftCurlyBracket ( (lv_else_13_0= ruleCommand ) ) (otherlv_14= Comma ( (lv_else_15_0= ruleCommand ) ) )* otherlv_16= RightCurlyBracket )? (otherlv_17= Ifelse otherlv_18= LeftCurlyBracket ( (lv_ifelse_19_0= ruleIfThenElse ) ) (otherlv_20= Comma ( (lv_ifelse_21_0= ruleIfThenElse ) ) )* otherlv_22= RightCurlyBracket )? (otherlv_23= Elseif otherlv_24= LeftCurlyBracket ( (lv_elseif_25_0= ruleIfThenElse ) ) (otherlv_26= Comma ( (lv_elseif_27_0= ruleIfThenElse ) ) )* otherlv_28= RightCurlyBracket )? otherlv_29= RightCurlyBracket )
            {
            // InternalMyDslParser.g:1052:2: ( () otherlv_1= IfThenElse otherlv_2= LeftCurlyBracket (otherlv_3= Condition ( (lv_Condition_4_0= ruleEString ) ) )? (otherlv_5= If otherlv_6= LeftCurlyBracket ( (lv_if_7_0= ruleCommand ) ) (otherlv_8= Comma ( (lv_if_9_0= ruleCommand ) ) )* otherlv_10= RightCurlyBracket )? (otherlv_11= Else otherlv_12= LeftCurlyBracket ( (lv_else_13_0= ruleCommand ) ) (otherlv_14= Comma ( (lv_else_15_0= ruleCommand ) ) )* otherlv_16= RightCurlyBracket )? (otherlv_17= Ifelse otherlv_18= LeftCurlyBracket ( (lv_ifelse_19_0= ruleIfThenElse ) ) (otherlv_20= Comma ( (lv_ifelse_21_0= ruleIfThenElse ) ) )* otherlv_22= RightCurlyBracket )? (otherlv_23= Elseif otherlv_24= LeftCurlyBracket ( (lv_elseif_25_0= ruleIfThenElse ) ) (otherlv_26= Comma ( (lv_elseif_27_0= ruleIfThenElse ) ) )* otherlv_28= RightCurlyBracket )? otherlv_29= RightCurlyBracket )
            // InternalMyDslParser.g:1053:3: () otherlv_1= IfThenElse otherlv_2= LeftCurlyBracket (otherlv_3= Condition ( (lv_Condition_4_0= ruleEString ) ) )? (otherlv_5= If otherlv_6= LeftCurlyBracket ( (lv_if_7_0= ruleCommand ) ) (otherlv_8= Comma ( (lv_if_9_0= ruleCommand ) ) )* otherlv_10= RightCurlyBracket )? (otherlv_11= Else otherlv_12= LeftCurlyBracket ( (lv_else_13_0= ruleCommand ) ) (otherlv_14= Comma ( (lv_else_15_0= ruleCommand ) ) )* otherlv_16= RightCurlyBracket )? (otherlv_17= Ifelse otherlv_18= LeftCurlyBracket ( (lv_ifelse_19_0= ruleIfThenElse ) ) (otherlv_20= Comma ( (lv_ifelse_21_0= ruleIfThenElse ) ) )* otherlv_22= RightCurlyBracket )? (otherlv_23= Elseif otherlv_24= LeftCurlyBracket ( (lv_elseif_25_0= ruleIfThenElse ) ) (otherlv_26= Comma ( (lv_elseif_27_0= ruleIfThenElse ) ) )* otherlv_28= RightCurlyBracket )? otherlv_29= RightCurlyBracket
            {
            // InternalMyDslParser.g:1053:3: ()
            // InternalMyDslParser.g:1054:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfThenElseAccess().getIfThenElseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,IfThenElse,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getIfThenElseAccess().getIfThenElseKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDslParser.g:1068:3: (otherlv_3= Condition ( (lv_Condition_4_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Condition) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDslParser.g:1069:4: otherlv_3= Condition ( (lv_Condition_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,Condition,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getIfThenElseAccess().getConditionKeyword_3_0());
                    			
                    // InternalMyDslParser.g:1073:4: ( (lv_Condition_4_0= ruleEString ) )
                    // InternalMyDslParser.g:1074:5: (lv_Condition_4_0= ruleEString )
                    {
                    // InternalMyDslParser.g:1074:5: (lv_Condition_4_0= ruleEString )
                    // InternalMyDslParser.g:1075:6: lv_Condition_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseAccess().getConditionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_Condition_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    						}
                    						set(
                    							current,
                    							"Condition",
                    							lv_Condition_4_0,
                    							"org.xtext.example.mydsl5.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDslParser.g:1093:3: (otherlv_5= If otherlv_6= LeftCurlyBracket ( (lv_if_7_0= ruleCommand ) ) (otherlv_8= Comma ( (lv_if_9_0= ruleCommand ) ) )* otherlv_10= RightCurlyBracket )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==If) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDslParser.g:1094:4: otherlv_5= If otherlv_6= LeftCurlyBracket ( (lv_if_7_0= ruleCommand ) ) (otherlv_8= Comma ( (lv_if_9_0= ruleCommand ) ) )* otherlv_10= RightCurlyBracket
                    {
                    otherlv_5=(Token)match(input,If,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfThenElseAccess().getIfKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,LeftCurlyBracket,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDslParser.g:1102:4: ( (lv_if_7_0= ruleCommand ) )
                    // InternalMyDslParser.g:1103:5: (lv_if_7_0= ruleCommand )
                    {
                    // InternalMyDslParser.g:1103:5: (lv_if_7_0= ruleCommand )
                    // InternalMyDslParser.g:1104:6: lv_if_7_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseAccess().getIfCommandParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_if_7_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    						}
                    						add(
                    							current,
                    							"if",
                    							lv_if_7_0,
                    							"org.xtext.example.mydsl5.MyDsl.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:1121:4: (otherlv_8= Comma ( (lv_if_9_0= ruleCommand ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==Comma) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1122:5: otherlv_8= Comma ( (lv_if_9_0= ruleCommand ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Comma,FOLLOW_26); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getIfThenElseAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDslParser.g:1126:5: ( (lv_if_9_0= ruleCommand ) )
                    	    // InternalMyDslParser.g:1127:6: (lv_if_9_0= ruleCommand )
                    	    {
                    	    // InternalMyDslParser.g:1127:6: (lv_if_9_0= ruleCommand )
                    	    // InternalMyDslParser.g:1128:7: lv_if_9_0= ruleCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfThenElseAccess().getIfCommandParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_if_9_0=ruleCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"if",
                    	    								lv_if_9_0,
                    	    								"org.xtext.example.mydsl5.MyDsl.Command");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,RightCurlyBracket,FOLLOW_35); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:1151:3: (otherlv_11= Else otherlv_12= LeftCurlyBracket ( (lv_else_13_0= ruleCommand ) ) (otherlv_14= Comma ( (lv_else_15_0= ruleCommand ) ) )* otherlv_16= RightCurlyBracket )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Else) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDslParser.g:1152:4: otherlv_11= Else otherlv_12= LeftCurlyBracket ( (lv_else_13_0= ruleCommand ) ) (otherlv_14= Comma ( (lv_else_15_0= ruleCommand ) ) )* otherlv_16= RightCurlyBracket
                    {
                    otherlv_11=(Token)match(input,Else,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getIfThenElseAccess().getElseKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,LeftCurlyBracket,FOLLOW_26); 

                    				newLeafNode(otherlv_12, grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDslParser.g:1160:4: ( (lv_else_13_0= ruleCommand ) )
                    // InternalMyDslParser.g:1161:5: (lv_else_13_0= ruleCommand )
                    {
                    // InternalMyDslParser.g:1161:5: (lv_else_13_0= ruleCommand )
                    // InternalMyDslParser.g:1162:6: lv_else_13_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseAccess().getElseCommandParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_else_13_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    						}
                    						add(
                    							current,
                    							"else",
                    							lv_else_13_0,
                    							"org.xtext.example.mydsl5.MyDsl.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:1179:4: (otherlv_14= Comma ( (lv_else_15_0= ruleCommand ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==Comma) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1180:5: otherlv_14= Comma ( (lv_else_15_0= ruleCommand ) )
                    	    {
                    	    otherlv_14=(Token)match(input,Comma,FOLLOW_26); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getIfThenElseAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDslParser.g:1184:5: ( (lv_else_15_0= ruleCommand ) )
                    	    // InternalMyDslParser.g:1185:6: (lv_else_15_0= ruleCommand )
                    	    {
                    	    // InternalMyDslParser.g:1185:6: (lv_else_15_0= ruleCommand )
                    	    // InternalMyDslParser.g:1186:7: lv_else_15_0= ruleCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfThenElseAccess().getElseCommandParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_else_15_0=ruleCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"else",
                    	    								lv_else_15_0,
                    	    								"org.xtext.example.mydsl5.MyDsl.Command");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,RightCurlyBracket,FOLLOW_36); 

                    				newLeafNode(otherlv_16, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:1209:3: (otherlv_17= Ifelse otherlv_18= LeftCurlyBracket ( (lv_ifelse_19_0= ruleIfThenElse ) ) (otherlv_20= Comma ( (lv_ifelse_21_0= ruleIfThenElse ) ) )* otherlv_22= RightCurlyBracket )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Ifelse) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDslParser.g:1210:4: otherlv_17= Ifelse otherlv_18= LeftCurlyBracket ( (lv_ifelse_19_0= ruleIfThenElse ) ) (otherlv_20= Comma ( (lv_ifelse_21_0= ruleIfThenElse ) ) )* otherlv_22= RightCurlyBracket
                    {
                    otherlv_17=(Token)match(input,Ifelse,FOLLOW_9); 

                    				newLeafNode(otherlv_17, grammarAccess.getIfThenElseAccess().getIfelseKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,LeftCurlyBracket,FOLLOW_37); 

                    				newLeafNode(otherlv_18, grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMyDslParser.g:1218:4: ( (lv_ifelse_19_0= ruleIfThenElse ) )
                    // InternalMyDslParser.g:1219:5: (lv_ifelse_19_0= ruleIfThenElse )
                    {
                    // InternalMyDslParser.g:1219:5: (lv_ifelse_19_0= ruleIfThenElse )
                    // InternalMyDslParser.g:1220:6: lv_ifelse_19_0= ruleIfThenElse
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseAccess().getIfelseIfThenElseParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_ifelse_19_0=ruleIfThenElse();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    						}
                    						add(
                    							current,
                    							"ifelse",
                    							lv_ifelse_19_0,
                    							"org.xtext.example.mydsl5.MyDsl.IfThenElse");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:1237:4: (otherlv_20= Comma ( (lv_ifelse_21_0= ruleIfThenElse ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==Comma) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1238:5: otherlv_20= Comma ( (lv_ifelse_21_0= ruleIfThenElse ) )
                    	    {
                    	    otherlv_20=(Token)match(input,Comma,FOLLOW_37); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getIfThenElseAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDslParser.g:1242:5: ( (lv_ifelse_21_0= ruleIfThenElse ) )
                    	    // InternalMyDslParser.g:1243:6: (lv_ifelse_21_0= ruleIfThenElse )
                    	    {
                    	    // InternalMyDslParser.g:1243:6: (lv_ifelse_21_0= ruleIfThenElse )
                    	    // InternalMyDslParser.g:1244:7: lv_ifelse_21_0= ruleIfThenElse
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfThenElseAccess().getIfelseIfThenElseParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_ifelse_21_0=ruleIfThenElse();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ifelse",
                    	    								lv_ifelse_21_0,
                    	    								"org.xtext.example.mydsl5.MyDsl.IfThenElse");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,RightCurlyBracket,FOLLOW_38); 

                    				newLeafNode(otherlv_22, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDslParser.g:1267:3: (otherlv_23= Elseif otherlv_24= LeftCurlyBracket ( (lv_elseif_25_0= ruleIfThenElse ) ) (otherlv_26= Comma ( (lv_elseif_27_0= ruleIfThenElse ) ) )* otherlv_28= RightCurlyBracket )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Elseif) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDslParser.g:1268:4: otherlv_23= Elseif otherlv_24= LeftCurlyBracket ( (lv_elseif_25_0= ruleIfThenElse ) ) (otherlv_26= Comma ( (lv_elseif_27_0= ruleIfThenElse ) ) )* otherlv_28= RightCurlyBracket
                    {
                    otherlv_23=(Token)match(input,Elseif,FOLLOW_9); 

                    				newLeafNode(otherlv_23, grammarAccess.getIfThenElseAccess().getElseifKeyword_7_0());
                    			
                    otherlv_24=(Token)match(input,LeftCurlyBracket,FOLLOW_37); 

                    				newLeafNode(otherlv_24, grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMyDslParser.g:1276:4: ( (lv_elseif_25_0= ruleIfThenElse ) )
                    // InternalMyDslParser.g:1277:5: (lv_elseif_25_0= ruleIfThenElse )
                    {
                    // InternalMyDslParser.g:1277:5: (lv_elseif_25_0= ruleIfThenElse )
                    // InternalMyDslParser.g:1278:6: lv_elseif_25_0= ruleIfThenElse
                    {

                    						newCompositeNode(grammarAccess.getIfThenElseAccess().getElseifIfThenElseParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_elseif_25_0=ruleIfThenElse();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    						}
                    						add(
                    							current,
                    							"elseif",
                    							lv_elseif_25_0,
                    							"org.xtext.example.mydsl5.MyDsl.IfThenElse");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDslParser.g:1295:4: (otherlv_26= Comma ( (lv_elseif_27_0= ruleIfThenElse ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==Comma) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalMyDslParser.g:1296:5: otherlv_26= Comma ( (lv_elseif_27_0= ruleIfThenElse ) )
                    	    {
                    	    otherlv_26=(Token)match(input,Comma,FOLLOW_37); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getIfThenElseAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDslParser.g:1300:5: ( (lv_elseif_27_0= ruleIfThenElse ) )
                    	    // InternalMyDslParser.g:1301:6: (lv_elseif_27_0= ruleIfThenElse )
                    	    {
                    	    // InternalMyDslParser.g:1301:6: (lv_elseif_27_0= ruleIfThenElse )
                    	    // InternalMyDslParser.g:1302:7: lv_elseif_27_0= ruleIfThenElse
                    	    {

                    	    							newCompositeNode(grammarAccess.getIfThenElseAccess().getElseifIfThenElseParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_elseif_27_0=ruleIfThenElse();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elseif",
                    	    								lv_elseif_27_0,
                    	    								"org.xtext.example.mydsl5.MyDsl.IfThenElse");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,RightCurlyBracket,FOLLOW_18); 

                    				newLeafNode(otherlv_28, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_8());
            		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000820000032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000820000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000820000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001400000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001600000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080002010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200010661040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200010261040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200010221040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200010221000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200010021000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200010020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080200000800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000082100182000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000082100180000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080100180000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000180000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000080000L});

}