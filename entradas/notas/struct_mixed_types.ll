; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define %"Student" @"createStudent"(i8* %"n", i32 %"a", double %"g")
{
entry:
  %"s" = alloca %"Student"
  %"g.1" = alloca double
  %"a.1" = alloca i32
  %"n.1" = alloca i8*
  store i8* %"n", i8** %"n.1"
  store i32 %"a", i32* %"a.1"
  store double %"g", double* %"g.1"
  %".8" = getelementptr %"Student", %"Student"* %"s", i32 0, i32 0
  %".9" = load i8*, i8** %"n.1"
  store i8* %".9", i8** %".8"
  %".11" = getelementptr %"Student", %"Student"* %"s", i32 0, i32 1
  %".12" = load i32, i32* %"a.1"
  store i32 %".12", i32* %".11"
  %".14" = getelementptr %"Student", %"Student"* %"s", i32 0, i32 2
  %".15" = load double, double* %"g.1"
  store double %".15", double* %".14"
  %".17" = load %"Student", %"Student"* %"s"
  ret %"Student" %".17"
}

define i32 @"main"()
{
entry:
  %"student" = alloca %"Student"
  %".2" = bitcast [6 x i8]* @".str.0" to i8*
  %".3" = call %"Student" @"createStudent"(i8* %".2", i32 20, double 0x4021000000000000)
  store %"Student" %".3", %"Student"* %"student"
  %".5" = getelementptr %"Student", %"Student"* %"student", i32 0, i32 0
  %".6" = load i8*, i8** %".5"
  %".7" = bitcast [3 x i8]* @".str.1" to i8*
  %".8" = call i32 (i8*, ...) @"printf"(i8* %".7")
  %".9" = getelementptr %"Student", %"Student"* %"student", i32 0, i32 1
  %".10" = load i32, i32* %".9"
  %".11" = bitcast [5 x i8]* @".str.2" to i8*
  %".12" = call i32 (i8*, ...) @"printf"(i8* %".11", i32 %".10")
  %".13" = getelementptr %"Student", %"Student"* %"student", i32 0, i32 2
  %".14" = load double, double* %".13"
  %".15" = bitcast [5 x i8]* @".str.3" to i8*
  %".16" = call i32 (i8*, ...) @"printf"(i8* %".15", double %".14")
  ret i32 0
}

@".str.0" = constant [6 x i8] c"Maria\00"
@".str.1" = constant [3 x i8] c"\5cn\00"
@".str.2" = constant [5 x i8] c"%d\5cn\00"
@".str.3" = constant [5 x i8] c"%f\5cn\00"