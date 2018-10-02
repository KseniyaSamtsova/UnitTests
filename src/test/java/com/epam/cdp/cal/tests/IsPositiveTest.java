package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveTest extends BaseTest {

    @Test (groups = {"testGroup"})
    public void testIsPositive(){
        Assert.assertTrue(calculator.isPositive(2));
    }

    @Test(groups = {"testGroup"})
    public void testIsPositiveNegative(){
        Assert.assertFalse(calculator.isPositive(-2));
    }

    @Test
    public void testIsPositiveZero(){
        Assert.assertFalse(calculator.isPositive(0));
    }
}
