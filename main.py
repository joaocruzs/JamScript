import sys
from antlr4 import *
from antlr.JamScriptLexer import JamScriptLexer
from antlr.JamScriptParser import JamScriptParser
from Driver import MyErrorListener


def main():
    if len(sys.argv) < 2:
        print("Uso: python main.py <arquivo>")
        return

    input_file = sys.argv[1]

    # ==============================
    # Leitura do arquivo
    # ==============================
    try:
        with open(input_file, "r", encoding="utf-8") as f:
            code = f.read()
        print(f"[INFO] Lendo arquivo: {input_file}")
        print("[INFO] Código-fonte carregado com sucesso.\n")
    except Exception as e:
        print(f"[ERRO] Falha ao ler arquivo: {e}")
        print("erro")
        return

    # ==============================
    # Análise Léxica
    # ==============================
    input_stream = InputStream(code)
    lexer = JamScriptLexer(input_stream)

    lexer_error_listener = MyErrorListener()
    lexer.removeErrorListeners()
    lexer.addErrorListener(lexer_error_listener)

    token_stream = CommonTokenStream(lexer)
    print("[INFO] Análise léxica concluída.")

    # ==============================
    # Análise Sintática
    # ==============================
    parser = JamScriptParser(token_stream)

    parser_error_listener = MyErrorListener()
    parser.removeErrorListeners()
    parser.addErrorListener(parser_error_listener)

    try:
        tree = parser.program()
        print("[INFO] Análise sintática concluída (árvore gerada).\n")
    except Exception as e:
        print(f"[ERRO] Falha na análise sintática: {e}")
        print("erro")
        return

    # ==============================
    # Resultado Final
    # ==============================
    if lexer_error_listener.has_error or parser_error_listener.has_error:
        print("erro")
    else:
        print("aceito")


if __name__ == "__main__":
    main()
