package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class Less20Test {

	private Less20 less20;
	
	@Before
	public void setUp() {
		less20 = new Less20();
	}
	
	@Test
	public void oneLessThan20Test() {
		Assert.assertEquals(true, less20.isLessThanMultipleOf20(79));
		Assert.assertEquals(true, less20.isLessThanMultipleOf20(59));
	}
	
	@Test
	public void twoLessThan20Test() {
		Assert.assertEquals(true, less20.isLessThanMultipleOf20(98));
		Assert.assertEquals(true, less20.isLessThanMultipleOf20(118));
	}
	
	@Test
	public void notLessThan20Test() {
		Assert.assertEquals(false, less20.isLessThanMultipleOf20(55));
		Assert.assertEquals(false, less20.isLessThanMultipleOf20(120));
	}
	
}
