package ru.job4j.oop;

public class Dentist extends Doctor {
    public Dentist(String name, String surname, String education, String birthday, String medKnowledge,
                   MedicalKit medicalKit, MedicalTools tools) {
        super(name, surname, education, birthday, medKnowledge, medicalKit, tools);

    }

    public void treatTeeth(MedicalTools tools) {
    }
}