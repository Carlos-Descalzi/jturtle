// $ANTLR 3.4 /home/carlos/Proyectos/logojava/Logo.g 2012-11-18 18:28:15

package logo.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LogoLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int AND=4;
    public static final int CLOSE_BR=5;
    public static final int CLOSE_PAR=6;
    public static final int COLON=7;
    public static final int COMMA=8;
    public static final int DIV=9;
    public static final int DQUOTE=10;
    public static final int END=11;
    public static final int EOL=12;
    public static final int EQ=13;
    public static final int FLOAT=14;
    public static final int GE=15;
    public static final int GT=16;
    public static final int ID=17;
    public static final int IF=18;
    public static final int INT=19;
    public static final int LE=20;
    public static final int LT=21;
    public static final int MAKE=22;
    public static final int MINUS=23;
    public static final int MULT=24;
    public static final int NE=25;
    public static final int OPEN_BR=26;
    public static final int OPEN_PAR=27;
    public static final int OR=28;
    public static final int PLUS=29;
    public static final int REPEAT=30;
    public static final int SEMICOLON=31;
    public static final int STRING=32;
    public static final int TO=33;
    public static final int WS=34;
    public static final int XOR=35;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public LogoLexer() {} 
    public LogoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LogoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/carlos/Proyectos/logojava/Logo.g"; }

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:6:7: ( '{' )
            // /home/carlos/Proyectos/logojava/Logo.g:6:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:7:7: ( '}' )
            // /home/carlos/Proyectos/logojava/Logo.g:7:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:164:2: ( ':' )
            // /home/carlos/Proyectos/logojava/Logo.g:164:4: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:167:2: ( ';' )
            // /home/carlos/Proyectos/logojava/Logo.g:167:4: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:169:4: ( 'or' )
            // /home/carlos/Proyectos/logojava/Logo.g:169:6: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:171:5: ( 'and' )
            // /home/carlos/Proyectos/logojava/Logo.g:171:7: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:173:5: ( 'xor' )
            // /home/carlos/Proyectos/logojava/Logo.g:173:7: 'xor'
            {
            match("xor"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:175:4: ( 'if' )
            // /home/carlos/Proyectos/logojava/Logo.g:175:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "MAKE"
    public final void mMAKE() throws RecognitionException {
        try {
            int _type = MAKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:177:6: ( 'make' )
            // /home/carlos/Proyectos/logojava/Logo.g:177:8: 'make'
            {
            match("make"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAKE"

    // $ANTLR start "REPEAT"
    public final void mREPEAT() throws RecognitionException {
        try {
            int _type = REPEAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:179:8: ( 'repeat' )
            // /home/carlos/Proyectos/logojava/Logo.g:179:10: 'repeat'
            {
            match("repeat"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REPEAT"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:181:5: ( 'end' )
            // /home/carlos/Proyectos/logojava/Logo.g:181:7: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "DQUOTE"
    public final void mDQUOTE() throws RecognitionException {
        try {
            int _type = DQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:183:8: ( '\"' )
            // /home/carlos/Proyectos/logojava/Logo.g:183:10: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DQUOTE"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:185:4: ( 'to' )
            // /home/carlos/Proyectos/logojava/Logo.g:185:6: 'to'
            {
            match("to"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:187:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/carlos/Proyectos/logojava/Logo.g:187:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/carlos/Proyectos/logojava/Logo.g:187:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:190:5: ( ( '0' .. '9' )+ )
            // /home/carlos/Proyectos/logojava/Logo.g:190:7: ( '0' .. '9' )+
            {
            // /home/carlos/Proyectos/logojava/Logo.g:190:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:193:7: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // /home/carlos/Proyectos/logojava/Logo.g:193:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // /home/carlos/Proyectos/logojava/Logo.g:193:9: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            match('.'); 

            // /home/carlos/Proyectos/logojava/Logo.g:193:24: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:196:4: ( ( ' ' | '\\t' ) )
            // /home/carlos/Proyectos/logojava/Logo.g:196:9: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "EOL"
    public final void mEOL() throws RecognitionException {
        try {
            int _type = EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:199:5: ( ( '\\n' | '\\r' )+ )
            // /home/carlos/Proyectos/logojava/Logo.g:199:7: ( '\\n' | '\\r' )+
            {
            // /home/carlos/Proyectos/logojava/Logo.g:199:7: ( '\\n' | '\\r' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EOL"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:202:6: ( '\\'' (~ ( '\\\\' | '\\'' ) )* '\\'' )
            // /home/carlos/Proyectos/logojava/Logo.g:202:10: '\\'' (~ ( '\\\\' | '\\'' ) )* '\\''
            {
            match('\''); 

            // /home/carlos/Proyectos/logojava/Logo.g:202:15: (~ ( '\\\\' | '\\'' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\u0000' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/carlos/Proyectos/logojava/Logo.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:205:7: ( ',' )
            // /home/carlos/Proyectos/logojava/Logo.g:205:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "OPEN_PAR"
    public final void mOPEN_PAR() throws RecognitionException {
        try {
            int _type = OPEN_PAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:207:9: ( '(' )
            // /home/carlos/Proyectos/logojava/Logo.g:207:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_PAR"

    // $ANTLR start "CLOSE_PAR"
    public final void mCLOSE_PAR() throws RecognitionException {
        try {
            int _type = CLOSE_PAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:209:2: ( ')' )
            // /home/carlos/Proyectos/logojava/Logo.g:209:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_PAR"

    // $ANTLR start "OPEN_BR"
    public final void mOPEN_BR() throws RecognitionException {
        try {
            int _type = OPEN_BR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:210:9: ( '[' )
            // /home/carlos/Proyectos/logojava/Logo.g:210:11: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_BR"

    // $ANTLR start "CLOSE_BR"
    public final void mCLOSE_BR() throws RecognitionException {
        try {
            int _type = CLOSE_BR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:211:9: ( ']' )
            // /home/carlos/Proyectos/logojava/Logo.g:211:11: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_BR"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:212:4: ( '<' )
            // /home/carlos/Proyectos/logojava/Logo.g:212:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:213:4: ( '>' )
            // /home/carlos/Proyectos/logojava/Logo.g:213:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:214:4: ( '<=' )
            // /home/carlos/Proyectos/logojava/Logo.g:214:6: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:215:4: ( '>=' )
            // /home/carlos/Proyectos/logojava/Logo.g:215:6: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:216:4: ( '=' )
            // /home/carlos/Proyectos/logojava/Logo.g:216:6: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NE"
    public final void mNE() throws RecognitionException {
        try {
            int _type = NE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:217:4: ( '<>' )
            // /home/carlos/Proyectos/logojava/Logo.g:217:6: '<>'
            {
            match("<>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NE"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:218:6: ( '*' )
            // /home/carlos/Proyectos/logojava/Logo.g:218:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:219:5: ( '/' )
            // /home/carlos/Proyectos/logojava/Logo.g:219:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:220:6: ( '+' )
            // /home/carlos/Proyectos/logojava/Logo.g:220:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/carlos/Proyectos/logojava/Logo.g:221:7: ( '-' )
            // /home/carlos/Proyectos/logojava/Logo.g:221:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    public void mTokens() throws RecognitionException {
        // /home/carlos/Proyectos/logojava/Logo.g:1:8: ( T__36 | T__37 | COLON | SEMICOLON | OR | AND | XOR | IF | MAKE | REPEAT | END | DQUOTE | TO | ID | INT | FLOAT | WS | EOL | STRING | COMMA | OPEN_PAR | CLOSE_PAR | OPEN_BR | CLOSE_BR | LT | GT | LE | GE | EQ | NE | MULT | DIV | PLUS | MINUS )
        int alt7=34;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:10: T__36
                {
                mT__36(); 


                }
                break;
            case 2 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:16: T__37
                {
                mT__37(); 


                }
                break;
            case 3 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:22: COLON
                {
                mCOLON(); 


                }
                break;
            case 4 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:28: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 5 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:38: OR
                {
                mOR(); 


                }
                break;
            case 6 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:41: AND
                {
                mAND(); 


                }
                break;
            case 7 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:45: XOR
                {
                mXOR(); 


                }
                break;
            case 8 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:49: IF
                {
                mIF(); 


                }
                break;
            case 9 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:52: MAKE
                {
                mMAKE(); 


                }
                break;
            case 10 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:57: REPEAT
                {
                mREPEAT(); 


                }
                break;
            case 11 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:64: END
                {
                mEND(); 


                }
                break;
            case 12 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:68: DQUOTE
                {
                mDQUOTE(); 


                }
                break;
            case 13 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:75: TO
                {
                mTO(); 


                }
                break;
            case 14 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:78: ID
                {
                mID(); 


                }
                break;
            case 15 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:81: INT
                {
                mINT(); 


                }
                break;
            case 16 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:85: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 17 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:91: WS
                {
                mWS(); 


                }
                break;
            case 18 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:94: EOL
                {
                mEOL(); 


                }
                break;
            case 19 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:98: STRING
                {
                mSTRING(); 


                }
                break;
            case 20 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:105: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 21 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:111: OPEN_PAR
                {
                mOPEN_PAR(); 


                }
                break;
            case 22 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:120: CLOSE_PAR
                {
                mCLOSE_PAR(); 


                }
                break;
            case 23 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:130: OPEN_BR
                {
                mOPEN_BR(); 


                }
                break;
            case 24 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:138: CLOSE_BR
                {
                mCLOSE_BR(); 


                }
                break;
            case 25 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:147: LT
                {
                mLT(); 


                }
                break;
            case 26 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:150: GT
                {
                mGT(); 


                }
                break;
            case 27 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:153: LE
                {
                mLE(); 


                }
                break;
            case 28 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:156: GE
                {
                mGE(); 


                }
                break;
            case 29 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:159: EQ
                {
                mEQ(); 


                }
                break;
            case 30 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:162: NE
                {
                mNE(); 


                }
                break;
            case 31 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:165: MULT
                {
                mMULT(); 


                }
                break;
            case 32 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:170: DIV
                {
                mDIV(); 


                }
                break;
            case 33 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:174: PLUS
                {
                mPLUS(); 


                }
                break;
            case 34 :
                // /home/carlos/Proyectos/logojava/Logo.g:1:179: MINUS
                {
                mMINUS(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\5\uffff\7\16\1\uffff\1\16\1\uffff\1\47\10\uffff\1\53\1\55\5\uffff"+
        "\1\56\2\16\1\61\3\16\1\65\10\uffff\1\66\1\67\1\uffff\2\16\1\72\3"+
        "\uffff\1\73\1\16\2\uffff\1\16\1\76\1\uffff";
    static final String DFA7_eofS =
        "\77\uffff";
    static final String DFA7_minS =
        "\1\11\4\uffff\1\162\1\156\1\157\1\146\1\141\1\145\1\156\1\uffff"+
        "\1\157\1\uffff\1\56\10\uffff\2\75\5\uffff\1\60\1\144\1\162\1\60"+
        "\1\153\1\160\1\144\1\60\10\uffff\2\60\1\uffff\2\145\1\60\3\uffff"+
        "\1\60\1\141\2\uffff\1\164\1\60\1\uffff";
    static final String DFA7_maxS =
        "\1\175\4\uffff\1\162\1\156\1\157\1\146\1\141\1\145\1\156\1\uffff"+
        "\1\157\1\uffff\1\71\10\uffff\1\76\1\75\5\uffff\1\172\1\144\1\162"+
        "\1\172\1\153\1\160\1\144\1\172\10\uffff\2\172\1\uffff\2\145\1\172"+
        "\3\uffff\1\172\1\141\2\uffff\1\164\1\172\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\7\uffff\1\14\1\uffff\1\16\1\uffff\1\21"+
        "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\2\uffff\1\35\1\37\1\40\1\41"+
        "\1\42\10\uffff\1\17\1\20\1\33\1\36\1\31\1\34\1\32\1\5\2\uffff\1"+
        "\10\3\uffff\1\15\1\6\1\7\2\uffff\1\13\1\11\2\uffff\1\12";
    static final String DFA7_specialS =
        "\77\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\20\1\21\2\uffff\1\21\22\uffff\1\20\1\uffff\1\14\4\uffff\1"+
            "\22\1\24\1\25\1\33\1\35\1\23\1\36\1\uffff\1\34\12\17\1\3\1\4"+
            "\1\30\1\32\1\31\2\uffff\32\16\1\26\1\uffff\1\27\1\uffff\1\16"+
            "\1\uffff\1\6\3\16\1\13\3\16\1\10\3\16\1\11\1\16\1\5\2\16\1\12"+
            "\1\16\1\15\3\16\1\7\2\16\1\1\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "",
            "\1\46",
            "",
            "\1\50\1\uffff\12\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51\1\52",
            "\1\54",
            "",
            "",
            "",
            "",
            "",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\57",
            "\1\60",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\62",
            "\1\63",
            "\1\64",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\70",
            "\1\71",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "",
            "",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\74",
            "",
            "",
            "\1\75",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__36 | T__37 | COLON | SEMICOLON | OR | AND | XOR | IF | MAKE | REPEAT | END | DQUOTE | TO | ID | INT | FLOAT | WS | EOL | STRING | COMMA | OPEN_PAR | CLOSE_PAR | OPEN_BR | CLOSE_BR | LT | GT | LE | GE | EQ | NE | MULT | DIV | PLUS | MINUS );";
        }
    }
 

}