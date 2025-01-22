FROM openjdk:23-jdk

ARG JAR_FILE=./build/libs/infra-eureka-0.0.1.jar

COPY ${JAR_FILE} eureka-app.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/eureka-app.jar"]
