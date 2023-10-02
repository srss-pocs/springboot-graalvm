Spring Boot 3.1.4

A Simple Spring Boot application with Graal VM useful for faster scalability and application start

Steps
Download and Install Graal JDK : https://www.oracle.com/java/technologies/javase/graalvm-jdk21-archive-downloads.html
Build the application with Graal JDK and Maven : mvn -Pnative -DskipTests package -X - use Windows Powershell (CMD will not work)
Check the target directory for additioal graal folder

Do a Docker Build : docker build -t spring-boot-graalvm-example .

Run : docker run -p 8080:8080 spring-boot-graalvm-example
 