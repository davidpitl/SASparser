grammar FilenameStmt;
import CommonGrammar;

// FILENAME: Associates a SAS fileref with an external file or an output device, disassociates a fileref and external file,
//  or lists attributes of external files.

filename_main:
    (filename_stmt)* EOF
;

filename_stmt:
(
    (filename_form1_stmt|filename_form2_stmt|filename_form3_stmt|filename_form4_stmt)+ ';'
);

/*
Form 1:
FILENAME fileref <device-type> 'external-file' <ENCODING='encoding-value'> <options> <operating-environment-options>;
*/
filename_form1_stmt:
(
    FILENAME fileref device_type* external_file (ENCODING'='encoding_value)* (options)* (operating_environment_options)*
);


/*
Form 2:
FILENAME fileref <device-type> <options> <operating-environment-options >;
*/
filename_form2_stmt:
(
    FILENAME fileref file_specification device_type* (options)* operating_environment_options*
);

/*
Form 3:
FILENAME fileref CLEAR | _ALL_ CLEAR;
*/
filename_form3_stmt:
(
    FILENAME fileref (CLEAR | ALL CLEAR)+
);

/*
Form 4:
FILENAME fileref LIST | _ALL_ LIST ;
*/
filename_form4_stmt:
(
    FILENAME fileref (LIST | ALL LIST)+
);



fileref: Identifier;
device_type: Identifier;
external_file: Identifier;
encoding_value: Identifier;
options: Identifier EQUAL expression;
operating_environment_options: Identifier EQUAL expression;
