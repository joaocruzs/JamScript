; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define i32 @"main"()
{
entry:
  %"y" = alloca i32
  %"x" = alloca i32
body:
  store i32 10, i32* %"x"
  %".3" = load i32, i32* %"x"
  %".4" = add i32 %".3", 5
  store i32 %".4", i32* %"y"
  %".6" = load i32, i32* %"x"
  %".7" = load i32, i32* %"y"
  %".8" = bitcast [8 x i8]* @".str.0" to i8*
  %".9" = call i32 (i8*, ...) @"printf"(i8* %".8", i32 %".6", i32 %".7")
  ret i32 0
}

@".str.0" = constant [8 x i8] c"%d %d\5cn\00"