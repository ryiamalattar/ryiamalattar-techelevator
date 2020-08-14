package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class SameFirstLastTest {

private SameFirstLast same;
	
	@Before
	public void setUp() {
		same = new SameFirstLast();
	}
	
	@Test
	public void sameCheckNull() {
		Assert.assertEquals(false, same.isItTheSame(new int[0]));
	}
	
	@Test
	public void sameCheckTrue() {
		Assert.assertEquals(true, same.isItTheSame(new int[] {3,4,5,3,4,3}));
		Assert.assertEquals(true, same.isItTheSame(new int[] {4}));
	}
	
	@Test
	public void sameCheckFalse() {
		Assert.assertEquals(false, same.isItTheSame(new int[] {3,4,5,3,4}));
		Assert.assertEquals(false, same.isItTheSame(new int[] {4,2}));
	}
	
}
