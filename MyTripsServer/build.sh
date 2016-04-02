export CATALINA_HOME=/opt/apache-tomcat-8.0.33
export CATALINA_BASE=/home/matheus/apache-base
export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64

ant shutdown
ant default
ant startup
