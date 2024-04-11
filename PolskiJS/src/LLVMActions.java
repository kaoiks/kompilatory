
import java.util.HashSet;
import java.util.Stack;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class LLVMActions extends PolskiJSBaseListener {
   @Override public void enterProg(PolskiJSParser.ProgContext ctx) 
   {
      System.out.println("Enter prog");
   }

	@Override public void exitProg(PolskiJSParser.ProgContext ctx)
   {
      System.out.println("Exit prog");
   }

	@Override public void enterStatement(PolskiJSParser.StatementContext ctx) 
   { 
      System.out.println("Enter statement");
   }

	@Override public void exitStatement(PolskiJSParser.StatementContext ctx) 
   { 
      System.out.println("Exit statement");
   }

	@Override public void enterEveryRule(ParserRuleContext ctx) 
   { 
      System.out.println("Enter every rule");
   }

	@Override public void exitEveryRule(ParserRuleContext ctx) 
   { 
      System.out.println("Exit every rule");
   }

	@Override public void visitTerminal(TerminalNode node) 
   { 
      System.out.println("Visit terminal");
   }

	@Override public void visitErrorNode(ErrorNode node) 
   {
      System.out.println("Visit error node");
   }
}
