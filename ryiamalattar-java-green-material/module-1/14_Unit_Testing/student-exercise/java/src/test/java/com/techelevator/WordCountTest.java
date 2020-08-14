package com.techelevator;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class WordCountTest {

	private WordCount times;
	
	@Before
	public void setUp() {
		times = new WordCount();
	}
	
	@Test
	public void wordCountTestA() {
		String[] myArray = new String[] {"a","b","a","c"};
		Integer myOb = new Integer(2);
		Assert.assertEquals(myOb, times.getCount(myArray).get("a"));
	}
	
	
}
