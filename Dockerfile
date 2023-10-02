FROM openjdk:21
EXPOSE 8080
ADD target/spring-boot-graalvm-example.jar spring-boot-graalvm-example.jar 
ENTRYPOINT ["java","-jar","/spring-boot-graalvm-example.jar"]