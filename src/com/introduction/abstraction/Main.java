package com.introduction.abstraction;

abstract class Car{

    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("play music");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving wagonR");
    }
}

class UpdatedWagonR extends WagonR{
    public void fly(){
        System.out.println("Flying wagonR");
    }
}

public class Main {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();

        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
