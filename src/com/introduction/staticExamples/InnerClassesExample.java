package com.introduction.staticExamples;

public class InnerClassesExample {
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("mike");
        Test b = new Test("eleven");
    }
}
