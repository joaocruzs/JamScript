; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define i32 @"main"()
{
entry:
  %"s" = alloca i8*
  %".2" = bitcast [3 x i8]* @".str.0" to i8*
  store i8* %".2", i8** %"s"
  %".4" = load i8*, i8** %"s"
  %".5" = bitcast [3 x i8]* @".str.1" to i8*
  %".6" = call i32 (i8*, ...) @"printf"(i8* %".5")
  ret i32 0
}

@".str.0" = constant [3 x i8] c"Oi\00"
@".str.1" = constant [3 x i8] c"\5cn\00"