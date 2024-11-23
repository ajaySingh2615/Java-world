package com.introduction.interfaces.functional;

@FunctionalInterface
interface A {
    int add(int i, int j);
}

// class B implements A{

// @Override
// public void show() {
// System.out.println("show in B");
// throw new UnsupportedOperationException("Unimplemented method 'show'");
// }

// }

public class Main {
    public static void main(String[] args) {
        A obj = (i, j) -> i + j;

        int result = obj.add(5, 10);
        System.out.println(result);
    }
}
