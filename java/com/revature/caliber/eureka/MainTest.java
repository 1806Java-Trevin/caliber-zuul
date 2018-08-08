package com.revature.caliber.eureka;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {
static EurekaDiscoveryApplication app;
	
	@BeforeClass
	public static void createSpring() {
		app = new EurekaDiscoveryApplication();
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
