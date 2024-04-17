import java.util.Stack;

class LLVMGenerator{
   
   static String header_text = "";
   static String main_text = "";
   static int reg = 1;
   static int main_reg = 1;
   static int br = 0;
   static String buffer = "";

   static Stack<Integer> brstack = new Stack<Integer>();
 
   static void scanf_i32(String id){
      buffer += "%"+reg+" = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @int_scan_format, i32 0, i32 0), i32* "+id+")\n";
      reg++;      
   }

   static void printf_i32(String id){
      buffer += "%"+reg+" = load i32, i32* "+id+"\n";
      reg++;
      buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_print_format, i32 0, i32 0), i32 %"+(reg-1)+")\n";
      reg++;
   }

   static void scanf_double(String id){
      buffer += "%"+reg+" = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @double_scan_format, i32 0, i32 0), double* "+id+")\n";
      reg++;      
   }
 
   static void printf_double(String id){
      buffer += "%"+reg+" = load double, double* "+id+"\n";
      reg++;
      buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @double_print_format, i32 0, i32 0), double %"+(reg-1)+")\n";
      reg++;
    }
 
    static void declare_i32(String id, Boolean isGlobal){
      if(isGlobal)
      {
        header_text += "@"+id+" = global i32 0\n";
      }
      else
      {
        buffer += "%"+id+" = alloca i32\n";
      }
    }
 
    static void declare_double(String id, Boolean isGlobal){
      if(isGlobal)
      {
        header_text += "@"+id+" = global double 0.0\n";
      }
      else
      {
        buffer += "%"+id+" = alloca double\n";
      }
    }
 
    static void assign_i32(String id, String value){
      buffer += "store i32 "+value+", i32* "+id+"\n";
    }
 
    static void assign_double(String id, String value){
      buffer += "store double "+value+", double* "+id+"\n";
    }
 
    static void load_i32(String id){
      buffer += "%"+reg+" = load i32, i32* "+id+"\n";
      reg++;
    }
 
    static void load_double(String id){
      buffer += "%"+reg+" = load double, double* "+id+"\n";
      reg++;
    }
 
    static void add_i32(String val1, String val2){
      buffer += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
      reg++;
    }
 
    static void add_double(String val1, String val2){
      buffer += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
      reg++;
    }
 
    static void mult_i32(String val1, String val2){
      buffer += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
      reg++;
    }
 
    static void mult_double(String val1, String val2){
      buffer += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
      reg++;
    }

    static void icmp(String id, String value){
     buffer += "%"+reg+" = load i32, i32* "+id+"\n";
     reg++;
     buffer += "%"+reg+" = icmp eq i32 "+(reg-1)+", "+value+"\n";
     reg++;
   }

   static void ifstart(){
     br++;
     buffer += "br i1 %"+(reg-1)+", label %true"+br+", label %false"+br+"\n";
     buffer += "true"+br+":\n";
     brstack.push(br);
   }

   static void ifend(){
     int b = brstack.pop();
     buffer += "br label %false"+b+"\n";
     buffer += "false"+b+":\n";
   }

    static void loopstart(String loop){
     declare_i32(Integer.toString(reg), false);
     int counter = reg;
     reg++;
     assign_i32("%" + Integer.toString(counter), "0");    
     br++;
     buffer += "br label %cond"+br+"\n";
     buffer += "cond"+br+":\n";

     load_i32("%" + Integer.toString(counter));
     add_i32("%"+(reg-1), "1");
     assign_i32("%" + Integer.toString(counter), "%"+(reg-1));

     buffer += "%"+reg+" = icmp slt i32 %"+(reg-2)+", "+loop+"\n";
     reg++;

     buffer += "br i1 %"+(reg-1)+", label %true"+br+", label %false"+br+"\n";
     buffer += "true"+br+":\n";
     brstack.push(br);
   }

   static void loopend(){
     int b = brstack.pop();
     buffer += "br label %cond"+b+"\n";
     buffer += "false"+b+":\n";
   }

    static void functionstart(String id){
      main_text += buffer;
      main_reg = reg;
      buffer = "define i32 @"+id+"() nounwind {\n";
      reg = 1;
   }

   static void functionend(){
      buffer += "ret i32 %"+(reg-1)+"\n"; 
      buffer += "}\n";
      header_text += buffer;
      buffer = "";
      reg = main_reg;
   }

    static void close_main(){
      main_text += buffer;
   }
 
    static String generate(){
      String text = "";
      text += "declare i32 @printf(i8*, ...)\n";
      text += "declare i32 @scanf(i8*, ...)\n";
      text += "@int_print_format = constant [4 x i8] c\"%d\\0A\\00\"\n";
      text += "@int_scan_format = constant [3 x i8] c\"%d\\00\"\n";
      text += "@double_print_format = constant [5 x i8] c\"%lf\\0A\\00\"\n";
      text += "@double_scan_format = constant [4 x i8] c\"%lf\\00\"\n";
      text += header_text;
      text += "define i32 @main() nounwind{\n";
      text += main_text;
      text += "ret i32 0 }\n";
      return text;
   }
 
 }