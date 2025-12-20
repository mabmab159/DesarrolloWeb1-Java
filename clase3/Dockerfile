FROM eclipse-temurin:21-jdk-alpine
COPY target/*.jar app.jar
RUN apk add curl
ENTRYPOINT ["java", "-jar", "/app.jar"]