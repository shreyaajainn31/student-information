package com.example.practice.mypackage.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity

@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)        
    int id;
    String name; 
    String email;
    String dob;
    int age;
}
