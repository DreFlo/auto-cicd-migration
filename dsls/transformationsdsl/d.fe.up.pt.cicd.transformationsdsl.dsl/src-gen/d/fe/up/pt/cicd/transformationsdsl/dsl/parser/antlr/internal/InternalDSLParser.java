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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'before'", "'transformation'", "'{'", "'}'", "'during'", "'after'", "'run'", "'ATL'", "'on'", "'change'", "'plugin'", "'version'", "'args'", "','", "'label'", "'set'", "'labels'", "'when'", "'to'", "'->'", "'CircleCI'", "'circleci'", "'GHA'", "'gha'", "'github'", "'CICD'", "'cicd'", "'TIM'", "'tim'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    // InternalDSL.g:72:1: ruleTransformationSet returns [EObject current=null] : ( () (otherlv_1= 'before' (otherlv_2= 'transformation' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )? (otherlv_6= 'during' (otherlv_7= 'transformation' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )? (otherlv_11= 'after' (otherlv_12= 'transformation' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )? ) ;
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
            // InternalDSL.g:78:2: ( ( () (otherlv_1= 'before' (otherlv_2= 'transformation' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )? (otherlv_6= 'during' (otherlv_7= 'transformation' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )? (otherlv_11= 'after' (otherlv_12= 'transformation' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )? ) )
            // InternalDSL.g:79:2: ( () (otherlv_1= 'before' (otherlv_2= 'transformation' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )? (otherlv_6= 'during' (otherlv_7= 'transformation' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )? (otherlv_11= 'after' (otherlv_12= 'transformation' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )? )
            {
            // InternalDSL.g:79:2: ( () (otherlv_1= 'before' (otherlv_2= 'transformation' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )? (otherlv_6= 'during' (otherlv_7= 'transformation' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )? (otherlv_11= 'after' (otherlv_12= 'transformation' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )? )
            // InternalDSL.g:80:3: () (otherlv_1= 'before' (otherlv_2= 'transformation' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )? (otherlv_6= 'during' (otherlv_7= 'transformation' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )? (otherlv_11= 'after' (otherlv_12= 'transformation' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )?
            {
            // InternalDSL.g:80:3: ()
            // InternalDSL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransformationSetAccess().getTransformationSetAction_0(),
            					current);
            			

            }

            // InternalDSL.g:87:3: (otherlv_1= 'before' (otherlv_2= 'transformation' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:88:4: otherlv_1= 'before' (otherlv_2= 'transformation' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getTransformationSetAccess().getBeforeKeyword_1_0());
                    			
                    // InternalDSL.g:92:4: (otherlv_2= 'transformation' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==12) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalDSL.g:93:5: otherlv_2= 'transformation'
                            {
                            otherlv_2=(Token)match(input,12,FOLLOW_4); 

                            					newLeafNode(otherlv_2, grammarAccess.getTransformationSetAccess().getTransformationKeyword_1_1());
                            				

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

            // InternalDSL.g:126:3: (otherlv_6= 'during' (otherlv_7= 'transformation' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:127:4: otherlv_6= 'during' (otherlv_7= 'transformation' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransformationSetAccess().getDuringKeyword_2_0());
                    			
                    // InternalDSL.g:131:4: (otherlv_7= 'transformation' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==12) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalDSL.g:132:5: otherlv_7= 'transformation'
                            {
                            otherlv_7=(Token)match(input,12,FOLLOW_4); 

                            					newLeafNode(otherlv_7, grammarAccess.getTransformationSetAccess().getTransformationKeyword_2_1());
                            				

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

                        if ( (LA5_0==17||LA5_0==20||LA5_0==26) ) {
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

            // InternalDSL.g:165:3: (otherlv_11= 'after' (otherlv_12= 'transformation' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDSL.g:166:4: otherlv_11= 'after' (otherlv_12= 'transformation' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}'
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getTransformationSetAccess().getAfterKeyword_3_0());
                    			
                    // InternalDSL.g:170:4: (otherlv_12= 'transformation' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==12) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalDSL.g:171:5: otherlv_12= 'transformation'
                            {
                            otherlv_12=(Token)match(input,12,FOLLOW_4); 

                            					newLeafNode(otherlv_12, grammarAccess.getTransformationSetAccess().getTransformationKeyword_3_1());
                            				

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
    // InternalDSL.g:330:1: ruleTIMTransformation returns [EObject current=null] : (this_ATLScript_0= ruleATLScript | this_ChangePlugin_1= ruleChangePlugin | this_ChangeAgentLabel_2= ruleChangeAgentLabel | this_ReplaceAgentLabels_3= ruleReplaceAgentLabels ) ;
    public final EObject ruleTIMTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_ATLScript_0 = null;

        EObject this_ChangePlugin_1 = null;

        EObject this_ChangeAgentLabel_2 = null;

        EObject this_ReplaceAgentLabels_3 = null;



        	enterRule();

        try {
            // InternalDSL.g:336:2: ( (this_ATLScript_0= ruleATLScript | this_ChangePlugin_1= ruleChangePlugin | this_ChangeAgentLabel_2= ruleChangeAgentLabel | this_ReplaceAgentLabels_3= ruleReplaceAgentLabels ) )
            // InternalDSL.g:337:2: (this_ATLScript_0= ruleATLScript | this_ChangePlugin_1= ruleChangePlugin | this_ChangeAgentLabel_2= ruleChangeAgentLabel | this_ReplaceAgentLabels_3= ruleReplaceAgentLabels )
            {
            // InternalDSL.g:337:2: (this_ATLScript_0= ruleATLScript | this_ChangePlugin_1= ruleChangePlugin | this_ChangeAgentLabel_2= ruleChangeAgentLabel | this_ReplaceAgentLabels_3= ruleReplaceAgentLabels )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt12=1;
                }
                break;
            case 20:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==25) ) {
                    alt12=3;
                }
                else if ( (LA12_2==21) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt12=4;
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
                    // InternalDSL.g:356:3: this_ChangeAgentLabel_2= ruleChangeAgentLabel
                    {

                    			newCompositeNode(grammarAccess.getTIMTransformationAccess().getChangeAgentLabelParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeAgentLabel_2=ruleChangeAgentLabel();

                    state._fsp--;


                    			current = this_ChangeAgentLabel_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDSL.g:365:3: this_ReplaceAgentLabels_3= ruleReplaceAgentLabels
                    {

                    			newCompositeNode(grammarAccess.getTIMTransformationAccess().getReplaceAgentLabelsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReplaceAgentLabels_3=ruleReplaceAgentLabels();

                    state._fsp--;


                    			current = this_ReplaceAgentLabels_3;
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
    // InternalDSL.g:377:1: entryRuleChangePlugin returns [EObject current=null] : iv_ruleChangePlugin= ruleChangePlugin EOF ;
    public final EObject entryRuleChangePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangePlugin = null;


        try {
            // InternalDSL.g:377:53: (iv_ruleChangePlugin= ruleChangePlugin EOF )
            // InternalDSL.g:378:2: iv_ruleChangePlugin= ruleChangePlugin EOF
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
    // InternalDSL.g:384:1: ruleChangePlugin returns [EObject current=null] : (otherlv_0= 'change' otherlv_1= 'plugin' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= ',' ( (lv_args_9_0= ruleStringToStringMapEntry ) ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleChangePlugin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_version_4_0 = null;

        EObject lv_args_7_0 = null;

        EObject lv_args_9_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:390:2: ( (otherlv_0= 'change' otherlv_1= 'plugin' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= ',' ( (lv_args_9_0= ruleStringToStringMapEntry ) ) )* otherlv_10= '}' )? ) )
            // InternalDSL.g:391:2: (otherlv_0= 'change' otherlv_1= 'plugin' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= ',' ( (lv_args_9_0= ruleStringToStringMapEntry ) ) )* otherlv_10= '}' )? )
            {
            // InternalDSL.g:391:2: (otherlv_0= 'change' otherlv_1= 'plugin' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= ',' ( (lv_args_9_0= ruleStringToStringMapEntry ) ) )* otherlv_10= '}' )? )
            // InternalDSL.g:392:3: otherlv_0= 'change' otherlv_1= 'plugin' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= ',' ( (lv_args_9_0= ruleStringToStringMapEntry ) ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getChangePluginAccess().getChangeKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getChangePluginAccess().getPluginKeyword_1());
            		
            // InternalDSL.g:400:3: ( (lv_name_2_0= ruleStringToStringMapEntry ) )
            // InternalDSL.g:401:4: (lv_name_2_0= ruleStringToStringMapEntry )
            {
            // InternalDSL.g:401:4: (lv_name_2_0= ruleStringToStringMapEntry )
            // InternalDSL.g:402:5: lv_name_2_0= ruleStringToStringMapEntry
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
            		
            // InternalDSL.g:423:3: ( (lv_version_4_0= ruleEString ) )
            // InternalDSL.g:424:4: (lv_version_4_0= ruleEString )
            {
            // InternalDSL.g:424:4: (lv_version_4_0= ruleEString )
            // InternalDSL.g:425:5: lv_version_4_0= ruleEString
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

            // InternalDSL.g:442:3: (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= ',' ( (lv_args_9_0= ruleStringToStringMapEntry ) ) )* otherlv_10= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDSL.g:443:4: otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= ',' ( (lv_args_9_0= ruleStringToStringMapEntry ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getChangePluginAccess().getArgsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getChangePluginAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDSL.g:451:4: ( (lv_args_7_0= ruleStringToStringMapEntry ) )
                    // InternalDSL.g:452:5: (lv_args_7_0= ruleStringToStringMapEntry )
                    {
                    // InternalDSL.g:452:5: (lv_args_7_0= ruleStringToStringMapEntry )
                    // InternalDSL.g:453:6: lv_args_7_0= ruleStringToStringMapEntry
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

                    // InternalDSL.g:470:4: (otherlv_8= ',' ( (lv_args_9_0= ruleStringToStringMapEntry ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==24) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDSL.g:471:5: otherlv_8= ',' ( (lv_args_9_0= ruleStringToStringMapEntry ) )
                    	    {
                    	    otherlv_8=(Token)match(input,24,FOLLOW_11); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getChangePluginAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDSL.g:475:5: ( (lv_args_9_0= ruleStringToStringMapEntry ) )
                    	    // InternalDSL.g:476:6: (lv_args_9_0= ruleStringToStringMapEntry )
                    	    {
                    	    // InternalDSL.g:476:6: (lv_args_9_0= ruleStringToStringMapEntry )
                    	    // InternalDSL.g:477:7: lv_args_9_0= ruleStringToStringMapEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getChangePluginAccess().getArgsStringToStringMapEntryParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_args_9_0=ruleStringToStringMapEntry();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChangePluginRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_9_0,
                    	    								"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringToStringMapEntry");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getChangePluginAccess().getRightCurlyBracketKeyword_5_4());
                    			

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


    // $ANTLR start "entryRuleChangeAgentLabel"
    // InternalDSL.g:504:1: entryRuleChangeAgentLabel returns [EObject current=null] : iv_ruleChangeAgentLabel= ruleChangeAgentLabel EOF ;
    public final EObject entryRuleChangeAgentLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeAgentLabel = null;


        try {
            // InternalDSL.g:504:57: (iv_ruleChangeAgentLabel= ruleChangeAgentLabel EOF )
            // InternalDSL.g:505:2: iv_ruleChangeAgentLabel= ruleChangeAgentLabel EOF
            {
             newCompositeNode(grammarAccess.getChangeAgentLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeAgentLabel=ruleChangeAgentLabel();

            state._fsp--;

             current =iv_ruleChangeAgentLabel; 
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
    // $ANTLR end "entryRuleChangeAgentLabel"


    // $ANTLR start "ruleChangeAgentLabel"
    // InternalDSL.g:511:1: ruleChangeAgentLabel returns [EObject current=null] : (otherlv_0= 'change' otherlv_1= 'label' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) ) ;
    public final EObject ruleChangeAgentLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:517:2: ( (otherlv_0= 'change' otherlv_1= 'label' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) ) )
            // InternalDSL.g:518:2: (otherlv_0= 'change' otherlv_1= 'label' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) )
            {
            // InternalDSL.g:518:2: (otherlv_0= 'change' otherlv_1= 'label' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) )
            // InternalDSL.g:519:3: otherlv_0= 'change' otherlv_1= 'label' ( (lv_name_2_0= ruleStringToStringMapEntry ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeAgentLabelAccess().getChangeKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeAgentLabelAccess().getLabelKeyword_1());
            		
            // InternalDSL.g:527:3: ( (lv_name_2_0= ruleStringToStringMapEntry ) )
            // InternalDSL.g:528:4: (lv_name_2_0= ruleStringToStringMapEntry )
            {
            // InternalDSL.g:528:4: (lv_name_2_0= ruleStringToStringMapEntry )
            // InternalDSL.g:529:5: lv_name_2_0= ruleStringToStringMapEntry
            {

            					newCompositeNode(grammarAccess.getChangeAgentLabelAccess().getNameStringToStringMapEntryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleStringToStringMapEntry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeAgentLabelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringToStringMapEntry");
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
    // $ANTLR end "ruleChangeAgentLabel"


    // $ANTLR start "entryRuleReplaceAgentLabels"
    // InternalDSL.g:550:1: entryRuleReplaceAgentLabels returns [EObject current=null] : iv_ruleReplaceAgentLabels= ruleReplaceAgentLabels EOF ;
    public final EObject entryRuleReplaceAgentLabels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplaceAgentLabels = null;


        try {
            // InternalDSL.g:550:59: (iv_ruleReplaceAgentLabels= ruleReplaceAgentLabels EOF )
            // InternalDSL.g:551:2: iv_ruleReplaceAgentLabels= ruleReplaceAgentLabels EOF
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
    // InternalDSL.g:557:1: ruleReplaceAgentLabels returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'labels' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= '{' ( (lv_labels_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_labels_7_0= ruleEString ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleReplaceAgentLabels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_condition_3_0 = null;

        AntlrDatatypeRuleToken lv_labels_5_0 = null;

        AntlrDatatypeRuleToken lv_labels_7_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:563:2: ( (otherlv_0= 'set' otherlv_1= 'labels' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= '{' ( (lv_labels_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_labels_7_0= ruleEString ) ) )* otherlv_8= '}' ) )
            // InternalDSL.g:564:2: (otherlv_0= 'set' otherlv_1= 'labels' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= '{' ( (lv_labels_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_labels_7_0= ruleEString ) ) )* otherlv_8= '}' )
            {
            // InternalDSL.g:564:2: (otherlv_0= 'set' otherlv_1= 'labels' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= '{' ( (lv_labels_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_labels_7_0= ruleEString ) ) )* otherlv_8= '}' )
            // InternalDSL.g:565:3: otherlv_0= 'set' otherlv_1= 'labels' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= '{' ( (lv_labels_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_labels_7_0= ruleEString ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getReplaceAgentLabelsAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getReplaceAgentLabelsAccess().getLabelsKeyword_1());
            		
            // InternalDSL.g:573:3: (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDSL.g:574:4: otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getReplaceAgentLabelsAccess().getWhenKeyword_2_0());
                    			
                    // InternalDSL.g:578:4: ( (lv_condition_3_0= ruleEString ) )
                    // InternalDSL.g:579:5: (lv_condition_3_0= ruleEString )
                    {
                    // InternalDSL.g:579:5: (lv_condition_3_0= ruleEString )
                    // InternalDSL.g:580:6: lv_condition_3_0= ruleEString
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
            		
            // InternalDSL.g:602:3: ( (lv_labels_5_0= ruleEString ) )
            // InternalDSL.g:603:4: (lv_labels_5_0= ruleEString )
            {
            // InternalDSL.g:603:4: (lv_labels_5_0= ruleEString )
            // InternalDSL.g:604:5: lv_labels_5_0= ruleEString
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

            // InternalDSL.g:621:3: (otherlv_6= ',' ( (lv_labels_7_0= ruleEString ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDSL.g:622:4: otherlv_6= ',' ( (lv_labels_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,24,FOLLOW_11); 

            	    				newLeafNode(otherlv_6, grammarAccess.getReplaceAgentLabelsAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDSL.g:626:4: ( (lv_labels_7_0= ruleEString ) )
            	    // InternalDSL.g:627:5: (lv_labels_7_0= ruleEString )
            	    {
            	    // InternalDSL.g:627:5: (lv_labels_7_0= ruleEString )
            	    // InternalDSL.g:628:6: lv_labels_7_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getReplaceAgentLabelsAccess().getLabelsEStringParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_labels_7_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getReplaceAgentLabelsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_7_0,
            	    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getReplaceAgentLabelsAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleCircleCITransformation"
    // InternalDSL.g:654:1: entryRuleCircleCITransformation returns [EObject current=null] : iv_ruleCircleCITransformation= ruleCircleCITransformation EOF ;
    public final EObject entryRuleCircleCITransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCircleCITransformation = null;


        try {
            // InternalDSL.g:654:63: (iv_ruleCircleCITransformation= ruleCircleCITransformation EOF )
            // InternalDSL.g:655:2: iv_ruleCircleCITransformation= ruleCircleCITransformation EOF
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
    // InternalDSL.g:661:1: ruleCircleCITransformation returns [EObject current=null] : (otherlv_0= 'on' ruleCIRCLE_CI this_SetCircleCIVersion_2= ruleSetCircleCIVersion ) ;
    public final EObject ruleCircleCITransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_SetCircleCIVersion_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:667:2: ( (otherlv_0= 'on' ruleCIRCLE_CI this_SetCircleCIVersion_2= ruleSetCircleCIVersion ) )
            // InternalDSL.g:668:2: (otherlv_0= 'on' ruleCIRCLE_CI this_SetCircleCIVersion_2= ruleSetCircleCIVersion )
            {
            // InternalDSL.g:668:2: (otherlv_0= 'on' ruleCIRCLE_CI this_SetCircleCIVersion_2= ruleSetCircleCIVersion )
            // InternalDSL.g:669:3: otherlv_0= 'on' ruleCIRCLE_CI this_SetCircleCIVersion_2= ruleSetCircleCIVersion
            {
            otherlv_0=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getCircleCITransformationAccess().getOnKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCircleCITransformationAccess().getCIRCLE_CIParserRuleCall_1());
            		
            pushFollow(FOLLOW_21);
            ruleCIRCLE_CI();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getCircleCITransformationAccess().getSetCircleCIVersionParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_SetCircleCIVersion_2=ruleSetCircleCIVersion();

            state._fsp--;


            			current = this_SetCircleCIVersion_2;
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
    // $ANTLR end "ruleCircleCITransformation"


    // $ANTLR start "entryRuleSetCircleCIVersion"
    // InternalDSL.g:692:1: entryRuleSetCircleCIVersion returns [EObject current=null] : iv_ruleSetCircleCIVersion= ruleSetCircleCIVersion EOF ;
    public final EObject entryRuleSetCircleCIVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetCircleCIVersion = null;


        try {
            // InternalDSL.g:692:59: (iv_ruleSetCircleCIVersion= ruleSetCircleCIVersion EOF )
            // InternalDSL.g:693:2: iv_ruleSetCircleCIVersion= ruleSetCircleCIVersion EOF
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
    // InternalDSL.g:699:1: ruleSetCircleCIVersion returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'version' (otherlv_2= 'to' )? ( (lv_version_3_0= ruleEString ) ) ) ;
    public final EObject ruleSetCircleCIVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_version_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:705:2: ( (otherlv_0= 'set' otherlv_1= 'version' (otherlv_2= 'to' )? ( (lv_version_3_0= ruleEString ) ) ) )
            // InternalDSL.g:706:2: (otherlv_0= 'set' otherlv_1= 'version' (otherlv_2= 'to' )? ( (lv_version_3_0= ruleEString ) ) )
            {
            // InternalDSL.g:706:2: (otherlv_0= 'set' otherlv_1= 'version' (otherlv_2= 'to' )? ( (lv_version_3_0= ruleEString ) ) )
            // InternalDSL.g:707:3: otherlv_0= 'set' otherlv_1= 'version' (otherlv_2= 'to' )? ( (lv_version_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSetCircleCIVersionAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getSetCircleCIVersionAccess().getVersionKeyword_1());
            		
            // InternalDSL.g:715:3: (otherlv_2= 'to' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDSL.g:716:4: otherlv_2= 'to'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getSetCircleCIVersionAccess().getToKeyword_2());
                    			

                    }
                    break;

            }

            // InternalDSL.g:721:3: ( (lv_version_3_0= ruleEString ) )
            // InternalDSL.g:722:4: (lv_version_3_0= ruleEString )
            {
            // InternalDSL.g:722:4: (lv_version_3_0= ruleEString )
            // InternalDSL.g:723:5: lv_version_3_0= ruleEString
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


    // $ANTLR start "entryRuleStringToStringMapEntry"
    // InternalDSL.g:744:1: entryRuleStringToStringMapEntry returns [EObject current=null] : iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF ;
    public final EObject entryRuleStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringToStringMapEntry = null;


        try {
            // InternalDSL.g:744:63: (iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF )
            // InternalDSL.g:745:2: iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF
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
    // InternalDSL.g:751:1: ruleStringToStringMapEntry returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= '->' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:757:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= '->' ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalDSL.g:758:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= '->' ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalDSL.g:758:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= '->' ( (lv_value_2_0= ruleEString ) ) )
            // InternalDSL.g:759:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= '->' ( (lv_value_2_0= ruleEString ) )
            {
            // InternalDSL.g:759:3: ( (lv_key_0_0= ruleEString ) )
            // InternalDSL.g:760:4: (lv_key_0_0= ruleEString )
            {
            // InternalDSL.g:760:4: (lv_key_0_0= ruleEString )
            // InternalDSL.g:761:5: lv_key_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getKeyEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_1=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getStringToStringMapEntryAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalDSL.g:782:3: ( (lv_value_2_0= ruleEString ) )
            // InternalDSL.g:783:4: (lv_value_2_0= ruleEString )
            {
            // InternalDSL.g:783:4: (lv_value_2_0= ruleEString )
            // InternalDSL.g:784:5: lv_value_2_0= ruleEString
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


    // $ANTLR start "entryRuleCIRCLE_CI"
    // InternalDSL.g:805:1: entryRuleCIRCLE_CI returns [String current=null] : iv_ruleCIRCLE_CI= ruleCIRCLE_CI EOF ;
    public final String entryRuleCIRCLE_CI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCIRCLE_CI = null;


        try {
            // InternalDSL.g:805:49: (iv_ruleCIRCLE_CI= ruleCIRCLE_CI EOF )
            // InternalDSL.g:806:2: iv_ruleCIRCLE_CI= ruleCIRCLE_CI EOF
            {
             newCompositeNode(grammarAccess.getCIRCLE_CIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCIRCLE_CI=ruleCIRCLE_CI();

            state._fsp--;

             current =iv_ruleCIRCLE_CI.getText(); 
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
    // $ANTLR end "entryRuleCIRCLE_CI"


    // $ANTLR start "ruleCIRCLE_CI"
    // InternalDSL.g:812:1: ruleCIRCLE_CI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'CircleCI' | kw= 'circleci' ) ;
    public final AntlrDatatypeRuleToken ruleCIRCLE_CI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDSL.g:818:2: ( (kw= 'CircleCI' | kw= 'circleci' ) )
            // InternalDSL.g:819:2: (kw= 'CircleCI' | kw= 'circleci' )
            {
            // InternalDSL.g:819:2: (kw= 'CircleCI' | kw= 'circleci' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            else if ( (LA18_0==32) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalDSL.g:820:3: kw= 'CircleCI'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIRCLE_CIAccess().getCircleCIKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:826:3: kw= 'circleci'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIRCLE_CIAccess().getCircleciKeyword_1());
                    		

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
    // $ANTLR end "ruleCIRCLE_CI"


    // $ANTLR start "entryRuleEString"
    // InternalDSL.g:835:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDSL.g:835:47: (iv_ruleEString= ruleEString EOF )
            // InternalDSL.g:836:2: iv_ruleEString= ruleEString EOF
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
    // InternalDSL.g:842:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDSL.g:848:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDSL.g:849:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDSL.g:849:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalDSL.g:850:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:858:3: this_ID_1= RULE_ID
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
    // InternalDSL.g:869:1: ruleMODELS returns [Enumerator current=null] : ( (enumLiteral_0= 'GHA' ) | (enumLiteral_1= 'gha' ) | (enumLiteral_2= 'github' ) | (enumLiteral_3= 'CICD' ) | (enumLiteral_4= 'cicd' ) | (enumLiteral_5= 'TIM' ) | (enumLiteral_6= 'tim' ) | (enumLiteral_7= 'CircleCI' ) | (enumLiteral_8= 'circleci' ) ) ;
    public final Enumerator ruleMODELS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalDSL.g:875:2: ( ( (enumLiteral_0= 'GHA' ) | (enumLiteral_1= 'gha' ) | (enumLiteral_2= 'github' ) | (enumLiteral_3= 'CICD' ) | (enumLiteral_4= 'cicd' ) | (enumLiteral_5= 'TIM' ) | (enumLiteral_6= 'tim' ) | (enumLiteral_7= 'CircleCI' ) | (enumLiteral_8= 'circleci' ) ) )
            // InternalDSL.g:876:2: ( (enumLiteral_0= 'GHA' ) | (enumLiteral_1= 'gha' ) | (enumLiteral_2= 'github' ) | (enumLiteral_3= 'CICD' ) | (enumLiteral_4= 'cicd' ) | (enumLiteral_5= 'TIM' ) | (enumLiteral_6= 'tim' ) | (enumLiteral_7= 'CircleCI' ) | (enumLiteral_8= 'circleci' ) )
            {
            // InternalDSL.g:876:2: ( (enumLiteral_0= 'GHA' ) | (enumLiteral_1= 'gha' ) | (enumLiteral_2= 'github' ) | (enumLiteral_3= 'CICD' ) | (enumLiteral_4= 'cicd' ) | (enumLiteral_5= 'TIM' ) | (enumLiteral_6= 'tim' ) | (enumLiteral_7= 'CircleCI' ) | (enumLiteral_8= 'circleci' ) )
            int alt20=9;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt20=1;
                }
                break;
            case 34:
                {
                alt20=2;
                }
                break;
            case 35:
                {
                alt20=3;
                }
                break;
            case 36:
                {
                alt20=4;
                }
                break;
            case 37:
                {
                alt20=5;
                }
                break;
            case 38:
                {
                alt20=6;
                }
                break;
            case 39:
                {
                alt20=7;
                }
                break;
            case 31:
                {
                alt20=8;
                }
                break;
            case 32:
                {
                alt20=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalDSL.g:877:3: (enumLiteral_0= 'GHA' )
                    {
                    // InternalDSL.g:877:3: (enumLiteral_0= 'GHA' )
                    // InternalDSL.g:878:4: enumLiteral_0= 'GHA'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getMODELSAccess().getGHAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMODELSAccess().getGHAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:885:3: (enumLiteral_1= 'gha' )
                    {
                    // InternalDSL.g:885:3: (enumLiteral_1= 'gha' )
                    // InternalDSL.g:886:4: enumLiteral_1= 'gha'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getMODELSAccess().getGHAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMODELSAccess().getGHAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:893:3: (enumLiteral_2= 'github' )
                    {
                    // InternalDSL.g:893:3: (enumLiteral_2= 'github' )
                    // InternalDSL.g:894:4: enumLiteral_2= 'github'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getMODELSAccess().getGHAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMODELSAccess().getGHAEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:901:3: (enumLiteral_3= 'CICD' )
                    {
                    // InternalDSL.g:901:3: (enumLiteral_3= 'CICD' )
                    // InternalDSL.g:902:4: enumLiteral_3= 'CICD'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getMODELSAccess().getCICDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMODELSAccess().getCICDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:909:3: (enumLiteral_4= 'cicd' )
                    {
                    // InternalDSL.g:909:3: (enumLiteral_4= 'cicd' )
                    // InternalDSL.g:910:4: enumLiteral_4= 'cicd'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getMODELSAccess().getCICDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMODELSAccess().getCICDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:917:3: (enumLiteral_5= 'TIM' )
                    {
                    // InternalDSL.g:917:3: (enumLiteral_5= 'TIM' )
                    // InternalDSL.g:918:4: enumLiteral_5= 'TIM'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getMODELSAccess().getCICDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMODELSAccess().getCICDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:925:3: (enumLiteral_6= 'tim' )
                    {
                    // InternalDSL.g:925:3: (enumLiteral_6= 'tim' )
                    // InternalDSL.g:926:4: enumLiteral_6= 'tim'
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getMODELSAccess().getCICDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMODELSAccess().getCICDEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDSL.g:933:3: (enumLiteral_7= 'CircleCI' )
                    {
                    // InternalDSL.g:933:3: (enumLiteral_7= 'CircleCI' )
                    // InternalDSL.g:934:4: enumLiteral_7= 'CircleCI'
                    {
                    enumLiteral_7=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getMODELSAccess().getCircleCIEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getMODELSAccess().getCircleCIEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDSL.g:941:3: (enumLiteral_8= 'circleci' )
                    {
                    // InternalDSL.g:941:3: (enumLiteral_8= 'circleci' )
                    // InternalDSL.g:942:4: enumLiteral_8= 'circleci'
                    {
                    enumLiteral_8=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getMODELSAccess().getCircleCIEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getMODELSAccess().getCircleCIEnumLiteralDeclaration_8());
                    			

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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004124000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000FF80080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});

}