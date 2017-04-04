import sys
import logging

from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener

# This class will 'override' the actual ErrorListener
# It'll collect all errors in a file and save the file at:
# -> output/errors.txt
# Base code from:
# -> http://stackoverflow.com/a/32228598/4808919
class ParserErrorListener( ErrorListener ):

    logging.basicConfig(level=logging.DEBUG, filename='..\web\static\parserErrors.log')
    sys.tracebacklimit = 0

    def __init__(self):
        super(ParserErrorListener, self).__init__()

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        #print msg
        logging.error(" Syntax error at line %s:%s.\nError: %s.", line, column, msg)
        #raise Exception(msg)

    def reportAmbiguity(self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs):
        #print msg
        logging.error(" Ambiguity from %s to %s, is known: %s.", startIndex, stopIndex, exact)
        #raise Exception(msg)

    def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
        #print msg
        logging.error(" Attempting Full Context from %s to %s.", startIndex, stopIndex)
        #raise Exception(msg)

    def reportContextSensitivity(self, recognizer, dfa, startIndex, stopIndex, prediction, configs):
        #print msg
        logging.error(" Context Sensitivity from %s to %s prediction at %s", startIndex, stopIndex, prediction)
        #raise Exception(msg)
