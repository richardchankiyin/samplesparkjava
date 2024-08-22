FROM openjdk:17-jdk-alpine
MAINTAINER richardchankiyin
COPY target/samplesparkjava-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
