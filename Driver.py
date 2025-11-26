from antlr4.error.ErrorListener import ErrorListener

class MyErrorListener(ErrorListener):
    def __init__(self):
        super().__init__()
        self.has_error = False
        self.messages = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.has_error = True
        message = f"[ERRO] linha {line}:{column} - {msg}"
        self.messages.append(message)
        print(message)
