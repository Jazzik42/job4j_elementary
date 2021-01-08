package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another, int value) {
        this.load = this.load - value;
        another.load = another.load + value;
    }

    public static void main(String[] args) {
        Battery phone = new Battery(88);
        Battery watch = new Battery(48);
        System.out.println("Phone value : " + phone.load + ". second : " + watch.load);
        phone.exchange(watch, 52);
        System.out.println("Phone value : " + phone.load + ". second : " + watch.load);

    }
}
