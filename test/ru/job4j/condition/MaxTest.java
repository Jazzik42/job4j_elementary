package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1TO4then4() {
        int result = Max.max(1, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax6TO5then6() {
        int result = Max.max(6, 5);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax6TO6then6() {
        int result = Max.max(6, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax1234then4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax123then3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }
}