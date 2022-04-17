# student-information
APIs to get, edit, delete, add student information. My SQL database is used. 


API Request are as follows:

1. Get Information: 
Type: GET
http:/localhost:8080/student/getStudents
Request: Nothing 


2. Edit Information:
Type: PUT
http:/localhost:8080/student/editStudent
Request:

3. Add information:
Type: POST
http:/localhost:8080/student/addStudent
Request:
{
        "name": "studentname1",
        "email": "abc@gmail.com",
        "dob": "11/10/2000",
        "age": 22
}


4. Delete Information:
http:/localhost:8080/student/deleteStudent/{id}

ID is needed for this.


After running the springboot application, copy the above URL's for testing. 
