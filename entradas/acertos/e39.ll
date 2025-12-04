; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define i32 @"main"()
{
entry:
  %"i" = alloca i32
body:
  store i32 0, i32* %"i"
  br label %"for.cond"
for.cond:
  %".4" = load i32, i32* %"i"
  %".5" = icmp slt i32 %".4", 3
  br i1 %".5", label %"for.body", label %"for.end"
for.body:
  %".7" = load i32, i32* %"i"
  %".8" = bitcast [5 x i8]* @".str.0" to i8*
  %".9" = call i32 (i8*, ...) @"printf"(i8* %".8", i32 %".7")
  br label %"for.update"
for.update:
  %".11" = load i32, i32* %"i"
  %".12" = add i32 %".11", 1
  store i32 %".12", i32* %"i"
  br label %"for.cond"
for.end:
  ret i32 0
}

@".str.0" = constant [5 x i8] c"%d\5cn\00"