package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinCalTest extends BaseTest {

    @Test
    public void testSinDouble(){
        Assert.assertEquals(calculator.sin(0),0.0);
    }
}
