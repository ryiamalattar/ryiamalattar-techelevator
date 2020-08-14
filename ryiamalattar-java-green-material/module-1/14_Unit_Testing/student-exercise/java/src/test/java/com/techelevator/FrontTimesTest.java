package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class FrontTimesTest {

	private FrontTimes times;
	
	@Before
	public void setUp() {
		times = new FrontTimes();
	}
	
	@Test
	public void frontTimesTestNull() {
		Assert.assertEquals("", times.generateString(null, 4));
		Assert.assertEquals("", times.generateString("", 3));
	}
	
	@Test
	public void frontTimes3OrBelow() {
		Assert.assertEquals("aaaaaa", times.generateString("a", 6));
		Assert.assertEquals("VCDVCDVCD", times.generateString("VCD", 3));
	}
	
	@Test
	public void frontTimesMoreThan3() {
		Assert.assertEquals("RyiRyi", times.generateString("Ryiam", 2));
		Assert.assertEquals("EleEleEle", times.generateString("Elevator", 3));
	}
}
