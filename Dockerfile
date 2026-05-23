FROM eclipse-temurin:21-jre
EXPOSE 8090
ADD target/docker-jenkins-integration-sample.jar docker-jenkins-integration-sample.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]