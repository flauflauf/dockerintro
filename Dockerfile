FROM java:8-alpine
COPY target /
EXPOSE 8080
ENTRYPOINT java -jar dockerintro-0.0.1-SNAPSHOT.jar