public class Strings {
    public static void main(String[] args) {
//        String fruit1 = "mango";
//        String fruit2 = "mango";

        String fruit1 = new String("mango");
        String fruit2 = new String("mango");

        System.out.println(fruit1 == fruit2);
        System.out.println(fruit1.equals(fruit2));
    }
}
