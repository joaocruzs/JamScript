# JamScript Compiler

Trabalho Final da disciplina de Compiladores, 2025.2 - UFPI.

Este projeto consiste em um compilador para a linguagem **JamScript**, capaz de realizar análise léxica, sintática, semântica e geração de código nativo via LLVM.

[Especificação da linguagem](https://github.com/joaocruzs/JamScript/blob/main/docs/TF%201%C2%AA%20Etapa%20(Especifica%C3%A7%C3%A3o).pdf)

## Equipe

- [Ana Valéria](https://github.com/anavaleriasc)
- [João Victor Cruz](https://github.com/joaocruzs)
- [Miguel Anjo](https://github.com/Anjinho01)

## Estrutura do Projeto

* `antlr/` — Arquivos da gramática (`.g4`) e gerados pelo ANTLR (Lexer, Parser, Visitor).
* `semantica/` — Analisador semântico e tabela de símbolos.
* `backend/` — Gerador de código LLVM IR.
* `main.py` — Ponto de entrada principal do compilador.
* `tests.py` — Script de testes automatizados.
* `entradas/` — Exemplos de código fonte para teste.
* `llvm/`, `objeto/`, `executaveis/` — Diretórios gerados automaticamente contendo os artefatos de compilação (.ll, .o, .exe).

## Requisitos

* **Python 3.8+**
* **Bibliotecas Python:**
  * `antlr4-python3-runtime`
  * `llvmlite`
* **LLVM / Clang** (Instalado e adicionado ao PATH do sistema para compilação do executável).

> **Observação:** Recomenda-se executar os comandos via **PowerShell** em um terminal externo (fora de IDEs). No VS Code, por exemplo, pode ser necessário realizar o download e configuração do Build Tools for Visual Studio para o funcionamento correto, dificultando o uso.

## Como Usar

Certifique-se de estar no diretório raiz do projeto (`JamScript/`) antes de executar os comandos.

### 1. Compilação (Source to Executable)

Para compilar um arquivo fonte JamScript e gerar um executável escreva um comando com a estrutura `python main.py + caminho da entrada`.

Exemplo:

```bash
python main.py entradas/acertos/e33.txt
```

O compilador realizará os seguintes passos:
1. Análise Léxica, Sintática e Semântica.
2. Geração de código intermediário LLVM IR em `llvm/`.
3. Compilação para código objeto em `objeto/`.
4. Linkagem para executável final em `executaveis/`.

### 2. Executando Testes

Para rodar a bateria de testes automatizados (verificação de erros léxicos, sintáticos e semânticos):

```bash
python tests.py --all
```

Opções de filtro para os testes:
* `--notas`: Testes de casos específicos documentados.
* `--erros`: Apenas casos de erro.
* `--acertos`: Apenas casos de sucesso.
