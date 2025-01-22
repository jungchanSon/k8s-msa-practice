FROM openjdk:23-jdk

ARG JAR_FILE=./build/libs/shop-0.0.1.jar

COPY ${JAR_FILE} shop-app.jar

EXPOSE 8085

ENTRYPOINT ["java", "-jar", "/shop-app.jar"]
