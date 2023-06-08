@echo off
set JAVA_HOME=c:\Program Files\Java\jdk-17
set "BASE_DIR=%~dp0"
set CLASSPATH=%BASE_DIR%painting.jar
echo Compiling project.
javac -cp .;"%CLASSPATH%" -d . Main.java
echo Running class Painting with args dPhi = 0.1
java -cp "%CLASSPATH%;" Task_4.Main 0.1
pause