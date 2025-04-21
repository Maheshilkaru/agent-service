FROM openjdk:17
WORKDIR /app
COPY target/agent-service-0.0.1-SNAPSHOT.jar agent-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "agent-service.jar"]
