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
def main(argv):
    input = FileStream(argv[1])
    lexer = SQLGramaticaLexer(input)
    stream = CommonTokenStream(lexer)
    parser = SQLGramaticaParser(stream)
    parser._listeners = [ ParserErrorListener() ]
    print "Entrar al arbol!"
    tree = parser.database()
    printer = SQLGramaticaPrintListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)
    print "Salir del arbol!"

# MAIN PROGRAM CODE:

file = open("..\web\static\parserErrors.log", "w")

if __name__ == '__main__':
    main(sys.argv)

file.close()
