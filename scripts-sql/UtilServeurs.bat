@ECHO OFF
SETLOCAL
CHCP 1252 >NUL
CD /D "%~dp0"

SET FULLPATH_ROOT=C:\dev24
SET  PATH_DIR_JDK=jdk-20

SET     JAVA_HOME=%FULLPATH_ROOT%\%PATH_DIR_JDK%
IF NOT EXIST "%JAVA_HOME%" (
  SET   JAVA_HOME=%FULLPATH_ROOT%\dbeaver\jre
)
SET  UTILSVR_HOME=%FULLPATH_ROOT%\UtilServeurs

SET MODULEPATH=%UTILSVR_HOME%\lib\modulepath
SET  CLASSPATH=config;%UTILSVR_HOME%\config;%UTILSVR_HOME%\lib\drivers\*;%UTILSVR_HOME%\lib\classpath\*

SET    ARGS_VM=--module-path "%MODULEPATH%" --class-path  "%CLASSPATH%"
SET ARGS_APPLI=path.root.softs="%FULLPATH_ROOT%" path.dir.jdk="%JAVA_HOME%"

START "" "%JAVA_HOME%\bin\javaw.exe" %ARGS_VM% -m utilserveurs %ARGS_APPLI%

ENDLOCAL
