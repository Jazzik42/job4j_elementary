package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class ConvertListTest {

    @Test
    public void convert() {
    List<int[]> list = new ArrayList<>();
    list.add(new int[] {2, 3});
    list.add(new int[] {2, 3, 5, 6});
    List<Integer> expect = Arrays.asList(2, 3, 2, 3, 5, 6);
    assertThat(ConvertList.convert(list), is(expect));
    }
}