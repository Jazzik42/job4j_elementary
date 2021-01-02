package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'H', 'e'};
        assertThat(ArrayChar.startsWith(word, pref), is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        assertThat(ArrayChar.startsWith(word, pref), is(false));
    }

    @Test
    public void whenNotStartWithPrefThenFalse() {
        char[] word = {'H', 'e'};
        char[] pref = {'H', 'e', 'l', 'l', 'o'};
        assertThat(ArrayChar.startsWith(word, pref), is(false));
    }
}

