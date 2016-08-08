package me.bytecho.travisdemo.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathUtilsTest {

    @Test
    public void testAdd() throws Exception {
        assertEquals(8, MathUtils.add(3, 5));
    }

    @Test
    public void testMinus() throws Exception {
        assertEquals(3, MathUtils.minus(4, 3)); // for test travis ci
    }

    @Test
    public void testMult() throws Exception {
        assertEquals(12d, MathUtils.mult(3, 4), 0);
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(3d, MathUtils.divide(12, 4), 0);
    }
}