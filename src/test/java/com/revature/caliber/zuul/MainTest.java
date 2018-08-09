package com.revature.caliber.zuul;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {
	static ZuulAPIGatewayApplication app;

	@BeforeClass
	public static void createSpring() {
		app = new ZuulAPIGatewayApplication();
	}

	@Test
	public void testMain() {
		assertEquals("This is a passing test", "Test", app.getTest());
	}

	@AfterClass
	public static void deleteSpring() {
		app = null;
	}
}
