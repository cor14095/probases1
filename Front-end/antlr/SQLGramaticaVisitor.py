# Generated from gramatica/SQLGramatica.g4 by ANTLR 4.6
from antlr4 import *

# This class defines a complete generic visitor for a parse tree produced by SQLGramaticaParser.

class SQLGramaticaVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by SQLGramaticaParser#literal.
    def visitLiteral(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#fecha.
    def visitFecha(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#programa.
    def visitPrograma(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#database.
    def visitDatabase(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#createDatabase.
    def visitCreateDatabase(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#alterDatabase.
    def visitAlterDatabase(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#dropDatabase.
    def visitDropDatabase(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#showDatabase.
    def visitShowDatabase(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#useDatabase.
    def visitUseDatabase(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#opTable.
    def visitOpTable(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#tipo.
    def visitTipo(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#createTable.
    def visitCreateTable(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#constraint.
    def visitConstraint(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#primaryKey.
    def visitPrimaryKey(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#foreignKey.
    def visitForeignKey(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#check.
    def visitCheck(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#exp.
    def visitExp(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#expression.
    def visitExpression(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#andExpr.
    def visitAndExpr(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#eqExpr.
    def visitEqExpr(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#relationExpr.
    def visitRelationExpr(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#unaryExpr.
    def visitUnaryExpr(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#alterTable.
    def visitAlterTable(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#action.
    def visitAction(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#dropTable.
    def visitDropTable(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#showTables.
    def visitShowTables(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#showColumns.
    def visitShowColumns(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#insertInto.
    def visitInsertInto(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#updateSet.
    def visitUpdateSet(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#deleteFrom.
    def visitDeleteFrom(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#selectFrom.
    def visitSelectFrom(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#sep.
    def visitSep(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#rel_op.
    def visitRel_op(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#eq_op.
    def visitEq_op(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#add_op.
    def visitAdd_op(self, ctx):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLGramaticaParser#mult_op.
    def visitMult_op(self, ctx):
        return self.visitChildren(ctx)


