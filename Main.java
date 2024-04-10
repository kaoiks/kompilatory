import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

import org.antlr.v4.runtime.CharStreams;

public class Main {
    public static void main(String[] args) throws IOException{
        // try{
        PolskiJSParser parser = new PolskiJSParser(new CommonTokenStream(new PolskiJSLexer(CharStreams.fromFileName("/mnt/c/studia_pw/kompilatory/test.pljs"))));
        // }
        //  catch (IOException e) {
        //     System.out.println("Error reading file: " + e.getMessage());
        // } 
        ParseTree tree = parser.prog(); 
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(), tree);

    }

    // public static void main(String[] args) throws Exception {

    //     CharStream input = CharStreams.fromFileName(args[0]);

    //     LangXLexer lexer = new LangXLexer(input);

    //     CommonTokenStream tokens = new CommonTokenStream(lexer);
    //     LangXParser parser = new LangXParser(tokens);

    //     ParseTree tree = parser.prog(); 

    //     //System.out.println(tree.toStringTree(parser));

    //     ParseTreeWalker walker = new ParseTreeWalker();
    //     walker.walk(new LLVMActions(), tree);

    // }

}


