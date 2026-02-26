# Keeping up to date with Java using Spring boot

Swagger:

http://localhost:8080/swagger-ui/index.html#/

Database:

Generic H2 (Embedded)
http://localhost:8080/h2-console
JDBC URL:
jdbc:h2:mem:demo

Endpoints:

GET
https://localhost:8080/api/people

POST
https://localhost:8080/api/people
{
"firstName": "christian",
"lastName": "vintilla",
"age": 43
}

PUT
https://localhost:8080/api/people/{id}
{
"firstName": "sean",
"lastName": "vintilla",
"age": 39
}

DELETE
https://localhost:8080/api/people/{id}
