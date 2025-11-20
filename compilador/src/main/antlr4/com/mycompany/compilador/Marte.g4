/*
 Linguagem: Marte
 Observação: Quando for criar o programa, use a extensao .mar
*/

grammar Marte;
/* -------- PARSER -------- */

program
  : (declaration | statement)+ EOF
  ;

declaration
  : type ID ('=' expr)? ';'
  ;

type
  : INTEIRO
  | DECIMAL
  | BOOLEANO
  ;

statement
  : block
  | ifStmtNoElse
  | ifStmtWithElse
  | whileStmt
  | forStmt
  | assignStmt
  | scanfStmt
  | printfStmt
  | ';'
  ;

block
  : '{' (declaration | statement)* '}'
  ;


ifStmtNoElse
  : SE '(' expr ')' statement
  ;

ifStmtWithElse
  : SE '(' expr ')' statement SENAO statement
  ;

whileStmt
  : ENQUANTO '(' expr ')' statement
  ;

forStmt
  : PARA '(' forInit ';' expr ';' forStep ')' statement
  ;

forInit
  : declaration
  | assignStmt
  | PASSE
  ;

forStep
  : assignStmt
  | PASSE
  ;

assignStmt
  : ID '=' expr ';'
  ;

scanfStmt
  : LEIA '(' ID ')' ';'
  ;

printfStmt
  : IMPRIMA '(' expr ')' ';'
  ;


/* -------- EXPRESSÕES -------- */

expr           : orExpr ;

orExpr         : andExpr ( '||' andExpr )* ;
andExpr        : eqExpr  ( '&&' eqExpr  )* ;
eqExpr         : relExpr ( ( '==' | '!=' ) relExpr )* ;
relExpr        : addExpr ( ( '<' | '>' | '<=' | '>=' ) addExpr )* ;
addExpr        : mulExpr ( ( '+' | '-' ) mulExpr )* ;
mulExpr        : unary   ( ( '*' | '/' | '%' ) unary )* ;

unary
  : ('!' | '-') unary
  | primary
  ;

primary
  : '(' expr ')'
  | literal
  | ID
  ;

literal
  : BOOL_LIT
  | NUMBER
  ;

/* -------- LEXER -------- */

/* Palavras-chave */
SE      : 'se' ; // Declaracao do IF.
SENAO   : 'senao' ; // Declaracao do ELSE.
ENQUANTO   : 'enquanto' ; // Laço WHILE.
PARA     : 'para' ; // Laço FOR.
PASSE    : 'passe' ; // Palavra chave para representar que nao irá fazer nada, como um CONTINUE, para evitar vazio.
LEIA   : 'leia' ;  // Input de Teclado, como um SCAN
IMPRIMA  : 'imprima' ; // Output do codigo, como um PRINT.

INTEIRO   : 'int' ; // Para criacao de objetos com numeros inteiros/int.
DECIMAL : 'float' ; // Pra criacao de objetos com numeros decimais/float;
BOOLEANO  : 'bool' ; // Para criacao de objetos com valores booleanos.

BOOL_LIT: 'true' | 'false' ; //Literais do Booleanos - Ou verdadeiro (true) ou Falso (false).

ID      : [a-zA-Z_][a-zA-Z_0-9]* ;

NUMBER
  : NUM+ ('.' NUM*)?
  | '.' NUM+
  ;

WS      : [ \t\r\n]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;
MCOMMENT: '/*' .*? '*/' -> skip ;

fragment NUM : [0-9] ;
