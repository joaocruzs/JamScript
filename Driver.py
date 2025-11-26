import sys
from antlr4 import *
from JamScriptLexer import JamScriptLexer
from JamScriptParser import JamScriptParser
#from VisitorInterp import VisitorInterp

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = JamScriptLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = JamScriptParser(stream)
    tree = parser.program()

if __name__ == '__main__':
    main(sys.argv)