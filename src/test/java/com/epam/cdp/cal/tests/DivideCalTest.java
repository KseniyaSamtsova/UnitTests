package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivideCalTest extends BaseTest {

    @Test
    public void testDivideLong(){
        Assert.assertEquals(calculator.div(100000,2),50000);
    }

    @Test
    public void testDivideNegative(){
        Assert.assertEquals(calculator.div(-100000,2),-50000);
    }

    @Test
    public void testDivideDouble(){
        Assert.assertEquals(calculator.div(16.5,5.5),3.0);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testDivideOnZeroLong(){
        calculator.div(6,0);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testDivideOnZeroDouble(){
        calculator.div(6.0,0.0);
    }

}
