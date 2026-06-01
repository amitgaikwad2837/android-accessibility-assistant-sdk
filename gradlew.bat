@if "%DEBUG%"=="" @echo off
@rem Gradle startup script for Windows

setlocal enabledelayedexpansion

set APP_HOME=%~dp0
set CLASSPATH=%APP_HOME%gradle\wrapper\gradle-wrapper.jar

java -cp "%CLASSPATH%" org.gradle.wrapper.GradleWrapperMain %*

endlocal
exit /b %ERRORLEVEL%