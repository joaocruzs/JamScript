; ModuleID = "jamscript_module"
target triple = "unknown-unknown-unknown"
target datalayout = ""

%"P" = type { i32 }


declare i32 @"printf"(i8* %".1", ...)

define i32 @"main"()
{
entry:
  %"a" = alloca %"P"
  ret i32 0
}