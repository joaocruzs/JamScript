class Symbol:
    def __init__(self, name, type_, is_const=False):
        self.name = name
        self.type = type_          # string ou StructSymbol
        self.is_const = is_const

    def __repr__(self):
        return f"<Symbol {self.name}:{self.type}>"

# ---------------------------
# Variáveis
# ---------------------------
class VarSymbol(Symbol):
    def __init__(self, name, type_, is_const=False):
        super().__init__(name, type_, is_const)


# ---------------------------
# Struct
# ---------------------------
class StructSymbol(Symbol):
    def __init__(self, name):
        super().__init__(name, type_=name)
        self.fields = {}

    def add_field(self, field_name, field_type):
        if field_name in self.fields:
            raise Exception(f"Campo '{field_name}' já existe no struct '{self.name}'")
        self.fields[field_name] = field_type

    def __repr__(self):
        return f"<Struct {self.name} {{{self.fields}}}>"

# ---------------------------
# Funções
# ---------------------------
class FuncSymbol(Symbol):
    def __init__(self, name, return_type):
        super().__init__(name, return_type)
        self.params = []

    def add_param(self, param_name, param_type):
        self.params.append((param_name, param_type))

    def __repr__(self):
        return f"<Func {self.name}({self.params}) -> {self.type}>"
