FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/halls-service-0.0.1.jar
COPY ${JAR_FILE} app_halls-service.jar
ENTRYPOINT ["java","-jar","app_halls-service.jar"]