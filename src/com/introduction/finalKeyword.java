package com.introduction;

public class finalKeyword {
    public static void main(String[] args) {
        final int age = 20;
        System.out.println(age);

       final A mike = new A("mike");
       mike.name = "Ajay";
        System.out.println(mike.name);

    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }
}
