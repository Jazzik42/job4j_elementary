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
        int[] massiv = new int[]{6, 1, 2, 5};
        int el = 7;
        int expect = FindLoop.indexOf(massiv, el);

        assertThat(expect, is(-1));
    }

    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind2() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind6() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 6;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}