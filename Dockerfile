FROM eclipse-temurin:21-jre
EXPOSE 8090
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]