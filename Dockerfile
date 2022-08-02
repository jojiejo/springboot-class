FROM openjdk:8
EXPOSE 8080
COPY target/docker-test.jar docker-test.jar
ENTRYPOINT ["java", "-jar", "docker-test.jar"]