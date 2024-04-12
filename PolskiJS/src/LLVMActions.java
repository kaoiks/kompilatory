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
    public void exitToint(PolskiJSParser.TointContext ctx) { 
       Value v = stack.pop();
       LLVMGenerator.fptosi( v.name );
       stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
    }

    @Override 
    public void exitToreal(PolskiJSParser.TorealContext ctx) { 
       Value v = stack.pop();
       LLVMGenerator.sitofp( v.name );
       stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) ); 
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

          LLVMGenerator.scanf(ID);
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

   void error(int line, String msg){
       System.err.println("Błąd w linii: "+line+", "+msg);
       System.exit(1);
   } 
       
}