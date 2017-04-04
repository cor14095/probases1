# Generated from gramatica/SQLGramatica.g4 by ANTLR 4.7
from antlr4 import *

# This class defines a complete listener for a parse tree produced by SQLGramaticaParser.
class SQLGramaticaListener(ParseTreeListener):

    # Enter a parse tree produced by SQLGramaticaParser#literal.
    def enterLiteral(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#literal.
    def exitLiteral(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#fecha.
    def enterFecha(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#fecha.
    def exitFecha(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#programa.
    def enterPrograma(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#programa.
    def exitPrograma(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#database.
    def enterDatabase(self, ctx):
        print("Hello: %s" % ctx.ID )
        pass

    # Exit a parse tree produced by SQLGramaticaParser#database.
    def exitDatabase(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#createDatabase.
    def enterCreateDatabase(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#createDatabase.
    def exitCreateDatabase(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#alterDatabase.
    def enterAlterDatabase(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#alterDatabase.
    def exitAlterDatabase(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#dropDatabase.
    def enterDropDatabase(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#dropDatabase.
    def exitDropDatabase(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#showDatabase.
    def enterShowDatabase(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#showDatabase.
    def exitShowDatabase(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#useDatabase.
    def enterUseDatabase(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#useDatabase.
    def exitUseDatabase(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#opTable.
    def enterOpTable(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#opTable.
    def exitOpTable(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#tipo.
    def enterTipo(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#tipo.
    def exitTipo(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#createTable.
    def enterCreateTable(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#createTable.
    def exitCreateTable(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#constraint.
    def enterConstraint(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#constraint.
    def exitConstraint(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#primaryKey.
    def enterPrimaryKey(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#primaryKey.
    def exitPrimaryKey(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#foreignKey.
    def enterForeignKey(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#foreignKey.
    def exitForeignKey(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#check.
    def enterCheck(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#check.
    def exitCheck(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#exp.
    def enterExp(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#exp.
    def exitExp(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#orExpression.
    def enterOrExpression(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#orExpression.
    def exitOrExpression(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#andExpression.
    def enterAndExpression(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#andExpression.
    def exitAndExpression(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#equalsExpression.
    def enterEqualsExpression(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#equalsExpression.
    def exitEqualsExpression(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#relationExpression.
    def enterRelationExpression(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#relationExpression.
    def exitRelationExpression(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#addSubsExpression.
    def enterAddSubsExpression(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#addSubsExpression.
    def exitAddSubsExpression(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#mulDivExpression.
    def enterMulDivExpression(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#mulDivExpression.
    def exitMulDivExpression(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#basicExpression.
    def enterBasicExpression(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#basicExpression.
    def exitBasicExpression(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#alterTable.
    def enterAlterTable(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#alterTable.
    def exitAlterTable(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#action.
    def enterAction(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#action.
    def exitAction(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#dropTable.
    def enterDropTable(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#dropTable.
    def exitDropTable(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#showTables.
    def enterShowTables(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#showTables.
    def exitShowTables(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#showColumns.
    def enterShowColumns(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#showColumns.
    def exitShowColumns(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#insertInto.
    def enterInsertInto(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#insertInto.
    def exitInsertInto(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#updateSet.
    def enterUpdateSet(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#updateSet.
    def exitUpdateSet(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#deleteFrom.
    def enterDeleteFrom(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#deleteFrom.
    def exitDeleteFrom(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#selectFrom.
    def enterSelectFrom(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#selectFrom.
    def exitSelectFrom(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#sep.
    def enterSep(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#sep.
    def exitSep(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#rel_op.
    def enterRel_op(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#rel_op.
    def exitRel_op(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#eq_op.
    def enterEq_op(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#eq_op.
    def exitEq_op(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#add_op.
    def enterAdd_op(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#add_op.
    def exitAdd_op(self, ctx):
        pass


    # Enter a parse tree produced by SQLGramaticaParser#mult_op.
    def enterMult_op(self, ctx):
        pass

    # Exit a parse tree produced by SQLGramaticaParser#mult_op.
    def exitMult_op(self, ctx):
        pass
