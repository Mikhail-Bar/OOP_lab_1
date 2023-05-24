@echo off
set JAVA_HOME=c:\Program Files (x86)\Java\jdk1.7.0_45
set "BASE_DIR=%~dp0"
set CLASSPATH=%BASE_DIR%calc.jar
echo Running class InfixToPolizConverter with args (a+b+c)/(a*b*c) and Calculator args a=1 b=2 c=3
java -cp %CLASSPATH% InfixToPolizConverter (a+b+c)/(a*b*c) | java -cp %CLASSPATH% Calculator a=1 b=2 c=3
pause