@echo off
set JAVA_HOME=c:\Program Files (x86)\Java\jdk1.7.0_45
set "BASE_DIR=%~dp0"
echo Compiling project.
javac -d . Main.java
echo Compiling tests.
javac -cp .;%BASE_DIR%lib\junit.jar;%BASE_DIR%lib\hamcrest-core.jar -d . MainTest.java
echo Running tests.
java -cp .;%BASE_DIR%lib\junit.jar;%BASE_DIR%lib\hamcrest-core.jar org.junit.runner.JUnitCore Task_2.MainTest
echo Running program with class file and args x = 2.5, acc = 0.0001
java -cp %BASE_DIR% Task_2.Main 2.5 0.0001
pause