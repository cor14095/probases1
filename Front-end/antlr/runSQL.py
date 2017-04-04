import sys
import logging

from antlr4 import *
from SQLGramaticaLexer import SQLGramaticaLexer
from SQLGramaticaParser import SQLGramaticaParser
from ParserErrorListener import ParserErrorListener
from SQLGramaticaListener import SQLGramaticaListener

# Printer class.
class SQLGramaticaPrintListener(SQLGramaticaListener):
    def enterDatabase(self, ctx):
        print("Hello: %s" % ctx.getText())

# MAIN PROGRAM CODE:

# Inputs and file creations.
file = open("..\web\static\parserErrors.log", "w")
input = FileStream(sys.argv[1])

# Compiling code.
lexer = SQLGramaticaLexer(input)
stream = CommonTokenStream(lexer)
parser = SQLGramaticaParser(stream)
parser._listeners = [ ParserErrorListener() ]
#  Parser tree visitor check
print "Entrar al arbol!"
tree = parser.database()
printer = SQLGramaticaPrintListener()
walker = ParseTreeWalker()
walker.walk(printer, tree)
print "Salir del arbol!"

file.close()
