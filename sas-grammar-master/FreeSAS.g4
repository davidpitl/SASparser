grammar FreeSAS;

import CommonGrammar,
    ProcStmt, ArrayStmt, AssignmentStmt, AbortStmt,
    ByStmt, CallStmt, DataStmt, DatalinesStmt, DropStmt, InfileStmt, InputStmt, MeansProc,
    DataStmt, SqlProc, ImportProc, LibnameStmt, FilenameStmt, RunStmt, LengthStmt,
    CommonFunctions;

parse:
    (sas_stmt_list)* EOF
;

sas_stmt_list:
 abort_stmt
 | array_stmt
 | by_stmt
 | call_stmt
 | datalines_stmt
 | datalines4_stmt
 | delete_stmt
 | drop_stmt
 | if_stmt
 | if_then_else_stmt
 | infile_stmt
 | input_stmt
 | put_stmt
 | means_proc
 | proc_stmt
 // chg
 | libname_stmt
 | filename_stmt
 | data_stmt
 | length_stmt
 | do_stmt
 // assign must go last
 | assign_stmt
 | run_stmt
;

// IF statement
if_stmt:
    IF expression ';'
;

if_then_else_stmt:
    IF expression THEN sas_stmt_list (ELSE sas_stmt_list)?
;

// DELETE statement
delete_stmt: DELETE ';';


// DO statement
do_stmt:
    DO index_variable '=' index_variable_specification (index_variable_specification)*';'
        (sas_stmt_list)*
    END ';'
;

index_variable:
    variable
;

index_variable_specification:
    start (TO stop)*
    //(TO stop)* (BY increment)* (WHILE'('expression')' | UNTIL'('expression')')*
    // start <TO stop> <BY increment> <WHILE(expression) | UNTIL(expression)>
;

start: INT|sas_function;
stop: sas_function; //INT|
increment: INT|sas_function;
