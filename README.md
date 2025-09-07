Bookstore API
This is a RESTful API for managing book and author data. It serves as a backend for a bookstore application, providing a set of endpoints for performing CRUD (Create, Read, Update, Delete) operations.

Features
Book Management: Endpoints to create, retrieve, update, and delete books.

Author Management: Endpoints to manage author information.

Relational Data: Books are linked to their respective authors.

Filtering, Pagination, and Sorting: Advanced query capabilities to efficiently retrieve data from the API.

In-Memory Database: Uses H2 database for a simple, file-based, and lightweight development environment.

API Documentation: Automatically generated and interactive API documentation with Swagger.

Technology Stack
Java: The core programming language.

Spring Boot: The framework used to build the application.

Spring Data JPA: Used for database interactions.

Hibernate: The Object-Relational Mapping (ORM) tool.

H2 Database: An in-memory database for development.

Maven: The build automation and dependency management tool.

Getting Started
Prerequisites
To run this project, you will need:

Java Development Kit (JDK) 17 or higher

Maven 3.6.3 or higher

Running the Application
Clone the repository to your local machine:

git clone  https://github.com/hemanthkr28/RESTful-Bookstore-API

Navigate to the project directory:

cd bookstore-api

Build and run the application using Maven:

mvn spring-boot:run

The application will start on port 8080.

API Documentation and Testing
The API is fully documented using Swagger. Once the application is running, you can access the interactive documentation and test all endpoints directly from your browser.

Swagger UI Link: http://localhost:8080/swagger-ui.html

You can also use an API client like Postman with the Postman collection you created to test the endpoints.

Postman Collection

This project was developed as a hands-on exercise in building a RESTful API with Spring Boot.
