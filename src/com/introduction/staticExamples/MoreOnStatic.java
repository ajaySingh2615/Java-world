package com.introduction.staticExamples;

public class MoreOnStatic {
    static int a = 4;
    static int b;

    static {
        System.out.println("I am in static block");
        b = a * 5;
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        MoreOnStatic obj = new MoreOnStatic();

        System.out.println(MoreOnStatic.a + " " + MoreOnStatic.b);

        MoreOnStatic.b += 10;
        System.out.println(MoreOnStatic.a + " " + MoreOnStatic.b);

        MoreOnStatic obj2 = new MoreOnStatic();
        System.out.println(MoreOnStatic.a + " " + MoreOnStatic.b);

    }
}
