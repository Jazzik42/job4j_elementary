package ru.job4j.collection;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        Person petr = new Person("Petr", "Arsentev", "51424", "Bryansk");
        PhoneDictionary phdic = new PhoneDictionary();
        phdic.add(petr);
        ArrayList<Person> phone = phdic.find("sent");
        assertThat(phone.get(0).getSurname(), is("Arsentev"));
    }
}