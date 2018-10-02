package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TgCalTest extends BaseTest {

    @Test
    public void testTgDouble(){
        Assert.assertEquals(calculator.tg(0),0.0);
    }
}
