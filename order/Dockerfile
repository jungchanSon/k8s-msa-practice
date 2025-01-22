FROM openjdk:23-jdk

ARG JAR_FILE=./build/libs/order-0.0.1.jar

COPY ${JAR_FILE} order-app.jar

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "/order-app.jar"]
