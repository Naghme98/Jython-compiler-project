package codes;// Generated from /Users/nic/IdeaProjects/TestAgainAntlrProjectFuckIT/src/Jthon.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JthonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JthonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JthonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JthonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#importclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportclass(JthonParser.ImportclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(JthonParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(JthonParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(JthonParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#arrayDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDec(JthonParser.ArrayDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#forArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForArray(JthonParser.ForArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#methodDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDec(JthonParser.MethodDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(JthonParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(JthonParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JthonParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#return_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statment(JthonParser.Return_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#if_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statment(JthonParser.If_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#while_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statment(JthonParser.While_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#if_else_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_statment(JthonParser.If_else_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#print_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statment(JthonParser.Print_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#for_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statment(JthonParser.For_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(JthonParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JthonParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#conditionn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionn(JthonParser.ConditionnContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(JthonParser.LogicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#assignmentt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentt(JthonParser.AssignmenttContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#secondLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondLevel(JthonParser.SecondLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#thirdLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThirdLevel(JthonParser.ThirdLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#fourthLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFourthLevel(JthonParser.FourthLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#fifthLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFifthLevel(JthonParser.FifthLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#sixLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSixLevel(JthonParser.SixLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#seventhLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeventhLevel(JthonParser.SeventhLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#eightLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEightLevel(JthonParser.EightLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(JthonParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(JthonParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#prefixexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixexp(JthonParser.PrefixexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(JthonParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(JthonParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#assignment_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operators(JthonParser.Assignment_operatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JthonParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JthonParser.TypeContext ctx);
}