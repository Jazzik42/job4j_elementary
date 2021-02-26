package ru.job4j.collection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
            Predicate<Person> getName = x -> x.getName().contains(key);
            Predicate<Person> getSurname = x -> x.getSurname().contains(key);
            Predicate<Person> getPhone = x -> x.getPhone().contains(key);
            Predicate<Person> getAddress = x -> x.getAddress().contains(key);
            Predicate<Person> combine = getName.or(getSurname).or(getPhone).or(getAddress);
        for (Person person : persons) {
           if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}