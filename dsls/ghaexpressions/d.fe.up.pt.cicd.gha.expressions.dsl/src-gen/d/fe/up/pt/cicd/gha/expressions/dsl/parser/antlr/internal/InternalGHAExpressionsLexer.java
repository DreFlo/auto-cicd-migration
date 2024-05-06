package d.fe.up.pt.cicd.gha.expressions.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGHAExpressionsLexer extends Lexer {
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

    public InternalGHAExpressionsLexer() {;} 
    public InternalGHAExpressionsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGHAExpressionsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGHAExpressions.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGHAExpressions.g:11:7: ( '||' )
            // InternalGHAExpressions.g:11:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGHAExpressions.g:12:7: ( '&&' )
            // InternalGHAExpressions.g:12:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGHAExpressions.g:13:7: ( '!' )
            // InternalGHAExpressions.g:13:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGHAExpressions.g:14:7: ( '(' )
            // InternalGHAExpressions.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGHAExpressions.g:15:7: ( ')' )
            // InternalGHAExpressions.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGHAExpressions.g:16:7: ( ',' )
            // InternalGHAExpressions.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGHAExpressions.g:17:7: ( '>' )
            // InternalGHAExpressions.g:17:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGHAExpressions.g:18:7: ( '>=' )
            // InternalGHAExpressions.g:18:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGHAExpressions.g:19:7: ( '<' )
            // InternalGHAExpressions.g:19:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGHAExpressions.g:20:7: ( '<=' )
            // InternalGHAExpressions.g:20:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGHAExpressions.g:21:7: ( '==' )
            // InternalGHAExpressions.g:21:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGHAExpressions.g:22:7: ( '!=' )
            // InternalGHAExpressions.g:22:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_VARIABLE_REFERENCE"
    public final void mRULE_VARIABLE_REFERENCE() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE_REFERENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGHAExpressions.g:838:25: ( RULE_ID ( '.' RULE_ID | '[' ( RULE_ID | RULE_INT ) ']' )+ )
            // InternalGHAExpressions.g:838:27: RULE_ID ( '.' RULE_ID | '[' ( RULE_ID | RULE_INT ) ']' )+
            {
            mRULE_ID(); 
            // InternalGHAExpressions.g:838:35: ( '.' RULE_ID | '[' ( RULE_ID | RULE_INT ) ']' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='.') ) {
                    alt2=1;
                }
                else if ( (LA2_0=='[') ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGHAExpressions.g:838:36: '.' RULE_ID
            	    {
            	    match('.'); 
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGHAExpressions.g:838:48: '[' ( RULE_ID | RULE_INT ) ']'
            	    {
            	    match('['); 
            	    // InternalGHAExpressions.g:838:52: ( RULE_ID | RULE_INT )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='^' && LA1_0<='_')||(LA1_0>='a' && LA1_0<='z')) ) {
            	        alt1=1;
            	    }
            	    else if ( ((LA1_0>='0' && LA1_0<='9')) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalGHAExpressions.g:838:53: RULE_ID
            	            {
            	            mRULE_ID(); 

            	            }
            	            break;
            	        case 2 :
            	            // InternalGHAExpressions.g:838:61: RULE_INT
            	            {
            	            mRULE_INT(); 

            	            }
            	            break;

            	    }

            	    match(']'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARIABLE_REFERENCE"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGHAExpressions.g:840:13: ( RULE_INT '.' RULE_INT )
            // InternalGHAExpressions.g:840:15: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGHAExpressions.g:842:14: ( ( 'true' | 'false' ) )
            // InternalGHAExpressions.g:842:16: ( 'true' | 'false' )
            {
            // InternalGHAExpressions.g:842:16: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGHAExpressions.g:842:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalGHAExpressions.g:842:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGHAExpressions.g:844:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGHAExpressions.g:844:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGHAExpressions.g:844:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGHAExpressions.g:844:11: '^'
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

            // InternalGHAExpressions.g:844:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGHAExpressions.g:
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
            	    break loop5;
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
            // InternalGHAExpressions.g:846:10: ( ( '0' .. '9' )+ )
            // InternalGHAExpressions.g:846:12: ( '0' .. '9' )+
            {
            // InternalGHAExpressions.g:846:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGHAExpressions.g:846:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // InternalGHAExpressions.g:848:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGHAExpressions.g:848:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGHAExpressions.g:848:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGHAExpressions.g:848:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGHAExpressions.g:848:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalGHAExpressions.g:848:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGHAExpressions.g:848:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGHAExpressions.g:848:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGHAExpressions.g:848:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGHAExpressions.g:848:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGHAExpressions.g:848:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // InternalGHAExpressions.g:850:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGHAExpressions.g:850:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGHAExpressions.g:850:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGHAExpressions.g:850:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // InternalGHAExpressions.g:852:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGHAExpressions.g:852:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGHAExpressions.g:852:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGHAExpressions.g:852:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // InternalGHAExpressions.g:852:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGHAExpressions.g:852:41: ( '\\r' )? '\\n'
                    {
                    // InternalGHAExpressions.g:852:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGHAExpressions.g:852:41: '\\r'
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
            // InternalGHAExpressions.g:854:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGHAExpressions.g:854:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGHAExpressions.g:854:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGHAExpressions.g:
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalGHAExpressions.g:856:16: ( . )
            // InternalGHAExpressions.g:856:18: .
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
        // InternalGHAExpressions.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_VARIABLE_REFERENCE | RULE_DOUBLE | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=22;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalGHAExpressions.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalGHAExpressions.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalGHAExpressions.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalGHAExpressions.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalGHAExpressions.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalGHAExpressions.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalGHAExpressions.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalGHAExpressions.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalGHAExpressions.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalGHAExpressions.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalGHAExpressions.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalGHAExpressions.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalGHAExpressions.g:1:82: RULE_VARIABLE_REFERENCE
                {
                mRULE_VARIABLE_REFERENCE(); 

                }
                break;
            case 14 :
                // InternalGHAExpressions.g:1:106: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 15 :
                // InternalGHAExpressions.g:1:118: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 16 :
                // InternalGHAExpressions.g:1:131: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // InternalGHAExpressions.g:1:139: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // InternalGHAExpressions.g:1:148: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // InternalGHAExpressions.g:1:160: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // InternalGHAExpressions.g:1:176: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // InternalGHAExpressions.g:1:192: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // InternalGHAExpressions.g:1:200: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\2\23\1\27\3\uffff\1\34\1\36\2\23\1\42\1\45\2\42\3\23\16\uffff\2\42\1\uffff\1\42\2\uffff\1\45\1\uffff\1\42\4\uffff\2\42\1\61\1\42\1\uffff\1\61";
    static final String DFA15_eofS =
        "\63\uffff";
    static final String DFA15_minS =
        "\1\0\1\174\1\46\1\75\3\uffff\3\75\1\101\4\56\2\0\1\52\16\uffff\2\56\1\uffff\1\56\2\uffff\1\56\1\uffff\1\56\4\uffff\4\56\1\uffff\1\56";
    static final String DFA15_maxS =
        "\1\uffff\1\174\1\46\1\75\3\uffff\3\75\2\172\1\71\2\172\2\uffff\1\57\16\uffff\2\172\1\uffff\1\172\2\uffff\1\71\1\uffff\1\172\4\uffff\4\172\1\uffff\1\172";
    static final String DFA15_acceptS =
        "\4\uffff\1\4\1\5\1\6\13\uffff\1\25\1\26\1\1\1\2\1\14\1\3\1\4\1\5\1\6\1\10\1\7\1\12\1\11\1\13\2\uffff\1\20\1\uffff\1\15\1\21\1\uffff\1\16\1\uffff\1\22\1\23\1\24\1\25\4\uffff\1\17\1\uffff";
    static final String DFA15_specialS =
        "\1\2\16\uffff\1\0\1\1\42\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\3\1\17\3\23\1\2\1\20\1\4\1\5\2\23\1\6\2\23\1\21\12\14\2\23\1\10\1\11\1\7\2\23\32\16\3\23\1\12\1\16\1\23\5\16\1\15\15\16\1\13\6\16\1\23\1\1\uff83\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "",
            "",
            "",
            "\1\33",
            "\1\35",
            "\1\37",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\44\1\uffff\12\43\7\uffff\32\43\1\44\3\uffff\1\43\1\uffff\21\43\1\41\10\43",
            "\1\47\1\uffff\12\46",
            "\1\44\1\uffff\12\43\7\uffff\32\43\1\44\3\uffff\1\43\1\uffff\1\50\31\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\1\44\3\uffff\1\43\1\uffff\32\43",
            "\0\51",
            "\0\51",
            "\1\52\4\uffff\1\53",
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
            "",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\1\44\3\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\1\44\3\uffff\1\43\1\uffff\24\43\1\55\5\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\1\44\3\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\47\1\uffff\12\46",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\1\44\3\uffff\1\43\1\uffff\13\43\1\56\16\43",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\1\44\3\uffff\1\43\1\uffff\4\43\1\57\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\1\44\3\uffff\1\43\1\uffff\22\43\1\60\7\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\1\44\3\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\1\44\3\uffff\1\43\1\uffff\4\43\1\62\25\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\1\44\3\uffff\1\43\1\uffff\32\43"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_VARIABLE_REFERENCE | RULE_DOUBLE | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_15 = input.LA(1);

                        s = -1;
                        if ( ((LA15_15>='\u0000' && LA15_15<='\uFFFF')) ) {s = 41;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_16 = input.LA(1);

                        s = -1;
                        if ( ((LA15_16>='\u0000' && LA15_16<='\uFFFF')) ) {s = 41;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='|') ) {s = 1;}

                        else if ( (LA15_0=='&') ) {s = 2;}

                        else if ( (LA15_0=='!') ) {s = 3;}

                        else if ( (LA15_0=='(') ) {s = 4;}

                        else if ( (LA15_0==')') ) {s = 5;}

                        else if ( (LA15_0==',') ) {s = 6;}

                        else if ( (LA15_0=='>') ) {s = 7;}

                        else if ( (LA15_0=='<') ) {s = 8;}

                        else if ( (LA15_0=='=') ) {s = 9;}

                        else if ( (LA15_0=='^') ) {s = 10;}

                        else if ( (LA15_0=='t') ) {s = 11;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 12;}

                        else if ( (LA15_0=='f') ) {s = 13;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='e')||(LA15_0>='g' && LA15_0<='s')||(LA15_0>='u' && LA15_0<='z')) ) {s = 14;}

                        else if ( (LA15_0=='\"') ) {s = 15;}

                        else if ( (LA15_0=='\'') ) {s = 16;}

                        else if ( (LA15_0=='/') ) {s = 17;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 18;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='#' && LA15_0<='%')||(LA15_0>='*' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||(LA15_0>=':' && LA15_0<=';')||(LA15_0>='?' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||LA15_0=='{'||(LA15_0>='}' && LA15_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}