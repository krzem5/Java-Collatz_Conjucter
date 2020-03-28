echo off
echo NUL>_.class&&del /s /f /q *.class
cls
javac com/krzem/collatz_conjucter/Main.java&&java com/krzem/collatz_conjucter/Main
start /min cmd /c "echo NUL>_.class&&del /s /f /q *.class"