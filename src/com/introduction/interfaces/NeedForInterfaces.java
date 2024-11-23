package com.introduction.interfaces;

interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile and run...");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile and run || faster");
    }
}

class Developer {
    public void devApp(Computer computer) {
        computer.code();
    }
}

public class NeedForInterfaces {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer mike = new Developer();
        mike.devApp(desk);
    }

}
