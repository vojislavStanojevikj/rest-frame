# rest-frame

**rest-frame** is a Java-based project that provides a collection of REST format classes and error codes to streamline the development of RESTful APIs. It is built using the Spring Boot framework and follows modern Java development practices.

## Features

- **REST Format Classes**: Predefined classes to standardize REST API responses.
- **Error Code Management**: Centralized error code definitions for consistent error handling.
- **Validation Support**: Integrated with `spring-boot-starter-validation` and `jakarta.validation-api` for request validation.
- **Checkstyle Integration**: Enforces coding standards using Checkstyle.
- **Lombok Support**: Simplifies Java code with annotations for boilerplate reduction.

## Prerequisites

- **Java**: Version 21 or higher.
- **Maven**: Version 3.14.0 or higher.

## Getting Started

### Clone the Repository

```bash
```

### Build the Project

```bash
mvn clean install
```

### Run the Application

```bash
mvn spring-boot:run
```

### Project Structure
- `src/main/java`: Contains the main application code.
- `src/main/resources`: Contains configuration files, including `checkstyle.xml`.
- `pom.xml`: Maven configuration file for dependencies and plugins.
- `settings.xml`: Maven settings for repository and server configuration.

### Dependencies
- **Spring Boot Starter Validation**: For request validation.
- **Jakarta Validation API**: For validation annotations.
- **Jackson Annotations**: For JSON serialization and deserialization.
- **Lombok**: To reduce boilerplate code.

### Maven Profiles
The project includes a `github` Maven profile for publishing artifacts to GitHub Packages.
Ensure your `settings.xml` is configured with the correct credentials.
Example: `settings.xml`
```xml
<settings>
    <servers>
        <server>
            <id>github</id>
            <username>your-username</username>
            <password>your-token</password>
        </server>
    </servers>
</settings>
```

### Checkstyle
The project uses Checkstyle to enforce coding standards. The configuration file is located at `src/main/resources/checkstyle.xml`. You can run Checkstyle using the following command:

```bash
mvn checkstyle:check
```
