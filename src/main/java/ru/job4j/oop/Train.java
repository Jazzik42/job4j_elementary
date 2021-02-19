package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Rides of rails");
    }

    @Override
    public void turn() {
        System.out.println(getClass().getSimpleName() + " Turns left");
    }
}

