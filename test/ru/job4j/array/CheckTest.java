package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
public class CheckTest {

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] input = new boolean[] {false, false, false, false};
        boolean result = Check.mono(input);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[] {false, false, true, false};
        boolean result = Check.mono(input);
        boolean expect = false;
        assertThat(result, is(expect));
    }
}