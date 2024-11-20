package com.introduction;

public class Main {
    public static void main(String[] args) {
        // store 5 roll numbers
        // int[] numbers = new int[5];

        // store of five names
        // String[] names = new String[5];

        // data of five students: {roll no, name, marks}
        // int[] rno = new int[5];
        // String[] name = new String[5];
        // float[] marks = new float[5];

        // Student[] students = new Student[5];

        Student mike = new Student(13, "mike", 78.99f);
        // Student rahul = new Student();

        // System.out.println(mike.rno);

        Student randomPerson = new Student();
        // System.out.println(randomPerson.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);

    }
}

class Student {
    int rno;
    String name;
    float marks;

    public Student() {
        this(12, "default person", 99.0f);
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    void changeName(String newName) {
        this.name = newName;
    }

    void greeting() {
        System.out.println("Hello, my name is " + this.name);
    }

}
