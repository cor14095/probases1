import sys
import logging

from antlr4 import *
from SQLGramaticaLexer import SQLGramaticaLexer
from SQLGramaticaParser import SQLGramaticaParser
from ParserErrorListener import ParserErrorListener
from SQLGramaticaListener import SQLGramaticaListener

# global DBName
currentDatabase = ''

# getDBName returns the set DBName.
def getDBName ():
    return currentDatabase

# setDBName sets the name for current database
def setDBName (name):
    global currentDatabase
    currentDatabase = name

# Printer class.
class SQLGramaticaPrintListener(SQLGramaticaListener):
    def enterDatabase(self, ctx):
        # Here is the fucked up part, first I have to know how many childs it has.
        childs = ctx.getChildCount()
        # If childs > 3, then there're more than 2 querrys.
        # This loop will get me only the childs, not the ';'.
        for i in xrange(0,childs,2):
            # First I have to know if its a opTable or not.
            ctxChild = ctx.getChild(i)
            if (ctxChild.getChildCount() == 1):
                # This is a opTable
                print "opTable: " + ctxChild.getText()
                # Late work...
            else:
                # This is not an opTable
                print "notOPTable: " + ctxChild.getText()


        print "\nDatabase name: " + getDBName()

# Main function definition with a set database name
def runSQL(path, DBName):
    # Inputs and file creations.
    file = open("..\web\static\parserErrors.log", "w")
    input = FileStream(path)
    setDBName(DBName)

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
