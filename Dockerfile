FROM maven:3.6.3-openjdk-17 AS build

WORKDIR /app
COPY . /app
RUN mvn clean package -DskipTests

FROM openjdk:17

VOLUME /tmp
ARG JAR_FILE=./target/demo.start-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /
ENTRYPOINT ["java","-jar","/demo.start-0.0.1-SNAPSHOT.jar"]


