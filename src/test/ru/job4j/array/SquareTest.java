package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
public class SquareTest {

    @Test
    public void whenBound4Then0149() {
        int bound = 4;
        int[] rsl = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4, 9};
        assertThat(expect, is(rsl));
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] rsl = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4, 9, 16};
        assertThat(expect, is(rsl));
    }
}