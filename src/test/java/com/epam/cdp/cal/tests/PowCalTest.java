package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowCalTest extends BaseTest {

    @Test
    public void testPowDouble(){
        Assert.assertEquals(calculator.pow(2.0,3.0), 8.0);
    }

    @Test
    public void testPowDoubleNegative(){
        Assert.assertEquals(calculator.pow(2.0,-3.0), 0.125);
    }
}
