; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define i32 @"inc"(i32 %"a")
{
entry:
  %"a.1" = alloca i32
  store i32 %"a", i32* %"a.1"
  %".4" = load i32, i32* %"a.1"
  %".5" = add i32 %".4", 1
  ret i32 %".5"
}

define i32 @"dup"(i32 %"a")
{
entry:
  %"a.1" = alloca i32
  store i32 %"a", i32* %"a.1"
  %".4" = load i32, i32* %"a.1"
  %".5" = mul i32 %".4", 2
  ret i32 %".5"
}

define i32 @"f"(i32 %"a")
{
entry:
  %"a.1" = alloca i32
  store i32 %"a", i32* %"a.1"
  %".4" = load i32, i32* %"a.1"
  %".5" = call i32 @"inc"(i32 %".4")
  %".6" = call i32 @"dup"(i32 %".5")
  ret i32 %".6"
}

define i32 @"main"()
{
entry:
  %".2" = call i32 @"f"(i32 3)
  %".3" = bitcast [5 x i8]* @".str.0" to i8*
  %".4" = call i32 (i8*, ...) @"printf"(i8* %".3", i32 %".2")
  ret i32 0
}

@".str.0" = constant [5 x i8] c"%d\5cn\00"