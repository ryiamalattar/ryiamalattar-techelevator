package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Lucky13Test {

	private Lucky13 lucky;
		
	@Before
	public void setUp() {
		lucky = new Lucky13();
	}
	
	@Test
	public void lucky13TestMethod() {
		Assert.assertEquals(true, lucky.getLucky(new int[] {4,8,15}));
		Assert.assertEquals(true, lucky.getLucky(new int[] {11,0}));
		Assert.assertEquals(true, lucky.getLucky(new int[2]));
	}
	
	@Test
	public void lucky13TestMethodfail() {
		
        Assert.assertEquals(false, lucky.getLucky(new int[] {1,55,3,33}));
        Assert.assertEquals(false, lucky.getLucky(new int[] {1,8}));
	}
		
		


}
