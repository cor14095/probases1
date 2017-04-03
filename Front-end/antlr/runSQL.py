import sys
from antlr4 import *
from SQLGramaticaLexer import SQLGramaticaLexer
from SQLGramaticaParser import SQLGramaticaParser
from antlr4.error.ErrorListener import ErrorListener

# This class will 'override' the actual ErrorListener
# It'll collect all errors in a file and save the file at:
# -> output/errors.txt
# Base code from:
# -> http://stackoverflow.com/a/32228598/4808919
class ParserErrorListener( ErrorListener ):

    def __init__(self):
        super(ParserErrorListener, self).__init__()

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print "OH SHIT WADUP!"
        #raise Exception("Oh no!!")

    def reportAmbiguity(self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs):
        print "OH SHIT WADUP!"
        #raise Exception("Oh no!!")

    def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
        print "OH SHIT WADUP!"
        #raise Exception("Oh no!!")

    def reportContextSensitivity(self, recognizer, dfa, startIndex, stopIndex, prediction, configs):
        print "OH SHIT WADUP!"
        #raise Exception("Oh no!!")

def main(argv):
    input = FileStream(argv[1])
    lexer = SQLGramaticaLexer(input)
    stream = CommonTokenStream(lexer)
    parser = SQLGramaticaParser(stream)
    parser._listeners = [ ParserErrorListener() ]
    tree = parser.database()

if __name__ == '__main__':
    main(sys.argv)
