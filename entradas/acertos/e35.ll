; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

declare i32 @"printf"(i8* %".1", ...)

define %"Coord" @"somaVet"(%"Coord"* %"a", %"Coord"* %"b")
{
entry:
  %"r" = alloca %"Coord"
  %"y" = alloca i32
  %"x" = alloca i32
  %"b.1" = alloca %"Coord"*
  %"a.1" = alloca %"Coord"*
body:
  store %"Coord"* %"a", %"Coord"** %"a.1"
  store %"Coord"* %"b", %"Coord"** %"b.1"
  store i32 0, i32* %"x"
  store i32 0, i32* %"y"
  %".8" = load %"Coord"*, %"Coord"** %"a.1"
  %".9" = getelementptr %"Coord", %"Coord"* %".8", i32 0, i32 0
  %".10" = load i32, i32* %".9"
  %".11" = load %"Coord"*, %"Coord"** %"b.1"
  %".12" = getelementptr %"Coord", %"Coord"* %".11", i32 0, i32 0
  %".13" = load i32, i32* %".12"
  %".14" = add i32 %".10", %".13"
  store i32 %".14", i32* %"x"
  %".16" = load %"Coord"*, %"Coord"** %"a.1"
  %".17" = getelementptr %"Coord", %"Coord"* %".16", i32 0, i32 1
  %".18" = load i32, i32* %".17"
  %".19" = load %"Coord"*, %"Coord"** %"b.1"
  %".20" = getelementptr %"Coord", %"Coord"* %".19", i32 0, i32 1
  %".21" = load i32, i32* %".20"
  %".22" = add i32 %".18", %".21"
  store i32 %".22", i32* %"y"
  %".24" = getelementptr %"Coord", %"Coord"* %"r", i32 0, i32 0
  %".25" = load i32, i32* %"x"
  store i32 %".25", i32* %".24"
  %".27" = getelementptr %"Coord", %"Coord"* %"r", i32 0, i32 1
  %".28" = load i32, i32* %"y"
  store i32 %".28", i32* %".27"
  ret %"Coord"* %"r"
}

define i32 @"main"()
{
entry:
  %"z" = alloca %"Coord"
  %"n" = alloca %"Coord"
  %"m" = alloca %"Coord"
body:
  %".2" = getelementptr %"Coord", %"Coord"* %"m", i32 0, i32 0
  store i32 2, i32* %".2"
  %".4" = getelementptr %"Coord", %"Coord"* %"m", i32 0, i32 1
  store i32 3, i32* %".4"
  %".6" = getelementptr %"Coord", %"Coord"* %"n", i32 0, i32 0
  store i32 30, i32* %".6"
  %".8" = getelementptr %"Coord", %"Coord"* %"n", i32 0, i32 1
  store i32 50, i32* %".8"
  %".10" = call %"Coord" @"somaVet"(%"Coord"* %"m", %"Coord"* %"n")
  store %"Coord" %".10", %"Coord"* %"z"
  %".12" = getelementptr %"Coord", %"Coord"* %"z", i32 0, i32 0
  %".13" = load i32, i32* %".12"
  %".14" = bitcast [5 x i8]* @".str.0" to i8*
  %".15" = call i32 (i8*, ...) @"printf"(i8* %".14", i32 %".13")
  %".16" = getelementptr %"Coord", %"Coord"* %"z", i32 0, i32 1
  %".17" = load i32, i32* %".16"
  %".18" = bitcast [5 x i8]* @".str.0" to i8*
  %".19" = call i32 (i8*, ...) @"printf"(i8* %".18", i32 %".17")
  ret i32 0
}

@".str.0" = constant [5 x i8] c"%d\5cn\00"