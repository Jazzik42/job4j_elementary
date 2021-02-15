package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class ComparatorStringCharTest {

    @Test
    public void compare() {
        ComparatorStringChar compare = new ComparatorStringChar();
        int rst = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(rst, is(0));
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        ComparatorStringChar compare = new ComparatorStringChar();
        int rst = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(rst, lessThan(0));
    }

        @Test
        public void whenLeftGreaterThanRightResultShouldBePositive() {
            ComparatorStringChar compare = new ComparatorStringChar();
            int rst = compare.compare(
                    "Petrov",
                    "Ivanova"
            );
            assertThat(rst, greaterThan(0));
        }

        @Test
        public void secondCharOfLeftGreaterThanRightShouldBePositive() {
            ComparatorStringChar compare = new ComparatorStringChar();
            int rst = compare.compare(
                    "Petrov",
                    "Patrov"
            );
            assertThat(rst, greaterThan(0));
        }

        @Test
        public void secondCharOfLeftLessThanRightShouldBeNegative() {
            ComparatorStringChar compare = new ComparatorStringChar();
            int rst = compare.compare(
                    "Patrova",
                    "Petrov"
            );
            assertThat(rst, lessThan(0));
        }
    }
