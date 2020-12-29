package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void when7ThenTrue() {
        int number = 7;
        boolean expected = true;
        assertThat(expected, is(true));
    }

    @Test
    public void when12ThenFalse() {
        int number = 12;
        boolean expected = false;
        assertThat(expected, is(false));
    }

    @Test
    public void when1ThenFalse() {
        boolean expected = CheckPrimeNumber.check(1);
        assertThat(expected, is(false));
    }
}