@echo off
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_111
set CLASSPATH=d:\Java_Learn\OOP_lab_1\Task_1\;d:\Java_Learn\OOP_lab_1\Task_1\;lib\junit-jupiter-engine-5.8.1.jar;lib\junit-jupiter-api-5.8.1.jar;lib\apiguardian-api-1.1.0.jar
java org.junit.platform.console.ConsoleLauncher --scan-classpath
pause