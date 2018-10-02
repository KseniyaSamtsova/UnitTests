package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgCalTest extends BaseTest {

    @Test
    public void testCtgDouble(){
        Assert.assertEquals(calculator.ctg(135),-1.0);
    }
}
