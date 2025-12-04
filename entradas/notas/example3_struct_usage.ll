; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define i32 @"main"()
{
entry:
  %"p" = alloca %"Pessoa"
body:
  %".2" = getelementptr %"Pessoa", %"Pessoa"* %"p", i32 0, i32 0
  %".3" = bitcast [4 x i8]* @".str.0" to i8*
  store i8* %".3", i8** %".2"
  %".5" = getelementptr %"Pessoa", %"Pessoa"* %"p", i32 0, i32 1
  store i32 20, i32* %".5"
  %".7" = getelementptr %"Pessoa", %"Pessoa"* %"p", i32 0, i32 0
  %".8" = load i8*, i8** %".7"
  %".9" = bitcast [3 x i8]* @".str.1" to i8*
  %".10" = call i32 (i8*, ...) @"printf"(i8* %".9")
  ret i32 0
}

@".str.0" = constant [4 x i8] c"Ana\00"
@".str.1" = constant [3 x i8] c"\5cn\00"