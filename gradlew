#!/bin/sh
#
# Gradle start up script for UN*X
#

# Attempt to set APP_HOME
# Resolve links: $0 may be a link
app_path=$0
APP_HOME=${app_path%"${app_path##*/}"}
APP_HOME="$(cd "$APP_HOME" && pwd -P)" || exit

CLASSPATH="$APP_HOME/gradle/wrapper/gradle-wrapper.jar"

if ! command -v java &> /dev/null
then
    echo "Error: JAVA_HOME is not set and java could not be found in PATH." >&2
    exit 1
fi

java -cp "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"
