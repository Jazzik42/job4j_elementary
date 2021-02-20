package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
import java.util.List;

public class ConvertList2ArrayTest {

    @Test
    public void toArray() {
    ConvertList2Array convert = new ConvertList2Array();
    List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int[][] array = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 0, 0}};
    assertThat(convert.toArray(list, 4), is(array));
    }
}