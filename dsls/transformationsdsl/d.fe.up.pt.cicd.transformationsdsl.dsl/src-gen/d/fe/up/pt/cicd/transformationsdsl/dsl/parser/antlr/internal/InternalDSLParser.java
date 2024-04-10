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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TransformationSet'", "'{'", "'transformations'", "','", "'}'", "'ChangePlugin'", "'model'", "'version'", "'name'", "'args'", "'ATLScript'", "'script'", "'ChangeAgentLabel'", "'StringToStringMapEntry'", "'key'", "'value'", "'CICD'", "'GHA'", "'CircleCI'"
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
    // InternalDSL.g:168:1: ruleTransformation returns [EObject current=null] : (this_ChangePlugin_0= ruleChangePlugin | this_ATLScript_1= ruleATLScript | this_ChangeAgentLabel_2= ruleChangeAgentLabel ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_ChangePlugin_0 = null;

        EObject this_ATLScript_1 = null;

        EObject this_ChangeAgentLabel_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:174:2: ( (this_ChangePlugin_0= ruleChangePlugin | this_ATLScript_1= ruleATLScript | this_ChangeAgentLabel_2= ruleChangeAgentLabel ) )
            // InternalDSL.g:175:2: (this_ChangePlugin_0= ruleChangePlugin | this_ATLScript_1= ruleATLScript | this_ChangeAgentLabel_2= ruleChangeAgentLabel )
            {
            // InternalDSL.g:175:2: (this_ChangePlugin_0= ruleChangePlugin | this_ATLScript_1= ruleATLScript | this_ChangeAgentLabel_2= ruleChangeAgentLabel )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 23:
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
                    // InternalDSL.g:176:3: this_ChangePlugin_0= ruleChangePlugin
                    {

                    			newCompositeNode(grammarAccess.getTransformationAccess().getChangePluginParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangePlugin_0=ruleChangePlugin();

                    state._fsp--;


                    			current = this_ChangePlugin_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:185:3: this_ATLScript_1= ruleATLScript
                    {

                    			newCompositeNode(grammarAccess.getTransformationAccess().getATLScriptParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ATLScript_1=ruleATLScript();

                    state._fsp--;


                    			current = this_ATLScript_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:194:3: this_ChangeAgentLabel_2= ruleChangeAgentLabel
                    {

                    			newCompositeNode(grammarAccess.getTransformationAccess().getChangeAgentLabelParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeAgentLabel_2=ruleChangeAgentLabel();

                    state._fsp--;


                    			current = this_ChangeAgentLabel_2;
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
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleChangePlugin"
    // InternalDSL.g:206:1: entryRuleChangePlugin returns [EObject current=null] : iv_ruleChangePlugin= ruleChangePlugin EOF ;
    public final EObject entryRuleChangePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangePlugin = null;


        try {
            // InternalDSL.g:206:53: (iv_ruleChangePlugin= ruleChangePlugin EOF )
            // InternalDSL.g:207:2: iv_ruleChangePlugin= ruleChangePlugin EOF
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
    // InternalDSL.g:213:1: ruleChangePlugin returns [EObject current=null] : (otherlv_0= 'ChangePlugin' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) otherlv_6= 'name' ( (lv_name_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleChangePlugin() throws RecognitionException {
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
            // InternalDSL.g:219:2: ( (otherlv_0= 'ChangePlugin' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) otherlv_6= 'name' ( (lv_name_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalDSL.g:220:2: (otherlv_0= 'ChangePlugin' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) otherlv_6= 'name' ( (lv_name_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalDSL.g:220:2: (otherlv_0= 'ChangePlugin' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) otherlv_6= 'name' ( (lv_name_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalDSL.g:221:3: otherlv_0= 'ChangePlugin' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) otherlv_6= 'name' ( (lv_name_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChangePluginAccess().getChangePluginKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getChangePluginAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getChangePluginAccess().getModelKeyword_2());
            		
            // InternalDSL.g:233:3: ( (lv_model_3_0= ruleMODEL_NAMES ) )
            // InternalDSL.g:234:4: (lv_model_3_0= ruleMODEL_NAMES )
            {
            // InternalDSL.g:234:4: (lv_model_3_0= ruleMODEL_NAMES )
            // InternalDSL.g:235:5: lv_model_3_0= ruleMODEL_NAMES
            {

            					newCompositeNode(grammarAccess.getChangePluginAccess().getModelMODEL_NAMESEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_model_3_0=ruleMODEL_NAMES();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangePluginRule());
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

            			newLeafNode(otherlv_4, grammarAccess.getChangePluginAccess().getVersionKeyword_4());
            		
            // InternalDSL.g:256:3: ( (lv_version_5_0= ruleEString ) )
            // InternalDSL.g:257:4: (lv_version_5_0= ruleEString )
            {
            // InternalDSL.g:257:4: (lv_version_5_0= ruleEString )
            // InternalDSL.g:258:5: lv_version_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getChangePluginAccess().getVersionEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_version_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangePluginRule());
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

            			newLeafNode(otherlv_6, grammarAccess.getChangePluginAccess().getNameKeyword_6());
            		
            // InternalDSL.g:279:3: ( (lv_name_7_0= ruleStringToStringMapEntry ) )
            // InternalDSL.g:280:4: (lv_name_7_0= ruleStringToStringMapEntry )
            {
            // InternalDSL.g:280:4: (lv_name_7_0= ruleStringToStringMapEntry )
            // InternalDSL.g:281:5: lv_name_7_0= ruleStringToStringMapEntry
            {

            					newCompositeNode(grammarAccess.getChangePluginAccess().getNameStringToStringMapEntryParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_7_0=ruleStringToStringMapEntry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangePluginRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringToStringMapEntry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:298:3: (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDSL.g:299:4: otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getChangePluginAccess().getArgsKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getChangePluginAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalDSL.g:307:4: ( (lv_args_10_0= ruleStringToStringMapEntry ) )
                    // InternalDSL.g:308:5: (lv_args_10_0= ruleStringToStringMapEntry )
                    {
                    // InternalDSL.g:308:5: (lv_args_10_0= ruleStringToStringMapEntry )
                    // InternalDSL.g:309:6: lv_args_10_0= ruleStringToStringMapEntry
                    {

                    						newCompositeNode(grammarAccess.getChangePluginAccess().getArgsStringToStringMapEntryParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_args_10_0=ruleStringToStringMapEntry();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChangePluginRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_10_0,
                    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringToStringMapEntry");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:326:4: (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDSL.g:327:5: otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getChangePluginAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalDSL.g:331:5: ( (lv_args_12_0= ruleStringToStringMapEntry ) )
                    	    // InternalDSL.g:332:6: (lv_args_12_0= ruleStringToStringMapEntry )
                    	    {
                    	    // InternalDSL.g:332:6: (lv_args_12_0= ruleStringToStringMapEntry )
                    	    // InternalDSL.g:333:7: lv_args_12_0= ruleStringToStringMapEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getChangePluginAccess().getArgsStringToStringMapEntryParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_args_12_0=ruleStringToStringMapEntry();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getChangePluginRule());
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
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getChangePluginAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getChangePluginAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleATLScript"
    // InternalDSL.g:364:1: entryRuleATLScript returns [EObject current=null] : iv_ruleATLScript= ruleATLScript EOF ;
    public final EObject entryRuleATLScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATLScript = null;


        try {
            // InternalDSL.g:364:50: (iv_ruleATLScript= ruleATLScript EOF )
            // InternalDSL.g:365:2: iv_ruleATLScript= ruleATLScript EOF
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
    // InternalDSL.g:371:1: ruleATLScript returns [EObject current=null] : (otherlv_0= 'ATLScript' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'script' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalDSL.g:377:2: ( (otherlv_0= 'ATLScript' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'script' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // InternalDSL.g:378:2: (otherlv_0= 'ATLScript' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'script' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // InternalDSL.g:378:2: (otherlv_0= 'ATLScript' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'script' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}' )
            // InternalDSL.g:379:3: otherlv_0= 'ATLScript' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'script' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getATLScriptAccess().getATLScriptKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getATLScriptAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getATLScriptAccess().getModelKeyword_2());
            		
            // InternalDSL.g:391:3: ( (lv_model_3_0= ruleMODEL_NAMES ) )
            // InternalDSL.g:392:4: (lv_model_3_0= ruleMODEL_NAMES )
            {
            // InternalDSL.g:392:4: (lv_model_3_0= ruleMODEL_NAMES )
            // InternalDSL.g:393:5: lv_model_3_0= ruleMODEL_NAMES
            {

            					newCompositeNode(grammarAccess.getATLScriptAccess().getModelMODEL_NAMESEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_model_3_0=ruleMODEL_NAMES();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATLScriptRule());
            					}
            					set(
            						current,
            						"model",
            						lv_model_3_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.MODEL_NAMES");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getATLScriptAccess().getScriptKeyword_4());
            		
            // InternalDSL.g:414:3: ( (lv_script_5_0= ruleEString ) )
            // InternalDSL.g:415:4: (lv_script_5_0= ruleEString )
            {
            // InternalDSL.g:415:4: (lv_script_5_0= ruleEString )
            // InternalDSL.g:416:5: lv_script_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getATLScriptAccess().getScriptEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleChangeAgentLabel"
    // InternalDSL.g:441:1: entryRuleChangeAgentLabel returns [EObject current=null] : iv_ruleChangeAgentLabel= ruleChangeAgentLabel EOF ;
    public final EObject entryRuleChangeAgentLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeAgentLabel = null;


        try {
            // InternalDSL.g:441:57: (iv_ruleChangeAgentLabel= ruleChangeAgentLabel EOF )
            // InternalDSL.g:442:2: iv_ruleChangeAgentLabel= ruleChangeAgentLabel EOF
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
    // InternalDSL.g:448:1: ruleChangeAgentLabel returns [EObject current=null] : (otherlv_0= 'ChangeAgentLabel' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleStringToStringMapEntry ) ) otherlv_6= '}' ) ;
    public final EObject ruleChangeAgentLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_model_3_0 = null;

        EObject lv_name_5_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:454:2: ( (otherlv_0= 'ChangeAgentLabel' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleStringToStringMapEntry ) ) otherlv_6= '}' ) )
            // InternalDSL.g:455:2: (otherlv_0= 'ChangeAgentLabel' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleStringToStringMapEntry ) ) otherlv_6= '}' )
            {
            // InternalDSL.g:455:2: (otherlv_0= 'ChangeAgentLabel' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleStringToStringMapEntry ) ) otherlv_6= '}' )
            // InternalDSL.g:456:3: otherlv_0= 'ChangeAgentLabel' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleStringToStringMapEntry ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeAgentLabelAccess().getChangeAgentLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeAgentLabelAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getChangeAgentLabelAccess().getModelKeyword_2());
            		
            // InternalDSL.g:468:3: ( (lv_model_3_0= ruleMODEL_NAMES ) )
            // InternalDSL.g:469:4: (lv_model_3_0= ruleMODEL_NAMES )
            {
            // InternalDSL.g:469:4: (lv_model_3_0= ruleMODEL_NAMES )
            // InternalDSL.g:470:5: lv_model_3_0= ruleMODEL_NAMES
            {

            					newCompositeNode(grammarAccess.getChangeAgentLabelAccess().getModelMODEL_NAMESEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_model_3_0=ruleMODEL_NAMES();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeAgentLabelRule());
            					}
            					set(
            						current,
            						"model",
            						lv_model_3_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.MODEL_NAMES");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getChangeAgentLabelAccess().getNameKeyword_4());
            		
            // InternalDSL.g:491:3: ( (lv_name_5_0= ruleStringToStringMapEntry ) )
            // InternalDSL.g:492:4: (lv_name_5_0= ruleStringToStringMapEntry )
            {
            // InternalDSL.g:492:4: (lv_name_5_0= ruleStringToStringMapEntry )
            // InternalDSL.g:493:5: lv_name_5_0= ruleStringToStringMapEntry
            {

            					newCompositeNode(grammarAccess.getChangeAgentLabelAccess().getNameStringToStringMapEntryParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_5_0=ruleStringToStringMapEntry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeAgentLabelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.StringToStringMapEntry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChangeAgentLabelAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleStringToStringMapEntry"
    // InternalDSL.g:518:1: entryRuleStringToStringMapEntry returns [EObject current=null] : iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF ;
    public final EObject entryRuleStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringToStringMapEntry = null;


        try {
            // InternalDSL.g:518:63: (iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF )
            // InternalDSL.g:519:2: iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF
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
    // InternalDSL.g:525:1: ruleStringToStringMapEntry returns [EObject current=null] : (otherlv_0= 'StringToStringMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalDSL.g:531:2: ( (otherlv_0= 'StringToStringMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // InternalDSL.g:532:2: (otherlv_0= 'StringToStringMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // InternalDSL.g:532:2: (otherlv_0= 'StringToStringMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' )
            // InternalDSL.g:533:3: otherlv_0= 'StringToStringMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getStringToStringMapEntryAccess().getKeyKeyword_2());
            		
            // InternalDSL.g:545:3: ( (lv_key_3_0= ruleEString ) )
            // InternalDSL.g:546:4: (lv_key_3_0= ruleEString )
            {
            // InternalDSL.g:546:4: (lv_key_3_0= ruleEString )
            // InternalDSL.g:547:5: lv_key_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getStringToStringMapEntryAccess().getValueKeyword_4());
            		
            // InternalDSL.g:568:3: ( (lv_value_5_0= ruleEString ) )
            // InternalDSL.g:569:4: (lv_value_5_0= ruleEString )
            {
            // InternalDSL.g:569:4: (lv_value_5_0= ruleEString )
            // InternalDSL.g:570:5: lv_value_5_0= ruleEString
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
    // InternalDSL.g:595:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDSL.g:595:47: (iv_ruleEString= ruleEString EOF )
            // InternalDSL.g:596:2: iv_ruleEString= ruleEString EOF
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
    // InternalDSL.g:602:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDSL.g:608:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDSL.g:609:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDSL.g:609:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:610:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:618:3: this_ID_1= RULE_ID
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
    // InternalDSL.g:629:1: ruleMODEL_NAMES returns [Enumerator current=null] : ( (enumLiteral_0= 'CICD' ) | (enumLiteral_1= 'GHA' ) | (enumLiteral_2= 'CircleCI' ) ) ;
    public final Enumerator ruleMODEL_NAMES() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDSL.g:635:2: ( ( (enumLiteral_0= 'CICD' ) | (enumLiteral_1= 'GHA' ) | (enumLiteral_2= 'CircleCI' ) ) )
            // InternalDSL.g:636:2: ( (enumLiteral_0= 'CICD' ) | (enumLiteral_1= 'GHA' ) | (enumLiteral_2= 'CircleCI' ) )
            {
            // InternalDSL.g:636:2: ( (enumLiteral_0= 'CICD' ) | (enumLiteral_1= 'GHA' ) | (enumLiteral_2= 'CircleCI' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt7=1;
                }
                break;
            case 28:
                {
                alt7=2;
                }
                break;
            case 29:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDSL.g:637:3: (enumLiteral_0= 'CICD' )
                    {
                    // InternalDSL.g:637:3: (enumLiteral_0= 'CICD' )
                    // InternalDSL.g:638:4: enumLiteral_0= 'CICD'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getMODEL_NAMESAccess().getCICDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMODEL_NAMESAccess().getCICDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:645:3: (enumLiteral_1= 'GHA' )
                    {
                    // InternalDSL.g:645:3: (enumLiteral_1= 'GHA' )
                    // InternalDSL.g:646:4: enumLiteral_1= 'GHA'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getMODEL_NAMESAccess().getGHAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMODEL_NAMESAccess().getGHAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:653:3: (enumLiteral_2= 'CircleCI' )
                    {
                    // InternalDSL.g:653:3: (enumLiteral_2= 'CircleCI' )
                    // InternalDSL.g:654:4: enumLiteral_2= 'CircleCI'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000A10000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});

}