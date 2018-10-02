package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CosCalTest extends BaseTest {

    @Test
    public void testCosDouble(){
        Assert.assertEquals(calculator.cos(0),1.0);
    }
}
