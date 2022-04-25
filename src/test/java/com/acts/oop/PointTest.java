package com.acts.oop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class PointTest {
    @Test
    public void distance3d() {
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(-7, -2, 4);
        double expected = 9.0;
        double result = point1.distance3d(point2);
        assertThat(result, is(expected));
    }
}