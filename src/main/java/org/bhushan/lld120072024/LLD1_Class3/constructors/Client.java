package org.bhushan.lld120072024.LLD1_Class3.constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoConstructor();
//        demoPassByValue();
    }

    private static void demoPassByValue() {
        int x = 5 ;
        fun(x);
        System.out.println(x);

        List<Integer> marks = new ArrayList<Integer>();
        marks.add(57);
        marks.add(23);
        marks.add(22);

        Student studentCreated = new Student("Satya" , 25 , 77 , Arrays.asList(77 ,87 , 97));
        fun2(studentCreated);
        System.out.println(studentCreated.getName());
        System.out.println("Debug");
    }

    private static void fun(int x) {
        x += 10 ;
    }

    private static void fun2(Student S) {
        S.setName("Souvik");
    }

    public static void demoConstructor() {
        List<Integer> marks = new ArrayList<Integer>();
        marks.add(57);
        marks.add(23);
        marks.add(22);
        Student student1 = new Student("Akshay" , 25 , 77 , marks);
        Student student2 = new Student();
        // Student3 points to Student 1
        Student student3 = new Student();
        student3 = student1;

        // Copy constructor
        Student student5 = new Student(student2);

        marks.add(89);
        Student student4 = new Student(student1);
        student1.setName("satya");
//        student4.getName();
        System.out.println("Debug");
    }
}
