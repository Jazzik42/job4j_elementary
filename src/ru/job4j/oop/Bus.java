package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Rides on asphalt");
    }

    @Override
    public void turn() {
        System.out.println(getClass().getSimpleName() + " Turns left");
    }
}
