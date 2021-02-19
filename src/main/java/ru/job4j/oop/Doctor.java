package ru.job4j.oop;

public class Doctor extends Profession {
    private String medKnowledge;
    private MedicalKit medicalKit;
    private MedicalTools tools;

    public Doctor(String name, String surname, String education, String birthday, String medKnowledge, MedicalKit medicalKit, MedicalTools tools) {
        super(name, surname, education, birthday);
        this.medKnowledge = medKnowledge;
        this.medicalKit = medicalKit;
        this.tools = tools;
    }

    public void useKnowledge(String techKnowledge) {
    }
}

