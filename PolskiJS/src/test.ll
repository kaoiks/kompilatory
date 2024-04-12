declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strs = constant [3 x i8] c"%d\00"
define i32 @main() nounwind{
%1 = mul i32 3, 2
%a = alloca i32
store i32 %1, i32* %a
%2 = load i32, i32* %a
%3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %2)
%4 = fmul double 3.5, 3.0
%b = alloca double
store double %4, double* %b
%5 = load double, double* %b
%6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %5)
%c = alloca double
store double 1.5, double* %c
%7 = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double* %c)
%8 = load double, double* %c
%9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %8)
ret i32 0 }

