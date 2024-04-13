package d.fe.up.pt.cicd.gha.dsl.parser.antlr.internal;

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
import d.fe.up.pt.cicd.gha.dsl.services.GitHubActionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGitHubActionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'!'", "'.'", "'['", "']'", "'('", "')'", "'contains'", "','", "'startsWith'", "'endsWith'", "'format'", "'join'", "'toJSON'", "'fromJSON'", "'hashFiles'", "'success'", "'always'", "'cancelled'", "'failure'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'github'", "'env'", "'vars'", "'job'", "'jobs'", "'steps'", "'runner'", "'secrets'", "'strategy'", "'matrix'", "'needs'", "'inputs'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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


        public InternalGitHubActionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGitHubActionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGitHubActionsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGitHubActions.g"; }



     	private GitHubActionsGrammarAccess grammarAccess;

        public InternalGitHubActionsParser(TokenStream input, GitHubActionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Expression";
       	}

       	@Override
       	protected GitHubActionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExpression"
    // InternalGitHubActions.g:65:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGitHubActions.g:65:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGitHubActions.g:66:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalGitHubActions.g:72:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:78:2: (this_Or_0= ruleOr )
            // InternalGitHubActions.g:79:2: this_Or_0= ruleOr
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;


            		current = this_Or_0;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalGitHubActions.g:90:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalGitHubActions.g:90:43: (iv_ruleOr= ruleOr EOF )
            // InternalGitHubActions.g:91:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalGitHubActions.g:97:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:103:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* ) )
            // InternalGitHubActions.g:104:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* )
            {
            // InternalGitHubActions.g:104:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* )
            // InternalGitHubActions.g:105:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGitHubActions.g:113:3: ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGitHubActions.g:114:4: () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) )
            	    {
            	    // InternalGitHubActions.g:114:4: ()
            	    // InternalGitHubActions.g:115:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalGitHubActions.g:125:4: ( (lv_rhs_3_0= ruleAnd ) )
            	    // InternalGitHubActions.g:126:5: (lv_rhs_3_0= ruleAnd )
            	    {
            	    // InternalGitHubActions.g:126:5: (lv_rhs_3_0= ruleAnd )
            	    // InternalGitHubActions.g:127:6: lv_rhs_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRhsAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_rhs_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhs",
            	    							lv_rhs_3_0,
            	    							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalGitHubActions.g:149:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalGitHubActions.g:149:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalGitHubActions.g:150:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalGitHubActions.g:156:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:162:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* ) )
            // InternalGitHubActions.g:163:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* )
            {
            // InternalGitHubActions.g:163:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* )
            // InternalGitHubActions.g:164:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGitHubActions.g:172:3: ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGitHubActions.g:173:4: () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) )
            	    {
            	    // InternalGitHubActions.g:173:4: ()
            	    // InternalGitHubActions.g:174:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalGitHubActions.g:184:4: ( (lv_rhs_3_0= ruleEquality ) )
            	    // InternalGitHubActions.g:185:5: (lv_rhs_3_0= ruleEquality )
            	    {
            	    // InternalGitHubActions.g:185:5: (lv_rhs_3_0= ruleEquality )
            	    // InternalGitHubActions.g:186:6: lv_rhs_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRhsEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_rhs_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhs",
            	    							lv_rhs_3_0,
            	    							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalGitHubActions.g:208:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalGitHubActions.g:208:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalGitHubActions.g:209:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalGitHubActions.g:215:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_op_2_0= ruleEQUALITY_OP ) ) ( (lv_rhs_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:221:2: ( (this_Comparison_0= ruleComparison ( () ( (lv_op_2_0= ruleEQUALITY_OP ) ) ( (lv_rhs_3_0= ruleComparison ) ) )* ) )
            // InternalGitHubActions.g:222:2: (this_Comparison_0= ruleComparison ( () ( (lv_op_2_0= ruleEQUALITY_OP ) ) ( (lv_rhs_3_0= ruleComparison ) ) )* )
            {
            // InternalGitHubActions.g:222:2: (this_Comparison_0= ruleComparison ( () ( (lv_op_2_0= ruleEQUALITY_OP ) ) ( (lv_rhs_3_0= ruleComparison ) ) )* )
            // InternalGitHubActions.g:223:3: this_Comparison_0= ruleComparison ( () ( (lv_op_2_0= ruleEQUALITY_OP ) ) ( (lv_rhs_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGitHubActions.g:231:3: ( () ( (lv_op_2_0= ruleEQUALITY_OP ) ) ( (lv_rhs_3_0= ruleComparison ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=38 && LA3_0<=39)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGitHubActions.g:232:4: () ( (lv_op_2_0= ruleEQUALITY_OP ) ) ( (lv_rhs_3_0= ruleComparison ) )
            	    {
            	    // InternalGitHubActions.g:232:4: ()
            	    // InternalGitHubActions.g:233:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalGitHubActions.g:239:4: ( (lv_op_2_0= ruleEQUALITY_OP ) )
            	    // InternalGitHubActions.g:240:5: (lv_op_2_0= ruleEQUALITY_OP )
            	    {
            	    // InternalGitHubActions.g:240:5: (lv_op_2_0= ruleEQUALITY_OP )
            	    // InternalGitHubActions.g:241:6: lv_op_2_0= ruleEQUALITY_OP
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getOpEQUALITY_OPEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_op_2_0=ruleEQUALITY_OP();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.EQUALITY_OP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalGitHubActions.g:258:4: ( (lv_rhs_3_0= ruleComparison ) )
            	    // InternalGitHubActions.g:259:5: (lv_rhs_3_0= ruleComparison )
            	    {
            	    // InternalGitHubActions.g:259:5: (lv_rhs_3_0= ruleComparison )
            	    // InternalGitHubActions.g:260:6: lv_rhs_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRhsComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_rhs_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhs",
            	    							lv_rhs_3_0,
            	    							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalGitHubActions.g:282:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalGitHubActions.g:282:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalGitHubActions.g:283:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalGitHubActions.g:289:1: ruleComparison returns [EObject current=null] : (this_UnaryOp_0= ruleUnaryOp ( () ( (lv_op_2_0= ruleCOMPARISON_OP ) ) ( (lv_rhs_3_0= ruleUnaryOp ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOp_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:295:2: ( (this_UnaryOp_0= ruleUnaryOp ( () ( (lv_op_2_0= ruleCOMPARISON_OP ) ) ( (lv_rhs_3_0= ruleUnaryOp ) ) )* ) )
            // InternalGitHubActions.g:296:2: (this_UnaryOp_0= ruleUnaryOp ( () ( (lv_op_2_0= ruleCOMPARISON_OP ) ) ( (lv_rhs_3_0= ruleUnaryOp ) ) )* )
            {
            // InternalGitHubActions.g:296:2: (this_UnaryOp_0= ruleUnaryOp ( () ( (lv_op_2_0= ruleCOMPARISON_OP ) ) ( (lv_rhs_3_0= ruleUnaryOp ) ) )* )
            // InternalGitHubActions.g:297:3: this_UnaryOp_0= ruleUnaryOp ( () ( (lv_op_2_0= ruleCOMPARISON_OP ) ) ( (lv_rhs_3_0= ruleUnaryOp ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getUnaryOpParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_UnaryOp_0=ruleUnaryOp();

            state._fsp--;


            			current = this_UnaryOp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGitHubActions.g:305:3: ( () ( (lv_op_2_0= ruleCOMPARISON_OP ) ) ( (lv_rhs_3_0= ruleUnaryOp ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=34 && LA4_0<=37)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGitHubActions.g:306:4: () ( (lv_op_2_0= ruleCOMPARISON_OP ) ) ( (lv_rhs_3_0= ruleUnaryOp ) )
            	    {
            	    // InternalGitHubActions.g:306:4: ()
            	    // InternalGitHubActions.g:307:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalGitHubActions.g:313:4: ( (lv_op_2_0= ruleCOMPARISON_OP ) )
            	    // InternalGitHubActions.g:314:5: (lv_op_2_0= ruleCOMPARISON_OP )
            	    {
            	    // InternalGitHubActions.g:314:5: (lv_op_2_0= ruleCOMPARISON_OP )
            	    // InternalGitHubActions.g:315:6: lv_op_2_0= ruleCOMPARISON_OP
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getOpCOMPARISON_OPEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_op_2_0=ruleCOMPARISON_OP();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.COMPARISON_OP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalGitHubActions.g:332:4: ( (lv_rhs_3_0= ruleUnaryOp ) )
            	    // InternalGitHubActions.g:333:5: (lv_rhs_3_0= ruleUnaryOp )
            	    {
            	    // InternalGitHubActions.g:333:5: (lv_rhs_3_0= ruleUnaryOp )
            	    // InternalGitHubActions.g:334:6: lv_rhs_3_0= ruleUnaryOp
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRhsUnaryOpParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_rhs_3_0=ruleUnaryOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhs",
            	    							lv_rhs_3_0,
            	    							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.UnaryOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleUnaryOp"
    // InternalGitHubActions.g:356:1: entryRuleUnaryOp returns [EObject current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final EObject entryRuleUnaryOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOp = null;


        try {
            // InternalGitHubActions.g:356:48: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // InternalGitHubActions.g:357:2: iv_ruleUnaryOp= ruleUnaryOp EOF
            {
             newCompositeNode(grammarAccess.getUnaryOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOp=ruleUnaryOp();

            state._fsp--;

             current =iv_ruleUnaryOp; 
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
    // $ANTLR end "entryRuleUnaryOp"


    // $ANTLR start "ruleUnaryOp"
    // InternalGitHubActions.g:363:1: ruleUnaryOp returns [EObject current=null] : (this_Not_0= ruleNot | this_Blank_1= ruleBlank ) ;
    public final EObject ruleUnaryOp() throws RecognitionException {
        EObject current = null;

        EObject this_Not_0 = null;

        EObject this_Blank_1 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:369:2: ( (this_Not_0= ruleNot | this_Blank_1= ruleBlank ) )
            // InternalGitHubActions.g:370:2: (this_Not_0= ruleNot | this_Blank_1= ruleBlank )
            {
            // InternalGitHubActions.g:370:2: (this_Not_0= ruleNot | this_Blank_1= ruleBlank )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)||LA5_0==19||LA5_0==21||(LA5_0>=23 && LA5_0<=33)||(LA5_0>=40 && LA5_0<=51)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGitHubActions.g:371:3: this_Not_0= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getUnaryOpAccess().getNotParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_0=ruleNot();

                    state._fsp--;


                    			current = this_Not_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGitHubActions.g:380:3: this_Blank_1= ruleBlank
                    {

                    			newCompositeNode(grammarAccess.getUnaryOpAccess().getBlankParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Blank_1=ruleBlank();

                    state._fsp--;


                    			current = this_Blank_1;
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
    // $ANTLR end "ruleUnaryOp"


    // $ANTLR start "entryRuleNot"
    // InternalGitHubActions.g:392:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalGitHubActions.g:392:44: (iv_ruleNot= ruleNot EOF )
            // InternalGitHubActions.g:393:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
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
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalGitHubActions.g:399:1: ruleNot returns [EObject current=null] : (otherlv_0= '!' ( (lv_childExpr_1_0= ruleVariableDereference ) ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_childExpr_1_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:405:2: ( (otherlv_0= '!' ( (lv_childExpr_1_0= ruleVariableDereference ) ) ) )
            // InternalGitHubActions.g:406:2: (otherlv_0= '!' ( (lv_childExpr_1_0= ruleVariableDereference ) ) )
            {
            // InternalGitHubActions.g:406:2: (otherlv_0= '!' ( (lv_childExpr_1_0= ruleVariableDereference ) ) )
            // InternalGitHubActions.g:407:3: otherlv_0= '!' ( (lv_childExpr_1_0= ruleVariableDereference ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getExclamationMarkKeyword_0());
            		
            // InternalGitHubActions.g:411:3: ( (lv_childExpr_1_0= ruleVariableDereference ) )
            // InternalGitHubActions.g:412:4: (lv_childExpr_1_0= ruleVariableDereference )
            {
            // InternalGitHubActions.g:412:4: (lv_childExpr_1_0= ruleVariableDereference )
            // InternalGitHubActions.g:413:5: lv_childExpr_1_0= ruleVariableDereference
            {

            					newCompositeNode(grammarAccess.getNotAccess().getChildExprVariableDereferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_childExpr_1_0=ruleVariableDereference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotRule());
            					}
            					set(
            						current,
            						"childExpr",
            						lv_childExpr_1_0,
            						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.VariableDereference");
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
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleBlank"
    // InternalGitHubActions.g:434:1: entryRuleBlank returns [EObject current=null] : iv_ruleBlank= ruleBlank EOF ;
    public final EObject entryRuleBlank() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlank = null;


        try {
            // InternalGitHubActions.g:434:46: (iv_ruleBlank= ruleBlank EOF )
            // InternalGitHubActions.g:435:2: iv_ruleBlank= ruleBlank EOF
            {
             newCompositeNode(grammarAccess.getBlankRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlank=ruleBlank();

            state._fsp--;

             current =iv_ruleBlank; 
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
    // $ANTLR end "entryRuleBlank"


    // $ANTLR start "ruleBlank"
    // InternalGitHubActions.g:441:1: ruleBlank returns [EObject current=null] : this_VariableDereference_0= ruleVariableDereference ;
    public final EObject ruleBlank() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDereference_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:447:2: (this_VariableDereference_0= ruleVariableDereference )
            // InternalGitHubActions.g:448:2: this_VariableDereference_0= ruleVariableDereference
            {

            		newCompositeNode(grammarAccess.getBlankAccess().getVariableDereferenceParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_VariableDereference_0=ruleVariableDereference();

            state._fsp--;


            		current = this_VariableDereference_0;
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
    // $ANTLR end "ruleBlank"


    // $ANTLR start "entryRuleVariableDereference"
    // InternalGitHubActions.g:459:1: entryRuleVariableDereference returns [EObject current=null] : iv_ruleVariableDereference= ruleVariableDereference EOF ;
    public final EObject entryRuleVariableDereference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDereference = null;


        try {
            // InternalGitHubActions.g:459:60: (iv_ruleVariableDereference= ruleVariableDereference EOF )
            // InternalGitHubActions.g:460:2: iv_ruleVariableDereference= ruleVariableDereference EOF
            {
             newCompositeNode(grammarAccess.getVariableDereferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDereference=ruleVariableDereference();

            state._fsp--;

             current =iv_ruleVariableDereference; 
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
    // $ANTLR end "entryRuleVariableDereference"


    // $ANTLR start "ruleVariableDereference"
    // InternalGitHubActions.g:466:1: ruleVariableDereference returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (otherlv_2= '.' ( (lv_rhs_3_0= ruleVariableDereference ) ) ) | (otherlv_4= '[' ( (lv_rhs_5_0= ruleVariableDereference ) ) otherlv_6= ']' ) ) )? ) ;
    public final EObject ruleVariableDereference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Primary_0 = null;

        EObject lv_rhs_3_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:472:2: ( (this_Primary_0= rulePrimary ( () ( (otherlv_2= '.' ( (lv_rhs_3_0= ruleVariableDereference ) ) ) | (otherlv_4= '[' ( (lv_rhs_5_0= ruleVariableDereference ) ) otherlv_6= ']' ) ) )? ) )
            // InternalGitHubActions.g:473:2: (this_Primary_0= rulePrimary ( () ( (otherlv_2= '.' ( (lv_rhs_3_0= ruleVariableDereference ) ) ) | (otherlv_4= '[' ( (lv_rhs_5_0= ruleVariableDereference ) ) otherlv_6= ']' ) ) )? )
            {
            // InternalGitHubActions.g:473:2: (this_Primary_0= rulePrimary ( () ( (otherlv_2= '.' ( (lv_rhs_3_0= ruleVariableDereference ) ) ) | (otherlv_4= '[' ( (lv_rhs_5_0= ruleVariableDereference ) ) otherlv_6= ']' ) ) )? )
            // InternalGitHubActions.g:474:3: this_Primary_0= rulePrimary ( () ( (otherlv_2= '.' ( (lv_rhs_3_0= ruleVariableDereference ) ) ) | (otherlv_4= '[' ( (lv_rhs_5_0= ruleVariableDereference ) ) otherlv_6= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getVariableDereferenceAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGitHubActions.g:482:3: ( () ( (otherlv_2= '.' ( (lv_rhs_3_0= ruleVariableDereference ) ) ) | (otherlv_4= '[' ( (lv_rhs_5_0= ruleVariableDereference ) ) otherlv_6= ']' ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=16 && LA7_0<=17)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGitHubActions.g:483:4: () ( (otherlv_2= '.' ( (lv_rhs_3_0= ruleVariableDereference ) ) ) | (otherlv_4= '[' ( (lv_rhs_5_0= ruleVariableDereference ) ) otherlv_6= ']' ) )
                    {
                    // InternalGitHubActions.g:483:4: ()
                    // InternalGitHubActions.g:484:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getVariableDereferenceAccess().getDotOpLhsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGitHubActions.g:490:4: ( (otherlv_2= '.' ( (lv_rhs_3_0= ruleVariableDereference ) ) ) | (otherlv_4= '[' ( (lv_rhs_5_0= ruleVariableDereference ) ) otherlv_6= ']' ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==16) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==17) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalGitHubActions.g:491:5: (otherlv_2= '.' ( (lv_rhs_3_0= ruleVariableDereference ) ) )
                            {
                            // InternalGitHubActions.g:491:5: (otherlv_2= '.' ( (lv_rhs_3_0= ruleVariableDereference ) ) )
                            // InternalGitHubActions.g:492:6: otherlv_2= '.' ( (lv_rhs_3_0= ruleVariableDereference ) )
                            {
                            otherlv_2=(Token)match(input,16,FOLLOW_4); 

                            						newLeafNode(otherlv_2, grammarAccess.getVariableDereferenceAccess().getFullStopKeyword_1_1_0_0());
                            					
                            // InternalGitHubActions.g:496:6: ( (lv_rhs_3_0= ruleVariableDereference ) )
                            // InternalGitHubActions.g:497:7: (lv_rhs_3_0= ruleVariableDereference )
                            {
                            // InternalGitHubActions.g:497:7: (lv_rhs_3_0= ruleVariableDereference )
                            // InternalGitHubActions.g:498:8: lv_rhs_3_0= ruleVariableDereference
                            {

                            								newCompositeNode(grammarAccess.getVariableDereferenceAccess().getRhsVariableDereferenceParserRuleCall_1_1_0_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_rhs_3_0=ruleVariableDereference();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getVariableDereferenceRule());
                            								}
                            								set(
                            									current,
                            									"rhs",
                            									lv_rhs_3_0,
                            									"d.fe.up.pt.cicd.gha.dsl.GitHubActions.VariableDereference");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGitHubActions.g:517:5: (otherlv_4= '[' ( (lv_rhs_5_0= ruleVariableDereference ) ) otherlv_6= ']' )
                            {
                            // InternalGitHubActions.g:517:5: (otherlv_4= '[' ( (lv_rhs_5_0= ruleVariableDereference ) ) otherlv_6= ']' )
                            // InternalGitHubActions.g:518:6: otherlv_4= '[' ( (lv_rhs_5_0= ruleVariableDereference ) ) otherlv_6= ']'
                            {
                            otherlv_4=(Token)match(input,17,FOLLOW_4); 

                            						newLeafNode(otherlv_4, grammarAccess.getVariableDereferenceAccess().getLeftSquareBracketKeyword_1_1_1_0());
                            					
                            // InternalGitHubActions.g:522:6: ( (lv_rhs_5_0= ruleVariableDereference ) )
                            // InternalGitHubActions.g:523:7: (lv_rhs_5_0= ruleVariableDereference )
                            {
                            // InternalGitHubActions.g:523:7: (lv_rhs_5_0= ruleVariableDereference )
                            // InternalGitHubActions.g:524:8: lv_rhs_5_0= ruleVariableDereference
                            {

                            								newCompositeNode(grammarAccess.getVariableDereferenceAccess().getRhsVariableDereferenceParserRuleCall_1_1_1_1_0());
                            							
                            pushFollow(FOLLOW_9);
                            lv_rhs_5_0=ruleVariableDereference();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getVariableDereferenceRule());
                            								}
                            								set(
                            									current,
                            									"rhs",
                            									lv_rhs_5_0,
                            									"d.fe.up.pt.cicd.gha.dsl.GitHubActions.VariableDereference");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_6=(Token)match(input,18,FOLLOW_2); 

                            						newLeafNode(otherlv_6, grammarAccess.getVariableDereferenceAccess().getRightSquareBracketKeyword_1_1_1_2());
                            					

                            }


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
    // $ANTLR end "ruleVariableDereference"


    // $ANTLR start "entryRulePrimary"
    // InternalGitHubActions.g:552:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalGitHubActions.g:552:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalGitHubActions.g:553:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalGitHubActions.g:559:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_CallExpression_3= ruleCallExpression | this_Atomic_4= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_CallExpression_3 = null;

        EObject this_Atomic_4 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:565:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_CallExpression_3= ruleCallExpression | this_Atomic_4= ruleAtomic ) )
            // InternalGitHubActions.g:566:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_CallExpression_3= ruleCallExpression | this_Atomic_4= ruleAtomic )
            {
            // InternalGitHubActions.g:566:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_CallExpression_3= ruleCallExpression | this_Atomic_4= ruleAtomic )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_BOOLEAN:
            case RULE_STRING:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalGitHubActions.g:567:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalGitHubActions.g:567:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalGitHubActions.g:568:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGitHubActions.g:586:3: this_CallExpression_3= ruleCallExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getCallExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallExpression_3=ruleCallExpression();

                    state._fsp--;


                    			current = this_CallExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGitHubActions.g:595:3: this_Atomic_4= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_4=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_4;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalGitHubActions.g:607:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalGitHubActions.g:607:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalGitHubActions.g:608:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalGitHubActions.g:614:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_context_1_0= ruleCONTEXT ) ) ) | ( () ( (lv_name_3_0= RULE_ID ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_9_0=null;
        Token lv_value_11_0=null;
        Enumerator lv_context_1_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:620:2: ( ( ( () ( (lv_context_1_0= ruleCONTEXT ) ) ) | ( () ( (lv_name_3_0= RULE_ID ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_STRING ) ) ) ) )
            // InternalGitHubActions.g:621:2: ( ( () ( (lv_context_1_0= ruleCONTEXT ) ) ) | ( () ( (lv_name_3_0= RULE_ID ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_STRING ) ) ) )
            {
            // InternalGitHubActions.g:621:2: ( ( () ( (lv_context_1_0= ruleCONTEXT ) ) ) | ( () ( (lv_name_3_0= RULE_ID ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_STRING ) ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
                {
                alt9=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt9=4;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt9=5;
                }
                break;
            case RULE_STRING:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGitHubActions.g:622:3: ( () ( (lv_context_1_0= ruleCONTEXT ) ) )
                    {
                    // InternalGitHubActions.g:622:3: ( () ( (lv_context_1_0= ruleCONTEXT ) ) )
                    // InternalGitHubActions.g:623:4: () ( (lv_context_1_0= ruleCONTEXT ) )
                    {
                    // InternalGitHubActions.g:623:4: ()
                    // InternalGitHubActions.g:624:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getGitHubContextAction_0_0(),
                    						current);
                    				

                    }

                    // InternalGitHubActions.g:630:4: ( (lv_context_1_0= ruleCONTEXT ) )
                    // InternalGitHubActions.g:631:5: (lv_context_1_0= ruleCONTEXT )
                    {
                    // InternalGitHubActions.g:631:5: (lv_context_1_0= ruleCONTEXT )
                    // InternalGitHubActions.g:632:6: lv_context_1_0= ruleCONTEXT
                    {

                    						newCompositeNode(grammarAccess.getAtomicAccess().getContextCONTEXTEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_context_1_0=ruleCONTEXT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicRule());
                    						}
                    						set(
                    							current,
                    							"context",
                    							lv_context_1_0,
                    							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.CONTEXT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGitHubActions.g:651:3: ( () ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // InternalGitHubActions.g:651:3: ( () ( (lv_name_3_0= RULE_ID ) ) )
                    // InternalGitHubActions.g:652:4: () ( (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalGitHubActions.g:652:4: ()
                    // InternalGitHubActions.g:653:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableReferenceAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGitHubActions.g:659:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalGitHubActions.g:660:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalGitHubActions.g:660:5: (lv_name_3_0= RULE_ID )
                    // InternalGitHubActions.g:661:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getAtomicAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGitHubActions.g:679:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // InternalGitHubActions.g:679:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    // InternalGitHubActions.g:680:4: () ( (lv_value_5_0= RULE_INT ) )
                    {
                    // InternalGitHubActions.g:680:4: ()
                    // InternalGitHubActions.g:681:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntegerLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGitHubActions.g:687:4: ( (lv_value_5_0= RULE_INT ) )
                    // InternalGitHubActions.g:688:5: (lv_value_5_0= RULE_INT )
                    {
                    // InternalGitHubActions.g:688:5: (lv_value_5_0= RULE_INT )
                    // InternalGitHubActions.g:689:6: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGitHubActions.g:707:3: ( () ( (lv_value_7_0= RULE_DOUBLE ) ) )
                    {
                    // InternalGitHubActions.g:707:3: ( () ( (lv_value_7_0= RULE_DOUBLE ) ) )
                    // InternalGitHubActions.g:708:4: () ( (lv_value_7_0= RULE_DOUBLE ) )
                    {
                    // InternalGitHubActions.g:708:4: ()
                    // InternalGitHubActions.g:709:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getDoubleLiteralAction_3_0(),
                    						current);
                    				

                    }

                    // InternalGitHubActions.g:715:4: ( (lv_value_7_0= RULE_DOUBLE ) )
                    // InternalGitHubActions.g:716:5: (lv_value_7_0= RULE_DOUBLE )
                    {
                    // InternalGitHubActions.g:716:5: (lv_value_7_0= RULE_DOUBLE )
                    // InternalGitHubActions.g:717:6: lv_value_7_0= RULE_DOUBLE
                    {
                    lv_value_7_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.DOUBLE");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGitHubActions.g:735:3: ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalGitHubActions.g:735:3: ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) )
                    // InternalGitHubActions.g:736:4: () ( (lv_value_9_0= RULE_BOOLEAN ) )
                    {
                    // InternalGitHubActions.g:736:4: ()
                    // InternalGitHubActions.g:737:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBooleanLiteralAction_4_0(),
                    						current);
                    				

                    }

                    // InternalGitHubActions.g:743:4: ( (lv_value_9_0= RULE_BOOLEAN ) )
                    // InternalGitHubActions.g:744:5: (lv_value_9_0= RULE_BOOLEAN )
                    {
                    // InternalGitHubActions.g:744:5: (lv_value_9_0= RULE_BOOLEAN )
                    // InternalGitHubActions.g:745:6: lv_value_9_0= RULE_BOOLEAN
                    {
                    lv_value_9_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    						newLeafNode(lv_value_9_0, grammarAccess.getAtomicAccess().getValueBOOLEANTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.BOOLEAN");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGitHubActions.g:763:3: ( () ( (lv_value_11_0= RULE_STRING ) ) )
                    {
                    // InternalGitHubActions.g:763:3: ( () ( (lv_value_11_0= RULE_STRING ) ) )
                    // InternalGitHubActions.g:764:4: () ( (lv_value_11_0= RULE_STRING ) )
                    {
                    // InternalGitHubActions.g:764:4: ()
                    // InternalGitHubActions.g:765:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringLiteralAction_5_0(),
                    						current);
                    				

                    }

                    // InternalGitHubActions.g:771:4: ( (lv_value_11_0= RULE_STRING ) )
                    // InternalGitHubActions.g:772:5: (lv_value_11_0= RULE_STRING )
                    {
                    // InternalGitHubActions.g:772:5: (lv_value_11_0= RULE_STRING )
                    // InternalGitHubActions.g:773:6: lv_value_11_0= RULE_STRING
                    {
                    lv_value_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_11_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleCallExpression"
    // InternalGitHubActions.g:794:1: entryRuleCallExpression returns [EObject current=null] : iv_ruleCallExpression= ruleCallExpression EOF ;
    public final EObject entryRuleCallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallExpression = null;


        try {
            // InternalGitHubActions.g:794:55: (iv_ruleCallExpression= ruleCallExpression EOF )
            // InternalGitHubActions.g:795:2: iv_ruleCallExpression= ruleCallExpression EOF
            {
             newCompositeNode(grammarAccess.getCallExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallExpression=ruleCallExpression();

            state._fsp--;

             current =iv_ruleCallExpression; 
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
    // $ANTLR end "entryRuleCallExpression"


    // $ANTLR start "ruleCallExpression"
    // InternalGitHubActions.g:801:1: ruleCallExpression returns [EObject current=null] : (this_Contains_0= ruleContains | this_StartsWith_1= ruleStartsWith | this_EndsWith_2= ruleEndsWith | this_Format_3= ruleFormat | this_Join_4= ruleJoin | this_ToJSON_5= ruleToJSON | this_FromJSON_6= ruleFromJSON | this_HashFiles_7= ruleHashFiles | this_Success_8= ruleSuccess | this_Always_9= ruleAlways | this_Failure_10= ruleFailure | this_Cancelled_11= ruleCancelled ) ;
    public final EObject ruleCallExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Contains_0 = null;

        EObject this_StartsWith_1 = null;

        EObject this_EndsWith_2 = null;

        EObject this_Format_3 = null;

        EObject this_Join_4 = null;

        EObject this_ToJSON_5 = null;

        EObject this_FromJSON_6 = null;

        EObject this_HashFiles_7 = null;

        EObject this_Success_8 = null;

        EObject this_Always_9 = null;

        EObject this_Failure_10 = null;

        EObject this_Cancelled_11 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:807:2: ( (this_Contains_0= ruleContains | this_StartsWith_1= ruleStartsWith | this_EndsWith_2= ruleEndsWith | this_Format_3= ruleFormat | this_Join_4= ruleJoin | this_ToJSON_5= ruleToJSON | this_FromJSON_6= ruleFromJSON | this_HashFiles_7= ruleHashFiles | this_Success_8= ruleSuccess | this_Always_9= ruleAlways | this_Failure_10= ruleFailure | this_Cancelled_11= ruleCancelled ) )
            // InternalGitHubActions.g:808:2: (this_Contains_0= ruleContains | this_StartsWith_1= ruleStartsWith | this_EndsWith_2= ruleEndsWith | this_Format_3= ruleFormat | this_Join_4= ruleJoin | this_ToJSON_5= ruleToJSON | this_FromJSON_6= ruleFromJSON | this_HashFiles_7= ruleHashFiles | this_Success_8= ruleSuccess | this_Always_9= ruleAlways | this_Failure_10= ruleFailure | this_Cancelled_11= ruleCancelled )
            {
            // InternalGitHubActions.g:808:2: (this_Contains_0= ruleContains | this_StartsWith_1= ruleStartsWith | this_EndsWith_2= ruleEndsWith | this_Format_3= ruleFormat | this_Join_4= ruleJoin | this_ToJSON_5= ruleToJSON | this_FromJSON_6= ruleFromJSON | this_HashFiles_7= ruleHashFiles | this_Success_8= ruleSuccess | this_Always_9= ruleAlways | this_Failure_10= ruleFailure | this_Cancelled_11= ruleCancelled )
            int alt10=12;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 23:
                {
                alt10=2;
                }
                break;
            case 24:
                {
                alt10=3;
                }
                break;
            case 25:
                {
                alt10=4;
                }
                break;
            case 26:
                {
                alt10=5;
                }
                break;
            case 27:
                {
                alt10=6;
                }
                break;
            case 28:
                {
                alt10=7;
                }
                break;
            case 29:
                {
                alt10=8;
                }
                break;
            case 30:
                {
                alt10=9;
                }
                break;
            case 31:
                {
                alt10=10;
                }
                break;
            case 33:
                {
                alt10=11;
                }
                break;
            case 32:
                {
                alt10=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalGitHubActions.g:809:3: this_Contains_0= ruleContains
                    {

                    			newCompositeNode(grammarAccess.getCallExpressionAccess().getContainsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Contains_0=ruleContains();

                    state._fsp--;


                    			current = this_Contains_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGitHubActions.g:818:3: this_StartsWith_1= ruleStartsWith
                    {

                    			newCompositeNode(grammarAccess.getCallExpressionAccess().getStartsWithParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StartsWith_1=ruleStartsWith();

                    state._fsp--;


                    			current = this_StartsWith_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGitHubActions.g:827:3: this_EndsWith_2= ruleEndsWith
                    {

                    			newCompositeNode(grammarAccess.getCallExpressionAccess().getEndsWithParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndsWith_2=ruleEndsWith();

                    state._fsp--;


                    			current = this_EndsWith_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGitHubActions.g:836:3: this_Format_3= ruleFormat
                    {

                    			newCompositeNode(grammarAccess.getCallExpressionAccess().getFormatParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Format_3=ruleFormat();

                    state._fsp--;


                    			current = this_Format_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGitHubActions.g:845:3: this_Join_4= ruleJoin
                    {

                    			newCompositeNode(grammarAccess.getCallExpressionAccess().getJoinParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Join_4=ruleJoin();

                    state._fsp--;


                    			current = this_Join_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGitHubActions.g:854:3: this_ToJSON_5= ruleToJSON
                    {

                    			newCompositeNode(grammarAccess.getCallExpressionAccess().getToJSONParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ToJSON_5=ruleToJSON();

                    state._fsp--;


                    			current = this_ToJSON_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalGitHubActions.g:863:3: this_FromJSON_6= ruleFromJSON
                    {

                    			newCompositeNode(grammarAccess.getCallExpressionAccess().getFromJSONParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_FromJSON_6=ruleFromJSON();

                    state._fsp--;


                    			current = this_FromJSON_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalGitHubActions.g:872:3: this_HashFiles_7= ruleHashFiles
                    {

                    			newCompositeNode(grammarAccess.getCallExpressionAccess().getHashFilesParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_HashFiles_7=ruleHashFiles();

                    state._fsp--;


                    			current = this_HashFiles_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalGitHubActions.g:881:3: this_Success_8= ruleSuccess
                    {

                    			newCompositeNode(grammarAccess.getCallExpressionAccess().getSuccessParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Success_8=ruleSuccess();

                    state._fsp--;


                    			current = this_Success_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalGitHubActions.g:890:3: this_Always_9= ruleAlways
                    {

                    			newCompositeNode(grammarAccess.getCallExpressionAccess().getAlwaysParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Always_9=ruleAlways();

                    state._fsp--;


                    			current = this_Always_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalGitHubActions.g:899:3: this_Failure_10= ruleFailure
                    {

                    			newCompositeNode(grammarAccess.getCallExpressionAccess().getFailureParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Failure_10=ruleFailure();

                    state._fsp--;


                    			current = this_Failure_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalGitHubActions.g:908:3: this_Cancelled_11= ruleCancelled
                    {

                    			newCompositeNode(grammarAccess.getCallExpressionAccess().getCancelledParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cancelled_11=ruleCancelled();

                    state._fsp--;


                    			current = this_Cancelled_11;
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
    // $ANTLR end "ruleCallExpression"


    // $ANTLR start "entryRuleContains"
    // InternalGitHubActions.g:920:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalGitHubActions.g:920:49: (iv_ruleContains= ruleContains EOF )
            // InternalGitHubActions.g:921:2: iv_ruleContains= ruleContains EOF
            {
             newCompositeNode(grammarAccess.getContainsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContains=ruleContains();

            state._fsp--;

             current =iv_ruleContains; 
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
    // $ANTLR end "entryRuleContains"


    // $ANTLR start "ruleContains"
    // InternalGitHubActions.g:927:1: ruleContains returns [EObject current=null] : (otherlv_0= 'contains' otherlv_1= '(' ( (lv_search_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_item_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_search_2_0 = null;

        EObject lv_item_4_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:933:2: ( (otherlv_0= 'contains' otherlv_1= '(' ( (lv_search_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_item_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalGitHubActions.g:934:2: (otherlv_0= 'contains' otherlv_1= '(' ( (lv_search_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_item_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalGitHubActions.g:934:2: (otherlv_0= 'contains' otherlv_1= '(' ( (lv_search_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_item_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalGitHubActions.g:935:3: otherlv_0= 'contains' otherlv_1= '(' ( (lv_search_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_item_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getContainsKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getContainsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGitHubActions.g:943:3: ( (lv_search_2_0= ruleExpression ) )
            // InternalGitHubActions.g:944:4: (lv_search_2_0= ruleExpression )
            {
            // InternalGitHubActions.g:944:4: (lv_search_2_0= ruleExpression )
            // InternalGitHubActions.g:945:5: lv_search_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getSearchExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_search_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainsRule());
            					}
            					set(
            						current,
            						"search",
            						lv_search_2_0,
            						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getContainsAccess().getCommaKeyword_3());
            		
            // InternalGitHubActions.g:966:3: ( (lv_item_4_0= ruleExpression ) )
            // InternalGitHubActions.g:967:4: (lv_item_4_0= ruleExpression )
            {
            // InternalGitHubActions.g:967:4: (lv_item_4_0= ruleExpression )
            // InternalGitHubActions.g:968:5: lv_item_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getItemExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_item_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainsRule());
            					}
            					set(
            						current,
            						"item",
            						lv_item_4_0,
            						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getContainsAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleContains"


    // $ANTLR start "entryRuleStartsWith"
    // InternalGitHubActions.g:993:1: entryRuleStartsWith returns [EObject current=null] : iv_ruleStartsWith= ruleStartsWith EOF ;
    public final EObject entryRuleStartsWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartsWith = null;


        try {
            // InternalGitHubActions.g:993:51: (iv_ruleStartsWith= ruleStartsWith EOF )
            // InternalGitHubActions.g:994:2: iv_ruleStartsWith= ruleStartsWith EOF
            {
             newCompositeNode(grammarAccess.getStartsWithRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartsWith=ruleStartsWith();

            state._fsp--;

             current =iv_ruleStartsWith; 
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
    // $ANTLR end "entryRuleStartsWith"


    // $ANTLR start "ruleStartsWith"
    // InternalGitHubActions.g:1000:1: ruleStartsWith returns [EObject current=null] : (otherlv_0= 'startsWith' otherlv_1= '(' ( (lv_searchString_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_searchValue_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleStartsWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_searchString_2_0 = null;

        EObject lv_searchValue_4_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:1006:2: ( (otherlv_0= 'startsWith' otherlv_1= '(' ( (lv_searchString_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_searchValue_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalGitHubActions.g:1007:2: (otherlv_0= 'startsWith' otherlv_1= '(' ( (lv_searchString_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_searchValue_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalGitHubActions.g:1007:2: (otherlv_0= 'startsWith' otherlv_1= '(' ( (lv_searchString_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_searchValue_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalGitHubActions.g:1008:3: otherlv_0= 'startsWith' otherlv_1= '(' ( (lv_searchString_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_searchValue_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getStartsWithAccess().getStartsWithKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStartsWithAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGitHubActions.g:1016:3: ( (lv_searchString_2_0= ruleExpression ) )
            // InternalGitHubActions.g:1017:4: (lv_searchString_2_0= ruleExpression )
            {
            // InternalGitHubActions.g:1017:4: (lv_searchString_2_0= ruleExpression )
            // InternalGitHubActions.g:1018:5: lv_searchString_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getStartsWithAccess().getSearchStringExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_searchString_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartsWithRule());
            					}
            					set(
            						current,
            						"searchString",
            						lv_searchString_2_0,
            						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getStartsWithAccess().getCommaKeyword_3());
            		
            // InternalGitHubActions.g:1039:3: ( (lv_searchValue_4_0= ruleExpression ) )
            // InternalGitHubActions.g:1040:4: (lv_searchValue_4_0= ruleExpression )
            {
            // InternalGitHubActions.g:1040:4: (lv_searchValue_4_0= ruleExpression )
            // InternalGitHubActions.g:1041:5: lv_searchValue_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getStartsWithAccess().getSearchValueExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_searchValue_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartsWithRule());
            					}
            					set(
            						current,
            						"searchValue",
            						lv_searchValue_4_0,
            						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStartsWithAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleStartsWith"


    // $ANTLR start "entryRuleEndsWith"
    // InternalGitHubActions.g:1066:1: entryRuleEndsWith returns [EObject current=null] : iv_ruleEndsWith= ruleEndsWith EOF ;
    public final EObject entryRuleEndsWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndsWith = null;


        try {
            // InternalGitHubActions.g:1066:49: (iv_ruleEndsWith= ruleEndsWith EOF )
            // InternalGitHubActions.g:1067:2: iv_ruleEndsWith= ruleEndsWith EOF
            {
             newCompositeNode(grammarAccess.getEndsWithRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndsWith=ruleEndsWith();

            state._fsp--;

             current =iv_ruleEndsWith; 
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
    // $ANTLR end "entryRuleEndsWith"


    // $ANTLR start "ruleEndsWith"
    // InternalGitHubActions.g:1073:1: ruleEndsWith returns [EObject current=null] : (otherlv_0= 'endsWith' otherlv_1= '(' ( (lv_searchString_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_searchValue_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleEndsWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_searchString_2_0 = null;

        EObject lv_searchValue_4_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:1079:2: ( (otherlv_0= 'endsWith' otherlv_1= '(' ( (lv_searchString_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_searchValue_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalGitHubActions.g:1080:2: (otherlv_0= 'endsWith' otherlv_1= '(' ( (lv_searchString_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_searchValue_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalGitHubActions.g:1080:2: (otherlv_0= 'endsWith' otherlv_1= '(' ( (lv_searchString_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_searchValue_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalGitHubActions.g:1081:3: otherlv_0= 'endsWith' otherlv_1= '(' ( (lv_searchString_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_searchValue_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEndsWithAccess().getEndsWithKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEndsWithAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGitHubActions.g:1089:3: ( (lv_searchString_2_0= ruleExpression ) )
            // InternalGitHubActions.g:1090:4: (lv_searchString_2_0= ruleExpression )
            {
            // InternalGitHubActions.g:1090:4: (lv_searchString_2_0= ruleExpression )
            // InternalGitHubActions.g:1091:5: lv_searchString_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEndsWithAccess().getSearchStringExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_searchString_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndsWithRule());
            					}
            					set(
            						current,
            						"searchString",
            						lv_searchString_2_0,
            						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getEndsWithAccess().getCommaKeyword_3());
            		
            // InternalGitHubActions.g:1112:3: ( (lv_searchValue_4_0= ruleExpression ) )
            // InternalGitHubActions.g:1113:4: (lv_searchValue_4_0= ruleExpression )
            {
            // InternalGitHubActions.g:1113:4: (lv_searchValue_4_0= ruleExpression )
            // InternalGitHubActions.g:1114:5: lv_searchValue_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEndsWithAccess().getSearchValueExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_searchValue_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndsWithRule());
            					}
            					set(
            						current,
            						"searchValue",
            						lv_searchValue_4_0,
            						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEndsWithAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleEndsWith"


    // $ANTLR start "entryRuleFormat"
    // InternalGitHubActions.g:1139:1: entryRuleFormat returns [EObject current=null] : iv_ruleFormat= ruleFormat EOF ;
    public final EObject entryRuleFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormat = null;


        try {
            // InternalGitHubActions.g:1139:47: (iv_ruleFormat= ruleFormat EOF )
            // InternalGitHubActions.g:1140:2: iv_ruleFormat= ruleFormat EOF
            {
             newCompositeNode(grammarAccess.getFormatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormat=ruleFormat();

            state._fsp--;

             current =iv_ruleFormat; 
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
    // $ANTLR end "entryRuleFormat"


    // $ANTLR start "ruleFormat"
    // InternalGitHubActions.g:1146:1: ruleFormat returns [EObject current=null] : (otherlv_0= 'format' otherlv_1= '(' ( (lv_string_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_replaceValues_4_0= ruleExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleFormat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_string_2_0 = null;

        EObject lv_replaceValues_4_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:1152:2: ( (otherlv_0= 'format' otherlv_1= '(' ( (lv_string_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_replaceValues_4_0= ruleExpression ) ) )* otherlv_5= ')' ) )
            // InternalGitHubActions.g:1153:2: (otherlv_0= 'format' otherlv_1= '(' ( (lv_string_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_replaceValues_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            {
            // InternalGitHubActions.g:1153:2: (otherlv_0= 'format' otherlv_1= '(' ( (lv_string_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_replaceValues_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            // InternalGitHubActions.g:1154:3: otherlv_0= 'format' otherlv_1= '(' ( (lv_string_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_replaceValues_4_0= ruleExpression ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFormatAccess().getFormatKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFormatAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGitHubActions.g:1162:3: ( (lv_string_2_0= ruleExpression ) )
            // InternalGitHubActions.g:1163:4: (lv_string_2_0= ruleExpression )
            {
            // InternalGitHubActions.g:1163:4: (lv_string_2_0= ruleExpression )
            // InternalGitHubActions.g:1164:5: lv_string_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFormatAccess().getStringExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_string_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormatRule());
            					}
            					set(
            						current,
            						"string",
            						lv_string_2_0,
            						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGitHubActions.g:1181:3: (otherlv_3= ',' ( (lv_replaceValues_4_0= ruleExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGitHubActions.g:1182:4: otherlv_3= ',' ( (lv_replaceValues_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFormatAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalGitHubActions.g:1186:4: ( (lv_replaceValues_4_0= ruleExpression ) )
            	    // InternalGitHubActions.g:1187:5: (lv_replaceValues_4_0= ruleExpression )
            	    {
            	    // InternalGitHubActions.g:1187:5: (lv_replaceValues_4_0= ruleExpression )
            	    // InternalGitHubActions.g:1188:6: lv_replaceValues_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getFormatAccess().getReplaceValuesExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_replaceValues_4_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormatRule());
            	    						}
            	    						add(
            	    							current,
            	    							"replaceValues",
            	    							lv_replaceValues_4_0,
            	    							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFormatAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleFormat"


    // $ANTLR start "entryRuleJoin"
    // InternalGitHubActions.g:1214:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalGitHubActions.g:1214:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalGitHubActions.g:1215:2: iv_ruleJoin= ruleJoin EOF
            {
             newCompositeNode(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoin=ruleJoin();

            state._fsp--;

             current =iv_ruleJoin; 
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
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // InternalGitHubActions.g:1221:1: ruleJoin returns [EObject current=null] : (otherlv_0= 'join' otherlv_1= '(' ( (lv_array_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_sep_4_0= ruleExpression ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_array_2_0 = null;

        EObject lv_sep_4_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:1227:2: ( (otherlv_0= 'join' otherlv_1= '(' ( (lv_array_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_sep_4_0= ruleExpression ) ) )? otherlv_5= ')' ) )
            // InternalGitHubActions.g:1228:2: (otherlv_0= 'join' otherlv_1= '(' ( (lv_array_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_sep_4_0= ruleExpression ) ) )? otherlv_5= ')' )
            {
            // InternalGitHubActions.g:1228:2: (otherlv_0= 'join' otherlv_1= '(' ( (lv_array_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_sep_4_0= ruleExpression ) ) )? otherlv_5= ')' )
            // InternalGitHubActions.g:1229:3: otherlv_0= 'join' otherlv_1= '(' ( (lv_array_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_sep_4_0= ruleExpression ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJoinKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGitHubActions.g:1237:3: ( (lv_array_2_0= ruleExpression ) )
            // InternalGitHubActions.g:1238:4: (lv_array_2_0= ruleExpression )
            {
            // InternalGitHubActions.g:1238:4: (lv_array_2_0= ruleExpression )
            // InternalGitHubActions.g:1239:5: lv_array_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getJoinAccess().getArrayExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_array_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJoinRule());
            					}
            					set(
            						current,
            						"array",
            						lv_array_2_0,
            						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGitHubActions.g:1256:3: (otherlv_3= ',' ( (lv_sep_4_0= ruleExpression ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGitHubActions.g:1257:4: otherlv_3= ',' ( (lv_sep_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getJoinAccess().getCommaKeyword_3_0());
                    			
                    // InternalGitHubActions.g:1261:4: ( (lv_sep_4_0= ruleExpression ) )
                    // InternalGitHubActions.g:1262:5: (lv_sep_4_0= ruleExpression )
                    {
                    // InternalGitHubActions.g:1262:5: (lv_sep_4_0= ruleExpression )
                    // InternalGitHubActions.g:1263:6: lv_sep_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getJoinAccess().getSepExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_sep_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJoinRule());
                    						}
                    						set(
                    							current,
                    							"sep",
                    							lv_sep_4_0,
                    							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getJoinAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleToJSON"
    // InternalGitHubActions.g:1289:1: entryRuleToJSON returns [EObject current=null] : iv_ruleToJSON= ruleToJSON EOF ;
    public final EObject entryRuleToJSON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToJSON = null;


        try {
            // InternalGitHubActions.g:1289:47: (iv_ruleToJSON= ruleToJSON EOF )
            // InternalGitHubActions.g:1290:2: iv_ruleToJSON= ruleToJSON EOF
            {
             newCompositeNode(grammarAccess.getToJSONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToJSON=ruleToJSON();

            state._fsp--;

             current =iv_ruleToJSON; 
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
    // $ANTLR end "entryRuleToJSON"


    // $ANTLR start "ruleToJSON"
    // InternalGitHubActions.g:1296:1: ruleToJSON returns [EObject current=null] : (otherlv_0= 'toJSON' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleToJSON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:1302:2: ( (otherlv_0= 'toJSON' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalGitHubActions.g:1303:2: (otherlv_0= 'toJSON' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalGitHubActions.g:1303:2: (otherlv_0= 'toJSON' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalGitHubActions.g:1304:3: otherlv_0= 'toJSON' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getToJSONAccess().getToJSONKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getToJSONAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGitHubActions.g:1312:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalGitHubActions.g:1313:4: (lv_value_2_0= ruleExpression )
            {
            // InternalGitHubActions.g:1313:4: (lv_value_2_0= ruleExpression )
            // InternalGitHubActions.g:1314:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getToJSONAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getToJSONRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getToJSONAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleToJSON"


    // $ANTLR start "entryRuleFromJSON"
    // InternalGitHubActions.g:1339:1: entryRuleFromJSON returns [EObject current=null] : iv_ruleFromJSON= ruleFromJSON EOF ;
    public final EObject entryRuleFromJSON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromJSON = null;


        try {
            // InternalGitHubActions.g:1339:49: (iv_ruleFromJSON= ruleFromJSON EOF )
            // InternalGitHubActions.g:1340:2: iv_ruleFromJSON= ruleFromJSON EOF
            {
             newCompositeNode(grammarAccess.getFromJSONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFromJSON=ruleFromJSON();

            state._fsp--;

             current =iv_ruleFromJSON; 
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
    // $ANTLR end "entryRuleFromJSON"


    // $ANTLR start "ruleFromJSON"
    // InternalGitHubActions.g:1346:1: ruleFromJSON returns [EObject current=null] : (otherlv_0= 'fromJSON' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleFromJSON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:1352:2: ( (otherlv_0= 'fromJSON' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalGitHubActions.g:1353:2: (otherlv_0= 'fromJSON' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalGitHubActions.g:1353:2: (otherlv_0= 'fromJSON' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalGitHubActions.g:1354:3: otherlv_0= 'fromJSON' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFromJSONAccess().getFromJSONKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFromJSONAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGitHubActions.g:1362:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalGitHubActions.g:1363:4: (lv_value_2_0= ruleExpression )
            {
            // InternalGitHubActions.g:1363:4: (lv_value_2_0= ruleExpression )
            // InternalGitHubActions.g:1364:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFromJSONAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFromJSONRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFromJSONAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFromJSON"


    // $ANTLR start "entryRuleHashFiles"
    // InternalGitHubActions.g:1389:1: entryRuleHashFiles returns [EObject current=null] : iv_ruleHashFiles= ruleHashFiles EOF ;
    public final EObject entryRuleHashFiles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashFiles = null;


        try {
            // InternalGitHubActions.g:1389:50: (iv_ruleHashFiles= ruleHashFiles EOF )
            // InternalGitHubActions.g:1390:2: iv_ruleHashFiles= ruleHashFiles EOF
            {
             newCompositeNode(grammarAccess.getHashFilesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHashFiles=ruleHashFiles();

            state._fsp--;

             current =iv_ruleHashFiles; 
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
    // $ANTLR end "entryRuleHashFiles"


    // $ANTLR start "ruleHashFiles"
    // InternalGitHubActions.g:1396:1: ruleHashFiles returns [EObject current=null] : (otherlv_0= 'hashFiles' otherlv_1= '(' ( (lv_path_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleHashFiles() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalGitHubActions.g:1402:2: ( (otherlv_0= 'hashFiles' otherlv_1= '(' ( (lv_path_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalGitHubActions.g:1403:2: (otherlv_0= 'hashFiles' otherlv_1= '(' ( (lv_path_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalGitHubActions.g:1403:2: (otherlv_0= 'hashFiles' otherlv_1= '(' ( (lv_path_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalGitHubActions.g:1404:3: otherlv_0= 'hashFiles' otherlv_1= '(' ( (lv_path_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getHashFilesAccess().getHashFilesKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHashFilesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGitHubActions.g:1412:3: ( (lv_path_2_0= ruleExpression ) )
            // InternalGitHubActions.g:1413:4: (lv_path_2_0= ruleExpression )
            {
            // InternalGitHubActions.g:1413:4: (lv_path_2_0= ruleExpression )
            // InternalGitHubActions.g:1414:5: lv_path_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getHashFilesAccess().getPathExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_path_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHashFilesRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_2_0,
            						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getHashFilesAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleHashFiles"


    // $ANTLR start "entryRuleSuccess"
    // InternalGitHubActions.g:1439:1: entryRuleSuccess returns [EObject current=null] : iv_ruleSuccess= ruleSuccess EOF ;
    public final EObject entryRuleSuccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuccess = null;


        try {
            // InternalGitHubActions.g:1439:48: (iv_ruleSuccess= ruleSuccess EOF )
            // InternalGitHubActions.g:1440:2: iv_ruleSuccess= ruleSuccess EOF
            {
             newCompositeNode(grammarAccess.getSuccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuccess=ruleSuccess();

            state._fsp--;

             current =iv_ruleSuccess; 
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
    // $ANTLR end "entryRuleSuccess"


    // $ANTLR start "ruleSuccess"
    // InternalGitHubActions.g:1446:1: ruleSuccess returns [EObject current=null] : ( () otherlv_1= 'success' otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleSuccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGitHubActions.g:1452:2: ( ( () otherlv_1= 'success' otherlv_2= '(' otherlv_3= ')' ) )
            // InternalGitHubActions.g:1453:2: ( () otherlv_1= 'success' otherlv_2= '(' otherlv_3= ')' )
            {
            // InternalGitHubActions.g:1453:2: ( () otherlv_1= 'success' otherlv_2= '(' otherlv_3= ')' )
            // InternalGitHubActions.g:1454:3: () otherlv_1= 'success' otherlv_2= '(' otherlv_3= ')'
            {
            // InternalGitHubActions.g:1454:3: ()
            // InternalGitHubActions.g:1455:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSuccessAccess().getSuccessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSuccessAccess().getSuccessKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSuccessAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSuccessAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleSuccess"


    // $ANTLR start "entryRuleAlways"
    // InternalGitHubActions.g:1477:1: entryRuleAlways returns [EObject current=null] : iv_ruleAlways= ruleAlways EOF ;
    public final EObject entryRuleAlways() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlways = null;


        try {
            // InternalGitHubActions.g:1477:47: (iv_ruleAlways= ruleAlways EOF )
            // InternalGitHubActions.g:1478:2: iv_ruleAlways= ruleAlways EOF
            {
             newCompositeNode(grammarAccess.getAlwaysRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlways=ruleAlways();

            state._fsp--;

             current =iv_ruleAlways; 
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
    // $ANTLR end "entryRuleAlways"


    // $ANTLR start "ruleAlways"
    // InternalGitHubActions.g:1484:1: ruleAlways returns [EObject current=null] : ( () otherlv_1= 'always' otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleAlways() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGitHubActions.g:1490:2: ( ( () otherlv_1= 'always' otherlv_2= '(' otherlv_3= ')' ) )
            // InternalGitHubActions.g:1491:2: ( () otherlv_1= 'always' otherlv_2= '(' otherlv_3= ')' )
            {
            // InternalGitHubActions.g:1491:2: ( () otherlv_1= 'always' otherlv_2= '(' otherlv_3= ')' )
            // InternalGitHubActions.g:1492:3: () otherlv_1= 'always' otherlv_2= '(' otherlv_3= ')'
            {
            // InternalGitHubActions.g:1492:3: ()
            // InternalGitHubActions.g:1493:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlwaysAccess().getAlwaysAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAlwaysAccess().getAlwaysKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAlwaysAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAlwaysAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleAlways"


    // $ANTLR start "entryRuleCancelled"
    // InternalGitHubActions.g:1515:1: entryRuleCancelled returns [EObject current=null] : iv_ruleCancelled= ruleCancelled EOF ;
    public final EObject entryRuleCancelled() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCancelled = null;


        try {
            // InternalGitHubActions.g:1515:50: (iv_ruleCancelled= ruleCancelled EOF )
            // InternalGitHubActions.g:1516:2: iv_ruleCancelled= ruleCancelled EOF
            {
             newCompositeNode(grammarAccess.getCancelledRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCancelled=ruleCancelled();

            state._fsp--;

             current =iv_ruleCancelled; 
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
    // $ANTLR end "entryRuleCancelled"


    // $ANTLR start "ruleCancelled"
    // InternalGitHubActions.g:1522:1: ruleCancelled returns [EObject current=null] : ( () otherlv_1= 'cancelled' otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleCancelled() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGitHubActions.g:1528:2: ( ( () otherlv_1= 'cancelled' otherlv_2= '(' otherlv_3= ')' ) )
            // InternalGitHubActions.g:1529:2: ( () otherlv_1= 'cancelled' otherlv_2= '(' otherlv_3= ')' )
            {
            // InternalGitHubActions.g:1529:2: ( () otherlv_1= 'cancelled' otherlv_2= '(' otherlv_3= ')' )
            // InternalGitHubActions.g:1530:3: () otherlv_1= 'cancelled' otherlv_2= '(' otherlv_3= ')'
            {
            // InternalGitHubActions.g:1530:3: ()
            // InternalGitHubActions.g:1531:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCancelledAccess().getCancelledAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCancelledAccess().getCancelledKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getCancelledAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCancelledAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleCancelled"


    // $ANTLR start "entryRuleFailure"
    // InternalGitHubActions.g:1553:1: entryRuleFailure returns [EObject current=null] : iv_ruleFailure= ruleFailure EOF ;
    public final EObject entryRuleFailure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFailure = null;


        try {
            // InternalGitHubActions.g:1553:48: (iv_ruleFailure= ruleFailure EOF )
            // InternalGitHubActions.g:1554:2: iv_ruleFailure= ruleFailure EOF
            {
             newCompositeNode(grammarAccess.getFailureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFailure=ruleFailure();

            state._fsp--;

             current =iv_ruleFailure; 
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
    // $ANTLR end "entryRuleFailure"


    // $ANTLR start "ruleFailure"
    // InternalGitHubActions.g:1560:1: ruleFailure returns [EObject current=null] : ( () otherlv_1= 'failure' otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleFailure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGitHubActions.g:1566:2: ( ( () otherlv_1= 'failure' otherlv_2= '(' otherlv_3= ')' ) )
            // InternalGitHubActions.g:1567:2: ( () otherlv_1= 'failure' otherlv_2= '(' otherlv_3= ')' )
            {
            // InternalGitHubActions.g:1567:2: ( () otherlv_1= 'failure' otherlv_2= '(' otherlv_3= ')' )
            // InternalGitHubActions.g:1568:3: () otherlv_1= 'failure' otherlv_2= '(' otherlv_3= ')'
            {
            // InternalGitHubActions.g:1568:3: ()
            // InternalGitHubActions.g:1569:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFailureAccess().getFailureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getFailureAccess().getFailureKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getFailureAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFailureAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFailure"


    // $ANTLR start "ruleCOMPARISON_OP"
    // InternalGitHubActions.g:1591:1: ruleCOMPARISON_OP returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) ) ;
    public final Enumerator ruleCOMPARISON_OP() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalGitHubActions.g:1597:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) ) )
            // InternalGitHubActions.g:1598:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) )
            {
            // InternalGitHubActions.g:1598:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt13=1;
                }
                break;
            case 35:
                {
                alt13=2;
                }
                break;
            case 36:
                {
                alt13=3;
                }
                break;
            case 37:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalGitHubActions.g:1599:3: (enumLiteral_0= '>' )
                    {
                    // InternalGitHubActions.g:1599:3: (enumLiteral_0= '>' )
                    // InternalGitHubActions.g:1600:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPAccess().getGTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOMPARISON_OPAccess().getGTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGitHubActions.g:1607:3: (enumLiteral_1= '>=' )
                    {
                    // InternalGitHubActions.g:1607:3: (enumLiteral_1= '>=' )
                    // InternalGitHubActions.g:1608:4: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPAccess().getGTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOMPARISON_OPAccess().getGTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGitHubActions.g:1615:3: (enumLiteral_2= '<' )
                    {
                    // InternalGitHubActions.g:1615:3: (enumLiteral_2= '<' )
                    // InternalGitHubActions.g:1616:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPAccess().getLTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOMPARISON_OPAccess().getLTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGitHubActions.g:1623:3: (enumLiteral_3= '<=' )
                    {
                    // InternalGitHubActions.g:1623:3: (enumLiteral_3= '<=' )
                    // InternalGitHubActions.g:1624:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPAccess().getLTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCOMPARISON_OPAccess().getLTEEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleCOMPARISON_OP"


    // $ANTLR start "ruleEQUALITY_OP"
    // InternalGitHubActions.g:1634:1: ruleEQUALITY_OP returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleEQUALITY_OP() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGitHubActions.g:1640:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // InternalGitHubActions.g:1641:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalGitHubActions.g:1641:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            else if ( (LA14_0==39) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalGitHubActions.g:1642:3: (enumLiteral_0= '==' )
                    {
                    // InternalGitHubActions.g:1642:3: (enumLiteral_0= '==' )
                    // InternalGitHubActions.g:1643:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getEQUALITY_OPAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEQUALITY_OPAccess().getEQUALSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGitHubActions.g:1650:3: (enumLiteral_1= '!=' )
                    {
                    // InternalGitHubActions.g:1650:3: (enumLiteral_1= '!=' )
                    // InternalGitHubActions.g:1651:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getEQUALITY_OPAccess().getNOT_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEQUALITY_OPAccess().getNOT_EQUALSEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleEQUALITY_OP"


    // $ANTLR start "ruleCONTEXT"
    // InternalGitHubActions.g:1661:1: ruleCONTEXT returns [Enumerator current=null] : ( (enumLiteral_0= 'github' ) | (enumLiteral_1= 'env' ) | (enumLiteral_2= 'vars' ) | (enumLiteral_3= 'job' ) | (enumLiteral_4= 'jobs' ) | (enumLiteral_5= 'steps' ) | (enumLiteral_6= 'runner' ) | (enumLiteral_7= 'secrets' ) | (enumLiteral_8= 'strategy' ) | (enumLiteral_9= 'matrix' ) | (enumLiteral_10= 'needs' ) | (enumLiteral_11= 'inputs' ) ) ;
    public final Enumerator ruleCONTEXT() throws RecognitionException {
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
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalGitHubActions.g:1667:2: ( ( (enumLiteral_0= 'github' ) | (enumLiteral_1= 'env' ) | (enumLiteral_2= 'vars' ) | (enumLiteral_3= 'job' ) | (enumLiteral_4= 'jobs' ) | (enumLiteral_5= 'steps' ) | (enumLiteral_6= 'runner' ) | (enumLiteral_7= 'secrets' ) | (enumLiteral_8= 'strategy' ) | (enumLiteral_9= 'matrix' ) | (enumLiteral_10= 'needs' ) | (enumLiteral_11= 'inputs' ) ) )
            // InternalGitHubActions.g:1668:2: ( (enumLiteral_0= 'github' ) | (enumLiteral_1= 'env' ) | (enumLiteral_2= 'vars' ) | (enumLiteral_3= 'job' ) | (enumLiteral_4= 'jobs' ) | (enumLiteral_5= 'steps' ) | (enumLiteral_6= 'runner' ) | (enumLiteral_7= 'secrets' ) | (enumLiteral_8= 'strategy' ) | (enumLiteral_9= 'matrix' ) | (enumLiteral_10= 'needs' ) | (enumLiteral_11= 'inputs' ) )
            {
            // InternalGitHubActions.g:1668:2: ( (enumLiteral_0= 'github' ) | (enumLiteral_1= 'env' ) | (enumLiteral_2= 'vars' ) | (enumLiteral_3= 'job' ) | (enumLiteral_4= 'jobs' ) | (enumLiteral_5= 'steps' ) | (enumLiteral_6= 'runner' ) | (enumLiteral_7= 'secrets' ) | (enumLiteral_8= 'strategy' ) | (enumLiteral_9= 'matrix' ) | (enumLiteral_10= 'needs' ) | (enumLiteral_11= 'inputs' ) )
            int alt15=12;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt15=1;
                }
                break;
            case 41:
                {
                alt15=2;
                }
                break;
            case 42:
                {
                alt15=3;
                }
                break;
            case 43:
                {
                alt15=4;
                }
                break;
            case 44:
                {
                alt15=5;
                }
                break;
            case 45:
                {
                alt15=6;
                }
                break;
            case 46:
                {
                alt15=7;
                }
                break;
            case 47:
                {
                alt15=8;
                }
                break;
            case 48:
                {
                alt15=9;
                }
                break;
            case 49:
                {
                alt15=10;
                }
                break;
            case 50:
                {
                alt15=11;
                }
                break;
            case 51:
                {
                alt15=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalGitHubActions.g:1669:3: (enumLiteral_0= 'github' )
                    {
                    // InternalGitHubActions.g:1669:3: (enumLiteral_0= 'github' )
                    // InternalGitHubActions.g:1670:4: enumLiteral_0= 'github'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getCONTEXTAccess().getGITHUBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCONTEXTAccess().getGITHUBEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGitHubActions.g:1677:3: (enumLiteral_1= 'env' )
                    {
                    // InternalGitHubActions.g:1677:3: (enumLiteral_1= 'env' )
                    // InternalGitHubActions.g:1678:4: enumLiteral_1= 'env'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getCONTEXTAccess().getENVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCONTEXTAccess().getENVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGitHubActions.g:1685:3: (enumLiteral_2= 'vars' )
                    {
                    // InternalGitHubActions.g:1685:3: (enumLiteral_2= 'vars' )
                    // InternalGitHubActions.g:1686:4: enumLiteral_2= 'vars'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getCONTEXTAccess().getVARSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCONTEXTAccess().getVARSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGitHubActions.g:1693:3: (enumLiteral_3= 'job' )
                    {
                    // InternalGitHubActions.g:1693:3: (enumLiteral_3= 'job' )
                    // InternalGitHubActions.g:1694:4: enumLiteral_3= 'job'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getCONTEXTAccess().getJOBEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCONTEXTAccess().getJOBEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGitHubActions.g:1701:3: (enumLiteral_4= 'jobs' )
                    {
                    // InternalGitHubActions.g:1701:3: (enumLiteral_4= 'jobs' )
                    // InternalGitHubActions.g:1702:4: enumLiteral_4= 'jobs'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getCONTEXTAccess().getJOBSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCONTEXTAccess().getJOBSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGitHubActions.g:1709:3: (enumLiteral_5= 'steps' )
                    {
                    // InternalGitHubActions.g:1709:3: (enumLiteral_5= 'steps' )
                    // InternalGitHubActions.g:1710:4: enumLiteral_5= 'steps'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getCONTEXTAccess().getSTEPSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getCONTEXTAccess().getSTEPSEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGitHubActions.g:1717:3: (enumLiteral_6= 'runner' )
                    {
                    // InternalGitHubActions.g:1717:3: (enumLiteral_6= 'runner' )
                    // InternalGitHubActions.g:1718:4: enumLiteral_6= 'runner'
                    {
                    enumLiteral_6=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getCONTEXTAccess().getRUNNEREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getCONTEXTAccess().getRUNNEREnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalGitHubActions.g:1725:3: (enumLiteral_7= 'secrets' )
                    {
                    // InternalGitHubActions.g:1725:3: (enumLiteral_7= 'secrets' )
                    // InternalGitHubActions.g:1726:4: enumLiteral_7= 'secrets'
                    {
                    enumLiteral_7=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getCONTEXTAccess().getSECRETSEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getCONTEXTAccess().getSECRETSEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalGitHubActions.g:1733:3: (enumLiteral_8= 'strategy' )
                    {
                    // InternalGitHubActions.g:1733:3: (enumLiteral_8= 'strategy' )
                    // InternalGitHubActions.g:1734:4: enumLiteral_8= 'strategy'
                    {
                    enumLiteral_8=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getCONTEXTAccess().getSTRATEGYEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getCONTEXTAccess().getSTRATEGYEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalGitHubActions.g:1741:3: (enumLiteral_9= 'matrix' )
                    {
                    // InternalGitHubActions.g:1741:3: (enumLiteral_9= 'matrix' )
                    // InternalGitHubActions.g:1742:4: enumLiteral_9= 'matrix'
                    {
                    enumLiteral_9=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getCONTEXTAccess().getMATRIXEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getCONTEXTAccess().getMATRIXEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalGitHubActions.g:1749:3: (enumLiteral_10= 'needs' )
                    {
                    // InternalGitHubActions.g:1749:3: (enumLiteral_10= 'needs' )
                    // InternalGitHubActions.g:1750:4: enumLiteral_10= 'needs'
                    {
                    enumLiteral_10=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getCONTEXTAccess().getNEEDSEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getCONTEXTAccess().getNEEDSEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalGitHubActions.g:1757:3: (enumLiteral_11= 'inputs' )
                    {
                    // InternalGitHubActions.g:1757:3: (enumLiteral_11= 'inputs' )
                    // InternalGitHubActions.g:1758:4: enumLiteral_11= 'inputs'
                    {
                    enumLiteral_11=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getCONTEXTAccess().getINPUTSEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getCONTEXTAccess().getINPUTSEnumLiteralDeclaration_11());
                    			

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
    // $ANTLR end "ruleCONTEXT"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000FFF03FFA881F0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000500000L});

}