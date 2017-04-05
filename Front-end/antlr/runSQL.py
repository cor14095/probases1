import sys
sys.path.append('../../Back-end')
import logging
import csvHandler
#import numpy as np

from antlr4 import *
from SQLGramaticaLexer import SQLGramaticaLexer
from SQLGramaticaParser import SQLGramaticaParser
from ParserErrorListener import ParserErrorListener
from SQLGramaticaListener import SQLGramaticaListener

# global DBName
currentDatabase = ''
# Global output string.
outputString = ''

# getOutput() returns the global output string
def getOutput():
    return outputString

# addOutput() adds a output message to the global string.
def addOutput(msg):
    global outputString
    outputString += msg + "\n"

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
        jsons = []
        # If childs > 3, then there're more than 2 querrys.
        # This loop will get me only the childs, not the ';'.
        for i in xrange(0,childs,2):
            # First I have to know if its a opTable or not.
            ctxChild = ctx.getChild(i)
            if (ctxChild.getChildCount() == 1):
                # This is a opTable
                print "opTable: " + ctxChild.getText()
                # Got down 1 more to get the actual content.
                ctxChild = ctxChild.getChild(0)
                # Get the first child of each query.
                qType = ctxChild.getChild(0).getText()
                print qType
                # Create a last outout message
                lastMsg = ""
                # The last matrix to generate a CSV
                lastCSV = []
                # Check what to do:
                if (qType.upper() == "CREATE"):
                    # CREATE comand
                    createJson = {}
                    createJson["tableName"] = ctxChild.getChild(2).getText()
                    # I need to know what is pk and fk.
                    # Find pks.
                    pks = ""
                    fks = ""
                    cCount = 0
                    while (ctxChild.getChild(cCount).getText() != "CONSTRAINT"):
                        cCount += 1
                    # Now pkCount is at the first CONSTRAINT.
                    while (ctxChild.getChild(cCount).getText() != ")"):
                        thisCon = ctxChild.getChild(cCount + 1).getChild(0)
                        print ctxChild.getChild(cCount).getText()
                        if (thisCon.getChild(1).getText() == "PRIMARY"):
                            # This is a pk.
                            for j in xrange(4,thisCon.getChildCount() - 1):
                                pks += thisCon.getChild(j).getText() + ","
                        elif (thisCon.getChild(1).getText() == "FOREIGN"):
                            # This is a fk.
                            for j in xrange(4,thisCon.getChildCount() - 1):
                                fks += thisCon.getChild(j).getText() + ","
                        else:
                            # This is a Check.
                            print (thisCon.getText())
                        cCount += 3
                        print cCount, ctxChild.getChildCount()
                        if cCount >= ctxChild.getChildCount() :
                            cCount = ctxChild.getChildCount() - 1
                    print pks, fks
                    colums = []
                    colCount = 4
                    while (ctxChild.getChild(colCount).getText != "CONSTRAINT"):
                        col = {}
                        col["columnName"] = ctxChild.getChild(colCount).getText()
                        col["key"] = ctxChild.getChild(colCount)
                else:
                    msg = "Unkown querry - " + ctxChild.getText()
                    addOutput(msg)
            else:
                # This is not an opTable
                #print "notOPTable: " + ctxChild.getText()
                # Get the first child of each query.
                qType = ctxChild.getChild(0).getText()
                print qType
                # Check what to do:
                if (qType.upper() == "CREATE"):
                    # CREATE comand
                    IDX = ctxChild.getChild(2).getText()
                    setDBName(IDX)
                    msg = csvHandler.createDatabase(IDX)
                    addOutput(msg)
                elif (qType.upper() == "ALTER"):
                    # ALTER comand
                    IDX = ctxChild.getChild(2).getText()
                    IDX2 = ctxChild.getChild(5).getText()
                    #msg = csvHandler.alterDatabase(IDX, IDX2)
                    #addOutput(msg)
                elif (qType.upper() == "DROP"):
                    # DROP comand
                    IDX = ctxChild.getChild(2).getText()
                    msg = csvHandler.dropDatabase(IDX)
                    addOutput(msg)
                elif (qType.upper() == "SHOW"):
                    # SHOW comand
                    msg = str(csvHandler.showDatabases())
                    addOutput(msg)
                elif (qType.upper() == "USE"):
                    # USE comand
                    IDX = ctxChild.getChild(2).getText()
                    msg = csvHandler.useDatabase(IDX)
                    addOutput(msg)
                else:
                    msg = "Unkown querry - " + ctxChild.getText()
                    addOutput(msg)

        #print "\nDatabase name: " + getDBName()

# Main function definition with a set database name
def runSQL(path, DBName):
    # Inputs and file creations.
    file = open("static/parserErrors.log", "w")
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

    print getOutput()
    return getOutput()
