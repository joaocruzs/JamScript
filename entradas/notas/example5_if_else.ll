; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define i32 @"main"()
{
entry:
  %"x" = alloca i32
  store i32 5, i32* %"x"
  %".3" = load i32, i32* %"x"
  %".4" = icmp sgt i32 %".3", 3
  br i1 %".4", label %"if.then", label %"if.else"
if.then:
  %".6" = bitcast [6 x i8]* @".str.0" to i8*
  %".7" = bitcast [5 x i8]* @".str.1" to i8*
  %".8" = call i32 (i8*, ...) @"printf"(i8* %".7", i8* %".6")
  br label %"if.end"
if.else:
  %".10" = bitcast [6 x i8]* @".str.2" to i8*
  %".11" = bitcast [5 x i8]* @".str.1" to i8*
  %".12" = call i32 (i8*, ...) @"printf"(i8* %".11", i8* %".10")
  br label %"if.end"
if.end:
  ret i32 0
}

@".str.0" = constant [6 x i8] c"maior\00"
@".str.1" = constant [5 x i8] c"%s\5cn\00"
@".str.2" = constant [6 x i8] c"menor\00"