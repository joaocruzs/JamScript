; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define i32 @"main"()
{
entry:
  %"i" = alloca i32
  store i32 0, i32* %"i"
  br label %"while.cond"
while.cond:
  %".4" = load i32, i32* %"i"
  %".5" = icmp slt i32 %".4", 3
  br i1 %".5", label %"while.body", label %"while.end"
while.body:
  %".7" = load i32, i32* %"i"
  %".8" = bitcast [5 x i8]* @".str.0" to i8*
  %".9" = call i32 (i8*, ...) @"printf"(i8* %".8", i32 %".7")
  %".10" = load i32, i32* %"i"
  %".11" = add i32 %".10", 1
  store i32 %".11", i32* %"i"
  br label %"while.cond"
while.end:
  ret i32 0
}

@".str.0" = constant [5 x i8] c"%d\5cn\00"