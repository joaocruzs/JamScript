# JamScript
Trabalho Final da disciplina de Compiladores, 2025.2

## Equipe

- [Ana Valéria](https://github.com/anavaleriasc)
- [João Victor Cruz](https://github.com/joaocruzs)
- [Miguel Anjo](https://github.com/Anjinho01)

### Arquivos

* `JamScript.g4` — gramática ANTLR.
* `Semantica.py` — código que usa os arquivos gerados pelo ANTLR.
* `Main.py` — código que usa `Semantica.py`
* `e1.txt` — arquivo de entrada. (os exemplos de entrada estão contidos na pasta entradas).

### Passos
1. Criamos a gramática `JamScript.g4`;
2. Geramos Lexer, parser e Listener com o comando:

```bash
antlr4 -Dlanguage=Python3 -visitor JamScript.g4
```

3. Criamos arquivo `Semantica.py` , para usarmos `JamScriptLexer` e `JamScriptParser`;
4. Criamos arquivo `Main.py`, para usarmos semantic;
5. 

```bash
python main.py entradas/erros/e1.txt
```

## Front-end
Para percorrer todos os exemplos basta:
```bash
python tests.py --all
```

pode substituir `-all` por `--erros` caso desejar apenas erros e `--acertos` se desejar apenas os certos.