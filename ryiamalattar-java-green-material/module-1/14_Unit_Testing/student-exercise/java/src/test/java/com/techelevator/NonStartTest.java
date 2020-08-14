package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonStartTest {
	
 private NonStart start;
	
	@Before
	public void setUp() {
		start = new NonStart();
	}
	
	@Test
	public void nonStartEmpty() {
		Assert.assertEquals("", start.getPartialString("a", "b"));
	}
	
	@Test
	public void nonStart() {
		Assert.assertEquals("cde", start.getPartialString("a", "bcde"));
		Assert.assertEquals("vFrE", start.getPartialString("GvFrE", "G"));
		Assert.assertEquals("vFrEhurig", start.getPartialString("GvFrE", "nhurig"));
	}
	
}
