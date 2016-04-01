package com.petrov;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pavelpetrov on 01.04.16.
 */
public class MinimumOfArrayTest {
    MinimumOfArray minimumOfArray;


    @Before
    public void setUp() throws Exception {
        minimumOfArray = new MinimumOfArray();

    }

    @After
    public void tearDown() throws Exception {
        minimumOfArray = null;
    }

    @Test
    public void testFindMax() throws Exception {
        int[] array = {12, 34,0 ,12, -4, 0};
        int a = minimumOfArray.findMax(array);
        int expected  = -4;
        Assert.assertEquals(expected, a);


    }
    @Test
    public void testFindMax2() throws Exception {
        int[] array = {};
        int a = minimumOfArray.findMax(array);
        int expected  = 0;
        Assert.assertEquals(expected, a);
    }
    @Test
    public void testFindMax3() throws Exception {
        int[] array = {1};
        int a = minimumOfArray.findMax(array);
        int expected  = 1;
        Assert.assertEquals(expected, a);
    }
}