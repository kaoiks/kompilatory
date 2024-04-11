import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class App {
    public static void main(String[] args) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream(args[0]);

        PolskiJSLexer lexer = new PolskiJSLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PolskiJSParser parser = new PolskiJSParser(tokens);

        ParseTree tree = parser.prog(); 

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(), tree);
    }
}
