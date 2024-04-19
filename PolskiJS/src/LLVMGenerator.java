import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
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
      
        buffer += "%"+reg+" = add i32 "+val1+", "+val2+"\n";  // Use the formatted values
        reg++;
    }
    
    static void add_var_and_int(String variableName, String number) {
      if (!variableName.startsWith("@")) variableName = "@" + variableName;
      buffer += "%" + reg + " = load i32, i32* " + variableName + "\n";
      int loadReg = reg++; 

      buffer += "%" + reg + " = add i32 %" + loadReg + ", " + number + "\n";
      reg++;  
  } 

    static void add_var_and_double(String variableName, String number) {
      if (!variableName.startsWith("@")) variableName = "@" + variableName;
      buffer += "%" + reg + " = load double, double* " + variableName + "\n";
      int loadReg = reg++; 

      buffer += "%" + reg + " = fadd double %" + loadReg + ", " + number + "\n";
      reg++;    
    }
  
    static void add_double(String val1, String val2){
        // Similar check for double, assuming constants would be in normal double notation (could also be in scientific notation)
        val1 = val1.matches("-?\\d+(\\.\\d+)?([eE][-+]?\\d+)?") ? val1 : "%" + val1;  // Check if it's a double constant, otherwise prefix
        val2 = val2.matches("-?\\d+(\\.\\d+)?([eE][-+]?\\d+)?") ? val2 : "%" + val2;
    
        buffer += "%"+reg+" = fadd double "+val1+", "+val2+"\n";  // Use the formatted values
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
     buffer += "%"+reg+" = icmp eq i32 %"+(reg-1)+", "+value+"\n";
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
      // buffer += "ret i32 %"+(reg-1)+"\n"; 
      buffer += "ret i32 0 \n";
      buffer += "}\n";
      header_text += buffer;
      buffer = "";
      reg = main_reg;
   }

   static void call(String id){
      buffer += "%"+reg+" = call i32 @"+id+"()\n";
      reg++;
   }

    static void close_main(){
      main_text += buffer;
   }
 
    static String generate() {
      String text = "";
      text += "declare i32 @printf(i8*, ...)\n";
      text += "declare i32 @scanf(i8*, ...)\n";
      text += "@int_print_format = constant [4 x i8] c\"%d\\0A\\00\"\n";
      text += "@int_scan_format = constant [3 x i8] c\"%d\\00\"\n";
      text += "@double_print_format = constant [5 x i8] c\"%lf\\0A\\00\"\n";
      text += "@double_scan_format = constant [4 x i8] c\"%lf\\00\"\n";
      text += "@str_print_format = constant [3 x i8] c\"%s\\00\"\n";
      text += "@new_line = constant [2 x i8] c\"\\0A\\00\"\n";

      text += header_text;
      text += "define i32 @main() nounwind{\n";
      text += main_text;
      text += "ret i32 0 }\n";
      return text;
    }

   public static void deduct_i32(String v1Name, String v2Name) {
    buffer += "%" + reg + " = sub i32 " + v1Name + ", " + v2Name + "\n";
    reg++;
   }
    public static void deduct_double(String v1Name, String v2Name) {
        buffer += "%" + reg + " = fsub double " + v1Name + ", " + v2Name + "\n";
        reg++;
    }

    public static void div_double(String v2Name, String v1Name) {
        buffer += "%" + reg + " = fdiv double " + v2Name + ", " + v1Name + "\n";
        reg++;
    }
      public static void div_i32(String v2Name, String v1Name) {
        buffer += "%" + reg + " = sdiv i32 " + v2Name + ", " + v1Name + "\n";
        reg++;
    }
    
    static void declare_string(String id, String value, Boolean isGlobal) {
      int stringLength = Math.min(value.length(), 256); // Limit the string length to 256 characters

      if (isGlobal) {
          header_text += "@" + id + " = private unnamed_addr constant [" + (stringLength + 1) + " x i8] c\"" + value.substring(0, stringLength) + "\\00\"\n";
      } else {
          buffer += "%" + id + " = alloca i8*, align 8\n";
          buffer += "store i8* getelementptr inbounds ([" + (stringLength + 1) + " x i8], [" + (stringLength + 1) + " x i8]* @" + id + ", i32 0, i32 0), i8** %" + id + ", align 8\n";
      }
    }

  static void printf_string(String id) {
    // Assume the correct string length is known or predefined somewhere
    int stringLength = getStringLength(id.replace("@", "").replace("%", ""));  // You need a method to retrieve the correct length based on the variable name

    // Get a pointer to the first element of the string array
    buffer += "%" + reg + " = getelementptr inbounds [" + stringLength + " x i8], [" + stringLength + " x i8]* " + id + ", i32 0, i32 0\n";
    reg++;
    // Now call printf using this pointer
    buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @str_print_format, i32 0, i32 0), i8* %" + (reg-1) + ")\n";
    reg++;
    buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @new_line, i32 0, i32 0))\n";
      reg++;
}


    static void printf_string_literal(String str) {
      byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
      StringBuilder byteString = new StringBuilder();
      for (byte b : bytes) {
        byteString.append(String.format("\\%02X", b));
      }
      String strLabel = "@.str" + reg;
      header_text += strLabel + " = private unnamed_addr constant [" + (bytes.length + 1) + " x i8] c\"" + byteString.toString() + "\\00\"\n";
      buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([" + (bytes.length + 1) + " x i8], [" + (bytes.length + 1) + " x i8]* " + strLabel + ", i32 0, i32 0))\n";
      reg++;
      buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @new_line, i32 0, i32 0))\n";
      reg++;
    }

    static void declare_and_assign_global_string(String varName, String value) {
      String safeValue = value.replace("\n", "\\0A").replace("\"", "\\22");
      header_text += "@" + varName + " = private unnamed_addr constant [" + (value.length() + 1) + " x i8] c\"" + safeValue + "\\00\"\n";
      registerStringLength(varName, value.length() + 1);
    }

    static void declare_and_assign_local_string(String varName, String value) {
      String safeValue = value.replace("\n", "\\0A").replace("\"", "\\22");
      buffer += "%" + varName + " = alloca [" + (value.length() + 1) + " x i8], align 1\n";
      buffer += "store [" + (value.length() + 1) + " x i8] c\"" + safeValue + "\\00\", [" + (value.length() + 1) + " x i8]* %" + varName + ", align 1\n";
      registerStringLength(varName, value.length() + 1);
  }


  private static Map<String, Integer> stringLengths = new HashMap<>();

  static void registerStringLength(String variableName, int length) {
      stringLengths.put(variableName, length);
  }

  static int getStringLength(String variableName) {
      return stringLengths.getOrDefault(variableName, 0);  // Default to 0 if not found
  }

  

}