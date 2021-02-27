package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ProfileTest {

    @Test
    public void collect() {
        Profile pf1 = new Profile(new Address("Moscow1", "Lenin1", 1, 1));
        Profile pf2 = new Profile(new Address("Moscow2", "Lenin2", 2, 2));
        Profile pf3 = new Profile(new Address("Moscow3", "Lenin3", 3, 3));
        List<Profile> list = List.of(
                pf1, pf2, pf3
        );
        List<Address> expect = List.of(
                pf1.getAddress(),
                pf2.getAddress(),
                pf3.getAddress()
        );
        assertThat(Profile.collect(list), is(expect));
    }
}