package com.introduction.Enum;

enum Status {
    Running, Failed, Pending, Success;
}

enum Laptop {
    Macbook(2000), XPS(2200), Surface(1800), Windows(1200), ThinkPad(1000);

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Main {
    public static void main(String[] args) {
        // Status s = Status.Success;
        // Status[] s = Status.values();

        // for (Status status : s) {
        // System.out.println(status);
        // }

        // Status s = Status.Pending;

        // if (s == Status.Running) {
        //     System.out.println("All good");
        // } else if (s == Status.Failed) {
        //     System.out.println("Try Again!");
        // } else if (s == Status.Pending) {
        //     System.out.println("Please Wait");
        // } else {
        //     System.out.println("Done");
        // }

        // Laptop laptop = Laptop.Macbook;
        // System.out.println(laptop);
        // System.out.println(laptop + " : " + laptop.getPrice());

        for(Laptop laptop : Laptop.values()){
            System.out.println(laptop + " : " + laptop.getPrice());
        }
    }
}
