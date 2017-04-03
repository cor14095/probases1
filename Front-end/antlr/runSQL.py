import sys
import logging

from antlr4 import *
from SQLGramaticaLexer import SQLGramaticaLexer
from SQLGramaticaParser import SQLGramaticaParser
from ParserErrorListener import ParserErrorListener

# Main function definition
def main(argv):
    input = FileStream(argv[1])
    lexer = SQLGramaticaLexer(input)
    stream = CommonTokenStream(lexer)
    parser = SQLGramaticaParser(stream)
    parser._listeners = [ ParserErrorListener() ]
    tree = parser.database()

# MAIN PROGRAM CODE:

file = open("output/parserErrors.log", "w")

if __name__ == '__main__':
    main(sys.argv)

file.close()
