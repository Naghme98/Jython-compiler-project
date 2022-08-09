
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import codes.*;
import ToParse.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File path = new File(".//input1.txt");
        FileInputStream fileInputStream = new FileInputStream(path);
        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(fileInputStream);
        // create a lexer that feeds off of input CharStream
        JthonLexer lexer = new JthonLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        JthonParser parser = new JthonParser(tokens);
        ParseTree tree = parser.program(); // begin parsing at init rule
        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
        // Walk the tree created during the parse, trigger callbacks
        walker.walk(new MyListener(), tree);
        System.out.println(); // print a \n after translation

    }

}
