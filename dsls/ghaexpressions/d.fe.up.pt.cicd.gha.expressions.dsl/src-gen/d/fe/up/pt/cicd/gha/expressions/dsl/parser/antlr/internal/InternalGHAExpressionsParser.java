package d.fe.up.pt.cicd.gha.expressions.dsl.parser.antlr.internal;

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
import d.fe.up.pt.cicd.gha.expressions.dsl.services.GHAExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGHAExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VARIABLE_REFERENCE", "RULE_INT", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'!'", "'('", "')'", "','", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=7;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_VARIABLE_REFERENCE=5;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGHAExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGHAExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGHAExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGHAExpressions.g"; }



     	private GHAExpressionsGrammarAccess grammarAccess;

        public InternalGHAExpressionsParser(TokenStream input, GHAExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Expression";
       	}

       	@Override
       	protected GHAExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExpression"
    // InternalGHAExpressions.g:65:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGHAExpressions.g:65:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGHAExpressions.g:66:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalGHAExpressions.g:72:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalGHAExpressions.g:78:2: (this_Or_0= ruleOr )
            // InternalGHAExpressions.g:79:2: this_Or_0= ruleOr
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
    // InternalGHAExpressions.g:90:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalGHAExpressions.g:90:43: (iv_ruleOr= ruleOr EOF )
            // InternalGHAExpressions.g:91:2: iv_ruleOr= ruleOr EOF
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
    // InternalGHAExpressions.g:97:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalGHAExpressions.g:103:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* ) )
            // InternalGHAExpressions.g:104:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* )
            {
            // InternalGHAExpressions.g:104:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )* )
            // InternalGHAExpressions.g:105:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGHAExpressions.g:113:3: ( () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGHAExpressions.g:114:4: () otherlv_2= '||' ( (lv_rhs_3_0= ruleAnd ) )
            	    {
            	    // InternalGHAExpressions.g:114:4: ()
            	    // InternalGHAExpressions.g:115:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalGHAExpressions.g:125:4: ( (lv_rhs_3_0= ruleAnd ) )
            	    // InternalGHAExpressions.g:126:5: (lv_rhs_3_0= ruleAnd )
            	    {
            	    // InternalGHAExpressions.g:126:5: (lv_rhs_3_0= ruleAnd )
            	    // InternalGHAExpressions.g:127:6: lv_rhs_3_0= ruleAnd
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
            	    							"d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.And");
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
    // InternalGHAExpressions.g:149:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalGHAExpressions.g:149:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalGHAExpressions.g:150:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalGHAExpressions.g:156:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalGHAExpressions.g:162:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* ) )
            // InternalGHAExpressions.g:163:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* )
            {
            // InternalGHAExpressions.g:163:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )* )
            // InternalGHAExpressions.g:164:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGHAExpressions.g:172:3: ( () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGHAExpressions.g:173:4: () otherlv_2= '&&' ( (lv_rhs_3_0= ruleEquality ) )
            	    {
            	    // InternalGHAExpressions.g:173:4: ()
            	    // InternalGHAExpressions.g:174:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalGHAExpressions.g:184:4: ( (lv_rhs_3_0= ruleEquality ) )
            	    // InternalGHAExpressions.g:185:5: (lv_rhs_3_0= ruleEquality )
            	    {
            	    // InternalGHAExpressions.g:185:5: (lv_rhs_3_0= ruleEquality )
            	    // InternalGHAExpressions.g:186:6: lv_rhs_3_0= ruleEquality
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
            	    							"d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.Equality");
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
    // InternalGHAExpressions.g:208:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalGHAExpressions.g:208:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalGHAExpressions.g:209:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalGHAExpressions.g:215:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_op_2_0= ruleEQUALITY_OP ) ) ( (lv_rhs_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalGHAExpressions.g:221:2: ( (this_Comparison_0= ruleComparison ( () ( (lv_op_2_0= ruleEQUALITY_OP ) ) ( (lv_rhs_3_0= ruleComparison ) ) )* ) )
            // InternalGHAExpressions.g:222:2: (this_Comparison_0= ruleComparison ( () ( (lv_op_2_0= ruleEQUALITY_OP ) ) ( (lv_rhs_3_0= ruleComparison ) ) )* )
            {
            // InternalGHAExpressions.g:222:2: (this_Comparison_0= ruleComparison ( () ( (lv_op_2_0= ruleEQUALITY_OP ) ) ( (lv_rhs_3_0= ruleComparison ) ) )* )
            // InternalGHAExpressions.g:223:3: this_Comparison_0= ruleComparison ( () ( (lv_op_2_0= ruleEQUALITY_OP ) ) ( (lv_rhs_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGHAExpressions.g:231:3: ( () ( (lv_op_2_0= ruleEQUALITY_OP ) ) ( (lv_rhs_3_0= ruleComparison ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=24 && LA3_0<=25)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGHAExpressions.g:232:4: () ( (lv_op_2_0= ruleEQUALITY_OP ) ) ( (lv_rhs_3_0= ruleComparison ) )
            	    {
            	    // InternalGHAExpressions.g:232:4: ()
            	    // InternalGHAExpressions.g:233:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalGHAExpressions.g:239:4: ( (lv_op_2_0= ruleEQUALITY_OP ) )
            	    // InternalGHAExpressions.g:240:5: (lv_op_2_0= ruleEQUALITY_OP )
            	    {
            	    // InternalGHAExpressions.g:240:5: (lv_op_2_0= ruleEQUALITY_OP )
            	    // InternalGHAExpressions.g:241:6: lv_op_2_0= ruleEQUALITY_OP
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
            	    							"d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.EQUALITY_OP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalGHAExpressions.g:258:4: ( (lv_rhs_3_0= ruleComparison ) )
            	    // InternalGHAExpressions.g:259:5: (lv_rhs_3_0= ruleComparison )
            	    {
            	    // InternalGHAExpressions.g:259:5: (lv_rhs_3_0= ruleComparison )
            	    // InternalGHAExpressions.g:260:6: lv_rhs_3_0= ruleComparison
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
            	    							"d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.Comparison");
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
    // InternalGHAExpressions.g:282:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalGHAExpressions.g:282:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalGHAExpressions.g:283:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalGHAExpressions.g:289:1: ruleComparison returns [EObject current=null] : (this_UnaryOp_0= ruleUnaryOp ( () ( (lv_op_2_0= ruleCOMPARISON_OP ) ) ( (lv_rhs_3_0= ruleUnaryOp ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOp_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalGHAExpressions.g:295:2: ( (this_UnaryOp_0= ruleUnaryOp ( () ( (lv_op_2_0= ruleCOMPARISON_OP ) ) ( (lv_rhs_3_0= ruleUnaryOp ) ) )* ) )
            // InternalGHAExpressions.g:296:2: (this_UnaryOp_0= ruleUnaryOp ( () ( (lv_op_2_0= ruleCOMPARISON_OP ) ) ( (lv_rhs_3_0= ruleUnaryOp ) ) )* )
            {
            // InternalGHAExpressions.g:296:2: (this_UnaryOp_0= ruleUnaryOp ( () ( (lv_op_2_0= ruleCOMPARISON_OP ) ) ( (lv_rhs_3_0= ruleUnaryOp ) ) )* )
            // InternalGHAExpressions.g:297:3: this_UnaryOp_0= ruleUnaryOp ( () ( (lv_op_2_0= ruleCOMPARISON_OP ) ) ( (lv_rhs_3_0= ruleUnaryOp ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getUnaryOpParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_UnaryOp_0=ruleUnaryOp();

            state._fsp--;


            			current = this_UnaryOp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGHAExpressions.g:305:3: ( () ( (lv_op_2_0= ruleCOMPARISON_OP ) ) ( (lv_rhs_3_0= ruleUnaryOp ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=20 && LA4_0<=23)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGHAExpressions.g:306:4: () ( (lv_op_2_0= ruleCOMPARISON_OP ) ) ( (lv_rhs_3_0= ruleUnaryOp ) )
            	    {
            	    // InternalGHAExpressions.g:306:4: ()
            	    // InternalGHAExpressions.g:307:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalGHAExpressions.g:313:4: ( (lv_op_2_0= ruleCOMPARISON_OP ) )
            	    // InternalGHAExpressions.g:314:5: (lv_op_2_0= ruleCOMPARISON_OP )
            	    {
            	    // InternalGHAExpressions.g:314:5: (lv_op_2_0= ruleCOMPARISON_OP )
            	    // InternalGHAExpressions.g:315:6: lv_op_2_0= ruleCOMPARISON_OP
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
            	    							"d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.COMPARISON_OP");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalGHAExpressions.g:332:4: ( (lv_rhs_3_0= ruleUnaryOp ) )
            	    // InternalGHAExpressions.g:333:5: (lv_rhs_3_0= ruleUnaryOp )
            	    {
            	    // InternalGHAExpressions.g:333:5: (lv_rhs_3_0= ruleUnaryOp )
            	    // InternalGHAExpressions.g:334:6: lv_rhs_3_0= ruleUnaryOp
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
            	    							"d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.UnaryOp");
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
    // InternalGHAExpressions.g:356:1: entryRuleUnaryOp returns [EObject current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final EObject entryRuleUnaryOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOp = null;


        try {
            // InternalGHAExpressions.g:356:48: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // InternalGHAExpressions.g:357:2: iv_ruleUnaryOp= ruleUnaryOp EOF
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
    // InternalGHAExpressions.g:363:1: ruleUnaryOp returns [EObject current=null] : (this_Not_0= ruleNot | this_Primary_1= rulePrimary ) ;
    public final EObject ruleUnaryOp() throws RecognitionException {
        EObject current = null;

        EObject this_Not_0 = null;

        EObject this_Primary_1 = null;



        	enterRule();

        try {
            // InternalGHAExpressions.g:369:2: ( (this_Not_0= ruleNot | this_Primary_1= rulePrimary ) )
            // InternalGHAExpressions.g:370:2: (this_Not_0= ruleNot | this_Primary_1= rulePrimary )
            {
            // InternalGHAExpressions.g:370:2: (this_Not_0= ruleNot | this_Primary_1= rulePrimary )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)||LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGHAExpressions.g:371:3: this_Not_0= ruleNot
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
                    // InternalGHAExpressions.g:380:3: this_Primary_1= rulePrimary
                    {

                    			newCompositeNode(grammarAccess.getUnaryOpAccess().getPrimaryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Primary_1=rulePrimary();

                    state._fsp--;


                    			current = this_Primary_1;
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
    // InternalGHAExpressions.g:392:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalGHAExpressions.g:392:44: (iv_ruleNot= ruleNot EOF )
            // InternalGHAExpressions.g:393:2: iv_ruleNot= ruleNot EOF
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
    // InternalGHAExpressions.g:399:1: ruleNot returns [EObject current=null] : ( () otherlv_1= '!' ( (lv_childExpr_2_0= rulePrimary ) ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_childExpr_2_0 = null;



        	enterRule();

        try {
            // InternalGHAExpressions.g:405:2: ( ( () otherlv_1= '!' ( (lv_childExpr_2_0= rulePrimary ) ) ) )
            // InternalGHAExpressions.g:406:2: ( () otherlv_1= '!' ( (lv_childExpr_2_0= rulePrimary ) ) )
            {
            // InternalGHAExpressions.g:406:2: ( () otherlv_1= '!' ( (lv_childExpr_2_0= rulePrimary ) ) )
            // InternalGHAExpressions.g:407:3: () otherlv_1= '!' ( (lv_childExpr_2_0= rulePrimary ) )
            {
            // InternalGHAExpressions.g:407:3: ()
            // InternalGHAExpressions.g:408:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNotAccess().getNotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNotAccess().getExclamationMarkKeyword_1());
            		
            // InternalGHAExpressions.g:418:3: ( (lv_childExpr_2_0= rulePrimary ) )
            // InternalGHAExpressions.g:419:4: (lv_childExpr_2_0= rulePrimary )
            {
            // InternalGHAExpressions.g:419:4: (lv_childExpr_2_0= rulePrimary )
            // InternalGHAExpressions.g:420:5: lv_childExpr_2_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getNotAccess().getChildExprPrimaryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_childExpr_2_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotRule());
            					}
            					set(
            						current,
            						"childExpr",
            						lv_childExpr_2_0,
            						"d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.Primary");
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


    // $ANTLR start "entryRulePrimary"
    // InternalGHAExpressions.g:441:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalGHAExpressions.g:441:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalGHAExpressions.g:442:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalGHAExpressions.g:448:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Function_3= ruleFunction | this_Atomic_4= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_Function_3 = null;

        EObject this_Atomic_4 = null;



        	enterRule();

        try {
            // InternalGHAExpressions.g:454:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Function_3= ruleFunction | this_Atomic_4= ruleAtomic ) )
            // InternalGHAExpressions.g:455:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Function_3= ruleFunction | this_Atomic_4= ruleAtomic )
            {
            // InternalGHAExpressions.g:455:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Function_3= ruleFunction | this_Atomic_4= ruleAtomic )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==17) ) {
                    alt6=2;
                }
                else if ( (LA6_2==EOF||(LA6_2>=14 && LA6_2<=15)||(LA6_2>=18 && LA6_2<=25)) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VARIABLE_REFERENCE:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_BOOLEAN:
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGHAExpressions.g:456:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalGHAExpressions.g:456:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalGHAExpressions.g:457:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGHAExpressions.g:475:3: this_Function_3= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_3=ruleFunction();

                    state._fsp--;


                    			current = this_Function_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGHAExpressions.g:484:3: this_Atomic_4= ruleAtomic
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


    // $ANTLR start "entryRuleFunction"
    // InternalGHAExpressions.g:496:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalGHAExpressions.g:496:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalGHAExpressions.g:497:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalGHAExpressions.g:503:1: ruleFunction returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalGHAExpressions.g:509:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) )
            // InternalGHAExpressions.g:510:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            {
            // InternalGHAExpressions.g:510:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            // InternalGHAExpressions.g:511:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
            {
            // InternalGHAExpressions.g:511:3: ()
            // InternalGHAExpressions.g:512:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionAccess().getFunctionAction_0(),
            					current);
            			

            }

            // InternalGHAExpressions.g:518:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGHAExpressions.g:519:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGHAExpressions.g:519:4: (lv_name_1_0= RULE_ID )
            // InternalGHAExpressions.g:520:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalGHAExpressions.g:540:3: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)||(LA8_0>=16 && LA8_0<=17)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGHAExpressions.g:541:4: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    {
                    // InternalGHAExpressions.g:541:4: ( (lv_args_3_0= ruleExpression ) )
                    // InternalGHAExpressions.g:542:5: (lv_args_3_0= ruleExpression )
                    {
                    // InternalGHAExpressions.g:542:5: (lv_args_3_0= ruleExpression )
                    // InternalGHAExpressions.g:543:6: lv_args_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getArgsExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_args_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_3_0,
                    							"d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGHAExpressions.g:560:4: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==19) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalGHAExpressions.g:561:5: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalGHAExpressions.g:565:5: ( (lv_args_5_0= ruleExpression ) )
                    	    // InternalGHAExpressions.g:566:6: (lv_args_5_0= ruleExpression )
                    	    {
                    	    // InternalGHAExpressions.g:566:6: (lv_args_5_0= ruleExpression )
                    	    // InternalGHAExpressions.g:567:7: lv_args_5_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getArgsExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_args_5_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_5_0,
                    	    								"d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleAtomic"
    // InternalGHAExpressions.g:594:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalGHAExpressions.g:594:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalGHAExpressions.g:595:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalGHAExpressions.g:601:1: ruleAtomic returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_VARIABLE_REFERENCE ) ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_7_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_9_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_9_0=null;


        	enterRule();

        try {
            // InternalGHAExpressions.g:607:2: ( ( ( () ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_VARIABLE_REFERENCE ) ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_7_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_9_0= RULE_STRING ) ) ) ) )
            // InternalGHAExpressions.g:608:2: ( ( () ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_VARIABLE_REFERENCE ) ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_7_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_9_0= RULE_STRING ) ) ) )
            {
            // InternalGHAExpressions.g:608:2: ( ( () ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_VARIABLE_REFERENCE ) ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_7_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_9_0= RULE_STRING ) ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_VARIABLE_REFERENCE:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                alt10=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt10=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt10=4;
                }
                break;
            case RULE_STRING:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalGHAExpressions.g:609:3: ( () ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_VARIABLE_REFERENCE ) ) ) )
                    {
                    // InternalGHAExpressions.g:609:3: ( () ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_VARIABLE_REFERENCE ) ) ) )
                    // InternalGHAExpressions.g:610:4: () ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_VARIABLE_REFERENCE ) ) )
                    {
                    // InternalGHAExpressions.g:610:4: ()
                    // InternalGHAExpressions.g:611:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableReferenceAction_0_0(),
                    						current);
                    				

                    }

                    // InternalGHAExpressions.g:617:4: ( ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_VARIABLE_REFERENCE ) ) )
                    // InternalGHAExpressions.g:618:5: ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_VARIABLE_REFERENCE ) )
                    {
                    // InternalGHAExpressions.g:618:5: ( (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_VARIABLE_REFERENCE ) )
                    // InternalGHAExpressions.g:619:6: (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_VARIABLE_REFERENCE )
                    {
                    // InternalGHAExpressions.g:619:6: (lv_value_1_1= RULE_ID | lv_value_1_2= RULE_VARIABLE_REFERENCE )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==RULE_VARIABLE_REFERENCE) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalGHAExpressions.g:620:7: lv_value_1_1= RULE_ID
                            {
                            lv_value_1_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_value_1_1, grammarAccess.getAtomicAccess().getValueIDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_1_1,
                            								"d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalGHAExpressions.g:635:7: lv_value_1_2= RULE_VARIABLE_REFERENCE
                            {
                            lv_value_1_2=(Token)match(input,RULE_VARIABLE_REFERENCE,FOLLOW_2); 

                            							newLeafNode(lv_value_1_2, grammarAccess.getAtomicAccess().getValueVARIABLE_REFERENCETerminalRuleCall_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_1_2,
                            								"d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.VARIABLE_REFERENCE");
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGHAExpressions.g:654:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalGHAExpressions.g:654:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalGHAExpressions.g:655:4: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalGHAExpressions.g:655:4: ()
                    // InternalGHAExpressions.g:656:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntegerLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGHAExpressions.g:662:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalGHAExpressions.g:663:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalGHAExpressions.g:663:5: (lv_value_3_0= RULE_INT )
                    // InternalGHAExpressions.g:664:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGHAExpressions.g:682:3: ( () ( (lv_value_5_0= RULE_DOUBLE ) ) )
                    {
                    // InternalGHAExpressions.g:682:3: ( () ( (lv_value_5_0= RULE_DOUBLE ) ) )
                    // InternalGHAExpressions.g:683:4: () ( (lv_value_5_0= RULE_DOUBLE ) )
                    {
                    // InternalGHAExpressions.g:683:4: ()
                    // InternalGHAExpressions.g:684:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getDoubleLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalGHAExpressions.g:690:4: ( (lv_value_5_0= RULE_DOUBLE ) )
                    // InternalGHAExpressions.g:691:5: (lv_value_5_0= RULE_DOUBLE )
                    {
                    // InternalGHAExpressions.g:691:5: (lv_value_5_0= RULE_DOUBLE )
                    // InternalGHAExpressions.g:692:6: lv_value_5_0= RULE_DOUBLE
                    {
                    lv_value_5_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.DOUBLE");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGHAExpressions.g:710:3: ( () ( (lv_value_7_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalGHAExpressions.g:710:3: ( () ( (lv_value_7_0= RULE_BOOLEAN ) ) )
                    // InternalGHAExpressions.g:711:4: () ( (lv_value_7_0= RULE_BOOLEAN ) )
                    {
                    // InternalGHAExpressions.g:711:4: ()
                    // InternalGHAExpressions.g:712:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBooleanLiteralAction_3_0(),
                    						current);
                    				

                    }

                    // InternalGHAExpressions.g:718:4: ( (lv_value_7_0= RULE_BOOLEAN ) )
                    // InternalGHAExpressions.g:719:5: (lv_value_7_0= RULE_BOOLEAN )
                    {
                    // InternalGHAExpressions.g:719:5: (lv_value_7_0= RULE_BOOLEAN )
                    // InternalGHAExpressions.g:720:6: lv_value_7_0= RULE_BOOLEAN
                    {
                    lv_value_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getAtomicAccess().getValueBOOLEANTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions.BOOLEAN");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGHAExpressions.g:738:3: ( () ( (lv_value_9_0= RULE_STRING ) ) )
                    {
                    // InternalGHAExpressions.g:738:3: ( () ( (lv_value_9_0= RULE_STRING ) ) )
                    // InternalGHAExpressions.g:739:4: () ( (lv_value_9_0= RULE_STRING ) )
                    {
                    // InternalGHAExpressions.g:739:4: ()
                    // InternalGHAExpressions.g:740:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringLiteralAction_4_0(),
                    						current);
                    				

                    }

                    // InternalGHAExpressions.g:746:4: ( (lv_value_9_0= RULE_STRING ) )
                    // InternalGHAExpressions.g:747:5: (lv_value_9_0= RULE_STRING )
                    {
                    // InternalGHAExpressions.g:747:5: (lv_value_9_0= RULE_STRING )
                    // InternalGHAExpressions.g:748:6: lv_value_9_0= RULE_STRING
                    {
                    lv_value_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_9_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_9_0,
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


    // $ANTLR start "ruleCOMPARISON_OP"
    // InternalGHAExpressions.g:769:1: ruleCOMPARISON_OP returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) ) ;
    public final Enumerator ruleCOMPARISON_OP() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalGHAExpressions.g:775:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) ) )
            // InternalGHAExpressions.g:776:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) )
            {
            // InternalGHAExpressions.g:776:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt11=1;
                }
                break;
            case 21:
                {
                alt11=2;
                }
                break;
            case 22:
                {
                alt11=3;
                }
                break;
            case 23:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalGHAExpressions.g:777:3: (enumLiteral_0= '>' )
                    {
                    // InternalGHAExpressions.g:777:3: (enumLiteral_0= '>' )
                    // InternalGHAExpressions.g:778:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPAccess().getGTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOMPARISON_OPAccess().getGTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGHAExpressions.g:785:3: (enumLiteral_1= '>=' )
                    {
                    // InternalGHAExpressions.g:785:3: (enumLiteral_1= '>=' )
                    // InternalGHAExpressions.g:786:4: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPAccess().getGTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOMPARISON_OPAccess().getGTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGHAExpressions.g:793:3: (enumLiteral_2= '<' )
                    {
                    // InternalGHAExpressions.g:793:3: (enumLiteral_2= '<' )
                    // InternalGHAExpressions.g:794:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARISON_OPAccess().getLTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOMPARISON_OPAccess().getLTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGHAExpressions.g:801:3: (enumLiteral_3= '<=' )
                    {
                    // InternalGHAExpressions.g:801:3: (enumLiteral_3= '<=' )
                    // InternalGHAExpressions.g:802:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,23,FOLLOW_2); 

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
    // InternalGHAExpressions.g:812:1: ruleEQUALITY_OP returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleEQUALITY_OP() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGHAExpressions.g:818:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // InternalGHAExpressions.g:819:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalGHAExpressions.g:819:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGHAExpressions.g:820:3: (enumLiteral_0= '==' )
                    {
                    // InternalGHAExpressions.g:820:3: (enumLiteral_0= '==' )
                    // InternalGHAExpressions.g:821:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getEQUALITY_OPAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEQUALITY_OPAccess().getEQUALSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGHAExpressions.g:828:3: (enumLiteral_1= '!=' )
                    {
                    // InternalGHAExpressions.g:828:3: (enumLiteral_1= '!=' )
                    // InternalGHAExpressions.g:829:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000303F0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000703F0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});

}