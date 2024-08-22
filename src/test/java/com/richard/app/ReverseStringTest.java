package com.richard.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseStringTest {

	private ReverseString instance = null;
	
	@Before
	public void setup() {
		instance = new ReverseString();
	}
	
	@Test
	public void testReverseNullReturnNull() {
		assertNull(instance.reverse(null));
	}
	
	
	@Test
	public void testReverseABCReturnCBA() {
		assertEquals("CBA", instance.reverse("ABC"));
	}
	
	@Test
	public void testReverseStringWithSpace() {
		assertEquals("nahC drahciR", instance.reverse("Richard Chan"));
	}
}
