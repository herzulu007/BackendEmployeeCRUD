## BackendEmployeeCRUD

### Description

This Spring Boot backend application provides a RESTful API for managing employee data within a company. It supports CRUD (Create, Read, Update, Delete) operations on employee records in an efficient and secure manner.

### Technologies Used

* Spring Boot
* Java
* Spring Data JPA
* PostgreSQL
* Maven
* JUnit

### Getting Started

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/herzulu007/BackendEmployeeCRUD.git](https://github.com/herzulu007/BackendEmployeeCRUD.git)
2. **Change to branch Master:**
   ```bash
   git checkout master
   
3. **Configure the database:**
Create a PostgreSQL database with the specified name in the application.properties file.
Set up database connection credentials in the application.properties file.
Build the application:
   ```bash
   mvn clean package

4. **Run the application:**
   ```bash
   java -jar target/BackendEmployeeCRUD.jar

5. **Project Structure:**
   * src/main/java: Contains the application's source code.
   * src/test/java: Contains unit tests.
   * src/main/resources: Contains configuration files, templates, and other resources.
   * pom.xml: Maven project configuration file.

