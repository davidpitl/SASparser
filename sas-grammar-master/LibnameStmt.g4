grammar LibnameStmt;
import CommonGrammar ;

// LIBNAME: Associates or disassociates a SAS library with a libref (a shortcut name), clears one or all librefs,
// lists the characteristics of a SAS library, concatenates SAS libraries, or concatenates SAS catalogs.


libname_main:
    (libname_stmt)* EOF
;

libname_stmt:
(
    (libname_form1_stmt|libname_form2_stmt|libname_form3_stmt|libname_form4_stmt)+ ';'
);

/*
Form 1:
LIBNAME libref <engine> 'SAS-library' < libname-options > <engine-host-options>;
*/
libname_form1_stmt:
(
    LIBNAME libref engine* 'SAS-library' (libname_options)* (engine_host_options)*
);


/*
Form 2:
LIBNAME libref CLEAR | _ALL_ CLEAR ;
*/
libname_form2_stmt:
(
    LIBNAME (libref CLEAR|ALL CLEAR)+ 
);

/*
Form 3:
LIBNAME libref LIST | _ALL_ LIST;
*/
libname_form3_stmt:
(
    LIBNAME (libref LIST|ALL LIST)+
);

/*
Form 4:
LIBNAME libref <engine> (library-specification-1 <...library-specification-n>) <libname-options>;
*/
libname_form4_stmt:
(
    LIBNAME libref file_specification engine* library_specification* (libname_options)*
);

libref: Identifier;
engine: Identifier;
libname_options: Identifier EQUAL expression;
library_specification: Identifier;
engine_host_options: Identifier;

