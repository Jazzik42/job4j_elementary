package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;

        double expected = 2;

        double out = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23to45then282() {
        int x1 = 2;
        int x2 = 4;
        int y1 = 3;
        int y2 = 5;

        double expected = 2.82;

        double out = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to22then141() {
        int x1 = 1;
        int x2 = 2;
        int y1 = 1;
        int y2 = 2;

        double expected = 1.41;

        double out = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expected, out, 0.01);
    }
}