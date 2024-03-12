FROM --platform=linux/amd64 eclipse-temurin:17-jre-alpine
ADD build/libs/server-0.0.1-SNAPSHOT.jar /app/server.jar
CMD java -Dspring.config.location=classpath:/application.properties,file:/app/application.properties -jar /app/server.jar