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
<<<<<<< HEAD
	public void testGetTest() {
		assertEquals("This is a passing test", "Test", app.getTest());
	}
	
	@Test
	public void testMain() {
		// assert("Testing main", void, app.main(new String[] {"Test"}));
		try {
			app.main(new String[] {"Test"});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
=======
	public void testMain() {
		assertEquals("This is a passing test", "Test", app.getTest());
>>>>>>> 9e2545a781128baa8f926d7595415bda31657ac1
	}
	
	@AfterClass
	public static void deleteSpring() {
		app = null;
	}
}
