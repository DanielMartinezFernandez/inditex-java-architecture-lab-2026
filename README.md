# Inditex Architecture Lab 2026

English | [Español](#español)

Project in Java with Spring Boot for the Inditex technical test (January 2026).

Overview
- Spring Boot 3.4.x (Java 21)
- Sample REST controller to query product prices
- OpenAPI specification included and Swagger UI enabled
- Javadoc added to key public classes (controller, DTOs and main class)
- Basic tests with Spring Boot Test and MockMvc

Requirements
- JDK 21 (OpenJDK or similar)
- Maven 3.9+ (optional if you use mvnw)

How to run
1) Build and run tests:
   - mvn clean verify
2) Start the application:
   - mvn spring-boot:run
   - or: mvn clean package && java -jar target/architecture-lab-0.0.1-SNAPSHOT.jar

API documentation
- Swagger UI: http://localhost:8080/inditex/swagger-ui.html
- OpenAPI JSON: http://localhost:8080/inditex/v3/api-docs
- OpenAPI YAML served from resources: /inditex/openapi/openapi.yaml

Main endpoint
- GET /inditex/api/products/{product-id}/prices
  Parameters:
  - path product-id (long)
  - query brand-id (long)
  - query search-date (ISO-8601, e.g. 2020-06-14T10:00:00)

Quick example (curl)
curl "http://localhost:8080/inditex/api/products/35455/prices?brand-id=1234&search-date=2020-06-13T10:00:00" \
  -H "Accept: application/json"

Expected response (demo):
{
  "product-id": 35455,
  "brand-id": 1234,
  "price-id": 5678,
  "init-date": "2020-06-12T10:00:00",
  "expiration-date": "2020-06-14T10:00:00",
  "price": 35.50,
  "currency": "EUR"
}

Generate and view Javadoc
- Generate: mvn -DskipTests javadoc:javadoc
- Output: target/site/apidocs/index.html

Project structure
- pom.xml — Maven configuration and dependencies
- src/main/java — source code (main class and REST controller)
- src/main/resources — configuration (application.yml) and OpenAPI YAML
- src/test/java — tests

Additional configuration
- Default port: 8080. You can change it in src/main/resources/application.yml with server.port=8081 (for example).
- Configured context path: /inditex (see application.yml). That is why the real endpoint starts with /inditex/...

---

## Español

Proyecto Java con Spring Boot para el test técnico de Inditex (enero 2026).

Resumen
- Spring Boot 3.4.x (Java 21)
- Controlador REST de ejemplo para consultar precios de productos
- Especificación OpenAPI incluida y Swagger UI habilitado
- Javadoc añadido en clases públicas clave (controlador, DTOs y clase principal)
- Tests básicos con Spring Boot Test y MockMvc

Requisitos
- JDK 21 (OpenJDK o similar)
- Maven 3.9+ (opcional si usas mvnw)

Cómo ejecutar
1) Compilar y ejecutar tests:
   - mvn clean verify
2) Arrancar la aplicación:
   - mvn spring-boot:run
   - o: mvn clean package && java -jar target/architecture-lab-0.0.1-SNAPSHOT.jar

Documentación de la API
- Swagger UI: http://localhost:8080/inditex/swagger-ui.html
- OpenAPI JSON: http://localhost:8080/inditex/v3/api-docs
- OpenAPI YAML servido desde recursos: /inditex/openapi/openapi.yaml

Endpoint principal
- GET /inditex/api/products/{product-id}/prices
  Parámetros:
  - path product-id (long)
  - query brand-id (long)
  - query search-date (ISO-8601, p. ej. 2020-06-14T10:00:00)

Ejemplo rápido (curl)
curl "http://localhost:8080/inditex/api/products/35455/prices?brand-id=1234&search-date=2020-06-13T10:00:00" \
  -H "Accept: application/json"

Respuesta esperada (demo):
{
  "product-id": 35455,
  "brand-id": 1234,
  "price-id": 5678,
  "init-date": "2020-06-12T10:00:00",
  "expiration-date": "2020-06-14T10:00:00",
  "price": 35.50,
  "currency": "EUR"
}

Generar y consultar Javadoc
- Generar: mvn -DskipTests javadoc:javadoc
- Salida: target/site/apidocs/index.html

Estructura del proyecto
- pom.xml — configuración de Maven y dependencias
- src/main/java — código fuente (clase principal y controlador REST)
- src/main/resources — configuración (application.yml) y OpenAPI YAML
- src/test/java — tests

Configuración adicional
- Puerto por defecto: 8080. Puedes cambiarlo en src/main/resources/application.yml con server.port=8081 (por ejemplo).
- Context path configurado: /inditex (ver application.yml). Por eso el endpoint real comienza por /inditex/...

