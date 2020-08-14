package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class StringBitsTest {

private StringBits bits;
	
	@Before
	public void setUp() {
		bits = new StringBits();
	}
	
	@Test
	public void getBitsTestNull() {
		Assert.assertEquals("", bits.getBits(""));
		Assert.assertEquals("", bits.getBits(null));
	}
	@Test
	public void getBitsTest() {
		Assert.assertEquals("Hlo", bits.getBits("Hello"));
		Assert.assertEquals("HloWrd", bits.getBits("Hello World"));
		Assert.assertEquals("w", bits.getBits("w"));
	}
	
	
	
}
