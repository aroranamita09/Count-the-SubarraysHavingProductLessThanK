package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountArraysTest {
    CountArrays obj;
    @Before
    public void setUp() throws Exception {
        obj = new CountArrays();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void countsubarray() {
        assertEquals(7,obj.countsubarray(new int[] {1, 2, 3, 4}, 4,10));
    }
}