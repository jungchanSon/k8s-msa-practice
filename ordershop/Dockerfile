FROM openjdk:23-jdk

ARG JAR_FILE=./build/libs/ordershop-0.0.1.jar

COPY ${JAR_FILE} ordershop-app.jar

EXPOSE 8095

ENTRYPOINT ["java", "-jar", "/ordershop-app.jar"]
