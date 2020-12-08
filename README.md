# MasterCard-Challenge

Description: Determining if two cities are connected. Two cities are considered connected if there’s a series of roads that can be traveled from one city to another. List of roads is available in a file. The file contains a list of city pairs (one pair per line, comma separated), which indicates that there’s a road between those cities.

## Getting Started
### Prerequisites
* Git
* JDK 8 or later
* Maven 3.0 or later

### Clone
To get started you can simply clone this repository using git or download the project and import using pom.xml file in your IDE.

## Running the application locally
There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the com/connected/cityroutes/Application class from your IDE.

Alternatively you can use the Spring Boot Maven plugin like so:

mvn spring-boot:run

### Configuration

The configuration is located in `src/main/resources/application.properties`.
You can enter the exposed API while the application is running.
For example: http://localhost:8080/connected?origin=Boston&destination=Newark
You may also enter more routes in city.txt file.

### Unit Test 
The JUnit unit tests are located as usual in their respective package, under root of-

src/test/java/com/connected/cityroutes/ApplicationTests.java 


