# Product Common Core

## Description
The **Product Common Core** library serves as a common module designed to streamline and centralize shared functionality for microservices and batch jobs within the product ecosystem. 
This library ensures consistency, re-usability, and ease of maintenance by providing essential services, utilities, and configurations that are commonly used.

## Technologies Used
- **Spring Boot**: A Java-based framework used for building production-ready, stand-alone, and microservice-oriented web applications.
- **Java**: A versatile, platform-independent programming language utilized for developing the API and backend logic.

## Pre-requisites
Before you begin, ensure that you have the following tools and services installed:
1. **Java**  
   Ensure that you have **Java 17** installed on your system. You can verify this by running:
   ```bash
   java -version
   ```
---

## Setup Instructions
1. Download Java 17 and verify Gradle installation
    1. Download Java from [Oracle Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) or [AdoptOpenJDK](https://adoptium.net/).  
       Verify the installation by running:
         ```bash
         java -version
         ```
       Ensure it outputs Java 17.
    2. **Gradle**: Verify Gradle is installed by running:
         ```bash
         gradle -v
         ```
       Alternatively, use the Gradle wrapper provided in the project (`./gradlew`).
2. Link Gradle project
    1. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
    2. Import it as a Gradle project using the build.gradle file.
3.  Build the Project
    Run the following command to build and verify the project:
    ```bash
    ./gradlew clean build publishToMavenLocal
    ```

---

### Repository Usage

| **Microservice**               | **Description**                                           | **Repository Link**                                                                             | 
|--------------------------------|-----------------------------------------------------------|-------------------------------------------------------------------------------------------------|
| **Delete Products BatchJob**   | Handles the deletion of products.                         | [Delete Products BatchJob Repo](https://github.com/brandontan2003/delete_products_batchjob)     |
| **Product Management Service** | Manages product-related API endpoints and business logic. | [Product Management Service Repo](https://github.com/brandontan2003/product_management_service) | 

---

## Usage
Include the Product Common Core library in your project by adding the library as a dependency
- For Gradle
    ```gradle
    dependencies {
        implementation "com.example:product-common-core:${VERSION_NUMBER}"
    }
    repositories {
        mavenLocal()
    }
    ```
- For Maven
    ```xml
    <dependency>
        <groupId>com.example</groupId>
        <artifactId>product-common-core</artifactId>
        <version>${VERSION_NUMBER}</version>
    </dependency>
    ```
    ```xml
    <repository>
        <id>maven-local</id>
        <url>file://${user.home}/.m2/repository</url>
    </repository>
    ```
