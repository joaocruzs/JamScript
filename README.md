# JamScript
Trabalho Final da disciplina de Compiladores, 2025.2

### Arquivos

* `JamScript.g4` — gramática ANTLR.
* — código Python que usa os arquivos gerados pelo ANTLR.
* — código em Python que usa
* `e1.txt` — arquivo de entrada. (os exemplos de entrada estão contidos na pasta entradas).

### Passos
1. Criamos a gramática `JamScript.g4`;
2. Geramos Lexer, parser, Listener e Visitor com o comando:

```bash
antlr4 -Dlanguage=Python3 -visitor JamScript.g4
```

3. Criamos arquivo x , para usarmos SuscintoParser e SuscintoVisitor;
4. Criamos arquivo x, para usarmos semantic;
5. 

```bash
python main.py entradas/e1.txt
```