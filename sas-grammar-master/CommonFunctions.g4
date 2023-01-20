grammar CommonFunctions;
import CommonGrammar;

parse:
    (sas_function)?
;

sas_function:
    dim_function
;

dim_function:
    DIM '(' array_name ')'
    //DIM(INT)* '(' array_name ')'
;
array_name: variable;
DIM : D I M;