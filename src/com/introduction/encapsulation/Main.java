package com.introduction.encapsulation;

class Human{
    private int age = 24;
    private String name = "mike";

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.age = 11;
        // obj.name = "ajay";

        obj.setAge(100);
        obj.setName("Ajay Singh Thakur");
        
        System.out.println("My name is " + obj.getName() + ", and my age is " + obj.getAge());
    }
}
