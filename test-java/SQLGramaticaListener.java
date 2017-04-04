// Generated from ../Front-end/antlr/gramatica/SQLGramatica.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLGramaticaParser}.
 */
public interface SQLGramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SQLGramaticaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SQLGramaticaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#fecha}.
	 * @param ctx the parse tree
	 */
	void enterFecha(SQLGramaticaParser.FechaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#fecha}.
	 * @param ctx the parse tree
	 */
	void exitFecha(SQLGramaticaParser.FechaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(SQLGramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(SQLGramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#database}.
	 * @param ctx the parse tree
	 */
	void enterDatabase(SQLGramaticaParser.DatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#database}.
	 * @param ctx the parse tree
	 */
	void exitDatabase(SQLGramaticaParser.DatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(SQLGramaticaParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(SQLGramaticaParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabase(SQLGramaticaParser.AlterDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabase(SQLGramaticaParser.AlterDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(SQLGramaticaParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(SQLGramaticaParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#showDatabase}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabase(SQLGramaticaParser.ShowDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#showDatabase}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabase(SQLGramaticaParser.ShowDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#useDatabase}.
	 * @param ctx the parse tree
	 */
	void enterUseDatabase(SQLGramaticaParser.UseDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#useDatabase}.
	 * @param ctx the parse tree
	 */
	void exitUseDatabase(SQLGramaticaParser.UseDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#opTable}.
	 * @param ctx the parse tree
	 */
	void enterOpTable(SQLGramaticaParser.OpTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#opTable}.
	 * @param ctx the parse tree
	 */
	void exitOpTable(SQLGramaticaParser.OpTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(SQLGramaticaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(SQLGramaticaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(SQLGramaticaParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(SQLGramaticaParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(SQLGramaticaParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(SQLGramaticaParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(SQLGramaticaParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(SQLGramaticaParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#foreignKey}.
	 * @param ctx the parse tree
	 */
	void enterForeignKey(SQLGramaticaParser.ForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#foreignKey}.
	 * @param ctx the parse tree
	 */
	void exitForeignKey(SQLGramaticaParser.ForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheck(SQLGramaticaParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheck(SQLGramaticaParser.CheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(SQLGramaticaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(SQLGramaticaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(SQLGramaticaParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(SQLGramaticaParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(SQLGramaticaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(SQLGramaticaParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#equalsExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualsExpression(SQLGramaticaParser.EqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#equalsExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualsExpression(SQLGramaticaParser.EqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#relationExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpression(SQLGramaticaParser.RelationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#relationExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpression(SQLGramaticaParser.RelationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#addSubsExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubsExpression(SQLGramaticaParser.AddSubsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#addSubsExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubsExpression(SQLGramaticaParser.AddSubsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpression(SQLGramaticaParser.MulDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpression(SQLGramaticaParser.MulDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void enterBasicExpression(SQLGramaticaParser.BasicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void exitBasicExpression(SQLGramaticaParser.BasicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(SQLGramaticaParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(SQLGramaticaParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(SQLGramaticaParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(SQLGramaticaParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(SQLGramaticaParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(SQLGramaticaParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#showTables}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(SQLGramaticaParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#showTables}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(SQLGramaticaParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#showColumns}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(SQLGramaticaParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#showColumns}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(SQLGramaticaParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertInto(SQLGramaticaParser.InsertIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertInto(SQLGramaticaParser.InsertIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#updateSet}.
	 * @param ctx the parse tree
	 */
	void enterUpdateSet(SQLGramaticaParser.UpdateSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#updateSet}.
	 * @param ctx the parse tree
	 */
	void exitUpdateSet(SQLGramaticaParser.UpdateSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#deleteFrom}.
	 * @param ctx the parse tree
	 */
	void enterDeleteFrom(SQLGramaticaParser.DeleteFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#deleteFrom}.
	 * @param ctx the parse tree
	 */
	void exitDeleteFrom(SQLGramaticaParser.DeleteFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#selectFrom}.
	 * @param ctx the parse tree
	 */
	void enterSelectFrom(SQLGramaticaParser.SelectFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#selectFrom}.
	 * @param ctx the parse tree
	 */
	void exitSelectFrom(SQLGramaticaParser.SelectFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#sep}.
	 * @param ctx the parse tree
	 */
	void enterSep(SQLGramaticaParser.SepContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#sep}.
	 * @param ctx the parse tree
	 */
	void exitSep(SQLGramaticaParser.SepContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(SQLGramaticaParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(SQLGramaticaParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(SQLGramaticaParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(SQLGramaticaParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#add_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_op(SQLGramaticaParser.Add_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#add_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_op(SQLGramaticaParser.Add_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLGramaticaParser#mult_op}.
	 * @param ctx the parse tree
	 */
	void enterMult_op(SQLGramaticaParser.Mult_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLGramaticaParser#mult_op}.
	 * @param ctx the parse tree
	 */
	void exitMult_op(SQLGramaticaParser.Mult_opContext ctx);
}