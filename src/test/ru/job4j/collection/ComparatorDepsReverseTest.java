package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class ComparatorDepsReverseTest {

    @Test
    public void compare() {
        int rsl = new ComparatorDepsReverse().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenUpDepartmentGoBefore() {
        int rsl = new ComparatorDepsReverse().compare(
                "K2",
                "K2/SK1"
        );
        assertThat(rsl, lessThan(0));
    }
}
