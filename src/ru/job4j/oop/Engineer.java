package ru.job4j.oop;

public class Engineer extends Profession {
    private String techKnowledge;

    public Engineer(String name, String surname, String education, String birthday, String techKnowledge) {
        super(name, surname, education, birthday);
        this.techKnowledge = techKnowledge;
    }

    public void useKnowledge(String techKnowledge) {
    }
}
