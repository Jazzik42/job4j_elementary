package ru.job4j.oop;

public class Surgeon extends Doctor {
    public int scarLength;

    public Surgeon(String name, String surname, String education, String birthday, String medKnowledge, MedicalKit medicalKit, MedicalTools tools, int scarLength) {
        super(name, surname, education, birthday, medKnowledge, medicalKit, tools);
        this.scarLength = scarLength;
    }

    public void sewUpScar(int scarLength, MedicalTools tools) {
        }

}
