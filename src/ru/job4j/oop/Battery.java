package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery phone = new Battery(88);
        Battery watch = new Battery(48);
        System.out.println("Phone value : " + phone.load + ". Watch value : " + watch.load);
        phone.exchange(watch);
        System.out.println("Phone value : " + phone.load + ". Watch value : " + watch.load);

    }
}
