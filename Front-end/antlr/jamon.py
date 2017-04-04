import sys
import logging

from antlr4 import *
from SQLGramaticaLexer import SQLGramaticaLexer
from SQLGramaticaParser import SQLGramaticaParser
from ParserErrorListener import ParserErrorListener
from SQLGramaticaListener import SQLGramaticaListener

def test(path):
    return path