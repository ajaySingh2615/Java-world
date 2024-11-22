package com.introduction.interfaces;

interface A {
    int age = 44;
    String area = "UP";

    void show();

    void config();
}

interface X {
    void run();
}

class B implements A, X {

    @Override
    public void show() {
        System.out.println("B in show");
    }

    @Override
    public void config() {
        System.out.println("B in config");
    }

    @Override
    public void run(){
        System.out.println("B in run");
    }

}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.config();
        obj.show();
        obj.run();

        System.out.println(A.age);
        System.out.println(A.area);
    }
}
