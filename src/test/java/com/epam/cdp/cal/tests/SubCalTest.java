package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubCalTest extends BaseTest {

	@Test(dataProvider = "valuesForSubTest")
	public void twoMinusOne(long a, long b, long expectedResult) {
		long result = calculator.sub(a, b);
		Assert.assertEquals(result, expectedResult);
	}

	@DataProvider(name = "valuesForSubTest")
	public Object[][] valuesForSub() {
		return new Object[][] {
				{33, 23, 10},
				{9, -1, 10},
				{0, 0, 0},
		};
	}
}
