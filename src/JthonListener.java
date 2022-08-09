package codes;// Generated from /Users/nic/IdeaProjects/TestAgainAntlrProjectFuckIT/src/Jthon.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JthonParser}.
 */
public interface JthonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JthonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JthonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JthonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#importclass}.
	 * @param ctx the parse tree
	 */
	void enterImportclass(JthonParser.ImportclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#importclass}.
	 * @param ctx the parse tree
	 */
	void exitImportclass(JthonParser.ImportclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(JthonParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(JthonParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(JthonParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(JthonParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(JthonParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(JthonParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void enterArrayDec(JthonParser.ArrayDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void exitArrayDec(JthonParser.ArrayDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#forArray}.
	 * @param ctx the parse tree
	 */
	void enterForArray(JthonParser.ForArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#forArray}.
	 * @param ctx the parse tree
	 */
	void exitForArray(JthonParser.ForArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#methodDec}.
	 * @param ctx the parse tree
	 */
	void enterMethodDec(JthonParser.MethodDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#methodDec}.
	 * @param ctx the parse tree
	 */
	void exitMethodDec(JthonParser.MethodDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(JthonParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(JthonParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(JthonParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(JthonParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JthonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JthonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#return_statment}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statment(JthonParser.Return_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#return_statment}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statment(JthonParser.Return_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#if_statment}.
	 * @param ctx the parse tree
	 */
	void enterIf_statment(JthonParser.If_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#if_statment}.
	 * @param ctx the parse tree
	 */
	void exitIf_statment(JthonParser.If_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#while_statment}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statment(JthonParser.While_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#while_statment}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statment(JthonParser.While_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#if_else_statment}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_statment(JthonParser.If_else_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#if_else_statment}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_statment(JthonParser.If_else_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#print_statment}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statment(JthonParser.Print_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#print_statment}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statment(JthonParser.Print_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#for_statment}.
	 * @param ctx the parse tree
	 */
	void enterFor_statment(JthonParser.For_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#for_statment}.
	 * @param ctx the parse tree
	 */
	void exitFor_statment(JthonParser.For_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(JthonParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(JthonParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JthonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JthonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#conditionn}.
	 * @param ctx the parse tree
	 */
	void enterConditionn(JthonParser.ConditionnContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#conditionn}.
	 * @param ctx the parse tree
	 */
	void exitConditionn(JthonParser.ConditionnContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(JthonParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(JthonParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#assignmentt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentt(JthonParser.AssignmenttContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#assignmentt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentt(JthonParser.AssignmenttContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#secondLevel}.
	 * @param ctx the parse tree
	 */
	void enterSecondLevel(JthonParser.SecondLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#secondLevel}.
	 * @param ctx the parse tree
	 */
	void exitSecondLevel(JthonParser.SecondLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#thirdLevel}.
	 * @param ctx the parse tree
	 */
	void enterThirdLevel(JthonParser.ThirdLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#thirdLevel}.
	 * @param ctx the parse tree
	 */
	void exitThirdLevel(JthonParser.ThirdLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#fourthLevel}.
	 * @param ctx the parse tree
	 */
	void enterFourthLevel(JthonParser.FourthLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#fourthLevel}.
	 * @param ctx the parse tree
	 */
	void exitFourthLevel(JthonParser.FourthLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#fifthLevel}.
	 * @param ctx the parse tree
	 */
	void enterFifthLevel(JthonParser.FifthLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#fifthLevel}.
	 * @param ctx the parse tree
	 */
	void exitFifthLevel(JthonParser.FifthLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#sixLevel}.
	 * @param ctx the parse tree
	 */
	void enterSixLevel(JthonParser.SixLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#sixLevel}.
	 * @param ctx the parse tree
	 */
	void exitSixLevel(JthonParser.SixLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#seventhLevel}.
	 * @param ctx the parse tree
	 */
	void enterSeventhLevel(JthonParser.SeventhLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#seventhLevel}.
	 * @param ctx the parse tree
	 */
	void exitSeventhLevel(JthonParser.SeventhLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#eightLevel}.
	 * @param ctx the parse tree
	 */
	void enterEightLevel(JthonParser.EightLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#eightLevel}.
	 * @param ctx the parse tree
	 */
	void exitEightLevel(JthonParser.EightLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(JthonParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(JthonParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(JthonParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(JthonParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexp(JthonParser.PrefixexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexp(JthonParser.PrefixexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(JthonParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(JthonParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(JthonParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(JthonParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#assignment_operators}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operators(JthonParser.Assignment_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#assignment_operators}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operators(JthonParser.Assignment_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JthonParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JthonParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JthonParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JthonParser.TypeContext ctx);
}