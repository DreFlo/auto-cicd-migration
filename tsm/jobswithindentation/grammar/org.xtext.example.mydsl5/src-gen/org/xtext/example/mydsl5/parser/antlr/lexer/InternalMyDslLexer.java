package org.xtext.example.mydsl5.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int Command_1=17;
    public static final int RULE_BEGIN=44;
    public static final int True=34;
    public static final int False=27;
    public static final int Name=30;
    public static final int Name3=23;
    public static final int Name5=24;
    public static final int Input=28;
    public static final int Trigger=16;
    public static final int LeftParenthesis=38;
    public static final int Name1=22;
    public static final int Tool=33;
    public static final int Pipeline_envirnonment=5;
    public static final int Parameters=11;
    public static final int RULE_ID=46;
    public static final int Ifelse=20;
    public static final int RightParenthesis=39;
    public static final int RULE_INT=47;
    public static final int Value=26;
    public static final int RULE_ML_COMMENT=49;
    public static final int Environment=9;
    public static final int Depends=18;
    public static final int If=37;
    public static final int Key=36;
    public static final int RULE_END=45;
    public static final int RULE_STRING=48;
    public static final int Tool_framework_job=6;
    public static final int Ifthenelse=12;
    public static final int RULE_SL_COMMENT=50;
    public static final int Tool_framework=8;
    public static final int Elseif=19;
    public static final int Comma=40;
    public static final int When_1=35;
    public static final int Jobs=29;
    public static final int Output=21;
    public static final int Colon=41;
    public static final int RightCurlyBracket=43;
    public static final int EOF=-1;
    public static final int Pipeline_tool_framework=4;
    public static final int Condition=13;
    public static final int RULE_WS=51;
    public static final int LeftCurlyBracket=42;
    public static final int RULE_ANY_OTHER=52;
    public static final int Artifact=14;
    public static final int Allow_faillure=7;
    public static final int When=31;
    public static final int Timer=25;
    public static final int Command=15;
    public static final int Else=32;
    public static final int IfThenElse=10;

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

    // $ANTLR start "Tool_framework"
    public final void mTool_framework() throws RecognitionException {
        try {
            int _type = Tool_framework;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:22:16: ( 'Tool_framework' )
            // InternalMyDslLexer.g:22:18: 'Tool_framework'
            {
            match("Tool_framework"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tool_framework"

    // $ANTLR start "Environment"
    public final void mEnvironment() throws RecognitionException {
        try {
            int _type = Environment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:24:13: ( 'Environment' )
            // InternalMyDslLexer.g:24:15: 'Environment'
            {
            match("Environment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Environment"

    // $ANTLR start "IfThenElse"
    public final void mIfThenElse() throws RecognitionException {
        try {
            int _type = IfThenElse;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:26:12: ( 'IfThenElse' )
            // InternalMyDslLexer.g:26:14: 'IfThenElse'
            {
            match("IfThenElse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IfThenElse"

    // $ANTLR start "Parameters"
    public final void mParameters() throws RecognitionException {
        try {
            int _type = Parameters;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:28:12: ( 'Parameters' )
            // InternalMyDslLexer.g:28:14: 'Parameters'
            {
            match("Parameters"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parameters"

    // $ANTLR start "Ifthenelse"
    public final void mIfthenelse() throws RecognitionException {
        try {
            int _type = Ifthenelse;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:30:12: ( 'ifthenelse' )
            // InternalMyDslLexer.g:30:14: 'ifthenelse'
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
            // InternalMyDslLexer.g:32:11: ( 'Condition' )
            // InternalMyDslLexer.g:32:13: 'Condition'
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
            // InternalMyDslLexer.g:34:10: ( 'Artifact' )
            // InternalMyDslLexer.g:34:12: 'Artifact'
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

    // $ANTLR start "Command"
    public final void mCommand() throws RecognitionException {
        try {
            int _type = Command;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:36:9: ( 'Command' )
            // InternalMyDslLexer.g:36:11: 'Command'
            {
            match("Command"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Command"

    // $ANTLR start "Trigger"
    public final void mTrigger() throws RecognitionException {
        try {
            int _type = Trigger;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:38:9: ( 'Trigger' )
            // InternalMyDslLexer.g:38:11: 'Trigger'
            {
            match("Trigger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Trigger"

    // $ANTLR start "Command_1"
    public final void mCommand_1() throws RecognitionException {
        try {
            int _type = Command_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:40:11: ( 'command' )
            // InternalMyDslLexer.g:40:13: 'command'
            {
            match("command"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Command_1"

    // $ANTLR start "Depends"
    public final void mDepends() throws RecognitionException {
        try {
            int _type = Depends;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:42:9: ( 'depends' )
            // InternalMyDslLexer.g:42:11: 'depends'
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

    // $ANTLR start "Elseif"
    public final void mElseif() throws RecognitionException {
        try {
            int _type = Elseif;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:44:8: ( 'elseif' )
            // InternalMyDslLexer.g:44:10: 'elseif'
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
            // InternalMyDslLexer.g:46:8: ( 'ifelse' )
            // InternalMyDslLexer.g:46:10: 'ifelse'
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
            // InternalMyDslLexer.g:48:8: ( 'output' )
            // InternalMyDslLexer.g:48:10: 'output'
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

    // $ANTLR start "Name1"
    public final void mName1() throws RecognitionException {
        try {
            int _type = Name1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:50:7: ( 'Name1' )
            // InternalMyDslLexer.g:50:9: 'Name1'
            {
            match("Name1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name1"

    // $ANTLR start "Name3"
    public final void mName3() throws RecognitionException {
        try {
            int _type = Name3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:52:7: ( 'Name3' )
            // InternalMyDslLexer.g:52:9: 'Name3'
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

    // $ANTLR start "Name5"
    public final void mName5() throws RecognitionException {
        try {
            int _type = Name5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:54:7: ( 'Name5' )
            // InternalMyDslLexer.g:54:9: 'Name5'
            {
            match("Name5"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name5"

    // $ANTLR start "Timer"
    public final void mTimer() throws RecognitionException {
        try {
            int _type = Timer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:56:7: ( 'Timer' )
            // InternalMyDslLexer.g:56:9: 'Timer'
            {
            match("Timer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Timer"

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:58:7: ( 'Value' )
            // InternalMyDslLexer.g:58:9: 'Value'
            {
            match("Value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:60:7: ( 'false' )
            // InternalMyDslLexer.g:60:9: 'false'
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
            // InternalMyDslLexer.g:62:7: ( 'input' )
            // InternalMyDslLexer.g:62:9: 'input'
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
            // InternalMyDslLexer.g:64:6: ( 'jobs:' )
            // InternalMyDslLexer.g:64:8: 'jobs:'
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

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:66:6: ( 'name:' )
            // InternalMyDslLexer.g:66:8: 'name:'
            {
            match("name:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name"

    // $ANTLR start "When"
    public final void mWhen() throws RecognitionException {
        try {
            int _type = When;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:68:6: ( 'When' )
            // InternalMyDslLexer.g:68:8: 'When'
            {
            match("When"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "When"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:70:6: ( 'else' )
            // InternalMyDslLexer.g:70:8: 'else'
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

    // $ANTLR start "Tool"
    public final void mTool() throws RecognitionException {
        try {
            int _type = Tool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:72:6: ( 'tool' )
            // InternalMyDslLexer.g:72:8: 'tool'
            {
            match("tool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tool"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:74:6: ( 'true' )
            // InternalMyDslLexer.g:74:8: 'true'
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

    // $ANTLR start "When_1"
    public final void mWhen_1() throws RecognitionException {
        try {
            int _type = When_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:76:8: ( 'when' )
            // InternalMyDslLexer.g:76:10: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "When_1"

    // $ANTLR start "Key"
    public final void mKey() throws RecognitionException {
        try {
            int _type = Key;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:78:5: ( 'Key' )
            // InternalMyDslLexer.g:78:7: 'Key'
            {
            match("Key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Key"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDslLexer.g:80:4: ( 'if' )
            // InternalMyDslLexer.g:80:6: 'if'
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
            // InternalMyDslLexer.g:82:17: ( '(' )
            // InternalMyDslLexer.g:82:19: '('
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
            // InternalMyDslLexer.g:84:18: ( ')' )
            // InternalMyDslLexer.g:84:20: ')'
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
            // InternalMyDslLexer.g:86:7: ( ',' )
            // InternalMyDslLexer.g:86:9: ','
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
            // InternalMyDslLexer.g:88:7: ( ':' )
            // InternalMyDslLexer.g:88:9: ':'
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
            // InternalMyDslLexer.g:90:18: ( '{' )
            // InternalMyDslLexer.g:90:20: '{'
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
            // InternalMyDslLexer.g:92:19: ( '}' )
            // InternalMyDslLexer.g:92:21: '}'
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

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalMyDslLexer.g:94:21: ()
            // InternalMyDslLexer.g:94:23: 
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
            // InternalMyDslLexer.g:96:19: ()
            // InternalMyDslLexer.g:96:21: 
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
            // InternalMyDslLexer.g:98:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDslLexer.g:98:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDslLexer.g:98:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDslLexer.g:98:11: '^'
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

            // InternalMyDslLexer.g:98:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    break loop2;
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
            // InternalMyDslLexer.g:100:10: ( ( '0' .. '9' )+ )
            // InternalMyDslLexer.g:100:12: ( '0' .. '9' )+
            {
            // InternalMyDslLexer.g:100:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDslLexer.g:100:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // InternalMyDslLexer.g:102:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDslLexer.g:102:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDslLexer.g:102:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDslLexer.g:102:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDslLexer.g:102:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDslLexer.g:102:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDslLexer.g:102:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDslLexer.g:102:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDslLexer.g:102:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDslLexer.g:102:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDslLexer.g:102:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // InternalMyDslLexer.g:104:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDslLexer.g:104:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDslLexer.g:104:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDslLexer.g:104:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalMyDslLexer.g:106:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDslLexer.g:106:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDslLexer.g:106:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDslLexer.g:106:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalMyDslLexer.g:106:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDslLexer.g:106:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDslLexer.g:106:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDslLexer.g:106:41: '\\r'
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
            // InternalMyDslLexer.g:108:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDslLexer.g:108:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDslLexer.g:108:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalMyDslLexer.g:110:16: ( . )
            // InternalMyDslLexer.g:110:18: .
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
        // InternalMyDslLexer.g:1:8: ( Pipeline_tool_framework | Pipeline_envirnonment | Tool_framework_job | Allow_faillure | Tool_framework | Environment | IfThenElse | Parameters | Ifthenelse | Condition | Artifact | Command | Trigger | Command_1 | Depends | Elseif | Ifelse | Output | Name1 | Name3 | Name5 | Timer | Value | False | Input | Jobs | Name | When | Else | Tool | True | When_1 | Key | If | LeftParenthesis | RightParenthesis | Comma | Colon | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=47;
        alt12 = dfa12.predict(input);
        switch (alt12) {
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
                // InternalMyDslLexer.g:1:90: Tool_framework
                {
                mTool_framework(); 

                }
                break;
            case 6 :
                // InternalMyDslLexer.g:1:105: Environment
                {
                mEnvironment(); 

                }
                break;
            case 7 :
                // InternalMyDslLexer.g:1:117: IfThenElse
                {
                mIfThenElse(); 

                }
                break;
            case 8 :
                // InternalMyDslLexer.g:1:128: Parameters
                {
                mParameters(); 

                }
                break;
            case 9 :
                // InternalMyDslLexer.g:1:139: Ifthenelse
                {
                mIfthenelse(); 

                }
                break;
            case 10 :
                // InternalMyDslLexer.g:1:150: Condition
                {
                mCondition(); 

                }
                break;
            case 11 :
                // InternalMyDslLexer.g:1:160: Artifact
                {
                mArtifact(); 

                }
                break;
            case 12 :
                // InternalMyDslLexer.g:1:169: Command
                {
                mCommand(); 

                }
                break;
            case 13 :
                // InternalMyDslLexer.g:1:177: Trigger
                {
                mTrigger(); 

                }
                break;
            case 14 :
                // InternalMyDslLexer.g:1:185: Command_1
                {
                mCommand_1(); 

                }
                break;
            case 15 :
                // InternalMyDslLexer.g:1:195: Depends
                {
                mDepends(); 

                }
                break;
            case 16 :
                // InternalMyDslLexer.g:1:203: Elseif
                {
                mElseif(); 

                }
                break;
            case 17 :
                // InternalMyDslLexer.g:1:210: Ifelse
                {
                mIfelse(); 

                }
                break;
            case 18 :
                // InternalMyDslLexer.g:1:217: Output
                {
                mOutput(); 

                }
                break;
            case 19 :
                // InternalMyDslLexer.g:1:224: Name1
                {
                mName1(); 

                }
                break;
            case 20 :
                // InternalMyDslLexer.g:1:230: Name3
                {
                mName3(); 

                }
                break;
            case 21 :
                // InternalMyDslLexer.g:1:236: Name5
                {
                mName5(); 

                }
                break;
            case 22 :
                // InternalMyDslLexer.g:1:242: Timer
                {
                mTimer(); 

                }
                break;
            case 23 :
                // InternalMyDslLexer.g:1:248: Value
                {
                mValue(); 

                }
                break;
            case 24 :
                // InternalMyDslLexer.g:1:254: False
                {
                mFalse(); 

                }
                break;
            case 25 :
                // InternalMyDslLexer.g:1:260: Input
                {
                mInput(); 

                }
                break;
            case 26 :
                // InternalMyDslLexer.g:1:266: Jobs
                {
                mJobs(); 

                }
                break;
            case 27 :
                // InternalMyDslLexer.g:1:271: Name
                {
                mName(); 

                }
                break;
            case 28 :
                // InternalMyDslLexer.g:1:276: When
                {
                mWhen(); 

                }
                break;
            case 29 :
                // InternalMyDslLexer.g:1:281: Else
                {
                mElse(); 

                }
                break;
            case 30 :
                // InternalMyDslLexer.g:1:286: Tool
                {
                mTool(); 

                }
                break;
            case 31 :
                // InternalMyDslLexer.g:1:291: True
                {
                mTrue(); 

                }
                break;
            case 32 :
                // InternalMyDslLexer.g:1:296: When_1
                {
                mWhen_1(); 

                }
                break;
            case 33 :
                // InternalMyDslLexer.g:1:303: Key
                {
                mKey(); 

                }
                break;
            case 34 :
                // InternalMyDslLexer.g:1:307: If
                {
                mIf(); 

                }
                break;
            case 35 :
                // InternalMyDslLexer.g:1:310: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 36 :
                // InternalMyDslLexer.g:1:326: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 37 :
                // InternalMyDslLexer.g:1:343: Comma
                {
                mComma(); 

                }
                break;
            case 38 :
                // InternalMyDslLexer.g:1:349: Colon
                {
                mColon(); 

                }
                break;
            case 39 :
                // InternalMyDslLexer.g:1:355: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 40 :
                // InternalMyDslLexer.g:1:372: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 41 :
                // InternalMyDslLexer.g:1:390: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 42 :
                // InternalMyDslLexer.g:1:398: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 43 :
                // InternalMyDslLexer.g:1:407: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 44 :
                // InternalMyDslLexer.g:1:419: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 45 :
                // InternalMyDslLexer.g:1:435: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 46 :
                // InternalMyDslLexer.g:1:451: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 47 :
                // InternalMyDslLexer.g:1:459: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\25\45\6\uffff\1\43\2\uffff\3\43\2\uffff\1\45\1\uffff\12\45\1\127\16\45\13\uffff\15\45\1\uffff\16\45\1\u0082\1\45\1\u0085\1\u0086\17\45\1\u0097\6\45\1\u00a0\1\u00a1\1\uffff\2\45\2\uffff\4\45\1\u00a8\5\45\1\u00ae\5\45\1\uffff\1\45\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\4\uffff\6\45\1\uffff\4\45\1\u00c4\1\uffff\4\45\1\u00c9\1\u00ca\5\uffff\5\45\1\u00d0\4\45\1\uffff\1\45\1\u00d6\1\u00d7\1\u00d8\2\uffff\3\45\1\u00dc\1\45\1\uffff\5\45\3\uffff\3\45\1\uffff\5\45\1\u00ec\6\45\1\u00f3\1\u00f4\1\u00f5\1\uffff\5\45\1\u00fb\3\uffff\5\45\1\uffff\10\45\1\u0109\1\u010a\3\45\2\uffff\10\45\1\u0116\2\45\1\uffff\3\45\1\u011c\1\45\1\uffff\1\u011e\1\uffff";
    static final String DFA12_eofS =
        "\u011f\uffff";
    static final String DFA12_minS =
        "\1\0\1\151\1\157\1\154\1\151\1\156\1\146\1\141\1\146\2\157\1\145\1\154\1\165\3\141\1\157\1\141\2\150\1\145\6\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\160\1\uffff\1\157\1\165\1\154\1\164\1\157\1\151\1\155\1\166\1\124\1\162\1\60\1\160\2\155\1\160\1\163\1\164\1\155\2\154\1\142\1\155\2\145\1\171\13\uffff\1\145\1\154\1\145\1\157\1\151\1\154\1\147\1\145\1\151\1\150\1\141\1\150\1\154\1\uffff\1\165\1\144\2\155\2\145\1\160\1\145\1\165\2\163\1\145\2\156\1\60\1\154\2\60\1\167\1\146\1\137\1\147\2\162\1\145\1\155\1\145\1\163\1\164\1\151\2\141\1\156\1\60\1\165\1\61\2\145\2\72\2\60\1\uffff\1\151\1\146\2\uffff\1\137\1\141\1\146\1\145\1\60\1\157\1\156\1\145\1\156\1\145\1\60\1\164\2\156\1\144\1\146\1\uffff\1\164\5\60\4\uffff\1\156\1\162\1\146\1\143\2\162\1\uffff\1\156\1\105\1\164\1\145\1\60\1\uffff\1\151\2\144\1\163\2\60\5\uffff\1\145\2\141\1\164\1\141\1\60\1\155\1\154\1\145\1\154\1\uffff\1\157\3\60\2\uffff\1\137\1\155\1\151\1\60\1\155\1\uffff\1\145\1\163\1\162\1\163\1\156\3\uffff\2\145\1\154\1\uffff\1\145\1\156\1\145\1\163\1\145\1\60\1\157\1\156\1\167\1\154\1\167\1\164\3\60\1\uffff\1\157\1\166\1\157\1\165\1\157\1\60\3\uffff\1\154\1\151\3\162\1\uffff\1\137\1\162\1\153\1\145\1\153\1\146\1\156\1\137\2\60\1\162\1\157\1\152\2\uffff\1\141\1\156\1\157\2\155\1\142\2\145\1\60\1\167\1\156\1\uffff\1\157\1\164\1\162\1\60\1\153\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\151\3\162\1\156\1\146\1\141\1\156\2\157\1\145\1\154\1\165\3\141\1\157\1\141\2\150\1\145\6\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\160\1\uffff\1\157\1\165\1\154\1\164\1\157\1\151\1\155\1\166\1\124\1\162\1\172\1\160\1\156\1\155\1\160\1\163\1\164\1\155\2\154\1\142\1\155\2\145\1\171\13\uffff\1\145\1\154\1\145\1\157\1\151\1\154\1\147\1\145\1\151\1\150\1\141\1\150\1\154\1\uffff\1\165\1\144\2\155\2\145\1\160\1\145\1\165\2\163\1\145\2\156\1\172\1\154\2\172\1\167\1\146\1\137\1\147\2\162\1\145\1\155\1\145\1\163\1\164\1\151\2\141\1\156\1\172\1\165\1\65\2\145\2\72\2\172\1\uffff\1\151\1\146\2\uffff\1\137\1\141\1\146\1\145\1\172\1\157\1\156\1\145\1\156\1\145\1\172\1\164\2\156\1\144\1\146\1\uffff\1\164\5\172\4\uffff\1\156\1\162\1\146\1\143\2\162\1\uffff\1\156\1\105\1\164\1\145\1\172\1\uffff\1\151\2\144\1\163\2\172\5\uffff\1\145\2\141\1\164\1\141\1\172\1\155\1\154\1\145\1\154\1\uffff\1\157\3\172\2\uffff\1\137\1\155\1\151\1\172\1\155\1\uffff\1\145\1\163\1\162\1\163\1\156\3\uffff\1\164\1\145\1\154\1\uffff\1\145\1\156\1\145\1\163\1\145\1\172\1\157\1\156\1\167\1\154\1\167\1\164\3\172\1\uffff\1\157\1\166\1\157\1\165\1\157\1\172\3\uffff\1\154\1\151\3\162\1\uffff\1\137\1\162\1\153\1\145\1\153\1\146\1\156\1\137\2\172\1\162\1\157\1\152\2\uffff\1\141\1\156\1\157\2\155\1\142\2\145\1\172\1\167\1\156\1\uffff\1\157\1\164\1\162\1\172\1\153\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\26\uffff\1\43\1\44\1\45\1\46\1\47\1\50\1\uffff\1\51\1\52\3\uffff\1\56\1\57\1\uffff\1\51\31\uffff\1\43\1\44\1\45\1\46\1\47\1\50\1\52\1\53\1\54\1\55\1\56\15\uffff\1\42\52\uffff\1\41\2\uffff\1\36\1\37\20\uffff\1\35\6\uffff\1\32\1\33\1\34\1\40\6\uffff\1\26\5\uffff\1\31\6\uffff\1\23\1\24\1\25\1\27\1\30\12\uffff\1\21\4\uffff\1\20\1\22\5\uffff\1\15\5\uffff\1\14\1\16\1\17\3\uffff\1\13\17\uffff\1\12\6\uffff\1\7\1\10\1\11\5\uffff\1\6\15\uffff\1\4\1\5\13\uffff\1\3\5\uffff\1\2\1\uffff\1\1";
    static final String DFA12_specialS =
        "\1\0\36\uffff\1\2\1\1\u00fe\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\43\1\37\4\43\1\40\1\26\1\27\2\43\1\30\2\43\1\41\12\36\1\31\6\43\1\3\1\35\1\11\1\35\1\5\3\35\1\6\1\35\1\25\2\35\1\16\1\35\1\7\3\35\1\4\1\35\1\17\1\23\3\35\3\43\1\34\1\35\1\43\2\35\1\12\1\13\1\14\1\20\2\35\1\10\1\21\3\35\1\22\1\15\1\1\3\35\1\2\2\35\1\24\3\35\1\32\1\43\1\33\uff82\43",
            "\1\44",
            "\1\46\2\uffff\1\47",
            "\1\50\5\uffff\1\51",
            "\1\54\5\uffff\1\52\2\uffff\1\53",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60\7\uffff\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\0\106",
            "\0\106",
            "\1\107\4\uffff\1\110",
            "",
            "",
            "\1\112",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\126\16\45\1\125\6\45",
            "\1\130",
            "\1\132\1\131",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0083",
            "\12\45\7\uffff\32\45\4\uffff\1\u0084\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0087",
            "\1\u0088",
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
            "\1\u0094",
            "\1\u0095",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\u0096\21\45",
            "\1\u0098",
            "\1\u0099\1\uffff\1\u009a\1\uffff\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00dd",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "",
            "",
            "\1\u00e4\16\uffff\1\u00e3",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "",
            "",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0117",
            "\1\u0118",
            "",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u011d",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Pipeline_tool_framework | Pipeline_envirnonment | Tool_framework_job | Allow_faillure | Tool_framework | Environment | IfThenElse | Parameters | Ifthenelse | Condition | Artifact | Command | Trigger | Command_1 | Depends | Elseif | Ifelse | Output | Name1 | Name3 | Name5 | Timer | Value | False | Input | Jobs | Name | When | Else | Tool | True | When_1 | Key | If | LeftParenthesis | RightParenthesis | Comma | Colon | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='p') ) {s = 1;}

                        else if ( (LA12_0=='t') ) {s = 2;}

                        else if ( (LA12_0=='A') ) {s = 3;}

                        else if ( (LA12_0=='T') ) {s = 4;}

                        else if ( (LA12_0=='E') ) {s = 5;}

                        else if ( (LA12_0=='I') ) {s = 6;}

                        else if ( (LA12_0=='P') ) {s = 7;}

                        else if ( (LA12_0=='i') ) {s = 8;}

                        else if ( (LA12_0=='C') ) {s = 9;}

                        else if ( (LA12_0=='c') ) {s = 10;}

                        else if ( (LA12_0=='d') ) {s = 11;}

                        else if ( (LA12_0=='e') ) {s = 12;}

                        else if ( (LA12_0=='o') ) {s = 13;}

                        else if ( (LA12_0=='N') ) {s = 14;}

                        else if ( (LA12_0=='V') ) {s = 15;}

                        else if ( (LA12_0=='f') ) {s = 16;}

                        else if ( (LA12_0=='j') ) {s = 17;}

                        else if ( (LA12_0=='n') ) {s = 18;}

                        else if ( (LA12_0=='W') ) {s = 19;}

                        else if ( (LA12_0=='w') ) {s = 20;}

                        else if ( (LA12_0=='K') ) {s = 21;}

                        else if ( (LA12_0=='(') ) {s = 22;}

                        else if ( (LA12_0==')') ) {s = 23;}

                        else if ( (LA12_0==',') ) {s = 24;}

                        else if ( (LA12_0==':') ) {s = 25;}

                        else if ( (LA12_0=='{') ) {s = 26;}

                        else if ( (LA12_0=='}') ) {s = 27;}

                        else if ( (LA12_0=='^') ) {s = 28;}

                        else if ( (LA12_0=='B'||LA12_0=='D'||(LA12_0>='F' && LA12_0<='H')||LA12_0=='J'||(LA12_0>='L' && LA12_0<='M')||LA12_0=='O'||(LA12_0>='Q' && LA12_0<='S')||LA12_0=='U'||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='b')||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='k' && LA12_0<='m')||(LA12_0>='q' && LA12_0<='s')||(LA12_0>='u' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 29;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 30;}

                        else if ( (LA12_0=='\"') ) {s = 31;}

                        else if ( (LA12_0=='\'') ) {s = 32;}

                        else if ( (LA12_0=='/') ) {s = 33;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 34;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_32 = input.LA(1);

                        s = -1;
                        if ( ((LA12_32>='\u0000' && LA12_32<='\uFFFF')) ) {s = 70;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFF')) ) {s = 70;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}