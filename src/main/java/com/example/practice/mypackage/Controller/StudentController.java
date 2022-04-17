package com.example.practice.mypackage.Controller;


import com.example.practice.mypackage.Model.Student;
import com.example.practice.mypackage.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping("/addStudent")
    public void addStudentInformation(@RequestBody Student student){
        studentService.addStudentInformation(student);
    }

    @PutMapping("/deleteStudent/{id}")
    public void deleteStudentInformation(@PathVariable int id){
        studentService.deleteStudentInformation(id);
    }

    @PutMapping("/editStudent")
    public void editStudentInformation(@RequestBody Student student){
        studentService.editStudentInformation(student.getId(), student.getAge(), student.getDob(), student.getEmail(), student.getName());
    }


}
