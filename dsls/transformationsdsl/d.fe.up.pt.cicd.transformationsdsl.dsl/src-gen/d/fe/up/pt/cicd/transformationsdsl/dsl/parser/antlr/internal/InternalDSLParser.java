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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'before'", "'translating'", "'{'", "'}'", "'during'", "'after'", "'run'", "'ATL'", "'on'", "'change'", "'plugin'", "'version'", "'args'", "'set'", "'labels'", "'when'", "'add'", "'trigger'", "'manual'", "'delete'", "'step'", "'replace'", "'with'", "'conditional'", "'if'", "'then'", "'else'", "'command'", "'script'", "'environment'", "'='", "'circleci'", "'to'", "'executor'", "'from'", "'orb'", "'select'", "'workflow'", "'gha'", "'cicd'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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




    // $ANTLR start "entryRuleTransformationSet"
    // InternalDSL.g:65:1: entryRuleTransformationSet returns [EObject current=null] : iv_ruleTransformationSet= ruleTransformationSet EOF ;
    public final EObject entryRuleTransformationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationSet = null;


        try {
            // InternalDSL.g:65:58: (iv_ruleTransformationSet= ruleTransformationSet EOF )
            // InternalDSL.g:66:2: iv_ruleTransformationSet= ruleTransformationSet EOF
            {
             newCompositeNode(grammarAccess.getTransformationSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransformationSet=ruleTransformationSet();

            state._fsp--;

             current =iv_ruleTransformationSet; 
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
    // $ANTLR end "entryRuleTransformationSet"


    // $ANTLR start "ruleTransformationSet"
    // InternalDSL.g:72:1: ruleTransformationSet returns [EObject current=null] : ( () (otherlv_1= 'before' (otherlv_2= 'translating' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )? (otherlv_6= 'during' (otherlv_7= 'translating' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )? (otherlv_11= 'after' (otherlv_12= 'translating' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )? ) ;
    public final EObject ruleTransformationSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_preTIM_4_0 = null;

        EObject lv_onTIM_9_0 = null;

        EObject lv_postTIM_14_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:78:2: ( ( () (otherlv_1= 'before' (otherlv_2= 'translating' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )? (otherlv_6= 'during' (otherlv_7= 'translating' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )? (otherlv_11= 'after' (otherlv_12= 'translating' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )? ) )
            // InternalDSL.g:79:2: ( () (otherlv_1= 'before' (otherlv_2= 'translating' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )? (otherlv_6= 'during' (otherlv_7= 'translating' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )? (otherlv_11= 'after' (otherlv_12= 'translating' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )? )
            {
            // InternalDSL.g:79:2: ( () (otherlv_1= 'before' (otherlv_2= 'translating' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )? (otherlv_6= 'during' (otherlv_7= 'translating' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )? (otherlv_11= 'after' (otherlv_12= 'translating' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )? )
            // InternalDSL.g:80:3: () (otherlv_1= 'before' (otherlv_2= 'translating' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )? (otherlv_6= 'during' (otherlv_7= 'translating' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )? (otherlv_11= 'after' (otherlv_12= 'translating' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )?
            {
            // InternalDSL.g:80:3: ()
            // InternalDSL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransformationSetAccess().getTransformationSetAction_0(),
            					current);
            			

            }

            // InternalDSL.g:87:3: (otherlv_1= 'before' (otherlv_2= 'translating' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:88:4: otherlv_1= 'before' (otherlv_2= 'translating' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getTransformationSetAccess().getBeforeKeyword_1_0());
                    			
                    // InternalDSL.g:92:4: (otherlv_2= 'translating' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==12) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalDSL.g:93:5: otherlv_2= 'translating'
                            {
                            otherlv_2=(Token)match(input,12,FOLLOW_4); 

                            					newLeafNode(otherlv_2, grammarAccess.getTransformationSetAccess().getTranslatingKeyword_1_1());
                            				

                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransformationSetAccess().getLeftCurlyBracketKeyword_1_2());
                    			
                    // InternalDSL.g:102:4: ( (lv_preTIM_4_0= ruleTSMTransformation ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17||LA2_0==19) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalDSL.g:103:5: (lv_preTIM_4_0= ruleTSMTransformation )
                    	    {
                    	    // InternalDSL.g:103:5: (lv_preTIM_4_0= ruleTSMTransformation )
                    	    // InternalDSL.g:104:6: lv_preTIM_4_0= ruleTSMTransformation
                    	    {

                    	    						newCompositeNode(grammarAccess.getTransformationSetAccess().getPreTIMTSMTransformationParserRuleCall_1_3_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_preTIM_4_0=ruleTSMTransformation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTransformationSetRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"preTIM",
                    	    							lv_preTIM_4_0,
                    	    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.TSMTransformation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransformationSetAccess().getRightCurlyBracketKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:126:3: (otherlv_6= 'during' (otherlv_7= 'translating' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:127:4: otherlv_6= 'during' (otherlv_7= 'translating' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransformationSetAccess().getDuringKeyword_2_0());
                    			
                    // InternalDSL.g:131:4: (otherlv_7= 'translating' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==12) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalDSL.g:132:5: otherlv_7= 'translating'
                            {
                            otherlv_7=(Token)match(input,12,FOLLOW_4); 

                            					newLeafNode(otherlv_7, grammarAccess.getTransformationSetAccess().getTranslatingKeyword_2_1());
                            				

                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getTransformationSetAccess().getLeftCurlyBracketKeyword_2_2());
                    			
                    // InternalDSL.g:141:4: ( (lv_onTIM_9_0= ruleTIMTransformation ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17||LA5_0==20||LA5_0==24||LA5_0==27||LA5_0==30||LA5_0==32) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDSL.g:142:5: (lv_onTIM_9_0= ruleTIMTransformation )
                    	    {
                    	    // InternalDSL.g:142:5: (lv_onTIM_9_0= ruleTIMTransformation )
                    	    // InternalDSL.g:143:6: lv_onTIM_9_0= ruleTIMTransformation
                    	    {

                    	    						newCompositeNode(grammarAccess.getTransformationSetAccess().getOnTIMTIMTransformationParserRuleCall_2_3_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_onTIM_9_0=ruleTIMTransformation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTransformationSetRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"onTIM",
                    	    							lv_onTIM_9_0,
                    	    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.TIMTransformation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getTransformationSetAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalDSL.g:165:3: (otherlv_11= 'after' (otherlv_12= 'translating' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDSL.g:166:4: otherlv_11= 'after' (otherlv_12= 'translating' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}'
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getTransformationSetAccess().getAfterKeyword_3_0());
                    			
                    // InternalDSL.g:170:4: (otherlv_12= 'translating' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==12) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalDSL.g:171:5: otherlv_12= 'translating'
                            {
                            otherlv_12=(Token)match(input,12,FOLLOW_4); 

                            					newLeafNode(otherlv_12, grammarAccess.getTransformationSetAccess().getTranslatingKeyword_3_1());
                            				

                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getTransformationSetAccess().getLeftCurlyBracketKeyword_3_2());
                    			
                    // InternalDSL.g:180:4: ( (lv_postTIM_14_0= ruleTSMTransformation ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==17||LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDSL.g:181:5: (lv_postTIM_14_0= ruleTSMTransformation )
                    	    {
                    	    // InternalDSL.g:181:5: (lv_postTIM_14_0= ruleTSMTransformation )
                    	    // InternalDSL.g:182:6: lv_postTIM_14_0= ruleTSMTransformation
                    	    {

                    	    						newCompositeNode(grammarAccess.getTransformationSetAccess().getPostTIMTSMTransformationParserRuleCall_3_3_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_postTIM_14_0=ruleTSMTransformation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTransformationSetRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"postTIM",
                    	    							lv_postTIM_14_0,
                    	    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.TSMTransformation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getTransformationSetAccess().getRightCurlyBracketKeyword_3_4());
                    			

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
    // $ANTLR end "ruleTransformationSet"


    // $ANTLR start "entryRuleTSMTransformation"
    // InternalDSL.g:208:1: entryRuleTSMTransformation returns [EObject current=null] : iv_ruleTSMTransformation= ruleTSMTransformation EOF ;
    public final EObject entryRuleTSMTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTSMTransformation = null;


        try {
            // InternalDSL.g:208:58: (iv_ruleTSMTransformation= ruleTSMTransformation EOF )
            // InternalDSL.g:209:2: iv_ruleTSMTransformation= ruleTSMTransformation EOF
            {
             newCompositeNode(grammarAccess.getTSMTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTSMTransformation=ruleTSMTransformation();

            state._fsp--;

             current =iv_ruleTSMTransformation; 
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
    // $ANTLR end "entryRuleTSMTransformation"


    // $ANTLR start "ruleTSMTransformation"
    // InternalDSL.g:215:1: ruleTSMTransformation returns [EObject current=null] : (this_ATLScript_0= ruleATLScript | this_CircleCITransformation_1= ruleCircleCITransformation ) ;
    public final EObject ruleTSMTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_ATLScript_0 = null;

        EObject this_CircleCITransformation_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:221:2: ( (this_ATLScript_0= ruleATLScript | this_CircleCITransformation_1= ruleCircleCITransformation ) )
            // InternalDSL.g:222:2: (this_ATLScript_0= ruleATLScript | this_CircleCITransformation_1= ruleCircleCITransformation )
            {
            // InternalDSL.g:222:2: (this_ATLScript_0= ruleATLScript | this_CircleCITransformation_1= ruleCircleCITransformation )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:223:3: this_ATLScript_0= ruleATLScript
                    {

                    			newCompositeNode(grammarAccess.getTSMTransformationAccess().getATLScriptParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ATLScript_0=ruleATLScript();

                    state._fsp--;


                    			current = this_ATLScript_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:232:3: this_CircleCITransformation_1= ruleCircleCITransformation
                    {

                    			newCompositeNode(grammarAccess.getTSMTransformationAccess().getCircleCITransformationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CircleCITransformation_1=ruleCircleCITransformation();

                    state._fsp--;


                    			current = this_CircleCITransformation_1;
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
    // $ANTLR end "ruleTSMTransformation"


    // $ANTLR start "entryRuleATLScript"
    // InternalDSL.g:244:1: entryRuleATLScript returns [EObject current=null] : iv_ruleATLScript= ruleATLScript EOF ;
    public final EObject entryRuleATLScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATLScript = null;


        try {
            // InternalDSL.g:244:50: (iv_ruleATLScript= ruleATLScript EOF )
            // InternalDSL.g:245:2: iv_ruleATLScript= ruleATLScript EOF
            {
             newCompositeNode(grammarAccess.getATLScriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleATLScript=ruleATLScript();

            state._fsp--;

             current =iv_ruleATLScript; 
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
    // $ANTLR end "entryRuleATLScript"


    // $ANTLR start "ruleATLScript"
    // InternalDSL.g:251:1: ruleATLScript returns [EObject current=null] : (otherlv_0= 'run' otherlv_1= 'ATL' (otherlv_2= 'on' )? ( (lv_model_3_0= ruleMODELS ) ) otherlv_4= '{' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleATLScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_model_3_0 = null;

        AntlrDatatypeRuleToken lv_script_5_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:257:2: ( (otherlv_0= 'run' otherlv_1= 'ATL' (otherlv_2= 'on' )? ( (lv_model_3_0= ruleMODELS ) ) otherlv_4= '{' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // InternalDSL.g:258:2: (otherlv_0= 'run' otherlv_1= 'ATL' (otherlv_2= 'on' )? ( (lv_model_3_0= ruleMODELS ) ) otherlv_4= '{' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // InternalDSL.g:258:2: (otherlv_0= 'run' otherlv_1= 'ATL' (otherlv_2= 'on' )? ( (lv_model_3_0= ruleMODELS ) ) otherlv_4= '{' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}' )
            // InternalDSL.g:259:3: otherlv_0= 'run' otherlv_1= 'ATL' (otherlv_2= 'on' )? ( (lv_model_3_0= ruleMODELS ) ) otherlv_4= '{' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getATLScriptAccess().getRunKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getATLScriptAccess().getATLKeyword_1());
            		
            // InternalDSL.g:267:3: (otherlv_2= 'on' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDSL.g:268:4: otherlv_2= 'on'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getATLScriptAccess().getOnKeyword_2());
                    			

                    }
                    break;

            }

            // InternalDSL.g:273:3: ( (lv_model_3_0= ruleMODELS ) )
            // InternalDSL.g:274:4: (lv_model_3_0= ruleMODELS )
            {
            // InternalDSL.g:274:4: (lv_model_3_0= ruleMODELS )
            // InternalDSL.g:275:5: lv_model_3_0= ruleMODELS
            {

            					newCompositeNode(grammarAccess.getATLScriptAccess().getModelMODELSEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_model_3_0=ruleMODELS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATLScriptRule());
            					}
            					set(
            						current,
            						"model",
            						lv_model_3_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.MODELS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getATLScriptAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDSL.g:296:3: ( (lv_script_5_0= ruleEString ) )
            // InternalDSL.g:297:4: (lv_script_5_0= ruleEString )
            {
            // InternalDSL.g:297:4: (lv_script_5_0= ruleEString )
            // InternalDSL.g:298:5: lv_script_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getATLScriptAccess().getScriptEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_script_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATLScriptRule());
            					}
            					set(
            						current,
            						"script",
            						lv_script_5_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getATLScriptAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleATLScript"


    // $ANTLR start "entryRuleTIMTransformation"
    // InternalDSL.g:323:1: entryRuleTIMTransformation returns [EObject current=null] : iv_ruleTIMTransformation= ruleTIMTransformation EOF ;
    public final EObject entryRuleTIMTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTIMTransformation = null;


        try {
            // InternalDSL.g:323:58: (iv_ruleTIMTransformation= ruleTIMTransformation EOF )
            // InternalDSL.g:324:2: iv_ruleTIMTransformation= ruleTIMTransformation EOF
            {
             newCompositeNode(grammarAccess.getTIMTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTIMTransformation=ruleTIMTransformation();

            state._fsp--;

             current =iv_ruleTIMTransformation; 
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
    // $ANTLR end "entryRuleTIMTransformation"


    // $ANTLR start "ruleTIMTransformation"
    // InternalDSL.g:330:1: ruleTIMTransformation returns [EObject current=null] : (this_ATLScript_0= ruleATLScript | this_ChangePlugin_1= ruleChangePlugin | this_ReplaceAgentLabels_2= ruleReplaceAgentLabels | this_AddTrigger_3= ruleAddTrigger | this_ReplaceStep_4= ruleReplaceStep | this_DeleteStep_5= ruleDeleteStep ) ;
    public final EObject ruleTIMTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_ATLScript_0 = null;

        EObject this_ChangePlugin_1 = null;

        EObject this_ReplaceAgentLabels_2 = null;

        EObject this_AddTrigger_3 = null;

        EObject this_ReplaceStep_4 = null;

        EObject this_DeleteStep_5 = null;



        	enterRule();

        try {
            // InternalDSL.g:336:2: ( (this_ATLScript_0= ruleATLScript | this_ChangePlugin_1= ruleChangePlugin | this_ReplaceAgentLabels_2= ruleReplaceAgentLabels | this_AddTrigger_3= ruleAddTrigger | this_ReplaceStep_4= ruleReplaceStep | this_DeleteStep_5= ruleDeleteStep ) )
            // InternalDSL.g:337:2: (this_ATLScript_0= ruleATLScript | this_ChangePlugin_1= ruleChangePlugin | this_ReplaceAgentLabels_2= ruleReplaceAgentLabels | this_AddTrigger_3= ruleAddTrigger | this_ReplaceStep_4= ruleReplaceStep | this_DeleteStep_5= ruleDeleteStep )
            {
            // InternalDSL.g:337:2: (this_ATLScript_0= ruleATLScript | this_ChangePlugin_1= ruleChangePlugin | this_ReplaceAgentLabels_2= ruleReplaceAgentLabels | this_AddTrigger_3= ruleAddTrigger | this_ReplaceStep_4= ruleReplaceStep | this_DeleteStep_5= ruleDeleteStep )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt12=1;
                }
                break;
            case 20:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            case 27:
                {
                alt12=4;
                }
                break;
            case 32:
                {
                alt12=5;
                }
                break;
            case 30:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDSL.g:338:3: this_ATLScript_0= ruleATLScript
                    {

                    			newCompositeNode(grammarAccess.getTIMTransformationAccess().getATLScriptParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ATLScript_0=ruleATLScript();

                    state._fsp--;


                    			current = this_ATLScript_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:347:3: this_ChangePlugin_1= ruleChangePlugin
                    {

                    			newCompositeNode(grammarAccess.getTIMTransformationAccess().getChangePluginParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangePlugin_1=ruleChangePlugin();

                    state._fsp--;


                    			current = this_ChangePlugin_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:356:3: this_ReplaceAgentLabels_2= ruleReplaceAgentLabels
                    {

                    			newCompositeNode(grammarAccess.getTIMTransformationAccess().getReplaceAgentLabelsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReplaceAgentLabels_2=ruleReplaceAgentLabels();

                    state._fsp--;


                    			current = this_ReplaceAgentLabels_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDSL.g:365:3: this_AddTrigger_3= ruleAddTrigger
                    {

                    			newCompositeNode(grammarAccess.getTIMTransformationAccess().getAddTriggerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddTrigger_3=ruleAddTrigger();

                    state._fsp--;


                    			current = this_AddTrigger_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDSL.g:374:3: this_ReplaceStep_4= ruleReplaceStep
                    {

                    			newCompositeNode(grammarAccess.getTIMTransformationAccess().getReplaceStepParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReplaceStep_4=ruleReplaceStep();

                    state._fsp--;


                    			current = this_ReplaceStep_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDSL.g:383:3: this_DeleteStep_5= ruleDeleteStep
                    {

                    			newCompositeNode(grammarAccess.getTIMTransformationAccess().getDeleteStepParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeleteStep_5=ruleDeleteStep();

                    state._fsp--;


                    			current = this_DeleteStep_5;
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
    // $ANTLR end "ruleTIMTransformation"


    // $ANTLR start "entryRuleChangePlugin"
    // InternalDSL.g:395:1: entryRuleChangePlugin returns [EObject current=null] : iv_ruleChangePlugin= ruleChangePlugin EOF ;
    public final EObject entryRuleChangePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangePlugin = null;


        try {
            // InternalDSL.g:395:53: (iv_ruleChangePlugin= ruleChangePlugin EOF )
            // InternalDSL.g:396:2: iv_ruleChangePlugin= ruleChangePlugin EOF
            {
             newCompositeNode(grammarAccess.getChangePluginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangePlugin=ruleChangePlugin();

            state._fsp--;

             current =iv_ruleChangePlugin; 
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
    // $ANTLR end "entryRuleChangePlugin"


    // $ANTLR start "ruleChangePlugin"
    // InternalDSL.g:402:1: ruleChangePlugin returns [EObject current=null] : (otherlv_0= 'change' otherlv_1= 'plugin' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) )+ otherlv_8= '}' )? ) ;
    public final EObject ruleChangePlugin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_version_4_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:408:2: ( (otherlv_0= 'change' otherlv_1= 'plugin' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) )+ otherlv_8= '}' )? ) )
            // InternalDSL.g:409:2: (otherlv_0= 'change' otherlv_1= 'plugin' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) )+ otherlv_8= '}' )? )
            {
            // InternalDSL.g:409:2: (otherlv_0= 'change' otherlv_1= 'plugin' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) )+ otherlv_8= '}' )? )
            // InternalDSL.g:410:3: otherlv_0= 'change' otherlv_1= 'plugin' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) )+ otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getChangePluginAccess().getChangeKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getChangePluginAccess().getPluginKeyword_1());
            		
            // InternalDSL.g:418:3: ( (lv_name_2_0= ruleStringToStringMapEntry ) )
            // InternalDSL.g:419:4: (lv_name_2_0= ruleStringToStringMapEntry )
            {
            // InternalDSL.g:419:4: (lv_name_2_0= ruleStringToStringMapEntry )
            // InternalDSL.g:420:5: lv_name_2_0= ruleStringToStringMapEntry
            {

            					newCompositeNode(grammarAccess.getChangePluginAccess().getNameStringToStringMapEntryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_2_0=ruleStringToStringMapEntry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangePluginRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringToStringMapEntry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getChangePluginAccess().getVersionKeyword_3());
            		
            // InternalDSL.g:441:3: ( (lv_version_4_0= ruleEString ) )
            // InternalDSL.g:442:4: (lv_version_4_0= ruleEString )
            {
            // InternalDSL.g:442:4: (lv_version_4_0= ruleEString )
            // InternalDSL.g:443:5: lv_version_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getChangePluginAccess().getVersionEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_version_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangePluginRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_4_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:460:3: (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) )+ otherlv_8= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDSL.g:461:4: otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getChangePluginAccess().getArgsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getChangePluginAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDSL.g:469:4: ( (lv_args_7_0= ruleStringToStringMapEntry ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDSL.g:470:5: (lv_args_7_0= ruleStringToStringMapEntry )
                    	    {
                    	    // InternalDSL.g:470:5: (lv_args_7_0= ruleStringToStringMapEntry )
                    	    // InternalDSL.g:471:6: lv_args_7_0= ruleStringToStringMapEntry
                    	    {

                    	    						newCompositeNode(grammarAccess.getChangePluginAccess().getArgsStringToStringMapEntryParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_args_7_0=ruleStringToStringMapEntry();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getChangePluginRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"args",
                    	    							lv_args_7_0,
                    	    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringToStringMapEntry");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getChangePluginAccess().getRightCurlyBracketKeyword_5_3());
                    			

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
    // $ANTLR end "ruleChangePlugin"


    // $ANTLR start "entryRuleReplaceAgentLabels"
    // InternalDSL.g:497:1: entryRuleReplaceAgentLabels returns [EObject current=null] : iv_ruleReplaceAgentLabels= ruleReplaceAgentLabels EOF ;
    public final EObject entryRuleReplaceAgentLabels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplaceAgentLabels = null;


        try {
            // InternalDSL.g:497:59: (iv_ruleReplaceAgentLabels= ruleReplaceAgentLabels EOF )
            // InternalDSL.g:498:2: iv_ruleReplaceAgentLabels= ruleReplaceAgentLabels EOF
            {
             newCompositeNode(grammarAccess.getReplaceAgentLabelsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReplaceAgentLabels=ruleReplaceAgentLabels();

            state._fsp--;

             current =iv_ruleReplaceAgentLabels; 
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
    // $ANTLR end "entryRuleReplaceAgentLabels"


    // $ANTLR start "ruleReplaceAgentLabels"
    // InternalDSL.g:504:1: ruleReplaceAgentLabels returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'labels' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= '{' ( (lv_labels_5_0= ruleEString ) )+ otherlv_6= '}' ) ;
    public final EObject ruleReplaceAgentLabels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_condition_3_0 = null;

        AntlrDatatypeRuleToken lv_labels_5_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:510:2: ( (otherlv_0= 'set' otherlv_1= 'labels' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= '{' ( (lv_labels_5_0= ruleEString ) )+ otherlv_6= '}' ) )
            // InternalDSL.g:511:2: (otherlv_0= 'set' otherlv_1= 'labels' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= '{' ( (lv_labels_5_0= ruleEString ) )+ otherlv_6= '}' )
            {
            // InternalDSL.g:511:2: (otherlv_0= 'set' otherlv_1= 'labels' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= '{' ( (lv_labels_5_0= ruleEString ) )+ otherlv_6= '}' )
            // InternalDSL.g:512:3: otherlv_0= 'set' otherlv_1= 'labels' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= '{' ( (lv_labels_5_0= ruleEString ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getReplaceAgentLabelsAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getReplaceAgentLabelsAccess().getLabelsKeyword_1());
            		
            // InternalDSL.g:520:3: (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDSL.g:521:4: otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getReplaceAgentLabelsAccess().getWhenKeyword_2_0());
                    			
                    // InternalDSL.g:525:4: ( (lv_condition_3_0= ruleEString ) )
                    // InternalDSL.g:526:5: (lv_condition_3_0= ruleEString )
                    {
                    // InternalDSL.g:526:5: (lv_condition_3_0= ruleEString )
                    // InternalDSL.g:527:6: lv_condition_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReplaceAgentLabelsAccess().getConditionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_condition_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReplaceAgentLabelsRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_3_0,
                    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getReplaceAgentLabelsAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDSL.g:549:3: ( (lv_labels_5_0= ruleEString ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDSL.g:550:4: (lv_labels_5_0= ruleEString )
            	    {
            	    // InternalDSL.g:550:4: (lv_labels_5_0= ruleEString )
            	    // InternalDSL.g:551:5: lv_labels_5_0= ruleEString
            	    {

            	    					newCompositeNode(grammarAccess.getReplaceAgentLabelsAccess().getLabelsEStringParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_labels_5_0=ruleEString();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReplaceAgentLabelsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"labels",
            	    						lv_labels_5_0,
            	    						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
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

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getReplaceAgentLabelsAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleReplaceAgentLabels"


    // $ANTLR start "entryRuleAddTrigger"
    // InternalDSL.g:576:1: entryRuleAddTrigger returns [EObject current=null] : iv_ruleAddTrigger= ruleAddTrigger EOF ;
    public final EObject entryRuleAddTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddTrigger = null;


        try {
            // InternalDSL.g:576:51: (iv_ruleAddTrigger= ruleAddTrigger EOF )
            // InternalDSL.g:577:2: iv_ruleAddTrigger= ruleAddTrigger EOF
            {
             newCompositeNode(grammarAccess.getAddTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddTrigger=ruleAddTrigger();

            state._fsp--;

             current =iv_ruleAddTrigger; 
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
    // $ANTLR end "entryRuleAddTrigger"


    // $ANTLR start "ruleAddTrigger"
    // InternalDSL.g:583:1: ruleAddTrigger returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'trigger' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) ) ;
    public final EObject ruleAddTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_condition_3_0 = null;

        EObject lv_trigger_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:589:2: ( (otherlv_0= 'add' otherlv_1= 'trigger' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) ) )
            // InternalDSL.g:590:2: (otherlv_0= 'add' otherlv_1= 'trigger' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) )
            {
            // InternalDSL.g:590:2: (otherlv_0= 'add' otherlv_1= 'trigger' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) )
            // InternalDSL.g:591:3: otherlv_0= 'add' otherlv_1= 'trigger' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? ( (lv_trigger_4_0= ruleTrigger ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAddTriggerAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAddTriggerAccess().getTriggerKeyword_1());
            		
            // InternalDSL.g:599:3: (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDSL.g:600:4: otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getAddTriggerAccess().getWhenKeyword_2_0());
                    			
                    // InternalDSL.g:604:4: ( (lv_condition_3_0= ruleEString ) )
                    // InternalDSL.g:605:5: (lv_condition_3_0= ruleEString )
                    {
                    // InternalDSL.g:605:5: (lv_condition_3_0= ruleEString )
                    // InternalDSL.g:606:6: lv_condition_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddTriggerAccess().getConditionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_condition_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddTriggerRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_3_0,
                    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDSL.g:624:3: ( (lv_trigger_4_0= ruleTrigger ) )
            // InternalDSL.g:625:4: (lv_trigger_4_0= ruleTrigger )
            {
            // InternalDSL.g:625:4: (lv_trigger_4_0= ruleTrigger )
            // InternalDSL.g:626:5: lv_trigger_4_0= ruleTrigger
            {

            					newCompositeNode(grammarAccess.getAddTriggerAccess().getTriggerTriggerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_trigger_4_0=ruleTrigger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddTriggerRule());
            					}
            					set(
            						current,
            						"trigger",
            						lv_trigger_4_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.Trigger");
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
    // $ANTLR end "ruleAddTrigger"


    // $ANTLR start "entryRuleTrigger"
    // InternalDSL.g:647:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalDSL.g:647:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalDSL.g:648:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalDSL.g:654:1: ruleTrigger returns [EObject current=null] : this_ManualTrigger_0= ruleManualTrigger ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ManualTrigger_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:660:2: (this_ManualTrigger_0= ruleManualTrigger )
            // InternalDSL.g:661:2: this_ManualTrigger_0= ruleManualTrigger
            {

            		newCompositeNode(grammarAccess.getTriggerAccess().getManualTriggerParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ManualTrigger_0=ruleManualTrigger();

            state._fsp--;


            		current = this_ManualTrigger_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleManualTrigger"
    // InternalDSL.g:672:1: entryRuleManualTrigger returns [EObject current=null] : iv_ruleManualTrigger= ruleManualTrigger EOF ;
    public final EObject entryRuleManualTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManualTrigger = null;


        try {
            // InternalDSL.g:672:54: (iv_ruleManualTrigger= ruleManualTrigger EOF )
            // InternalDSL.g:673:2: iv_ruleManualTrigger= ruleManualTrigger EOF
            {
             newCompositeNode(grammarAccess.getManualTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManualTrigger=ruleManualTrigger();

            state._fsp--;

             current =iv_ruleManualTrigger; 
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
    // $ANTLR end "entryRuleManualTrigger"


    // $ANTLR start "ruleManualTrigger"
    // InternalDSL.g:679:1: ruleManualTrigger returns [EObject current=null] : ( () otherlv_1= 'manual' ) ;
    public final EObject ruleManualTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDSL.g:685:2: ( ( () otherlv_1= 'manual' ) )
            // InternalDSL.g:686:2: ( () otherlv_1= 'manual' )
            {
            // InternalDSL.g:686:2: ( () otherlv_1= 'manual' )
            // InternalDSL.g:687:3: () otherlv_1= 'manual'
            {
            // InternalDSL.g:687:3: ()
            // InternalDSL.g:688:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getManualTriggerAccess().getManualTriggerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getManualTriggerAccess().getManualKeyword_1());
            		

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
    // $ANTLR end "ruleManualTrigger"


    // $ANTLR start "entryRuleDeleteStep"
    // InternalDSL.g:702:1: entryRuleDeleteStep returns [EObject current=null] : iv_ruleDeleteStep= ruleDeleteStep EOF ;
    public final EObject entryRuleDeleteStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStep = null;


        try {
            // InternalDSL.g:702:51: (iv_ruleDeleteStep= ruleDeleteStep EOF )
            // InternalDSL.g:703:2: iv_ruleDeleteStep= ruleDeleteStep EOF
            {
             newCompositeNode(grammarAccess.getDeleteStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteStep=ruleDeleteStep();

            state._fsp--;

             current =iv_ruleDeleteStep; 
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
    // $ANTLR end "entryRuleDeleteStep"


    // $ANTLR start "ruleDeleteStep"
    // InternalDSL.g:709:1: ruleDeleteStep returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) ) ;
    public final EObject ruleDeleteStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_job_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:715:2: ( (otherlv_0= 'delete' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) ) )
            // InternalDSL.g:716:2: (otherlv_0= 'delete' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) )
            {
            // InternalDSL.g:716:2: (otherlv_0= 'delete' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) )
            // InternalDSL.g:717:3: otherlv_0= 'delete' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteStepAccess().getDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteStepAccess().getStepKeyword_1());
            		
            // InternalDSL.g:725:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalDSL.g:726:4: (lv_index_2_0= RULE_INT )
            {
            // InternalDSL.g:726:4: (lv_index_2_0= RULE_INT )
            // InternalDSL.g:727:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_index_2_0, grammarAccess.getDeleteStepAccess().getIndexINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"index",
            						lv_index_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteStepAccess().getOnKeyword_3());
            		
            // InternalDSL.g:747:3: ( (lv_job_4_0= ruleEString ) )
            // InternalDSL.g:748:4: (lv_job_4_0= ruleEString )
            {
            // InternalDSL.g:748:4: (lv_job_4_0= ruleEString )
            // InternalDSL.g:749:5: lv_job_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDeleteStepAccess().getJobEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_job_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteStepRule());
            					}
            					set(
            						current,
            						"job",
            						lv_job_4_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
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
    // $ANTLR end "ruleDeleteStep"


    // $ANTLR start "entryRuleReplaceStep"
    // InternalDSL.g:770:1: entryRuleReplaceStep returns [EObject current=null] : iv_ruleReplaceStep= ruleReplaceStep EOF ;
    public final EObject entryRuleReplaceStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplaceStep = null;


        try {
            // InternalDSL.g:770:52: (iv_ruleReplaceStep= ruleReplaceStep EOF )
            // InternalDSL.g:771:2: iv_ruleReplaceStep= ruleReplaceStep EOF
            {
             newCompositeNode(grammarAccess.getReplaceStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReplaceStep=ruleReplaceStep();

            state._fsp--;

             current =iv_ruleReplaceStep; 
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
    // $ANTLR end "entryRuleReplaceStep"


    // $ANTLR start "ruleReplaceStep"
    // InternalDSL.g:777:1: ruleReplaceStep returns [EObject current=null] : (otherlv_0= 'replace' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) otherlv_5= 'with' ( (lv_step_6_0= ruleStep ) ) ) ;
    public final EObject ruleReplaceStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_job_4_0 = null;

        EObject lv_step_6_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:783:2: ( (otherlv_0= 'replace' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) otherlv_5= 'with' ( (lv_step_6_0= ruleStep ) ) ) )
            // InternalDSL.g:784:2: (otherlv_0= 'replace' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) otherlv_5= 'with' ( (lv_step_6_0= ruleStep ) ) )
            {
            // InternalDSL.g:784:2: (otherlv_0= 'replace' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) otherlv_5= 'with' ( (lv_step_6_0= ruleStep ) ) )
            // InternalDSL.g:785:3: otherlv_0= 'replace' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) otherlv_5= 'with' ( (lv_step_6_0= ruleStep ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getReplaceStepAccess().getReplaceKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getReplaceStepAccess().getStepKeyword_1());
            		
            // InternalDSL.g:793:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalDSL.g:794:4: (lv_index_2_0= RULE_INT )
            {
            // InternalDSL.g:794:4: (lv_index_2_0= RULE_INT )
            // InternalDSL.g:795:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_index_2_0, grammarAccess.getReplaceStepAccess().getIndexINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReplaceStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"index",
            						lv_index_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getReplaceStepAccess().getOnKeyword_3());
            		
            // InternalDSL.g:815:3: ( (lv_job_4_0= ruleEString ) )
            // InternalDSL.g:816:4: (lv_job_4_0= ruleEString )
            {
            // InternalDSL.g:816:4: (lv_job_4_0= ruleEString )
            // InternalDSL.g:817:5: lv_job_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReplaceStepAccess().getJobEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_job_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReplaceStepRule());
            					}
            					set(
            						current,
            						"job",
            						lv_job_4_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getReplaceStepAccess().getWithKeyword_5());
            		
            // InternalDSL.g:838:3: ( (lv_step_6_0= ruleStep ) )
            // InternalDSL.g:839:4: (lv_step_6_0= ruleStep )
            {
            // InternalDSL.g:839:4: (lv_step_6_0= ruleStep )
            // InternalDSL.g:840:5: lv_step_6_0= ruleStep
            {

            					newCompositeNode(grammarAccess.getReplaceStepAccess().getStepStepParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_step_6_0=ruleStep();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReplaceStepRule());
            					}
            					set(
            						current,
            						"step",
            						lv_step_6_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.Step");
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
    // $ANTLR end "ruleReplaceStep"


    // $ANTLR start "entryRuleStep"
    // InternalDSL.g:861:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalDSL.g:861:45: (iv_ruleStep= ruleStep EOF )
            // InternalDSL.g:862:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
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
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalDSL.g:868:1: ruleStep returns [EObject current=null] : (this_ConditionalStep_0= ruleConditionalStep | this_NonConditionalStep_1= ruleNonConditionalStep ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalStep_0 = null;

        EObject this_NonConditionalStep_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:874:2: ( (this_ConditionalStep_0= ruleConditionalStep | this_NonConditionalStep_1= ruleNonConditionalStep ) )
            // InternalDSL.g:875:2: (this_ConditionalStep_0= ruleConditionalStep | this_NonConditionalStep_1= ruleNonConditionalStep )
            {
            // InternalDSL.g:875:2: (this_ConditionalStep_0= ruleConditionalStep | this_NonConditionalStep_1= ruleNonConditionalStep )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            else if ( (LA18_0==38) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalDSL.g:876:3: this_ConditionalStep_0= ruleConditionalStep
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getConditionalStepParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionalStep_0=ruleConditionalStep();

                    state._fsp--;


                    			current = this_ConditionalStep_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:885:3: this_NonConditionalStep_1= ruleNonConditionalStep
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getNonConditionalStepParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonConditionalStep_1=ruleNonConditionalStep();

                    state._fsp--;


                    			current = this_NonConditionalStep_1;
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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleConditionalStep"
    // InternalDSL.g:897:1: entryRuleConditionalStep returns [EObject current=null] : iv_ruleConditionalStep= ruleConditionalStep EOF ;
    public final EObject entryRuleConditionalStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalStep = null;


        try {
            // InternalDSL.g:897:56: (iv_ruleConditionalStep= ruleConditionalStep EOF )
            // InternalDSL.g:898:2: iv_ruleConditionalStep= ruleConditionalStep EOF
            {
             newCompositeNode(grammarAccess.getConditionalStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalStep=ruleConditionalStep();

            state._fsp--;

             current =iv_ruleConditionalStep; 
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
    // $ANTLR end "entryRuleConditionalStep"


    // $ANTLR start "ruleConditionalStep"
    // InternalDSL.g:904:1: ruleConditionalStep returns [EObject current=null] : (otherlv_0= 'conditional' otherlv_1= '{' otherlv_2= 'if' ( (lv_ifCondition_3_0= ruleStringLiteral ) ) otherlv_4= 'then' ( (lv_thenRun_5_0= ruleStep ) )+ (otherlv_6= 'else' ( (lv_elseRun_7_0= ruleStep ) )+ )? otherlv_8= '}' ) ;
    public final EObject ruleConditionalStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_ifCondition_3_0 = null;

        EObject lv_thenRun_5_0 = null;

        EObject lv_elseRun_7_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:910:2: ( (otherlv_0= 'conditional' otherlv_1= '{' otherlv_2= 'if' ( (lv_ifCondition_3_0= ruleStringLiteral ) ) otherlv_4= 'then' ( (lv_thenRun_5_0= ruleStep ) )+ (otherlv_6= 'else' ( (lv_elseRun_7_0= ruleStep ) )+ )? otherlv_8= '}' ) )
            // InternalDSL.g:911:2: (otherlv_0= 'conditional' otherlv_1= '{' otherlv_2= 'if' ( (lv_ifCondition_3_0= ruleStringLiteral ) ) otherlv_4= 'then' ( (lv_thenRun_5_0= ruleStep ) )+ (otherlv_6= 'else' ( (lv_elseRun_7_0= ruleStep ) )+ )? otherlv_8= '}' )
            {
            // InternalDSL.g:911:2: (otherlv_0= 'conditional' otherlv_1= '{' otherlv_2= 'if' ( (lv_ifCondition_3_0= ruleStringLiteral ) ) otherlv_4= 'then' ( (lv_thenRun_5_0= ruleStep ) )+ (otherlv_6= 'else' ( (lv_elseRun_7_0= ruleStep ) )+ )? otherlv_8= '}' )
            // InternalDSL.g:912:3: otherlv_0= 'conditional' otherlv_1= '{' otherlv_2= 'if' ( (lv_ifCondition_3_0= ruleStringLiteral ) ) otherlv_4= 'then' ( (lv_thenRun_5_0= ruleStep ) )+ (otherlv_6= 'else' ( (lv_elseRun_7_0= ruleStep ) )+ )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalStepAccess().getConditionalKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalStepAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalStepAccess().getIfKeyword_2());
            		
            // InternalDSL.g:924:3: ( (lv_ifCondition_3_0= ruleStringLiteral ) )
            // InternalDSL.g:925:4: (lv_ifCondition_3_0= ruleStringLiteral )
            {
            // InternalDSL.g:925:4: (lv_ifCondition_3_0= ruleStringLiteral )
            // InternalDSL.g:926:5: lv_ifCondition_3_0= ruleStringLiteral
            {

            					newCompositeNode(grammarAccess.getConditionalStepAccess().getIfConditionStringLiteralParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_ifCondition_3_0=ruleStringLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalStepRule());
            					}
            					set(
            						current,
            						"ifCondition",
            						lv_ifCondition_3_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalStepAccess().getThenKeyword_4());
            		
            // InternalDSL.g:947:3: ( (lv_thenRun_5_0= ruleStep ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34||LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDSL.g:948:4: (lv_thenRun_5_0= ruleStep )
            	    {
            	    // InternalDSL.g:948:4: (lv_thenRun_5_0= ruleStep )
            	    // InternalDSL.g:949:5: lv_thenRun_5_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getConditionalStepAccess().getThenRunStepParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_thenRun_5_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionalStepRule());
            	    					}
            	    					add(
            	    						current,
            	    						"thenRun",
            	    						lv_thenRun_5_0,
            	    						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            // InternalDSL.g:966:3: (otherlv_6= 'else' ( (lv_elseRun_7_0= ruleStep ) )+ )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDSL.g:967:4: otherlv_6= 'else' ( (lv_elseRun_7_0= ruleStep ) )+
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getConditionalStepAccess().getElseKeyword_6_0());
                    			
                    // InternalDSL.g:971:4: ( (lv_elseRun_7_0= ruleStep ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==34||LA20_0==38) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalDSL.g:972:5: (lv_elseRun_7_0= ruleStep )
                    	    {
                    	    // InternalDSL.g:972:5: (lv_elseRun_7_0= ruleStep )
                    	    // InternalDSL.g:973:6: lv_elseRun_7_0= ruleStep
                    	    {

                    	    						newCompositeNode(grammarAccess.getConditionalStepAccess().getElseRunStepParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_29);
                    	    lv_elseRun_7_0=ruleStep();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getConditionalStepRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elseRun",
                    	    							lv_elseRun_7_0,
                    	    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.Step");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConditionalStepAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleConditionalStep"


    // $ANTLR start "entryRuleNonConditionalStep"
    // InternalDSL.g:999:1: entryRuleNonConditionalStep returns [EObject current=null] : iv_ruleNonConditionalStep= ruleNonConditionalStep EOF ;
    public final EObject entryRuleNonConditionalStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonConditionalStep = null;


        try {
            // InternalDSL.g:999:59: (iv_ruleNonConditionalStep= ruleNonConditionalStep EOF )
            // InternalDSL.g:1000:2: iv_ruleNonConditionalStep= ruleNonConditionalStep EOF
            {
             newCompositeNode(grammarAccess.getNonConditionalStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonConditionalStep=ruleNonConditionalStep();

            state._fsp--;

             current =iv_ruleNonConditionalStep; 
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
    // $ANTLR end "entryRuleNonConditionalStep"


    // $ANTLR start "ruleNonConditionalStep"
    // InternalDSL.g:1006:1: ruleNonConditionalStep returns [EObject current=null] : ( ( () otherlv_1= 'command' otherlv_2= '{' otherlv_3= 'script' ( (lv_program_4_0= ruleStringLiteral ) ) ) (otherlv_5= 'environment' otherlv_6= '{' ( (lv_environmentVariables_7_0= ruleAssignment ) )+ otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleNonConditionalStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_program_4_0 = null;

        EObject lv_environmentVariables_7_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1012:2: ( ( ( () otherlv_1= 'command' otherlv_2= '{' otherlv_3= 'script' ( (lv_program_4_0= ruleStringLiteral ) ) ) (otherlv_5= 'environment' otherlv_6= '{' ( (lv_environmentVariables_7_0= ruleAssignment ) )+ otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalDSL.g:1013:2: ( ( () otherlv_1= 'command' otherlv_2= '{' otherlv_3= 'script' ( (lv_program_4_0= ruleStringLiteral ) ) ) (otherlv_5= 'environment' otherlv_6= '{' ( (lv_environmentVariables_7_0= ruleAssignment ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalDSL.g:1013:2: ( ( () otherlv_1= 'command' otherlv_2= '{' otherlv_3= 'script' ( (lv_program_4_0= ruleStringLiteral ) ) ) (otherlv_5= 'environment' otherlv_6= '{' ( (lv_environmentVariables_7_0= ruleAssignment ) )+ otherlv_8= '}' )? otherlv_9= '}' )
            // InternalDSL.g:1014:3: ( () otherlv_1= 'command' otherlv_2= '{' otherlv_3= 'script' ( (lv_program_4_0= ruleStringLiteral ) ) ) (otherlv_5= 'environment' otherlv_6= '{' ( (lv_environmentVariables_7_0= ruleAssignment ) )+ otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalDSL.g:1014:3: ( () otherlv_1= 'command' otherlv_2= '{' otherlv_3= 'script' ( (lv_program_4_0= ruleStringLiteral ) ) )
            // InternalDSL.g:1015:4: () otherlv_1= 'command' otherlv_2= '{' otherlv_3= 'script' ( (lv_program_4_0= ruleStringLiteral ) )
            {
            // InternalDSL.g:1015:4: ()
            // InternalDSL.g:1016:5: 
            {

            					current = forceCreateModelElement(
            						grammarAccess.getNonConditionalStepAccess().getCommandAction_0_0(),
            						current);
            				

            }

            otherlv_1=(Token)match(input,38,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getNonConditionalStepAccess().getCommandKeyword_0_1());
            			
            otherlv_2=(Token)match(input,13,FOLLOW_30); 

            				newLeafNode(otherlv_2, grammarAccess.getNonConditionalStepAccess().getLeftCurlyBracketKeyword_0_2());
            			
            otherlv_3=(Token)match(input,39,FOLLOW_11); 

            				newLeafNode(otherlv_3, grammarAccess.getNonConditionalStepAccess().getScriptKeyword_0_3());
            			
            // InternalDSL.g:1034:4: ( (lv_program_4_0= ruleStringLiteral ) )
            // InternalDSL.g:1035:5: (lv_program_4_0= ruleStringLiteral )
            {
            // InternalDSL.g:1035:5: (lv_program_4_0= ruleStringLiteral )
            // InternalDSL.g:1036:6: lv_program_4_0= ruleStringLiteral
            {

            						newCompositeNode(grammarAccess.getNonConditionalStepAccess().getProgramStringLiteralParserRuleCall_0_4_0());
            					
            pushFollow(FOLLOW_31);
            lv_program_4_0=ruleStringLiteral();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getNonConditionalStepRule());
            						}
            						set(
            							current,
            							"program",
            							lv_program_4_0,
            							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringLiteral");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalDSL.g:1054:3: (otherlv_5= 'environment' otherlv_6= '{' ( (lv_environmentVariables_7_0= ruleAssignment ) )+ otherlv_8= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDSL.g:1055:4: otherlv_5= 'environment' otherlv_6= '{' ( (lv_environmentVariables_7_0= ruleAssignment ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getNonConditionalStepAccess().getEnvironmentKeyword_1_0());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getNonConditionalStepAccess().getLeftCurlyBracketKeyword_1_1());
                    			
                    // InternalDSL.g:1063:4: ( (lv_environmentVariables_7_0= ruleAssignment ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalDSL.g:1064:5: (lv_environmentVariables_7_0= ruleAssignment )
                    	    {
                    	    // InternalDSL.g:1064:5: (lv_environmentVariables_7_0= ruleAssignment )
                    	    // InternalDSL.g:1065:6: lv_environmentVariables_7_0= ruleAssignment
                    	    {

                    	    						newCompositeNode(grammarAccess.getNonConditionalStepAccess().getEnvironmentVariablesAssignmentParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_environmentVariables_7_0=ruleAssignment();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNonConditionalStepRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"environmentVariables",
                    	    							lv_environmentVariables_7_0,
                    	    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.Assignment");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getNonConditionalStepAccess().getRightCurlyBracketKeyword_1_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getNonConditionalStepAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleNonConditionalStep"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalDSL.g:1095:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalDSL.g:1095:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalDSL.g:1096:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalDSL.g:1102:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1108:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalDSL.g:1109:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalDSL.g:1109:2: ( (lv_value_0_0= ruleEString ) )
            // InternalDSL.g:1110:3: (lv_value_0_0= ruleEString )
            {
            // InternalDSL.g:1110:3: (lv_value_0_0= ruleEString )
            // InternalDSL.g:1111:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getStringLiteralAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStringLiteralRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleAssignment"
    // InternalDSL.g:1131:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalDSL.g:1131:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalDSL.g:1132:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalDSL.g:1138:1: ruleAssignment returns [EObject current=null] : ( ( (lv_key_0_0= ruleVariableDeclaration ) ) otherlv_1= '=' ( (lv_value_2_0= ruleStringLiteral ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1144:2: ( ( ( (lv_key_0_0= ruleVariableDeclaration ) ) otherlv_1= '=' ( (lv_value_2_0= ruleStringLiteral ) ) ) )
            // InternalDSL.g:1145:2: ( ( (lv_key_0_0= ruleVariableDeclaration ) ) otherlv_1= '=' ( (lv_value_2_0= ruleStringLiteral ) ) )
            {
            // InternalDSL.g:1145:2: ( ( (lv_key_0_0= ruleVariableDeclaration ) ) otherlv_1= '=' ( (lv_value_2_0= ruleStringLiteral ) ) )
            // InternalDSL.g:1146:3: ( (lv_key_0_0= ruleVariableDeclaration ) ) otherlv_1= '=' ( (lv_value_2_0= ruleStringLiteral ) )
            {
            // InternalDSL.g:1146:3: ( (lv_key_0_0= ruleVariableDeclaration ) )
            // InternalDSL.g:1147:4: (lv_key_0_0= ruleVariableDeclaration )
            {
            // InternalDSL.g:1147:4: (lv_key_0_0= ruleVariableDeclaration )
            // InternalDSL.g:1148:5: lv_key_0_0= ruleVariableDeclaration
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getKeyVariableDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_key_0_0=ruleVariableDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.VariableDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalDSL.g:1169:3: ( (lv_value_2_0= ruleStringLiteral ) )
            // InternalDSL.g:1170:4: (lv_value_2_0= ruleStringLiteral )
            {
            // InternalDSL.g:1170:4: (lv_value_2_0= ruleStringLiteral )
            // InternalDSL.g:1171:5: lv_value_2_0= ruleStringLiteral
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getValueStringLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleStringLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringLiteral");
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalDSL.g:1192:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalDSL.g:1192:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalDSL.g:1193:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalDSL.g:1199:1: ruleVariableDeclaration returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1205:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalDSL.g:1206:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalDSL.g:1206:2: ( (lv_name_0_0= ruleEString ) )
            // InternalDSL.g:1207:3: (lv_name_0_0= ruleEString )
            {
            // InternalDSL.g:1207:3: (lv_name_0_0= ruleEString )
            // InternalDSL.g:1208:4: lv_name_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getVariableDeclarationAccess().getNameEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleCircleCITransformation"
    // InternalDSL.g:1228:1: entryRuleCircleCITransformation returns [EObject current=null] : iv_ruleCircleCITransformation= ruleCircleCITransformation EOF ;
    public final EObject entryRuleCircleCITransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCircleCITransformation = null;


        try {
            // InternalDSL.g:1228:63: (iv_ruleCircleCITransformation= ruleCircleCITransformation EOF )
            // InternalDSL.g:1229:2: iv_ruleCircleCITransformation= ruleCircleCITransformation EOF
            {
             newCompositeNode(grammarAccess.getCircleCITransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCircleCITransformation=ruleCircleCITransformation();

            state._fsp--;

             current =iv_ruleCircleCITransformation; 
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
    // $ANTLR end "entryRuleCircleCITransformation"


    // $ANTLR start "ruleCircleCITransformation"
    // InternalDSL.g:1235:1: ruleCircleCITransformation returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'circleci' (this_SetCircleCIVersion_2= ruleSetCircleCIVersion | this_AddExecutor_3= ruleAddExecutor | this_SelectWorkflow_4= ruleSelectWorkflow ) ) ;
    public final EObject ruleCircleCITransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_SetCircleCIVersion_2 = null;

        EObject this_AddExecutor_3 = null;

        EObject this_SelectWorkflow_4 = null;



        	enterRule();

        try {
            // InternalDSL.g:1241:2: ( (otherlv_0= 'on' otherlv_1= 'circleci' (this_SetCircleCIVersion_2= ruleSetCircleCIVersion | this_AddExecutor_3= ruleAddExecutor | this_SelectWorkflow_4= ruleSelectWorkflow ) ) )
            // InternalDSL.g:1242:2: (otherlv_0= 'on' otherlv_1= 'circleci' (this_SetCircleCIVersion_2= ruleSetCircleCIVersion | this_AddExecutor_3= ruleAddExecutor | this_SelectWorkflow_4= ruleSelectWorkflow ) )
            {
            // InternalDSL.g:1242:2: (otherlv_0= 'on' otherlv_1= 'circleci' (this_SetCircleCIVersion_2= ruleSetCircleCIVersion | this_AddExecutor_3= ruleAddExecutor | this_SelectWorkflow_4= ruleSelectWorkflow ) )
            // InternalDSL.g:1243:3: otherlv_0= 'on' otherlv_1= 'circleci' (this_SetCircleCIVersion_2= ruleSetCircleCIVersion | this_AddExecutor_3= ruleAddExecutor | this_SelectWorkflow_4= ruleSelectWorkflow )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getCircleCITransformationAccess().getOnKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getCircleCITransformationAccess().getCircleciKeyword_1());
            		
            // InternalDSL.g:1251:3: (this_SetCircleCIVersion_2= ruleSetCircleCIVersion | this_AddExecutor_3= ruleAddExecutor | this_SelectWorkflow_4= ruleSelectWorkflow )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt24=1;
                }
                break;
            case 27:
                {
                alt24=2;
                }
                break;
            case 47:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalDSL.g:1252:4: this_SetCircleCIVersion_2= ruleSetCircleCIVersion
                    {

                    				newCompositeNode(grammarAccess.getCircleCITransformationAccess().getSetCircleCIVersionParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_SetCircleCIVersion_2=ruleSetCircleCIVersion();

                    state._fsp--;


                    				current = this_SetCircleCIVersion_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalDSL.g:1261:4: this_AddExecutor_3= ruleAddExecutor
                    {

                    				newCompositeNode(grammarAccess.getCircleCITransformationAccess().getAddExecutorParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_AddExecutor_3=ruleAddExecutor();

                    state._fsp--;


                    				current = this_AddExecutor_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalDSL.g:1270:4: this_SelectWorkflow_4= ruleSelectWorkflow
                    {

                    				newCompositeNode(grammarAccess.getCircleCITransformationAccess().getSelectWorkflowParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_SelectWorkflow_4=ruleSelectWorkflow();

                    state._fsp--;


                    				current = this_SelectWorkflow_4;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleCircleCITransformation"


    // $ANTLR start "entryRuleSetCircleCIVersion"
    // InternalDSL.g:1283:1: entryRuleSetCircleCIVersion returns [EObject current=null] : iv_ruleSetCircleCIVersion= ruleSetCircleCIVersion EOF ;
    public final EObject entryRuleSetCircleCIVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetCircleCIVersion = null;


        try {
            // InternalDSL.g:1283:59: (iv_ruleSetCircleCIVersion= ruleSetCircleCIVersion EOF )
            // InternalDSL.g:1284:2: iv_ruleSetCircleCIVersion= ruleSetCircleCIVersion EOF
            {
             newCompositeNode(grammarAccess.getSetCircleCIVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetCircleCIVersion=ruleSetCircleCIVersion();

            state._fsp--;

             current =iv_ruleSetCircleCIVersion; 
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
    // $ANTLR end "entryRuleSetCircleCIVersion"


    // $ANTLR start "ruleSetCircleCIVersion"
    // InternalDSL.g:1290:1: ruleSetCircleCIVersion returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'version' (otherlv_2= 'to' )? ( (lv_version_3_0= ruleEString ) ) ) ;
    public final EObject ruleSetCircleCIVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_version_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1296:2: ( (otherlv_0= 'set' otherlv_1= 'version' (otherlv_2= 'to' )? ( (lv_version_3_0= ruleEString ) ) ) )
            // InternalDSL.g:1297:2: (otherlv_0= 'set' otherlv_1= 'version' (otherlv_2= 'to' )? ( (lv_version_3_0= ruleEString ) ) )
            {
            // InternalDSL.g:1297:2: (otherlv_0= 'set' otherlv_1= 'version' (otherlv_2= 'to' )? ( (lv_version_3_0= ruleEString ) ) )
            // InternalDSL.g:1298:3: otherlv_0= 'set' otherlv_1= 'version' (otherlv_2= 'to' )? ( (lv_version_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSetCircleCIVersionAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getSetCircleCIVersionAccess().getVersionKeyword_1());
            		
            // InternalDSL.g:1306:3: (otherlv_2= 'to' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDSL.g:1307:4: otherlv_2= 'to'
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getSetCircleCIVersionAccess().getToKeyword_2());
                    			

                    }
                    break;

            }

            // InternalDSL.g:1312:3: ( (lv_version_3_0= ruleEString ) )
            // InternalDSL.g:1313:4: (lv_version_3_0= ruleEString )
            {
            // InternalDSL.g:1313:4: (lv_version_3_0= ruleEString )
            // InternalDSL.g:1314:5: lv_version_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSetCircleCIVersionAccess().getVersionEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_version_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetCircleCIVersionRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_3_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
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
    // $ANTLR end "ruleSetCircleCIVersion"


    // $ANTLR start "entryRuleAddExecutor"
    // InternalDSL.g:1335:1: entryRuleAddExecutor returns [EObject current=null] : iv_ruleAddExecutor= ruleAddExecutor EOF ;
    public final EObject entryRuleAddExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExecutor = null;


        try {
            // InternalDSL.g:1335:52: (iv_ruleAddExecutor= ruleAddExecutor EOF )
            // InternalDSL.g:1336:2: iv_ruleAddExecutor= ruleAddExecutor EOF
            {
             newCompositeNode(grammarAccess.getAddExecutorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddExecutor=ruleAddExecutor();

            state._fsp--;

             current =iv_ruleAddExecutor; 
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
    // $ANTLR end "entryRuleAddExecutor"


    // $ANTLR start "ruleAddExecutor"
    // InternalDSL.g:1342:1: ruleAddExecutor returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'executor' this_AddOrbReferenceExecutor_2= ruleAddOrbReferenceExecutor ) ;
    public final EObject ruleAddExecutor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_AddOrbReferenceExecutor_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:1348:2: ( (otherlv_0= 'add' otherlv_1= 'executor' this_AddOrbReferenceExecutor_2= ruleAddOrbReferenceExecutor ) )
            // InternalDSL.g:1349:2: (otherlv_0= 'add' otherlv_1= 'executor' this_AddOrbReferenceExecutor_2= ruleAddOrbReferenceExecutor )
            {
            // InternalDSL.g:1349:2: (otherlv_0= 'add' otherlv_1= 'executor' this_AddOrbReferenceExecutor_2= ruleAddOrbReferenceExecutor )
            // InternalDSL.g:1350:3: otherlv_0= 'add' otherlv_1= 'executor' this_AddOrbReferenceExecutor_2= ruleAddOrbReferenceExecutor
            {
            otherlv_0=(Token)match(input,27,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getAddExecutorAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,44,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAddExecutorAccess().getExecutorKeyword_1());
            		

            			newCompositeNode(grammarAccess.getAddExecutorAccess().getAddOrbReferenceExecutorParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_AddOrbReferenceExecutor_2=ruleAddOrbReferenceExecutor();

            state._fsp--;


            			current = this_AddOrbReferenceExecutor_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleAddExecutor"


    // $ANTLR start "entryRuleAddOrbReferenceExecutor"
    // InternalDSL.g:1370:1: entryRuleAddOrbReferenceExecutor returns [EObject current=null] : iv_ruleAddOrbReferenceExecutor= ruleAddOrbReferenceExecutor EOF ;
    public final EObject entryRuleAddOrbReferenceExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddOrbReferenceExecutor = null;


        try {
            // InternalDSL.g:1370:64: (iv_ruleAddOrbReferenceExecutor= ruleAddOrbReferenceExecutor EOF )
            // InternalDSL.g:1371:2: iv_ruleAddOrbReferenceExecutor= ruleAddOrbReferenceExecutor EOF
            {
             newCompositeNode(grammarAccess.getAddOrbReferenceExecutorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddOrbReferenceExecutor=ruleAddOrbReferenceExecutor();

            state._fsp--;

             current =iv_ruleAddOrbReferenceExecutor; 
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
    // $ANTLR end "entryRuleAddOrbReferenceExecutor"


    // $ANTLR start "ruleAddOrbReferenceExecutor"
    // InternalDSL.g:1377:1: ruleAddOrbReferenceExecutor returns [EObject current=null] : ( ( (lv_executor_0_0= ruleEString ) ) otherlv_1= 'on' ( (lv_jobName_2_0= ruleEString ) ) (otherlv_3= 'from' )? otherlv_4= 'orb' ( (lv_orb_5_0= ruleEString ) ) ) ;
    public final EObject ruleAddOrbReferenceExecutor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_executor_0_0 = null;

        AntlrDatatypeRuleToken lv_jobName_2_0 = null;

        AntlrDatatypeRuleToken lv_orb_5_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1383:2: ( ( ( (lv_executor_0_0= ruleEString ) ) otherlv_1= 'on' ( (lv_jobName_2_0= ruleEString ) ) (otherlv_3= 'from' )? otherlv_4= 'orb' ( (lv_orb_5_0= ruleEString ) ) ) )
            // InternalDSL.g:1384:2: ( ( (lv_executor_0_0= ruleEString ) ) otherlv_1= 'on' ( (lv_jobName_2_0= ruleEString ) ) (otherlv_3= 'from' )? otherlv_4= 'orb' ( (lv_orb_5_0= ruleEString ) ) )
            {
            // InternalDSL.g:1384:2: ( ( (lv_executor_0_0= ruleEString ) ) otherlv_1= 'on' ( (lv_jobName_2_0= ruleEString ) ) (otherlv_3= 'from' )? otherlv_4= 'orb' ( (lv_orb_5_0= ruleEString ) ) )
            // InternalDSL.g:1385:3: ( (lv_executor_0_0= ruleEString ) ) otherlv_1= 'on' ( (lv_jobName_2_0= ruleEString ) ) (otherlv_3= 'from' )? otherlv_4= 'orb' ( (lv_orb_5_0= ruleEString ) )
            {
            // InternalDSL.g:1385:3: ( (lv_executor_0_0= ruleEString ) )
            // InternalDSL.g:1386:4: (lv_executor_0_0= ruleEString )
            {
            // InternalDSL.g:1386:4: (lv_executor_0_0= ruleEString )
            // InternalDSL.g:1387:5: lv_executor_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddOrbReferenceExecutorAccess().getExecutorEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_executor_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddOrbReferenceExecutorRule());
            					}
            					set(
            						current,
            						"executor",
            						lv_executor_0_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAddOrbReferenceExecutorAccess().getOnKeyword_1());
            		
            // InternalDSL.g:1408:3: ( (lv_jobName_2_0= ruleEString ) )
            // InternalDSL.g:1409:4: (lv_jobName_2_0= ruleEString )
            {
            // InternalDSL.g:1409:4: (lv_jobName_2_0= ruleEString )
            // InternalDSL.g:1410:5: lv_jobName_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddOrbReferenceExecutorAccess().getJobNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_37);
            lv_jobName_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddOrbReferenceExecutorRule());
            					}
            					set(
            						current,
            						"jobName",
            						lv_jobName_2_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:1427:3: (otherlv_3= 'from' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDSL.g:1428:4: otherlv_3= 'from'
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_38); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddOrbReferenceExecutorAccess().getFromKeyword_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,46,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getAddOrbReferenceExecutorAccess().getOrbKeyword_4());
            		
            // InternalDSL.g:1437:3: ( (lv_orb_5_0= ruleEString ) )
            // InternalDSL.g:1438:4: (lv_orb_5_0= ruleEString )
            {
            // InternalDSL.g:1438:4: (lv_orb_5_0= ruleEString )
            // InternalDSL.g:1439:5: lv_orb_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddOrbReferenceExecutorAccess().getOrbEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_orb_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddOrbReferenceExecutorRule());
            					}
            					set(
            						current,
            						"orb",
            						lv_orb_5_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
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
    // $ANTLR end "ruleAddOrbReferenceExecutor"


    // $ANTLR start "entryRuleSelectWorkflow"
    // InternalDSL.g:1460:1: entryRuleSelectWorkflow returns [EObject current=null] : iv_ruleSelectWorkflow= ruleSelectWorkflow EOF ;
    public final EObject entryRuleSelectWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectWorkflow = null;


        try {
            // InternalDSL.g:1460:55: (iv_ruleSelectWorkflow= ruleSelectWorkflow EOF )
            // InternalDSL.g:1461:2: iv_ruleSelectWorkflow= ruleSelectWorkflow EOF
            {
             newCompositeNode(grammarAccess.getSelectWorkflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectWorkflow=ruleSelectWorkflow();

            state._fsp--;

             current =iv_ruleSelectWorkflow; 
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
    // $ANTLR end "entryRuleSelectWorkflow"


    // $ANTLR start "ruleSelectWorkflow"
    // InternalDSL.g:1467:1: ruleSelectWorkflow returns [EObject current=null] : (otherlv_0= 'select' otherlv_1= 'workflow' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleSelectWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1473:2: ( (otherlv_0= 'select' otherlv_1= 'workflow' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDSL.g:1474:2: (otherlv_0= 'select' otherlv_1= 'workflow' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDSL.g:1474:2: (otherlv_0= 'select' otherlv_1= 'workflow' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDSL.g:1475:3: otherlv_0= 'select' otherlv_1= 'workflow' ( (lv_name_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectWorkflowAccess().getSelectKeyword_0());
            		
            otherlv_1=(Token)match(input,48,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectWorkflowAccess().getWorkflowKeyword_1());
            		
            // InternalDSL.g:1483:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:1484:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:1484:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:1485:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSelectWorkflowAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectWorkflowRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
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
    // $ANTLR end "ruleSelectWorkflow"


    // $ANTLR start "entryRuleStringToStringMapEntry"
    // InternalDSL.g:1506:1: entryRuleStringToStringMapEntry returns [EObject current=null] : iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF ;
    public final EObject entryRuleStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringToStringMapEntry = null;


        try {
            // InternalDSL.g:1506:63: (iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF )
            // InternalDSL.g:1507:2: iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF
            {
             newCompositeNode(grammarAccess.getStringToStringMapEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringToStringMapEntry=ruleStringToStringMapEntry();

            state._fsp--;

             current =iv_ruleStringToStringMapEntry; 
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
    // $ANTLR end "entryRuleStringToStringMapEntry"


    // $ANTLR start "ruleStringToStringMapEntry"
    // InternalDSL.g:1513:1: ruleStringToStringMapEntry returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= 'to' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1519:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= 'to' ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalDSL.g:1520:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= 'to' ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalDSL.g:1520:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= 'to' ( (lv_value_2_0= ruleEString ) ) )
            // InternalDSL.g:1521:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= 'to' ( (lv_value_2_0= ruleEString ) )
            {
            // InternalDSL.g:1521:3: ( (lv_key_0_0= ruleEString ) )
            // InternalDSL.g:1522:4: (lv_key_0_0= ruleEString )
            {
            // InternalDSL.g:1522:4: (lv_key_0_0= ruleEString )
            // InternalDSL.g:1523:5: lv_key_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getKeyEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_key_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringToStringMapEntryRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getStringToStringMapEntryAccess().getToKeyword_1());
            		
            // InternalDSL.g:1544:3: ( (lv_value_2_0= ruleEString ) )
            // InternalDSL.g:1545:4: (lv_value_2_0= ruleEString )
            {
            // InternalDSL.g:1545:4: (lv_value_2_0= ruleEString )
            // InternalDSL.g:1546:5: lv_value_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getValueEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringToStringMapEntryRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
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
    // $ANTLR end "ruleStringToStringMapEntry"


    // $ANTLR start "entryRuleEString"
    // InternalDSL.g:1567:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDSL.g:1567:47: (iv_ruleEString= ruleEString EOF )
            // InternalDSL.g:1568:2: iv_ruleEString= ruleEString EOF
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
    // InternalDSL.g:1574:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDSL.g:1580:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDSL.g:1581:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDSL.g:1581:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalDSL.g:1582:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:1590:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleMODELS"
    // InternalDSL.g:1601:1: ruleMODELS returns [Enumerator current=null] : ( (enumLiteral_0= 'gha' ) | (enumLiteral_1= 'cicd' ) | (enumLiteral_2= 'circleci' ) ) ;
    public final Enumerator ruleMODELS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDSL.g:1607:2: ( ( (enumLiteral_0= 'gha' ) | (enumLiteral_1= 'cicd' ) | (enumLiteral_2= 'circleci' ) ) )
            // InternalDSL.g:1608:2: ( (enumLiteral_0= 'gha' ) | (enumLiteral_1= 'cicd' ) | (enumLiteral_2= 'circleci' ) )
            {
            // InternalDSL.g:1608:2: ( (enumLiteral_0= 'gha' ) | (enumLiteral_1= 'cicd' ) | (enumLiteral_2= 'circleci' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt28=1;
                }
                break;
            case 50:
                {
                alt28=2;
                }
                break;
            case 42:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalDSL.g:1609:3: (enumLiteral_0= 'gha' )
                    {
                    // InternalDSL.g:1609:3: (enumLiteral_0= 'gha' )
                    // InternalDSL.g:1610:4: enumLiteral_0= 'gha'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getMODELSAccess().getGHAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMODELSAccess().getGHAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1617:3: (enumLiteral_1= 'cicd' )
                    {
                    // InternalDSL.g:1617:3: (enumLiteral_1= 'cicd' )
                    // InternalDSL.g:1618:4: enumLiteral_1= 'cicd'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getMODELSAccess().getCICDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMODELSAccess().getCICDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1625:3: (enumLiteral_2= 'circleci' )
                    {
                    // InternalDSL.g:1625:3: (enumLiteral_2= 'circleci' )
                    // InternalDSL.g:1626:4: enumLiteral_2= 'circleci'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getMODELSAccess().getCircleCIEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMODELSAccess().getCircleCIEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleMODELS"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000A4000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000149124000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0006040000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000006400004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004400004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800009000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000060L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});

}