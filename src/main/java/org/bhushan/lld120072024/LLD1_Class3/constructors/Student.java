package org.bhushan.lld120072024.LLD1_Class3.constructors;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Student {
    private String name ;
    private int age ;
    private double psp ;
    private List<Integer> grades ;
    public Student(String name, int age, double psp , List<Integer> grades) {
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.grades = grades;
    }

    //Default constructor
    public Student() {

    }

    //Copy Contructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.psp = s.psp;
        this.grades = s.grades;
    }
}
