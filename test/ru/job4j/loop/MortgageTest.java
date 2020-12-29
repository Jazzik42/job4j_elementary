package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void whenA100S120P50thenYear() {
        int out = Mortgage.year(100, 120, 50);
        assertThat(out, is(2));
    }

    @Test
    public void when1Year() {
        int year = Mortgage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }

    @Test
    public void when4Year() {
        int year = Mortgage.year(100, 70, 50);
        assertThat(year, is(4));
    }
}