; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define void @"logBool"(i1 %"b")
{
entry:
  %"b.1" = alloca i1
  store i1 %"b", i1* %"b.1"
  %".4" = load i1, i1* %"b.1"
  %".5" = zext i1 %".4" to i32
  %".6" = bitcast [5 x i8]* @".str.0" to i8*
  %".7" = call i32 (i8*, ...) @"printf"(i8* %".6", i32 %".5")
  ret void
}

@".str.0" = constant [5 x i8] c"%d\5cn\00"
define i32 @"main"()
{
entry:
  %"flag" = alloca i1
  %".2" = icmp sgt i32 10, 3
  %".3" = and i1 1, %".2"
  store i1 %".3", i1* %"flag"
  %".5" = load i1, i1* %"flag"
  call void @"logBool"(i1 %".5")
  ret i32 0
}
