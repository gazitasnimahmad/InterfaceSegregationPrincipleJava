package org.example;

public class Crow implements Flyable,NestBuilder,Bird {
    @Override
    public void fly() {
        System.out.println("it flies");
    }

    @Override
    public void NestBuilder() {
        System.out.println("it build nest");
    }

    @Override
    public void layEgg() {
        System.out.println("it lay egg");
    }
}
