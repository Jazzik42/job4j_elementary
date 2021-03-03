package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class FullSearchTest {

    @Test
    public void extractNumber() {
        List<TaskTask> list = List.of(
        new TaskTask("1", "First desc"),
        new TaskTask("2", "Second desc"),
        new TaskTask("1", "First desc"));
        HashSet<String> set = new HashSet<>(List.of("1", "2"));
                assertThat(FullSearch.extractNumber(list), is(set));

    }
}