package com.introduction.exception;

// class MyExceptions extends Exception{
//     public MyException(String string){
//         super(string);
//     }
// }

// Custom exception class
class MyException extends Exception {
    public MyException(String string) {
        super(string);
    }
}

public class ThrowsAndThrow {
    public static void main(String[] args) {

        try {
            Class.forName("ThrowsAndThrow");
        } catch (Exception e) {
            System.out.println("Not able to find the class");
        }

        int i = 0;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new MyException("This is my exception");
            }
        } catch (MyException e) {
            // System.out.println("Cannot divide by zero...");
            j = 18 / 1;
            System.out.println("That's default output" + e);
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        }

        System.out.println(j);

        System.out.println("Its done");
    }
}
