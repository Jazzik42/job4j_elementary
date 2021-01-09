package ru.job4j.oop;

public class Builder extends Engineer {
    private int subordinates;
    private int buildHeight;

    public Builder(String name, String surname, String education, String birthday, String techKnowledge, int subordinates, int buildHeight) {
        super(name, surname, education, birthday, techKnowledge);
        this.subordinates = subordinates;
        this.buildHeight = buildHeight;
    }

    public void build(int subordinates, int buildHeight) {
    }
}