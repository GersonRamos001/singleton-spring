# Singleton Pattern Example with Spring Boot

## Overview
This project demonstrates the implementation of the Singleton design pattern in a Spring Boot application, following Clean Code and SOLID principles. It provides a simple, production-ready example for learning purposes, focusing on thread safety, dependency injection, and modularity.

## Project Structure
- **SingletonExample.java**: Implements the Singleton pattern with double-checked locking for thread safety.
- **ConfigurationService.java**: Service layer to interact with the Singleton instance.
- **DemoController.java**: REST controller exposing an endpoint to retrieve configuration.
- **DemoApplication.java**: Spring Boot application entry point.

## Features
- Thread-safe Singleton implementation.
- Spring Boot integration with dependency injection.
- REST API endpoint to access configuration (`/config`).
- Adheres to SOLID principles (Single Responsibility, Dependency Inversion).

## Setup and Installation
1. **Prerequisites**:
   - Java 17 or later
   - Maven 3.8+
   - Spring Boot 3.x

2. **Build and Run**:
   ```bash
   git clone <repository-url>
   cd singleton-example
   mvn clean install
   mvn spring-boot:run
   ```

3. **Access the API**:
   - Endpoint: `GET http://localhost:8080/api/config`
   - Response: `"Initialized Configuration"`

## Usage
- The `/config` endpoint retrieves the configuration from the Singleton instance.
- The Singleton is managed by Spring's IoC container as a `@Component`.

## Design Considerations
- **Thread Safety**: Uses double-checked locking in `SingletonExample` to ensure thread-safe initialization.
- **Spring Integration**: Leverages Spring's default singleton scope for beans, with manual Singleton pattern for demonstration.
- **SOLID Principles**:
  - **Single Responsibility**: Each class has a single, well-defined purpose.
  - **Dependency Inversion**: Dependencies are injected via constructors.
- **Extensibility**: Can be extended with `@ConfigurationProperties` for externalized configuration.



## Contributing
1. Fork the repository.
2. Create a feature branch (`git checkout -b feature/your-feature`).
3. Commit changes (`git commit -m 'Add your feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Open a Pull Request.

## License
MIT License - see [LICENSE](LICENSE) for details.
