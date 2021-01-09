package ru.job4j.oop;

public class Programmer extends Engineer {
    private int codeSize;
    private int printSpeed;

    public Programmer(String name, String surname, String education, String birthday, String techKnowledge, int codeSize, int printSpeed) {
        super(name, surname, education, birthday, techKnowledge);
        this.codeSize = codeSize;
        this.printSpeed = printSpeed;
    }

    public int timeTask(int codeSize, int printSpeed) {
        int time = -1;
        return time;
    }
}

