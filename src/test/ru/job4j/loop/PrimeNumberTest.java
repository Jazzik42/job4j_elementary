package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
public class PrimeNumberTest {

    @Test
    public void whenNumbers5() {
        int number = 5;
        int expected = PrimeNumber.calc(5);
        assertThat(expected, is(3));
    }

    @Test
    public void when11() {
        int count = PrimeNumber.calc(11);
        assertThat(count, is(5));
    }

    @Test
    public void when2() {
        int count = PrimeNumber.calc(2);
        assertThat(count, is(1));
    }
}