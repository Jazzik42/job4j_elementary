package ru.job4j.oop;

public class Surgeon extends Doctor {
    public Surgeon(String name, String surname, String education, String birthday, String medKnowledge, MedicalKit medicalKit, MedicalTools tools) {
        super(name, surname, education, birthday, medKnowledge, medicalKit, tools);

    }

    public void sewUpScar(int scarLength, MedicalTools tools) {
        }

}
