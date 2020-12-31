package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class FindLoopTest {

    @Test
    public void when5432Then2() {
        int[] massiv = new int[] {5, 4, 3, 2};
        int el = 3;
        int expect = FindLoop.indexOf(massiv, el);

        assertThat(expect, is(2));
    }

    @Test
    public void when6125Then() {
        int[] massiv = new int[] {6, 1, 2, 5};
        int el = 7;
        int expect = FindLoop.indexOf(massiv, el);

        assertThat(expect, is(-1));
    }
}