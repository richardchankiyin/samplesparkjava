FROM openjdk:17-jdk-alpine
MAINTAINER richardchankiyin
RUN apk add --no-cache bash
RUN apk --no-cache add curl
COPY target/samplesparkjava-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
