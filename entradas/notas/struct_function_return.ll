; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define %"Point" @"createPoint"(i32 %"x", i32 %"y")
{
entry:
  %"p" = alloca %"Point"
  %"y.1" = alloca i32
  %"x.1" = alloca i32
  store i32 %"x", i32* %"x.1"
  store i32 %"y", i32* %"y.1"
  %".6" = getelementptr %"Point", %"Point"* %"p", i32 0, i32 0
  %".7" = load i32, i32* %"x.1"
  store i32 %".7", i32* %".6"
  %".9" = getelementptr %"Point", %"Point"* %"p", i32 0, i32 1
  %".10" = load i32, i32* %"y.1"
  store i32 %".10", i32* %".9"
  %".12" = load %"Point", %"Point"* %"p"
  ret %"Point" %".12"
}

define %"Point" @"addPoints"(%"Point"* %"a", %"Point"* %"b")
{
entry:
  %"result" = alloca %"Point"
  %"b.1" = alloca %"Point"*
  %"a.1" = alloca %"Point"*
  store %"Point"* %"a", %"Point"** %"a.1"
  store %"Point"* %"b", %"Point"** %"b.1"
  %".6" = getelementptr %"Point", %"Point"* %"result", i32 0, i32 0
  %".7" = load %"Point"*, %"Point"** %"a.1"
  %".8" = getelementptr %"Point", %"Point"* %".7", i32 0, i32 0
  %".9" = load i32, i32* %".8"
  %".10" = load %"Point"*, %"Point"** %"b.1"
  %".11" = getelementptr %"Point", %"Point"* %".10", i32 0, i32 0
  %".12" = load i32, i32* %".11"
  %".13" = add i32 %".9", %".12"
  store i32 %".13", i32* %".6"
  %".15" = getelementptr %"Point", %"Point"* %"result", i32 0, i32 1
  %".16" = load %"Point"*, %"Point"** %"a.1"
  %".17" = getelementptr %"Point", %"Point"* %".16", i32 0, i32 1
  %".18" = load i32, i32* %".17"
  %".19" = load %"Point"*, %"Point"** %"b.1"
  %".20" = getelementptr %"Point", %"Point"* %".19", i32 0, i32 1
  %".21" = load i32, i32* %".20"
  %".22" = add i32 %".18", %".21"
  store i32 %".22", i32* %".15"
  %".24" = load %"Point", %"Point"* %"result"
  ret %"Point" %".24"
}

define i32 @"main"()
{
entry:
  %"p3" = alloca %"Point"
  %"p2" = alloca %"Point"
  %"p1" = alloca %"Point"
  %".2" = call %"Point" @"createPoint"(i32 10, i32 20)
  store %"Point" %".2", %"Point"* %"p1"
  %".4" = call %"Point" @"createPoint"(i32 5, i32 15)
  store %"Point" %".4", %"Point"* %"p2"
  %".6" = call %"Point" @"addPoints"(%"Point"* %"p1", %"Point"* %"p2")
  store %"Point" %".6", %"Point"* %"p3"
  %".8" = getelementptr %"Point", %"Point"* %"p3", i32 0, i32 0
  %".9" = load i32, i32* %".8"
  %".10" = bitcast [5 x i8]* @".str.0" to i8*
  %".11" = call i32 (i8*, ...) @"printf"(i8* %".10", i32 %".9")
  %".12" = getelementptr %"Point", %"Point"* %"p3", i32 0, i32 1
  %".13" = load i32, i32* %".12"
  %".14" = bitcast [5 x i8]* @".str.0" to i8*
  %".15" = call i32 (i8*, ...) @"printf"(i8* %".14", i32 %".13")
  ret i32 0
}

@".str.0" = constant [5 x i8] c"%d\5cn\00"