grammar MeansProc;
import CommonGrammar ;

// PROC MEANS: computes descriptive statistics; can produce printed output and output data sets. By default, PROC MEANS produces printed output.
/*
// https://support.sas.com/documentation/cdl/en/proc/61895/HTML/default/viewer.htm#a002473537.htm

PROC MEANS <option(s)> <statistic-keyword(s)>;
BY <DESCENDING> variable-1 <... <DESCENDING> variable-n><NOTSORTED>;
CLASS variable(s) </ option(s)>;
FREQ variable;
ID variable(s);
OUTPUT <OUT=SAS-data-set> <output-statistic-specification(s)>
<id-group-specification(s)> <maximum-id-specification(s)>
<minimum-id-specification(s)> </ option(s)> ;
TYPES request(s);
VAR variable(s) < / WEIGHT=weight-variable>;
WAYS list;
WEIGHT variable;

*/

means_main:
    (means_proc)+
    // any order
    (
    by_statement | class_statement | freq_statement | id_statement | output_statement
    | types_statement | var_statement | ways_statement | weight_statement
    )*
    EOF
;
 
means_proc:
(
    DROP (variables | variables '-' variables)+ ';'
    |DATA '=' variables ';'
);

var_statement:
(
VAR (variables | variables '-' variables)+ ';'
);

/*
OUTPUT <OUT=SAS-data-set> <output-statistic-specification(s)>
<id-group-specification(s)> <maximum-id-specification(s)>
<minimum-id-specification(s)> </ option(s)>;
*/
output_statement:
(
OUTPUT OUT '=' (variables | variables '-' variables)* ';'
);


by_statement:
(
BY DESCENDING+ variables (COMMA DESCENDING+ variables)* NOTSORTED+';'
);

class_statement:
(
CLASS (variables | variables '-' variables)+ ';'
);

freq_statement:
(
FREQ variable ';'
);

id_statement:
(
ID (variables | variables '-' variables)+ ';'
);

types_statement:
(
TYPES request+ ';'
);

ways_statement:
(
WAYS list ';'
);

weight_statement:
(
WEIGHT variable ';'
);

