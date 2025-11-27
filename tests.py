import os
import subprocess
import sys

def run_tests(path):
    files = sorted(os.listdir(path))
    print(f"\n[TESTANDO ARQUIVOS EM: {path}]")

    for f in files:
        if not f.endswith(".txt"):
            continue

        full = os.path.join(path, f)
        print(f"\n--- Executando {f} ---")
        
        # roda: python main.py <arquivo>
        result = subprocess.run(
            ["python", "main.py", full],
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
        print("Uso: python test_runner.py [--erros | --certos | --all]")
        return

    cmd = sys.argv[1]

    base = "entradas"
    erros_path = os.path.join(base, "erros")
    certos_path = os.path.join(base, "certos")

    if cmd == "--erros":
        run_tests(erros_path)

    elif cmd == "--certos":
        run_tests(certos_path)

    elif cmd == "--all":
        run_tests(erros_path)
        run_tests(certos_path)

    else:
        print("Opção inválida. Use: --erros | --certos | --all")

if __name__ == "__main__":
    main()
