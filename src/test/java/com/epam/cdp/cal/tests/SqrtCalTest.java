package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SqrtCalTest extends BaseTest {

    @Test
    public void testSqrtDouble(){
        Assert.assertEquals(calculator.sqrt(16),4.0);
    }

    @Test
    public void testSqrtDoubleNegative(){
        Assert.assertEquals(calculator.sqrt(-16),4.0);
    }

    @Test
    public void testSqrtDoubleZero(){
        Assert.assertEquals(calculator.sqrt(0),0.0);
    }
}
