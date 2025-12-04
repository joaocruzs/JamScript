; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define i32 @"main"()
{
entry:
  %"x" = alloca i32
  store i32 2, i32* %"x"
  %".3" = load i32, i32* %"x"
  %".4" = bitcast [5 x i8]* @".str.0" to i8*
  %".5" = call i32 (i8*, ...) @"printf"(i8* %".4", i32 %".3")
  ret i32 0
}

@".str.0" = constant [5 x i8] c"%d\5cn\00"