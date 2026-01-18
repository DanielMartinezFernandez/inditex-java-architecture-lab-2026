# inditex-java-architecture-lab-2026

Java project with Spring Boot for the Inditex technical test (January 2026).

Contents
- Spring Boot 4 (Java 25)
- Sample endpoint GET /api/hello
- Basic tests with Spring Boot Test

Requirements
- open JDK 25 installed
- Maven 3.9+ (optional if you use mvnw)

How to run
1. Build and run tests:
   - mvn clean verify
2. Start the application:
   - mvn spring-boot:run
   - or: mvn clean package && java -jar target/inditex-java-architecture-lab-2026-0.0.1-SNAPSHOT.jar

Test the endpoint
- GET http://localhost:8080/api/hello
  Expected response:
  {
    "message": "Hola Inditex, Spring Boot está funcionando"
  }

Project structure
- pom.xml — Maven configuration and dependencies
- src/main/java — source code (main class and controller)
- src/main/resources — configuration (application.properties)
- src/test/java — tests

Additional configuration
- Change the port in src/main/resources/application.properties with server.port=8081 (for example)

