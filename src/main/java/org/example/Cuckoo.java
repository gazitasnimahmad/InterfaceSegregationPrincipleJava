package org.example;

public class Cuckoo implements  Flyable,Bird{
    @Override
    public void fly() {
        System.out.println("it flies");
    }


    @Override
    public void layEgg() {
        System.out.println("it lay egg");
    }
}
