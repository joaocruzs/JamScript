; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define i32 @"main"()
{
entry:
  %"b" = alloca %"B"
  %".2" = getelementptr %"B", %"B"* %"b", i32 0, i32 0
  %".3" = getelementptr %"A", %"A"* %".2", i32 0, i32 0
  %".4" = load i32, i32* %".3"
  %".5" = bitcast [5 x i8]* @".str.0" to i8*
  %".6" = call i32 (i8*, ...) @"printf"(i8* %".5", i32 %".4")
  ret i32 0
}

@".str.0" = constant [5 x i8] c"%d\5cn\00"