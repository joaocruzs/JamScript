; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

%"P" = type { i32, i32 }


declare i32 @"printf"(i8* %".1", ...)

define i32 @"soma"(%"P"* %"p")
{
entry:
  %"p.1" = alloca %"P"*
  store %"P"* %"p", %"P"** %"p.1"
  %".4" = load %"P"*, %"P"** %"p.1"
  %".5" = getelementptr %"P", %"P"* %".4", i32 0, i32 0
  %".6" = load i32, i32* %".5"
  %".7" = load %"P"*, %"P"** %"p.1"
  %".8" = getelementptr %"P", %"P"* %".7", i32 0, i32 1
  %".9" = load i32, i32* %".8"
  %".10" = add i32 %".6", %".9"
  ret i32 %".10"
}

define i32 @"main"()
{
entry:
  %"resultado" = alloca i32
  %"a" = alloca %"P"
  %".2" = call i32 @"soma"(%"P"* %"a")
  store i32 %".2", i32* %"resultado"
  %".4" = load i32, i32* %"resultado"
  %".5" = bitcast [5 x i8]* @".str.0" to i8*
  %".6" = call i32 (i8*, ...) @"printf"(i8* %".5", i32 %".4")
  ret i32 0
}

@".str.0" = constant [5 x i8] c"%d\5cn\00"