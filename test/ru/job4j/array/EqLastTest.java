package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
public class EqLastTest {

    @Test
    public void whenEq() {
        int[] right = new int[] {1, 2, 3, 4, 5, 6};
       int[] left = new int[] {5, 3, 5, 6, 5, 6};
        boolean expect = EqLast.check(right, left);
        assertThat(expect, is(true));
    }

    @Test
    public void whenNotEq() {
        int[] right = new int[] {1, 2, 3, 4, 5, 6};
        int[] left = new int[] {5, 3, 5, 6, 5, 4};
        boolean expect = EqLast.check(right, left);
        assertThat(expect, is(false));
    }
}