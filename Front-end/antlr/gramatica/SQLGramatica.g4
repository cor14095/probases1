grammar SQLGramatica;

CREATE: 'create'|'CREATE'|'Create';
DATABASE: 'database'|'DATABASE'|'Database';
DATABASES: 'databases'|'DATABASES'|'Databases';
ALTER: 'alter'|'ALTER'|'Alter';
RENAME: 'rename'|'RENAME'|'Rename';
DROP: 'drop'|'DROP'|'Drop';
TO: 'to'|'TO'|'To';
SHOW: 'show'|'SHOW'|'Show';
USE: 'use'|'USE'|'Use';
CONSTRAINT: 'constraint'|'CONSTRAINT'|'Constraint';
PRIMARY: 'primary'|'PRIMARY'|'Primary';
FOREIGN: 'foreign'|'FOREIGN'|'Foreign';
KEY: 'key'|'KEY'|'Key';
REFERENCES: 'references'|'REFERENCES'|'References';
CHECK: 'check'|'CHECK'|'Check';
INT: 'int'|'INT'|'Int';
FLOAT: 'float'|'FLOAT'|'Float';
DATE: 'date'|'DATE'|'Date';
CHAR: 'char'|'CHAR'|'Char';
AND: 'and'|'AND'|'And';
OR: 'or'|'OR'|'Or';
NOT: 'not'|'NOT'|'Not';
TABLE: 'table'|'TABLE'|'Table';
TABLES: 'tables'|'TABLES'|'Tables';
ADD: 'add'|'ADD'|'Add';
COLUMN: 'column'|'COLUMN'|'Column';
COLUMNS: 'columns'|'COLUMNS'|'Columns';
SHOWX: 'show'|'SHOW'|'Show';
FROM: 'from'|'FROM'|'From';
INSERT: 'insert'|'INSERT'|'Insert';
SELECT: 'select'|'SELECT'|'Select';
VALUES: 'values'|'VALUES'|'Values';
INTO: 'into'|'INTO'|'Into';
UPDATE: 'update'|'UPDATE'|'Update';
SET : 'set'|'SET'|'Set';
WHERE: 'where'|'WHERE'|'Where';
DELETE: 'delete'|'DELETE'|'Delete';
ORDER: 'order'|'ORDER'|'Order';
BY: 'by'|'BY'|'By';
ASC: 'asc'|'ASC'|'Asc';
DESC: 'desc'|'DESC'|'Desc';
NULL: 'null'|'NULL'|'Null';

fragment LETTERX: ('A'..'Z'|'a'..'z');
fragment DIGITX: '0'..'9';
fragment VARX: (' '..'~')| '\\' | '\t' | '\n' ;

IDX: LETTERX (LETTERX | DIGITX|'_')*;
NUMX: DIGITX (DIGITX)*;
CHARX: '\''(LETTERX | DIGITX |' '| '!' | '"' | '#' | '$' | '%' | '&' | '\'' | '(' | ')' | '*'
| '+' | ',' | '-' | '.' | '/' | ':' | ';' | '<' | '=' | '>' | '?' | '@' | '[' | '\\' | ']'
| '^' | '_' | '`'| '{' | '|' | '}' | '~' '\t'| '\n' | '\"' | '\'')'\'';

SPACEX: (' '|'\n'|'\t'|'\f'|'\r\n'|'\r'){skip();};
COMMENTX: '//'(~('\r'|'\n'))*{skip();};

literal : IDX| NUMX| CHARX | fecha;

fecha:  DIGITX DIGITX DIGITX DIGITX '-'  DIGITX DIGITX '-'  DIGITX DIGITX ;

programa: database|(database)*;

database:
	(createDatabase
	|alterDatabase
	|dropDatabase
	|showDatabase
	|useDatabase
	|opTable);

createDatabase: CREATE DATABASE IDX;

alterDatabase: ALTER DATABASE IDX RENAME TO IDX;

dropDatabase: DROP DATABASE IDX;

showDatabase: SHOW DATABASES;

useDatabase: USE DATABASE IDX;

opTable:
	(createTable
	|alterTable
	|dropTable
	|showTables
	|showColumns
	|insertInto
	|updateSet
	|deleteFrom
	|selectFrom);

tipo: INT|FLOAT|DATE|CHAR '('NUMX ')' ;

createTable: CREATE TABLE IDX '(' IDX tipo (',' IDX tipo)* (CONSTRAINT constraint (',' CONSTRAINT constraint)*)? ')';

constraint: primaryKey | foreignKey(foreignKey)* | check(check)*;

primaryKey: IDX PRIMARY KEY '(' IDX (',' IDX)* ')';

foreignKey: IDX FOREIGN KEY '(' IDX (',' IDX)* ')' REFERENCES IDX '(' IDX (',' IDX)* ')' ;

check: IDX CHECK (exp);

// Expression

exp: expression | ;

expression : andExpr| expression OR andExpr  ;

andExpr: eqExpr | andExpr AND eqExpr ;

eqExpr: relationExpr | eqExpr eq_op relationExpr ;

relationExpr: unaryExpr | relationExpr rel_op unaryExpr ;

unaryExpr:  '('(NOT)? IDX  ')' ; // verificar


alterTable: ALTER TABLE IDX RENAME TO IDX | ALTER TABLE IDX action (',' action)* ;

action:
		 ADD COLUMN IDX tipo (CONSTRAINT constraint (',' constraint)*)?
	   | ADD CONSTRAINT constraint
	   | DROP COLUMN IDX
	   | DROP CONSTRAINT IDX ;

dropTable: DROP TABLE IDX;

showTables: SHOW TABLES;

showColumns: SHOW COLUMNS FROM IDX ;


// Gramatica para parte 2

insertInto: INSERT INTO IDX '(' IDX (',' IDX)* ')' VALUES '(' literal (',' literal)* ')';

updateSet: UPDATE IDX SET IDX '=' tipo (',' tipo)* (WHERE exp)? ; // verificar

deleteFrom: DELETE FROM IDX (WHERE exp)? ;

selectFrom: SELECT sep FROM IDX (WHERE exp (ORDER BY  exp ASC|DESC (',' exp ASC|DESC)*)? )? ;// verificar

sep: '*' | IDX(',' IDX)*;


// Operadores rel y eq

rel_op: '<' | '>' | '<=' | '>='| '=';

eq_op : '==' | '!=' ;

add_op: '+'| '-';

mult_op: '*' | '/' | '%' ;
