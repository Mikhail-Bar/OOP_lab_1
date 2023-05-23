@echo off
set JAVA_HOME=c:\Program Files (x86)\Java\jdk1.7.0_45
set "BASE_DIR=%~dp0"
echo Compiling project.
javac -d . Main.java
echo Compiling tests.
javac -cp .;%BASE_DIR%lib\junit.jar;%BASE_DIR%lib\hamcrest-core.jar -d . MainTest.java
echo Running tests.
java -cp .;%BASE_DIR%lib\junit.jar;%BASE_DIR%lib\hamcrest-core.jar org.junit.runner.JUnitCore Task_1.MainTest
echo Running program with args 2 3 4.
java -cp %BASE_DIR% Task_1.Main 2 3 4
pause