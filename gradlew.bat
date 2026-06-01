@if "%DEBUG%" == "" @echo off
@rem Gradle startup script for Windows
@rem
setlocal enabledelayedexpansion
set APP_HOME=%~dp0
set CLASSPATH=
for %%i in ("%APP_HOME%gradle\wrapper\gradle-wrapper.jar") do set CLASSPATH=!CLASSPATH!%%i
java -cp "%CLASSPATH%" org.gradle.wrapper.GradleWrapperMain %*
endlocal
@endlocal
