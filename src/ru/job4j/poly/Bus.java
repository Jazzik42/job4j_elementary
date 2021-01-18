package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void riding() {
        System.out.println("Wroom wroom wroom");
    }

    @Override
    public void passengers(int quantity) {
    quantity += quantity;
    }

    @Override
    public int fill(int fuel) {
        return fuel * 5;
    }
}
