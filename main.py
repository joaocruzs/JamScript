# main_debug_fixed.py
import sys
from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener

from antlr.JamScriptLexer import JamScriptLexer
from antlr.JamScriptParser import JamScriptParser
from semantica.semantic import SemanticAnalyzer, SemanticError  # ajuste se o nome for outro


class LexErrorListener(ErrorListener):
    def __init__(self):
        super().__init__()
        self.errors = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        # msg é fornecido pelo runtime do lexer/parser; formate como precisar
        self.errors.append(f"LÉXICO [{line}:{column}] {msg}")


class ParseErrorListener(ErrorListener):
    def __init__(self):
        super().__init__()
        self.errors = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.errors.append(f"SINTÁTICO [{line}:{column}] {msg}")


def main():
    if len(sys.argv) < 2:
        print("Uso: python main.py <arquivo>")
        return

    input_file = sys.argv[1]
    
    try:
        with open(input_file, "r", encoding="utf-8") as f:
            data = f.read()
    except Exception as e:
        print("[ERRO] Falha ao ler arquivo:", e)
        print("erro")
        return

    # ===== 1. LÉXICO =====
    input_stream = InputStream(data)
    lexer = JamScriptLexer(input_stream)

    # anexa listener ao lexer para capturar erros léxicos
    lex_listener = LexErrorListener()
    lexer.removeErrorListeners()
    lexer.addErrorListener(lex_listener)

    # constrói token stream (isso força o lexer a produzir tokens e acionar listeners)
    token_stream = CommonTokenStream(lexer)
    token_stream.fill()

    # se o listener coletou erros, tratamos como erro léxico
    if lex_listener.errors:
        print("### DEBUG: erro léxico detectado ###")
        for e in lex_listener.errors:
            print(" -", e)
        print("erro")
        return

    # ===== 2. SINTÁTICO =====
    parser = JamScriptParser(token_stream)
    parse_listener = ParseErrorListener()
    parser.removeErrorListeners()
    parser.addErrorListener(parse_listener)

    tree = parser.program()

    if parse_listener.errors:
        print("### DEBUG: erro sintático detectado ###")
        for e in parse_listener.errors:
            print(" -", e)
        print("erro")
        return

    # ===== 3. SEMÂNTICO =====
    try:
        analyzer = SemanticAnalyzer()
        analyzer.visit(tree)
    except SemanticError as se:
        print("### DEBUG: erro semântico detectado ###")
        print(" -", se)
        print("erro")
        return
    except Exception as e:
        # captura falhas inesperadas no semântico
        print("### DEBUG: erro semântico detectado ###")
        print(" -", e)
        print("erro")
        return

    # ===== FINAL =====
    print("aceito")


if __name__ == "__main__":
    main()
