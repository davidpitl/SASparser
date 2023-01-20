grammar SqlProc;
import CommonGrammar;

sql_main:
    (select_stmt)*
    |(alter_table_stmt)*
     ';' EOF
;

// SELECT
/*
SELECT <DISTINCT | UNIQUE> object-item-1 <, object-item-2, ...>
<INTO macro-variable-specification-1 <, macro-variable-specification-2, ...>>
FROM from-list
<WHERE sql-expression>
<GROUP BY group-by-item-1 <, group-by-item-2, ...>>
<HAVING sql-expression>
<ORDER BY order-by-item-1 <, order-by-item-2 <ASC | DESC>, ...>>;
*/
select_stmt:
    SELECT (DISTINCT|UNIQUE)? result_column (COMMA result_column)* FROM tablename (WHERE where_clause)*
    (GROUP BY groupby_clause)*
    (HAVING having_clause)*
    (ORDER BY orderby_clause)* (ASC|DESC)?
;

where_clause:   any_name;
groupby_clause: any_name;
having_clause:  any_name;
orderby_clause: any_name;

result_column:
     //STAR
     MUL
     | column_name (AS? column_alias)?
 ;


// ALTER TABLE
/*
ALTER TABLE table-name
<ADD column-definition-1 <, column-definition-2, ...>>
<ADD CONSTRAINT constraint-name-1 constraint-specification-1
    <, constraint-name-2 constraint-specification-2, ...>>
<ADD constraint-specification-1 <, constraint-specification-2, ...>>

<DROP column-1 <, column-2, ...>>
<DROP CONSTRAINT constraint-name-1 <, constraint-name-2, ...>>

<DROP FOREIGN KEY constraint-name>
<DROP PRIMARY KEY>

<MODIFY column-definition-1 <, column-definition-2, ...>>
;
*/
alter_table_stmt:
    ALTER TABLE tablename
    (
    (ADD column_name (COMMA column_name)*)+
    |(ADD CONSTRAINT constraint_name constraint_specification (COMMA constraint_name constraint_specification)*)+
    |(DROP column_name (COMMA column_name)*)+
    |(DROP FOREIGN KEY constraint_name (COMMA constraint_name)*)+
    |(DROP PRIMARY KEY)+
    |(MODIFY column_definition (COMMA column_definition)*)+
    )
/*



*/
;

column_definition: any_name;
constraint_name: any_name;
constraint_specification: any_name;


// common
tablename:
    (schema_name DOT)? table_name (AS? table_alias)?
;

column_name: any_name;
column_alias: any_name;
table_alias: any_name;
schema_name: any_name;
table_name: any_name;

any_name:
    (~';')*?
;






/*
PROC SQL <options>;

CREATE <UNIQUE> INDEX index-name ON table-name (column-1 <, column-2, ...>);
CREATE TABLE table-name (column-specification-1 <, column-specification-2 | constraint-specification-1, ...>);
CREATE TABLE table-name LIKE table-name-2;
CREATE TABLE table-name AS query-expression <ORDER BY order-by-item-1 <, order-by-item-2, ...>>;
CREATE VIEW proc-sql-view <(column-name-list)> AS query-expression <ORDER BY order-by-item-1 <, order-by-item-2, ...>> <USING libname-clause-1 <, libname-clause-2, ...>> ;
DELETE FROM table-name | sas/access-view | proc-sql-view <AS alias> <WHERE sql-expression>;

DESCRIBE TABLE table-name-1 <, table-name-2, ...>;
DESCRIBE VIEW proc-sql-view-1 <, proc-sql-view-2, ...>;
DESCRIBE TABLE CONSTRAINTS table-name-1 <, table-name-2, ...>;

DROP INDEX index-name-1 <, index-name-2, ...> FROM table-name;
DROP TABLE table-name-1 <, table-name-2, ...>;
DROP VIEW view-name-1 <, view-name-2, ...>;

INSERT INTO table-name | sas/access-view | proc-sql-view <(column-1<, column-2, ...>)>
SET column1=sql-expression-1 <, column-2=sql-expression-2, ...> <column1=sql-expression-1 <, column-2=sql-expression-2, ...> ...>;
INSERT INTO table-name | sas/access-view | proc-sql-view <(column-1 <, column-2, ...>)> VALUES (value-1 <, value-2, ...>)
<VALUES (value-1 <, value-2, ...>) ...>;
INSERT INTO table-name | sas/access-view | proc-sql-view
<(column-1 <, column-2, ...>)> query-expression;
RESET <options>;

UPDATE table-name | sas/access-view | proc-sql-view <AS alias>
SET column-1=sql-expression-1 <, column-2=sql-expression-2, ...>
<column-1=sql-expression-1 <, column-1=sql-expression-2, ...>>
<WHERE sql-expression>;

VALIDATE query-expression;
<QUIT;>

To connect to a DBMS and send it a DBMS-specific nonquery SQL statement, use this form:
PROC SQL;
CONNECT TO dbms-name <AS alias>
<(connect-statement-argument-1=value-1
<connect-statement-argument-2=value-2 ...>)>
<(database-connection-argument-1=value-1
<database-connection-argument-2=value-2 ...>)>;
EXECUTE (dbms-SQL-statement)
BY dbms-name | alias;

<DISCONNECT FROM dbms-name | alias;>
<QUIT;>

To connect to a DBMS and query the DBMS data, use this form:
PROC SQL;
CONNECT TO dbms-name <AS alias>
<(connect-statement-argument-1=value-1 <connect-statement-argument-2=value-2 ...>)>
<(database-connection-argument-1=value-1 <database-connection-argument-2=value-2 ...>)>;

SELECT column-list FROM CONNECTION TO dbms-name | alias (dbms-query)

optional PROC SQL clauses;
<DISCONNECT FROM dbms-name | alias;>
<QUIT;>
*/


SELECT : S E L E C T;
DISTINCT : D I S T I N C T;
UNIQUE : U N I Q U E;
FROM : F R O M;
AS : A S;
WHERE : W H E R E;
GROUP : G R O U P;
HAVING : H A V I N G;
ORDER : O R D E R;
ASC : A S C;
DESC : D E S C;
TABLE : T A B L E;
ADD : A D D;
CONSTRAINT : C O N S T R A I N T;
DROP : D R O P;
FOREIGN : F O R E I G N;
KEY : K E Y;
PRIMARY : P R I M A R Y;
MODIFY : M O D I F Y;


fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

//STAR : '*' ;
//DOT : '.' ;
AT : '@' ;
EQUAL : '=' ;
COMMA : ',' ;

WS : [ \r\t\u000C\n]+ -> channel(HIDDEN) ;
//COMMENT    :   '/*' .*? '*/'    -> channel(HIDDEN) ;
//LINE_COMMENT    :   '*' ~[\r\n]* -> channel(HIDDEN) ;





