# main_debug.py — versão com prints explicativos
# Quando for entregar, comente as linhas marcadas com ### DEBUG ###

import sys
from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener

from antlr.JamScriptLexer import JamScriptLexer
from antlr.JamScriptParser import JamScriptParser
from semantica.semantic import SemanticAnalyzer


# ----- LISTENER DE ERROS LÉXICOS -----
class LexErrorListener(ErrorListener):
    def __init__(self):
        super().__init__()
        self.errors = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.errors.append(f"LÉXICO [{line}:{column}] {msg}")


# ----- LISTENER DE ERROS SINTÁTICOS -----
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

    # Carregar arquivo
    try:
        with open(input_file, "r", encoding="utf-8") as f:
            data = f.read()
        print("### DEBUG: arquivo carregado ###")
    except Exception:
        print("erro")
        return

    # ===== 1. LÉXICO =====
    input_stream = InputStream(data)
    lexer = JamScriptLexer(input_stream)

    lex_listener = LexErrorListener()
    lexer.removeErrorListeners()
    lexer.addErrorListener(lex_listener)

    token_stream = CommonTokenStream(lexer)

    # força o lexer a gerar todos tokens
    token_stream.fill()

    if lex_listener.errors:
        print("### DEBUG: erro léxico detectado ###")
        for e in lex_listener.errors:
            print(" -", e)
        print("erro")
        return

    print("### DEBUG: análise léxica OK ###")

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

    print("### DEBUG: análise sintática OK ###")

    # ===== 3. SEMÂNTICO =====
    try:
        analyzer = SemanticAnalyzer()
        analyzer.visit(tree)
        print("### DEBUG: análise semântica OK ###")
    except Exception as e:
        print("### DEBUG: erro semântico detectado ###")
        print(" -", e)
        print("erro")
        return

    # ===== FINAL =====
    print("aceito")


if __name__ == "__main__":
    main()
