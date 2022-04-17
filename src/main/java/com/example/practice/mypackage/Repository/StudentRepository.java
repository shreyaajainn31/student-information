package com.example.practice.mypackage.Repository;

import com.example.practice.mypackage.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query(value = "select * from student", nativeQuery = true)
    public List<Student> getStudents();

    @Modifying
    @Query(value = "delete from student where id=:id", nativeQuery = true)
    void deleteStudentInformation(int id);

    @Modifying
    @Query(value = "update student s set s.age=:age, s.dob=:dob, s.email=:email, s.name=:name where s.id=:id", nativeQuery = true)
    void editStudentInformation(int id, int age, String dob, String email, String name);
}
