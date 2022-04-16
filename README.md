# Get Course Pricing - Springboot- Assignment

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)
- [My SQL 8.0.19](https://www.mysql.com/)
## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.assignment.api.ApiApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
####  Curl
######  Syntex
```shell
curl http://localhost:8080/ecode/<value>
```
######  Example
```shell
curl http://localhost:8080/ecode/text
```
