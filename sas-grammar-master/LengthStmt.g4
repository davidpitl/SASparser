grammar LengthStmt;
import CommonGrammar ;

// LENGTH: Specifies the number of bytes for storing character and numeric variables, or the number of characters
//  for storing VARCHAR variables.

/* LENGTH variable-specification(s) <DEFAULT=n>; */

length_stmt:
(
    LENGTH variables ((DEFAULT'=')?INT) ';'
);


