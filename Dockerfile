FROM amazoncorretto:11-alpine-jdk
COPY /target/ustube-0.0.1-SNAPSHOT.jar ustube.jar
ENTRYPOINT ["java", "-jar", "/ustube.jar"]