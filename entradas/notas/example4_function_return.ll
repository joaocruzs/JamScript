; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define i32 @"soma"(i32 %"a", i32 %"b")
{
entry:
  %"b.1" = alloca i32
  %"a.1" = alloca i32
  store i32 %"a", i32* %"a.1"
  store i32 %"b", i32* %"b.1"
  %".6" = load i32, i32* %"a.1"
  %".7" = load i32, i32* %"b.1"
  %".8" = add i32 %".6", %".7"
  ret i32 %".8"
}

define i32 @"main"()
{
entry:
  %"r" = alloca i32
  %".2" = call i32 @"soma"(i32 3, i32 4)
  store i32 %".2", i32* %"r"
  %".4" = load i32, i32* %"r"
  %".5" = bitcast [5 x i8]* @".str.0" to i8*
  %".6" = call i32 (i8*, ...) @"printf"(i8* %".5", i32 %".4")
  ret i32 0
}

@".str.0" = constant [5 x i8] c"%d\5cn\00"