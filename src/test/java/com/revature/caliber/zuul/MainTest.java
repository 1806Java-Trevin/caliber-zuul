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
	public void testGetTest() {
		assertEquals("This is a passing test", "Test", app.getTest());
	}
	
	@Test
	public void testMain() {
		// assert("Testing main", void, app.main(new String[] {"Test"}));
		try {
			ZuulAPIGatewayApplication.main(new String[] {"Test"});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public static void deleteSpring() {
		app = null;
	}
}
