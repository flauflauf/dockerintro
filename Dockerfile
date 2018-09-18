FROM maven:3.5-jdk-8-alpine AS build
COPY src src
COPY pom.xml /
RUN mvn clean package

FROM java:8-alpine
COPY --from=build target /
EXPOSE 8080
ENTRYPOINT java -jar dockerintro-0.0.1-SNAPSHOT.jar
