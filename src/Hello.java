public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Java");
        System.out.println(3 + 6);

        // rules for naming variables in java
        int age = 10;
        int AGE = 10;
        System.out.println("age: " + age);
        System.out.println("AGE: " + AGE);

        int _myAge = 10;
        int $myAge = 20;
        System.out.println("_myAge: " + _myAge);
        System.out.println("$myAge: " + $myAge);

        boolean isTrue = true;
        byte byteVar = 127;
        short shortVar = 3245;
        int intVar = 23345;
        long longVar = 3446778L;
        float floatVar = 34.5f;
        double doubleVar = 345.789;
        char charVar = 'C';

        System.out.println("isTrue : " + isTrue);
        System.out.println("byteVar : " + byteVar);
        System.out.println("shortVar : " + shortVar);
        System.out.println("intVar : " + intVar);
        System.out.println("longVar : " + longVar);
        System.out.println("floatVar : " + floatVar);
        System.out.println("doubleVar : " + doubleVar);
        System.out.println("charVar : " + charVar);

        // conversion
        int age1 = 20;
        long age2 = age1;
        System.out.println("age2 : " + age2);

        long rollNumber = 2345643353L;
        int roll = (int) rollNumber;
        System.out.println("roll : " + roll);

        int[] array1 = {10, 20, 30, 40, 50};
        for(int nums : array1){
            System.out.println(nums);
        }
    }
}
