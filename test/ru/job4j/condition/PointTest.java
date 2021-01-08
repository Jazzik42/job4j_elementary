package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when3Ddots() {
        Point dot1 = new Point(1, 2, 3);
        Point dot2 = new Point(2, 3, 5);
        double expected = 2.449;
        assertThat(expected, closeTo(dot1.distance3D(dot2), 0.01));
    }
}
