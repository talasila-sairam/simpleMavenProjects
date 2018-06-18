package com.simple.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.simple.junit.App;

public class AppMutiplayTest {
	
	@Test
	public final void testMultiply() {
		System.out.println("inside testMultiply method");
		App app = new App();
		int ret = app.multiply(10, 20);
		assertEquals(ret, 200);
		// fail("Not yet implemented"); // TODO
	}

}
