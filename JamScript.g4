/*
TRABALHO FINAL COMPILADORES 2025.2
Ana Valéria Silva Coelho
João Vitor Cruz Silva
Miguel Anjo Maciel Medeiros
 */

grammar JamScript;

// ======================
// REGRAS DO PARSER
// ======================

program
    : 'program' ID ';' structDecl* funcDecl* mainBlock EOF
    ;

//1. Tipos básicos e derivados: declarações
decl
    : varDecl
    ;

structDecl
    // struct NÃO termina com ';' (corrigido)
    : 'struct' ID '{' structField* '}'
    ;

structField
    : ('let') ID ':' type_ ';'
    ;

// 3.1 Sintaxe geral: variáveis e constantes
varDecl
    // múltiplas variáveis NÃO são permitidas → removido (',' ID)*
    : 'let' ID ':' type_ ('=' expr)? ';'
    | 'const' ID ':' type_ '=' expr ';'
    ;

// 4. Declaração de funções
funcDecl
    : FUNCTION ID '(' paramList? ')' ':' type_ block
    ;

paramList
    : param (',' param)*
    ;

param
    : ID ':' type_
    ;

// ---------------------------------------------
// Bloco principal
mainBlock
    : 'main' block
    ;

block
    // Permite decls e stmts, verificação semântica impede decls após stmts
    : '{' decl* stmt* '}'
    ;

stmt
    : simpleStmt
    | ifStmt
    | whileStmt
    | forStmt
    | block
    ;

simpleStmt
    : assignStmt
    | callStmt ';'
    | returnStmt ';'
    | varDecl
    | 'break' ';'
    ;

assignStmt
    : leftHandSide '=' expr ';'
    ;

leftHandSide
    : ID
    | ID '.' ID
    ;

// 5. Funções nativas
callStmt
    : printStmt
    | inputStmt
    | functionCall
    ;

printStmt
    : 'print' '(' argList? ')'
    ;

inputStmt
    : 'input' '(' idList? ')'
    ;

idList
    : ID (',' ID)*
    ;

// 6. Estruturas de controle
ifStmt
    : 'if' '(' expr ')' block ('else' block)?
    ;

whileStmt
    : 'while' '(' expr ')' block
    ;

forStmt
    : 'for' '(' forInit? ';' expr? ';' forUpdate? ')' block
    ;

forInit
    // declaração sem ';'
    : 'let' ID ':' type_ ('=' expr)?
    | 'const' ID ':' type_ '=' expr
    | assignNoSemi
    ;

forUpdate
    : incExpr
    | assignNoSemi
    ;

assignNoSemi
    : leftHandSide '=' expr
    ;

incExpr
    : ID '++'
    | ID '--'
    | '++' ID
    | '--' ID
    ;

returnStmt
    : 'return' expr?
    ;

// 2. Operadores
//2.5 Precedência de operadores em expressões (SEM left recursion)
expr
    : orExpr
    ;

orExpr
    : andExpr ( '||' andExpr )*
    ;

andExpr
    : eqExpr ( '&&' eqExpr )*
    ;

eqExpr
    : relExpr ( ('==' | '!=') relExpr )*
    ;

relExpr
    // Apenas > e < — >= e <= foram removidos conforme PDF
    : addExpr ( ('>' | '<') addExpr )*
    ;

addExpr
    : mulExpr ( ('+' | '-') mulExpr )*
    ;

mulExpr
    : unaryExpr ( ('*' | '/') unaryExpr )*
    ;

unaryExpr
    // operadores unários e pré-incremento
    : ('!' | '-' | '++' | '--') unaryExpr
    | postfixExpr
    ;

postfixExpr
    // pós-incremento/decremento
    : primary ('++' | '--')?
    ;

primary
    : NUMBER
    | FLOAT
    | STRING
    | BOOL
    | leftHandSide
    | functionCall
    | '(' expr ')'
    ;

functionCall
    : ID '(' argList? ')'
    ;

argList
    : expr (',' expr)*
    ;

// ======================
// REGRAS DO LEXER
// ======================

type_
    : 'int'
    | 'float'
    | 'bool'
    | 'string'
    | ID             
    ;

// 1. Literais e tokens
BOOL        : 'true' | 'false' ;
ID          : [a-zA-Z_][a-zA-Z0-9_]* ;
FLOAT       : [0-9]+ '.' [0-9]+ ;
NUMBER      : [0-9]+ ;
STRING      : '"' (~["\r\n])* '"' ;

// 2. Operadores e pontuação
PLUS        : '+' ;
MINUS       : '-' ;
STAR        : '*' ;
SLASH       : '/' ;
EQ          : '=' ;
EQEQ        : '==' ;
NEQ         : '!=' ;
GT          : '>' ;
LT          : '<' ;
AND         : '&&' ;
OR          : '||' ;
NOT         : '!' ;
INC         : '++' ;
DEC         : '--' ;
LPAREN      : '(' ;
RPAREN      : ')' ;
LBRACE      : '{' ;
RBRACE      : '}' ;
SEMI        : ';' ;
COLON       : ':' ;
COMMA       : ',' ;
DOT         : '.' ;
PROGRAM     : 'program' ;
FUNCTION    : 'function' ;
LET         : 'let' ;
CONST       : 'const' ;
STRUCT      : 'struct' ;
MAIN        : 'main' ;
IF          : 'if' ;
ELSE        : 'else' ;
WHILE       : 'while' ;
FOR         : 'for' ;
RETURN      : 'return' ;
PRINT       : 'print' ;
INPUT       : 'input' ;

// 3. Comentários e Whitespace
WS              : [ \t\r\n]+ -> skip ;
LINE_COMMENT    : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT   : '/*' .*? '*/' -> skip ;
