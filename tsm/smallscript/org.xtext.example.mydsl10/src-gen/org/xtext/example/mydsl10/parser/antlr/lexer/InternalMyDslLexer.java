package org.xtext.example.mydsl10.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_BEGIN=37;
    public static final int True=27;
    public static final int False=21;
    public static final int Name=20;
    public static final int Name3=19;
    public static final int Input=22;
    public static final int LeftParenthesis=30;
    public static final int Pipeline_envirnonment=5;
    public static final int RULE_ID=39;
    public static final int Ifelse=15;
    public static final int RightParenthesis=31;
    public static final int RULE_INT=40;
    public static final int RULE_ML_COMMENT=42;
    public static final int Depends=12;
    public static final int Name_2=11;
    public static final int If=29;
    public static final int Name_1=24;
    public static final int Steps=18;
    public static final int RULE_END=38;
    public static final int RULE_STRING=41;
    public static final int Env=26;
    public static final int Tool_framework_job=6;
    public static final int Ifthenelse=8;
    public static final int RULE_SL_COMMENT=43;
    public static final int Elseif=14;
    public static final int Comma=32;
    public static final int Jobs=23;
    public static final int Output=16;
    public static final int RULE_TRIGGERS=36;
    public static final int Colon=33;
    public static final int RightCurlyBracket=35;
    public static final int EOF=-1;
    public static final int Pipeline_tool_framework=4;
    public static final int Condition=9;
    public static final int RULE_WS=44;
    public static final int Run_1=17;
    public static final int LeftCurlyBracket=34;
    public static final int Run=13;
    public static final int RULE_ANY_OTHER=45;
    public static final int Artifact=10;
    public static final int Allow_faillure=7;
    public static final int Else=25;
    public static final int On=28;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDslLexer.g"; }

    // $ANTLR start "Pipeline_tool_framework"
    public final void mPipeline_tool_framework() throws RecognitionException {
        try {
            int _type = Pipeline_tool_framework;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:14:25: ( 'pipeline_tool_framework' )
            // InternalMyDslLexer.g:14:27: 'pipeline_tool_framework'
            {
            match("pipeline_tool_framework"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pipeline_tool_framework"

    // $ANTLR start "Pipeline_envirnonment"
    public final void mPipeline_envirnonment() throws RecognitionException {
        try {
            int _type = Pipeline_envirnonment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:16:23: ( 'pipeline_envirnonment' )
            // InternalMyDslLexer.g:16:25: 'pipeline_envirnonment'
            {
            match("pipeline_envirnonment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pipeline_envirnonment"

    // $ANTLR start "Tool_framework_job"
    public final void mTool_framework_job() throws RecognitionException {
        try {
            int _type = Tool_framework_job;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:18:20: ( 'tool_framework_job' )
            // InternalMyDslLexer.g:18:22: 'tool_framework_job'
            {
            match("tool_framework_job"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tool_framework_job"

    // $ANTLR start "Allow_faillure"
    public final void mAllow_faillure() throws RecognitionException {
        try {
            int _type = Allow_faillure;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:20:16: ( 'Allow_faillure' )
            // InternalMyDslLexer.g:20:18: 'Allow_faillure'
            {
            match("Allow_faillure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Allow_faillure"

    // $ANTLR start "Ifthenelse"
    public final void mIfthenelse() throws RecognitionException {
        try {
            int _type = Ifthenelse;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:22:12: ( 'ifthenelse' )
            // InternalMyDslLexer.g:22:14: 'ifthenelse'
            {
            match("ifthenelse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ifthenelse"

    // $ANTLR start "Condition"
    public final void mCondition() throws RecognitionException {
        try {
            int _type = Condition;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:24:11: ( 'Condition' )
            // InternalMyDslLexer.g:24:13: 'Condition'
            {
            match("Condition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Condition"

    // $ANTLR start "Artifact"
    public final void mArtifact() throws RecognitionException {
        try {
            int _type = Artifact;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:26:10: ( 'Artifact' )
            // InternalMyDslLexer.g:26:12: 'Artifact'
            {
            match("Artifact"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Artifact"

    // $ANTLR start "Name_2"
    public final void mName_2() throws RecognitionException {
        try {
            int _type = Name_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:28:8: ( '- name:' )
            // InternalMyDslLexer.g:28:10: '- name:'
            {
            match("- name:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name_2"

    // $ANTLR start "Depends"
    public final void mDepends() throws RecognitionException {
        try {
            int _type = Depends;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:30:9: ( 'depends' )
            // InternalMyDslLexer.g:30:11: 'depends'
            {
            match("depends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Depends"

    // $ANTLR start "Run"
    public final void mRun() throws RecognitionException {
        try {
            int _type = Run;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:32:5: ( '- run:' )
            // InternalMyDslLexer.g:32:7: '- run:'
            {
            match("- run:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Run"

    // $ANTLR start "Elseif"
    public final void mElseif() throws RecognitionException {
        try {
            int _type = Elseif;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:34:8: ( 'elseif' )
            // InternalMyDslLexer.g:34:10: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Elseif"

    // $ANTLR start "Ifelse"
    public final void mIfelse() throws RecognitionException {
        try {
            int _type = Ifelse;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:36:8: ( 'ifelse' )
            // InternalMyDslLexer.g:36:10: 'ifelse'
            {
            match("ifelse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ifelse"

    // $ANTLR start "Output"
    public final void mOutput() throws RecognitionException {
        try {
            int _type = Output;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:38:8: ( 'output' )
            // InternalMyDslLexer.g:38:10: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Output"

    // $ANTLR start "Run_1"
    public final void mRun_1() throws RecognitionException {
        try {
            int _type = Run_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:40:7: ( 'run: |' )
            // InternalMyDslLexer.g:40:9: 'run: |'
            {
            match("run: |"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Run_1"

    // $ANTLR start "Steps"
    public final void mSteps() throws RecognitionException {
        try {
            int _type = Steps;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:42:7: ( 'steps:' )
            // InternalMyDslLexer.g:42:9: 'steps:'
            {
            match("steps:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Steps"

    // $ANTLR start "Name3"
    public final void mName3() throws RecognitionException {
        try {
            int _type = Name3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:44:7: ( 'Name3' )
            // InternalMyDslLexer.g:44:9: 'Name3'
            {
            match("Name3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name3"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:46:6: ( 'Name:' )
            // InternalMyDslLexer.g:46:8: 'Name:'
            {
            match("Name:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:48:7: ( 'false' )
            // InternalMyDslLexer.g:48:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Input"
    public final void mInput() throws RecognitionException {
        try {
            int _type = Input;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:50:7: ( 'input' )
            // InternalMyDslLexer.g:50:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Input"

    // $ANTLR start "Jobs"
    public final void mJobs() throws RecognitionException {
        try {
            int _type = Jobs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:52:6: ( 'jobs:' )
            // InternalMyDslLexer.g:52:8: 'jobs:'
            {
            match("jobs:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Jobs"

    // $ANTLR start "Name_1"
    public final void mName_1() throws RecognitionException {
        try {
            int _type = Name_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:54:8: ( 'name:' )
            // InternalMyDslLexer.g:54:10: 'name:'
            {
            match("name:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name_1"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:56:6: ( 'else' )
            // InternalMyDslLexer.g:56:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Env"
    public final void mEnv() throws RecognitionException {
        try {
            int _type = Env;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:58:5: ( 'env:' )
            // InternalMyDslLexer.g:58:7: 'env:'
            {
            match("env:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Env"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:60:6: ( 'true' )
            // InternalMyDslLexer.g:60:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "On"
    public final void mOn() throws RecognitionException {
        try {
            int _type = On;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:62:4: ( 'on:' )
            // InternalMyDslLexer.g:62:6: 'on:'
            {
            match("on:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "On"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:64:4: ( 'if' )
            // InternalMyDslLexer.g:64:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:66:17: ( '(' )
            // InternalMyDslLexer.g:66:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:68:18: ( ')' )
            // InternalMyDslLexer.g:68:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:70:7: ( ',' )
            // InternalMyDslLexer.g:70:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:72:7: ( ':' )
            // InternalMyDslLexer.g:72:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:74:18: ( '{' )
            // InternalMyDslLexer.g:74:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:76:19: ( '}' )
            // InternalMyDslLexer.g:76:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_TRIGGERS"
    public final void mRULE_TRIGGERS() throws RecognitionException {
        try {
            int _type = RULE_TRIGGERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:78:15: ( ( 'push' | 'pull_request' | 'check_suite' | 'create' | 'delete' | 'deployment' | 'deployment_status' | 'discussion' | 'fork' | 'gollum' | 'issue_comment' ) )
            // InternalMyDslLexer.g:78:17: ( 'push' | 'pull_request' | 'check_suite' | 'create' | 'delete' | 'deployment' | 'deployment_status' | 'discussion' | 'fork' | 'gollum' | 'issue_comment' )
            {
            // InternalMyDslLexer.g:78:17: ( 'push' | 'pull_request' | 'check_suite' | 'create' | 'delete' | 'deployment' | 'deployment_status' | 'discussion' | 'fork' | 'gollum' | 'issue_comment' )
            int alt1=11;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMyDslLexer.g:78:18: 'push'
                    {
                    match("push"); 


                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:78:25: 'pull_request'
                    {
                    match("pull_request"); 


                    }
                    break;
                case 3 :
                    // InternalMyDslLexer.g:78:40: 'check_suite'
                    {
                    match("check_suite"); 


                    }
                    break;
                case 4 :
                    // InternalMyDslLexer.g:78:54: 'create'
                    {
                    match("create"); 


                    }
                    break;
                case 5 :
                    // InternalMyDslLexer.g:78:63: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 6 :
                    // InternalMyDslLexer.g:78:72: 'deployment'
                    {
                    match("deployment"); 


                    }
                    break;
                case 7 :
                    // InternalMyDslLexer.g:78:85: 'deployment_status'
                    {
                    match("deployment_status"); 


                    }
                    break;
                case 8 :
                    // InternalMyDslLexer.g:78:105: 'discussion'
                    {
                    match("discussion"); 


                    }
                    break;
                case 9 :
                    // InternalMyDslLexer.g:78:118: 'fork'
                    {
                    match("fork"); 


                    }
                    break;
                case 10 :
                    // InternalMyDslLexer.g:78:125: 'gollum'
                    {
                    match("gollum"); 


                    }
                    break;
                case 11 :
                    // InternalMyDslLexer.g:78:134: 'issue_comment'
                    {
                    match("issue_comment"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRIGGERS"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalMyDslLexer.g:80:21: ()
            // InternalMyDslLexer.g:80:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalMyDslLexer.g:82:19: ()
            // InternalMyDslLexer.g:82:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:84:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDslLexer.g:84:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDslLexer.g:84:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDslLexer.g:84:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDslLexer.g:84:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDslLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:86:10: ( ( '0' .. '9' )+ )
            // InternalMyDslLexer.g:86:12: ( '0' .. '9' )+
            {
            // InternalMyDslLexer.g:86:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDslLexer.g:86:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:88:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDslLexer.g:88:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDslLexer.g:88:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDslLexer.g:88:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDslLexer.g:88:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDslLexer.g:88:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDslLexer.g:88:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:88:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDslLexer.g:88:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDslLexer.g:88:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDslLexer.g:88:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:90:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDslLexer.g:90:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDslLexer.g:90:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDslLexer.g:90:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:92:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDslLexer.g:92:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDslLexer.g:92:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDslLexer.g:92:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalMyDslLexer.g:92:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDslLexer.g:92:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDslLexer.g:92:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMyDslLexer.g:92:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:94:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDslLexer.g:94:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDslLexer.g:94:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDslLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:96:16: ( . )
            // InternalMyDslLexer.g:96:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDslLexer.g:1:8: ( Pipeline_tool_framework | Pipeline_envirnonment | Tool_framework_job | Allow_faillure | Ifthenelse | Condition | Artifact | Name_2 | Depends | Run | Elseif | Ifelse | Output | Run_1 | Steps | Name3 | Name | False | Input | Jobs | Name_1 | Else | Env | True | On | If | LeftParenthesis | RightParenthesis | Comma | Colon | LeftCurlyBracket | RightCurlyBracket | RULE_TRIGGERS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=40;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalMyDslLexer.g:1:10: Pipeline_tool_framework
                {
                mPipeline_tool_framework(); 

                }
                break;
            case 2 :
                // InternalMyDslLexer.g:1:34: Pipeline_envirnonment
                {
                mPipeline_envirnonment(); 

                }
                break;
            case 3 :
                // InternalMyDslLexer.g:1:56: Tool_framework_job
                {
                mTool_framework_job(); 

                }
                break;
            case 4 :
                // InternalMyDslLexer.g:1:75: Allow_faillure
                {
                mAllow_faillure(); 

                }
                break;
            case 5 :
                // InternalMyDslLexer.g:1:90: Ifthenelse
                {
                mIfthenelse(); 

                }
                break;
            case 6 :
                // InternalMyDslLexer.g:1:101: Condition
                {
                mCondition(); 

                }
                break;
            case 7 :
                // InternalMyDslLexer.g:1:111: Artifact
                {
                mArtifact(); 

                }
                break;
            case 8 :
                // InternalMyDslLexer.g:1:120: Name_2
                {
                mName_2(); 

                }
                break;
            case 9 :
                // InternalMyDslLexer.g:1:127: Depends
                {
                mDepends(); 

                }
                break;
            case 10 :
                // InternalMyDslLexer.g:1:135: Run
                {
                mRun(); 

                }
                break;
            case 11 :
                // InternalMyDslLexer.g:1:139: Elseif
                {
                mElseif(); 

                }
                break;
            case 12 :
                // InternalMyDslLexer.g:1:146: Ifelse
                {
                mIfelse(); 

                }
                break;
            case 13 :
                // InternalMyDslLexer.g:1:153: Output
                {
                mOutput(); 

                }
                break;
            case 14 :
                // InternalMyDslLexer.g:1:160: Run_1
                {
                mRun_1(); 

                }
                break;
            case 15 :
                // InternalMyDslLexer.g:1:166: Steps
                {
                mSteps(); 

                }
                break;
            case 16 :
                // InternalMyDslLexer.g:1:172: Name3
                {
                mName3(); 

                }
                break;
            case 17 :
                // InternalMyDslLexer.g:1:178: Name
                {
                mName(); 

                }
                break;
            case 18 :
                // InternalMyDslLexer.g:1:183: False
                {
                mFalse(); 

                }
                break;
            case 19 :
                // InternalMyDslLexer.g:1:189: Input
                {
                mInput(); 

                }
                break;
            case 20 :
                // InternalMyDslLexer.g:1:195: Jobs
                {
                mJobs(); 

                }
                break;
            case 21 :
                // InternalMyDslLexer.g:1:200: Name_1
                {
                mName_1(); 

                }
                break;
            case 22 :
                // InternalMyDslLexer.g:1:207: Else
                {
                mElse(); 

                }
                break;
            case 23 :
                // InternalMyDslLexer.g:1:212: Env
                {
                mEnv(); 

                }
                break;
            case 24 :
                // InternalMyDslLexer.g:1:216: True
                {
                mTrue(); 

                }
                break;
            case 25 :
                // InternalMyDslLexer.g:1:221: On
                {
                mOn(); 

                }
                break;
            case 26 :
                // InternalMyDslLexer.g:1:224: If
                {
                mIf(); 

                }
                break;
            case 27 :
                // InternalMyDslLexer.g:1:227: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 28 :
                // InternalMyDslLexer.g:1:243: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 29 :
                // InternalMyDslLexer.g:1:260: Comma
                {
                mComma(); 

                }
                break;
            case 30 :
                // InternalMyDslLexer.g:1:266: Colon
                {
                mColon(); 

                }
                break;
            case 31 :
                // InternalMyDslLexer.g:1:272: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 32 :
                // InternalMyDslLexer.g:1:289: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 33 :
                // InternalMyDslLexer.g:1:307: RULE_TRIGGERS
                {
                mRULE_TRIGGERS(); 

                }
                break;
            case 34 :
                // InternalMyDslLexer.g:1:321: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalMyDslLexer.g:1:329: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalMyDslLexer.g:1:338: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalMyDslLexer.g:1:350: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalMyDslLexer.g:1:366: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalMyDslLexer.g:1:382: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalMyDslLexer.g:1:390: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA1_eotS =
        "\26\uffff\1\30\2\uffff";
    static final String DFA1_eofS =
        "\31\uffff";
    static final String DFA1_minS =
        "\1\143\1\165\1\150\1\145\3\uffff\1\154\2\uffff\1\154\4\uffff\1\154\1\157\1\171\1\155\1\145\1\156\1\164\1\137\2\uffff";
    static final String DFA1_maxS =
        "\1\160\1\165\1\162\1\151\3\uffff\1\163\2\uffff\1\160\4\uffff\1\154\1\157\1\171\1\155\1\145\1\156\1\164\1\137\2\uffff";
    static final String DFA1_acceptS =
        "\4\uffff\1\11\1\12\1\13\1\uffff\1\3\1\4\1\uffff\1\10\1\1\1\2\1\5\10\uffff\1\7\1\6";
    static final String DFA1_specialS =
        "\31\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\3\1\uffff\1\4\1\5\1\uffff\1\6\6\uffff\1\1",
            "\1\7",
            "\1\10\11\uffff\1\11",
            "\1\12\3\uffff\1\13",
            "",
            "",
            "",
            "\1\15\6\uffff\1\14",
            "",
            "",
            "\1\16\3\uffff\1\17",
            "",
            "",
            "",
            "",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "78:17: ( 'push' | 'pull_request' | 'check_suite' | 'create' | 'delete' | 'deployment' | 'deployment_status' | 'discussion' | 'fork' | 'gollum' | 'issue_comment' )";
        }
    }
    static final String DFA13_eotS =
        "\1\uffff\5\42\1\37\11\42\6\uffff\2\42\1\37\2\uffff\3\37\2\uffff\2\42\1\uffff\4\42\1\120\3\42\1\uffff\15\42\6\uffff\3\42\5\uffff\11\42\1\uffff\3\42\2\uffff\6\42\1\uffff\13\42\1\u0085\2\42\1\u0088\13\42\1\u0095\1\uffff\1\42\1\uffff\3\42\1\u0085\6\42\1\uffff\2\42\1\uffff\4\42\1\u00a7\7\42\1\uffff\2\42\1\u00b1\1\uffff\1\u00b2\2\uffff\11\42\1\u00bc\1\uffff\4\42\1\u0085\1\42\1\u00c2\1\u00c3\3\uffff\1\42\2\u0085\6\42\1\uffff\2\42\1\u00cd\2\42\2\uffff\5\42\1\u00d5\3\42\1\uffff\7\42\1\uffff\2\42\1\u00e3\10\42\1\u00ec\1\42\1\uffff\2\u0085\6\42\1\uffff\2\42\1\u0085\2\42\1\u0085\10\42\1\u0085\4\42\1\u0105\4\42\1\uffff\10\42\1\u0085\2\42\1\u0114\2\42\1\uffff\3\42\1\u011a\1\42\1\uffff\1\u011c\1\uffff";
    static final String DFA13_eofS =
        "\u011d\uffff";
    static final String DFA13_minS =
        "\1\0\1\151\1\157\1\154\1\146\1\157\1\40\1\145\1\154\1\156\1\165\1\164\2\141\1\157\1\141\6\uffff\1\150\1\157\1\101\2\uffff\2\0\1\52\2\uffff\1\160\1\154\1\uffff\1\157\1\165\1\154\1\164\1\60\1\160\1\163\2\156\1\154\2\163\1\166\1\164\1\72\1\156\1\145\1\155\1\154\1\162\1\142\1\155\6\uffff\2\145\1\154\5\uffff\1\145\1\150\2\154\1\145\1\157\1\151\1\150\1\154\1\uffff\2\165\1\144\2\uffff\2\145\1\143\1\145\1\72\1\160\1\uffff\1\72\1\160\1\145\1\163\1\153\1\163\1\145\1\143\1\141\2\154\1\60\2\137\1\60\1\167\1\146\1\145\1\163\1\164\1\145\1\151\1\156\1\157\1\164\1\165\1\60\1\uffff\1\165\1\uffff\1\163\1\63\1\145\1\60\2\72\1\153\1\164\1\165\1\151\1\uffff\1\162\1\146\1\uffff\1\137\1\141\1\156\1\145\1\60\1\137\1\164\1\144\1\171\1\145\1\163\1\146\1\uffff\1\164\1\72\1\60\1\uffff\1\60\2\uffff\1\137\1\145\1\155\1\156\1\145\1\162\1\146\1\143\1\145\1\60\1\uffff\1\143\1\151\1\163\1\155\1\60\1\163\2\60\3\uffff\1\163\2\60\1\145\1\161\2\141\1\164\1\154\1\uffff\2\157\1\60\1\145\1\151\2\uffff\1\165\1\137\1\165\1\155\1\151\1\60\1\163\1\155\1\156\1\uffff\1\156\1\157\1\151\3\145\1\154\1\uffff\1\145\1\155\1\60\1\164\1\156\1\164\1\157\1\156\1\163\1\167\1\154\1\60\1\145\1\uffff\2\60\1\145\1\157\1\166\1\164\1\157\1\165\1\uffff\1\156\1\163\1\60\1\154\1\151\1\60\2\162\2\164\1\137\1\162\1\153\1\145\1\60\1\141\1\146\1\156\1\137\1\60\1\164\1\162\1\157\1\152\1\uffff\1\165\1\141\1\156\1\157\1\163\2\155\1\142\1\60\2\145\1\60\1\167\1\156\1\uffff\1\157\1\164\1\162\1\60\1\153\1\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\165\2\162\1\163\1\157\1\40\1\151\1\156\2\165\1\164\1\141\2\157\1\141\6\uffff\1\162\1\157\1\172\2\uffff\2\uffff\1\57\2\uffff\1\160\1\163\1\uffff\1\157\1\165\1\154\1\164\1\172\1\160\1\163\1\156\1\162\1\160\2\163\1\166\1\164\1\72\1\156\1\145\1\155\1\154\1\162\1\142\1\155\6\uffff\2\145\1\154\5\uffff\1\145\1\150\2\154\1\145\1\157\1\151\1\150\1\154\1\uffff\2\165\1\144\2\uffff\1\154\1\145\1\143\1\145\1\72\1\160\1\uffff\1\72\1\160\1\145\1\163\1\153\1\163\1\145\1\143\1\141\2\154\1\172\2\137\1\172\1\167\1\146\1\145\1\163\1\164\1\145\1\151\1\156\1\157\1\164\1\165\1\172\1\uffff\1\165\1\uffff\1\163\1\72\1\145\1\172\2\72\1\153\1\164\1\165\1\151\1\uffff\1\162\1\146\1\uffff\1\137\1\141\1\156\1\145\1\172\1\137\1\164\1\144\1\171\1\145\1\163\1\146\1\uffff\1\164\1\72\1\172\1\uffff\1\172\2\uffff\1\137\1\145\1\155\1\156\1\145\1\162\1\146\1\143\1\145\1\172\1\uffff\1\143\1\151\1\163\1\155\1\172\1\163\2\172\3\uffff\1\163\2\172\1\145\1\161\2\141\1\164\1\154\1\uffff\2\157\1\172\1\145\1\151\2\uffff\1\165\1\137\1\165\1\155\1\151\1\172\1\163\1\155\1\156\1\uffff\1\156\1\157\1\151\1\164\2\145\1\154\1\uffff\1\145\1\155\1\172\1\164\1\156\1\164\1\157\1\156\1\163\1\167\1\154\1\172\1\145\1\uffff\2\172\1\145\1\157\1\166\1\164\1\157\1\165\1\uffff\1\156\1\163\1\172\1\154\1\151\1\172\2\162\2\164\1\137\1\162\1\153\1\145\1\172\1\141\1\146\1\156\1\137\1\172\1\164\1\162\1\157\1\152\1\uffff\1\165\1\141\1\156\1\157\1\163\2\155\1\142\1\172\2\145\1\172\1\167\1\156\1\uffff\1\157\1\164\1\162\1\172\1\153\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\20\uffff\1\33\1\34\1\35\1\36\1\37\1\40\3\uffff\1\42\1\43\3\uffff\1\47\1\50\2\uffff\1\42\26\uffff\1\33\1\34\1\35\1\36\1\37\1\40\3\uffff\1\43\1\44\1\45\1\46\1\47\11\uffff\1\32\3\uffff\1\10\1\12\6\uffff\1\31\33\uffff\1\27\1\uffff\1\16\12\uffff\1\41\2\uffff\1\30\14\uffff\1\26\3\uffff\1\21\1\uffff\1\24\1\25\12\uffff\1\23\10\uffff\1\17\1\20\1\22\11\uffff\1\14\5\uffff\1\13\1\15\11\uffff\1\11\7\uffff\1\7\15\uffff\1\6\10\uffff\1\5\30\uffff\1\4\16\uffff\1\3\5\uffff\1\2\1\uffff\1\1";
    static final String DFA13_specialS =
        "\1\2\32\uffff\1\0\1\1\u0100\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\4\37\1\34\1\20\1\21\2\37\1\22\1\6\1\37\1\35\12\32\1\23\6\37\1\3\1\31\1\5\12\31\1\14\14\31\3\37\1\30\1\31\1\37\2\31\1\26\1\7\1\10\1\15\1\27\1\31\1\4\1\16\3\31\1\17\1\11\1\1\1\31\1\12\1\13\1\2\6\31\1\24\1\37\1\25\uff82\37",
            "\1\40\13\uffff\1\41",
            "\1\43\2\uffff\1\44",
            "\1\45\5\uffff\1\46",
            "\1\47\7\uffff\1\50\4\uffff\1\51",
            "\1\52",
            "\1\53",
            "\1\54\3\uffff\1\55",
            "\1\56\1\uffff\1\57",
            "\1\61\6\uffff\1\60",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65\15\uffff\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\77\11\uffff\1\100",
            "\1\101",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\0\103",
            "\0\103",
            "\1\104\4\uffff\1\105",
            "",
            "",
            "\1\107",
            "\1\111\6\uffff\1\110",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\117\16\42\1\116\6\42",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124\3\uffff\1\125",
            "\1\127\3\uffff\1\126",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "",
            "",
            "",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "",
            "\1\163\6\uffff\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0086",
            "\1\u0087",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\u0094\21\42",
            "",
            "\1\u0096",
            "",
            "\1\u0097",
            "\1\u0098\6\uffff\1\u0099",
            "\1\u009a",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00c1",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\u00c4",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dd\16\uffff\1\u00dc",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "\1\u00e2",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00ed",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\u00ee\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00f7",
            "\1\u00f8",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0112",
            "\1\u0113",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0115",
            "\1\u0116",
            "",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u011b",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Pipeline_tool_framework | Pipeline_envirnonment | Tool_framework_job | Allow_faillure | Ifthenelse | Condition | Artifact | Name_2 | Depends | Run | Elseif | Ifelse | Output | Run_1 | Steps | Name3 | Name | False | Input | Jobs | Name_1 | Else | Env | True | On | If | LeftParenthesis | RightParenthesis | Comma | Colon | LeftCurlyBracket | RightCurlyBracket | RULE_TRIGGERS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_27 = input.LA(1);

                        s = -1;
                        if ( ((LA13_27>='\u0000' && LA13_27<='\uFFFF')) ) {s = 67;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_28 = input.LA(1);

                        s = -1;
                        if ( ((LA13_28>='\u0000' && LA13_28<='\uFFFF')) ) {s = 67;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='p') ) {s = 1;}

                        else if ( (LA13_0=='t') ) {s = 2;}

                        else if ( (LA13_0=='A') ) {s = 3;}

                        else if ( (LA13_0=='i') ) {s = 4;}

                        else if ( (LA13_0=='C') ) {s = 5;}

                        else if ( (LA13_0=='-') ) {s = 6;}

                        else if ( (LA13_0=='d') ) {s = 7;}

                        else if ( (LA13_0=='e') ) {s = 8;}

                        else if ( (LA13_0=='o') ) {s = 9;}

                        else if ( (LA13_0=='r') ) {s = 10;}

                        else if ( (LA13_0=='s') ) {s = 11;}

                        else if ( (LA13_0=='N') ) {s = 12;}

                        else if ( (LA13_0=='f') ) {s = 13;}

                        else if ( (LA13_0=='j') ) {s = 14;}

                        else if ( (LA13_0=='n') ) {s = 15;}

                        else if ( (LA13_0=='(') ) {s = 16;}

                        else if ( (LA13_0==')') ) {s = 17;}

                        else if ( (LA13_0==',') ) {s = 18;}

                        else if ( (LA13_0==':') ) {s = 19;}

                        else if ( (LA13_0=='{') ) {s = 20;}

                        else if ( (LA13_0=='}') ) {s = 21;}

                        else if ( (LA13_0=='c') ) {s = 22;}

                        else if ( (LA13_0=='g') ) {s = 23;}

                        else if ( (LA13_0=='^') ) {s = 24;}

                        else if ( (LA13_0=='B'||(LA13_0>='D' && LA13_0<='M')||(LA13_0>='O' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='b')||LA13_0=='h'||(LA13_0>='k' && LA13_0<='m')||LA13_0=='q'||(LA13_0>='u' && LA13_0<='z')) ) {s = 25;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 26;}

                        else if ( (LA13_0=='\"') ) {s = 27;}

                        else if ( (LA13_0=='\'') ) {s = 28;}

                        else if ( (LA13_0=='/') ) {s = 29;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 30;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='+')||LA13_0=='.'||(LA13_0>=';' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}