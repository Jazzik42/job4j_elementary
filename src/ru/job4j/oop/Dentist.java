package ru.job4j.oop;

public class Dentist extends Doctor {
    private int teethNumber;

    public Dentist(String name, String surname, String education, String birthday, String medKnowledge,
                   MedicalKit medicalKit, MedicalTools tools, int teethNumber) {
        super(name, surname, education, birthday, medKnowledge, medicalKit, tools);
        this.teethNumber = teethNumber;
    }

    public void treatTeeth(int teethNumber, MedicalTools tools) {
    }
}