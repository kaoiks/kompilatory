import java.util.HashMap;
import java.util.Stack;

enum VarType{ INT, REAL, UNKNOWN }

class Value{ 
	public String name;
	public VarType type;
	public Value( String name, VarType type ){
		this.name = name;
		this.type = type;
	}
}

public class LLVMActions extends PolskiJSBaseListener {
    
    HashMap<String, VarType> variables = new HashMap<String, VarType>();
    Stack<Value> stack = new Stack<Value>();
    String remainingLoops;

    @Override
    public void exitAssign(PolskiJSParser.AssignContext ctx) { 
       String ID = ctx.ID().getText();
       Value v = stack.pop();
       variables.put(ID, v.type);
       if( v.type == VarType.INT ){
         LLVMGenerator.declare_i32(ID);
         LLVMGenerator.assign_i32(ID, v.name);
       } 
       if( v.type == VarType.REAL ){
         LLVMGenerator.declare_double(ID);
         LLVMGenerator.assign_double(ID, v.name);
       } 
    }

    @Override 
    public void exitProg(PolskiJSParser.ProgContext ctx) { 
       System.out.println( LLVMGenerator.generate() );
    }

    @Override 
    public void exitInt(PolskiJSParser.IntContext ctx) { 
         stack.push( new Value(ctx.INT().getText(), VarType.INT) );       
    } 

    @Override 
    public void exitReal(PolskiJSParser.RealContext ctx) { 
         stack.push( new Value(ctx.REAL().getText(), VarType.REAL) );       
    } 

    @Override 
    public void exitAdd(PolskiJSParser.AddContext ctx) { 
       Value v1 = stack.pop();
       Value v2 = stack.pop();
       if( v1.type == v2.type ) {
	  if( v1.type == VarType.INT ){
             LLVMGenerator.add_i32(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
          }
	  if( v1.type == VarType.REAL ){
             LLVMGenerator.add_double(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) ); 
         }
       } else {
          error(ctx.getStart().getLine(), "Błąd typów w dodawaniu");
       }
    }

    @Override 
    public void exitMult(PolskiJSParser.MultContext ctx) { 
       Value v1 = stack.pop();
       Value v2 = stack.pop();
       if( v1.type == v2.type ) {
	  if( v1.type == VarType.INT ){
             LLVMGenerator.mult_i32(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
          }
	  if( v1.type == VarType.REAL ){
             LLVMGenerator.mult_double(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) ); 
         }
       } else {
          error(ctx.getStart().getLine(), "Błąd typów w mnożeniu");
       }
    }

    @Override
    public void exitRead(PolskiJSParser.ReadContext ctx) {
       String ID = ctx.ID().getText();
       VarType type = variables.get(ID);
       if( type == null ) {
         error(ctx.getStart().getLine(), "Nieznana zmienna: " + ID);
         return;
      } 

       if (type == VarType.INT) {

          LLVMGenerator.scanf_i32(ID);
       } else if (type == VarType.REAL) {
          LLVMGenerator.scanf_double(ID);
       } else {
          error(ctx.getStart().getLine(), "Nieprawidłowy typ zmiennej: " + ID);
       }
    } 

    @Override
    public void exitWrite(PolskiJSParser.WriteContext ctx) {
       String ID = ctx.ID().getText();
       VarType type = variables.get(ID);
       if( type != null ) {
          if( type == VarType.INT ){
            LLVMGenerator.printf_i32( ID );
          }
          if( type == VarType.REAL ){
            LLVMGenerator.printf_double( ID );
          }
       } else {
          error(ctx.getStart().getLine(), "Nieznana zmienna: "+ID);
       }
    }

   @Override
   public void enterIfblock(PolskiJSParser.IfblockContext ctx) {
      LLVMGenerator.ifstart();
   }

   @Override
   public void exitIfblock(PolskiJSParser.IfblockContext ctx) {
      LLVMGenerator.ifend();
   }
   
   @Override
   public void exitIsEqual(PolskiJSParser.IsEqualContext ctx) { 
      String ID = ctx.ID().getText();
      String INT = ctx.INT().getText();
      if( variables.get(ID) != null ) {
         LLVMGenerator.icmp( ID, INT );
      } else {
         ctx.getStart().getLine();
         error(ctx.getStart().getLine(), "Nieznana zmienna: "+ID);      
      }
   }

   @Override
   public void exitLoopscount(PolskiJSParser.LoopscountContext ctx) { 
      LLVMGenerator.loopstart(remainingLoops);
   }

   @Override 
   public void exitLoopscountvalue(PolskiJSParser.LoopscountvalueContext ctx) { 
      if( ctx.ID() != null ){
         String ID = ctx.ID().getText();     
         if( variables.get(ID) != null) {
            LLVMGenerator.load_i32(ID);
            remainingLoops = "%"+(LLVMGenerator.reg-1); 
         } else {
            error(ctx.getStart().getLine(), "Nieznana zmienna: "+ID);     
         }
      }
      if( ctx.INT() != null ){
         remainingLoops = ctx.INT().getText();     
      } 
   }

   @Override
   public void exitBlock(PolskiJSParser.BlockContext ctx) {
      if( ctx.getParent() instanceof PolskiJSParser.LoopContext ){
         LLVMGenerator.loopend();
      }
   }

   void error(int line, String msg){
       System.err.println("Błąd w linii: "+line+", "+msg);
       System.exit(1);
   } 
       
}