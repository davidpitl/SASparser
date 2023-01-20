grammar ArrayStmt;
import CommonGrammar;

/*
ARRAY array-name { subscript }
<$ length | length | VARCHAR(length) | VARCHAR(*)>
<array-elements> <(initial-value-list)>;
*/

/* Defines the elements of an array. */
array_main:
    (array_stmt)* EOF
;

array_stmt
 : ARRAY array_name LLBracket array_subscript RRBracket DOLLAR? INT? array_elements?  initial_value_list? ';';


array_name: Identifier ;
array_subscript:
 | INT (',' INT)*
 | INT ':' INT (',' INT ':' INT)*
 | STAR
;

STAR : '*' ;

array_elements
 : ARRAY_NUMERIC_ELEMENTS
 | ARRAY_CHARACTER_ELEMENTS
 | ARRAY_ALL_ELEMENTS
 | Identifier+
 | Identifier '-' Identifier
 ;
 
initial_value_list
 : '('
    (initial_value_list_item)
    (COMMA? initial_value_list_item)*
   ')'
 ;

initial_value_list_item
 : INT ':' INT
 | constant_iter_value '*' initial_value_list
 | constant_iter_value '*' constant_value
 | constant_value
 ;

initial_value_list_bk
 : '('
    ((constant_iter_value '*' initial_value_list) | (constant_iter_value '*' constant_value) | constant_value)   
    (COMMA? ((constant_iter_value '*' initial_value_list) | (constant_iter_value '*' constant_value) | constant_value))*
   ')'
 ;
 
constant_iter_value
 : INT
 ;
 
constant_value
 : INT
 | FloatingPointLiteral
 | STRINGLITERAL
 ;

//LLBracket: '{' ;
//RRBracket : '}' ;
