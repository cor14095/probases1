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

# Main function definition
def runSQL(path):
    # Inputs and file creations.
    file = open("..\web\static\parserErrors.log", "w")
    input = FileStream(path)

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
