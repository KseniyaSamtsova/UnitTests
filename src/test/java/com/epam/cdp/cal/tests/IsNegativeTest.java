package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNegativeTest extends BaseTest {

    @Test
    public void testIsNegative(){
        Assert.assertTrue(calculator.isNegative(-2));
    }

    @Test
    public void testIsNegativeNegative(){
        Assert.assertFalse(calculator.isNegative(2));
    }

    @Test
    public void testIsNegativeZero(){
        Assert.assertFalse(calculator.isNegative(0));
    }
}
