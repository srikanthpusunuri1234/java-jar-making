# Dockerfile
FROM tomcat:9-jdk17
COPY target/NETFLIX-1.2.2.war /usr/local/tomcat/webapps/app.war
