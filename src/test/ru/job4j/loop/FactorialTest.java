package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int n = 5;
        int expected = 120;
        int out = Factorial.calc(n);
         assertThat(expected, is(out));
    }

    @Test
    public void  whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int expected = 1;
        int out = Factorial.calc(n);
        assertThat(expected, is(out));
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int n = 1;
        int expected = 1;
        int out = Factorial.calc(n);
        assertThat(expected, is(out));
    }
}