import os
import subprocess
import sys

# Detecta o interpretador Python do ambiente virtual
def get_python_executable():
    if sys.platform == "win32":
        venv_python = os.path.join(".venv", "Scripts", "python.exe")
    else:
        venv_python = os.path.join(".venv", "bin", "python")
    
    if os.path.exists(venv_python):
        return venv_python
    return "python"  # fallback para python do sistema

def run_tests(path):
    files = sorted(os.listdir(path))
    print(f"\n[TESTANDO ARQUIVOS EM: {path}]")
    
    python_exe = get_python_executable()

    for f in files:
        if not f.endswith(".txt"):
            continue

        full = os.path.join(path, f)
        print(f"\n--- Executando {f} ---")
        
        # roda: python main.py <arquivo> (usando venv)
        result = subprocess.run(
            [python_exe, "main.py", full],
            capture_output=True,
            text=True
        )

        print(result.stdout)

        # para debug de erros internos
        if result.stderr.strip():
            print("[STDERR]")
            print(result.stderr)

def main():
    if len(sys.argv) < 2:
        print("Uso: python test_runner.py [--erros | --acertos | --notas | --all]")
        return

    cmd = sys.argv[1]

    base = "entradas"
    erros_path = os.path.join(base, "erros")
    acertos_path = os.path.join(base, "acertos")
    notas_path = os.path.join(base, "notas")

    if cmd == "--erros":
        run_tests(erros_path)

    elif cmd == "--acertos":
        run_tests(acertos_path)

    elif cmd == "--notas":
        run_tests(notas_path)
        
    elif cmd == "--all":
        run_tests(erros_path)
        run_tests(acertos_path)
        run_tests(notas_path)

    else:
        print("Opção inválida. Use: --erros | --acertos | --notas | --all")

if __name__ == "__main__":
    main()
