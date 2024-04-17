import java.util.HashMap;
import java.util.HashSet;
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
    
   HashMap<String, VarType> globalVariables = new HashMap<String, VarType>();
   HashMap<String, VarType> localVariables = new HashMap<String, VarType>();
   HashSet<String> functions = new HashSet<String>();
   Stack<Value> stack = new Stack<Value>();
   String remainingLoops, currentFunction;
   Boolean isGlobal;

   @Override 
   public void enterProg(PolskiJSParser.ProgContext ctx) { 
      isGlobal = true;
   }

   @Override
   public void enterFunctionblock(PolskiJSParser.FunctionblockContext ctx) {
      isGlobal = false;
   }

   @Override
    public void exitFunctionblock(PolskiJSParser.FunctionblockContext ctx) {
       if( localVariables.get(currentFunction) != null )
       {
         LLVMGenerator.assign_i32(assignVariable(currentFunction), "0");
       }
       LLVMGenerator.load_i32( "%" + currentFunction );
       LLVMGenerator.functionend();
       localVariables = new HashMap<String, VarType>();
       isGlobal = true;
    }

   @Override 
   public void exitFunctionargument(PolskiJSParser.FunctionargumentContext ctx) {
      String ID = ctx.ID().getText();
      functions.add(ID); 
      currentFunction = ID;
      LLVMGenerator.functionstart(ID);
   }

    @Override
    public void exitAssign(PolskiJSParser.AssignContext ctx) { 
      String ID = ctx.ID().getText();
      assignVariable(ID);
    }

    @Override 
    public void exitProg(PolskiJSParser.ProgContext ctx) { 
      LLVMGenerator.close_main();
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
      String v1Name = v1.name;
      String v2Name = v2.name;

      if(isGlobal)
      {
         v1Name = globalVariables.get(v1Name) == null ? v1Name : "@" + v1Name;
         v2Name = globalVariables.get(v2Name) == null ? v2Name : "@" + v2Name;
      }
      else
      {
         v1Name = localVariables.get(v1Name) == null ? v1Name : "%" + v1Name;
         v2Name = localVariables.get(v2Name) == null ? v2Name : "%" + v2Name;
      }
   
      if( v1.type == v2.type ) 
      {
         if( v1.type == VarType.INT )
         {
            LLVMGenerator.add_i32(v1Name, v2Name); 
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
         }
         if( v1.type == VarType.REAL )
         {
            LLVMGenerator.add_double(v1Name, v2Name); 
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) ); 
         }
      }
      else 
      {
         error(ctx.getStart().getLine(), "Błąd typów w dodawaniu");
      }
    }

    @Override 
    public void exitMult(PolskiJSParser.MultContext ctx) { 
      Value v1 = stack.pop();
      Value v2 = stack.pop();
      String v1Name = v1.name;
      String v2Name = v2.name;

      if(isGlobal)
      {
         v1Name = globalVariables.get(v1Name) == null ? v1Name : "@" + v1Name;
         v2Name = globalVariables.get(v2Name) == null ? v2Name : "@" + v2Name;
      }
      else
      {
         v1Name = localVariables.get(v1Name) == null ? v1Name : "%" + v1Name;
         v2Name = localVariables.get(v2Name) == null ? v2Name : "%" + v2Name;
      }

      if( v1.type == v2.type ) 
      {
	      if( v1.type == VarType.INT )
         {
            LLVMGenerator.mult_i32(v1Name, v2Name); 
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
         }
	      if( v1.type == VarType.REAL )
         {
            LLVMGenerator.mult_double(v1Name, v2Name); 
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) ); 
         }
      } 
      else 
      {
         error(ctx.getStart().getLine(), "Błąd typów w mnożeniu");
      }
    }

    @Override
    public void exitRead(PolskiJSParser.ReadContext ctx) {
      String ID = ctx.ID().getText();
      VarType type;

      if(isGlobal)
      {
         type = globalVariables.get(ID);
      }
      else{
         type = localVariables.get(ID);
      }

      if( type == null ) 
      {
         error(ctx.getStart().getLine(), "Nieznana zmienna: " + ID);
         return;
      } 
      if (type == VarType.INT) 
      {
         LLVMGenerator.scanf_i32(isGlobal ? "@" + ID : "%" + ID);
      } 
      else if (type == VarType.REAL) 
      {
         LLVMGenerator.scanf_double(isGlobal ? "@" + ID : "%" + ID);
      } 
      else 
      {
         error(ctx.getStart().getLine(), "Nieprawidłowy typ zmiennej: " + ID);
      }
    } 

    @Override
    public void exitWrite(PolskiJSParser.WriteContext ctx) {
      String ID = ctx.ID().getText();
      VarType type = globalVariables.get(ID);

      if( type != null ) 
      {
         if( type == VarType.INT )
         {
            LLVMGenerator.printf_i32( isGlobal ? "@" + ID : "%" + ID );
         }
         if( type == VarType.REAL )
         {
            LLVMGenerator.printf_double( isGlobal ? "@" + ID : "%" + ID );
         }
      } 
      else 
      {
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

      if( globalVariables.get(ID) != null ) 
      {
         LLVMGenerator.icmp( isGlobal ? "@" + ID : "%" + ID, INT );
      } 
      else 
      {
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
      if( ctx.ID() != null )
      {
         String ID = ctx.ID().getText();
         VarType variable;

         if(isGlobal)
         {
            variable = globalVariables.get(ID);
         }
         else
         {
            variable = localVariables.get(ID);
         }

         if( variable != null) 
         {
            LLVMGenerator.load_i32(isGlobal ? "@" + ID : "%" + ID);
            remainingLoops = "%"+(LLVMGenerator.reg-1); 
         } 
         else 
         {
            error(ctx.getStart().getLine(), "Nieznana zmienna: "+ID);     
         }
      }
      if( ctx.INT() != null )
      {
         remainingLoops = ctx.INT().getText();     
      } 
   }

   @Override
   public void exitBlock(PolskiJSParser.BlockContext ctx) {
      if( ctx.getParent() instanceof PolskiJSParser.LoopContext )
      {
         LLVMGenerator.loopend();
      }
   }

   public String assignVariable(String ID){
      String id;
      Value v = stack.pop();

      if( v.type == VarType.INT )
      {
         LLVMGenerator.declare_i32(ID, isGlobal);
         LLVMGenerator.assign_i32(isGlobal ? "@" + ID : "%" + ID, v.name);
      } 
      if( v.type == VarType.REAL )
      {
         LLVMGenerator.declare_double(ID, isGlobal);
         LLVMGenerator.assign_double(isGlobal ? "@" + ID : "%" + ID, v.name);
      }

      if(isGlobal)
      {
         globalVariables.put(ID, v.type);
         id = "@" + ID;
      }
      else{
         localVariables.put(ID, v.type);
         id = "%" + ID;
      }

      return id;
   }

   void error(int line, String msg){
       System.err.println("Błąd w linii: "+line+", "+msg);
       System.exit(1);
   } 
       
}