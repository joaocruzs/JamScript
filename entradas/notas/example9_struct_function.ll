; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define double @"magnitude"(%"Vec2"* %"v")
{
entry:
  %"v.1" = alloca %"Vec2"*
body:
  store %"Vec2"* %"v", %"Vec2"** %"v.1"
  %".4" = load %"Vec2"*, %"Vec2"** %"v.1"
  %".5" = getelementptr %"Vec2", %"Vec2"* %".4", i32 0, i32 0
  %".6" = load double, double* %".5"
  %".7" = load %"Vec2"*, %"Vec2"** %"v.1"
  %".8" = getelementptr %"Vec2", %"Vec2"* %".7", i32 0, i32 0
  %".9" = load double, double* %".8"
  %".10" = fmul double %".6", %".9"
  %".11" = load %"Vec2"*, %"Vec2"** %"v.1"
  %".12" = getelementptr %"Vec2", %"Vec2"* %".11", i32 0, i32 1
  %".13" = load double, double* %".12"
  %".14" = load %"Vec2"*, %"Vec2"** %"v.1"
  %".15" = getelementptr %"Vec2", %"Vec2"* %".14", i32 0, i32 1
  %".16" = load double, double* %".15"
  %".17" = fmul double %".13", %".16"
  %".18" = fadd double %".10", %".17"
  ret double %".18"
}

define i32 @"main"()
{
entry:
  %"a" = alloca %"Vec2"
body:
  %".2" = getelementptr %"Vec2", %"Vec2"* %"a", i32 0, i32 0
  store double 0x4008000000000000, double* %".2"
  %".4" = getelementptr %"Vec2", %"Vec2"* %"a", i32 0, i32 1
  store double 0x4010000000000000, double* %".4"
  %".6" = call double @"magnitude"(%"Vec2"* %"a")
  %".7" = bitcast [5 x i8]* @".str.0" to i8*
  %".8" = call i32 (i8*, ...) @"printf"(i8* %".7", double %".6")
  ret i32 0
}

@".str.0" = constant [5 x i8] c"%f\5cn\00"