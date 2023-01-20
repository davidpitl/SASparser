grammar ImportProc;
import CommonGrammar ;

/*
PROC IMPORT
DATAFILE="filename" | TABLE="tablename"
OUT=<libref.>SAS data-set <(SAS data-set-options)>
<DBMS=identifier><REPLACE> ;
<data-source-statement(s);>
*/
import_main:
(import_proc)* EOF
;
 
import_proc:
    datafile_stmt+
    out_statement+
    dbms_statement*
    //datasource_statement*
;

datafile_stmt:
(DATAFILE '=' filename|TABLE '=' tablename) ';'
;

out_statement:
(
OUT '=' variable ';'
);

dbms_statement:
(
DBMS '=' variable REPLACE* ';'
);

//TODO
/*
datasource_statement:
(
variable ';'
);
*/
