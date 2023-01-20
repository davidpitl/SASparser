grammar AbortStmt;
import CommonGrammar;
//import CommonLexerRules;

// TODO error con DATA
//  import CommonLexerRules; -> import CommonGrammar;


abort_main:
    (abort_stmt)* EOF
;

abort_stmt:
    ABORT (ABEND | CANCEL (file_spec)? | RETURN )? INT? NOLIST? ';'
;
 
file_spec: STRINGLITERAL ;


