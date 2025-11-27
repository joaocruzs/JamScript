// JamScript.g4
// TRABALHO FINAL COMPILADORES 2025.2
// Autores: Ana Valéria Silva Coelho, João Vitor Cruz Silva, Miguel Anjo Maciel Medeiros

grammar JamScript;

// ======================
// REGRAS DO PARSER
// ======================

program
    : PROGRAM ID SEMI structDecl* funcDecl* mainBlock EOF
    ;

decl
    : varDecl
    ;

structDecl
    : STRUCT ID LBRACE structField* RBRACE
    ;

structField
    : LET ID COLON type_ SEMI
    ;

varDecl
    : LET ID COLON type_ (EQ expr)? SEMI
    | CONST ID COLON type_ EQ expr SEMI
    ;

funcDecl
    : FUNCTION ID LPAREN paramList? RPAREN COLON type_ block
    ;

paramList
    : param (COMMA param)*
    ;

param
    : ID COLON type_
    ;

mainBlock
    : MAIN block
    ;

block
    : LBRACE decl* stmt* RBRACE
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
    | incExpr ';' 
    | callStmt SEMI
    | returnStmt SEMI
    | varDecl
    | BREAK SEMI
    ;

assignStmt
    : leftHandSide EQ expr SEMI
    ;

leftHandSide
    : ID
    | ID DOT ID
    ;

callStmt
    : printStmt
    | inputStmt
    | functionCall
    ;

printStmt
    : PRINT LPAREN argList? RPAREN
    ;

inputStmt
    : INPUT LPAREN idList? RPAREN
    ;

idList
    : ID (COMMA ID)*
    ;

ifStmt
    : IF LPAREN expr RPAREN block (ELSE block)?
    ;

whileStmt
    : WHILE LPAREN expr RPAREN block
    ;

forStmt
    : FOR LPAREN forInit SEMI expr SEMI forUpdate RPAREN block
    ;

forInit
    : LET ID COLON type_ (EQ expr)?
    | CONST ID COLON type_ EQ expr
    | assignNoSemi
    ;

forUpdate
    : incExpr
    | assignNoSemi
    ;

assignNoSemi
    : leftHandSide EQ expr
    ;

incExpr
    : ID INC
    | ID DEC
    | INC ID
    | DEC ID
    ;

returnStmt
    : RETURN expr?
    ;

expr
    : orExpr
    ;

orExpr
    : andExpr ( OR andExpr )*
    ;

andExpr
    : eqExpr ( AND eqExpr )*
    ;

eqExpr
    : relExpr ( (EQEQ | NEQ) relExpr )*
    ;

relExpr
    : addExpr ( (GT | LT) addExpr )*
    ;

addExpr
    : mulExpr ( (PLUS | MINUS) mulExpr )*
    ;

mulExpr
    : unaryExpr ( (STAR | SLASH) unaryExpr )*
    ;

unaryExpr
    : (NOT | MINUS | INC | DEC) unaryExpr
    | postfixExpr
    ;

postfixExpr
    : primary (INC | DEC)?
    ;

primary
    : NUMBER
    | FLOAT
    | STRING
    | BOOL
    | leftHandSide
    | functionCall
    | LPAREN expr RPAREN
    ;

functionCall
    : ID LPAREN argList? RPAREN
    ;

argList
    : expr (COMMA expr)*
    ;

// ======================
// REGRAS DO LEXER
// ======================

// Tipos (note que 'void' foi adicionado para retorno de função)
type_
    : 'int'
    | 'float'
    | 'bool'
    | 'string'
    | 'void'
    | ID
    ;

// Operadores e pontuação
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

// Palavras-reservadas (keywords) — devem aparecer antes de ID
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
BREAK       : 'break' ;

// Comentários e espaços
WS              : [ \t\r\n]+ -> skip ;
LINE_COMMENT    : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT   : '/*' .*? '*/' -> skip ;

// Literais
BOOL        : 'true' | 'false' ;
ID          : [a-zA-Z_][a-zA-Z0-9_]* ;
FLOAT       : [0-9]+ '.' [0-9]+ ;
NUMBER      : [0-9]+ ;
STRING
    : '"' ( ESC | ~["\\\r\n] )* '"'
    ;

fragment ESC
    : '\\' [btnfr"'\\/]     // escapes válidos
    ;

// String não fechada
UNCLOSED_STRING
    : '"' ( ESC | ~["\\\r\n] )* EOF
    ;
