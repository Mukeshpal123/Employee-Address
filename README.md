# 🏡Employee Address
<h1 align="center"> Employee_Address :wave: </h1>

>### Prerequisites
* ![MySql](https://img.shields.io/badge/DBMS-MYSQL%205.7%20or%20Higher-red)
 * ![SpringBoot](https://img.shields.io/badge/Framework-SpringBoot-green)


* ![Java](https://img.shields.io/badge/Language-Java%208%20or%20higher-yellow)

>## Getting started
* Clone the repository to your local machine.
* Create a MySQL database and update the application.properties file with the database credentials and connection details.
* Build the project using Maven: mvn clean install
* Run the application using java -jar target/employee-management-system-0.0.1-SNAPSHOT.jar
* Access the APIs using any HTTP client such as Postman or cURL.
>## Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

>## API Documentation
`The following APIs are provided by the application:`

`Employee APIs`
* GET /employees - get all employees
* GET /employees/{id} - get an employee by id
* POST /employees - create a new employee
* PUT /employees/{id} - update an employee by id
* DELETE /employees/{id} - delete an employee by id

`Address APIs`
* GET /address - get all addresses
* GET /address/{id} - get an address by id
* POST /address - create a new address
* PUT /address/{id} - update an address by id
* DELETE /address/{id} - delete an address by id
