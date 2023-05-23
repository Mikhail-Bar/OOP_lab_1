@echo off
set JAVA_HOME=c:\Program Files (x86)\Java\jdk1.7.0_45
set "BASE_DIR=%~dp0"
for %%I in ("%BASE_DIR%..") do set "PARENT_DIR=%%~fI"
echo Creating JAR...
jar -cvf ../Task_2.jar .
echo Running program with jar file and args x = 2.5, acc = 0.0001
java -jar %PARENT_DIR%\Task_2.jar 2.5 0.0001
pause