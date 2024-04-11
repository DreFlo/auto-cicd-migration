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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TransformationSet'", "'{'", "'transformations'", "','", "'}'", "'ChangePlugin'", "'model'", "'version'", "'name'", "'args'", "'ATLRefiningScript'", "'script'", "'ChangeAgentLabel'", "'ReplaceAgentLabels'", "'condition'", "'labels'", "'StringToStringMapEntry'", "'key'", "'value'", "'CICD'", "'GHA'", "'CircleCI'"
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
    // InternalDSL.g:168:1: ruleTransformation returns [EObject current=null] : (this_ChangePlugin_0= ruleChangePlugin | this_ATLRefiningScript_1= ruleATLRefiningScript | this_ChangeAgentLabel_2= ruleChangeAgentLabel | this_ReplaceAgentLabels_3= ruleReplaceAgentLabels ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_ChangePlugin_0 = null;

        EObject this_ATLRefiningScript_1 = null;

        EObject this_ChangeAgentLabel_2 = null;

        EObject this_ReplaceAgentLabels_3 = null;



        	enterRule();

        try {
            // InternalDSL.g:174:2: ( (this_ChangePlugin_0= ruleChangePlugin | this_ATLRefiningScript_1= ruleATLRefiningScript | this_ChangeAgentLabel_2= ruleChangeAgentLabel | this_ReplaceAgentLabels_3= ruleReplaceAgentLabels ) )
            // InternalDSL.g:175:2: (this_ChangePlugin_0= ruleChangePlugin | this_ATLRefiningScript_1= ruleATLRefiningScript | this_ChangeAgentLabel_2= ruleChangeAgentLabel | this_ReplaceAgentLabels_3= ruleReplaceAgentLabels )
            {
            // InternalDSL.g:175:2: (this_ChangePlugin_0= ruleChangePlugin | this_ATLRefiningScript_1= ruleATLRefiningScript | this_ChangeAgentLabel_2= ruleChangeAgentLabel | this_ReplaceAgentLabels_3= ruleReplaceAgentLabels )
            int alt3=4;
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
            case 24:
                {
                alt3=4;
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
                    // InternalDSL.g:185:3: this_ATLRefiningScript_1= ruleATLRefiningScript
                    {

                    			newCompositeNode(grammarAccess.getTransformationAccess().getATLRefiningScriptParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ATLRefiningScript_1=ruleATLRefiningScript();

                    state._fsp--;


                    			current = this_ATLRefiningScript_1;
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
                case 4 :
                    // InternalDSL.g:203:3: this_ReplaceAgentLabels_3= ruleReplaceAgentLabels
                    {

                    			newCompositeNode(grammarAccess.getTransformationAccess().getReplaceAgentLabelsParserRuleCall_3());
                    		
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
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleChangePlugin"
    // InternalDSL.g:215:1: entryRuleChangePlugin returns [EObject current=null] : iv_ruleChangePlugin= ruleChangePlugin EOF ;
    public final EObject entryRuleChangePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangePlugin = null;


        try {
            // InternalDSL.g:215:53: (iv_ruleChangePlugin= ruleChangePlugin EOF )
            // InternalDSL.g:216:2: iv_ruleChangePlugin= ruleChangePlugin EOF
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
    // InternalDSL.g:222:1: ruleChangePlugin returns [EObject current=null] : (otherlv_0= 'ChangePlugin' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) otherlv_6= 'name' ( (lv_name_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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
            // InternalDSL.g:228:2: ( (otherlv_0= 'ChangePlugin' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) otherlv_6= 'name' ( (lv_name_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalDSL.g:229:2: (otherlv_0= 'ChangePlugin' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) otherlv_6= 'name' ( (lv_name_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalDSL.g:229:2: (otherlv_0= 'ChangePlugin' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) otherlv_6= 'name' ( (lv_name_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalDSL.g:230:3: otherlv_0= 'ChangePlugin' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'version' ( (lv_version_5_0= ruleEString ) ) otherlv_6= 'name' ( (lv_name_7_0= ruleStringToStringMapEntry ) ) (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChangePluginAccess().getChangePluginKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getChangePluginAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getChangePluginAccess().getModelKeyword_2());
            		
            // InternalDSL.g:242:3: ( (lv_model_3_0= ruleMODEL_NAMES ) )
            // InternalDSL.g:243:4: (lv_model_3_0= ruleMODEL_NAMES )
            {
            // InternalDSL.g:243:4: (lv_model_3_0= ruleMODEL_NAMES )
            // InternalDSL.g:244:5: lv_model_3_0= ruleMODEL_NAMES
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
            		
            // InternalDSL.g:265:3: ( (lv_version_5_0= ruleEString ) )
            // InternalDSL.g:266:4: (lv_version_5_0= ruleEString )
            {
            // InternalDSL.g:266:4: (lv_version_5_0= ruleEString )
            // InternalDSL.g:267:5: lv_version_5_0= ruleEString
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
            		
            // InternalDSL.g:288:3: ( (lv_name_7_0= ruleStringToStringMapEntry ) )
            // InternalDSL.g:289:4: (lv_name_7_0= ruleStringToStringMapEntry )
            {
            // InternalDSL.g:289:4: (lv_name_7_0= ruleStringToStringMapEntry )
            // InternalDSL.g:290:5: lv_name_7_0= ruleStringToStringMapEntry
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

            // InternalDSL.g:307:3: (otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDSL.g:308:4: otherlv_8= 'args' otherlv_9= '{' ( (lv_args_10_0= ruleStringToStringMapEntry ) ) (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getChangePluginAccess().getArgsKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getChangePluginAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalDSL.g:316:4: ( (lv_args_10_0= ruleStringToStringMapEntry ) )
                    // InternalDSL.g:317:5: (lv_args_10_0= ruleStringToStringMapEntry )
                    {
                    // InternalDSL.g:317:5: (lv_args_10_0= ruleStringToStringMapEntry )
                    // InternalDSL.g:318:6: lv_args_10_0= ruleStringToStringMapEntry
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

                    // InternalDSL.g:335:4: (otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDSL.g:336:5: otherlv_11= ',' ( (lv_args_12_0= ruleStringToStringMapEntry ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getChangePluginAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalDSL.g:340:5: ( (lv_args_12_0= ruleStringToStringMapEntry ) )
                    	    // InternalDSL.g:341:6: (lv_args_12_0= ruleStringToStringMapEntry )
                    	    {
                    	    // InternalDSL.g:341:6: (lv_args_12_0= ruleStringToStringMapEntry )
                    	    // InternalDSL.g:342:7: lv_args_12_0= ruleStringToStringMapEntry
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


    // $ANTLR start "entryRuleATLRefiningScript"
    // InternalDSL.g:373:1: entryRuleATLRefiningScript returns [EObject current=null] : iv_ruleATLRefiningScript= ruleATLRefiningScript EOF ;
    public final EObject entryRuleATLRefiningScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATLRefiningScript = null;


        try {
            // InternalDSL.g:373:58: (iv_ruleATLRefiningScript= ruleATLRefiningScript EOF )
            // InternalDSL.g:374:2: iv_ruleATLRefiningScript= ruleATLRefiningScript EOF
            {
             newCompositeNode(grammarAccess.getATLRefiningScriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleATLRefiningScript=ruleATLRefiningScript();

            state._fsp--;

             current =iv_ruleATLRefiningScript; 
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
    // $ANTLR end "entryRuleATLRefiningScript"


    // $ANTLR start "ruleATLRefiningScript"
    // InternalDSL.g:380:1: ruleATLRefiningScript returns [EObject current=null] : (otherlv_0= 'ATLRefiningScript' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'script' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleATLRefiningScript() throws RecognitionException {
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
            // InternalDSL.g:386:2: ( (otherlv_0= 'ATLRefiningScript' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'script' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // InternalDSL.g:387:2: (otherlv_0= 'ATLRefiningScript' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'script' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // InternalDSL.g:387:2: (otherlv_0= 'ATLRefiningScript' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'script' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}' )
            // InternalDSL.g:388:3: otherlv_0= 'ATLRefiningScript' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'script' ( (lv_script_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getATLRefiningScriptAccess().getATLRefiningScriptKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getATLRefiningScriptAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getATLRefiningScriptAccess().getModelKeyword_2());
            		
            // InternalDSL.g:400:3: ( (lv_model_3_0= ruleMODEL_NAMES ) )
            // InternalDSL.g:401:4: (lv_model_3_0= ruleMODEL_NAMES )
            {
            // InternalDSL.g:401:4: (lv_model_3_0= ruleMODEL_NAMES )
            // InternalDSL.g:402:5: lv_model_3_0= ruleMODEL_NAMES
            {

            					newCompositeNode(grammarAccess.getATLRefiningScriptAccess().getModelMODEL_NAMESEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_model_3_0=ruleMODEL_NAMES();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATLRefiningScriptRule());
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

            			newLeafNode(otherlv_4, grammarAccess.getATLRefiningScriptAccess().getScriptKeyword_4());
            		
            // InternalDSL.g:423:3: ( (lv_script_5_0= ruleEString ) )
            // InternalDSL.g:424:4: (lv_script_5_0= ruleEString )
            {
            // InternalDSL.g:424:4: (lv_script_5_0= ruleEString )
            // InternalDSL.g:425:5: lv_script_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getATLRefiningScriptAccess().getScriptEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_script_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATLRefiningScriptRule());
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

            			newLeafNode(otherlv_6, grammarAccess.getATLRefiningScriptAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleATLRefiningScript"


    // $ANTLR start "entryRuleChangeAgentLabel"
    // InternalDSL.g:450:1: entryRuleChangeAgentLabel returns [EObject current=null] : iv_ruleChangeAgentLabel= ruleChangeAgentLabel EOF ;
    public final EObject entryRuleChangeAgentLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeAgentLabel = null;


        try {
            // InternalDSL.g:450:57: (iv_ruleChangeAgentLabel= ruleChangeAgentLabel EOF )
            // InternalDSL.g:451:2: iv_ruleChangeAgentLabel= ruleChangeAgentLabel EOF
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
    // InternalDSL.g:457:1: ruleChangeAgentLabel returns [EObject current=null] : (otherlv_0= 'ChangeAgentLabel' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleStringToStringMapEntry ) ) otherlv_6= '}' ) ;
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
            // InternalDSL.g:463:2: ( (otherlv_0= 'ChangeAgentLabel' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleStringToStringMapEntry ) ) otherlv_6= '}' ) )
            // InternalDSL.g:464:2: (otherlv_0= 'ChangeAgentLabel' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleStringToStringMapEntry ) ) otherlv_6= '}' )
            {
            // InternalDSL.g:464:2: (otherlv_0= 'ChangeAgentLabel' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleStringToStringMapEntry ) ) otherlv_6= '}' )
            // InternalDSL.g:465:3: otherlv_0= 'ChangeAgentLabel' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'name' ( (lv_name_5_0= ruleStringToStringMapEntry ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeAgentLabelAccess().getChangeAgentLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeAgentLabelAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getChangeAgentLabelAccess().getModelKeyword_2());
            		
            // InternalDSL.g:477:3: ( (lv_model_3_0= ruleMODEL_NAMES ) )
            // InternalDSL.g:478:4: (lv_model_3_0= ruleMODEL_NAMES )
            {
            // InternalDSL.g:478:4: (lv_model_3_0= ruleMODEL_NAMES )
            // InternalDSL.g:479:5: lv_model_3_0= ruleMODEL_NAMES
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
            		
            // InternalDSL.g:500:3: ( (lv_name_5_0= ruleStringToStringMapEntry ) )
            // InternalDSL.g:501:4: (lv_name_5_0= ruleStringToStringMapEntry )
            {
            // InternalDSL.g:501:4: (lv_name_5_0= ruleStringToStringMapEntry )
            // InternalDSL.g:502:5: lv_name_5_0= ruleStringToStringMapEntry
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


    // $ANTLR start "entryRuleReplaceAgentLabels"
    // InternalDSL.g:527:1: entryRuleReplaceAgentLabels returns [EObject current=null] : iv_ruleReplaceAgentLabels= ruleReplaceAgentLabels EOF ;
    public final EObject entryRuleReplaceAgentLabels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplaceAgentLabels = null;


        try {
            // InternalDSL.g:527:59: (iv_ruleReplaceAgentLabels= ruleReplaceAgentLabels EOF )
            // InternalDSL.g:528:2: iv_ruleReplaceAgentLabels= ruleReplaceAgentLabels EOF
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
    // InternalDSL.g:534:1: ruleReplaceAgentLabels returns [EObject current=null] : (otherlv_0= 'ReplaceAgentLabels' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) otherlv_6= 'labels' ( (lv_labels_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_labels_9_0= ruleEString ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleReplaceAgentLabels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_model_3_0 = null;

        AntlrDatatypeRuleToken lv_condition_5_0 = null;

        AntlrDatatypeRuleToken lv_labels_7_0 = null;

        AntlrDatatypeRuleToken lv_labels_9_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:540:2: ( (otherlv_0= 'ReplaceAgentLabels' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) otherlv_6= 'labels' ( (lv_labels_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_labels_9_0= ruleEString ) ) )* otherlv_10= '}' ) )
            // InternalDSL.g:541:2: (otherlv_0= 'ReplaceAgentLabels' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) otherlv_6= 'labels' ( (lv_labels_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_labels_9_0= ruleEString ) ) )* otherlv_10= '}' )
            {
            // InternalDSL.g:541:2: (otherlv_0= 'ReplaceAgentLabels' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) otherlv_6= 'labels' ( (lv_labels_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_labels_9_0= ruleEString ) ) )* otherlv_10= '}' )
            // InternalDSL.g:542:3: otherlv_0= 'ReplaceAgentLabels' otherlv_1= '{' otherlv_2= 'model' ( (lv_model_3_0= ruleMODEL_NAMES ) ) otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) otherlv_6= 'labels' ( (lv_labels_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_labels_9_0= ruleEString ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReplaceAgentLabelsAccess().getReplaceAgentLabelsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getReplaceAgentLabelsAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getReplaceAgentLabelsAccess().getModelKeyword_2());
            		
            // InternalDSL.g:554:3: ( (lv_model_3_0= ruleMODEL_NAMES ) )
            // InternalDSL.g:555:4: (lv_model_3_0= ruleMODEL_NAMES )
            {
            // InternalDSL.g:555:4: (lv_model_3_0= ruleMODEL_NAMES )
            // InternalDSL.g:556:5: lv_model_3_0= ruleMODEL_NAMES
            {

            					newCompositeNode(grammarAccess.getReplaceAgentLabelsAccess().getModelMODEL_NAMESEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_model_3_0=ruleMODEL_NAMES();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReplaceAgentLabelsRule());
            					}
            					set(
            						current,
            						"model",
            						lv_model_3_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.MODEL_NAMES");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getReplaceAgentLabelsAccess().getConditionKeyword_4());
            		
            // InternalDSL.g:577:3: ( (lv_condition_5_0= ruleEString ) )
            // InternalDSL.g:578:4: (lv_condition_5_0= ruleEString )
            {
            // InternalDSL.g:578:4: (lv_condition_5_0= ruleEString )
            // InternalDSL.g:579:5: lv_condition_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReplaceAgentLabelsAccess().getConditionEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
            lv_condition_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReplaceAgentLabelsRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_5_0,
            						"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getReplaceAgentLabelsAccess().getLabelsKeyword_6());
            		
            // InternalDSL.g:600:3: ( (lv_labels_7_0= ruleEString ) )
            // InternalDSL.g:601:4: (lv_labels_7_0= ruleEString )
            {
            // InternalDSL.g:601:4: (lv_labels_7_0= ruleEString )
            // InternalDSL.g:602:5: lv_labels_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReplaceAgentLabelsAccess().getLabelsEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalDSL.g:619:3: (otherlv_8= ',' ( (lv_labels_9_0= ruleEString ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDSL.g:620:4: otherlv_8= ',' ( (lv_labels_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,14,FOLLOW_11); 

            	    				newLeafNode(otherlv_8, grammarAccess.getReplaceAgentLabelsAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalDSL.g:624:4: ( (lv_labels_9_0= ruleEString ) )
            	    // InternalDSL.g:625:5: (lv_labels_9_0= ruleEString )
            	    {
            	    // InternalDSL.g:625:5: (lv_labels_9_0= ruleEString )
            	    // InternalDSL.g:626:6: lv_labels_9_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getReplaceAgentLabelsAccess().getLabelsEStringParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_labels_9_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getReplaceAgentLabelsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_9_0,
            	    							"d.fe.up.pt.cicd.transformationsdsl.dsl.DSL.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getReplaceAgentLabelsAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleStringToStringMapEntry"
    // InternalDSL.g:652:1: entryRuleStringToStringMapEntry returns [EObject current=null] : iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF ;
    public final EObject entryRuleStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringToStringMapEntry = null;


        try {
            // InternalDSL.g:652:63: (iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF )
            // InternalDSL.g:653:2: iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF
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
    // InternalDSL.g:659:1: ruleStringToStringMapEntry returns [EObject current=null] : (otherlv_0= 'StringToStringMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalDSL.g:665:2: ( (otherlv_0= 'StringToStringMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // InternalDSL.g:666:2: (otherlv_0= 'StringToStringMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // InternalDSL.g:666:2: (otherlv_0= 'StringToStringMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' )
            // InternalDSL.g:667:3: otherlv_0= 'StringToStringMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getStringToStringMapEntryAccess().getKeyKeyword_2());
            		
            // InternalDSL.g:679:3: ( (lv_key_3_0= ruleEString ) )
            // InternalDSL.g:680:4: (lv_key_3_0= ruleEString )
            {
            // InternalDSL.g:680:4: (lv_key_3_0= ruleEString )
            // InternalDSL.g:681:5: lv_key_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_4=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getStringToStringMapEntryAccess().getValueKeyword_4());
            		
            // InternalDSL.g:702:3: ( (lv_value_5_0= ruleEString ) )
            // InternalDSL.g:703:4: (lv_value_5_0= ruleEString )
            {
            // InternalDSL.g:703:4: (lv_value_5_0= ruleEString )
            // InternalDSL.g:704:5: lv_value_5_0= ruleEString
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
    // InternalDSL.g:729:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDSL.g:729:47: (iv_ruleEString= ruleEString EOF )
            // InternalDSL.g:730:2: iv_ruleEString= ruleEString EOF
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
    // InternalDSL.g:736:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDSL.g:742:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDSL.g:743:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDSL.g:743:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:744:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:752:3: this_ID_1= RULE_ID
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
    // InternalDSL.g:763:1: ruleMODEL_NAMES returns [Enumerator current=null] : ( (enumLiteral_0= 'CICD' ) | (enumLiteral_1= 'GHA' ) | (enumLiteral_2= 'CircleCI' ) ) ;
    public final Enumerator ruleMODEL_NAMES() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDSL.g:769:2: ( ( (enumLiteral_0= 'CICD' ) | (enumLiteral_1= 'GHA' ) | (enumLiteral_2= 'CircleCI' ) ) )
            // InternalDSL.g:770:2: ( (enumLiteral_0= 'CICD' ) | (enumLiteral_1= 'GHA' ) | (enumLiteral_2= 'CircleCI' ) )
            {
            // InternalDSL.g:770:2: ( (enumLiteral_0= 'CICD' ) | (enumLiteral_1= 'GHA' ) | (enumLiteral_2= 'CircleCI' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt8=1;
                }
                break;
            case 31:
                {
                alt8=2;
                }
                break;
            case 32:
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
                    // InternalDSL.g:771:3: (enumLiteral_0= 'CICD' )
                    {
                    // InternalDSL.g:771:3: (enumLiteral_0= 'CICD' )
                    // InternalDSL.g:772:4: enumLiteral_0= 'CICD'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getMODEL_NAMESAccess().getCICDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMODEL_NAMESAccess().getCICDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:779:3: (enumLiteral_1= 'GHA' )
                    {
                    // InternalDSL.g:779:3: (enumLiteral_1= 'GHA' )
                    // InternalDSL.g:780:4: enumLiteral_1= 'GHA'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getMODEL_NAMESAccess().getGHAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMODEL_NAMESAccess().getGHAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:787:3: (enumLiteral_2= 'CircleCI' )
                    {
                    // InternalDSL.g:787:3: (enumLiteral_2= 'CircleCI' )
                    // InternalDSL.g:788:4: enumLiteral_2= 'CircleCI'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001A10000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});

}