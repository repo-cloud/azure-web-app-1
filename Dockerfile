FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} azure-web-app-0.0.1.jar
ENTRYPOINT ["java","-jar","/azure-web-app-0.0.1.jar"]