package com.example.practice.mypackage.Service;

import com.example.practice.mypackage.Model.Student;
import com.example.practice.mypackage.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.getStudents();
    }

    @Transactional
    public void addStudentInformation(Student student) {
         studentRepository.save(student);
    }

    @Transactional
    public void deleteStudentInformation(int id) {
        studentRepository.deleteStudentInformation(id);
    }

    @Transactional
    public void editStudentInformation(int id, int age, String dob, String email, String name) {
        studentRepository.editStudentInformation(id,age,dob,email,name);
    }
}
