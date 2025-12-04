; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define void @"show"(i8* %"x")
{
entry:
  %"x.1" = alloca i8*
  store i8* %"x", i8** %"x.1"
  %".4" = load i8*, i8** %"x.1"
  %".5" = bitcast [3 x i8]* @".str.0" to i8*
  %".6" = call i32 (i8*, ...) @"printf"(i8* %".5")
  ret void
}

@".str.0" = constant [3 x i8] c"\5cn\00"
define i32 @"main"()
{
entry:
  %".2" = bitcast [7 x i8]* @".str.1" to i8*
  call void @"show"(i8* %".2")
  ret i32 0
}

@".str.1" = constant [7 x i8] c"Hello!\00"