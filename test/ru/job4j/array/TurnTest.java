package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
public class TurnTest {

    @Test
    public void when456789to987654() {
        int[] input = new int[] {4, 5, 6, 7, 8, 9};
        int[] out = Turn.back(input);
        int[] expect = new int[] {9, 8, 7, 6, 5, 4};
        assertThat(out, is(expect));
    }

    @Test
    public void when43210to01234() {
        int[] input = new int[] {4, 3, 2, 1, 0};
        int[] out = Turn.back(input);
        int[] expect = new int[] {0, 1, 2, 3, 4};
        assertThat(out, is(expect));
    }
}