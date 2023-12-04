# Practice question 4
This is an Individual project, I have worked on rest API service.

## Backend Work
-  Proper Exception Handling
-  Proper Input Validation
-   Data Stored in the database(mySQL)

## Installation and Run
-  You can clone this repo and start the serve on localhost
-   Before running the API server, we should update the database config inside the application.properties file.
-   Update the port number, username and password as per our local database config.

server.port=8090
#db configuration
spring.datasource.url=jdbc:mysql://localhost:3306/user
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
#create,update,create-drop,validate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Tech Stacks

-   Java Core
-   Spring Data JPA
-   Spring Boot
-   Hibernate
-   MySQL

## Thank You! For your Time : )

