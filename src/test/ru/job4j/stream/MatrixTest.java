package ru.job4j.stream;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MatrixTest {
    @Test
    public void whenMatrix() {
        Matrix matrix = new Matrix();
        Integer[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6,
                7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertThat(matrix.toMatrix(array), is(expect));
    }
}
