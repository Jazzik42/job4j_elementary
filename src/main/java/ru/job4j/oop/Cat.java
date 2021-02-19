package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);

    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void getNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("This is Gav. And there are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.getNick("CotenokGav");
        gav.show();
        System.out.println("This is Black.And there are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.getNick("CotenokBlack");
        black.show();
    }
}