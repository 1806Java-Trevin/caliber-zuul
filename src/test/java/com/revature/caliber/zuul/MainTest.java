package com.revature.caliber.zuul;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {
	static ZuulAPIGatewayApplication app = new ZuulAPIGatewayApplication();

	@Test
	public void testGetTest() {
		assertEquals("This is a passing test", "Test", app.getTest());
	}

	@Test
	public void testMain() {
		try {
			app.main(new String[] { "Test" });
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
