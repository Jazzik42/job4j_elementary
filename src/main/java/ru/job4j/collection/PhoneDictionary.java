package ru.job4j.collection;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            Person ps = persons.get(i);
            if (ps.getName().contains(key) || ps.getSurname().contains(key)
                                            || ps.getAddress().contains(key)
                                            || ps.getPhone().contains(key)) {
                result.add(ps);
            }
        }
        return result;
    }
}