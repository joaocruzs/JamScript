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
    : 'program' ID ';' decl* structDecl* funcDecl* mainBlock EOF
    ;

//1. Tipos básicos e derivados: declarações
decl
    : varDecl
    ;

structDecl
    : 'struct' ID '{' structField* '}'
    ;

structField
    : ('let' | 'const') ID ':' type_ ';'
    ;

// 3.1 Sinttaxe geral: variáveis e constantes
varDecl
    : ('let' | 'const') ID ':' type_ ('=' expr)? ';'
    | ('let' | 'const') ID (',' ID)* ':' type_ ';'
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
    | ID '(' argList? ')'
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
    : ('let' | 'const') ID ':' type_ ('=' expr)?   
    | ID '=' expr                                  
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
    : 'return' expr
    ;

// 2. Operadores
//2.5 Precedência de operadores em expressões
expr
    : expr '||' expr                             # OrExpr
    | expr '&&' expr                             # AndExpr
    | expr ('==' | '!=') expr                    # EqExpr
    | expr ('>' | '<' | '>=' | '<=') expr        # RelExpr
    | expr ('+' | '-') expr                      # AddSubExpr
    | expr ('*' | '/') expr                      # MulDivExpr
    | ('!' | '-') expr                           # UnaryExpr
    | ID '++'                                    # PostIncExpr
    | ID '--'                                    # PostDecExpr
    | '++' ID                                    # PreIncExpr
    | '--' ID                                    # PreDecExpr
    | '(' expr ')'                               # ParenExpr
    | leftHandSide                               # FieldOrIdExpr
    | ID '(' argList? ')'                        # FuncCallExpr
    | NUMBER                                     # NumberExpr
    | FLOAT                                      # FloatExpr
    | STRING                                     # StringExpr
    | BOOL                                       # BoolExpr
    ;

// Lista de argumentos para chamadas
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



// 2. Operadores e pontuação
//(tokens explícitos para evitar ambiguidade)
PLUS        : '+' ;
MINUS       : '-' ;
STAR        : '*' ;
SLASH       : '/' ;
EQ          : '=' ;
EQEQ        : '==' ;
NEQ         : '!=' ;
GT          : '>' ;
LT          : '<' ;
GE          : '>=' ;
LE          : '<=' ;
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
WS          : [ \t\r\n]+ -> skip ;
LINE_COMMENT: '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT: '/*' .*? '*/' -> skip ;

// 1. Literais e tokens
BOOL        : 'true' | 'false' ;
ID          : [a-zA-Z_][a-zA-Z0-9_]* ;
FLOAT       : [0-9]+ '.' [0-9]+ ;
NUMBER      : [0-9]+ ;
STRING      : '"' (~["\r\n])* '"' ;