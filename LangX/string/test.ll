declare i32 @printf(i8*, ...)
declare i32 @sprintf(i8*, i8*, ...)
declare i8* @strcpy(i8*, i8*)
declare i8* @strcat(i8*, i8*)
declare i32 @atoi(i8*)
declare i32 @__isoc99_scanf(i8*, ...)
declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)
@strps = constant [4 x i8] c"%s\0A\00"
@strpi = constant [4 x i8] c"%d\0A\00"
@strs = constant [5 x i8] c"%10s\00"
@strspi = constant [3 x i8] c"%d\00"
@str1 = constant [7 x i8] c"Hello \00"
@str2 = constant [6 x i8] c"world\00"
define i32 @main() nounwind{
%str1 = alloca [7 x i8]
%1 = bitcast [7 x i8]* %str1 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %1, i8* align 1 getelementptr inbounds ([7 x i8], [7 x i8]* @str1, i32 0, i32 0), i64 7, i1 false)
%ptrstr1 = alloca i8*
%2 = getelementptr inbounds [7 x i8], [7 x i8]* %str1, i64 0, i64 0
store i8* %2, i8** %ptrstr1
%a = alloca i8*
store i8* %2, i8** %a
%str2 = alloca [6 x i8]
%3 = bitcast [6 x i8]* %str2 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %3, i8* align 1 getelementptr inbounds ([6 x i8], [6 x i8]* @str2, i32 0, i32 0), i64 6, i1 false)
%ptrstr2 = alloca i8*
%4 = getelementptr inbounds [6 x i8], [6 x i8]* %str2, i64 0, i64 0
store i8* %4, i8** %ptrstr2
%b = alloca i8*
store i8* %4, i8** %b
%5 = load i8*, i8** %a
%6 = load i8*, i8** %b
%str3 = alloca [12 x i8]
%ptrstr3 = alloca i8*
%7 = getelementptr inbounds [12 x i8], [12 x i8]* %str3, i64 0, i64 0
store i8* %7, i8** %ptrstr3
%8 = load i8*, i8** %ptrstr3
%9 = call i8* @strcpy(i8* %8, i8* %5)
%10 = call i8* @strcat(i8* %8, i8* %6)
%ab = alloca i8*
store i8* %10, i8** %ab
%11 = load i8*, i8** %ab
%12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %11)
%x = alloca i32
store i32 2, i32* %x
%y = alloca i32
store i32 3, i32* %y
%13 = load i32, i32* %x
%14 = load i32, i32* %y
%15 = add i32 %13, %14
%z = alloca i32
store i32 %15, i32* %z
%16 = load i32, i32* %z
%17 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %16)
%str4 = alloca [17 x i8]
%str = alloca i8*
%18 = getelementptr inbounds [17 x i8], [17 x i8]* %str4, i64 0, i64 0
store i8* %18, i8** %str
%19 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @strs, i32 0, i32 0), i8* %18)
%20 = load i32, i32* %x
%21 = load i8*, i8** %str
%22 = call i32 @atoi(i8* %21)
%23 = add i32 %20, %22
%abc = alloca i32
store i32 %23, i32* %abc
%24 = load i8*, i8** %str
%25 = load i32, i32* %x
%str5 = alloca [17 x i8]
%ptrstr5 = alloca i8*
%26 = getelementptr inbounds [17 x i8], [17 x i8]* %str5, i64 0, i64 0
store i8* %26, i8** %ptrstr5
%27 = load i8*, i8** %ptrstr5
%28 = call i32 (i8*, i8*, ...) @sprintf(i8* %27, i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32 %25)
%str6 = alloca [32 x i8]
%ptrstr6 = alloca i8*
%29 = getelementptr inbounds [32 x i8], [32 x i8]* %str6, i64 0, i64 0
store i8* %29, i8** %ptrstr6
%30 = load i8*, i8** %ptrstr6
%31 = call i8* @strcpy(i8* %30, i8* %24)
%32 = call i8* @strcat(i8* %30, i8* %27)
%def = alloca i8*
store i8* %32, i8** %def
%33 = load i32, i32* %abc
%34 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %33)
%35 = load i8*, i8** %def
%36 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %35)
ret i32 0 }

