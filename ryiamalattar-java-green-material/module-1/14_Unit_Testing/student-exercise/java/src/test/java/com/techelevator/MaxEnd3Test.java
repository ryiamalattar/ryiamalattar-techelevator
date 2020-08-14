package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

  public class MaxEnd3Test {

   private MaxEnd3 max;
	
	@Before
	public void setUp() {
		max = new MaxEnd3();
	}
	
	@Test
	public void maxEndTest() {
		Assert.assertArrayEquals(new int [] {7,7,7}, max.makeArray(new int [] {2,4,7}));
		Assert.assertArrayEquals(new int [] {9,9,9}, max.makeArray(new int [] {6,9,9}));
		Assert.assertArrayEquals(new int [] {0,0,0}, max.makeArray(new int [] {-2,-1,0}));
	}
	

	
}
