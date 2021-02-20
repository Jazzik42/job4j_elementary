package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenAB2AC2BC2() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenAB5AC25BC2() {
        boolean result = Triangle.exist(5.0, 25.0, 2.0);
        assertThat(result, is(true));
    }
}