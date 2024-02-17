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
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import d.fe.up.pt.cicd.gha.dsl.services.GitHubActionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGitHubActionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Pull_request_review_comment", "Branch_protection_rule", "Review_request_removed", "Auto_merge_disabled", "Pull_request_review", "Repository_dispatch", "Repository_projects", "Auto_merge_enabled", "Converted_to_draft", "Deployment_status", "Ready_for_review", "Registry_package", "Review_requested", "Security_events", "Project_column", "Pull_requests", "Project_card", "Check_suite", "Deployments", "Discussions", "Environment", "Merge_group", "Synchronize", "Deployment", "Discussion", "Page_build", "StartsWith", "Unassigned", "Cancelled", "Check_run", "HashFiles", "Milestone", "Unlabeled", "Assigned", "Contains", "Contents", "EndsWith", "FromJSON", "IdToken", "Packages", "Reopened", "RunName", "Statuses", "Strategy", "Unlocked", "Actions", "Boolean", "Created", "Deleted", "Failure", "Labeled", "Project", "Release", "Secrets", "Success", "Always", "Checks", "Choice", "Closed", "Create", "Delete", "Edited", "Format", "Github", "Gollum", "Inputs", "Issues", "Locked", "Matrix", "Number", "Opened", "Public", "Runner", "Status", "String", "ToJSON", "Label", "Needs", "Pages", "Steps", "Watch", "Write", "Fork", "Jobs", "Join", "Name", "None", "Read", "Vars", "DollarSignLeftCurlyBracketLeftCurlyBracket", "Env", "Job", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "VerticalLineVerticalLine", "RightCurlyBracketRightCurlyBracket", "ExclamationMark", "QuotationMark", "Apostrophe", "LeftParenthesis", "RightParenthesis", "Comma", "FullStop", "Colon", "LessThanSign", "GreaterThanSign", "LeftSquareBracket", "RightSquareBracket", "RULE_INT", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_UNQUOTED_STRING_BEGIN_CHARS", "RULE_UNQUOTED_STRING_CHARS", "RULE_UNQUOTED_STRING", "RULE_BEGIN", "RULE_END", "RULE_NEWLINE", "RULE_WS", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER"
    };
    public static final int Delete=64;
    public static final int Secrets=57;
    public static final int Labeled=54;
    public static final int Needs=81;
    public static final int Deployments=22;
    public static final int String=78;
    public static final int Success=58;
    public static final int LessThanSign=111;
    public static final int Unlabeled=36;
    public static final int RunName=45;
    public static final int Matrix=72;
    public static final int LeftParenthesis=106;
    public static final int FromJSON=41;
    public static final int Boolean=50;
    public static final int Failure=53;
    public static final int ExclamationMark=103;
    public static final int Assigned=37;
    public static final int Status=77;
    public static final int GreaterThanSign=112;
    public static final int Review_requested=16;
    public static final int Repository_dispatch=9;
    public static final int RULE_ID=125;
    public static final int Actions=49;
    public static final int Github=67;
    public static final int GreaterThanSignEqualsSign=100;
    public static final int Merge_group=25;
    public static final int Pages=82;
    public static final int Project=55;
    public static final int EqualsSignEqualsSign=99;
    public static final int Contents=39;
    public static final int Statuses=46;
    public static final int RULE_INT=115;
    public static final int Contains=38;
    public static final int Edited=65;
    public static final int RULE_ML_COMMENT=127;
    public static final int Unassigned=31;
    public static final int LeftSquareBracket=113;
    public static final int Always=59;
    public static final int EndsWith=40;
    public static final int Write=85;
    public static final int RightCurlyBracketRightCurlyBracket=102;
    public static final int Unlocked=48;
    public static final int Check_suite=21;
    public static final int VerticalLineVerticalLine=101;
    public static final int RULE_NEWLINE=123;
    public static final int Auto_merge_disabled=7;
    public static final int Pull_request_review=8;
    public static final int QuotationMark=104;
    public static final int Created=51;
    public static final int Comma=108;
    public static final int Project_card=20;
    public static final int Jobs=87;
    public static final int Registry_package=15;
    public static final int Gollum=68;
    public static final int Watch=84;
    public static final int Deleted=52;
    public static final int LessThanSignEqualsSign=98;
    public static final int Apostrophe=105;
    public static final int IdToken=42;
    public static final int FullStop=109;
    public static final int Vars=92;
    public static final int HashFiles=34;
    public static final int Join=88;
    public static final int ExclamationMarkEqualsSign=96;
    public static final int None=90;
    public static final int Review_request_removed=6;
    public static final int Ready_for_review=14;
    public static final int Choice=61;
    public static final int RULE_BEGIN=121;
    public static final int Deployment_status=13;
    public static final int Discussions=23;
    public static final int Security_events=17;
    public static final int Synchronize=26;
    public static final int Label=80;
    public static final int RULE_UNQUOTED_STRING_BEGIN_CHARS=118;
    public static final int Deployment=27;
    public static final int RULE_BOOLEAN=117;
    public static final int Check_run=33;
    public static final int Name=89;
    public static final int Pull_request_review_comment=4;
    public static final int Read=91;
    public static final int Branch_protection_rule=5;
    public static final int ToJSON=79;
    public static final int Packages=43;
    public static final int Job=95;
    public static final int RightSquareBracket=114;
    public static final int Opened=74;
    public static final int Repository_projects=10;
    public static final int Milestone=35;
    public static final int RightParenthesis=107;
    public static final int Public=75;
    public static final int Checks=60;
    public static final int Environment=24;
    public static final int Discussion=28;
    public static final int DollarSignLeftCurlyBracketLeftCurlyBracket=93;
    public static final int Steps=83;
    public static final int Runner=76;
    public static final int RULE_END=122;
    public static final int Fork=86;
    public static final int Reopened=44;
    public static final int Issues=70;
    public static final int RULE_STRING=126;
    public static final int RULE_UNQUOTED_STRING=120;
    public static final int Env=94;
    public static final int StartsWith=30;
    public static final int RULE_SL_COMMENT=128;
    public static final int Pull_requests=19;
    public static final int Locked=71;
    public static final int Auto_merge_enabled=11;
    public static final int Format=66;
    public static final int Project_column=18;
    public static final int Number=73;
    public static final int AmpersandAmpersand=97;
    public static final int RULE_DOUBLE=116;
    public static final int Page_build=29;
    public static final int Create=63;
    public static final int RULE_UNQUOTED_STRING_CHARS=119;
    public static final int Colon=110;
    public static final int EOF=-1;
    public static final int Inputs=69;
    public static final int Release=56;
    public static final int RULE_WS=124;
    public static final int Cancelled=32;
    public static final int RULE_ANY_OTHER=129;
    public static final int Converted_to_draft=12;
    public static final int Closed=62;
    public static final int Strategy=47;

    // delegates
    // delegators


        public InternalGitHubActionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGitHubActionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGitHubActionsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGitHubActionsParser.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private GitHubActionsGrammarAccess grammarAccess;

        public InternalGitHubActionsParser(TokenStream input, GitHubActionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Workflow";
       	}

       	@Override
       	protected GitHubActionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWorkflow"
    // InternalGitHubActionsParser.g:65:1: entryRuleWorkflow returns [EObject current=null] : iv_ruleWorkflow= ruleWorkflow EOF ;
    public final EObject entryRuleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getWorkflowAccess().getUnorderedGroup_1()
        	);

        try {
            // InternalGitHubActionsParser.g:69:2: (iv_ruleWorkflow= ruleWorkflow EOF )
            // InternalGitHubActionsParser.g:70:2: iv_ruleWorkflow= ruleWorkflow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkflowRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWorkflow=ruleWorkflow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkflow; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflow"


    // $ANTLR start "ruleWorkflow"
    // InternalGitHubActionsParser.g:79:1: ruleWorkflow returns [EObject current=null] : ( ( (this_WS_0= RULE_WS )? this_NEWLINE_1= RULE_NEWLINE )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleWorkflow() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_NEWLINE_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_WS_5=null;
        Token this_NEWLINE_7=null;
        Token this_WS_8=null;
        Token this_NEWLINE_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_WS_12=null;
        EObject lv_name_6_0 = null;

        EObject lv_runName_13_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getWorkflowAccess().getUnorderedGroup_1()
        	);

        try {
            // InternalGitHubActionsParser.g:88:2: ( ( ( (this_WS_0= RULE_WS )? this_NEWLINE_1= RULE_NEWLINE )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) ) )* ) ) ) ) )
            // InternalGitHubActionsParser.g:89:2: ( ( (this_WS_0= RULE_WS )? this_NEWLINE_1= RULE_NEWLINE )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalGitHubActionsParser.g:89:2: ( ( (this_WS_0= RULE_WS )? this_NEWLINE_1= RULE_NEWLINE )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) ) )* ) ) ) )
            // InternalGitHubActionsParser.g:90:3: ( (this_WS_0= RULE_WS )? this_NEWLINE_1= RULE_NEWLINE )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) ) )* ) ) )
            {
            // InternalGitHubActionsParser.g:90:3: ( (this_WS_0= RULE_WS )? this_NEWLINE_1= RULE_NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_NEWLINE && LA2_0<=RULE_WS)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGitHubActionsParser.g:91:4: (this_WS_0= RULE_WS )? this_NEWLINE_1= RULE_NEWLINE
            	    {
            	    // InternalGitHubActionsParser.g:91:4: (this_WS_0= RULE_WS )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==RULE_WS) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalGitHubActionsParser.g:92:5: this_WS_0= RULE_WS
            	            {
            	            this_WS_0=(Token)match(input,RULE_WS,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_WS_0, grammarAccess.getWorkflowAccess().getWSTerminalRuleCall_0_0());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    this_NEWLINE_1=(Token)match(input,RULE_NEWLINE,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_NEWLINE_1, grammarAccess.getWorkflowAccess().getNEWLINETerminalRuleCall_0_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalGitHubActionsParser.g:102:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) ) )* ) ) )
            // InternalGitHubActionsParser.g:103:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) ) )* ) )
            {
            // InternalGitHubActionsParser.g:103:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) ) )* ) )
            // InternalGitHubActionsParser.g:104:5: ( ( ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getWorkflowAccess().getUnorderedGroup_1());
            // InternalGitHubActionsParser.g:107:5: ( ( ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) ) )* )
            // InternalGitHubActionsParser.g:108:6: ( ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) ) )*
            {
            // InternalGitHubActionsParser.g:108:6: ( ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getWorkflowAccess().getUnorderedGroup_1(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getWorkflowAccess().getUnorderedGroup_1(), 1) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGitHubActionsParser.g:109:4: ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) )
            	    {
            	    // InternalGitHubActionsParser.g:109:4: ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) )
            	    // InternalGitHubActionsParser.g:110:5: {...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWorkflowAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleWorkflow", "getUnorderedGroupHelper().canSelect(grammarAccess.getWorkflowAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalGitHubActionsParser.g:110:105: ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) )
            	    // InternalGitHubActionsParser.g:111:6: ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getWorkflowAccess().getUnorderedGroup_1(), 0);
            	    // InternalGitHubActionsParser.g:114:9: ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) )
            	    // InternalGitHubActionsParser.g:114:10: {...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleWorkflow", "true");
            	    }
            	    // InternalGitHubActionsParser.g:114:19: (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* )
            	    // InternalGitHubActionsParser.g:114:20: otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )*
            	    {
            	    otherlv_3=(Token)match(input,Name,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getWorkflowAccess().getNameKeyword_1_0_0());
            	      								
            	    }
            	    otherlv_4=(Token)match(input,Colon,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getWorkflowAccess().getColonKeyword_1_0_1());
            	      								
            	    }
            	    // InternalGitHubActionsParser.g:122:9: (this_WS_5= RULE_WS )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_WS) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalGitHubActionsParser.g:123:10: this_WS_5= RULE_WS
            	            {
            	            this_WS_5=(Token)match(input,RULE_WS,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              										newLeafNode(this_WS_5, grammarAccess.getWorkflowAccess().getWSTerminalRuleCall_1_0_2());
            	              									
            	            }

            	            }
            	            break;

            	    }

            	    // InternalGitHubActionsParser.g:128:9: ( (lv_name_6_0= ruleExpression ) )
            	    // InternalGitHubActionsParser.g:129:10: (lv_name_6_0= ruleExpression )
            	    {
            	    // InternalGitHubActionsParser.g:129:10: (lv_name_6_0= ruleExpression )
            	    // InternalGitHubActionsParser.g:130:11: lv_name_6_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getWorkflowAccess().getNameExpressionParserRuleCall_1_0_3_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_name_6_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	      											}
            	      											set(
            	      												current,
            	      												"name",
            	      												lv_name_6_0,
            	      												"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Expression");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    this_NEWLINE_7=(Token)match(input,RULE_NEWLINE,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(this_NEWLINE_7, grammarAccess.getWorkflowAccess().getNEWLINETerminalRuleCall_1_0_4());
            	      								
            	    }
            	    // InternalGitHubActionsParser.g:151:9: ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( ((LA5_0>=RULE_NEWLINE && LA5_0<=RULE_WS)) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalGitHubActionsParser.g:152:10: (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE
            	    	    {
            	    	    // InternalGitHubActionsParser.g:152:10: (this_WS_8= RULE_WS )?
            	    	    int alt4=2;
            	    	    int LA4_0 = input.LA(1);

            	    	    if ( (LA4_0==RULE_WS) ) {
            	    	        alt4=1;
            	    	    }
            	    	    switch (alt4) {
            	    	        case 1 :
            	    	            // InternalGitHubActionsParser.g:153:11: this_WS_8= RULE_WS
            	    	            {
            	    	            this_WS_8=(Token)match(input,RULE_WS,FOLLOW_3); if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              											newLeafNode(this_WS_8, grammarAccess.getWorkflowAccess().getWSTerminalRuleCall_1_0_5_0());
            	    	              										
            	    	            }

            	    	            }
            	    	            break;

            	    	    }

            	    	    this_NEWLINE_9=(Token)match(input,RULE_NEWLINE,FOLLOW_4); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(this_NEWLINE_9, grammarAccess.getWorkflowAccess().getNEWLINETerminalRuleCall_1_0_5_1());
            	    	      									
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWorkflowAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGitHubActionsParser.g:169:4: ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) )
            	    {
            	    // InternalGitHubActionsParser.g:169:4: ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) )
            	    // InternalGitHubActionsParser.g:170:5: {...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWorkflowAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleWorkflow", "getUnorderedGroupHelper().canSelect(grammarAccess.getWorkflowAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalGitHubActionsParser.g:170:105: ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) )
            	    // InternalGitHubActionsParser.g:171:6: ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getWorkflowAccess().getUnorderedGroup_1(), 1);
            	    // InternalGitHubActionsParser.g:174:9: ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) )
            	    // InternalGitHubActionsParser.g:174:10: {...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleWorkflow", "true");
            	    }
            	    // InternalGitHubActionsParser.g:174:19: (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) )
            	    // InternalGitHubActionsParser.g:174:20: otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) )
            	    {
            	    otherlv_10=(Token)match(input,RunName,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_10, grammarAccess.getWorkflowAccess().getRunNameKeyword_1_1_0());
            	      								
            	    }
            	    otherlv_11=(Token)match(input,Colon,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getWorkflowAccess().getColonKeyword_1_1_1());
            	      								
            	    }
            	    // InternalGitHubActionsParser.g:182:9: (this_WS_12= RULE_WS )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_WS) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalGitHubActionsParser.g:183:10: this_WS_12= RULE_WS
            	            {
            	            this_WS_12=(Token)match(input,RULE_WS,FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              										newLeafNode(this_WS_12, grammarAccess.getWorkflowAccess().getWSTerminalRuleCall_1_1_2());
            	              									
            	            }

            	            }
            	            break;

            	    }

            	    // InternalGitHubActionsParser.g:188:9: ( (lv_runName_13_0= ruleExpression ) )
            	    // InternalGitHubActionsParser.g:189:10: (lv_runName_13_0= ruleExpression )
            	    {
            	    // InternalGitHubActionsParser.g:189:10: (lv_runName_13_0= ruleExpression )
            	    // InternalGitHubActionsParser.g:190:11: lv_runName_13_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getWorkflowAccess().getRunNameExpressionParserRuleCall_1_1_3_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_runName_13_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	      											}
            	      											set(
            	      												current,
            	      												"runName",
            	      												lv_runName_13_0,
            	      												"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Expression");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWorkflowAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getWorkflowAccess().getUnorderedGroup_1());

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleWorkflow"


    // $ANTLR start "entryRuleExpression"
    // InternalGitHubActionsParser.g:227:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGitHubActionsParser.g:227:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGitHubActionsParser.g:228:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:234:1: ruleExpression returns [EObject current=null] : this_Concat_0= ruleConcat ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Concat_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:240:2: (this_Concat_0= ruleConcat )
            // InternalGitHubActionsParser.g:241:2: this_Concat_0= ruleConcat
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getConcatParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Concat_0=ruleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Concat_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleConcat"
    // InternalGitHubActionsParser.g:255:1: entryRuleConcat returns [EObject current=null] : iv_ruleConcat= ruleConcat EOF ;
    public final EObject entryRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcat = null;


        try {
            // InternalGitHubActionsParser.g:255:47: (iv_ruleConcat= ruleConcat EOF )
            // InternalGitHubActionsParser.g:256:2: iv_ruleConcat= ruleConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcat=ruleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConcat"


    // $ANTLR start "ruleConcat"
    // InternalGitHubActionsParser.g:262:1: ruleConcat returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleConcatExpression ) ) (this_WS_1= RULE_WS ( (lv_expressions_2_0= ruleConcatExpression ) ) )* ) ;
    public final EObject ruleConcat() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:268:2: ( ( ( (lv_expressions_0_0= ruleConcatExpression ) ) (this_WS_1= RULE_WS ( (lv_expressions_2_0= ruleConcatExpression ) ) )* ) )
            // InternalGitHubActionsParser.g:269:2: ( ( (lv_expressions_0_0= ruleConcatExpression ) ) (this_WS_1= RULE_WS ( (lv_expressions_2_0= ruleConcatExpression ) ) )* )
            {
            // InternalGitHubActionsParser.g:269:2: ( ( (lv_expressions_0_0= ruleConcatExpression ) ) (this_WS_1= RULE_WS ( (lv_expressions_2_0= ruleConcatExpression ) ) )* )
            // InternalGitHubActionsParser.g:270:3: ( (lv_expressions_0_0= ruleConcatExpression ) ) (this_WS_1= RULE_WS ( (lv_expressions_2_0= ruleConcatExpression ) ) )*
            {
            // InternalGitHubActionsParser.g:270:3: ( (lv_expressions_0_0= ruleConcatExpression ) )
            // InternalGitHubActionsParser.g:271:4: (lv_expressions_0_0= ruleConcatExpression )
            {
            // InternalGitHubActionsParser.g:271:4: (lv_expressions_0_0= ruleConcatExpression )
            // InternalGitHubActionsParser.g:272:5: lv_expressions_0_0= ruleConcatExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConcatAccess().getExpressionsConcatExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_expressions_0_0=ruleConcatExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConcatRule());
              					}
              					add(
              						current,
              						"expressions",
              						lv_expressions_0_0,
              						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.ConcatExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGitHubActionsParser.g:289:3: (this_WS_1= RULE_WS ( (lv_expressions_2_0= ruleConcatExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGitHubActionsParser.g:290:4: this_WS_1= RULE_WS ( (lv_expressions_2_0= ruleConcatExpression ) )
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_1, grammarAccess.getConcatAccess().getWSTerminalRuleCall_1_0());
            	      			
            	    }
            	    // InternalGitHubActionsParser.g:294:4: ( (lv_expressions_2_0= ruleConcatExpression ) )
            	    // InternalGitHubActionsParser.g:295:5: (lv_expressions_2_0= ruleConcatExpression )
            	    {
            	    // InternalGitHubActionsParser.g:295:5: (lv_expressions_2_0= ruleConcatExpression )
            	    // InternalGitHubActionsParser.g:296:6: lv_expressions_2_0= ruleConcatExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConcatAccess().getExpressionsConcatExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_expressions_2_0=ruleConcatExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConcatRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_2_0,
            	      							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.ConcatExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConcat"


    // $ANTLR start "entryRuleConcatExpression"
    // InternalGitHubActionsParser.g:318:1: entryRuleConcatExpression returns [EObject current=null] : iv_ruleConcatExpression= ruleConcatExpression EOF ;
    public final EObject entryRuleConcatExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatExpression = null;


        try {
            // InternalGitHubActionsParser.g:318:57: (iv_ruleConcatExpression= ruleConcatExpression EOF )
            // InternalGitHubActionsParser.g:319:2: iv_ruleConcatExpression= ruleConcatExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcatExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcatExpression=ruleConcatExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcatExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConcatExpression"


    // $ANTLR start "ruleConcatExpression"
    // InternalGitHubActionsParser.g:325:1: ruleConcatExpression returns [EObject current=null] : (this_BracketedExpression_0= ruleBracketedExpression | this_UnbracketedLiteral_1= ruleUnbracketedLiteral ) ;
    public final EObject ruleConcatExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BracketedExpression_0 = null;

        EObject this_UnbracketedLiteral_1 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:331:2: ( (this_BracketedExpression_0= ruleBracketedExpression | this_UnbracketedLiteral_1= ruleUnbracketedLiteral ) )
            // InternalGitHubActionsParser.g:332:2: (this_BracketedExpression_0= ruleBracketedExpression | this_UnbracketedLiteral_1= ruleUnbracketedLiteral )
            {
            // InternalGitHubActionsParser.g:332:2: (this_BracketedExpression_0= ruleBracketedExpression | this_UnbracketedLiteral_1= ruleUnbracketedLiteral )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DollarSignLeftCurlyBracketLeftCurlyBracket) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_BOOLEAN)||LA9_0==RULE_UNQUOTED_STRING||LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGitHubActionsParser.g:333:3: this_BracketedExpression_0= ruleBracketedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConcatExpressionAccess().getBracketedExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BracketedExpression_0=ruleBracketedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BracketedExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGitHubActionsParser.g:345:3: this_UnbracketedLiteral_1= ruleUnbracketedLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConcatExpressionAccess().getUnbracketedLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnbracketedLiteral_1=ruleUnbracketedLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnbracketedLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConcatExpression"


    // $ANTLR start "entryRuleBracketedExpression"
    // InternalGitHubActionsParser.g:360:1: entryRuleBracketedExpression returns [EObject current=null] : iv_ruleBracketedExpression= ruleBracketedExpression EOF ;
    public final EObject entryRuleBracketedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracketedExpression = null;


        try {
            // InternalGitHubActionsParser.g:360:60: (iv_ruleBracketedExpression= ruleBracketedExpression EOF )
            // InternalGitHubActionsParser.g:361:2: iv_ruleBracketedExpression= ruleBracketedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBracketedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBracketedExpression=ruleBracketedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBracketedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBracketedExpression"


    // $ANTLR start "ruleBracketedExpression"
    // InternalGitHubActionsParser.g:367:1: ruleBracketedExpression returns [EObject current=null] : (otherlv_0= DollarSignLeftCurlyBracketLeftCurlyBracket (this_WS_1= RULE_WS )? this_InsideBracketsExpression_2= ruleInsideBracketsExpression (this_WS_3= RULE_WS )? otherlv_4= RightCurlyBracketRightCurlyBracket ) ;
    public final EObject ruleBracketedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WS_1=null;
        Token this_WS_3=null;
        Token otherlv_4=null;
        EObject this_InsideBracketsExpression_2 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:373:2: ( (otherlv_0= DollarSignLeftCurlyBracketLeftCurlyBracket (this_WS_1= RULE_WS )? this_InsideBracketsExpression_2= ruleInsideBracketsExpression (this_WS_3= RULE_WS )? otherlv_4= RightCurlyBracketRightCurlyBracket ) )
            // InternalGitHubActionsParser.g:374:2: (otherlv_0= DollarSignLeftCurlyBracketLeftCurlyBracket (this_WS_1= RULE_WS )? this_InsideBracketsExpression_2= ruleInsideBracketsExpression (this_WS_3= RULE_WS )? otherlv_4= RightCurlyBracketRightCurlyBracket )
            {
            // InternalGitHubActionsParser.g:374:2: (otherlv_0= DollarSignLeftCurlyBracketLeftCurlyBracket (this_WS_1= RULE_WS )? this_InsideBracketsExpression_2= ruleInsideBracketsExpression (this_WS_3= RULE_WS )? otherlv_4= RightCurlyBracketRightCurlyBracket )
            // InternalGitHubActionsParser.g:375:3: otherlv_0= DollarSignLeftCurlyBracketLeftCurlyBracket (this_WS_1= RULE_WS )? this_InsideBracketsExpression_2= ruleInsideBracketsExpression (this_WS_3= RULE_WS )? otherlv_4= RightCurlyBracketRightCurlyBracket
            {
            otherlv_0=(Token)match(input,DollarSignLeftCurlyBracketLeftCurlyBracket,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBracketedExpressionAccess().getDollarSignLeftCurlyBracketLeftCurlyBracketKeyword_0());
              		
            }
            // InternalGitHubActionsParser.g:379:3: (this_WS_1= RULE_WS )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_WS) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGitHubActionsParser.g:380:4: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_1, grammarAccess.getBracketedExpressionAccess().getWSTerminalRuleCall_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBracketedExpressionAccess().getInsideBracketsExpressionParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_10);
            this_InsideBracketsExpression_2=ruleInsideBracketsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_InsideBracketsExpression_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGitHubActionsParser.g:396:3: (this_WS_3= RULE_WS )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_WS) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGitHubActionsParser.g:397:4: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_3, grammarAccess.getBracketedExpressionAccess().getWSTerminalRuleCall_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightCurlyBracketRightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBracketedExpressionAccess().getRightCurlyBracketRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBracketedExpression"


    // $ANTLR start "entryRuleInsideBracketsExpression"
    // InternalGitHubActionsParser.g:410:1: entryRuleInsideBracketsExpression returns [EObject current=null] : iv_ruleInsideBracketsExpression= ruleInsideBracketsExpression EOF ;
    public final EObject entryRuleInsideBracketsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsideBracketsExpression = null;


        try {
            // InternalGitHubActionsParser.g:410:65: (iv_ruleInsideBracketsExpression= ruleInsideBracketsExpression EOF )
            // InternalGitHubActionsParser.g:411:2: iv_ruleInsideBracketsExpression= ruleInsideBracketsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideBracketsExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInsideBracketsExpression=ruleInsideBracketsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsideBracketsExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInsideBracketsExpression"


    // $ANTLR start "ruleInsideBracketsExpression"
    // InternalGitHubActionsParser.g:417:1: ruleInsideBracketsExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleInsideBracketsExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:423:2: (this_Or_0= ruleOr )
            // InternalGitHubActionsParser.g:424:2: this_Or_0= ruleOr
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getInsideBracketsExpressionAccess().getOrParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Or_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInsideBracketsExpression"


    // $ANTLR start "entryRuleUnbracketedLiteral"
    // InternalGitHubActionsParser.g:438:1: entryRuleUnbracketedLiteral returns [EObject current=null] : iv_ruleUnbracketedLiteral= ruleUnbracketedLiteral EOF ;
    public final EObject entryRuleUnbracketedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnbracketedLiteral = null;


        try {
            // InternalGitHubActionsParser.g:438:59: (iv_ruleUnbracketedLiteral= ruleUnbracketedLiteral EOF )
            // InternalGitHubActionsParser.g:439:2: iv_ruleUnbracketedLiteral= ruleUnbracketedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnbracketedLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnbracketedLiteral=ruleUnbracketedLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnbracketedLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnbracketedLiteral"


    // $ANTLR start "ruleUnbracketedLiteral"
    // InternalGitHubActionsParser.g:445:1: ruleUnbracketedLiteral returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) ;
    public final EObject ruleUnbracketedLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_IntegerLiteral_1 = null;

        EObject this_DoubleLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:451:2: ( (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) )
            // InternalGitHubActionsParser.g:452:2: (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            {
            // InternalGitHubActionsParser.g:452:2: (this_StringLiteral_0= ruleStringLiteral | this_IntegerLiteral_1= ruleIntegerLiteral | this_DoubleLiteral_2= ruleDoubleLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_UNQUOTED_STRING:
            case RULE_STRING:
                {
                alt12=1;
                }
                break;
            case RULE_INT:
                {
                alt12=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt12=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalGitHubActionsParser.g:453:3: this_StringLiteral_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnbracketedLiteralAccess().getStringLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGitHubActionsParser.g:465:3: this_IntegerLiteral_1= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnbracketedLiteralAccess().getIntegerLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntegerLiteral_1=ruleIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGitHubActionsParser.g:477:3: this_DoubleLiteral_2= ruleDoubleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnbracketedLiteralAccess().getDoubleLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DoubleLiteral_2=ruleDoubleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DoubleLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGitHubActionsParser.g:489:3: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnbracketedLiteralAccess().getBooleanLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_3=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnbracketedLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalGitHubActionsParser.g:504:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalGitHubActionsParser.g:504:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalGitHubActionsParser.g:505:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:511:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleYAMLString ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:517:2: ( ( (lv_value_0_0= ruleYAMLString ) ) )
            // InternalGitHubActionsParser.g:518:2: ( (lv_value_0_0= ruleYAMLString ) )
            {
            // InternalGitHubActionsParser.g:518:2: ( (lv_value_0_0= ruleYAMLString ) )
            // InternalGitHubActionsParser.g:519:3: (lv_value_0_0= ruleYAMLString )
            {
            // InternalGitHubActionsParser.g:519:3: (lv_value_0_0= ruleYAMLString )
            // InternalGitHubActionsParser.g:520:4: lv_value_0_0= ruleYAMLString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getStringLiteralAccess().getValueYAMLStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleYAMLString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getStringLiteralRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"d.fe.up.pt.cicd.gha.dsl.GitHubActions.YAMLString");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalGitHubActionsParser.g:540:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalGitHubActionsParser.g:540:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalGitHubActionsParser.g:541:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalGitHubActionsParser.g:547:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGitHubActionsParser.g:553:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalGitHubActionsParser.g:554:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalGitHubActionsParser.g:554:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalGitHubActionsParser.g:555:3: (lv_value_0_0= RULE_INT )
            {
            // InternalGitHubActionsParser.g:555:3: (lv_value_0_0= RULE_INT )
            // InternalGitHubActionsParser.g:556:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIntegerLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleDoubleLiteral"
    // InternalGitHubActionsParser.g:575:1: entryRuleDoubleLiteral returns [EObject current=null] : iv_ruleDoubleLiteral= ruleDoubleLiteral EOF ;
    public final EObject entryRuleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLiteral = null;


        try {
            // InternalGitHubActionsParser.g:575:54: (iv_ruleDoubleLiteral= ruleDoubleLiteral EOF )
            // InternalGitHubActionsParser.g:576:2: iv_ruleDoubleLiteral= ruleDoubleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDoubleLiteral=ruleDoubleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // InternalGitHubActionsParser.g:582:1: ruleDoubleLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGitHubActionsParser.g:588:2: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // InternalGitHubActionsParser.g:589:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // InternalGitHubActionsParser.g:589:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            // InternalGitHubActionsParser.g:590:3: (lv_value_0_0= RULE_DOUBLE )
            {
            // InternalGitHubActionsParser.g:590:3: (lv_value_0_0= RULE_DOUBLE )
            // InternalGitHubActionsParser.g:591:4: lv_value_0_0= RULE_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDoubleLiteralAccess().getValueDOUBLETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDoubleLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"d.fe.up.pt.cicd.gha.dsl.GitHubActions.DOUBLE");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDoubleLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalGitHubActionsParser.g:610:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalGitHubActionsParser.g:610:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalGitHubActionsParser.g:611:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalGitHubActionsParser.g:617:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGitHubActionsParser.g:623:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalGitHubActionsParser.g:624:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalGitHubActionsParser.g:624:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalGitHubActionsParser.g:625:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalGitHubActionsParser.g:625:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalGitHubActionsParser.g:626:4: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getBooleanLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0 != null,
              					"d.fe.up.pt.cicd.gha.dsl.GitHubActions.BOOLEAN");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleOr"
    // InternalGitHubActionsParser.g:645:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalGitHubActionsParser.g:645:43: (iv_ruleOr= ruleOr EOF )
            // InternalGitHubActionsParser.g:646:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:652:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () (this_WS_2= RULE_WS )? otherlv_3= VerticalLineVerticalLine (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        Token otherlv_3=null;
        Token this_WS_4=null;
        EObject this_And_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:658:2: ( (this_And_0= ruleAnd ( () (this_WS_2= RULE_WS )? otherlv_3= VerticalLineVerticalLine (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleAnd ) ) )* ) )
            // InternalGitHubActionsParser.g:659:2: (this_And_0= ruleAnd ( () (this_WS_2= RULE_WS )? otherlv_3= VerticalLineVerticalLine (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleAnd ) ) )* )
            {
            // InternalGitHubActionsParser.g:659:2: (this_And_0= ruleAnd ( () (this_WS_2= RULE_WS )? otherlv_3= VerticalLineVerticalLine (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleAnd ) ) )* )
            // InternalGitHubActionsParser.g:660:3: this_And_0= ruleAnd ( () (this_WS_2= RULE_WS )? otherlv_3= VerticalLineVerticalLine (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGitHubActionsParser.g:671:3: ( () (this_WS_2= RULE_WS )? otherlv_3= VerticalLineVerticalLine (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleAnd ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_WS) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==VerticalLineVerticalLine) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==VerticalLineVerticalLine) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGitHubActionsParser.g:672:4: () (this_WS_2= RULE_WS )? otherlv_3= VerticalLineVerticalLine (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleAnd ) )
            	    {
            	    // InternalGitHubActionsParser.g:672:4: ()
            	    // InternalGitHubActionsParser.g:673:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLhsAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalGitHubActionsParser.g:682:4: (this_WS_2= RULE_WS )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==RULE_WS) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalGitHubActionsParser.g:683:5: this_WS_2= RULE_WS
            	            {
            	            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_WS_2, grammarAccess.getOrAccess().getWSTerminalRuleCall_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    otherlv_3=(Token)match(input,VerticalLineVerticalLine,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_2());
            	      			
            	    }
            	    // InternalGitHubActionsParser.g:692:4: (this_WS_4= RULE_WS )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==RULE_WS) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalGitHubActionsParser.g:693:5: this_WS_4= RULE_WS
            	            {
            	            this_WS_4=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_WS_4, grammarAccess.getOrAccess().getWSTerminalRuleCall_1_3());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalGitHubActionsParser.g:698:4: ( (lv_rhs_5_0= ruleAnd ) )
            	    // InternalGitHubActionsParser.g:699:5: (lv_rhs_5_0= ruleAnd )
            	    {
            	    // InternalGitHubActionsParser.g:699:5: (lv_rhs_5_0= ruleAnd )
            	    // InternalGitHubActionsParser.g:700:6: lv_rhs_5_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRhsAndParserRuleCall_1_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_rhs_5_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_5_0,
            	      							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.And");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalGitHubActionsParser.g:722:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalGitHubActionsParser.g:722:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalGitHubActionsParser.g:723:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:729:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () (this_WS_2= RULE_WS )? otherlv_3= AmpersandAmpersand (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        Token otherlv_3=null;
        Token this_WS_4=null;
        EObject this_Equality_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:735:2: ( (this_Equality_0= ruleEquality ( () (this_WS_2= RULE_WS )? otherlv_3= AmpersandAmpersand (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleEquality ) ) )* ) )
            // InternalGitHubActionsParser.g:736:2: (this_Equality_0= ruleEquality ( () (this_WS_2= RULE_WS )? otherlv_3= AmpersandAmpersand (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleEquality ) ) )* )
            {
            // InternalGitHubActionsParser.g:736:2: (this_Equality_0= ruleEquality ( () (this_WS_2= RULE_WS )? otherlv_3= AmpersandAmpersand (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleEquality ) ) )* )
            // InternalGitHubActionsParser.g:737:3: this_Equality_0= ruleEquality ( () (this_WS_2= RULE_WS )? otherlv_3= AmpersandAmpersand (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGitHubActionsParser.g:748:3: ( () (this_WS_2= RULE_WS )? otherlv_3= AmpersandAmpersand (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleEquality ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WS) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==AmpersandAmpersand) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==AmpersandAmpersand) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGitHubActionsParser.g:749:4: () (this_WS_2= RULE_WS )? otherlv_3= AmpersandAmpersand (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleEquality ) )
            	    {
            	    // InternalGitHubActionsParser.g:749:4: ()
            	    // InternalGitHubActionsParser.g:750:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLhsAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalGitHubActionsParser.g:759:4: (this_WS_2= RULE_WS )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==RULE_WS) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalGitHubActionsParser.g:760:5: this_WS_2= RULE_WS
            	            {
            	            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_WS_2, grammarAccess.getAndAccess().getWSTerminalRuleCall_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    otherlv_3=(Token)match(input,AmpersandAmpersand,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_2());
            	      			
            	    }
            	    // InternalGitHubActionsParser.g:769:4: (this_WS_4= RULE_WS )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==RULE_WS) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalGitHubActionsParser.g:770:5: this_WS_4= RULE_WS
            	            {
            	            this_WS_4=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_WS_4, grammarAccess.getAndAccess().getWSTerminalRuleCall_1_3());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalGitHubActionsParser.g:775:4: ( (lv_rhs_5_0= ruleEquality ) )
            	    // InternalGitHubActionsParser.g:776:5: (lv_rhs_5_0= ruleEquality )
            	    {
            	    // InternalGitHubActionsParser.g:776:5: (lv_rhs_5_0= ruleEquality )
            	    // InternalGitHubActionsParser.g:777:6: lv_rhs_5_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRhsEqualityParserRuleCall_1_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_rhs_5_0=ruleEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_5_0,
            	      							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Equality");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalGitHubActionsParser.g:799:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalGitHubActionsParser.g:799:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalGitHubActionsParser.g:800:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:806:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () (this_WS_2= RULE_WS )? ( (lv_op_3_0= ruleEQUALITY_OP ) ) (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        Token this_WS_4=null;
        EObject this_Comparison_0 = null;

        Enumerator lv_op_3_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:812:2: ( (this_Comparison_0= ruleComparison ( () (this_WS_2= RULE_WS )? ( (lv_op_3_0= ruleEQUALITY_OP ) ) (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleComparison ) ) )* ) )
            // InternalGitHubActionsParser.g:813:2: (this_Comparison_0= ruleComparison ( () (this_WS_2= RULE_WS )? ( (lv_op_3_0= ruleEQUALITY_OP ) ) (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleComparison ) ) )* )
            {
            // InternalGitHubActionsParser.g:813:2: (this_Comparison_0= ruleComparison ( () (this_WS_2= RULE_WS )? ( (lv_op_3_0= ruleEQUALITY_OP ) ) (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleComparison ) ) )* )
            // InternalGitHubActionsParser.g:814:3: this_Comparison_0= ruleComparison ( () (this_WS_2= RULE_WS )? ( (lv_op_3_0= ruleEQUALITY_OP ) ) (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGitHubActionsParser.g:825:3: ( () (this_WS_2= RULE_WS )? ( (lv_op_3_0= ruleEQUALITY_OP ) ) (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleComparison ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_WS) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==ExclamationMarkEqualsSign||LA21_1==EqualsSignEqualsSign) ) {
                        alt21=1;
                    }


                }
                else if ( (LA21_0==ExclamationMarkEqualsSign||LA21_0==EqualsSignEqualsSign) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGitHubActionsParser.g:826:4: () (this_WS_2= RULE_WS )? ( (lv_op_3_0= ruleEQUALITY_OP ) ) (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleComparison ) )
            	    {
            	    // InternalGitHubActionsParser.g:826:4: ()
            	    // InternalGitHubActionsParser.g:827:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLhsAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalGitHubActionsParser.g:836:4: (this_WS_2= RULE_WS )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==RULE_WS) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalGitHubActionsParser.g:837:5: this_WS_2= RULE_WS
            	            {
            	            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_WS_2, grammarAccess.getEqualityAccess().getWSTerminalRuleCall_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalGitHubActionsParser.g:842:4: ( (lv_op_3_0= ruleEQUALITY_OP ) )
            	    // InternalGitHubActionsParser.g:843:5: (lv_op_3_0= ruleEQUALITY_OP )
            	    {
            	    // InternalGitHubActionsParser.g:843:5: (lv_op_3_0= ruleEQUALITY_OP )
            	    // InternalGitHubActionsParser.g:844:6: lv_op_3_0= ruleEQUALITY_OP
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getOpEQUALITY_OPEnumRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_op_3_0=ruleEQUALITY_OP();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      						}
            	      						set(
            	      							current,
            	      							"op",
            	      							lv_op_3_0,
            	      							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.EQUALITY_OP");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalGitHubActionsParser.g:861:4: (this_WS_4= RULE_WS )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==RULE_WS) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalGitHubActionsParser.g:862:5: this_WS_4= RULE_WS
            	            {
            	            this_WS_4=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_WS_4, grammarAccess.getEqualityAccess().getWSTerminalRuleCall_1_3());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalGitHubActionsParser.g:867:4: ( (lv_rhs_5_0= ruleComparison ) )
            	    // InternalGitHubActionsParser.g:868:5: (lv_rhs_5_0= ruleComparison )
            	    {
            	    // InternalGitHubActionsParser.g:868:5: (lv_rhs_5_0= ruleComparison )
            	    // InternalGitHubActionsParser.g:869:6: lv_rhs_5_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRhsComparisonParserRuleCall_1_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_rhs_5_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_5_0,
            	      							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalGitHubActionsParser.g:891:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalGitHubActionsParser.g:891:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalGitHubActionsParser.g:892:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:898:1: ruleComparison returns [EObject current=null] : (this_UnaryOp_0= ruleUnaryOp ( () (this_WS_2= RULE_WS )? ( (lv_op_3_0= ruleCOMPARISON_OP ) ) (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleUnaryOp ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        Token this_WS_4=null;
        EObject this_UnaryOp_0 = null;

        Enumerator lv_op_3_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:904:2: ( (this_UnaryOp_0= ruleUnaryOp ( () (this_WS_2= RULE_WS )? ( (lv_op_3_0= ruleCOMPARISON_OP ) ) (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleUnaryOp ) ) )* ) )
            // InternalGitHubActionsParser.g:905:2: (this_UnaryOp_0= ruleUnaryOp ( () (this_WS_2= RULE_WS )? ( (lv_op_3_0= ruleCOMPARISON_OP ) ) (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleUnaryOp ) ) )* )
            {
            // InternalGitHubActionsParser.g:905:2: (this_UnaryOp_0= ruleUnaryOp ( () (this_WS_2= RULE_WS )? ( (lv_op_3_0= ruleCOMPARISON_OP ) ) (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleUnaryOp ) ) )* )
            // InternalGitHubActionsParser.g:906:3: this_UnaryOp_0= ruleUnaryOp ( () (this_WS_2= RULE_WS )? ( (lv_op_3_0= ruleCOMPARISON_OP ) ) (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleUnaryOp ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getUnaryOpParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_18);
            this_UnaryOp_0=ruleUnaryOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryOp_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGitHubActionsParser.g:917:3: ( () (this_WS_2= RULE_WS )? ( (lv_op_3_0= ruleCOMPARISON_OP ) ) (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleUnaryOp ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_WS) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==LessThanSignEqualsSign||LA24_1==GreaterThanSignEqualsSign||(LA24_1>=LessThanSign && LA24_1<=GreaterThanSign)) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==LessThanSignEqualsSign||LA24_0==GreaterThanSignEqualsSign||(LA24_0>=LessThanSign && LA24_0<=GreaterThanSign)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGitHubActionsParser.g:918:4: () (this_WS_2= RULE_WS )? ( (lv_op_3_0= ruleCOMPARISON_OP ) ) (this_WS_4= RULE_WS )? ( (lv_rhs_5_0= ruleUnaryOp ) )
            	    {
            	    // InternalGitHubActionsParser.g:918:4: ()
            	    // InternalGitHubActionsParser.g:919:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLhsAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalGitHubActionsParser.g:928:4: (this_WS_2= RULE_WS )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==RULE_WS) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalGitHubActionsParser.g:929:5: this_WS_2= RULE_WS
            	            {
            	            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_19); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_WS_2, grammarAccess.getComparisonAccess().getWSTerminalRuleCall_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalGitHubActionsParser.g:934:4: ( (lv_op_3_0= ruleCOMPARISON_OP ) )
            	    // InternalGitHubActionsParser.g:935:5: (lv_op_3_0= ruleCOMPARISON_OP )
            	    {
            	    // InternalGitHubActionsParser.g:935:5: (lv_op_3_0= ruleCOMPARISON_OP )
            	    // InternalGitHubActionsParser.g:936:6: lv_op_3_0= ruleCOMPARISON_OP
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getOpCOMPARISON_OPEnumRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_op_3_0=ruleCOMPARISON_OP();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"op",
            	      							lv_op_3_0,
            	      							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.COMPARISON_OP");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalGitHubActionsParser.g:953:4: (this_WS_4= RULE_WS )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==RULE_WS) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalGitHubActionsParser.g:954:5: this_WS_4= RULE_WS
            	            {
            	            this_WS_4=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_WS_4, grammarAccess.getComparisonAccess().getWSTerminalRuleCall_1_3());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalGitHubActionsParser.g:959:4: ( (lv_rhs_5_0= ruleUnaryOp ) )
            	    // InternalGitHubActionsParser.g:960:5: (lv_rhs_5_0= ruleUnaryOp )
            	    {
            	    // InternalGitHubActionsParser.g:960:5: (lv_rhs_5_0= ruleUnaryOp )
            	    // InternalGitHubActionsParser.g:961:6: lv_rhs_5_0= ruleUnaryOp
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRhsUnaryOpParserRuleCall_1_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_rhs_5_0=ruleUnaryOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_5_0,
            	      							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.UnaryOp");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleUnaryOp"
    // InternalGitHubActionsParser.g:983:1: entryRuleUnaryOp returns [EObject current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final EObject entryRuleUnaryOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOp = null;


        try {
            // InternalGitHubActionsParser.g:983:48: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // InternalGitHubActionsParser.g:984:2: iv_ruleUnaryOp= ruleUnaryOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOp=ruleUnaryOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:990:1: ruleUnaryOp returns [EObject current=null] : (this_Not_0= ruleNot | this_Blank_1= ruleBlank ) ;
    public final EObject ruleUnaryOp() throws RecognitionException {
        EObject current = null;

        EObject this_Not_0 = null;

        EObject this_Blank_1 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:996:2: ( (this_Not_0= ruleNot | this_Blank_1= ruleBlank ) )
            // InternalGitHubActionsParser.g:997:2: (this_Not_0= ruleNot | this_Blank_1= ruleBlank )
            {
            // InternalGitHubActionsParser.g:997:2: (this_Not_0= ruleNot | this_Blank_1= ruleBlank )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ExclamationMark) ) {
                alt25=1;
            }
            else if ( (LA25_0==StartsWith||LA25_0==Cancelled||LA25_0==HashFiles||LA25_0==Contains||(LA25_0>=EndsWith && LA25_0<=FromJSON)||LA25_0==Strategy||LA25_0==Failure||(LA25_0>=Secrets && LA25_0<=Always)||(LA25_0>=Format && LA25_0<=Github)||LA25_0==Inputs||LA25_0==Matrix||LA25_0==Runner||LA25_0==ToJSON||LA25_0==Needs||LA25_0==Steps||(LA25_0>=Jobs && LA25_0<=Join)||LA25_0==Vars||(LA25_0>=Env && LA25_0<=Job)||LA25_0==LeftParenthesis||(LA25_0>=RULE_INT && LA25_0<=RULE_BOOLEAN)||(LA25_0>=RULE_ID && LA25_0<=RULE_STRING)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalGitHubActionsParser.g:998:3: this_Not_0= ruleNot
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryOpAccess().getNotParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Not_0=ruleNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Not_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGitHubActionsParser.g:1010:3: this_Blank_1= ruleBlank
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryOpAccess().getBlankParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Blank_1=ruleBlank();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Blank_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnaryOp"


    // $ANTLR start "entryRuleNot"
    // InternalGitHubActionsParser.g:1025:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalGitHubActionsParser.g:1025:44: (iv_ruleNot= ruleNot EOF )
            // InternalGitHubActionsParser.g:1026:2: iv_ruleNot= ruleNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:1032:1: ruleNot returns [EObject current=null] : (otherlv_0= ExclamationMark ( (lv_childExpr_1_0= ruleVariableDereference ) ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_childExpr_1_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:1038:2: ( (otherlv_0= ExclamationMark ( (lv_childExpr_1_0= ruleVariableDereference ) ) ) )
            // InternalGitHubActionsParser.g:1039:2: (otherlv_0= ExclamationMark ( (lv_childExpr_1_0= ruleVariableDereference ) ) )
            {
            // InternalGitHubActionsParser.g:1039:2: (otherlv_0= ExclamationMark ( (lv_childExpr_1_0= ruleVariableDereference ) ) )
            // InternalGitHubActionsParser.g:1040:3: otherlv_0= ExclamationMark ( (lv_childExpr_1_0= ruleVariableDereference ) )
            {
            otherlv_0=(Token)match(input,ExclamationMark,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getExclamationMarkKeyword_0());
              		
            }
            // InternalGitHubActionsParser.g:1044:3: ( (lv_childExpr_1_0= ruleVariableDereference ) )
            // InternalGitHubActionsParser.g:1045:4: (lv_childExpr_1_0= ruleVariableDereference )
            {
            // InternalGitHubActionsParser.g:1045:4: (lv_childExpr_1_0= ruleVariableDereference )
            // InternalGitHubActionsParser.g:1046:5: lv_childExpr_1_0= ruleVariableDereference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNotAccess().getChildExprVariableDereferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_childExpr_1_0=ruleVariableDereference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleBlank"
    // InternalGitHubActionsParser.g:1067:1: entryRuleBlank returns [EObject current=null] : iv_ruleBlank= ruleBlank EOF ;
    public final EObject entryRuleBlank() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlank = null;


        try {
            // InternalGitHubActionsParser.g:1067:46: (iv_ruleBlank= ruleBlank EOF )
            // InternalGitHubActionsParser.g:1068:2: iv_ruleBlank= ruleBlank EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlankRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlank=ruleBlank();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlank; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:1074:1: ruleBlank returns [EObject current=null] : this_VariableDereference_0= ruleVariableDereference ;
    public final EObject ruleBlank() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDereference_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:1080:2: (this_VariableDereference_0= ruleVariableDereference )
            // InternalGitHubActionsParser.g:1081:2: this_VariableDereference_0= ruleVariableDereference
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getBlankAccess().getVariableDereferenceParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_VariableDereference_0=ruleVariableDereference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_VariableDereference_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBlank"


    // $ANTLR start "entryRuleVariableDereference"
    // InternalGitHubActionsParser.g:1095:1: entryRuleVariableDereference returns [EObject current=null] : iv_ruleVariableDereference= ruleVariableDereference EOF ;
    public final EObject entryRuleVariableDereference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDereference = null;


        try {
            // InternalGitHubActionsParser.g:1095:60: (iv_ruleVariableDereference= ruleVariableDereference EOF )
            // InternalGitHubActionsParser.g:1096:2: iv_ruleVariableDereference= ruleVariableDereference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDereferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDereference=ruleVariableDereference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDereference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:1102:1: ruleVariableDereference returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (otherlv_2= FullStop ( (lv_property_3_0= RULE_ID ) ) ) | ( (otherlv_4= LeftSquareBracket (this_WS_5= RULE_WS )? (otherlv_6= QuotationMark ( (lv_property_7_0= RULE_ID ) ) otherlv_8= QuotationMark ) ) | ( (otherlv_9= Apostrophe ( (lv_property_10_0= RULE_ID ) ) otherlv_11= QuotationMark ) (this_WS_12= RULE_WS )? otherlv_13= RightSquareBracket ) ) ) )* ) ;
    public final EObject ruleVariableDereference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_property_3_0=null;
        Token otherlv_4=null;
        Token this_WS_5=null;
        Token otherlv_6=null;
        Token lv_property_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_property_10_0=null;
        Token otherlv_11=null;
        Token this_WS_12=null;
        Token otherlv_13=null;
        EObject this_Primary_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:1108:2: ( (this_Primary_0= rulePrimary ( () ( (otherlv_2= FullStop ( (lv_property_3_0= RULE_ID ) ) ) | ( (otherlv_4= LeftSquareBracket (this_WS_5= RULE_WS )? (otherlv_6= QuotationMark ( (lv_property_7_0= RULE_ID ) ) otherlv_8= QuotationMark ) ) | ( (otherlv_9= Apostrophe ( (lv_property_10_0= RULE_ID ) ) otherlv_11= QuotationMark ) (this_WS_12= RULE_WS )? otherlv_13= RightSquareBracket ) ) ) )* ) )
            // InternalGitHubActionsParser.g:1109:2: (this_Primary_0= rulePrimary ( () ( (otherlv_2= FullStop ( (lv_property_3_0= RULE_ID ) ) ) | ( (otherlv_4= LeftSquareBracket (this_WS_5= RULE_WS )? (otherlv_6= QuotationMark ( (lv_property_7_0= RULE_ID ) ) otherlv_8= QuotationMark ) ) | ( (otherlv_9= Apostrophe ( (lv_property_10_0= RULE_ID ) ) otherlv_11= QuotationMark ) (this_WS_12= RULE_WS )? otherlv_13= RightSquareBracket ) ) ) )* )
            {
            // InternalGitHubActionsParser.g:1109:2: (this_Primary_0= rulePrimary ( () ( (otherlv_2= FullStop ( (lv_property_3_0= RULE_ID ) ) ) | ( (otherlv_4= LeftSquareBracket (this_WS_5= RULE_WS )? (otherlv_6= QuotationMark ( (lv_property_7_0= RULE_ID ) ) otherlv_8= QuotationMark ) ) | ( (otherlv_9= Apostrophe ( (lv_property_10_0= RULE_ID ) ) otherlv_11= QuotationMark ) (this_WS_12= RULE_WS )? otherlv_13= RightSquareBracket ) ) ) )* )
            // InternalGitHubActionsParser.g:1110:3: this_Primary_0= rulePrimary ( () ( (otherlv_2= FullStop ( (lv_property_3_0= RULE_ID ) ) ) | ( (otherlv_4= LeftSquareBracket (this_WS_5= RULE_WS )? (otherlv_6= QuotationMark ( (lv_property_7_0= RULE_ID ) ) otherlv_8= QuotationMark ) ) | ( (otherlv_9= Apostrophe ( (lv_property_10_0= RULE_ID ) ) otherlv_11= QuotationMark ) (this_WS_12= RULE_WS )? otherlv_13= RightSquareBracket ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVariableDereferenceAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGitHubActionsParser.g:1121:3: ( () ( (otherlv_2= FullStop ( (lv_property_3_0= RULE_ID ) ) ) | ( (otherlv_4= LeftSquareBracket (this_WS_5= RULE_WS )? (otherlv_6= QuotationMark ( (lv_property_7_0= RULE_ID ) ) otherlv_8= QuotationMark ) ) | ( (otherlv_9= Apostrophe ( (lv_property_10_0= RULE_ID ) ) otherlv_11= QuotationMark ) (this_WS_12= RULE_WS )? otherlv_13= RightSquareBracket ) ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Apostrophe||LA30_0==FullStop||LA30_0==LeftSquareBracket) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGitHubActionsParser.g:1122:4: () ( (otherlv_2= FullStop ( (lv_property_3_0= RULE_ID ) ) ) | ( (otherlv_4= LeftSquareBracket (this_WS_5= RULE_WS )? (otherlv_6= QuotationMark ( (lv_property_7_0= RULE_ID ) ) otherlv_8= QuotationMark ) ) | ( (otherlv_9= Apostrophe ( (lv_property_10_0= RULE_ID ) ) otherlv_11= QuotationMark ) (this_WS_12= RULE_WS )? otherlv_13= RightSquareBracket ) ) )
            	    {
            	    // InternalGitHubActionsParser.g:1122:4: ()
            	    // InternalGitHubActionsParser.g:1123:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getVariableDereferenceAccess().getVariableDereferenceVariableAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalGitHubActionsParser.g:1132:4: ( (otherlv_2= FullStop ( (lv_property_3_0= RULE_ID ) ) ) | ( (otherlv_4= LeftSquareBracket (this_WS_5= RULE_WS )? (otherlv_6= QuotationMark ( (lv_property_7_0= RULE_ID ) ) otherlv_8= QuotationMark ) ) | ( (otherlv_9= Apostrophe ( (lv_property_10_0= RULE_ID ) ) otherlv_11= QuotationMark ) (this_WS_12= RULE_WS )? otherlv_13= RightSquareBracket ) ) )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==FullStop) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==Apostrophe||LA29_0==LeftSquareBracket) ) {
            	        alt29=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalGitHubActionsParser.g:1133:5: (otherlv_2= FullStop ( (lv_property_3_0= RULE_ID ) ) )
            	            {
            	            // InternalGitHubActionsParser.g:1133:5: (otherlv_2= FullStop ( (lv_property_3_0= RULE_ID ) ) )
            	            // InternalGitHubActionsParser.g:1134:6: otherlv_2= FullStop ( (lv_property_3_0= RULE_ID ) )
            	            {
            	            otherlv_2=(Token)match(input,FullStop,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getVariableDereferenceAccess().getFullStopKeyword_1_1_0_0());
            	              					
            	            }
            	            // InternalGitHubActionsParser.g:1138:6: ( (lv_property_3_0= RULE_ID ) )
            	            // InternalGitHubActionsParser.g:1139:7: (lv_property_3_0= RULE_ID )
            	            {
            	            // InternalGitHubActionsParser.g:1139:7: (lv_property_3_0= RULE_ID )
            	            // InternalGitHubActionsParser.g:1140:8: lv_property_3_0= RULE_ID
            	            {
            	            lv_property_3_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_property_3_0, grammarAccess.getVariableDereferenceAccess().getPropertyIDTerminalRuleCall_1_1_0_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getVariableDereferenceRule());
            	              								}
            	              								setWithLastConsumed(
            	              									current,
            	              									"property",
            	              									lv_property_3_0,
            	              									"org.eclipse.xtext.common.Terminals.ID");
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalGitHubActionsParser.g:1158:5: ( (otherlv_4= LeftSquareBracket (this_WS_5= RULE_WS )? (otherlv_6= QuotationMark ( (lv_property_7_0= RULE_ID ) ) otherlv_8= QuotationMark ) ) | ( (otherlv_9= Apostrophe ( (lv_property_10_0= RULE_ID ) ) otherlv_11= QuotationMark ) (this_WS_12= RULE_WS )? otherlv_13= RightSquareBracket ) )
            	            {
            	            // InternalGitHubActionsParser.g:1158:5: ( (otherlv_4= LeftSquareBracket (this_WS_5= RULE_WS )? (otherlv_6= QuotationMark ( (lv_property_7_0= RULE_ID ) ) otherlv_8= QuotationMark ) ) | ( (otherlv_9= Apostrophe ( (lv_property_10_0= RULE_ID ) ) otherlv_11= QuotationMark ) (this_WS_12= RULE_WS )? otherlv_13= RightSquareBracket ) )
            	            int alt28=2;
            	            int LA28_0 = input.LA(1);

            	            if ( (LA28_0==LeftSquareBracket) ) {
            	                alt28=1;
            	            }
            	            else if ( (LA28_0==Apostrophe) ) {
            	                alt28=2;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return current;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 28, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt28) {
            	                case 1 :
            	                    // InternalGitHubActionsParser.g:1159:6: (otherlv_4= LeftSquareBracket (this_WS_5= RULE_WS )? (otherlv_6= QuotationMark ( (lv_property_7_0= RULE_ID ) ) otherlv_8= QuotationMark ) )
            	                    {
            	                    // InternalGitHubActionsParser.g:1159:6: (otherlv_4= LeftSquareBracket (this_WS_5= RULE_WS )? (otherlv_6= QuotationMark ( (lv_property_7_0= RULE_ID ) ) otherlv_8= QuotationMark ) )
            	                    // InternalGitHubActionsParser.g:1160:7: otherlv_4= LeftSquareBracket (this_WS_5= RULE_WS )? (otherlv_6= QuotationMark ( (lv_property_7_0= RULE_ID ) ) otherlv_8= QuotationMark )
            	                    {
            	                    otherlv_4=(Token)match(input,LeftSquareBracket,FOLLOW_22); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      							newLeafNode(otherlv_4, grammarAccess.getVariableDereferenceAccess().getLeftSquareBracketKeyword_1_1_1_0_0());
            	                      						
            	                    }
            	                    // InternalGitHubActionsParser.g:1164:7: (this_WS_5= RULE_WS )?
            	                    int alt26=2;
            	                    int LA26_0 = input.LA(1);

            	                    if ( (LA26_0==RULE_WS) ) {
            	                        alt26=1;
            	                    }
            	                    switch (alt26) {
            	                        case 1 :
            	                            // InternalGitHubActionsParser.g:1165:8: this_WS_5= RULE_WS
            	                            {
            	                            this_WS_5=(Token)match(input,RULE_WS,FOLLOW_23); if (state.failed) return current;
            	                            if ( state.backtracking==0 ) {

            	                              								newLeafNode(this_WS_5, grammarAccess.getVariableDereferenceAccess().getWSTerminalRuleCall_1_1_1_0_1());
            	                              							
            	                            }

            	                            }
            	                            break;

            	                    }

            	                    // InternalGitHubActionsParser.g:1170:7: (otherlv_6= QuotationMark ( (lv_property_7_0= RULE_ID ) ) otherlv_8= QuotationMark )
            	                    // InternalGitHubActionsParser.g:1171:8: otherlv_6= QuotationMark ( (lv_property_7_0= RULE_ID ) ) otherlv_8= QuotationMark
            	                    {
            	                    otherlv_6=(Token)match(input,QuotationMark,FOLLOW_21); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      								newLeafNode(otherlv_6, grammarAccess.getVariableDereferenceAccess().getQuotationMarkKeyword_1_1_1_0_2_0());
            	                      							
            	                    }
            	                    // InternalGitHubActionsParser.g:1175:8: ( (lv_property_7_0= RULE_ID ) )
            	                    // InternalGitHubActionsParser.g:1176:9: (lv_property_7_0= RULE_ID )
            	                    {
            	                    // InternalGitHubActionsParser.g:1176:9: (lv_property_7_0= RULE_ID )
            	                    // InternalGitHubActionsParser.g:1177:10: lv_property_7_0= RULE_ID
            	                    {
            	                    lv_property_7_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      										newLeafNode(lv_property_7_0, grammarAccess.getVariableDereferenceAccess().getPropertyIDTerminalRuleCall_1_1_1_0_2_1_0());
            	                      									
            	                    }
            	                    if ( state.backtracking==0 ) {

            	                      										if (current==null) {
            	                      											current = createModelElement(grammarAccess.getVariableDereferenceRule());
            	                      										}
            	                      										setWithLastConsumed(
            	                      											current,
            	                      											"property",
            	                      											lv_property_7_0,
            	                      											"org.eclipse.xtext.common.Terminals.ID");
            	                      									
            	                    }

            	                    }


            	                    }

            	                    otherlv_8=(Token)match(input,QuotationMark,FOLLOW_20); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      								newLeafNode(otherlv_8, grammarAccess.getVariableDereferenceAccess().getQuotationMarkKeyword_1_1_1_0_2_2());
            	                      							
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalGitHubActionsParser.g:1200:6: ( (otherlv_9= Apostrophe ( (lv_property_10_0= RULE_ID ) ) otherlv_11= QuotationMark ) (this_WS_12= RULE_WS )? otherlv_13= RightSquareBracket )
            	                    {
            	                    // InternalGitHubActionsParser.g:1200:6: ( (otherlv_9= Apostrophe ( (lv_property_10_0= RULE_ID ) ) otherlv_11= QuotationMark ) (this_WS_12= RULE_WS )? otherlv_13= RightSquareBracket )
            	                    // InternalGitHubActionsParser.g:1201:7: (otherlv_9= Apostrophe ( (lv_property_10_0= RULE_ID ) ) otherlv_11= QuotationMark ) (this_WS_12= RULE_WS )? otherlv_13= RightSquareBracket
            	                    {
            	                    // InternalGitHubActionsParser.g:1201:7: (otherlv_9= Apostrophe ( (lv_property_10_0= RULE_ID ) ) otherlv_11= QuotationMark )
            	                    // InternalGitHubActionsParser.g:1202:8: otherlv_9= Apostrophe ( (lv_property_10_0= RULE_ID ) ) otherlv_11= QuotationMark
            	                    {
            	                    otherlv_9=(Token)match(input,Apostrophe,FOLLOW_21); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      								newLeafNode(otherlv_9, grammarAccess.getVariableDereferenceAccess().getApostropheKeyword_1_1_1_1_0_0());
            	                      							
            	                    }
            	                    // InternalGitHubActionsParser.g:1206:8: ( (lv_property_10_0= RULE_ID ) )
            	                    // InternalGitHubActionsParser.g:1207:9: (lv_property_10_0= RULE_ID )
            	                    {
            	                    // InternalGitHubActionsParser.g:1207:9: (lv_property_10_0= RULE_ID )
            	                    // InternalGitHubActionsParser.g:1208:10: lv_property_10_0= RULE_ID
            	                    {
            	                    lv_property_10_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      										newLeafNode(lv_property_10_0, grammarAccess.getVariableDereferenceAccess().getPropertyIDTerminalRuleCall_1_1_1_1_0_1_0());
            	                      									
            	                    }
            	                    if ( state.backtracking==0 ) {

            	                      										if (current==null) {
            	                      											current = createModelElement(grammarAccess.getVariableDereferenceRule());
            	                      										}
            	                      										setWithLastConsumed(
            	                      											current,
            	                      											"property",
            	                      											lv_property_10_0,
            	                      											"org.eclipse.xtext.common.Terminals.ID");
            	                      									
            	                    }

            	                    }


            	                    }

            	                    otherlv_11=(Token)match(input,QuotationMark,FOLLOW_24); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      								newLeafNode(otherlv_11, grammarAccess.getVariableDereferenceAccess().getQuotationMarkKeyword_1_1_1_1_0_2());
            	                      							
            	                    }

            	                    }

            	                    // InternalGitHubActionsParser.g:1229:7: (this_WS_12= RULE_WS )?
            	                    int alt27=2;
            	                    int LA27_0 = input.LA(1);

            	                    if ( (LA27_0==RULE_WS) ) {
            	                        alt27=1;
            	                    }
            	                    switch (alt27) {
            	                        case 1 :
            	                            // InternalGitHubActionsParser.g:1230:8: this_WS_12= RULE_WS
            	                            {
            	                            this_WS_12=(Token)match(input,RULE_WS,FOLLOW_25); if (state.failed) return current;
            	                            if ( state.backtracking==0 ) {

            	                              								newLeafNode(this_WS_12, grammarAccess.getVariableDereferenceAccess().getWSTerminalRuleCall_1_1_1_1_1());
            	                              							
            	                            }

            	                            }
            	                            break;

            	                    }

            	                    otherlv_13=(Token)match(input,RightSquareBracket,FOLLOW_20); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      							newLeafNode(otherlv_13, grammarAccess.getVariableDereferenceAccess().getRightSquareBracketKeyword_1_1_1_1_2());
            	                      						
            	                    }

            	                    }


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariableDereference"


    // $ANTLR start "entryRulePrimary"
    // InternalGitHubActionsParser.g:1247:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalGitHubActionsParser.g:1247:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalGitHubActionsParser.g:1248:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:1254:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= LeftParenthesis (this_WS_1= RULE_WS )? this_InsideBracketsExpression_2= ruleInsideBracketsExpression (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis ) | this_CallExpression_5= ruleCallExpression | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WS_1=null;
        Token this_WS_3=null;
        Token otherlv_4=null;
        EObject this_InsideBracketsExpression_2 = null;

        EObject this_CallExpression_5 = null;

        EObject this_Atomic_6 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:1260:2: ( ( (otherlv_0= LeftParenthesis (this_WS_1= RULE_WS )? this_InsideBracketsExpression_2= ruleInsideBracketsExpression (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis ) | this_CallExpression_5= ruleCallExpression | this_Atomic_6= ruleAtomic ) )
            // InternalGitHubActionsParser.g:1261:2: ( (otherlv_0= LeftParenthesis (this_WS_1= RULE_WS )? this_InsideBracketsExpression_2= ruleInsideBracketsExpression (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis ) | this_CallExpression_5= ruleCallExpression | this_Atomic_6= ruleAtomic )
            {
            // InternalGitHubActionsParser.g:1261:2: ( (otherlv_0= LeftParenthesis (this_WS_1= RULE_WS )? this_InsideBracketsExpression_2= ruleInsideBracketsExpression (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis ) | this_CallExpression_5= ruleCallExpression | this_Atomic_6= ruleAtomic )
            int alt33=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt33=1;
                }
                break;
            case StartsWith:
            case Cancelled:
            case HashFiles:
            case Contains:
            case EndsWith:
            case FromJSON:
            case Failure:
            case Success:
            case Always:
            case Format:
            case ToJSON:
            case Join:
                {
                alt33=2;
                }
                break;
            case Strategy:
            case Secrets:
            case Github:
            case Inputs:
            case Matrix:
            case Runner:
            case Needs:
            case Steps:
            case Jobs:
            case Vars:
            case Env:
            case Job:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_BOOLEAN:
            case RULE_ID:
            case RULE_STRING:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalGitHubActionsParser.g:1262:3: (otherlv_0= LeftParenthesis (this_WS_1= RULE_WS )? this_InsideBracketsExpression_2= ruleInsideBracketsExpression (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis )
                    {
                    // InternalGitHubActionsParser.g:1262:3: (otherlv_0= LeftParenthesis (this_WS_1= RULE_WS )? this_InsideBracketsExpression_2= ruleInsideBracketsExpression (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis )
                    // InternalGitHubActionsParser.g:1263:4: otherlv_0= LeftParenthesis (this_WS_1= RULE_WS )? this_InsideBracketsExpression_2= ruleInsideBracketsExpression (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    // InternalGitHubActionsParser.g:1267:4: (this_WS_1= RULE_WS )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_WS) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalGitHubActionsParser.g:1268:5: this_WS_1= RULE_WS
                            {
                            this_WS_1=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_WS_1, grammarAccess.getPrimaryAccess().getWSTerminalRuleCall_0_1());
                              				
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getInsideBracketsExpressionParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    this_InsideBracketsExpression_2=ruleInsideBracketsExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_InsideBracketsExpression_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalGitHubActionsParser.g:1284:4: (this_WS_3= RULE_WS )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_WS) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalGitHubActionsParser.g:1285:5: this_WS_3= RULE_WS
                            {
                            this_WS_3=(Token)match(input,RULE_WS,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_WS_3, grammarAccess.getPrimaryAccess().getWSTerminalRuleCall_0_3());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGitHubActionsParser.g:1296:3: this_CallExpression_5= ruleCallExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getCallExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CallExpression_5=ruleCallExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CallExpression_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGitHubActionsParser.g:1308:3: this_Atomic_6= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atomic_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalGitHubActionsParser.g:1323:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalGitHubActionsParser.g:1323:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalGitHubActionsParser.g:1324:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:1330:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_context_1_0= ruleCONTEXT ) ) ) | ( () ( (lv_name_3_0= RULE_ID ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_STRING ) ) ) ) ;
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
            // InternalGitHubActionsParser.g:1336:2: ( ( ( () ( (lv_context_1_0= ruleCONTEXT ) ) ) | ( () ( (lv_name_3_0= RULE_ID ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_STRING ) ) ) ) )
            // InternalGitHubActionsParser.g:1337:2: ( ( () ( (lv_context_1_0= ruleCONTEXT ) ) ) | ( () ( (lv_name_3_0= RULE_ID ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_STRING ) ) ) )
            {
            // InternalGitHubActionsParser.g:1337:2: ( ( () ( (lv_context_1_0= ruleCONTEXT ) ) ) | ( () ( (lv_name_3_0= RULE_ID ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_STRING ) ) ) )
            int alt34=6;
            switch ( input.LA(1) ) {
            case Strategy:
            case Secrets:
            case Github:
            case Inputs:
            case Matrix:
            case Runner:
            case Needs:
            case Steps:
            case Jobs:
            case Vars:
            case Env:
            case Job:
                {
                alt34=1;
                }
                break;
            case RULE_ID:
                {
                alt34=2;
                }
                break;
            case RULE_INT:
                {
                alt34=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt34=4;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt34=5;
                }
                break;
            case RULE_STRING:
                {
                alt34=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalGitHubActionsParser.g:1338:3: ( () ( (lv_context_1_0= ruleCONTEXT ) ) )
                    {
                    // InternalGitHubActionsParser.g:1338:3: ( () ( (lv_context_1_0= ruleCONTEXT ) ) )
                    // InternalGitHubActionsParser.g:1339:4: () ( (lv_context_1_0= ruleCONTEXT ) )
                    {
                    // InternalGitHubActionsParser.g:1339:4: ()
                    // InternalGitHubActionsParser.g:1340:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getGitHubContextAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGitHubActionsParser.g:1349:4: ( (lv_context_1_0= ruleCONTEXT ) )
                    // InternalGitHubActionsParser.g:1350:5: (lv_context_1_0= ruleCONTEXT )
                    {
                    // InternalGitHubActionsParser.g:1350:5: (lv_context_1_0= ruleCONTEXT )
                    // InternalGitHubActionsParser.g:1351:6: lv_context_1_0= ruleCONTEXT
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getContextCONTEXTEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_context_1_0=ruleCONTEXT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalGitHubActionsParser.g:1370:3: ( () ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // InternalGitHubActionsParser.g:1370:3: ( () ( (lv_name_3_0= RULE_ID ) ) )
                    // InternalGitHubActionsParser.g:1371:4: () ( (lv_name_3_0= RULE_ID ) )
                    {
                    // InternalGitHubActionsParser.g:1371:4: ()
                    // InternalGitHubActionsParser.g:1372:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getVariableAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGitHubActionsParser.g:1381:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalGitHubActionsParser.g:1382:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalGitHubActionsParser.g:1382:5: (lv_name_3_0= RULE_ID )
                    // InternalGitHubActionsParser.g:1383:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_3_0, grammarAccess.getAtomicAccess().getNameIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 3 :
                    // InternalGitHubActionsParser.g:1401:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // InternalGitHubActionsParser.g:1401:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    // InternalGitHubActionsParser.g:1402:4: () ( (lv_value_5_0= RULE_INT ) )
                    {
                    // InternalGitHubActionsParser.g:1402:4: ()
                    // InternalGitHubActionsParser.g:1403:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getIntegerLiteralAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGitHubActionsParser.g:1412:4: ( (lv_value_5_0= RULE_INT ) )
                    // InternalGitHubActionsParser.g:1413:5: (lv_value_5_0= RULE_INT )
                    {
                    // InternalGitHubActionsParser.g:1413:5: (lv_value_5_0= RULE_INT )
                    // InternalGitHubActionsParser.g:1414:6: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_5_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 4 :
                    // InternalGitHubActionsParser.g:1432:3: ( () ( (lv_value_7_0= RULE_DOUBLE ) ) )
                    {
                    // InternalGitHubActionsParser.g:1432:3: ( () ( (lv_value_7_0= RULE_DOUBLE ) ) )
                    // InternalGitHubActionsParser.g:1433:4: () ( (lv_value_7_0= RULE_DOUBLE ) )
                    {
                    // InternalGitHubActionsParser.g:1433:4: ()
                    // InternalGitHubActionsParser.g:1434:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getDoubleLiteralAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGitHubActionsParser.g:1443:4: ( (lv_value_7_0= RULE_DOUBLE ) )
                    // InternalGitHubActionsParser.g:1444:5: (lv_value_7_0= RULE_DOUBLE )
                    {
                    // InternalGitHubActionsParser.g:1444:5: (lv_value_7_0= RULE_DOUBLE )
                    // InternalGitHubActionsParser.g:1445:6: lv_value_7_0= RULE_DOUBLE
                    {
                    lv_value_7_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_7_0, grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 5 :
                    // InternalGitHubActionsParser.g:1463:3: ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalGitHubActionsParser.g:1463:3: ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) )
                    // InternalGitHubActionsParser.g:1464:4: () ( (lv_value_9_0= RULE_BOOLEAN ) )
                    {
                    // InternalGitHubActionsParser.g:1464:4: ()
                    // InternalGitHubActionsParser.g:1465:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getBooleanLiteralAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGitHubActionsParser.g:1474:4: ( (lv_value_9_0= RULE_BOOLEAN ) )
                    // InternalGitHubActionsParser.g:1475:5: (lv_value_9_0= RULE_BOOLEAN )
                    {
                    // InternalGitHubActionsParser.g:1475:5: (lv_value_9_0= RULE_BOOLEAN )
                    // InternalGitHubActionsParser.g:1476:6: lv_value_9_0= RULE_BOOLEAN
                    {
                    lv_value_9_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_9_0, grammarAccess.getAtomicAccess().getValueBOOLEANTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 6 :
                    // InternalGitHubActionsParser.g:1494:3: ( () ( (lv_value_11_0= RULE_STRING ) ) )
                    {
                    // InternalGitHubActionsParser.g:1494:3: ( () ( (lv_value_11_0= RULE_STRING ) ) )
                    // InternalGitHubActionsParser.g:1495:4: () ( (lv_value_11_0= RULE_STRING ) )
                    {
                    // InternalGitHubActionsParser.g:1495:4: ()
                    // InternalGitHubActionsParser.g:1496:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getStringLiteralAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGitHubActionsParser.g:1505:4: ( (lv_value_11_0= RULE_STRING ) )
                    // InternalGitHubActionsParser.g:1506:5: (lv_value_11_0= RULE_STRING )
                    {
                    // InternalGitHubActionsParser.g:1506:5: (lv_value_11_0= RULE_STRING )
                    // InternalGitHubActionsParser.g:1507:6: lv_value_11_0= RULE_STRING
                    {
                    lv_value_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_11_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleCallExpression"
    // InternalGitHubActionsParser.g:1528:1: entryRuleCallExpression returns [EObject current=null] : iv_ruleCallExpression= ruleCallExpression EOF ;
    public final EObject entryRuleCallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallExpression = null;


        try {
            // InternalGitHubActionsParser.g:1528:55: (iv_ruleCallExpression= ruleCallExpression EOF )
            // InternalGitHubActionsParser.g:1529:2: iv_ruleCallExpression= ruleCallExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCallExpression=ruleCallExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:1535:1: ruleCallExpression returns [EObject current=null] : (this_Contains_0= ruleContains | this_StartsWith_1= ruleStartsWith | this_EndsWith_2= ruleEndsWith | this_Format_3= ruleFormat | this_Join_4= ruleJoin | this_ToJSON_5= ruleToJSON | this_FromJSON_6= ruleFromJSON | this_HashFiles_7= ruleHashFiles | this_Success_8= ruleSuccess | this_Always_9= ruleAlways | this_Failure_10= ruleFailure | this_Cancelled_11= ruleCancelled ) ;
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
            // InternalGitHubActionsParser.g:1541:2: ( (this_Contains_0= ruleContains | this_StartsWith_1= ruleStartsWith | this_EndsWith_2= ruleEndsWith | this_Format_3= ruleFormat | this_Join_4= ruleJoin | this_ToJSON_5= ruleToJSON | this_FromJSON_6= ruleFromJSON | this_HashFiles_7= ruleHashFiles | this_Success_8= ruleSuccess | this_Always_9= ruleAlways | this_Failure_10= ruleFailure | this_Cancelled_11= ruleCancelled ) )
            // InternalGitHubActionsParser.g:1542:2: (this_Contains_0= ruleContains | this_StartsWith_1= ruleStartsWith | this_EndsWith_2= ruleEndsWith | this_Format_3= ruleFormat | this_Join_4= ruleJoin | this_ToJSON_5= ruleToJSON | this_FromJSON_6= ruleFromJSON | this_HashFiles_7= ruleHashFiles | this_Success_8= ruleSuccess | this_Always_9= ruleAlways | this_Failure_10= ruleFailure | this_Cancelled_11= ruleCancelled )
            {
            // InternalGitHubActionsParser.g:1542:2: (this_Contains_0= ruleContains | this_StartsWith_1= ruleStartsWith | this_EndsWith_2= ruleEndsWith | this_Format_3= ruleFormat | this_Join_4= ruleJoin | this_ToJSON_5= ruleToJSON | this_FromJSON_6= ruleFromJSON | this_HashFiles_7= ruleHashFiles | this_Success_8= ruleSuccess | this_Always_9= ruleAlways | this_Failure_10= ruleFailure | this_Cancelled_11= ruleCancelled )
            int alt35=12;
            switch ( input.LA(1) ) {
            case Contains:
                {
                alt35=1;
                }
                break;
            case StartsWith:
                {
                alt35=2;
                }
                break;
            case EndsWith:
                {
                alt35=3;
                }
                break;
            case Format:
                {
                alt35=4;
                }
                break;
            case Join:
                {
                alt35=5;
                }
                break;
            case ToJSON:
                {
                alt35=6;
                }
                break;
            case FromJSON:
                {
                alt35=7;
                }
                break;
            case HashFiles:
                {
                alt35=8;
                }
                break;
            case Success:
                {
                alt35=9;
                }
                break;
            case Always:
                {
                alt35=10;
                }
                break;
            case Failure:
                {
                alt35=11;
                }
                break;
            case Cancelled:
                {
                alt35=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalGitHubActionsParser.g:1543:3: this_Contains_0= ruleContains
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallExpressionAccess().getContainsParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Contains_0=ruleContains();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Contains_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGitHubActionsParser.g:1555:3: this_StartsWith_1= ruleStartsWith
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallExpressionAccess().getStartsWithParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StartsWith_1=ruleStartsWith();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StartsWith_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGitHubActionsParser.g:1567:3: this_EndsWith_2= ruleEndsWith
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallExpressionAccess().getEndsWithParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EndsWith_2=ruleEndsWith();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EndsWith_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGitHubActionsParser.g:1579:3: this_Format_3= ruleFormat
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallExpressionAccess().getFormatParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Format_3=ruleFormat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Format_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGitHubActionsParser.g:1591:3: this_Join_4= ruleJoin
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallExpressionAccess().getJoinParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Join_4=ruleJoin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Join_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGitHubActionsParser.g:1603:3: this_ToJSON_5= ruleToJSON
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallExpressionAccess().getToJSONParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ToJSON_5=ruleToJSON();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ToJSON_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGitHubActionsParser.g:1615:3: this_FromJSON_6= ruleFromJSON
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallExpressionAccess().getFromJSONParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FromJSON_6=ruleFromJSON();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FromJSON_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGitHubActionsParser.g:1627:3: this_HashFiles_7= ruleHashFiles
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallExpressionAccess().getHashFilesParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_HashFiles_7=ruleHashFiles();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_HashFiles_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalGitHubActionsParser.g:1639:3: this_Success_8= ruleSuccess
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallExpressionAccess().getSuccessParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Success_8=ruleSuccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Success_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalGitHubActionsParser.g:1651:3: this_Always_9= ruleAlways
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallExpressionAccess().getAlwaysParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Always_9=ruleAlways();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Always_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalGitHubActionsParser.g:1663:3: this_Failure_10= ruleFailure
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallExpressionAccess().getFailureParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Failure_10=ruleFailure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Failure_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalGitHubActionsParser.g:1675:3: this_Cancelled_11= ruleCancelled
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallExpressionAccess().getCancelledParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Cancelled_11=ruleCancelled();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Cancelled_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCallExpression"


    // $ANTLR start "entryRuleContains"
    // InternalGitHubActionsParser.g:1690:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalGitHubActionsParser.g:1690:49: (iv_ruleContains= ruleContains EOF )
            // InternalGitHubActionsParser.g:1691:2: iv_ruleContains= ruleContains EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContains=ruleContains();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContains; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:1697:1: ruleContains returns [EObject current=null] : (otherlv_0= Contains otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_search_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_item_7_0= ruleInsideBracketsExpression ) ) (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        Token otherlv_5=null;
        Token this_WS_6=null;
        Token this_WS_8=null;
        Token otherlv_9=null;
        EObject lv_search_3_0 = null;

        EObject lv_item_7_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:1703:2: ( (otherlv_0= Contains otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_search_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_item_7_0= ruleInsideBracketsExpression ) ) (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis ) )
            // InternalGitHubActionsParser.g:1704:2: (otherlv_0= Contains otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_search_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_item_7_0= ruleInsideBracketsExpression ) ) (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis )
            {
            // InternalGitHubActionsParser.g:1704:2: (otherlv_0= Contains otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_search_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_item_7_0= ruleInsideBracketsExpression ) ) (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis )
            // InternalGitHubActionsParser.g:1705:3: otherlv_0= Contains otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_search_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_item_7_0= ruleInsideBracketsExpression ) ) (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis
            {
            otherlv_0=(Token)match(input,Contains,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getContainsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainsAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGitHubActionsParser.g:1713:3: (this_WS_2= RULE_WS )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_WS) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGitHubActionsParser.g:1714:4: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_2, grammarAccess.getContainsAccess().getWSTerminalRuleCall_2());
                      			
                    }

                    }
                    break;

            }

            // InternalGitHubActionsParser.g:1719:3: ( (lv_search_3_0= ruleInsideBracketsExpression ) )
            // InternalGitHubActionsParser.g:1720:4: (lv_search_3_0= ruleInsideBracketsExpression )
            {
            // InternalGitHubActionsParser.g:1720:4: (lv_search_3_0= ruleInsideBracketsExpression )
            // InternalGitHubActionsParser.g:1721:5: lv_search_3_0= ruleInsideBracketsExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainsAccess().getSearchInsideBracketsExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_search_3_0=ruleInsideBracketsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainsRule());
              					}
              					set(
              						current,
              						"search",
              						lv_search_3_0,
              						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.InsideBracketsExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGitHubActionsParser.g:1738:3: (this_WS_4= RULE_WS )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_WS) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGitHubActionsParser.g:1739:4: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_4, grammarAccess.getContainsAccess().getWSTerminalRuleCall_4());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,Comma,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getContainsAccess().getCommaKeyword_5());
              		
            }
            // InternalGitHubActionsParser.g:1748:3: (this_WS_6= RULE_WS )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_WS) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGitHubActionsParser.g:1749:4: this_WS_6= RULE_WS
                    {
                    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_6, grammarAccess.getContainsAccess().getWSTerminalRuleCall_6());
                      			
                    }

                    }
                    break;

            }

            // InternalGitHubActionsParser.g:1754:3: ( (lv_item_7_0= ruleInsideBracketsExpression ) )
            // InternalGitHubActionsParser.g:1755:4: (lv_item_7_0= ruleInsideBracketsExpression )
            {
            // InternalGitHubActionsParser.g:1755:4: (lv_item_7_0= ruleInsideBracketsExpression )
            // InternalGitHubActionsParser.g:1756:5: lv_item_7_0= ruleInsideBracketsExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainsAccess().getItemInsideBracketsExpressionParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_item_7_0=ruleInsideBracketsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContainsRule());
              					}
              					set(
              						current,
              						"item",
              						lv_item_7_0,
              						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.InsideBracketsExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGitHubActionsParser.g:1773:3: (this_WS_8= RULE_WS )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_WS) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGitHubActionsParser.g:1774:4: this_WS_8= RULE_WS
                    {
                    this_WS_8=(Token)match(input,RULE_WS,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_8, grammarAccess.getContainsAccess().getWSTerminalRuleCall_8());
                      			
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getContainsAccess().getRightParenthesisKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleContains"


    // $ANTLR start "entryRuleStartsWith"
    // InternalGitHubActionsParser.g:1787:1: entryRuleStartsWith returns [EObject current=null] : iv_ruleStartsWith= ruleStartsWith EOF ;
    public final EObject entryRuleStartsWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartsWith = null;


        try {
            // InternalGitHubActionsParser.g:1787:51: (iv_ruleStartsWith= ruleStartsWith EOF )
            // InternalGitHubActionsParser.g:1788:2: iv_ruleStartsWith= ruleStartsWith EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStartsWithRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStartsWith=ruleStartsWith();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStartsWith; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:1794:1: ruleStartsWith returns [EObject current=null] : (otherlv_0= StartsWith otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_searchString_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_searchValue_7_0= ruleInsideBracketsExpression ) ) (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis ) ;
    public final EObject ruleStartsWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        Token otherlv_5=null;
        Token this_WS_6=null;
        Token this_WS_8=null;
        Token otherlv_9=null;
        EObject lv_searchString_3_0 = null;

        EObject lv_searchValue_7_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:1800:2: ( (otherlv_0= StartsWith otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_searchString_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_searchValue_7_0= ruleInsideBracketsExpression ) ) (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis ) )
            // InternalGitHubActionsParser.g:1801:2: (otherlv_0= StartsWith otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_searchString_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_searchValue_7_0= ruleInsideBracketsExpression ) ) (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis )
            {
            // InternalGitHubActionsParser.g:1801:2: (otherlv_0= StartsWith otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_searchString_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_searchValue_7_0= ruleInsideBracketsExpression ) ) (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis )
            // InternalGitHubActionsParser.g:1802:3: otherlv_0= StartsWith otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_searchString_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_searchValue_7_0= ruleInsideBracketsExpression ) ) (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis
            {
            otherlv_0=(Token)match(input,StartsWith,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStartsWithAccess().getStartsWithKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStartsWithAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGitHubActionsParser.g:1810:3: (this_WS_2= RULE_WS )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_WS) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGitHubActionsParser.g:1811:4: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_2, grammarAccess.getStartsWithAccess().getWSTerminalRuleCall_2());
                      			
                    }

                    }
                    break;

            }

            // InternalGitHubActionsParser.g:1816:3: ( (lv_searchString_3_0= ruleInsideBracketsExpression ) )
            // InternalGitHubActionsParser.g:1817:4: (lv_searchString_3_0= ruleInsideBracketsExpression )
            {
            // InternalGitHubActionsParser.g:1817:4: (lv_searchString_3_0= ruleInsideBracketsExpression )
            // InternalGitHubActionsParser.g:1818:5: lv_searchString_3_0= ruleInsideBracketsExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStartsWithAccess().getSearchStringInsideBracketsExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_searchString_3_0=ruleInsideBracketsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStartsWithRule());
              					}
              					set(
              						current,
              						"searchString",
              						lv_searchString_3_0,
              						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.InsideBracketsExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGitHubActionsParser.g:1835:3: (this_WS_4= RULE_WS )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_WS) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGitHubActionsParser.g:1836:4: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_4, grammarAccess.getStartsWithAccess().getWSTerminalRuleCall_4());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,Comma,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getStartsWithAccess().getCommaKeyword_5());
              		
            }
            // InternalGitHubActionsParser.g:1845:3: (this_WS_6= RULE_WS )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_WS) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGitHubActionsParser.g:1846:4: this_WS_6= RULE_WS
                    {
                    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_6, grammarAccess.getStartsWithAccess().getWSTerminalRuleCall_6());
                      			
                    }

                    }
                    break;

            }

            // InternalGitHubActionsParser.g:1851:3: ( (lv_searchValue_7_0= ruleInsideBracketsExpression ) )
            // InternalGitHubActionsParser.g:1852:4: (lv_searchValue_7_0= ruleInsideBracketsExpression )
            {
            // InternalGitHubActionsParser.g:1852:4: (lv_searchValue_7_0= ruleInsideBracketsExpression )
            // InternalGitHubActionsParser.g:1853:5: lv_searchValue_7_0= ruleInsideBracketsExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStartsWithAccess().getSearchValueInsideBracketsExpressionParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_searchValue_7_0=ruleInsideBracketsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStartsWithRule());
              					}
              					set(
              						current,
              						"searchValue",
              						lv_searchValue_7_0,
              						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.InsideBracketsExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGitHubActionsParser.g:1870:3: (this_WS_8= RULE_WS )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_WS) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGitHubActionsParser.g:1871:4: this_WS_8= RULE_WS
                    {
                    this_WS_8=(Token)match(input,RULE_WS,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_8, grammarAccess.getStartsWithAccess().getWSTerminalRuleCall_8());
                      			
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getStartsWithAccess().getRightParenthesisKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStartsWith"


    // $ANTLR start "entryRuleEndsWith"
    // InternalGitHubActionsParser.g:1884:1: entryRuleEndsWith returns [EObject current=null] : iv_ruleEndsWith= ruleEndsWith EOF ;
    public final EObject entryRuleEndsWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndsWith = null;


        try {
            // InternalGitHubActionsParser.g:1884:49: (iv_ruleEndsWith= ruleEndsWith EOF )
            // InternalGitHubActionsParser.g:1885:2: iv_ruleEndsWith= ruleEndsWith EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEndsWithRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEndsWith=ruleEndsWith();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEndsWith; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:1891:1: ruleEndsWith returns [EObject current=null] : (otherlv_0= EndsWith otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_searchString_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_searchValue_7_0= ruleInsideBracketsExpression ) ) (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis ) ;
    public final EObject ruleEndsWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        Token otherlv_5=null;
        Token this_WS_6=null;
        Token this_WS_8=null;
        Token otherlv_9=null;
        EObject lv_searchString_3_0 = null;

        EObject lv_searchValue_7_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:1897:2: ( (otherlv_0= EndsWith otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_searchString_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_searchValue_7_0= ruleInsideBracketsExpression ) ) (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis ) )
            // InternalGitHubActionsParser.g:1898:2: (otherlv_0= EndsWith otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_searchString_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_searchValue_7_0= ruleInsideBracketsExpression ) ) (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis )
            {
            // InternalGitHubActionsParser.g:1898:2: (otherlv_0= EndsWith otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_searchString_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_searchValue_7_0= ruleInsideBracketsExpression ) ) (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis )
            // InternalGitHubActionsParser.g:1899:3: otherlv_0= EndsWith otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_searchString_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_searchValue_7_0= ruleInsideBracketsExpression ) ) (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis
            {
            otherlv_0=(Token)match(input,EndsWith,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEndsWithAccess().getEndsWithKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEndsWithAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGitHubActionsParser.g:1907:3: (this_WS_2= RULE_WS )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_WS) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGitHubActionsParser.g:1908:4: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_2, grammarAccess.getEndsWithAccess().getWSTerminalRuleCall_2());
                      			
                    }

                    }
                    break;

            }

            // InternalGitHubActionsParser.g:1913:3: ( (lv_searchString_3_0= ruleInsideBracketsExpression ) )
            // InternalGitHubActionsParser.g:1914:4: (lv_searchString_3_0= ruleInsideBracketsExpression )
            {
            // InternalGitHubActionsParser.g:1914:4: (lv_searchString_3_0= ruleInsideBracketsExpression )
            // InternalGitHubActionsParser.g:1915:5: lv_searchString_3_0= ruleInsideBracketsExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEndsWithAccess().getSearchStringInsideBracketsExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_searchString_3_0=ruleInsideBracketsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEndsWithRule());
              					}
              					set(
              						current,
              						"searchString",
              						lv_searchString_3_0,
              						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.InsideBracketsExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGitHubActionsParser.g:1932:3: (this_WS_4= RULE_WS )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_WS) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGitHubActionsParser.g:1933:4: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_4, grammarAccess.getEndsWithAccess().getWSTerminalRuleCall_4());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,Comma,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEndsWithAccess().getCommaKeyword_5());
              		
            }
            // InternalGitHubActionsParser.g:1942:3: (this_WS_6= RULE_WS )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_WS) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalGitHubActionsParser.g:1943:4: this_WS_6= RULE_WS
                    {
                    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_6, grammarAccess.getEndsWithAccess().getWSTerminalRuleCall_6());
                      			
                    }

                    }
                    break;

            }

            // InternalGitHubActionsParser.g:1948:3: ( (lv_searchValue_7_0= ruleInsideBracketsExpression ) )
            // InternalGitHubActionsParser.g:1949:4: (lv_searchValue_7_0= ruleInsideBracketsExpression )
            {
            // InternalGitHubActionsParser.g:1949:4: (lv_searchValue_7_0= ruleInsideBracketsExpression )
            // InternalGitHubActionsParser.g:1950:5: lv_searchValue_7_0= ruleInsideBracketsExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEndsWithAccess().getSearchValueInsideBracketsExpressionParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_searchValue_7_0=ruleInsideBracketsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEndsWithRule());
              					}
              					set(
              						current,
              						"searchValue",
              						lv_searchValue_7_0,
              						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.InsideBracketsExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGitHubActionsParser.g:1967:3: (this_WS_8= RULE_WS )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_WS) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalGitHubActionsParser.g:1968:4: this_WS_8= RULE_WS
                    {
                    this_WS_8=(Token)match(input,RULE_WS,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_8, grammarAccess.getEndsWithAccess().getWSTerminalRuleCall_8());
                      			
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getEndsWithAccess().getRightParenthesisKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEndsWith"


    // $ANTLR start "entryRuleFormat"
    // InternalGitHubActionsParser.g:1981:1: entryRuleFormat returns [EObject current=null] : iv_ruleFormat= ruleFormat EOF ;
    public final EObject entryRuleFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormat = null;


        try {
            // InternalGitHubActionsParser.g:1981:47: (iv_ruleFormat= ruleFormat EOF )
            // InternalGitHubActionsParser.g:1982:2: iv_ruleFormat= ruleFormat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFormat=ruleFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:1988:1: ruleFormat returns [EObject current=null] : (otherlv_0= Format otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_string_3_0= ruleInsideBracketsExpression ) ) ( (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_replaceValues_7_0= ruleInsideBracketsExpression ) ) )* (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis ) ;
    public final EObject ruleFormat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        Token otherlv_5=null;
        Token this_WS_6=null;
        Token this_WS_8=null;
        Token otherlv_9=null;
        EObject lv_string_3_0 = null;

        EObject lv_replaceValues_7_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:1994:2: ( (otherlv_0= Format otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_string_3_0= ruleInsideBracketsExpression ) ) ( (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_replaceValues_7_0= ruleInsideBracketsExpression ) ) )* (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis ) )
            // InternalGitHubActionsParser.g:1995:2: (otherlv_0= Format otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_string_3_0= ruleInsideBracketsExpression ) ) ( (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_replaceValues_7_0= ruleInsideBracketsExpression ) ) )* (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis )
            {
            // InternalGitHubActionsParser.g:1995:2: (otherlv_0= Format otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_string_3_0= ruleInsideBracketsExpression ) ) ( (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_replaceValues_7_0= ruleInsideBracketsExpression ) ) )* (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis )
            // InternalGitHubActionsParser.g:1996:3: otherlv_0= Format otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_string_3_0= ruleInsideBracketsExpression ) ) ( (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_replaceValues_7_0= ruleInsideBracketsExpression ) ) )* (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis
            {
            otherlv_0=(Token)match(input,Format,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFormatAccess().getFormatKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFormatAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGitHubActionsParser.g:2004:3: (this_WS_2= RULE_WS )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_WS) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGitHubActionsParser.g:2005:4: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_2, grammarAccess.getFormatAccess().getWSTerminalRuleCall_2());
                      			
                    }

                    }
                    break;

            }

            // InternalGitHubActionsParser.g:2010:3: ( (lv_string_3_0= ruleInsideBracketsExpression ) )
            // InternalGitHubActionsParser.g:2011:4: (lv_string_3_0= ruleInsideBracketsExpression )
            {
            // InternalGitHubActionsParser.g:2011:4: (lv_string_3_0= ruleInsideBracketsExpression )
            // InternalGitHubActionsParser.g:2012:5: lv_string_3_0= ruleInsideBracketsExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFormatAccess().getStringInsideBracketsExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_string_3_0=ruleInsideBracketsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFormatRule());
              					}
              					set(
              						current,
              						"string",
              						lv_string_3_0,
              						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.InsideBracketsExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGitHubActionsParser.g:2029:3: ( (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_replaceValues_7_0= ruleInsideBracketsExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_WS) ) {
                    int LA51_1 = input.LA(2);

                    if ( (LA51_1==Comma) ) {
                        alt51=1;
                    }


                }
                else if ( (LA51_0==Comma) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalGitHubActionsParser.g:2030:4: (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_replaceValues_7_0= ruleInsideBracketsExpression ) )
            	    {
            	    // InternalGitHubActionsParser.g:2030:4: (this_WS_4= RULE_WS )?
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==RULE_WS) ) {
            	        alt49=1;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // InternalGitHubActionsParser.g:2031:5: this_WS_4= RULE_WS
            	            {
            	            this_WS_4=(Token)match(input,RULE_WS,FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_WS_4, grammarAccess.getFormatAccess().getWSTerminalRuleCall_4_0());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    otherlv_5=(Token)match(input,Comma,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getFormatAccess().getCommaKeyword_4_1());
            	      			
            	    }
            	    // InternalGitHubActionsParser.g:2040:4: (this_WS_6= RULE_WS )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==RULE_WS) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalGitHubActionsParser.g:2041:5: this_WS_6= RULE_WS
            	            {
            	            this_WS_6=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_WS_6, grammarAccess.getFormatAccess().getWSTerminalRuleCall_4_2());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalGitHubActionsParser.g:2046:4: ( (lv_replaceValues_7_0= ruleInsideBracketsExpression ) )
            	    // InternalGitHubActionsParser.g:2047:5: (lv_replaceValues_7_0= ruleInsideBracketsExpression )
            	    {
            	    // InternalGitHubActionsParser.g:2047:5: (lv_replaceValues_7_0= ruleInsideBracketsExpression )
            	    // InternalGitHubActionsParser.g:2048:6: lv_replaceValues_7_0= ruleInsideBracketsExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFormatAccess().getReplaceValuesInsideBracketsExpressionParserRuleCall_4_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_replaceValues_7_0=ruleInsideBracketsExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFormatRule());
            	      						}
            	      						add(
            	      							current,
            	      							"replaceValues",
            	      							lv_replaceValues_7_0,
            	      							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.InsideBracketsExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // InternalGitHubActionsParser.g:2066:3: (this_WS_8= RULE_WS )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_WS) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalGitHubActionsParser.g:2067:4: this_WS_8= RULE_WS
                    {
                    this_WS_8=(Token)match(input,RULE_WS,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_8, grammarAccess.getFormatAccess().getWSTerminalRuleCall_5());
                      			
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getFormatAccess().getRightParenthesisKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFormat"


    // $ANTLR start "entryRuleJoin"
    // InternalGitHubActionsParser.g:2080:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalGitHubActionsParser.g:2080:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalGitHubActionsParser.g:2081:2: iv_ruleJoin= ruleJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJoin=ruleJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoin; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:2087:1: ruleJoin returns [EObject current=null] : (otherlv_0= Join otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_array_3_0= ruleInsideBracketsExpression ) ) ( (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_sep_7_0= ruleInsideBracketsExpression ) ) )? (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        Token otherlv_5=null;
        Token this_WS_6=null;
        Token this_WS_8=null;
        Token otherlv_9=null;
        EObject lv_array_3_0 = null;

        EObject lv_sep_7_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:2093:2: ( (otherlv_0= Join otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_array_3_0= ruleInsideBracketsExpression ) ) ( (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_sep_7_0= ruleInsideBracketsExpression ) ) )? (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis ) )
            // InternalGitHubActionsParser.g:2094:2: (otherlv_0= Join otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_array_3_0= ruleInsideBracketsExpression ) ) ( (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_sep_7_0= ruleInsideBracketsExpression ) ) )? (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis )
            {
            // InternalGitHubActionsParser.g:2094:2: (otherlv_0= Join otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_array_3_0= ruleInsideBracketsExpression ) ) ( (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_sep_7_0= ruleInsideBracketsExpression ) ) )? (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis )
            // InternalGitHubActionsParser.g:2095:3: otherlv_0= Join otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_array_3_0= ruleInsideBracketsExpression ) ) ( (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_sep_7_0= ruleInsideBracketsExpression ) ) )? (this_WS_8= RULE_WS )? otherlv_9= RightParenthesis
            {
            otherlv_0=(Token)match(input,Join,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJoinKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGitHubActionsParser.g:2103:3: (this_WS_2= RULE_WS )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_WS) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalGitHubActionsParser.g:2104:4: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_2, grammarAccess.getJoinAccess().getWSTerminalRuleCall_2());
                      			
                    }

                    }
                    break;

            }

            // InternalGitHubActionsParser.g:2109:3: ( (lv_array_3_0= ruleInsideBracketsExpression ) )
            // InternalGitHubActionsParser.g:2110:4: (lv_array_3_0= ruleInsideBracketsExpression )
            {
            // InternalGitHubActionsParser.g:2110:4: (lv_array_3_0= ruleInsideBracketsExpression )
            // InternalGitHubActionsParser.g:2111:5: lv_array_3_0= ruleInsideBracketsExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJoinAccess().getArrayInsideBracketsExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_array_3_0=ruleInsideBracketsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJoinRule());
              					}
              					set(
              						current,
              						"array",
              						lv_array_3_0,
              						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.InsideBracketsExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGitHubActionsParser.g:2128:3: ( (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_sep_7_0= ruleInsideBracketsExpression ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_WS) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==Comma) ) {
                    alt56=1;
                }
            }
            else if ( (LA56_0==Comma) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalGitHubActionsParser.g:2129:4: (this_WS_4= RULE_WS )? otherlv_5= Comma (this_WS_6= RULE_WS )? ( (lv_sep_7_0= ruleInsideBracketsExpression ) )
                    {
                    // InternalGitHubActionsParser.g:2129:4: (this_WS_4= RULE_WS )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_WS) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalGitHubActionsParser.g:2130:5: this_WS_4= RULE_WS
                            {
                            this_WS_4=(Token)match(input,RULE_WS,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_WS_4, grammarAccess.getJoinAccess().getWSTerminalRuleCall_4_0());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,Comma,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getJoinAccess().getCommaKeyword_4_1());
                      			
                    }
                    // InternalGitHubActionsParser.g:2139:4: (this_WS_6= RULE_WS )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_WS) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalGitHubActionsParser.g:2140:5: this_WS_6= RULE_WS
                            {
                            this_WS_6=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_WS_6, grammarAccess.getJoinAccess().getWSTerminalRuleCall_4_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalGitHubActionsParser.g:2145:4: ( (lv_sep_7_0= ruleInsideBracketsExpression ) )
                    // InternalGitHubActionsParser.g:2146:5: (lv_sep_7_0= ruleInsideBracketsExpression )
                    {
                    // InternalGitHubActionsParser.g:2146:5: (lv_sep_7_0= ruleInsideBracketsExpression )
                    // InternalGitHubActionsParser.g:2147:6: lv_sep_7_0= ruleInsideBracketsExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJoinAccess().getSepInsideBracketsExpressionParserRuleCall_4_3_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_sep_7_0=ruleInsideBracketsExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJoinRule());
                      						}
                      						set(
                      							current,
                      							"sep",
                      							lv_sep_7_0,
                      							"d.fe.up.pt.cicd.gha.dsl.GitHubActions.InsideBracketsExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalGitHubActionsParser.g:2165:3: (this_WS_8= RULE_WS )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_WS) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalGitHubActionsParser.g:2166:4: this_WS_8= RULE_WS
                    {
                    this_WS_8=(Token)match(input,RULE_WS,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_8, grammarAccess.getJoinAccess().getWSTerminalRuleCall_5());
                      			
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getJoinAccess().getRightParenthesisKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleToJSON"
    // InternalGitHubActionsParser.g:2179:1: entryRuleToJSON returns [EObject current=null] : iv_ruleToJSON= ruleToJSON EOF ;
    public final EObject entryRuleToJSON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToJSON = null;


        try {
            // InternalGitHubActionsParser.g:2179:47: (iv_ruleToJSON= ruleToJSON EOF )
            // InternalGitHubActionsParser.g:2180:2: iv_ruleToJSON= ruleToJSON EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getToJSONRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleToJSON=ruleToJSON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleToJSON; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:2186:1: ruleToJSON returns [EObject current=null] : (otherlv_0= ToJSON otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_value_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleToJSON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        Token otherlv_5=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:2192:2: ( (otherlv_0= ToJSON otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_value_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= RightParenthesis ) )
            // InternalGitHubActionsParser.g:2193:2: (otherlv_0= ToJSON otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_value_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= RightParenthesis )
            {
            // InternalGitHubActionsParser.g:2193:2: (otherlv_0= ToJSON otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_value_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= RightParenthesis )
            // InternalGitHubActionsParser.g:2194:3: otherlv_0= ToJSON otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_value_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= RightParenthesis
            {
            otherlv_0=(Token)match(input,ToJSON,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getToJSONAccess().getToJSONKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getToJSONAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGitHubActionsParser.g:2202:3: (this_WS_2= RULE_WS )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_WS) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalGitHubActionsParser.g:2203:4: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_2, grammarAccess.getToJSONAccess().getWSTerminalRuleCall_2());
                      			
                    }

                    }
                    break;

            }

            // InternalGitHubActionsParser.g:2208:3: ( (lv_value_3_0= ruleInsideBracketsExpression ) )
            // InternalGitHubActionsParser.g:2209:4: (lv_value_3_0= ruleInsideBracketsExpression )
            {
            // InternalGitHubActionsParser.g:2209:4: (lv_value_3_0= ruleInsideBracketsExpression )
            // InternalGitHubActionsParser.g:2210:5: lv_value_3_0= ruleInsideBracketsExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getToJSONAccess().getValueInsideBracketsExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_value_3_0=ruleInsideBracketsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getToJSONRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_3_0,
              						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.InsideBracketsExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGitHubActionsParser.g:2227:3: (this_WS_4= RULE_WS )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_WS) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalGitHubActionsParser.g:2228:4: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_4, grammarAccess.getToJSONAccess().getWSTerminalRuleCall_4());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getToJSONAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleToJSON"


    // $ANTLR start "entryRuleFromJSON"
    // InternalGitHubActionsParser.g:2241:1: entryRuleFromJSON returns [EObject current=null] : iv_ruleFromJSON= ruleFromJSON EOF ;
    public final EObject entryRuleFromJSON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromJSON = null;


        try {
            // InternalGitHubActionsParser.g:2241:49: (iv_ruleFromJSON= ruleFromJSON EOF )
            // InternalGitHubActionsParser.g:2242:2: iv_ruleFromJSON= ruleFromJSON EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromJSONRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFromJSON=ruleFromJSON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromJSON; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:2248:1: ruleFromJSON returns [EObject current=null] : (otherlv_0= FromJSON otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_value_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleFromJSON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        Token otherlv_5=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:2254:2: ( (otherlv_0= FromJSON otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_value_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= RightParenthesis ) )
            // InternalGitHubActionsParser.g:2255:2: (otherlv_0= FromJSON otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_value_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= RightParenthesis )
            {
            // InternalGitHubActionsParser.g:2255:2: (otherlv_0= FromJSON otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_value_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= RightParenthesis )
            // InternalGitHubActionsParser.g:2256:3: otherlv_0= FromJSON otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_value_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= RightParenthesis
            {
            otherlv_0=(Token)match(input,FromJSON,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFromJSONAccess().getFromJSONKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFromJSONAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGitHubActionsParser.g:2264:3: (this_WS_2= RULE_WS )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_WS) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalGitHubActionsParser.g:2265:4: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_2, grammarAccess.getFromJSONAccess().getWSTerminalRuleCall_2());
                      			
                    }

                    }
                    break;

            }

            // InternalGitHubActionsParser.g:2270:3: ( (lv_value_3_0= ruleInsideBracketsExpression ) )
            // InternalGitHubActionsParser.g:2271:4: (lv_value_3_0= ruleInsideBracketsExpression )
            {
            // InternalGitHubActionsParser.g:2271:4: (lv_value_3_0= ruleInsideBracketsExpression )
            // InternalGitHubActionsParser.g:2272:5: lv_value_3_0= ruleInsideBracketsExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFromJSONAccess().getValueInsideBracketsExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_value_3_0=ruleInsideBracketsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFromJSONRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_3_0,
              						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.InsideBracketsExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGitHubActionsParser.g:2289:3: (this_WS_4= RULE_WS )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_WS) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalGitHubActionsParser.g:2290:4: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_4, grammarAccess.getFromJSONAccess().getWSTerminalRuleCall_4());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFromJSONAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFromJSON"


    // $ANTLR start "entryRuleHashFiles"
    // InternalGitHubActionsParser.g:2303:1: entryRuleHashFiles returns [EObject current=null] : iv_ruleHashFiles= ruleHashFiles EOF ;
    public final EObject entryRuleHashFiles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashFiles = null;


        try {
            // InternalGitHubActionsParser.g:2303:50: (iv_ruleHashFiles= ruleHashFiles EOF )
            // InternalGitHubActionsParser.g:2304:2: iv_ruleHashFiles= ruleHashFiles EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHashFilesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHashFiles=ruleHashFiles();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHashFiles; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:2310:1: ruleHashFiles returns [EObject current=null] : (otherlv_0= HashFiles otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_path_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleHashFiles() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        Token otherlv_5=null;
        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalGitHubActionsParser.g:2316:2: ( (otherlv_0= HashFiles otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_path_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= RightParenthesis ) )
            // InternalGitHubActionsParser.g:2317:2: (otherlv_0= HashFiles otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_path_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= RightParenthesis )
            {
            // InternalGitHubActionsParser.g:2317:2: (otherlv_0= HashFiles otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_path_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= RightParenthesis )
            // InternalGitHubActionsParser.g:2318:3: otherlv_0= HashFiles otherlv_1= LeftParenthesis (this_WS_2= RULE_WS )? ( (lv_path_3_0= ruleInsideBracketsExpression ) ) (this_WS_4= RULE_WS )? otherlv_5= RightParenthesis
            {
            otherlv_0=(Token)match(input,HashFiles,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHashFilesAccess().getHashFilesKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHashFilesAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGitHubActionsParser.g:2326:3: (this_WS_2= RULE_WS )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_WS) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalGitHubActionsParser.g:2327:4: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_2, grammarAccess.getHashFilesAccess().getWSTerminalRuleCall_2());
                      			
                    }

                    }
                    break;

            }

            // InternalGitHubActionsParser.g:2332:3: ( (lv_path_3_0= ruleInsideBracketsExpression ) )
            // InternalGitHubActionsParser.g:2333:4: (lv_path_3_0= ruleInsideBracketsExpression )
            {
            // InternalGitHubActionsParser.g:2333:4: (lv_path_3_0= ruleInsideBracketsExpression )
            // InternalGitHubActionsParser.g:2334:5: lv_path_3_0= ruleInsideBracketsExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHashFilesAccess().getPathInsideBracketsExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_path_3_0=ruleInsideBracketsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHashFilesRule());
              					}
              					set(
              						current,
              						"path",
              						lv_path_3_0,
              						"d.fe.up.pt.cicd.gha.dsl.GitHubActions.InsideBracketsExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGitHubActionsParser.g:2351:3: (this_WS_4= RULE_WS )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_WS) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalGitHubActionsParser.g:2352:4: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_4, grammarAccess.getHashFilesAccess().getWSTerminalRuleCall_4());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getHashFilesAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleHashFiles"


    // $ANTLR start "entryRuleSuccess"
    // InternalGitHubActionsParser.g:2365:1: entryRuleSuccess returns [EObject current=null] : iv_ruleSuccess= ruleSuccess EOF ;
    public final EObject entryRuleSuccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuccess = null;


        try {
            // InternalGitHubActionsParser.g:2365:48: (iv_ruleSuccess= ruleSuccess EOF )
            // InternalGitHubActionsParser.g:2366:2: iv_ruleSuccess= ruleSuccess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuccessRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSuccess=ruleSuccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuccess; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:2372:1: ruleSuccess returns [EObject current=null] : ( () otherlv_1= Success otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleSuccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_WS_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGitHubActionsParser.g:2378:2: ( ( () otherlv_1= Success otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis ) )
            // InternalGitHubActionsParser.g:2379:2: ( () otherlv_1= Success otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis )
            {
            // InternalGitHubActionsParser.g:2379:2: ( () otherlv_1= Success otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis )
            // InternalGitHubActionsParser.g:2380:3: () otherlv_1= Success otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis
            {
            // InternalGitHubActionsParser.g:2380:3: ()
            // InternalGitHubActionsParser.g:2381:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSuccessAccess().getSuccessAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Success,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSuccessAccess().getSuccessKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSuccessAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalGitHubActionsParser.g:2398:3: (this_WS_3= RULE_WS )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_WS) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalGitHubActionsParser.g:2399:4: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_3, grammarAccess.getSuccessAccess().getWSTerminalRuleCall_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSuccessAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSuccess"


    // $ANTLR start "entryRuleAlways"
    // InternalGitHubActionsParser.g:2412:1: entryRuleAlways returns [EObject current=null] : iv_ruleAlways= ruleAlways EOF ;
    public final EObject entryRuleAlways() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlways = null;


        try {
            // InternalGitHubActionsParser.g:2412:47: (iv_ruleAlways= ruleAlways EOF )
            // InternalGitHubActionsParser.g:2413:2: iv_ruleAlways= ruleAlways EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAlways=ruleAlways();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlways; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:2419:1: ruleAlways returns [EObject current=null] : ( () otherlv_1= Always otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleAlways() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_WS_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGitHubActionsParser.g:2425:2: ( ( () otherlv_1= Always otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis ) )
            // InternalGitHubActionsParser.g:2426:2: ( () otherlv_1= Always otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis )
            {
            // InternalGitHubActionsParser.g:2426:2: ( () otherlv_1= Always otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis )
            // InternalGitHubActionsParser.g:2427:3: () otherlv_1= Always otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis
            {
            // InternalGitHubActionsParser.g:2427:3: ()
            // InternalGitHubActionsParser.g:2428:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAlwaysAccess().getAlwaysAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Always,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAlwaysAccess().getAlwaysKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAlwaysAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalGitHubActionsParser.g:2445:3: (this_WS_3= RULE_WS )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_WS) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalGitHubActionsParser.g:2446:4: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_3, grammarAccess.getAlwaysAccess().getWSTerminalRuleCall_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAlwaysAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAlways"


    // $ANTLR start "entryRuleCancelled"
    // InternalGitHubActionsParser.g:2459:1: entryRuleCancelled returns [EObject current=null] : iv_ruleCancelled= ruleCancelled EOF ;
    public final EObject entryRuleCancelled() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCancelled = null;


        try {
            // InternalGitHubActionsParser.g:2459:50: (iv_ruleCancelled= ruleCancelled EOF )
            // InternalGitHubActionsParser.g:2460:2: iv_ruleCancelled= ruleCancelled EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCancelledRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCancelled=ruleCancelled();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCancelled; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:2466:1: ruleCancelled returns [EObject current=null] : ( () otherlv_1= Cancelled otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleCancelled() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_WS_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGitHubActionsParser.g:2472:2: ( ( () otherlv_1= Cancelled otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis ) )
            // InternalGitHubActionsParser.g:2473:2: ( () otherlv_1= Cancelled otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis )
            {
            // InternalGitHubActionsParser.g:2473:2: ( () otherlv_1= Cancelled otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis )
            // InternalGitHubActionsParser.g:2474:3: () otherlv_1= Cancelled otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis
            {
            // InternalGitHubActionsParser.g:2474:3: ()
            // InternalGitHubActionsParser.g:2475:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCancelledAccess().getCancelledAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Cancelled,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCancelledAccess().getCancelledKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCancelledAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalGitHubActionsParser.g:2492:3: (this_WS_3= RULE_WS )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_WS) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalGitHubActionsParser.g:2493:4: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_3, grammarAccess.getCancelledAccess().getWSTerminalRuleCall_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getCancelledAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCancelled"


    // $ANTLR start "entryRuleFailure"
    // InternalGitHubActionsParser.g:2506:1: entryRuleFailure returns [EObject current=null] : iv_ruleFailure= ruleFailure EOF ;
    public final EObject entryRuleFailure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFailure = null;


        try {
            // InternalGitHubActionsParser.g:2506:48: (iv_ruleFailure= ruleFailure EOF )
            // InternalGitHubActionsParser.g:2507:2: iv_ruleFailure= ruleFailure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFailureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFailure=ruleFailure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFailure; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGitHubActionsParser.g:2513:1: ruleFailure returns [EObject current=null] : ( () otherlv_1= Failure otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleFailure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_WS_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGitHubActionsParser.g:2519:2: ( ( () otherlv_1= Failure otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis ) )
            // InternalGitHubActionsParser.g:2520:2: ( () otherlv_1= Failure otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis )
            {
            // InternalGitHubActionsParser.g:2520:2: ( () otherlv_1= Failure otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis )
            // InternalGitHubActionsParser.g:2521:3: () otherlv_1= Failure otherlv_2= LeftParenthesis (this_WS_3= RULE_WS )? otherlv_4= RightParenthesis
            {
            // InternalGitHubActionsParser.g:2521:3: ()
            // InternalGitHubActionsParser.g:2522:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFailureAccess().getFailureAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Failure,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFailureAccess().getFailureKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFailureAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalGitHubActionsParser.g:2539:3: (this_WS_3= RULE_WS )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_WS) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalGitHubActionsParser.g:2540:4: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_WS_3, grammarAccess.getFailureAccess().getWSTerminalRuleCall_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFailureAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFailure"


    // $ANTLR start "entryRuleYAMLString"
    // InternalGitHubActionsParser.g:2553:1: entryRuleYAMLString returns [String current=null] : iv_ruleYAMLString= ruleYAMLString EOF ;
    public final String entryRuleYAMLString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleYAMLString = null;


        try {
            // InternalGitHubActionsParser.g:2553:50: (iv_ruleYAMLString= ruleYAMLString EOF )
            // InternalGitHubActionsParser.g:2554:2: iv_ruleYAMLString= ruleYAMLString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAMLStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAMLString=ruleYAMLString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAMLString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleYAMLString"


    // $ANTLR start "ruleYAMLString"
    // InternalGitHubActionsParser.g:2560:1: ruleYAMLString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_UNQUOTED_STRING_1= RULE_UNQUOTED_STRING ) ;
    public final AntlrDatatypeRuleToken ruleYAMLString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_UNQUOTED_STRING_1=null;


        	enterRule();

        try {
            // InternalGitHubActionsParser.g:2566:2: ( (this_STRING_0= RULE_STRING | this_UNQUOTED_STRING_1= RULE_UNQUOTED_STRING ) )
            // InternalGitHubActionsParser.g:2567:2: (this_STRING_0= RULE_STRING | this_UNQUOTED_STRING_1= RULE_UNQUOTED_STRING )
            {
            // InternalGitHubActionsParser.g:2567:2: (this_STRING_0= RULE_STRING | this_UNQUOTED_STRING_1= RULE_UNQUOTED_STRING )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_STRING) ) {
                alt68=1;
            }
            else if ( (LA68_0==RULE_UNQUOTED_STRING) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalGitHubActionsParser.g:2568:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getYAMLStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGitHubActionsParser.g:2576:3: this_UNQUOTED_STRING_1= RULE_UNQUOTED_STRING
                    {
                    this_UNQUOTED_STRING_1=(Token)match(input,RULE_UNQUOTED_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_UNQUOTED_STRING_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_UNQUOTED_STRING_1, grammarAccess.getYAMLStringAccess().getUNQUOTED_STRINGTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleYAMLString"


    // $ANTLR start "ruleCOMPARISON_OP"
    // InternalGitHubActionsParser.g:2587:1: ruleCOMPARISON_OP returns [Enumerator current=null] : ( (enumLiteral_0= GreaterThanSign ) | (enumLiteral_1= GreaterThanSignEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) ) ;
    public final Enumerator ruleCOMPARISON_OP() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalGitHubActionsParser.g:2593:2: ( ( (enumLiteral_0= GreaterThanSign ) | (enumLiteral_1= GreaterThanSignEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) ) )
            // InternalGitHubActionsParser.g:2594:2: ( (enumLiteral_0= GreaterThanSign ) | (enumLiteral_1= GreaterThanSignEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) )
            {
            // InternalGitHubActionsParser.g:2594:2: ( (enumLiteral_0= GreaterThanSign ) | (enumLiteral_1= GreaterThanSignEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) )
            int alt69=4;
            switch ( input.LA(1) ) {
            case GreaterThanSign:
                {
                alt69=1;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt69=2;
                }
                break;
            case LessThanSign:
                {
                alt69=3;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt69=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalGitHubActionsParser.g:2595:3: (enumLiteral_0= GreaterThanSign )
                    {
                    // InternalGitHubActionsParser.g:2595:3: (enumLiteral_0= GreaterThanSign )
                    // InternalGitHubActionsParser.g:2596:4: enumLiteral_0= GreaterThanSign
                    {
                    enumLiteral_0=(Token)match(input,GreaterThanSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCOMPARISON_OPAccess().getGTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCOMPARISON_OPAccess().getGTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGitHubActionsParser.g:2603:3: (enumLiteral_1= GreaterThanSignEqualsSign )
                    {
                    // InternalGitHubActionsParser.g:2603:3: (enumLiteral_1= GreaterThanSignEqualsSign )
                    // InternalGitHubActionsParser.g:2604:4: enumLiteral_1= GreaterThanSignEqualsSign
                    {
                    enumLiteral_1=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCOMPARISON_OPAccess().getGTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCOMPARISON_OPAccess().getGTEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGitHubActionsParser.g:2611:3: (enumLiteral_2= LessThanSign )
                    {
                    // InternalGitHubActionsParser.g:2611:3: (enumLiteral_2= LessThanSign )
                    // InternalGitHubActionsParser.g:2612:4: enumLiteral_2= LessThanSign
                    {
                    enumLiteral_2=(Token)match(input,LessThanSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCOMPARISON_OPAccess().getLTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getCOMPARISON_OPAccess().getLTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGitHubActionsParser.g:2619:3: (enumLiteral_3= LessThanSignEqualsSign )
                    {
                    // InternalGitHubActionsParser.g:2619:3: (enumLiteral_3= LessThanSignEqualsSign )
                    // InternalGitHubActionsParser.g:2620:4: enumLiteral_3= LessThanSignEqualsSign
                    {
                    enumLiteral_3=(Token)match(input,LessThanSignEqualsSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCOMPARISON_OPAccess().getLTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getCOMPARISON_OPAccess().getLTEEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCOMPARISON_OP"


    // $ANTLR start "ruleEQUALITY_OP"
    // InternalGitHubActionsParser.g:2630:1: ruleEQUALITY_OP returns [Enumerator current=null] : ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) ) ;
    public final Enumerator ruleEQUALITY_OP() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGitHubActionsParser.g:2636:2: ( ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) ) )
            // InternalGitHubActionsParser.g:2637:2: ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) )
            {
            // InternalGitHubActionsParser.g:2637:2: ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==EqualsSignEqualsSign) ) {
                alt70=1;
            }
            else if ( (LA70_0==ExclamationMarkEqualsSign) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalGitHubActionsParser.g:2638:3: (enumLiteral_0= EqualsSignEqualsSign )
                    {
                    // InternalGitHubActionsParser.g:2638:3: (enumLiteral_0= EqualsSignEqualsSign )
                    // InternalGitHubActionsParser.g:2639:4: enumLiteral_0= EqualsSignEqualsSign
                    {
                    enumLiteral_0=(Token)match(input,EqualsSignEqualsSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEQUALITY_OPAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEQUALITY_OPAccess().getEQUALSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGitHubActionsParser.g:2646:3: (enumLiteral_1= ExclamationMarkEqualsSign )
                    {
                    // InternalGitHubActionsParser.g:2646:3: (enumLiteral_1= ExclamationMarkEqualsSign )
                    // InternalGitHubActionsParser.g:2647:4: enumLiteral_1= ExclamationMarkEqualsSign
                    {
                    enumLiteral_1=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEQUALITY_OPAccess().getNOT_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEQUALITY_OPAccess().getNOT_EQUALSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEQUALITY_OP"


    // $ANTLR start "ruleCONTEXT"
    // InternalGitHubActionsParser.g:2657:1: ruleCONTEXT returns [Enumerator current=null] : ( (enumLiteral_0= Github ) | (enumLiteral_1= Env ) | (enumLiteral_2= Vars ) | (enumLiteral_3= Job ) | (enumLiteral_4= Jobs ) | (enumLiteral_5= Steps ) | (enumLiteral_6= Runner ) | (enumLiteral_7= Secrets ) | (enumLiteral_8= Strategy ) | (enumLiteral_9= Matrix ) | (enumLiteral_10= Needs ) | (enumLiteral_11= Inputs ) ) ;
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
            // InternalGitHubActionsParser.g:2663:2: ( ( (enumLiteral_0= Github ) | (enumLiteral_1= Env ) | (enumLiteral_2= Vars ) | (enumLiteral_3= Job ) | (enumLiteral_4= Jobs ) | (enumLiteral_5= Steps ) | (enumLiteral_6= Runner ) | (enumLiteral_7= Secrets ) | (enumLiteral_8= Strategy ) | (enumLiteral_9= Matrix ) | (enumLiteral_10= Needs ) | (enumLiteral_11= Inputs ) ) )
            // InternalGitHubActionsParser.g:2664:2: ( (enumLiteral_0= Github ) | (enumLiteral_1= Env ) | (enumLiteral_2= Vars ) | (enumLiteral_3= Job ) | (enumLiteral_4= Jobs ) | (enumLiteral_5= Steps ) | (enumLiteral_6= Runner ) | (enumLiteral_7= Secrets ) | (enumLiteral_8= Strategy ) | (enumLiteral_9= Matrix ) | (enumLiteral_10= Needs ) | (enumLiteral_11= Inputs ) )
            {
            // InternalGitHubActionsParser.g:2664:2: ( (enumLiteral_0= Github ) | (enumLiteral_1= Env ) | (enumLiteral_2= Vars ) | (enumLiteral_3= Job ) | (enumLiteral_4= Jobs ) | (enumLiteral_5= Steps ) | (enumLiteral_6= Runner ) | (enumLiteral_7= Secrets ) | (enumLiteral_8= Strategy ) | (enumLiteral_9= Matrix ) | (enumLiteral_10= Needs ) | (enumLiteral_11= Inputs ) )
            int alt71=12;
            switch ( input.LA(1) ) {
            case Github:
                {
                alt71=1;
                }
                break;
            case Env:
                {
                alt71=2;
                }
                break;
            case Vars:
                {
                alt71=3;
                }
                break;
            case Job:
                {
                alt71=4;
                }
                break;
            case Jobs:
                {
                alt71=5;
                }
                break;
            case Steps:
                {
                alt71=6;
                }
                break;
            case Runner:
                {
                alt71=7;
                }
                break;
            case Secrets:
                {
                alt71=8;
                }
                break;
            case Strategy:
                {
                alt71=9;
                }
                break;
            case Matrix:
                {
                alt71=10;
                }
                break;
            case Needs:
                {
                alt71=11;
                }
                break;
            case Inputs:
                {
                alt71=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalGitHubActionsParser.g:2665:3: (enumLiteral_0= Github )
                    {
                    // InternalGitHubActionsParser.g:2665:3: (enumLiteral_0= Github )
                    // InternalGitHubActionsParser.g:2666:4: enumLiteral_0= Github
                    {
                    enumLiteral_0=(Token)match(input,Github,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCONTEXTAccess().getGITHUBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCONTEXTAccess().getGITHUBEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGitHubActionsParser.g:2673:3: (enumLiteral_1= Env )
                    {
                    // InternalGitHubActionsParser.g:2673:3: (enumLiteral_1= Env )
                    // InternalGitHubActionsParser.g:2674:4: enumLiteral_1= Env
                    {
                    enumLiteral_1=(Token)match(input,Env,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCONTEXTAccess().getENVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCONTEXTAccess().getENVEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGitHubActionsParser.g:2681:3: (enumLiteral_2= Vars )
                    {
                    // InternalGitHubActionsParser.g:2681:3: (enumLiteral_2= Vars )
                    // InternalGitHubActionsParser.g:2682:4: enumLiteral_2= Vars
                    {
                    enumLiteral_2=(Token)match(input,Vars,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCONTEXTAccess().getVARSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getCONTEXTAccess().getVARSEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGitHubActionsParser.g:2689:3: (enumLiteral_3= Job )
                    {
                    // InternalGitHubActionsParser.g:2689:3: (enumLiteral_3= Job )
                    // InternalGitHubActionsParser.g:2690:4: enumLiteral_3= Job
                    {
                    enumLiteral_3=(Token)match(input,Job,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCONTEXTAccess().getJOBEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getCONTEXTAccess().getJOBEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGitHubActionsParser.g:2697:3: (enumLiteral_4= Jobs )
                    {
                    // InternalGitHubActionsParser.g:2697:3: (enumLiteral_4= Jobs )
                    // InternalGitHubActionsParser.g:2698:4: enumLiteral_4= Jobs
                    {
                    enumLiteral_4=(Token)match(input,Jobs,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCONTEXTAccess().getJOBSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getCONTEXTAccess().getJOBSEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalGitHubActionsParser.g:2705:3: (enumLiteral_5= Steps )
                    {
                    // InternalGitHubActionsParser.g:2705:3: (enumLiteral_5= Steps )
                    // InternalGitHubActionsParser.g:2706:4: enumLiteral_5= Steps
                    {
                    enumLiteral_5=(Token)match(input,Steps,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCONTEXTAccess().getSTEPSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getCONTEXTAccess().getSTEPSEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalGitHubActionsParser.g:2713:3: (enumLiteral_6= Runner )
                    {
                    // InternalGitHubActionsParser.g:2713:3: (enumLiteral_6= Runner )
                    // InternalGitHubActionsParser.g:2714:4: enumLiteral_6= Runner
                    {
                    enumLiteral_6=(Token)match(input,Runner,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCONTEXTAccess().getRUNNEREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getCONTEXTAccess().getRUNNEREnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalGitHubActionsParser.g:2721:3: (enumLiteral_7= Secrets )
                    {
                    // InternalGitHubActionsParser.g:2721:3: (enumLiteral_7= Secrets )
                    // InternalGitHubActionsParser.g:2722:4: enumLiteral_7= Secrets
                    {
                    enumLiteral_7=(Token)match(input,Secrets,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCONTEXTAccess().getSECRETSEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getCONTEXTAccess().getSECRETSEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalGitHubActionsParser.g:2729:3: (enumLiteral_8= Strategy )
                    {
                    // InternalGitHubActionsParser.g:2729:3: (enumLiteral_8= Strategy )
                    // InternalGitHubActionsParser.g:2730:4: enumLiteral_8= Strategy
                    {
                    enumLiteral_8=(Token)match(input,Strategy,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCONTEXTAccess().getSTRATEGYEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getCONTEXTAccess().getSTRATEGYEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalGitHubActionsParser.g:2737:3: (enumLiteral_9= Matrix )
                    {
                    // InternalGitHubActionsParser.g:2737:3: (enumLiteral_9= Matrix )
                    // InternalGitHubActionsParser.g:2738:4: enumLiteral_9= Matrix
                    {
                    enumLiteral_9=(Token)match(input,Matrix,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCONTEXTAccess().getMATRIXEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getCONTEXTAccess().getMATRIXEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalGitHubActionsParser.g:2745:3: (enumLiteral_10= Needs )
                    {
                    // InternalGitHubActionsParser.g:2745:3: (enumLiteral_10= Needs )
                    // InternalGitHubActionsParser.g:2746:4: enumLiteral_10= Needs
                    {
                    enumLiteral_10=(Token)match(input,Needs,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCONTEXTAccess().getNEEDSEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getCONTEXTAccess().getNEEDSEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalGitHubActionsParser.g:2753:3: (enumLiteral_11= Inputs )
                    {
                    // InternalGitHubActionsParser.g:2753:3: (enumLiteral_11= Inputs )
                    // InternalGitHubActionsParser.g:2754:4: enumLiteral_11= Inputs
                    {
                    enumLiteral_11=(Token)match(input,Inputs,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCONTEXTAccess().getINPUTSEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getCONTEXTAccess().getINPUTSEnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCONTEXT"

    // $ANTLR start synpred6_InternalGitHubActionsParser
    public final void synpred6_InternalGitHubActionsParser_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_WS_5=null;
        Token this_NEWLINE_7=null;
        Token this_WS_8=null;
        Token this_NEWLINE_9=null;
        EObject lv_name_6_0 = null;


        // InternalGitHubActionsParser.g:109:4: ( ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) ) )
        // InternalGitHubActionsParser.g:109:4: ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) )
        {
        // InternalGitHubActionsParser.g:109:4: ({...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) ) )
        // InternalGitHubActionsParser.g:110:5: {...}? => ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWorkflowAccess().getUnorderedGroup_1(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred6_InternalGitHubActionsParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getWorkflowAccess().getUnorderedGroup_1(), 0)");
        }
        // InternalGitHubActionsParser.g:110:105: ( ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) ) )
        // InternalGitHubActionsParser.g:111:6: ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getWorkflowAccess().getUnorderedGroup_1(), 0);
        // InternalGitHubActionsParser.g:114:9: ({...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* ) )
        // InternalGitHubActionsParser.g:114:10: {...}? => (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred6_InternalGitHubActionsParser", "true");
        }
        // InternalGitHubActionsParser.g:114:19: (otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )* )
        // InternalGitHubActionsParser.g:114:20: otherlv_3= Name otherlv_4= Colon (this_WS_5= RULE_WS )? ( (lv_name_6_0= ruleExpression ) ) this_NEWLINE_7= RULE_NEWLINE ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )*
        {
        otherlv_3=(Token)match(input,Name,FOLLOW_5); if (state.failed) return ;
        otherlv_4=(Token)match(input,Colon,FOLLOW_6); if (state.failed) return ;
        // InternalGitHubActionsParser.g:122:9: (this_WS_5= RULE_WS )?
        int alt74=2;
        int LA74_0 = input.LA(1);

        if ( (LA74_0==RULE_WS) ) {
            alt74=1;
        }
        switch (alt74) {
            case 1 :
                // InternalGitHubActionsParser.g:123:10: this_WS_5= RULE_WS
                {
                this_WS_5=(Token)match(input,RULE_WS,FOLLOW_6); if (state.failed) return ;

                }
                break;

        }

        // InternalGitHubActionsParser.g:128:9: ( (lv_name_6_0= ruleExpression ) )
        // InternalGitHubActionsParser.g:129:10: (lv_name_6_0= ruleExpression )
        {
        // InternalGitHubActionsParser.g:129:10: (lv_name_6_0= ruleExpression )
        // InternalGitHubActionsParser.g:130:11: lv_name_6_0= ruleExpression
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getWorkflowAccess().getNameExpressionParserRuleCall_1_0_3_0());
          										
        }
        pushFollow(FOLLOW_3);
        lv_name_6_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_NEWLINE_7=(Token)match(input,RULE_NEWLINE,FOLLOW_32); if (state.failed) return ;
        // InternalGitHubActionsParser.g:151:9: ( (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE )*
        loop76:
        do {
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=RULE_NEWLINE && LA76_0<=RULE_WS)) ) {
                alt76=1;
            }


            switch (alt76) {
        	case 1 :
        	    // InternalGitHubActionsParser.g:152:10: (this_WS_8= RULE_WS )? this_NEWLINE_9= RULE_NEWLINE
        	    {
        	    // InternalGitHubActionsParser.g:152:10: (this_WS_8= RULE_WS )?
        	    int alt75=2;
        	    int LA75_0 = input.LA(1);

        	    if ( (LA75_0==RULE_WS) ) {
        	        alt75=1;
        	    }
        	    switch (alt75) {
        	        case 1 :
        	            // InternalGitHubActionsParser.g:153:11: this_WS_8= RULE_WS
        	            {
        	            this_WS_8=(Token)match(input,RULE_WS,FOLLOW_3); if (state.failed) return ;

        	            }
        	            break;

        	    }

        	    this_NEWLINE_9=(Token)match(input,RULE_NEWLINE,FOLLOW_32); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop76;
            }
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalGitHubActionsParser

    // $ANTLR start synpred8_InternalGitHubActionsParser
    public final void synpred8_InternalGitHubActionsParser_fragment() throws RecognitionException {   
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_WS_12=null;
        EObject lv_runName_13_0 = null;


        // InternalGitHubActionsParser.g:169:4: ( ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) ) )
        // InternalGitHubActionsParser.g:169:4: ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) )
        {
        // InternalGitHubActionsParser.g:169:4: ({...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) ) )
        // InternalGitHubActionsParser.g:170:5: {...}? => ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWorkflowAccess().getUnorderedGroup_1(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalGitHubActionsParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getWorkflowAccess().getUnorderedGroup_1(), 1)");
        }
        // InternalGitHubActionsParser.g:170:105: ( ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) ) )
        // InternalGitHubActionsParser.g:171:6: ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getWorkflowAccess().getUnorderedGroup_1(), 1);
        // InternalGitHubActionsParser.g:174:9: ({...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) ) )
        // InternalGitHubActionsParser.g:174:10: {...}? => (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalGitHubActionsParser", "true");
        }
        // InternalGitHubActionsParser.g:174:19: (otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) ) )
        // InternalGitHubActionsParser.g:174:20: otherlv_10= RunName otherlv_11= Colon (this_WS_12= RULE_WS )? ( (lv_runName_13_0= ruleExpression ) )
        {
        otherlv_10=(Token)match(input,RunName,FOLLOW_5); if (state.failed) return ;
        otherlv_11=(Token)match(input,Colon,FOLLOW_6); if (state.failed) return ;
        // InternalGitHubActionsParser.g:182:9: (this_WS_12= RULE_WS )?
        int alt77=2;
        int LA77_0 = input.LA(1);

        if ( (LA77_0==RULE_WS) ) {
            alt77=1;
        }
        switch (alt77) {
            case 1 :
                // InternalGitHubActionsParser.g:183:10: this_WS_12= RULE_WS
                {
                this_WS_12=(Token)match(input,RULE_WS,FOLLOW_6); if (state.failed) return ;

                }
                break;

        }

        // InternalGitHubActionsParser.g:188:9: ( (lv_runName_13_0= ruleExpression ) )
        // InternalGitHubActionsParser.g:189:10: (lv_runName_13_0= ruleExpression )
        {
        // InternalGitHubActionsParser.g:189:10: (lv_runName_13_0= ruleExpression )
        // InternalGitHubActionsParser.g:190:11: lv_runName_13_0= ruleExpression
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getWorkflowAccess().getRunNameExpressionParserRuleCall_1_1_3_0());
          										
        }
        pushFollow(FOLLOW_2);
        lv_runName_13_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalGitHubActionsParser

    // Delegated rules

    public final boolean synpred6_InternalGitHubActionsParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalGitHubActionsParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalGitHubActionsParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalGitHubActionsParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000200000000002L,0x1800000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x5138000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000200000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0E20834540000000L,0x70380480D18A912CL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x1000004000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000002L,0x1000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000002L,0x1000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x1000000900000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x1000000900000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000002L,0x1001801400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x1001801400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000002L,0x0002220000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x1000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x1004000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x1000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x1000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x1000180000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});

}
