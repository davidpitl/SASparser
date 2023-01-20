grammar DataStmt;
import CommonGrammar;


data_stmt:
    (data_form1_stmt|data_form2_stmt|data_form3_stmt|data_form4_stmt|data_form5_stmt)+ ';'
;

/*
Form 1: DATA statement for creating output data sets
DATA <data-set-name-1 <(data-set-options-1)> >
<...data-set-name-n <(data-set-options-n)> >
</ <DEBUG> <NESTING> <STACK=stack-size> <HEXLISTALL>> <NOLIST>;
*/
data_form1_stmt:
    DATA dataset_name_opt+ datastmt_cmd? NOLIST?
;


/*
Form 2: DATA statement for creating a DATA step view
DATA view-name <data-set-name-1 <(data-set-options-1)> >
<...data-set-name-n <(data-set-options-n)> > / VIEW=view-name
<(<password-option> <SOURCE=source-option> )>
<NESTING> <NOLIST>;
*/
data_form2_stmt:
    DATA view_dsname_opt+ '/' VIEW '=' view_name passwd_opt? source_opt? NESTING? NOLIST?
;

/*
Form 3:
DATA statement for creating a stored compiled DATA step program
DATA data-set-name / PGM=program-name
<(<password-option> <SOURCE=source-option> )>
<NESTING> <NOLIST>;
*/
data_form3_stmt:
    DATA dataset_name '/' PGM '=' program_name passwd_opt? source_opt? NESTING? NOLIST?
;

/*
Form 4:
DATA statement for describing a DATA step view
DATA VIEW=view-name <(password-option)> <NOLIST>;
DESCRIBE;
*/
data_form4_stmt:
     DATA VIEW '=' view_name passwd_opt? NOLIST?
;

/*
Form 5:
DATA statement for use with a stored compiled DATA step program
DATA PGM=program-name <(password-option)> <NOLIST>;
<DESCRIBE;>
<REDIRECT INPUT | OUTPUT old-name-1 = new-name-1<… old-name-n = new-name-n> ;>
<EXECUTE;>
*/
data_form5_stmt:
     DATA PGM '=' program_name passwd_opt? NOLIST?
;


//TODO
/*
Form 6:
DATA statement for use on the CAS server
DATA <data-set-name-1 <(data-set-options-1)> >
<...data-set-name-n <(data-set-options-n)> >
/ < <SESSREF=session-reference-name> | <SESSUUID=session-uuid > >
<THREADS=number-of-threads> <SINGLE= NO | YES | NOINPUT>
<NESTING> <STACK=stack-size><HEXLISTALL> <NOLIST>;
*/


// DATA <data-set-name-1 <(data-set-options-1)>>
// DATA view-name <data-set-name-1 <(data-set-options-1)>>
dataset_name_opt:
    dataset_name  ('(' ((KEEP'=')|(COMPRESS'='(YES|NOT)+))* variables+ ')' )?
;

datastmt_cmd:
    '/' DEBUG? NESTING? (STACK '=' INT)?
;

 // view-name <data-set-name-1 <(data-set-options-1)>>
view_dsname_opt:
    variables variables? ('(' variables '=' (~('('|')'))*? ')')?
;

view_name : variables  ;
program_name : variables;
passwd_opt  : '(' (ALTER|READ|PW) '=' (~('('|')'))*? ')' ;
source_opt : ('(' SOURCE '=' (SAVE | ENCRYPT | NOSAVE) ')') ;
dataset_name : variables;


COMMENT:  '/*' .*? '*/' -> channel(HIDDEN) ;


