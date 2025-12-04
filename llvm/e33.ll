; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define i32 @"main"()
{
entry:
  %"j" = alloca i32
  %"i" = alloca i32
  store i32 0, i32* %"i"
  br label %"while.cond"
while.cond:
  %".4" = load i32, i32* %"i"
  %".5" = icmp slt i32 %".4", 3
  br i1 %".5", label %"while.body", label %"while.end"
while.body:
  %".7" = load i32, i32* %"i"
  %".8" = icmp eq i32 %".7", 1
  br i1 %".8", label %"if.then", label %"if.else"
while.end:
  store i32 0, i32* %"j"
  br label %"for.cond"
if.then:
  %".10" = bitcast [3 x i8]* @".str.0" to i8*
  %".11" = bitcast [5 x i8]* @".str.1" to i8*
  %".12" = call i32 (i8*, ...) @"printf"(i8* %".11", i8* %".10")
  br label %"if.end"
if.else:
  %".14" = bitcast [6 x i8]* @".str.2" to i8*
  %".15" = bitcast [5 x i8]* @".str.1" to i8*
  %".16" = call i32 (i8*, ...) @"printf"(i8* %".15", i8* %".14")
  br label %"if.end"
if.end:
  %".18" = load i32, i32* %"i"
  %".19" = add i32 %".18", 1
  store i32 %".19", i32* %"i"
  br label %"while.cond"
for.cond:
  %".24" = load i32, i32* %"j"
  %".25" = icmp slt i32 %".24", 2
  br i1 %".25", label %"for.body", label %"for.end"
for.body:
  %".27" = load i32, i32* %"j"
  %".28" = bitcast [5 x i8]* @".str.3" to i8*
  %".29" = call i32 (i8*, ...) @"printf"(i8* %".28", i32 %".27")
  br label %"for.update"
for.update:
  %".31" = load i32, i32* %"j"
  %".32" = add i32 %".31", 1
  store i32 %".32", i32* %"j"
  br label %"for.cond"
for.end:
  ret i32 0
}

@".str.0" = constant [3 x i8] c"um\00"
@".str.1" = constant [5 x i8] c"%s\5cn\00"
@".str.2" = constant [6 x i8] c"outro\00"
@".str.3" = constant [5 x i8] c"%d\5cn\00"