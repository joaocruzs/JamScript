
import sys
import os
import subprocess
from pathlib import Path
from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener
from backend.codegen import LLVMCodeGen

from antlr.JamScriptLexer import JamScriptLexer
from antlr.JamScriptParser import JamScriptParser
from semantica.semantic import SemanticAnalyzer, SemanticError
from backend.codegen import LLVMCodeGen

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

    print("### DEBUG: gerando LLVM IR ###")

    # passa o gerenciador de tabelas de símbolos inteiro
    codegen = LLVMCodeGen(analyzer.stmgr)

    # visita a árvore e gera IR
    codegen.visit(tree)

    # Criar diretórios de saída
    llvm_dir = Path("llvm")
    obj_dir = Path("objeto")
    exe_dir = Path("executaveis")
    
    llvm_dir.mkdir(exist_ok=True)
    obj_dir.mkdir(exist_ok=True)
    exe_dir.mkdir(exist_ok=True)

    # Determinar nome base do arquivo
    input_path = Path(input_file)
    base_name = input_path.stem
    
    # Caminhos dos arquivos de saída
    ll_file = llvm_dir / f"{base_name}.ll"
    obj_file = obj_dir / f"{base_name}.o"
    exe_file = exe_dir / f"{base_name}.exe"

    # Salvar LLVM IR
    codegen.write_ir(str(ll_file))
    print(f"### LLVM IR gerado: {ll_file} ###")

    # Compilar .ll para .o usando clang
    compilation_success = False
    
    # 1. Tentar com clang (Padrão/MSVC)
    try:
        print("### Tentando Clang (Padrão)... ###")
        # Compilar
        res_c = subprocess.run(["clang", "-c", str(ll_file), "-o", str(obj_file)], capture_output=True, text=True)
        if res_c.returncode != 0: raise Exception("Clang compile failed")
        
        # Linkar
        res_l = subprocess.run(["clang", str(obj_file), "-o", str(exe_file)], capture_output=True, text=True)
        if res_l.returncode != 0: raise Exception("Clang link failed")

        print(f"### Executável gerado com sucesso: {exe_file} ###")
        print(f"### Para executar: {exe_file} ###")
        compilation_success = True

    except Exception:
        # 2. Tentar com clang (Target MinGW)
        try:
            print("### Falha no padrão. Tentando Clang com target MinGW... ###")
            target = "--target=x86_64-pc-windows-gnu"
            
            # Compilar
            res_c = subprocess.run(["clang", target, "-c", str(ll_file), "-o", str(obj_file)], capture_output=True, text=True)
            if res_c.returncode != 0: 
                print(f"[ERRO] Clang falhou na compilação: {res_c.stderr}")
                raise Exception("Clang MinGW compile failed")

            # Linkar
            res_l = subprocess.run(["clang", target, str(obj_file), "-o", str(exe_file)], capture_output=True, text=True)
            if res_l.returncode != 0: 
                print(f"[ERRO] Clang falhou na linkagem: {res_l.stderr}")
                raise Exception("Clang MinGW link failed")
            
            print(f"### Executável gerado com sucesso: {exe_file} ###")
            print(f"### Para executar: {exe_file} ###")
            compilation_success = True
        
        except Exception:
            print("[ERRO] Não foi possível compilar o executável com Clang.")
            print("Verifique se o LLVM está instalado corretamente e se há um ambiente de desenvolvimento (VS Build Tools ou MinGW) disponível.")

    print("aceito")


if __name__ == "__main__":
    main()
