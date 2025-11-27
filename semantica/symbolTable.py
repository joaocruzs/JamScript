class SymbolTable:
    def __init__(self, name="global", parent=None):
        self.name = name
        self.symbols = {}
        self.parent = parent

    def define(self, symbol):
        if symbol.name in self.symbols:
            raise Exception(f"Redeclaração de '{symbol.name}' no escopo '{self.name}'")
        self.symbols[symbol.name] = symbol

    def resolve(self, name):
        if name in self.symbols:
            return self.symbols[name]
        if self.parent is not None:
            return self.parent.resolve(name)
        return None

    def __repr__(self):
        return f"<Scope {self.name}: {self.symbols}>"

# -----------------------------------
# Gerenciador de escopos
# -----------------------------------
class SymbolTableManager:
    def __init__(self):
        self.global_scope = SymbolTable("global")
        self.current_scope = self.global_scope

    def push_scope(self, name):
        new_scope = SymbolTable(name=name, parent=self.current_scope)
        self.current_scope = new_scope
        return new_scope

    def pop_scope(self):
        if self.current_scope.parent is not None:
            self.current_scope = self.current_scope.parent

    def define(self, symbol):
        self.current_scope.define(symbol)

    def resolve(self, name):
        return self.current_scope.resolve(name)

    def __repr__(self):
        return f"Current scope: {self.current_scope}"
