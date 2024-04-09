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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TransformationSet'", "'{'", "'transformations'", "','", "'}'", "'ChangePluginTransformation'", "'model'", "'version'", "'name'", "'args'", "'StringToStringMapEntry'", "'key'", "'value'", "'CICD'", "'GHA'", "'CircleCI'"
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
    // InternalDSL.g:72:1: ruleTransformationSet returns [EObject current=null] : ( () otherlv_1= 'TransformationSet' otherlv_2= '{' (otherlv_3= 'transformations' otherlv_4= '{' ( (lv_transformations_5_0= ruleTransformation ) ) (otherlv_6= ',' ( (lv_transformations_7_0= ruleTransformation ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleTransformationSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_transformations_5_0 = null;

        EObject lv_transformations_7_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:78:2: ( ( () otherlv_1= 'TransformationSet' otherlv_2= '{' (otherlv_3= 'transformations' otherlv_4= '{' ( (lv_transformations_5_0= ruleTransformation ) ) (otherlv_6= ',' ( (lv_transformations_7_0= ruleTransformation ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalDSL.g:79:2: ( () otherlv_1= 'TransformationSet' otherlv_2= '{' (otherlv_3= 'transformations' otherlv_4= '{' ( (lv_transformations_5_0= ruleTransformation ) ) (otherlv_6= ',' ( (lv_transformations_7_0= ruleTransformation ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalDSL.g:79:2: ( () otherlv_1= 'TransformationSet' otherlv_2= '{' (otherlv_3= 'transformations' otherlv_4= '{' ( (lv_transformations_5_0= ruleTransformation ) ) (otherlv_6= ',' ( (lv_transformations_7_0= ruleTransformation ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalDSL.g:80:3: () otherlv_1= 'TransformationSet' otherlv_2= '{' (otherlv_3= 'transformations' otherlv_4= '{' ( (lv_transformations_5_0= ruleTransformation ) ) (otherlv_6= ',' ( (lv_transformations_7_0= ruleTransformation ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalDSL.g:80:3: ()
            // InternalDSL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransformationSetAccess().getTransformationSetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransformationSetAccess().getTransformationSetKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTransformationSetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:95:3: (otherlv_3= 'transformations' otherlv_4= '{' ( (lv_transformations_5_0= ruleTransformation ) ) (otherlv_6= ',' ( (lv_transformations_7_0= ruleTransformation ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:96:4: otherlv_3= 'transformations' otherlv_4= '{' ( (lv_transformations_5_0= ruleTransformation ) ) (otherlv_6= ',' ( (lv_transformations_7_0= ruleTransformation ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransformationSetAccess().getTransformationsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransformationSetAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDSL.g:104:4: ( (lv_transformations_5_0= ruleTransformation ) )
                    // InternalDSL.g:105:5: (lv_transformations_5_0= ruleTransformation )
                    {
                    // InternalDSL.g:105:5: (lv_transformations_5_0= ruleTransformation )
                    // InternalDSL.g:106:6: lv_transformations_5_0= ruleTransformation
                    {

                    						newCompositeNode(grammarAccess.getTransformationSetAccess().getTransformationsTransformationParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_transformations_5_0=ruleTransformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransformationSetRule());
                    						}
                    						add(
                    							current,
                    							"transformations",
                    							lv_transformations_5_0,
                    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.Transformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:123:4: (otherlv_6= ',' ( (lv_transformations_7_0= ruleTransformation ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDSL.g:124:5: otherlv_6= ',' ( (lv_transformations_7_0= ruleTransformation ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTransformationSetAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDSL.g:128:5: ( (lv_transformations_7_0= ruleTransformation ) )
                    	    // InternalDSL.g:129:6: (lv_transformations_7_0= ruleTransformation )
                    	    {
                    	    // InternalDSL.g:129:6: (lv_transformations_7_0= ruleTransformation )
                    	    // InternalDSL.g:130:7: lv_transformations_7_0= ruleTransformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransformationSetAccess().getTransformationsTransformationParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_transformations_7_0=ruleTransformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransformationSetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transformations",
                    	    								lv_transformations_7_0,
                    	    								"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.Transformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getTransformationSetAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTransformationSetAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleTransformation"
    // InternalDSL.g:161:1: entryRuleTransformation returns [EObject current=null] : iv_ruleTransformation= ruleTransformation EOF ;
    public final EObject entryRuleTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation = null;


        try {
            // InternalDSL.g:161:55: (iv_ruleTransformation= ruleTransformation EOF )
            // InternalDSL.g:162:2: iv_ruleTransformation= ruleTransformation EOF
            {
             newCompositeNode(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransformation=ruleTransformation();

            state._fsp--;

             current =iv_ruleTransformation; 
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
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // InternalDSL.g:168:1: ruleTransformation returns [EObject current=null] : this_ChangePluginTransformation_0= ruleChangePluginTransformation ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_ChangePluginTransformation_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:174:2: (this_ChangePluginTransformation_0= ruleChangePluginTransformation )
            // InternalDSL.g:175:2: this_ChangePluginTransformation_0= ruleChangePluginTransformation
            {

            		newCompositeNode(grammarAccess.getTransformationAccess().getChangePluginTransformationParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ChangePluginTransformation_0=ruleChangePluginTransformation();

            state._fsp--;


            		current = this_ChangePluginTransformation_0;
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
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleChangePluginTransformation"
    // InternalDSL.g:186:1: entryRuleChangePluginTransformation returns [EObject current=null] : iv_ruleChangePluginTransformation= ruleChangePluginTransformation EOF ;
    public final EObject entryRuleChangePluginTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangePluginTransformation = null;


        try {
            // InternalDSL.g:186:67: (iv_ruleChangePluginTransformation= ruleChangePluginTransformation EOF )
            // InternalDSL.g:187:2: iv_ruleChangePluginTransformation= ruleChangePluginTransformation EOF
            {
             newCompositeNode(grammarAccess.getChangePluginTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangePluginTransformation=ruleChangePluginTransformation();

            state._fsp--;

             current =iv_ruleChangePluginTransformation; 
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
    // $ANTLR end "entryRuleChangePluginTransformation"


    // $ANTLR start "ruleChangePluginTransformation"
    // InternalDSL.g:193:1: ruleChangePluginTransformation returns [EObject current=null] : (otherlv_0= 'ChangePluginTransformation' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) otherlv_6= 'name' ( (lv_name_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleChangePluginTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Enumerator lv_model_3_0 = null;

        AntlrDatatypeRuleToken lv_version_5_0 = null;

        EObject lv_name_7_0 = null;

        EObject lv_args_10_0 = null;

        EObject lv_args_12_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:199:2: ( (otherlv_0= 'ChangePluginTransformation' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) otherlv_6= 'name' ( (lv_name_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalDSL.g:200:2: (otherlv_0= 'ChangePluginTransformation' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) otherlv_6= 'name' ( (lv_name_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalDSL.g:200:2: (otherlv_0= 'ChangePluginTransformation' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) otherlv_6= 'name' ( (lv_name_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalDSL.g:201:3: otherlv_0= 'ChangePluginTransformation' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) otherlv_6= 'name' ( (lv_name_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChangePluginTransformationAccess().getChangePluginTransformationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getChangePluginTransformationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getChangePluginTransformationAccess().getModelKeyword_2());
            		
            // InternalDSL.g:213:3: ( (lv_model_3_0= ruleMODEL_NAMES ) )
            // InternalDSL.g:214:4: (lv_model_3_0= ruleMODEL_NAMES )
            {
            // InternalDSL.g:214:4: (lv_model_3_0= ruleMODEL_NAMES )
            // InternalDSL.g:215:5: lv_model_3_0= ruleMODEL_NAMES
            {

            					newCompositeNode(grammarAccess.getChangePluginTransformationAccess().getModelMODEL_NAMESEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_model_3_0=ruleMODEL_NAMES();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangePluginTransformationRule());
            					}
            					set(
            						current,
            						"model",
            						lv_model_3_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.MODEL_NAMES");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getChangePluginTransformationAccess().getVersionKeyword_4());
            		
            // InternalDSL.g:236:3: ( (lv_version_5_0= ruleEString ) )
            // InternalDSL.g:237:4: (lv_version_5_0= ruleEString )
            {
            // InternalDSL.g:237:4: (lv_version_5_0= ruleEString )
            // InternalDSL.g:238:5: lv_version_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getChangePluginTransformationAccess().getVersionEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_version_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangePluginTransformationRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_5_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getChangePluginTransformationAccess().getNameKeyword_6());
            		
            // InternalDSL.g:259:3: ( (lv_name_7_0= ruleStringToStringMapEntry ) )
            // InternalDSL.g:260:4: (lv_name_7_0= ruleStringToStringMapEntry )
            {
            // InternalDSL.g:260:4: (lv_name_7_0= ruleStringToStringMapEntry )
            // InternalDSL.g:261:5: lv_name_7_0= ruleStringToStringMapEntry
            {

            					newCompositeNode(grammarAccess.getChangePluginTransformationAccess().getNameStringToStringMapEntryParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_7_0=ruleStringToStringMapEntry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangePluginTransformationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringToStringMapEntry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:278:3: (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:279:4: otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getChangePluginTransformationAccess().getArgsKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getChangePluginTransformationAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalDSL.g:287:4: ( (lv_args_10_0= ruleStringToStringMapEntry ) )
                    // InternalDSL.g:288:5: (lv_args_10_0= ruleStringToStringMapEntry )
                    {
                    // InternalDSL.g:288:5: (lv_args_10_0= ruleStringToStringMapEntry )
                    // InternalDSL.g:289:6: lv_args_10_0= ruleStringToStringMapEntry
                    {

                    						newCompositeNode(grammarAccess.getChangePluginTransformationAccess().getArgsStringToStringMapEntryParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_args_10_0=ruleStringToStringMapEntry();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChangePluginTransformationRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_10_0,
                    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringToStringMapEntry");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:306:4: (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDSL.g:307:5: otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getChangePluginTransformationAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalDSL.g:311:5: ( (lv_args_12_0= ruleStringToStringMapEntry ) )
                    	    // InternalDSL.g:312:6: (lv_args_12_0= ruleStringToStringMapEntry )
                    	    {
                    	    // InternalDSL.g:312:6: (lv_args_12_0= ruleStringToStringMapEntry )
                    	    // InternalDSL.g:313:7: lv_args_12_0= ruleStringToStringMapEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getChangePluginTransformationAccess().getArgsStringToStringMapEntryParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_args_12_0=ruleStringToStringMapEntry();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChangePluginTransformationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_12_0,
                    	    								"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringToStringMapEntry");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getChangePluginTransformationAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getChangePluginTransformationAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleChangePluginTransformation"


    // $ANTLR start "entryRuleStringToStringMapEntry"
    // InternalDSL.g:344:1: entryRuleStringToStringMapEntry returns [EObject current=null] : iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF ;
    public final EObject entryRuleStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringToStringMapEntry = null;


        try {
            // InternalDSL.g:344:63: (iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF )
            // InternalDSL.g:345:2: iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF
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
    // InternalDSL.g:351:1: ruleStringToStringMapEntry returns [EObject current=null] : (otherlv_0= 'StringToStringMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_key_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:357:2: ( (otherlv_0= 'StringToStringMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // InternalDSL.g:358:2: (otherlv_0= 'StringToStringMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // InternalDSL.g:358:2: (otherlv_0= 'StringToStringMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' )
            // InternalDSL.g:359:3: otherlv_0= 'StringToStringMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getStringToStringMapEntryAccess().getKeyKeyword_2());
            		
            // InternalDSL.g:371:3: ( (lv_key_3_0= ruleEString ) )
            // InternalDSL.g:372:4: (lv_key_3_0= ruleEString )
            {
            // InternalDSL.g:372:4: (lv_key_3_0= ruleEString )
            // InternalDSL.g:373:5: lv_key_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_key_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringToStringMapEntryRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_3_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getStringToStringMapEntryAccess().getValueKeyword_4());
            		
            // InternalDSL.g:394:3: ( (lv_value_5_0= ruleEString ) )
            // InternalDSL.g:395:4: (lv_value_5_0= ruleEString )
            {
            // InternalDSL.g:395:4: (lv_value_5_0= ruleEString )
            // InternalDSL.g:396:5: lv_value_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getValueEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringToStringMapEntryRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStringToStringMapEntryAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalDSL.g:421:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDSL.g:421:47: (iv_ruleEString= ruleEString EOF )
            // InternalDSL.g:422:2: iv_ruleEString= ruleEString EOF
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
    // InternalDSL.g:428:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDSL.g:434:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDSL.g:435:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDSL.g:435:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDSL.g:436:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:444:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleMODEL_NAMES"
    // InternalDSL.g:455:1: ruleMODEL_NAMES returns [Enumerator current=null] : ( (enumLiteral_0= 'CICD' ) | (enumLiteral_1= 'GHA' ) | (enumLiteral_2= 'CircleCI' ) ) ;
    public final Enumerator ruleMODEL_NAMES() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDSL.g:461:2: ( ( (enumLiteral_0= 'CICD' ) | (enumLiteral_1= 'GHA' ) | (enumLiteral_2= 'CircleCI' ) ) )
            // InternalDSL.g:462:2: ( (enumLiteral_0= 'CICD' ) | (enumLiteral_1= 'GHA' ) | (enumLiteral_2= 'CircleCI' ) )
            {
            // InternalDSL.g:462:2: ( (enumLiteral_0= 'CICD' ) | (enumLiteral_1= 'GHA' ) | (enumLiteral_2= 'CircleCI' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
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
                    // InternalDSL.g:463:3: (enumLiteral_0= 'CICD' )
                    {
                    // InternalDSL.g:463:3: (enumLiteral_0= 'CICD' )
                    // InternalDSL.g:464:4: enumLiteral_0= 'CICD'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getMODEL_NAMESAccess().getCICDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMODEL_NAMESAccess().getCICDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:471:3: (enumLiteral_1= 'GHA' )
                    {
                    // InternalDSL.g:471:3: (enumLiteral_1= 'GHA' )
                    // InternalDSL.g:472:4: enumLiteral_1= 'GHA'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getMODEL_NAMESAccess().getGHAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMODEL_NAMESAccess().getGHAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:479:3: (enumLiteral_2= 'CircleCI' )
                    {
                    // InternalDSL.g:479:3: (enumLiteral_2= 'CircleCI' )
                    // InternalDSL.g:480:4: enumLiteral_2= 'CircleCI'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getMODEL_NAMESAccess().getCircleCIEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMODEL_NAMESAccess().getCircleCIEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleMODEL_NAMES"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});

}