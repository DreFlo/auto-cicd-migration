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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'before'", "'translating'", "'{'", "'}'", "'while'", "'after'", "'run'", "'atl'", "'on'", "'set'", "'container'", "'image'", "'when'", "'to'", "'add'", "'ports'", "','", "'options'", "'change'", "'plugin'", "'version'", "'args'", "'labels'", "'trigger'", "'manual'", "'delete'", "'step'", "'insert'", "'with'", "'replace'", "'conditional'", "'if'", "'then'", "'else'", "'command'", "'script'", "'name'", "'checkout'", "'path'", "'environment'", "'='", "'circleci'", "'executor'", "'from'", "'orb'", "'select'", "'workflow'", "'gha'", "'cicd'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    // InternalDSL.g:72:1: ruleTransformationSet returns [EObject current=null] : ( () (otherlv_1= 'before' (otherlv_2= 'translating' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )? (otherlv_6= 'while' (otherlv_7= 'translating' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )? (otherlv_11= 'after' (otherlv_12= 'translating' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )? ) ;
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
            // InternalDSL.g:78:2: ( ( () (otherlv_1= 'before' (otherlv_2= 'translating' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )? (otherlv_6= 'while' (otherlv_7= 'translating' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )? (otherlv_11= 'after' (otherlv_12= 'translating' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )? ) )
            // InternalDSL.g:79:2: ( () (otherlv_1= 'before' (otherlv_2= 'translating' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )? (otherlv_6= 'while' (otherlv_7= 'translating' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )? (otherlv_11= 'after' (otherlv_12= 'translating' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )? )
            {
            // InternalDSL.g:79:2: ( () (otherlv_1= 'before' (otherlv_2= 'translating' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )? (otherlv_6= 'while' (otherlv_7= 'translating' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )? (otherlv_11= 'after' (otherlv_12= 'translating' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )? )
            // InternalDSL.g:80:3: () (otherlv_1= 'before' (otherlv_2= 'translating' )? otherlv_3= '{' ( (lv_preTIM_4_0= ruleTSMTransformation ) )* otherlv_5= '}' )? (otherlv_6= 'while' (otherlv_7= 'translating' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )? (otherlv_11= 'after' (otherlv_12= 'translating' )? otherlv_13= '{' ( (lv_postTIM_14_0= ruleTSMTransformation ) )* otherlv_15= '}' )?
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

            // InternalDSL.g:126:3: (otherlv_6= 'while' (otherlv_7= 'translating' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:127:4: otherlv_6= 'while' (otherlv_7= 'translating' )? otherlv_8= '{' ( (lv_onTIM_9_0= ruleTIMTransformation ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransformationSetAccess().getWhileKeyword_2_0());
                    			
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

                        if ( (LA5_0==17||LA5_0==20||LA5_0==25||LA5_0==29||LA5_0==36||LA5_0==38||LA5_0==40) ) {
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
    // InternalDSL.g:251:1: ruleATLScript returns [EObject current=null] : (otherlv_0= 'run' otherlv_1= 'atl' (otherlv_2= 'on' )? ( (lv_model_3_0= ruleMODELS ) ) otherlv_4= '{' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalDSL.g:257:2: ( (otherlv_0= 'run' otherlv_1= 'atl' (otherlv_2= 'on' )? ( (lv_model_3_0= ruleMODELS ) ) otherlv_4= '{' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // InternalDSL.g:258:2: (otherlv_0= 'run' otherlv_1= 'atl' (otherlv_2= 'on' )? ( (lv_model_3_0= ruleMODELS ) ) otherlv_4= '{' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // InternalDSL.g:258:2: (otherlv_0= 'run' otherlv_1= 'atl' (otherlv_2= 'on' )? ( (lv_model_3_0= ruleMODELS ) ) otherlv_4= '{' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}' )
            // InternalDSL.g:259:3: otherlv_0= 'run' otherlv_1= 'atl' (otherlv_2= 'on' )? ( (lv_model_3_0= ruleMODELS ) ) otherlv_4= '{' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getATLScriptAccess().getRunKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getATLScriptAccess().getAtlKeyword_1());
            		
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
    // InternalDSL.g:330:1: ruleTIMTransformation returns [EObject current=null] : (this_ATLScript_0= ruleATLScript | this_ChangePlugin_1= ruleChangePlugin | this_ReplaceAgentLabels_2= ruleReplaceAgentLabels | this_AddTrigger_3= ruleAddTrigger | this_ReplaceStep_4= ruleReplaceStep | this_DeleteStep_5= ruleDeleteStep | this_AddStep_6= ruleAddStep | this_AddPorts_7= ruleAddPorts | this_SetOptions_8= ruleSetOptions | this_SetImage_9= ruleSetImage ) ;
    public final EObject ruleTIMTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_ATLScript_0 = null;

        EObject this_ChangePlugin_1 = null;

        EObject this_ReplaceAgentLabels_2 = null;

        EObject this_AddTrigger_3 = null;

        EObject this_ReplaceStep_4 = null;

        EObject this_DeleteStep_5 = null;

        EObject this_AddStep_6 = null;

        EObject this_AddPorts_7 = null;

        EObject this_SetOptions_8 = null;

        EObject this_SetImage_9 = null;



        	enterRule();

        try {
            // InternalDSL.g:336:2: ( (this_ATLScript_0= ruleATLScript | this_ChangePlugin_1= ruleChangePlugin | this_ReplaceAgentLabels_2= ruleReplaceAgentLabels | this_AddTrigger_3= ruleAddTrigger | this_ReplaceStep_4= ruleReplaceStep | this_DeleteStep_5= ruleDeleteStep | this_AddStep_6= ruleAddStep | this_AddPorts_7= ruleAddPorts | this_SetOptions_8= ruleSetOptions | this_SetImage_9= ruleSetImage ) )
            // InternalDSL.g:337:2: (this_ATLScript_0= ruleATLScript | this_ChangePlugin_1= ruleChangePlugin | this_ReplaceAgentLabels_2= ruleReplaceAgentLabels | this_AddTrigger_3= ruleAddTrigger | this_ReplaceStep_4= ruleReplaceStep | this_DeleteStep_5= ruleDeleteStep | this_AddStep_6= ruleAddStep | this_AddPorts_7= ruleAddPorts | this_SetOptions_8= ruleSetOptions | this_SetImage_9= ruleSetImage )
            {
            // InternalDSL.g:337:2: (this_ATLScript_0= ruleATLScript | this_ChangePlugin_1= ruleChangePlugin | this_ReplaceAgentLabels_2= ruleReplaceAgentLabels | this_AddTrigger_3= ruleAddTrigger | this_ReplaceStep_4= ruleReplaceStep | this_DeleteStep_5= ruleDeleteStep | this_AddStep_6= ruleAddStep | this_AddPorts_7= ruleAddPorts | this_SetOptions_8= ruleSetOptions | this_SetImage_9= ruleSetImage )
            int alt12=10;
            alt12 = dfa12.predict(input);
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
                case 7 :
                    // InternalDSL.g:392:3: this_AddStep_6= ruleAddStep
                    {

                    			newCompositeNode(grammarAccess.getTIMTransformationAccess().getAddStepParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddStep_6=ruleAddStep();

                    state._fsp--;


                    			current = this_AddStep_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDSL.g:401:3: this_AddPorts_7= ruleAddPorts
                    {

                    			newCompositeNode(grammarAccess.getTIMTransformationAccess().getAddPortsParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddPorts_7=ruleAddPorts();

                    state._fsp--;


                    			current = this_AddPorts_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDSL.g:410:3: this_SetOptions_8= ruleSetOptions
                    {

                    			newCompositeNode(grammarAccess.getTIMTransformationAccess().getSetOptionsParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetOptions_8=ruleSetOptions();

                    state._fsp--;


                    			current = this_SetOptions_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDSL.g:419:3: this_SetImage_9= ruleSetImage
                    {

                    			newCompositeNode(grammarAccess.getTIMTransformationAccess().getSetImageParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetImage_9=ruleSetImage();

                    state._fsp--;


                    			current = this_SetImage_9;
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


    // $ANTLR start "entryRuleSetImage"
    // InternalDSL.g:431:1: entryRuleSetImage returns [EObject current=null] : iv_ruleSetImage= ruleSetImage EOF ;
    public final EObject entryRuleSetImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetImage = null;


        try {
            // InternalDSL.g:431:49: (iv_ruleSetImage= ruleSetImage EOF )
            // InternalDSL.g:432:2: iv_ruleSetImage= ruleSetImage EOF
            {
             newCompositeNode(grammarAccess.getSetImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetImage=ruleSetImage();

            state._fsp--;

             current =iv_ruleSetImage; 
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
    // $ANTLR end "entryRuleSetImage"


    // $ANTLR start "ruleSetImage"
    // InternalDSL.g:438:1: ruleSetImage returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'container' otherlv_2= 'image' otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) otherlv_5= 'to' ( (lv_image_6_0= ruleEString ) ) ) ;
    public final EObject ruleSetImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_condition_4_0 = null;

        AntlrDatatypeRuleToken lv_image_6_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:444:2: ( (otherlv_0= 'set' otherlv_1= 'container' otherlv_2= 'image' otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) otherlv_5= 'to' ( (lv_image_6_0= ruleEString ) ) ) )
            // InternalDSL.g:445:2: (otherlv_0= 'set' otherlv_1= 'container' otherlv_2= 'image' otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) otherlv_5= 'to' ( (lv_image_6_0= ruleEString ) ) )
            {
            // InternalDSL.g:445:2: (otherlv_0= 'set' otherlv_1= 'container' otherlv_2= 'image' otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) otherlv_5= 'to' ( (lv_image_6_0= ruleEString ) ) )
            // InternalDSL.g:446:3: otherlv_0= 'set' otherlv_1= 'container' otherlv_2= 'image' otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) otherlv_5= 'to' ( (lv_image_6_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSetImageAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getSetImageAccess().getContainerKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSetImageAccess().getImageKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getSetImageAccess().getWhenKeyword_3());
            		
            // InternalDSL.g:462:3: ( (lv_condition_4_0= ruleEString ) )
            // InternalDSL.g:463:4: (lv_condition_4_0= ruleEString )
            {
            // InternalDSL.g:463:4: (lv_condition_4_0= ruleEString )
            // InternalDSL.g:464:5: lv_condition_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSetImageAccess().getConditionEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_condition_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetImageRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_4_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getSetImageAccess().getToKeyword_5());
            		
            // InternalDSL.g:485:3: ( (lv_image_6_0= ruleEString ) )
            // InternalDSL.g:486:4: (lv_image_6_0= ruleEString )
            {
            // InternalDSL.g:486:4: (lv_image_6_0= ruleEString )
            // InternalDSL.g:487:5: lv_image_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSetImageAccess().getImageEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_image_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetImageRule());
            					}
            					set(
            						current,
            						"image",
            						lv_image_6_0,
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
    // $ANTLR end "ruleSetImage"


    // $ANTLR start "entryRuleAddPorts"
    // InternalDSL.g:508:1: entryRuleAddPorts returns [EObject current=null] : iv_ruleAddPorts= ruleAddPorts EOF ;
    public final EObject entryRuleAddPorts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddPorts = null;


        try {
            // InternalDSL.g:508:49: (iv_ruleAddPorts= ruleAddPorts EOF )
            // InternalDSL.g:509:2: iv_ruleAddPorts= ruleAddPorts EOF
            {
             newCompositeNode(grammarAccess.getAddPortsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddPorts=ruleAddPorts();

            state._fsp--;

             current =iv_ruleAddPorts; 
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
    // $ANTLR end "entryRuleAddPorts"


    // $ANTLR start "ruleAddPorts"
    // InternalDSL.g:515:1: ruleAddPorts returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'container' otherlv_2= 'ports' (otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) )? otherlv_5= 'ports' otherlv_6= '{' ( (lv_ports_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_ports_9_0= ruleEString ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleAddPorts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_condition_4_0 = null;

        AntlrDatatypeRuleToken lv_ports_7_0 = null;

        AntlrDatatypeRuleToken lv_ports_9_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:521:2: ( (otherlv_0= 'add' otherlv_1= 'container' otherlv_2= 'ports' (otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) )? otherlv_5= 'ports' otherlv_6= '{' ( (lv_ports_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_ports_9_0= ruleEString ) ) )* otherlv_10= '}' ) )
            // InternalDSL.g:522:2: (otherlv_0= 'add' otherlv_1= 'container' otherlv_2= 'ports' (otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) )? otherlv_5= 'ports' otherlv_6= '{' ( (lv_ports_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_ports_9_0= ruleEString ) ) )* otherlv_10= '}' )
            {
            // InternalDSL.g:522:2: (otherlv_0= 'add' otherlv_1= 'container' otherlv_2= 'ports' (otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) )? otherlv_5= 'ports' otherlv_6= '{' ( (lv_ports_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_ports_9_0= ruleEString ) ) )* otherlv_10= '}' )
            // InternalDSL.g:523:3: otherlv_0= 'add' otherlv_1= 'container' otherlv_2= 'ports' (otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) )? otherlv_5= 'ports' otherlv_6= '{' ( (lv_ports_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_ports_9_0= ruleEString ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAddPortsAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getAddPortsAccess().getContainerKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAddPortsAccess().getPortsKeyword_2());
            		
            // InternalDSL.g:535:3: (otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDSL.g:536:4: otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddPortsAccess().getWhenKeyword_3_0());
                    			
                    // InternalDSL.g:540:4: ( (lv_condition_4_0= ruleEString ) )
                    // InternalDSL.g:541:5: (lv_condition_4_0= ruleEString )
                    {
                    // InternalDSL.g:541:5: (lv_condition_4_0= ruleEString )
                    // InternalDSL.g:542:6: lv_condition_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddPortsAccess().getConditionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_condition_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddPortsRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_4_0,
                    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getAddPortsAccess().getPortsKeyword_4());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getAddPortsAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalDSL.g:568:3: ( (lv_ports_7_0= ruleEString ) )
            // InternalDSL.g:569:4: (lv_ports_7_0= ruleEString )
            {
            // InternalDSL.g:569:4: (lv_ports_7_0= ruleEString )
            // InternalDSL.g:570:5: lv_ports_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddPortsAccess().getPortsEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
            lv_ports_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddPortsRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_7_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:587:3: (otherlv_8= ',' ( (lv_ports_9_0= ruleEString ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDSL.g:588:4: otherlv_8= ',' ( (lv_ports_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,27,FOLLOW_11); 

            	    				newLeafNode(otherlv_8, grammarAccess.getAddPortsAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalDSL.g:592:4: ( (lv_ports_9_0= ruleEString ) )
            	    // InternalDSL.g:593:5: (lv_ports_9_0= ruleEString )
            	    {
            	    // InternalDSL.g:593:5: (lv_ports_9_0= ruleEString )
            	    // InternalDSL.g:594:6: lv_ports_9_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getAddPortsAccess().getPortsEStringParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_ports_9_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddPortsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_9_0,
            	    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAddPortsAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleAddPorts"


    // $ANTLR start "entryRuleSetOptions"
    // InternalDSL.g:620:1: entryRuleSetOptions returns [EObject current=null] : iv_ruleSetOptions= ruleSetOptions EOF ;
    public final EObject entryRuleSetOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetOptions = null;


        try {
            // InternalDSL.g:620:51: (iv_ruleSetOptions= ruleSetOptions EOF )
            // InternalDSL.g:621:2: iv_ruleSetOptions= ruleSetOptions EOF
            {
             newCompositeNode(grammarAccess.getSetOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetOptions=ruleSetOptions();

            state._fsp--;

             current =iv_ruleSetOptions; 
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
    // $ANTLR end "entryRuleSetOptions"


    // $ANTLR start "ruleSetOptions"
    // InternalDSL.g:627:1: ruleSetOptions returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'container' otherlv_2= 'options' (otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) )? otherlv_5= 'to' ( (lv_options_6_0= ruleEString ) ) ) ;
    public final EObject ruleSetOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_condition_4_0 = null;

        AntlrDatatypeRuleToken lv_options_6_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:633:2: ( (otherlv_0= 'set' otherlv_1= 'container' otherlv_2= 'options' (otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) )? otherlv_5= 'to' ( (lv_options_6_0= ruleEString ) ) ) )
            // InternalDSL.g:634:2: (otherlv_0= 'set' otherlv_1= 'container' otherlv_2= 'options' (otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) )? otherlv_5= 'to' ( (lv_options_6_0= ruleEString ) ) )
            {
            // InternalDSL.g:634:2: (otherlv_0= 'set' otherlv_1= 'container' otherlv_2= 'options' (otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) )? otherlv_5= 'to' ( (lv_options_6_0= ruleEString ) ) )
            // InternalDSL.g:635:3: otherlv_0= 'set' otherlv_1= 'container' otherlv_2= 'options' (otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) )? otherlv_5= 'to' ( (lv_options_6_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSetOptionsAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSetOptionsAccess().getContainerKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getSetOptionsAccess().getOptionsKeyword_2());
            		
            // InternalDSL.g:647:3: (otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDSL.g:648:4: otherlv_3= 'when' ( (lv_condition_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getSetOptionsAccess().getWhenKeyword_3_0());
                    			
                    // InternalDSL.g:652:4: ( (lv_condition_4_0= ruleEString ) )
                    // InternalDSL.g:653:5: (lv_condition_4_0= ruleEString )
                    {
                    // InternalDSL.g:653:5: (lv_condition_4_0= ruleEString )
                    // InternalDSL.g:654:6: lv_condition_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSetOptionsAccess().getConditionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_condition_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetOptionsRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_4_0,
                    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getSetOptionsAccess().getToKeyword_4());
            		
            // InternalDSL.g:676:3: ( (lv_options_6_0= ruleEString ) )
            // InternalDSL.g:677:4: (lv_options_6_0= ruleEString )
            {
            // InternalDSL.g:677:4: (lv_options_6_0= ruleEString )
            // InternalDSL.g:678:5: lv_options_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSetOptionsAccess().getOptionsEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_options_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetOptionsRule());
            					}
            					set(
            						current,
            						"options",
            						lv_options_6_0,
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
    // $ANTLR end "ruleSetOptions"


    // $ANTLR start "entryRuleChangePlugin"
    // InternalDSL.g:699:1: entryRuleChangePlugin returns [EObject current=null] : iv_ruleChangePlugin= ruleChangePlugin EOF ;
    public final EObject entryRuleChangePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangePlugin = null;


        try {
            // InternalDSL.g:699:53: (iv_ruleChangePlugin= ruleChangePlugin EOF )
            // InternalDSL.g:700:2: iv_ruleChangePlugin= ruleChangePlugin EOF
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
    // InternalDSL.g:706:1: ruleChangePlugin returns [EObject current=null] : (otherlv_0= 'change' otherlv_1= 'plugin' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) )+ otherlv_8= '}' )? ) ;
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
            // InternalDSL.g:712:2: ( (otherlv_0= 'change' otherlv_1= 'plugin' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) )+ otherlv_8= '}' )? ) )
            // InternalDSL.g:713:2: (otherlv_0= 'change' otherlv_1= 'plugin' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) )+ otherlv_8= '}' )? )
            {
            // InternalDSL.g:713:2: (otherlv_0= 'change' otherlv_1= 'plugin' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) )+ otherlv_8= '}' )? )
            // InternalDSL.g:714:3: otherlv_0= 'change' otherlv_1= 'plugin' ( (lv_name_2_0= ruleStringToStringMapEntry ) ) otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) )+ otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getChangePluginAccess().getChangeKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getChangePluginAccess().getPluginKeyword_1());
            		
            // InternalDSL.g:722:3: ( (lv_name_2_0= ruleStringToStringMapEntry ) )
            // InternalDSL.g:723:4: (lv_name_2_0= ruleStringToStringMapEntry )
            {
            // InternalDSL.g:723:4: (lv_name_2_0= ruleStringToStringMapEntry )
            // InternalDSL.g:724:5: lv_name_2_0= ruleStringToStringMapEntry
            {

            					newCompositeNode(grammarAccess.getChangePluginAccess().getNameStringToStringMapEntryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getChangePluginAccess().getVersionKeyword_3());
            		
            // InternalDSL.g:745:3: ( (lv_version_4_0= ruleEString ) )
            // InternalDSL.g:746:4: (lv_version_4_0= ruleEString )
            {
            // InternalDSL.g:746:4: (lv_version_4_0= ruleEString )
            // InternalDSL.g:747:5: lv_version_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getChangePluginAccess().getVersionEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalDSL.g:764:3: (otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) )+ otherlv_8= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDSL.g:765:4: otherlv_5= 'args' otherlv_6= '{' ( (lv_args_7_0= ruleStringToStringMapEntry ) )+ otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getChangePluginAccess().getArgsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getChangePluginAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDSL.g:773:4: ( (lv_args_7_0= ruleStringToStringMapEntry ) )+
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
                    	    // InternalDSL.g:774:5: (lv_args_7_0= ruleStringToStringMapEntry )
                    	    {
                    	    // InternalDSL.g:774:5: (lv_args_7_0= ruleStringToStringMapEntry )
                    	    // InternalDSL.g:775:6: lv_args_7_0= ruleStringToStringMapEntry
                    	    {

                    	    						newCompositeNode(grammarAccess.getChangePluginAccess().getArgsStringToStringMapEntryParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
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
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
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
    // InternalDSL.g:801:1: entryRuleReplaceAgentLabels returns [EObject current=null] : iv_ruleReplaceAgentLabels= ruleReplaceAgentLabels EOF ;
    public final EObject entryRuleReplaceAgentLabels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplaceAgentLabels = null;


        try {
            // InternalDSL.g:801:59: (iv_ruleReplaceAgentLabels= ruleReplaceAgentLabels EOF )
            // InternalDSL.g:802:2: iv_ruleReplaceAgentLabels= ruleReplaceAgentLabels EOF
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
    // InternalDSL.g:808:1: ruleReplaceAgentLabels returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'labels' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= '{' ( (lv_labels_5_0= ruleEString ) )+ otherlv_6= '}' ) ;
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
            // InternalDSL.g:814:2: ( (otherlv_0= 'set' otherlv_1= 'labels' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= '{' ( (lv_labels_5_0= ruleEString ) )+ otherlv_6= '}' ) )
            // InternalDSL.g:815:2: (otherlv_0= 'set' otherlv_1= 'labels' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= '{' ( (lv_labels_5_0= ruleEString ) )+ otherlv_6= '}' )
            {
            // InternalDSL.g:815:2: (otherlv_0= 'set' otherlv_1= 'labels' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= '{' ( (lv_labels_5_0= ruleEString ) )+ otherlv_6= '}' )
            // InternalDSL.g:816:3: otherlv_0= 'set' otherlv_1= 'labels' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= '{' ( (lv_labels_5_0= ruleEString ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getReplaceAgentLabelsAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getReplaceAgentLabelsAccess().getLabelsKeyword_1());
            		
            // InternalDSL.g:824:3: (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDSL.g:825:4: otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getReplaceAgentLabelsAccess().getWhenKeyword_2_0());
                    			
                    // InternalDSL.g:829:4: ( (lv_condition_3_0= ruleEString ) )
                    // InternalDSL.g:830:5: (lv_condition_3_0= ruleEString )
                    {
                    // InternalDSL.g:830:5: (lv_condition_3_0= ruleEString )
                    // InternalDSL.g:831:6: lv_condition_3_0= ruleEString
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
            		
            // InternalDSL.g:853:3: ( (lv_labels_5_0= ruleEString ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDSL.g:854:4: (lv_labels_5_0= ruleEString )
            	    {
            	    // InternalDSL.g:854:4: (lv_labels_5_0= ruleEString )
            	    // InternalDSL.g:855:5: lv_labels_5_0= ruleEString
            	    {

            	    					newCompositeNode(grammarAccess.getReplaceAgentLabelsAccess().getLabelsEStringParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // InternalDSL.g:880:1: entryRuleAddTrigger returns [EObject current=null] : iv_ruleAddTrigger= ruleAddTrigger EOF ;
    public final EObject entryRuleAddTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddTrigger = null;


        try {
            // InternalDSL.g:880:51: (iv_ruleAddTrigger= ruleAddTrigger EOF )
            // InternalDSL.g:881:2: iv_ruleAddTrigger= ruleAddTrigger EOF
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
    // InternalDSL.g:887:1: ruleAddTrigger returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'trigger' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) ) ;
    public final EObject ruleAddTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_condition_3_0 = null;

        EObject lv_trigger_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:893:2: ( (otherlv_0= 'add' otherlv_1= 'trigger' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) ) )
            // InternalDSL.g:894:2: (otherlv_0= 'add' otherlv_1= 'trigger' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) )
            {
            // InternalDSL.g:894:2: (otherlv_0= 'add' otherlv_1= 'trigger' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) )
            // InternalDSL.g:895:3: otherlv_0= 'add' otherlv_1= 'trigger' (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )? ( (lv_trigger_4_0= ruleTrigger ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getAddTriggerAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getAddTriggerAccess().getTriggerKeyword_1());
            		
            // InternalDSL.g:903:3: (otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDSL.g:904:4: otherlv_2= 'when' ( (lv_condition_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getAddTriggerAccess().getWhenKeyword_2_0());
                    			
                    // InternalDSL.g:908:4: ( (lv_condition_3_0= ruleEString ) )
                    // InternalDSL.g:909:5: (lv_condition_3_0= ruleEString )
                    {
                    // InternalDSL.g:909:5: (lv_condition_3_0= ruleEString )
                    // InternalDSL.g:910:6: lv_condition_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddTriggerAccess().getConditionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
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

            // InternalDSL.g:928:3: ( (lv_trigger_4_0= ruleTrigger ) )
            // InternalDSL.g:929:4: (lv_trigger_4_0= ruleTrigger )
            {
            // InternalDSL.g:929:4: (lv_trigger_4_0= ruleTrigger )
            // InternalDSL.g:930:5: lv_trigger_4_0= ruleTrigger
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
    // InternalDSL.g:951:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalDSL.g:951:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalDSL.g:952:2: iv_ruleTrigger= ruleTrigger EOF
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
    // InternalDSL.g:958:1: ruleTrigger returns [EObject current=null] : this_ManualTrigger_0= ruleManualTrigger ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ManualTrigger_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:964:2: (this_ManualTrigger_0= ruleManualTrigger )
            // InternalDSL.g:965:2: this_ManualTrigger_0= ruleManualTrigger
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
    // InternalDSL.g:976:1: entryRuleManualTrigger returns [EObject current=null] : iv_ruleManualTrigger= ruleManualTrigger EOF ;
    public final EObject entryRuleManualTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManualTrigger = null;


        try {
            // InternalDSL.g:976:54: (iv_ruleManualTrigger= ruleManualTrigger EOF )
            // InternalDSL.g:977:2: iv_ruleManualTrigger= ruleManualTrigger EOF
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
    // InternalDSL.g:983:1: ruleManualTrigger returns [EObject current=null] : ( () otherlv_1= 'manual' ) ;
    public final EObject ruleManualTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDSL.g:989:2: ( ( () otherlv_1= 'manual' ) )
            // InternalDSL.g:990:2: ( () otherlv_1= 'manual' )
            {
            // InternalDSL.g:990:2: ( () otherlv_1= 'manual' )
            // InternalDSL.g:991:3: () otherlv_1= 'manual'
            {
            // InternalDSL.g:991:3: ()
            // InternalDSL.g:992:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getManualTriggerAccess().getManualTriggerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

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
    // InternalDSL.g:1006:1: entryRuleDeleteStep returns [EObject current=null] : iv_ruleDeleteStep= ruleDeleteStep EOF ;
    public final EObject entryRuleDeleteStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStep = null;


        try {
            // InternalDSL.g:1006:51: (iv_ruleDeleteStep= ruleDeleteStep EOF )
            // InternalDSL.g:1007:2: iv_ruleDeleteStep= ruleDeleteStep EOF
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
    // InternalDSL.g:1013:1: ruleDeleteStep returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) ) ;
    public final EObject ruleDeleteStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_job_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1019:2: ( (otherlv_0= 'delete' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) ) )
            // InternalDSL.g:1020:2: (otherlv_0= 'delete' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) )
            {
            // InternalDSL.g:1020:2: (otherlv_0= 'delete' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) )
            // InternalDSL.g:1021:3: otherlv_0= 'delete' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteStepAccess().getDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteStepAccess().getStepKeyword_1());
            		
            // InternalDSL.g:1029:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalDSL.g:1030:4: (lv_index_2_0= RULE_INT )
            {
            // InternalDSL.g:1030:4: (lv_index_2_0= RULE_INT )
            // InternalDSL.g:1031:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_32); 

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
            		
            // InternalDSL.g:1051:3: ( (lv_job_4_0= ruleEString ) )
            // InternalDSL.g:1052:4: (lv_job_4_0= ruleEString )
            {
            // InternalDSL.g:1052:4: (lv_job_4_0= ruleEString )
            // InternalDSL.g:1053:5: lv_job_4_0= ruleEString
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


    // $ANTLR start "entryRuleAddStep"
    // InternalDSL.g:1074:1: entryRuleAddStep returns [EObject current=null] : iv_ruleAddStep= ruleAddStep EOF ;
    public final EObject entryRuleAddStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddStep = null;


        try {
            // InternalDSL.g:1074:48: (iv_ruleAddStep= ruleAddStep EOF )
            // InternalDSL.g:1075:2: iv_ruleAddStep= ruleAddStep EOF
            {
             newCompositeNode(grammarAccess.getAddStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddStep=ruleAddStep();

            state._fsp--;

             current =iv_ruleAddStep; 
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
    // $ANTLR end "entryRuleAddStep"


    // $ANTLR start "ruleAddStep"
    // InternalDSL.g:1081:1: ruleAddStep returns [EObject current=null] : (otherlv_0= 'insert' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) otherlv_5= 'with' ( (lv_step_6_0= ruleStep ) ) ) ;
    public final EObject ruleAddStep() throws RecognitionException {
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
            // InternalDSL.g:1087:2: ( (otherlv_0= 'insert' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) otherlv_5= 'with' ( (lv_step_6_0= ruleStep ) ) ) )
            // InternalDSL.g:1088:2: (otherlv_0= 'insert' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) otherlv_5= 'with' ( (lv_step_6_0= ruleStep ) ) )
            {
            // InternalDSL.g:1088:2: (otherlv_0= 'insert' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) otherlv_5= 'with' ( (lv_step_6_0= ruleStep ) ) )
            // InternalDSL.g:1089:3: otherlv_0= 'insert' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) otherlv_5= 'with' ( (lv_step_6_0= ruleStep ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getAddStepAccess().getInsertKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getAddStepAccess().getStepKeyword_1());
            		
            // InternalDSL.g:1097:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalDSL.g:1098:4: (lv_index_2_0= RULE_INT )
            {
            // InternalDSL.g:1098:4: (lv_index_2_0= RULE_INT )
            // InternalDSL.g:1099:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_32); 

            					newLeafNode(lv_index_2_0, grammarAccess.getAddStepAccess().getIndexINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"index",
            						lv_index_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getAddStepAccess().getOnKeyword_3());
            		
            // InternalDSL.g:1119:3: ( (lv_job_4_0= ruleEString ) )
            // InternalDSL.g:1120:4: (lv_job_4_0= ruleEString )
            {
            // InternalDSL.g:1120:4: (lv_job_4_0= ruleEString )
            // InternalDSL.g:1121:5: lv_job_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddStepAccess().getJobEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_33);
            lv_job_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddStepRule());
            					}
            					set(
            						current,
            						"job",
            						lv_job_4_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_34); 

            			newLeafNode(otherlv_5, grammarAccess.getAddStepAccess().getWithKeyword_5());
            		
            // InternalDSL.g:1142:3: ( (lv_step_6_0= ruleStep ) )
            // InternalDSL.g:1143:4: (lv_step_6_0= ruleStep )
            {
            // InternalDSL.g:1143:4: (lv_step_6_0= ruleStep )
            // InternalDSL.g:1144:5: lv_step_6_0= ruleStep
            {

            					newCompositeNode(grammarAccess.getAddStepAccess().getStepStepParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_step_6_0=ruleStep();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddStepRule());
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
    // $ANTLR end "ruleAddStep"


    // $ANTLR start "entryRuleReplaceStep"
    // InternalDSL.g:1165:1: entryRuleReplaceStep returns [EObject current=null] : iv_ruleReplaceStep= ruleReplaceStep EOF ;
    public final EObject entryRuleReplaceStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplaceStep = null;


        try {
            // InternalDSL.g:1165:52: (iv_ruleReplaceStep= ruleReplaceStep EOF )
            // InternalDSL.g:1166:2: iv_ruleReplaceStep= ruleReplaceStep EOF
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
    // InternalDSL.g:1172:1: ruleReplaceStep returns [EObject current=null] : (otherlv_0= 'replace' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) otherlv_5= 'with' ( (lv_step_6_0= ruleStep ) ) ) ;
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
            // InternalDSL.g:1178:2: ( (otherlv_0= 'replace' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) otherlv_5= 'with' ( (lv_step_6_0= ruleStep ) ) ) )
            // InternalDSL.g:1179:2: (otherlv_0= 'replace' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) otherlv_5= 'with' ( (lv_step_6_0= ruleStep ) ) )
            {
            // InternalDSL.g:1179:2: (otherlv_0= 'replace' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) otherlv_5= 'with' ( (lv_step_6_0= ruleStep ) ) )
            // InternalDSL.g:1180:3: otherlv_0= 'replace' otherlv_1= 'step' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= 'on' ( (lv_job_4_0= ruleEString ) ) otherlv_5= 'with' ( (lv_step_6_0= ruleStep ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getReplaceStepAccess().getReplaceKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getReplaceStepAccess().getStepKeyword_1());
            		
            // InternalDSL.g:1188:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalDSL.g:1189:4: (lv_index_2_0= RULE_INT )
            {
            // InternalDSL.g:1189:4: (lv_index_2_0= RULE_INT )
            // InternalDSL.g:1190:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_32); 

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
            		
            // InternalDSL.g:1210:3: ( (lv_job_4_0= ruleEString ) )
            // InternalDSL.g:1211:4: (lv_job_4_0= ruleEString )
            {
            // InternalDSL.g:1211:4: (lv_job_4_0= ruleEString )
            // InternalDSL.g:1212:5: lv_job_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReplaceStepAccess().getJobEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_5=(Token)match(input,39,FOLLOW_34); 

            			newLeafNode(otherlv_5, grammarAccess.getReplaceStepAccess().getWithKeyword_5());
            		
            // InternalDSL.g:1233:3: ( (lv_step_6_0= ruleStep ) )
            // InternalDSL.g:1234:4: (lv_step_6_0= ruleStep )
            {
            // InternalDSL.g:1234:4: (lv_step_6_0= ruleStep )
            // InternalDSL.g:1235:5: lv_step_6_0= ruleStep
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
    // InternalDSL.g:1256:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalDSL.g:1256:45: (iv_ruleStep= ruleStep EOF )
            // InternalDSL.g:1257:2: iv_ruleStep= ruleStep EOF
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
    // InternalDSL.g:1263:1: ruleStep returns [EObject current=null] : (this_ConditionalStep_0= ruleConditionalStep | this_NonConditionalStep_1= ruleNonConditionalStep ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalStep_0 = null;

        EObject this_NonConditionalStep_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:1269:2: ( (this_ConditionalStep_0= ruleConditionalStep | this_NonConditionalStep_1= ruleNonConditionalStep ) )
            // InternalDSL.g:1270:2: (this_ConditionalStep_0= ruleConditionalStep | this_NonConditionalStep_1= ruleNonConditionalStep )
            {
            // InternalDSL.g:1270:2: (this_ConditionalStep_0= ruleConditionalStep | this_NonConditionalStep_1= ruleNonConditionalStep )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            else if ( (LA21_0==30||LA21_0==45||LA21_0==48) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalDSL.g:1271:3: this_ConditionalStep_0= ruleConditionalStep
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
                    // InternalDSL.g:1280:3: this_NonConditionalStep_1= ruleNonConditionalStep
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
    // InternalDSL.g:1292:1: entryRuleConditionalStep returns [EObject current=null] : iv_ruleConditionalStep= ruleConditionalStep EOF ;
    public final EObject entryRuleConditionalStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalStep = null;


        try {
            // InternalDSL.g:1292:56: (iv_ruleConditionalStep= ruleConditionalStep EOF )
            // InternalDSL.g:1293:2: iv_ruleConditionalStep= ruleConditionalStep EOF
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
    // InternalDSL.g:1299:1: ruleConditionalStep returns [EObject current=null] : (otherlv_0= 'conditional' otherlv_1= '{' otherlv_2= 'if' ( (lv_ifCondition_3_0= ruleStringLiteral ) ) otherlv_4= 'then' ( (lv_thenRun_5_0= ruleStep ) )+ (otherlv_6= 'else' ( (lv_elseRun_7_0= ruleStep ) )+ )? otherlv_8= '}' ) ;
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
            // InternalDSL.g:1305:2: ( (otherlv_0= 'conditional' otherlv_1= '{' otherlv_2= 'if' ( (lv_ifCondition_3_0= ruleStringLiteral ) ) otherlv_4= 'then' ( (lv_thenRun_5_0= ruleStep ) )+ (otherlv_6= 'else' ( (lv_elseRun_7_0= ruleStep ) )+ )? otherlv_8= '}' ) )
            // InternalDSL.g:1306:2: (otherlv_0= 'conditional' otherlv_1= '{' otherlv_2= 'if' ( (lv_ifCondition_3_0= ruleStringLiteral ) ) otherlv_4= 'then' ( (lv_thenRun_5_0= ruleStep ) )+ (otherlv_6= 'else' ( (lv_elseRun_7_0= ruleStep ) )+ )? otherlv_8= '}' )
            {
            // InternalDSL.g:1306:2: (otherlv_0= 'conditional' otherlv_1= '{' otherlv_2= 'if' ( (lv_ifCondition_3_0= ruleStringLiteral ) ) otherlv_4= 'then' ( (lv_thenRun_5_0= ruleStep ) )+ (otherlv_6= 'else' ( (lv_elseRun_7_0= ruleStep ) )+ )? otherlv_8= '}' )
            // InternalDSL.g:1307:3: otherlv_0= 'conditional' otherlv_1= '{' otherlv_2= 'if' ( (lv_ifCondition_3_0= ruleStringLiteral ) ) otherlv_4= 'then' ( (lv_thenRun_5_0= ruleStep ) )+ (otherlv_6= 'else' ( (lv_elseRun_7_0= ruleStep ) )+ )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalStepAccess().getConditionalKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalStepAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalStepAccess().getIfKeyword_2());
            		
            // InternalDSL.g:1319:3: ( (lv_ifCondition_3_0= ruleStringLiteral ) )
            // InternalDSL.g:1320:4: (lv_ifCondition_3_0= ruleStringLiteral )
            {
            // InternalDSL.g:1320:4: (lv_ifCondition_3_0= ruleStringLiteral )
            // InternalDSL.g:1321:5: lv_ifCondition_3_0= ruleStringLiteral
            {

            					newCompositeNode(grammarAccess.getConditionalStepAccess().getIfConditionStringLiteralParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_4=(Token)match(input,43,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalStepAccess().getThenKeyword_4());
            		
            // InternalDSL.g:1342:3: ( (lv_thenRun_5_0= ruleStep ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30||LA22_0==41||LA22_0==45||LA22_0==48) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDSL.g:1343:4: (lv_thenRun_5_0= ruleStep )
            	    {
            	    // InternalDSL.g:1343:4: (lv_thenRun_5_0= ruleStep )
            	    // InternalDSL.g:1344:5: lv_thenRun_5_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getConditionalStepAccess().getThenRunStepParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_37);
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // InternalDSL.g:1361:3: (otherlv_6= 'else' ( (lv_elseRun_7_0= ruleStep ) )+ )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDSL.g:1362:4: otherlv_6= 'else' ( (lv_elseRun_7_0= ruleStep ) )+
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_6, grammarAccess.getConditionalStepAccess().getElseKeyword_6_0());
                    			
                    // InternalDSL.g:1366:4: ( (lv_elseRun_7_0= ruleStep ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==30||LA23_0==41||LA23_0==45||LA23_0==48) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalDSL.g:1367:5: (lv_elseRun_7_0= ruleStep )
                    	    {
                    	    // InternalDSL.g:1367:5: (lv_elseRun_7_0= ruleStep )
                    	    // InternalDSL.g:1368:6: lv_elseRun_7_0= ruleStep
                    	    {

                    	    						newCompositeNode(grammarAccess.getConditionalStepAccess().getElseRunStepParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_38);
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
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
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
    // InternalDSL.g:1394:1: entryRuleNonConditionalStep returns [EObject current=null] : iv_ruleNonConditionalStep= ruleNonConditionalStep EOF ;
    public final EObject entryRuleNonConditionalStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonConditionalStep = null;


        try {
            // InternalDSL.g:1394:59: (iv_ruleNonConditionalStep= ruleNonConditionalStep EOF )
            // InternalDSL.g:1395:2: iv_ruleNonConditionalStep= ruleNonConditionalStep EOF
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
    // InternalDSL.g:1401:1: ruleNonConditionalStep returns [EObject current=null] : ( ( ( () otherlv_1= 'command' otherlv_2= '{' otherlv_3= 'script' ( (lv_program_4_0= ruleStringLiteral ) ) ) | ( () otherlv_6= 'plugin' otherlv_7= '{' otherlv_8= 'name' ( (lv_pluginName_9_0= ruleEString ) ) otherlv_10= 'version' ( (lv_version_11_0= ruleEString ) ) (otherlv_12= 'args' otherlv_13= '{' ( (lv_kwargs_14_0= ruleAssignment ) )+ otherlv_15= '}' )? ) | ( () otherlv_17= 'checkout' otherlv_18= '{' (otherlv_19= 'path' ( (lv_path_20_0= ruleStringLiteral ) ) )? ) ) (otherlv_21= 'environment' otherlv_22= '{' ( (lv_environmentVariables_23_0= ruleAssignment ) )+ otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleNonConditionalStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        EObject lv_program_4_0 = null;

        AntlrDatatypeRuleToken lv_pluginName_9_0 = null;

        AntlrDatatypeRuleToken lv_version_11_0 = null;

        EObject lv_kwargs_14_0 = null;

        EObject lv_path_20_0 = null;

        EObject lv_environmentVariables_23_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1407:2: ( ( ( ( () otherlv_1= 'command' otherlv_2= '{' otherlv_3= 'script' ( (lv_program_4_0= ruleStringLiteral ) ) ) | ( () otherlv_6= 'plugin' otherlv_7= '{' otherlv_8= 'name' ( (lv_pluginName_9_0= ruleEString ) ) otherlv_10= 'version' ( (lv_version_11_0= ruleEString ) ) (otherlv_12= 'args' otherlv_13= '{' ( (lv_kwargs_14_0= ruleAssignment ) )+ otherlv_15= '}' )? ) | ( () otherlv_17= 'checkout' otherlv_18= '{' (otherlv_19= 'path' ( (lv_path_20_0= ruleStringLiteral ) ) )? ) ) (otherlv_21= 'environment' otherlv_22= '{' ( (lv_environmentVariables_23_0= ruleAssignment ) )+ otherlv_24= '}' )? otherlv_25= '}' ) )
            // InternalDSL.g:1408:2: ( ( ( () otherlv_1= 'command' otherlv_2= '{' otherlv_3= 'script' ( (lv_program_4_0= ruleStringLiteral ) ) ) | ( () otherlv_6= 'plugin' otherlv_7= '{' otherlv_8= 'name' ( (lv_pluginName_9_0= ruleEString ) ) otherlv_10= 'version' ( (lv_version_11_0= ruleEString ) ) (otherlv_12= 'args' otherlv_13= '{' ( (lv_kwargs_14_0= ruleAssignment ) )+ otherlv_15= '}' )? ) | ( () otherlv_17= 'checkout' otherlv_18= '{' (otherlv_19= 'path' ( (lv_path_20_0= ruleStringLiteral ) ) )? ) ) (otherlv_21= 'environment' otherlv_22= '{' ( (lv_environmentVariables_23_0= ruleAssignment ) )+ otherlv_24= '}' )? otherlv_25= '}' )
            {
            // InternalDSL.g:1408:2: ( ( ( () otherlv_1= 'command' otherlv_2= '{' otherlv_3= 'script' ( (lv_program_4_0= ruleStringLiteral ) ) ) | ( () otherlv_6= 'plugin' otherlv_7= '{' otherlv_8= 'name' ( (lv_pluginName_9_0= ruleEString ) ) otherlv_10= 'version' ( (lv_version_11_0= ruleEString ) ) (otherlv_12= 'args' otherlv_13= '{' ( (lv_kwargs_14_0= ruleAssignment ) )+ otherlv_15= '}' )? ) | ( () otherlv_17= 'checkout' otherlv_18= '{' (otherlv_19= 'path' ( (lv_path_20_0= ruleStringLiteral ) ) )? ) ) (otherlv_21= 'environment' otherlv_22= '{' ( (lv_environmentVariables_23_0= ruleAssignment ) )+ otherlv_24= '}' )? otherlv_25= '}' )
            // InternalDSL.g:1409:3: ( ( () otherlv_1= 'command' otherlv_2= '{' otherlv_3= 'script' ( (lv_program_4_0= ruleStringLiteral ) ) ) | ( () otherlv_6= 'plugin' otherlv_7= '{' otherlv_8= 'name' ( (lv_pluginName_9_0= ruleEString ) ) otherlv_10= 'version' ( (lv_version_11_0= ruleEString ) ) (otherlv_12= 'args' otherlv_13= '{' ( (lv_kwargs_14_0= ruleAssignment ) )+ otherlv_15= '}' )? ) | ( () otherlv_17= 'checkout' otherlv_18= '{' (otherlv_19= 'path' ( (lv_path_20_0= ruleStringLiteral ) ) )? ) ) (otherlv_21= 'environment' otherlv_22= '{' ( (lv_environmentVariables_23_0= ruleAssignment ) )+ otherlv_24= '}' )? otherlv_25= '}'
            {
            // InternalDSL.g:1409:3: ( ( () otherlv_1= 'command' otherlv_2= '{' otherlv_3= 'script' ( (lv_program_4_0= ruleStringLiteral ) ) ) | ( () otherlv_6= 'plugin' otherlv_7= '{' otherlv_8= 'name' ( (lv_pluginName_9_0= ruleEString ) ) otherlv_10= 'version' ( (lv_version_11_0= ruleEString ) ) (otherlv_12= 'args' otherlv_13= '{' ( (lv_kwargs_14_0= ruleAssignment ) )+ otherlv_15= '}' )? ) | ( () otherlv_17= 'checkout' otherlv_18= '{' (otherlv_19= 'path' ( (lv_path_20_0= ruleStringLiteral ) ) )? ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt28=1;
                }
                break;
            case 30:
                {
                alt28=2;
                }
                break;
            case 48:
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
                    // InternalDSL.g:1410:4: ( () otherlv_1= 'command' otherlv_2= '{' otherlv_3= 'script' ( (lv_program_4_0= ruleStringLiteral ) ) )
                    {
                    // InternalDSL.g:1410:4: ( () otherlv_1= 'command' otherlv_2= '{' otherlv_3= 'script' ( (lv_program_4_0= ruleStringLiteral ) ) )
                    // InternalDSL.g:1411:5: () otherlv_1= 'command' otherlv_2= '{' otherlv_3= 'script' ( (lv_program_4_0= ruleStringLiteral ) )
                    {
                    // InternalDSL.g:1411:5: ()
                    // InternalDSL.g:1412:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getNonConditionalStepAccess().getCommandAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,45,FOLLOW_4); 

                    					newLeafNode(otherlv_1, grammarAccess.getNonConditionalStepAccess().getCommandKeyword_0_0_1());
                    				
                    otherlv_2=(Token)match(input,13,FOLLOW_39); 

                    					newLeafNode(otherlv_2, grammarAccess.getNonConditionalStepAccess().getLeftCurlyBracketKeyword_0_0_2());
                    				
                    otherlv_3=(Token)match(input,46,FOLLOW_11); 

                    					newLeafNode(otherlv_3, grammarAccess.getNonConditionalStepAccess().getScriptKeyword_0_0_3());
                    				
                    // InternalDSL.g:1430:5: ( (lv_program_4_0= ruleStringLiteral ) )
                    // InternalDSL.g:1431:6: (lv_program_4_0= ruleStringLiteral )
                    {
                    // InternalDSL.g:1431:6: (lv_program_4_0= ruleStringLiteral )
                    // InternalDSL.g:1432:7: lv_program_4_0= ruleStringLiteral
                    {

                    							newCompositeNode(grammarAccess.getNonConditionalStepAccess().getProgramStringLiteralParserRuleCall_0_0_4_0());
                    						
                    pushFollow(FOLLOW_40);
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


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1451:4: ( () otherlv_6= 'plugin' otherlv_7= '{' otherlv_8= 'name' ( (lv_pluginName_9_0= ruleEString ) ) otherlv_10= 'version' ( (lv_version_11_0= ruleEString ) ) (otherlv_12= 'args' otherlv_13= '{' ( (lv_kwargs_14_0= ruleAssignment ) )+ otherlv_15= '}' )? )
                    {
                    // InternalDSL.g:1451:4: ( () otherlv_6= 'plugin' otherlv_7= '{' otherlv_8= 'name' ( (lv_pluginName_9_0= ruleEString ) ) otherlv_10= 'version' ( (lv_version_11_0= ruleEString ) ) (otherlv_12= 'args' otherlv_13= '{' ( (lv_kwargs_14_0= ruleAssignment ) )+ otherlv_15= '}' )? )
                    // InternalDSL.g:1452:5: () otherlv_6= 'plugin' otherlv_7= '{' otherlv_8= 'name' ( (lv_pluginName_9_0= ruleEString ) ) otherlv_10= 'version' ( (lv_version_11_0= ruleEString ) ) (otherlv_12= 'args' otherlv_13= '{' ( (lv_kwargs_14_0= ruleAssignment ) )+ otherlv_15= '}' )?
                    {
                    // InternalDSL.g:1452:5: ()
                    // InternalDSL.g:1453:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getNonConditionalStepAccess().getPluginAction_0_1_0(),
                    							current);
                    					

                    }

                    otherlv_6=(Token)match(input,30,FOLLOW_4); 

                    					newLeafNode(otherlv_6, grammarAccess.getNonConditionalStepAccess().getPluginKeyword_0_1_1());
                    				
                    otherlv_7=(Token)match(input,13,FOLLOW_41); 

                    					newLeafNode(otherlv_7, grammarAccess.getNonConditionalStepAccess().getLeftCurlyBracketKeyword_0_1_2());
                    				
                    otherlv_8=(Token)match(input,47,FOLLOW_11); 

                    					newLeafNode(otherlv_8, grammarAccess.getNonConditionalStepAccess().getNameKeyword_0_1_3());
                    				
                    // InternalDSL.g:1471:5: ( (lv_pluginName_9_0= ruleEString ) )
                    // InternalDSL.g:1472:6: (lv_pluginName_9_0= ruleEString )
                    {
                    // InternalDSL.g:1472:6: (lv_pluginName_9_0= ruleEString )
                    // InternalDSL.g:1473:7: lv_pluginName_9_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getNonConditionalStepAccess().getPluginNameEStringParserRuleCall_0_1_4_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_pluginName_9_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNonConditionalStepRule());
                    							}
                    							set(
                    								current,
                    								"pluginName",
                    								lv_pluginName_9_0,
                    								"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_10=(Token)match(input,31,FOLLOW_11); 

                    					newLeafNode(otherlv_10, grammarAccess.getNonConditionalStepAccess().getVersionKeyword_0_1_5());
                    				
                    // InternalDSL.g:1494:5: ( (lv_version_11_0= ruleEString ) )
                    // InternalDSL.g:1495:6: (lv_version_11_0= ruleEString )
                    {
                    // InternalDSL.g:1495:6: (lv_version_11_0= ruleEString )
                    // InternalDSL.g:1496:7: lv_version_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getNonConditionalStepAccess().getVersionEStringParserRuleCall_0_1_6_0());
                    						
                    pushFollow(FOLLOW_42);
                    lv_version_11_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNonConditionalStepRule());
                    							}
                    							set(
                    								current,
                    								"version",
                    								lv_version_11_0,
                    								"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDSL.g:1513:5: (otherlv_12= 'args' otherlv_13= '{' ( (lv_kwargs_14_0= ruleAssignment ) )+ otherlv_15= '}' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==32) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalDSL.g:1514:6: otherlv_12= 'args' otherlv_13= '{' ( (lv_kwargs_14_0= ruleAssignment ) )+ otherlv_15= '}'
                            {
                            otherlv_12=(Token)match(input,32,FOLLOW_4); 

                            						newLeafNode(otherlv_12, grammarAccess.getNonConditionalStepAccess().getArgsKeyword_0_1_7_0());
                            					
                            otherlv_13=(Token)match(input,13,FOLLOW_11); 

                            						newLeafNode(otherlv_13, grammarAccess.getNonConditionalStepAccess().getLeftCurlyBracketKeyword_0_1_7_1());
                            					
                            // InternalDSL.g:1522:6: ( (lv_kwargs_14_0= ruleAssignment ) )+
                            int cnt25=0;
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalDSL.g:1523:7: (lv_kwargs_14_0= ruleAssignment )
                            	    {
                            	    // InternalDSL.g:1523:7: (lv_kwargs_14_0= ruleAssignment )
                            	    // InternalDSL.g:1524:8: lv_kwargs_14_0= ruleAssignment
                            	    {

                            	    								newCompositeNode(grammarAccess.getNonConditionalStepAccess().getKwargsAssignmentParserRuleCall_0_1_7_2_0());
                            	    							
                            	    pushFollow(FOLLOW_25);
                            	    lv_kwargs_14_0=ruleAssignment();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getNonConditionalStepRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"kwargs",
                            	    									lv_kwargs_14_0,
                            	    									"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.Assignment");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt25 >= 1 ) break loop25;
                                        EarlyExitException eee =
                                            new EarlyExitException(25, input);
                                        throw eee;
                                }
                                cnt25++;
                            } while (true);

                            otherlv_15=(Token)match(input,14,FOLLOW_40); 

                            						newLeafNode(otherlv_15, grammarAccess.getNonConditionalStepAccess().getRightCurlyBracketKeyword_0_1_7_3());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1548:4: ( () otherlv_17= 'checkout' otherlv_18= '{' (otherlv_19= 'path' ( (lv_path_20_0= ruleStringLiteral ) ) )? )
                    {
                    // InternalDSL.g:1548:4: ( () otherlv_17= 'checkout' otherlv_18= '{' (otherlv_19= 'path' ( (lv_path_20_0= ruleStringLiteral ) ) )? )
                    // InternalDSL.g:1549:5: () otherlv_17= 'checkout' otherlv_18= '{' (otherlv_19= 'path' ( (lv_path_20_0= ruleStringLiteral ) ) )?
                    {
                    // InternalDSL.g:1549:5: ()
                    // InternalDSL.g:1550:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getNonConditionalStepAccess().getCheckoutAction_0_2_0(),
                    							current);
                    					

                    }

                    otherlv_17=(Token)match(input,48,FOLLOW_4); 

                    					newLeafNode(otherlv_17, grammarAccess.getNonConditionalStepAccess().getCheckoutKeyword_0_2_1());
                    				
                    otherlv_18=(Token)match(input,13,FOLLOW_43); 

                    					newLeafNode(otherlv_18, grammarAccess.getNonConditionalStepAccess().getLeftCurlyBracketKeyword_0_2_2());
                    				
                    // InternalDSL.g:1564:5: (otherlv_19= 'path' ( (lv_path_20_0= ruleStringLiteral ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==49) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalDSL.g:1565:6: otherlv_19= 'path' ( (lv_path_20_0= ruleStringLiteral ) )
                            {
                            otherlv_19=(Token)match(input,49,FOLLOW_11); 

                            						newLeafNode(otherlv_19, grammarAccess.getNonConditionalStepAccess().getPathKeyword_0_2_3_0());
                            					
                            // InternalDSL.g:1569:6: ( (lv_path_20_0= ruleStringLiteral ) )
                            // InternalDSL.g:1570:7: (lv_path_20_0= ruleStringLiteral )
                            {
                            // InternalDSL.g:1570:7: (lv_path_20_0= ruleStringLiteral )
                            // InternalDSL.g:1571:8: lv_path_20_0= ruleStringLiteral
                            {

                            								newCompositeNode(grammarAccess.getNonConditionalStepAccess().getPathStringLiteralParserRuleCall_0_2_3_1_0());
                            							
                            pushFollow(FOLLOW_40);
                            lv_path_20_0=ruleStringLiteral();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNonConditionalStepRule());
                            								}
                            								set(
                            									current,
                            									"path",
                            									lv_path_20_0,
                            									"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringLiteral");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalDSL.g:1591:3: (otherlv_21= 'environment' otherlv_22= '{' ( (lv_environmentVariables_23_0= ruleAssignment ) )+ otherlv_24= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==50) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDSL.g:1592:4: otherlv_21= 'environment' otherlv_22= '{' ( (lv_environmentVariables_23_0= ruleAssignment ) )+ otherlv_24= '}'
                    {
                    otherlv_21=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getNonConditionalStepAccess().getEnvironmentKeyword_1_0());
                    			
                    otherlv_22=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_22, grammarAccess.getNonConditionalStepAccess().getLeftCurlyBracketKeyword_1_1());
                    			
                    // InternalDSL.g:1600:4: ( (lv_environmentVariables_23_0= ruleAssignment ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalDSL.g:1601:5: (lv_environmentVariables_23_0= ruleAssignment )
                    	    {
                    	    // InternalDSL.g:1601:5: (lv_environmentVariables_23_0= ruleAssignment )
                    	    // InternalDSL.g:1602:6: lv_environmentVariables_23_0= ruleAssignment
                    	    {

                    	    						newCompositeNode(grammarAccess.getNonConditionalStepAccess().getEnvironmentVariablesAssignmentParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_environmentVariables_23_0=ruleAssignment();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNonConditionalStepRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"environmentVariables",
                    	    							lv_environmentVariables_23_0,
                    	    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.Assignment");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);

                    otherlv_24=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_24, grammarAccess.getNonConditionalStepAccess().getRightCurlyBracketKeyword_1_3());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getNonConditionalStepAccess().getRightCurlyBracketKeyword_2());
            		

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
    // InternalDSL.g:1632:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalDSL.g:1632:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalDSL.g:1633:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalDSL.g:1639:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1645:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalDSL.g:1646:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalDSL.g:1646:2: ( (lv_value_0_0= ruleEString ) )
            // InternalDSL.g:1647:3: (lv_value_0_0= ruleEString )
            {
            // InternalDSL.g:1647:3: (lv_value_0_0= ruleEString )
            // InternalDSL.g:1648:4: lv_value_0_0= ruleEString
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
    // InternalDSL.g:1668:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalDSL.g:1668:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalDSL.g:1669:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalDSL.g:1675:1: ruleAssignment returns [EObject current=null] : ( ( (lv_key_0_0= ruleVariableDeclaration ) ) otherlv_1= '=' ( (lv_value_2_0= ruleStringLiteral ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1681:2: ( ( ( (lv_key_0_0= ruleVariableDeclaration ) ) otherlv_1= '=' ( (lv_value_2_0= ruleStringLiteral ) ) ) )
            // InternalDSL.g:1682:2: ( ( (lv_key_0_0= ruleVariableDeclaration ) ) otherlv_1= '=' ( (lv_value_2_0= ruleStringLiteral ) ) )
            {
            // InternalDSL.g:1682:2: ( ( (lv_key_0_0= ruleVariableDeclaration ) ) otherlv_1= '=' ( (lv_value_2_0= ruleStringLiteral ) ) )
            // InternalDSL.g:1683:3: ( (lv_key_0_0= ruleVariableDeclaration ) ) otherlv_1= '=' ( (lv_value_2_0= ruleStringLiteral ) )
            {
            // InternalDSL.g:1683:3: ( (lv_key_0_0= ruleVariableDeclaration ) )
            // InternalDSL.g:1684:4: (lv_key_0_0= ruleVariableDeclaration )
            {
            // InternalDSL.g:1684:4: (lv_key_0_0= ruleVariableDeclaration )
            // InternalDSL.g:1685:5: lv_key_0_0= ruleVariableDeclaration
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getKeyVariableDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
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

            otherlv_1=(Token)match(input,51,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalDSL.g:1706:3: ( (lv_value_2_0= ruleStringLiteral ) )
            // InternalDSL.g:1707:4: (lv_value_2_0= ruleStringLiteral )
            {
            // InternalDSL.g:1707:4: (lv_value_2_0= ruleStringLiteral )
            // InternalDSL.g:1708:5: lv_value_2_0= ruleStringLiteral
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
    // InternalDSL.g:1729:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalDSL.g:1729:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalDSL.g:1730:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalDSL.g:1736:1: ruleVariableDeclaration returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1742:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalDSL.g:1743:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalDSL.g:1743:2: ( (lv_name_0_0= ruleEString ) )
            // InternalDSL.g:1744:3: (lv_name_0_0= ruleEString )
            {
            // InternalDSL.g:1744:3: (lv_name_0_0= ruleEString )
            // InternalDSL.g:1745:4: lv_name_0_0= ruleEString
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
    // InternalDSL.g:1765:1: entryRuleCircleCITransformation returns [EObject current=null] : iv_ruleCircleCITransformation= ruleCircleCITransformation EOF ;
    public final EObject entryRuleCircleCITransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCircleCITransformation = null;


        try {
            // InternalDSL.g:1765:63: (iv_ruleCircleCITransformation= ruleCircleCITransformation EOF )
            // InternalDSL.g:1766:2: iv_ruleCircleCITransformation= ruleCircleCITransformation EOF
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
    // InternalDSL.g:1772:1: ruleCircleCITransformation returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'circleci' (this_SetCircleCIVersion_2= ruleSetCircleCIVersion | this_AddExecutor_3= ruleAddExecutor | this_SelectWorkflow_4= ruleSelectWorkflow ) ) ;
    public final EObject ruleCircleCITransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_SetCircleCIVersion_2 = null;

        EObject this_AddExecutor_3 = null;

        EObject this_SelectWorkflow_4 = null;



        	enterRule();

        try {
            // InternalDSL.g:1778:2: ( (otherlv_0= 'on' otherlv_1= 'circleci' (this_SetCircleCIVersion_2= ruleSetCircleCIVersion | this_AddExecutor_3= ruleAddExecutor | this_SelectWorkflow_4= ruleSelectWorkflow ) ) )
            // InternalDSL.g:1779:2: (otherlv_0= 'on' otherlv_1= 'circleci' (this_SetCircleCIVersion_2= ruleSetCircleCIVersion | this_AddExecutor_3= ruleAddExecutor | this_SelectWorkflow_4= ruleSelectWorkflow ) )
            {
            // InternalDSL.g:1779:2: (otherlv_0= 'on' otherlv_1= 'circleci' (this_SetCircleCIVersion_2= ruleSetCircleCIVersion | this_AddExecutor_3= ruleAddExecutor | this_SelectWorkflow_4= ruleSelectWorkflow ) )
            // InternalDSL.g:1780:3: otherlv_0= 'on' otherlv_1= 'circleci' (this_SetCircleCIVersion_2= ruleSetCircleCIVersion | this_AddExecutor_3= ruleAddExecutor | this_SelectWorkflow_4= ruleSelectWorkflow )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getCircleCITransformationAccess().getOnKeyword_0());
            		
            otherlv_1=(Token)match(input,52,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getCircleCITransformationAccess().getCircleciKeyword_1());
            		
            // InternalDSL.g:1788:3: (this_SetCircleCIVersion_2= ruleSetCircleCIVersion | this_AddExecutor_3= ruleAddExecutor | this_SelectWorkflow_4= ruleSelectWorkflow )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt31=1;
                }
                break;
            case 25:
                {
                alt31=2;
                }
                break;
            case 56:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalDSL.g:1789:4: this_SetCircleCIVersion_2= ruleSetCircleCIVersion
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
                    // InternalDSL.g:1798:4: this_AddExecutor_3= ruleAddExecutor
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
                    // InternalDSL.g:1807:4: this_SelectWorkflow_4= ruleSelectWorkflow
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
    // InternalDSL.g:1820:1: entryRuleSetCircleCIVersion returns [EObject current=null] : iv_ruleSetCircleCIVersion= ruleSetCircleCIVersion EOF ;
    public final EObject entryRuleSetCircleCIVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetCircleCIVersion = null;


        try {
            // InternalDSL.g:1820:59: (iv_ruleSetCircleCIVersion= ruleSetCircleCIVersion EOF )
            // InternalDSL.g:1821:2: iv_ruleSetCircleCIVersion= ruleSetCircleCIVersion EOF
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
    // InternalDSL.g:1827:1: ruleSetCircleCIVersion returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'version' (otherlv_2= 'to' )? ( (lv_version_3_0= ruleEString ) ) ) ;
    public final EObject ruleSetCircleCIVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_version_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1833:2: ( (otherlv_0= 'set' otherlv_1= 'version' (otherlv_2= 'to' )? ( (lv_version_3_0= ruleEString ) ) ) )
            // InternalDSL.g:1834:2: (otherlv_0= 'set' otherlv_1= 'version' (otherlv_2= 'to' )? ( (lv_version_3_0= ruleEString ) ) )
            {
            // InternalDSL.g:1834:2: (otherlv_0= 'set' otherlv_1= 'version' (otherlv_2= 'to' )? ( (lv_version_3_0= ruleEString ) ) )
            // InternalDSL.g:1835:3: otherlv_0= 'set' otherlv_1= 'version' (otherlv_2= 'to' )? ( (lv_version_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getSetCircleCIVersionAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getSetCircleCIVersionAccess().getVersionKeyword_1());
            		
            // InternalDSL.g:1843:3: (otherlv_2= 'to' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDSL.g:1844:4: otherlv_2= 'to'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getSetCircleCIVersionAccess().getToKeyword_2());
                    			

                    }
                    break;

            }

            // InternalDSL.g:1849:3: ( (lv_version_3_0= ruleEString ) )
            // InternalDSL.g:1850:4: (lv_version_3_0= ruleEString )
            {
            // InternalDSL.g:1850:4: (lv_version_3_0= ruleEString )
            // InternalDSL.g:1851:5: lv_version_3_0= ruleEString
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
    // InternalDSL.g:1872:1: entryRuleAddExecutor returns [EObject current=null] : iv_ruleAddExecutor= ruleAddExecutor EOF ;
    public final EObject entryRuleAddExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExecutor = null;


        try {
            // InternalDSL.g:1872:52: (iv_ruleAddExecutor= ruleAddExecutor EOF )
            // InternalDSL.g:1873:2: iv_ruleAddExecutor= ruleAddExecutor EOF
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
    // InternalDSL.g:1879:1: ruleAddExecutor returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'executor' this_AddOrbReferenceExecutor_2= ruleAddOrbReferenceExecutor ) ;
    public final EObject ruleAddExecutor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_AddOrbReferenceExecutor_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:1885:2: ( (otherlv_0= 'add' otherlv_1= 'executor' this_AddOrbReferenceExecutor_2= ruleAddOrbReferenceExecutor ) )
            // InternalDSL.g:1886:2: (otherlv_0= 'add' otherlv_1= 'executor' this_AddOrbReferenceExecutor_2= ruleAddOrbReferenceExecutor )
            {
            // InternalDSL.g:1886:2: (otherlv_0= 'add' otherlv_1= 'executor' this_AddOrbReferenceExecutor_2= ruleAddOrbReferenceExecutor )
            // InternalDSL.g:1887:3: otherlv_0= 'add' otherlv_1= 'executor' this_AddOrbReferenceExecutor_2= ruleAddOrbReferenceExecutor
            {
            otherlv_0=(Token)match(input,25,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getAddExecutorAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_11); 

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
    // InternalDSL.g:1907:1: entryRuleAddOrbReferenceExecutor returns [EObject current=null] : iv_ruleAddOrbReferenceExecutor= ruleAddOrbReferenceExecutor EOF ;
    public final EObject entryRuleAddOrbReferenceExecutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddOrbReferenceExecutor = null;


        try {
            // InternalDSL.g:1907:64: (iv_ruleAddOrbReferenceExecutor= ruleAddOrbReferenceExecutor EOF )
            // InternalDSL.g:1908:2: iv_ruleAddOrbReferenceExecutor= ruleAddOrbReferenceExecutor EOF
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
    // InternalDSL.g:1914:1: ruleAddOrbReferenceExecutor returns [EObject current=null] : ( ( (lv_executor_0_0= ruleEString ) ) otherlv_1= 'on' ( (lv_jobName_2_0= ruleEString ) ) (otherlv_3= 'from' )? otherlv_4= 'orb' ( (lv_orb_5_0= ruleEString ) ) ) ;
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
            // InternalDSL.g:1920:2: ( ( ( (lv_executor_0_0= ruleEString ) ) otherlv_1= 'on' ( (lv_jobName_2_0= ruleEString ) ) (otherlv_3= 'from' )? otherlv_4= 'orb' ( (lv_orb_5_0= ruleEString ) ) ) )
            // InternalDSL.g:1921:2: ( ( (lv_executor_0_0= ruleEString ) ) otherlv_1= 'on' ( (lv_jobName_2_0= ruleEString ) ) (otherlv_3= 'from' )? otherlv_4= 'orb' ( (lv_orb_5_0= ruleEString ) ) )
            {
            // InternalDSL.g:1921:2: ( ( (lv_executor_0_0= ruleEString ) ) otherlv_1= 'on' ( (lv_jobName_2_0= ruleEString ) ) (otherlv_3= 'from' )? otherlv_4= 'orb' ( (lv_orb_5_0= ruleEString ) ) )
            // InternalDSL.g:1922:3: ( (lv_executor_0_0= ruleEString ) ) otherlv_1= 'on' ( (lv_jobName_2_0= ruleEString ) ) (otherlv_3= 'from' )? otherlv_4= 'orb' ( (lv_orb_5_0= ruleEString ) )
            {
            // InternalDSL.g:1922:3: ( (lv_executor_0_0= ruleEString ) )
            // InternalDSL.g:1923:4: (lv_executor_0_0= ruleEString )
            {
            // InternalDSL.g:1923:4: (lv_executor_0_0= ruleEString )
            // InternalDSL.g:1924:5: lv_executor_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddOrbReferenceExecutorAccess().getExecutorEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
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
            		
            // InternalDSL.g:1945:3: ( (lv_jobName_2_0= ruleEString ) )
            // InternalDSL.g:1946:4: (lv_jobName_2_0= ruleEString )
            {
            // InternalDSL.g:1946:4: (lv_jobName_2_0= ruleEString )
            // InternalDSL.g:1947:5: lv_jobName_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddOrbReferenceExecutorAccess().getJobNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_49);
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

            // InternalDSL.g:1964:3: (otherlv_3= 'from' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==54) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDSL.g:1965:4: otherlv_3= 'from'
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_50); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddOrbReferenceExecutorAccess().getFromKeyword_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,55,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getAddOrbReferenceExecutorAccess().getOrbKeyword_4());
            		
            // InternalDSL.g:1974:3: ( (lv_orb_5_0= ruleEString ) )
            // InternalDSL.g:1975:4: (lv_orb_5_0= ruleEString )
            {
            // InternalDSL.g:1975:4: (lv_orb_5_0= ruleEString )
            // InternalDSL.g:1976:5: lv_orb_5_0= ruleEString
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
    // InternalDSL.g:1997:1: entryRuleSelectWorkflow returns [EObject current=null] : iv_ruleSelectWorkflow= ruleSelectWorkflow EOF ;
    public final EObject entryRuleSelectWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectWorkflow = null;


        try {
            // InternalDSL.g:1997:55: (iv_ruleSelectWorkflow= ruleSelectWorkflow EOF )
            // InternalDSL.g:1998:2: iv_ruleSelectWorkflow= ruleSelectWorkflow EOF
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
    // InternalDSL.g:2004:1: ruleSelectWorkflow returns [EObject current=null] : (otherlv_0= 'select' otherlv_1= 'workflow' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleSelectWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:2010:2: ( (otherlv_0= 'select' otherlv_1= 'workflow' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDSL.g:2011:2: (otherlv_0= 'select' otherlv_1= 'workflow' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDSL.g:2011:2: (otherlv_0= 'select' otherlv_1= 'workflow' ( (lv_name_2_0= ruleEString ) ) )
            // InternalDSL.g:2012:3: otherlv_0= 'select' otherlv_1= 'workflow' ( (lv_name_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectWorkflowAccess().getSelectKeyword_0());
            		
            otherlv_1=(Token)match(input,57,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectWorkflowAccess().getWorkflowKeyword_1());
            		
            // InternalDSL.g:2020:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:2021:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:2021:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:2022:5: lv_name_2_0= ruleEString
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
    // InternalDSL.g:2043:1: entryRuleStringToStringMapEntry returns [EObject current=null] : iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF ;
    public final EObject entryRuleStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringToStringMapEntry = null;


        try {
            // InternalDSL.g:2043:63: (iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF )
            // InternalDSL.g:2044:2: iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF
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
    // InternalDSL.g:2050:1: ruleStringToStringMapEntry returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= 'to' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:2056:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= 'to' ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalDSL.g:2057:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= 'to' ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalDSL.g:2057:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= 'to' ( (lv_value_2_0= ruleEString ) ) )
            // InternalDSL.g:2058:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= 'to' ( (lv_value_2_0= ruleEString ) )
            {
            // InternalDSL.g:2058:3: ( (lv_key_0_0= ruleEString ) )
            // InternalDSL.g:2059:4: (lv_key_0_0= ruleEString )
            {
            // InternalDSL.g:2059:4: (lv_key_0_0= ruleEString )
            // InternalDSL.g:2060:5: lv_key_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getKeyEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_1=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getStringToStringMapEntryAccess().getToKeyword_1());
            		
            // InternalDSL.g:2081:3: ( (lv_value_2_0= ruleEString ) )
            // InternalDSL.g:2082:4: (lv_value_2_0= ruleEString )
            {
            // InternalDSL.g:2082:4: (lv_value_2_0= ruleEString )
            // InternalDSL.g:2083:5: lv_value_2_0= ruleEString
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
    // InternalDSL.g:2104:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDSL.g:2104:47: (iv_ruleEString= ruleEString EOF )
            // InternalDSL.g:2105:2: iv_ruleEString= ruleEString EOF
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
    // InternalDSL.g:2111:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDSL.g:2117:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDSL.g:2118:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDSL.g:2118:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalDSL.g:2119:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:2127:3: this_ID_1= RULE_ID
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
    // InternalDSL.g:2138:1: ruleMODELS returns [Enumerator current=null] : ( (enumLiteral_0= 'gha' ) | (enumLiteral_1= 'cicd' ) | (enumLiteral_2= 'circleci' ) ) ;
    public final Enumerator ruleMODELS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDSL.g:2144:2: ( ( (enumLiteral_0= 'gha' ) | (enumLiteral_1= 'cicd' ) | (enumLiteral_2= 'circleci' ) ) )
            // InternalDSL.g:2145:2: ( (enumLiteral_0= 'gha' ) | (enumLiteral_1= 'cicd' ) | (enumLiteral_2= 'circleci' ) )
            {
            // InternalDSL.g:2145:2: ( (enumLiteral_0= 'gha' ) | (enumLiteral_1= 'cicd' ) | (enumLiteral_2= 'circleci' ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt35=1;
                }
                break;
            case 59:
                {
                alt35=2;
                }
                break;
            case 52:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalDSL.g:2146:3: (enumLiteral_0= 'gha' )
                    {
                    // InternalDSL.g:2146:3: (enumLiteral_0= 'gha' )
                    // InternalDSL.g:2147:4: enumLiteral_0= 'gha'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getMODELSAccess().getGHAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMODELSAccess().getGHAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:2154:3: (enumLiteral_1= 'cicd' )
                    {
                    // InternalDSL.g:2154:3: (enumLiteral_1= 'cicd' )
                    // InternalDSL.g:2155:4: enumLiteral_1= 'cicd'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getMODELSAccess().getCICDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMODELSAccess().getCICDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:2162:3: (enumLiteral_2= 'circleci' )
                    {
                    // InternalDSL.g:2162:3: (enumLiteral_2= 'circleci' )
                    // InternalDSL.g:2163:4: enumLiteral_2= 'circleci'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

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


    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\21\2\uffff\2\25\4\uffff\1\26\4\uffff";
    static final String dfa_3s = "\1\50\2\uffff\1\41\1\42\4\uffff\1\34\4\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\7\1\3\1\uffff\1\10\1\4\1\12\1\11";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\3\4\uffff\1\4\3\uffff\1\2\6\uffff\1\6\1\uffff\1\7\1\uffff\1\5",
            "",
            "",
            "\1\11\13\uffff\1\10",
            "\1\12\14\uffff\1\13",
            "",
            "",
            "",
            "",
            "\1\14\5\uffff\1\15",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "337:2: (this_ATLScript_0= ruleATLScript | this_ChangePlugin_1= ruleChangePlugin | this_ReplaceAgentLabels_2= ruleReplaceAgentLabels | this_AddTrigger_3= ruleAddTrigger | this_ReplaceStep_4= ruleReplaceStep | this_DeleteStep_5= ruleDeleteStep | this_AddStep_6= ruleAddStep | this_AddPorts_7= ruleAddPorts | this_SetOptions_8= ruleSetOptions | this_SetImage_9= ruleSetImage )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000A4000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000015022124000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0C10000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001220040000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001320040004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001220040004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004000100004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0006000000004000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0100000002100000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000001000060L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0200000000000000L});

}