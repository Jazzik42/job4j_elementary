package ru.job4j.oop;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Flies through the air");
    }

    @Override
    public void turn() {
        System.out.println(getClass().getSimpleName() + " Turns right");
    }
}
