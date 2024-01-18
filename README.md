# studentManagement-CRUD-RESTAPI
This is simple CRUD based RESTapi using spring boot to create , update , delete and view student .

## Database properties
  ``` 
spring.datasource.url= jdbc:mysql://localhost:3306/student_Rest
spring.datasource.username = root
spring.datasource.password = root
       
   #ORM s/w specific properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
## API Reference
### add new student
#### URL  
```http
POST   http://localhost:8080/students/add
```
```
Request body:
    {
    "name": "Saurabh singh",
    "email": "Saurabhsingh805@gmail.com",
    "course": "MCA"
}
```
```
Response :
{
    "id": 3,
    "name": "Saurabh singh",
    "email": "Saurabhsingh805@gmail.com",
    "course": "MCA"
}
```
### Get student by ID
#### URL 
```http
GET   http://localhost:8080/students/2
```
```
Response :
{
    "id": 2,
    "name": "karan verma",
    "email": "karanvaerma@gmail.com",
    "course": "B.tech"
}
```
###  Delete student by ID
#### URL 
```http
DELETE  http://localhost:8080/students/2
```
```
Response :
{
   student deleted sucessfully..
}
```








